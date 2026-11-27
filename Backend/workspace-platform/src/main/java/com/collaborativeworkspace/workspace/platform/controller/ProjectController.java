package com.collaborativeworkspace.workspace.platform.controller;

import com.collaborativeworkspace.workspace.platform.dto.ProjectRequest;
import com.collaborativeworkspace.workspace.platform.dto.ProjectResponse;
import com.collaborativeworkspace.workspace.platform.service.ProjectService;
import com.collaborativeworkspace.workspace.platform.dto.ProjectUpdateRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {

    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    
    @PostMapping
    public ResponseEntity<ProjectResponse> createProject(
            @RequestBody ProjectRequest request) {

        ProjectResponse response = projectService.createProject(request);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    // Get all projects belonging to a workspace
    @GetMapping("/workspace/{workspaceId}")
    public ResponseEntity<List<ProjectResponse>> getProjectsByWorkspace(
            @PathVariable Long workspaceId) {

        return ResponseEntity.ok(
                projectService.getProjectsByWorkspace(workspaceId)
        );
    }
    // Update an existing project
    @PutMapping("/{projectId}")
    public ResponseEntity<ProjectResponse> updateProject(
            @PathVariable Long projectId,
            @RequestBody ProjectUpdateRequest request) {

        ProjectResponse response =
                projectService.updateProject(projectId, request);

        return ResponseEntity.ok(response);
    }
        // Archive an existing project
    @PatchMapping("/{projectId}/archive")
    public ResponseEntity<ProjectResponse> archiveProject(
            @PathVariable Long projectId) {

        ProjectResponse response =
                projectService.archiveProject(projectId);

        return ResponseEntity.ok(response);
    }
}