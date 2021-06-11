/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gofo.system;


import java.util.Scanner;
/**This class is for setting playground owner information*/
public class playgroundOwner  {
    private String userName;
    private sign_up data;
    /**parameterized constructor
     @param forUserName*/
    playgroundOwner(String forUserName)
    {
        Scanner in = new Scanner(System.in);
        userName=forUserName;
        sign_up x=new sign_up();
        data=x;
    }
    /**function that adds playground
     @param x of type string playground*/
    public void addPlayground(playground x)
    {
       listOfPlaygrounds list=new listOfPlaygrounds();
       list.add(x);



    }
/**function that gets user name
 @return String*/
    public String getUserName() {
        return userName;
    }
/**function that sets user name
 @param userName of type string*/
    public void setUserName(String userName) {
        this.userName = userName;
    }
/**function that gets data
 @return data*/
    public sign_up getData() {
        return data;
    }
/**function that sets data
 @param data of type data*/
    public void setData(sign_up data) {
        this.data = data;
    }




}