package com.company.DataBaseUtil.writer;

import com.company.DataBaseUtil.ConnectionUtil;
import com.company.entity.Flights;
import com.company.entity.Pilots;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class FlightsDBWriter {
    private static final String INSERT = "INSERT INTO flights (airplane_id, pilot_id, date_num, time_num, flights_num) VALUES(?, ?, ?, ?, ?)";

    public static void write(List<Flights> flights) {
        Connection connection = ConnectionUtil.getConnection();

        for (Flights flight : flights) {
            try (PreparedStatement statement = connection.prepareStatement(INSERT)) {
                statement.setInt(1, flight.getAirplaneId());
                statement.setInt(2, flight.getPilotId());
                DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
                java.util.Date utilDate = dateFormat.parse(flight.getDate());
                java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
                statement.setDate(3, sqlDate);
                statement.setString(4, flight.getTime());
                statement.setString(5, flight.getFlightsNum());

                statement.executeUpdate();
            } catch (SQLException | ParseException e) {
                e.printStackTrace();
            }

        }
        System.out.println("Запись в таблицу 'flights' завершена");


    }

}
