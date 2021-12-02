package Spring2Package;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Exam
{

	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Student p=context.getBean("student1",Student.class);
		p.display();
		Student s=context.getBean("student2",Student.class);
		s.display();
		
	}

}
