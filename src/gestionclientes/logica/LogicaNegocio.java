/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionclientes.logica;

import gestionclientes.dto.Cliente;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class LogicaNegocio {
    private static List<Cliente> listaClientes = new ArrayList<>();
    
    public static void addCliente(Cliente cliente){
        listaClientes.add(cliente);
    }
    
    public static void borraCliente(int indice){
        if(indice >=0 && indice<listaClientes.size()){
            listaClientes.remove(indice);
        }
    }
    
    
    
    public static List<Cliente> getListaClientes(){
        return listaClientes;
    }    
}
