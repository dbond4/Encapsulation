/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author F03 H4MM3R
 */
public class GameCharacter {
    private String gender;
    private String race;
    private String characterClass;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }
    
    public void autoAttack(){
        
    }
    public void castSpell(){
        
    }
    public void takeDamage(){
        calculateDamage();
        decrementHealth(10);
    }
    private void calculateDamage(){
        System.out.println("calculated damage");
    }
    private void decrementHealth(int damage){
        System.out.println("removed health");
    }
}
