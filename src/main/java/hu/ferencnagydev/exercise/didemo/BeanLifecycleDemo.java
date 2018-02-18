package hu.ferencnagydev.exercise.didemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BeanLifecycleDemo implements
        InitializingBean,
        DisposableBean,
        BeanNameAware,
        BeanFactoryAware,
        ApplicationContextAware {

    public BeanLifecycleDemo() {
        System.out.println("I am in the constructor!");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean factory has been set!");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("My bean name is: " + s);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("The bean has been terminated!");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("The bean's properties have been set!");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("The application context has been set!");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("The PostConstruct annotated method has been called!");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("The PreDestroy annotated method has been called!");
    }

    public void beforeInit() {
        System.out.println("Before init has been called by Bean Post Processor");
    }

    public void afterInit() {
        System.out.println("After init has been called by Bean Post Processor");
    }
}
