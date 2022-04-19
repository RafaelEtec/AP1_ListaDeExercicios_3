package Parte_4;
import java.util.Scanner;
/** 
   por Rafael Ferreira Goulart
**/
public class Exercicios22a26 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        System.out.println(
                  "Qual atividade você deseja avaliar?\n"
                + "Insira o número da atividade de 22 a 26");
        int escolha = 0;
        try {
            escolha = ent.nextInt();
            while (escolha < 22 || escolha > 26) {
                System.out.println("É possível escolher apenas entre 22 e 26");
                escolha = ent.nextInt();
            }
        } catch (Exception ex){
            System.out.println("Letras não são permitidas!");
        }
        switch (escolha) {
            case 22:
                System.out.println(
                        "Implementar uma função que retorne um texto que represente a forma de um losango a partir da quantidade de linhas, conforme abaixo:\n" +
                        "Exemplo: 5 linhas\n" +
                        "        *\n" +
                        "      * * * \n" +
                        "    * * * * *\n" +
                        "  * * * * * * * \n" +
                        "* * * * * * * * * \n" +
                        "  * * * * * * * \n" +
                        "    * * * * * \n" +
                        "      * * * \n" +
                        "        * \n");
                Exercicio22();
                break;
            case 23:
                System.out.println(
                        "Implementar uma função que retorne um texto que represente a forma de um triângulo a partir da quantidade de linhas, conforme abaixo:\n" +
                        "Exemplo: 4 linhas\n" +
                        "1\n" +
                        "2 2\n" +
                        "3 3 3\n" +
                        "4 4 4 4\n");
                Exercicio23();
                break;
            case 24:
                System.out.println(
                        "Implementar uma função que retorne um texto que represente a forma de um triângulo a partir da quantidade de linhas, conforme abaixo:\n" +
                        "Exemplo: 4 linhas\n" +
                        "1\n" +
                        "2 3\n" +
                        "4 5 6\n" +
                        "7 8 9 10\n");
                Exercicio24();
                break;
            case 25:
                System.out.println(
                        "Implementar uma função que retorne um texto que represente a forma de um triângulo a partir da quantidade de linhas, conforme abaixo:\n" +
                        "Exemplo: 4 linhas\n" +
                        "   1\n" +
                        "  2 2\n" +
                        " 3 3 3\n" +
                        "4 4 4 4\n");
                Exercicio25();
                break;
            case 26:
                System.out.println(
                        "Implementar uma função que retorne um texto que represente a forma de um triângulo a partir da quantidade de linhas, conforme abaixo:\n" +
                        "Exemplo: 5 linhas\n" +
                        "        1\n" +
                        "      2 1 2 \n" +
                        "    3 2 1 2 3\n" +
                        "  4 3 2 1 2 3 4\n" +
                        "5 4 3 2 1 2 3 4 5\n");
                Exercicio26();
                break;
        }
    }
    
    public static void Exercicio22() {
        Scanner ent = new Scanner(System.in);
        
        
    }
    
    public static void Exercicio23() {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Informe o número de linhas: ");
        int nLin = ent.nextInt();
        
        mostraTrianguloNums(nLin);
    }
    
    public static void mostraTrianguloNums(int nLin) {
        int start = 0;
        for (int pos = nLin; pos >= 0; pos--) {
            for (int i = pos; i < nLin; i++) {
                System.out.print(start+" ");
            }
            start++;
            System.out.println("");
        }
    }
    
    public static void Exercicio24() {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Informe o número de linhas: ");
        int nLin = ent.nextInt();
        
        mostraTrianguloNumsSeq(nLin);
    }
    
    public static void mostraTrianguloNumsSeq(int nLin) {
        int start = 1;
        for (int pos = nLin; pos >= 0; pos--) {
            for (int i = pos; i < nLin; i++) {
                System.out.print(start+" ");
                start++;
            }
            System.out.println("");
        }
    }
    
    public static void Exercicio25() {
        Scanner ent = new Scanner(System.in);
        
        
    }
    
    public static void Exercicio26() {
        Scanner ent = new Scanner(System.in);
        
        
    }
}