package ex2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) throws IOException {
        List<Vers> versuri = new ArrayList<Vers>();
        String outputLine="";
        Random rand = new Random();
        String line;
        Scanner sc = new Scanner(new File("src/ex2/cantec_in.txt"));
        while (sc.hasNextLine()) {
            line = sc.nextLine();
            Vers vers = new Vers(line);
            versuri.add(vers);
        }
        FileWriter fileWriter=new FileWriter("src/ex2/cantec_out.txt");
        for (Vers v : versuri) {
            outputLine = v.getVers() + " cuv= " + v.nr_cuv() + " voc= " + v.nr_voc();
            if (v.getVers().endsWith("na"))
                outputLine += " *";
            double random = rand.nextDouble();
            if (random < 0.1)
                outputLine = outputLine.toUpperCase();
            fileWriter.write(outputLine + "\n");
        }
            fileWriter.close();
    }
}

