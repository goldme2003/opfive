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
 * Judgementitem generated by hbm2java
 */
@Entity
@Table(name = "judgementitem", catalog = "leanassessment")
public class Judgementitem implements java.io.Serializable {

	private int judgeItemId;
	private Rootasseitem rootasseitem;
	private String judgeItemName;
	private byte judgeStatement;
	private Set judgementsubitems = new HashSet(0);

	public Judgementitem() {
	}

	public Judgementitem(int judgeItemId, Rootasseitem rootasseitem, String judgeItemName, byte judgeStatement) {
		this.judgeItemId = judgeItemId;
		this.rootasseitem = rootasseitem;
		this.judgeItemName = judgeItemName;
		this.judgeStatement = judgeStatement;
	}

	public Judgementitem(int judgeItemId, Rootasseitem rootasseitem, String judgeItemName, byte judgeStatement,
			Set judgementsubitems) {
		this.judgeItemId = judgeItemId;
		this.rootasseitem = rootasseitem;
		this.judgeItemName = judgeItemName;
		this.judgeStatement = judgeStatement;
		this.judgementsubitems = judgementsubitems;
	}

	@Id

	@Column(name = "JudgeItemID", unique = true, nullable = false)
	public int getJudgeItemId() {
		return this.judgeItemId;
	}

	public void setJudgeItemId(int judgeItemId) {
		this.judgeItemId = judgeItemId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RootAsseItemID", nullable = false)
	public Rootasseitem getRootasseitem() {
		return this.rootasseitem;
	}

	public void setRootasseitem(Rootasseitem rootasseitem) {
		this.rootasseitem = rootasseitem;
	}

	@Column(name = "JudgeItemName", nullable = false, length = 100)
	public String getJudgeItemName() {
		return this.judgeItemName;
	}

	public void setJudgeItemName(String judgeItemName) {
		this.judgeItemName = judgeItemName;
	}

	@Column(name = "JudgeStatement", nullable = false)
	public byte getJudgeStatement() {
		return this.judgeStatement;
	}

	public void setJudgeStatement(byte judgeStatement) {
		this.judgeStatement = judgeStatement;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "judgementitem")
	public Set getJudgementsubitems() {
		return this.judgementsubitems;
	}

	public void setJudgementsubitems(Set judgementsubitems) {
		this.judgementsubitems = judgementsubitems;
	}

}