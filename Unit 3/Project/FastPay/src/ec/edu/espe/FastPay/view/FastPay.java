/*package ec.edu.espe.FastPay.view;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.FastPay.controller.Entry;
import java.util.List;
import java.util.Scanner;

public class FastPay {

    public static void main(String[] args) {
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        //Connecting With Server Please add the external jar file first
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        System.out.println("server connection successfully done");

        //Connecting with database
        MongoDatabase dbs = mongoClient.getDatabase("test");
        System.out.println("Connect to database successfully");
        System.out.println("Database Name" + dbs.getName());

        // To get all database names
        List<String> dbNames = mongoClient.getDatabaseNames();
        System.out.println(dbNames);

        //Drop Database
        mongoClient.dropDatabase("newDb");
        dbNames = mongoClient.getDatabaseNames();
        System.out.println(dbNames);
    }

}*/
