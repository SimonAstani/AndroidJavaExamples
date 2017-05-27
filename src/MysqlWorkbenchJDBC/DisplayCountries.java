/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MysqlWorkbenchJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author root
 */
public class DisplayCountries {

    //database URL
    static final String DATABASE_URL = "jdbc:mysql://localhost:3306/productSales";

    //launch the application
    public static void main(String[] args) {
        Connection connection = null;//manages the connection
        Statement statement = null; //query statement;
        ResultSet resultset = null; //manages the result;

        //connect to database productsale and query database
        try {
            //establish connection to database
            connection = DriverManager.getConnection(DATABASE_URL, "root", "simon");
            //create statement for query to database;
            statement = connection.createStatement();
            //query the database
            resultset = statement.executeQuery("SELECT * FROM user where country = 'nepal'");

            //proccess the query set
            ResultSetMetaData metaData = resultset.getMetaData();

            int numberOfColumns = metaData.getColumnCount();
            System.out.println("Authors Table of Books Database:\n");
            for (int i = 1; i <= numberOfColumns; i++) {
                System.out.printf("%-8s\t", metaData.getColumnName(i));
                }
                  System.out.println();
            while (resultset.next()) {
                for (int i = 1; i <= numberOfColumns; i++) {
                    System.out.printf("%-8s\t", resultset.getObject(i));
                }
                System.out.println();
            } // end while
        } // end try
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        } // end catch
        finally // ensure resultSet, statement and connection are closed
        {
            try {
                resultset.close();
                statement.close();
                connection.close();
            } // end try
            catch (Exception exception) {
                exception.printStackTrace();
            } // end catch
        } // end finally
    } // end main        

}
    
}
