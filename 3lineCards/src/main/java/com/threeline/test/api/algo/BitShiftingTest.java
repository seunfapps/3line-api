package com.threeline.test.api.algo;

import com.threeline.test.api.dtos.responses.AlgoTestResultResponse;
import org.springframework.stereotype.Service;

@Service
public class BitShiftingTest {
    public AlgoTestResultResponse process () {
        AlgoTestResultResponse result = new AlgoTestResultResponse();
        //let n = 10;
        int [] a = new int [] {1, 200, 122, 2999, 412, 302, 56, 58, 900, 1234};
        int [] b = new int [] {45, 600, 392, 812, 2500, 3192, 521, 31, 222, 6};
        //n = a.length = b.length

        result.setOriginalA(a);
        result.setOriginalB(b);

        System.out.println("Original array A:");
        print(a);
        System.out.println();
        System.out.println("Original array B:");
        print(b);
        System.out.println();

        int [] modified = encodeArray(a,b,a.length);
        result.setModified(modified);
        System.out.println("Modified array A:");
        print(modified);
        System.out.println();

        //recover A
        int [] recoverdA = new int [a.length];
        System.out.println("Recovered Array A:");
        for(int i = 0; i < modified.length; i++){
            recoverdA[i] = extractA(modified[i]);
            System.out.print(recoverdA[i]+ ",");
        }
        System.out.println();
        //recover B
        int [] recoverdB = new int [b.length];
        System.out.println("Recovered Array B:");
        for(int i = 0; i < modified.length; i++){
            recoverdB[i] = extractB(modified[i]);
            System.out.print(recoverdB[i] + ",");
        }
        System.out.println();

        result.setRecoveredA(recoverdA);
        result.setRecoveredB(recoverdB);

        return result;
    }

    int encodeInteger(int x, int n){
        n = n<<(1<<(1<<(1<<1)));
        x = x | n;
        return x;
    }

    int [] encodeArray(int [] a, int [] b, int n){
        for(int i=0;i<n;i++) {
            a[i] = encodeInteger(a[i], b[i]);
        }
        return a;
    }

    int extractB(int x){
        return (x & 0xFFFF0000) >> 16;
    }

    int extractA(int x){
        return x & 0x0000FFFF;
    }

    void print(int [] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + ",");
        }
    }

}
