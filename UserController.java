package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/users")
    public List<UserEntity> getAllUsers() {
        System.out.println("Test: "+20);
        return userRepository.findAll();
    }

    @GetMapping("/users/{id}")
    public Optional<UserEntity> getAllUsersById(@PathVariable(value="id") Integer id) {
        return userRepository.findById(id);
    }

    @PostMapping("/users")
    public @Valid UserEntity createUser(@Valid @RequestBody UserEntity user) {
        return userRepository.save(user);
    }

    @PutMapping("/users/{id}")
    public @Valid UserEntity updateUser(@PathVariable(value="id") Integer id, @Valid @RequestBody UserEntity user )
            throws UserNotFoundException {
        UserEntity usr = userRepository.findById(id).orElseThrow(()->new UserNotFoundException(id));
        //usr.setName(employee.getName());
        UserEntity updUsr = userRepository.save(usr);
        return updUsr;
    }

    @DeleteMapping("users/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable("id") Integer id) throws UserNotFoundException {
        UserEntity usr = userRepository.findById(id).orElseThrow(()->new UserNotFoundException(id));

        userRepository.deleteById(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}
