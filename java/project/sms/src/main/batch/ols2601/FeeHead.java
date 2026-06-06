package batch.ols2601;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FeeHead
{
    private int id;
    private String name;
    private String type;

    private Connection connection = null;
    private Statement statement = null;


    public FeeHead()  {
        try
        {
            connection = DriverManager.getConnection("jdbc:mariadb://localhost/sms_2601", "ols2601", "ols2601");
            statement = connection.createStatement();
        } catch(SQLException ex){
            System.out.println(ex.toString());
        } finally {
            System.out.println("Aal is well!");
        }
    }

    public FeeHead(String name, String type) {
        FeeHead();
        this.name = name;
        this.type = type;
    }

    public void newFeeHead()
    {
        String sql = "INSERT INTO ";
    }
}