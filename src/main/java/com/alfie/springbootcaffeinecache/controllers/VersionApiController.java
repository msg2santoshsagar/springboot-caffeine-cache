package com.alfie.springbootcaffeinecache.controllers;

import org.springframework.boot.SpringBootVersion;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

@RestController
public class VersionApiController {

    @GetMapping(value = "/version", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, Object> getVersion() {
        Map<String, Object> versionData = new HashMap<>();

        RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
        Properties systemProperties = System.getProperties();

        versionData.put("app-name", "springboot-caffeine-cache");
        versionData.put("spring-boot-version", SpringBootVersion.getVersion());
        versionData.put("java-version", systemProperties.getProperty("java.version"));
        versionData.put("os-name", systemProperties.getProperty("os.name"));
        versionData.put("os-arch", systemProperties.getProperty("os.arch"));
        versionData.put("uptime-ms", runtimeMXBean.getUptime());
        versionData.put("start-time", Instant.ofEpochMilli(runtimeMXBean.getStartTime()).toString());

        return versionData;
    }
}
