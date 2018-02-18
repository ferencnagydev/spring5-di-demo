package hu.ferencnagydev.exercise.didemo.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static String HELLO_DI = "Hello DI !!!";

    @Override
    public String sayGreeting() {
        return HELLO_DI;
    }
}
