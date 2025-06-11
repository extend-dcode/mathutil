package com.giaolang.util.com.core;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {
    //CHUẨN BỊ BỘ DATA ĐỂ RIÊNG - DD - DATA DRIVEN
    //LÁT HỒI FILL VÀO HÀM SO SÁNH - T - TESTING
    //FILL VÀO QUA THAM SỐ HÀM - HÀM LÀM VIỆC VỚI NHIỀU DATA
    //DDT CÒN GỌI TÊN KHÁC: PARANETERIZED TESTING ->KIỂM THỬ THEO KIỂU THAM SỐ HÓA

    //BỘ DATA: NẰM TRONG HÀM STATIC - TĨNH 1 CHỖ ĐỂ CÁC NƠI VÀO LẤY
    //BỘ DATA: THƯỜNG LÀ MẢNG 2 CHIỀU, GIÁ TRỊ ĐẦU VÀO VÀ GIÁ TRỊ KÌ VỌNG
    public static Object[][] initData() {
        //int[] a = {5,10,15,20}; MẢNG 1 CHIỀU
        return new Object[][]  {{0,1},
                                {1,1},
                                {2,2},
                                {3,6},
                                {4,24},
                                {5,120},
                                {6,720},};
    }                          //n, expected


    @ParameterizedTest
    @MethodSource("initData")
    public void testFactorialGivenRightArgsRunWell(int n, long expected){

        assertEquals(expected, MathUtility.getFactorial(n));
    }
}