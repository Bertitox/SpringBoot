package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorUsuario {
    public Usuario usuario;

    @GetMapping("/usuarioget")
    public Usuario usuarioget() {
        return usuario;
    }

    @PostMapping(value = "/usuariopost")
    public String usuariopost(@RequestParam String nombre, @RequestParam String pass) {
        if (validarLong(pass) && validarMayus(pass) && validarMin(pass) && validarNum(pass)) {
            this.usuario = new Usuario(nombre, pass);
            return "<p> Usuario valido </p>";
        }
        return "<p> Usuario inválido </p>";
    }

    public boolean validarMin(String pass) {
        char letras[] = pass.toCharArray();
        for (char c : letras) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }

    public boolean validarMayus(String pass) {
        char letras[] = pass.toCharArray();
        for (char c : letras) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    public Boolean validarLong(String pass) {
        if (pass.length() >= 8 && pass.length() <= 16) {
            return true;
        }
        return false;
    }

    public Boolean validarNum(String pass) {
        char letras[] = pass.toCharArray();
        for (char c : letras) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
}
