public class Inmueble {
    private String Direccion;
    private double Tamaño;
    private int Numhabitaciones;
    private double precio;

    public Inmueble(String Direccion, double Tamaño, int Numhabitaciones, double precio){
        this.Direccion = Direccion;
        this.Tamaño = Tamaño;
        this.Numhabitaciones = Numhabitaciones;
        this.precio = precio;


    }

    public String getDireccion() {
        return Direccion;
    }

    public double getTamaño() {
        return Tamaño;
    }

    public int getNumhabitaciones() {
        return Numhabitaciones;
    }

    public double getPrecio() {
        return precio;
    }


    public void mostrarinformacion(){
        System.out.println(" ------------------------------");
        System.out.println("           Informacion      \n" );
        System.out.println("Direccion:"+Direccion+"\n ");
        System.out.println("Tamaño: "+Tamaño+"\n");
        System.out.println("Numero de habitaciones: "+Numhabitaciones+"\n");
        System.out.println("Precio: "+precio+"\n");



    }
}

