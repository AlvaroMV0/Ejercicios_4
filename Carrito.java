package ar.edu.utn;

public class Carrito {
    public int precio(Producto producto,Producto producto2,Producto producto3){

        int sum = producto.precioP + producto2.precioP + producto3.precioP;

        return sum;
    }
}
