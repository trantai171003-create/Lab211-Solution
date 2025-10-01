/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j1.s.p0055;

import java.util.ArrayList;

/**
 *
 * @author tdtai.ts
 */
public class DoctorController {

    private ArrayList<Doctor> doctors = new ArrayList<>();

    //Add doctor
    public String addDoctor(String code, String name, String specialization, int availabitity) {
        try {
            for (Doctor doctor : doctors) {
                if (doctor.getCode().equalsIgnoreCase(code)) {
                    return "Doctor code is exist";
                }
            }
            doctors.add(new Doctor(code, name, specialization, availabitity));
            return "Doctor added successfully";
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }

    //Update doctor
    public String updateDoctor(String code, String name, String specialization, int availabitity) {
        try {
            for (Doctor d : doctors) {
                if (d.getCode().equalsIgnoreCase(code)) {
                    d.setName(name);
                    d.setSpecialization(specialization);
                    d.setAvailabitity(availabitity);
                    return "Doctor updated successfully";
                }
            }
            return "Doctor does not exist";
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }

    //Delete doctor
    public String deleteDoctor(String code) {
        try {
            for (Doctor doctor : doctors) {
                doctor.getCode().equalsIgnoreCase(code);
                doctors.remove(doctor);
                return "Doctor deleted successfully";
            }
            return "Doctor does not exist";
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }

    //Search doctor
    public String searchDoctor(String name) {
        StringBuilder result = new StringBuilder();
        ArrayList<Doctor> foundDoctors = new ArrayList<>();

        for (Doctor doctor : doctors) {
            if (doctor.getName().equalsIgnoreCase(name)) {
                foundDoctors.add(doctor);
            }
        }

        if (foundDoctors.isEmpty()) {
            return "No doctor found with that name";
        } else {
            result.append("\nSearch doctor:\n");
            result.append(String.format("%-10s%-15s%-25s%-20s\n",
                    "Code", "Name", "Specialization", "Availabitity"));
            for (Doctor d : foundDoctors) {
                result.append(d.toString()).append("\n");
            }
            return result.toString();
        }
    }
}
