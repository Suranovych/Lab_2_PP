package com.Learn;
import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
public class Main {

    public static void main(String[] args) {
        Student[] arr = setDataArray(freadData("text.txt"));
        Year y = new Year();
        y.yearMore(arr);
        Faculty f = new Faculty();
        f.sameFaculty(arr);
        Group g = new Group();
        g.sameGroup(arr);
    }
    public static List<String> freadData(String fname) {
        List<String> stringsList = new ArrayList<>();
        String buffer;
        try {
            BufferedReader freader = new BufferedReader(new FileReader(fname));
            while ((buffer = freader.readLine()) != null) {
                stringsList.add(buffer);
            }
            freader.close();
        } catch (Exception ex) {
            return null;
        }
        return stringsList;
    }

    public static Student[] setDataArray(List<String> data) {
        Student[] dataList = new Student[data.size()];
        for (int i = 0; i < data.size(); i++) {
            String[] splittedStr = data.get(i).split(" ");
            int id = Integer.parseInt(splittedStr[0]);
            short course = Short.parseShort(splittedStr[8]);
            Student person = new Student(id, splittedStr[1], splittedStr[2], splittedStr[3], splittedStr[4],
                    splittedStr[5], splittedStr[6], splittedStr[7], course, splittedStr[9]);

            dataList[i] = person;
        }
        return dataList;
    }
}
