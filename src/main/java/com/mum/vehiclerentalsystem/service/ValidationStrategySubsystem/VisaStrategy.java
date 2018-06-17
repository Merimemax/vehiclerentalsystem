package com.mum.vehiclerentalsystem.service.ValidationStrategySubsystem;

import com.mum.vehiclerentalsystem.model.IPaymentInfo;

public class VisaStrategy extends LuhnValidation {

    @Override
    public boolean isValid(IPaymentInfo creditCard) {
        boolean isValid = true;

//        isValid = creditCard.getNumber().startsWith("4");
//
//        if(isValid) {
//            isValid = creditCard.getNumber().length() == 16;
//        }
//
//        if(isValid) {
//            isValid = passesLuhn(creditCard.getNumber());
//        }

        return isValid;
    }
}
