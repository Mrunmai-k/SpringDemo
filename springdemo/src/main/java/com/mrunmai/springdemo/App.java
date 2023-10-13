package com.mrunmai.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		// BeanFactory factory = new XmlBeanFactory(new
		// FileSystemResource("spring.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

//    	Even if we don't call getBean(), spring will create the object.
		Alien obj1 = (Alien) context.getBean("alien");
		obj1.code();
		
//		Instead of setting the age through setAge() we can give the default value in bean tag 
//		obj1.setAge(15);
		System.out.println(obj1.getAge());

//		Alien obj2 = (Alien) context.getBean("alien");
//		obj2.code();
//
//		System.out.println(obj2.getAge());

//		Beans are classes which has variables and methods.        
//      The JVM has container and container has all the beans.
//      Spring will create the bean even if you don't create it.
		/*
		 * The object is created only once, and every time you try create the new object
		 * spring container will give the same object. This is called Singleton design
		 * pattern which means by default, spring will give you one object.
		 */
//		Now that scope is changed from singleton to prototype we have got two different objects.
//		Prototype = how many times you have requested that much objects are created.
//		Singleton even if you don't ask, the object is created. But, in prototype, if you don't ask then no object is created.
	}
}
