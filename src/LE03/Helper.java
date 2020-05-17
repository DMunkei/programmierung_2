package LE03;

public class Helper
{

    public static <T> T stringLaenge(T word1, T word2)
    {
        return word1.toString().length() - word2.toString().length() > 0 ? word1 : word2;
    }

    public static <T> T reflect(T dataType)
    {
        return dataType;
    }
    public static <T> T printType(T dataType)
    {
        return (T) ("This is a " + dataType);
    }
}
