package priv.learn.consume;

import org.apache.kafka.clients.consumer.*;
import org.apache.kafka.common.TopicPartition;

import java.util.Arrays;
import java.util.Map;
import java.util.Properties;

/**
 * @author: jiahaixin
 * @date: 2019/10/10 16:39
 * @description:异步手动提交offset(也支持回调函数)
 */
public class CommitAsyncCounsumer {

    public static void main(String[] args) {
        Properties props = new Properties();
        props.put("bootstrap.servers", "10.160.20.161:9092,10.160.22.146:9092,10.160.23.212:9092");
        //props.put("bootstrap.servers", "10.162.128.103:9092,10.162.128.104:9092,10.162.128.105:9092");
        props.put(ConsumerConfig.GROUP_ID_CONFIG, "test2");

        //关闭自动提交offset
        props.put("enable.auto.commit", "false");
        props.put("enable.auto.commit", "true");
        //props.put("auto.offset.reset","latest");
        props.put("auto.commit.interval.ms", "1000");
        props.put("key.deserializer",
                "org.apache.kafka.common.serialization.StringDeserializer");
        props.put("value.deserializer",
                "org.apache.kafka.common.serialization.StringDeserializer");
        KafkaConsumer<String, String> consumer = new KafkaConsumer<>(props);
        consumer.subscribe(Arrays.asList("second", "third", "learn-java-kafka","ielog_zt_ideatemplate"));
        while (true) {
            ConsumerRecords<String, String> records = consumer.poll(100);
            for (ConsumerRecord<String, String> record : records) {
                System.out.printf("offset = %d, key = %s, value = %s%n", record.offset(), record.key(), record.value());
            }
            consumer.commitAsync(new OffsetCommitCallback() {
                @Override
                public void onComplete(Map<TopicPartition, OffsetAndMetadata> map, Exception e) {
                    if (e != null) {
                        System.out.println("commit failed" + map);
                    }
                }
            });
        }
    }
}
