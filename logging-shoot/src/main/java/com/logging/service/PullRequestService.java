package com.logging.service;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PullRequestService {

    @PostConstruct
    private void init(){
      log.debug("Something very verbos and detailed....");
    }


}
