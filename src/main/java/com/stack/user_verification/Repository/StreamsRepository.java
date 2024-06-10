package com.stack.user_verification.Repository;


import com.stack.user_verification.Entity.Streams;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.stream.Stream;

public interface StreamsRepository extends JpaRepository<Streams, Integer> {
}
