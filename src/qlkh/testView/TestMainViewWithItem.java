/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlkh.testView;

import qlkh.*;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import qlkh.controller.InvoiceImportDetailController;
import qlkh.controller.ReportsController;
import qlkh.views.Home;


/**
 *
 * @author user
 */
public class TestMainViewWithItem extends javax.swing.JFrame {

    /**
     * Creates new form MainView
     */
    private final String unitBtnName = "unit";
    private final String importBtnName = "import";

    private final String reportBtnName = "report";

    public TestMainViewWithItem() {

        initComponents();
        Home home = new Home();
        contentPanel.add(home, unitBtnName);
        InvoiceImportDetailController y = new InvoiceImportDetailController();
        JPanel x = y.getContentPage();

        contentPanel.add(x, importBtnName);
        ReportsController controller = new ReportsController();
        JPanel z = controller.getContentPage();
        contentPanel.add(z, reportBtnName);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        sidebarPanel = new javax.swing.JPanel();
        unitBtn = new javax.swing.JButton();
        invoiceImportBtn = new javax.swing.JButton();
        reportBtn = new javax.swing.JButton();
        contentPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(153, 255, 153));

        headerPanel.setBackground(new java.awt.Color(102, 255, 0));

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        sidebarPanel.setBackground(new java.awt.Color(0, 102, 51));

        unitBtn.setText("Unit");
        unitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitBtnActionPerformed(evt);
            }
        });

        invoiceImportBtn.setText("ImvoiceImport");
        invoiceImportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceImportBtnActionPerformed(evt);
            }
        });

        reportBtn.setText("Reports");
        reportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidebarPanelLayout = new javax.swing.GroupLayout(sidebarPanel);
        sidebarPanel.setLayout(sidebarPanelLayout);
        sidebarPanelLayout.setHorizontalGroup(
            sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarPanelLayout.createSequentialGroup()
                .addGroup(sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidebarPanelLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(reportBtn))
                    .addGroup(sidebarPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(unitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(invoiceImportBtn)
                .addGap(24, 24, 24))
        );
        sidebarPanelLayout.setVerticalGroup(
            sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(unitBtn)
                .addGap(40, 40, 40)
                .addComponent(invoiceImportBtn)
                .addGap(44, 44, 44)
                .addComponent(reportBtn)
              
                .addContainerGap(473, Short.MAX_VALUE))
        );

        contentPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(sidebarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 954, javax.swing.GroupLayout.PREFERRED_SIZE)              
                .addGap(0, 0, 0)
                .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 926, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sidebarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1152, 748));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void unitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitBtnActionPerformed

        goToPageMainPanel(unitBtnName);
    }//GEN-LAST:event_unitBtnActionPerformed

    private void invoiceImportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceImportBtnActionPerformed

        goToPageMainPanel(importBtnName);
    }//GEN-LAST:event_invoiceImportBtnActionPerformed

    private void reportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportBtnActionPerformed

        goToPageMainPanel(reportBtnName);
    }//GEN-LAST:event_reportBtnActionPerformed
    public void goToPageMainPanel(String name) {
        CardLayout layout = (CardLayout) contentPanel.getLayout();

        layout.show(contentPanel, name);

        layout.show(contentPanel, name);

        this.pack();
    }

    public void changeColor(JPanel hover, Color rand) {
        hover.setBackground(rand);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestMainViewWithItem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JButton invoiceImportBtn;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton reportBtn;
    private javax.swing.JPanel sidebarPanel;
    private javax.swing.JButton unitBtn;
    // End of variables declaration//GEN-END:variables
}
