package com.nari.opfive.domain;
// Generated 2017-8-25 11:17:32 by Hibernate Tools 5.2.5.Final

/**
 * Taskoperator generated by hbm2java
 */
public class Taskoperator implements java.io.Serializable {

	private int toperatorId;
	private Task task;
	private String toperatorName;

	public Taskoperator() {
	}

	public Taskoperator(int toperatorId, Task task, String toperatorName) {
		this.toperatorId = toperatorId;
		this.task = task;
		this.toperatorName = toperatorName;
	}

	public int getToperatorId() {
		return this.toperatorId;
	}

	public void setToperatorId(int toperatorId) {
		this.toperatorId = toperatorId;
	}

	public Task getTask() {
		return this.task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	public String getToperatorName() {
		return this.toperatorName;
	}

	public void setToperatorName(String toperatorName) {
		this.toperatorName = toperatorName;
	}

}
