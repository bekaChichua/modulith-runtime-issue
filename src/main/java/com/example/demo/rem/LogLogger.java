package com.example.demo.rem;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
public class LogLogger {


    public void log() {
        log.info("log from LogCaller");
    }

    public void log2() {
        log.info("log from LogCaller222");
    }


}
