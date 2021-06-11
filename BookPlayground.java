package gofo.system;
import java.util.Scanner;
/**This class for booking playground*/
public class BookPlayground {
    private String s;
    private listOfPlaygrounds list;
    private String location;
    /**function that book the playground
     @return String*/
    public String  start()
    {
        Scanner in = new Scanner(System.in);
        for(int i=0;i<list.listOfPlaygrounds.size();i++)
        {
            System.out.println(list.listOfPlaygrounds.get(i).toString()+" ");
            System.out.println("===============");
        }
        System.out.println("enter the number of the playground ");
        int indx= in.nextInt();
        indx--;
        System.out.println("free hours");
        System.out.println(list.listOfPlaygrounds.get(indx).freeHours+" ");
        System.out.println("enter the time  ");
        System.out.println("take care that the time is not in isReserved ");
        int time=in.nextInt();
        list.listOfPlaygrounds.get(indx).isReserved+=time+"/ /";
        System.out.println("Done");
        String  ans= list.listOfPlaygrounds.get(indx).ID;
        ans+=" "+time;
        return ans;
    }
}
