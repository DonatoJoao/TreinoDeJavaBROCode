import javax.swing.JOptionPane;
public class GUI {

    public static void main(String[] args) {


        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        JOptionPane.showMessageDialog(null, "Olá, " + nome + "!");

        int idade = Integer.parseInt(JOptionPane.showInputDialog(nome, "digite sua idade:"));
            if (idade >= 18){
                JOptionPane.showMessageDialog(null, "Você tem " + idade + " anos, é maior de idade.");
            } else{
                JOptionPane.showMessageDialog(null, "Você tem " + idade + " anos, é menor de idade.");
            }
        double peso = Double.parseDouble(JOptionPane.showInputDialog(nome, "digite seu peso (use ponto pra contar kilogramas):"));
        JOptionPane.showMessageDialog(null, "Ok, se você disse a verdade, seu peso é de: " + peso + " kilos.");
    }
}
