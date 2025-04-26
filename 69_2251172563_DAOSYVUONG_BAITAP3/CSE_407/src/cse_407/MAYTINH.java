/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse_407;

/**
 *
 * @author Vuong Dao
 */
public class MAYTINH {
    private String Ten;
    private BONHO bonho;

    public MAYTINH(String ten, BONHO bonho) {
        this.Ten = ten;
        this.bonho = bonho;
    }

    public void HienThiThongTin() {
        System.out.println("Máy tính: " + Ten);
        System.out.println("Loại bộ nhớ: " + bonho.getLoai());
        System.out.println("Dung lượng: " + bonho.getDungLuong());
    }
}
