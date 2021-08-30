package org.olliegator.scala.testcontainers

import com.dimafeng.testcontainers.scalatest.TestContainerForAll
import com.dimafeng.testcontainers.{ContainerDef, ElasticsearchContainer, ForAllTestContainer, KafkaContainer, MySQLContainer}
import org.apache.kafka.clients.consumer.KafkaConsumer
import org.apache.kafka.clients.producer.{KafkaProducer, ProducerRecord}
import org.scalatest.flatspec.AnyFlatSpec

import java.time.Duration
import java.util
import java.util.Properties
import scala.collection.JavaConverters.iterableAsScalaIterableConverter

class ElasticSearchClientSpec extends AnyFlatSpec with TestContainerForAll {

  // You need to override `containerDef` with needed container definition
  override val containerDef = ElasticsearchContainer.Def()

  // To use containers in tests you need to use `withContainers` function
  it should "test" in withContainers { elasticSearchContainer =>
    // Inside your test body you can do with your container whatever you want to
    println(elasticSearchContainer.httpHostAddress)
  }

}
