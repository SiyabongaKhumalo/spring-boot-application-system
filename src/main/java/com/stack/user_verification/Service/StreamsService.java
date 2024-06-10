package com.stack.user_verification.Service;


import com.stack.user_verification.Entity.Streams;
import com.stack.user_verification.Entity.User;
import com.stack.user_verification.Repository.StreamsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

@Service
@AllArgsConstructor
public class StreamsService {

    private final StreamsRepository streamsRepository;

    public Streams saveStreams(Streams streams) {
        return streamsRepository.save(streams);
    }

    public Streams updateStreams(Streams streams) {
        return streamsRepository.save(streams);
    }

    public List<Streams> getALLStreams() {
        return streamsRepository.findAll();
    }


    public String deleteStreams( int id) {
        if (streamsRepository.existsById(id)) {
            streamsRepository.deleteById(id);
        }
        return id + " stream deleted";
    }
    public Streams getStreamsById(int id) {
        return streamsRepository.findById(id).orElse(null);
    }
}
