
package fanis.koustoulas.app.estia;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.scene.input.KeyCode;
import javax.swing.JPanel;


public class Login extends JPanel{
    Main m;
    Login(Main m){
        super();
        this.m = m;
        init();
        this.setPreferredSize(new Dimension(500,500));
        this.setVisible(true);
        addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == 10){
                    System.out.println("yeahh");
                    getLogin();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
            
        });
    }
    private void getLogin(){
        String username = usernameText.getText();
        String password = String.valueOf(passwordText.getPassword());
        LoginController l = new LoginController(username, password);
        loggedIn = l.login();
        if(loggedIn){
            m.changeState("userPanel");
        }else errorMsg.setText("Wrong credentials!");
    }
    @SuppressWarnings("unchecked")
    private void init() {
        Dimension ld = new Dimension(200,100);
        usernameLabel = new JLabel();
        usernameLabel.setSize(ld);
        passwordLabel = new JLabel();
        passwordLabel.setSize(ld);
        usernameText = new JTextField();
        usernameText.setSize(ld);
        loginLabel = new JLabel();
        errorMsg = new JLabel();
        loginButton = new JButton();
        passwordText = new JPasswordField();
        passwordText.setSize(ld);
        

        usernameLabel.setText("Username:");

        passwordLabel.setText("Password:");

        loginLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        loginLabel.setText("Login");

        errorMsg.setForeground(new java.awt.Color(255, 0, 0));

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getLogin();
            }
        });
        
        
        
        usernameText.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == 10){
                    System.out.println("yeahh");
                    getLogin();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
            
        });
        passwordText.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == 10){
                    System.out.println("yeahh");
                    getLogin();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
            
        });
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(loginButton)
                        .addGap(18, 18, 18)
                        
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(passwordLabel)
                            .addComponent(usernameLabel))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(errorMsg)
                                .addGap(0, 100, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(usernameText)
                                    .addComponent(passwordText))))
                        .addGap(111, 111, 111))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginLabel)
                .addGap(163, 163, 163))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(loginLabel)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButton)
                    )
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(errorMsg)
                .addGap(43, 43, 43))
        );
        
    }
    
    public boolean getLogInfo(){
        return loggedIn;
    }
    
    
    
    
    //Variables
    private boolean loggedIn = false;
    private JLabel errorMsg;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JTextField usernameText;
    private JLabel loginLabel;
    private JButton loginButton;
    private JPasswordField passwordText;
    
}

