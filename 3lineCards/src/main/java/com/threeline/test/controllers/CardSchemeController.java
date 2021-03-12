package com.threeline.test.controllers;

import com.threeline.test.dtos.responses.CardSchemeResponse;
import com.threeline.test.dtos.responses.StatsResponse;
import com.threeline.test.services.CardSchemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/card-scheme")
public class CardSchemeController {

    @Autowired
    private CardSchemeService cardSchemeService;

    @GetMapping("/verify/{id}")
    public CardSchemeResponse verify(@PathVariable String id){
        return cardSchemeService.verify(id);
    }

    @GetMapping("/stats")
    public StatsResponse getStats(@RequestParam Integer start, @RequestParam Integer limit){
        return cardSchemeService.getStats(start,limit);
    }

}
