package Ejercicio2;

public class Auto {
    public static void main(String[] args){
        Coche miCoche = new Coche();
        miCoche.agregarPuertas();
        System.out.println("El coche tiene " + miCoche.puertas + " puertas");
    }
    public static class Coche{
        public int puertas = 0;

        public void agregarPuertas(){
            this.puertas++;
        }
    }
}
