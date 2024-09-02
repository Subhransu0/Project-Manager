package com.sonu.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.sonu.entity.ProjectEntity;

@Repository
public class ProjectServiceImple implements ProjectService {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public int insertData(ProjectEntity pro) {
		int i = (Integer) hibernateTemplate.save(pro);
		return i;
	}

	@Override
	public ProjectEntity getEntityByid(int id) {
		ProjectEntity ent = hibernateTemplate.get(ProjectEntity.class, id);
		return ent;
	}

	@Override
	public List<ProjectEntity> getAllProject() {
		List<ProjectEntity> ent  =hibernateTemplate.loadAll(ProjectEntity.class);
		return ent;
	}

	@Transactional
	public void update(ProjectEntity pro) {
          hibernateTemplate.update(pro);
	}

	@Transactional
	public void deleteProject(int id) {
           ProjectEntity ent = hibernateTemplate.get(ProjectEntity.class, id);
			hibernateTemplate.delete(ent);
	}

}
