package SpringPackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Mobile 
{

	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Bean called");
		Sim s=(Sim)context.getBean("sim");
		s.calling();
		s.data();
	}

}
