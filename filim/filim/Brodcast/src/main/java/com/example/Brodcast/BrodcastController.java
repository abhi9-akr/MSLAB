package com.example.Brodcast;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
@RequestMapping("/brodcasts")
@RestController
public class BrodcastController {
    private List<Brodcast> brodcast = Arrays.asList(
            new Brodcast(1, "Joe Bloggs","ksjhfjk"),
            new Brodcast(2, "Jane Doe","ahshf")
            );
    
    @GetMapping
    public List<Brodcast> getAllBrodcasts() {
        return brodcast;
    }
    
    @GetMapping("/{id}")
    public Brodcast getBrodcastById(@PathVariable int id) {
        return brodcast.stream()
                        .filter(customer -> customer.getId() == id)
                        .findFirst()
                        .orElseThrow(IllegalArgumentException::new);
    }
}