package com.stack.user_verification.Service;

import com.stack.user_verification.Entity.Province;
import com.stack.user_verification.Repository.ProvinceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ProvinceService {

    private final ProvinceRepository provinceRepository;


    public Province saveProvince(Province province) {
        return provinceRepository.save(province);
    }

    public Province updateProvince(Province province) {
        return provinceRepository.save(province);
    }

    public List<Province> getAllProvince() {
        return provinceRepository.findAll();
    }

    public String deleteProvince( int id) {
        provinceRepository.deleteById(id);
        return id + " province deleted";
    }
}
