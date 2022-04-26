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
        
        System.out.println("Informe a palavra: ");
        String palavra = ent.nextLine();
        
        String palavraAscii = stringParaAscii(palavra);
        System.out.println(palavra+" => "+palavraAscii);
    }
    
    public static String stringParaAscii(String palavra) {
        String palavraAscii = "";
        byte ascii = ' ';
        for (int pos = 0; pos < palavra.length(); pos++) {
            ascii = (byte) palavra.charAt(pos);
            palavraAscii = palavraAscii+ascii+" ";
        }
        
        return palavraAscii;
    }
    
    public static void Exercicio37() {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Informe a senha: ");
        String senha = ent.next();
        
        boolean senhaForte = boolSenhaForteOuNao(senha);
        System.out.println(senha+" => "+senhaForte);
    }
    
    public static boolean boolSenhaForteOuNao(String senha) {
        boolean senhaForte = false;
        boolean numerosOk = false, digitosOk = false, especiaisOk = false;
        int qntNumeros = 0, qntDigitos = senha.length(), qntEspeciais = 0;
        String guarda = "", especiais = "!@#$%&*()'+,-./:;<=>?[]^_`{|}", numeros = "0123456789";
        for (int pos = 0; pos < senha.length(); pos++) {
            guarda = Character.toString(senha.charAt(pos));
            
            if (especiais.contains(guarda)) {
                qntEspeciais++;
            } else if (numeros.contains(guarda)) {
                qntNumeros++;
            }
        }
        
        if (qntNumeros >= 2) {
            numerosOk = true;
        }
        
        if (qntEspeciais >= 2) {
            especiaisOk = true;
        }
        
        if (qntDigitos >= 8) {
            digitosOk = true;
        }
        
        if (digitosOk && numerosOk && especiaisOk) {
            senhaForte = true;
        }
        
        return senhaForte;
    }
    
    public static void Exercicio38() {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Informe a palavra: ");
        String palavra = ent.nextLine();
        
        String palavraBinario = stringParaBinario(palavra);
        System.out.println("\n"+palavra+" => "+palavraBinario);
    }
    
    public static String stringParaBinario(String palavra) {
        String palavraBinario = "", guarda = "";
        char guardaChar = ' ';
        for (int pos = 0; pos < palavra.length(); pos++) {
            guardaChar = palavra.charAt(pos);
            guarda = Integer.toBinaryString(guardaChar);
            palavraBinario = palavraBinario+"0"+guarda+" ";
        }
        
        return palavraBinario;
    }
    
    public static void Exercicio39() {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Informe o número: ");
        int num = ent.nextInt();
        
        boolean boolPrimo = primoOuNao(num);
        System.out.println(num+" => "+boolPrimo);
    }
    
    public static boolean primoOuNao(int num) {
        boolean boolPrimo = false;
        int mu = num/2, valida = 0;

        if (num == 0||num == 1){
            boolPrimo = false;
        } else {
            for(int pos = 2; pos <= mu; pos++){
                if(num%pos == 0){
                    valida = 1;
                    break;
                }
            }

            if (valida == 0) {
                boolPrimo = true;
            }
        }
        
        return boolPrimo;
    }
    
    public static void Exercicio40() {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Informe a posição do número Fibonacci: ");
        int posFibo = ent.nextInt();
        
        int numFibo = posicaoFibo(posFibo);
        System.out.println(posFibo+" => "+numFibo);
    }
    
    public static int posicaoFibo(int posFibo) {
        int numFibo = 0, proxNum = 1, guarda;
        
        for (int pos = 0; pos < posFibo; pos++) {
            guarda = numFibo + proxNum;
            numFibo = proxNum;
            proxNum = guarda;
        }
        
        return numFibo;
    }
    
    public static void Exercicio41() {
        Scanner ent = new Scanner(System.in);
        
        
    }
    
}