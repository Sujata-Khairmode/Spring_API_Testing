package com.jbk.Spring_Initilizer_Project1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@RequestMapping(value = "/java",method = RequestMethod.GET) 
	public String FirstAPI() {
		return "This is My First API";
	}
	@RequestMapping(value = "/html",method = RequestMethod.POST)
	 public String SecondAPI() {
		 return "second API";
	 }
	@RequestMapping(value = "/css",method = RequestMethod.PUT)
	public String ThirdAPI() {
		return "Third API";
	}
	
	@RequestMapping(value = "/javascript",method = RequestMethod.DELETE)
	public String FourthAPI() {
		return "This is Fourth API";
	}
	@RequestMapping(value = "/mysql",method = RequestMethod.HEAD)
	public String FifthAPI() {
		return "this is fifth api";
	}

}
