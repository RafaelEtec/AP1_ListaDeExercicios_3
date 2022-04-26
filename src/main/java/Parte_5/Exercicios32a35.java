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
        
        System.out.println("Informe o texto: ");
        String txt = ent.nextLine();
        
        String txtContrario = txtAoContrario(txt);
        System.out.println(txt+" => "+txtContrario);
    }
    
    public static String txtAoContrario(String txt) {
        String txtContrario = "";
        String guarda = "";
        
        for (int pos = 0; pos < txt.length(); pos++) {
            guarda = Character.toString(txt.charAt(pos));
            txtContrario = guarda + txtContrario;
        }
        
        return txtContrario;
    }
    
    public static void Exercicio33() {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Informe o texto: ");
        String txt = ent.nextLine();
        
        boolean boolPalin = palindromoOuNao(txt);
        System.out.println(txt+" => "+boolPalin);
    }
    
    public static boolean palindromoOuNao(String txt) {
        boolean boolPalin = false;
        String guarda = "";
        String guardaUlt = "";
        
        
 
        return boolPalin;
    }
    
    public static void Exercicio34() {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Informe o número: ");
        int num = ent.nextInt();
        
        String numContrario = numAoContrario(num);
        System.out.println(num+" => "+numContrario);
    }
    
    public static String numAoContrario(int num) {
        String strNum = String.valueOf(num);
        String guarda = "";
        String numContrario = "";
        
        for (int pos = 0; pos < strNum.length(); pos++) {
            guarda = Character.toString(strNum.charAt(pos));
            numContrario = guarda + numContrario;
        }
        
        return numContrario;
    }
    
    public static void Exercicio35() {
        Scanner ent = new Scanner(System.in);
        
        
    }
}