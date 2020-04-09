package LE02;

public class GroupOfFourGeneric<T> implements GroupIF<T>
{
    private int size = 0;
    protected T ersterPlatz;
    protected T zweiterPlatz;
    private T dritterPlatz;
    private T vierterPlatz;


    public GroupOfFourGeneric()
    {
        ersterPlatz = null;
        zweiterPlatz = null;
        dritterPlatz = null;
        vierterPlatz = null;
    }

    /***
     * Takes the first 4 meals and saves them into the class
     * @param meals
     */
    public GroupOfFourGeneric(T[] meals)
    {
        try
        {
            ersterPlatz = meals[0];
            zweiterPlatz= meals[1];
            dritterPlatz= meals[2];
            vierterPlatz= meals[3];
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public int size()
    {
        return this.size;
    }

    /***
     * True when size > 0
     * @return True
     */
    @Override
    public boolean isEmpty()
    {
        return size > 0;
    }

    /***
     * Appends a meal to next available empty place
     */
    @Override
    public void appendLast(T g) throws TableSpaceOutOfBoundsException
    {
        //Directly breaks out of the function since the last place isn't empty
        if(size > 3 ) throw new TableSpaceOutOfBoundsException();

        if (ersterPlatz == null)
        {
            ersterPlatz = g;
            size++;
        } else if (zweiterPlatz  == null)
        {
            zweiterPlatz = g;
            size++;
        } else if (dritterPlatz == null)
        {
            dritterPlatz = g;
            size++;
        } else if (vierterPlatz == null)
        {
            vierterPlatz = g;
            size++;
        }
    }

    /***
     * Removes the first non null meal look from 4 to 1
     */
    @Override
    public T removeLast()throws TableSpaceOutOfBoundsException
    {
        if (size<0) throw new TableSpaceOutOfBoundsException(); //Directly breaks out of the function since the last place isn't empty
        T gericht = null;
        if (vierterPlatz != null)
        {
            gericht = vierterPlatz;
            vierterPlatz = null;
            size--;
            return gericht;
        } else if (zweiterPlatz  != null)
        {
            gericht = dritterPlatz;
            dritterPlatz = null;
            size--;
            return gericht;
        } else if (zweiterPlatz != null)
        {
            gericht = zweiterPlatz;
            zweiterPlatz = null;
            size--;
            return gericht;
        } else if (ersterPlatz != null)
        {
            gericht = ersterPlatz;
            ersterPlatz = null;
            size--;
            return gericht;
        }
        return gericht;
    }

    @Override
    public T get(int p)
    {
        T g = null;
        switch (p)
        {
            case 1:
                g = this.ersterPlatz;
                break;
            case 2:
                g= this.zweiterPlatz;
                break;
            case 3:
                g = this.dritterPlatz;
                break;
            case 4:
                g = this.vierterPlatz;
                break;
            default:
                System.out.println("This meal doesn't exist?");
                break;
        }
        return g;
    }

    @Override
    public void swap(int i1, int i2)
    {
        T one = get(i1);
        T two = get(i2);
        switch (i1)
        {
            case 1:
                this.ersterPlatz = two;
                break;
            case 2:
                this.zweiterPlatz = two;
                break;
            case 3:
                this.dritterPlatz = two;
                break;
            case 4:
                this.vierterPlatz = two;
                break;
        }
        switch (i2)
        {
            case 1:
                this.ersterPlatz = one;
                break;
            case 2:
                this.zweiterPlatz = one;
                break;
            case 3:
                this.dritterPlatz = one;
                break;
            case 4:
                this.vierterPlatz = one;
                break;
        }
    }

    public void clear()
    {
        ersterPlatz = null;
        zweiterPlatz = null;
        dritterPlatz = null;
        vierterPlatz = null;
        size = 0;
    }

}
