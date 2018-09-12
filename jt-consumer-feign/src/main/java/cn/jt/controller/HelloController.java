package cn.jt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.jt.feign.EurekaServiceFeign;

@RestController
public class HelloController {

	//注入feign接口
	@Autowired
	private EurekaServiceFeign eurekaServiceFeign;
	
	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable("name") String name ){
		return eurekaServiceFeign.hello(name);
		
	}
	
}
