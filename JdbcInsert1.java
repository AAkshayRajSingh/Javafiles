import java.sql.*;
class JdbcInsert1
{
  static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
  static final String DB_URL="jdbc:mysql://localhost/books";
  static int bookId;
  static int bookName;
  static double price;
  static final String USER="root";
  static final String PASS="Ashish$007";
  public static void main(String[] args)
  {
    Connection conn=null;
    Statement stmt=null;
    try
    {
      //Step2: Register JDBC Driver
      Class.forName("com.mysql.jdbc.Driver");

      //Step3: Open a connection
      System.out.println("Connecting to database...");
      conn=DriverManager.getConnection(DB_URL,USER,PASS);

      //Step4: Exceute a query
      System.out.println("Creating Statement...");
      stmt=conn.createStatement();
      stmt.executeUpdate("INSERT INTO book(accno,title,pice)VALUES("+1003+",'Title',"+234.56+")");
      conn.close();
    }
    catch(Exception e)
    {
    	System.err.println("Got an Exception!");
    	System.err.println(e.getMessage());
    }
  }
}