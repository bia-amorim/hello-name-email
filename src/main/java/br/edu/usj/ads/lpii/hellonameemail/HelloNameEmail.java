package br.edu.usj.ads.lpii.hellonameemail;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloNameEmail {
    
    @PostMapping(value="/helloNameEmail")

    public ModelAndView postHelloNameEmail (@RequestParam String nome, @RequestParam String email) {
        
        ModelAndView modelAndView = new ModelAndView("name-email");
        
        String bemVindo = "Olá " + nome + " pessoa incrível da internet!";
        String eMail = "Seu e-mail é " + email;
        modelAndView.addObject("mensagem", bemVindo);
        modelAndView.addObject("email", eMail);

        return modelAndView;
    }
    
}