/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j1.s.p0055;

/**
 *
 * @author tdtai.ts
 */
public class Menu {

    private String message;
    private String error;

    public void setMessage(String message) {
        this.message = message;
    }

    public void setError(String error) {
        this.error = error;
    }

    public void displayMessage() {
        System.out.println(message);
    }

    public void displayError() {
        System.out.println("Error: " + error);
    }

}
