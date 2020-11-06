package mysimplespringapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class myApp {
public static void main(String args[])
{
	ApplicationContext appContext = new FileSystemXmlApplicationContext("appContext.xml");
	
	fruit myFruit = appContext.getBean("fruits" , fruit.class);
	
	System.out.println(myFruit.talkaboutyourself());
}
}
