package com.SpringImplementingBeanLifeCyleusingAnnotationsDay8Yt;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class GameBox {

	private int version;

	public GameBox() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "GameBox [version=" + version + "]";
	}

	// make this two method
	//add 1st api in pom.xml file then use @ 
	@PostConstruct
	public void Start() {
		System.out.println("Start Method callling ");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Destroy Method calling ");
	}

}
