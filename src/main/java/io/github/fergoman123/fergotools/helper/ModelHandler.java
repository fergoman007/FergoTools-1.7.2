package io.github.fergoman123.fergotools.helper;

import io.github.fergoman123.fergotools.FergoTools;
import org.apache.http.impl.conn.Wire;

import java.io.*;

public class ModelHandler {
//    public static void writeBlockModel(String fileName, String texturePath) throws IOException {
//        File blockState = new File("/assets/fergotools/blockstates/" + fileName + ".json");
//        File blockModel = new File("/assets/fergotools/models/block/" + fileName + ".json");
//        File itemModel = new File("/asset/fergotools/models/item/" + fileName + ".json");
//
//        if (!blockState.exists() && !blockModel.exists() && !itemModel.exists()) {
//            blockState.createNewFile();
//            blockModel.createNewFile();
//            itemModel.createNewFile();
//        }
//
//        try {
//            PrintWriter writer = new PrintWriter(blockState);
//
//        }
//    }

    public static void writeFile(String fileName, String value)
    {
        writeBlockState(fileName, value);
    }

//    public static void writeMetaBlockModel(String blockStateName, String[] fileNames, String[] texturePaths) throws IOException {
//        File blockState = new File("/assets/fergotools/blockstates/" + blockStateName + ".json");
//        File[] blockModels = new File[fileNames.length];
//        File[] itemModels = new File[fileNames.length];
//
//    }

    private static void writeBlockState(String filename, String value){
        File blockState = new File("/assets/fergotools/blockstates/" + filename + ".json");
        try {
            FergoTools.getLogger().info("Initializing Print Writer");
            PrintWriter writer = new PrintWriter(blockState);
            writer.println("{");
            writer.println("\"variants\":{");
            writer.println("\"normal\": {\":\"model\":\"fergotools:" + value + "\"}");
            writer.println("}");
            writer.close();
            FergoTools.getLogger().info("Written File: " + filename + ".json");
        } catch (IOException e) {
            FergoTools.getLogger().error("unable to write block state file: " + e.getMessage());
        }
    }
}
