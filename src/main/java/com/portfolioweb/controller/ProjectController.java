package com.portfolioweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolioweb.Entity.Project;
import com.portfolioweb.service.ProjectService;

import lombok.RequiredArgsConstructor;

import java.lang.reflect.Method;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/projects")
public class ProjectController {
	@Autowired
	private  ProjectService service ;

	@GetMapping()
	public List<Project> getAllProjects() {
		return service.getAllProjects();
	}

	@GetMapping("/{id}")
	public Project getProjectById(@PathVariable Long id) {
		return service.getProjectById(id);
	}

	@PostMapping
	public Project CreateProject(@RequestBody Project project) {

		return service.createProject(project);
	}

	@PutMapping("/{id}")
	public Project updateProjectById(@PathVariable Long id, @RequestBody Project project) {

		return service.updatProject(id, project);
	}

	@DeleteMapping("/{id}")
	public String deleteProject(@PathVariable Long id) {
		service.deleteProject(id);
		return "Project deleted successfully";
	}

}
