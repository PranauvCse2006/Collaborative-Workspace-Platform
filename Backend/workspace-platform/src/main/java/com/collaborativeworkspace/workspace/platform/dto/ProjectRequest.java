package com.collaborativeworkspace.workspace.platform.dto;

import com.collaborativeworkspace.workspace.platform.entity.ProjectStatus;

public record ProjectRequest(
    String name,
    String description,
    ProjectStatus status,
    Integer progress,
    Long workspaceId
) {}