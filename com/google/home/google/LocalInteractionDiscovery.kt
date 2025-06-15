// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class LocalInteractionDiscovery private constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.google.PlatformTraitClient, attributes: com.google.home.google.LocalInteractionDiscoveryTrait.Attributes) : com.google.home.google.PlatformTrait, com.google.home.google.LocalInteractionDiscoveryTrait.Attributes {
    public companion object : com.google.home.TraitFactory<com.google.home.google.LocalInteractionDiscovery> {
        public final fun initializeDiscovery(enabledFeatures: kotlin.collections.List<com.google.home.google.LocalInteractionDiscoveryTrait.Feature> = COMPILED_CODE): com.google.home.automation.Command { /* compiled code */ }
    }

    internal final val attributes: com.google.home.google.LocalInteractionDiscoveryTrait.Attributes /* compiled code */

    public open val factory: com.google.home.TraitFactory<com.google.home.google.LocalInteractionDiscovery> /* compiled code */

    public open val automationCandidateNodes: kotlin.collections.List<kotlin.ByteArray> /* compiled code */

    public open val compressedResponse: kotlin.ByteArray /* compiled code */

    public open val lastUpdatedTimestampSeconds: kotlin.Long /* compiled code */

    public open val structureObjectId: kotlin.String /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun hashCode(): kotlin.Int { /* compiled code */ }

    public final suspend fun initializeDiscovery(enabledFeatures: kotlin.collections.List<com.google.home.google.LocalInteractionDiscoveryTrait.Feature> = COMPILED_CODE): kotlin.Unit { /* compiled code */ }
}
