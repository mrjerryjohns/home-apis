// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class OnOffImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.OnOffTrait.Attributes) : com.google.home.matter.standard.OnOff, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.OnOffTrait.Attributes, com.google.home.Updatable<com.google.home.matter.standard.OnOff, com.google.home.matter.standard.OnOffTrait.MutableAttributes> {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.OnOffTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val featureMap: com.google.home.matter.standard.OnOffTrait.Feature /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val globalSceneControl: kotlin.Boolean? /* compiled code */

    public open val offWaitTime: kotlin.UShort? /* compiled code */

    public open val onOff: kotlin.Boolean? /* compiled code */

    public open val onTime: kotlin.UShort? /* compiled code */

    public open val startUpOnOff: com.google.home.matter.standard.OnOffTrait.StartUpOnOffEnum? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.OnOff.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.matter.standard.OnOff.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun off(): kotlin.Unit { /* compiled code */ }

    public open suspend fun on(): kotlin.Unit { /* compiled code */ }

    public open suspend fun toggle(): kotlin.Unit { /* compiled code */ }

    public open suspend fun offWithEffect(effectIdentifier: com.google.home.matter.standard.OnOffTrait.EffectIdentifierEnum, effectVariant: kotlin.UByte): kotlin.Unit { /* compiled code */ }

    public open suspend fun onWithRecallGlobalScene(): kotlin.Unit { /* compiled code */ }

    public open suspend fun onWithTimedOff(onOffControl: com.google.home.matter.standard.OnOffTrait.OnOffControlBitmap, onTime: kotlin.UShort, offWaitTime: kotlin.UShort): kotlin.Unit { /* compiled code */ }

    public open suspend fun update(optimisticReturn: (com.google.home.matter.standard.OnOff) -> kotlin.Unit, init: com.google.home.matter.standard.OnOffTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.OnOff { /* compiled code */ }

    public open fun offBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun onBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toggleBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun offWithEffectBatchable(effectIdentifier: com.google.home.matter.standard.OnOffTrait.EffectIdentifierEnum, effectVariant: kotlin.UByte): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun onWithRecallGlobalSceneBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun onWithTimedOffBatchable(onOffControl: com.google.home.matter.standard.OnOffTrait.OnOffControlBitmap, onTime: kotlin.UShort, offWaitTime: kotlin.UShort): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

