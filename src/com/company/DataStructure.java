package com.company;

public class DataStructure {

    public static void main(String[] args) {
        System.out.println(f(1));
    }
    public static int f(int x){
        if(x == 0){
            return 0;
        }
        return 2*f(x-1)+x*x;
    }
}
