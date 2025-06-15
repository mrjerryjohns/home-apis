// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home

public interface Structure : com.google.home.HasId, com.google.home.HasHomeDevices, com.google.home.HasRooms, com.google.home.HasTraits, com.google.home.automation.HasAutomations, com.google.home.automation.HasCandidates {
    public abstract val name: kotlin.String

    @com.google.android.gms.common.internal.ShowFirstParty public abstract fun <T : com.google.home.Trait> trait(trait: com.google.home.TraitFactory<T>): kotlinx.coroutines.flow.Flow<T>

    @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public abstract suspend fun refreshCandidates(): kotlin.Unit
}
