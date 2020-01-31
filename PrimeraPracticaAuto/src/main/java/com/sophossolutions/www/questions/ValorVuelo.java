package com.sophossolutions.www.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ValorVuelo implements Question<String> {

	public Target target;

	public ValorVuelo(Target target) {
		super();
		this.target = target;
	}

	@Override
	public String answeredBy(Actor actor) {

		return Text.of(target).viewedBy(actor).asString();
	}

	// nos retorna el valor q nos devuelve el target como objetivo

	public static ValorVuelo precioViaje(Target target) {
		return new ValorVuelo(target);

	}

}
