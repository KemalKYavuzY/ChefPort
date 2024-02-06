package chefport.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import chefport.model.User;
import chefport.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

        private final UserService service; // Creates an instance of the UserService class

        public UserController(UserService service) {
                this.service = service;
        }

        // Method returns the username string sent by the HTTP request
        @GetMapping("/{username}")
        public @ResponseBody ResponseEntity<String> findbyId(@PathVariable String username) {

                return new ResponseEntity<>(username, HttpStatus.OK);
        }

        @PostMapping("/signup")
        public @ResponseBody ResponseEntity<String> createUser(@RequestBody User user) {
                return new ResponseEntity<>(service.createUser(user), HttpStatus.OK); // Creates a user from our service object
        }

        @PostMapping("/login")
        public @ResponseBody ResponseEntity<String> login(@RequestBody User user) {
                return new ResponseEntity<>(service.checkPassword(user), HttpStatus.OK);
        }
}
