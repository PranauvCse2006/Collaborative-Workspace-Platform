package com.collaborativeworkspace.workspace.platform.dto;

import com.collaborativeworkspace.workspace.platform.entity.ProjectStatus;
import java.time.LocalDateTime;

public record ProjectResponse(
    Long id,
    String name,
    String description,
    ProjectStatus status,
    Integer progress,
    Long workspaceId,
    String workspaceName,
    LocalDateTime createdAt
) {}