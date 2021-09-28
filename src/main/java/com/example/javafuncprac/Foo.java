package com.example.javafuncprac;

import java.util.function.Consumer;
import java.util.function.Function;

public class Foo {
    public static void main(String[] args) {
        Javafuncprac javafuncprac = new Javafuncprac() { //익명내부클래스
            @Override
            public void mama() {
                System.out.println("hhhh");
            }
        };


        Javafuncprac javafuncprac1 = () -> System.out.println("wwwww");

        Javafuncprac javafuncprac2 = () -> {
                System.out.println("111");
                System.out.println("222");
        };


        Function<Integer, Integer> plus = (number) -> 19+number;
        System.out.println("plus = " + plus.apply(15));

        Function<Integer,Integer> multi = (number) -> number * 3;
        System.out.println("plus.andThen(multi).apply(3) = " + plus.andThen(multi).apply(3));

        Consumer<Integer> consumer = (number) -> System.out.println("number = " + number);
        consumer.accept(3);
    }
}
