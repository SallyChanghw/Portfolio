/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author sally
 */
public class MasterOrderList {
    
    ArrayList<Order> orederList;

    public MasterOrderList() {
        orederList = new ArrayList<Order>();
    }

    public ArrayList<Order> getOrederList() {
        return orederList;
    }

    public void setOrederList(ArrayList<Order> orederList) {
        this.orederList = orederList;
    }
    
    public void addNewOrder(Order order){
        this.orederList.add(order);
    }
}
