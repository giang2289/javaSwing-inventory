/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlkh.entities;

import qlkh.utils.Constants;

/**
 *
 * @author GIANG
 */
public class InvoiceExportDetail {

    private String id;
    private String idProduct;
    private String idInvoiceImportDetail;
    private String idInvoiceExport;
    private int counts;
    private String status;

    public InvoiceExportDetail() {
    }

    public InvoiceExportDetail(String id, String idProduct, String idInvoiceImportDetail, String idInvoiceExport, int counts, String status) {
        this.id = id;
        this.idProduct = idProduct;
        this.idInvoiceImportDetail = idInvoiceImportDetail;
        this.idInvoiceExport = idInvoiceExport;
        this.counts = counts;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getIdInvoiceImportDetail() {
        return idInvoiceImportDetail;
    }

    public void setIdInvoiceImportDetail(String idInvoiceImportDetail) {
        this.idInvoiceImportDetail = idInvoiceImportDetail;
    }

    public String getIdInvoiceExport() {
        return idInvoiceExport;
    }

    public void setIdInvoiceExport(String idInvoiceExport) {
        this.idInvoiceExport = idInvoiceExport;
    }

    public int getCounts() {
        return counts;
    }

    public void setCounts(int counts) {
        this.counts = counts;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    


    /**
     * Hàm trả về mảng dữ liệu của entity cho việc INSERT, UPDATE, DELETE
     *
     * @return Mảng dữ liệu String
     */
    public Object[] getParam(int action) {
        Object param[] = null;
        switch (action) {
            case Constants.ACTION_INSERT:
                param = new Object[]{
                    this.getId(),
                    this.getIdProduct(),
                    this.getIdInvoiceImportDetail(),
                    this.getIdInvoiceExport(),
                    this.getCounts(),
                    this.getStatus()

                };
                break;
            case Constants.ACTION_UPDATE:
                param = new Object[]{
                    this.getIdProduct(),
                    this.getIdInvoiceImportDetail(),
                    this.getIdInvoiceExport(),
                    this.getCounts(),
                    this.getStatus(),
                    this.getId()
                };
                break;

            case Constants.ACTION_DELETE:
                param = new Object[]{
                    this.getId()
                };
                break;
        }
        return param;
    }

    @Override
    public String toString() {
        return "InvoiceExportDetail{" + "id=" + id + ", idProduct=" + idProduct + ", idInvoiceImportDetail=" + idInvoiceImportDetail + ", idInvoiceExport=" + idInvoiceExport + ", counts=" + counts + ", status=" + status + '}';
    }

    

    
    
}
