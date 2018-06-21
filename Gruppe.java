import java.util.Arrays;
import java.util.ArrayList;
/**
 * Beschreiben Sie hier die Klasse Gruppe.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Gruppe
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen

    public Nation[] nationen; 
    
    
    
    /**
     * Konstruktor für Objekte der Klasse Gruppe
     */
    public Gruppe(String name1, String name2, String name3, String name4)
    {
        this.nationen = new Nation[4];
        this.nationen[0]= new Nation(name1, 0, 1, 1, 1, 0);
        this.nationen[1]= new Nation(name2, 0, 0, 0, 0, 0);
        this.nationen[2]= new Nation(name3, 0, 0, 0, 0, 0);
        this.nationen[3]= new Nation(name4, 0, 0, 0, 0, 0);

    }

    public void getNationen(){   
        System.out.println(" Übersicht Nationen !");
        System.out.println( "                     "); 
        for(int i = 0; i < nationen.length; i++){
            System.out.println(nationen[i].getName());
        }
    }

    public String getNation(){   //kein Komma am Anfang
        String output = "";
        for(int i = 0; i < nationen.length; i++){
            if (i== 0) {output = nationen[i].getName();
            }
            else{ output = output + ", "+nationen[i].getName();
            }
        }
        return output;
    }

    public void getTore(){   

        System.out.println( "              "); 
        // System.out.println(nationen[0].getTore());
        System.out.println("NationA, Tore:"+ nationen[0].getTore());
        System.out.println("NationB, Tore:"+ nationen[1].getTore());
        System.out.println("NationC, Tore:"+ nationen[2].getTore());
        System.out.println("NationD, Tore:"+ nationen[3].getTore());
    }

    public void getSieg(){
        System.out.println("NationA, Sieg:"+ nationen[0].getSieg());
        System.out.println("NationB, Sieg:"+ nationen[1].getSieg());
        System.out.println("NationC, Sieg:"+ nationen[2].getSieg());
        System.out.println("NationD, Sieg:"+ nationen[3].getSieg());
    }

    public void berechnePaarungen(){

        for (int i = 0; i < nationen.length; i++) {

            for(int x =i+1; x < nationen.length; x++)
                System.out.println((nationen[i].getName())+ " : " + (nationen[x].getName()));
        }

    }
    
    public void getPunkte(){
        for(int i = 0; i < nationen.length; i++){
        System.out.println((nationen[i].getTore()) + berechnePunkte());
}
}
}