import java.util.Comparator;

public class Vypis implements Comparator<Kniha> {
        public int compare(Kniha one, Kniha two) {
            String K1 = one.getNazev();
            String K2 = two.getNazev();
            return K1.compareToIgnoreCase(K2);
        }
    }
