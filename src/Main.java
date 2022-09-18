import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // VARAVEL DO METODO: QUADRADO
        double lado;

        System.out.println("QUADRILATEROS");
        System.out.println("===================");
        System.out.println("QUADRADO");
        System.out.println("-------------------");
        System.out.println("Digite o valor do lado do quadrado:");
        lado = sc.nextDouble();
        Quadrilateros.area(lado);
        System.out.println("===================");

        // VARAVEIS DO METODO: RETANGULO
        double lado1, lado2;

        System.out.println("RETANGULO");
        System.out.println("-------------------");
        System.out.println("Digite o valor do lado 1 do retangulo:");
        lado1 = sc.nextDouble();
        System.out.println("Digite o valor do lado 2 do retangulo:");
        lado2 = sc.nextDouble();
        Quadrilateros.area(lado1,lado2);
        System.out.println("===================");

        // VARAVEIS DO METODO: TRAPEZIO
        double baseMaior, baseMenor, altura;

        System.out.println("TRAPEZIO");
        System.out.println("-------------------");
        System.out.println("Digite o valor da base maior do trapezio:");
        baseMaior = sc.nextDouble();
        System.out.println("Digite o valor da base menor do trapezio:");
        baseMenor = sc.nextDouble();
        System.out.println("Digite o valor da altura do trapezio:");
        altura = sc.nextDouble();
        Quadrilateros.area(baseMaior,baseMenor,altura);
        System.out.println("===================");

        // VARAVEIS DO METODO: LOSANGO
        float diagonal1, diagonal2;

        System.out.println("LOSANGO");
        System.out.println("-------------------");
        System.out.println("Digite o valor da diagonal 1 do losango:");
        diagonal1 = sc.nextFloat();
        System.out.println("Digite o valor da diagonal 2 do losango:");
        diagonal2 = sc.nextFloat();
        Quadrilateros.area(diagonal1,diagonal2);
    }
}