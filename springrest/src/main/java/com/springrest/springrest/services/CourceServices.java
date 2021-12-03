package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Course;

public interface CourceServices {

	List<Course> getCoursers();

	Course getCourse(long courseId);

	Course addCourse(Course course);

	Course updateCourse(Course course);

	void deleteCourse(long courseId);
}
