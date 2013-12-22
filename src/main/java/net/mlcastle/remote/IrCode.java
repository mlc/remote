package net.mlcastle.remote;

public class IrCode {
    public final String name;
    public final int frequency;
    public final Timing[] timings;
    public final byte[] timingIndexes;

    public IrCode(String name, int frequency, Timing[] timings, byte[] timingIndexes) {
        this.name = name;
        this.frequency = frequency;
        this.timings = timings;
        this.timingIndexes = timingIndexes;
    }

    public static class Timing {
        public final short on, off;

        public static Timing[] of(short... t) {
            if (t.length % 2 != 0)
                throw new IllegalArgumentException("must have an even number of timings");

            Timing[] result = new Timing[t.length / 2];
            for (int i = 0, len = result.length; i < len; ++i) {
                result[i] = new Timing(t[i*2], t[i*2+1]);
            }
            return result;
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
    }
}
