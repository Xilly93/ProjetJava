import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import representation.*;

public class Lecture {
    protected static List<Boolean> isInner = new ArrayList<>();
    protected static List<Boolean> isDeci = new ArrayList<>();
    
    public static List<String> lireFichier(String lien) {
        List<String> lignes = new ArrayList<>();
        try (BufferedReader fichier = new BufferedReader(new FileReader(new File(lien)))){
            String line;
            
            while((line =fichier.readLine()) != null) {
                if (line.trim().equals(""))
                    continue;  
                //System.out.println(line);
                lignes.add(line);
                
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        return lignes;

    }

    public static List<String> extractNodeText(String lien){
        List<String> lignes = lireFichier(lien);
        for (int i = 0; i<lignes.size();i++){
            lignes.set(i,extracInfo(lignes.get(i))); 
        }
        return lignes;
    }

    public static List<List<Boolean>> extractNodeType(String lien){
        List<String> lignes = lireFichier(lien);
        List<Boolean> isInner = new ArrayList<>();// [0] : isInner, [1] : isDeci, 
        List<Boolean> isDeci = new ArrayList<>();
        String ligne;
        for (int i = 0; i<lignes.size();i++){
            ligne = lignes.get(i).trim();
            //System.out.println("ligne " + i + " : " + ligne);
            isInner.add(false);
            isDeci.add(false);
            if (ligne.startsWith("I")){
                isInner.set(i,true);
            }else if(ligne.startsWith("D")) {
                isDeci.set(i,true);
            }
        }
        List<List<Boolean>> nodesType = new ArrayList<>();
        nodesType.add(isInner);
        nodesType.add(isDeci);
        return nodesType;
    }


    public static String extracInfo(String line) {
        int index = line.indexOf(":");
        if (index != -1) {
            return line.substring(index+1).trim();

        }
        return "";
    }

    public static List<Node> CreateNodeList(String lien){
        List<String> nodesText = extractNodeText(lien);
        List<List<Boolean>> nodesType = extractNodeType(lien);
        List<Boolean> isInn = nodesType.get(0);
        List<Boolean> isDeci = nodesType.get(1);
        List<Node> nodeList = new ArrayList<>();
        int n = nodesText.size();
        for(int i = 0; i<n; i++){
            if(isInn.get(i))
                nodeList.add(new InnerNode(nodesText.get(i)));
            else if(isDeci.get(i))
                nodeList.add(new DecisionNode(nodesText.get(i)));
        }
        return nodeList;
    }
}
    