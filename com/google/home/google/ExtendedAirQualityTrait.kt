// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public object ExtendedAirQualityTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class AirQualityLevel private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.ExtendedAirQualityTrait.AirQualityLevel> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull Good,

        @androidx.annotation.NonNull Fair,

        @androidx.annotation.NonNull Moderate,

        @androidx.annotation.NonNull Poor,

        @androidx.annotation.NonNull VeryPoor,

        @androidx.annotation.NonNull ExtremelyPoor,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.ExtendedAirQualityTrait.AirQualityLevel> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class MeasurementLocation private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.ExtendedAirQualityTrait.MeasurementLocation> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull Indoor,

        @androidx.annotation.NonNull Outdoor,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.ExtendedAirQualityTrait.MeasurementLocation> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final data class AirQualityFeature public constructor(indoorFair: kotlin.Boolean = COMPILED_CODE, indoorModerate: kotlin.Boolean = COMPILED_CODE, indoorVeryPoor: kotlin.Boolean = COMPILED_CODE, indoorExtremelyPoor: kotlin.Boolean = COMPILED_CODE, outdoorFair: kotlin.Boolean = COMPILED_CODE, outdoorModerate: kotlin.Boolean = COMPILED_CODE, outdoorVeryPoor: kotlin.Boolean = COMPILED_CODE, outdoorExtremelyPoor: kotlin.Boolean = COMPILED_CODE, numeric: kotlin.Boolean = COMPILED_CODE, indoorNumeric: kotlin.Boolean = COMPILED_CODE, outdoorNumeric: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.google.ExtendedAirQualityTrait.AirQualityFeature> {
            private const final val INDOOR_FAIR_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val INDOOR_MODERATE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val INDOOR_VERY_POOR_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val INDOOR_EXTREMELY_POOR_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val OUTDOOR_FAIR_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val OUTDOOR_MODERATE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val OUTDOOR_VERY_POOR_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val OUTDOOR_EXTREMELY_POOR_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val NUMERIC_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val INDOOR_NUMERIC_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val OUTDOOR_NUMERIC_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.google.ExtendedAirQualityTrait.AirQualityFeature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.google.ExtendedAirQualityTrait.AirQualityFeature { /* compiled code */ }
        }

        public final val indoorFair: kotlin.Boolean /* compiled code */

        public final val indoorModerate: kotlin.Boolean /* compiled code */

        public final val indoorVeryPoor: kotlin.Boolean /* compiled code */

        public final val indoorExtremelyPoor: kotlin.Boolean /* compiled code */

        public final val outdoorFair: kotlin.Boolean /* compiled code */

        public final val outdoorModerate: kotlin.Boolean /* compiled code */

        public final val outdoorVeryPoor: kotlin.Boolean /* compiled code */

        public final val outdoorExtremelyPoor: kotlin.Boolean /* compiled code */

        public final val numeric: kotlin.Boolean /* compiled code */

        public final val indoorNumeric: kotlin.Boolean /* compiled code */

        public final val outdoorNumeric: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component5(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component6(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component7(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component8(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component9(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component10(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component11(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(indoorFair: kotlin.Boolean = COMPILED_CODE, indoorModerate: kotlin.Boolean = COMPILED_CODE, indoorVeryPoor: kotlin.Boolean = COMPILED_CODE, indoorExtremelyPoor: kotlin.Boolean = COMPILED_CODE, outdoorFair: kotlin.Boolean = COMPILED_CODE, outdoorModerate: kotlin.Boolean = COMPILED_CODE, outdoorVeryPoor: kotlin.Boolean = COMPILED_CODE, outdoorExtremelyPoor: kotlin.Boolean = COMPILED_CODE, numeric: kotlin.Boolean = COMPILED_CODE, indoorNumeric: kotlin.Boolean = COMPILED_CODE, outdoorNumeric: kotlin.Boolean = COMPILED_CODE): com.google.home.google.ExtendedAirQualityTrait.AirQualityFeature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface AirQuality {
        public abstract val priority: kotlin.Int?

        public abstract val triggeredDeviceId: kotlin.String?

        public abstract val levelValue: com.google.home.google.ExtendedAirQualityTrait.AirQualityLevel?

        public abstract val location: com.google.home.google.ExtendedAirQualityTrait.MeasurementLocation?
    }

    public final class AirQualityImpl public constructor(priority: kotlin.Int? = COMPILED_CODE, triggeredDeviceId: kotlin.String? = COMPILED_CODE, levelValue: com.google.home.google.ExtendedAirQualityTrait.AirQualityLevel? = COMPILED_CODE, location: com.google.home.google.ExtendedAirQualityTrait.MeasurementLocation? = COMPILED_CODE) : com.google.home.google.ExtendedAirQualityTrait.AirQuality {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ExtendedAirQualityTrait.AirQuality> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ExtendedAirQualityTrait.AirQuality): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ExtendedAirQualityTrait.AirQuality { /* compiled code */ }
        }

        public open val priority: kotlin.Int? /* compiled code */

        public open val triggeredDeviceId: kotlin.String? /* compiled code */

        public open val levelValue: com.google.home.google.ExtendedAirQualityTrait.AirQualityLevel? /* compiled code */

        public open val location: com.google.home.google.ExtendedAirQualityTrait.MeasurementLocation? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface AirQualitySensorError {
        public abstract val priority: kotlin.Int?

        public abstract val errorCode: kotlin.String?
    }

    public final class AirQualitySensorErrorImpl public constructor(priority: kotlin.Int? = COMPILED_CODE, errorCode: kotlin.String? = COMPILED_CODE) : com.google.home.google.ExtendedAirQualityTrait.AirQualitySensorError {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ExtendedAirQualityTrait.AirQualitySensorError> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ExtendedAirQualityTrait.AirQualitySensorError): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ExtendedAirQualityTrait.AirQualitySensorError { /* compiled code */ }
        }

        public open val priority: kotlin.Int? /* compiled code */

        public open val errorCode: kotlin.String? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ExtendedAirQualityTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ExtendedAirQualityTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ExtendedAirQualityTrait.Attributes { /* compiled code */ }
        }

        public abstract val measuredValue: kotlin.Int?

        public abstract val indoorMeasuredValue: kotlin.Int?

        public abstract val outdoorMeasuredValue: kotlin.Int?

        public abstract val indoorAirQuality: com.google.home.google.ExtendedAirQualityTrait.AirQualityLevel?

        public abstract val outdoorAirQuality: com.google.home.google.ExtendedAirQualityTrait.AirQualityLevel?

        public abstract val minMeasuredValue: kotlin.Int?

        public abstract val maxMeasuredValue: kotlin.Int?

        public abstract val tolerance: kotlin.Int?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: kotlin.UInt

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(measuredValue: kotlin.Int? = COMPILED_CODE, indoorMeasuredValue: kotlin.Int? = COMPILED_CODE, outdoorMeasuredValue: kotlin.Int? = COMPILED_CODE, indoorAirQuality: com.google.home.google.ExtendedAirQualityTrait.AirQualityLevel? = COMPILED_CODE, outdoorAirQuality: com.google.home.google.ExtendedAirQualityTrait.AirQualityLevel? = COMPILED_CODE, minMeasuredValue: kotlin.Int? = COMPILED_CODE, maxMeasuredValue: kotlin.Int? = COMPILED_CODE, tolerance: kotlin.Int? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.google.ExtendedAirQualityTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.google.ExtendedAirQualityTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.google.ExtendedAirQualityTrait.Attributes) { /* compiled code */ }

        public open val measuredValue: kotlin.Int? /* compiled code */

        public open val indoorMeasuredValue: kotlin.Int? /* compiled code */

        public open val outdoorMeasuredValue: kotlin.Int? /* compiled code */

        public open val indoorAirQuality: com.google.home.google.ExtendedAirQualityTrait.AirQualityLevel? /* compiled code */

        public open val outdoorAirQuality: com.google.home.google.ExtendedAirQualityTrait.AirQualityLevel? /* compiled code */

        public open val minMeasuredValue: kotlin.Int? /* compiled code */

        public open val maxMeasuredValue: kotlin.Int? /* compiled code */

        public open val tolerance: kotlin.Int? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: kotlin.UInt /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(measuredValue: kotlin.Int? = COMPILED_CODE, indoorMeasuredValue: kotlin.Int? = COMPILED_CODE, outdoorMeasuredValue: kotlin.Int? = COMPILED_CODE, indoorAirQuality: com.google.home.google.ExtendedAirQualityTrait.AirQualityLevel? = COMPILED_CODE, outdoorAirQuality: com.google.home.google.ExtendedAirQualityTrait.AirQualityLevel? = COMPILED_CODE, minMeasuredValue: kotlin.Int? = COMPILED_CODE, maxMeasuredValue: kotlin.Int? = COMPILED_CODE, tolerance: kotlin.Int? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.google.ExtendedAirQualityTrait.AttributesImpl { /* compiled code */ }
    }
}

