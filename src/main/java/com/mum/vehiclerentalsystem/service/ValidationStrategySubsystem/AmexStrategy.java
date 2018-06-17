package com.mum.vehiclerentalsystem.service.ValidationStrategySubsystem;

import com.mum.vehiclerentalsystem.model.IPaymentInfo;

public class AmexStrategy extends LuhnValidation {

    @Override
    public boolean isValid(IPaymentInfo creditCard) {
        boolean isValid = true;

//        isValid = creditCard.getNumber().startsWith("37") ||
//                creditCard.getNumber().startsWith("34");
//
//        if(isValid) {
//            isValid = creditCard.getNumber().length() == 15;
//        }
//
//        if(isValid) {
//            isValid = passesLuhn(creditCard.getNumber());
//        }

        return isValid;
    }
}
