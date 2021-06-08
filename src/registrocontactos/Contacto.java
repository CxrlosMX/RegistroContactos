/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrocontactos;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 7/06/2021
 *
 */
public class Contacto {

    //Creando los atributos del contacto

    private String nombre;
    private int numero;

    public Contacto(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    public Contacto(String nombre) {
        this.nombre = nombre;
        this.numero = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    //Agregaremos un metodo Equals

    public boolean equals(Contacto c) {
        return (this.nombre.trim().equalsIgnoreCase(c.getNombre().trim())); //El método trim sirve para eliminar los espacios de la cadena

    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", numero: " + numero;
    }

}
