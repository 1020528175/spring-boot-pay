package com.itstyle;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.itstyle.modules.alipay.service.impl.AliPayServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * 支付主控(启动的时候一定要把main方法的注释去掉，配置好支付宝、微信以及银联相关参数)
 * 创建者 小柒2012
 * 创建时间 2019年7月20日
 * 启动   java -jar spring-boot-pay.jar --server.port=8886 
 * linux 下 后台启动  nohup java -jar spring-boot-pay.jar --server.port=8886 &
 * 注册中心地址：http://47.104.197.9:8848/nacos/
 */
@EnableDubbo
@SpringBootApplication
public class Application {

	private static final Logger logger = LoggerFactory.getLogger(AliPayServiceImpl.class);

	public static void main(String[] args){
		SpringApplication.run(Application.class, args);
		logger.info("启动成功");
	}
}