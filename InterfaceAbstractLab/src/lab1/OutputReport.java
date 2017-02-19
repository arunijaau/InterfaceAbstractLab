/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import javax.swing.JOptionPane;

/**
 *
 * @author ajayasooriya
 */
public class OutputReport {
    private String report;
    
    
    public OutputReport() {
        this.report = "";
    }
    
    public void addData(String data){
        this.report += data + "\n";
    }
    
    public void ShowData(){
        JOptionPane.showMessageDialog(null, report);
    }

    
}
