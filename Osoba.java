package sample;

public class Osoba

{


    String Imię, Nazwisko;

             int Data;

           private void checkPersonData (String Imię, String Nazwisko, int Data)

    {

        if (Imię.isEmpty() == true)

        {


            throw new IllegalArgumentException ("Nie podałeś imienia");


        }


                else if (Nazwisko.isEmpty() == true)

        {

            throw new IllegalArgumentException ("Nie podałeś nazwiska");


        }

                   else if ((Data < 1900) || (Data > 2020))

        {

                 throw new IllegalArgumentException ("Podano zły rok urodzenia");


        }

    }


    public Osoba (String Imię, String Nazwisko, int Data)

    {

        checkPersonData (Imię, Nazwisko, Data);


               this.Imię = Imię;

              this.Nazwisko = Nazwisko;


            this.Data = Data;
    }


            public String toString()

    {

            return String.format ("Imię %s  Nazwisko %s  Rok urodzenia %d ",Imię,Nazwisko,Data);

    }
}