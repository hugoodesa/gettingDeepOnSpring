package br.com.stapassoli.vendas.Controller;

import br.com.stapassoli.vendas.anottations.Cachorro;
import br.com.stapassoli.vendas.interfaces.Animal;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hellow")
public class HellowController {

    @Cachorro
    Animal gato;

    @GetMapping
    public ResponseEntity<String > mainMethod(){
        System.out.println("Cachorro : ");
        gato.fazerBarulho();
        return ResponseEntity.ok("Hellow World");
    }


}

