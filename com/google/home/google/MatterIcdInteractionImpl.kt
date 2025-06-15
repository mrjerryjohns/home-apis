// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class MatterIcdInteractionImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.google.MatterIcdInteractionTrait.Attributes) : com.google.home.google.MatterIcdInteraction, com.google.home.matter.MatterTraitImpl, com.google.home.google.MatterIcdInteractionTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.google.MatterIcdInteractionTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val featureMap: kotlin.UInt /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val state: com.google.home.google.MatterIcdInteractionTrait.LitState? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.google.MatterIcdInteraction.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.google.MatterIcdInteraction.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun stayActive(extendActiveOnAnyInteraction: kotlin.Boolean, durationSeconds: kotlin.UInt): kotlin.Unit { /* compiled code */ }

    public open fun stayActiveBatchable(extendActiveOnAnyInteraction: kotlin.Boolean, durationSeconds: kotlin.UInt): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

