package com.company;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;

public interface AbstractFactory {

    default Color getColor(String choice) {
        return null;
    }

    default Vehicle getVehicle(String choice) {
        return null;
    }

}
