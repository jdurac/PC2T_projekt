import java.util.ArrayList;

public abstract class Kniha {

    public Kniha(String nazev, String autor, int rok, boolean dost)
    {
        this.nazev=nazev;
        this.autor=autor;
        this.rok=rok;
        this.dost=dost;
    }

    public String getNazev()
    {
        return nazev;
    }

    public String getAutor()
    {
        return autor;
    }

    public int getRok()
    {
        return rok;
        
    }

    public int getID() {
		return this.ID;
	}

    public boolean getDost(){
        return true;
    }

    public boolean setDost(){
        return dost;
    }

    private String nazev;
    private String autor;
    private int rok;
    private boolean dost = true;
    protected int ID = 1;
    public static int newID = 1;
    protected abstract ArrayList<Integer> getList();
    static ArrayList<Integer> allMarks = new ArrayList<Integer>();

}
