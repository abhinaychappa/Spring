package springOne;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
		Alien obj=context.getBean("alien1",Alien.class);
		obj.code();
		Desktop obj1=context.getBean(Desktop.class);	}	

}
