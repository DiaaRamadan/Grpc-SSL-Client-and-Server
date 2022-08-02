namespace GrpcServer
{
    public class Config
    {
        public static IConfigurationRoot Configuration { get; set; }
        public  Config()
        {
            var builder = new ConfigurationBuilder()
                .SetBasePath(Directory.GetCurrentDirectory())
                .AddJsonFile("appsettings.json", optional: true, reloadOnChange: true);

            Configuration = builder.Build();
        }

        
        public string GetPort()
        {
            return GetSettingsKey("Port");
        }

        public String GetUrl()
        {
            return GetSettingsKey("Url");
        }

        public String GetPfxCertPath()
        {
            return GetSettingsKey("PfxCertPath");
        }

        public String GetPfxCertPassword()
        {
            return GetSettingsKey("PfxCertPassword");
        }

        private String GetSettingsKey(String key)
        {
            return GetSection("ConnectionStrings").GetChildren()
                .FirstOrDefault(config => config.Key == key).Value;

        }

        private IConfigurationSection GetSection(String sectionName)
        {
            return Configuration.GetSection(sectionName);
        }
        
    }

}
