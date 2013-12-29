package net.mlcastle.remote;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Objects;

import java.util.Arrays;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

public final class IrCode implements Parcelable {
    public final String name;
    public final int frequency;
    public final Timing[] timings;
    public final byte[] timingIndexes;
    private transient int duration = 0;

    public IrCode(Parcel in) {
        name = in.readString();
        frequency = in.readInt();
        timings = in.createTypedArray(Timing.CREATOR);
        timingIndexes = in.createByteArray();
    }

    public IrCode(String name, int frequency, Timing[] timings, byte[] timingIndexes) {
        checkNotNull(name);
        checkArgument(frequency > 0);
        checkNotNull(timings);
        checkNotNull(timingIndexes);
        this.name = name;
        this.frequency = frequency;
        this.timings = timings;
        this.timingIndexes = timingIndexes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IrCode)) return false;

        IrCode that = (IrCode) o;

        return Objects.equal(this.name, that.name) &&
                this.frequency == that.frequency &&
                Arrays.equals(this.timings, that.timings) &&
                Arrays.equals(this.timingIndexes, that.timingIndexes);
    }

    @Override
    public int hashCode() {
        int hc = name.hashCode();
        hc = 31*hc + frequency;
        hc = 31*hc + Arrays.hashCode(timings);
        hc = 31*hc + Arrays.hashCode(timingIndexes);
        return hc;
    }

    public int[] toPattern() {
        int length = timingIndexes.length;
        int[] result = new int[length * 2];

        for (int i = 0; i < length; ++i) {
            int index = timingIndexes[i];
            result[i*2] = timings[index].on * 10;
            result[i*2+1] = timings[index].off * 10;
        }

        // is it really true that neither JDK nor guava has a sum function?
        int sum = 0;
        for (int p : result)
            sum += p;
        duration = sum;

        return result;
    }

    public int duration() {
        if (duration != 0)
            toPattern(); // for side effect

        return duration;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(frequency);
        dest.writeTypedArray(timings, flags);
        dest.writeByteArray(timingIndexes);
    }

    public static final class Timing implements Parcelable {
        public final short on, off;

        Timing(Parcel in) {
            this.on = (short)in.readInt();
            this.off = (short)in.readInt();
        }

        public Timing(short on, short off) {
            this.on = on;
            this.off = off;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Timing)) return false;

            Timing that = (Timing) o;

            return this.on == that.on &&
                    this.off == that.off;
        }

        @Override
        public int hashCode() {
            return 31 * on + off;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(on);
            dest.writeInt(off);
        }

        public static final Parcelable.Creator<Timing> CREATOR = new Creator<Timing>() {
            @Override
            public Timing createFromParcel(Parcel source) {
                return new Timing(source);
            }

            @Override
            public Timing[] newArray(int size) {
                return new Timing[size];
            }
        };
    }
}
