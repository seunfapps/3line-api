package com.threeline.test.algo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String [] args){
        //let n = 10;
        int [] a = new int [] {1, 200, 122, 2999, 412, 302, 56, 58, 900, 1234};
        int [] b = new int [] {45, 600, 392, 812, 2500, 3192, 521, 31, 222, 6};
        //n = a.length = b.length

        System.out.println("Original array A:");
        print(a);
        System.out.println();
        System.out.println("Original array B:");
        print(b);
        System.out.println();

        int [] modified = encodeArray(a,b,a.length);
        System.out.println("Modified array A");
        print(modified);
        System.out.println();

        //recover A
        System.out.println("Recovered Array A:");
        for(int i = 0; i < modified.length; i++){
            System.out.print(extractA(modified[i])+ ",");
        }
        System.out.println();
        //recover B
        System.out.println("Recovered Array B:");
        for(int i = 0; i < modified.length; i++){
            System.out.print(extractB(modified[i]) + ",");
        }
        System.out.println();
    }

    static int encodeInteger(int x, int n){
        n = n<<(1<<(1<<(1<<1)));
        x = x | n;
        return x;
    }

    static int [] encodeArray(int [] a, int [] b, int n){
        for(int i=0;i<n;i++) {
            a[i] = encodeInteger(a[i], b[i]);
        }
        return a;
    }

    private static int extractB(int x){
        return (x & 0xFFFF0000) >> 16;
    }

    private static int extractA(int x){
        return x & 0x0000FFFF;
    }

    static void print(int [] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + ",");
        }
    }

}
