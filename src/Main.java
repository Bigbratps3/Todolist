
import java.util.Objects;
import java.util.Scanner; // import the Scanner class
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) {
        Scanner OB = new Scanner(System.in);
        ArrayList<Zadanie> lista = new ArrayList<>();

        String komenda = "";
        do {
            komenda = OB.nextLine();
            String trescZ = "";

            if (komenda.equals("exit")) {
                trescZ = OB.nextLine();
                Zadanie zad = new Zadanie(lista.size(), trescZ);
                System.out.println("Co masz dzisiaj do zrobienia: ");
                return;
            }
            if (komenda.equals("dodaj")){
                while (true) {
                    Zadanie zad = new Zadanie(lista.size(), trescZ);
                    if (komenda.equals("dodaj")) {

                        System.out.println("Co masz dzisiaj do zrobienia?");
                        trescZ = OB.nextLine();
                        lista.add(zad);
                        if(trescZ.equals("koniec")){
                            zad.drukujliste();
                            break;
                        }
                    }
                    else{
                        return;
                    }
                }// koniec dodaj loop
            }
            //TODO trzeba jeszcze pokazywanie wszystkich zadaniań np komenda = pokaż
            //TODO no i możliwośc przestania dodawania w sensie powinieneś móc dodać tyle ile chcesz

        }//do
        while (!komenda.equals("koniec"));

//        System.out.println(Zadanie.getName());
//        Zadanie.changeTresc("2342424234123412341");//pokazuje jak działa changeTresc
//        System.out.println(Zadanie.getName());
//        System.out.println(Zadanie.getId());



        /*
        while(true){
            String trescZ = OB.nextLine();

            if (!trescZ.isEmpty()){
                lista.add(trescZ);
                System.out.println(number +". " + trescZ);
                number++;

                if(lista.size() == 6){
                    System.out.println("Kiedy skończyć robić te "+ lista.size() + " rzeczy wróć i dodaj kolejne");
                    break;
                }
            }
            else if(lista.isEmpty()){
                System.out.println("Dzisiaj leniuchujemy");
                break;
            }


            else{
                System.out.println("Okej, jak na coś wpadniesz to wróć i dodaj narazie idź zrób " + lista.size());
                break;
            }
        }//koniec pętli

        System.out.println("Oto twoje zadania na dziś: ");
        System.out.println(lista);
    */
    }

}