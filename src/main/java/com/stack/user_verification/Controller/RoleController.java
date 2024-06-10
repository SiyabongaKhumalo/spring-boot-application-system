package com.stack.user_verification.Controller;


import com.stack.user_verification.Entity.Role;
import com.stack.user_verification.Service.RoleService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class RoleController {

    private RoleService roleService;

    @PostMapping("/saveRole")
    public Role saveRole(@RequestBody Role role){
        return roleService.saveRole(role);
    }
}
