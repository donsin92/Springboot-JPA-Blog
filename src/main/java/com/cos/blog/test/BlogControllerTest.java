package com.cos.blog.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogControllerTest {

	@RequestMapping(value = "/test/hello", method= RequestMethod.GET)
	public String helloFn() {
		 System.out.println("hello world !!!");
		return "<h1>hello spring boot</h1>";
	}
}
