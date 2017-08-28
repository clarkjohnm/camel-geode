package org.cybersapien;

import org.apache.camel.Exchange;
import org.apache.camel.impl.DefaultProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

/**
 * The Geode producer.
 */
public class GeodeProducer extends DefaultProducer {
    private static final Logger LOG = LoggerFactory.getLogger(GeodeProducer.class);
    private GeodeEndpoint endpoint;

    @SuppressWarnings("WeakerAccess")
    public GeodeProducer(GeodeEndpoint endpoint) {
        super(endpoint);
        this.endpoint = endpoint;
    }

    public void process(Exchange exchange) throws Exception {
        LOG.info(Objects.toString(exchange.getIn().getBody()));
    }

}
