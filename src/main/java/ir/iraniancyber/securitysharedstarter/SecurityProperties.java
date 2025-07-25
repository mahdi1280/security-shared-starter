package ir.iraniancyber.securitysharedstarter;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;

@ConfigurationProperties(prefix = "security")
public class SecurityProperties {

    private String jwkUri;
    private List<String> permitPaths = new ArrayList<>();

    public String getJwkUri() {
        return jwkUri;
    }

    public void setJwkUri(String jwkUri) {
        this.jwkUri = jwkUri;
    }

    public List<String> getPermitPaths() {
        return permitPaths;
    }

    public void setPermitPaths(List<String> permitPaths) {
        this.permitPaths = permitPaths;
    }
}
