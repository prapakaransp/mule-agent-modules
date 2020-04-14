/**
 * (c) 2003-2020 MuleSoft, Inc. This software is protected under international copyright
 * law. All use of this software is subject to MuleSoft's Master Subscription Agreement
 * (or other master license agreement) separately entered into in writing between you and
 * MuleSoft. If such an agreement is not in place, you may not use the software.
 */

package com.mulesoft.agent.monitoring.configuration.guice;

import com.google.inject.Binder;
import com.google.inject.TypeLiteral;
import com.mulesoft.agent.configuration.guice.BaseModuleProvider;
import com.mulesoft.agent.domain.monitoring.Metric;
import com.mulesoft.agent.handlers.InternalMessageHandler;
import com.mulesoft.agent.monitoring.publisher.ZabbixMonitorPublisher;

import java.util.ArrayList;

/**
 * Guice module provider for this module
 *
 * @since 2.2.0
 */
public class ZabbixModuleProvider extends BaseModuleProvider
{

  @Override
  protected void configureModule(Binder binder)
  {
    bindInternalHandler(binder, ZabbixMonitorPublisher.class, new TypeLiteral<InternalMessageHandler<ArrayList<Metric>>>(){});
  }
}