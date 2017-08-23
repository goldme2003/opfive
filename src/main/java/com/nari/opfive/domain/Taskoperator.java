package com.nari.opfive.domain;
// Generated 2017-8-23 16:22:41 by Hibernate Tools 5.2.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Taskoperator generated by hbm2java
 */
@Entity
@Table(name = "taskoperator", catalog = "leanassessment")
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

	@Id

	@Column(name = "TOperatorID", unique = true, nullable = false)
	public int getToperatorId() {
		return this.toperatorId;
	}

	public void setToperatorId(int toperatorId) {
		this.toperatorId = toperatorId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TID", nullable = false)
	public Task getTask() {
		return this.task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	@Column(name = "TOperatorName", nullable = false, length = 50)
	public String getToperatorName() {
		return this.toperatorName;
	}

	public void setToperatorName(String toperatorName) {
		this.toperatorName = toperatorName;
	}

}
