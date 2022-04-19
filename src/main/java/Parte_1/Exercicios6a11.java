package Parte_1;
import java.util.Scanner;
/** 
   por Rafael Ferreira Goulart
**/
public class Exercicios6a11 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        System.out.println(
                  "Qual atividade você deseja avaliar?\n"
                + "Insira o número da atividade de 6 a 11");
        int escolha = 0;
        try {
            escolha = ent.nextInt();
            while (escolha < 6 || escolha > 11) {
                System.out.println("É possível escolher apenas entre 6 e 11");
                escolha = ent.nextInt();
            }
        } catch (Exception ex){
            System.out.println("Letras não são permitidas!");
        }
        switch (escolha) {
            case 6:
                System.out.println(
                        "Implementar uma função que escreva no terminal os números naturais pares de 0 até um número informado de forma decrescente.\n" +
                        "Ex: (10) => 10 8 6 4 2 0\n");
                Exercicio6();
                break;
            case 7:
                System.out.println(
                        "Implementar uma função que escreva no terminal os números naturais ímpares de 1 até um número informado de forma decrescente.\n" +
                        "Ex: (10) => 9 7 5 3 1\n");
                Exercicio7();
                break;
            case 8:
                System.out.println(
                        "Implementar uma função que escreva no terminal os números naturais, a partir de um número de início e fim, de forma decrescente.\n" +
                        "Ex: (3, 11) => 11 10 9 8 7 6 5 4 3\n");
                Exercicio8();
                break;
            case 9:
                System.out.println(
                        "Implementar uma função que escreva no terminal os números naturais múltiplos de número informado, de 0 até outro número informado.\n" +
                        "Ex1: (4, 20) => 0, 4, 8, 12, 16, 20\n" +
                        "Ex2: (6, 20) => 6, 12, 18\n");
                Exercicio9();
                break;
            case 10:
                System.out.println(
                        "Implementar uma função que escreva no terminal o dobro dos números naturais de 1 até um número informado.\n" +
                        "A mensagem deve estar no formato: \"O dobro de X é Y\".\n" +
                        "Ex:  (5) => O dobro de 1 é 2\n" +
                        "            O dobro de 2 é 4\n" +
                        "            O dobro de 3 é 6\n" +
                        "            O dobro de 4 é 8\n" +
                        "            O dobro de 5 é 10\n");
                Exercicio10();
                break;
            case 11:
                System.out.println(
                        "Implementar uma função que escreva no terminal a tabuada de um número informado.\n" +
                        "A mensagem deve estar no formato: \"A x B = X\".\n" +
                        "Ex:  (5) => 5 x 1 = 5\n" +
                        "            5 x 2 = 10\n" +
                        "            5 x 3 = 15\n" +
                        "            5 x 4 = 20\n" +
                        "            5 x 5 = 25\n" +
                        "            5 x 6 = 30\n" +
                        "            5 x 7 = 35\n" +
                        "            5 x 8 = 40\n" +
                        "            5 x 9 = 45\n" +
                        "            5 x 10 = 50\n");
                Exercicio11();
        }
    }
    
    public static void Exercicio6() {
        Scanner ent = new Scanner(System.in);

        try {
            System.out.println("Informe o valor a ser usado: ");
            int n = ent.nextInt();
            
            mostraEntre0eNParDecrescente(n);
        } catch (Exception ex) {
            System.out.println("Letras não são permitidas!");
        }
    }
    
    public static void mostraEntre0eNParDecrescente(int n) {
        for (int pos = n; pos >= 0; pos--) {
            if (pos%2 == 0) {
                System.out.print(pos+" ");
            }
        }
    }

    public static void Exercicio7() {
        Scanner ent = new Scanner(System.in);
        
        try {
            System.out.println("Informe o valor a ser usado: ");
            int n = ent.nextInt();
            
            mostraEntre1eNImparDecrescente(n);
        } catch (Exception ex) {
            System.out.println("Letras não são permitidas!");
        }
    }
    
    public static void mostraEntre1eNImparDecrescente(int n) {
        for (int pos = n; pos >= 1; pos--) {
            if (pos%2 == 1) {
                System.out.print(pos+" ");
            }
        }
    }

    public static void Exercicio8() {
        Scanner ent = new Scanner(System.in);
        
        try {
            System.out.println("Informe o valor de início: ");
            int nStart = ent.nextInt();
            System.out.println("Informe o valor final: ");
            int nEnd = ent.nextInt();
            
            mostraEntre2NumsDecrescente(nStart, nEnd);
        } catch (Exception ex) {
            System.out.println("Letras não são permitidas!");
        }
    }
    
    public static void mostraEntre2NumsDecrescente(int nStart, int nEnd) {
        for (int pos = nEnd; pos >= nStart; pos--) {
            System.out.print(pos+" ");
        }
    }

    public static void Exercicio9() {
        Scanner ent = new Scanner(System.in);
        
        try {
            System.out.println("Informe o divisor: ");
            int nDiv = ent.nextInt();
            System.out.println("Informe o dividendo/valor final: ");
            int nEnd = ent.nextInt();
            
            mostraMultiploNde0aN(nDiv, nEnd);
        } catch (Exception ex) {
            System.out.println("Letras não são permitidas!");
        }
    }
    
    public static void mostraMultiploNde0aN(int nDiv, int nEnd) {
        for (int pos = 0; pos <= nEnd; pos++) {
            if (pos%nDiv == 0) {
                System.out.print(pos+" ");
            }
        }
    }

    public static void Exercicio10() {
        Scanner ent = new Scanner(System.in);
        
        try {
            System.out.println("Informe o valor a ser usado: ");
            int n = ent.nextInt();
        
            mostraDobro1aN(n);
        } catch (Exception ex) {
            System.out.println("Letras não são permitidas!");
        }
    }
    
    public static void mostraDobro1aN(int n) {
        for (int pos = 1; pos <= n; pos++) {
            System.out.println("O dobro de "+pos+" é "+pos*2);
        }
    }
    
    public static void Exercicio11() {
        Scanner ent = new Scanner(System.in);
        
        try {
            System.out.println("Informe o valor a ser usado: ");
            int n = ent.nextInt();
            
            mostraTabuadaN(n);
        } catch(Exception ex) {
            System.out.println("Letras não são permitidas!");
        }
    }
    
    public static void mostraTabuadaN(int n) {
        for (int pos = 1; pos <= 10; pos++) {
            int res = n * pos;
            System.out.printf("%d x %d = %d\n", n, pos, res);
        }
    }
}