// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class PumpConfigurationAndControlImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.PumpConfigurationAndControlTrait.Attributes) : com.google.home.matter.standard.PumpConfigurationAndControl, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.PumpConfigurationAndControlTrait.Attributes, com.google.home.Updatable<com.google.home.matter.standard.PumpConfigurationAndControl, com.google.home.matter.standard.PumpConfigurationAndControlTrait.MutableAttributes> {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.PumpConfigurationAndControlTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val capacity: kotlin.Short? /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val controlMode: com.google.home.matter.standard.PumpConfigurationAndControlTrait.ControlModeEnum? /* compiled code */

    public open val effectiveControlMode: com.google.home.matter.standard.PumpConfigurationAndControlTrait.ControlModeEnum? /* compiled code */

    public open val effectiveOperationMode: com.google.home.matter.standard.PumpConfigurationAndControlTrait.OperationModeEnum? /* compiled code */

    public open val featureMap: com.google.home.matter.standard.PumpConfigurationAndControlTrait.Feature /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val lifetimeEnergyConsumed: kotlin.UInt? /* compiled code */

    public open val lifetimeRunningHours: kotlin.UInt? /* compiled code */

    public open val maxCompPressure: kotlin.Short? /* compiled code */

    public open val maxConstFlow: kotlin.UShort? /* compiled code */

    public open val maxConstPressure: kotlin.Short? /* compiled code */

    public open val maxConstSpeed: kotlin.UShort? /* compiled code */

    public open val maxConstTemp: kotlin.Short? /* compiled code */

    public open val maxFlow: kotlin.UShort? /* compiled code */

    public open val maxPressure: kotlin.Short? /* compiled code */

    public open val maxSpeed: kotlin.UShort? /* compiled code */

    public open val minCompPressure: kotlin.Short? /* compiled code */

    public open val minConstFlow: kotlin.UShort? /* compiled code */

    public open val minConstPressure: kotlin.Short? /* compiled code */

    public open val minConstSpeed: kotlin.UShort? /* compiled code */

    public open val minConstTemp: kotlin.Short? /* compiled code */

    public open val operationMode: com.google.home.matter.standard.PumpConfigurationAndControlTrait.OperationModeEnum? /* compiled code */

    public open val power: kotlin.UInt? /* compiled code */

    public open val pumpStatus: com.google.home.matter.standard.PumpConfigurationAndControlTrait.PumpStatusBitmap? /* compiled code */

    public open val speed: kotlin.UShort? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.PumpConfigurationAndControl.Attribute): kotlin.Boolean { /* compiled code */ }

    public open suspend fun update(optimisticReturn: (com.google.home.matter.standard.PumpConfigurationAndControl) -> kotlin.Unit, init: com.google.home.matter.standard.PumpConfigurationAndControlTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.PumpConfigurationAndControl { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

