package com.carlostojal.tarefascasa.Auxiliares;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BD {

    public static Connection criarConexao() {

        Connection c = null;

        try {

            Class.forName("org.postgresql.Driver");

            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb",
                    "postgres", "password123");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return c;

    }
}
