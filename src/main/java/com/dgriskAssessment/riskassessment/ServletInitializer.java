package com.dgriskAssessment.riskassessment;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.dgriskAssessment.riskassessment.services"})
@EntityScan("com.dgriskAssessment.riskassessment.domain")
@EnableJpaRepositories("com.dgriskAssessment.riskassessment.repository")

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(RiskAssessmentApplication.class);
	}

}
