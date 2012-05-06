package edu.ncu.oolab;

import java.util.ArrayList;

public class GradeSystem {
	
	private class Grade {
		
		private String name_, id_;
		private Integer lab1_, lab2_, lab3_, midTerm_, final_, grade_;
		
	}
	
	private ArrayList< Grade > grades_;
	private Double[] weights_;
	private Grade cUser_;
	
	public GradeSystem() {
		this.grades_ = new ArrayList< Grade >();
		this.weights_ = new Double[5];
		this.weights_[0] = 0.1;
		this.weights_[1] = 0.1;
		this.weights_[2] = 0.1;
		this.weights_[3] = 0.3;
		this.weights_[4] = 0.4;
		this.cUser_ = null;
	}
	
	public Boolean selectByID(String id) {
		for (Grade grade : this.grades_) {
			if (grade.id_.equals(id)) {
				this.cUser_ = grade;
				return true;
			}
		}
		return false;
	}
	
	public Double[] getWeights() {
		return this.weights_;
	}
	
	public void setWeights(Double[] weights) {
		this.weights_ = weights;
	}
	
	public String getUserName() {
		return this.cUser_.name_;
	}
	
	public void showGrade() {
		System.out.printf("Grade of %s:\n", this.cUser_.name_);
		System.out.printf("Lab1: %d\n", this.cUser_.lab1_);
		System.out.printf("Lab2: %d\n", this.cUser_.lab2_);
		System.out.printf("Lab3: %d\n", this.cUser_.lab3_);
		System.out.printf("Mid-term exam: %d\n", this.cUser_.midTerm_);
		System.out.printf("Final exam: %d\n", this.cUser_.final_);
		System.out.printf("Total: %d\n", this.cUser_.grade_);
	}
	
	public void showRank() {
		Integer grade = this.cUser_.grade_;
		Integer rank = 1;
		for (Grade g : this.grades_) {
			if (g.grade_ > grade) {
				rank += 1;
			}
		}
		System.out.printf("Rank of %s is %d.\n", this.cUser_.name_, rank);
	}

}
