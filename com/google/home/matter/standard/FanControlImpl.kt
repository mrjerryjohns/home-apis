// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class FanControlImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.FanControlTrait.Attributes) : com.google.home.matter.standard.FanControl, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.FanControlTrait.Attributes, com.google.home.Updatable<com.google.home.matter.standard.FanControl, com.google.home.matter.standard.FanControlTrait.MutableAttributes> {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.FanControlTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val airflowDirection: com.google.home.matter.standard.FanControlTrait.AirflowDirectionEnum? /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val fanMode: com.google.home.matter.standard.FanControlTrait.FanModeEnum? /* compiled code */

    public open val fanModeSequence: com.google.home.matter.standard.FanControlTrait.FanModeSequenceEnum? /* compiled code */

    public open val featureMap: com.google.home.matter.standard.FanControlTrait.Feature /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val percentCurrent: kotlin.UByte? /* compiled code */

    public open val percentSetting: kotlin.UByte? /* compiled code */

    public open val rockSetting: com.google.home.matter.standard.FanControlTrait.RockBitmap? /* compiled code */

    public open val rockSupport: com.google.home.matter.standard.FanControlTrait.RockBitmap? /* compiled code */

    public open val speedCurrent: kotlin.UByte? /* compiled code */

    public open val speedMax: kotlin.UByte? /* compiled code */

    public open val speedSetting: kotlin.UByte? /* compiled code */

    public open val windSetting: com.google.home.matter.standard.FanControlTrait.WindBitmap? /* compiled code */

    public open val windSupport: com.google.home.matter.standard.FanControlTrait.WindBitmap? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.FanControl.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.matter.standard.FanControl.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun step(direction: com.google.home.matter.standard.FanControlTrait.StepDirectionEnum, optionalArgs: com.google.home.matter.standard.FanControlTrait.StepCommand.OptionalArgs.() -> kotlin.Unit): kotlin.Unit { /* compiled code */ }

    public open suspend fun update(optimisticReturn: (com.google.home.matter.standard.FanControl) -> kotlin.Unit, init: com.google.home.matter.standard.FanControlTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.FanControl { /* compiled code */ }

    public open fun stepBatchable(direction: com.google.home.matter.standard.FanControlTrait.StepDirectionEnum, optionalArgs: com.google.home.matter.standard.FanControlTrait.StepCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

