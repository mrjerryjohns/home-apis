// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class DispenseImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.google.DispenseTrait.Attributes) : com.google.home.google.Dispense, com.google.home.matter.MatterTraitImpl, com.google.home.google.DispenseTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.google.DispenseTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val dispenseItems: kotlin.collections.List<com.google.home.google.DispenseTrait.DispenseItem>? /* compiled code */

    public open val featureMap: kotlin.UInt /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val supportedDispenseItems: kotlin.collections.List<com.google.home.google.DispenseTrait.DispensableItem>? /* compiled code */

    public open val supportedDispensePresets: kotlin.collections.List<com.google.home.google.DispenseTrait.Preset>? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.google.Dispense.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.google.Dispense.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun dispense(item: kotlin.String, amount: kotlin.Float, unit: com.google.home.google.DispenseTrait.Unit, presetName: kotlin.String): com.google.home.google.DispenseTrait.DispenseCommand.Response { /* compiled code */ }

    public open fun dispenseBatchable(item: kotlin.String, amount: kotlin.Float, unit: com.google.home.google.DispenseTrait.Unit, presetName: kotlin.String): com.google.home.BatchableCommand<com.google.home.google.DispenseTrait.DispenseCommand.Response> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}
