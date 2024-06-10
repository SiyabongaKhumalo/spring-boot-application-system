package com.stack.user_verification.Controller;



import com.stack.user_verification.Entity.User;
import com.stack.user_verification.Service.UserService;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@AllArgsConstructor
@RestController
public class UserController {

    private final UserService userService;


    @PostMapping("/saveUser")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }


    @PutMapping("/updateUser")
    public User updateUser(@RequestBody User user){
        return userService.saveUser(user);
    }
    //getting all users
    @GetMapping("/getuser")
    public List<User> getUser(@RequestBody User user){
        return userService.getAllUser();

    }
    @DeleteMapping("/deleteuser/{id}")
    public String deleteUser(@PathVariable int id){
        return userService.deleteUser(id);
    }

    @GetMapping("/getUser/{id}")
    public User findUserById(@PathVariable int id){
        return userService.getUserById(id);
    }
//

//    @PutMapping("/user")
//    public User updateUser(@RequestBody User user){
//        return userService.updateUser(user);
//    }




}



