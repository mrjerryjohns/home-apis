// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object AirQualityTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class AirQualityEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.AirQualityTrait.AirQualityEnum> {
        @androidx.annotation.NonNull Unknown,

        @androidx.annotation.NonNull Good,

        @androidx.annotation.NonNull Fair,

        @androidx.annotation.NonNull Moderate,

        @androidx.annotation.NonNull Poor,

        @androidx.annotation.NonNull VeryPoor,

        @androidx.annotation.NonNull ExtremelyPoor,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.AirQualityTrait.AirQualityEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final data class Feature public constructor(fair: kotlin.Boolean = COMPILED_CODE, moderate: kotlin.Boolean = COMPILED_CODE, veryPoor: kotlin.Boolean = COMPILED_CODE, extremelyPoor: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.AirQualityTrait.Feature> {
            private const final val FAIR_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val MODERATE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val VERY_POOR_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val EXTREMELY_POOR_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.AirQualityTrait.Feature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.AirQualityTrait.Feature { /* compiled code */ }
        }

        public final val fair: kotlin.Boolean /* compiled code */

        public final val moderate: kotlin.Boolean /* compiled code */

        public final val veryPoor: kotlin.Boolean /* compiled code */

        public final val extremelyPoor: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(fair: kotlin.Boolean = COMPILED_CODE, moderate: kotlin.Boolean = COMPILED_CODE, veryPoor: kotlin.Boolean = COMPILED_CODE, extremelyPoor: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.AirQualityTrait.Feature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.AirQualityTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.AirQualityTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.AirQualityTrait.Attributes { /* compiled code */ }
        }

        public abstract val airQuality: com.google.home.matter.standard.AirQualityTrait.AirQualityEnum?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: com.google.home.matter.standard.AirQualityTrait.Feature

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(airQuality: com.google.home.matter.standard.AirQualityTrait.AirQualityEnum? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.AirQualityTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.matter.standard.AirQualityTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.AirQualityTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.AirQualityTrait.Attributes) { /* compiled code */ }

        public open val airQuality: com.google.home.matter.standard.AirQualityTrait.AirQualityEnum? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: com.google.home.matter.standard.AirQualityTrait.Feature /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(airQuality: com.google.home.matter.standard.AirQualityTrait.AirQualityEnum? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.AirQualityTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.matter.standard.AirQualityTrait.AttributesImpl { /* compiled code */ }
    }
}
