package com.ripley.consultagestionaudios;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ConsultaImpl implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("In CommandLineRunnerImpl ");
        log.info("Test info");
        log.warn("Test warn");
        log.error("Test error");
        log.trace("Test trace");

        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
