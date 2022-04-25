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
    
    // A Revisar ---------------------------------------------------------------
    public static void Exercicio27() {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Informe o Texto: ");
        String txt = ent.next();
        
        char posChar[] = separarTexto(txt);
        for (int pos = 0; pos < posChar.length; pos++) {
            System.out.print(posChar[pos]+"-");
        }
    }
    
    public static char[] separarTexto(String txt) {
        char[] txtSeparado = new char[txt.length()];
        
        for (int pos = 0; pos < txt.length(); pos++) {
            txtSeparado[pos] = txt.charAt(pos);
        }
        
        return txtSeparado;
    }
    
    // A Revisar ---------------------------------------------------------------
    public static void Exercicio28() {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Informe o Texto: ");
        String txt = ent.next();
        
        int intQntVogais = qntVogaisTexto(txt);
        System.out.println("Este texto possui: "+intQntVogais+" vogais.");
    }
    
    public static int qntVogaisTexto(String txt) {
        int intQntVogais = 0;
        String guarda = "";
        
        for (int pos = 0; pos < txt.length(); pos++) {
            guarda = Character.toString(txt.charAt(pos));
            
            if (guarda.toLowerCase().equals("a")
             || guarda.toLowerCase().equals("e")
             || guarda.toLowerCase().equals("i")
             || guarda.toLowerCase().equals("o")
             || guarda.toLowerCase().equals("u")) {
                intQntVogais++;
            }
        }
        
        return intQntVogais;
    }
    
    // A Revisar ---------------------------------------------------------------
    public static void Exercicio29() {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Informe o Texto: ");
        String txt = ent.next();
        
        boolean possuiTodasVogais = possuiTodasVogais(txt);
        System.out.println("Possui todas as vogais?: "+possuiTodasVogais);
    }
    
    public static boolean possuiTodasVogais(String txt) {
        boolean possuiTodasVogais = false;
        boolean a = false, e = false, i = false, o = false, u = false;
        String guarda = "";
        
        for (int pos = 0; pos < txt.length(); pos++) {
            guarda = Character.toString(txt.charAt(pos));
            
            switch (guarda.toLowerCase()) {
                case "a":
                    a = true;
                    break;
                case "e":
                    e = true;
                    break;
                case "i":
                    i = true;
                    break;
                case "o":
                    o = true;
                    break;
                case "u":
                    u = true;
                    break;
            }
        }
        
        if (a == true
         && e == true
         && i == true
         && o == true
         && u == true) {
            possuiTodasVogais = true;
        }
        
        return possuiTodasVogais;
    }
    
    public static void Exercicio30() {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Informe o texto: ");
        String txt = ent.next();
        System.out.println("Informe a letra para calcular a frequência: ");
        String letra = ent.next();
        
        int freq = frequenciaLetraTXT(txt, letra);
        System.out.println("Aparece "+freq+" vezes");
    }
    
    public static int frequenciaLetraTXT(String txt, String letra) {
        int freq = 0;
        String guarda = "";
        
        for (int pos = 0; pos < txt.length(); pos++) {
            guarda = Character.toString(txt.charAt(pos));
            
            if (guarda.toLowerCase().equals(letra)) {
                freq++;
            }
        }
        
        return freq;
    }
    
    public static void Exercicio31() {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Informe o Número: ");
        int numTodo = ent.nextInt();
        System.out.println("Informe o número para calcular a frequência: ");
        int num = ent.nextInt();
        
        int freq = frequenciaNumTodo(numTodo, num);
        System.out.println("Aparece "+freq+" vezes");
    }
    
    public static int frequenciaNumTodo(int numTodo, int num) {
        int freq = 0;
        String strNumTodo = String.valueOf(numTodo);
        String strNum = String.valueOf(num);
        String guarda = "";
        
        for (int pos = 0; pos < strNumTodo.length(); pos++) {
            guarda = Character.toString(strNumTodo.charAt(pos));
            
            if (guarda.equals(strNum)) {
                freq++;
            }
        }
        
        return freq;
    }   
}