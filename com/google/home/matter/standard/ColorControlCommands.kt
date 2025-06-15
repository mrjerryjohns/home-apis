// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface ColorControlCommands {
    public abstract suspend fun moveToHue(hue: kotlin.UByte, direction: com.google.home.matter.standard.ColorControlTrait.DirectionEnum, transitionTime: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): kotlin.Unit

    public abstract suspend fun moveHue(moveMode: com.google.home.matter.standard.ColorControlTrait.MoveModeEnum, rate: kotlin.UByte, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): kotlin.Unit

    public abstract suspend fun stepHue(stepMode: com.google.home.matter.standard.ColorControlTrait.StepModeEnum, stepSize: kotlin.UByte, transitionTime: kotlin.UByte, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): kotlin.Unit

    public abstract suspend fun moveToSaturation(saturation: kotlin.UByte, transitionTime: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): kotlin.Unit

    public abstract suspend fun moveSaturation(moveMode: com.google.home.matter.standard.ColorControlTrait.MoveModeEnum, rate: kotlin.UByte, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): kotlin.Unit

    public abstract suspend fun stepSaturation(stepMode: com.google.home.matter.standard.ColorControlTrait.StepModeEnum, stepSize: kotlin.UByte, transitionTime: kotlin.UByte, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): kotlin.Unit

    public abstract suspend fun moveToHueAndSaturation(hue: kotlin.UByte, saturation: kotlin.UByte, transitionTime: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): kotlin.Unit

    public abstract suspend fun moveToColor(colorX: kotlin.UShort, colorY: kotlin.UShort, transitionTime: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): kotlin.Unit

    public abstract suspend fun moveColor(rateX: kotlin.Short, rateY: kotlin.Short, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): kotlin.Unit

    public abstract suspend fun stepColor(stepX: kotlin.Short, stepY: kotlin.Short, transitionTime: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): kotlin.Unit

    public abstract suspend fun moveToColorTemperature(colorTemperatureMireds: kotlin.UShort, transitionTime: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): kotlin.Unit

    public abstract suspend fun enhancedMoveToHue(enhancedHue: kotlin.UShort, direction: com.google.home.matter.standard.ColorControlTrait.DirectionEnum, transitionTime: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): kotlin.Unit

    public abstract suspend fun enhancedMoveHue(moveMode: com.google.home.matter.standard.ColorControlTrait.MoveModeEnum, rate: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): kotlin.Unit

    public abstract suspend fun enhancedStepHue(stepMode: com.google.home.matter.standard.ColorControlTrait.StepModeEnum, stepSize: kotlin.UShort, transitionTime: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): kotlin.Unit

    public abstract suspend fun enhancedMoveToHueAndSaturation(enhancedHue: kotlin.UShort, saturation: kotlin.UByte, transitionTime: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): kotlin.Unit

    public abstract suspend fun colorLoopSet(updateFlags: com.google.home.matter.standard.ColorControlTrait.UpdateFlagsBitmap, action: com.google.home.matter.standard.ColorControlTrait.ColorLoopActionEnum, direction: com.google.home.matter.standard.ColorControlTrait.ColorLoopDirectionEnum, time: kotlin.UShort, startHue: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): kotlin.Unit

    public abstract suspend fun stopMoveStep(optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): kotlin.Unit

    public abstract suspend fun moveColorTemperature(moveMode: com.google.home.matter.standard.ColorControlTrait.MoveModeEnum, rate: kotlin.UShort, colorTemperatureMinimumMireds: kotlin.UShort, colorTemperatureMaximumMireds: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): kotlin.Unit

    public abstract suspend fun stepColorTemperature(stepMode: com.google.home.matter.standard.ColorControlTrait.StepModeEnum, stepSize: kotlin.UShort, transitionTime: kotlin.UShort, colorTemperatureMinimumMireds: kotlin.UShort, colorTemperatureMaximumMireds: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): kotlin.Unit

    public abstract fun moveToHueBatchable(hue: kotlin.UByte, direction: com.google.home.matter.standard.ColorControlTrait.DirectionEnum, transitionTime: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun moveHueBatchable(moveMode: com.google.home.matter.standard.ColorControlTrait.MoveModeEnum, rate: kotlin.UByte, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun stepHueBatchable(stepMode: com.google.home.matter.standard.ColorControlTrait.StepModeEnum, stepSize: kotlin.UByte, transitionTime: kotlin.UByte, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun moveToSaturationBatchable(saturation: kotlin.UByte, transitionTime: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun moveSaturationBatchable(moveMode: com.google.home.matter.standard.ColorControlTrait.MoveModeEnum, rate: kotlin.UByte, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun stepSaturationBatchable(stepMode: com.google.home.matter.standard.ColorControlTrait.StepModeEnum, stepSize: kotlin.UByte, transitionTime: kotlin.UByte, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun moveToHueAndSaturationBatchable(hue: kotlin.UByte, saturation: kotlin.UByte, transitionTime: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun moveToColorBatchable(colorX: kotlin.UShort, colorY: kotlin.UShort, transitionTime: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun moveColorBatchable(rateX: kotlin.Short, rateY: kotlin.Short, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun stepColorBatchable(stepX: kotlin.Short, stepY: kotlin.Short, transitionTime: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun moveToColorTemperatureBatchable(colorTemperatureMireds: kotlin.UShort, transitionTime: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun enhancedMoveToHueBatchable(enhancedHue: kotlin.UShort, direction: com.google.home.matter.standard.ColorControlTrait.DirectionEnum, transitionTime: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun enhancedMoveHueBatchable(moveMode: com.google.home.matter.standard.ColorControlTrait.MoveModeEnum, rate: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun enhancedStepHueBatchable(stepMode: com.google.home.matter.standard.ColorControlTrait.StepModeEnum, stepSize: kotlin.UShort, transitionTime: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun enhancedMoveToHueAndSaturationBatchable(enhancedHue: kotlin.UShort, saturation: kotlin.UByte, transitionTime: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun colorLoopSetBatchable(updateFlags: com.google.home.matter.standard.ColorControlTrait.UpdateFlagsBitmap, action: com.google.home.matter.standard.ColorControlTrait.ColorLoopActionEnum, direction: com.google.home.matter.standard.ColorControlTrait.ColorLoopDirectionEnum, time: kotlin.UShort, startHue: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun stopMoveStepBatchable(optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun moveColorTemperatureBatchable(moveMode: com.google.home.matter.standard.ColorControlTrait.MoveModeEnum, rate: kotlin.UShort, colorTemperatureMinimumMireds: kotlin.UShort, colorTemperatureMaximumMireds: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun stepColorTemperatureBatchable(stepMode: com.google.home.matter.standard.ColorControlTrait.StepModeEnum, stepSize: kotlin.UShort, transitionTime: kotlin.UShort, colorTemperatureMinimumMireds: kotlin.UShort, colorTemperatureMaximumMireds: kotlin.UShort, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit>
}

