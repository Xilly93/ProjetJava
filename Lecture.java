import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Lecture {

    public static void lireFichier() {
        //List<String> listIInfo = new ArrayList<>();
        //List<String> listDInfo = new ArrayList<>();
        List<String> nodeList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel est le fichier que vous voulez lire:");
        String lien = sc.nextLine();
        try (BufferedReader fichier = new BufferedReader(new FileReader(new File(lien)))){
            String line;
            while((line =fichier.readLine()) != null) {
                if (line.startsWith("I")){
                    //listIInfo.add(extracInfo(line));
                }else if(line.startsWith("D")) {
                    //listDInfo.add(extracInfo(line));
                }
                nodeList.add(extracInfo(line));
            }
        }catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("List node type I :");
        for (String ligne : nodeList) {
            System.out.println(ligne);
        }

    }

    public static String extracInfo(String line) {
        int index = line.indexOf(":");
        if (index != -1) {
            return line.substring(index+1).trim();

        }
        return "";
    }

    public static void main(String[] args) {
        lireFichier();
        }
}