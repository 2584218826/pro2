package cn.xjt.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@MapperScan(basePackages = "cn.xjt.springboot.mapper")
public class SpringBootWebRestfulcrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebRestfulcrudApplication.class, args);
	}

}
