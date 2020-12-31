import java.sql.*;
class JDBCCon1
{	
  static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
  static final String DB_URL="jdbc:mysql://localhost:3306/books";

  static final String USER="root";
  static final String PASS="Ashish$007";
  public static void main(String[] args)
  {
    Connection conn=null;
    Statement stmt=null;
    try
    {
      //Step2: Register JDBC Driver
      Class.forName("com.mysql.cj.jdbc.Driver");

      //Step3: Open a connection
      System.out.println("Connecting to database...");
      conn=DriverManager.getConnection(DB_URL,USER,PASS);

      //Step4: Exceute a query
      System.out.println("Creating Statement...");
      stmt=conn.createStatement();
      String sql;
      sql= "select * from book";
      ResultSet rs=stmt.executeQuery(sql);

      //Step5: Extract data from result setsc
      while(rs.next())
      {
        //Retrive column names
        int bookid=rs.getInt("accno");
        String bookName=rs.getString("title");
        double price=rs.getDouble("price");
        //Display values
        System.out.print("Accession No: "+bookid);
        System.out.print(",Book Title: "+bookName);
        System.out.println(",Price: "+price);
      }

      //Step6: Clean-up environment
      rs.close();
      stmt.close();
      conn.close();
    }
    catch(SQLException se)
    {
      //Handles errors for JDBC
      se.printStackTrace();
    }
    catch(Exception e)
    {
      //Handles errors for Class.forName
      e.printStackTrace();
    }
    finally
    {
      //finally block used to close resources
      try
      {
        if(stmt!=null)
        stmt.close();
      }
      catch(SQLException se2)
      {
        //nothing we can do
      }
      try
      {
        if(conn!=null)
        conn.close();
      }
      catch(SQLException se3)
      {
        se3.printStackTrace();
      }//end of finally try
    }//end of try
    System.out.println("Goodbye!");
  }//end main
}//end class