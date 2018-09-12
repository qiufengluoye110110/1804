package cn.jt.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value="provider-user")//指定应用程序名称
public interface EurekaServiceFeign {
//仿照提供服务这方法写一个接口方法
	
	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable("name") String name);	
}
