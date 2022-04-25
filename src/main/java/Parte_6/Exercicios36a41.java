package Parte_6;
import java.util.Scanner;
/** 
   por Rafael Ferreira Goulart
**/
public class Exercicios36a41 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        System.out.println(
                  "Qual atividade você deseja avaliar?\n"
                + "Insira o número da atividade de 36 a 41");
        int escolha = 0;
        try {
            escolha = ent.nextInt();
            while (escolha < 36 || escolha > 41) {
                System.out.println("É possível escolher apenas entre 36 e 41");
                escolha = ent.nextInt();
            }
        } catch (Exception ex){
            System.out.println("Letras não são permitidas!");
        }
        switch (escolha) {
            case 36:
                System.out.println(
                        "Implementar uma função que converta uma palavra para ASCII.\nDica: Use a função Convert.ToInt32(..) para C#, e charCodeAt(...) para JS.\n" +
                        "Ex: \"Bruno\" => \"66 114 117 110 111\"\n");
                Exercicio36();
                break;
            case 37:
                System.out.println(
                        "Implementar uma função que verifique se uma senha é forte.\nPara ser forte, ela precisa ter pelo menos 2 caracteres especiais, 2 números e 8 digitos.\n" +
                        "Ex: \"bruno@123#\" => true\n");
                Exercicio37();
                break;
            case 38:
                System.out.println(
                        "Implementar uma função que converta uma palavra para Binário.\n" +
                        "Ex: \"Bruno\" => \"01100010 01110010 01110101 01101110 01101111\"\n");
                Exercicio38();
                break;
            case 39:
                System.out.println(
                        "Implementar uma função que verifique, sim ou não, se um número é primo.\n" +
                        "Ex: 17 => true\n");
                Exercicio39();
                break;
            case 40:
                System.out.println(
                        "Implementar uma função que verifique qual é o número da sequência de fibonacci, a partir de uma posição informada.\n" +
                        "Sequência Fibonacci: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89\n" +
                        "Ex: 10 => 55\n");
                Exercicio40();
                break;
            case 41:
                System.out.println(
                        "Implementar uma função que implemente a criptografia ZENIT POLAR.\n" +
                        "Ex: \"bruno\" => \"btule\"\n");
                Exercicio41();
                break;
        }
    }
    
    public static void Exercicio36() {
        Scanner ent = new Scanner(System.in);
        
        
    }
    
    public static void Exercicio37() {
        Scanner ent = new Scanner(System.in);
        
        
    }
    
    public static void Exercicio38() {
        Scanner ent = new Scanner(System.in);
        
        
    }
    
    public static void Exercicio39() {
        Scanner ent = new Scanner(System.in);
        
        
    }
    
    public static void Exercicio40() {
        Scanner ent = new Scanner(System.in);
        
        
    }
    
    public static void Exercicio41() {
        Scanner ent = new Scanner(System.in);
        
        
    }
    
}