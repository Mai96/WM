import java.util.Arrays;


//import java.util.ArrayList;
/**
 * Beschreiben Sie hier die Klasse WM.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class WM
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    //int nationen;
    //int gruppen;
    //boolean möglich;
    public Gruppe[] gruppen;

    /**
     * Konstruktor für Objekte der Klasse Gruppe
     */
    public WM( )
    {         
        this.gruppen = new Gruppe[8];
        this.gruppen[0] = new Gruppe("Russland","Saudi-Arabien","Ägypten", "Uruguay");
        this.gruppen[1] = new Gruppe("Marroko","Iran","Portogal", "Spanien");
        this.gruppen[2] = new Gruppe("Frankreich","Australien","Peru", "Dänemark");
        this.gruppen[3] = new Gruppe("Argentinien","Island","Kroation", "Nigeria");
        this.gruppen[4] = new Gruppe("Costa Rica","Serbien","Brasilien", "Schweiz");
        this.gruppen[5] = new Gruppe("Deutschland","Mexiko","Schweden", "Südkorea");
        this.gruppen[6] = new Gruppe("Belgien","Panama","Tunesien", "England");
        this.gruppen[7] = new Gruppe("Kolumbien","Japan","Polen", "Senegal");

    }

    public void zeigeAlleNationen(){
        System.out.println("                              ");
        System.out.println("Übersicht über alle Nationen!");
        System.out.println("                              ");
        for(int i = 0; i < gruppen.length; i++){
            // gruppen[i].getNationen();
            System.out.println(gruppen[i].getNation());
        }

    }

    public void zeigeAlleGruppen(){
        System.out.println("                              ");
        System.out.println("Übersicht über Gruppen!");
        System.out.println("                              ");
        System.out.println( "Gruppe A: " +gruppen[0].getNation());
        System.out.println( "Gruppe B :" +gruppen[1].getNation());
        System.out.println( "Gruppe C :" +gruppen[2].getNation());
        System.out.println( "Gruppe D: " +gruppen[3].getNation());
        System.out.println( "Gruppe E :" +gruppen[4].getNation());
        System.out.println( "Gruppe F :" +gruppen[5].getNation());
        System.out.println( "Gruppe G: " +gruppen[6].getNation());
        System.out.println( "Gruppe H :" +gruppen[7].getNation());

    }

    public void getTore(){
        System.out.println("                              ");
        System.out.println("Gruppe A, Tore:");
        gruppen[0].getTore();
        System.out.println("                              ");
        System.out.println("Gruppe B, Tore:");
        System.out.println("                              ");
        gruppen[1].getTore();
        System.out.println("                              ");
        System.out.println("Gruppe C, Tore:");
        gruppen[2].getTore();
    }

    public void getSieg(){
        System.out.println("                              ");
        System.out.println("Gruppe A, Sieg:");
        gruppen[0].getSieg();
        System.out.println("                              ");
        System.out.println("Gruppe B, Sieg:");
        System.out.println("                              ");
        gruppen[1].getSieg();
        System.out.println("                              ");
        System.out.println("Gruppe C, Sieg:");
        gruppen[2].getSieg();
    }

    public void getGruppeA(){

        System.out.println("                              ");
        System.out.println("Übersicht Gruppe A!");
        System.out.println(gruppen[0].getNation());

    }

    public void getGruppeB(){
        System.out.println("                              ");
        System.out.println("Übersicht Gruppe B!");
        System.out.println(gruppen[1].getNation());

    }

    public void getGruppeC(){

        System.out.println("                              ");
        System.out.println("Übersicht Gruppe C!");
        System.out.println(gruppen[2].getNation());

    }

    public void getGruppeD(){
        System.out.println("                              ");
        System.out.println("Übersicht Gruppe C!");
        System.out.println(gruppen[3].getNation());

    }

    public void getGruppeE(){
        System.out.println("                              ");
        System.out.println("Übersicht Gruppe E!");
        System.out.println(gruppen[4].getNation());

    }

    public void getGruppeF(){
        System.out.println("                              ");
        System.out.println("Übersicht Gruppe F!");
        System.out.println(gruppen[5].getNation());

    }

    public void getGruppeG(){
        System.out.println("                              ");
        System.out.println("Übersicht Gruppe G!");
        System.out.println(gruppen[6].getNation());

    }
    public void getGruppeH(){
        System.out.println("                              ");
        System.out.println("Übersicht Gruppe H!");
        System.out.println(gruppen[7].getNation());

    }
    
    public void berechneAllePaarungen(){
        System.out.println("                            ");
        System.out.println("Übersicht über alle Spielpaarungen!");
        System.out.println("                            ");
        for(int i = 0; i < gruppen.length; i++){
            gruppen[i].berechnePaarungen();
        }
    }
    
    public void berechnePaarungenGruppeA(){
            System.out.println("                            ");
            System.out.println("Spielpaarungen von Gruppe A:");
            System.out.println("                            ");
            gruppen[0].berechnePaarungen();
        
    }
    
    public void berechnePaarungenGruppeB(){
            System.out.println("                            ");
            System.out.println("Spielpaarungen von Gruppe B:");
            System.out.println("                            ");
            gruppen[1].berechnePaarungen();
        
    }
    
    
    public void berechnePaarungenGruppeC(){
            System.out.println("                            ");
            System.out.println("Spielpaarungen von Gruppe C:");
            System.out.println("                            ");
            gruppen[2].berechnePaarungen();
        
    }
    
    
    public void berechnePaarungenGruppeD(){
            System.out.println("                            ");
            System.out.println("Spielpaarungen von Gruppe D:");
            System.out.println("                            ");
            gruppen[3].berechnePaarungen();
        
    }
    
    public void berechnePaarungenGruppeE(){
            System.out.println("                            ");
            System.out.println("Spielpaarungen von Gruppe E:");
            System.out.println("                            ");
            gruppen[4].berechnePaarungen();
        
    }
    
    public void berechnePaarungenGruppeF(){
            System.out.println("                            ");
            System.out.println("Spielpaarungen von Gruppe F:");
            System.out.println("                            ");
            gruppen[5].berechnePaarungen();
        
    }
    
    public void berechnePaarungenGruppeG(){
            System.out.println("                            ");
            System.out.println("Spielpaarungen von Gruppe G:");
            System.out.println("                            ");
            gruppen[6].berechnePaarungen();
        
    }
    
    public void berechnePaarungenGruppeH(){
            System.out.println("                            ");
            System.out.println("Spielpaarungen von Gruppe H:");
            System.out.println("                            ");
            gruppen[7].berechnePaarungen();
        
    }
}