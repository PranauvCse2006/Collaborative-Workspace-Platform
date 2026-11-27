package com.collaborativeworkspace.workspace.platform.service;

import com.collaborativeworkspace.workspace.platform.dto.ProjectRequest;
import com.collaborativeworkspace.workspace.platform.dto.ProjectResponse;
import com.collaborativeworkspace.workspace.platform.dto.ProjectUpdateRequest;
import com.collaborativeworkspace.workspace.platform.entity.Project;
import com.collaborativeworkspace.workspace.platform.entity.ProjectStatus;
import com.collaborativeworkspace.workspace.platform.entity.Workspace;
import com.collaborativeworkspace.workspace.platform.repository.ProjectRepository;
import com.collaborativeworkspace.workspace.platform.repository.WorkspaceRepository;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class ProjectService {

    private final ProjectRepository projectRepository;
    private final WorkspaceRepository workspaceRepository;

    public ProjectService(
            ProjectRepository projectRepository,
            WorkspaceRepository workspaceRepository) {
        this.projectRepository = projectRepository;
        this.workspaceRepository = workspaceRepository;
    }

    public ProjectResponse createProject(ProjectRequest request) {

        Workspace workspace = workspaceRepository.findById(request.workspaceId())
                .orElseThrow(() -> new RuntimeException("Workspace not found"));

        Project project = new Project();

        project.setName(request.name());
        project.setDescription(request.description());

        project.setStatus(
                request.status() != null
                        ? request.status()
                        : ProjectStatus.PLANNING
        );

        project.setProgress(
                request.progress() != null
                        ? request.progress()
                        : 0
        );

        project.setWorkspace(workspace);

        Project savedProject = projectRepository.save(project);

        return mapToResponse(savedProject);
    }

    @Transactional(readOnly = true)
    public List<ProjectResponse> getProjectsByWorkspace(Long workspaceId) {

        return projectRepository.findByWorkspaceId(workspaceId)
                .stream()
                .map(this::mapToResponse)
                .toList();
    }
    public ProjectResponse updateProject(Long projectId, ProjectUpdateRequest request) {

        Project project = projectRepository.findById(projectId)
                .orElseThrow(() -> new RuntimeException("Project not found"));

        if (request.name() != null) {
            project.setName(request.name());
        }

        if (request.description() != null) {
            project.setDescription(request.description());
        }

        if (request.status() != null) {
            project.setStatus(request.status());
        }

        if (request.progress() != null) {
            project.setProgress(request.progress());
        }

        Project updatedProject = projectRepository.save(project);

        return mapToResponse(updatedProject);
    }
    public ProjectResponse archiveProject(Long projectId) {

        Project project = projectRepository.findById(projectId)
                .orElseThrow(() -> new RuntimeException("Project not found"));

        project.setStatus(ProjectStatus.ARCHIVED);

        Project archivedProject = projectRepository.save(project);

        return mapToResponse(archivedProject);
    }

    private ProjectResponse mapToResponse(Project project) {

        return new ProjectResponse(
                project.getId(),
                project.getName(),
                project.getDescription(),
                project.getStatus(),
                project.getProgress(),
                project.getWorkspace().getId(),
                project.getWorkspace().getName(),
                project.getCreatedAt()
        );
    }
}