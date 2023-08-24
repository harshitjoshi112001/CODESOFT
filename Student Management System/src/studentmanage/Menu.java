/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanage;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Menu extends JFrame implements ActionListener{
    
    JLabel img4;
    Font f,f1;
    Menu()
    {
        super("Menu");
        
        f=new Font("TAHOMA",Font.BOLD,25);
        f1=new Font("Serif",Font.BOLD,23);
        
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("studentmanage/icons/menu.png"));
        Image img2=img.getImage().getScaledInstance(1200, 850, Image.SCALE_DEFAULT);
        ImageIcon img3=new ImageIcon(img2);
        img4=new JLabel(img3);
        add(img4);
        
        JMenuBar menubar=new JMenuBar();     //menu bar 
        JMenu menu1=new JMenu("Add Info");
        JMenuItem menu1_inner=new JMenuItem("Add Student");
        
        JMenu menu2=new JMenu("View Info");
        JMenuItem menu2_inner=new JMenuItem("View Student");
        
        JMenu menu5=new JMenu("Update Info");
        JMenuItem menu5_inner=new JMenuItem("Update Student");
        
        JMenu menu3=new JMenu("Delete Info");
        JMenuItem menu3_inner=new JMenuItem("Delete Student");
        
        JMenu menu4=new JMenu("Exit");
        JMenuItem menu4_inner=new JMenuItem("Logout");
        
        menu1.add(menu1_inner);     //add menuitem to menu
        menu2.add(menu2_inner); 
        menu3.add(menu3_inner); 
        menu4.add(menu4_inner);
        menu5.add(menu5_inner);
        
        menubar.add(menu1);     // add all menu to menu bar
        menubar.add(menu2);
        menubar.add(menu5);
        menubar.add(menu3);
        menubar.add(menu4);
        
        menu1.setFont(f);     //set font
        menu2.setFont(f);
        menu3.setFont(f);
        menu4.setFont(f);
        menu5.setFont(f);
        
        menu1_inner.setFont(f1);
        menu2_inner.setFont(f1);
        menu3_inner.setFont(f1);
        menu4_inner.setFont(f1);
        menu5_inner.setFont(f1);
        
        menu1_inner.addActionListener(this);
        menu2_inner.addActionListener(this);
        menu3_inner.addActionListener(this);
        menu4_inner.addActionListener(this);
        menu5_inner.addActionListener(this);
        
        setJMenuBar(menubar);       //set menubar to our frame

        
        setLocation(420,90);
        setSize(1200,900);
        setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae)
    {
        
        String s=ae.getActionCommand();
        if(s.equals("Add Student"))
        {
//            System.out.println("add");
            new Addstudent().setVisible(true);
        }
        else if(s.equals("View Student"))
        {
//            System.out.println("VIEW");
            new Viewstudent().setVisible(true);
        }
        else if(s.equals("Update Student"))
        {
//            System.out.println("update");
            new Updatestudent().setVisible(true);
        }
        else if(s.equals("Delete Student"))
        {
//            System.out.println("delete");
            new Deletestudent().setVisible(true);
        }
        else if(s.equals("Logout"))
        {
//            new Logutinfo();
            new Adminlogin().setVisible(true);
            this.setVisible(false);
        }
       
    }
    public static void main(String args[])
    {        
        new Menu();
        
    }
}
