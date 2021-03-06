package org.keycloak.testsuite.arquillian.karaf;

import org.jboss.arquillian.container.spi.client.container.DeployableContainer;
import org.jboss.arquillian.core.spi.LoadableExtension;

/**
 *
 * @author tkyjovsk
 */
public class CustomKarafContainerExtension implements LoadableExtension {

    @Override
    public void register(ExtensionBuilder builder) {
        builder.service(DeployableContainer.class, CustomKarafContainer.class);
    }

}
