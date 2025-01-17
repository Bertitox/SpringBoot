package com.example.demo;

import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
public class HolaMundo {
    @GetMapping("/holiii")
    public String saludo() {
        return "Hola Mundo";
    }

    @GetMapping("/adiooos")
    public String adios() {
        return "<h1>Hasta luegito vecinito by Neds</h1>";
    }

    @GetMapping("/hora")
    public String hora() {
        return "<h3>" + LocalDateTime.now().toString() + "</h3>";
    }

    @PostMapping(value = "/login")
    public String login(@RequestParam String nickname, @RequestParam String password, @RequestParam int edad) {
        if (edad < 18) {
            return "eres menor de edad";
        } else {
            return "info recibida de " + nickname + "con la contraseña " + password + ". Edad " + edad;
        }
    }

    @PostMapping(value = "/libro")
    public Libro libro(@RequestParam String titulo, @RequestParam String isbn, @RequestParam String autor) {
        Libro l = new Libro(titulo, isbn, autor);
        return l;
    }



}
