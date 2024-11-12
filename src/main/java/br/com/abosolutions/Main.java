package br.com.abosolutions;

import br.com.abosolutions.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria java");
        mentoria1.setDescricao("descrição mentoria java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java Developer");
        bootcamp.setDescricao("Descrição Bootcamp java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devAbraao = new Dev();
        devAbraao.setNome("Abraão");
        devAbraao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos:" + devAbraao.getConteudosInscritos());
        devAbraao.progredir();
        devAbraao.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos:" + devAbraao.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " + devAbraao.getConteudosConcluidos() );
        System.out.println("XP: " + devAbraao.calcularTotalXp());

        System.out.println("--------------");

        Dev devJoao = new Dev();
        devAbraao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteudos inscritos:" + devAbraao.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " + devJoao.getConteudosConcluidos() );
        System.out.println("XP: " + devJoao.calcularTotalXp());





    }
}