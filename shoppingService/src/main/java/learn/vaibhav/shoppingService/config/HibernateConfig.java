/**
 * 
 */
package learn.vaibhav.shoppingService.config;


import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author vaibhav.bansal
 *
 */
@ComponentScan (basePackages={"learn.vaibhav.shoppingService.dto"})
@Configuration
@EnableTransactionManagement
public class HibernateConfig {
	
	//configuration specific to H2 database
	private static String DATABASE_URL="jdbc:h2:tcp://localhost/~/onlineshopping";
	private static String DATABASE_DRIVER="org.h2.Driver";
	private static String DATABASE_DIALECT="org.hibernate.dialect.H2Dialect";
	private static String DATABASE_USERNAME="sa";
	private static String DATABASE_PASSWORD="";

	
	@Bean
	public DataSource getDataSource(){
			//providing database connection information
			BasicDataSource datasource = new BasicDataSource();
			datasource.setDriverClassName(DATABASE_DRIVER);
			datasource.setUrl(DATABASE_URL);
			datasource.setUsername(DATABASE_USERNAME);
			datasource.setPassword(DATABASE_PASSWORD);
			
			return datasource;
	}
	
	@Bean
	public SessionFactory  getSession(DataSource dataSource){
		LocalSessionFactoryBuilder builder = new LocalSessionFactoryBuilder(dataSource);
		builder.addProperties(getHibernateProperties());
		builder.scanPackages("learn.vaibhav.shoppingService.dto");
		return builder.buildSessionFactory();
	}
	
	private Properties getHibernateProperties(){
		Properties property = new Properties();
		property.setProperty("hibernate.dialect", DATABASE_DIALECT);
		property.setProperty("hibernate.show_sql", "true");
		property.setProperty("hibernate.format_sql", "true");
		return property;
	}
	
	@Bean
	public  HibernateTransactionManager getTxManager(SessionFactory sessionFactory){
		HibernateTransactionManager txManager = new HibernateTransactionManager(sessionFactory);
		return txManager;
	}
}
