
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author HP
 */
public class PdfEncripted {

    public String Encripted(String encripted) {

        byte[] USER = "123456".getBytes();
        byte[] OWNER = "123456".getBytes();
        
        try {
            File pdf = new File("/Users/HP/Desktop/POO2963/Unit 2/Assignments/Assignments20_Password/Usuarios/Lista.pdf");
            if (pdf.exists()) {
                PdfReader User = null;

                
                PdfStamper pdfs = new PdfStamper(User, new FileOutputStream("/Users/HP/Desktop/POO2963/Unit 2/Assignments/Assignments20_Password/Usuarios/Lista.pdf"));
                pdfs.setEncryption(USER, OWNER, PdfWriter.ALLOW_PRINTING, PdfWriter.ENCRYPTION_AES_128 | PdfWriter.DO_NOT_ENCRYPT_METADATA);
                pdfs.close();
               
            } else {
                JOptionPane.showMessageDialog(null, "Este archivo no existe");
            }

        } catch (Exception e) {

        }
        return null;

    }
}
