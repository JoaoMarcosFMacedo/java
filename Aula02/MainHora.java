package Aula02;

public class MainHora {
    public static void main(String[] args) {
        Hora hora = new Hora(12,60,60);
        Datas data = new Datas(9, 12, 2006 ,hora);

        System.out.println(data.dia);
        System.out.println(data.hora.min);
        // System.out.println(data); não pode fazer isso!!!


    }
}
