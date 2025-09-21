package com.handson.tinyurl.controller;

import com.handson.tinyurl.service.Redis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.cache.CacheProperties;
import org.springframework.web.bind.annotation.*;

@RestController
public class AppController {

    @Autowired
    Redis redis;

    @RequestMapping(value = "/getkey", method = RequestMethod.GET)
    public String GetKay(@RequestParam String key) {
        return redis.get(key).toString();
    }

    @RequestMapping(value = "/setkey", method = RequestMethod.GET)
    public Boolean SetKeyVar(@RequestParam String key , @RequestParam String var) {
        return redis.set(key,var);
    }

}

