package DAO_Implementacion;
import java.sql.Connection;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class DataSourceBD {
	private static HikariConfig config = new HikariConfig();
	private static HikariDataSource ds;
	
	static {
		config.setJdbcUrl("jdbc:mysql://localhost:3306/personas");
        config.setUsername("root");
        config.setPassword("");
        config.addDataSourceProperty("cachePrepStmts", "true");
        config.addDataSourceProperty("maximumPoolSize", "10"); 
        config.addDataSourceProperty("prepStmtCacheSize", "250"); 
        config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048"); 
        ds = new HikariDataSource(config);
	}
	
	public static Connection getConnection() throws SQLException {
        return ds.getConnection();
	}

}
