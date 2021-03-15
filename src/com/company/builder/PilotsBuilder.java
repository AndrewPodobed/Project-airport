package com.company.builder;

import com.company.entity.PilotRange;
import com.company.entity.Pilots;

public class PilotsBuilder {

    public static Object build(String pilotsLine) {

        String[] pilotsData = pilotsLine.split(";");
        String firstName = pilotsData[0];
        String lastMame = pilotsData[1];
        String pilotRange = pilotsData[2];
        String pilotCode = pilotsData[3];

        return new Pilots(firstName, lastMame, pilotRange, pilotCode);
    }
}
