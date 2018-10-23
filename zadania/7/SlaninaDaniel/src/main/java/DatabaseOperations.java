import java.sql.*;


 class DatabaseOperations {
    static String outLine = "";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_RESET = "\u001B[0m";
    private static double price2 = 0;

     //Get List of processors from database based on amount of threads
     static void getThreads() {

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
            e.printStackTrace();
        }
    }

     //Get List of processors from database based on user's selection
     static void getProcessorInfo(String select, String select2, String select3) {

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
     static void getDDR() {

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
            e.printStackTrace();
        }
    }

     //Get List of memory modules from database based on user's selection
     static void getRamInfo(String select, String select2, String select3) {

        try{
            outLine = "";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/components","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select "+select+" from ram where "+select2+" like "+select3);
            while (rs.next())
                outLine += (rs.getString(1)+" or ");
            outLine = removeLastChars(outLine);
            System.out.println("--> " +outLine);
            con.close();
        }
        catch(Exception e) {
            System.out.println(ANSI_RED +"Bad choice ! choose RAM again !" +ANSI_RESET);
            System.out.println("---------------------------------------");
            Utils.ramSelect();
        }
    }

     //Get List of memory modules from database based on it's type
     static void getDiskType() {

        try{
            outLine = "";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/components","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select type from drive");
            while(rs.next())
                outLine += (rs.getString(1)+" or ");
            outLine = removeLastChars(outLine);
            System.out.println("--> " +outLine);
            con.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

     //Get List of disk drives from database based on user's selection
     static void getDiskInfo(String select, String select2, String select3) {

        try{
            outLine = "";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/components","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select "+select+" from drive where "+select2+" like "+select3);
            while (rs.next())
                outLine += (rs.getString(1)+" or ");
            outLine = removeLastChars(outLine);
            System.out.println("--> " +outLine);
            con.close();
        }
        catch(Exception e) {
            System.out.println(ANSI_RED +"Bad choice ! choose drive again !" +ANSI_RESET);
            System.out.println("---------------------------------------");
            Utils.driveSelect();
        }
    }

     //Get List of graphics cards  from database based on it's type
     static void getGraphicsCardType() {

         try{
             outLine = "";
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con=DriverManager.getConnection(
                     "jdbc:mysql://localhost:3306/components","root","");
             Statement stmt=con.createStatement();
             ResultSet rs=stmt.executeQuery("select type from graphicscard");
             while(rs.next())
                 outLine += (rs.getString(1)+" or ");
             outLine = removeLastChars(outLine);
             System.out.println("--> " +outLine);
             con.close();
         }
         catch(Exception e) {
             e.printStackTrace();
         }
     }

     //Get List of graphics cards  from database based on user's selection
     static void getGraphicsCardInfo(String select, String select2, String select3) {

         try{
             outLine = "";
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con=DriverManager.getConnection(
                     "jdbc:mysql://localhost:3306/components","root","");
             Statement stmt=con.createStatement();
             ResultSet rs=stmt.executeQuery("select "+select+" from graphicscard where "+select2+" like "+select3);
             while (rs.next())
                 outLine += (rs.getString(1)+" or ");
             outLine = removeLastChars(outLine);
             System.out.println("--> " +outLine);
             con.close();
         }
         catch(Exception e) {
             System.out.println(ANSI_RED +"Bad choice ! choose graphics card again !" +ANSI_RESET);
             System.out.println("---------------------------------------");
             Utils.graphicsCardSelect();
         }
     }

     //Get price for each selected component
     static double getPrice(String component1, String like){
         try {
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con = DriverManager.getConnection(
                     "jdbc:mysql://localhost:3306/components", "root", "");
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("select price from " +component1+ " where name like " + like);
             while (rs.next())
              price2 = rs.getDouble(1);
             con.close();

         }
         catch (Exception e){
             e.printStackTrace();
         }
         return price2;
     }

    //Just to ease the visibility of UI
    private static String removeLastChars(String str) {
        return str.substring(0,str.length()-3);
    }
}

