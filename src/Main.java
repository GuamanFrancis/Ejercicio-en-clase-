
public class Main {


    public static void main(String[] args) {

        Inmueble cliente1 = new Inmueble("Ecuador",150.0,3,150.0);
        Departamento cliente2 = new Departamento("Quito ", 120,4,240.0, 8);
        Casaindividual cliente3 = new Casaindividual( "Guayaquil",300,5,420.0,120.3);
        suite cliente4 =new suite("Calderon",200,5,300.0,true);




        cliente1.mostrarinformacion();
        cliente2.mostrarinformacion();
        cliente3.mostrarinformacion();
        cliente4.mostrarinformacion();




    }
}