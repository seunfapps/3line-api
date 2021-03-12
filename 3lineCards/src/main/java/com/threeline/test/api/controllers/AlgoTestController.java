package com.threeline.test.api.controllers;

import com.threeline.test.api.algo.BitShiftingTest;
import com.threeline.test.api.dtos.responses.AlgoTestResultResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/bitshifting")
public class AlgoTestController {

    @Autowired
    private BitShiftingTest algoTest;

    @GetMapping
    public AlgoTestResultResponse process (){
        return algoTest.process();
    }
}
