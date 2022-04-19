package Parte_5;
import java.util.Scanner;
/** 
   por Rafael Ferreira Goulart
**/
public class Exercicios27a31 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        System.out.println(
                  "Qual atividade você deseja avaliar?\n"
                + "Insira o número da atividade de 27 a 31");
        int escolha = 0;
        try {
            escolha = ent.nextInt();
            while (escolha < 27 || escolha > 31) {
                System.out.println("É possível escolher apenas entre 27 e 31");
                escolha = ent.nextInt();
            }
        } catch (Exception ex){
            System.out.println("Letras não são permitidas!");
        }
        switch (escolha) {
            case 27:
                System.out.println(
                        "Implementar uma função que separe os caracteres de um texto por hífen.\n" +
                        "Ex: (\"Bora programar\") => \"B-o-r-a- -p-r-o-g-r-a-m-a-r-\n");
                Exercicio27();
                break;
            case 28:
                System.out.println(
                        "Implementar uma função que verifique quantas vogais aparecem em um texto.\n" +
                        "Ex: (\"Bora programar\") => 5\n");
                Exercicio28();
                break;
            case 29:
                System.out.println(
                        "Implementar uma função que verifique se todas as vogais aparecem em um texto.\n" +
                        "Ex: (\"Eu avisei você\") => true\n");
                Exercicio29();
                break;
            case 30:
                System.out.println(
                        "Implementar uma função que conte a frequência de um caractere em um texto.\n" +
                        "Ex: (\"Bora programar\", \"a\") => 3\n");
                Exercicio30();
                break;
            case 31:
                System.out.println(
                        "Implementar uma função que conte a frequência de um digito em um número.\n" +
                        "Ex: (99938, 9) => 3\n");
                Exercicio31();
                break;
        }
    }
    
    public static void Exercicio27() {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Informe o texto: ");
        String txt = ent.next();
        
        separarTexto(txt);
    }
    
    public static void separarTexto(String txt) {
        for (int pos = 0; pos < txt.length(); pos++) {
            if (pos == txt.length()) {
                System.out.print(txt.charAt(pos));
            } else {
                System.out.print(txt.charAt(pos)+"-");
            }
        }
    }
    
    public static void Exercicio28() {
        Scanner ent = new Scanner(System.in);
        
        
    }
    
    public static void Exercicio29() {
        Scanner ent = new Scanner(System.in);
        
        
    }
    
    public static void Exercicio30() {
        Scanner ent = new Scanner(System.in);
        
        
    }
    
    public static void Exercicio31() {
        Scanner ent = new Scanner(System.in);
        
        
    }   
}