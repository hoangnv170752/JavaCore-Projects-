package com.akashi.bankingapp;

import java.util.Scanner;

/**
 *
 * @author akahsi
 */
public class Bankingapp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("So khach hang ban muon nhap: ");
        int n = sc.nextInt();
        BankDetails C[] = new BankDetails[n];
        for(int i = 0 ; i < C.length; i++){
            C[i] = new BankDetails();
            C[i].openAccount();
        }
        int ch;
        do {
            System.out.println("\n** He thong Banking Akasshi**");
            System.out.println("1. Show toan bo account \\n 2. Search by Account number\\n 3. Deposit the amount \\n 4. Withdraw the amount \\n 5.Exit");
            System.out.println("Nhap lua chon: ");
            ch = sc.nextInt();
            switch(ch) {
                case 1: 
                    for(int i = 0; i < C.length; i++) {
                        C[i].showAcc();
                    }
                    break;
                case 2:
                    System.out.print("Enter account no. you want to search: ");  
                    String accNo = sc.next();
                    boolean found = false;  
                    for (BankDetails C1 : C) {
                        found = C1.search(accNo);
                        if (found) {
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Search failed");
                    }
                    break;
                case 3:  
                    System.out.print("Enter Account no. : ");  
                    accNo = sc.next();  
                    found = false;  
                    for (BankDetails C1 : C) {
                        found = C1.search(accNo);
                        if (found) {
                            C1.deposit();
                            break;
                        }
                    }  
                    if (!found) {  
                        System.out.println("Search failed! Account doesn't exist..!!");  
                    }  
                    break;  
                case 4:
                    System.out.print("Enter Account No : ");  
                    accNo = sc.next();  
                    found = false;  
                    for (BankDetails C1 : C) {
                        found = C1.search(accNo);
                        if (found) {
                            C1.withDrawal();
                            break;
                        }
                    }  
                    if (!found) {  
                        System.out.println("Search failed! Account doesn't exist..!!");  
                    }  
                    break;  
                case 5:
                    System.out.println("Cam on da su dung");
                    break;
            }   
        } while(ch != 5);
    }
}
