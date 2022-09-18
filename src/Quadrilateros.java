public class Quadrilateros {

    public static void area(double lado){
        double total = lado * lado;
        System.out.println("A area do quadrado eh: " + total);
    }
    public static void area(double lado1, double lado2){
        double total = lado1 * lado2;
        System.out.println("A area do retangulo eh: " + total);
    }
    public static void area(double baseMaior, double baseMenor, double altura){
        double total = ((baseMaior + baseMenor) * altura) / 2;
        System.out.println("A area do trapezio eh: " + total);
    }
    public static void area(float diagonal1, float diagonal2){
        double total = (diagonal1 * diagonal2)/ 2;
        System.out.println("A area do losango eh: " + total);
    }
}
