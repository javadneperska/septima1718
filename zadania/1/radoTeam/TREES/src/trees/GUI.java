/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import java.util.Arrays;
import javax.swing.JTextField;
import static trees.GUI.veky;


/**
 *
 * @author Peter
 */
public class GUI extends javax.swing.JFrame {

    static boolean visible = false;
    public GUI() {
        initComponents();
       JTM.setVisible(visible);
        //JTD1.setVisible(visible);
        JTD2.setVisible(false);
        JTD3.setVisible(visible);
        jButton8.setVisible(false);
        jButton7.setVisible(false);
        jButton9.setVisible(false);
        jButton10.setVisible(false);
        jButton11.setVisible(false);
        jButton12.setVisible(false);
        jButton13.setVisible(false);
        jButton14.setVisible(false);
        jButton15.setVisible(false);
        jButton16.setVisible(false);
        jButton17.setVisible(false);
        jButton18.setVisible(false);
        jButton19.setVisible(false);
        jButton20.setVisible(false);
        jButton21.setVisible(false);
        jButton22.setVisible(false);
        jButton23.setVisible(false);
        update();
    }
    static int velkostpola = 17;
    static String[] mena = new String[velkostpola];
public static int[] veky = new int[velkostpola];
public static int[] datumy1 = new int[velkostpola];
public static int[] datumy2 = new int[velkostpola];
public static int[] vekymin1 = new int [15];
public static int[] vekymin2 = new int [16];
      static  int a = 0;
      static int b = 0;
      static int c = 0;
      static int d = 0;
    public  static String filename1= null;
    public void update(){
    JT1.addFocusListener(new FocusListener() {
               
            @Override
            public void focusGained(FocusEvent e) {
                jButton8.setVisible(true);
                
            }

            @Override
            public void focusLost(FocusEvent e) {
             
           jButton8.setVisible(false);
                
                
            }
        });
    JT2.addFocusListener(new FocusListener() {
               
            @Override
            public void focusGained(FocusEvent e) {
                jButton7.setVisible(true);
                
            }

            @Override
            public void focusLost(FocusEvent e) {
             
           jButton7.setVisible(false);
                
                
            }
        });
    
     JT3.addFocusListener(new FocusListener() {
               
            @Override
            public void focusGained(FocusEvent e) {
                jButton9.setVisible(true);
                
            }

            @Override
            public void focusLost(FocusEvent e) {
             
           jButton9.setVisible(false);
                
                
            }
        });
     JT4.addFocusListener(new FocusListener() {
               
            @Override
            public void focusGained(FocusEvent e) {
                jButton10.setVisible(true);
                
            }

            @Override
            public void focusLost(FocusEvent e) {
             
           jButton10.setVisible(false);
                
                
            }
        });
     JT5.addFocusListener(new FocusListener() {
               
            @Override
            public void focusGained(FocusEvent e) {
                jButton11.setVisible(true);
                
            }

            @Override
            public void focusLost(FocusEvent e) {
             
           jButton11.setVisible(false);
                
                
            }
        });
     JT6.addFocusListener(new FocusListener() {
               
            @Override
            public void focusGained(FocusEvent e) {
                jButton12.setVisible(true);
                
            }

            @Override
            public void focusLost(FocusEvent e) {
             
           jButton12.setVisible(false);
                
                
            }
        });
     JT7.addFocusListener(new FocusListener() {
               
            @Override
            public void focusGained(FocusEvent e) {
                jButton13.setVisible(true);
                
            }

            @Override
            public void focusLost(FocusEvent e) {
             
           jButton13.setVisible(false);
                
                
            }
        });
     JT8.addFocusListener(new FocusListener() {
               
            @Override
            public void focusGained(FocusEvent e) {
                jButton14.setVisible(true);
                
            }

            @Override
            public void focusLost(FocusEvent e) {
             
           jButton14.setVisible(false);
                
                
            }
        });
     JT9.addFocusListener(new FocusListener() {
               
            @Override
            public void focusGained(FocusEvent e) {
                jButton15.setVisible(true);
                
            }

            @Override
            public void focusLost(FocusEvent e) {
             
           jButton15.setVisible(false);
                
                
            }
        });
     JT10.addFocusListener(new FocusListener() {
               
            @Override
            public void focusGained(FocusEvent e) {
                jButton16.setVisible(true);
                
            }

            @Override
            public void focusLost(FocusEvent e) {
             
           jButton16.setVisible(false);
                
                
            }
        });
     JT11.addFocusListener(new FocusListener() {
               
            @Override
            public void focusGained(FocusEvent e) {
                jButton17.setVisible(true);
                
            }

            @Override
            public void focusLost(FocusEvent e) {
             
           jButton17.setVisible(false);
                
                
            }
        });
     JT12.addFocusListener(new FocusListener() {
               
            @Override
            public void focusGained(FocusEvent e) {
                jButton18.setVisible(true);
                
            }

            @Override
            public void focusLost(FocusEvent e) {
             
           jButton18.setVisible(false);
                
                
            }
        });
     JT13.addFocusListener(new FocusListener() {
               
            @Override
            public void focusGained(FocusEvent e) {
                jButton19.setVisible(true);
                
            }

            @Override
            public void focusLost(FocusEvent e) {
             
           jButton19.setVisible(false);
                
                
            }
        });
     JT14.addFocusListener(new FocusListener() {
               
            @Override
            public void focusGained(FocusEvent e) {
                jButton20.setVisible(true);
                
            }

            @Override
            public void focusLost(FocusEvent e) {
             
           jButton20.setVisible(false);
                
                
            }
        });
     JT15.addFocusListener(new FocusListener() {
               
            @Override
            public void focusGained(FocusEvent e) {
                jButton21.setVisible(true);
                
            }

            @Override
            public void focusLost(FocusEvent e) {
             
           jButton21.setVisible(false);
                
                
            }
        });
     JTM.addFocusListener(new FocusListener() {
               
            @Override
            public void focusGained(FocusEvent e) {
                jButton23.setVisible(true);
                
            }

            @Override
            public void focusLost(FocusEvent e) {
             
           jButton23.setVisible(false);
                
                
            }
        });
     JTD3.addFocusListener(new FocusListener() {
               
            @Override
            public void focusGained(FocusEvent e) {
                jButton22.setVisible(true);
                
            }

            @Override
            public void focusLost(FocusEvent e) {
             
           jButton22.setVisible(false);
                
                
            }
        });
    }
       public static double countAverageAge(){
      double sucet = 0;
      for (int i = 0; i < veky.length; i++) {
          
          sucet = sucet + veky[i];
        
      }
      
  //double result = sucet/veky.length;      `
  return sucet;
  }
       public void nacitaj (){
        try{
          
       //ArrayList<String[]> action = new ArrayList<String[]>();
            
       FileReader fr = new FileReader(System.getProperty("user.home")+"\\Desktop\\"+filename1);
            BufferedReader br = new BufferedReader(fr);
           String line;
            while((line = br.readLine()) != null){
            
            String[] pole= line.split(",");
               System.out.println(Arrays.toString(pole));
              // action.add(pole);
              veky[a] = Integer.parseInt(pole[3]);
              datumy1[c] = Integer.parseInt(pole[1]);
              datumy2[d] = Integer.parseInt(pole[2]);
              mena[b] = pole[0];
              a++;
              b++;
              c++;
              d++;
            }
            System.out.println(Arrays.toString(veky));
       }
       catch (IOException io){
       
       
       }
       
       }
       public void vypis(){
          JTextField txt[] = {JT1, JT2, JT3, JT4, JT5, JT6, JT7,JT8,JT9,JT10,JT11,JT12,JT13,JT14,JT15,JTM,JTD2,JTD3}; 
           int a = 0;
           for (int i = 0; i < txt.length; i++) {
               txt[i].setText("");
           }
           if(Person.additions==0){
        for (int i = 15; i > 0; i--) {
               txt[i-1].setText(mena[a]);
               a++;
           }
        a=0;
           }
          if(Person.additions == 1){
              JTextField txt1[] = {JTM,JT1, JT2, JT3, JT4, JT5, JT6, JT7,JT8,JT9,JT10,JT11,JT12,JT13,JT14,JT15,JTD2,JTD2}; 
          for (int i = 16; i > 0; i--) {
               txt1[i-1].setText(mena[a]);
               a++;
              
           }
          a=0;
        //  JTM.setVisible(true);
          }
         if(Person.additions == 2){
              JTextField txt2[] = {JTD3,JTM,JT1, JT2, JT3, JT4, JT5, JT6, JT7,JT8,JT9,JT10,JT11,JT12,JT13,JT14,JT15,JTD2};
          for (int i = 17; i > 0; i--) {
               txt2[i-1].setText(mena[a]);
               a++;
           }
          a=0;
        //  JTD2.setVisible(true);
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jToggleButton1 = new javax.swing.JToggleButton();
        JT1 = new javax.swing.JTextField();
        JT7 = new javax.swing.JTextField();
        JT2 = new javax.swing.JTextField();
        JT3 = new javax.swing.JTextField();
        JT6 = new javax.swing.JTextField();
        JT5 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        JT8 = new javax.swing.JTextField();
        JT9 = new javax.swing.JTextField();
        JT4 = new javax.swing.JTextField();
        JT10 = new javax.swing.JTextField();
        JT11 = new javax.swing.JTextField();
        JT12 = new javax.swing.JTextField();
        JT13 = new javax.swing.JTextField();
        JT14 = new javax.swing.JTextField();
        JT15 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        JTM = new javax.swing.JTextField();
        JTD3 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        JTD2 = new javax.swing.JTextField();

        jScrollPane2.setViewportView(jTextPane1);

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JT1.setEditable(false);
        JT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT1ActionPerformed(evt);
            }
        });

        JT7.setEditable(false);

        JT2.setEditable(false);

        JT3.setEditable(false);

        JT6.setEditable(false);

        JT5.setEditable(false);

        jButton2.setText("1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("2");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("3");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("4");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        JT8.setEditable(false);

        JT9.setEditable(false);

        JT4.setEditable(false);

        JT10.setEditable(false);

        JT11.setEditable(false);

        JT12.setEditable(false);

        JT13.setEditable(false);

        JT14.setEditable(false);

        JT15.setEditable(false);

        jLabel1.setText("OTEC");

        jLabel2.setText("MAMA");

        jLabel3.setText("DEDO");

        jLabel4.setText("BABKA");

        jLabel5.setText("DEDO");

        jLabel6.setText("BABKA");

        jLabel7.setText("PRADEDO");

        jLabel9.setText("PRADEDO");

        jLabel8.setText("PRADEDO");

        jLabel10.setText("PRADEDO");

        jLabel11.setText("PRABABKA");

        jLabel12.setText("PRABABKA");

        jLabel13.setText("PRABABKA");

        jLabel14.setText("PRABABKA");

        jButton1.setText("AGES");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        JTM.setEditable(false);

        JTD3.setEditable(false);

        jButton6.setText("Add Generation");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton8.setText("Info");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton7.setText("Info");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton9.setText("Info");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Info");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("Info");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("Info");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("Info");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("Info");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText("Info");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setText("Info");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setText("Info");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setText("Info");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setText("Info");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setText("Info");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setText("Info");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setText("Info");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setText("Info");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JT5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(jLabel7)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jLabel12))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(JT8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButton15)
                                                        .addComponent(JT9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(JT10, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel8)
                                                .addComponent(jButton16)))
                                        .addComponent(jButton14)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jButton18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(JT11, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel11))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel9))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton12)))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(197, 197, 197)
                                .addComponent(jButton17)
                                .addGap(71, 71, 71)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(103, 103, 103)
                                .addComponent(jLabel14))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton20)
                                .addGap(97, 97, 97))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton21)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JT12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JT13, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel10)
                                            .addComponent(JT14, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(39, 39, 39)
                                        .addComponent(JT15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(JT7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton13))))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton22)
                        .addGap(157, 157, 157))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JTD3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JTD2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JT1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton19)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JT2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel3)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(JT4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(JTM, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton23))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(13, 13, 13)
                                                .addComponent(JT3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton9))))
                                    .addComponent(JT6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(244, 244, 244)
                                .addComponent(jLabel6)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(141, 141, 141))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTD3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTD2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8)
                    .addComponent(jButton23))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jButton7))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton9)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JT3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JT4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JT5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JT6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JT7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton11)
                            .addComponent(jButton12)
                            .addComponent(jButton10)
                            .addComponent(jButton13))))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JT9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JT8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JT10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JT11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JT12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JT13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JT14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JT15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton16)
                            .addComponent(jButton18))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton15)
                            .addComponent(jButton19)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButton21)))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton14)
                    .addComponent(jButton20))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton1)
                    .addComponent(jButton6))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       //  
       new Ages().setVisible(true);
       for (int i = 0; i < vekymin1.length; i++) {
            vekymin1[i]= veky[i];
        }
       for (int i = 0; i < vekymin2.length; i++) {
            vekymin2[i]= veky[i];
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        for (int i = 0; i < veky.length; i++) {
            datumy2[i]= 0;
        }
        d = 0;
        for (int i = 0; i < veky.length; i++) {
            datumy1[i]= 0;
        }
        c = 0;
        for (int i = 0; i < veky.length; i++) {
            veky[i]= 0;
        }
        a = 0;
        filename1="tree3.txt";
        nacitaj();
        vypis();
        for (int i = 0; i < mena.length; i++) {
                mena[i] = null;
                
            }
        b = 0;
       // System.out.println(Arrays.toString(mena));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new Person().setVisible(true);
        visible = true;
        JTM.setVisible(visible);
        JTD3.setVisible(visible);
       /* JTD2.setVisible(visible);
        JTD3.setVisible(visible);*/
        GUI.this.revalidate();
        GUI.this.repaint();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        for (int i = 0; i < veky.length; i++) {
            datumy2[i]= 0;
        }
        d = 0; 
        for (int i = 0; i < veky.length; i++) {
            datumy1[i]= 0;
        }
        c = 0;
        for (int i = 0; i < veky.length; i++) {
            veky[i]= 0;
        }
        a = 0;
        filename1="tree5.txt";
        System.out.println(Arrays.toString(mena));
        nacitaj();
        vypis();
        for (int i = 0; i < mena.length; i++) {
                mena[i] = null;
            }
        b = 0;
        System.out.println(Arrays.toString(mena));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        for (int i = 0; i < veky.length; i++) {
            datumy2[i]= 0;
        }
        d = 0;
        for (int i = 0; i < veky.length; i++) {
            datumy1[i]= 0;
        }
        c = 0;
        for (int i = 0; i < veky.length; i++) {
            veky[i]= 0;
        }
        a = 0;
        filename1="tree4.txt";
        System.out.println(Arrays.toString(mena));
        nacitaj();
        vypis();
        for (int i = 0; i < mena.length; i++) {
                mena[i] = null;
            }
        b = 0;
        System.out.println(Arrays.toString(mena));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        for (int i = 0; i < veky.length; i++) {
            datumy2[i]= 0;
        }
        d = 0; 
        for (int i = 0; i < veky.length; i++) {
            datumy1[i]= 0;
        }
        c = 0;
        for (int i = 0; i < veky.length; i++) {
            veky[i]= 0;
        }
        a = 0;
        filename1="tree6.txt";
        System.out.println(Arrays.toString(mena));
        nacitaj();
        vypis();
        for (int i = 0; i < mena.length; i++) {
                mena[i] = null;
            }
        b = 0;
        System.out.println(Arrays.toString(mena));
    }//GEN-LAST:event_jButton5ActionPerformed

    private void JT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT1ActionPerformed
       
                
    }//GEN-LAST:event_JT1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        new Information().setVisible(true);
        
         // System.out.println(Arrays.toString(datumy1));
        Information.jTextField1.setText(JT1.getText());
        Information.jTextField4.setText(Integer.toString(veky[14]));
        Information.jTextField2.setText(Integer.toString(datumy1[14]));
       // Information.jTextField3.setText(Integer.toString(datumy2[14]));
       if (datumy2[14] == 0){
       Information.jTextField3.setText("Este zije");
       
       }
       else{
       Information.jTextField3.setText(Integer.toString(datumy2[14]));
       
       }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        new Information().setVisible(true);
        
         // System.out.println(Arrays.toString(datumy1));
        Information.jTextField1.setText(JT2.getText());
        Information.jTextField4.setText(Integer.toString(veky[13]));
        Information.jTextField2.setText(Integer.toString(datumy1[13]));
       // Information.jTextField3.setText(Integer.toString(datumy2[14]));
       if (datumy2[13] == 0){
       Information.jTextField3.setText("Este zije");
       
       }
       else{
       Information.jTextField3.setText(Integer.toString(datumy2[13]));
       
       }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
         new Information().setVisible(true);
        
         // System.out.println(Arrays.toString(datumy1));
        Information.jTextField1.setText(JT3.getText());
        Information.jTextField4.setText(Integer.toString(veky[12]));
        Information.jTextField2.setText(Integer.toString(datumy1[12]));
       // Information.jTextField3.setText(Integer.toString(datumy2[14]));
       if (datumy2[12] == 0){
       Information.jTextField3.setText("Este zije");
       
       }
       else{
       Information.jTextField3.setText(Integer.toString(datumy2[12]));
       
       }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        new Information().setVisible(true);
        
         // System.out.println(Arrays.toString(datumy1));
        Information.jTextField1.setText(JT4.getText());
        Information.jTextField4.setText(Integer.toString(veky[11]));
        Information.jTextField2.setText(Integer.toString(datumy1[11]));
       // Information.jTextField3.setText(Integer.toString(datumy2[14]));
       if (datumy2[11] == 0){
       Information.jTextField3.setText("Este zije");
       
       }
       else{
       Information.jTextField3.setText(Integer.toString(datumy2[11]));
       
       }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        new Information().setVisible(true);
        
         // System.out.println(Arrays.toString(datumy1));
        Information.jTextField1.setText(JT5.getText());
        Information.jTextField4.setText(Integer.toString(veky[10]));
        Information.jTextField2.setText(Integer.toString(datumy1[10]));
       // Information.jTextField3.setText(Integer.toString(datumy2[14]));
       if (datumy2[10] == 0){
       Information.jTextField3.setText("Este zije");
       
       }
       else{
       Information.jTextField3.setText(Integer.toString(datumy2[10]));
       
       }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        new Information().setVisible(true);
        
         // System.out.println(Arrays.toString(datumy1));
        Information.jTextField1.setText(JT6.getText());
        Information.jTextField4.setText(Integer.toString(veky[9]));
        Information.jTextField2.setText(Integer.toString(datumy1[9]));
       // Information.jTextField3.setText(Integer.toString(datumy2[14]));
       if (datumy2[9] == 0){
       Information.jTextField3.setText("Este zije");
       
       }
       else{
       Information.jTextField3.setText(Integer.toString(datumy2[9]));
       
       }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
       new Information().setVisible(true);
        
         // System.out.println(Arrays.toString(datumy1));
        Information.jTextField1.setText(JT7.getText());
        Information.jTextField4.setText(Integer.toString(veky[8]));
        Information.jTextField2.setText(Integer.toString(datumy1[8]));
       // Information.jTextField3.setText(Integer.toString(datumy2[14]));
       if (datumy2[8] == 0){
       Information.jTextField3.setText("Este zije");
       
       }
       else{
       Information.jTextField3.setText(Integer.toString(datumy2[8]));
       
       }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
         new Information().setVisible(true);
        
         // System.out.println(Arrays.toString(datumy1));
        Information.jTextField1.setText(JT8.getText());
        Information.jTextField4.setText(Integer.toString(veky[7]));
        Information.jTextField2.setText(Integer.toString(datumy1[7]));
       // Information.jTextField3.setText(Integer.toString(datumy2[14]));
       if (datumy2[7] == 0){
       Information.jTextField3.setText("Este zije");
       
       }
       else{
       Information.jTextField3.setText(Integer.toString(datumy2[7]));
       
       }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
       new Information().setVisible(true);
        
         // System.out.println(Arrays.toString(datumy1));
        Information.jTextField1.setText(JT9.getText());
        Information.jTextField4.setText(Integer.toString(veky[6]));
        Information.jTextField2.setText(Integer.toString(datumy1[6]));
       // Information.jTextField3.setText(Integer.toString(datumy2[14]));
       if (datumy2[6] == 0){
       Information.jTextField3.setText("Este zije");
       
       }
       else{
       Information.jTextField3.setText(Integer.toString(datumy2[6]));
       
       }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        new Information().setVisible(true);
        
         // System.out.println(Arrays.toString(datumy1));
        Information.jTextField1.setText(JT10.getText());
        Information.jTextField4.setText(Integer.toString(veky[5]));
        Information.jTextField2.setText(Integer.toString(datumy1[5]));
       // Information.jTextField3.setText(Integer.toString(datumy2[14]));
       if (datumy2[5] == 0){
       Information.jTextField3.setText("Este zije");
       
       }
       else{
       Information.jTextField3.setText(Integer.toString(datumy2[5]));
       
       }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        new Information().setVisible(true);
        
         // System.out.println(Arrays.toString(datumy1));
        Information.jTextField1.setText(JT11.getText());
        Information.jTextField4.setText(Integer.toString(veky[4]));
        Information.jTextField2.setText(Integer.toString(datumy1[4]));
       // Information.jTextField3.setText(Integer.toString(datumy2[14]));
       if (datumy2[4] == 0){
       Information.jTextField3.setText("Este zije");
       
       }
       else{
       Information.jTextField3.setText(Integer.toString(datumy2[4]));
       
       }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        new Information().setVisible(true);
        
         // System.out.println(Arrays.toString(datumy1));
        Information.jTextField1.setText(JT12.getText());
        Information.jTextField4.setText(Integer.toString(veky[3]));
        Information.jTextField2.setText(Integer.toString(datumy1[3]));
       // Information.jTextField3.setText(Integer.toString(datumy2[14]));
       if (datumy2[3] == 0){
       Information.jTextField3.setText("Este zije");
       
       }
       else{
       Information.jTextField3.setText(Integer.toString(datumy2[3]));
       
       }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        new Information().setVisible(true);
        
         // System.out.println(Arrays.toString(datumy1));
        Information.jTextField1.setText(JT13.getText());
        Information.jTextField4.setText(Integer.toString(veky[2]));
        Information.jTextField2.setText(Integer.toString(datumy1[2]));
       // Information.jTextField3.setText(Integer.toString(datumy2[14]));
       if (datumy2[2] == 0){
       Information.jTextField3.setText("Este zije");
       
       }
       else{
       Information.jTextField3.setText(Integer.toString(datumy2[2]));
       
       }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        new Information().setVisible(true);
        
         // System.out.println(Arrays.toString(datumy1));
        Information.jTextField1.setText(JT14.getText());
        Information.jTextField4.setText(Integer.toString(veky[1]));
        Information.jTextField2.setText(Integer.toString(datumy1[1]));
       // Information.jTextField3.setText(Integer.toString(datumy2[14]));
       if (datumy2[1] == 0){
       Information.jTextField3.setText("Este zije");
       
       }
       else{
       Information.jTextField3.setText(Integer.toString(datumy2[1]));
       
       }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        new Information().setVisible(true);
        
         // System.out.println(Arrays.toString(datumy1));
        Information.jTextField1.setText(JT15.getText());
        Information.jTextField4.setText(Integer.toString(veky[0]));
        Information.jTextField2.setText(Integer.toString(datumy1[0]));
       // Information.jTextField3.setText(Integer.toString(datumy2[14]));
       if (datumy2[0] == 0){
       Information.jTextField3.setText("Este zije");
       
       }
       else{
       Information.jTextField3.setText(Integer.toString(datumy2[0]));
       
       }
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        new Information().setVisible(true);
        
         // System.out.println(Arrays.toString(datumy1));
        Information.jTextField1.setText(JTM.getText());
        Information.jTextField4.setText(Integer.toString(veky[15]));
        Information.jTextField2.setText(Integer.toString(datumy1[15]));
       // Information.jTextField3.setText(Integer.toString(datumy2[14]));
       if (datumy2[15] == 0){
       Information.jTextField3.setText("Este zije");
       
       }
       else{
       Information.jTextField3.setText(Integer.toString(datumy2[15]));
       
       }
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        new Information().setVisible(true);
        
         // System.out.println(Arrays.toString(datumy1));
        Information.jTextField1.setText(JTD3.getText());
        Information.jTextField4.setText(Integer.toString(veky[16]));
        Information.jTextField2.setText(Integer.toString(datumy1[16]));
       // Information.jTextField3.setText(Integer.toString(datumy2[14]));
       if (datumy2[16] == 0){
       Information.jTextField3.setText("Este zije");
       
       }
       else{
       Information.jTextField3.setText(Integer.toString(datumy2[16]));
       
       }
    }//GEN-LAST:event_jButton22ActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JT1;
    private javax.swing.JTextField JT10;
    private javax.swing.JTextField JT11;
    private javax.swing.JTextField JT12;
    private javax.swing.JTextField JT13;
    private javax.swing.JTextField JT14;
    private javax.swing.JTextField JT15;
    private javax.swing.JTextField JT2;
    private javax.swing.JTextField JT3;
    private javax.swing.JTextField JT4;
    private javax.swing.JTextField JT5;
    private javax.swing.JTextField JT6;
    private javax.swing.JTextField JT7;
    private javax.swing.JTextField JT8;
    private javax.swing.JTextField JT9;
    private javax.swing.JTextField JTD2;
    private javax.swing.JTextField JTD3;
    private javax.swing.JTextField JTM;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
