/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ottprojectf;

/**
 *
 * @author Asif
 */
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author User
 */
public class Joy_AppendableObjectOutputStream extends ObjectOutputStream{
    public Joy_AppendableObjectOutputStream(OutputStream out) throws IOException {
        super(out);
        }
     @Override
         protected void writeStreamHeader() throws IOException { 
        
    }
}

