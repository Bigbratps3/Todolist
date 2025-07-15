enum Status {
    IN_PROGRESS,
    DONE,
    TODO
}

public class Zadanie {

    private static int id;//1
    private static Status status;//Mleko
    private static String tresc = "";//1234


    Zadanie(int newid ,String newtresc){
        id = newid + 1;
        status = Status.TODO;
        tresc = newtresc;
    }

    static void changeStatus(String newStatus){
        switch (newStatus){
            case "inprogress":
                status = Status.IN_PROGRESS;
                return;
            case "todo":
                status = Status.TODO;
                return;
            case "done":
                status = Status.DONE;
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

    //Scanner OB = new Scanner(System.in);
    //String trescZ = OB.nextLine();
}
