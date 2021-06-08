/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrocontactos;

import javax.swing.JOptionPane;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 7/06/2021
 *
 */
public class Registro {

    public static void main(String args[]) {
        int op = 0, telefono, size;
        String nombre;
        Contacto c;
        size = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el tamaño de la agenda telefonica", "Introduciendo tamaño de la agenda", 1));
        Agenda agenda = new Agenda(size);

        do {
            try {
                op = Integer.parseInt(JOptionPane.showInputDialog(null, "\n\tAGENDA\n"
                        + "1.-AÑADIR UN CONTACTO\n"
                        + "2.-LISTAR CONYACTOS\n"
                        + "3.-BUSCAR CONTACTO\n"
                        + "4.-COMPROBAR SI EXITE UN CONTACTO\n"
                        + "5.-ELIMINAR CONTACTO\n"
                        + "6.-CONTACTOS DISPONIBLES\n"
                        + "7.-AGENDA LLENA\n"
                        + "8.-SALIR\n¿QUE DESEA REALIZAR?", "AGENDA TELEFONICA", 3));
                switch (op) {
                    case 1: {

                        break;
                    }
                    case 2: {

                        break;
                    }
                    case 3: {

                        break;
                    }
                    case 4: {

                        break;
                    }
                    case 5: {

                        break;
                    }
                    case 6: {

                        break;
                    }
                    case 7: {

                        break;
                    }
                    case 8: {

                        break;
                    }
                    default:{
                    
                    break;}
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error " + e.getMessage(), "Error", 0);
            }

        } while (op != 8);
    }

}
