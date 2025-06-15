// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class LevelControlImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.LevelControlTrait.Attributes) : com.google.home.matter.standard.LevelControl, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.LevelControlTrait.Attributes, com.google.home.Updatable<com.google.home.matter.standard.LevelControl, com.google.home.matter.standard.LevelControlTrait.MutableAttributes> {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.LevelControlTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val currentFrequency: kotlin.UShort? /* compiled code */

    public open val currentLevel: kotlin.UByte? /* compiled code */

    public open val defaultMoveRate: kotlin.UByte? /* compiled code */

    public open val featureMap: com.google.home.matter.standard.LevelControlTrait.Feature /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val maxFrequency: kotlin.UShort? /* compiled code */

    public open val maxLevel: kotlin.UByte? /* compiled code */

    public open val minFrequency: kotlin.UShort? /* compiled code */

    public open val minLevel: kotlin.UByte? /* compiled code */

    public open val offTransitionTime: kotlin.UShort? /* compiled code */

    public open val onLevel: kotlin.UByte? /* compiled code */

    public open val onOffTransitionTime: kotlin.UShort? /* compiled code */

    public open val onTransitionTime: kotlin.UShort? /* compiled code */

    public open val options: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap? /* compiled code */

    public open val remainingTime: kotlin.UShort? /* compiled code */

    public open val startUpCurrentLevel: kotlin.UByte? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.LevelControl.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.matter.standard.LevelControl.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun moveToLevel(level: kotlin.UByte, transitionTime: kotlin.UShort?, optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): kotlin.Unit { /* compiled code */ }

    public open suspend fun move(moveMode: com.google.home.matter.standard.LevelControlTrait.MoveModeEnum, rate: kotlin.UByte?, optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): kotlin.Unit { /* compiled code */ }

    public open suspend fun step(stepMode: com.google.home.matter.standard.LevelControlTrait.StepModeEnum, stepSize: kotlin.UByte, transitionTime: kotlin.UShort?, optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): kotlin.Unit { /* compiled code */ }

    public open suspend fun stop(optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): kotlin.Unit { /* compiled code */ }

    public open suspend fun moveToLevelWithOnOff(level: kotlin.UByte, transitionTime: kotlin.UShort?, optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): kotlin.Unit { /* compiled code */ }

    public open suspend fun moveWithOnOff(moveMode: com.google.home.matter.standard.LevelControlTrait.MoveModeEnum, rate: kotlin.UByte?, optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): kotlin.Unit { /* compiled code */ }

    public open suspend fun stepWithOnOff(stepMode: com.google.home.matter.standard.LevelControlTrait.StepModeEnum, stepSize: kotlin.UByte, transitionTime: kotlin.UShort?, optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): kotlin.Unit { /* compiled code */ }

    public open suspend fun stopWithOnOff(optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): kotlin.Unit { /* compiled code */ }

    public open suspend fun moveToClosestFrequency(frequency: kotlin.UShort): kotlin.Unit { /* compiled code */ }

    public open suspend fun update(optimisticReturn: (com.google.home.matter.standard.LevelControl) -> kotlin.Unit, init: com.google.home.matter.standard.LevelControlTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.LevelControl { /* compiled code */ }

    public open fun moveToLevelBatchable(level: kotlin.UByte, transitionTime: kotlin.UShort?, optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun moveBatchable(moveMode: com.google.home.matter.standard.LevelControlTrait.MoveModeEnum, rate: kotlin.UByte?, optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun stepBatchable(stepMode: com.google.home.matter.standard.LevelControlTrait.StepModeEnum, stepSize: kotlin.UByte, transitionTime: kotlin.UShort?, optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun stopBatchable(optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun moveToLevelWithOnOffBatchable(level: kotlin.UByte, transitionTime: kotlin.UShort?, optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun moveWithOnOffBatchable(moveMode: com.google.home.matter.standard.LevelControlTrait.MoveModeEnum, rate: kotlin.UByte?, optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun stepWithOnOffBatchable(stepMode: com.google.home.matter.standard.LevelControlTrait.StepModeEnum, stepSize: kotlin.UByte, transitionTime: kotlin.UShort?, optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun stopWithOnOffBatchable(optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun moveToClosestFrequencyBatchable(frequency: kotlin.UShort): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}
