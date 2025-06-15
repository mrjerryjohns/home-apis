// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home

public interface HasEvents {
    public abstract fun <T : com.google.home.Event> events(event: com.google.home.EventFactory<T>): kotlinx.coroutines.flow.Flow<T>

    public abstract fun <T : com.google.home.Trait> events(trait: com.google.home.TraitFactory<T>): kotlinx.coroutines.flow.Flow<com.google.home.Event>

    public abstract fun events(): kotlinx.coroutines.flow.Flow<com.google.home.Event>
}
