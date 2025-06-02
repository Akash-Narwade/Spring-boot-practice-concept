package com.training;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.training.entity.OrderDetailsEntity;
import com.training.repository.OrderDetailsRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		 ConfigurableApplicationContext context= SpringApplication.run(Application.class, args);
		 
		 OrderDetailsRepository bean=context.getBean(OrderDetailsRepository.class);
		 OrderDetailsEntity orderDetailsEntity =new OrderDetailsEntity();
		 orderDetailsEntity.setOrderBy("Akash");
		 orderDetailsEntity.setOrderPlacedDate(new Date());
		 OrderDetailsEntity saved= bean.save(orderDetailsEntity);
		 
		 System.out.println(saved);
		 context.close();
	}

}
