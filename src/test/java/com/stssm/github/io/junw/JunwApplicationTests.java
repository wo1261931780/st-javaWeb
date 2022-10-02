package com.stssm.github.io.junw;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static com.stssm.github.io.javaweb.aaa002jdbc20220531.Aaa001Demo.LOG_SHOW;

@SpringBootTest
class JunwApplicationTests {

	@Test
	void contextLoads() {
		LOG_SHOW.debug("123");

	}

}
