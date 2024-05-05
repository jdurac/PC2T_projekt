import java.util.ArrayList;

public class Roman extends Kniha {
    
    static ArrayList<Integer> Roman = new ArrayList<Integer>();
    static int roman;
    private String zanr;

    public Roman(int id, String nazev, String autor, int rok, boolean dost, String zanr){
        super(nazev, autor, rok, dost);
        this.zanr=zanr;
        roman++;
        
    }

    public String getZanr()
    {
        return zanr;
    }
    @Override
    protected ArrayList<Integer> getList() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getList'");
    }
   

}
