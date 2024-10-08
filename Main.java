import javax.swing.JOptionPane;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        while (true){
            int num = random.nextInt(1,4);
            System.out.print(num);
            int guess = Integer.parseInt(JOptionPane.showInputDialog("Enter your guess(1:Rock||2:Paper||3:Scissors||-1:Quit)"));

            if (guess == -1){
                break;
            }

            String val;

            if (num == 1){
                val = "Rock";
            } else if (num == 2) {
                val = "Paper";
            } else {
                val = "Scissors";
            }

            if ((guess == 1 && num == 3) || (guess == 2 && num == 1) || (guess == 3 && num == 2)){
                JOptionPane.showMessageDialog(null,"You won! The computer chose "+val);
            } else if ((guess == 1 && num == 2) || (guess == 2 && num == 3) || (guess == 3 && num == 1)) {
                JOptionPane.showMessageDialog(null,"You lose. Computer chose "+val);
            } else {
                JOptionPane.showMessageDialog(null,"Draw");
            }
        }
    }
}