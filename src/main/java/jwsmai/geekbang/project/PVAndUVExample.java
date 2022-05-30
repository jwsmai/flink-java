package jwsmai.geekbang.project;

import org.apache.flink.api.java.utils.ParameterTool;
import java.io.IOException;
import java.util.Properties;

public class PVAndUVExample {
    public static void main(String[] args) throws IOException {
        /**
         * 从配置文件读取kafka配置
         */
        String filePath = "src/main/resources/appaction.properties";
        final ParameterTool parameterTool = ParameterTool.fromPropertiesFile(filePath);
        String kafkaTopic = parameterTool.get("kafka-topic", "default");
        String brokers = parameterTool.get("brokers", "node01:9092");
        System.out.printf("Reading from kafka topic %s @ %s\n", kafkaTopic, brokers);

        Properties kafkaProps = new Properties();
        kafkaProps.setProperty("bootstrap.servers", brokers);

    }
}
