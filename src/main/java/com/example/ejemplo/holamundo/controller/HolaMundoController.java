package com.example.ejemplo.holamundo.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HolaMundoController {

    @GetMapping("/hola")
    public String holaMundo () {
        return "hola a todos mi nombre es Pablo";
    }
    @GetMapping("/saludo/{nombre_usuario}")
    public String saludo (@PathVariable String nombre_usuario) {
        return "Hola "+nombre_usuario+ " ¿Cómo estás?";
    }
    @GetMapping("/suma/{a}/{b}")
    public int suma (@PathVariable int a, @PathVariable int b) {
        return a+b;
    }
    @GetMapping("/resta/{a}/{b}")
    public int resta (@PathVariable int a, @PathVariable int b) {
        return a-b;
    }
    @GetMapping("/division/{a}/{b}")
    public int division (@PathVariable int a, @PathVariable int b) {
        return a/b;
    }
    @GetMapping("/multiplicar/{a}/{b}")
    public int multiplicar (@PathVariable int a, @PathVariable int b) {
        return a*b;
    }




}