package net.codejava;

import java.sql.*;

public class UsersManager {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/sampledb";
        String DBusername = "root";
        String dbpassword = "1234";

         String email = "Jokh@gmal";
        String fullname = "john doe";
        String username = "john";
        String password = "java";



        try {
            Connection conn = DriverManager.getConnection(jdbcURL,DBusername,dbpassword);

            //to insert into the table database
            /*
            String sql = "INSERT INTO users(username, password, fullname, email ) VALUES(?,?,?,?)";

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, password);
            statement.setString(3, fullname);
            statement.setString(4, email);

            int rows = statement.executeUpdate();

            if(rows > 0){
                System.out.println("new user inserted successfully");
            }



            //code to retrieve data from  the database

            String sql = "SELECT * FROM sampledb.users";
            Statement statement = conn.createStatement();
            ResultSet result =  statement.executeQuery(sql);

            while(result.next()){
                int userID = result.getInt(1);
                String username =  result.getString("username");
                String fullname =  result.getString("fullname");
                String password =  result.getString("username");
                String email =  result.getString("email");
                System.out.println(userID+ ":"+username+ ","+ fullname + ","+password+ ","+ email);

            }


           // update code
            String sql = " UPDATE users SET password =?, fullname = ?,email = ? WHERE username = ? ";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1,password);
            statement.setString(2,fullname);
            statement.setString(3,email);
            statement.setString(4,username);

            int rows = statement.executeUpdate();

            if (rows > 0)
            {
                System.out.println("updated success");
            }


             */
            String sql = "DELETE from users WHERE username = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1,"john");
            int rows =  statement.executeUpdate();
            if (rows >0)
            {
                System.out.println("user delete success");
            }

           conn.close();

        } catch (SQLException e) {
             e.printStackTrace();
        }
    }
}
