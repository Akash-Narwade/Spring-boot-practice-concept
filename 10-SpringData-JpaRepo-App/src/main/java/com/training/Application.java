package com.training;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.training.entities.ContactsMasterEntity;
import com.training.repository.ContactsMasterRepository;

@SpringBootApplication
public class Application {

	private static Object object;

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		ContactsMasterRepository bean = context.getBean(ContactsMasterRepository.class);
		
		
		System.out.println("====================================================================");
		//concept2 --> saveAll
	/*	ContactsMasterEntity cme1= new ContactsMasterEntity(103,"Pawan",(long) 960494);
		ContactsMasterEntity cme2= new ContactsMasterEntity(104,"Aniket",(long)960497);
		ContactsMasterEntity cme3= new ContactsMasterEntity(105,"Vishal",(long)960475);
		List<ContactsMasterEntity> contactsMasterEntityList=new ArrayList<>();
		
		contactsMasterEntityList.add(cme1);
		contactsMasterEntityList.add(cme2);
		contactsMasterEntityList.add(cme3);
		bean.saveAll(contactsMasterEntityList); */
		System.out.println("====================================================================");
		// concept3
		//List<ContactsMasterEntity> list = bean.findAll();
		
	/*	List<ContactsMasterEntity> list = bean.findAll(Sort.by("contactName").ascending());
		list.forEach(entity -> {
			System.out.println(entity);
		}); */
		System.out.println("====================================================================");
		
		//concept4- >Pagination
		
		int pageSize=5;
		//getting the data for page number 0 ->Index start from zero(1st Page)
		int pageNo=0;
		
		PageRequest pageReq = PageRequest.of(pageNo, pageSize);
		Page<ContactsMasterEntity> pageData =bean.findAll(pageReq);
		
		//get total Page Size
		int totalPages = pageData.getTotalPages();
		System.out.println("TotalPages Required..........."+totalPages);
		List<ContactsMasterEntity> list1 = pageData.getContent();
		
		list1.forEach(entity1 -> {
			System.out.println(entity1);
		}); 
		
		//context.close();
	}

}
