
import java.util.Scanner; // import the Scanner class
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) {
        //Scanner OB = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        Zadanie zad = new Zadanie(lista.size(),"Kupić mleko" );

        int number = 1;

        System.out.println("Co masz dzisiaj do zrobienia: ");
        System.out.println(Zadanie.getName());

        Zadanie.changeTresc("2342424234123412341");
        System.out.println(Zadanie.getName());
        System.out.println(Zadanie.getId());

        ;/

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