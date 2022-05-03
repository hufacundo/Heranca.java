package br.uniesp.POO.herancaEscola;

import java.util.Date;

public class EscolaMain {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("José Clementino", "587.563.724-25", new Date());
        System.out.println(aluno.nome);
        System.out.println(aluno.cpf);
        System.out.println(aluno.data_nascimento.toString());
        System.out.println("_______________________________");

        System.out.println(aluno.tiraCopia(3));
        Professor professor = new Professor("Caio", "1723.182.125-28", new Date());
        System.out.println("Valor copias prof" + professor.tiraCopia(3));
    }
}



