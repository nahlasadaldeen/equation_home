package controllers;

import models.Equation;
import play.*;
import play.data.Form;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
	static Form<Equation> taskForm = Form.form(Equation.class);

	public static Result index() {
		return ok(views.html.index.render("", taskForm));

	}

	public static Result solve() {
    	Form<Equation> filledForm = taskForm.bindFromRequest();
    	if(filledForm.hasErrors()) {
    	return badRequest(
    	views.html.index.render("error", filledForm
    	));
    	} else {
    		Equation e=filledForm.get();
    		return ok(views.html.index.render(e.solve(filledForm.get()), taskForm)
	    	);
    	}
    	}
}
