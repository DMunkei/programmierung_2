package LE02;

import java.util.Comparator;
import java.util.List;

public class ComparatorStringHash implements Comparator<List<String>>
{

    //Der vergleich zwischen HalloWelt und HALLOMeineLieben sollte Positive sein, da 524476716 - -2124471979 die
    // Hashcodes von den Strings sind. Deswegen arithmetisch wäre die Lösung a - -b => a+b
    @Override
    public int compare(List<String> o1, List<String> o2)
    {
        return o1.hashCode() - o2.hashCode() ;
    }
}
