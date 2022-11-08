package uz.spring.demo1.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import uz.spring.demo1.dto.MessageFromDemo2Dto;


@FeignClient("demo2")
public interface Demo2Service {
    @GetMapping
    String hello();

    @PostMapping("message/{id}")
    MessageFromDemo2Dto message(@PathVariable Long id);

}
