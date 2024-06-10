package com.stack.user_verification.Controller;


import com.stack.user_verification.Entity.Streams;
import com.stack.user_verification.Entity.User;
import com.stack.user_verification.Service.StreamsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@AllArgsConstructor
public class StreamController {

    private final StreamsService streamsService;

    @PostMapping("/saveStreams")
    public Streams saveStreams(@RequestBody Streams streams){
        return streamsService.saveStreams(streams);
    }

    @GetMapping("/updateStreams")
    public List<Streams> getALLStreams(@RequestBody Streams streams){
        return streamsService.getALLStreams();
    }
    @PutMapping("/updatestreams")
    public Streams updateStreams(@RequestBody Streams streams){
        return streamsService.updateStreams(streams);
    }
    @DeleteMapping("/deletestream/{id}")
    public String deleteStreams(@PathVariable int id){
        streamsService.deleteStreams(id);
        return id + "id of stream deleted";
    }
    @GetMapping("/getStream/{id}")
    public Streams findStreamsById(@PathVariable int id) {
        return streamsService.getStreamsById(id);
    }
}
