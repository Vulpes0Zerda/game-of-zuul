/*
 TODO: this is a template for loot
*/
/**
 * The Loot class is a class that defines all the loots such as keys, Experience (XP) and Power Ups.
 */
public class Loot {
   
    //Power-Up:
    private boolean power = false; // Gibt an, ob das Power-Up aktiv ist
    private int startTimer = 10; // Timer in Sekunden
    
    //key:
    private int key = 1;
    
    /**
     * POWER Up Start:
     */
    // Aktiviert das Power-Up
public void makePowerUp() {
        if (power) {
            System.out.println("Power-Up ist bereits aktiv!");
        }

        power = true; // Power-Up aktivieren
        System.out.println("Power-Up aktiviert! Spieler ist jetzt unbesiegbar.");
        timer();
    }

    // Timer-Logik
private void timer() {
        while (startTimer > 0 && power) {
            startTimer -= 1; // Timer um 1 Sekunde reduzieren

            // Wartezeit simulieren (1 Sekunde)
            for (long i = 0; i < 2_500_000_000L; i++) {
             //Zeit wird hier in dieser leeren for-Schleife simuliert.
            }
            System.out.println("----------------------------------------");
            System.out.println("Zeit übrig: " + startTimer + " Sekunden");
        }

        // Power-Up deaktivieren, wenn der Timer abgelaufen ist
        if (startTimer <= 0) {
            power = false;
            System.out.println("Das Power-Up ist abgelaufen!");
            System.out.println("----------------------------------------");
        }
    }

    // Status des Power-Ups prüfen
public boolean hasPowerUp() {
        return power;
    }
    
    /**Key Start
     * 
     */
    
public int numbers_of_keys(){
    
        return key;

    }
    /**XP Start
     * 
     */
    
/*public void numbers_of_level(){

    if(0 < xp <= 5){

    System.out.println("Du hast ein neues Level erreicht!");
    System.out.println("Neues Level: 1");

    }else if (6 <= xp <= 10){

    System.out.println("Du hast ein neues Level erreicht!");
    System.out.println("Neues Level: 2");

    }else if(10 <= xp <= 15){
    System.out.println("Du hast ein neues Level erreicht!");
    System.out.println("Neues Level: 3");
    }
    }*/
}
