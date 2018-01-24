/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alej8130
 */
public class Store extends javax.swing.JDialog {
   int balance;
   String seeds;//use a , to separate each purchase 
   //refer to https://stackoverflow.com/questions/3481828/how-to-split-a-string-in-java
   //to get the code to split every comma
   Boolean purchase;
   
    public Store(java.awt.Frame parent, boolean modal){
        super(parent, modal);
        initComponents();
        purchase=false;//set purchase to false
    }
    public Store(java.awt.Frame parent, boolean modal, int bal) {
        super(parent, modal);
        initComponents();
        balance=bal;
        txtbal.setText("" + balance);
        purchase=false;//set purchase to or back to false at the start of this running
        seeds=""; //resetting the list of purchased seeds back to nothing
        
    }
    
    public int getBal(){
        return balance;//returns balance this method will only be called if hadPurchase is true
    }
    
    public boolean hadPurchase(){
        return purchase;//returns true if something has been bought, false if not
    }
    
    public String getSeeds(){
        return seeds;//return name of seeds that are separated by a , and will be added to inv 
        //seeds afterwards
    }
    
    public  void addText(String s){
        if(seeds.equals(""))//if nothing is in seeds add the name
            seeds=s;
        else//else add a comma to separate each purchase
            seeds+="," +s;
    }

    public Boolean canBuy(int price,String name){
        if(price>balance){
            txtstatus.setText("Can't purchase" + name + ". Not enough funds");
            return false;
        }//returns false if price is higher than balance and says you can't purchase item
        else return true;//returns true if balance is equal or greater than price 
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblstore = new javax.swing.JLabel();
        lbltreetitle = new javax.swing.JLabel();
        lblcroptitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnbuywhes = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnclose = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnbuycars = new javax.swing.JButton();
        btnbuypots = new javax.swing.JButton();
        btnbuyappt = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnbuyorat = new javax.swing.JButton();
        btnbuypeat = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnbuypums = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnbuyplut = new javax.swing.JButton();
        txtbal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnpeact = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        btnwatts = new javax.swing.JButton();
        txtstatus = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblstore.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblstore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblstore.setText("STORE");

        lbltreetitle.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbltreetitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltreetitle.setText("Trees");

        lblcroptitle.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblcroptitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcroptitle.setText("Crops");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Wheat seed cost: $3 ");

        btnbuywhes.setText("Buy");
        btnbuywhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuywhesActionPerformed(evt);
            }
        });

        jLabel2.setText("Balance:");

        btnclose.setText("Close");

        jLabel3.setText("Carrot seed cost:");

        jLabel4.setText("Potato seed cost: ");

        jLabel5.setText("Apple tree cost: $15");

        btnbuycars.setText("Buy");
        btnbuycars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuycarsActionPerformed(evt);
            }
        });

        btnbuypots.setText("Buy");
        btnbuypots.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuypotsActionPerformed(evt);
            }
        });

        btnbuyappt.setText("Buy");
        btnbuyappt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuyapptActionPerformed(evt);
            }
        });

        jLabel6.setText("Orange tree cost: ");

        btnbuyorat.setText("Buy");
        btnbuyorat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuyoratActionPerformed(evt);
            }
        });

        btnbuypeat.setText("Buy");
        btnbuypeat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuypeatActionPerformed(evt);
            }
        });

        jLabel7.setText("Pear tree cost: ");

        jLabel8.setText("Pumpkin seed cost:");

        btnbuypums.setText("Buy");
        btnbuypums.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuypumsActionPerformed(evt);
            }
        });

        jLabel9.setText("Plum tree cost:");

        btnbuyplut.setText("Buy");
        btnbuyplut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuyplutActionPerformed(evt);
            }
        });

        txtbal.setEditable(false);

        jLabel10.setText("Peach tree cost:");

        btnpeact.setText("Buy");
        btnpeact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpeactActionPerformed(evt);
            }
        });

        jLabel11.setText("Watermelon seed cost:");

        btnwatts.setText("Buy");
        btnwatts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnwattsActionPerformed(evt);
            }
        });

        txtstatus.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(lbltreetitle, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnbuywhes))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnwatts))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnbuycars, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnbuypots, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnbuypums, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(lblcroptitle, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(76, 76, 76)))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(lblstore, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnbuyappt)
                                    .addComponent(btnbuyorat)
                                    .addComponent(btnbuypeat)
                                    .addComponent(btnbuyplut)
                                    .addComponent(btnpeact)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtbal, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(320, 320, 320)
                                .addComponent(btnclose)))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblstore)
                    .addComponent(txtstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcroptitle)
                    .addComponent(lbltreetitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnbuywhes)
                    .addComponent(btnbuyappt)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnbuycars)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnbuypots)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnbuyorat)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnbuypeat)
                            .addComponent(jLabel7))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtbal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnclose))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnbuyplut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnpeact))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(btnbuypums))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(btnwatts))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbuyapptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuyapptActionPerformed
        
        if(canBuy(0,"apple tree seed"));
            
    }//GEN-LAST:event_btnbuyapptActionPerformed

    private void btnbuyoratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuyoratActionPerformed
        
        if(canBuy(0,"orange tree seed"));
            
        
    }//GEN-LAST:event_btnbuyoratActionPerformed

    private void btnbuypeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuypeatActionPerformed
        if(canBuy(0,"peach tree seed"));
        
    }//GEN-LAST:event_btnbuypeatActionPerformed

    private void btnbuyplutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuyplutActionPerformed
        if(canBuy(0,"plum tree seed"));
        
    }//GEN-LAST:event_btnbuyplutActionPerformed

    private void btnpeactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpeactActionPerformed
        if(canBuy(0,"peach tree seed"));
    }//GEN-LAST:event_btnpeactActionPerformed

    private void btnbuywhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuywhesActionPerformed
        if(canBuy(0,"wheat seed"));
    }//GEN-LAST:event_btnbuywhesActionPerformed

    private void btnbuycarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuycarsActionPerformed
        if(canBuy(0,"carrot seed"));
    }//GEN-LAST:event_btnbuycarsActionPerformed

    private void btnbuypotsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuypotsActionPerformed
        if(canBuy(0,"potato seed"));
    }//GEN-LAST:event_btnbuypotsActionPerformed

    private void btnbuypumsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuypumsActionPerformed
       if(canBuy(0,"pumpkin seed"));
    }//GEN-LAST:event_btnbuypumsActionPerformed

    private void btnwattsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnwattsActionPerformed
        if(canBuy(0,"watermelon seed"));
    }//GEN-LAST:event_btnwattsActionPerformed

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
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Store dialog = new Store(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuyappt;
    private javax.swing.JButton btnbuycars;
    private javax.swing.JButton btnbuyorat;
    private javax.swing.JButton btnbuypeat;
    private javax.swing.JButton btnbuyplut;
    private javax.swing.JButton btnbuypots;
    private javax.swing.JButton btnbuypums;
    private javax.swing.JButton btnbuywhes;
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnpeact;
    private javax.swing.JButton btnwatts;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblcroptitle;
    private javax.swing.JLabel lblstore;
    private javax.swing.JLabel lbltreetitle;
    private javax.swing.JTextField txtbal;
    private javax.swing.JTextField txtstatus;
    // End of variables declaration//GEN-END:variables
}
