package com.portfolioweb.service;

import java.util.List;

import com.portfolioweb.Entity.Project;

public interface ProjectService  {
	
  List<Project>getAllProjects();
  Project getProjectById(Long id);
  Project createProject( Project project);
  Project updatProject(Long id ,Project project );
  void deleteProject(Long id );
  
}