package com.company.DataBaseUtil.writer;

import com.company.DataBaseUtil.ConnectionUtil;
import com.company.entity.Pilots;
import com.company.entity.Planers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class PlanersDBWriter {
    private static final String INSERT = "INSERT INTO planer (brand, model, count_passengers, num_airplane) VALUES(?, ?, ?, ?)";

    public static void write(List<Planers> planers) {
        Connection connection = ConnectionUtil.getConnection();

        for (Planers planer : planers) {
            try (PreparedStatement statement = connection.prepareStatement(INSERT)) {
                statement.setString(1, planer.getBrand());
                statement.setString(2, planer.getModel());
                statement.setInt(3, planer.getCountPassengers());
                statement.setString(4, planer.getNumAirplane());

                statement.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
