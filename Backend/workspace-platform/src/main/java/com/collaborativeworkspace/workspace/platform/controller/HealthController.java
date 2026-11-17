
package com.collaborativeworkspace.workspace.platform.controller;

import com.collaborativeworkspace.workspace.platform.dto.HealthResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HealthController {

    @GetMapping("/api/health")
    public ResponseEntity<HealthResponse> checkHealth() {

        HealthResponse response = new HealthResponse(
                "UP",
                "Collaborative Workspace Platform backend is running!"
        );

        return ResponseEntity.ok(response);
    }
}
