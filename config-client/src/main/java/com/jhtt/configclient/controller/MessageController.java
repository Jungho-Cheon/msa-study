package com.jhtt.configclient.controller;

import com.jhtt.configclient.config.ApplicationConfiguration;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class MessageController {
    private final ApplicationConfiguration applicationConfiguration;

    @GetMapping("/message")
    public ResponseEntity<?> getMessage() {
        final Map<String, String> map = new HashMap<>();
        map.put("message", applicationConfiguration.getMessage());
        return ResponseEntity.ok(map);
    }
}
