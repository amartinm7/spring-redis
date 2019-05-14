package com.amm.poc.springredis

import com.amm.poc.springredis.infrastructure.SpringRedisApplication
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.annotation.DirtiesContext
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest(
	classes = [SpringRedisApplication::class],
	webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
@DirtiesContext
class SpringRedisApplicationTests {

	@Test
	fun contextLoads() {
	}

}
