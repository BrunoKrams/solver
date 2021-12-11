package de.brunokrams.solver.pegsolitair;

public enum Triple {

    TRIPLE_0_1_2(0, 1, 2),
    TRIPLE_0_3_8(0, 3, 8),
    TRIPLE_1_4_9(1, 4, 9),
    TRIPLE_2_1_0(2, 1, 0),
    TRIPLE_2_5_10(2, 5, 10),
    TRIPLE_3_4_5(3, 4, 5),
    TRIPLE_3_8_15(3, 8, 15),
    TRIPLE_4_9_16(4, 9, 16),
    TRIPLE_5_4_3(5, 4, 3),
    TRIPLE_5_10_17(5, 10, 17),
    TRIPLE_6_7_8(6, 7, 8),
    TRIPLE_6_13_20(6, 13, 20),
    TRIPLE_7_8_9(7, 8, 9),
    TRIPLE_7_14_21(7, 14, 21),
    TRIPLE_8_3_0(8, 3, 0),
    TRIPLE_8_7_6(8, 7, 6),
    TRIPLE_8_9_10(8, 9, 10),
    TRIPLE_8_15_22(8, 15, 22),
    TRIPLE_9_4_1(9, 4, 1),
    TRIPLE_9_8_7(9, 8, 7),
    TRIPLE_9_10_11(9, 10, 11),
    TRIPLE_9_16_23(9, 16, 23),
    TRIPLE_10_5_2(10, 5, 2),
    TRIPLE_10_9_8(10, 9, 8),
    TRIPLE_10_11_12(10, 11, 12),
    TRIPLE_10_17_24(10, 17, 24),
    TRIPLE_11_10_9(11, 10, 9),
    TRIPLE_11_18_25(11, 18, 25),
    TRIPLE_12_11_10(12, 11, 10),
    TRIPLE_12_19_26(12, 19, 26),
    TRIPLE_13_14_15(13, 14, 15),
    TRIPLE_14_15_16(14, 15, 16),
    TRIPLE_15_8_3(15, 8, 3),
    TRIPLE_15_14_13(15, 14, 13),
    TRIPLE_15_16_17(15, 16, 17),
    TRIPLE_15_22_27(15, 22, 27),
    TRIPLE_16_9_4(16, 9, 4),
    TRIPLE_16_15_14(16, 15, 14),
    TRIPLE_16_17_18(16, 17, 18),
    TRIPLE_16_23_28(16, 23, 28),
    TRIPLE_17_10_5(17, 10, 5),
    TRIPLE_17_16_15(17, 16, 15),
    TRIPLE_17_18_19(17, 18, 19),
    TRIPLE_17_24_29(17, 24, 29),
    TRIPLE_18_17_16(18, 17, 16),
    TRIPLE_19_18_17(19, 18, 17),
    TRIPLE_20_13_6(20, 13, 6),
    TRIPLE_20_21_22(20, 21, 22),
    TRIPLE_21_14_7(21, 14, 7),
    TRIPLE_21_22_23(21, 22, 23),
    TRIPLE_22_15_8(22, 15, 8),
    TRIPLE_22_21_20(22, 21, 20),
    TRIPLE_22_23_24(22, 23, 24),
    TRIPLE_22_27_30(22, 27, 30),
    TRIPLE_23_16_9(23, 16, 9),
    TRIPLE_23_22_21(23, 22, 21),
    TRIPLE_23_24_25(23, 24, 25),
    TRIPLE_23_28_31(23, 28, 31),
    TRIPLE_24_17_10(24, 17, 10),
    TRIPLE_24_23_22(24, 23, 22),
    TRIPLE_24_25_26(24, 25, 26),
    TRIPLE_24_29_32(24, 29, 32),
    TRIPLE_25_18_11(25, 18, 11),
    TRIPLE_25_24_23(25, 24, 23),
    TRIPLE_26_19_12(26, 19, 12),
    TRIPLE_26_25_24(26, 25, 24),
    TRIPLE_27_22_15(27, 22, 15),
    TRIPLE_27_28_29(27, 28, 29),
    TRIPLE_28_23_16(28, 23, 16),
    TRIPLE_29_24_17(29, 24, 17),
    TRIPLE_29_28_27(29, 28, 27),
    TRIPLE_30_27_22(30, 27, 22),
    TRIPLE_30_31_32(30, 31, 32),
    TRIPLE_31_28_23(31, 28, 23),
    TRIPLE_32_29_24(32, 29, 24),
    TRIPLE_32_31_30(32, 31, 30);

    private int firstCell;
    private int middleCell;
    private int lastCell;

    Triple(int firstCell, int middleCell, int lastCell) {
        this.firstCell = firstCell;
        this.middleCell = middleCell;
        this.lastCell = lastCell;
    }


    public int getLastCell() {
        return lastCell;
    }

    public int getMiddleCell() {
        return middleCell;
    }

    public int getFirstCell() {
        return firstCell;
    }

}
