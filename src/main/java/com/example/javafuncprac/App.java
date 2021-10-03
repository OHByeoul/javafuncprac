package com.example.javafuncprac;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App {
    public static void main(String[] args) {
        Function<Integer, String> intToString = (i) -> "number";


        UnaryOperator<String> hi = (s) -> "hi "+s;

        UnaryOperator<String> hi2 = Greeting::hi; // 메소드 레퍼런스 //unaryoperator만 만들어진 상태

        System.out.println("hi2 = " + hi2.apply("done??"));

        Supplier<Greeting> greetingSupplier = Greeting::new; //supplier

        greetingSupplier.get(); //객체 생성


        Function<String, Greeting> con = Greeting::new; // 문자 받는 생성자
        Greeting oh = con.apply("oh");

        System.out.println("con.get = " + oh.getName());

        Supplier<Greeting> newGreeting = Greeting::new; //걍 생성자


        String [] names = {"aaa","bbb","ccc"};
        Arrays.sort(names, String::compareToIgnoreCase);

    }
}
