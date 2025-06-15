// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class ColorControlImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.ColorControlTrait.Attributes) : com.google.home.matter.standard.ColorControl, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.ColorControlTrait.Attributes, com.google.home.Updatable<com.google.home.matter.standard.ColorControl, com.google.home.matter.standard.ColorControlTrait.MutableAttributes> {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.ColorControlTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val colorCapabilities: com.google.home.matter.standard.ColorControlTrait.ColorCapabilitiesBitmap? /* compiled code */

    public open val colorLoopActive: kotlin.UByte? /* compiled code */

    public open val colorLoopDirection: kotlin.UByte? /* compiled code */

    public open val colorLoopStartEnhancedHue: kotlin.UShort? /* compiled code */

    public open val colorLoopStoredEnhancedHue: kotlin.UShort? /* compiled code */

    public open val colorLoopTime: kotlin.UShort? /* compiled code */

    public open val colorMode: com.google.home.matter.standard.ColorControlTrait.ColorModeEnum? /* compiled code */

    public open val colorPointBIntensity: kotlin.UByte? /* compiled code */

    public open val colorPointBx: kotlin.UShort? /* compiled code */

    public open val colorPointBy: kotlin.UShort? /* compiled code */

    public open val colorPointGIntensity: kotlin.UByte? /* compiled code */

    public open val colorPointGx: kotlin.UShort? /* compiled code */

    public open val colorPointGy: kotlin.UShort? /* compiled code */

    public open val colorPointRIntensity: kotlin.UByte? /* compiled code */

    public open val colorPointRx: kotlin.UShort? /* compiled code */

    public open val colorPointRy: kotlin.UShort? /* compiled code */

    public open val colorTempPhysicalMaxMireds: kotlin.UShort? /* compiled code */

    public open val colorTempPhysicalMinMireds: kotlin.UShort? /* compiled code */

    public open val colorTemperatureMireds: kotlin.UShort? /* compiled code */

    public open val compensationText: kotlin.String? /* compiled code */

    public open val coupleColorTempToLevelMinMireds: kotlin.UShort? /* compiled code */

    public open val currentHue: kotlin.UByte? /* compiled code */

    public open val currentSaturation: kotlin.UByte? /* compiled code */

    public open val currentX: kotlin.UShort? /* compiled code */

    public open val currentY: kotlin.UShort? /* compiled code */

    public open val driftCompensation: com.google.home.matter.standard.ColorControlTrait.DriftCompensationEnum? /* compiled code */

    public open val enhancedColorMode: com.google.home.matter.standard.ColorControlTrait.EnhancedColorModeEnum? /* compiled code */

    public open val enhancedCurrentHue: kotlin.UShort? /* compiled code */

    public open val featureMap: com.google.home.matter.standard.ColorControlTrait.Feature /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val numberOfPrimaries: kotlin.UByte? /* compiled code */

    public open val options: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap? /* compiled code */

    public open val primary1Intensity: kotlin.UByte? /* compiled code */

    public open val primary1X: kotlin.UShort? /* compiled code */

    public open val primary1Y: kotlin.UShort? /* compiled code */

    public open val primary2Intensity: kotlin.UByte? /* compiled code */

    public open val primary2X: kotlin.UShort? /* compiled code */

    public open val primary2Y: kotlin.UShort? /* compiled code */

    public open val primary3Intensity: kotlin.UByte? /* compiled code */

    public open val primary3X: kotlin.UShort? /* compiled code */

    public open val primary3Y: kotlin.UShort? /* compiled code */

    public open val primary4Intensity: kotlin.UByte? /* compiled code */

    public open val primary4X: kotlin.UShort? /* compiled code */

    public open val primary4Y: kotlin.UShort? /* compiled code */

    public open val primary5Intensity: kotlin.UByte? /* compiled code */

    public open val primary5X: kotlin.UShort? /* compiled code */

    public open val primary5Y: kotlin.UShort? /* compiled code */

    public open val primary6Intensity: kotlin.UByte? /* compiled code */

    public open val primary6X: kotlin.UShort? /* compiled code */

    public open val primary6Y: kotlin.UShort? /* compiled code */

    public open val remainingTime: kotlin.UShort? /* compiled code */

    public open val startUpColorTemperatureMireds: kotlin.UShort? /* compiled code */

    public open val whitePointX: kotlin.UShort? /* compiled code */

    public open val whitePointY: kotlin.UShort? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.ColorControl.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.matter.standard.ColorControl.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun moveToHue(hue: kotlin.UByte, direction: com.google.home.matter.standard.ColorControlTrait.DirectionEnum, transitionTime: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): kotlin.Unit { /* compiled code */ }

    public open suspend fun moveHue(moveMode: com.google.home.matter.standard.ColorControlTrait.MoveModeEnum, rate: kotlin.UByte, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): kotlin.Unit { /* compiled code */ }

    public open suspend fun stepHue(stepMode: com.google.home.matter.standard.ColorControlTrait.StepModeEnum, stepSize: kotlin.UByte, transitionTime: kotlin.UByte, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): kotlin.Unit { /* compiled code */ }

    public open suspend fun moveToSaturation(saturation: kotlin.UByte, transitionTime: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): kotlin.Unit { /* compiled code */ }

    public open suspend fun moveSaturation(moveMode: com.google.home.matter.standard.ColorControlTrait.MoveModeEnum, rate: kotlin.UByte, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): kotlin.Unit { /* compiled code */ }

    public open suspend fun stepSaturation(stepMode: com.google.home.matter.standard.ColorControlTrait.StepModeEnum, stepSize: kotlin.UByte, transitionTime: kotlin.UByte, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): kotlin.Unit { /* compiled code */ }

    public open suspend fun moveToHueAndSaturation(hue: kotlin.UByte, saturation: kotlin.UByte, transitionTime: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): kotlin.Unit { /* compiled code */ }

    public open suspend fun moveToColor(colorX: kotlin.UShort, colorY: kotlin.UShort, transitionTime: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): kotlin.Unit { /* compiled code */ }

    public open suspend fun moveColor(rateX: kotlin.Short, rateY: kotlin.Short, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): kotlin.Unit { /* compiled code */ }

    public open suspend fun stepColor(stepX: kotlin.Short, stepY: kotlin.Short, transitionTime: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): kotlin.Unit { /* compiled code */ }

    public open suspend fun moveToColorTemperature(colorTemperatureMireds: kotlin.UShort, transitionTime: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): kotlin.Unit { /* compiled code */ }

    public open suspend fun enhancedMoveToHue(enhancedHue: kotlin.UShort, direction: com.google.home.matter.standard.ColorControlTrait.DirectionEnum, transitionTime: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): kotlin.Unit { /* compiled code */ }

    public open suspend fun enhancedMoveHue(moveMode: com.google.home.matter.standard.ColorControlTrait.MoveModeEnum, rate: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): kotlin.Unit { /* compiled code */ }

    public open suspend fun enhancedStepHue(stepMode: com.google.home.matter.standard.ColorControlTrait.StepModeEnum, stepSize: kotlin.UShort, transitionTime: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): kotlin.Unit { /* compiled code */ }

    public open suspend fun enhancedMoveToHueAndSaturation(enhancedHue: kotlin.UShort, saturation: kotlin.UByte, transitionTime: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): kotlin.Unit { /* compiled code */ }

    public open suspend fun colorLoopSet(updateFlags: com.google.home.matter.standard.ColorControlTrait.UpdateFlagsBitmap, action: com.google.home.matter.standard.ColorControlTrait.ColorLoopActionEnum, direction: com.google.home.matter.standard.ColorControlTrait.ColorLoopDirectionEnum, time: kotlin.UShort, startHue: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): kotlin.Unit { /* compiled code */ }

    public open suspend fun stopMoveStep(optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): kotlin.Unit { /* compiled code */ }

    public open suspend fun moveColorTemperature(moveMode: com.google.home.matter.standard.ColorControlTrait.MoveModeEnum, rate: kotlin.UShort, colorTemperatureMinimumMireds: kotlin.UShort, colorTemperatureMaximumMireds: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): kotlin.Unit { /* compiled code */ }

    public open suspend fun stepColorTemperature(stepMode: com.google.home.matter.standard.ColorControlTrait.StepModeEnum, stepSize: kotlin.UShort, transitionTime: kotlin.UShort, colorTemperatureMinimumMireds: kotlin.UShort, colorTemperatureMaximumMireds: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): kotlin.Unit { /* compiled code */ }

    public open suspend fun update(optimisticReturn: (com.google.home.matter.standard.ColorControl) -> kotlin.Unit, init: com.google.home.matter.standard.ColorControlTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.ColorControl { /* compiled code */ }

    public open fun moveToHueBatchable(hue: kotlin.UByte, direction: com.google.home.matter.standard.ColorControlTrait.DirectionEnum, transitionTime: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun moveHueBatchable(moveMode: com.google.home.matter.standard.ColorControlTrait.MoveModeEnum, rate: kotlin.UByte, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun stepHueBatchable(stepMode: com.google.home.matter.standard.ColorControlTrait.StepModeEnum, stepSize: kotlin.UByte, transitionTime: kotlin.UByte, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun moveToSaturationBatchable(saturation: kotlin.UByte, transitionTime: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun moveSaturationBatchable(moveMode: com.google.home.matter.standard.ColorControlTrait.MoveModeEnum, rate: kotlin.UByte, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun stepSaturationBatchable(stepMode: com.google.home.matter.standard.ColorControlTrait.StepModeEnum, stepSize: kotlin.UByte, transitionTime: kotlin.UByte, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun moveToHueAndSaturationBatchable(hue: kotlin.UByte, saturation: kotlin.UByte, transitionTime: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun moveToColorBatchable(colorX: kotlin.UShort, colorY: kotlin.UShort, transitionTime: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun moveColorBatchable(rateX: kotlin.Short, rateY: kotlin.Short, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun stepColorBatchable(stepX: kotlin.Short, stepY: kotlin.Short, transitionTime: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun moveToColorTemperatureBatchable(colorTemperatureMireds: kotlin.UShort, transitionTime: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun enhancedMoveToHueBatchable(enhancedHue: kotlin.UShort, direction: com.google.home.matter.standard.ColorControlTrait.DirectionEnum, transitionTime: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun enhancedMoveHueBatchable(moveMode: com.google.home.matter.standard.ColorControlTrait.MoveModeEnum, rate: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun enhancedStepHueBatchable(stepMode: com.google.home.matter.standard.ColorControlTrait.StepModeEnum, stepSize: kotlin.UShort, transitionTime: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun enhancedMoveToHueAndSaturationBatchable(enhancedHue: kotlin.UShort, saturation: kotlin.UByte, transitionTime: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun colorLoopSetBatchable(updateFlags: com.google.home.matter.standard.ColorControlTrait.UpdateFlagsBitmap, action: com.google.home.matter.standard.ColorControlTrait.ColorLoopActionEnum, direction: com.google.home.matter.standard.ColorControlTrait.ColorLoopDirectionEnum, time: kotlin.UShort, startHue: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun stopMoveStepBatchable(optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun moveColorTemperatureBatchable(moveMode: com.google.home.matter.standard.ColorControlTrait.MoveModeEnum, rate: kotlin.UShort, colorTemperatureMinimumMireds: kotlin.UShort, colorTemperatureMaximumMireds: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun stepColorTemperatureBatchable(stepMode: com.google.home.matter.standard.ColorControlTrait.StepModeEnum, stepSize: kotlin.UShort, transitionTime: kotlin.UShort, colorTemperatureMinimumMireds: kotlin.UShort, colorTemperatureMaximumMireds: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}
