package com.company.ResultWriter;

import com.company.entity.FullData;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ResultCSVWriter{

    private final String fileName;

    public ResultCSVWriter(String fileName) {
        this.fileName = fileName;
    }

    public static void writeResult(String fileName, List<FullData> fullDataList) throws IOException {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (FullData result : fullDataList) {
                writer.write(result.getFlightsNum()
                        + "; " + result.getDate()
                        + "; " + result.getTime()
                        + "; " + result.getNumAirplane()
                        + "; " + result.getBrand()
                        + " " + result.getModel()
                        + "; " + result.getCountPassengers()
                        + "; " + result.getFirstName()
                        + " " + result.getLastName()
                        + ".; " + result.getPilotCode()
                        + "(" + result.getPilotRange() + ")"

                        + "\n");

            }
            System.out.println("Запись данных в файл 'result.csv' завершена успешно!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
