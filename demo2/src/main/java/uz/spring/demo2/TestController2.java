package uz.spring.demo2;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController2 {
    @GetMapping
    public ResponseEntity hello() {
        return ResponseEntity.ok("Demo2 Hello");
    }

    @PostMapping("/message/{id}")
    public ResponseEntity message(@PathVariable Long id) {
        MessageDTO dto = new MessageDTO();
        dto.setId(id);
        dto.setMessage("Message from Demo 2");
        return ResponseEntity.ok(dto);
    }
}

