package com.example.atividade2ac1.entidade;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Funcionario
 */
@Entity
public class Funcionario implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigoFuncionario;
    private String nome;    
    private String cpf;
    private String pis;
    private String funcao;
    private String tipo;

    public int getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(int codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPis() {
        return pis;
    }

    public void setPis(String pis) {
        this.pis = pis;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Funcionario(int codigoFuncionario, String nome, String cpf, String pis, String funcao, String tipo) {
        this.codigoFuncionario = codigoFuncionario;
        this.nome = nome;
        this.cpf = cpf;
        this.pis = pis;
        this.funcao = funcao;
        this.tipo = tipo;
    }

    public Funcionario() {
    }

    @Override
    public String toString() {
        return "Funcionario [codigoFuncionario=" + codigoFuncionario + ", cpf=" + cpf + ", funcao=" + funcao + ", nome="
                + nome + ", pis=" + pis + ", tipo=" + tipo + "]";
    }

    
}