package com.chinastdp.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * chinastdp
 * 
 * @author zhuchengyi 2014-4-27
 */
@Controller
@RequestMapping(value = "test")
public class TestController {

	@RequestMapping(value = "test", method = RequestMethod.GET)
	@ResponseBody
	public String test() {
		return "test";
	}
}
