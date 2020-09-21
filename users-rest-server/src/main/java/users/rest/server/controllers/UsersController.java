package users.rest.server.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import users.rest.server.entity.User;
import users.rest.server.services.UserService;

import java.util.List;

// https://javarush.ru/groups/posts/hibernate-java
@RestController
public class UsersController {

    private final UserService clientService;

    @Autowired
    public UsersController(UserService clientService) {
        this.clientService = clientService;
    }

//    //@RequestMapping("/users")
//    //@RequestMapping("/users")
    @GetMapping(value = "/users")
    public List<User> getUsersList() {
        UserService userService = new UserService();
        //System.out.println("@GetMapping: users");
        return userService.findAllUsers();
    }

    @GetMapping(value = "/create_user")
    public void addUser() {
        System.out.println("@GetMapping: create_user: 0");
        UserService userService = new UserService();
        System.out.println("@GetMapping: create_user: 1");
        User newUser = new User();
        System.out.println("@GetMapping: create_user: 2");
        newUser.setLogin("login");
        newUser.setPassword("users_888");
        System.out.println("@GetMapping: create_user: 3");
        userService.saveUser(newUser);
        System.out.println("@GetMapping: create_user: End");
    }
//
//    @PostMapping(value = "/clients")
//    public ResponseEntity<?> create() {
//        User user = new User();
//        user.setLogin("jgiug");
//        user.setPassword("89798789");
//        clientService.saveUser(user);
//        return new ResponseEntity<>(HttpStatus.CREATED);
//    }
}
