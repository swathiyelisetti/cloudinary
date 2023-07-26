package cloudinary.example.clodinaryDemo.config;

import com.cloudinary.Cloudinary;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class CloudinaryConfig {

    private final String CLOUD_NAME="daikmvdbw";
    private final String API_KEY="166354169684961";

    private final String API_SECRET="NMc-QSnNXPu1wkuZr3axz2qbAHQ";

    @Bean
    public Cloudinary cloudinary(){
        Map<String,String> config=new HashMap<>();
        config.put("cloud_name",CLOUD_NAME);
        config.put("api_key",API_KEY);
        config.put("api_secret",API_SECRET);
        return new Cloudinary(config);
    }
}
