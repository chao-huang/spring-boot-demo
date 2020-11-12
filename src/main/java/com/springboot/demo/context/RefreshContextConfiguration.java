package com.springboot.demo.context;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.endpoint.RefreshEndpoint;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

@Slf4j
@Configuration
@EnableScheduling
public class RefreshContextConfiguration {

  private RefreshEndpoint refreshEndpoint;

  public RefreshContextConfiguration(RefreshEndpoint refreshEndpoint) {
    this.refreshEndpoint = refreshEndpoint;
  }

  @Scheduled(fixedDelayString = "${context.refresh.interval:600000}", initialDelay = 600000)
  public void refreshContextPeriodically() {
    log.info("Start to refresh Spring application context at {}", new Date());
    refreshEndpoint.refresh();
  }
}
