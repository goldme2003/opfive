package com.nari.opfive.domain;
// Generated 2017-8-23 16:22:41 by Hibernate Tools 5.2.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Rootasseitem generated by hbm2java
 */
@Entity
@Table(name = "rootasseitem", catalog = "leanassessment")
public class Rootasseitem implements java.io.Serializable {

	private int rootAsseItemId;
	private Task task;
	private String rootAsseItemName;
	private Set judgementitems = new HashSet(0);

	public Rootasseitem() {
	}

	public Rootasseitem(int rootAsseItemId, Task task, String rootAsseItemName) {
		this.rootAsseItemId = rootAsseItemId;
		this.task = task;
		this.rootAsseItemName = rootAsseItemName;
	}

	public Rootasseitem(int rootAsseItemId, Task task, String rootAsseItemName, Set judgementitems) {
		this.rootAsseItemId = rootAsseItemId;
		this.task = task;
		this.rootAsseItemName = rootAsseItemName;
		this.judgementitems = judgementitems;
	}

	@Id

	@Column(name = "RootAsseItemID", unique = true, nullable = false)
	public int getRootAsseItemId() {
		return this.rootAsseItemId;
	}

	public void setRootAsseItemId(int rootAsseItemId) {
		this.rootAsseItemId = rootAsseItemId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TID", nullable = false)
	public Task getTask() {
		return this.task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	@Column(name = "RootAsseItemName", nullable = false, length = 100)
	public String getRootAsseItemName() {
		return this.rootAsseItemName;
	}

	public void setRootAsseItemName(String rootAsseItemName) {
		this.rootAsseItemName = rootAsseItemName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "rootasseitem")
	public Set getJudgementitems() {
		return this.judgementitems;
	}

	public void setJudgementitems(Set judgementitems) {
		this.judgementitems = judgementitems;
	}

}
