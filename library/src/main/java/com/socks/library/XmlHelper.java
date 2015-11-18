package com.socks.library;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * Created by zhaokaiqiang on 15/11/18.
 */
public class XmlHelper {

    public static String formatXML(String inputXML) {
        XMLWriter writer = null;
        String requestXML = null;
        try {
            SAXReader reader = new SAXReader();
            Document document = reader.read(new StringReader(inputXML));
            StringWriter stringWriter = new StringWriter();
            OutputFormat format = new OutputFormat(" ", true);
            writer = new XMLWriter(stringWriter, format);
            writer.write(document);
            writer.flush();
            requestXML = stringWriter.getBuffer().toString();
        } catch (IOException e) {
            return inputXML;
        } catch (DocumentException e) {
            return inputXML;
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    return inputXML;
                }
            }
        }

        return requestXML;
    }

}
