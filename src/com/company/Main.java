package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        File f = new File("D://Android projects/A.txt");
        String pool;
        int cnt=0;
        try {
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(f));
            writer.printf(text);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Scanner s = new Scanner(f);
            while (s.hasNext()){
                pool = s.next();
                if (pool.charAt(pool.length()-1) == 'b'){
                    cnt++;
                }
            }
            System.out.println(cnt);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}