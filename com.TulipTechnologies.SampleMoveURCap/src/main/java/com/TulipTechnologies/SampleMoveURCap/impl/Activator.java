package com.TulipTechnologies.SampleMoveURCap.impl;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import com.TulipTechnologies.SampleMoveURCap.impl.SimpleMoveService;
import com.ur.urcap.api.contribution.InstallationNodeContribution;

/**
 * Hello world activator for the OSGi bundle URCAPS contribution
 *
 */
public class Activator implements BundleActivator {
	@Override
	public void start(BundleContext context) throws Exception {
		context.registerService(InstallationNodeContribution.class, new SimpleMoveService(),null);
	}

	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Activator says Goodbye World!");
	}
}

