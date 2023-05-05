package org.dept;

import org.student.Student;

public class Dept extends Student {
	public void deptNmae() {
		System.out.println("deptname");
	}
	public static void main(String[] args) {
		Dept obj=new Dept();
		obj.collgCode();
		obj.collgNmae();
		obj.collgRank();
		obj.deptNmae();
		obj.stdNmae();
		obj.stdid();
		obj.stddept();
	}
}
