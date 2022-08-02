package com.server;

import io.grpc.*;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        ServerCredentials creds = TlsServerCredentials.create(
                new File("C:/Users/Diaa/Desktop/crts/localhost.crt"),
                new File("C:/Users/Diaa/Desktop/crts/grpc_server.pk8"));

        Server server = Grpc.newServerBuilderForPort(5001, creds)
                .addService(new Singer())
                .build();
        server.start();



        System.out.println("Server started on https://localhost:5001");

        server.awaitTermination();
    }
}