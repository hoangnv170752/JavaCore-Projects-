import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    static void towerHanoi(int n, char fromRod, char auxRod, char toRod) {
        if (n == 0) {
            return;
        }
        towerHanoi(n -1 , fromRod, auxRod, toRod);
        System.out.println("Move disk " + n + " from rod " + fromRod + " to rod " + toRod);
        towerHanoi(n-1, auxRod, toRod, fromRod);
    }
    public static void main(String[] args) {
        int N = 3;
        towerHanoi(N , 'A',  'B', 'C');
    }
}