import java.util.ArrayList;

public class Ucebnice extends Kniha{
    static ArrayList<Integer> Ucebnice = new ArrayList<Integer>();
    static int ucebnice;
    private int rocnik;

    public Ucebnice(int id, String nazev, String autor, int rok, boolean dost, int rocnik){
        super(nazev, autor, rok, dost);
        this.rocnik=rocnik;
        ucebnice++;
    }

    public int getRocnik()
    {
        return rocnik;
    }
    @Override
    protected ArrayList<Integer> getList() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getList'");
    }
}
