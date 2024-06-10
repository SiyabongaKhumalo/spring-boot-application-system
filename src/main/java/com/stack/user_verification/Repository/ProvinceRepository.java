package com.stack.user_verification.Repository;

import com.stack.user_verification.Entity.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProvinceRepository extends JpaRepository<Province, Integer> {


}
