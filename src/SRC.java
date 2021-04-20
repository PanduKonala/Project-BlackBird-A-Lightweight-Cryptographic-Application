package BlackBird;

import java.awt.EventQueue;
import javax.swing.UnsupportedLookAndFeelException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import java.awt.HeadlessException;
import java.io.IOException;
import java.security.InvalidKeyException;
import javax.crypto.NoSuchPaddingException;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;
import java.io.OutputStream;
import javax.crypto.CipherOutputStream;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.File;
import javax.swing.JFileChooser;
import java.net.UnknownHostException;
import java.net.InetAddress;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.LayoutStyle;
import java.awt.LayoutManager;
import java.awt.Container;
import javax.swing.GroupLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Component;
import java.awt.event.FocusListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusAdapter;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JProgressBar;
import javax.swing.JFrame;

public class SRC extends JFrame
{
    private JProgressBar ProgressBar;
    private JTextArea about;
    private JPasswordField algo;
    private JPasswordField backup;
    private JTextArea desc;
    private JTextField ext;
    private JTextField file_path;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JMenu jMenu1;
    private JMenuBar jMenuBar1;
    private JMenuItem jMenuItem1;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JPasswordField key;
    private JTextField output;
    
    public SRC() {
        this.initComponents();
    }
    
    private void initComponents() {
        this.jScrollPane1 = new JScrollPane();
        this.desc = new JTextArea();
        this.jScrollPane2 = new JScrollPane();
        this.about = new JTextArea();
        this.jPanel1 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.jLabel3 = new JLabel();
        this.jLabel4 = new JLabel();
        this.jLabel5 = new JLabel();
        this.ProgressBar = new JProgressBar();
        this.file_path = new JTextField();
        this.output = new JTextField();
        this.ext = new JTextField();
        this.jButton1 = new JButton();
        this.jButton2 = new JButton();
        this.jButton3 = new JButton();
        this.jLabel6 = new JLabel();
        this.key = new JPasswordField();
        this.algo = new JPasswordField();
        this.backup = new JPasswordField();
        this.jLabel7 = new JLabel();
        this.jMenuBar1 = new JMenuBar();
        this.jMenu1 = new JMenu();
        this.jMenuItem1 = new JMenuItem();
        this.setDefaultCloseOperation(3);
        this.setBackground(new Color(0, 0, 0));
        this.desc.setEditable(false);
        this.desc.setBackground(new Color(0, 0, 0));
        this.desc.setColumns(20);
        this.desc.setFont(new Font("Arial Narrow", 2, 24));
        this.desc.setForeground(new Color(0, 255, 0));
        this.desc.setLineWrap(true);
        this.desc.setRows(5);
        this.desc.setToolTipText("");
        this.desc.setDisabledTextColor(new Color(255, 0, 0));
        this.desc.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(final FocusEvent evt) {
                SRC.this.descFocusGained(evt);
            }
        });
        this.jScrollPane1.setViewportView(this.desc);
        this.about.setEditable(false);
        this.about.setBackground(new Color(0, 0, 0));
        this.about.setColumns(20);
        this.about.setFont(new Font("Arial Narrow", 2, 24));
        this.about.setForeground(new Color(255, 0, 0));
        this.about.setRows(5);
        this.about.setDisabledTextColor(new Color(0, 255, 0));
        this.about.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(final FocusEvent evt) {
                SRC.this.aboutFocusGained(evt);
            }
        });
        this.jScrollPane2.setViewportView(this.about);
        this.jPanel1.setBackground(new Color(0, 0, 0));
        this.jPanel1.setToolTipText("");
        this.jLabel1.setForeground(new Color(255, 255, 0));
        this.jLabel1.setText("File Input Path");
        this.jLabel2.setForeground(new Color(255, 255, 0));
        this.jLabel2.setText("File Output Name");
        this.jLabel3.setForeground(new Color(255, 255, 0));
        this.jLabel3.setText("Enter File Extension");
        this.jLabel4.setForeground(new Color(255, 255, 0));
        this.jLabel4.setText("Algorithm");
        this.jLabel5.setForeground(new Color(255, 255, 0));
        this.jLabel5.setText("Enter KEY");
        this.ProgressBar.setBackground(new Color(0, 0, 0));
        this.ProgressBar.setForeground(new Color(0, 0, 255));
        this.ProgressBar.setToolTipText("");
        this.ProgressBar.setStringPainted(true);
        this.file_path.setBackground(new Color(0, 0, 0));
        this.file_path.setForeground(new Color(0, 255, 0));
        this.file_path.setToolTipText("");
        this.output.setBackground(new Color(0, 0, 0));
        this.output.setForeground(new Color(0, 255, 0));
        this.ext.setBackground(new Color(0, 0, 0));
        this.ext.setForeground(new Color(0, 255, 0));
        this.jButton1.setBackground(new Color(0, 0, 0));
        this.jButton1.setForeground(new Color(255, 0, 0));
        this.jButton1.setText("Choose");
        this.jButton1.setToolTipText("");
        this.jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                SRC.this.jButton1ActionPerformed(evt);
            }
        });
        this.jButton2.setBackground(new Color(0, 0, 0));
        this.jButton2.setForeground(new Color(255, 0, 0));
        this.jButton2.setText("Encrypt");
        this.jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                SRC.this.jButton2ActionPerformed(evt);
            }
        });
        this.jButton3.setBackground(new Color(0, 0, 0));
        this.jButton3.setForeground(new Color(255, 0, 0));
        this.jButton3.setText("Decrypt");
        this.jButton3.setToolTipText("");
        this.jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                SRC.this.jButton3ActionPerformed(evt);
            }
        });
        this.jLabel6.setForeground(new Color(255, 255, 0));
        this.jLabel6.setText("FailSafe Name(OPTIONAL)");
        this.key.setBackground(new Color(0, 0, 0));
        this.key.setForeground(new Color(0, 255, 0));
        this.algo.setBackground(new Color(0, 0, 0));
        this.algo.setForeground(new Color(0, 255, 0));
        this.backup.setBackground(new Color(0, 0, 0));
        this.backup.setForeground(new Color(0, 255, 0));
        this.backup.setToolTipText("");
        final GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.ProgressBar, -1, -1, 32767).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jButton2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jButton3)).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.jLabel6, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.jLabel1, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.jLabel2, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.jLabel3, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.jLabel4, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.jLabel5, GroupLayout.Alignment.LEADING, -1, -1, 32767)).addGap(76, 76, 76).addComponent(this.jButton1).addGap(85, 85, 85).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.file_path, -1, 233, 32767).addComponent(this.output).addComponent(this.ext).addComponent(this.key).addComponent(this.algo).addComponent(this.backup))))));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(44, 44, 44).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel1).addComponent(this.file_path, -2, -1, -2).addComponent(this.jButton1)).addGap(71, 71, 71).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel2).addComponent(this.output, -2, -1, -2)).addGap(74, 74, 74).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel3).addComponent(this.ext, -2, -1, -2)).addGap(76, 76, 76).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel4).addComponent(this.algo, -2, -1, -2)).addGap(66, 66, 66).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jLabel5).addComponent(this.key, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 63, 32767).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel6).addComponent(this.backup, -2, -1, -2)).addGap(57, 57, 57).addComponent(this.ProgressBar, -2, -1, -2).addGap(31, 31, 31).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton2).addComponent(this.jButton3)).addGap(36, 36, 36)));
        this.jLabel7.setBackground(new Color(0, 0, 0));
        this.jLabel7.setForeground(new Color(255, 0, 0));
        this.jLabel7.setText("System Name");
        this.jMenuBar1.setBackground(new Color(0, 0, 0));
        this.jMenuBar1.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 255, 0)));
        this.jMenuBar1.setForeground(new Color(0, 255, 0));
        this.jMenuBar1.setToolTipText("");
        this.jMenu1.setBackground(new Color(0, 0, 0));
        this.jMenu1.setForeground(new Color(255, 0, 0));
        this.jMenu1.setText("Power");
        this.jMenuItem1.setBackground(new Color(0, 0, 0));
        this.jMenuItem1.setForeground(new Color(255, 0, 0));
        this.jMenuItem1.setText("KillPower");
        this.jMenuItem1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                SRC.this.jMenuItem1ActionPerformed(evt);
            }
        });
        this.jMenu1.add(this.jMenuItem1);
        this.jMenuBar1.add(this.jMenu1);
        this.setJMenuBar(this.jMenuBar1);
        final GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jScrollPane1, -2, 695, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767).addComponent(this.jScrollPane2).addGroup(layout.createSequentialGroup().addGap(10, 10, 10).addComponent(this.jLabel7, -2, 181, -2).addContainerGap()))));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jScrollPane1).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -1, -1, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel7).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jScrollPane2, -2, 112, -2)));
        this.pack();
        this.setLocationRelativeTo(null);
    }
    
    private void jMenuItem1ActionPerformed(final ActionEvent evt) {
        this.dispose();
    }
    
    private void descFocusGained(final FocusEvent evt) {
        this.desc.setText("\t\t\tPROJECT-BlackBird\n\nInstructions:-\n       This Project is based upon Symmetric-key\nalgorithms.They are:-\n\t\t1.)AES\n\t\t2.)Blowfish\n\t\t3.)DES\n\t\t4.)RC4\n--->AES:-\n   I.)AES-Advanced Encryption Standard\n   II.)KEY= \" 16 \" characters\n   III.)Reliable/Fast\n Usage---In Algorithm field type AES\n\n--->DES:-\n   I.)DES-Digital Encryption Standard\n   II.)KEY= \" 8 \" characters\n   III.)Secure/Slow\n Usage---In Algorithm field type DES\n\n--->Blowfish:-\n   I.)KEY= \" 1 to 56 \" characters\n   II.)Secure/Fast\n Usage---In Algorithm field type Blowfish\n\n--->RC4:-\n   I.)KEY= \" 8 to 128 \" characters\n   II.)Reliable/VeryFast\n Usage---In Algorithm field type RC4\n   ->/*For any error refer to these Instructions*/<-");
        this.desc.setEditable(false);
    }
    
    private void aboutFocusGained(final FocusEvent evt) {
        try {
            final InetAddress ip = InetAddress.getLocalHost();
            final String sysname;
            final String hostname = sysname = ip.getHostName();
            this.about.setText(sysname);
        }
        catch (UnknownHostException ex) {}
        this.about.setEditable(false);
    }
    
    private void jButton1ActionPerformed(final ActionEvent evt) {
        final JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        final File f = chooser.getSelectedFile();
        this.file_path.setText(f.getAbsolutePath());
        this.ProgressBar.setValue(25);
    }
    
    private void jButton2ActionPerformed(final ActionEvent evt) {
        try {
            final FileInputStream file = new FileInputStream(this.file_path.getText());
            final String nameout = this.output.getText();
            final String type = this.ext.getText();
            final FileOutputStream outStream = new FileOutputStream(nameout + "." + type);
            final String cipher = this.key.getText();
            final String ALG = this.algo.getText();
            final byte[] k = cipher.getBytes();
            final SecretKeySpec pass = new SecretKeySpec(k, ALG);
            final Cipher enc = Cipher.getInstance(ALG);
            enc.init(1, pass);
            final CipherOutputStream cos = new CipherOutputStream(outStream, enc);
            final byte[] buf = new byte[1024];
            int read;
            while ((read = file.read(buf)) != -1) {
                cos.write(buf, 0, read);
            }
            final String Failsafe = this.backup.getText();
            final File failsafe = new File(Failsafe + ".txt");
            final String input_path = this.file_path.getText();
            final String output_name = this.output.getText();
            final String extension_name = this.ext.getText();
            final String algorithm = this.algo.getText();
            final String key_pass = this.key.getText();
            final String space = "    ";
            final String networking = this.about.getText();
            final FileOutputStream fop = new FileOutputStream(failsafe);
            failsafe.createNewFile();
            final byte[] contentInBytes0 = input_path.getBytes();
            final byte[] contentInBytes2 = output_name.getBytes();
            final byte[] contentInBytes3 = extension_name.getBytes();
            final byte[] contentInBytes4 = algorithm.getBytes();
            final byte[] contentInBytes5 = key_pass.getBytes();
            final byte[] sp = space.getBytes();
            final byte[] host = networking.getBytes();
            fop.write(host);
            fop.write(sp);
            fop.write(contentInBytes0);
            fop.write(sp);
            fop.write(contentInBytes2);
            fop.write(sp);
            fop.write(contentInBytes3);
            fop.write(sp);
            fop.write(contentInBytes4);
            fop.write(sp);
            fop.write(contentInBytes5);
            fop.write(sp);
            fop.flush();
            this.ProgressBar.setValue(100);
            JOptionPane.showMessageDialog(null, "File is Encrypted");
            this.desc.setText("\t\t\tPROJECT-BlackBird\n\nInstructions:-\n       This Project is based upon Symmetric-key\nalgorithms.They are:-\n\t\t1.)AES\n\t\t2.)Blowfish\n\t\t3.)DES\n\t\t4.)RC4/RC2\n--->AES:-\n   I.)AES-Advanced Encryption Standard\n   II.)KEY= \" 16 \" characters\n   III.)Reliable/Fast\n Usage---In Algorithm field type AES\n\n--->DES:-\n   I.)DES-Digital Encryption Standard\n   II.)KEY= \" 8 \" characters\n   III.)Secure/Slow\n Usage---In Algorithm field type DES\n\n--->Blowfish:-\n   I.)KEY= \" 1 to 56 \" characters\n   II.)Secure/Fast\n Usage---In Algorithm field type Blowfish\n\n--->RC4/RC2:-\n   I.)KEY= \" 8 to 128 \" characters\n   II.)Reliable/VeryFast\n Usage---In Algorithm field type RC4/RC2\n   ->/*For any error refer to these Instructions*/<-");
            this.key.setText("");
            this.algo.setText("");
            this.backup.setText("");
            this.ext.setText("");
            this.output.setText("");
            this.file_path.setText("");
            this.ProgressBar.setValue(0);
        }
        catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IOException | HeadlessException ex2) {
            final Exception ex;
            final Exception e = ex;
            JOptionPane.showMessageDialog(null, "Missing Info...Please Read the instructions and proceed ");
        }
    }
    
    private void jButton3ActionPerformed(final ActionEvent evt) {
        try {
            final FileInputStream file = new FileInputStream(this.file_path.getText());
            final String nameout = this.output.getText();
            final String type = this.ext.getText();
            final FileOutputStream outStream = new FileOutputStream(nameout + "." + type);
            final String cipher = this.key.getText();
            final String ALG = this.algo.getText();
            final byte[] k = cipher.getBytes();
            final SecretKeySpec pass = new SecretKeySpec(k, ALG);
            final Cipher enc = Cipher.getInstance(ALG);
            enc.init(2, pass);
            final CipherOutputStream cos = new CipherOutputStream(outStream, enc);
            final byte[] buf = new byte[1024];
            int read;
            while ((read = file.read(buf)) != -1) {
                cos.write(buf, 0, read);
            }
            final String Failsafe = this.backup.getText();
            final File failsafe = new File(Failsafe + ".txt");
            final String input_path = this.file_path.getText();
            final String output_name = this.output.getText();
            final String extension_name = this.ext.getText();
            final String algorithm = this.algo.getText();
            final String key_pass = this.key.getText();
            final String space = "    ";
            final String networking = this.about.getText();
            final FileOutputStream fop = new FileOutputStream(failsafe);
            failsafe.createNewFile();
            final byte[] contentInBytes0 = input_path.getBytes();
            final byte[] contentInBytes2 = output_name.getBytes();
            final byte[] contentInBytes3 = extension_name.getBytes();
            final byte[] contentInBytes4 = algorithm.getBytes();
            final byte[] contentInBytes5 = key_pass.getBytes();
            final byte[] sp = space.getBytes();
            final byte[] host = networking.getBytes();
            fop.write(host);
            fop.write(sp);
            fop.write(contentInBytes0);
            fop.write(sp);
            fop.write(contentInBytes2);
            fop.write(sp);
            fop.write(contentInBytes3);
            fop.write(sp);
            fop.write(contentInBytes4);
            fop.write(sp);
            fop.write(contentInBytes5);
            fop.write(sp);
            fop.flush();
            this.ProgressBar.setValue(100);
            JOptionPane.showMessageDialog(null, "File is Decrypted");
            this.desc.setText("\t\t\tPROJECT-BlackBird\n\nInstructions:-\n       This Project is based upon Symmetric-key\nalgorithms.They are:-\n\t\t1.)AES\n\t\t2.)Blowfish\n\t\t3.)DES\n\t\t4.)RC4\n--->AES:-\n   I.)AES-Advanced Encryption Standard\n   II.)KEY= \" 16 \" characters\n   III.)Reliable/Fast\n Usage---In Algorithm field type AES\n\n--->DES:-\n   I.)DES-Digital Encryption Standard\n   II.)KEY= \" 8 \" characters\n   III.)Secure/Slow\n Usage---In Algorithm field type DES\n\n--->Blowfish:-\n   I.)KEY= \" 1 to 56 \" characters\n   II.)Secure/Fast\n Usage---In Algorithm field type Blowfish\n\n--->RC4:-\n   I.)KEY= \" 8 to 128 \" characters\n   II.)Reliable/VeryFast\n Usage---In Algorithm field type RC4\n   ->/*For any error refer to these Instructions*/<-");
            this.key.setText("");
            this.algo.setText("");
            this.backup.setText("");
            this.ext.setText("");
            this.output.setText("");
            this.file_path.setText("");
            Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler " + nameout + "." + type);
            this.ProgressBar.setValue(0);
        }
        catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IOException | HeadlessException ex2) {
            final Exception ex;
            final Exception e = ex;
            JOptionPane.showMessageDialog(null, "Missing Info...Please Read the instructions and proceed ");
        }
    }
    
    public static void main(final String[] args) {
        try {
            for (final UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(SRC.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex2) {
            Logger.getLogger(SRC.class.getName()).log(Level.SEVERE, null, ex2);
        }
        catch (IllegalAccessException ex3) {
            Logger.getLogger(SRC.class.getName()).log(Level.SEVERE, null, ex3);
        }
        catch (UnsupportedLookAndFeelException ex4) {
            Logger.getLogger(SRC.class.getName()).log(Level.SEVERE, null, ex4);
        }
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000L);
                }
                catch (Exception ex) {}
                new SRC().setVisible(true);
            }
        });
    }
}