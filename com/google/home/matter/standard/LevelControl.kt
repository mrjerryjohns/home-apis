// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface LevelControl : com.google.home.matter.standard.LevelControlTrait.Attributes, com.google.home.matter.MatterTrait, com.google.home.Updatable<com.google.home.matter.standard.LevelControl, com.google.home.matter.standard.LevelControlTrait.MutableAttributes>, com.google.home.matter.standard.LevelControlCommands {
    public companion object : com.google.home.TraitFactory<com.google.home.matter.standard.LevelControl> {
        public final val currentLevel: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val remainingTime: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val minLevel: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val maxLevel: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val currentFrequency: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val minFrequency: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val maxFrequency: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val options: com.google.home.automation.Attribute<com.google.home.matter.standard.LevelControlTrait.OptionsBitmap?> /* compiled code */
            public final get

        public final val onOffTransitionTime: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val onLevel: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val onTransitionTime: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val offTransitionTime: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val defaultMoveRate: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val startUpCurrentLevel: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val generatedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val acceptedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val attributeList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val featureMap: com.google.home.automation.Attribute<com.google.home.matter.standard.LevelControlTrait.Feature> /* compiled code */
            public final get

        public final val clusterRevision: com.google.home.automation.Attribute<kotlin.UShort> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.LevelControl?>.currentLevel: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.LevelControl?>.remainingTime: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.LevelControl?>.minLevel: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.LevelControl?>.maxLevel: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.LevelControl?>.currentFrequency: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.LevelControl?>.minFrequency: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.LevelControl?>.maxFrequency: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.LevelControl?>.options: com.google.home.automation.TypedExpression<com.google.home.matter.standard.LevelControlTrait.OptionsBitmap?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.LevelControl?>.onOffTransitionTime: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.LevelControl?>.onLevel: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.LevelControl?>.onTransitionTime: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.LevelControl?>.offTransitionTime: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.LevelControl?>.defaultMoveRate: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.LevelControl?>.startUpCurrentLevel: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.LevelControl?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.LevelControl?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.LevelControl?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.LevelControl?>.featureMap: com.google.home.automation.TypedExpression<com.google.home.matter.standard.LevelControlTrait.Feature> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.LevelControl?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.LevelControl>.setOptions(value: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.LevelControl>.setOnOffTransitionTime(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.LevelControl>.setOnLevel(value: kotlin.UByte): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.LevelControl>.setOnTransitionTime(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.LevelControl>.setOffTransitionTime(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.LevelControl>.setDefaultMoveRate(value: kotlin.UByte): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.LevelControl>.setStartUpCurrentLevel(value: kotlin.UByte): kotlin.Unit { /* compiled code */ }

        public final fun moveToLevel(level: kotlin.UByte, transitionTime: kotlin.UShort?, optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): com.google.home.automation.Command { /* compiled code */ }

        public final fun move(moveMode: com.google.home.matter.standard.LevelControlTrait.MoveModeEnum, rate: kotlin.UByte?, optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): com.google.home.automation.Command { /* compiled code */ }

        public final fun step(stepMode: com.google.home.matter.standard.LevelControlTrait.StepModeEnum, stepSize: kotlin.UByte, transitionTime: kotlin.UShort?, optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): com.google.home.automation.Command { /* compiled code */ }

        public final fun stop(optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): com.google.home.automation.Command { /* compiled code */ }

        public final fun moveToLevelWithOnOff(level: kotlin.UByte, transitionTime: kotlin.UShort?, optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): com.google.home.automation.Command { /* compiled code */ }

        public final fun moveWithOnOff(moveMode: com.google.home.matter.standard.LevelControlTrait.MoveModeEnum, rate: kotlin.UByte?, optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): com.google.home.automation.Command { /* compiled code */ }

        public final fun stepWithOnOff(stepMode: com.google.home.matter.standard.LevelControlTrait.StepModeEnum, stepSize: kotlin.UByte, transitionTime: kotlin.UShort?, optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): com.google.home.automation.Command { /* compiled code */ }

        public final fun stopWithOnOff(optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): com.google.home.automation.Command { /* compiled code */ }

        public final fun moveToClosestFrequency(frequency: kotlin.UShort): com.google.home.automation.Command { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.matter.standard.LevelControl> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.matter.standard.LevelControl.Attribute): kotlin.Boolean

    public abstract fun supports(command: com.google.home.matter.standard.LevelControl.Command): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.LevelControl.Attribute> {
        @androidx.annotation.NonNull currentLevel,

        @androidx.annotation.NonNull remainingTime,

        @androidx.annotation.NonNull minLevel,

        @androidx.annotation.NonNull maxLevel,

        @androidx.annotation.NonNull currentFrequency,

        @androidx.annotation.NonNull minFrequency,

        @androidx.annotation.NonNull maxFrequency,

        @androidx.annotation.NonNull options,

        @androidx.annotation.NonNull onOffTransitionTime,

        @androidx.annotation.NonNull onLevel,

        @androidx.annotation.NonNull onTransitionTime,

        @androidx.annotation.NonNull offTransitionTime,

        @androidx.annotation.NonNull defaultMoveRate,

        @androidx.annotation.NonNull startUpCurrentLevel,

        @androidx.annotation.NonNull generatedCommandList,

        @androidx.annotation.NonNull acceptedCommandList,

        @androidx.annotation.NonNull attributeList,

        @androidx.annotation.NonNull featureMap,

        @androidx.annotation.NonNull clusterRevision;

        public companion object {
            public final val StructDescriptor: com.google.home.StructDescriptor /* compiled code */
        }

        public open val fieldName: kotlin.String /* compiled code */

        public open val tag: kotlin.UInt /* compiled code */

        public open val typeName: kotlin.String /* compiled code */

        public open val typeEnum: com.google.home.Type /* compiled code */

        public open val descriptor: com.google.home.Descriptor /* compiled code */

        public final val isNullable: kotlin.Boolean /* compiled code */
    }

    public final enum class Command private constructor(tag: kotlin.UInt) : kotlin.Enum<com.google.home.matter.standard.LevelControl.Command> {
        @androidx.annotation.NonNull MoveToLevel,

        @androidx.annotation.NonNull Move,

        @androidx.annotation.NonNull Step,

        @androidx.annotation.NonNull Stop,

        @androidx.annotation.NonNull MoveToLevelWithOnOff,

        @androidx.annotation.NonNull MoveWithOnOff,

        @androidx.annotation.NonNull StepWithOnOff,

        @androidx.annotation.NonNull StopWithOnOff,

        @androidx.annotation.NonNull MoveToClosestFrequency;

        public final val tag: kotlin.UInt /* compiled code */
    }
}

