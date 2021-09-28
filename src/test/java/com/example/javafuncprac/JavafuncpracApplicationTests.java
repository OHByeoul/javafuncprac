package com.example.javafuncprac;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.function.Function;

import static org.assertj.core.api.Assertions.assertThat;


class JavafuncpracApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void andThen(){
		//given
		Function<Integer, Integer> plus = (number) -> number+5;
		Function<Integer, Integer> multi = (number) -> number*3;

		//when
		Integer apply = plus.andThen(multi).apply(3);

		assertThat(apply).isEqualTo(24);
	}

}
