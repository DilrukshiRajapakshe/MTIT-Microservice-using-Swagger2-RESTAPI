package com.mtit.assignment.buyerservice.Service.impl;

import com.mtit.assignment.buyerservice.Service.massage;
import com.mtit.assignment.buyerservice.entity.Massage;

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
                m.setTextMassage("Buyer Information retrieve is successful");
                break;
            case "FindAll":
                m.setTextMassage("All Buyer Information retrieve are successful");
                break;
            case "Error":
                m.setTextMassage("PathVariable not equal to Buyer ID");
                break;
        }
        return m;
    }

}
