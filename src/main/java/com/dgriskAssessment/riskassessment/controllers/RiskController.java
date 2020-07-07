package com.dgriskAssessment.riskassessment.controllers;

import java.util.List;
import javax.annotation.Resource;

import com.dgriskAssessment.riskassessment.models.RiskAssessmentModel;
import com.dgriskAssessment.riskassessment.services.RiskDaoImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/risk")
public class RiskController {

    @Resource
    RiskDaoImpl riskDaoImpl;

//    @CrossOrigin
//    @GetMapping(value = "/riskList")
//    public List<RiskAssessmentModel> getAllRisk() {
//        return riskDaoImpl.findAll();
//    }
    @CrossOrigin
    @GetMapping(value = "/Accept")
    public String Accept(@RequestParam(name="party_number") String party_number) {
        return "riskDaoImpl.acceptRisk(party_number)";
    }


}
