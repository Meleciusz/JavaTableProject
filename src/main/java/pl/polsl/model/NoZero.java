/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.model;

/**
 * <b>Nozero </b>own exception
 * @author Mikolaj Krasucki
 * @version 1.1
 */
public class NoZero extends Exception {

    /**
     * Non-parameter constructor
     */
    public NoZero() {
    }

    /**
     * Exception class constructor
     *
     * @param message display message
     */
    public NoZero(String message) {
        super(message);
    }
}