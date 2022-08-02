using Grpc.Core;

namespace GrpcServer.Services
{
    public class CustomService : Custom.CustomBase
    {
        private readonly ILogger<CustomService> _logger;

        public CustomService(ILogger<CustomService> logger)
        {
            _logger = logger;
        }

        public override Task<CustomModel> getCustomInfo(CustomLookupModel request,
            ServerCallContext context)
        {

            CustomModel model = new CustomModel();

            if (1 == request.Id)
            {
                model.Name = "User#1";
                model.Description = "Description for user#1";
            }
            else if (2 == request.Id)
            {
                model.Name = "User#2";
                model.Description = "Description for user#2";
            }
            else
            {
                model.Name = "Default user";
                model.Description = "Description for default user";
            }

            return Task.FromResult(model);
        }
    }
}
