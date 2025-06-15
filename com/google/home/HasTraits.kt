// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home

public interface HasTraits {
    public abstract fun <T : com.google.home.Trait> has(trait: com.google.home.TraitFactory<T>): kotlin.Boolean

    public abstract fun <T : com.google.home.Trait> getSourceConnectivity(trait: com.google.home.TraitFactory<T>): com.google.home.SourceConnectivity?
}
