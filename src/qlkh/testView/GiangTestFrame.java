/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlkh.testView;

import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

import qlkh.entities.Unit;
import qlkh.utils.Constants;

/**
 *
 * @author GIANG
 */
public class GiangTestFrame extends javax.swing.JFrame {

    /**
     * Creates new form GiangTestFrame
     */
    ResourceBundle bundle;

    public GiangTestFrame() {
        Locale local = Locale.getDefault();
        setResourceBundle(local);
        initComponents();

    }

    // Show view with listUnit on Unit Table
    public void showView(List<Unit> listUnit) {
        this.setVisible(true);
        setEnableBtnEdit(false);
        setEnableBtnDelete(false);
        loadAllUnit(listUnit);

    }

    // Set ResourceBundle to this view
    private void setResourceBundle(Locale locale) {
        //Set Resources Bundle theo local 
        bundle = ResourceBundle.getBundle("qlkh/utils/languages", locale);

    }

    // Load list Unit on Unit Table
    public void loadAllUnit(List<Unit> listUnit) {
        DefaultTableModel unitModel = new DefaultTableModel();
        unitModel.setColumnIdentifiers(Constants.HEADER_UNIT_TABLE);
        int startNumber = 1;
        for (Unit unit : listUnit) {
            Vector row = new Vector();
            row.add(startNumber);
            row.add(unit);
               
            row.add((unit.getStatus()>0)?bundle.getString(Constants.STATUS_SHOW):bundle.getString(Constants.STATUS_HIDE));
            startNumber++;
            unitModel.addRow(row);
        }
        tblUnit.setModel(unitModel);
    }

    // Add event to button addNewUnit
    public void addBtnAddNewUnitActionListener(ActionListener listener) {
        btnAdd.addActionListener(listener);
    }

    public void addBtnEditUnitActionListener(ActionListener listener) {
        btnEdit.addActionListener(listener);
    }

    public void addBtnClearUnitActionListener(ActionListener listener) {
        btnClear.addActionListener(listener);
    }

    public void addBtnDeleteUnitActionListener(ActionListener listener) {
        btnDelete.addActionListener(listener);
    }

    public void addTableUnitMouseListener(MouseListener listener) {
        tblUnit.addMouseListener(listener);
    }

    // Get text from txtNewUnitField
    public String getNewUnitText() {
        return txtNewUnit.getText();
    }

    public void setNewUnitText(String text) {
        txtNewUnit.setText(text);
    }

    public void showMessage(String message, int color) {

        messageUnit.setText(bundle.getString(message));
        messageUnit.setForeground((color == Constants.FLAG_SUCCESS) ? Constants.COLOR_SUCCESS : Constants.COLOR_ERROR);
    }

    public void focusTxtUnitField() {
        txtNewUnit.requestFocus();
    }

    public Unit getEditUnit() {
        int row = tblUnit.getSelectedRow();
        if (row < 0) {
            return null;
        }
        return (Unit) tblUnit.getModel().getValueAt(row, 1);
    }

    public void setEnableBtnAddNew(boolean value) {
        btnAdd.setEnabled(value);
    }

    public void setEnableBtnEdit(boolean value) {
        btnEdit.setEnabled(value);
    }

    public void setEnableBtnDelete(boolean value) {
        btnDelete.setEnabled(value);
    }

    public boolean checkUnitName(String unitName) {
        return (unitName != null && unitName.equals("") == false);
    }

    public int showDialogMesage(JFrame frame, String message, String title) {
        return JOptionPane.showConfirmDialog(frame, bundle.getString(message), bundle.getString(title), JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
    }

    public void clearView() {
        setNewUnitText("");
        setEnableBtnAddNew(true);
        setEnableBtnEdit(false);
        setEnableBtnDelete(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userRoleMainPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNewUnit = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUnit = new javax.swing.JTable();
        messageUnit = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        userRoleMainPanel.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Unit");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        txtNewUnit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnAdd.setBackground(new java.awt.Color(0, 255, 204));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlkh/images/add_text_32px.png"))); // NOI18N
        btnAdd.setText(bundle.getString("btnAdd"));
        btnAdd.setActionCommand("Add Unit");
        btnAdd.setFocusPainted(false);

        jScrollPane1.setViewportView(tblUnit);

        messageUnit.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        btnEdit.setBackground(new java.awt.Color(204, 255, 204));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlkh/images/edit_40.png"))); // NOI18N
        btnEdit.setText(bundle.getString("btnEdit")
        );
        btnEdit.setFocusPainted(false);
        btnEdit.setMaximumSize(new java.awt.Dimension(134, 40));
        btnEdit.setMinimumSize(new java.awt.Dimension(134, 40));

        btnClear.setBackground(new java.awt.Color(51, 153, 255));
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlkh/images/clear_40.png"))); // NOI18N
        btnClear.setText(bundle.getString("btnClear")
        );
        btnClear.setFocusPainted(false);
        btnClear.setMaximumSize(new java.awt.Dimension(134, 40));
        btnClear.setMinimumSize(new java.awt.Dimension(134, 40));

        btnDelete.setBackground(new java.awt.Color(51, 153, 255));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlkh/images/delete_50.png"))); // NOI18N
        btnDelete.setText(bundle.getString("btnDelete")
        );
        btnDelete.setFocusPainted(false);
        btnDelete.setMaximumSize(new java.awt.Dimension(134, 40));
        btnDelete.setMinimumSize(new java.awt.Dimension(134, 40));

        javax.swing.GroupLayout userRoleMainPanelLayout = new javax.swing.GroupLayout(userRoleMainPanel);
        userRoleMainPanel.setLayout(userRoleMainPanelLayout);
        userRoleMainPanelLayout.setHorizontalGroup(
            userRoleMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(userRoleMainPanelLayout.createSequentialGroup()
                .addGroup(userRoleMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userRoleMainPanelLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(txtNewUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(userRoleMainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(messageUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(userRoleMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(userRoleMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        userRoleMainPanelLayout.setVerticalGroup(
            userRoleMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userRoleMainPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(userRoleMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userRoleMainPanelLayout.createSequentialGroup()
                        .addComponent(messageUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNewUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(userRoleMainPanelLayout.createSequentialGroup()
                        .addGroup(userRoleMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(userRoleMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(userRoleMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(userRoleMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel messageUnit;
    private javax.swing.JTable tblUnit;
    private javax.swing.JTextField txtNewUnit;
    private javax.swing.JPanel userRoleMainPanel;
    // End of variables declaration//GEN-END:variables
}
