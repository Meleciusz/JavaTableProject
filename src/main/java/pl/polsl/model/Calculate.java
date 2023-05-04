package pl.polsl.model;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/**
 *<b>Calculate </b>make basic calculations
 * @author Mikolaj Krasucki
 * @version 1.1 
 */
        
public class Calculate {
    public ArrayList<String> names;
    /**
     * Method, which throw exception
     * @param amount - amount of products, that user enter
     * @return amount - amount of product, that user enters 
     */
    /**
     * 
     * @param amount - amount of products
     * @return amount - amount of products
     * @throws NoZero - own exception, that throw whenever amount is 0 or less 
     */
    public int number(int amount) throws NoZero{
       
       if(amount<=0){
          throw new NoZero("Musi byc wiecej niz 0: "+amount);
       }
       else
       {
          //System.out.println("OK");
       }
       
       return amount;
    }
    
//    public ArrayList<String> number2(ArrayList<String> amount) throws Nozero2{
//       
//        for(String x : amount){
//            if(x.equals(null)){
//          throw new Nozero2("element nie moze byc nullem: "+amount);
//          }}
//       
//       return amount;
//    }
    
    /**
     * Method, that checks if amount is correct 
     * @param count - amount of product 
     * @return correct amount of product 
     */
   public ArrayList<Integer> if_amount_correct(ArrayList<Integer> count){
        int var = 200;
        
        for(int i=0; i<count.size(); i++)
        {
            if(count.get(i) == null){
                //System.out.println("Ilosc nie do przyjecia, automatyczna zmiana na 200g");
                count.set(i, var);
            }else if(count.get(i) <= 0)
            {
                //System.out.println("Ilosc nie do przyjecia, automatyczna zmiana na 200g");
                count.set(i, var);
            }else if(count.get(i) > 1000)
            {
                //System.out.println("Ilosc nie do przyjecia, automatyczna zmiana na 200g");
                count.set(i, var);
            }
        }
        return count;
    }
    /**
     *Method, that check if username is correct
     * @param name - user nickname
     * @return correct user nickname
     */
    public String if_name_correct(String name){
        Random liczba = new Random();
        int var = liczba.nextInt(501);
        while(true){
        if(name.equals(null))
        {
          // System.out.println("Nazwa uzytkownika nie moze byc nullem, automatyczne nadanie uzytkownikowi nazwy");
           name = "user"+var;
        }else if(name.length() > 10)
        {
           // System.out.println("Podana nazwa jest za dluga, automatyczne uzupe�nienie");
           name = "user"+var;
        }else if(name.length() < 2)
        {
            //System.out.println("Podana nazwa jest za krotka, automatyczne uzupe�nienie");
            name = "user"+var;
        }
        else
            break;
        }
        return name;
    }
    /**
     * Method, that calculate needed nutritions
     * needed_proteins - needed proteins 
     * needed_salts - needed salts 
     * needen_sugars - needed sugars 
     * needed_fats - needed fats 
     * needed_kcals - needed kcals 
     * @param infos - list of basic informations, entered by user 
     * @return needen - list of needed nutritions 
     */
    public ArrayList<Double> needed_nutrients(ArrayList<Integer> infos){
        ArrayList<Double> needed = new ArrayList<Double>();
        
//        for(int i=1; i < infos.size(); i++)
//        {
//            if(infos.get(i) == null){
//                //System.out.println(i+" sk�adowa nie zosta�a podana, automatyczna zmiana warto�ci na 1");
//                infos.set(i, 1);
//            }
//            else if(infos.get(i) <= 0 || infos.get(i)>100 )
//            {
//                //System.out.println(i+" sk�adowa zosta�a �le podana, automatyczna zmiana warto�ci na 1");
//                infos.set(i, 1);
//            }
//        }
        double needed_kcals;
        if(infos.get(0) == null)
        {
            //System.out.println("1 sk�adowa zosta�a �le podana, automatyczna zmiana warto�ci na 1, tj. m�czyzna");
            needed_kcals = 10*infos.get(1)+6.25*infos.get(2)-5*infos.get(3)-161;
        }
        else if(infos.get(0) == 2)
        {
            needed_kcals = 10*infos.get(1)+6.25*infos.get(2)-5*infos.get(3)+5;
        }
        else if(infos.get(0) == 1)
        { 
            needed_kcals = 10*infos.get(1)+6.25*infos.get(2)-5*infos.get(3)-161;
        }
        else
        {
            //System.out.println("1 sk�adowa zosta�a �le podana, automatyczna zmiana warto�ci na 1, tj. m�czyzna");
            needed_kcals = 10*infos.get(1)+6.25*infos.get(2)-5*infos.get(3)-161;
        }
        
        double needed_proteins = 1.2 * infos.get(1);
        double needed_salts = 5.0;
        double needen_sugars= 50.0;
        double needed_fats = needed_proteins*0.25;
        
        needed.add(needed_kcals);
        needed.add(needed_salts);
        needed.add(needen_sugars);
        needed.add(needed_proteins);
        needed.add(needed_fats);
        
        return needed;
    }
    
    /**
     * Method, that determines nutritiens of products 
     * kcals - amount of calories 
     * kcals_sum - sumed amount of calories 
     * @param products_name - list of products 
     * @return total_makro - list of nutritients 
     */
    public ArrayList<Integer> makro(ArrayList<String> products_name, ArrayList<Integer> products_count){
        ArrayList<Integer> total_makro = new ArrayList<Integer>();
        Random liczba = new Random();
        int kcals; int salt; int sugar; int protein; int fats;
        int kcals_sum=0; int salt_sum=0; int sugar_sum=0; int protein_sum=0; int fats_sum=0;
        for(int j=0; j<products_name.size(); j++)
        {
            kcals = liczba.nextInt(1001)/(products_count.get(j)/100);
            salt = liczba.nextInt(11)/(products_count.get(j)/100);
            sugar = liczba.nextInt(50)/(products_count.get(j)/100);
            protein = liczba.nextInt(20)/(products_count.get(j)/100);
            fats = liczba.nextInt(41)/(products_count.get(j)/100);
            
            kcals_sum+=kcals; salt_sum+=salt; sugar_sum+=sugar; protein_sum+=protein; fats_sum+=fats;
            
            total_makro.add(kcals);
            total_makro.add(salt);
            total_makro.add(sugar);
            total_makro.add(protein);
            total_makro.add(fats);
        }
        
        total_makro.add(kcals_sum);
        total_makro.add(salt_sum);
        total_makro.add(sugar_sum);
        total_makro.add(protein_sum);
        total_makro.add(fats_sum);
        
        
        return total_makro;
    }
    
}

