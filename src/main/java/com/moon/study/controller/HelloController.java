package com.moon.study.controller;

import java.util.HashMap;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping({"/", "/h"})
    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
        return "hello";
    }
    
	@RequestMapping("/hello")
	public String hello() {
		return "Hello 스프링부트...!";
	}

	@RequestMapping("/hello/{path}")
	public String helloPath(@PathVariable String path) {
		return "Hello "+path+" 스프링부트...!";
	}

	@RequestMapping(value = "/hello2", method = RequestMethod.GET)
	public @ResponseBody HashMap<String, Object> hello2() {
		String hello = "Hello 스프링부트...!";
		HashMap<String, Object> result = new HashMap<String, Object>();
		result.put("aaa", 1);
		result.put("bbb", 2);
		result.put("ccc", hello);
		result.put("ddd", "^^");
		return result;
	}

	@RequestMapping(value = "/hello3", method = RequestMethod.GET)
	public @ResponseBody HashMap<String, Object> hello3(String param) {
		String hello = "Hello 스프링부트...!";
		System.out.println("==== Moon Step ================param====" + param);
		HashMap<String, Object> result = new HashMap<String, Object>();
		result.put("aaa", 1);
		result.put("bbb", 2);
		result.put("ccc", hello);
		result.put("param", param);
		System.out.println("==== Moon Step ================result====" + result.toString());
		return result;
	}

	@RequestMapping(value = "/hello4", method = RequestMethod.POST)
	public @ResponseBody HashMap<String, Object> hello4(@RequestBody HashMap<String, Object> jsonData) {
		String hello = "Hello 스프링부트...!";
		System.out.println("==== Moon Step ================param====" + jsonData);
		HashMap<String, Object> result = new HashMap<String, Object>();
		result.put("aaa", 1);
		result.put("bbb", 2);
		result.put("ccc", hello);
		result.put("param", jsonData);
		System.out.println("==== Moon Step ================result====" + result.toString());
		return result;
	}

}
