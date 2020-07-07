package com.dgriskAssessment.riskassessment.Config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.dgriskAssessment.riskassessment.models.RiskAssessmentModel;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.dgriskAssessment.riskassessment.Repository",
entityManagerFactoryRef = "memberEntityManagerFactory",
transactionManagerRef= "memberTransactionManager")

public class AmlDataSourceConfig {

	@Bean
	@Primary
	@ConfigurationProperties(prefix = "spring.datasource")

	public DataSourceProperties amlDataSourceProperties() {
		return new DataSourceProperties();
	}

	@Bean
	@Primary
	@ConfigurationProperties(prefix = "spring.datasource")

	public DataSource amlDataSource() {
		return amlDataSourceProperties().initializeDataSourceBuilder().build();
	}

	@Primary
	@Bean(name = "memberEntityManagerFactory")

	public LocalContainerEntityManagerFactoryBean customerEntityManagerFactory(EntityManagerFactoryBuilder builder) {
		return builder.dataSource(amlDataSource()).packages(RiskAssessmentModel.class).persistenceUnit("customers")
				.build();
	}

	@Primary
	@Bean
	public PlatformTransactionManager memberTransactionManager(
			final @Qualifier("memberEntityManagerFactory") LocalContainerEntityManagerFactoryBean memberEntityManagerFactory) {
		return new JpaTransactionManager(memberEntityManagerFactory.getObject());
	}

}