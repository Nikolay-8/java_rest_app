package users.rest.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApplication {
    public static void main(String[] args)
    {
        System.out.println("Main app Start");
        SpringApplication.run(users.rest.server.RestApplication.class, args);
    }
}
