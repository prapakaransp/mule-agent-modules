package com.mulesoft.agent.monitoring.publisher.ingest.builder;

import com.mulesoft.agent.monitoring.publisher.ingest.model.IngestMetric;
import com.mulesoft.agent.monitoring.publisher.ingest.model.IngestTargetMetricPostBody;

import javax.inject.Singleton;
import java.util.Set;

/**
 * Builds the body of a target metric post body from the 3 metrics it contains.
 */
@Singleton
public class IngestTargetMetricPostBodyBuilder {

    public IngestTargetMetricPostBody build(Set<IngestMetric> cpuUsage, Set<IngestMetric> memoryUsage, Set<IngestMetric> memoryTotal)
    {
        return new IngestTargetMetricPostBody(cpuUsage, memoryUsage, memoryTotal);
    }

}
