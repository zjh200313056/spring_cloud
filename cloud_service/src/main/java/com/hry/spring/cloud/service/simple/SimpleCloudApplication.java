package com.hry.spring.cloud.service.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient // 注册服务到eureka服务器
public class SimpleCloudApplication {

	public static void main(String[] args) {
		// 如果执行成功，会有如下打印信息： Located property source: CompositePropertySource [name='configService', propertySources=[MapPropertySource [name='https://github.com/hryou0922/spring_cloud.git/cloudconfig/cloud-config-dev.properties']]]
		SpringApplication.run(SimpleCloudApplication.class, args);		
	}
}