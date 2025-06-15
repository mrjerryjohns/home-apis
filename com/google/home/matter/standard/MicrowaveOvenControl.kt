// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface MicrowaveOvenControl : com.google.home.matter.standard.MicrowaveOvenControlTrait.Attributes, com.google.home.matter.MatterTrait, com.google.home.matter.standard.MicrowaveOvenControlCommands {
    public companion object : com.google.home.TraitFactory<com.google.home.matter.standard.MicrowaveOvenControl> {
        public final val cookTime: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val maxCookTime: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val powerSetting: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val minPower: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val maxPower: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val powerStep: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val supportedWatts: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UShort>?> /* compiled code */
            public final get

        public final val selectedWattIndex: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val wattRating: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val generatedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val acceptedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val attributeList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val featureMap: com.google.home.automation.Attribute<com.google.home.matter.standard.MicrowaveOvenControlTrait.Feature> /* compiled code */
            public final get

        public final val clusterRevision: com.google.home.automation.Attribute<kotlin.UShort> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.MicrowaveOvenControl?>.cookTime: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.MicrowaveOvenControl?>.maxCookTime: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.MicrowaveOvenControl?>.powerSetting: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.MicrowaveOvenControl?>.minPower: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.MicrowaveOvenControl?>.maxPower: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.MicrowaveOvenControl?>.powerStep: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.MicrowaveOvenControl?>.supportedWatts: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UShort>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.MicrowaveOvenControl?>.selectedWattIndex: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.MicrowaveOvenControl?>.wattRating: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.MicrowaveOvenControl?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.MicrowaveOvenControl?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.MicrowaveOvenControl?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.MicrowaveOvenControl?>.featureMap: com.google.home.automation.TypedExpression<com.google.home.matter.standard.MicrowaveOvenControlTrait.Feature> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.MicrowaveOvenControl?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        public final fun setCookingParameters(optionalArgs: com.google.home.matter.standard.MicrowaveOvenControlTrait.SetCookingParametersCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.automation.Command { /* compiled code */ }

        public final fun addMoreTime(timeToAdd: kotlin.UInt): com.google.home.automation.Command { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.matter.standard.MicrowaveOvenControl> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.matter.standard.MicrowaveOvenControl.Attribute): kotlin.Boolean

    public abstract fun supports(command: com.google.home.matter.standard.MicrowaveOvenControl.Command): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.MicrowaveOvenControl.Attribute> {
        @androidx.annotation.NonNull cookTime,

        @androidx.annotation.NonNull maxCookTime,

        @androidx.annotation.NonNull powerSetting,

        @androidx.annotation.NonNull minPower,

        @androidx.annotation.NonNull maxPower,

        @androidx.annotation.NonNull powerStep,

        @androidx.annotation.NonNull supportedWatts,

        @androidx.annotation.NonNull selectedWattIndex,

        @androidx.annotation.NonNull wattRating,

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

    public final enum class Command private constructor(tag: kotlin.UInt) : kotlin.Enum<com.google.home.matter.standard.MicrowaveOvenControl.Command> {
        @androidx.annotation.NonNull SetCookingParameters,

        @androidx.annotation.NonNull AddMoreTime;

        public final val tag: kotlin.UInt /* compiled code */
    }
}
