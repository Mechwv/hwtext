package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        File f = new File("D://Android projects/A.txt");
        File o = new File("D://Android projects/B.txt");
        PrintWriter out = null;
        String pool;
        int cnt=0;
        try {
            f.createNewFile();
            o.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(f));
            out = new PrintWriter(new FileWriter(o));
            writer.printf(text);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Scanner s = new Scanner(f);
            while (s.hasNext()){
                pool = s.next();
                if (pool.charAt(0) == 'a'){
                    out.append(pool+" ");
                }
            }
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}