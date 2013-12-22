package net.mlcastle.remote;

import com.google.common.collect.ImmutableList;
import net.mlcastle.remote.IrCode.Timing;

public class TvBGoneCodes {
    private TvBGoneCodes() { throw new UnsupportedOperationException(); }
    public static final ImmutableList<IrCode> naCodes;
    public static final ImmutableList<IrCode> euCodes;

    static {
        ImmutableList.Builder<IrCode> builder = ImmutableList.builder();

        final Timing[] code_na000Times = {
                new Timing((short)58, (short)60),
                new Timing((short)58, (short)2687),
                new Timing((short)118, (short)60),
                new Timing((short)237, (short)60),
                new Timing((short)238, (short)60)
        };
        builder.add(new IrCode("na000",
                38462, // carrier frequency
                code_na000Times,
                new byte[] {3, 2, 0, 2, 0, 2, 0, 0, 2, 0, 0, 0, 1, 4, 2, 0, 2, 0, 2, 0, 0, 2, 0, 0, 0}
        ));

        final Timing[] code_na001Times = {
                new Timing((short)50, (short)100),
                new Timing((short)50, (short)200),
                new Timing((short)50, (short)800),
                new Timing((short)400, (short)400)
        };
        builder.add(new IrCode("na001",
                57143, // carrier frequency
                code_na001Times,
                new byte[] {3, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 2, 3, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1}
        ));

        final Timing[] code_na002Times = {
                new Timing((short)42, (short)46),
                new Timing((short)42, (short)133),
                new Timing((short)42, (short)7519),
                new Timing((short)347, (short)176),
                new Timing((short)347, (short)177)
        };
        builder.add(new IrCode("na002",
                37037, // carrier frequency
                code_na002Times,
                new byte[] {3, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 1, 2, 4, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 1}
        ));

        final Timing[] code_na003Times = {
                new Timing((short)26, (short)185),
                new Timing((short)27, (short)80),
                new Timing((short)27, (short)185),
                new Timing((short)27, (short)4549)
        };
        builder.add(new IrCode("na003",
                38610, // carrier frequency
                code_na003Times,
                new byte[] {0, 1, 1, 1, 1, 1, 2, 2, 1, 2, 1, 1, 1, 2, 1, 3, 2, 1, 1, 1, 1, 2, 1, 1, 2, 1, 2, 2, 2, 1, 2, 3, 2, 1, 1, 1, 1, 1, 2, 2, 1, 2, 1, 1, 1, 2, 1, 3, 2, 1, 1, 1, 1, 2, 1, 1, 2, 1, 2, 2, 2, 1, 2}
        ));

        final Timing[] code_na004Times = {
                new Timing((short)55, (short)57),
                new Timing((short)55, (short)170),
                new Timing((short)55, (short)3949),
                new Timing((short)55, (short)9623),
                new Timing((short)898, (short)453),
                new Timing((short)900, (short)226)
        };
        builder.add(new IrCode("na004",
                38610, // carrier frequency
                code_na004Times,
                new byte[] {4, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1, 2, 5, 3, 5}
        ));

        final Timing[] code_na005Times = {
                new Timing((short)88, (short)90),
                new Timing((short)88, (short)91),
                new Timing((short)88, (short)181),
                new Timing((short)88, (short)8976),
                new Timing((short)177, (short)91)
        };
        builder.add(new IrCode("na005",
                35714, // carrier frequency
                code_na005Times,
                new byte[] {0, 4, 1, 1, 1, 1, 1, 1, 2, 1, 4, 3, 1, 4, 1, 1, 1, 1, 1, 1, 2, 1, 4}
        ));

        final Timing[] code_na006Times = {
                new Timing((short)50, (short)62),
                new Timing((short)50, (short)172),
                new Timing((short)50, (short)4541),
                new Timing((short)448, (short)466),
                new Timing((short)450, (short)465)
        };
        builder.add(new IrCode("na006",
                38462, // carrier frequency
                code_na006Times,
                new byte[] {3, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 2, 4, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1}
        ));

        final Timing[] code_na007Times = {
                new Timing((short)49, (short)49),
                new Timing((short)49, (short)50),
                new Timing((short)49, (short)410),
                new Timing((short)49, (short)510),
                new Timing((short)49, (short)12107)
        };
        builder.add(new IrCode("na007",
                39216, // carrier frequency
                code_na007Times,
                new byte[] {0, 2, 3, 1, 2, 1, 2, 3, 1, 2, 3, 1, 2, 3, 3, 1, 4, 1, 2, 3, 1, 2, 1, 2, 3, 1, 2, 3, 1, 2, 3, 3, 1}
        ));

        final Timing[] code_na008Times = {
                new Timing((short)56, (short)58),
                new Timing((short)56, (short)170),
                new Timing((short)56, (short)4011),
                new Timing((short)898, (short)450),
                new Timing((short)900, (short)449)
        };
        builder.add(new IrCode("na008",
                38462, // carrier frequency
                code_na008Times,
                new byte[] {3, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 2, 4, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1}
        ));

        final Timing[] code_na009Times = {
                new Timing((short)53, (short)56),
                new Timing((short)53, (short)171),
                new Timing((short)53, (short)3950),
                new Timing((short)53, (short)9599),
                new Timing((short)898, (short)451),
                new Timing((short)900, (short)226)
        };
        builder.add(new IrCode("na009",
                38462, // carrier frequency
                code_na009Times,
                new byte[] {4, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 2, 5, 3, 5}
        ));

        final Timing[] code_na010Times = {
                new Timing((short)51, (short)55),
                new Timing((short)51, (short)158),
                new Timing((short)51, (short)2286),
                new Timing((short)841, (short)419)
        };
        builder.add(new IrCode("na010",
                38462, // carrier frequency
                code_na010Times,
                new byte[] {3, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0}
        ));

        final Timing[] code_na011Times = {
                new Timing((short)55, (short)55),
                new Timing((short)55, (short)172),
                new Timing((short)55, (short)4039),
                new Timing((short)55, (short)9348),
                new Timing((short)884, (short)442),
                new Timing((short)885, (short)225)
        };
        builder.add(new IrCode("na011",
                38462, // carrier frequency
                code_na011Times,
                new byte[] {4, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 2, 5, 3, 5}
        ));

        final Timing[] code_na012Times = {
                new Timing((short)81, (short)87),
                new Timing((short)81, (short)254),
                new Timing((short)81, (short)3280),
                new Timing((short)331, (short)336),
                new Timing((short)331, (short)337)
        };
        builder.add(new IrCode("na012",
                38462, // carrier frequency
                code_na012Times,
                new byte[] {3, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 1, 1, 2, 4, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 1, 1}
        ));

        final Timing[] code_na013Times = {
                new Timing((short)53, (short)55),
                new Timing((short)53, (short)167),
                new Timing((short)53, (short)2304),
                new Timing((short)53, (short)9369),
                new Timing((short)893, (short)448),
                new Timing((short)895, (short)447)
        };
        builder.add(new IrCode("na013",
                38462, // carrier frequency
                code_na013Times,
                new byte[] {4, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1, 2, 5, 3, 5}
        ));

        builder.add(new IrCode("na014",
                38462, // carrier frequency
                code_na004Times,
                new byte[] {4, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 5, 3, 5}
        ));

        builder.add(new IrCode("na015",
                38462, // carrier frequency
                code_na004Times,
                new byte[] {4, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 5, 3, 5}
        ));

        final Timing[] code_na016Times = {
                new Timing((short)28, (short)90),
                new Timing((short)28, (short)211),
                new Timing((short)28, (short)2507)
        };
        builder.add(new IrCode("na016",
                34483, // carrier frequency
                code_na016Times,
                new byte[] {1, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 2, 1, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0}
        ));

        final Timing[] code_na017Times = {
                new Timing((short)56, (short)57),
                new Timing((short)56, (short)175),
                new Timing((short)56, (short)4150),
                new Timing((short)56, (short)9499),
                new Timing((short)898, (short)227),
                new Timing((short)898, (short)449)
        };
        builder.add(new IrCode("na017",
                40000, // carrier frequency
                code_na017Times,
                new byte[] {5, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1, 2, 4, 3, 4}
        ));

        final Timing[] code_na018Times = {
                new Timing((short)51, (short)55),
                new Timing((short)51, (short)161),
                new Timing((short)51, (short)2566),
                new Timing((short)849, (short)429),
                new Timing((short)849, (short)430)
        };
        builder.add(new IrCode("na018",
                38462, // carrier frequency
                code_na018Times,
                new byte[] {3, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 2, 4, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 2, 4, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 2, 4, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1}
        ));

        final Timing[] code_na019Times = {
                new Timing((short)40, (short)42),
                new Timing((short)40, (short)124),
                new Timing((short)40, (short)4601),
                new Timing((short)325, (short)163),
                new Timing((short)326, (short)163)
        };
        builder.add(new IrCode("na019",
                38462, // carrier frequency
                code_na019Times,
                new byte[] {3, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 2, 4, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0}
        ));

        final Timing[] code_na020Times = {
                new Timing((short)60, (short)55),
                new Timing((short)60, (short)163),
                new Timing((short)60, (short)4099),
                new Timing((short)60, (short)9698),
                new Timing((short)898, (short)461),
                new Timing((short)900, (short)230)
        };
        builder.add(new IrCode("na020",
                38462, // carrier frequency
                code_na020Times,
                new byte[] {4, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 2, 5, 3, 5}
        ));

        final Timing[] code_na021Times = {
                new Timing((short)48, (short)52),
                new Timing((short)48, (short)160),
                new Timing((short)48, (short)400),
                new Timing((short)48, (short)2335),
                new Timing((short)799, (short)400)
        };
        builder.add(new IrCode("na021",
                38462, // carrier frequency
                code_na021Times,
                new byte[] {4, 0, 0, 1, 0, 1, 0, 0, 0, 2, 1, 0, 1, 0, 1, 0, 0, 0, 3, 4, 0, 0, 1, 0, 1, 0, 0, 0, 2, 1, 0, 1, 0, 1, 0, 0, 0}
        ));

        final Timing[] code_na022Times = {
                new Timing((short)53, (short)60),
                new Timing((short)53, (short)175),
                new Timing((short)53, (short)4463),
                new Timing((short)53, (short)9453),
                new Timing((short)892, (short)450),
                new Timing((short)895, (short)225)
        };
        builder.add(new IrCode("na022",
                38462, // carrier frequency
                code_na022Times,
                new byte[] {4, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 2, 5, 3, 5}
        ));

        final Timing[] code_na023Times = {
                new Timing((short)48, (short)52),
                new Timing((short)48, (short)409),
                new Timing((short)48, (short)504),
                new Timing((short)48, (short)10461)
        };
        builder.add(new IrCode("na023",
                40000, // carrier frequency
                code_na023Times,
                new byte[] {2, 2, 0, 1, 0, 1, 2, 0, 1, 2, 0, 1, 2, 2, 0, 1, 0, 1, 2, 0, 1, 3, 2, 2, 0, 1, 0, 1, 2, 0, 1, 2, 0, 1, 2, 2, 0, 1, 0, 1, 2, 0, 1}
        ));

        final Timing[] code_na024Times = {
                new Timing((short)58, (short)60),
                new Timing((short)58, (short)2569),
                new Timing((short)118, (short)60),
                new Timing((short)237, (short)60),
                new Timing((short)238, (short)60)
        };
        builder.add(new IrCode("na024",
                38462, // carrier frequency
                code_na024Times,
                new byte[] {3, 2, 2, 2, 2, 0, 2, 0, 2, 0, 0, 0, 1, 4, 2, 2, 2, 2, 0, 2, 0, 2, 0, 0, 0}
        ));

        final Timing[] code_na025Times = {
                new Timing((short)84, (short)90),
                new Timing((short)84, (short)264),
                new Timing((short)84, (short)3470),
                new Timing((short)346, (short)350),
                new Timing((short)347, (short)350)
        };
        builder.add(new IrCode("na025",
                38462, // carrier frequency
                code_na025Times,
                new byte[] {3, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 4, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1}
        ));

        final Timing[] code_na026Times = {
                new Timing((short)49, (short)49),
                new Timing((short)49, (short)50),
                new Timing((short)49, (short)410),
                new Timing((short)49, (short)510),
                new Timing((short)49, (short)12582)
        };
        builder.add(new IrCode("na026",
                39216, // carrier frequency
                code_na026Times,
                new byte[] {0, 2, 3, 1, 2, 1, 2, 3, 3, 1, 2, 3, 1, 2, 3, 1, 4, 1, 2, 3, 1, 2, 1, 2, 3, 3, 1, 2, 3, 1, 2, 3, 1}
        ));

        builder.add(new IrCode("na027",
                57143, // carrier frequency
                code_na001Times,
                new byte[] {3, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 2, 3, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1}
        ));

        final Timing[] code_na028Times = {
                new Timing((short)118, (short)121),
                new Timing((short)118, (short)271),
                new Timing((short)118, (short)4750),
                new Timing((short)258, (short)271)
        };
        builder.add(new IrCode("na028",
                38610, // carrier frequency
                code_na028Times,
                new byte[] {3, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1, 2, 3, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1}
        ));

        final Timing[] code_na029Times = {
                new Timing((short)88, (short)90),
                new Timing((short)88, (short)91),
                new Timing((short)88, (short)181),
                new Timing((short)177, (short)91),
                new Timing((short)177, (short)8976)
        };
        builder.add(new IrCode("na029",
                35842, // carrier frequency
                code_na029Times,
                new byte[] {0, 3, 1, 1, 1, 1, 2, 3, 2, 1, 4, 1, 3, 1, 1, 1, 1, 2, 3, 2, 1}
        ));

        builder.add(new IrCode("na030",
                38462, // carrier frequency
                code_na009Times,
                new byte[] {4, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 5, 3, 5}
        ));

        final Timing[] code_na031Times = {
                new Timing((short)88, (short)89),
                new Timing((short)88, (short)90),
                new Timing((short)88, (short)179),
                new Timing((short)88, (short)8977),
                new Timing((short)177, (short)90)
        };
        builder.add(new IrCode("na031",
                35842, // carrier frequency
                code_na031Times,
                new byte[] {0, 1, 4, 1, 1, 1, 1, 1, 2, 1, 4, 3, 1, 1, 4, 1, 1, 1, 1, 1, 2, 1, 4}
        ));

        builder.add(new IrCode("na032",
                38462, // carrier frequency
                code_na009Times,
                new byte[] {4, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 2, 5, 3, 5}
        ));

        final Timing[] code_na033Times = {
                new Timing((short)40, (short)43),
                new Timing((short)40, (short)122),
                new Timing((short)40, (short)5297),
                new Timing((short)334, (short)156),
                new Timing((short)336, (short)155)
        };
        builder.add(new IrCode("na033",
                38462, // carrier frequency
                code_na033Times,
                new byte[] {3, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 2, 4, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0}
        ));

        builder.add(new IrCode("na034",
                38462, // carrier frequency
                code_na004Times,
                new byte[] {4, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 2, 5, 3, 5}
        ));

        final Timing[] code_na035Times = {
                new Timing((short)96, (short)93),
                new Timing((short)97, (short)93),
                new Timing((short)97, (short)287),
                new Timing((short)97, (short)3431)
        };
        builder.add(new IrCode("na035",
                41667, // carrier frequency
                code_na035Times,
                new byte[] {0, 1, 1, 2, 1, 2, 1, 2, 1, 1, 3, 1, 1, 1, 2, 1, 2, 1, 2, 1, 1}
        ));

        final Timing[] code_na036Times = {
                new Timing((short)82, (short)581),
                new Timing((short)84, (short)250),
                new Timing((short)84, (short)580)
        };
        builder.add(new IrCode("na036",
                37037, // carrier frequency
                code_na036Times,
                new byte[] {0, 1, 1, 1, 2, 1, 2, 2, 2, 1}
        ));

        final Timing[] code_na037Times = {
                new Timing((short)39, (short)263),
                new Timing((short)164, (short)163),
                new Timing((short)514, (short)164)
        };
        builder.add(new IrCode("na037",
                41667, // carrier frequency
                code_na037Times,
                new byte[] {2, 0, 0, 0, 1, 0, 1, 1, 0, 0}
        ));

        builder.add(new IrCode("na038",
                40000, // carrier frequency
                code_na017Times,
                new byte[] {5, 1, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1, 2, 4, 3, 4}
        ));

        final Timing[] code_na039Times = {
                new Timing((short)113, (short)101),
                new Timing((short)688, (short)2707)
        };
        builder.add(new IrCode("na039",
                40000, // carrier frequency
                code_na039Times,
                new byte[] {0, 1, 0}
        ));

        final Timing[] code_na040Times = {
                new Timing((short)113, (short)101),
                new Timing((short)113, (short)201),
                new Timing((short)113, (short)2707)
        };
        builder.add(new IrCode("na040",
                40000, // carrier frequency
                code_na040Times,
                new byte[] {0, 0, 1, 2, 0, 0, 1}
        ));

        final Timing[] code_na041Times = {
                new Timing((short)58, (short)62),
                new Timing((short)58, (short)2746),
                new Timing((short)117, (short)62),
                new Timing((short)242, (short)62)
        };
        builder.add(new IrCode("na041",
                76923, // carrier frequency
                code_na041Times,
                new byte[] {3, 2, 0, 2, 0, 2, 0, 0, 2, 0, 0, 0, 1, 3, 2, 0, 2, 0, 2, 0, 0, 2, 0, 0, 0}
        ));

        final Timing[] code_na042Times = {
                new Timing((short)54, (short)65),
                new Timing((short)54, (short)170),
                new Timing((short)54, (short)4099),
                new Timing((short)54, (short)8668),
                new Timing((short)899, (short)226),
                new Timing((short)899, (short)421)
        };
        builder.add(new IrCode("na042",
                40000, // carrier frequency
                code_na042Times,
                new byte[] {5, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 2, 4, 3, 4}
        ));

        final Timing[] code_na043Times = {
                new Timing((short)43, (short)120),
                new Timing((short)43, (short)121),
                new Timing((short)43, (short)3491),
                new Timing((short)131, (short)45)
        };
        builder.add(new IrCode("na043",
                40000, // carrier frequency
                code_na043Times,
                new byte[] {0, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1}
        ));

        final Timing[] code_na044Times = {
                new Timing((short)51, (short)51),
                new Timing((short)51, (short)160),
                new Timing((short)51, (short)4096),
                new Timing((short)51, (short)9513),
                new Timing((short)431, (short)436),
                new Timing((short)883, (short)219)
        };
        builder.add(new IrCode("na044",
                40000, // carrier frequency
                code_na044Times,
                new byte[] {4, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 2, 5, 3, 5}
        ));

        final Timing[] code_na045Times = {
                new Timing((short)58, (short)53),
                new Timing((short)58, (short)167),
                new Timing((short)58, (short)4494),
                new Timing((short)58, (short)9679),
                new Timing((short)455, (short)449),
                new Timing((short)456, (short)449)
        };
        builder.add(new IrCode("na045",
                38462, // carrier frequency
                code_na045Times,
                new byte[] {4, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 5, 1, 3, 5, 1}
        ));

        final Timing[] code_na046Times = {
                new Timing((short)51, (short)277),
                new Timing((short)52, (short)53),
                new Timing((short)52, (short)105),
                new Timing((short)52, (short)277),
                new Timing((short)52, (short)2527),
                new Timing((short)52, (short)12809),
                new Timing((short)103, (short)54)
        };
        builder.add(new IrCode("na046",
                29412, // carrier frequency
                code_na046Times,
                new byte[] {0, 2, 6, 1, 1, 1, 4, 3, 2, 1, 1, 1, 1, 1, 5, 3, 2, 1, 1, 1, 1, 1}
        ));

        builder.add(new IrCode("na047",
                40000, // carrier frequency
                code_na017Times,
                new byte[] {5, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 2, 4, 3, 4}
        ));

        builder.add(new IrCode("na048",
                40000, // carrier frequency
                code_na044Times,
                new byte[] {4, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 5, 3, 5}
        ));

        final Timing[] code_na049Times = {
                new Timing((short)274, (short)854),
                new Timing((short)274, (short)1986)
        };
        builder.add(new IrCode("na049",
                45455, // carrier frequency
                code_na049Times,
                new byte[] {0, 1, 1, 0, 0, 1, 0, 1, 1, 0}
        ));

        final Timing[] code_na050Times = {
                new Timing((short)80, (short)88),
                new Timing((short)80, (short)254),
                new Timing((short)80, (short)3750),
                new Timing((short)359, (short)331)
        };
        builder.add(new IrCode("na050",
                55556, // carrier frequency
                code_na050Times,
                new byte[] {3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0}
        ));

        builder.add(new IrCode("na051",
                40000, // carrier frequency
                code_na017Times,
                new byte[] {5, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 2, 4, 3, 4}
        ));

        builder.add(new IrCode("na052",
                40000, // carrier frequency
                code_na017Times,
                new byte[] {5, 1, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1, 2, 4, 3, 4}
        ));

        final Timing[] code_na053Times = {
                new Timing((short)51, (short)232),
                new Timing((short)51, (short)512),
                new Timing((short)51, (short)792),
                new Timing((short)51, (short)2883)
        };
        builder.add(new IrCode("na053",
                55556, // carrier frequency
                code_na053Times,
                new byte[] {0, 2, 0, 2, 0, 2, 0, 1, 1, 0, 0, 0, 0, 1, 3, 0, 2, 0, 2, 0, 2, 0, 1, 1, 0, 0, 0, 0, 1}
        ));

        builder.add(new IrCode("na054",
                55556, // carrier frequency
                code_na053Times,
                new byte[] {0, 2, 0, 2, 0, 2, 0, 0, 0, 1, 1, 1, 1, 3, 0, 2, 0, 2, 0, 2, 0, 0, 0, 1, 1, 1, 1}
        ));

        final Timing[] code_na100Times = {
                new Timing((short)43, (short)171),
                new Timing((short)45, (short)60),
                new Timing((short)45, (short)170),
                new Timing((short)54, (short)2301)
        };
        builder.add(new IrCode("na100",
                35842, // carrier frequency
                code_na100Times,
                new byte[] {0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 1, 1, 1, 1, 1, 1, 3, 2, 2, 2, 1, 1, 1, 2, 1, 1, 2, 1, 1, 1, 1, 1, 1}
        ));

        builder.add(new IrCode("na101",
                38462, // carrier frequency
                code_na004Times,
                new byte[] {4, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 5, 3, 5}
        ));

        final Timing[] code_na102Times = {
                new Timing((short)86, (short)87),
                new Timing((short)86, (short)258),
                new Timing((short)86, (short)3338),
                new Timing((short)346, (short)348),
                new Timing((short)348, (short)347)
        };
        builder.add(new IrCode("na102",
                40000, // carrier frequency
                code_na102Times,
                new byte[] {3, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 2, 4, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0}
        ));

        builder.add(new IrCode("na103",
                38462, // carrier frequency
                code_na045Times,
                new byte[] {4, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 5, 1, 3, 5, 1}
        ));

        builder.add(new IrCode("na104",
                40000, // carrier frequency
                code_na017Times,
                new byte[] {5, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 2, 4, 3, 4}
        ));

        builder.add(new IrCode("na105",
                40000, // carrier frequency
                code_na017Times,
                new byte[] {5, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 2, 4, 3, 4}
        ));

        builder.add(new IrCode("na106",
                40000, // carrier frequency
                code_na044Times,
                new byte[] {4, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 5, 3, 5}
        ));

        builder.add(new IrCode("na107",
                38462, // carrier frequency
                code_na045Times,
                new byte[] {4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 5, 1, 3, 5, 1}
        ));

        builder.add(new IrCode("na108",
                38462, // carrier frequency
                code_na045Times,
                new byte[] {4, 0, 1, 1, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 5, 1, 3, 5, 1}
        ));

        final Timing[] code_na109Times = {
                new Timing((short)58, (short)61),
                new Timing((short)58, (short)211),
                new Timing((short)58, (short)9582),
                new Timing((short)73, (short)4164),
                new Timing((short)883, (short)211),
                new Timing((short)1050, (short)494)
        };
        builder.add(new IrCode("na109",
                40000, // carrier frequency
                code_na109Times,
                new byte[] {5, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 3, 4, 2, 4}
        ));

        builder.add(new IrCode("na110",
                40161, // carrier frequency
                code_na017Times,
                new byte[] {5, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 2, 4, 3, 4}
        ));

        final Timing[] code_na55Times = {
                new Timing((short)3, (short)10),
                new Timing((short)3, (short)20),
                new Timing((short)35, (short)10),
                new Timing((short)35, (short)12778)
        };
        builder.add(new IrCode("na55",
                3068, // carrier frequency
                code_na55Times,
                new byte[] {2, 0, 1, 1, 1, 0, 1, 0, 1, 1, 0, 3, 2, 0, 1, 1, 1, 0, 1, 0, 1, 1, 0}
        ));

        final Timing[] code_na56Times = {
                new Timing((short)55, (short)193),
                new Timing((short)57, (short)192),
                new Timing((short)57, (short)384)
        };
        builder.add(new IrCode("na56",
                37175, // carrier frequency
                code_na56Times,
                new byte[] {0, 2, 2, 2, 1, 1, 1}
        ));

        final Timing[] code_na57Times = {
                new Timing((short)45, (short)148),
                new Timing((short)46, (short)148),
                new Timing((short)46, (short)351),
                new Timing((short)46, (short)2781)
        };
        builder.add(new IrCode("na57",
                40000, // carrier frequency
                code_na57Times,
                new byte[] {0, 2, 2, 2, 1, 1, 3, 1, 2, 2, 2, 1, 1}
        ));

        final Timing[] code_na58Times = {
                new Timing((short)22, (short)101),
                new Timing((short)22, (short)219),
                new Timing((short)23, (short)101),
                new Timing((short)23, (short)219),
                new Timing((short)31, (short)218)
        };
        builder.add(new IrCode("na58",
                33333, // carrier frequency
                code_na58Times,
                new byte[] {4, 3, 3, 2, 2, 0, 1, 0, 0, 1, 0, 0, 2, 2, 2, 2, 2}
        ));

        builder.add(new IrCode("na59",
                40000, // carrier frequency
                code_na017Times,
                new byte[] {5, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 2, 4, 3, 4}
        ));

        builder.add(new IrCode("na60",
                40000, // carrier frequency
                code_na017Times,
                new byte[] {5, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 2, 4, 3, 4}
        ));

        builder.add(new IrCode("na61",
                40000, // carrier frequency
                code_na017Times,
                new byte[] {5, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 2, 4, 3, 4}
        ));

        builder.add(new IrCode("na62",
                40000, // carrier frequency
                code_na017Times,
                new byte[] {5, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 2, 4, 3, 4}
        ));

        builder.add(new IrCode("na63",
                40000, // carrier frequency
                code_na017Times,
                new byte[] {5, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 2, 4, 3, 4}
        ));

        builder.add(new IrCode("na64",
                57143, // carrier frequency
                code_na001Times,
                new byte[] {3, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 0, 2, 3, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 0}
        ));

        final Timing[] code_na65Times = {
                new Timing((short)48, (short)98),
                new Timing((short)48, (short)197),
                new Timing((short)98, (short)846),
                new Timing((short)395, (short)392),
                new Timing((short)1953, (short)392)
        };
        builder.add(new IrCode("na65",
                59172, // carrier frequency
                code_na65Times,
                new byte[] {4, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 2, 3, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 2, 3, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0}
        ));

        final Timing[] code_na66Times = {
                new Timing((short)38, (short)276),
                new Timing((short)165, (short)154),
                new Timing((short)415, (short)155),
                new Timing((short)742, (short)154)
        };
        builder.add(new IrCode("na66",
                38462, // carrier frequency
                code_na66Times,
                new byte[] {3, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 2, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 2, 0, 0, 0, 1, 0, 1, 1, 0, 0}
        ));

        builder.add(new IrCode("na67",
                40000, // carrier frequency
                code_na044Times,
                new byte[] {4, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 2, 5, 3, 5}
        ));

        final Timing[] code_na68Times = {
                new Timing((short)43, (short)121),
                new Timing((short)43, (short)9437),
                new Timing((short)130, (short)45),
                new Timing((short)131, (short)45)
        };
        builder.add(new IrCode("na68",
                40000, // carrier frequency
                code_na68Times,
                new byte[] {2, 0, 3, 0, 0, 3, 0, 0, 0, 0, 3, 1, 3, 0, 3, 0, 0, 3, 0, 0, 0, 0, 3}
        ));

        builder.add(new IrCode("na69",
                40000, // carrier frequency
                code_na017Times,
                new byte[] {5, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 2, 4, 3, 4}
        ));

        final Timing[] code_na70Times = {
                new Timing((short)27, (short)76),
                new Timing((short)27, (short)182),
                new Timing((short)27, (short)183),
                new Timing((short)27, (short)3199)
        };
        builder.add(new IrCode("na70",
                38462, // carrier frequency
                code_na70Times,
                new byte[] {1, 0, 0, 0, 0, 0, 0, 2, 0, 0, 2, 0, 2, 2, 0, 2, 3, 2, 0, 0, 0, 0, 0, 0, 2, 0, 0, 2, 0, 2, 2, 0}
        ));

        final Timing[] code_na71Times = {
                new Timing((short)37, (short)181),
                new Timing((short)37, (short)272)
        };
        builder.add(new IrCode("na71",
                55556, // carrier frequency
                code_na71Times,
                new byte[] {0, 1, 0, 1, 1, 0, 0}
        ));

        builder.add(new IrCode("na72",
                40000, // carrier frequency
                code_na042Times,
                new byte[] {5, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 2, 4, 3, 4}
        ));

        builder.add(new IrCode("na73",
                40000, // carrier frequency
                code_na017Times,
                new byte[] {5, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 2, 4, 3, 4}
        ));

        builder.add(new IrCode("na74",
                40000, // carrier frequency
                code_na017Times,
                new byte[] {5, 1, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 2, 4, 3, 4}
        ));

        final Timing[] code_na75Times = {
                new Timing((short)51, (short)98),
                new Timing((short)51, (short)194),
                new Timing((short)102, (short)931),
                new Timing((short)390, (short)390),
                new Timing((short)390, (short)391)
        };
        builder.add(new IrCode("na75",
                41667, // carrier frequency
                code_na75Times,
                new byte[] {3, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 2, 4, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1}
        ));

        builder.add(new IrCode("na76",
                40000, // carrier frequency
                code_na017Times,
                new byte[] {5, 0, 1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 2, 4, 3, 4}
        ));

        builder.add(new IrCode("na77",
                35714, // carrier frequency
                code_na031Times,
                new byte[] {0, 4, 1, 2, 1, 1, 4, 2, 1, 4, 3, 1, 4, 1, 2, 1, 1, 4, 2, 1, 4}
        ));

        final Timing[] code_na78Times = {
                new Timing((short)40, (short)275),
                new Timing((short)160, (short)154),
                new Timing((short)480, (short)155)
        };
        builder.add(new IrCode("na78",
                38462, // carrier frequency
                code_na78Times,
                new byte[] {2, 0, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 1}
        ));

        builder.add(new IrCode("na79",
                40000, // carrier frequency
                code_na017Times,
                new byte[] {5, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 1, 0, 2, 4, 3, 4}
        ));

        builder.add(new IrCode("na80",
                3068, // carrier frequency
                code_na55Times,
                new byte[] {2, 0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 3, 2, 0, 1, 1, 1, 0, 0, 1, 0, 0, 0}
        ));

        final Timing[] code_na81Times = {
                new Timing((short)48, (short)52),
                new Timing((short)48, (short)409),
                new Timing((short)48, (short)504),
                new Timing((short)48, (short)9978)
        };
        builder.add(new IrCode("na81",
                40000, // carrier frequency
                code_na81Times,
                new byte[] {0, 1, 2, 0, 1, 0, 1, 2, 0, 1, 2, 0, 1, 2, 2, 0, 1, 0, 1, 3, 0, 1, 2, 0, 1, 0, 1, 2, 0, 1, 2, 0, 1, 2, 2, 0, 1, 0, 1}
        ));

        final Timing[] code_na82Times = {
                new Timing((short)88, (short)89),
                new Timing((short)88, (short)90),
                new Timing((short)88, (short)179),
                new Timing((short)88, (short)8888),
                new Timing((short)177, (short)90),
                new Timing((short)177, (short)179)
        };
        builder.add(new IrCode("na82",
                35714, // carrier frequency
                code_na82Times,
                new byte[] {0, 2, 4, 1, 1, 1, 1, 1, 1, 2, 5, 3, 1, 2, 4, 1, 1, 1, 1, 1, 1, 2, 5}
        ));

        builder.add(new IrCode("na83",
                35714, // carrier frequency
                code_na031Times,
                new byte[] {0, 4, 1, 1, 1, 1, 1, 1, 2, 1, 4, 3, 1, 4, 1, 1, 1, 1, 1, 1, 2, 1, 4}
        ));

        final Timing[] code_na84Times = {
                new Timing((short)41, (short)43),
                new Timing((short)41, (short)128),
                new Timing((short)41, (short)7476),
                new Timing((short)336, (short)171),
                new Timing((short)338, (short)169)
        };
        builder.add(new IrCode("na84",
                37037, // carrier frequency
                code_na84Times,
                new byte[] {3, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 1, 2, 4, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 1}
        ));

        final Timing[] code_na85Times = {
                new Timing((short)55, (short)60),
                new Timing((short)55, (short)165),
                new Timing((short)55, (short)2284),
                new Timing((short)445, (short)437),
                new Timing((short)448, (short)436)
        };
        builder.add(new IrCode("na85",
                38462, // carrier frequency
                code_na85Times,
                new byte[] {3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 2, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0}
        ));

        final Timing[] code_na86Times = {
                new Timing((short)42, (short)46),
                new Timing((short)42, (short)126),
                new Timing((short)42, (short)6989),
                new Timing((short)347, (short)176),
                new Timing((short)347, (short)177)
        };
        builder.add(new IrCode("na86",
                37175, // carrier frequency
                code_na86Times,
                new byte[] {3, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 2, 4, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1}
        ));

        final Timing[] code_na87Times = {
                new Timing((short)56, (short)69),
                new Timing((short)56, (short)174),
                new Timing((short)56, (short)4165),
                new Timing((short)56, (short)9585),
                new Timing((short)880, (short)222),
                new Timing((short)880, (short)435)
        };
        builder.add(new IrCode("na87",
                38462, // carrier frequency
                code_na87Times,
                new byte[] {5, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 2, 4, 3, 4}
        ));

        builder.add(new IrCode("na88",
                38610, // carrier frequency
                code_na009Times,
                new byte[] {4, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 2, 5, 3, 5}
        ));

        builder.add(new IrCode("na89",
                38462, // carrier frequency
                code_na004Times,
                new byte[] {4, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1, 2, 5, 3, 5}
        ));

        final Timing[] code_na90Times = {
                new Timing((short)88, (short)90),
                new Timing((short)88, (short)91),
                new Timing((short)88, (short)181),
                new Timing((short)88, (short)8976),
                new Timing((short)177, (short)91),
                new Timing((short)177, (short)181)
        };
        builder.add(new IrCode("na90",
                35714, // carrier frequency
                code_na90Times,
                new byte[] {0, 4, 1, 2, 5, 4, 2, 1, 4, 3, 1, 4, 1, 2, 5, 4, 2, 1, 4}
        ));

        final Timing[] code_na91Times = {
                new Timing((short)48, (short)100),
                new Timing((short)48, (short)200),
                new Timing((short)48, (short)1050),
                new Timing((short)400, (short)400)
        };
        builder.add(new IrCode("na91",
                58824, // carrier frequency
                code_na91Times,
                new byte[] {3, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 2, 3, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0}
        ));

        final Timing[] code_na92Times = {
                new Timing((short)54, (short)56),
                new Timing((short)54, (short)170),
                new Timing((short)54, (short)4927),
                new Timing((short)451, (short)447)
        };
        builder.add(new IrCode("na92",
                38462, // carrier frequency
                code_na92Times,
                new byte[] {3, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 2, 3, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1}
        ));

        final Timing[] code_na93Times = {
                new Timing((short)55, (short)57),
                new Timing((short)55, (short)167),
                new Timing((short)55, (short)4400),
                new Timing((short)895, (short)448),
                new Timing((short)897, (short)447)
        };
        builder.add(new IrCode("na93",
                38462, // carrier frequency
                code_na93Times,
                new byte[] {3, 0, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 2, 4, 0, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1}
        ));

        builder.add(new IrCode("na94",
                35714, // carrier frequency
                code_na005Times,
                new byte[] {0, 4, 1, 1, 2, 1, 4, 2, 1, 4, 3, 1, 4, 1, 1, 2, 1, 4, 2, 1, 4}
        ));

        final Timing[] code_na95Times = {
                new Timing((short)56, (short)58),
                new Timing((short)56, (short)174),
                new Timing((short)56, (short)4549),
                new Timing((short)56, (short)9448),
                new Timing((short)440, (short)446)
        };
        builder.add(new IrCode("na95",
                38462, // carrier frequency
                code_na95Times,
                new byte[] {4, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 2, 4, 1, 3, 4, 1}
        ));

        builder.add(new IrCode("na96",
                38462, // carrier frequency
                code_na009Times,
                new byte[] {4, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 2, 5, 3, 5}
        ));

        builder.add(new IrCode("na97",
                38462, // carrier frequency
                code_na009Times,
                new byte[] {4, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 2, 5, 3, 5}
        ));

        builder.add(new IrCode("na98",
                38462, // carrier frequency
                code_na004Times,
                new byte[] {4, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 1, 2, 5, 3, 5}
        ));

        builder.add(new IrCode("na99",
                38462, // carrier frequency
                code_na009Times,
                new byte[] {4, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 5, 3, 5}
        ));

        builder.add(new IrCode("na111",
                40000, // carrier frequency
                code_na044Times,
                new byte[] {4, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 5, 3, 5}
        ));

        builder.add(new IrCode("na112",
                38462, // carrier frequency
                code_na004Times,
                new byte[] {4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 5, 3, 5}
        ));

        final Timing[] code_na113Times = {
                new Timing((short)56, (short)54),
                new Timing((short)56, (short)166),
                new Timing((short)56, (short)3945),
                new Timing((short)896, (short)442),
                new Timing((short)896, (short)443)
        };
        builder.add(new IrCode("na113",
                40000, // carrier frequency
                code_na113Times,
                new byte[] {3, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 2, 4, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1}
        ));

        final Timing[] code_na114Times = {
                new Timing((short)44, (short)50),
                new Timing((short)44, (short)147),
                new Timing((short)44, (short)447),
                new Timing((short)44, (short)2236),
                new Timing((short)791, (short)398),
                new Timing((short)793, (short)397)
        };
        builder.add(new IrCode("na114",
                40000, // carrier frequency
                code_na114Times,
                new byte[] {4, 1, 0, 1, 0, 1, 0, 0, 0, 2, 1, 0, 1, 0, 1, 0, 0, 0, 3, 5, 1, 0, 1, 0, 1, 0, 0, 0, 2, 1, 0, 1, 0, 1, 0, 0, 0}
        ));

        final Timing[] code_na115Times = {
                new Timing((short)81, (short)86),
                new Timing((short)81, (short)296),
                new Timing((short)81, (short)3349),
                new Timing((short)328, (short)331),
                new Timing((short)329, (short)331)
        };
        builder.add(new IrCode("na115",
                40000, // carrier frequency
                code_na115Times,
                new byte[] {3, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 2, 4, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1}
        ));

        builder.add(new IrCode("na116",
                40000, // carrier frequency
                code_na017Times,
                new byte[] {5, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 2, 4, 3, 4}
        ));

        final Timing[] code_na117Times = {
                new Timing((short)49, (short)54),
                new Timing((short)49, (short)158),
                new Timing((short)49, (short)420),
                new Timing((short)49, (short)2446),
                new Timing((short)819, (short)420),
                new Timing((short)821, (short)419)
        };
        builder.add(new IrCode("na117",
                41667, // carrier frequency
                code_na117Times,
                new byte[] {4, 1, 0, 0, 0, 0, 0, 0, 0, 2, 0, 1, 1, 1, 0, 0, 0, 0, 3, 5, 1, 0, 0, 0, 0, 0, 0, 0, 2, 0, 1, 1, 1, 0, 0, 0, 0}
        ));

        builder.add(new IrCode("na118",
                40000, // carrier frequency
                code_na044Times,
                new byte[] {4, 1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 5, 3, 5}
        ));

        final Timing[] code_na119Times = {
                new Timing((short)55, (short)63),
                new Timing((short)55, (short)171),
                new Timing((short)55, (short)4094),
                new Timing((short)55, (short)9508),
                new Timing((short)881, (short)219),
                new Timing((short)881, (short)438)
        };
        builder.add(new IrCode("na119",
                55556, // carrier frequency
                code_na119Times,
                new byte[] {5, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 2, 4, 3, 4}
        ));

        builder.add(new IrCode("na120",
                40000, // carrier frequency
                code_na017Times,
                new byte[] {5, 0, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 2, 4, 3, 4}
        ));

        builder.add(new IrCode("na121",
                40000, // carrier frequency
                code_na017Times,
                new byte[] {5, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 2, 4, 3, 4}
        ));

        final Timing[] code_na122Times = {
                new Timing((short)80, (short)95),
                new Timing((short)80, (short)249),
                new Timing((short)80, (short)3867),
                new Timing((short)329, (short)322)
        };
        builder.add(new IrCode("na122",
                52632, // carrier frequency
                code_na122Times,
                new byte[] {3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1}
        ));

        builder.add(new IrCode("na123",
                40000, // carrier frequency
                code_na017Times,
                new byte[] {5, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 2, 4, 3, 4}
        ));

        final Timing[] code_na124Times = {
                new Timing((short)54, (short)56),
                new Timing((short)54, (short)151),
                new Timing((short)54, (short)4092),
                new Timing((short)54, (short)8677),
                new Timing((short)900, (short)421),
                new Timing((short)901, (short)226)
        };
        builder.add(new IrCode("na124",
                40000, // carrier frequency
                code_na124Times,
                new byte[] {4, 0, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 5, 3, 5}
        ));

        builder.add(new IrCode("na125",
                55556, // carrier frequency
                code_na119Times,
                new byte[] {5, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1, 2, 4, 3, 4}
        ));

        builder.add(new IrCode("na126",
                40000, // carrier frequency
                code_na017Times,
                new byte[] {5, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 2, 4, 3, 4}
        ));

        final Timing[] code_na127Times = {
                new Timing((short)114, (short)100),
                new Timing((short)115, (short)100),
                new Timing((short)115, (short)200),
                new Timing((short)115, (short)2706)
        };
        builder.add(new IrCode("na127",
                25641, // carrier frequency
                code_na127Times,
                new byte[] {0, 1, 2, 3, 1, 1, 2}
        ));

        builder.add(new IrCode("na128",
                40000, // carrier frequency
                code_na102Times,
                new byte[] {3, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 2, 4, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0}
        ));

        builder.add(new IrCode("na129",
                40000, // carrier frequency
                code_na017Times,
                new byte[] {5, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 2, 4, 3, 4}
        ));

        final Timing[] code_na130Times = {
                new Timing((short)88, (short)90),
                new Timing((short)88, (short)258),
                new Timing((short)88, (short)2247),
                new Timing((short)358, (short)349),
                new Timing((short)358, (short)350)
        };
        builder.add(new IrCode("na130",
                37037, // carrier frequency
                code_na130Times,
                new byte[] {3, 1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0, 0, 0, 1, 0, 2, 4, 1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0, 0, 0, 1, 0}
        ));

        builder.add(new IrCode("na131",
                40000, // carrier frequency
                code_na042Times,
                new byte[] {5, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 2, 4, 3, 4}
        ));

        final Timing[] code_na132Times = {
                new Timing((short)28, (short)106),
                new Timing((short)28, (short)238),
                new Timing((short)28, (short)370),
                new Timing((short)28, (short)1173)
        };
        builder.add(new IrCode("na132",
                83333, // carrier frequency
                code_na132Times,
                new byte[] {0, 2, 0, 2, 0, 2, 0, 0, 0, 0, 0, 0, 0, 1, 1, 3, 0, 2, 0, 2, 0, 2, 0, 0, 0, 0, 0, 0, 0, 1, 1}
        ));

        final Timing[] code_na133Times = {
                new Timing((short)13, (short)741),
                new Timing((short)15, (short)489),
                new Timing((short)15, (short)740),
                new Timing((short)17, (short)4641)
        };
        builder.add(new IrCode("na133",
                41667, // carrier frequency
                code_na133Times,
                new byte[] {0, 2, 2, 2, 2, 1, 1, 1, 2, 2, 1, 3, 2, 2, 2, 2, 2, 1, 1, 1, 2, 2, 1}
        ));

        builder.add(new IrCode("na134",
                40000, // carrier frequency
                code_na113Times,
                new byte[] {3, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 4, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1}
        ));

        final Timing[] code_na135Times = {
                new Timing((short)53, (short)59),
                new Timing((short)53, (short)171),
                new Timing((short)53, (short)2301),
                new Timing((short)892, (short)450),
                new Timing((short)895, (short)448)
        };
        builder.add(new IrCode("na135",
                38462, // carrier frequency
                code_na135Times,
                new byte[] {3, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 4, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}
        ));

        builder.add(new IrCode("na136",
                38610, // carrier frequency
                code_na135Times,
                new byte[] {3, 1, 1, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 4, 1, 1, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}
        ));

        naCodes = builder.build();

        // EU codes start here
        builder = ImmutableList.builder();

        final Timing[] code_eu054Times = {
                new Timing((short)49, (short)53),
                new Timing((short)49, (short)104),
                new Timing((short)49, (short)262),
                new Timing((short)49, (short)264),
                new Timing((short)49, (short)8030),
                new Timing((short)100, (short)103)
        };
        builder.add(new IrCode("eu054",
                31250, // carrier frequency
                code_eu054Times,
                new byte[] {2, 0, 0, 1, 5, 0, 4, 3, 0, 0, 1, 5, 0}
        ));

        final Timing[] code_eu055Times = {
                new Timing((short)53, (short)56),
                new Timing((short)53, (short)171),
                new Timing((short)53, (short)3950),
                new Timing((short)53, (short)9599),
                new Timing((short)898, (short)451),
                new Timing((short)900, (short)226)
        };
        builder.add(new IrCode("eu055",
                38462, // carrier frequency
                code_eu055Times,
                new byte[] {4, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 2, 5, 3, 5}
        ));

        final Timing[] code_eu056Times = {
                new Timing((short)112, (short)107),
                new Timing((short)113, (short)107),
                new Timing((short)677, (short)2766)
        };
        builder.add(new IrCode("eu056",
                38462, // carrier frequency
                code_eu056Times,
                new byte[] {0, 2, 1}
        ));

        final Timing[] code_eu057Times = {
                new Timing((short)55, (short)57),
                new Timing((short)55, (short)170),
                new Timing((short)55, (short)3949),
                new Timing((short)55, (short)9623),
                new Timing((short)898, (short)453),
                new Timing((short)900, (short)226)
        };
        builder.add(new IrCode("eu057",
                38462, // carrier frequency
                code_eu057Times,
                new byte[] {4, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 2, 5, 3, 5}
        ));

        builder.add(new IrCode("eu058",
                38462, // carrier frequency
                code_eu055Times,
                new byte[] {4, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 2, 5, 3, 5}
        ));

        final Timing[] code_eu059Times = {
                new Timing((short)310, (short)613),
                new Timing((short)310, (short)614),
                new Timing((short)622, (short)8312)
        };
        builder.add(new IrCode("eu059",
                41667, // carrier frequency
                code_eu059Times,
                new byte[] {0, 2, 1}
        ));

        final Timing[] code_eu060Times = {
                new Timing((short)50, (short)158),
                new Timing((short)53, (short)51),
                new Timing((short)53, (short)156),
                new Timing((short)53, (short)2180)
        };
        builder.add(new IrCode("eu060",
                38462, // carrier frequency
                code_eu060Times,
                new byte[] {0, 2, 1, 1, 1, 1, 2, 1, 2, 1, 2, 2, 1, 1, 2, 2, 3, 2, 2, 1, 1, 1, 1, 2, 1, 2, 1, 2, 2, 1, 1, 2, 2}
        ));

        final Timing[] code_eu061Times = {
                new Timing((short)88, (short)90),
                new Timing((short)88, (short)91),
                new Timing((short)88, (short)181),
                new Timing((short)88, (short)8976),
                new Timing((short)177, (short)91)
        };
        builder.add(new IrCode("eu061",
                35714, // carrier frequency
                code_eu061Times,
                new byte[] {0, 4, 1, 1, 1, 1, 2, 4, 1, 1, 1, 3, 1, 4, 1, 1, 1, 1, 2, 4, 1, 1, 1}
        ));

        builder.add(new IrCode("eu062",
                38462, // carrier frequency
                code_eu060Times,
                new byte[] {0, 2, 1, 1, 2, 1, 2, 1, 2, 1, 2, 2, 1, 1, 2, 2, 3, 2, 2, 1, 1, 2, 1, 2, 1, 2, 1, 2, 2, 1, 1, 2, 2}
        ));

        builder.add(new IrCode("eu063",
                38462, // carrier frequency
                code_eu055Times,
                new byte[] {4, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 2, 5, 3, 5}
        ));

        final Timing[] code_eu064Times = {
                new Timing((short)47, (short)267),
                new Timing((short)50, (short)55),
                new Timing((short)50, (short)110),
                new Timing((short)50, (short)265),
                new Timing((short)50, (short)2055),
                new Timing((short)50, (short)12117),
                new Timing((short)100, (short)57),
                new Timing((short)100, (short)112)
        };
        builder.add(new IrCode("eu064",
                30395, // carrier frequency
                code_eu064Times,
                new byte[] {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 3, 1, 1, 2, 1, 6, 2, 7, 5, 3, 1, 1, 2, 1, 6, 2, 7}
        ));

        final Timing[] code_eu065Times = {
                new Timing((short)47, (short)267),
                new Timing((short)50, (short)55),
                new Timing((short)50, (short)110),
                new Timing((short)50, (short)265),
                new Timing((short)50, (short)2055),
                new Timing((short)50, (short)12117),
                new Timing((short)100, (short)112)
        };
        builder.add(new IrCode("eu065",
                30303, // carrier frequency
                code_eu065Times,
                new byte[] {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 3, 1, 1, 1, 2, 1, 6, 1, 1, 5, 3, 1, 1, 1, 2, 1, 6, 1, 1}
        ));

        final Timing[] code_eu066Times = {
                new Timing((short)55, (short)55),
                new Timing((short)55, (short)167),
                new Timing((short)55, (short)4577),
                new Timing((short)55, (short)9506),
                new Timing((short)448, (short)445),
                new Timing((short)450, (short)444)
        };
        builder.add(new IrCode("eu066",
                38462, // carrier frequency
                code_eu066Times,
                new byte[] {4, 1, 1, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 2, 5, 0, 3, 5, 0}
        ));

        final Timing[] code_eu067Times = {
                new Timing((short)94, (short)473),
                new Timing((short)94, (short)728),
                new Timing((short)102, (short)1637)
        };
        builder.add(new IrCode("eu067",
                38462, // carrier frequency
                code_eu067Times,
                new byte[] {1, 0, 0, 1, 0, 2, 1, 0, 0, 1, 0}
        ));

        final Timing[] code_eu068Times = {
                new Timing((short)49, (short)263),
                new Timing((short)50, (short)54),
                new Timing((short)50, (short)108),
                new Timing((short)50, (short)263),
                new Timing((short)50, (short)2029),
                new Timing((short)50, (short)10199),
                new Timing((short)100, (short)110)
        };
        builder.add(new IrCode("eu068",
                38610, // carrier frequency
                code_eu068Times,
                new byte[] {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 3, 2, 1, 1, 1, 1, 6, 1, 1, 5, 3, 2, 1, 1, 1, 1, 6, 1, 1}
        ));

        final Timing[] code_eu069Times = {
                new Timing((short)4, (short)750),
                new Timing((short)4, (short)4999),
                new Timing((short)1011, (short)750),
                new Timing((short)1514, (short)750)
        };
        builder.add(new IrCode("eu069",
                199, // carrier frequency
                code_eu069Times,
                new byte[] {2, 0, 0, 0, 0, 3, 1, 2, 0, 0, 0, 0, 3}
        ));

        final Timing[] code_eu070Times = {
                new Timing((short)4, (short)750),
                new Timing((short)4, (short)4999),
                new Timing((short)507, (short)750),
                new Timing((short)1514, (short)750)
        };
        builder.add(new IrCode("eu070",
                199, // carrier frequency
                code_eu070Times,
                new byte[] {2, 0, 2, 0, 0, 3, 1, 2, 0, 2, 0, 0, 3}
        ));

        final Timing[] code_eu071Times = {
                new Timing((short)14, (short)491),
                new Timing((short)14, (short)743),
                new Timing((short)14, (short)4422)
        };
        builder.add(new IrCode("eu071",
                38462, // carrier frequency
                code_eu071Times,
                new byte[] {1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 2, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1}
        ));

        final Timing[] code_eu072Times = {
                new Timing((short)863, (short)4999),
                new Timing((short)2581, (short)568),
                new Timing((short)4299, (short)568)
        };
        builder.add(new IrCode("eu072",
                116, // carrier frequency
                code_eu072Times,
                new byte[] {2, 1, 0, 2, 1}
        ));

        final Timing[] code_eu073Times = {
                new Timing((short)15, (short)493),
                new Timing((short)16, (short)493),
                new Timing((short)16, (short)698),
                new Timing((short)16, (short)1414)
        };
        builder.add(new IrCode("eu073",
                34483, // carrier frequency
                code_eu073Times,
                new byte[] {0, 1, 2, 1, 1, 1, 1, 3, 1, 1, 2, 1, 1, 1, 1}
        ));

        final Timing[] code_eu074Times = {
                new Timing((short)88, (short)89),
                new Timing((short)88, (short)90),
                new Timing((short)88, (short)179),
                new Timing((short)88, (short)8977),
                new Timing((short)177, (short)90)
        };
        builder.add(new IrCode("eu074",
                35714, // carrier frequency
                code_eu074Times,
                new byte[] {0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 4, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 4}
        ));

        final Timing[] code_eu075Times = {
                new Timing((short)6, (short)851),
                new Timing((short)6, (short)5474),
                new Timing((short)578, (short)851),
                new Timing((short)1151, (short)851)
        };
        builder.add(new IrCode("eu075",
                175, // carrier frequency
                code_eu075Times,
                new byte[] {3, 0, 0, 2, 0, 0, 2, 1, 3, 0, 0, 2, 0, 0, 2}
        ));

        final Timing[] code_eu076Times = {
                new Timing((short)14, (short)843),
                new Timing((short)16, (short)555),
                new Timing((short)16, (short)841),
                new Timing((short)16, (short)4911)
        };
        builder.add(new IrCode("eu076",
                38462, // carrier frequency
                code_eu076Times,
                new byte[] {0, 2, 2, 2, 2, 1, 2, 2, 2, 1, 2, 3, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 2}
        ));

        final Timing[] code_eu077Times = {
                new Timing((short)47, (short)267),
                new Timing((short)50, (short)55),
                new Timing((short)50, (short)110),
                new Timing((short)50, (short)265),
                new Timing((short)50, (short)2055),
                new Timing((short)50, (short)12117),
                new Timing((short)100, (short)57)
        };
        builder.add(new IrCode("eu077",
                30303, // carrier frequency
                code_eu077Times,
                new byte[] {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 3, 1, 1, 2, 1, 6, 2, 1, 1, 5, 3, 1, 1, 2, 1, 6, 2, 1, 1}
        ));

        final Timing[] code_eu078Times = {
                new Timing((short)6, (short)925),
                new Timing((short)6, (short)1339),
                new Timing((short)6, (short)2787),
                new Timing((short)2110, (short)1339)
        };
        builder.add(new IrCode("eu078",
                48, // carrier frequency
                code_eu078Times,
                new byte[] {3, 0, 0, 0, 0, 2, 1, 0, 0, 0, 0}
        ));

        final Timing[] code_eu079Times = {
                new Timing((short)53, (short)59),
                new Timing((short)53, (short)170),
                new Timing((short)53, (short)4359),
                new Timing((short)892, (short)448),
                new Timing((short)893, (short)448)
        };
        builder.add(new IrCode("eu079",
                38462, // carrier frequency
                code_eu079Times,
                new byte[] {3, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 4, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1}
        ));

        final Timing[] code_eu080Times = {
                new Timing((short)55, (short)57),
                new Timing((short)55, (short)167),
                new Timing((short)55, (short)4416),
                new Timing((short)895, (short)448),
                new Timing((short)897, (short)447)
        };
        builder.add(new IrCode("eu080",
                38462, // carrier frequency
                code_eu080Times,
                new byte[] {3, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 2, 4, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1}
        ));

        final Timing[] code_eu081Times = {
                new Timing((short)26, (short)185),
                new Timing((short)27, (short)80),
                new Timing((short)27, (short)185),
                new Timing((short)27, (short)4249)
        };
        builder.add(new IrCode("eu081",
                38462, // carrier frequency
                code_eu081Times,
                new byte[] {0, 1, 2, 2, 1, 1, 2, 2, 1, 2, 1, 1, 1, 2, 1, 3, 2, 1, 2, 2, 1, 2, 1, 1, 2, 1, 2, 2, 2, 1, 2, 3, 2, 1, 2, 2, 1, 1, 2, 2, 1, 2, 1, 1, 1, 2, 1, 3, 2, 1, 2, 2, 1, 2, 1, 1, 2, 1, 2, 2, 2, 1, 2, 3, 2, 1, 2, 2, 1, 1, 2, 2, 1, 2, 1, 1, 1, 2, 1}
        ));

        final Timing[] code_eu082Times = {
                new Timing((short)51, (short)56),
                new Timing((short)51, (short)162),
                new Timing((short)51, (short)2842),
                new Timing((short)848, (short)430),
                new Timing((short)850, (short)429)
        };
        builder.add(new IrCode("eu082",
                40000, // carrier frequency
                code_eu082Times,
                new byte[] {3, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 2, 4, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1}
        ));

        final Timing[] code_eu083Times = {
                new Timing((short)16, (short)559),
                new Timing((short)16, (short)847),
                new Timing((short)16, (short)5900),
                new Timing((short)17, (short)559),
                new Timing((short)17, (short)847)
        };
        builder.add(new IrCode("eu083",
                33333, // carrier frequency
                code_eu083Times,
                new byte[] {0, 3, 4, 3, 4, 0, 4, 1, 4, 0, 4, 2, 3, 0, 4, 0, 4, 0, 4, 4, 4, 0, 4}
        ));

        final Timing[] code_eu084Times = {
                new Timing((short)16, (short)484),
                new Timing((short)16, (short)738),
                new Timing((short)16, (short)739),
                new Timing((short)16, (short)4795)
        };
        builder.add(new IrCode("eu084",
                38462, // carrier frequency
                code_eu084Times,
                new byte[] {1, 2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 3, 2, 2, 2, 2, 2, 2, 0, 0, 0, 0, 0}
        ));

        final Timing[] code_eu085Times = {
                new Timing((short)48, (short)52),
                new Timing((short)48, (short)160),
                new Timing((short)48, (short)400),
                new Timing((short)48, (short)2120),
                new Timing((short)799, (short)400)
        };
        builder.add(new IrCode("eu085",
                38462, // carrier frequency
                code_eu085Times,
                new byte[] {4, 1, 1, 0, 1, 1, 0, 0, 0, 2, 1, 1, 1, 1, 1, 0, 0, 0, 3, 4, 1, 1, 0, 1, 1, 0, 0, 0, 2, 1, 1, 1, 1, 1, 0, 0, 0}
        ));

        final Timing[] code_eu086Times = {
                new Timing((short)16, (short)851),
                new Timing((short)17, (short)554),
                new Timing((short)17, (short)850),
                new Timing((short)17, (short)851),
                new Timing((short)17, (short)4847)
        };
        builder.add(new IrCode("eu086",
                33333, // carrier frequency
                code_eu086Times,
                new byte[] {2, 1, 3, 0, 3, 1, 3, 3, 0, 1, 3, 4, 3, 1, 3, 3, 0, 1, 3, 3, 0, 1, 0}
        ));

        final Timing[] code_eu087Times = {
                new Timing((short)14, (short)491),
                new Timing((short)14, (short)743),
                new Timing((short)14, (short)5126)
        };
        builder.add(new IrCode("eu087",
                38462, // carrier frequency
                code_eu087Times,
                new byte[] {1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 2, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0}
        ));

        final Timing[] code_eu088Times = {
                new Timing((short)14, (short)491),
                new Timing((short)14, (short)743),
                new Timing((short)14, (short)4874)
        };
        builder.add(new IrCode("eu088",
                38462, // carrier frequency
                code_eu088Times,
                new byte[] {1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 2, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0}
        ));

        final Timing[] code_eu089Times = {
                new Timing((short)48, (short)52),
                new Timing((short)48, (short)160),
                new Timing((short)48, (short)400),
                new Timing((short)48, (short)2335),
                new Timing((short)799, (short)400)
        };
        builder.add(new IrCode("eu089",
                38462, // carrier frequency
                code_eu089Times,
                new byte[] {4, 1, 0, 1, 0, 1, 0, 0, 0, 2, 1, 0, 1, 0, 1, 0, 0, 0, 3, 4, 1, 0, 1, 0, 1, 0, 0, 0, 2, 1, 0, 1, 0, 1, 0, 0, 0}
        ));

        final Timing[] code_eu090Times = {
                new Timing((short)3, (short)9),
                new Timing((short)3, (short)19),
                new Timing((short)3, (short)29),
                new Timing((short)44, (short)9),
                new Timing((short)44, (short)9968)
        };
        builder.add(new IrCode("eu090",
                2428, // carrier frequency
                code_eu090Times,
                new byte[] {3, 0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 1, 4, 3, 0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 1}
        ));

        final Timing[] code_eu091Times = {
                new Timing((short)15, (short)138),
                new Timing((short)15, (short)446),
                new Timing((short)15, (short)605),
                new Timing((short)15, (short)6565)
        };
        builder.add(new IrCode("eu091",
                38462, // carrier frequency
                code_eu091Times,
                new byte[] {2, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 2, 3, 2, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 2}
        ));

        final Timing[] code_eu092Times = {
                new Timing((short)48, (short)50),
                new Timing((short)48, (short)148),
                new Timing((short)48, (short)149),
                new Timing((short)48, (short)1424)
        };
        builder.add(new IrCode("eu092",
                40000, // carrier frequency
                code_eu092Times,
                new byte[] {1, 0, 2, 0, 2, 0, 0, 0, 0, 0, 3, 2, 0, 2, 0, 2, 0, 0, 0, 0, 0}
        ));

        final Timing[] code_eu093Times = {
                new Timing((short)87, (short)639),
                new Timing((short)88, (short)275),
                new Timing((short)88, (short)639)
        };
        builder.add(new IrCode("eu093",
                35714, // carrier frequency
                code_eu093Times,
                new byte[] {0, 1, 1, 1, 2, 1, 2, 2, 2, 1}
        ));

        final Timing[] code_eu094Times = {
                new Timing((short)3, (short)8),
                new Timing((short)3, (short)18),
                new Timing((short)3, (short)24),
                new Timing((short)43, (short)8),
                new Timing((short)43, (short)9969)
        };
        builder.add(new IrCode("eu094",
                2464, // carrier frequency
                code_eu094Times,
                new byte[] {3, 1, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 4, 3, 1, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0}
        ));

        builder.add(new IrCode("eu095",
                34483, // carrier frequency
                code_eu073Times,
                new byte[] {0, 2, 2, 2, 2, 2, 2, 3, 1, 2, 2, 2, 2, 2, 2}
        ));

        final Timing[] code_eu096Times = {
                new Timing((short)13, (short)608),
                new Timing((short)14, (short)141),
                new Timing((short)14, (short)296),
                new Timing((short)14, (short)451),
                new Timing((short)14, (short)606),
                new Timing((short)14, (short)608),
                new Timing((short)14, (short)6207)
        };
        builder.add(new IrCode("eu096",
                38462, // carrier frequency
                code_eu096Times,
                new byte[] {0, 1, 1, 1, 2, 1, 1, 3, 1, 1, 1, 1, 2, 4, 6, 5, 1, 1, 1, 2, 1, 1, 3, 1, 1, 1, 1, 2, 4}
        ));

        builder.add(new IrCode("eu097",
                34483, // carrier frequency
                code_eu073Times,
                new byte[] {0, 1, 2, 1, 2, 2, 2, 3, 1, 1, 2, 1, 2, 2, 2}
        ));

        final Timing[] code_eu098Times = {
                new Timing((short)3, (short)8),
                new Timing((short)3, (short)18),
                new Timing((short)34, (short)8),
                new Timing((short)34, (short)12731)
        };
        builder.add(new IrCode("eu098",
                3227, // carrier frequency
                code_eu098Times,
                new byte[] {2, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 3, 2, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0}
        ));

        final Timing[] code_eu099Times = {
                new Timing((short)46, (short)53),
                new Timing((short)46, (short)106),
                new Timing((short)46, (short)260),
                new Timing((short)46, (short)1502),
                new Timing((short)46, (short)10962),
                new Timing((short)93, (short)53),
                new Timing((short)93, (short)106)
        };
        builder.add(new IrCode("eu099",
                35714, // carrier frequency
                code_eu099Times,
                new byte[] {2, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 2, 1, 0, 5, 1, 0, 0, 0, 0, 0, 0, 0, 6, 0, 4, 2, 1, 0, 5, 1, 0, 0, 0, 0, 0, 0, 0, 6, 0}
        ));

        builder.add(new IrCode("eu100",
                3226, // carrier frequency
                code_eu098Times,
                new byte[] {2, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 3, 2, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0}
        ));

        final Timing[] code_eu101Times = {
                new Timing((short)14, (short)491),
                new Timing((short)14, (short)743),
                new Timing((short)14, (short)4674)
        };
        builder.add(new IrCode("eu101",
                38462, // carrier frequency
                code_eu101Times,
                new byte[] {1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 2, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1}
        ));

        builder.add(new IrCode("eu102",
                38462, // carrier frequency
                code_eu087Times,
                new byte[] {1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 2, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0}
        ));

        final Timing[] code_eu103Times = {
                new Timing((short)44, (short)815),
                new Timing((short)45, (short)528),
                new Timing((short)45, (short)815),
                new Timing((short)45, (short)5000)
        };
        builder.add(new IrCode("eu103",
                34483, // carrier frequency
                code_eu103Times,
                new byte[] {0, 2, 2, 1, 2, 1, 2, 2, 2, 1, 2, 3, 2, 2, 2, 1, 2, 1, 2, 2, 2, 1, 2}
        ));

        final Timing[] code_eu104Times = {
                new Timing((short)14, (short)491),
                new Timing((short)14, (short)743),
                new Timing((short)14, (short)5881)
        };
        builder.add(new IrCode("eu104",
                38462, // carrier frequency
                code_eu104Times,
                new byte[] {1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 2, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0}
        ));

        builder.add(new IrCode("eu105",
                38610, // carrier frequency
                code_eu055Times,
                new byte[] {4, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1, 2, 5, 3, 5}
        ));

        final Timing[] code_eu106Times = {
                new Timing((short)48, (short)246),
                new Timing((short)50, (short)47),
                new Timing((short)50, (short)94),
                new Timing((short)50, (short)245),
                new Timing((short)50, (short)1488),
                new Timing((short)50, (short)10970),
                new Timing((short)100, (short)47),
                new Timing((short)100, (short)94)
        };
        builder.add(new IrCode("eu106",
                38462, // carrier frequency
                code_eu106Times,
                new byte[] {0, 2, 6, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 3, 2, 1, 6, 2, 1, 1, 1, 1, 7, 7, 6, 2, 5, 3, 2, 1, 6, 2, 1, 1, 1, 1, 7, 7, 6, 2, 5, 3, 2, 1, 6, 2, 1, 1, 1, 1, 7, 7, 6, 2}
        ));

        final Timing[] code_eu107Times = {
                new Timing((short)16, (short)847),
                new Timing((short)16, (short)5900),
                new Timing((short)17, (short)559),
                new Timing((short)17, (short)846),
                new Timing((short)17, (short)847)
        };
        builder.add(new IrCode("eu107",
                33333, // carrier frequency
                code_eu107Times,
                new byte[] {3, 0, 4, 0, 4, 2, 4, 0, 4, 2, 4, 1, 4, 4, 0, 4, 0, 2, 0, 4, 0, 2, 0}
        ));

        final Timing[] code_eu108Times = {
                new Timing((short)14, (short)491),
                new Timing((short)14, (short)743),
                new Timing((short)14, (short)4622)
        };
        builder.add(new IrCode("eu108",
                38462, // carrier frequency
                code_eu108Times,
                new byte[] {1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 2, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1}
        ));

        final Timing[] code_eu109Times = {
                new Timing((short)24, (short)185),
                new Timing((short)27, (short)78),
                new Timing((short)27, (short)183),
                new Timing((short)27, (short)1542)
        };
        builder.add(new IrCode("eu109",
                38462, // carrier frequency
                code_eu109Times,
                new byte[] {0, 1, 2, 1, 2, 1, 1, 1, 1, 1, 3, 2, 1, 2, 1, 2, 1, 1, 1, 1, 1}
        ));

        final Timing[] code_eu110Times = {
                new Timing((short)56, (short)55),
                new Timing((short)56, (short)168),
                new Timing((short)56, (short)4850),
                new Timing((short)447, (short)453),
                new Timing((short)448, (short)453)
        };
        builder.add(new IrCode("eu110",
                38462, // carrier frequency
                code_eu110Times,
                new byte[] {3, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 2, 4, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1}
        ));

        final Timing[] code_eu111Times = {
                new Timing((short)49, (short)52),
                new Timing((short)49, (short)250),
                new Timing((short)49, (short)252),
                new Timing((short)49, (short)2377),
                new Timing((short)49, (short)12009),
                new Timing((short)100, (short)52),
                new Timing((short)100, (short)102)
        };
        builder.add(new IrCode("eu111",
                31250, // carrier frequency
                code_eu111Times,
                new byte[] {1, 0, 5, 0, 0, 0, 3, 2, 0, 6, 0, 0, 0, 4, 2, 0, 6, 0, 0, 0}
        ));

        final Timing[] code_eu112Times = {
                new Timing((short)55, (short)55),
                new Timing((short)55, (short)167),
                new Timing((short)55, (short)5023),
                new Timing((short)55, (short)9506),
                new Timing((short)448, (short)445),
                new Timing((short)450, (short)444)
        };
        builder.add(new IrCode("eu112",
                38462, // carrier frequency
                code_eu112Times,
                new byte[] {4, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 5, 1, 3, 5, 1}
        ));

        builder.add(new IrCode("eu113",
                31250, // carrier frequency
                code_eu054Times,
                new byte[] {2, 1, 5, 0, 0, 0, 4, 3, 1, 5, 0, 0, 0}
        ));

        builder.add(new IrCode("eu114",
                30303, // carrier frequency
                code_eu077Times,
                new byte[] {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 3, 2, 1, 6, 1, 2, 1, 1, 1, 5, 3, 2, 1, 6, 1, 2, 1, 1, 1}
        ));

        final Timing[] code_eu115Times = {
                new Timing((short)48, (short)98),
                new Timing((short)48, (short)196),
                new Timing((short)97, (short)836),
                new Timing((short)395, (short)388),
                new Timing((short)1931, (short)389)
        };
        builder.add(new IrCode("eu115",
                58824, // carrier frequency
                code_eu115Times,
                new byte[] {4, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 2, 3, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 2, 3, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0}
        ));

        final Timing[] code_eu116Times = {
                new Timing((short)3, (short)9),
                new Timing((short)3, (short)31),
                new Timing((short)47, (short)9),
                new Timing((short)47, (short)10957)
        };
        builder.add(new IrCode("eu116",
                2263, // carrier frequency
                code_eu116Times,
                new byte[] {2, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 3, 2, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0}
        ));

        final Timing[] code_eu117Times = {
                new Timing((short)49, (short)53),
                new Timing((short)49, (short)262),
                new Timing((short)49, (short)264),
                new Timing((short)49, (short)8030),
                new Timing((short)100, (short)103)
        };
        builder.add(new IrCode("eu117",
                31250, // carrier frequency
                code_eu117Times,
                new byte[] {1, 0, 4, 0, 0, 0, 3, 2, 0, 4, 0, 0, 0}
        ));

        final Timing[] code_eu118Times = {
                new Timing((short)44, (short)815),
                new Timing((short)45, (short)528),
                new Timing((short)45, (short)815),
                new Timing((short)45, (short)4713)
        };
        builder.add(new IrCode("eu118",
                34483, // carrier frequency
                code_eu118Times,
                new byte[] {0, 2, 2, 2, 2, 1, 2, 2, 2, 1, 2, 3, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 2}
        ));

        final Timing[] code_eu119Times = {
                new Timing((short)14, (short)491),
                new Timing((short)14, (short)743),
                new Timing((short)14, (short)5430)
        };
        builder.add(new IrCode("eu119",
                38462, // carrier frequency
                code_eu119Times,
                new byte[] {1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 2, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0}
        ));

        final Timing[] code_eu120Times = {
                new Timing((short)19, (short)78),
                new Timing((short)21, (short)27),
                new Timing((short)21, (short)77),
                new Timing((short)21, (short)3785)
        };
        builder.add(new IrCode("eu120",
                38462, // carrier frequency
                code_eu120Times,
                new byte[] {0, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 1, 1, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 1, 1}
        ));

        final Timing[] code_eu121Times = {
                new Timing((short)84, (short)88),
                new Timing((short)84, (short)261),
                new Timing((short)84, (short)3360),
                new Timing((short)347, (short)347),
                new Timing((short)347, (short)348)
        };
        builder.add(new IrCode("eu121",
                38462, // carrier frequency
                code_eu121Times,
                new byte[] {3, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 2, 4, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1}
        ));

        builder.add(new IrCode("eu122",
                38462, // carrier frequency
                code_eu120Times,
                new byte[] {0, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 1, 1, 3, 2, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 1, 1}
        ));

        final Timing[] code_eu123Times = {
                new Timing((short)13, (short)490),
                new Timing((short)13, (short)741),
                new Timing((short)13, (short)742),
                new Timing((short)13, (short)5443)
        };
        builder.add(new IrCode("eu123",
                40000, // carrier frequency
                code_eu123Times,
                new byte[] {1, 2, 2, 2, 2, 2, 0, 0, 0, 0, 2, 3, 2, 2, 2, 2, 2, 2, 0, 0, 0, 0, 2}
        ));

        final Timing[] code_eu124Times = {
                new Timing((short)50, (short)54),
                new Timing((short)50, (short)158),
                new Timing((short)50, (short)407),
                new Timing((short)50, (short)2153),
                new Timing((short)843, (short)407)
        };
        builder.add(new IrCode("eu124",
                38462, // carrier frequency
                code_eu124Times,
                new byte[] {4, 0, 0, 1, 0, 1, 0, 0, 0, 2, 1, 1, 1, 1, 1, 0, 0, 0, 3, 4, 0, 0, 1, 0, 1, 0, 0, 0, 2, 1, 1, 1, 1, 1, 0, 0, 0}
        ));

        final Timing[] code_eu125Times = {
                new Timing((short)55, (short)56),
                new Timing((short)55, (short)168),
                new Timing((short)55, (short)3929),
                new Timing((short)882, (short)454),
                new Timing((short)884, (short)452)
        };
        builder.add(new IrCode("eu125",
                38462, // carrier frequency
                code_eu125Times,
                new byte[] {3, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 2, 4, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}
        ));

        builder.add(new IrCode("eu126",
                38462, // carrier frequency
                code_eu057Times,
                new byte[] {4, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 5, 3, 5}
        ));

        builder.add(new IrCode("eu127",
                38462, // carrier frequency
                code_eu087Times,
                new byte[] {1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 2, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1}
        ));

        final Timing[] code_eu128Times = {
                new Timing((short)152, (short)471),
                new Timing((short)154, (short)156),
                new Timing((short)154, (short)469),
                new Timing((short)154, (short)782),
                new Timing((short)154, (short)2947)
        };
        builder.add(new IrCode("eu128",
                41667, // carrier frequency
                code_eu128Times,
                new byte[] {0, 1, 3, 4, 2, 1, 3}
        ));

        final Timing[] code_eu129Times = {
                new Timing((short)50, (short)50),
                new Timing((short)50, (short)99),
                new Timing((short)50, (short)251),
                new Timing((short)50, (short)252),
                new Timing((short)50, (short)1449),
                new Timing((short)50, (short)11014),
                new Timing((short)102, (short)49),
                new Timing((short)102, (short)98)
        };
        builder.add(new IrCode("eu129",
                38462, // carrier frequency
                code_eu129Times,
                new byte[] {2, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 3, 1, 0, 6, 1, 0, 0, 0, 0, 7, 7, 0, 7, 5, 3, 1, 0, 6, 1, 0, 0, 0, 0, 7, 7, 0, 7}
        ));

        builder.add(new IrCode("eu130",
                38462, // carrier frequency
                code_eu129Times,
                new byte[] {2, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 3, 1, 0, 6, 1, 0, 0, 0, 0, 7, 6, 1, 7, 5, 3, 1, 0, 6, 1, 0, 0, 0, 0, 7, 6, 1, 7}
        ));

        final Timing[] code_eu131Times = {
                new Timing((short)14, (short)491),
                new Timing((short)14, (short)743),
                new Timing((short)14, (short)4170)
        };
        builder.add(new IrCode("eu131",
                38462, // carrier frequency
                code_eu131Times,
                new byte[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0}
        ));

        final Timing[] code_eu132Times = {
                new Timing((short)4, (short)750),
                new Timing((short)4, (short)4999),
                new Timing((short)1011, (short)750),
                new Timing((short)2018, (short)750)
        };
        builder.add(new IrCode("eu132",
                199, // carrier frequency
                code_eu132Times,
                new byte[] {2, 0, 0, 0, 3, 1, 2, 0, 0, 0, 3}
        ));

        builder.add(new IrCode("eu133",
                38462, // carrier frequency
                code_eu071Times,
                new byte[] {1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 2, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0}
        ));

        final Timing[] code_eu134Times = {
                new Timing((short)13, (short)490),
                new Timing((short)13, (short)741),
                new Timing((short)13, (short)742),
                new Timing((short)13, (short)5939)
        };
        builder.add(new IrCode("eu134",
                40000, // carrier frequency
                code_eu134Times,
                new byte[] {1, 0, 0, 0, 0, 0, 2, 2, 2, 0, 0, 3, 2, 0, 0, 0, 0, 0, 2, 2, 2, 0, 0}
        ));

        final Timing[] code_eu135Times = {
                new Timing((short)864, (short)566),
                new Timing((short)864, (short)5188),
                new Timing((short)2580, (short)566)
        };
        builder.add(new IrCode("eu135",
                117, // carrier frequency
                code_eu135Times,
                new byte[] {2, 0, 2, 1, 2, 0, 2}
        ));

        builder.add(new IrCode("eu136",
                38462, // carrier frequency
                code_eu057Times,
                new byte[] {4, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 5, 3, 5}
        ));

        final Timing[] code_eu137Times = {
                new Timing((short)86, (short)91),
                new Timing((short)87, (short)90),
                new Timing((short)87, (short)180),
                new Timing((short)87, (short)8868),
                new Timing((short)174, (short)90)
        };
        builder.add(new IrCode("eu137",
                35714, // carrier frequency
                code_eu137Times,
                new byte[] {0, 4, 1, 1, 2, 4, 1, 2, 1, 4, 3, 1, 4, 1, 1, 2, 4, 1, 2, 1, 4}
        ));

        final Timing[] code_eu138Times = {
                new Timing((short)4, (short)1507),
                new Timing((short)4, (short)3005),
                new Timing((short)2083, (short)1507)
        };
        builder.add(new IrCode("eu138",
                96, // carrier frequency
                code_eu138Times,
                new byte[] {2, 0, 0, 1, 2, 0, 0}
        ));

        final Timing[] code_eu139Times = {
                new Timing((short)14, (short)141),
                new Timing((short)14, (short)452),
                new Timing((short)635, (short)141),
                new Timing((short)635, (short)6310)
        };
        builder.add(new IrCode("eu139",
                161, // carrier frequency
                code_eu139Times,
                new byte[] {2, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 3, 2, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0}
        ));
        euCodes = builder.build();
    }
}
