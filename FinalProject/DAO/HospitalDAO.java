package com.evergent.corejava.FinalProject.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.evergent.corejava.FinalProject.Bean.AppointmentBean;
import com.evergent.corejava.FinalProject.Bean.DoctorBean;
import com.evergent.corejava.FinalProject.Bean.PatientBean;
import com.evergent.corejava.FinalProject.DbConn.DatabaseConnection;

public class HospitalDAO {
    Connection con = null;
    PreparedStatement pstmt = null;

    public void addPatient(PatientBean patient) {
        try {
            con = DatabaseConnection.getConnection();
            String query = "INSERT INTO patients (patient_id, name, contact) VALUES (?, ?, ?)";
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, patient.getPatientId());
            pstmt.setString(2, patient.getName());
            pstmt.setString(3, patient.getContact());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeConnection();
        }
    }

    public void addDoctor(DoctorBean doctor) {
        try {
            con = DatabaseConnection.getConnection();
            String query = "INSERT INTO doctors (doctor_id, name, specialty) VALUES (?, ?, ?)";
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, doctor.getDoctorId());
            pstmt.setString(2, doctor.getName());
            pstmt.setString(3, doctor.getSpecialty());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeConnection();
        }
    }

    public void addAppointment(AppointmentBean appointment) {
        try {
            con = DatabaseConnection.getConnection();
            String query = "INSERT INTO appointments (patient_id, doctor_id, appointment_date) VALUES (?, ?, ?)";
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, appointment.getPatientId());
            pstmt.setInt(2, appointment.getDoctorId());
            pstmt.setDate(3, new java.sql.Date(appointment.getAppointmentDate().getTime()));
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeConnection();
        }
    }

    public String getMedicalRecords(int patientId) {
        StringBuilder records = new StringBuilder();
        try {
            con = DatabaseConnection.getConnection();
            String query = "SELECT details FROM medical_records WHERE patient_id = ?";
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, patientId);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                records.append(rs.getString(1)).append("\n");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return records.toString();
    }

    private void closeConnection() {
        try {
            if (pstmt != null) pstmt.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}