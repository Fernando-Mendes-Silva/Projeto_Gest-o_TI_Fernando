package br.com.fiap.api.controller;

import br.com.fiap.api.pessoa.DadosPessoa;
import br.com.fiap.api.pessoa.Pessoa;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/")
public class HelloController {

    @GetMapping
    public String olaMundo() {
        return "Teste";
    }

    @GetMapping("hello")
    public String hello(@RequestParam(value = "nome", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

//    @PostMapping
//    public String olaPost(@RequestBody Map<String, String> body){
//        String nome = body.get("nome");
//        return "Olá, "+nome;
//    }

//    @PostMapping
//    public String olaPost(@RequestBody Pessoa pessoa){
//        return "Olá, " + pessoa.getNome();
//    }

    @PostMapping
    public String olaPost(@RequestBody DadosPessoa dados){
        return "Olá, " + dados.nome();
    }

}
