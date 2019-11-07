package com.ychenchen.sql;

import org.apache.spark.SparkConf;
import org.apache.spark.sql.SparkSession;

/**
 * @author Alexis.Yang
 * @descriptioin spark-hive-reader
 * @date 2019/11/7 3:18 PM
 * @copyright www.ychenchen.com
 */
public class SparkHiveExample {
    public static void main(String[] args) {
        SparkConf conf = new SparkConf();

        SparkSession spark = SparkSession
                .builder()
                .master("local[4]")
                .appName("Spark Hive Example")
                .config(conf)
                .enableHiveSupport()
                .getOrCreate();

        spark.sql("show tables").show();
        spark.sql("select * from student").show();

        spark.stop();
    }
}
