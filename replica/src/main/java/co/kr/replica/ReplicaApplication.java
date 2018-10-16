package co.kr.replica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class ReplicaApplication {

	public static void main(String[] args){
		SpringApplication.run(ReplicaApplication.class, args);
        System.out.println("TEST");
	}
}
