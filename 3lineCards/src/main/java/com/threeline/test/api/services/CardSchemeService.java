package com.threeline.test.api.services;

import com.threeline.test.api.dtos.responses.CardSchemeCountData;
import com.threeline.test.api.dtos.responses.CardSchemePayloadResponse;
import com.threeline.test.api.dtos.responses.CardSchemeResponse;
import com.threeline.test.api.dtos.responses.StatsResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class CardSchemeService {

    public CardSchemeResponse verify(String schemeId){

        CardSchemeResponse response = new CardSchemeResponse();
        //fetch data

        response.setSuccess(true);
        CardSchemePayloadResponse payload = new CardSchemePayloadResponse();
        payload.setScheme("visa");
        payload.setType("debit");
        payload.setBank("UBS");

        response.setPayload(payload);
        return response;
    }

    public StatsResponse getStats(int start, int limit){
        StatsResponse response = new StatsResponse();

        //fetch data


        response.setSuccess(true);
        response.setLimit(limit);
        response.setStart(start);
        response.setSize(133);

        CardSchemeCountData data1 = new CardSchemeCountData("545423", 5);
        CardSchemeCountData data2 = new CardSchemeCountData("679234", 4);
        CardSchemeCountData data3 = new CardSchemeCountData("329802", 1);

        List<CardSchemeCountData> data = Stream.of(data1,data2,data3).collect(Collectors.toList());

        response.setPayload(data);
        return response;
    }
}
