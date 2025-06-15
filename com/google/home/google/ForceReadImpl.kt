// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class ForceReadImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.google.ForceReadTrait.Attributes) : com.google.home.google.ForceRead, com.google.home.matter.MatterTraitImpl, com.google.home.google.ForceReadTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.google.ForceReadTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val featureMap: kotlin.UInt /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.google.ForceRead.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.google.ForceRead.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun forceReadCommand(trait_id: kotlin.String): com.google.home.google.ForceReadTrait.ForceReadCommandCommand.Response { /* compiled code */ }

    public open fun forceReadCommandBatchable(trait_id: kotlin.String): com.google.home.BatchableCommand<com.google.home.google.ForceReadTrait.ForceReadCommandCommand.Response> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}
