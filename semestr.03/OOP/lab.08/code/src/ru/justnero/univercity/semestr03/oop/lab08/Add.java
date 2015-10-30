/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.justnero.univercity.semestr03.oop.lab08;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author justnero
 */
public class Add extends javax.swing.JFrame {

    /**
     * Creates new form Add
     */
    public Add() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameF = new javax.swing.JTextField();
        nameL = new javax.swing.JLabel();
        timeL = new javax.swing.JLabel();
        timeF = new javax.swing.JFormattedTextField();
        viewsL = new javax.swing.JLabel();
        viewsF = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();

        setTitle("Добавить");
        setAlwaysOnTop(true);

        nameL.setText("Название:");

        timeL.setText("Дата:");

        timeF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd.MM.yyyy HH:mm:ss"))));

        viewsL.setText("Просмотры:");

        addBtn.setText("Добавить");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(nameL)
                        .addComponent(nameF, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                        .addComponent(timeL)
                        .addComponent(viewsL)
                        .addComponent(timeF)
                        .addComponent(viewsF))
                    .addComponent(addBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameL)
                .addGap(4, 4, 4)
                .addComponent(nameF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(timeL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timeF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewsL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewsF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        String dt[] = timeF.getText().split(" ");
        String date[] = dt[0].split("\\.");
        String time[] = dt[1].split(":");
        TTime t = new TTime(Integer.valueOf(date[2]),Integer.valueOf(date[1]),Integer.valueOf(date[0]),Integer.valueOf(time[0]),Integer.valueOf(time[1]),Integer.valueOf(time[2]));
        TFile d = new TFile(nameF.getText(),t,Long.valueOf(viewsF.getText()));
        Main.add(d);
        this.setVisible(false);
    }//GEN-LAST:event_addBtnActionPerformed
    
    public void fill() {
        nameF.setText("");
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        timeF.setText(sdf.format(cal.getTime()));
        viewsF.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField nameF;
    private javax.swing.JLabel nameL;
    private javax.swing.JFormattedTextField timeF;
    private javax.swing.JLabel timeL;
    private javax.swing.JTextField viewsF;
    private javax.swing.JLabel viewsL;
    // End of variables declaration//GEN-END:variables
}