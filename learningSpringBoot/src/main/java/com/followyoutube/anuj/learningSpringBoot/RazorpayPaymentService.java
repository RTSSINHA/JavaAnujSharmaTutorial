package com.followyoutube.anuj.learningSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "payment.provider", havingValue = "razorpay")
public class RazorpayPaymentService implements PaymentService {

    @Override
    public String pay() {
        String payment = "Razorpay Payment";
        System.out.println(payment);
        return payment;

    }
}
