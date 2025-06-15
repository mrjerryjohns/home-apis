// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object PressureMeasurementTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final data class Feature public constructor(extended: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.PressureMeasurementTrait.Feature> {
            private const final val EXTENDED_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.PressureMeasurementTrait.Feature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.PressureMeasurementTrait.Feature { /* compiled code */ }
        }

        public final val extended: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(extended: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.PressureMeasurementTrait.Feature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.PressureMeasurementTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.PressureMeasurementTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.PressureMeasurementTrait.Attributes { /* compiled code */ }
        }

        public abstract val measuredValue: kotlin.Short?

        public abstract val minMeasuredValue: kotlin.Short?

        public abstract val maxMeasuredValue: kotlin.Short?

        public abstract val tolerance: kotlin.UShort?

        public abstract val scaledValue: kotlin.Short?

        public abstract val minScaledValue: kotlin.Short?

        public abstract val maxScaledValue: kotlin.Short?

        public abstract val scaledTolerance: kotlin.UShort?

        public abstract val scale: kotlin.Byte?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: com.google.home.matter.standard.PressureMeasurementTrait.Feature

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(measuredValue: kotlin.Short? = COMPILED_CODE, minMeasuredValue: kotlin.Short? = COMPILED_CODE, maxMeasuredValue: kotlin.Short? = COMPILED_CODE, tolerance: kotlin.UShort? = COMPILED_CODE, scaledValue: kotlin.Short? = COMPILED_CODE, minScaledValue: kotlin.Short? = COMPILED_CODE, maxScaledValue: kotlin.Short? = COMPILED_CODE, scaledTolerance: kotlin.UShort? = COMPILED_CODE, scale: kotlin.Byte? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.PressureMeasurementTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.matter.standard.PressureMeasurementTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.PressureMeasurementTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.PressureMeasurementTrait.Attributes) { /* compiled code */ }

        public open val measuredValue: kotlin.Short? /* compiled code */

        public open val minMeasuredValue: kotlin.Short? /* compiled code */

        public open val maxMeasuredValue: kotlin.Short? /* compiled code */

        public open val tolerance: kotlin.UShort? /* compiled code */

        public open val scaledValue: kotlin.Short? /* compiled code */

        public open val minScaledValue: kotlin.Short? /* compiled code */

        public open val maxScaledValue: kotlin.Short? /* compiled code */

        public open val scaledTolerance: kotlin.UShort? /* compiled code */

        public open val scale: kotlin.Byte? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: com.google.home.matter.standard.PressureMeasurementTrait.Feature /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(measuredValue: kotlin.Short? = COMPILED_CODE, minMeasuredValue: kotlin.Short? = COMPILED_CODE, maxMeasuredValue: kotlin.Short? = COMPILED_CODE, tolerance: kotlin.UShort? = COMPILED_CODE, scaledValue: kotlin.Short? = COMPILED_CODE, minScaledValue: kotlin.Short? = COMPILED_CODE, maxScaledValue: kotlin.Short? = COMPILED_CODE, scaledTolerance: kotlin.UShort? = COMPILED_CODE, scale: kotlin.Byte? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.PressureMeasurementTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.matter.standard.PressureMeasurementTrait.AttributesImpl { /* compiled code */ }
    }
}

