package gofo.system;
import java.util.Scanner;
/**This class for sign up player and playground owner*/
public class sign_up {
    private String name;
    private String passWord;
    private String NationalId;
    private String phone;
    private String Location;

/**function that gets name
 @return getName */
    public String getName() {
        return name;
    }
/**function that sets name
 @param name of type string*/
    public void setName(String name) {
        this.name = name;
    }
/**function that gets passWord
 @return String */
    public String getPassWord() {
        return passWord;
    }
/**function that sets passWord
 @param passWord of type string*/
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
/**function that gets NationalId
 @return String */
    public String getNationalId() {
        return NationalId;
    }
/**function that sets id
 @param id of type string*/
    public void setNationalId(String id) {
        this.NationalId = id;
    }
/**function that gets phone
 @return String */
    public String getPhone() {
        return phone;
    }
/**function that sets phone
 @param phone of type string*/
    public void setPhone(String phone) {
        this.phone = phone;
    }
/**function that gets e_mail
 @return String */
    public String getE_mail() {
        return e_mail;
    }
/**function that sets e_mail
 @param e_mail of type string*/
    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    private String e_mail;
    /**Default Constructor*/
    public sign_up()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter name ");
        name=in.next();
        System.out.println("enter password ");
        passWord=in.next();
        System.out.println("enter NationalId ");
        NationalId=in.next();
        System.out.println("enter phone ");
        phone=in.next();
        System.out.println("enter email ");
        e_mail=in.next();
        System.out.println("enter Location ");
        Location=in.next();


    }
/**function that gets Location
 @return String */
    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }
/** function that represent everything in string
   @return String*/
    @Override
    public String toString() {
        return "sign_up{" +
                "name='" + name + '\'' +
                ", passWord='" + passWord + '\'' +
                ", NationalId='" + NationalId + '\'' +
                ", phone='" + phone + '\'' +
                ", Location='" + Location + '\'' +
                ", e_mail='" + e_mail + '\'' +
                '}';
    }
}
