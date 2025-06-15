// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface LevelControlCommands {
    public abstract suspend fun moveToLevel(level: kotlin.UByte, transitionTime: kotlin.UShort?, optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): kotlin.Unit

    public abstract suspend fun move(moveMode: com.google.home.matter.standard.LevelControlTrait.MoveModeEnum, rate: kotlin.UByte?, optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): kotlin.Unit

    public abstract suspend fun step(stepMode: com.google.home.matter.standard.LevelControlTrait.StepModeEnum, stepSize: kotlin.UByte, transitionTime: kotlin.UShort?, optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): kotlin.Unit

    public abstract suspend fun stop(optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): kotlin.Unit

    public abstract suspend fun moveToLevelWithOnOff(level: kotlin.UByte, transitionTime: kotlin.UShort?, optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): kotlin.Unit

    public abstract suspend fun moveWithOnOff(moveMode: com.google.home.matter.standard.LevelControlTrait.MoveModeEnum, rate: kotlin.UByte?, optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): kotlin.Unit

    public abstract suspend fun stepWithOnOff(stepMode: com.google.home.matter.standard.LevelControlTrait.StepModeEnum, stepSize: kotlin.UByte, transitionTime: kotlin.UShort?, optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): kotlin.Unit

    public abstract suspend fun stopWithOnOff(optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): kotlin.Unit

    public abstract suspend fun moveToClosestFrequency(frequency: kotlin.UShort): kotlin.Unit

    public abstract fun moveToLevelBatchable(level: kotlin.UByte, transitionTime: kotlin.UShort?, optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun moveBatchable(moveMode: com.google.home.matter.standard.LevelControlTrait.MoveModeEnum, rate: kotlin.UByte?, optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun stepBatchable(stepMode: com.google.home.matter.standard.LevelControlTrait.StepModeEnum, stepSize: kotlin.UByte, transitionTime: kotlin.UShort?, optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun stopBatchable(optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun moveToLevelWithOnOffBatchable(level: kotlin.UByte, transitionTime: kotlin.UShort?, optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun moveWithOnOffBatchable(moveMode: com.google.home.matter.standard.LevelControlTrait.MoveModeEnum, rate: kotlin.UByte?, optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun stepWithOnOffBatchable(stepMode: com.google.home.matter.standard.LevelControlTrait.StepModeEnum, stepSize: kotlin.UByte, transitionTime: kotlin.UShort?, optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun stopWithOnOffBatchable(optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun moveToClosestFrequencyBatchable(frequency: kotlin.UShort): com.google.home.BatchableCommand<kotlin.Unit>
}
