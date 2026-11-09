/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;
import View.ui;
import javax.swing.SwingUtilities;
/**
 *
 * @author admin
 */
public class MainClass {
    public static void main(String[] args) {
        // Ensure GUI updates run safely on the Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(() -> {
            new ui().setVisible(true);
        });
    }
}
