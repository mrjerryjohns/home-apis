// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class SampleMeiImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.SampleMeiTrait.Attributes) : com.google.home.matter.standard.SampleMei, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.SampleMeiTrait.Attributes, com.google.home.Updatable<com.google.home.matter.standard.SampleMei, com.google.home.matter.standard.SampleMeiTrait.MutableAttributes> {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.SampleMeiTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val featureMap: kotlin.UInt /* compiled code */

    public open val flipFlop: kotlin.Boolean? /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.SampleMei.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.matter.standard.SampleMei.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun ping(): kotlin.Unit { /* compiled code */ }

    public open suspend fun addArguments(arg1: kotlin.UByte, arg2: kotlin.UByte): com.google.home.matter.standard.SampleMeiTrait.AddArgumentsCommand.Response { /* compiled code */ }

    public open suspend fun update(optimisticReturn: (com.google.home.matter.standard.SampleMei) -> kotlin.Unit, init: com.google.home.matter.standard.SampleMeiTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.SampleMei { /* compiled code */ }

    public open fun pingBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun addArgumentsBatchable(arg1: kotlin.UByte, arg2: kotlin.UByte): com.google.home.BatchableCommand<com.google.home.matter.standard.SampleMeiTrait.AddArgumentsCommand.Response> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}
