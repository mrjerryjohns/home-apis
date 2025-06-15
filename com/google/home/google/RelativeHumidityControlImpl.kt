// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class RelativeHumidityControlImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.google.RelativeHumidityControlTrait.Attributes) : com.google.home.google.RelativeHumidityControl, com.google.home.matter.MatterTraitImpl, com.google.home.google.RelativeHumidityControlTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.google.RelativeHumidityControlTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val featureMap: kotlin.UInt /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val maxRelativeHumidity: kotlin.UInt? /* compiled code */

    public open val minRelativeHumidity: kotlin.UInt? /* compiled code */

    public open val relativeHumiditySetpoint: kotlin.UInt? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.google.RelativeHumidityControl.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.google.RelativeHumidityControl.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun setRelativeHumidity(humidity: kotlin.UInt): kotlin.Unit { /* compiled code */ }

    public open suspend fun stepRelativeHumidity(relativeHumidityPercent: kotlin.UInt, relativeHumidityWeight: kotlin.UInt, stepMode: com.google.home.google.RelativeHumidityControlTrait.StepMode): kotlin.Unit { /* compiled code */ }

    public open fun setRelativeHumidityBatchable(humidity: kotlin.UInt): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun stepRelativeHumidityBatchable(relativeHumidityPercent: kotlin.UInt, relativeHumidityWeight: kotlin.UInt, stepMode: com.google.home.google.RelativeHumidityControlTrait.StepMode): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}
