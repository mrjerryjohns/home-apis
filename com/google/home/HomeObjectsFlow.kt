// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home

public final class HomeObjectsFlow<T : com.google.home.HasId> internal constructor(flow: kotlinx.coroutines.flow.Flow<kotlin.collections.Set<T>>) : kotlinx.coroutines.flow.Flow<kotlin.collections.Set<T>> {
    public final val flow: kotlinx.coroutines.flow.Flow<kotlin.collections.Set<T>> /* compiled code */

    public final suspend fun list(): kotlin.collections.Set<T> { /* compiled code */ }

    public final fun itemFlow(id: com.google.home.Id): kotlinx.coroutines.flow.Flow<T> { /* compiled code */ }

    public final fun itemFlow(item: T): kotlinx.coroutines.flow.Flow<T> { /* compiled code */ }

    public final suspend fun get(id: com.google.home.Id): T? { /* compiled code */ }

    @com.google.home.annotation.HomeExperimentalApi public final fun stream(): kotlinx.coroutines.flow.Flow<com.google.home.HomeObjectChangeEvent<T>> { /* compiled code */ }

    public open suspend fun collect(collector: kotlinx.coroutines.flow.FlowCollector<kotlin.collections.Set<T>>): kotlin.Unit { /* compiled code */ }
}

