import java.sql.*;

public class DemoJavaConnection {
    public static void main(String[] args) throws Exception {


        int sid = 8;
        String sname = "Jasmine";
        int marks = 99;
//        Create Connection
        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "Rishabh@8448";


//        String sql = "select * from student" ;
//        CRUD
//        String sql = "insert into student values(6,'John',88)";
//        String sql ="select sname from student where sid = 1";
//        String sql = "update student set sname='Tejas' where sid=5";
//        String sql = "delete from student where sid=5";

        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("Connection Established");

//        Create Statement
//        Statement st = con.createStatement();

        String sql = "insert into student values(?,?,?)";

        PreparedStatement st = con.prepareStatement(sql);
        st.setInt(1,sid);
        st.setString(2,sname);
        st.setInt(3,marks);
//        process
//        ResultSet rs = st.executeQuery(sql);
//        rs.next();
//        String name = rs.getString("sname");
//        System.out.println("Name of the Student is "+ name);
//        while (rs.next()){
//            System.out.print(rs.getInt(1) + " - ");
//            System.out.print(rs.getString(2) + " - ");
//            System.out.println(rs.getInt(3));
//        System.out.println(rs.getInt(3));


//        }
        int rows = st.executeUpdate();
        System.out.println(rows + " row(s) inserted");

//        last step
        con.close();
        System.out.println("Connection Closed");
    }
}
