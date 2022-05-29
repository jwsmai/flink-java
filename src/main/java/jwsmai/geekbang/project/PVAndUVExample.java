package jwsmai.geekbang.project;

import org.apache.flink.api.java.utils.ParameterTool;

import java.io.IOException;

public class PVAndUVExample {
    public static void main(String[] args) throws IOException {
        String filePath = "src/main/resources/appaction.properties";
        final ParameterTool parameterTool = ParameterTool.fromPropertiesFile(filePath);
        String kafkaTopic = parameterTool.get("kafka-topic", "default");
        String brokers = parameterTool.get("brokers", "node01:9092");

        System.out.printf("Reading from kafka topic %s @ %s\n", kafkaTopic, brokers);
        System.out.println();
    }
}
