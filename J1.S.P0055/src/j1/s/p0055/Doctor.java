/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j1.s.p0055;

/**
 *
 * @author tdtai.ts
 */
public class Doctor {

    private String code;
    private String name;
    private String specialization;
    private int availabitity;

    public Doctor() {
    }

    public Doctor(String code, String name, String specialization, int availabitity) {
        this.code = code;
        this.name = name;
        this.specialization = specialization;
        this.availabitity = availabitity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getAvailabitity() {
        return availabitity;
    }

    public void setAvailabitity(int availabitity) {
        this.availabitity = availabitity;
    }

    @Override
    public String toString() {
        return String.format("%-10s%-15s%-25s%-20d",
                code, name, specialization, availabitity);
    }

}
