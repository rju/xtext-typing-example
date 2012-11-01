package de.cau.cs.se.lad.typing;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.common.types.access.jdt.TypeURIHelper;

import de.cau.cs.se.lad.types.Type;

 /**
 * The type provider interface.
 * 
 * @author chsch - Initial contribution (derived from org.eclipse.xtext.common.types.access.IJvmTypeProvider)
 * @author rju - Cleanups and commentary
 */
public interface ITypeProvider {
    
    
    /**
     * Provides a collection of all supported types (helpful for content assist).
     * 
     * @author chsch
     */
    Iterable<Type> getAllTypes();
    
    /**
     * Find a type by its fully qualified name, e.g. java.util.Map$Entry, int[], void or
     * java.lang.String[][][].
     * 
     * @return the found {@link Type} or null if no such type could be found.
     */
    Type findTypeByName(String name);

    /**
     * Returns the resource set that will contain dynamically created resources.
     * 
     * @return the resource set.
     */
    ResourceSet getResourceSet();

    interface Factory {

        ITypeProvider createTypeProvider(ResourceSet resourceSet);

        ITypeProvider findTypeProvider(ResourceSet resourceSet);

        ITypeProvider findOrCreateTypeProvider(ResourceSet resourceSet);

        ITypeProvider createTypeProvider() throws UnsupportedOperationException;

    }

    /**
     * Introduced analogously to {@link org.eclipse.xtext.common.types.access.jdt.IJdtTypeProvider
     * IJdtTypeProvider#getTypeUriHelper()}.
     * 
     * @return the used {@link TypeURIHelper}
     */
    LadTypeURIHelper getTypeUriHelper();



}
