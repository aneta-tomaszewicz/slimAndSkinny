/*
package com.example.slimandskinny.service;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test2 extends javax.swing.JFrame {

    private String[] monthOfTheYear = new String[]{"Styczeń", "Luty", "Marzec", "Kwiecień", "Maj", "Czerwiec", "Lipiec", "Sierpień", "Wrzesień", "Październik", "Listopad", "Grudzień"};
    GregorianCalendar kalendarz = new GregorianCalendar();

    */
/**
     * Creates new form Kalendarz
     *//*

    public Kalendarz() {
        initComponents();

        SimpleDateFormat df = new SimpleDateFormat();
        df.applyPattern("yyyy");
        kalendarz.set(Calendar.YEAR, Integer.parseInt(df.format(kalendarz.getTime())));
        kalendarz.set(Calendar.MONTH, 0);

        jTabbedPane1.setTitleAt(0, df.format(kalendarz.getTime()));
        jTabbedPane1.setTitleAt(1, monthOfTheYear[kalendarz.get(GregorianCalendar.MONTH)]);
        miesiac1.setKalendarz(kalendarz);
        jSpinner1.setValue(kalendarz.get(GregorianCalendar.YEAR));
        miesiace1.setRodzic(this);
    }

    public void zmieńDatę() {
        int stary = kalendarz.get(GregorianCalendar.MONTH);
        kalendarz.set((int) jSpinner1.getValue(), kalendarz.get(GregorianCalendar.MONTH), 1);
        jTabbedPane1.setTitleAt(0, String.valueOf(kalendarz.get(GregorianCalendar.YEAR)));
        miesiace1.usunPanele();
        miesiace1.setKalendarz(kalendarz);
        miesiace1.rysujMiesiące();
        miesiace1.revalidate();
        miesiace1.repaint();
        kalendarz.set(kalendarz.get(GregorianCalendar.YEAR), stary, 1);
        miesiac1.rysujMiesiąc(kalendarz.get(GregorianCalendar.YEAR), kalendarz.get(GregorianCalendar.MONTH));
        jTabbedPane1.setTitleAt(1, monthOfTheYear[kalendarz.get(GregorianCalendar.MONTH)]);
    }

    public JScrollBar getScrollBar2() {
        return jScrollBar2;
    }

    */
/**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     *//*

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        miesiace1 = new uniwersalnykalendarz.Miesiace();
        miesiac1 = new uniwersalnykalendarz.Miesiac();
        jToolBar1 = new javax.swing.JToolBar();
        jSpinner1 = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollBar1 = new javax.swing.JScrollBar(javax.swing.JScrollBar.HORIZONTAL);
        jLabel2 = new javax.swing.JLabel();
        jScrollBar2 = new javax.swing.JScrollBar(javax.swing.JScrollBar.HORIZONTAL);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(550, 550));

        jTabbedPane1.setMinimumSize(new java.awt.Dimension(700, 600));

        miesiace1.setMinimumSize(new java.awt.Dimension(0, 600));
        jTabbedPane1.addTab("tab1", miesiace1);
        jTabbedPane1.addTab("tab3", miesiac1);

        jToolBar1.setRollover(true);

        jSpinner1.setMaximumSize(new java.awt.Dimension(100, 32767));
        jSpinner1.setMinimumSize(new java.awt.Dimension(100, 28));
        jSpinner1.setPreferredSize(new java.awt.Dimension(100, 28));
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });
        jToolBar1.add(jSpinner1);

        jButton1.setText("Zmniejsz rok");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton2.setText("Zwiększ rok");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        jButton3.setText("Poprzedni miesiąc");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);

        jButton4.setText("Następny miesiąc");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);

        jLabel1.setText("Lata:");
        jToolBar1.add(jLabel1);

        jScrollBar1.setMinimumSize(new java.awt.Dimension(15, 400));
        jScrollBar1.setMaximum(5010);
        //jScrollBar1.setMaximum(kalendarz.getActualMinimum(GregorianCalendar.YEAR));
        jScrollBar1.setValue(kalendarz.get(GregorianCalendar.YEAR));
        jScrollBar1.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                jScrollBar1AdjustmentValueChanged(evt);
            }
        });
        jToolBar1.add(jScrollBar1);

        jLabel2.setText("Miesiące:");
        jToolBar1.add(jLabel2);

        jScrollBar2.setMinimum(0);
        jScrollBar2.setMaximum(21);
        jScrollBar2.setValue(kalendarz.get(GregorianCalendar.MONTH));
        jScrollBar2.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                jScrollBar2AdjustmentValueChanged(evt);
            }
        });
        jToolBar1.add(jScrollBar2);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(jTabbedPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 996, Short.MAX_VALUE)
                        .add(layout.createSequentialGroup()
                                .addContainerGap()
                                .add(jToolBar1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(layout.createSequentialGroup()
                                .add(jTabbedPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 357, Short.MAX_VALUE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jToolBar1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 60, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged

        zmieńDatę();
    }//GEN-LAST:event_jSpinner1StateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jSpinner1.setValue((int) jSpinner1.getValue() - 1);
        zmieńDatę();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jSpinner1.setValue((int) jSpinner1.getValue() + 1);
        zmieńDatę();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jScrollBar1AdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_jScrollBar1AdjustmentValueChanged
        jSpinner1.setValue((int) jScrollBar1.getValue());
        zmieńDatę();
    }//GEN-LAST:event_jScrollBar1AdjustmentValueChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (kalendarz.get(GregorianCalendar.MONTH) == 0) {
            kalendarz.set(kalendarz.get(GregorianCalendar.YEAR), 11, 1);
            jSpinner1.setValue((int) jSpinner1.getValue() - 1);
        } else {
            kalendarz.set(kalendarz.get(GregorianCalendar.YEAR), kalendarz.get(GregorianCalendar.MONTH) - 1, 1);
            zmieńDatę();
        }
        jScrollBar2.setValue(kalendarz.get(GregorianCalendar.MONTH));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (kalendarz.get(GregorianCalendar.MONTH) == 11) {
            kalendarz.set(kalendarz.get(GregorianCalendar.YEAR), 0, 1);
            jSpinner1.setValue((int) jSpinner1.getValue() + 1);
        } else {
            kalendarz.set(kalendarz.get(GregorianCalendar.YEAR), kalendarz.get(GregorianCalendar.MONTH) + 1, 1);
            zmieńDatę();
        }
        jScrollBar2.setValue(kalendarz.get(GregorianCalendar.MONTH));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jScrollBar2AdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_jScrollBar2AdjustmentValueChanged
        kalendarz.set(kalendarz.get(GregorianCalendar.YEAR), (int)jScrollBar2.getValue(), 1);
        zmieńDatę();
    }//GEN-LAST:event_jScrollBar2AdjustmentValueChanged

    */
/**
     * @param args the command line arguments
     *//*

    public static void main(String args[]) {
        */
/* Set the Nimbus look and feel *//*

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        */
/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         *//*

        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
            */
/*for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
             * if ("Nimbus".equals(info.getName())) {
             * javax.swing.UIManager.setLookAndFeel(info.getClassName());
             * break;
             * }
             * }*//*

        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Kalendarz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kalendarz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kalendarz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kalendarz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        */
/* Create and display the form *//*

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Kalendarz().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollBar jScrollBar2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    private uniwersalnykalendarz.Miesiac miesiac1;
    private uniwersalnykalendarz.Miesiace miesiace1;
    // End of variables declaration//GEN-END:variables

}
*/