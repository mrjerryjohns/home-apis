// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface ColorControlCommandsDefaultImpl : com.google.home.matter.standard.ColorControlCommands {
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
}

