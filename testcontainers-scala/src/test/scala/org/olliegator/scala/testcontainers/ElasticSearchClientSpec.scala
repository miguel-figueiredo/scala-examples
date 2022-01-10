package org.olliegator.scala.testcontainers

import com.dimafeng.testcontainers.ElasticsearchContainer
import com.dimafeng.testcontainers.scalatest.TestContainerForAll
import org.scalatest.{BeforeAndAfter, FlatSpec}

class ElasticSearchClientSpec extends FlatSpec with BeforeAndAfter with TestContainerForAll {

  // You need to override `containerDef` with needed container definition
  override val containerDef = ElasticsearchContainer.Def()

  before {
    println(containerDef.createContainer().httpHostAddress)
  }

  // To use containers in tests you need to use `withContainers` function
  it should "test" in withContainers { elasticSearchContainer =>
    // Inside your test body you can do with your container whatever you want to
    println(elasticSearchContainer.httpHostAddress)
  }

}
