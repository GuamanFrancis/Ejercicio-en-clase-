public class Departamento extends Inmueble{
    private  int numpisos;

    public  Departamento(String Direccion, double Tamaño, int Numhabitaciones, double precio,int numpisos){
        super(Direccion, Tamaño,  Numhabitaciones, precio);
        this.numpisos = numpisos;


    }

    public int getNumpisos() {
        return numpisos;
    }
    @Override

    public  void mostrarinformacion(){
        super.mostrarinformacion();
        System.out.println("El numero de pisos es de : "+numpisos+"\n");


    }
}
