/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.io.File;
import javax.swing.JOptionPane;
import dao.PharmacyUtils;
import java.awt.Desktop;

/**
 *
 * @author ASUS
 */
public class OpenPdf {
    public static void openById(String id) {
        try {
            File file = new File(PharmacyUtils.billpath + id + ".pdf");
            if (file.exists()) {
                Desktop.getDesktop().open(file);
            } else {
                JOptionPane.showMessageDialog(null, "File does not exist.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error opening file: " + e.getMessage());
        }
    }
}