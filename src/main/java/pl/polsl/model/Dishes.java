/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.model;

/**
 * <b>Dishes </b> class uses to operate with table
 * @version 3.0
 * @author Mikolaj Krasucki
 */
public class Dishes {
    private String name;
    private int amount;
    private int kcals;
    private int salt;
    private int sugar;
    private int protein;
    private int fats;
    
    /**
     * Constructor that gives values 
     * @param cname - name of dish 
     * @param camount - amount of dish
     * @param ckcals - calories
     * @param csalt - salt
     * @param csugar - sugar
     * @param cprotein - proteins 
     * @param cfats - fats
     */
    public Dishes(String cname, int camount, int ckcals, int csalt, int csugar, int cprotein, int cfats){
        this.name = new String(cname);
        this.amount = camount;
        this.kcals = ckcals;
       this.salt = csalt;
       this.sugar = csugar;
       this.protein = cprotein;
       this.fats = cfats;
    }
    
    /**
     * returns name of dish
     * @return name of dish
     */
    public String getName(){
        return name;
    }
    /**
     * returns amount of dish
     * @return amount of dish
     */
    public int getAmount(){
        return amount;
    }
    /**
     * return amount of kcals 
     * @return amount of kcals 
     */
    public int getKcals(){
        return kcals;
    }
    /**
     * returns amount of salt
     * @return amount of salt
     */
    public int getSalt(){
        return salt;
    }
    /**
     * return amount of sugars
     * @return amount of sugars 
     */
    public int getSugar(){
        return sugar;
    }
    /**
     * return amount of proteins 
     * @return amount of proteins
     */
    public int getProtein(){
        return protein;
    }
    /**
     * return amount of fats
     * @return amount of fats
     */
    public int getFats(){
        return fats;
    }
}
