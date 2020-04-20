package com.example.atividade2ac1.service;

import java.util.List;

import com.example.atividade2ac1.entidade.Funcionario;
import com.example.atividade2ac1.repository.FuncionarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioService {


    @Autowired
    private FuncionarioRepository repository;

    public List<Funcionario> getFuncionarios(){
        return repository.findAll();
    }

    public void salvarFuncionario(Funcionario funcionario){
        if(!(funcionario.getClass() == null || funcionario.getCpf().isEmpty() || funcionario.getPis().isEmpty() 
            || funcionario.getFuncao().isEmpty() || funcionario.getNome().isEmpty() || funcionario.getTipo().isEmpty())){
                repository.save(funcionario);
        }
    }
}