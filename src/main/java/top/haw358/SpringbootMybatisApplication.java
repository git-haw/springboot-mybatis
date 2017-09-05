package top.haw358;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "top.haw358.mapper")
public class SpringbootMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybatisApplication.class, args);
	}
}
