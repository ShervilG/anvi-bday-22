package com.fun.bday.service;

import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import com.fun.bday.dto.Gift;
import com.fun.bday.dto.GiftDetail;
import org.springframework.stereotype.Service;

@Service
public class GiftService {

    private final Map<Integer, GiftDetail> giftDetailMap = new HashMap<>();

    GiftService() {
        this.giftDetailMap.put(
                1, new GiftDetail().toBuilder()
                        .name("Dher sara Cash !")
                        .description("Hope there's nuff space in your heart to accommodate this :P " +
                                "Spend it on as many items as you like !!")
                        .build()
        );
    }

    public List<Gift> getGiftList() {
        List<Gift> result = new ArrayList<>();

        result.add(
                new Gift().toBuilder()
                        .number(1)
                        .name("A cool cash amount")
                        .description("With all my heart, Hope there's nuff space in " +
                                "your heart to accommodate this :P \" +\n" +
                                "                                \"Spend it on as many items as you like !!")
                        .build()
        );
        result.add(
                new Gift().toBuilder()
                        .number(2)
                        .name("One smoll sa cake")
                        .description("Coz the bday is incomplete without a cake ;)")
                        .build()
        );
        result.add(
                new Gift().toBuilder()
                        .number(3)
                        .name("Sakshat Shabbi Maharaj ke darshan on 23rd July")
                        .description("Coz why not :)")
                        .build()
        );

        return result;
    }

    public GiftDetail getGiftDetail(int giftNumber) {
        return this.giftDetailMap.get(giftNumber);
    }
}
