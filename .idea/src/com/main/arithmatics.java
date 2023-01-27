package com.main;

public class arithmatics {
    public int add(int a ,int b){
        return a+b;
    }

    public static void main(String[] args) {
        arithmatics arithmetic = new arithmatics();
        System.out.println("Adding two number - " +arithmetic.add(2,1));
        System.out.println("substitute two number - " +arithmetic.sub(2,1));
        System.out.println("multiplying two number - " +arithmetic.multi(2,1));
        System.out.println("divided two number - " +arithmetic.div(2,1));
        System.out.println("Adding two number - " +arithmetic.add(2,1));
    }
    public int sub(int a ,int b){
        return a-b;
    }
    public int multi(int a ,int b){
        return a*b;
    }
    public int div(int a ,int b){
        return a/b;
    }


}

