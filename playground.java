package gofo.system;
/**This class is for setting playground information*/
public class playground {
    public String ID;
    private int nPlayers;
    private float width;
    private float height;
    public String  isReserved;
    private boolean isAccepted;
    private int price;
    private int cancel;
    public String freeHours;
    public static int counter=0;
    private String location;

    /**function that gets the location
     @return String*/
    public String getLocation() {
        return location;
    }
 /**function that sets the location
     @param location of type String*/
    public void setLocation(String location) {
        this.location = location;
    }
/**Default constructor*/
    public playground()
    {
        counter++;
        ID="";
        ID+=""+counter;
        isReserved=" ";
    }
/**function that gets the ID
     @return String*/
    public String getID() {
        return ID;
    }
/**function that sets the ID
     @param ID of type String*/
    public void setID(String ID) {
        this.ID = ID;
    }
/**function that gets the numbers of players
     @return String*/
    public int getnPlayers() {
        return nPlayers;
    }
/**function that sets the number of Players
     @param nPlayers of type String*/
    public void setnPlayers(int nPlayers) {
        this.nPlayers = nPlayers;
    }

/**function that gets the height
     @return float*/
    public float getHeight() {
        return height;
    }
/**function that sets the height
     @param height of type String*/
    public void setHeight(float height) {
        this.height = height;
    }
/**function that shows that get the playground is reserved or not
     @return String*/
    public String getIsReserved() {
        return isReserved;
    }
/**function that shows that set the playground is reserved or not
     @param isReserved of type String*/
    public void setIsReserved(String isReserved) {
        this.isReserved = isReserved;
    }
/**function that gets the playground accepted
 @return boolean*/
    public boolean isAccepted() {
        return isAccepted;
    }
/**function that sets the playground accepted
 @param accepted of type boolean*/
    public void setAccepted(boolean accepted) {
        isAccepted = accepted;
    }
/**function that gets the price
     @return int*/
    public int getPrice() {
        return price;
    }
/**function that sets price
 @param price of type int*/
    public void setPrice(int price) {
        this.price = price;
    }
/**function that cancel the request
     @return int*/
    public int getCancel() {
        return cancel;
    }
/**function that sets cancel
 @param cancel of type int*/
    public void setCancel(int cancel) {
        this.cancel = cancel;
    }
/**function that gets the free hours
     @return String*/
    public String getFreeHours() {
        return freeHours;
    }
/**function that sets freeHours
 @param freeHours of type String*/
    public void setFreeHours(String freeHours) {
        this.freeHours = freeHours;
    }
/**function that gets the counter
     @return static */
    public static int getCounter() {
        return counter;
    }
/**function that sets counter
 @param counter of type int*/
    public static void setCounter(int counter) {
        playground.counter = counter;
    }

    /**parameterized constructor
     @param nPlayers1 of type int
     @param height1 of type float
     @param isAccepted1 of type boolean
     @param price1 of type int
     @param  cancel1 of type int
     @param freeHours1 of type String
     @param for_ID of type String
     */
    public playground(int nPlayers1,float height1
            ,boolean isAccepted1,int price1,int cancel1,String freeHours1,String for_ID)
    {
        ID=for_ID;
        nPlayers=nPlayers1;
        height=height1;
        isReserved=" ";
        isAccepted=isAccepted1;
        price=price1;
        cancel=cancel1;
        freeHours=freeHours1;
    }
/** function that represent everything in string
   @return String*/
    @Override
    public String toString() {
        return "playground{" +
                "nPlayers=" + nPlayers +
                ", width=" + width +
                ", isReserved=" + isReserved +
                ", isAccepted=" + isAccepted +
                ", price=" + price +
                ", cancel=" + cancel +
                " location= "+location+
                '}';
    }
}
