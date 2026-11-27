
package com.collaborativeworkspace.workspace.platform.service;

import com.collaborativeworkspace.workspace.platform.dto.WorkspaceRequest;
import com.collaborativeworkspace.workspace.platform.dto.WorkspaceResponse;
import com.collaborativeworkspace.workspace.platform.entity.User;
import com.collaborativeworkspace.workspace.platform.entity.Workspace;
import com.collaborativeworkspace.workspace.platform.repository.UserRepository;
import com.collaborativeworkspace.workspace.platform.repository.WorkspaceRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkspaceService {

    private final WorkspaceRepository workspaceRepository;
    private final UserRepository userRepository;

    public WorkspaceService(
            WorkspaceRepository workspaceRepository,
            UserRepository userRepository) {
        this.workspaceRepository = workspaceRepository;
        this.userRepository = userRepository;
    }

    public WorkspaceResponse createWorkspace(WorkspaceRequest request) {

        User owner = userRepository.findById(request.ownerId())
                .orElseThrow(() -> new RuntimeException("Owner not found"));

        Workspace workspace = new Workspace();
        workspace.setName(request.name());
        workspace.setDescription(request.description());
        workspace.setVisibility(request.visibility());
        workspace.setOwner(owner);

        Workspace saved = workspaceRepository.save(workspace);

        return mapToResponse(saved);
    }

    public List<WorkspaceResponse> getWorkspacesByOwner(Long ownerId) {

        return workspaceRepository.findByOwnerId(ownerId)
                .stream()
                .map(this::mapToResponse)
                .toList();
    }

    private WorkspaceResponse mapToResponse(Workspace workspace) {

        return new WorkspaceResponse(
                workspace.getId(),
                workspace.getName(),
                workspace.getDescription(),
                workspace.getVisibility(),
                workspace.getOwner().getId(),
                workspace.getOwner().getName(),
                workspace.getCreatedAt()
        );
    }
}
