package Autres;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.Scanner;

import representation.*;

public class MenuInter{
	public static void sauvegarder(Node node){
		try{
			
			String cheminRepertoire = "Autres/Sauvegarde";
			File repertoire = new File(cheminRepertoire);
			System.out.println("\nNom des sauvegardes :");
			int i = 1;
			String[] sauvegardes = repertoire.list();

			System.out.println("\nPARTIE SAUVEGARDEE\n");
			ObjectOutputStream oos;
			oos = new ObjectOutputStream( new FileOutputStream(new File("Autres/Sauvegarde/sauvegarde"+ (sauvegardes.length+1) + ".txt")));	
			oos.writeObject(node);
			oos.close();
		}
		catch(Exception e ){
			e.printStackTrace();
		}
	}

	public static void Display(Map<String,Node> nodeMap) {
        Scanner sc = new Scanner(System.in);
        int rep;
        do {
            System.out.println("-------------");
            System.out.println("Voici le Menu");
            System.out.println("-------------");
            System.out.println("Tapez 0 pour quitter le programme");
            System.out.println("Tapez 1 pour lancer une nouvelle partie");
            System.out.println("Tapez 2 pour reprendre une sauvegarde");
            System.out.println();
            System.out.println("Tapez votre reponse");
            rep = sc.nextInt();
            if (rep == 0) {
                System.out.println("Fin du programme.");
            } else if (rep == 1) {
                NodeF.Execute(nodeMap.get("I1"),sc);
				break;
            } else if (rep == 2) {
                ChargerSauvegarde(nodeMap);
				break;
            } else {
                System.out.println("Choix invalide. Veuillez réessayer.");
            }
        }while(rep != 0);
            
    }

	public static void ChargerSauvegarde(Map<String,Node> nodeMap){
		Scanner sc = new Scanner(System.in);

		// Afficher les sauvegardes
		String cheminRepertoire = "Autres/Sauvegarde";
		File repertoire = new File(cheminRepertoire);
		System.out.println("\nNom des sauvegardes :");
		int i = 1;
		String[] sauvegardes = repertoire.list();
		for (String element : sauvegardes) {
			System.out.println(i+"." + element);
			i+=1;
		}
		System.out.print("\nChoix de la sauvegarde : ");
		int numSauvegarde = sc.nextInt();
		System.out.println("\n");

		//Charger la sauvegarde
		try{
			ObjectInputStream ois = new ObjectInputStream( new FileInputStream(new File("Autres/Sauvegarde/"+sauvegardes[numSauvegarde-1]))) ;
			Node node = (Node) ois.readObject();
			NodeF.Execute(node,sc);
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}
}