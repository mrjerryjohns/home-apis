// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface FanControl : com.google.home.matter.standard.FanControlTrait.Attributes, com.google.home.matter.MatterTrait, com.google.home.Updatable<com.google.home.matter.standard.FanControl, com.google.home.matter.standard.FanControlTrait.MutableAttributes>, com.google.home.matter.standard.FanControlCommands {
    public companion object : com.google.home.TraitFactory<com.google.home.matter.standard.FanControl> {
        public final val fanMode: com.google.home.automation.Attribute<com.google.home.matter.standard.FanControlTrait.FanModeEnum?> /* compiled code */
            public final get

        public final val fanModeSequence: com.google.home.automation.Attribute<com.google.home.matter.standard.FanControlTrait.FanModeSequenceEnum?> /* compiled code */
            public final get

        public final val percentSetting: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val percentCurrent: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val speedMax: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val speedSetting: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val speedCurrent: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val rockSupport: com.google.home.automation.Attribute<com.google.home.matter.standard.FanControlTrait.RockBitmap?> /* compiled code */
            public final get

        public final val rockSetting: com.google.home.automation.Attribute<com.google.home.matter.standard.FanControlTrait.RockBitmap?> /* compiled code */
            public final get

        public final val windSupport: com.google.home.automation.Attribute<com.google.home.matter.standard.FanControlTrait.WindBitmap?> /* compiled code */
            public final get

        public final val windSetting: com.google.home.automation.Attribute<com.google.home.matter.standard.FanControlTrait.WindBitmap?> /* compiled code */
            public final get

        public final val airflowDirection: com.google.home.automation.Attribute<com.google.home.matter.standard.FanControlTrait.AirflowDirectionEnum?> /* compiled code */
            public final get

        public final val generatedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val acceptedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val attributeList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val featureMap: com.google.home.automation.Attribute<com.google.home.matter.standard.FanControlTrait.Feature> /* compiled code */
            public final get

        public final val clusterRevision: com.google.home.automation.Attribute<kotlin.UShort> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.FanControl?>.fanMode: com.google.home.automation.TypedExpression<com.google.home.matter.standard.FanControlTrait.FanModeEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.FanControl?>.fanModeSequence: com.google.home.automation.TypedExpression<com.google.home.matter.standard.FanControlTrait.FanModeSequenceEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.FanControl?>.percentSetting: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.FanControl?>.percentCurrent: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.FanControl?>.speedMax: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.FanControl?>.speedSetting: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.FanControl?>.speedCurrent: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.FanControl?>.rockSupport: com.google.home.automation.TypedExpression<com.google.home.matter.standard.FanControlTrait.RockBitmap?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.FanControl?>.rockSetting: com.google.home.automation.TypedExpression<com.google.home.matter.standard.FanControlTrait.RockBitmap?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.FanControl?>.windSupport: com.google.home.automation.TypedExpression<com.google.home.matter.standard.FanControlTrait.WindBitmap?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.FanControl?>.windSetting: com.google.home.automation.TypedExpression<com.google.home.matter.standard.FanControlTrait.WindBitmap?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.FanControl?>.airflowDirection: com.google.home.automation.TypedExpression<com.google.home.matter.standard.FanControlTrait.AirflowDirectionEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.FanControl?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.FanControl?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.FanControl?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.FanControl?>.featureMap: com.google.home.automation.TypedExpression<com.google.home.matter.standard.FanControlTrait.Feature> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.FanControl?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.FanControl>.setFanMode(value: com.google.home.matter.standard.FanControlTrait.FanModeEnum): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.FanControl>.setPercentSetting(value: kotlin.UByte): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.FanControl>.setSpeedSetting(value: kotlin.UByte): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.FanControl>.setRockSetting(value: com.google.home.matter.standard.FanControlTrait.RockBitmap): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.FanControl>.setWindSetting(value: com.google.home.matter.standard.FanControlTrait.WindBitmap): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.FanControl>.setAirflowDirection(value: com.google.home.matter.standard.FanControlTrait.AirflowDirectionEnum): kotlin.Unit { /* compiled code */ }

        public final fun step(direction: com.google.home.matter.standard.FanControlTrait.StepDirectionEnum, optionalArgs: com.google.home.matter.standard.FanControlTrait.StepCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.automation.Command { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.matter.standard.FanControl> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.matter.standard.FanControl.Attribute): kotlin.Boolean

    public abstract fun supports(command: com.google.home.matter.standard.FanControl.Command): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.FanControl.Attribute> {
        @androidx.annotation.NonNull fanMode,

        @androidx.annotation.NonNull fanModeSequence,

        @androidx.annotation.NonNull percentSetting,

        @androidx.annotation.NonNull percentCurrent,

        @androidx.annotation.NonNull speedMax,

        @androidx.annotation.NonNull speedSetting,

        @androidx.annotation.NonNull speedCurrent,

        @androidx.annotation.NonNull rockSupport,

        @androidx.annotation.NonNull rockSetting,

        @androidx.annotation.NonNull windSupport,

        @androidx.annotation.NonNull windSetting,

        @androidx.annotation.NonNull airflowDirection,

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

    public final enum class Command private constructor(tag: kotlin.UInt) : kotlin.Enum<com.google.home.matter.standard.FanControl.Command> {
        @androidx.annotation.NonNull Step;

        public final val tag: kotlin.UInt /* compiled code */
    }
}
