package me.dio.santanderDevBackend;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Teste {
    
    @GetMapping
    public String teste() {
        return "HOLA. TUDO BEM?";

    }
}