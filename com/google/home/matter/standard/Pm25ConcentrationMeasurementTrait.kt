// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object Pm25ConcentrationMeasurementTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class LevelValueEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.Pm25ConcentrationMeasurementTrait.LevelValueEnum> {
        @androidx.annotation.NonNull Unknown,

        @androidx.annotation.NonNull Low,

        @androidx.annotation.NonNull Medium,

        @androidx.annotation.NonNull High,

        @androidx.annotation.NonNull Critical,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.Pm25ConcentrationMeasurementTrait.LevelValueEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class MeasurementMediumEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.Pm25ConcentrationMeasurementTrait.MeasurementMediumEnum> {
        @androidx.annotation.NonNull Air,

        @androidx.annotation.NonNull Water,

        @androidx.annotation.NonNull Soil,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.Pm25ConcentrationMeasurementTrait.MeasurementMediumEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class MeasurementUnitEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.Pm25ConcentrationMeasurementTrait.MeasurementUnitEnum> {
        @androidx.annotation.NonNull PPM,

        @androidx.annotation.NonNull PPB,

        @androidx.annotation.NonNull PPT,

        @androidx.annotation.NonNull MGM3,

        @androidx.annotation.NonNull UGM3,

        @androidx.annotation.NonNull NGM3,

        @androidx.annotation.NonNull PM3,

        @androidx.annotation.NonNull BQM3,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.Pm25ConcentrationMeasurementTrait.MeasurementUnitEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final data class Feature public constructor(numericMeasurement: kotlin.Boolean = COMPILED_CODE, levelIndication: kotlin.Boolean = COMPILED_CODE, mediumLevel: kotlin.Boolean = COMPILED_CODE, criticalLevel: kotlin.Boolean = COMPILED_CODE, peakMeasurement: kotlin.Boolean = COMPILED_CODE, averageMeasurement: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.Pm25ConcentrationMeasurementTrait.Feature> {
            private const final val NUMERIC_MEASUREMENT_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val LEVEL_INDICATION_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val MEDIUM_LEVEL_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val CRITICAL_LEVEL_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val PEAK_MEASUREMENT_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val AVERAGE_MEASUREMENT_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.Pm25ConcentrationMeasurementTrait.Feature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.Pm25ConcentrationMeasurementTrait.Feature { /* compiled code */ }
        }

        public final val numericMeasurement: kotlin.Boolean /* compiled code */

        public final val levelIndication: kotlin.Boolean /* compiled code */

        public final val mediumLevel: kotlin.Boolean /* compiled code */

        public final val criticalLevel: kotlin.Boolean /* compiled code */

        public final val peakMeasurement: kotlin.Boolean /* compiled code */

        public final val averageMeasurement: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component5(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component6(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(numericMeasurement: kotlin.Boolean = COMPILED_CODE, levelIndication: kotlin.Boolean = COMPILED_CODE, mediumLevel: kotlin.Boolean = COMPILED_CODE, criticalLevel: kotlin.Boolean = COMPILED_CODE, peakMeasurement: kotlin.Boolean = COMPILED_CODE, averageMeasurement: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.Pm25ConcentrationMeasurementTrait.Feature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.Pm25ConcentrationMeasurementTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.Pm25ConcentrationMeasurementTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.Pm25ConcentrationMeasurementTrait.Attributes { /* compiled code */ }
        }

        public abstract val measuredValue: kotlin.Float?

        public abstract val minMeasuredValue: kotlin.Float?

        public abstract val maxMeasuredValue: kotlin.Float?

        public abstract val peakMeasuredValue: kotlin.Float?

        public abstract val peakMeasuredValueWindow: kotlin.UInt?

        public abstract val averageMeasuredValue: kotlin.Float?

        public abstract val averageMeasuredValueWindow: kotlin.UInt?

        public abstract val uncertainty: kotlin.Float?

        public abstract val measurementUnit: com.google.home.matter.standard.Pm25ConcentrationMeasurementTrait.MeasurementUnitEnum?

        public abstract val measurementMedium: com.google.home.matter.standard.Pm25ConcentrationMeasurementTrait.MeasurementMediumEnum?

        public abstract val levelValue: com.google.home.matter.standard.Pm25ConcentrationMeasurementTrait.LevelValueEnum?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: com.google.home.matter.standard.Pm25ConcentrationMeasurementTrait.Feature

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(measuredValue: kotlin.Float? = COMPILED_CODE, minMeasuredValue: kotlin.Float? = COMPILED_CODE, maxMeasuredValue: kotlin.Float? = COMPILED_CODE, peakMeasuredValue: kotlin.Float? = COMPILED_CODE, peakMeasuredValueWindow: kotlin.UInt? = COMPILED_CODE, averageMeasuredValue: kotlin.Float? = COMPILED_CODE, averageMeasuredValueWindow: kotlin.UInt? = COMPILED_CODE, uncertainty: kotlin.Float? = COMPILED_CODE, measurementUnit: com.google.home.matter.standard.Pm25ConcentrationMeasurementTrait.MeasurementUnitEnum? = COMPILED_CODE, measurementMedium: com.google.home.matter.standard.Pm25ConcentrationMeasurementTrait.MeasurementMediumEnum? = COMPILED_CODE, levelValue: com.google.home.matter.standard.Pm25ConcentrationMeasurementTrait.LevelValueEnum? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.Pm25ConcentrationMeasurementTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.matter.standard.Pm25ConcentrationMeasurementTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.Pm25ConcentrationMeasurementTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.Pm25ConcentrationMeasurementTrait.Attributes) { /* compiled code */ }

        public open val measuredValue: kotlin.Float? /* compiled code */

        public open val minMeasuredValue: kotlin.Float? /* compiled code */

        public open val maxMeasuredValue: kotlin.Float? /* compiled code */

        public open val peakMeasuredValue: kotlin.Float? /* compiled code */

        public open val peakMeasuredValueWindow: kotlin.UInt? /* compiled code */

        public open val averageMeasuredValue: kotlin.Float? /* compiled code */

        public open val averageMeasuredValueWindow: kotlin.UInt? /* compiled code */

        public open val uncertainty: kotlin.Float? /* compiled code */

        public open val measurementUnit: com.google.home.matter.standard.Pm25ConcentrationMeasurementTrait.MeasurementUnitEnum? /* compiled code */

        public open val measurementMedium: com.google.home.matter.standard.Pm25ConcentrationMeasurementTrait.MeasurementMediumEnum? /* compiled code */

        public open val levelValue: com.google.home.matter.standard.Pm25ConcentrationMeasurementTrait.LevelValueEnum? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: com.google.home.matter.standard.Pm25ConcentrationMeasurementTrait.Feature /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(measuredValue: kotlin.Float? = COMPILED_CODE, minMeasuredValue: kotlin.Float? = COMPILED_CODE, maxMeasuredValue: kotlin.Float? = COMPILED_CODE, peakMeasuredValue: kotlin.Float? = COMPILED_CODE, peakMeasuredValueWindow: kotlin.UInt? = COMPILED_CODE, averageMeasuredValue: kotlin.Float? = COMPILED_CODE, averageMeasuredValueWindow: kotlin.UInt? = COMPILED_CODE, uncertainty: kotlin.Float? = COMPILED_CODE, measurementUnit: com.google.home.matter.standard.Pm25ConcentrationMeasurementTrait.MeasurementUnitEnum? = COMPILED_CODE, measurementMedium: com.google.home.matter.standard.Pm25ConcentrationMeasurementTrait.MeasurementMediumEnum? = COMPILED_CODE, levelValue: com.google.home.matter.standard.Pm25ConcentrationMeasurementTrait.LevelValueEnum? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.Pm25ConcentrationMeasurementTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.matter.standard.Pm25ConcentrationMeasurementTrait.AttributesImpl { /* compiled code */ }
    }
}

