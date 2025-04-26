/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cse_407;

/**
 *
 * @author Vuong Dao
 */
public class CSE_407 {

    public static void main(String[] args) {
        BONHO bonho = new BONHO("SSD", 512);
        MAYTINH mayTinh = new MAYTINH("Laptop ABC", bonho);
        mayTinh.HienThiThongTin();
    }
    
}
