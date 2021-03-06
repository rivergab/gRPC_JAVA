package com.github.simplesteph.grpc.test;

import java.time.Instant;
import java.util.Date;
import testproto.Test.*;
import testproto.TimestampOuterClass;

public class test {
  public static void main(String[] args) {
    System.out.println(Instant.ofEpochMilli(1));
    System.out.println(Instant.ofEpochMilli(2));
    System.out.println(Instant.now());
    System.out.println(new Date().getTime());



    TestMessage testMessage = TestMessage.newBuilder()
        .setTimestampxxxx(
            TimestampOuterClass.Timestamp.newBuilder()
                .setEpochSecond(1111L)
                .build()
        )
        .setNumber(444)
        .build();


    System.out.println(testMessage);


//    Test.TestMessage testMessagessss = Test.TestMessage.newBuilder()
//        .setTimestampxxxx(
//            TimestampOuterClass.Timestamp.newBuilder().setEpochSecond(Instant.now())
//            .build())
//        .build();
//
//    TimestampOuterClass.Timestamp timestamp = TimestampOuterClass.Timestamp.newBuilder().build();
//
//    Test.TestMessage testMessage = Test.TestMessage.newBuilder()
//        .setTimestampxxxx(timestamp)
//        .build();
//
//    System.out.println(testMessage);
  }

}
