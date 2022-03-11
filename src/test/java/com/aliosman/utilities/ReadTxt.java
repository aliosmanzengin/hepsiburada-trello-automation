package com.aliosman.utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ReadTxt {

    public static List<String> returnAllBoardsList(String filePath){
        List<String >list = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {

                String username =line.split(",")[1].trim();
                String password = line.split(",")[0].trim();
                list.add(password);
                list.add(username);
                sb.append(System.lineSeparator());
                line = br.readLine();

            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    public static HashMap<String,String> returnBoardMaps(String filePath,String boardName){
        HashMap<String,String> boardMap = new HashMap<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                if (line.split(",")[0].trim() == boardName) {
                    boardMap.put(line.split(",")[0].trim(),line.split(",")[2].trim());
                }
                sb.append(System.lineSeparator());
                line = br.readLine();

            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return boardMap;
    }
    public static String returnBoardId(String filePath,String boardName){
        String boardId = "";
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                if (line.split(",")[0].trim().equals(boardName.trim()) ) {
                   boardId = line.split(",")[2].trim();
                }

                sb.append(System.lineSeparator());
                line = br.readLine();

            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return boardId;
    }

    public static String returnBoardId(String boardName){
        String filePath = "src/test/resources/testdata/Boards.txt";
        String boardId = "";
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                if (line.split(",")[0].trim().equals(boardName.trim()) ) {
                    boardId = line.split(",")[2].trim();
                }

                sb.append(System.lineSeparator());
                line = br.readLine();

            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return boardId;
    }
}
