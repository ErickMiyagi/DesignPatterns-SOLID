package Singleton;

public class TestAgenda {
    public static void main(String[] args) {
        reservarDia("Segunda");
        reservarDia("Terça");

    }
    public static void reservarDia(String dia){
        Agenda agenda = Agenda.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }
    public static void reservarDiaLazy(String dia){
        AgendaLazy agenda = AgendaLazy.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }
    public static void reservarDiaEnum(String dia){
        AgendaEnum agenda = AgendaEnum.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }
}
