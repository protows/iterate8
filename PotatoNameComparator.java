package lesson_7.iterate6;
import java.util.Comparator;
public class PotatoNameComparator implements Comparator<Potato> {
    @Override
    public int compare(Potato potato1, Potato potato2){
        //return String.CASE_INSENSITIVE_ORDER.compare(potato1.weight, potato2.weight);
        return Integer.compare(potato1.weight, potato2.weight);
    }
}
