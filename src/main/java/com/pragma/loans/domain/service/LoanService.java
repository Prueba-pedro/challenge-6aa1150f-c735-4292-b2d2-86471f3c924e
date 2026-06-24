package com.pragma.loans.domain.service;

import com.pragma.loans.domain.model.Loan;
import com.pragma.loans.infrastructure.adapter.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanService {
    @Autowired
    private LoanRepository loanRepository;

    public Loan saveLoan(Loan loan) {
        // Validation logic
        return loanRepository.save(loan);
    }

    public Loan getLoanById(Long id) {
        return loanRepository.findById(id).orElse(null);
    }
}