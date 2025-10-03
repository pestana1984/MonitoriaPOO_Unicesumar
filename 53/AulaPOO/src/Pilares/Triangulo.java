package Pilares;

public class Triangulo extends FormaGeometrica{

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public void mostraForma(){
        System.out.printf("Isso é um triangulo");
    }
}
