import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero1, numero2;
        Scanner leitura = new Scanner(System.in);
        System.out.println("Informe o primeiro parametro: ");
        numero1 = leitura.nextInt();
        System.out.println("informe o segunodo parametro ");
        numero2 = leitura.nextInt();

        try{
            //chamando o método contendo a lógica de contagem
            contar(numero1,numero2);
        }
        catch (ParametrosInvalidosException exception){
            System.out.println(exception.getMessage());
        }
    }
    static void contar(int numero1, int numero2) throws ParametrosInvalidosException{
        if (numero1 > numero2){
            throw  new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
        }
        int contagem = numero2 - numero1;

        for(int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo numero " + i);
        }


    }
}