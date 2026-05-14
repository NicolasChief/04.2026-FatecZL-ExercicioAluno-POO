package org.example;

import java.time.LocalDate;
import java.util.Scanner;

public class GestaoAlunos {

    Aluno a = new Aluno();
    Aluno[] aluno = new Aluno[50];
    int i = 0;

    public static void main(String[] args){
        GestaoAlunos g = new GestaoAlunos();
        g.menu();
    }

    public void criar(Scanner input) {

        if (i < 50){

            Long id = (long) i;
            System.out.println("Insira o Nome: ");
            String nome = input.nextLine();
            System.out.println("Insira o RA: ");
            String ra = input.nextLine();
            System.out.println("Insira a data de Nascimento: ");
            String dataNasc = input.nextLine();

            a.setId(id);
            a.setNasc(LocalDate.parse(dataNasc));
            a.setNome(nome);
            a.setRa(ra);

            aluno[i] = a;
            i++;

        } else {

            System.out.println("Cadastros Indisponíveis...");

        }

    }

    public void atualizar(Scanner input) {

        System.out.println("Qual RA deseja procurar: ");

        String search = input.nextLine();

        for (int j=0; j < aluno.length; j++) {

            if(aluno[j] != null && search.equals(aluno[j].getRa())){

                System.out.println("Insira o Nome: ");
                String nome = input.nextLine();
                System.out.println("Insira o RA: ");
                String ra = input.nextLine();
                System.out.println("Insira a data de Nascimento: ");
                String dataNasc = input.nextLine();

                a.setNasc(LocalDate.parse(dataNasc));
                a.setNome(nome);
                a.setRa(ra);

            aluno[j] = a;
            return;

            }
        }
    }

    public void excluir(Scanner input) {

        System.out.println("Qual RA deseja procurar: ");
        
        String search = input.nextLine();

        for (int j=0; j < 50; j++) {

            if(aluno[j] != null && search.equals(aluno[j].getRa())){

                aluno[j] = null;

            }
        }
    }

    public void exibir() {
        for(int j=0; j < aluno.length; j++){
            if(aluno[j] != null){
                System.out.println(aluno[j]);
            }
        }
    }

    public void sair() {
        System.out.println("Encerrando...");
        System.exit(0);
    }

    public void menu() {

        String menu = "C - Criar | E - Exibir | R - Remover | A - Atualizar | S - Sair";

        try (Scanner input = new Scanner(System.in)) {
            while(true){
                System.out.println(menu);
                String digitado = input.nextLine();
                switch(digitado.toUpperCase().charAt(0)){
                    case 'C' : {criar(input); break;}
                    case 'A' : {atualizar(input); break;}
                    case 'X' : {excluir(input); break;}
                    case 'E' : {exibir(); break;}
                    case 'S' : {sair(); break;}
                    default : System.out.println("Opção Inválida");
                }
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

}
