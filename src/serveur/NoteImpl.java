/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

classe qui implémente cette interface 
 */
package serveur;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
/**
 *
 * @author PC
 */
public class NoteImpl extends UnicastRemoteObject implements NoteInterface {
    protected NoteImpl() throws RemoteException {
        super();
    }

    @Override
    public Double getNote(int etudiantCin, String codeMatiere) {
        Double note = 10.0 + (Math.random() * (10));
        System.out.println("note");
        return note;
    }
    
}
