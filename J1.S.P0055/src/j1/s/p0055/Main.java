/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j1.s.p0055;

/**
 *
 * @author tdtai.ts
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DoctorController controller = new DoctorController();
        while (true) {
            System.out.println("\n=======Doctor Management=============\n");
            System.out.println("1. Add doctor");
            System.out.println("2. Update doctor");
            System.out.println("3. Delete doctor");
            System.out.println("4. Search doctor");
            System.out.println("5. Exit");
            int choice = Validator.getInt("Enter your choice: ",
                    "Please enter number 1 to 5",
                    "Invalid input", 1, 5);
            switch (choice) {
                case 1: // Add doctor
                    String code = Validator.getString(
                            "Enter code: ",
                            "Invalid code(alphanumberic only)",
                            "[a-zA-Z0-9]+");
                    String name = Validator.getString("Enter name: ",
                            "Invalid name(letters only)",
                            "[a-zA-Z ]+");
                    String specialization = Validator.getString(
                            "Enter specialization: ",
                            "Invalid specialization(letters only)",
                            "[a-zA-Z ]+");
                    int availability = Validator.getInt(
                            "Enter availability: ",
                            "Availability must be 1-29",
                            "Invalid number",
                            1, 29);
                    String addResult = controller.addDoctor(code, name, specialization, availability);
                    System.out.println(addResult);
                    break;
                case 2: //Update doctor
                    String updateCode = Validator.getString(
                            "Enter doctor code: ",
                            "Code does not exist",
                            "[a-zA-Z0-9]+");
                    String newName = Validator.getString(
                            "Enter new name: ",
                            "Invalid name(letters only)",
                            "[a-zA-Z ]+");
                    String newSpecialization = Validator.getString(
                            "Enter new specialization: ",
                            "Invalid specialization(letters only)",
                            "[a-zA-Z ]+");
                    int newAvailability = Validator.getInt(
                            "Enter new availability: ",
                            " Availability must be 1-29",
                            "Invalid number",
                            1, 29);
                    String updateResult = controller.updateDoctor(updateCode, newName, newSpecialization, newAvailability);
                    System.out.println(updateResult);
                    break;

                //Delete doctor
                case 3:
                    String deleteCode = Validator.getString(
                            "Enter doctor name to search: ",
                            "Invalid code",
                            "[a-zA-Z0-9 ]+");
                    String deleteResult = controller.deleteDoctor(deleteCode);
                    System.out.println(deleteResult);
                    break;

                //Search doctor
                case 4:
                    String searchName = Validator.getString(
                            "Enter name: ",
                            "Invalid name(letters only)",
                            "[a-zA-Z ]+");
                    String searchResult = controller.searchDoctor(searchName);
                    System.out.println(searchResult);
                    break;

                //Exit
                case 5:
                    System.out.println("Exiting program");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again");
            }
        }
    }

}
