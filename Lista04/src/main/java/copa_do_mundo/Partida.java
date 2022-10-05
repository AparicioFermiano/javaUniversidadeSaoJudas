package copa_do_mundo;

import javax.swing.JOptionPane;

/**
 *
 * @author aparicio
 */
public class Partida {
   public static void DefinirPartida()
    {
        String time1 = JOptionPane.showInputDialog("Digite o nome do primeiro time: ");
        String time2 = JOptionPane.showInputDialog("Digite o nome do segundo time: ");

        PartidaModel partidai = new PartidaModel(time1, time2);

        partidai.exibirMensagem();
    }  
}
