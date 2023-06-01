package com.example.myapplication;

public class AnswerData {

    public static int[] count= new int[144];

    public static void result(int p, int i){
        count[p] = i;

        System.out.println(count[p]);

    }

}
