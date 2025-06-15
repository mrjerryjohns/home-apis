// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.automation

public interface HasCandidates {
    public abstract fun candidates(): kotlinx.coroutines.flow.Flow<kotlin.collections.Set<com.google.home.automation.NodeCandidate>>

    public abstract fun allCandidates(): kotlinx.coroutines.flow.Flow<kotlin.collections.Set<com.google.home.automation.NodeCandidate>>
}
