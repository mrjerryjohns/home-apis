// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class TemperatureControlImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.TemperatureControlTrait.Attributes) : com.google.home.matter.standard.TemperatureControl, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.TemperatureControlTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.TemperatureControlTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val featureMap: com.google.home.matter.standard.TemperatureControlTrait.Feature /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val maxTemperature: kotlin.Short? /* compiled code */

    public open val minTemperature: kotlin.Short? /* compiled code */

    public open val selectedTemperatureLevel: kotlin.UByte? /* compiled code */

    public open val step: kotlin.Short? /* compiled code */

    public open val supportedTemperatureLevels: kotlin.collections.List<kotlin.String>? /* compiled code */

    public open val temperatureSetpoint: kotlin.Short? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.TemperatureControl.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.matter.standard.TemperatureControl.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun setTemperature(optionalArgs: com.google.home.matter.standard.TemperatureControlTrait.SetTemperatureCommand.OptionalArgs.() -> kotlin.Unit): kotlin.Unit { /* compiled code */ }

    public open fun setTemperatureBatchable(optionalArgs: com.google.home.matter.standard.TemperatureControlTrait.SetTemperatureCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}
