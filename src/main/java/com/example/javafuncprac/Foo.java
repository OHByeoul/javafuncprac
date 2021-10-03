package com.example.javafuncprac;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;

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

        Foo foo = new Foo();
        foo.run();
    }

    private void run() {
        int num = 10; // 람다 안에서 쓰기 때문에 final을 적지 않아도 effective final 상태이다.

        //로컬 클래스
        class LocalClass{
            void printNum(){
                System.out.println("num = " + num);
            }
        }

        //익명클래스
        Consumer<Integer> con = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("integer = " + integer);
            }
        };


        //람다
        // 로컬 클래스와 익명클래스와는 다르게  쉐도잉이 되지 않는다. => 람다는 같은 스코프이다.
        IntConsumer print = (i) -> { //람다 안에서 effective final이 아니면 참조할 수 없다.
            System.out.println("i = " + num);
        };

    }
}
