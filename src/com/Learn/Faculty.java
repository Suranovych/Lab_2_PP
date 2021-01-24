package com.Learn;
import java.util.Scanner;
public class Faculty {
    public void sameFaculty(Student[] arr){
        Scanner scan = new Scanner(System.in);
        String f;
        System.out.print("Введіть інститут: ");
        f = scan.nextLine();
        System.out.println("Стунденти з інституту "+ f + ":");
        for(int i = 0; i< arr.length; i++){
            if(f.equals(arr[i].getFaculty())){
                System.out.println(arr[i].toSting());
            }
        }
    }
}
