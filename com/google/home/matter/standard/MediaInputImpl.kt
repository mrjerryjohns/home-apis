// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class MediaInputImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.MediaInputTrait.Attributes) : com.google.home.matter.standard.MediaInput, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.MediaInputTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.MediaInputTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val currentInput: kotlin.UByte? /* compiled code */

    public open val featureMap: com.google.home.matter.standard.MediaInputTrait.Feature /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val inputList: kotlin.collections.List<com.google.home.matter.standard.MediaInputTrait.InputInfoStruct>? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.MediaInput.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.matter.standard.MediaInput.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun selectInput(index: kotlin.UByte): kotlin.Unit { /* compiled code */ }

    public open suspend fun showInputStatus(): kotlin.Unit { /* compiled code */ }

    public open suspend fun hideInputStatus(): kotlin.Unit { /* compiled code */ }

    public open suspend fun renameInput(index: kotlin.UByte, name: kotlin.String): kotlin.Unit { /* compiled code */ }

    public open fun selectInputBatchable(index: kotlin.UByte): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun showInputStatusBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun hideInputStatusBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun renameInputBatchable(index: kotlin.UByte, name: kotlin.String): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}
