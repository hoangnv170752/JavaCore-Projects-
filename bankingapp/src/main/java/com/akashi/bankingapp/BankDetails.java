package com.akashi.bankingapp;

import java.util.Scanner;

/**
 *
 * @author akashi
 */
public class BankDetails {
    private String accNo;
    private String name;
    private String accType;
    private long balance;
    Scanner sc = new Scanner(System.in);
    public void openAccount(){
        System.out.println("Nhap tai khoan so: ");
        accNo = sc.next();
        System.out.println("Nhap loai tai khoan:");
        accType = sc.next();
        System.out.println("Nhap ten nguoi dung:");
        name = sc.next();
        System.out.println("Nhap so tien trong tai khoan: ");
        balance = sc.nextLong();
    }
    public void showAcc() {
        System.out.println("Ten CTK: " + name);
        System.out.println("Ma tai khoan: " + accNo);
        System.out.println("Loai tai khoan: " + accType);
        System.out.println("So tien: " + balance);
    }
    public void deposit() {
        long amt;
        System.out.println("Nhap vao so luong ma ban muon dat coc: ");
        amt = sc.nextLong();
        balance += amt;
    }
    public void withDrawal() {
        long amt;
        System.out.println("Them so luong ma ban muon rut: ");
        amt = sc.nextLong();
        if(balance >= amt) {
            balance -= amt;
            System.out.println("So tien sau khi rut:" + balance);
        } else {
            System.out.println("So tien cua ban it hon so tien rut " + amt + "\tThuc hien lenh rut khong thanh cong");
        }
    }
    public boolean search(String accNo){
        if(accNo.equals(accNo)) {
            showAcc();
            return (true);
        }
        return (false);
    }
}
