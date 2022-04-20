package Parte_5;
import java.util.Scanner;
/** 
   por Rafael Ferreira Goulart
**/
public class Exercicios32a35 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        System.out.println(
                  "Qual atividade você deseja avaliar?\n"
                + "Insira o número da atividade de 32 a 35");
        int escolha = 0;
        try {
            escolha = ent.nextInt();
            while (escolha < 32 || escolha > 35) {
                System.out.println("É possível escolher apenas entre 32 e 35");
                escolha = ent.nextInt();
            }
        } catch (Exception ex){
            System.out.println("Letras não são permitidas!");
        }
        switch (escolha) {
            case 32:
                System.out.println(
                        "Implementar uma função que inverta os caracteres de um texto recebido.\n" +
                        "Ex: \"Bruno\" => \"onurB\"\n");
                Exercicio32();
                break;
            case 33:
                System.out.println(
                        "Implementar uma função que verifique se um texto é um palíndromo.\n" +
                        "Ex: \"luz azul\" => true\n");
                Exercicio33();
                break;
            case 34:
                System.out.println(
                        "Implementar uma função que inverta os digitos de um número recebido.\n" +
                        "Ex: 12345 => 54321\n");
                Exercicio34();
                break;
            case 35:
                System.out.println(
                        "Implementar uma função que verifique se um número é um palíndromo.\n" +
                        "Ex: 1198911 => true\n");
                Exercicio35();
                break;
        }
    }
    
    public static void Exercicio32() {
        Scanner ent = new Scanner(System.in);
        
        
    }
    
    public static void Exercicio33() {
        Scanner ent = new Scanner(System.in);
        
        
    }
    
    public static void Exercicio34() {
        Scanner ent = new Scanner(System.in);
        
        
    }
    
    public static void Exercicio35() {
        Scanner ent = new Scanner(System.in);
        
        
    }
}