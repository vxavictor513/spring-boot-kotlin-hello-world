package com.example.springbootkotlinhelloworld

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootKotlinHelloWorldApplication

fun main(args: Array<String>) {
	runApplication<SpringBootKotlinHelloWorldApplication>(*args)
}
