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
      Class.forName(JDBC_DRIVER);

      //Step3: Open a connection
      System.out.println("Connecting to database...");
      conn=DriverManager.getConnection(DB_URL,USER,PASS);

      //Step4: Exceute a query
      System.out.println("Creating Statement...");
      stmt=conn.createStatement();
      String sql="UPDATE Registration"+" SET age=30 WHERE id in(100,101)";
      stmt.executeUpdate(sql);
      sql= "SELECT id,first,last,ageFROM Registration";
      ResultSet rs=stmt.executeQuery(sql);

      //Step5: Extract data from result set
      while(rs.next())
      {
        //Retrive column names
        int id=rs.getInt("id");
        int age=rs.getInt("age");
        String first=rs.getString("first");
        String last=rs.getString("last");
        System.out.print("ID:"+id);
        System.out.print("Age:"+age);
        System.out.print("First:"+first);
        System.out.print("Last:"+last);
}
rs.close();
}
catch(SQLException se)
{
se.printStackTrace();
}
catch(Exception se)
{
se.printStackTrace();
}
catch (Exception e)
{
   
}

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