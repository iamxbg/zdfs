package zdfs.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages= {"zdfs"}
				,excludeFilters= {@Filter(type=FilterType.ANNOTATION,value= {EnableWebMvc.class})})
public class RootConfig {
	
	
	@Bean
	public DataSource dataSource() {
		
			
		return null;
	}

	
	@Bean
	public SqlSessionFactoryBean sqlSessionFactory() {
		SqlSessionFactoryBean bean=new SqlSessionFactoryBean();
			bean.setDataSource(dataSource());
			ClassPathResource resource=new ClassPathResource("zdfs/model/**.xml");
			bean.setMapperLocations(new Resource[] {resource});
			return bean;
	}
	
	@Bean
	@Autowired
	public SqlSessionTemplate sqlSession(SqlSessionFactory sqlSessionFactory) {
		SqlSessionTemplate template=new SqlSessionTemplate(sqlSessionFactory);
		return template;
	}
	
	
	
}
