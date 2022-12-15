package be.cloud;

import be.cloud.PhoneBookGrpc;
import be.cloud.PhoneBookGrpc.PhoneBookBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Starting client..." );
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
            .usePlaintext()
            .build();
        
        PhoneBookBlockingStub stub = PhoneBookGrpc.newBlockingStub(channel);
        
        Random random = new Random();
        
        Person elonMusk = Person.newBuilder()
            .setId(0)
            .setName("Elon Musk")
            .setEmail("elon.musk@spacex.com")
            .setNumber(PhoneNumber.newBuilder().setNumber("+32" + (100000 + random.nextInt(900000))).setType(PhoneType.MOBILE).build())
            .build(); 
            
        
        Person profKrisAerts = Person.newBuilder()
            .setId(1)
            .setName("Prof. dr. Kris Aerts")
            .setEmail("kris.aerts@uhasselt.be")
            .setNumber(PhoneNumber.newBuilder().setNumber("+32" + (100000 + random.nextInt(900000))).setType(PhoneType.MOBILE).build())
            .build();   
        
        Person ik = Person.newBuilder()
            .setId(2)
            .setName("Simon Wilmots")
            .setEmail("simon.wilmots@student.uhasselt.be")
            .setNumber(PhoneNumber.newBuilder().setNumber("+32" + (100000 + random.nextInt(900000))).setType(PhoneType.MOBILE).build())
            .build();

        // addPerson
        System.out.println("***** addPerson *****");
        Success success = stub.addPerson(profKrisAerts);
        System.out.println("Success: " + success.getSuccess());

        // getPhoneNumberByName
        System.out.println("***** getPhoneNumberByName *****");
        System.out.println("Getting phone number of " + ik.getName() + "...");
        PhoneNumber number = stub.getPhoneNumberByName(ik);
        System.out.println("Number found: " + number.getNumber());

        // getNameByPhoneNumber
        System.out.println("***** getNameByPhoneNumber *****");
        System.out.println("Looking up the name with number: " + elonMusk.getNumber().getNumber() + "...");
        Person person = stub.getNameByPhoneNumber(elonMusk.getNumber());
        System.out.println("Person found: " + person.getName());

        channel.shutdown();
    }
}
