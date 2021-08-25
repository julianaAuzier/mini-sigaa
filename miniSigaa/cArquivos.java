/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package msiga;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class cArquivos {
    public static void salvar(Object objeto, String caminho) {

           try {
             FileOutputStream saveFile = new FileOutputStream(caminho);
             ObjectOutputStream stream = new ObjectOutputStream(saveFile);

              // salva o objeto
             stream.writeObject(objeto);

             stream.close();
           } catch (Exception exc) {
                 exc.printStackTrace();
               }
   }
    
    public static Object restaurar(String caminho) {

        Object objeto = null;

        try {
            FileInputStream restFile = new FileInputStream(caminho);
            ObjectInputStream stream = new ObjectInputStream(restFile);
                   // recupera o objeto
            objeto = stream.readObject();
            stream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return objeto;
     }
}
    