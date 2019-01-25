
package fanis.koustoulas.app.estia;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author Fanis
 */
public class Main extends JFrame{
    Main(Dimension d){
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        setSize(d);
        setResizable(false);
        this.setLocationRelativeTo(null);
        login.setFocusable(true);
        login.requestFocusInWindow();

        add(login);
        pack();
    }
    public static void main(String args[]){
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Main m = new Main(new Dimension(500,500));
            }
        
        });
    }
    public void setThisSize(Dimension d){
        this.setSize(d);
    }
    public void changeState(String panel){
        getContentPane().removeAll();
        
        switch(panel){
            case "userPanel":
                UserPanel user = new UserPanel(this);
                
                setSize(1200,500);
                setLocationRelativeTo(null);
                add(user);
                getContentPane().revalidate();
                break;
        }
        
    }
    Login login = new Login(this);
    
    
}
