package com.elderbyte.paassample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Entry point of spring boot app
 */
@SpringBootApplication
@EnableEurekaClient
public class SampleApplicaitonServer {

    private static final Logger log = LoggerFactory.getLogger(SampleApplicaitonServer.class);

    public static void main(String[] args) throws UnknownHostException {
        ApplicationContext ctx = SpringApplication.run(SampleApplicaitonServer.class, args);

        Environment env = ctx.getEnvironment();
        log.info("Access URLs:\n----------------------------------------------------------\n\t" +
                        "External: \thttp://{}:{}\n----------------------------------------------------------",
                InetAddress.getLocalHost().getHostAddress(),
                env.getProperty("server.port"));
    }

}

