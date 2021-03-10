package com.company.DataBaseUtil.writer;

import com.company.DataBaseUtil.ConnectionUtil;
import com.company.entity.Pilots;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class PilotsDBWriter {
    private static final String INSERT = "INSERT INTO pilot (first_name, last_name, pilot_range, pilot_code   ) VALUES(?, ?, ?, ?)";

    public static void write(List<Pilots> pilot) {
        Connection connection = ConnectionUtil.getConnection();

        for (Pilots pilots : pilot) {
            try (PreparedStatement statement = connection.prepareStatement(INSERT)) {
                statement.setString(1, pilots.getFirstName());
                statement.setString(2, pilots.getLastName());
                statement.setString(3, pilots.getPilotRange());
                statement.setString(4, pilots.getPilotCode());

                statement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Запись в таблицу 'pilot' завершена");
    }
}
