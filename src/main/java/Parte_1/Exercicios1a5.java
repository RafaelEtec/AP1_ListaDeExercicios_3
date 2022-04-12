package Parte_1;
import java.util.Scanner;
/** 
   por Rafael Ferreira Goulart
**/
public class Exercicios1a5 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        System.out.println(
                  "Qual atividade você deseja avaliar?\n"
                + "Insira o número da atividade de 1 a 5");
        int escolha = 0;
        try {
            escolha = ent.nextInt();
            while (escolha < 1 || escolha > 5) {
                System.out.println("É possível escolher apenas entre 1 a 5");
                escolha = ent.nextInt();
            }
        } catch (Exception ex){
            System.out.println("Letras não são permitidas!");
        }
        switch (escolha) {
            case 1:
                System.out.println(
                        "Implementar uma função que escreva no terminal os números naturais de 1 até um número informado.\n" +
                        "Ex: (10) => 1 2 3 4 5 6 7 8 9 10\n");
                Exercicio1();
                break;
            case 2:
                System.out.println(
                        "Implementar uma função que escreva no terminal os números naturais pares de 0 até um número informado.\n" +
                        "Ex: (10) => 0 2 4 6 8 10\n");
                Exercicio2();
                break;
            case 3:
                System.out.println(
                        "Implementar uma função que escreva no terminal os números naturais ímpares de 1 até um número informado.\n" +
                        "Ex: (10) => 1 3 5 7 9\n");
                Exercicio3();
                break;
            case 4:
                System.out.println(
                        "Implementar uma função que escreva no terminal os números naturais, a partir de um número de início e fim.\n" +
                        "Ex: (3, 11) => 3 4 5 6 7 8 9 10 11\n");
                Exercicio4();
                break;
            case 5:
                System.out.println(
                        "Implementar uma função que escreva no terminal os números naturais de 1 até um número informado de forma decrescente.\n" +
                        "Ex: (10) => 10 9 8 7 6 5 4 3 2 1\n");
                Exercicio5();
                break;
        }
    }
    
    public static void Exercicio1() {
        Scanner ent = new Scanner(System.in);
        
    }

    public static void Exercicio2() {
        Scanner ent = new Scanner(System.in);
        
    }

    public static void Exercicio3() {
        Scanner ent = new Scanner(System.in);
    }

    public static void Exercicio4() {
        Scanner ent = new Scanner(System.in);
    }

    public static void Exercicio5() {
        Scanner ent = new Scanner(System.in);
    }
}
/**
public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        System.out.println(
                  "Qual atividade você deseja avaliar?\n"
                + "Insira o número da atividade de 1 a 5");
        int escolha = 0;
        try {
            escolha = ent.nextInt();
            while (escolha < 1 || escolha > 5) {
                System.out.println("É possível escolher apenas entre 1 a 5");
                escolha = ent.nextInt();
            }
        } catch (Exception ex){
            System.out.println("Letras não são permitidas!");
        }
        switch (escolha) {
            case 1:
                System.out.println("");
                Exercicio1();
                break;
            case 2:
                System.out.println("");
                Exercicio2();
                break;
            case 3:
                System.out.println("");
                Exercicio3();
                break;
            case 4:
                System.out.println("");
                Exercicio4();
                break;
            case 5:
                System.out.println("");
                Exercicio5();
                break;
        }
    }
    
    public static void Exercicio() {

    }

**/