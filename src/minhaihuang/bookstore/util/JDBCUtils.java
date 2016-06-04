package minhaihuang.bookstore.util;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * 这个是JDBCUtils类，该工具类负责操作数据库
 * @author 黄帅哥
 *
 */
public class JDBCUtils {
	// 1 提供数据库连接
	// 2 提供数据库连接池
	// 3 执行update/insert/delete sql语句
	// 执行查询 , 根据id查询 , 查询全部 ,条件查询, 条件分页查询
	
	private static DataSource dataSource=null;
	
	//初始化dataSource
	static{
		dataSource =new ComboPooledDataSource();
	}
	
	/**
	 * 获取数据库连接池
	 * @return
	 */
	public static DataSource getDataSource(){
		return dataSource;
	}
	
	/**
	 * 获取数据库连接
	 * @return
	 * @throws SQLException 
	 */
	public static Connection getConnection() throws SQLException{
		return dataSource.getConnection();
	}
	
	/**
	 * 更新数据库的方法
	 * @throws SQLException 
	 */
	public static int updateOrDeleteOrInsert(String sql,Object...param ) throws SQLException{
		QueryRunner queryRunner=new QueryRunner(dataSource);
		
		return queryRunner.update(sql, param);
	}
	
	/**
	 * 更新数据库的方法,可控制事务
	 * @throws SQLException 
	 */
	public static int updateOrDeleteOrInsert(Connection conn,String sql,Object...param ) throws SQLException{
		QueryRunner queryRunner=new QueryRunner(dataSource);
		
		return queryRunner.update(conn,sql, param);
	}
	
	/**
	 * 查询数据库的方法
	 * @param sql
	 * @param params
	 * @param beanClazz
	 * @return
	 * @throws SQLException
	 */
	public static <T> List<T> query(String sql, Object[] params,
			Class<T> beanClazz) throws SQLException {
		QueryRunner queryRunner = new QueryRunner(dataSource);
		return queryRunner
				.query(sql, new BeanListHandler<T>(beanClazz), params);
	}

	/**
	 * 查询数据库的方法，可控制事务
	 * @param conn
	 * @param sql
	 * @param params
	 * @param beanClazz
	 * @return
	 * @throws SQLException
	 */
	public static <T> List<T> query(Connection conn, String sql,
			Object[] params, Class<T> beanClazz) throws SQLException {
		QueryRunner queryRunner = new QueryRunner(dataSource);
		return queryRunner.query(conn, sql, new BeanListHandler<T>(beanClazz),
				params);
	}
}
