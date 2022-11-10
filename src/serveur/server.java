/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

classe qui instanciera l'objet et l'enregistre en lui affectant un nom ds le registre de nom rmi
 */
package serveur;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
/**
 *
 * @author PC
 */
public class server {
    public static void main(String[] args) {

        NoteImpl noteImpl = null;
        String url = null;

        try {
            LocateRegistry.createRegistry(1099);
           // System.out.println("registry");
        } catch (RemoteException e) {
            e.printStackTrace();
        }
      
        try {
            noteImpl = new NoteImpl();
            url = "rmi://127.0.0.1/noteRMI";
            System.out.println("serveur");
            Naming.rebind(url, noteImpl);
        } catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }
    }
    
}
