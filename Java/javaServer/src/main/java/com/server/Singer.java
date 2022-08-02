package com.server;

import Singer.signGrpc.signImplBase;
import io.grpc.stub.StreamObserver;
import Singer.Signer;

public class Singer extends signImplBase {

    @Override
    public void sign(Signer.signRequest request, StreamObserver<Signer.signReply> responseObserver) {

        String data = request.getData() + " jhdsdnijfndsx c";

        Signer.signReply.Builder reply = Signer.signReply.newBuilder();

        reply.setSignedData(data);
        responseObserver.onNext(reply.build());
        responseObserver.onCompleted();
    }
}
