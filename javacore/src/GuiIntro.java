import javax.swing.JOptionPane;
public class GuiIntro {
    public static void main(String[] args) {
        System.out.println("----Program to show working of GUI using dialog box-----------");
        JOptionPane.showMessageDialog(null,"Program to show working of GUI using dialog box");
        String name = JOptionPane.showInputDialog("Enter your name ");
        JOptionPane.showMessageDialog(null,"Hello "+ name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age "));
        JOptionPane.showMessageDialog(null,"You are "+ age+" years old");

        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter number 1 "));
        // parseInt or parseDouble will change the type to int and double respectively

        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter number 2 "));

        double sum = num1+num2;
        JOptionPane.showMessageDialog(null,"The sum of two numbers is: "+ sum);

    }
}
