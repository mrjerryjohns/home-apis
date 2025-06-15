// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class ExtendedMediaInputImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.google.ExtendedMediaInputTrait.Attributes) : com.google.home.google.ExtendedMediaInput, com.google.home.matter.MatterTraitImpl, com.google.home.google.ExtendedMediaInputTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.google.ExtendedMediaInputTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val currentCustomInput: kotlin.String? /* compiled code */

    public open val customInputsList: kotlin.collections.List<com.google.home.google.ExtendedMediaInputTrait.AvailableInput>? /* compiled code */

    public open val customInputsOrdered: kotlin.Boolean? /* compiled code */

    public open val featureMap: kotlin.UInt /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.google.ExtendedMediaInput.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.google.ExtendedMediaInput.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun selectCustomInput(newInput: kotlin.String): kotlin.Unit { /* compiled code */ }

    public open suspend fun previousInput(): kotlin.Unit { /* compiled code */ }

    public open suspend fun nextInput(): kotlin.Unit { /* compiled code */ }

    public open fun selectCustomInputBatchable(newInput: kotlin.String): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun previousInputBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun nextInputBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

