// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class MicrowaveOvenControlImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.MicrowaveOvenControlTrait.Attributes) : com.google.home.matter.standard.MicrowaveOvenControl, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.MicrowaveOvenControlTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.MicrowaveOvenControlTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val cookTime: kotlin.UInt? /* compiled code */

    public open val featureMap: com.google.home.matter.standard.MicrowaveOvenControlTrait.Feature /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val maxCookTime: kotlin.UInt? /* compiled code */

    public open val maxPower: kotlin.UByte? /* compiled code */

    public open val minPower: kotlin.UByte? /* compiled code */

    public open val powerSetting: kotlin.UByte? /* compiled code */

    public open val powerStep: kotlin.UByte? /* compiled code */

    public open val selectedWattIndex: kotlin.UByte? /* compiled code */

    public open val supportedWatts: kotlin.collections.List<kotlin.UShort>? /* compiled code */

    public open val wattRating: kotlin.UShort? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.MicrowaveOvenControl.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.matter.standard.MicrowaveOvenControl.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun setCookingParameters(optionalArgs: com.google.home.matter.standard.MicrowaveOvenControlTrait.SetCookingParametersCommand.OptionalArgs.() -> kotlin.Unit): kotlin.Unit { /* compiled code */ }

    public open suspend fun addMoreTime(timeToAdd: kotlin.UInt): kotlin.Unit { /* compiled code */ }

    public open fun setCookingParametersBatchable(optionalArgs: com.google.home.matter.standard.MicrowaveOvenControlTrait.SetCookingParametersCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun addMoreTimeBatchable(timeToAdd: kotlin.UInt): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

