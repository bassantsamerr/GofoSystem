package gofo.system;
import java.util.Scanner;
/**Gofo System*/
public class main {
    public static void main(String[] args) {
        listOfPlaygrounds lista=new listOfPlaygrounds();
        playground ground =new playground();
        playground ground2=new playground();
        ground.setFreeHours("4,8,10,11");
        ground2.setFreeHours("4,8,10,11");
        lista.add(ground);
        lista.add(ground2);
        int choice=0;
while (choice!=3)
{

    // begin
    Scanner in=new Scanner(System.in);

    System.out.println("1- sign up");
    System.out.println("2- sign in");
    System.out.println("3- END");
    choice= in.nextInt();
    if (choice==1)
    {
        int choiceForAccount=0;
        System.out.println("1- player");
        System.out.println("2- playGroundOwner");
        choiceForAccount= in.nextInt();
        if (choiceForAccount==1)
        {
            System.out.println("enter user name");
            String user_Name;
            user_Name=in.next();
            player player1=new player(user_Name);
            int choicePlayer=0;
            while (choicePlayer!=3)
            {
                System.out.println("1- BOOK");
                System.out.println("2- display Books");
                System.out.println("3- END");

                choicePlayer= in.nextInt();
                if (choicePlayer==1)
                {
                    player1.Book();
                }
                else if (choicePlayer==2)
                {
                    player1.myRequests();
                }

            }

        }
        else if (choiceForAccount==2)
        {
            System.out.println("enter user name");
            String user_Name;
            user_Name=in.next();
            playgroundOwner playOwner1=new playgroundOwner(user_Name);
            int choicePlaygroundOwner=0;
            while (choicePlaygroundOwner!=2)
            {
                System.out.println("1- Add play ground");
                System.out.println("2- END");
                choicePlaygroundOwner=in.nextInt();
                if (choicePlaygroundOwner==1)
                {
                    playground ground3 =new playground();


                    System.out.println("enter the free hours");
                    System.out.println("with (,) like 7,8,10,11");
                    String freeHours;
                    freeHours=in.next();
                    ground3.setFreeHours(freeHours);

                    System.out.println("enter the price");
                    int price=in.nextInt();
                    ground3.setPrice(price);
                    System.out.println("enter the location");
                    String location=in.next();
                    ground3.setLocation(location);
                    playOwner1.addPlayground(ground3);
                }


            }


        }

    }
    else if(choice==2)
    {
        System.out.println("there is no accounts yet");
    }

}




    }
}
