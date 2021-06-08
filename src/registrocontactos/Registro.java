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
                        nombre = JOptionPane.showInputDialog(null, "Introduce el nombre", "Introduciendo Nombre", 1);
                        telefono = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el numero telefonico", "Introduciendo numero telefonico", 1));
                        c = new Contacto(nombre, telefono);
                        agenda.agregarContacto(c);
                        break;
                    }
                    case 2: {
                        agenda.mostrarContactos();
                        break;
                    }
                    case 3: {
                        nombre = JOptionPane.showInputDialog(null, "Introduce el nombre", "Buscando contacto", 1);
                        agenda.buscarContacto(nombre);
                        break;
                    }
                    case 4: {
                        nombre = JOptionPane.showInputDialog(null, "Introduce el nombre", "Comprobando contacto", 1);
                        c = new Contacto(nombre);
                        if (agenda.comprobarNombre(c)) {
                            JOptionPane.showMessageDialog(null, "El contacto si existe en tu agenda", "Comprobando", 1);
                        } else {
                            JOptionPane.showMessageDialog(null, "El contacto NO existe en tu agenda", "Comprobando", 0);
                        }
                        break;
                    }
                    case 5: {
                        nombre = JOptionPane.showInputDialog(null, "Introduce el nombre", "Eliminando Contacto", 1);
                        c = new Contacto(nombre);
                        agenda.eliminarContacto(c);
                        break;
                    }
                    case 6: {
                        int n = agenda.comprobarEspacios();
                        JOptionPane.showMessageDialog(null, "Espacios disponibles en la agenda: " + n, "Espacios libres", 1);
                        break;
                    }
                    case 7: {
                        int n = agenda.comprobarEspacios();
                        if (n >= 0) {
                            JOptionPane.showMessageDialog(null, "Agenda con espacios" , "Espacios libres", 1);
                        } else {
                            JOptionPane.showMessageDialog(null, "Agenda Llena" , "Agenda llena", 0);

                        }
                        break;
                    }
                    case 8: {
                        JOptionPane.showMessageDialog(null, "CERRANDO PROGRAMA", "SALIENDO", 2);

                        break;
                    }
                    default: {
                        JOptionPane.showMessageDialog(null, "Por favor vuelva a digitar", "Error", 0);
                        break;
                    }
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error " + e.getMessage(), "Error", 0);
            }

        } while (op != 8);
    }

}
