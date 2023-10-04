import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Objects;

public class rock_paper {
    public static void main(String[] args) {

        Random random = new Random();

        int num = random.nextInt(1,3);
        System.out.print(num);
        int guess = Integer.parseInt(JOptionPane.showInputDialog("Enter your guess(1:Rock||2:Paper||3:Scissors)"));

        String val;

        if (Objects.equals(num,1)){
            val = "Rock";
        } else if (Objects.equals(num, 2)) {
            val = "Paper";
        } else {
            val = "Scissors";
        }

        if (Objects.equals(num,guess)){
            JOptionPane.showMessageDialog(null,"Your guess was right!");
        } else {
            JOptionPane.showMessageDialog(null,"The computer chose "+val);
        }

    }
}