enum Status {
    W_TRAKCIE,
    ZROBIONE,
    DO_ZROBIENIA
}

public class Zadanie {

    private static int id;//1
    private static Status status;//ZROBIONE
    private static String tresc = "";//1234


    Zadanie(int new_id ,String new_tresc){
        id = new_id + 1;
        status = Status.DO_ZROBIENIA;
        tresc = new_tresc;
    }

    static void changeStatus(String newStatus){
        switch (newStatus){
            case "inprogress":
                status = Status.W_TRAKCIE;
                return;
            case "todo":
                status = Status.DO_ZROBIENIA;
                return;
            case "done":
                status = Status.ZROBIONE;
                return;
            default:
                System.out.println("error");
                return;
        }
    }

    static String getName(){
        return tresc;
    }

    static int getId(){
        return id;
    }

    static void changeTresc(String x){
        if(x.isEmpty()){
            return;
        }

        if(x.length() >= 10){
            System.out.println("Nie dluzsze niz 10");
            return;
        }

        tresc = x;
    }
}
