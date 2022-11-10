/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import serveur.NoteImpl;
import serveur.NoteInterface;
/**
 *
 * @author PC
 */
public class client {
    public static void main(String[] args) throws NotBoundException {

        try {
            System.out.println("Hello");
            Remote remote = Naming.lookup("rmi://127.0.0.1/noteRMI"); //naming server:annuaire si app1 veut communiquer avec app 2  elle envoie l url de app 2 au register rmi :naming server
            if(remote instanceof NoteInterface) {
                Double note = ((NoteInterface) remote).getNote(1,"azerty");
                System.out.println(note);
            }
        } catch (RemoteException | MalformedURLException | NotBoundException e) {
            e.printStackTrace();
        }
    }
    
}
