package br.com.stapassoli.vendas.anottations;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Controller
@Profile("dev")
public @interface Dev {}
