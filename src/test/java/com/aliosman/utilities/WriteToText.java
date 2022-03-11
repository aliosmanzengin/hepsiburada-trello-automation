package com.aliosman.utilities;

import com.aliosman.api.pojos.BoardPojo;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteToText {
    public static void saveBoardResponseToFile(String fileName, BoardPojo boardPojos)  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
                writer.append(boardPojos.getName()+",");
                writer.append(boardPojos.getUrl() + ",");
                writer.append(boardPojos.getId()+",\n");

            writer.close();
        } catch(Exception e){

        }
    }


}
