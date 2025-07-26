package Day3;
import java.awt.event.*;
import javax.swing.*;
public class GUIprogram {
    public static void main(String[] arg){
    ;
 String name = JOptionPane.showInputDialog("Enter your name");
 JOptionPane.showMessageDialog(null, "Hello" + name);
  int age = Integer.parseInt(JOptionPane.showInputDialog("What's your age?"));
 JOptionPane.showMessageDialog(null, "You are " + age + " years old");
  Double height = Double.parseDouble(JOptionPane.showInputDialog("enter your height in ft"));
 JOptionPane.showMessageDialog(null, "You are "+ height + " ft tall");
//          JButton button = new JButton("Click Me");
//  button.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e) {
//                 JOptionPane.showMessageDialog(null, "Hello World!");
//             }
//         }); 

    }
}
