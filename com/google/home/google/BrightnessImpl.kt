// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class BrightnessImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.google.BrightnessTrait.Attributes) : com.google.home.google.Brightness, com.google.home.matter.MatterTraitImpl, com.google.home.google.BrightnessTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.google.BrightnessTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val currentBrightnessPercent: kotlin.UByte? /* compiled code */

    public open val featureMap: kotlin.UInt /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.google.Brightness.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.google.Brightness.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun moveToBrightness(brightnessPercent: kotlin.UByte): kotlin.Unit { /* compiled code */ }

    public open suspend fun brightnessStep(stepMode: com.google.home.google.BrightnessTrait.BrightnessStepModeEnum, step: kotlin.UByte): kotlin.Unit { /* compiled code */ }

    public open fun moveToBrightnessBatchable(brightnessPercent: kotlin.UByte): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun brightnessStepBatchable(stepMode: com.google.home.google.BrightnessTrait.BrightnessStepModeEnum, step: kotlin.UByte): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}
