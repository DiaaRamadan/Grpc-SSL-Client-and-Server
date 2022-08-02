import Singer.Signer;
import Singer.signGrpc;
import io.grpc.ChannelCredentials;
import io.grpc.Grpc;
import io.grpc.ManagedChannel;
import io.grpc.TlsChannelCredentials;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        File rootCertificate = new File("C:/Users/Diaa/Desktop/crts/SLCA.crt");
        ChannelCredentials creds = TlsChannelCredentials.newBuilder().trustManager(rootCertificate).build();
        ManagedChannel channel = Grpc.newChannelBuilder("172.30.240.1:5001", creds)
                .overrideAuthority("localhost").build();
        signGrpc.signBlockingStub stub = signGrpc.newBlockingStub(channel);
        Signer.signReply hello = stub.sign(Signer.signRequest.newBuilder().setData("Hello").build());
        System.out.println(hello.getSignedData());
    }
}