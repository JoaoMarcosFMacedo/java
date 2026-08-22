import java.util.Scanner;

public class MainPessoaEncap{

    public Scanner s = new Scanner(System.in);
    public static void main(String []args){
        Pessoa p = new Pessoa("Marcos", 21);
        Pessoa p2 = null;

        System.out.printf("\n Meu nome é { %s } \nSua idade é { %d } ", p.getNome(), p.getIdade());

        for(int i = 0 ; i < 3; i +=1){

            String n = s.nextLine();

            

        }

        


        


    }
}