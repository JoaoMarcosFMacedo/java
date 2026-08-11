
public class Main{
    public static void main(String [] args ){

        Circulo c = new Circulo(5);
        Circulo c2 = new Circulo(10);

        c.area();
        System.out.printf("Comprimento %d", c.comprimento());
        
        c2.area();
        System.out.printf("Comprimento %d", c2.comprimento());
    }
}