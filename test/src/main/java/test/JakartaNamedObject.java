package test;

import java.io.Serializable;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

@Named
@ViewScoped
public class JakartaNamedObject implements Serializable {

	private static final long serialVersionUID = 1L;

	private String hey = "Hello From Jakarta";

	public String getHey() {
		return hey;
	}

	public void setHey(String hey) {
		this.hey = hey;
	}

}
