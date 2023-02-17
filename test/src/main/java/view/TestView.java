package view;

import java.io.Serializable;

import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import test.JakartaNamedObject;
import test.JavaxNamedObject;

@Named
@ViewScoped
public class TestView implements Serializable {
	private static final long serialVersionUID = 1L;
	private JakartaNamedObject resort;
	private JavaxNamedObject jxo;

	private String theSaying = "kkk";

	@PostConstruct
	private void init() {
		resort = new JakartaNamedObject();
		resort.setHey("deirtch");
		theSaying = resort.getHey();
		jxo =  new JavaxNamedObject();
		jxo.setHey("in the biew");
	}

	public String getTheSaying() {
		return theSaying;
	}

	public void setTheSaying(String theSaying) {
		this.theSaying = theSaying;
	}

}
