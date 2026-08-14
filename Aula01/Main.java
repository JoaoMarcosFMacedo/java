
public class Main{
    public static void main(String [] args){


        Pessoa p = new Pessoa(89, "arlos" ," 702-434-433-11", 999);
        Pessoa p2 = new Pessoa(50, "pessoa" , "8723-6-323-311");

        System.out.printf("\nNome: %s, \nidade: %d \nCPF { %s } \n km andado %d",p.nome, p.idade, p.cpf, p.dist);

        System.out.printf("\n==========================================================================");

        System.out.printf("\nNome: %s, \nidade: %d \nCPF { %s } \n km andado %d",p2.nome, p2.idade, p2.cpf, p2.dist);


    }
}