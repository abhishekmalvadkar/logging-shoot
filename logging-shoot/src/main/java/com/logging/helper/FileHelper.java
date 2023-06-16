package com.logging.helper;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class FileHelper {

    @PostConstruct
    public void init() {
        log.error("Something happen wrong..");
    }


}
