
package com.collaborativeworkspace.workspace.platform.dto;

import com.collaborativeworkspace.workspace.platform.entity.Visibility;

public record WorkspaceRequest(
        String name,
        String description,
        Visibility visibility,
        Long ownerId
) {
}
