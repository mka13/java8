package cwiczenia;

public class Lambdas {
    public static void main(String[] args) {
//MathOperation addition = ( double a, double b)->{
//    return a+b;};
        MathOperation addition = (  a,  b)-> a+b;
        MathOperation odejmowanie =(a,b)-> a-b;
        MathOperation mnozenie = (a,b)->a*b;
        MathOperation dzielenie = (a,b)->a/b;
        double additionResult = executeOperation(3, 15, addition);
        System.out.println("Wynik operacji dodawanie: "+ additionResult);
        double odejmowanieResult = executeOperation(3, 15, odejmowanie);
        System.out.println("Wynik operacji odejmowanie: "+ odejmowanieResult);
        double mnozenieResult = executeOperation(3, 15, mnozenie);
        System.out.println("Wynik operacji mnozenie: "+ mnozenieResult);

        double dzielenieResult = executeOperation(3, 15, dzielenie);
        System.out.println("Wynik operacji dzielenie: "+ dzielenieResult);

    }
static double executeOperation(double a, double b, MathOperation operation){
        double result= operation.operate(a,b);
        return result;
}



}

