package org.cybersapien;

import org.apache.camel.Consumer;
import org.apache.camel.Processor;
import org.apache.camel.Producer;
import org.apache.camel.impl.DefaultEndpoint;
import org.apache.camel.spi.Metadata;
import org.apache.camel.spi.UriEndpoint;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriPath;

/**
 * Represents a Geode endpoint.
 */
@UriEndpoint(scheme = "geode", title = "Geode", syntax="geode:name", consumerClass = GeodeConsumer.class, label = "Geode")
public class GeodeEndpoint extends DefaultEndpoint {
    @UriPath @Metadata(required = "true")
    private String name;
    @UriParam(defaultValue = "10")
    private int option = 10;

    public GeodeEndpoint() {
    }

    @SuppressWarnings("WeakerAccess")
    public GeodeEndpoint(String uri, GeodeComponent component) {
        super(uri, component);
    }

    public Producer createProducer() throws Exception {
        return new GeodeProducer(this);
    }

    public Consumer createConsumer(Processor processor) throws Exception {
        return new GeodeConsumer(this, processor);
    }

    public boolean isSingleton() {
        return true;
    }

    /**
     * Some description of this option, and what it does
     */
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * Some description of this option, and what it does
     */
    public void setOption(int option) {
        this.option = option;
    }

    public int getOption() {
        return option;
    }
}
