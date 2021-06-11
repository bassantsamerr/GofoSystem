package gofo.system;
import java.util.ArrayList;
import java.util.Scanner;
/**This class is for setting player information*/
public class player {
    private String userName;
    private sign_up data;

    public ArrayList<String> Booked=new ArrayList<String>();
    /**
     parameterized constructor 
     @param forUserName of type string
     */
    public player(String forUserName)
    {
        Scanner in = new Scanner(System.in);
        userName=forUserName;
        sign_up x=new sign_up();
        data=x;
    }
    /**function of booking*/
    public void Book()
    {
         BookPlayground for_Booking=new BookPlayground();
      Booked.add(for_Booking.start()) ;

    }
    /**functions that shows requests*/
  public void myRequests()
  {
      System.out.println("IDOfPlayGround   Time");
      for(int i=0;i<Booked.size();i++)
      {
          System.out.println( Booked.get(i).toString());
      }
  }
  /** function that represent everything in string
   @return String*/
    @Override
    public String toString() {
        return "player{" +
                "userName='" + userName + '\'' +
                ", data=" + data +
                '}';
    }
}
