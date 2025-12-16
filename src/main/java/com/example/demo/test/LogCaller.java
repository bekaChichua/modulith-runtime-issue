package com.example.demo.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class LogCaller {


    public void log() {
        log.info("log from LogCaller");
    }

    public void log2() {
        log.info("log from LogCaller222");
    }


}
