package com.example.order_management.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.order_management.domain.enums.PaymentStatus;

import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
    List<Payment> findByStatus(PaymentStatus status);
}
