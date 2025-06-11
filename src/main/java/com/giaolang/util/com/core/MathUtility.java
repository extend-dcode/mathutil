package com.giaolang.util.com.core;

public class MathUtility {

    //CLASS này dùng để cung cấp các hàm tính toán toán học
    //bắt chước class math, trong jdk
    //vì nhưngx tính toán này, tính xong rồi trả ra, ko cần lưu trữ lại
    //do đó ta thiết kế nó dạng static


    //ta làm 1 hàm tính N! = 1.2.3.4...n
    //QUY ƯỚC:
    //0! = 1
    //KO CÓ SỐ ÂÂM GIAI THỪA
    //20! VỪA ĐỦ KIỂU long, 21! KHONG DÙNG DC
    public static long getFactorial(int n){
        if (n < 0 ||n > 20){
            throw new IllegalArgumentException("n must betwwen 0 and 20");
        } // nếu đưa data sai, ném ngoại lệ, ném câu thông báo
        if( n == 0 ){
            return 1;
        }

        //cpu chạy được đến dây tức là n = 1,2,3...20
        //tính n! = 1,2,3,4....thuật toán con heo đất, ốc bu ngồi thịt, nhân dồn, cộng dồn tíc lũy
        long result = 1;
        for ( int i = 1; i <= n ; i++){
            result *= i;
        }
        return result;
    }
}
