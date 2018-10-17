import java.sql.*;


public class DatabaseOperations {
    static String outLine = "";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    //Get List of processors from database based on amount of threads
    public static void getThreads() {

        try{
            outLine = "";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/components","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select threads from CPU");
            while(rs.next())
                outLine += (rs.getString(1)+" or ");
            outLine = removeLastChars(outLine);
            System.out.println("--> " +outLine);
            con.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }

    //Get List of processors from database based on user's selection
    public static void getProcessorInfo(String select, String select2, String select3) {

        try{
            outLine = "";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/components","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select "+select+" from CPU where "+select2+" like "+select3);
            while (rs.next())
                    outLine += (rs.getString(1)+" or ");
            outLine = removeLastChars(outLine);
            System.out.println("--> " +outLine);
            con.close();
        }
        catch(Exception e) {
            System.out.println(ANSI_RED +"Bad choice ! choose processor again !" +ANSI_RESET);
            System.out.println("---------------------------------------");
            Utils.processorSelect();
        }
    }


    public static void getRamInfo(String select, String select2, String select3) {

        try{
            outLine = "";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/components","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select "+select+" from CPU where "+select2+" like "+select3);
            while (rs.next())
                outLine += (rs.getString(1)+" or ");
            outLine = removeLastChars(outLine);
            System.out.println("--> " +outLine);
            con.close();
        }
        catch(Exception e) {
            System.out.println(ANSI_RED +"Bad choice ! choose processor again !" +ANSI_RESET);
            System.out.println("---------------------------------------");
            Utils.processorSelect();
        }
    }

    //Get List of memory modules from database based on it's type
    public static void getDDR() {

        try{
            outLine = "";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/components","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select type from ram");
            while(rs.next())
                outLine += (rs.getString(1)+" or ");
            outLine = removeLastChars(outLine);
            System.out.println("--> " +outLine);
            con.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }

    //Just to ease the visibility of UI
    private static String removeLastChars(String str) {
        return str.substring(0,str.length()-3);
    }
}

