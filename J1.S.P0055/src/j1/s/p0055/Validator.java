/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j1.s.p0055;

import java.util.Scanner;

/**
 *
 * @author tdtai.ts
 */
public class Validator {

    private static final Scanner sc = new Scanner(System.in);

    public static int getInt(String message, String rangeError, String formatError, int min, int max) {
        while (true) {
            try {
                System.out.print(message);
                int number = Integer.parseInt(sc.nextLine());
                if (number >= min && number <= max) {
                    return number;
                }
                System.out.println(rangeError);
            } catch (NumberFormatException e) {
                System.out.println(formatError);
            }
        }
    }
    
    public static String getString(String message, String error, String regex){
        while (true) {            
            System.out.print(message);
            String input = sc.nextLine().trim();
            // maches: kiểm tra xem toàn bộ chuỗi có khớp hoàn toàn với biểu thức chính quy (regex)hay không
            if(input.matches(regex)){
                return input;
            }
            System.out.println(error);
        }
    }
}
