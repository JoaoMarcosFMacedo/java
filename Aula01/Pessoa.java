public class Pessoa{
    int idade;
    String nome;
    String cpf;
    int dist;

    Pessoa(int idade, String nome, String cpf, int dist){

        this.idade = idade;
        this.nome = nome;
        this.cpf = cpf;
        this.dist = dist;

    }
    Pessoa(int idade, String nome, String cpf){

        idade = i;
        nome = n;
        cpf = c;
        dist = 0;
    }

    void andar(int d){
        dist = dist + d;
        System.out.printf(" A pessoa andou", dist);
        
    }

}