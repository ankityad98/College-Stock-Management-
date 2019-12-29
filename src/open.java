
import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.*;
public class open {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setVisible(true);
        f.setSize(400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        
        JMenuBar mb = new JMenuBar();
        
        JMenu file = new JMenu("Stock Management");
        JMenu sb = new JMenu("Stationary", true);
        sb.add("Pen");
        sb.add("Duster");
        sb.add("Marker");
        sb.add("Marker Ink");
        sb.add("Add Items");
        mb.add(file);
       // JMenu edit = new JMenu("Edit");
       // mb.add(edit);
        
        JMenu lb = new JMenu("Lab");
        lb.add("Mouse Pad");
        lb.add("Monitor");
        lb.add("Add Items");
       
        JMenu pr = new JMenu("Printer");
        pr.add("Paper");
        pr.add("Ink");
        pr.add("Add Items");
        
        JMenu pr1 = new JMenu("Projector");
        pr1.add("Projector");
        pr1.add("Cables");
        pr1.add("Add Items");
        file.add(sb);
        file.add(lb);
        file.add(pr);
        file.add(pr1);
        mb.add(file);
        JMenuItem vw = new JMenuItem("View All");
        file.add(vw);
        vw.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent ae)
         {
            f.dispose();
            Inventory i=new Inventory();
            i.setVisible(true);
            i.setDefaultCloseOperation(Inventory.DISPOSE_ON_CLOSE);  
             
        
         }
        });

sb.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent as)
         {
            f.dispose();
            Stock s=new Stock();
            s.setVisible(true);
              
             
        
         }
        });


         JMenuItem ad = new JMenuItem("ADD Items +");
        file.add(ad);
        
        
        
        
        
        f.setJMenuBar(mb);
        
        
    }
}







