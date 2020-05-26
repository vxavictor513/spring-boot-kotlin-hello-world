package com.example.springbootkotlinhelloworld

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.net.InetAddress

@SpringBootApplication
class SpringBootKotlinHelloWorldApplication
fun main(args: Array<String>) {
	runApplication<SpringBootKotlinHelloWorldApplication>(*args)
}

@RestController
class MyController {

	@GetMapping("/")
	fun helloWorld(): String {
		return "Hello, World! from ${InetAddress.getLoopbackAddress().hostAddress}"
	}

}