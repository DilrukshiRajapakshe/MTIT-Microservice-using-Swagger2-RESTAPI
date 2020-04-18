package com.mtit.assignment.paymentservice.Service.impl;

import com.mtit.assignment.paymentservice.Service.massage;
import com.mtit.assignment.paymentservice.entity.Massage;

public class massageImpl implements massage {


    @Override
    public Massage successfulGeneratedMessage(String type) {
        Massage m = new Massage();
        m.setId(type);
        switch (type) {
            case "Create":
                m.setTextMassage("Successfully Create");
                break;
            case "Update":
                m.setTextMassage("Successfully Update");
                break;
            case "Delete":
                m.setTextMassage("Successfully Delete");
                break;
            case "Find":
                m.setTextMassage("Payment Information retrieve is successful");
                break;
            case "FindAll":
                m.setTextMassage("All Payment Information retrieve are successful");
                break;
            case "Error":
                m.setTextMassage("PathVariable not equal to Payment ID");
                break;
        }
        return m;
    }

}
