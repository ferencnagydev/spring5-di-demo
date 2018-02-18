package hu.ferencnagydev.exercise.didemo;

import hu.ferencnagydev.exercise.didemo.controller.ConstructorInjectedController;
import hu.ferencnagydev.exercise.didemo.controller.MyController;
import hu.ferencnagydev.exercise.didemo.controller.PropertyInjectedController;
import hu.ferencnagydev.exercise.didemo.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(DiDemoApplication.class, args);

		MyController myController = (MyController) applicationContext.getBean("myController");

		System.out.println(myController.hello());
		System.out.println(applicationContext.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(applicationContext.getBean(SetterInjectedController.class).sayHello());
		System.out.println(applicationContext.getBean(ConstructorInjectedController.class).sayHello());

	}
}
