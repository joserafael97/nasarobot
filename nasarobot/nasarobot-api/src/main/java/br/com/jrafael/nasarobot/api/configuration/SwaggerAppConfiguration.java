package br.com.jrafael.nasarobot.api.configuration;


import br.com.jrafael.infrastructure.configuration.SwaggerConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerAppConfiguration extends SwaggerConfiguration {

    public SwaggerAppConfiguration(){
        this.projectPackage = "br.com.jrafael.nasarobot.api.controller";
        this.titleApplication = "NASA ROBOT";
        this.descriptionApplication = "Project to manage robot on Mars";
    }
}
