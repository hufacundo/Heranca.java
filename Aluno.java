package br.uniesp.POO.herancaEscola;

import java.util.Date;

public class Aluno extends Pessoa{

    public Aluno(String nome, String cpf, Date datanascimento){
        super(nome,cpf,datanascimento);
    }
    public String matricula;

    public double tirarCopia(int qntd){
        return 0.07 * (double) qntd;
    }
}


