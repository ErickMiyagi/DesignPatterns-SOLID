package Singleton;

public class TestAgenda {
    public static void main(String[] args) {
        reservarDia("Segunda");
        
    }
    public static void reservarDia(String dia){
        Agenda agenda = new Agenda();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }
}
