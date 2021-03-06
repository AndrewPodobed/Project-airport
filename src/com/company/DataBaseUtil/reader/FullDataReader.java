package com.company.DataBaseUtil.reader;

import com.company.DataBaseUtil.ConnectionUtil;
import com.company.entity.FullData;
import com.company.entity.PilotRange;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FullDataReader {
    private static final String SELECT_FULL_DATA = "SELECT fl.flights_num, fl.date_num, fl.time_num," +
            "pl.num_airplane,pl.brand,pl.model,pl.count_passengers," +
            "pi.last_name,pi.first_name,pi.pilot_code,pi.pilot_range FROM flights AS fl INNER JOIN planer AS pl ON fl.id = pl.id INNER JOIN pilot AS pi ON pi.id = fl.airplane_id;";

    public static List<FullData> read() {
        List<FullData> result = new ArrayList<>();

        Connection connection = ConnectionUtil.getConnection();

        try (PreparedStatement statement = connection.prepareStatement(SELECT_FULL_DATA)) {
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String flightsNum = resultSet.getString("flights_num");
                Date date = resultSet.getDate("date_num");
                String time = resultSet.getString("time_num");
                String numAirplane = resultSet.getString("num_airplane");
                String brand = resultSet.getString("brand");
                String model = resultSet.getString("model");
                int countPassengers = resultSet.getInt("count_passengers");
                String lastName = resultSet.getString("last_name");
                String firstName = resultSet.getString("first_name");
                String pilotRange = resultSet.getString("pilot_range");
                String pilotCode = resultSet.getString("pilot_code");

                PilotRange range = PilotRange.getByRange(pilotRange);
                
                result.add(new FullData(flightsNum, date, time, numAirplane, brand, model, countPassengers, lastName, firstName.substring(0,1), range, pilotCode));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }
}
