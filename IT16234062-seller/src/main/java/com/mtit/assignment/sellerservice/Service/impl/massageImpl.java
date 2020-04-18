package com.mtit.assignment.sellerservice.Service.impl;

import com.mtit.assignment.sellerservice.Service.massage;
import com.mtit.assignment.sellerservice.entity.Massage;

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
                m.setTextMassage("Seller Information retrieve is successful");
                break;
            case "FindAll":
                m.setTextMassage("All Seller Information retrieve are successful");
                break;
            case "Error":
                m.setTextMassage("PathVariable not equal to Seller ID");
                break;
        }
        return m;
    }

}
