
using Grpc.Net.Client;
using Microsoft.Extensions.Configuration;
using System.Security.Cryptography.X509Certificates;

var AppName = new ConfigurationBuilder();

X509Certificate2 clientCertificate = new X509Certificate2(@"C:\Users\Diaa\Desktop\crts\localhost_client.pfx", "12345678");

var handler = new HttpClientHandler();
handler.ClientCertificates.Add(clientCertificate);

var channel = GrpcChannel.ForAddress("https://172.30.240.1:5001", new GrpcChannelOptions
{
    HttpHandler = handler
});


var client2 = new GrpcServer.Custom.CustomClient(channel);
var model = new GrpcServer.CustomLookupModel(){ Id = 1 };
var replay = await client2.getCustomInfoAsync(model);

//var client = new GrpcServer.Greeter.GreeterClient(channel);
//var input = new GrpcServer.HelloRequest { Name = "GrpcClient" };
//var replay = await client.SayHelloAsync(input);

Console.WriteLine(replay.Name);

Console.ReadLine();
