package ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) throws FileNotFoundException {
        String[] judete;
        Scanner sc = new Scanner(new File("C:\\Users\\Flavius\\IdeaProjects\\tema2\\src\\ex1\\judete_in.txt"));
        judete = sc.nextLine().split(",");
        sc.close();
        Arrays.sort(judete);
        System.out.println(Arrays.toString(judete));
        Scanner sc_citire = new Scanner(System.in);
        String jud_cautat=sc_citire.nextLine();
        sc_citire.close();
        int i= Arrays.binarySearch(judete,jud_cautat);
        if(i>=0)
            System.out.println("judetul " + jud_cautat + " se afla pe pozitia " + i);
        else
            System.out.println("judetul nu se afla in lista");
    }
}
