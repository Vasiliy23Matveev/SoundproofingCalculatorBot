import java.sql.*;


public class Calculator {
   public double calculate(int S) {

        String jdbcURL = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password = "J1nk1nkent";
        
        int id = 1;
        double TOTAL_PRICE = 0;
        double UNIT_TOTAL_PRICE = 0;
        try {
            while (id != 106) {
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            String sql4 = "SELECT CEILING(consumption_rate/quantity*"+S+")*unit_price AS price FROM floor_premium WHERE id = "+id;
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql4);
            while (result.next()) {
                UNIT_TOTAL_PRICE = result.getDouble("price");
            }
            TOTAL_PRICE+=UNIT_TOTAL_PRICE;
            id++;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        TOTAL_PRICE += 4050;
        System.out.println("По формуле: " + TOTAL_PRICE);
        return TOTAL_PRICE;
   }

}
