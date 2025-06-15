// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class VolumeImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.google.VolumeTrait.Attributes) : com.google.home.google.Volume, com.google.home.matter.MatterTraitImpl, com.google.home.google.VolumeTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.google.VolumeTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val currentVolumePercent: kotlin.UByte? /* compiled code */

    public open val featureMap: kotlin.UInt /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val isMuted: kotlin.Boolean? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.google.Volume.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.google.Volume.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun moveToVolume(volumePercent: kotlin.UByte): kotlin.Unit { /* compiled code */ }

    public open suspend fun volumeStep(stepMode: com.google.home.google.VolumeTrait.VolumeStepModeEnum, step: kotlin.UByte): kotlin.Unit { /* compiled code */ }

    public open suspend fun mute(): kotlin.Unit { /* compiled code */ }

    public open suspend fun unmute(): kotlin.Unit { /* compiled code */ }

    public open fun moveToVolumeBatchable(volumePercent: kotlin.UByte): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun volumeStepBatchable(stepMode: com.google.home.google.VolumeTrait.VolumeStepModeEnum, step: kotlin.UByte): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun muteBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun unmuteBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}
