
/**
 * Beschreiben Sie hier die Klasse Spiel.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Spiel
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    public Nation heim;
    public Nation gast;
    public int heimTore;
    public int gastTore;

    /**
     * Konstruktor für Objekte der Klasse Spiel
     */
    public Spiel(Nation heim, Nation gast, int heimTore, int gastTore)
    {
        this.heim = heim;
        this.gast = gast;
        this.heimTore = heimTore;
        this.gastTore = gastTore;

    }

    public int[] brechnePunkte( int tore1, int tore2){
        int [] punkte = {0,0};
        if(tore1 > tore2){punkte[0] = 3;}
        if(tore1 < tore2){punkte[1] = 3;}
        if(tore1 == tore1){punkte[0] = 1; punkte[1] = 1;}
        return punkte;
    }
}
