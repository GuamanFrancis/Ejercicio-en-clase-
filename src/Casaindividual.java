public class Casaindividual extends Inmueble{
    private double tamañoterreno;

    public Casaindividual(String Direccion, double Tamaño, int Numhabitaciones, double precio,double tamañoterreno){
        super(Direccion, Tamaño,  Numhabitaciones, precio);
        this.tamañoterreno = tamañoterreno;


    }

    public double getTamañoterreno() {
        return tamañoterreno;
    }

    @Override
    public  void mostrarinformacion(){
        super.mostrarinformacion();
        System.out.println(" EL tamaño del terreno es de : "+tamañoterreno+"\n");


    }
}
