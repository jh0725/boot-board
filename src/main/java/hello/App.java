package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// IoC Container : Inversion of Control (제어의 역전)
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
    	//Greet 인터페이스 선언된 메소드는 sayHello 밖에 업음
    	Greet g = (Greet) ctx.getBean("korea");
    	System.out.println("Greeting !" + g.sayHello() + ((Greeter) g).iam1());
    	g = (Greet) ctx.getBean("english");
    	System.out.println("Greeting !" + g.sayHello() + ((Greeter2) g).iam2());
    	
    	
    	
    	Greeter korea = (Greeter) ctx.getBean("korea");
    	// Greeter 클래스로 부터 생성된 객체를 참조하는 변수
    	// korea는 Greeter 클레스에 정의된 메ㅗ드를 사용할 수 잇다
    	//System.out.println( " hello world " + korea.sayHello() );
    	System.out.println( " Greeting ! " + korea.sayHello() );
    	Greeter2 eng = (Greeter2) ctx.getBean("english");
    	System.out.println(" Greeting ! " + eng.sayHello());
    	
    }
}
