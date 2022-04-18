package Parte_3;
import java.util.Scanner;
/** 
   por Rafael Ferreira Goulart
**/
public class Exercicios17a21 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        System.out.println(
                  "Qual atividade você deseja avaliar?\n"
                + "Insira o número da atividade de 17 a 21");
        int escolha = 0;
        try {
            escolha = ent.nextInt();
            while (escolha < 17 || escolha > 21) {
                System.out.println("É possível escolher apenas entre 17 e 21");
                escolha = ent.nextInt();
            }
        } catch (Exception ex){
            System.out.println("Letras não são permitidas!");
        }
        switch (escolha) {
            case 17:
                System.out.println(
                        "Implementar uma função que calcule a soma dos números naturais de 1 até um número informado.\n" +
                        "Ex: Somar de 1 até 5 => 1+2+3+4+5 => 15\n");
                Exercicio17();
                break;
            case 18:
                System.out.println(
                        "Implementar uma função que calcule a soma dos números pares naturais de 1 até um número informado.\n" +
                        "Ex: Somar pares de 1 até 5 => 2+4 => 6\n");
                Exercicio18();
                break;
            case 19:
                System.out.println(
                        "Implementar uma função que calcule a soma dos números ímpares naturais de 1 até um número informado.\n" +
                        "Ex: Somar ímpares de 1 até 5 => 1+3+5 => 9\n");
                Exercicio19();
                break;
            case 20:
                System.out.println(
                        "Implementar uma função que calcule o fatorial de um número informado.\n" +
                        "Ex: Fatorial de 5 => 5*4*3*2*1 => 120\n");
                Exercicio20();
                break;
            case 21:
                System.out.println(
                        "Implementar uma função que calcule a potenciação a partir de um número e do expoente. Obs: Essa versão da potenciação deve se preocupar apenas com números naturais, ou seja, inteiros positivos. Se a potência for zero, retorne 1. Se algum parâmetro for negativo, lançar um erro.\n" +
                        "Ex: Potência de 3 elevado a 3 => 27\n");
                Exercicio21();
                break;
        }
    }
    
    public static void Exercicio17() {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Informe o valor a ser usado: ");
        int val = ent.nextInt();
        
        System.out.println(somaAteN(val));
    }
    
    public static int somaAteN(int val) {
        int res = 0;
        for (int pos = 1; pos <= val; pos++) {
            res = res + pos;
        }
        
        return res;
    }
    
    public static void Exercicio18() {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Informe o valor a ser usado: ");
        int val = ent.nextInt();
        
        System.out.println(somaAteNPar(val));
    }
    
    public static int somaAteNPar(int val) {
        int res = 0;
        for (int pos = 1; pos <= val; pos++) {
            if (pos%2 == 0) {
                res = res + pos;
            }           
        }
        
        return res;
    }
    
    public static void Exercicio19() {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Informe o valor a ser usado: ");
        int val = ent.nextInt();
        
        System.out.println(somaAteNImpar(val));
    }
    
    public static int somaAteNImpar(int val) {
        int res = 0;
        for (int pos = 1; pos <= val; pos++) {
            if (pos%2 == 1) {
                res = res + pos;
            }           
        }
        
        return res;
    }
    
    public static void Exercicio20() {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Informe o valor a ser usado: ");
        int val = ent.nextInt();
        
        System.out.println(fatorial(val));
    }
    
    public static int fatorial(int val) {
        int res = 1;
        for (int pos = val; pos > 0; pos--) {
            res = res * pos;
        }
        
        return res;
    }
    
    public static void Exercicio21() {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Informe o valor da Base: ");
        int base = ent.nextInt();
        while (base < 0) {
            System.out.println("Não é possível inserir valores negativos! \n Insira novamente: ");
            base = ent.nextInt();
        }
        System.out.println("Informe o valor do Expoente: ");
        int expo = ent.nextInt();
        while (expo < 0) {
            System.out.println("Não é possível inserir valores negativos! \nInsira novamente: ");
            expo = ent.nextInt();
        }
        
        System.out.println(potenciacao(base, expo));
    }
    
    public static int potenciacao(int base, int expo) {
        int res = 1;
        
        if (base == 0 && expo == 0) {
            res = 1;
        } else if (base == 0 && expo >= 1) {
            res = 0;
        } else {
            for (int i = 1; i <= expo; i++) {
                res = res * base;
            }
        }
        
        return res;
    }
}
