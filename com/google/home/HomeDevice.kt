// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home

public interface HomeDevice : com.google.home.HasId, com.google.home.HasTraits, com.google.home.HasDeviceTypes, com.google.home.HasConnectivityState, com.google.home.automation.HasCandidates {
    public abstract val name: kotlin.String

    public abstract val isMatterDevice: kotlin.Boolean

    @kotlin.Deprecated public abstract val isInStructure: kotlin.Boolean

    @kotlin.Deprecated public abstract val isInRoom: kotlin.Boolean

    public abstract val roomId: com.google.home.Id?

    public abstract val structureId: com.google.home.Id?

    public abstract val agentId: com.google.home.Id?
        public abstract @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable get

    public abstract suspend fun structure(): com.google.home.Structure?

    public abstract suspend fun room(): com.google.home.Room?

    public abstract suspend fun setName(name: kotlin.String): com.google.home.HomeDevice

    @kotlin.Deprecated @com.google.android.gms.common.internal.ShowFirstParty public abstract fun <T : com.google.home.Trait> trait(trait: com.google.home.TraitFactory<T>): kotlinx.coroutines.flow.Flow<T>
}
