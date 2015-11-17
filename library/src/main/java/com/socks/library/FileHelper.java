package com.socks.library;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.Random;

/**
 * Created by zhaokaiqiang on 15/11/17.
 */
public class FileHelper {

    public static boolean save(File dic, String fileName, String msg) {

        File file = new File(dic, fileName);

        try {
            OutputStream outputStream = new FileOutputStream(file);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-8");
            outputStreamWriter.write(msg);
            outputStreamWriter.flush();
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public static String getFileName() {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder("KLog_");
        stringBuilder.append(Long.toString(System.currentTimeMillis()+random.nextInt(10000)).substring(4));
        stringBuilder.append(".txt");
        return stringBuilder.toString();
    }

}
