package org.cybersapien;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.Endpoint;

import org.apache.camel.impl.DefaultComponent;

/**
 * Represents the component that manages {@link GeodeEndpoint}.
 */
public class GeodeComponent extends DefaultComponent {

    public GeodeComponent() {super();}

    public GeodeComponent(CamelContext context) {
        super(context);
    }

    protected Endpoint createEndpoint(String uri, String remaining, Map<String, Object> parameters) throws Exception {
        Endpoint endpoint = new GeodeEndpoint(uri, this);
        setProperties(endpoint, parameters);
        return endpoint;
    }
}
