package be.cloud;
import be.cloud.PhoneBookGrpc.PhoneBookImplBase;
import io.grpc.stub.StreamObserver;
import be.cloud.Person;

public class PhoneBookImpl extends PhoneBookImplBase {

    @Override
    public void addPerson(Person request, StreamObserver<Success> responseObserver) {
        //super.addPerson(request, responseObserver);
        String name = request.getName();
        PhoneNumber number = request.getNumber();

        System.out.println("+++++ New Person: " + name + "with number: " + number.getNumber() + "+++++");
        Success success = Success.newBuilder()
            .setSuccess(true)
            .build();

        responseObserver.onNext(success);
        responseObserver.onCompleted();
        
    }

    @Override
    public void getPhoneNumberByName(Person request, StreamObserver<PhoneNumber> responseObserver) {
        String number = request.getNumber().getNumber();
        PhoneType type = request.getNumber().getType();

        PhoneNumber response = PhoneNumber.newBuilder()
            .setNumber(number)
            .setType(type)
            .build();
    
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getNameByPhoneNumber(PhoneNumber request, StreamObserver<Person> responseObserver) {
        //super.getNameByPhoneNumber(request, responseObserver);
        String name = "Elon Musk";
        String number = request.getNumber();

        PhoneNumber phoneNumber = PhoneNumber.newBuilder()
            .setNumber(number)
            .setType(PhoneType.MOBILE)
            .build();

        Person response = Person.newBuilder()
            .setEmail("elon.musk@spacex.com")
            .setId(0)
            .setName(name)
            .setNumber(phoneNumber)
            .build();
        
        responseObserver.onNext(response);
        responseObserver.onCompleted();
        
    }

    
}
