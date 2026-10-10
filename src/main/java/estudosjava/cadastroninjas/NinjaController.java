package estudosjava.cadastroninjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NinjaController {

    @GetMapping("/cadastro")
    public String listaarNinjas(){
        return "Bem vindo ao cadastrode ninjas";
    }



}
