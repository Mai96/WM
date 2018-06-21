
/**
 * Beschreiben Sie hier die Klasse Nation.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Nation
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    public String name;
    public int sieg;
    public int niederlage;
    public int unentschieden;
    public int tore;
    public int punkte;
    

    /**
     * Konstruktor für Objekte der Klasse Nation
     */
    public Nation( String name, int sieg, int niederlage, int unentschieden, int tore, int punkte)
    {
        // Instanzvariable initialisieren
        this.name = name;
        this.sieg = sieg;
        this.niederlage = niederlage;
        this.tore = tore;
        this.punkte = punkte; 
        
       
    }
    
      /**
       * *
       * */public String getNationDetails()
    {
        String output = "Nation:" + name + "Sieg:" + sieg + "Niederlage:" + niederlage + "Tore:"
        + tore + "Punkte:" + 3 * sieg + 1 * unentschieden;
        return output;
    }
    
    /**
      Hier können die Parameter eingesetzt werden.
     */
    public String setInfo(String name, int sieg, int niederlage, int unentschieden, int tore, int punkte){
       this.sieg = sieg;
       this.niederlage = niederlage;
       this.unentschieden = unentschieden;
       this.tore = tore;
       this.punkte = punkte;
       return name + "," + String.valueOf(this.sieg) + "," + String.valueOf(this.niederlage) + "," + String.valueOf(this.unentschieden)
       + "," + String.valueOf(this.tore)+ "," + String.valueOf(this.punkte);
    }
    
    /**
      Hier wird ein neuer Name gesetzt.
     */
    public String getName (){
        return name;
    }
   
    
   /**
      Hier wird ein neuer Name gesetzt.
     */
    public int getTore(){
        return tore;
    }
    
    /**
      Hier wird ein neuer Name gesetzt.
     */
    public void setTore(int newTore){
        tore = newTore;
    }
    
    /**
      Hier wird ein neuer Name gesetzt.
     */
    public int getSieg(){
        return sieg;
    }
    
    /**
      Hier wird ein neuer Name gesetzt.
     */
    public void setSieg(int newSieg){
        sieg = newSieg;
    }
    
    /**
      Hier wird ein neuer Name gesetzt.
     */
    public int getPunkte(){
        return punkte;
    }
     
    public String getAktuelleNationInfo (int tore, int punkte)
    {
        this.tore += tore;
        this.punkte += punkte;
        return name + "/" + String.valueOf(this.tore) + "/" + String.valueOf(this.punkte);
    }

  
}
