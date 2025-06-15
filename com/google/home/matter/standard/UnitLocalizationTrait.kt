// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object UnitLocalizationTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class TempUnitEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.UnitLocalizationTrait.TempUnitEnum> {
        @androidx.annotation.NonNull Fahrenheit,

        @androidx.annotation.NonNull Celsius,

        @androidx.annotation.NonNull Kelvin,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.UnitLocalizationTrait.TempUnitEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final data class Feature public constructor(temperatureUnit: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.UnitLocalizationTrait.Feature> {
            private const final val TEMPERATURE_UNIT_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.UnitLocalizationTrait.Feature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.UnitLocalizationTrait.Feature { /* compiled code */ }
        }

        public final val temperatureUnit: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(temperatureUnit: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.UnitLocalizationTrait.Feature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitLocalizationTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitLocalizationTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitLocalizationTrait.Attributes { /* compiled code */ }
        }

        public abstract val temperatureUnit: com.google.home.matter.standard.UnitLocalizationTrait.TempUnitEnum?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: com.google.home.matter.standard.UnitLocalizationTrait.Feature

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(temperatureUnit: com.google.home.matter.standard.UnitLocalizationTrait.TempUnitEnum? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.UnitLocalizationTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.matter.standard.UnitLocalizationTrait.Attributes, com.google.home.matter.serialization.CanMutate<com.google.home.matter.standard.UnitLocalizationTrait.Attributes, com.google.home.matter.standard.UnitLocalizationTrait.MutableAttributes> {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.UnitLocalizationTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.UnitLocalizationTrait.Attributes) { /* compiled code */ }

        public open val temperatureUnit: com.google.home.matter.standard.UnitLocalizationTrait.TempUnitEnum? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: com.google.home.matter.standard.UnitLocalizationTrait.Feature /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open fun mutate(init: com.google.home.matter.standard.UnitLocalizationTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.UnitLocalizationTrait.Attributes { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(temperatureUnit: com.google.home.matter.standard.UnitLocalizationTrait.TempUnitEnum? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.UnitLocalizationTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.matter.standard.UnitLocalizationTrait.AttributesImpl { /* compiled code */ }
    }

    public final class MutableAttributes public constructor(attributes: com.google.home.matter.standard.UnitLocalizationTrait.Attributes) : com.google.home.matter.standard.UnitLocalizationTrait.AttributesImpl {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitLocalizationTrait.MutableAttributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitLocalizationTrait.MutableAttributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitLocalizationTrait.MutableAttributes { /* compiled code */ }
        }

        internal final var _temperatureUnit: com.google.home.matter.standard.UnitLocalizationTrait.TempUnitEnum? /* compiled code */

        public open val temperatureUnit: com.google.home.matter.standard.UnitLocalizationTrait.TempUnitEnum? /* compiled code */
            public open get

        public final fun setTemperatureUnit(value: com.google.home.matter.standard.UnitLocalizationTrait.TempUnitEnum): kotlin.Unit { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }
}

