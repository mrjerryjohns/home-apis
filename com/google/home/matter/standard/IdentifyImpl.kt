// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class IdentifyImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.IdentifyTrait.Attributes) : com.google.home.matter.standard.Identify, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.IdentifyTrait.Attributes, com.google.home.Updatable<com.google.home.matter.standard.Identify, com.google.home.matter.standard.IdentifyTrait.MutableAttributes> {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.IdentifyTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val featureMap: kotlin.UInt /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val identifyTime: kotlin.UShort? /* compiled code */

    public open val identifyType: com.google.home.matter.standard.IdentifyTrait.IdentifyTypeEnum? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.Identify.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.matter.standard.Identify.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun identify(identifyTime: kotlin.UShort): kotlin.Unit { /* compiled code */ }

    public open suspend fun triggerEffect(effectIdentifier: com.google.home.matter.standard.IdentifyTrait.EffectIdentifierEnum, effectVariant: com.google.home.matter.standard.IdentifyTrait.EffectVariantEnum): kotlin.Unit { /* compiled code */ }

    public open suspend fun update(optimisticReturn: (com.google.home.matter.standard.Identify) -> kotlin.Unit, init: com.google.home.matter.standard.IdentifyTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.Identify { /* compiled code */ }

    public open fun identifyBatchable(identifyTime: kotlin.UShort): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun triggerEffectBatchable(effectIdentifier: com.google.home.matter.standard.IdentifyTrait.EffectIdentifierEnum, effectVariant: com.google.home.matter.standard.IdentifyTrait.EffectVariantEnum): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

