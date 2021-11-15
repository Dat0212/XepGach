/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;


import java.sql.*;
import javaapplication5.biz.PlayerBiz;
import javaapplication5.dao.Player;
/**
 *
 * @author Admin
 */
public class XepGach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        try{
                 Player objectPlayer = new Player();
        objectPlayer.setID(0);
        objectPlayer.setUserName("B");
        objectPlayer.setPassWord("GHJK");
        
        PlayerBiz biz = new PlayerBiz();
        biz.Delete(objectPlayer);
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        
    }
}
