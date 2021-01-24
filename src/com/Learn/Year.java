package com.Learn;

import java.util.Scanner;

public class Year {
    public void yearMore(Student[] arr){
        Scanner scan = new Scanner(System.in);
        int y;
        System.out.print("Введіть рік: ");
        y = scan.nextInt();
        System.out.println("Студенти, що народилися після "+ y + " року:");
        for(int i = 0; i < arr.length; i++){
            String string = arr[i].getDb();
            int year = Integer.parseInt(string.substring(string.length() - 4));
            if(year > y){
                System.out.println(arr[i].toSting());
            }
        }
    }
}
