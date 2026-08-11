public class Circulo{
    double raio;

    Circulo(double r){
        raio = r;
    }
    void area(){

            System.out.println(3.14 * (raio * raio) );
        
    }
    double comprimento(){
        return 2 * raio;
    }
}