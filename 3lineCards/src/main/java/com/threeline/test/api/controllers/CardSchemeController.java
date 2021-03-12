package com.threeline.test.api.controllers;

import com.threeline.test.api.dtos.responses.CardSchemeResponse;
import com.threeline.test.api.dtos.responses.StatsResponse;
import com.threeline.test.api.services.CardSchemeService;
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
