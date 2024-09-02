package com.sonu.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sonu.dao.ProjectService;
import com.sonu.entity.ProjectEntity;

@Controller
public class MyController {

	@Autowired
	private ProjectService projectService;

	@RequestMapping("/home")
	public String home(Model m) {
		List<ProjectEntity> list = projectService.getAllProject();
		m.addAttribute("listProject", list);
		return "home";
	}

	@RequestMapping("/addProject")
	public String addProject() {
		return "addProject";
	}

	@RequestMapping(path = "/saveProject", method = RequestMethod.POST)
	public String SaveProject(@ModelAttribute ProjectEntity pro, HttpSession session) {
		session.setAttribute("msg", "Project Added Successfully ");

		int i = projectService.insertData(pro);
		return "redirect:/home";
	}

	@RequestMapping(path = "/editProject/{id}")
	public String editProject(@PathVariable int id, Model m) {

		ProjectEntity entity = projectService.getEntityByid(id);
		m.addAttribute("update", entity);
		return "edit";

	}

	@RequestMapping(path = "/updateProject", method = RequestMethod.POST)
	public String UpdateProject(@ModelAttribute ProjectEntity entity, HttpSession session) {
		projectService.update(entity);
		session.setAttribute("updatedone", "Update Successsfull");
		return "redirect:/home";
	}

	@RequestMapping("/deleteProject/{id}")
	public String deleteProject(@PathVariable int id, HttpSession session) {
		projectService.deleteProject(id);
		session.setAttribute("delete", "Delete Successfully");
		return "redirect:/home";
	}

}
