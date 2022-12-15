package be.cloud;

import io.grpc.Server;
import io.grpc.ServerBuilder;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Starting GRPC Server..." );
        Server server = ServerBuilder
            .forPort(8080)
            .addService(new PhoneBookImpl())
            .build();

        try {
            server.start();
            server.awaitTermination();
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }
}