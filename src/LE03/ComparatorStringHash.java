package LE03;

import java.util.Comparator;

public class ComparatorStringHash implements Comparator<Integer>
{

    //Der vergleich zwischen HalloWelt und HALLOMeineLieben sollte Positive sein, da 524476716 - -2124471979 die
    // Hashcodes von den Strings sind. Deswegen arithmetisch wäre die Lösung a - -b => a+b
    @Override
    public int compare(Integer o1, Integer o2)
    {
        return o1.hashCode() - o2.hashCode() ;
    }
}
