/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

interface qui contient les methodes qu'on va appeler a distance
 */
package serveur;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author PC
 */
public interface NoteInterface extends Remote  {
    
    public Double getNote(int etudiantCin, String codeMatiere) throws RemoteException;
}
