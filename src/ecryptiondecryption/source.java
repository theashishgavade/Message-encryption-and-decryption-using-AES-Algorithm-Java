package ecryptiondecryption;

import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;


public class source extends javax.swing.JFrame {

    /**
     * Creates new form EncryptDecrypt
     */
    private static SecretKeySpec secretKey;
    private static byte[] key;
    public static void setKey(String myKey)
    {
        MessageDigest sha = null;
        try {
            key = myKey.getBytes("UTF-8");
            sha = MessageDigest.getInstance("SHA-1");
            key = sha.digest(key);
            key = Arrays.copyOf(key, 16);
            secretKey = new SecretKeySpec(key, "AES");
        }
        catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
    public source() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        text1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        text2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        text3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        text4 = new javax.swing.JTextArea();
        msg1 = new javax.swing.JTextField();
        msg2 = new javax.swing.JTextField();
        encrypt = new javax.swing.JButton();
        decrypt = new javax.swing.JButton();
        copyencrypt = new javax.swing.JButton();
        copydecrypt = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        message1 = new javax.swing.JLabel();
        message2 = new javax.swing.JLabel();
        mainsection = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Encryption and Decryption ");
        setAlwaysOnTop(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        text1.setBackground(new java.awt.Color(255, 255, 255));
        text1.setColumns(20);
        text1.setFont(new java.awt.Font("Dialog", 0, 14)); 
        text1.setForeground(new java.awt.Color(0, 0, 0));
        text1.setRows(5);
        text1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jScrollPane1.setViewportView(text1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(80, 80, 300, 120);

        text2.setBackground(new java.awt.Color(255, 255, 255));
        text2.setColumns(20);
        text2.setFont(new java.awt.Font("Dialog", 0, 14)); 
        text2.setForeground(new java.awt.Color(0, 0, 0));
        text2.setRows(5);
        text2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jScrollPane2.setViewportView(text2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(80, 322, 300, 120);

        text3.setBackground(new java.awt.Color(255, 255, 255));
        text3.setColumns(20);
        text3.setFont(new java.awt.Font("Dialog", 0, 14)); 
        text3.setForeground(new java.awt.Color(0, 0, 0));
        text3.setRows(5);
        text3.setToolTipText("");
        text3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jScrollPane3.setViewportView(text3);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(470, 80, 320, 120);

        text4.setBackground(new java.awt.Color(255, 255, 255));
        text4.setColumns(20);
        text4.setFont(new java.awt.Font("Dialog", 0, 14)); 
        text4.setForeground(new java.awt.Color(0, 0, 0));
        text4.setRows(5);
        text4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jScrollPane4.setViewportView(text4);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(470, 320, 320, 120);

        msg1.setBackground(new java.awt.Color(255, 255, 255));
        msg1.setForeground(new java.awt.Color(0, 0, 0));
        msg1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(msg1);
        msg1.setBounds(200, 220, 180, 30);

        msg2.setBackground(new java.awt.Color(255, 255, 255));
        msg2.setForeground(new java.awt.Color(0, 0, 0));
        msg2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(msg2);
        msg2.setBounds(595, 220, 190, 30);

        encrypt.setBackground(new java.awt.Color(0, 51, 51));
        encrypt.setFont(new java.awt.Font("Dialog", 1, 14)); 
        encrypt.setForeground(new java.awt.Color(255, 255, 255));
        encrypt.setText("Encrypt");
        encrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encryptActionPerformed(evt);
            }
        });
        getContentPane().add(encrypt);
        encrypt.setBounds(80, 275, 90, 30);

        decrypt.setBackground(new java.awt.Color(0, 51, 51));
        decrypt.setFont(new java.awt.Font("Dialog", 1, 14)); 
        decrypt.setForeground(new java.awt.Color(255, 255, 255));
        decrypt.setText("Decrypt");
        decrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decryptActionPerformed(evt);
            }
        });
        getContentPane().add(decrypt);
        decrypt.setBounds(470, 275, 90, 30);

        copyencrypt.setBackground(new java.awt.Color(102, 0, 0));
        copyencrypt.setFont(new java.awt.Font("Dialog", 1, 12)); 
        copyencrypt.setForeground(new java.awt.Color(255, 255, 255));
        copyencrypt.setText("Copy Encryption");
        copyencrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyencryptActionPerformed(evt);
            }
        });
        getContentPane().add(copyencrypt);
        copyencrypt.setBounds(240, 275, 140, 30);

        copydecrypt.setBackground(new java.awt.Color(102, 0, 0));
        copydecrypt.setFont(new java.awt.Font("Dialog", 1, 12)); 
        copydecrypt.setForeground(new java.awt.Color(255, 255, 255));
        copydecrypt.setText("Copy Decryption");
        copydecrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copydecryptActionPerformed(evt);
            }
        });
        getContentPane().add(copydecrypt);
        copydecrypt.setBounds(633, 275, 150, 30);

        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(810, 5, 30, 20);

        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(780, 5, 30, 20);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); 
        jLabel1.setForeground(new java.awt.Color(204, 51, 0));
        jLabel1.setText("Encryption Key");
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 220, 120, 30);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); 
        jLabel4.setForeground(new java.awt.Color(204, 51, 0));
        jLabel4.setText("Decryption Key");
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(470, 220, 120, 30);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); 
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Message to Decrypt");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(470, 50, 300, 30);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); 
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Message to Encrypt ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(80, 50, 300, 30);

        message1.setForeground(new java.awt.Color(204, 0, 0));
        message1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(message1);
        message1.setBounds(80, 450, 300, 20);

        message2.setForeground(new java.awt.Color(204, 0, 0));
        message2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(message2);
        message2.setBounds(470, 450, 320, 20);

        mainsection.setForeground(new java.awt.Color(153, 0, 0));
        mainsection.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/edcrypt.png"))); 
        mainsection.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(mainsection);
        mainsection.setBounds(0, 0, 850, 500);

        setSize(new java.awt.Dimension(850, 499));
        setLocationRelativeTo(null);
    }

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {
        
        System.exit(0);
        
    }

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {
        
        this.setState(Frame.ICONIFIED); 
    }

    private void encryptActionPerformed(java.awt.event.ActionEvent evt) {
        String strToEncrypt;
        String secret;
        try
        {
            strToEncrypt=text1.getText();
            secret=msg1.getText();
            setKey(secret);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            text2.setText(Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes("UTF-8"))));
            
        }
        catch (Exception e)
        {
            text2.setText("Please fill up the right secret key");
            
        }        
    }

    private void copyencryptActionPerformed(java.awt.event.ActionEvent evt) {
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(text2.getText()),null);
        message1.setText("Your encryption result is copied!");
        message2.setText("");
    }

    private void decryptActionPerformed(java.awt.event.ActionEvent evt) {
        String secret;
        String strToDecrypt;
        try
        {
            secret=msg2.getText();
            strToDecrypt=text3.getText();
            setKey(secret);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            text4.setText(new String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt))));
        }
        catch (Exception e)
        {
            text4.setText("Please fill up the right secret key");
        }
    }

    private void copydecryptActionPerformed(java.awt.event.ActionEvent evt) {
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(text4.getText()),null);
        message2.setText("Your decryption result is copied!");
        message1.setText("");
    }


    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(source.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(source.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(source.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(source.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new source().setVisible(true);
            }
        });
    }

    private javax.swing.JButton copydecrypt;
    private javax.swing.JButton copyencrypt;
    private javax.swing.JButton decrypt;
    private javax.swing.JButton encrypt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel mainsection;
    private javax.swing.JLabel message1;
    private javax.swing.JLabel message2;
    private javax.swing.JTextField msg1;
    private javax.swing.JTextField msg2;
    private javax.swing.JTextArea text1;
    private javax.swing.JTextArea text2;
    private javax.swing.JTextArea text3;
    private javax.swing.JTextArea text4;
    
}
