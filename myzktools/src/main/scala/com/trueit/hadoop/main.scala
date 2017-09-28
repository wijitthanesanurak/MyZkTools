package com.trueit.hadoop

import kafka.api.OffsetRequest
import kafka.javaapi.FetchResponse
import kafka.javaapi.consumer.SimpleConsumer
import kafka.javaapi.message.ByteBufferMessageSet
import kafka.message.Message
import kafka.message.MessageAndOffset

object HelloWorld {
  
  def main(args: Array[String]) {
    println("Hello world")
  }
}