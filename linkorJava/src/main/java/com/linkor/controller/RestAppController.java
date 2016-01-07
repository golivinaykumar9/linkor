package com.linkor.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAppController {

	@RequestMapping("/greeting")
	public boolean greeting(@RequestParam(value = "userName") String name) {
		return true;
	}

}
