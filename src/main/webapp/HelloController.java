package com.example.demo;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello 스프링부트...!!";
	}

	@PostMapping("/hello2")
	public @ResponseBody HashMap<String, Object> hello2(@RequestBody HashMap<String, Object> jsonData) {
		String result = "Hello 스프링부트22...!!";
		System.out.println("=========== Moon Syste ============" + jsonData);
		HashMap<String, Object> data = new HashMap<String, Object>();
		data.put("aaa", 1);
		data.put("bbb", 2);
		data.put("ccc", result);
		data.put("ddd", jsonData);
		return data;
	}

	@PostMapping("/hello3")
	public @ResponseBody HashMap<String, Object> hello3(@RequestBody HashMap<String, Object> jsonData) {
		String result = "Hello 스프링부트22...!!";
		System.out.println("=========== Moon Syste ============" + jsonData);
		HashMap<String, Object> data = new HashMap<String, Object>();
		data.put("aaa", 1);
		data.put("bbb", 2);
		data.put("ccc", result);
		data.put("ddd", jsonData);
		return data;
	}
	
}
