package atv_meds;

import javax.swing.*;
import java.util.ArrayList;


public class Menu {

    public static void main(String[] args) {

        ArrayList<Med> remedios = new ArrayList<Med>();

        String menu = "1 - CAD REMEDIOS\n" +
                "2 - LISTAR REMEDIOS";

        int op =0;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));

            if (op == 1) {


                Med C = new Med();
                C.cadRemed();
                remedios.add(C);

            }

            if (op == 2) {
                String lista = "";
                for (Med r : remedios) {
                    lista += "NOME: " + r.getNomeRemedio() + "\n";
                    lista+= "USO: " + r.getAdministracao() + "\n";

                    lista += "\nINDICAÇÕES:\n";

                    for (Med indicacao : r.getTopindicacao()) {
                        lista += "- " + indicacao.getIndicacao() + "\n";
                    }

                    lista+= "\n\nCONTRA INDICAÇÕES:\n";
                    for (Med contraIndicacao : r.getContraIndicacao()) {
                        lista += "- " +  contraIndicacao.getContraIndicao() + "\n";
                    }

                    lista += "\n";
                }
                JOptionPane.showMessageDialog(null, lista);

            }

        } while (op != 0);


    }
}
