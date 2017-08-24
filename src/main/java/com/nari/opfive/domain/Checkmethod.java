package com.nari.opfive.domain;
// Generated 2017-8-24 13:03:49 by Hibernate Tools 5.2.5.Final

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
 * Checkmethod generated by hbm2java
 */
@Entity
@Table(name = "checkmethod", catalog = "leanassessment")
public class Checkmethod implements java.io.Serializable {

	private int checkMethodId;
	private Judgementsubitem judgementsubitem;
	private String checkMethodName;
	private Set checkresults = new HashSet(0);

	public Checkmethod() {
	}

	public Checkmethod(int checkMethodId, Judgementsubitem judgementsubitem, String checkMethodName) {
		this.checkMethodId = checkMethodId;
		this.judgementsubitem = judgementsubitem;
		this.checkMethodName = checkMethodName;
	}

	public Checkmethod(int checkMethodId, Judgementsubitem judgementsubitem, String checkMethodName, Set checkresults) {
		this.checkMethodId = checkMethodId;
		this.judgementsubitem = judgementsubitem;
		this.checkMethodName = checkMethodName;
		this.checkresults = checkresults;
	}

	@Id

	@Column(name = "CheckMethodID", unique = true, nullable = false)
	public int getCheckMethodId() {
		return this.checkMethodId;
	}

	public void setCheckMethodId(int checkMethodId) {
		this.checkMethodId = checkMethodId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "JudgeSubitemID", nullable = false)
	public Judgementsubitem getJudgementsubitem() {
		return this.judgementsubitem;
	}

	public void setJudgementsubitem(Judgementsubitem judgementsubitem) {
		this.judgementsubitem = judgementsubitem;
	}

	@Column(name = "CheckMethodName", nullable = false, length = 100)
	public String getCheckMethodName() {
		return this.checkMethodName;
	}

	public void setCheckMethodName(String checkMethodName) {
		this.checkMethodName = checkMethodName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "checkmethod")
	public Set getCheckresults() {
		return this.checkresults;
	}

	public void setCheckresults(Set checkresults) {
		this.checkresults = checkresults;
	}

}
