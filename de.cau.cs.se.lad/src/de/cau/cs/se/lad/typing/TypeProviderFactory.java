package de.cau.cs.se.lad.typing;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ui.statushandlers.StatusManager;

import com.google.inject.Inject;

/**
 * This class is a derivative of {@link org.eclipse.xtext.common.types.access.jdt.JdtTypeProviderFactory
 * JdtTypeProviderFactory}.
 * 
 * @author chsch
 */
public class TypeProviderFactory implements ITypeProvider.Factory {
    
    @Inject
    public TypeProviderFactory() {
    }

    public ITypeProvider createTypeProvider(ResourceSet resourceSet) {
        if (resourceSet == null) {
            throw new IllegalArgumentException("resourceSet may not be null.");
        } else {
            return new TypeProvider(resourceSet);
        }
    }

    /**
     * {@inheritDoc}
     */
    public ITypeProvider findTypeProvider(ResourceSet resourceSet) {
        if (resourceSet == null)
            throw new IllegalArgumentException("resourceSet may not be null.");
        Object o = 
                resourceSet.getResourceFactoryRegistry()
                .getProtocolToFactoryMap().get(LadURIHelperConstants.PROTOCOL);
        if (o != null && !(o instanceof ITypeProvider)) {
            StatusManager.getManager().addLoggedStatus(new Status(IStatus.WARNING, "de.menges.metamodel",
                    "MengesTypeProviderFactory: Dieser Fall sollte nicht mehr auftreten!!"
            		+ " Kommt im Moment wahrscheinlich daher, dass noch Sprachen ohne unseren"
            		+ " MengesGlobalScopeProvider im Spiel sind. "));
            return new TypeProvider(resourceSet);
        }
        return (ITypeProvider) o; 
    }

    /**
     * {@inheritDoc}
     */
    public ITypeProvider findOrCreateTypeProvider(ResourceSet resourceSet) {
        if (resourceSet == null)
            throw new IllegalArgumentException("resourceSet may not be null.");
        ITypeProvider result = findTypeProvider(resourceSet);
        if (result != null)
            return result;
        return createTypeProvider(resourceSet);
    }

    /**
     * {@inheritDoc}
     */
    public ITypeProvider createTypeProvider() throws UnsupportedOperationException {
        return createTypeProvider(new ResourceSetImpl());
    }
    
}
