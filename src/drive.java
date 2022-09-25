
import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.util.StringTokenizer;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author mohammedhamdy32
 */
public class drive extends javax.swing.JFrame {

     
    long currentFrame;Clip clip;boolean runn=true;
        AudioInputStream ai ;
Image img  = Toolkit.getDefaultToolkit().getImage("Untitled-1.jpg");
File ff;    
boolean su=false,home=true;
/**
     * Creates new form NewJFrame
     * @param x
     */
//when given 1 or >1 as argument user is enabled
public void setuser(int x)
{
    su = (x>=1);
}
public void user()
{
    jButton4.setVisible(false);
   jButton4.setEnabled(false);
    jButton6.setVisible(false);
   jButton6.setEnabled(false);
    jButton1.setVisible(false);
   jButton1.setEnabled(false);
    jButton3.setVisible(false);
   jButton3.setEnabled(false);
    
}
public void Sound()
{  
        try{
        ai=AudioSystem.getAudioInputStream(new File("WhatsApp-Ptt-2022-07-16-at-8.34.05-PM.WAV"));
        clip=AudioSystem.getClip();
        clip.open(ai);
        clip.loop(clip.LOOP_CONTINUOUSLY);
        }
        catch(UnsupportedAudioFileException e)
        {
        JOptionPane.showMessageDialog(this,"Cannot reeeead file","Error",JOptionPane.ERROR_MESSAGE);
        }
        catch(IOException e)
        {
        JOptionPane.showMessageDialog(this,"Cannot reaaad file","Error",JOptionPane.ERROR_MESSAGE);
        }
         catch(LineUnavailableException e)
        {
        JOptionPane.showMessageDialog(this,"Cannot read file","Error",JOptionPane.ERROR_MESSAGE);
        }
}

public int getImgHeight()
    {
        return getBounds().height;
    }
    public int getImgWidth()
    {
        return   getBounds().width;
    }
    public int getImgpos()
    {
        return (int)((getBounds().width-getImgWidth())/2);
    }
    public void precon()
    {
       
        Color c = new Color(169,159,196);
         JPanel p = new JPanel(){public void paintComponent(Graphics g)
                {
                   super.paintComponent(g);
                   g.drawImage(img, getImgpos(), 0,getImgWidth(), getImgHeight(), null);
                }};
         
        
         
         
         boolean y =false;
         File f = new File(System.getProperty("user.dir"));
         String[]b =f.list();
         for(String z:b)
         {
             if (z=="subject")
                 y=true;
         }
         if(y==false)
         {
              File u = new File("Subject");
         u.mkdir();
         }
        p.setBackground(c);
        setContentPane(p);
    }
    public drive() {
        setuser(dbjframe.t);
//        if(dbjframe.t==0){
//        jButton7.setVisible(false);
//        jButton8.setVisible(false);
//        }
        precon();
        initComponents();
         jList1.setCellRenderer(new DefaultListCellRenderer(){public Component getListCellRendererComponent(
       JList<?> list,           // the list
       Object value,            // value to display
       int index,               // cell index
       boolean isSelected,      // is the cell selected
       boolean cellHasFocus)    // does the cell have focus
     {
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
         setOpaque(isSelected);
         return this;
        }
        });
         jList1.setOpaque(false);
       //  jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        if(su==false){
            jButton4.setVisible(false);
   jButton4.setEnabled(false);
    jButton6.setVisible(false);
   jButton6.setEnabled(false);}
        else{user();}
        jButton7.setVisible(true);
        jButton7.setEnabled(true);
        jButton8.setVisible(false);
        jButton8.setEnabled(false);
     Sound();
 refereshLiist();
    }
     public void refereshLiist()
         {
             File f =new File("Subject");
String[] content=f.list(),s=new String[1];
s[0]="Empty";
 if(content.length==0)
 { jList1.setListData(s);}
 else{
jList1.setListData(content);
 }
 home=true;
         }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox("Enable sound",true);
        jButton8 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCheckBox1.setText("Enable sound");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 13, 149, -1));

        jButton8.setText("Admin");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 77, -1, -1));

        jButton1.setText("Remove Subject");
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, 340, 40));

        jList1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jList1.setForeground(new java.awt.Color(255, 255, 255));
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setOpaque(false);
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1actio(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 109, 727, 335));

        jButton3.setText("Add Subject");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 457, 360, 40));

        jButton2.setText("Home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 13, 151, 89));

        jButton4.setText("Add File");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 340, 40));

        jButton6.setText("Remove File");
        jButton6.setFocusPainted(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 510, 350, 40));

        jButton5.setText("Close");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 13, 151, 89));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Untitled-1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -10, 820, 650));

        jButton7.setText("user");
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:

        if(runn==true)
        {
            clip.stop();
            runn=false;
        }
        else{
            clip.start();
            runn=true;
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        su=false;
        jButton7.setVisible(true);
        jButton7.setEnabled(true);
        jButton8.setVisible(false);
        jButton8.setEnabled(false);
        if(su==false){    jButton1.setVisible(true);
            jButton1.setEnabled(true);
            jButton3.setVisible(true);
            jButton3.setEnabled(true);

            jButton4.setVisible(false);
            jButton4.setEnabled(false);
            jButton6.setVisible(false);
            jButton6.setEnabled(false);}
        refereshLiist();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(this,"Are you sure you will delete this subject with all its components","Delete Subject",JOptionPane.WARNING_MESSAGE);
        if(a==JOptionPane.OK_OPTION)
        {
            //JOptionPane.showMessageDialog(this, "File","hi",JOptionPane.ERROR_MESSAGE);
            File f = new File("Subject//"+jList1.getSelectedValue());
            if(f.delete())
            {
                JOptionPane.showMessageDialog(this,"Done","File deleted",JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(this, " file not deleted errors encounterd ","File not deleted",JOptionPane.ERROR_MESSAGE);
            }
        }
        else
        { JOptionPane.showMessageDialog(this, " file not deleted errors encounterd ","File not deleted",JOptionPane.ERROR_MESSAGE);}
        refereshLiist();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jList1actio(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1actio
        // TODO add your handling code here:
        if(evt.getClickCount()==2){
            if(home)
            {
                ff = new File("Subject\\"+jList1.getSelectedValue());
                    String []listData= ff.list();
                    if(su==false){
                        jButton1.setVisible(false);
                        jButton1.setEnabled(false);
                        jButton3.setVisible(false);
                        jButton3.setEnabled(false);

                        jButton4.setVisible(true);
                        jButton4.setEnabled(true);
                        jButton6.setVisible(true);
                        jButton6.setEnabled(true);}
                    jList1.setListData(listData);
                    home=false;
                }
                else{

                    try {
                        File myfile = new File(ff.getPath()+"\\"+jList1.getSelectedValue());
                            Desktop.getDesktop().open(myfile);
                        } catch (IOException ex) {
                            JOptionPane.showMessageDialog(this, "Error may be no program to open the pdf", "Cannot open file",JOptionPane.ERROR_MESSAGE);
                        }
                    }
    }//GEN-LAST:event_jList1actio
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String name =    JOptionPane.showInputDialog(this,"Please Enter Subject Name");
        if(name!=null)
        {
            File f = new File("Subject\\"+name);

                boolean c=  f.mkdir();
                if(c==false)
                JOptionPane.showMessageDialog(this, "Cannot add Subject may be it already exists","Error",JOptionPane.ERROR_MESSAGE);
                refereshLiist();
            }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(su==false){    jButton1.setVisible(true);
            jButton1.setEnabled(true);
            jButton3.setVisible(true);
            jButton3.setEnabled(true);

            jButton4.setVisible(false);
            jButton4.setEnabled(false);
            jButton6.setVisible(false);
            jButton6.setEnabled(false);}
        refereshLiist();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        JFileChooser fc= new JFileChooser();
        int ret=  fc.showOpenDialog(null);
        File f;byte[] gg ;InputStream is;OutputStream os;int length; String name;
        try{

            if(ret==JFileChooser.APPROVE_OPTION)
            {

                f=fc.getSelectedFile();
                StringTokenizer stk = new StringTokenizer(f.getPath(),"\\");
                    name=stk.nextToken();
                    while(stk.hasMoreTokens())
                    {
                        name=stk.nextToken();
                    }
                    gg=Files.readAllBytes(f.toPath());
                    //is=new BufferedInputStream(new FileInputStream(f.getPath()));
                    os=new BufferedOutputStream(new FileOutputStream(ff.getPath()+"\\"+name));
                        // while( is.read(gg)>0)
                        //{
                            os.write(gg);
                            //}
                        //     is.close();
                        os.close();
                    }
                    String[]content=ff.list();
                    jList1.setListData(content);
                }
                catch(IOException e)
                {
                    System.out.println("Cannot open File");
                }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        File del = new File(ff.getPath()+"\\"+jList1.getSelectedValue());
            int a=JOptionPane.showConfirmDialog(this,"Are you sure you will delete this subject with all its components","Delete Subject",JOptionPane.WARNING_MESSAGE);
            if(a==JOptionPane.OK_OPTION)
            {
                if(del.delete())
                {
                    JOptionPane.showMessageDialog(this,"Done","File deleted",JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(this,"Unsucessful","File not deleted",JOptionPane.ERROR_MESSAGE);
                }
            }
            String[]content = ff.list();
            jList1.setListData(content);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(drive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(drive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(drive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(drive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new drive().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
