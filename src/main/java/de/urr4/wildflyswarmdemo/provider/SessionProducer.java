package de.urr4.wildflyswarmdemo.provider;

import org.neo4j.ogm.config.Configuration;
import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;
import org.wildfly.swarm.spi.runtime.annotations.ConfigurationValue;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;

/**
 * Test Producer to see, how easily I could connect to a Neo4j
 */
@ApplicationScoped
public class SessionProducer {

    /**
     * Injected Config Values
     */
    @Inject
    @ConfigurationValue("myapp.neo4j.url")
    private String url;

    @Inject
    @ConfigurationValue("myapp.neo4j.user")
    private String neo4jUser;

    @Inject
    @ConfigurationValue("myapp.neo4j.password")
    private String neo4jPassword;

    @Produces
    public Session sessionFactory(){
        Configuration configuration = new Configuration.Builder()
                .uri(url)
                .credentials(neo4jUser, neo4jPassword)
                .build();
        SessionFactory sessionFactory = new SessionFactory(configuration, "de.urr4.wildflyswarmdemo.entities");
        return sessionFactory.openSession();
    }
}
