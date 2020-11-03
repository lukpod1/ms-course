package com.hrpayroll.services;

import com.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPàyment(long workerId, int days) {
        return new Payment("Lucas", 200.0, days);
    }
}
