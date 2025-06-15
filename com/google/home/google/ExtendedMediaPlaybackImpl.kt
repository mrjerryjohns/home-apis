// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class ExtendedMediaPlaybackImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.google.ExtendedMediaPlaybackTrait.Attributes) : com.google.home.google.ExtendedMediaPlayback, com.google.home.matter.MatterTraitImpl, com.google.home.google.ExtendedMediaPlaybackTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.google.ExtendedMediaPlaybackTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val extendedCurrentState: com.google.home.google.ExtendedMediaPlaybackTrait.ExtendedPlaybackState? /* compiled code */

    public open val featureMap: kotlin.UInt /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.google.ExtendedMediaPlayback.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.google.ExtendedMediaPlayback.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun closedCaptioningOff(): kotlin.Unit { /* compiled code */ }

    public open suspend fun closedCaptioningOn(userQueryLanguage: kotlin.String, closedCaptioningLanguage: kotlin.String): kotlin.Unit { /* compiled code */ }

    public open suspend fun setRepeat(isOn: kotlin.Boolean, isSingle: kotlin.Boolean): kotlin.Unit { /* compiled code */ }

    public open suspend fun shuffle(): kotlin.Unit { /* compiled code */ }

    public open fun closedCaptioningOffBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun closedCaptioningOnBatchable(userQueryLanguage: kotlin.String, closedCaptioningLanguage: kotlin.String): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun setRepeatBatchable(isOn: kotlin.Boolean, isSingle: kotlin.Boolean): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun shuffleBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

