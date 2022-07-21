package com.fun.bday.controller;

import java.util.List;
import com.fun.bday.dto.Gift;
import com.fun.bday.dto.GiftDetail;
import com.fun.bday.dto.Info;
import com.fun.bday.interceptor.RequiresAuthToken;
import com.fun.bday.service.GiftService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class MainController {

    @Autowired
    private GiftService giftService;

    @RequiresAuthToken
    @GetMapping("/info")
    public Info getInfo() {
        return new Info().toBuilder()
                .createdBy("Shabii")
                .createdFor("Anvla")
                .description("A cute lil microservice created by an ex-Googler for his pear shaped bandi !" +
                        "APIs will continue to work till Heroku's free tier expires :')")
                .build();
    }

    @RequiresAuthToken
    @GetMapping("/gifts")
    public List<Gift> listGifts() {
        return giftService.getGiftList();
    }

    @Deprecated
    @GetMapping("/gift/{gift_number}")
    public GiftDetail getGiftDetail(@PathVariable("gift_number") int giftNumber) {
        return this.giftService.getGiftDetail(giftNumber);
    }
}
