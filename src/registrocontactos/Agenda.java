/*+
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
public class Agenda {

    private Contacto arreglo[];

    public Agenda() { //Creamos constructor por defecto
        arreglo = new Contacto[10];
    }

    public Agenda(int size) {//El parametro que resiva sera el numero de contacto que contendra la agenda 
        arreglo = new Contacto[size];
    }
    //Metodos 

    //Añadir Contactos a la agenda
    public void agregarContacto(Contacto c) {
        if (comprobarNombre(c)) { //Si existe un contacto con ese nombre
            JOptionPane.showMessageDialog(null, "Ya existe un contacto con ese nombre", "Nombre repetido", 0);
        } else if (hayEspaciosAgenda()) {
            boolean encontrado = false;
            for (int i = 0; i < arreglo.length && !encontrado; i++) {
                if (arreglo[i] == null) {
                    arreglo[i] = c;
                    encontrado = true;
                }
            }
            if (encontrado) {
                JOptionPane.showMessageDialog(null, "Contacto agregado correctamente", "Contacto Agregado", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Problema al agregar el contacto, intente en un momento", "Error al agregar el contacto", 0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "La agenda se encuentra llena", "Agenda Llena", 0);
        }
    }

    //Metodo para mostrar Contacto
    public void mostrarContactos() {
        if (comprobarEspacios() == arreglo.length) { //Si el valor que retorne es igual a la medida del arreglo quiere decir que toda la agenda esta vacia
            JOptionPane.showMessageDialog(null, "La agenda esta vacia", "Agenda Vacia", 0);
        } else {
            String cadena = "";
            for (int i = 0; i < arreglo.length; i++) {
                if (arreglo[i] != null) {
                    cadena = cadena + arreglo[i].toString() + "\n";
                }
            }
            JOptionPane.showMessageDialog(null, cadena, "Agenda de Contactos", 1);

        }
    }

    //Metodo para buscar contacto
    public void buscarContacto(String c) {
        boolean encontrado = false;
        for (int i = 0; i < arreglo.length && !encontrado; i++) {
            if (arreglo[i] != null && arreglo[i].getNombre().trim().equalsIgnoreCase(c.trim())) {
                JOptionPane.showMessageDialog(null, arreglo[i].toString(), "Contacto", 1);
                encontrado = true;
            }
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "No se encontro ningun contacto con ese nombre", "Error de busqueda", 0);
        }
    }

    //Metodo para eliminar un contacto
    public void eliminarContacto(Contacto c) {
        if (comprobarEspacios() == arreglo.length) { //Si el valor que retorne es igual a la medida del arreglo quiere decir que toda la agenda esta vacia
            JOptionPane.showMessageDialog(null, "La agenda esta vacia", "Agenda Vacia", 0);
        } else {
            boolean encontrado = false;
            for (int i = 0; i < arreglo.length && !encontrado; i++) {
                if (arreglo[i] != null && arreglo[i].equals(c)) {
                    arreglo[i] = null;
                    encontrado = true;
                }
            }
            if (encontrado) {
                JOptionPane.showMessageDialog(null, "El contacto fue eliminado", "Contacto Eliminado", 0);
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar el contacto", "Error al eliminar Contacto", 0);
            }
        }
    }

    //Metodo para comprobar si existe un contacto
    public boolean comprobarNombre(Contacto c) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] != null && arreglo[i].equals(c)) {
                return true;
            }
        }
        return false;
    }

    //Metodo para comprobar si la agenda esta llena
    public boolean hayEspaciosAgenda() {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == null) {
                return true;
            }
        }
        return false;
    }

    //Metodo para comprobar si hay espacios libres en nuestra agenda
    public int comprobarEspacios() {
        int n = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == null) {
                n++;
            }
        }
        return n;
    }
}
