package com.learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.learn.bean.Person;
import com.learn.bean.PersonConstructorInj;
import com.learn.bean.PersonFieldInj;
import com.learn.bean.PersonSetterInj;

public class Application {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Person bean = applicationContext.getBean(Person.class);
		bean.setFirstName("Ram");
		bean.setLastName("Kumar");
		bean.setAge(25);

		System.out.println(bean);

		Person person = (Person) applicationContext.getBean("person");
		System.out.println(person);

		Person person1 = applicationContext.getBean("person", Person.class);
		System.out.println(person);

		PersonConstructorInj constructorInj = applicationContext.getBean("personConstructorInj",
				PersonConstructorInj.class);
		System.out.println(constructorInj);

		PersonFieldInj fieldInj = applicationContext.getBean(PersonFieldInj.class);
		System.out.println(fieldInj);

		PersonSetterInj personSetterInj = applicationContext.getBean(PersonSetterInj.class);
		System.out.println(personSetterInj);
		
		AbstractApplicationContext abstractApplicationContext = (AbstractApplicationContext) applicationContext;
		abstractApplicationContext.close();
	}

}
