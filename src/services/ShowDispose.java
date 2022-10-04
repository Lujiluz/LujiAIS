
package services;

import javax.swing.*;

public class ShowDispose {
    public ShowDispose(){
        
    }
    
    public void disposeFrame(JFrame[] frame){
        for(int i = 0; i < frame.length;i++){
            frame[i].dispose();
        }
    }
    public void disposeDialog(JDialog[] dlg){
        for(int i = 0; i < dlg.length;i++){
            dlg[i].dispose();
        }
    }
    public void showDialog(JDialog[] dlg){
        for(int i = 0; i < dlg.length;i++){
            dlg[i].setVisible(true);
        }
    }
    
    public void showFrame(JFrame[] frame){
        for(int i = 0; i < frame.length;i++){
        frame[i].setVisible(true);
        }
    }
}
