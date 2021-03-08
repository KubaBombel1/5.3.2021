package sample;
import java.util.Scanner;

public class Main

{

            public static void main(String[] args)


    {
              while (true)

        {

                     Scanner scan = new Scanner(System.in);


                      System.out.println("Wpisz swoje imię");


                 String Imię = scan.nextLine();


                     System.out.println("Wpisz swoje nazwisko");


            String Nazwisko = scan.nextLine();


                      System.out.println("Wpisz swój rok urodzenia");


                   int Data = scan.nextInt();


            try

            {
                      Osoba o = new Osoba (Imię, Nazwisko, Data);


                System.out.println(o);

                   break;
            }

                       catch (IllegalArgumentException e)

            {

                System.out.println(e.getMessage());
            }
        }
    }
}