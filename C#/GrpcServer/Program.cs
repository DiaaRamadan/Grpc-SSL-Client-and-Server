using GrpcServer.Services;
using System.Security.Cryptography.X509Certificates;


var config = new GrpcServer.Config();

var builder = WebApplication.CreateBuilder(args);

// Additional configuration is required to successfully run gRPC on macOS.
// For instructions on how to configure Kestrel and gRPC clients on macOS, visit https://go.microsoft.com/fwlink/?linkid=2099682

// Add services to the container.
builder.Services.AddGrpc();


builder.WebHost.ConfigureKestrel(opt =>
{
    var cert = new X509Certificate2(config.GetPfxCertPath(), config.GetPfxCertPassword());

    opt.ConfigureHttpsDefaults(h => {
        // Choose RequireCertificate instead of AllowCertificate if it is required
        h.ClientCertificateMode = Microsoft.AspNetCore.Server.Kestrel.Https.ClientCertificateMode.DelayCertificate;
        // this checks whether the certificate has been signed by some greater authority
        h.CheckCertificateRevocation = false;
        h.ServerCertificate = cert;
    });
});


var app = builder.Build();

// Configure the HTTP request pipeline.

app.UseRouting();

app.UseEndpoints(endpoints =>
{
    app.MapGrpcService<GreeterService>();
    app.MapGrpcService<CustomService>();
    
    app.MapGet("/", () => "Communication with gRPC endpoints must be made through a gRPC client. To learn how to create a client, visit: https://go.microsoft.com/fwlink/?linkid=2086909");

});


app.Run();
