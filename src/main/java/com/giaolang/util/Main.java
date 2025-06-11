package com.giaolang.util;

import com.giaolang.util.com.core.MathUtility;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        verifyFactorialGivenRightArgORunsWell();
        verifyFactorialGivenRightArg1RunsWell();
        verifyFactorialGivenRightArg2RunsWell();
        verifyFactorialGivenRightArgsRunsWell();
    }
    //TEST CASE #4: VERIFY THE GETFACTORIAL() WITH N = 0
    public static void verifyFactorialGivenRightArgsRunsWell(){
        System.out.println("3! = expected: 6, actual: " + MathUtility.getFactorial(3));
        System.out.println("4! = expected: 24, actual: " + MathUtility.getFactorial(4));
        System.out.println("5! = expected: 120, actual: " + MathUtility.getFactorial(5));
        System.out.println("6! = expected: 720, actual: " + MathUtility.getFactorial(6));
        System.out.println("19! = expected: 121645100408832000, actual: " + MathUtility.getFactorial(19));
    }






    //TEST CASE #3: VERIFY THE GETFACTORIAL() WITH N = 0
    public static void verifyFactorialGivenRightArg2RunsWell(){
        System.out.println("2! = expected: 2, actual: " + MathUtility.getFactorial(2));
    }




    //TEST CASE #2: VERIFY THE GETFACTORIAL() WITH N = 0
    public static void verifyFactorialGivenRightArg1RunsWell(){
        int n = 1;
        long expected = 1; //hy vọng 1 ĐƯỢC TRẢ VỀ NẾU TÍNH 1!
        long actual = MathUtility.getFactorial(n);
        //test là so sánh
        System.out.println("1! = expected: " + expected + ", actual: " + actual);
    }


    //TEST THỬ HÀM TÍNH GIAI THỪA, GỌI TRONG MAIN()
    //MUỐN TEST GÌ ĐÓ THÌ PHẢI CÓ TEST CASE!!!
    //TEST CASE #1: VERIFY THE GETFACTORIAL() WITH N = 0
    //STEPS:
    //     GIVEN N = 0
    //     CALL getFactorial(n = 0)
    //EXPECTED RÉULT:
    //     The method must return 1 as the result of 0! = 1
    //STATUS: PASSED OR FAILED
    public static void verifyFactorialGivenRightArgORunsWell(){
        int n = 0;
        long expected = 1; //hy vọng trả vè bằng 1
        long actual = MathUtility.getFactorial(n);
        //test là so sánh
        System.out.println("0! = expected: " + expected + ", actual: " + actual);
    }
}

//KĨ THUẬT VỪA VIẾT CODE, GÕ CODE, VỪA GÕ TEST CASE, VỪA GÕ TEST RUN, ĐƯỢC TỌI LÀ
//TDD (ĐƯA VÀO CV) TEST DRIVE DEVELOPEMENT