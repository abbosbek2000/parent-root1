package uz.spring.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import uz.spring.demo1.dto.MessageFromDemo2Dto;
import uz.spring.demo1.service.Demo2Service;

@RestController
class TestController {
    @Autowired
    Demo2Service demo2Service;

    @GetMapping
    public String hello() {
        return "Hello from Demo 1" + demo2Service.hello();
    }

    @GetMapping("/message/{id}")
    public ResponseEntity message(@PathVariable Long id) {
        MessageFromDemo2Dto messageFromDemo2Dto = demo2Service.message(id);
        return ResponseEntity.ok(messageFromDemo2Dto);
    }
}
