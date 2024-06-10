package com.stack.user_verification.Controller;


import com.stack.user_verification.Entity.Province;
import com.stack.user_verification.Service.ProvinceService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@AllArgsConstructor

public class ProvinceController {

    private final ProvinceService provinceService;


    @PostMapping("/Province")
    public Province saveProvince(@RequestBody Province province){
        return provinceService.saveProvince(province);
    }

    @PutMapping("/UpdateProvince")
    public Province updateProvince(@RequestBody Province province){
        return provinceService.updateProvince(province);
    }

    @GetMapping("/getProvince")
    public List<Province> getALLProvince(@RequestBody Province province){
        return provinceService.getAllProvince();
    }

     @DeleteMapping("/delete/{id}")
     public String deleteProvince(@PathVariable int id){
         provinceService.deleteProvince(id);
         return id + "province deleted ";
    }

}
