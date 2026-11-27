package com.collaborativeworkspace.workspace.platform.repository;

import com.collaborativeworkspace.workspace.platform.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Long> {

    List<Project> findByWorkspaceId(Long workspaceId);
}