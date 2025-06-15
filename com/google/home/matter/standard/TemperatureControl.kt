// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface TemperatureControl : com.google.home.matter.standard.TemperatureControlTrait.Attributes, com.google.home.matter.MatterTrait, com.google.home.matter.standard.TemperatureControlCommands {
    public companion object : com.google.home.TraitFactory<com.google.home.matter.standard.TemperatureControl> {
        public final val temperatureSetpoint: com.google.home.automation.Attribute<kotlin.Short?> /* compiled code */
            public final get

        public final val minTemperature: com.google.home.automation.Attribute<kotlin.Short?> /* compiled code */
            public final get

        public final val maxTemperature: com.google.home.automation.Attribute<kotlin.Short?> /* compiled code */
            public final get

        public final val step: com.google.home.automation.Attribute<kotlin.Short?> /* compiled code */
            public final get

        public final val selectedTemperatureLevel: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val supportedTemperatureLevels: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.String>?> /* compiled code */
            public final get

        public final val generatedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val acceptedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val attributeList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val featureMap: com.google.home.automation.Attribute<com.google.home.matter.standard.TemperatureControlTrait.Feature> /* compiled code */
            public final get

        public final val clusterRevision: com.google.home.automation.Attribute<kotlin.UShort> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.TemperatureControl?>.temperatureSetpoint: com.google.home.automation.TypedExpression<kotlin.Short?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.TemperatureControl?>.minTemperature: com.google.home.automation.TypedExpression<kotlin.Short?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.TemperatureControl?>.maxTemperature: com.google.home.automation.TypedExpression<kotlin.Short?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.TemperatureControl?>.step: com.google.home.automation.TypedExpression<kotlin.Short?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.TemperatureControl?>.selectedTemperatureLevel: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.TemperatureControl?>.supportedTemperatureLevels: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.String>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.TemperatureControl?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.TemperatureControl?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.TemperatureControl?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.TemperatureControl?>.featureMap: com.google.home.automation.TypedExpression<com.google.home.matter.standard.TemperatureControlTrait.Feature> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.TemperatureControl?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        public final fun setTemperature(optionalArgs: com.google.home.matter.standard.TemperatureControlTrait.SetTemperatureCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.automation.Command { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.matter.standard.TemperatureControl> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.matter.standard.TemperatureControl.Attribute): kotlin.Boolean

    public abstract fun supports(command: com.google.home.matter.standard.TemperatureControl.Command): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.TemperatureControl.Attribute> {
        @androidx.annotation.NonNull temperatureSetpoint,

        @androidx.annotation.NonNull minTemperature,

        @androidx.annotation.NonNull maxTemperature,

        @androidx.annotation.NonNull step,

        @androidx.annotation.NonNull selectedTemperatureLevel,

        @androidx.annotation.NonNull supportedTemperatureLevels,

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

    public final enum class Command private constructor(tag: kotlin.UInt) : kotlin.Enum<com.google.home.matter.standard.TemperatureControl.Command> {
        @androidx.annotation.NonNull SetTemperature;

        public final val tag: kotlin.UInt /* compiled code */
    }
}
