package com.springrest.springrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDAO;
import com.springrest.springrest.entities.Course;

@Service
public class CourceServicesImpl implements CourceServices {

//	List<Course> list;
	@Autowired
	private CourseDAO courseDAO;

	public CourceServicesImpl() {
//		list = new ArrayList<Course>();
//		list.add(new Course(123, "Java cource", "This is java course"));
//		list.add(new Course(456, "Python", "This is python course"));

	}

	@Override
	public List<Course> getCoursers() {

//		return list;
		return courseDAO.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public Course getCourse(long courseId) {

//		Course c = null;
//		for (Course course : list) {
//			if (course.getId() == courseId) {
//				c = course;
//				break;
//			}
//		}
//		return c;
		return courseDAO.getOne(courseId);
	}

	@Override
	public Course addCourse(Course course) {
//		list.add(course);
//		return course;
		courseDAO.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
//		list.forEach(e -> {
//			if (e.getId() == course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
//		return course;
		courseDAO.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long courseId) {
//		list = this.list.stream().filter(e -> e.getId() != courseId).collect(Collectors.toList());
		@SuppressWarnings("deprecation")
		Course entity = courseDAO.getOne(courseId);
		courseDAO.delete(entity);
	}

}
