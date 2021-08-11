import javax.swing.*;

class SliderExample extends JFrame {
    public SliderExample() {
        //create a slider object
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);
        //set major and minor ticks for the slider
        slider.setMinorTickSpacing(2);
        slider.setMajorTickSpacing(10);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
 
        JPanel panel = new JPanel();
        panel.add(slider);  //add slider to the panel
        add(panel);
    }
 
}

public  class Swing08{
    public static void main(String s[]) {
        SliderExample frame=new SliderExample();
        frame.pack();
        frame.setVisible(true);
    }
}