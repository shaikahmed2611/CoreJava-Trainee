package com.evergent.corejava.FinalProject.Service;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.evergent.corejava.FinalProject.Bean.AppointmentBean;
import com.evergent.corejava.FinalProject.Bean.DoctorBean;
import com.evergent.corejava.FinalProject.Bean.PatientBean;
import com.evergent.corejava.FinalProject.DAO.HospitalDAO;

public class HospitalService {
    HospitalDAO hospitalDAO = new HospitalDAO();

    public void registerPatient(int patientId, String name, String contact) {
        PatientBean patient = new PatientBean();
        patient.setPatientId(patientId);
        patient.setName(name);
        patient.setContact(contact);
        hospitalDAO.addPatient(patient);
        System.out.println("Patient registered successfully.");
    }

    public void addDoctor(int doctorId, String name, String specialty) {
        DoctorBean doctor = new DoctorBean();
        doctor.setDoctorId(doctorId);
        doctor.setName(name);
        doctor.setSpecialty(specialty);
        hospitalDAO.addDoctor(doctor);
        System.out.println("Doctor added successfully.");
    }

    public void scheduleAppointment(int patientId, int doctorId, String dateStr) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date appointmentDate = sdf.parse(dateStr);
            AppointmentBean appointment = new AppointmentBean();
            appointment.setPatientId(patientId);
            appointment.setDoctorId(doctorId);
            appointment.setAppointmentDate(appointmentDate);
            hospitalDAO.addAppointment(appointment);
            System.out.println("Appointment scheduled successfully.");
        } catch (ParseException e) {
            System.out.println("Invalid date format.");
        }
    }

    public void viewMedicalRecords(int patientId) {
        String records = hospitalDAO.getMedicalRecords(patientId);
        System.out.println("Medical Records: " + records);
    }
}
