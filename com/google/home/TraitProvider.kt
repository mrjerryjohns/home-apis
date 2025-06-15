// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home

public interface TraitProvider {
    public abstract fun <T : com.google.home.Trait> trait(traitFactory: com.google.home.TraitFactory<T>): T?

    public open fun traits(): kotlin.collections.Set<com.google.home.Trait> { /* compiled code */ }
}
