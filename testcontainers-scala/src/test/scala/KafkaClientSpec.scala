package org.olliegator.scala.testcontainers

import com.dimafeng.testcontainers.{Container, ForAllTestContainer, KafkaContainer}
import org.apache.kafka.clients.producer.{KafkaProducer, ProducerRecord}
import org.apache.kafka.clients.consumer.KafkaConsumer
import org.scalatest.flatspec.AnyFlatSpec

import java.time.Duration
import java.util
import java.util.{Properties, UUID}
import scala.collection.JavaConverters.{asJavaIterableConverter, iterableAsScalaIterableConverter}
import scala.collection.mutable.ArrayBuffer

class KafkaClientSpec extends AnyFlatSpec with ForAllTestContainer {

  // Using the IDE suggestion to override the container doesn't work
  // See: https://github.com/testcontainers/testcontainers-scala/issues/134
  override val container: KafkaContainer = KafkaContainer()

  val topic = "topic"

  "the test" should "use a container" in {
    val properties = new Properties()
    properties.put("bootstrap.servers", container.bootstrapServers)
    println(container.bootstrapServers)
    properties.put("group.id", "test-group")
    properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer")
    properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer")
    properties.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer")
    properties.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer")
    val producer = new KafkaProducer[String, String](properties)
    producer.send(new ProducerRecord(topic, "id", "Hello"))
    producer.flush()

    val consumer: KafkaConsumer[String, String] = new KafkaConsumer[String, String](properties)
    consumer.subscribe(util.Arrays.asList(topic))
    while (true) {
      val record = consumer.poll(Duration.ofMillis(1000)).asScala
      for (data <- record.iterator)
        println(data.value())
    }
  }
}
