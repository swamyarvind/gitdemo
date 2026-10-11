package com.example.repository;

import java.time.LocalDate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AttendanceRepository<Attendance> extends JpaRepository<Attendance, Long> {

	
	 @Query("SELECT a FROM Attendance a WHERE a.employee.id = :empId AND a.date BETWEEN :start AND :end")
	    Page<Attendance> searchAttendance(
	            @Param("empId") Long employeeId,
	            @Param("start") LocalDate startDate,
	            @Param("end") LocalDate endDate,
	         Pageable pageable);

}
