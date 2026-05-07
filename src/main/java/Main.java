import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    static void main(String[] args) throws Exception{

        String url = "jdbc:mysql://localhost:3306/escola";
        String uname = "root";
        String pass = "1234";
        String query = "SELECT * FROM estudante";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {

            int id = rs.getInt("id");
            String nome = rs.getString("nome");
            int idade = rs.getInt("idade");
            String curso = rs.getString("curso");

            System.out.println(id + " | " + nome + " | " + idade + " | " + curso);
        }


        st.close();
        con.close();
    }
}




