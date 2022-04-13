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

        try {
            System.out.println("Informe a quantidade de pontos(*) a serem exibidos: ");
            int nPontos = ent.nextInt();
            
            mostraPontosN(nPontos);
        } catch (Exception ex) {
            System.out.println("Letras não são permitidas!");
        }
    }
    
    public static void mostraPontosN(int nPontos) {
        for (int pos = 1; pos <= nPontos; pos++) {
            System.out.print("* ");
        }
    }
    
    public static void Exercicio13() {
        Scanner ent = new Scanner(System.in);

        try {
            System.out.println("Informe a quantidade de linhas a serem exibidas: ");
            int nLin = ent.nextInt();
            
            mostraQuadradoNLinhas(nLin);
        } catch (Exception ex) {
            System.out.println("Letras não são permitidas!");
        }
    }
    
    public static void mostraQuadradoNLinhas(int nLin) {
        for (int pos = 1; pos <= nLin; pos++) {
            for (int posCol = 1; posCol <= nLin; posCol++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    public static void Exercicio14() {
        Scanner ent = new Scanner(System.in);

        try {
            System.out.println("Informe a quantidade de linhas a serem exibidas: ");
            int nLin = ent.nextInt();
            System.out.println("Informe a quantidade de colunas a serem exibidas: ");
            int nCol = ent.nextInt();
            
            mostraRetanguloLinhasColunas(nLin, nCol);
        } catch (Exception ex) {
            System.out.println("Letras não são permitidas!");
        }
    }
    
    public static void mostraRetanguloLinhasColunas(int nLin, int nCol) {
        for (int pos = 1; pos <= nLin; pos++) {
            for (int posCol = 1; posCol <= nCol; posCol++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    public static void Exercicio15() {
        Scanner ent = new Scanner(System.in);
        
        try {
            System.out.println("Informe a quantidade de linhas a serem exibidas: ");
            int nLin = ent.nextInt();
            
            mostraTrianguloNLinhas(nLin);
        } catch (Exception ex) {
            System.out.println("Letras não são permitidas!");
        }
    }
    
    public static void mostraTrianguloNLinhas(int nLin) {
        for (int pos = nLin; pos >= 0; pos--) {
            for (int i = pos; i < nLin; i++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
    public static void Exercicio16() {
        Scanner ent = new Scanner(System.in);
        
        try {
            System.out.println("Informe a quantidade de linhas a serem exibidas: ");
            int nLin = ent.nextInt();
            
            mostraTrianguloInvertidoNLinhas(nLin);
        } catch (Exception ex) {
            System.out.println("Letras não são permitidas!");
        }
    }
    
    public static void mostraTrianguloInvertidoNLinhas(int nLin) {
        // A fazer
    }
}

/**
    public static void mostraTrianguloNLinhas(int nLin) {
        for (int pos = 0; pos <= nLin; pos++) {
            for (int i = pos; i < nLin; i++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
**/