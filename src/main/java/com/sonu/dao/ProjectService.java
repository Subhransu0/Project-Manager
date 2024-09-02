package com.sonu.dao;

import java.util.List;

import com.sonu.entity.ProjectEntity;

public interface ProjectService {
	
	public int insertData(ProjectEntity pro) ;
	
	public ProjectEntity getEntityByid(int id);
	
	public  List<ProjectEntity> getAllProject();
	
	public void update(ProjectEntity pro);
	
	public void deleteProject(int i);
		
	

}
