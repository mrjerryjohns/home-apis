// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public object SmokeLevelConcentrationMeasurementTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class ConcentrationLevel private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.SmokeLevelConcentrationMeasurementTrait.ConcentrationLevel> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull Low,

        @androidx.annotation.NonNull Medium,

        @androidx.annotation.NonNull High,

        @androidx.annotation.NonNull Critical,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.SmokeLevelConcentrationMeasurementTrait.ConcentrationLevel> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class MeasurementUnit private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.SmokeLevelConcentrationMeasurementTrait.MeasurementUnit> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull PartsPerMillion,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.SmokeLevelConcentrationMeasurementTrait.MeasurementUnit> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final data class SmokeLevelMeasurementFeature public constructor(numericMeasurement: kotlin.Boolean = COMPILED_CODE, levelIndication: kotlin.Boolean = COMPILED_CODE, mediumLevel: kotlin.Boolean = COMPILED_CODE, criticalLevel: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.google.SmokeLevelConcentrationMeasurementTrait.SmokeLevelMeasurementFeature> {
            private const final val NUMERIC_MEASUREMENT_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val LEVEL_INDICATION_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val MEDIUM_LEVEL_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val CRITICAL_LEVEL_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.google.SmokeLevelConcentrationMeasurementTrait.SmokeLevelMeasurementFeature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.google.SmokeLevelConcentrationMeasurementTrait.SmokeLevelMeasurementFeature { /* compiled code */ }
        }

        public final val numericMeasurement: kotlin.Boolean /* compiled code */

        public final val levelIndication: kotlin.Boolean /* compiled code */

        public final val mediumLevel: kotlin.Boolean /* compiled code */

        public final val criticalLevel: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(numericMeasurement: kotlin.Boolean = COMPILED_CODE, levelIndication: kotlin.Boolean = COMPILED_CODE, mediumLevel: kotlin.Boolean = COMPILED_CODE, criticalLevel: kotlin.Boolean = COMPILED_CODE): com.google.home.google.SmokeLevelConcentrationMeasurementTrait.SmokeLevelMeasurementFeature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.SmokeLevelConcentrationMeasurementTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.SmokeLevelConcentrationMeasurementTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.SmokeLevelConcentrationMeasurementTrait.Attributes { /* compiled code */ }
        }

        public abstract val measurementUnit: com.google.home.google.SmokeLevelConcentrationMeasurementTrait.MeasurementUnit?

        public abstract val measuredValue: kotlin.Int?

        public abstract val levelValue: com.google.home.google.SmokeLevelConcentrationMeasurementTrait.ConcentrationLevel?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: kotlin.UInt

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(measurementUnit: com.google.home.google.SmokeLevelConcentrationMeasurementTrait.MeasurementUnit? = COMPILED_CODE, measuredValue: kotlin.Int? = COMPILED_CODE, levelValue: com.google.home.google.SmokeLevelConcentrationMeasurementTrait.ConcentrationLevel? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.google.SmokeLevelConcentrationMeasurementTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.google.SmokeLevelConcentrationMeasurementTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.google.SmokeLevelConcentrationMeasurementTrait.Attributes) { /* compiled code */ }

        public open val measurementUnit: com.google.home.google.SmokeLevelConcentrationMeasurementTrait.MeasurementUnit? /* compiled code */

        public open val measuredValue: kotlin.Int? /* compiled code */

        public open val levelValue: com.google.home.google.SmokeLevelConcentrationMeasurementTrait.ConcentrationLevel? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: kotlin.UInt /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(measurementUnit: com.google.home.google.SmokeLevelConcentrationMeasurementTrait.MeasurementUnit? = COMPILED_CODE, measuredValue: kotlin.Int? = COMPILED_CODE, levelValue: com.google.home.google.SmokeLevelConcentrationMeasurementTrait.ConcentrationLevel? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.google.SmokeLevelConcentrationMeasurementTrait.AttributesImpl { /* compiled code */ }
    }
}

