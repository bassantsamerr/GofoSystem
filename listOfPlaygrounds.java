package gofo.system;
import java.util.ArrayList;
/**This class is for making an array list of playground*/
public class listOfPlaygrounds {
    public static ArrayList<playground> listOfPlaygrounds=new ArrayList<playground>();
    /**function that adds playground to the list
     @param x of type playground*/
    public void add(playground x)
    {
        listOfPlaygrounds.add(x);
    }
}
