import javax.swing.*;

class ComboBoxExample {
    JFrame frame;
    ComboBoxExample(){
        frame=new JFrame("ComboBox Example");
        //create a string array
        String country[]={"India","SriLanka","Singapore","Maldives","SeyChelles"};
        //create a combobox object with given string array
        JComboBox countries=new JComboBox(country);
        countries.setBounds(50, 50,90,20);
        frame.add(countries);       //add it to the frame
        frame.setLayout(null);
        frame.setSize(200,300);
        frame.setVisible(true);
    }
}
public class Swing07 {
    public static void main(String arg[]) {
       new ComboBoxExample();
    }
}