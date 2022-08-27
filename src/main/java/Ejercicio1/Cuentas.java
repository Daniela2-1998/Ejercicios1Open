package Ejercicio1;

public class Cuentas {
    public static void main (String[] args){
        int primer_valor = 20;
        int segundo_valor = 40;
        int tercer_valor = 60;
        suma(primer_valor, segundo_valor, tercer_valor);

    }
    public static void suma(int primer_valor, int segundo_valor, int tercer_valor){
        int resultadoSuma;
        resultadoSuma = primer_valor + segundo_valor + tercer_valor;
        System.out.println("********************************");
        System.out.println(" El resultado de la suma es " + resultadoSuma);
        System.out.println("********************************");

    }
}
