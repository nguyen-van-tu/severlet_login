import com.mysql.cj.jdbc.MysqlDataSource;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.beans.PropertyEditorSupport;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import static java.sql.DriverManager.getConnection;

@WebServlet(urlPatterns = "/home")
public class demo_web extends HttpServlet {
    private static String DB_URL = "jdbc:mysql://localhost:3306/authentication";
    private static String USER_NAME = "root";
    private static String PASSWORD = "123456";


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
//        PrintWriter writer = response.getWriter();
//        writer.println("<html>");
//        writer.println("<h1>Hello world</h1>");
//        writer.println("<html>");


        PrintWriter writer = response.getWriter();
        writer.println("<html>");


//        try {
//            MysqlDataSource dataSource = new MysqlDataSource();
//            dataSource.setUser("scott");
//            dataSource.setPassword("tiger");
//            dataSource.setServerName("myDBHost.example.org");
//
//            String connectionURL = "jdbc:mysql://localhost/authentication";
//            Connection connection = null;
//            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
//            connection = getConnection(connectionURL, "root", "123456");
//            PreparedStatement st = connection.prepareStatement("SELECT * FROM user WHERE username = ? AND password = ?");
//            st.setString(1, username);
//            st.setString(2, password);
//            ResultSet users = st.executeQuery();
//            if(users.next())
//            {
//                writer.println("<h1>Welcome "+username+" to website</h1>");
//            }
//            else {
//                writer.println("<h1>Wrong account</h1>");
//            }
//            connection.close();
//        } catch(Exception ex){
//            writer.println("<h1>Login Error</h1>");
//        }

        if ("tutuan".equals(username) && "tutuan123".equals(password)) {
            writer.println("<h1>Welcome " + username + " to website</h1>");
        } else {
            writer.println("<h1>Login Error</h1>");
        }
        writer.println("</html>");

        writer.println("<html>");

        Date today = new Date();

        writer.println("<h1>" + today + "</h1>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    }
}


