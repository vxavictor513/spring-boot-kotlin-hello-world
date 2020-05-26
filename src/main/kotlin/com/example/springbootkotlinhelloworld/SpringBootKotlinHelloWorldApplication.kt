package com.example.springbootkotlinhelloworld

import org.springframework.beans.factory.annotation.Value
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

	@Value("\${hello.name}")
	lateinit var name: String

	@GetMapping("/")
	fun helloWorld(): String {
		return "Hello, $name! from ${InetAddress.getLoopbackAddress().hostAddress}"
	}

}