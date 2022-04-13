package Parte_2;
import java.util.Scanner;
/** 
   por Rafael Ferreira Goulart
**/
public class Exercicios12a16 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        System.out.println(
                  "Qual atividade você deseja avaliar?\n"
                + "Insira o número da atividade de 12 a 16");
        int escolha = 0;
        try {
            escolha = ent.nextInt();
            while (escolha < 12 || escolha > 16) {
                System.out.println("É possível escolher apenas entre 12 e 16");
                escolha = ent.nextInt();
            }
        } catch (Exception ex){
            System.out.println("Letras não são permitidas!");
        }
        switch (escolha) {
            case 12:
                System.out.println(
                        "Implementar uma função que retorne um texto que represente a forma de uma linha a partir do tamanho de pontos que a compõem, conforme abaixo:\n" +
                        "Exemplo: 4 pontos\n" +
                        "* * * *\n");
                Exercicio12();
                break;
            case 13:
                System.out.println(
                        "Implementar uma função que retorne um texto que represente a forma de um quadrado a partir da quantidade de linhas, conforme abaixo:\n" +
                        "Exemplo: 4 linhas\n" +
                        "* * * *\n" +
                        "* * * *\n" +
                        "* * * *\n" +
                        "* * * *\n");
                Exercicio13();
                break;
            case 14:
                System.out.println(
                        "Implementar uma função que retorne um texto que represente a forma de um retângulo a partir da quantidade de linhas e colunas, conforme abaixo:\n" +
                        "Exemplo: 4 linhas e 2 colunas\n" +
                        "* *\n" +
                        "* *\n" +
                        "* *\n" +
                        "* *\n");
                Exercicio14();
                break;
            case 15:
                System.out.println(
                        "Implementar uma função que retorne um texto que represente a forma de um triângulo a partir da quantidade de linhas, conforme abaixo:\n" +
                        "Exemplo: 5 linhas\n" +
                        "*\n" +
                        "* *\n" +
                        "* * *\n" +
                        "* * * * \n" +
                        "* * * * *\n");
                Exercicio15();
                break;
            case 16:
                System.out.println(
                        "Implementar uma função que retorne um texto que represente a forma de um triângulo invertido a partir da quantidade de linhas, conforme abaixo:\n" +
                        "Exemplo: 5 linhas\n" +
                        "        *\n" +
                        "      * *\n" +
                        "    * * *\n" +
                        "  * * * *\n" +
                        "* * * * *\n");
                Exercicio16();
                break;
        }
    }
    
    public static void Exercicio12() {
        Scanner ent = new Scanner(System.in);
        
        
    }
    
    public static void Exercicio13() {
        Scanner ent = new Scanner(System.in);
        
        
    }
    
    public static void Exercicio14() {
        Scanner ent = new Scanner(System.in);
        
        
    }
    
    public static void Exercicio15() {
        Scanner ent = new Scanner(System.in);
        
        
    }
    
    public static void Exercicio16() {
        Scanner ent = new Scanner(System.in);
        
        
    }
}
