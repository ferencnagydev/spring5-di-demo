package hu.ferencnagydev.exercise.didemo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("hu")
@Primary
public class PrimaryHungarianGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Üdv az elsődleges szolgáltatásból!";
    }
}
