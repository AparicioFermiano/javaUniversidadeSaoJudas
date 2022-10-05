package copa_do_mundo;
/**
 *
 * @author aparicio
 */
import javax.swing.JOptionPane;

public class Jogadores {

    public static void DefinirJogador()
    {
        int i = 1;
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de jogadores ou 0 para sair: "));
        
        while(numero != 0)
        {
            String nomei = JOptionPane.showInputDialog("Nome do Jogador: ");
            String selecaoi =  JOptionPane.showInputDialog("Seleção: ");
            int numeroi = Integer.parseInt(JOptionPane.showInputDialog("Numero: "));
            String posicaoi =  JOptionPane.showInputDialog("Posição: ");

            JogadoresModel jogadori = new JogadoresModel(selecaoi, numeroi, nomei, posicaoi);

            jogadori.exibirMensagem();
            i++;
        }
    } 
}
