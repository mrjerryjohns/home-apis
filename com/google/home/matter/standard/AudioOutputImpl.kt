// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class AudioOutputImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.AudioOutputTrait.Attributes) : com.google.home.matter.standard.AudioOutput, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.AudioOutputTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.AudioOutputTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val currentOutput: kotlin.UByte? /* compiled code */

    public open val featureMap: com.google.home.matter.standard.AudioOutputTrait.Feature /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val outputList: kotlin.collections.List<com.google.home.matter.standard.AudioOutputTrait.OutputInfoStruct>? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.AudioOutput.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.matter.standard.AudioOutput.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun selectOutput(index: kotlin.UByte): kotlin.Unit { /* compiled code */ }

    public open suspend fun renameOutput(index: kotlin.UByte, name: kotlin.String): kotlin.Unit { /* compiled code */ }

    public open fun selectOutputBatchable(index: kotlin.UByte): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun renameOutputBatchable(index: kotlin.UByte, name: kotlin.String): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

