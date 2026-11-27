
package com.collaborativeworkspace.workspace.platform.controller;

import com.collaborativeworkspace.workspace.platform.dto.WorkspaceRequest;
import com.collaborativeworkspace.workspace.platform.dto.WorkspaceResponse;
import com.collaborativeworkspace.workspace.platform.service.WorkspaceService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/workspaces")
public class WorkspaceController {

    private final WorkspaceService workspaceService;

    public WorkspaceController(WorkspaceService workspaceService) {
        this.workspaceService = workspaceService;
    }

    @PostMapping
    public ResponseEntity<WorkspaceResponse> createWorkspace(
            @RequestBody WorkspaceRequest request) {

        WorkspaceResponse response =
                workspaceService.createWorkspace(request);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/owner/{ownerId}")
    public ResponseEntity<List<WorkspaceResponse>> getWorkspacesByOwner(
            @PathVariable Long ownerId) {

        return ResponseEntity.ok(
                workspaceService.getWorkspacesByOwner(ownerId)
        );
    }
}
