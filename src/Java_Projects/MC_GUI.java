package Java_Projects;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *This java program demonstrates encoding and decoding plain text into morse code 
 *As well as allowing the saving and opening of plain text files
 * @author User
 */
public class MC_GUI extends javax.swing.JFrame {
    
    private BufferedReader buffer;
    private File file;
    private FileReader reader;
    private FileWriter fw;
    private PrintWriter writer;
    private  final JFileChooser jfc;
    
    /**
     * Creates new form MC_GUI
     */
    public MC_GUI() {
        jfc = new JFileChooser();
        jfc.setCurrentDirectory(new File("\\"));
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        encode = new javax.swing.JButton();
        decode = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        exitB = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        open = new javax.swing.JMenuItem();
        save = new javax.swing.JMenuItem();
        exitM = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Morse Code GUI");
        setLocation(new java.awt.Point(359, 275));

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        encode.setText("Encode");
        encode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encodeActionPerformed(evt);
            }
        });

        decode.setText("Decode");
        decode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decodeActionPerformed(evt);
            }
        });

        clear.setText("Clear Text");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        exitB.setText("Exit");
        exitB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        open.setMnemonic('O');
        open.setText("Open File...");
        open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openActionPerformed(evt);
            }
        });
        jMenu1.add(open);

        save.setMnemonic('S');
        save.setText("Save File...");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jMenu1.add(save);

        exitM.setMnemonic('E');
        exitM.setText("Exit");
        exitM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMActionPerformed(evt);
            }
        });
        jMenu1.add(exitM);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(encode)
                        .addGap(18, 18, 18)
                        .addComponent(decode)
                        .addGap(18, 18, 18)
                        .addComponent(clear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addComponent(exitB)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(encode)
                    .addComponent(decode)
                    .addComponent(clear)
                    .addComponent(exitB))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void encodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encodeActionPerformed
        String input = jTextArea1.getText();
        jTextArea1.setText(Morse_Code.encode(input.toUpperCase()));
    }//GEN-LAST:event_encodeActionPerformed

    private void exitBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        jTextArea1.setText("");
        jTextArea1.setCaretPosition(0);
    }//GEN-LAST:event_clearActionPerformed

    private void decodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decodeActionPerformed
        String input = jTextArea1.getText();
        jTextArea1.setText(Morse_Code.decode(input));
    }//GEN-LAST:event_decodeActionPerformed

    private void exitMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMActionPerformed

    private void openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openActionPerformed
        int selected = jfc.showOpenDialog(this);
        if (selected == JFileChooser.APPROVE_OPTION) {
            String str;
            StringBuffer sb = new StringBuffer();
            try {
                jTextArea1.setText("");
                file = jfc.getSelectedFile();
                reader = new FileReader(file);
                buffer = new BufferedReader(reader);
                while ((str = buffer.readLine())!= null) {
                    sb.append(str);
                    sb.append('\n');
                }
                jTextArea1.setText(sb.toString());
                reader.close();
                buffer.close();
                jTextArea1.setCaretPosition(0);
            } catch (NullPointerException | IOException e) {
                JOptionPane.showConfirmDialog(this, e.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
            }
        }
        else if (selected == JFileChooser.CANCEL_OPTION || selected == JFileChooser.ERROR_OPTION) {
            //Take No Action
        }
    }//GEN-LAST:event_openActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        try {
            int returnVal = jfc.showSaveDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                fw = new FileWriter(jfc.getSelectedFile());
                writer = new PrintWriter(fw);
                String fileText = jTextArea1.getText();
                writer.print(fileText);
                fw.close();
                writer.close();
            }
            else if (returnVal == JFileChooser.CANCEL_OPTION || returnVal == JFileChooser.ERROR_OPTION) {
                //Take No Action
            }
        } catch (IOException e) {
            JOptionPane.showConfirmDialog(this, e.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_saveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
            UIManager.setLookAndFeel(
                UIManager.getSystemLookAndFeelClassName()
            );
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MC_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MC_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MC_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MC_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MC_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JButton decode;
    private javax.swing.JButton encode;
    private javax.swing.JButton exitB;
    private javax.swing.JMenuItem exitM;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JMenuItem open;
    private javax.swing.JMenuItem save;
    // End of variables declaration//GEN-END:variables
}
