package com.evergent.corejava.FinalProject.Controller;

import java.util.Scanner;

import com.evergent.corejava.FinalProject.Service.HospitalService;

public class HospitalController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HospitalService hospitalService = new HospitalService();
        int choice;

        do {
            System.out.println("1. Register Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. Schedule Appointment");
            System.out.println("4. View Medical Records");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Patient ID: ");
                    int patientId = scanner.nextInt();
                    System.out.print("Enter Patient Name: ");
                    String patientName = scanner.next();
                    System.out.print("Enter Contact: ");
                    String contact = scanner.next();
                    hospitalService.registerPatient(patientId, patientName, contact);
                    break;

                case 2:
                    System.out.print("Enter Doctor ID: ");
                    int doctorId = scanner.nextInt();
                    System.out.print("Enter Doctor Name: ");
                    String doctorName = scanner.next();
                    System.out.print("Enter Specialty: ");
                    String specialty = scanner.next();
                    hospitalService.addDoctor(doctorId, doctorName, specialty);
                    break;

                case 3:
                    System.out.print("Enter Patient ID: ");
                    patientId = scanner.nextInt();
                    System.out.print("Enter Doctor ID: ");
                    doctorId = scanner.nextInt();
                    System.out.print("Enter Appointment Date (YYYY-MM-DD): ");
                    String date = scanner.next();
                    hospitalService.scheduleAppointment(patientId, doctorId, date);
                    break;

                case 4:
                    System.out.print("Enter Patient ID: ");
                    patientId = scanner.nextInt();
                    hospitalService.viewMedicalRecords(patientId);
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}