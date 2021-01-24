package com.Learn;

import java.util.Scanner;

public class Group {
    public void sameGroup(Student[] arr){
        Scanner scan = new Scanner(System.in);
        String g;
        System.out.print("Введіть групу: ");
        g = scan.nextLine();
        System.out.println("Студенти, що належать до групи "+ g);
        for(int i = 0; i< arr.length; i++){
            if(g.equals(arr[i].getGroup())){
                System.out.println(arr[i].toSting());
            }
        }
    }
}
