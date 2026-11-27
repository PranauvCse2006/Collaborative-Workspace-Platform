
package com.collaborativeworkspace.workspace.platform.dto;

import com.collaborativeworkspace.workspace.platform.entity.Visibility;
import java.time.LocalDateTime;

public record WorkspaceResponse(
        Long id,
        String name,
        String description,
        Visibility visibility,
        Long ownerId,
        String ownerName,
        LocalDateTime createdAt
) {
}
