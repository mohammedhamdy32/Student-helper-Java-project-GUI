
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author mohammedhamdy32
 */
public class playMo extends javax.swing.JFrame {

    /**
     * Creates new form playMo
     */
       int p1 ,p2,money_p1,money_p2;
   String n1=" first player ",n2=" second player ";
   boolean turn;
    int owenr=0;
   int owenr2=0;
   int owenr3=0;
    public playMo() {
        initComponents();
        jLabel17.setVisible(false);
        jButton2.setVisible(false);
        a0.setVisible(true); a1.setVisible(false); a2.setVisible(false);
        a3.setVisible(false); a4.setVisible(false); a5.setVisible(false);
        a6.setVisible(false); a7.setVisible(false); a8.setVisible(false);
        a9.setVisible(false); a10.setVisible(false); a11.setVisible(false);
        b0.setVisible(true); b1.setVisible(false); b2.setVisible(false);
        b3.setVisible(false); b4.setVisible(false); b5.setVisible(false); 
        b6.setVisible(false); b7.setVisible(false); b8.setVisible(false);
        b9.setVisible(false); b10.setVisible(false); b11.setVisible(false);
        p1=0;
        p2=0;
        money_p1=1500;
        
        money_p2=1500;
        boolean turn=false;
    }
     public playMo(String n1 , String n2)
    {
        this();
        this.n1=n1;
        this.n2=n2;
    }
       public void reset (){
        jLabel17.setVisible(false);
        jButton2.setVisible(false);
        a0.setVisible(true); a1.setVisible(false); a2.setVisible(false);
        a3.setVisible(false); a4.setVisible(false); a5.setVisible(false);
        a6.setVisible(false); a7.setVisible(false); a8.setVisible(false);
        a9.setVisible(false); a10.setVisible(false); a11.setVisible(false);
        b0.setVisible(true); b1.setVisible(false); b2.setVisible(false);
        b3.setVisible(false); b4.setVisible(false); b5.setVisible(false); 
        b6.setVisible(false); b7.setVisible(false); b8.setVisible(false);
        b9.setVisible(false); b10.setVisible(false); b11.setVisible(false);
        p1=0;
        p2=0;
        money_p1=1500;
        money_p2=1500;
        boolean turn=false;
    }
    
    public void remove_current_ratio_button(int p )
    { 
        if(p==1){
            /*
        if(p1==0)
            a0.setVisible(false);
        else if(p1==1)
            a1.setVisible(false);
        else if(p1==2)
            a2.setVisible(false);
        else if(p1==3)
            a3.setVisible(false);
        else if(p1==4)
            a4.setVisible(false);
        else if(p1==5)
            a5.setVisible(false);
        else if(p1==6)
            a6.setVisible(false);
        else if(p1==7)
            a7.setVisible(false);
        else if(p1==8)
            a8.setVisible(false);
        else if(p1==9)
            a9.setVisible(false);
        else if(p1==10)
            a10.setVisible(false);
        else if(p1==11)
            a11.setVisible(false);
            */
         a0.setVisible(false); a1.setVisible(false); a2.setVisible(false);
        a3.setVisible(false); a4.setVisible(false); a5.setVisible(false);
        a6.setVisible(false); a7.setVisible(false); a8.setVisible(false);
        a9.setVisible(false); a10.setVisible(false); a11.setVisible(false);}
        else
         if(p==2){
             /*
        if(p2==0)
            b0.setVisible(false);
        else if(p2==1)
            b1.setVisible(false);
        else if(p2==2)
            b2.setVisible(false);
        else if(p2==3)
            b3.setVisible(false);
        else if(p2==4)
            b4.setVisible(false);
        else if(p2==5)
            b5.setVisible(false);
        else if(p2==6)
            b6.setVisible(false);
        else if(p2==7)
            b7.setVisible(false);
        else if(p2==8)
            b8.setVisible(false);
        else if(p2==9)
           b9.setVisible(false);
        else if(p2==10)
            b10.setVisible(false);
        else if(p2==11)
            b11.setVisible(false);
             */
          b0.setVisible(false); b1.setVisible(false); b2.setVisible(false);
        b3.setVisible(false); b4.setVisible(false); b5.setVisible(false); 
        b6.setVisible(false); b7.setVisible(false); b8.setVisible(false);
        b9.setVisible(false); b10.setVisible(false); b11.setVisible(false);}
         else System.out.println("the number of player is wrong");
    }
    
    void set_p(int p ,int rand)
    {
        if (p==1){
       if((int)(p1+rand)/12==1)
        money_p1=money_p1+200;
        p1=(p1+rand)%12;
        
        }
        else if(p==2)
        {
          if((int)(p2+rand)/12==1)
           money_p2=money_p2+200;
         p2=(p2+rand)%12;
         
        }
        else  System.out.println("the number of player is wrong");
    }
    
    void win ()
    {
       
         if(money_p2<=0){
            JOptionPane.showMessageDialog(this, "congurtulate  "+n1+" wins   \n press OK to play agian");
           reset();
        }
        if(money_p2<=0) {
            JOptionPane.showMessageDialog(this, "congurtulate  "+n2+" wins   \n press OK to play agian");
           reset();
        }
    }
    void action_index_0 (int p)
    {
//        if(p==1){
//            JOptionPane.showMessageDialog(this, "congurtulate  "+n1+" wins   \n press OK to play agian");
//           reset();
//        }
//        else {
//            JOptionPane.showMessageDialog(this, "congurtulate  "+n2+" wins   \n press OK to play agian");
//           reset();
//        }
    }
    
     void action_index_1 (int p)
     {
        
         if(owenr==0)
         {
            int x= JOptionPane.showConfirmDialog(this, "Do you want to buy this water company\nIt's price is 500 L.E");
            if(x==0){
                owenr=p;
                if(p==1)
                    money_p1=money_p1-500;
                else
                    money_p2=money_p2-500;
            }
          
         }else
         if(p!=owenr){
            if(p==1) 
            {
            money_p1=money_p1-200;
             money_p2=money_p2+200;
             JOptionPane.showMessageDialog(this, p1+", you are in  water company of "+p2+"pay 200L.E for "+p2);
            }else
            {
                money_p1=money_p1+200;
             money_p2=money_p2-200;
              JOptionPane.showMessageDialog(this, p2+", you are in water comapny of "+p1+"pay 200L.E for "+p1);

            }
               
         }
         
     }
     
      void action_index_2 (int p)
     {
          random_action(p);
     }
      
      void action_index_3(int p)
    {
        if(p==1)
        {
            p1=(p1-2)%12;
            JOptionPane.showMessageDialog(this, n1+" will back two steps ");
        } else {
            p2=(p2-2)%12;
            JOptionPane.showMessageDialog(this, n2+" will back two steps ");
        }
    }
      
      void action_index_4(int p)
    {
      
         if(owenr3==0)
         {
            int x= JOptionPane.showConfirmDialog(this, "Do you want to buy train station?\nIt's price is 300 L.E");
            if(x==0){
                owenr3=p;
                if(p==1)
                    money_p1=money_p1-300;
                else
                    money_p2=money_p2-300;
            }
          
         }else
         if(p!=owenr3){
            if(p==1) 
            {
            money_p1=money_p1-100;
             money_p2=money_p2+100;
             JOptionPane.showMessageDialog(this, p1+", you are in train station of "+p2+" pay 100L.E for "+p2);
            }else
            {
                money_p1=money_p1+100;
             money_p2=money_p2-100;
              JOptionPane.showMessageDialog(this, p2+", you are in train station of "+p1+" pay 100L.E for "+p1);

            }
               
         }   
    }
      
      void action_index_5(int p)
    {
        if(p==1)
        {
            money_p1=money_p1-200;
            JOptionPane.showMessageDialog(this, n1+" you lose 200 L.E");
        } else {
            money_p2=money_p2-200;
            JOptionPane.showMessageDialog(this, n2+" you lose 200 L.E");
        }
    }
      
    void action_index_6(int p)
    {
        if(p==1){
     /*  jLabel15.setText("The turn of "+n1);
        JOptionPane.showMessageDialog(this, n1+" will play again ");
        jLabel17.setVisible(false);
        jButton2.setVisible(false);
        jLabel1.setVisible(true);
        jButton1.setVisible(true);*/
        turn=false;
        JOptionPane.showMessageDialog(this, n1+" will play again ");
        }
        else
        {
              /*jLabel15.setText("The turn of "+n2);
        JOptionPane.showMessageDialog(this,n2+" will play again ");
        jLabel17.setVisible(true);
        jButton2.setVisible(true);
        jLabel1.setVisible(false);
        jButton1.setVisible(false); */
            turn=true;
            JOptionPane.showMessageDialog(this, n2+" will play again ");
        }
    }
    
    void action_index_7(int p)
    {
        if(owenr2==0)
         {
            int x= JOptionPane.showConfirmDialog(this, "Do you want to buy electric company?\nIt's price is 200 L.E");
            if(x==0){
                owenr2=p;
                if(p==1)
                    money_p1=money_p1-200;
                else
                    money_p2=money_p2-200;
            }
          
         }else
         if(p!=owenr2){
            if(p==1) 
            {
            money_p1=money_p1-50;
             money_p2=money_p2+50;
             JOptionPane.showMessageDialog(this, p1+", you are in electric company of "+p2+" pay 50L.E for "+p2);
            }else
            {
                money_p1=money_p1+50;
             money_p2=money_p2-50;
              JOptionPane.showMessageDialog(this, p2+", you are in electric company of "+p1+" pay 50L.E for "+p1);

            }
               
         }
    }
    void action_index_8(int p)
    {
                random_action(p);

    }
     
     void action_index_9 (int p)
     {
         if(p==1){
         p1=4;
          JOptionPane.showMessageDialog(this, n1+" will back to index 4 ");}
         else {
             p2=4;
            JOptionPane.showMessageDialog(this, n2+" will back to index 4 ");
         }
     }
     
     void action_index_10(int p)
    {
        if(p==1)
        {
           money_p1=money_p1+100;
           JOptionPane.showMessageDialog(this, n1+"  wins 100 L.E");
        } else {
            money_p2=money_p2+100;
           JOptionPane.showMessageDialog(this, n2+"  wins 100 L.E");
        }
    }
     
     void action_index_11(int p)
    {
        if(p==1)
        {
            JOptionPane.showMessageDialog(this, "Unfortunately, "+p1+" will pay 500L.E");
            money_p1=money_p1-500;
            
        } else {
           JOptionPane.showMessageDialog(this, "Unfortunately, "+p2+" will pay 500L.E");
            money_p2=money_p2-500;
        }
    }
     
     void total_actions(int p)
     {
         if(p==1){
         if(p1==3)
          action_index_3 (1);
      if(p1==9)
          action_index_9(1);
      if(p1==0)
          action_index_0(1);
       if(p1==1)
          action_index_1 (1);
        if(p1==2)
          action_index_2 (1);
         if(p1==4)
          action_index_4 (1);
          if(p1==5)
           action_index_5 (1);
          if(p1==6)
              action_index_6(1);
           if(p1==7)
          action_index_7 (1);
            if(p1==8)
          action_index_8 (1);
             if(p1==10)
          action_index_10 (1);
              if(p1==11)
          action_index_11 (1);}
         else
         {
              if(p2==3)
          action_index_3 (2);
      if(p2==9)
          action_index_9(2);
      if(p2==0)
          action_index_0(2);
       if(p2==1)
          action_index_1 (2);
        if(p2==2)
          action_index_2 (2);
         if(p2==4)
          action_index_4 (2);
          if(p2==5)
          action_index_5 (2);
          if(p==6)
              action_index_6(2);
           if(p2==7)
          action_index_7 (2);
            if(p2==8)
          action_index_8 (2);
             if(p2==10)
          action_index_10 (2);
              if(p2==11)
          action_index_11 (2);
         }
     }
    
     void open_ratio_button(int p)
     {
         if(p==1)
         {
                if(p1==0)
        {
           a0.setVisible(true);
        }
        else if(p1==1)
        {
            a1.setVisible(true);    
        }
        else if(p1==2){
            a2.setVisible(true);
        }
        else if(p1==3){
            a3.setVisible(true);
        }
        else if(p1==4){
            a4.setVisible(true);
        }
        else if(p1==5){
            a5.setVisible(true);   
        }
        else if(p1==6){
            a6.setVisible(true);
        }
        else if(p1==7){
            a7.setVisible(true);
        }
        else if(p1==8){
            a8.setVisible(true);
        }
        else if(p1==9){
            a9.setVisible(true);
        }
        else if(p1==10){
            a10.setVisible(true);     
        }
        else if(p1==11){
            a11.setVisible(true);
        }
         }
         if(p==2)
         {
         if(p2==0)
        {
           b0.setVisible(true);
        }
        else if(p2==1)
        {
            b1.setVisible(true);    
        }
        else if(p2==2){
            b2.setVisible(true);
        }
        else if(p2==3){
            b3.setVisible(true);
        }
        else if(p2==4){
            b4.setVisible(true);
        }
        else if(p2==5){
            b5.setVisible(true);   
        }
        else if(p2==6){
            b6.setVisible(true);
        }
        else if(p2==7){
            b7.setVisible(true);
        }
        else if(p2==8){
            b8.setVisible(true);
        }
        else if(p2==9){
            b9.setVisible(true);
        }
        else if(p2==10){
            b10.setVisible(true);     
        }
        else if(p2==11){
            b11.setVisible(true);
        }
         }
     }
     
     void next_turn(int p)
     {
          if(p==1)
         {
             if(p1!=6)
        {
        jLabel15.setText("The turn of "+n2);
        jLabel17.setVisible(true);
        jButton2.setVisible(true);
        jLabel1.setVisible(false);
        jButton1.setVisible(false); }else
        {
            action_index_6(1);         
        }
         }
         else {
             if(p2!=6){
        jLabel15.setText("The turn of "+n1);
        jLabel17.setVisible(false);
        jButton2.setVisible(false);
        jLabel1.setVisible(true);
        jButton1.setVisible(true);
        } else
        {
                action_index_6(2);
        }
         }
     }
     
     void random_action(int p)
     {
          extraprogect.RandomDie f=new extraprogect.RandomDie();
          int r=f.ran_2();
         if(p==1)
         {
             if(r==1)
             {
                 p1=0;
                 JOptionPane.showMessageDialog(this, n1 +" will back to start point ");
             }
             if(r==2)
             {
                 money_p1=money_p1-500;
                 JOptionPane.showMessageDialog(this, n1 + ",We will take 500 L.E as taxes ");
             }
             if(r==3)
             {
                 money_p1=money_p1+200;
                 JOptionPane.showMessageDialog(this, n1+"the bank will give you 200 L.E");
             } }else {
                  if(r==1)
             {
                 p2=0;
                 JOptionPane.showMessageDialog(this, n2 +" will back to start point ");
             }
             if(r==2)
             {
                 money_p2=money_p2-200;
                 JOptionPane.showMessageDialog(this, n2 + ",We will take 200 L.E as taxes ");
             }
             if(r==3)
             {
                 money_p2=money_p2+300;
                 JOptionPane.showMessageDialog(this, n2+"the bank will give you 300 L.E");
             }
             
         }
         
         
     }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        a0 = new javax.swing.JRadioButton();
        a1 = new javax.swing.JRadioButton();
        a2 = new javax.swing.JRadioButton();
        b3 = new javax.swing.JRadioButton();
        a4 = new javax.swing.JRadioButton();
        b5 = new javax.swing.JRadioButton();
        a6 = new javax.swing.JRadioButton();
        b7 = new javax.swing.JRadioButton();
        a8 = new javax.swing.JRadioButton();
        a9 = new javax.swing.JRadioButton();
        a10 = new javax.swing.JRadioButton();
        a11 = new javax.swing.JRadioButton();
        b0 = new javax.swing.JRadioButton();
        b1 = new javax.swing.JRadioButton();
        a3 = new javax.swing.JRadioButton();
        b4 = new javax.swing.JRadioButton();
        a5 = new javax.swing.JRadioButton();
        b6 = new javax.swing.JRadioButton();
        a7 = new javax.swing.JRadioButton();
        b8 = new javax.swing.JRadioButton();
        b9 = new javax.swing.JRadioButton();
        b10 = new javax.swing.JRadioButton();
        b11 = new javax.swing.JRadioButton();
        b2 = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        a0.setBackground(new java.awt.Color(255, 0, 0));
        a0.setForeground(new java.awt.Color(255, 0, 0));
        a0.setSelected(true);
        a0.setToolTipText("");
        getContentPane().add(a0, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 20, 20));

        a1.setBackground(new java.awt.Color(255, 51, 51));
        a1.setSelected(true);
        a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a1ActionPerformed(evt);
            }
        });
        getContentPane().add(a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, -1, -1));

        a2.setBackground(new java.awt.Color(255, 51, 51));
        a2.setSelected(true);
        getContentPane().add(a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, -1, -1));

        b3.setBackground(new java.awt.Color(255, 255, 255));
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 450, -1, -1));

        a4.setBackground(new java.awt.Color(255, 51, 51));
        a4.setSelected(true);
        a4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a4ActionPerformed(evt);
            }
        });
        getContentPane().add(a4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, -1, -1));

        b5.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, -1, -1));

        a6.setBackground(new java.awt.Color(255, 51, 51));
        a6.setSelected(true);
        getContentPane().add(a6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, -1, -1));

        b7.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(b7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        a8.setBackground(new java.awt.Color(255, 51, 51));
        a8.setSelected(true);
        getContentPane().add(a8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));

        a9.setBackground(new java.awt.Color(255, 51, 51));
        a9.setSelected(true);
        getContentPane().add(a9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 20, -1));

        a10.setBackground(new java.awt.Color(255, 51, 51));
        a10.setSelected(true);
        getContentPane().add(a10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        a11.setBackground(new java.awt.Color(255, 51, 51));
        a11.setSelected(true);
        getContentPane().add(a11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        b0.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(b0, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, -1, -1));

        b1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, -1, -1));

        a3.setBackground(new java.awt.Color(255, 51, 51));
        a3.setSelected(true);
        a3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a3ActionPerformed(evt);
            }
        });
        getContentPane().add(a3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, -1, -1));

        b4.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, -1, -1));

        a5.setBackground(new java.awt.Color(255, 51, 51));
        a5.setSelected(true);
        getContentPane().add(a5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, -1, -1));

        b6.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(b6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, -1, -1));

        a7.setBackground(new java.awt.Color(255, 51, 51));
        a7.setSelected(true);
        getContentPane().add(a7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

        b8.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(b8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        b9.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(b9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        b10.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(b10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        b11.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(b11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, -1));

        b2.setBackground(new java.awt.Color(255, 255, 255));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel15.setText("The turn of first player");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 60, 300, 40));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(865, 143, 231, 31));

        jLabel2.setText("The index of p1 is 0");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, 148, 27));

        jLabel3.setText("The index of p2 is 0");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 139, 31));

        jButton2.setText("Die77");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/download (4).png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 150, 220, 180));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/monopoly-policeman-iconic-white-background-appears-board-where-says-go-to-jail-113104792.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 100, 90));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/again-design-sketch-name.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, -1, 90));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/images.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 100, 100));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dizm49zX4AAL5-C.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, -1, 100));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/download (2).png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/download.jpg"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/download (5).png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/download (6).png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/download (2).png"))); // NOI18N
        jLabel19.setToolTipText("");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/download (7).png"))); // NOI18N
        jLabel20.setText("jLabel20");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 100, 100));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/download (8).png"))); // NOI18N
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/download (9).png"))); // NOI18N
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 100, 110));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3e45b0b90407013e4c76dda70d16d099--white-balloons-black-felt.jpg"))); // NOI18N
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, -1, 110));

        jLabel17.setText("press on Die to select random number ");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 110, 223, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 350, 300, 50));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, 190, 27));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, 180, 32));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/aa22f7bd40726af6afd9c54799b3cbe996ade4542b502f08f8d64e832f2e18b1._RI_.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 1140, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a1ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b3ActionPerformed

    private void a4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a4ActionPerformed

    private void a3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a3ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        //         RandomDie r=new RandomDie();
        //        int num =r.ran();
        //        jLabel16.setText("The number of the die is "+num);
        //        remove_current_ratio_button(2);
        //        set_p(2, num);
        //        total_actions(2);
        //        open_ratio_button(2);
        //        next_turn(2);
        //
        //      jLabel2.setText("The index of p1 is "+p1);
        //      jLabel3.setText("The index of p2 is "+p2);
        //
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.out.println(money_p2);
        if(turn==false){
            turn=true;
            RandomDie r=new RandomDie();
            int num =r.ran();
            jLabel16.setText("The number of the die is "+num);
            remove_current_ratio_button(1);
            set_p(1, num);
            total_actions(1);
            open_ratio_button(1);

            // next_turn(1); 

            jLabel2.setText("The index of p1 is "+p1);
            jLabel3.setText("The index of p2 is "+p2);
            jLabel4.setText( n1 +"'s money=" + money_p1);
            jLabel5.setText( n2 +"'s money=" + money_p2);
            jLabel15.setText("The turn of "+n2);

        }else
        {
            turn=false;
            RandomDie r=new RandomDie();
            int num =r.ran();
            jLabel16.setText("The number of the die is "+num);
            remove_current_ratio_button(2);
            set_p(2, num);
            total_actions(2);
            open_ratio_button(2);
            next_turn(2);
            jLabel2.setText("The index of p1 is "+p1);
            jLabel3.setText("The index of p2 is "+p2);
            jLabel4.setText( n1 +" money=" + money_p1);
            jLabel5.setText( n2 +" money=" + money_p2);
            jLabel15.setText("The turn of "+n1);

        }

        win();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(playMo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(playMo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(playMo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(playMo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new playMo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton a0;
    private javax.swing.JRadioButton a1;
    private javax.swing.JRadioButton a10;
    private javax.swing.JRadioButton a11;
    private javax.swing.JRadioButton a2;
    private javax.swing.JRadioButton a3;
    private javax.swing.JRadioButton a4;
    private javax.swing.JRadioButton a5;
    private javax.swing.JRadioButton a6;
    private javax.swing.JRadioButton a7;
    private javax.swing.JRadioButton a8;
    private javax.swing.JRadioButton a9;
    private javax.swing.JRadioButton b0;
    private javax.swing.JRadioButton b1;
    private javax.swing.JRadioButton b10;
    private javax.swing.JRadioButton b11;
    private javax.swing.JRadioButton b2;
    private javax.swing.JRadioButton b3;
    private javax.swing.JRadioButton b4;
    private javax.swing.JRadioButton b5;
    private javax.swing.JRadioButton b6;
    private javax.swing.JRadioButton b7;
    private javax.swing.JRadioButton b8;
    private javax.swing.JRadioButton b9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
