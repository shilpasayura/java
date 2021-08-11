
import javax.swing.*;
class ComboBox {
    JFrame frame;

    ComboBox(){
        frame=new JFrame("ComboBox Example");
        String nameArr[]={"Ama","Bima","Cima"};

        //create a combobox object with string array
        JComboBox names=new JComboBox(nameArr);
        names.setBounds(50, 50,90,20);
        frame.add(names);
	frame.setLayout(null);
        frame.setSize(200,300);
        frame.setVisible(true);
    }
}

public class ComboBoxDemo {
    public static void main(String arg[]) {
       new ComboBox();
    }
}
