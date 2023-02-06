/*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
 */
package Methods;

/**
 *
 * @author SWG_T28
 */
public class JUNE_ExamMethods {
    
    public static int calculateLevelMultiplier(){
        return (int) (Math.random() * 3 )+ 1;
    }
    
    public static int calculateBossHealth(int l, int lm) {
        return 50 + l * 10 * lm;
    }
    
    public static int getAttackType(){
       return  (int) (Math.random() * 5) + 1;
        
    }
    
    public static void main(String[] args) {
        int numWins = 0;  
        int highestAttackDamage = 0;  
        int highestLevel = 0; 
        String attackDescription = ""; 
        int attackDamage = 0;
        for (int level = 1; level <= 10; level++) {

            System.out.println("\n\nLEVEL " + level);

            
            int levelMultiplier =  calculateLevelMultiplier(); //get levelmultipl
           

            //int bossHealth = 50 + level * 10 * levelMultiplier; //get bosshealth 
            int bossHealth = calculateBossHealth(level, levelMultiplier);
            
            System.out.println("BOSS TOTAL HEALTH: " + bossHealth);
         

            int totalAttackDamage = 0;

        
            for (int attack = 1; attack <= 4; attack++) {

 
                int attackType = getAttackType(); //get attack type
         
            
                if (attackType == 1) { //creste s method for this if ststremeny - pass in attsvk type as an input vst, attack damage and attack description as output variables
                    attackDamage = 0;
                    attackDescription = "MISS";
                } else if (attackType == 2 || attackType == 3
                        || attackType == 4) {

                    attackDamage = attackType * 15;
                    attackDescription = "NORMAL";
                } else {
                    attackDamage = bossHealth / 2;
                    attackDescription = "CRITICAL";
                }
                
                System.out.println("ATTACK: " + attack + "\tATTACK TYPE: " + attackDescription + "\t✓ATTACK DAMAGE: " + attackDamage);

                totalAttackDamage = totalAttackDamage + attackDamage; 
            }

            System.out.println("TOTAL ATTACK DAMAGE: " + totalAttackDamage);

            
            if (totalAttackDamage > bossHealth) { //pass in both vars, set bosshealth in method
                bossHealth = 0;
            } else {
                bossHealth = bossHealth - totalAttackDamage;
            }

            System.out.println("BOSS HEALTH REMAINING: "
                    + bossHealth);

            if (bossHealth == 0) { 
                System.out.println("BOSS DEFEATED!");
                numWins++;

            } else {
                System.out.println("LEVEL LOST");
            }

            if (totalAttackDamage > highestAttackDamage) {
                highestAttackDamage = totalAttackDamage;
                highestLevel = level;
            }
        }

        System.out.println("HIGHEST ATTACK DAMAGE WAS " + highestAttackDamage + " ON LEVEL " + highestLevel);

        System.out.println("YOU WON " + numWins + " OUT OF 10 LEVELS");

        if (numWins > 7) {
            System.out.println("YOU WIN THE GAME!");
        } else {
            System.out.println("YOU LOSE THE GAME!");
        }

    }
}
