// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class LightEffectsImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.google.LightEffectsTrait.Attributes) : com.google.home.google.LightEffects, com.google.home.matter.MatterTraitImpl, com.google.home.google.LightEffectsTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.google.LightEffectsTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val defaultSleepDurationSeconds: kotlin.UInt? /* compiled code */

    public open val defaultWakeDurationSeconds: kotlin.UInt? /* compiled code */

    public open val effectEndTimestampSeconds: kotlin.Long? /* compiled code */

    public open val featureMap: com.google.home.google.LightEffectsTrait.LightEffectsFeature /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val pulseEffectSet: kotlin.Boolean? /* compiled code */

    public open val sleepEffectSet: kotlin.Boolean? /* compiled code */

    public open val wakeEffectSet: kotlin.Boolean? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.google.LightEffects.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.google.LightEffects.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun pulseEffectSet(durationSeconds: kotlin.UInt, color: com.google.home.google.LightEffectsTrait.Color): kotlin.Unit { /* compiled code */ }

    public open suspend fun sleepEffectSet(durationSeconds: kotlin.UInt): kotlin.Unit { /* compiled code */ }

    public open suspend fun wakeEffectSet(durationSeconds: kotlin.UInt): kotlin.Unit { /* compiled code */ }

    public open suspend fun stopEffect(): kotlin.Unit { /* compiled code */ }

    public open fun pulseEffectSetBatchable(durationSeconds: kotlin.UInt, color: com.google.home.google.LightEffectsTrait.Color): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun sleepEffectSetBatchable(durationSeconds: kotlin.UInt): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun wakeEffectSetBatchable(durationSeconds: kotlin.UInt): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun stopEffectBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}
