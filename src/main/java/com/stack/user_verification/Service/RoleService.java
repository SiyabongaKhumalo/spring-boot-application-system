package com.stack.user_verification.Service;


import com.stack.user_verification.Entity.Role;
import com.stack.user_verification.Repository.RoleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class RoleService {

    private RoleRepository roleRepository;

//    public RoleService(RoleRepository roleRepository) {
//        this.roleRepository = roleRepository;
//    }
    public Role saveRole(Role role){
        return roleRepository.save(role);


    }


}
