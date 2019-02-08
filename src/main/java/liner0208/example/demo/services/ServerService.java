package liner0208.example.demo.services;

import liner0208.example.demo.configuration.ServerConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServerService {

    @Autowired
    private ServerConfiguration serverConfiguration;

    public String getMail(){

        return serverConfiguration.getMail();
    }
}
