package com.portfolioweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolioweb.Entity.Project;
import com.portfolioweb.repo.ProjectRepo;
@Service
public class ProjectServiceImpl implements ProjectService {
	@Autowired
	private ProjectRepo repo;

	@Override
	public List<Project> getAllProjects() {
		
		return repo.findAll();
	}
	@Override
	public Project getProjectById(Long id) {
		
		return repo.findById(id)
				.orElseThrow(()-> new RuntimeException("Project Not Found "));
	}

	@Override
	public Project createProject(Project project) {
		
		return repo.save(project);
	}

	@Override
	public Project updatProject(Long id, Project project) {
	   Project existingProject=repo.findById(id).orElseThrow(()->new RuntimeException("Project Not found"));	
	   existingProject.setTitle(project.getTitle());
       existingProject.setDescription(project.getDescription());
       existingProject.setTechStack(project.getTechStack());

	   return repo.save(existingProject);
	}

	@Override
	public void deleteProject(Long id) {
		 Project project = repo.findById(id)
	                .orElseThrow(() -> new RuntimeException("Project not found"));

	        repo.delete(project);
		
	}

}
