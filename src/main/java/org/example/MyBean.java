package org.example;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

@Component
public class MyBean {
    private ArrayList<User> users;

    @PostConstruct
    public void init() {
        users = new ArrayList<>();
        users.add(null);
        users.add(new User("John", true, 24));
        users.add(new User(null, false, 42));
        users.add(new User(null, true, 11));
        users.add(new User(22));
    }

    public User getRandomUser() {
        int min = 0;
        int max = users.size() - 1;
        return users.get(ThreadLocalRandom.current().nextInt(min, max));
    }
}
