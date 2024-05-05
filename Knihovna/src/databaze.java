import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

public class databaze {
    static Scanner sc = new Scanner(System.in);
	static ArrayList<Kniha> sortedList = null;
	static TreeMap<Integer, Kniha> databaze = new TreeMap<Integer, Kniha>();
	static String nazev = null;
	static String autor = null;
	static int rok;
    static boolean dost;
    static int typ;
    static int rocnik;
    static String zanr;
	static int volba;
	static int ID = 1;
	static int newID = 1;
	static boolean run = true;
    static Kniha temp = null;
    



    public static void main(String[] args){
  
		while(run)
		{
			System.out.println("Vyberte pozadovanou cinnost:");
			System.out.println("1 .. Pridani nove knihy");
			System.out.println("2 .. Uprava knihy");
			System.out.println("3 .. Smazani knihy");
			System.out.println("4 .. Dostupnost knihy");
			System.out.println("5 .. Vyhledat knihu");
            System.out.println("6 .. Vypis knih");
            System.out.println("7 .. Vypis knih od autora");
			volba=Vyjimky.pouzeCelaCisla(sc);
			switch(volba)
			{
                case 1:
                    System.out.println("Jaky typ knihy chcete zadat?");
                    System.out.println("1 - Roman");
                    System.out.println("2 - Ucebnice");
                    typ = Vyjimky.pouzeCelaCisla(sc);
                    if(typ == 1){
                        System.out.println("Zadejte nazev knihy:");
                        nazev = sc.next();
                        System.out.println("Zadejte autora knihy:");
                        autor = sc.next();
                        System.out.println("Zadejte rok vydání:");
                        rok = Vyjimky.pouzeCelaCisla(sc);
                        System.out.println("Uvedte zanr romanu: ");
                        zanr = sc.next();
                        databaze.put(newID++, new Roman(ID, nazev, autor, rok, dost, zanr));
                        System.out.println("Knize byl pridam index: " + newID);
                    }else if (typ == 2){
                        nazev = sc.next();
                        System.out.println("Zadejte autora knihy:");
                        autor = sc.next();
                        System.out.println("Zadejte rok vydání:");
                        rok = Vyjimky.pouzeCelaCisla(sc);
                        System.out.println("Pro jaky rocnik je ucebnice vhodna:");
                        rocnik = Vyjimky.pouzeCelaCisla(sc);
                        databaze.put(newID++, new Ucebnice(ID, nazev, autor, rok, dost, rocnik));
                        System.out.println("Knize byl pridam index: " + newID);
                    }else System.out.println("spatne zadane cislo");
                    break;

                case 2:
                case 3:
                    System.out.println("zadej ID knihy, kterou chces odsranit:");
                    ID = Vyjimky.pouzeCelaCisla(sc);
                    Vyjimky.smaz(databaze.get(ID));
                    break;
                case 4:
                    System.out.println("Zadej ID knihy");
                    ID= Vyjimky.pouzeCelaCisla(sc);
                    try {
                        temp = databaze.get(ID);
                        System.out.println("Nazev: " + temp.getNazev() + " Autor: " + temp.getAutor() + ", rok vydani: " + temp.getRok());
                        
                    } catch (NullPointerException e) {
                        System.out.println("Kniha neexistuje");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }break;
                case 5:
                    sortedList = new ArrayList<Kniha>(databaze.values());
                    //Collection.sort(sortedList, new Vypis());+
                    for(Kniha Kniha : sortedList)
                        System.out.println("ID: " + Kniha.getID() + " nazev: " + Kniha.getNazev() + " autor: " + Kniha.getAutor() + ", rok: " + Kniha.getRok() + " dostupnost: " + Kniha.getDost());
            }    
        }
    }

}