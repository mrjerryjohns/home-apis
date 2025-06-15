// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class ExtendedFanControlImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.google.ExtendedFanControlTrait.Attributes) : com.google.home.google.ExtendedFanControl, com.google.home.matter.MatterTraitImpl, com.google.home.google.ExtendedFanControlTrait.Attributes, com.google.home.Updatable<com.google.home.google.ExtendedFanControl, com.google.home.google.ExtendedFanControlTrait.MutableAttributes> {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.google.ExtendedFanControlTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val customFanMode: kotlin.String? /* compiled code */

    public open val customFanModes: com.google.home.google.ExtendedFanControlTrait.AvailableFanSpeeds? /* compiled code */

    public open val featureMap: kotlin.UInt /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.google.ExtendedFanControl.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.google.ExtendedFanControl.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun extendedStep(fanSpeedRelativeWeight: kotlin.Long, direction: com.google.home.google.ExtendedFanControlTrait.StepDirection): kotlin.Unit { /* compiled code */ }

    public open suspend fun toggleAirflowDirection(): kotlin.Unit { /* compiled code */ }

    public open suspend fun update(optimisticReturn: (com.google.home.google.ExtendedFanControl) -> kotlin.Unit, init: com.google.home.google.ExtendedFanControlTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.google.ExtendedFanControl { /* compiled code */ }

    public open fun extendedStepBatchable(fanSpeedRelativeWeight: kotlin.Long, direction: com.google.home.google.ExtendedFanControlTrait.StepDirection): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toggleAirflowDirectionBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

