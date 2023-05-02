package com.springbatch.jdbccursorreader.reader;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.batch.item.database.JpaPagingItemReader;
import org.springframework.batch.item.database.builder.JpaPagingItemReaderBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springbatch.jdbccursorreader.dominio.Cliente;

@Configuration
public class JdbcCursorReaderConfig {
	@Bean
	public JpaPagingItemReader<Cliente> jdbcCursorReader(
			@Qualifier("appDataSource")DataSource datasource, EntityManagerFactory entityFactory) {
		return new JpaPagingItemReaderBuilder<Cliente>()
				.name("jdbcCursorReader")
				.entityManagerFactory(entityFactory)
				.saveState(false)
				.pageSize(10)
				.queryString("SELECT c FROM Cliente c")
				.build();
	}	
}
