package com.stack.user_verification.Service;

import com.stack.user_verification.Entity.Province;
import com.stack.user_verification.Entity.User;
import com.stack.user_verification.Repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Service
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;

    // saving user to database
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    //update the user information
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    //getting all users
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    //deleting the user
    public String deleteUser(int id) {
        userRepository.deleteById(id);
        return id + " user deleted";
    }
        public User getUserById( int id) {
            return userRepository.findById(id).orElse(null);
        }


}
//    //updating the user from database
//    public User updateUser(User user) {
//        return userRepository.save(user);
//    }
//    //getting the user list
//    public List<User> getAllUser() {
//        return userRepository.findAll();
   // }



