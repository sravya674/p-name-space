package mysimplespringapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class myApp {
public static void main(String args[])
{
	ApplicationContext appContext = new FileSystemXmlApplicationContext("appContext.xml");
	
	fruit myFruit = appContext.getBean("fruit" , fruit.class);
	
	vegetable myveg= (vegetable)appContext.getBean("vegetable");
	
	vegetable myotherveggie = appContext.getBean("vegiwithname" , vegetable.class);
	
	
	
	System.out.println(myFruit.talkaboutyourself());
	

	System.out.println(myotherveggie.talkaboutyourself());
	
	System.out.println(myveg.talkaboutyourself());
	
	((FileSystemXmlApplicationContext) appContext) .close();
}
}
