package ar.edu.utn;

public class Main {
    public static void main(String[] args){

        Persona persona1 = new Persona("Alvaro", 20);
        Carrito carrito1 = new Carrito();
        Producto p1 = new Producto("Cepita 1L", 80);
        Producto p2 = new Producto("Pan",30);
        Producto p3 = new Producto("Pechuga x1kg",100);

        System.out.println(carrito1.precio(p1,p2,p3));


    }
}

