package com.designpattern.bridge.scene_example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * JDBC示例讲解 桥接模式
 * @author Json
*/
public class scene_example {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String sql = "具体要操作的sql语句";  
		
		// 1：装载驱动  
		Class.forName("驱动的名字");  

		// 2：创建连接  
		Connection conn = DriverManager.getConnection("连接数据库服务的URL", "用户名","密码");  

		// 3：创建statement或者是preparedStatement  
		PreparedStatement pstmt = conn.prepareStatement(sql);  

		// 4：执行sql，如果是查询，再获取ResultSet  
		ResultSet rs = pstmt.executeQuery(sql);  

		// 5：循环从ResultSet中把值取出来，封装到数据对象中去  
		while (rs.next()) {  
		    // 取值示意，按名称取值  
		    String id = rs.getString("id");  
		}  

		//6：关闭  
		rs.close();  
		pstmt.close();  
		conn.close();
	}
}
