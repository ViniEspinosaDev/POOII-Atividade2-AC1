package com.example.atividade2ac1.controller;

import com.example.atividade2ac1.entidade.Funcionario;
import com.example.atividade2ac1.service.FuncionarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FuncionarioController {


    @Autowired
    private FuncionarioService service;

    @GetMapping()
    public String inicio(){
        return "redirect:/funcionarios";
    }

    @GetMapping("/funcionarios")
    public ModelAndView getFuncionarios(){
        ModelAndView mv = new ModelAndView("funcionariosTemplate");
        mv.addObject("funcionarios",service.getFuncionarios());
        return mv;
    }       

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Funcionario funcionario){
        service.salvarFuncionario(funcionario);
        return "redirect:/funcionarios";
    }

}