public class suite extends Inmueble{
    private boolean tienejacuzzi;


    public suite(String Direccion, double Tamaño, int Numhabitaciones, double precio, boolean tienejacuzzi){
        super(Direccion, Tamaño,  Numhabitaciones, precio);
        this.tienejacuzzi = tienejacuzzi;

    }




    public boolean isTienejacuzzi() {
        return tienejacuzzi;
    }



    public void mostrarinformacion(){
       super.mostrarinformacion();
       if (tienejacuzzi==true){

           System.out.println(" El inmueble tine jacuzzi:  Si\n");
       } else{
            System.out.println(" El inmueble tine jacuzzi:  Si\n");
       }



    }


}
