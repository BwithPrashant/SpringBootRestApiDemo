package com.prashant.courseapi.topic;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@RequestMapping("/get1")
	public String get1()
	{
		return "data1";
	}
	
	@RequestMapping("/get2/{val}")
	public String get2(@PathVariable String val)
	{
		return val;
	}
	
	@RequestMapping(method=RequestMethod.POST ,value="/post1")
	public String post1(@RequestBody String str)
	{
		return str;
	}
	
	@RequestMapping(method=RequestMethod.POST ,value="/post2/{id}")
	public String post2(@RequestBody String str,@PathVariable String id)
	{
		return str + "-" + id;
	}
}
