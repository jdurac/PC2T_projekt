import java.util.Comparator;
import java.util.Scanner;

public class Vyjimky {

    public static int pouzeCelaCisla(Scanner sc) 
	{
		int cislo = 0;
		try
		{
			cislo = sc.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Nastala vyjimka typu "+e.toString());
			System.out.println("zadejte prosim cele cislo ");
			sc.nextLine();
			cislo = pouzeCelaCisla(sc);
		}
		return cislo;
	}

    public static void smaz(Kniha Kniha){
        if (Kniha instanceof Roman){
            Roman.roman--;
            System.out.println("Kniha byla odstranena");
        }else if (Kniha instanceof Ucebnice){
            Ucebnice.ucebnice--;
            System.out.println("Kniha byla odstranena");
        }
    }
    
}
