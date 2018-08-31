package bddCucumberTests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

//More Information about Cucumber Options: http://toolsqa.com/cucumber/cucumber-options/

@CucumberOptions(
		//Permite limpiar la consola de información irrelevante y de caracteres basura.
		monochrome=true,
		//Al poner la opción dryRun en true permite ejecutar sin abrir navegador para observar posibles errores
		dryRun=false,
		//Ubicación del archivo(s) .feature que contiene las historias, para utilizar varios se deben utilizar {"",""}
		features="src/test/Features",
		//Ubicación de las clases que contienen la implementación de los pasos
		glue="bddStepImplementations",
		plugin= {"pretty","html:target/cucumber-htmlreport",
				"json:target/cucumber-report.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtendReport.html"}
		)

public class SahiLoginTestRunner {

}
