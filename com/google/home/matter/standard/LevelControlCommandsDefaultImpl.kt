// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface LevelControlCommandsDefaultImpl : com.google.home.matter.standard.LevelControlCommands {
    public open suspend fun moveToLevel(level: kotlin.UByte, transitionTime: kotlin.UShort?, optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): kotlin.Unit { /* compiled code */ }

    public open suspend fun move(moveMode: com.google.home.matter.standard.LevelControlTrait.MoveModeEnum, rate: kotlin.UByte?, optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): kotlin.Unit { /* compiled code */ }

    public open suspend fun step(stepMode: com.google.home.matter.standard.LevelControlTrait.StepModeEnum, stepSize: kotlin.UByte, transitionTime: kotlin.UShort?, optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): kotlin.Unit { /* compiled code */ }

    public open suspend fun stop(optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): kotlin.Unit { /* compiled code */ }

    public open suspend fun moveToLevelWithOnOff(level: kotlin.UByte, transitionTime: kotlin.UShort?, optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): kotlin.Unit { /* compiled code */ }

    public open suspend fun moveWithOnOff(moveMode: com.google.home.matter.standard.LevelControlTrait.MoveModeEnum, rate: kotlin.UByte?, optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): kotlin.Unit { /* compiled code */ }

    public open suspend fun stepWithOnOff(stepMode: com.google.home.matter.standard.LevelControlTrait.StepModeEnum, stepSize: kotlin.UByte, transitionTime: kotlin.UShort?, optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): kotlin.Unit { /* compiled code */ }

    public open suspend fun stopWithOnOff(optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): kotlin.Unit { /* compiled code */ }

    public open suspend fun moveToClosestFrequency(frequency: kotlin.UShort): kotlin.Unit { /* compiled code */ }

    public open fun moveToLevelBatchable(level: kotlin.UByte, transitionTime: kotlin.UShort?, optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun moveBatchable(moveMode: com.google.home.matter.standard.LevelControlTrait.MoveModeEnum, rate: kotlin.UByte?, optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun stepBatchable(stepMode: com.google.home.matter.standard.LevelControlTrait.StepModeEnum, stepSize: kotlin.UByte, transitionTime: kotlin.UShort?, optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun stopBatchable(optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun moveToLevelWithOnOffBatchable(level: kotlin.UByte, transitionTime: kotlin.UShort?, optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun moveWithOnOffBatchable(moveMode: com.google.home.matter.standard.LevelControlTrait.MoveModeEnum, rate: kotlin.UByte?, optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun stepWithOnOffBatchable(stepMode: com.google.home.matter.standard.LevelControlTrait.StepModeEnum, stepSize: kotlin.UByte, transitionTime: kotlin.UShort?, optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun stopWithOnOffBatchable(optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun moveToClosestFrequencyBatchable(frequency: kotlin.UShort): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}

