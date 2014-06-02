package models;

import java.util.*;
import play.data.validation.Constraints.*;
import play.db.ebean.*;
import play.data.validation.Constraints.*;
import javax.persistence.*;

public class Equation {

	@Required public double a;
	@Required public double b;
	@Required public double c;

	public String solve(Equation equation) {
		// equation.save();
		double a = equation.a;
		double b = equation.b;
		double c = equation.c;
		double delta = b * b - 4 * a * c;
		if (delta == 0) {
			double x = (-b + Math.sqrt(delta)) / (2 * a);
			return "There is one solution" + x;
		} else if (delta > 0) {
			double x = (-b + Math.sqrt(delta)) / (2 * a);
			double x1 = (-b - Math.sqrt(delta)) / (2 * a);

			return "There are 2 solutions: s1=" + x + "    s2=" + x1;
		} else
			return "No Solution ";

	}

}