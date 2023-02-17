package test;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import java.io.Serializable;

@Named
@ViewScoped
public class JavaxNamedObject implements Serializable {

	private static final long serialVersionUID = 1L;
	private String hey = "Hello from Javax";

	public String getHey() {
		return hey;
	}

	public void setHey(String hey) {
		this.hey = hey;
	}

}
