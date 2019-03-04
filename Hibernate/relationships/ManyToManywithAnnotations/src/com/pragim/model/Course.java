package com.pragim.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
@Entity
@Table(name="course_tab")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "course_seq")
    @SequenceGenerator(name = "course_seq", sequenceName = "course_seq")
	private int cId;
	private String cName;
	private int duration;

	@JoinTable(name="stu_course_tab",joinColumns={@JoinColumn(name="c_id")},inverseJoinColumns={@JoinColumn(name="s_id")})
	@ManyToMany(targetEntity=Student.class,cascade=CascadeType.ALL)
	private Set<Student> students;

	

	public void setcId(int cId) {
		this.cId = cId;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	public int getcId() {
		return cId;
	}

	public String getcName() {
		return cName;
	}

	public int getDuration() {
		return duration;
	}

	public Set<Student> getStudents() {
		return students;
	}

}
