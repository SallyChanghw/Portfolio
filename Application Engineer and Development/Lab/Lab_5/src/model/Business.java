/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sally
 */
public class Business {
    MasterOrderList masterOrdeList;
    SupplierDirectory supplierDirectory;
    
    public Business(){
        masterOrdeList =new MasterOrderList();
        supplierDirectory =new SupplierDirectory();
    }

    public MasterOrderList getMasterOrdeList() {
        return masterOrdeList;
    }

    public void setMasterOrdeList(MasterOrderList masterOrdeList) {
        this.masterOrdeList = masterOrdeList;
    }

    public SupplierDirectory getSupplierDirectory() {
        return supplierDirectory;
    }

    public void setSupplierDirectory(SupplierDirectory supplierDirectory) {
        this.supplierDirectory = supplierDirectory;
    }
    
}
