// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public object SoilMoistureMeasurementTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.SoilMoistureMeasurementTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.SoilMoistureMeasurementTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.SoilMoistureMeasurementTrait.Attributes { /* compiled code */ }
        }

        public abstract val measuredValue: kotlin.UInt?

        public abstract val minMeasuredValue: kotlin.UInt?

        public abstract val maxMeasuredValue: kotlin.UInt?

        public abstract val tolerance: kotlin.UInt?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: kotlin.UInt

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(measuredValue: kotlin.UInt? = COMPILED_CODE, minMeasuredValue: kotlin.UInt? = COMPILED_CODE, maxMeasuredValue: kotlin.UInt? = COMPILED_CODE, tolerance: kotlin.UInt? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.google.SoilMoistureMeasurementTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.google.SoilMoistureMeasurementTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.google.SoilMoistureMeasurementTrait.Attributes) { /* compiled code */ }

        public open val measuredValue: kotlin.UInt? /* compiled code */

        public open val minMeasuredValue: kotlin.UInt? /* compiled code */

        public open val maxMeasuredValue: kotlin.UInt? /* compiled code */

        public open val tolerance: kotlin.UInt? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: kotlin.UInt /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(measuredValue: kotlin.UInt? = COMPILED_CODE, minMeasuredValue: kotlin.UInt? = COMPILED_CODE, maxMeasuredValue: kotlin.UInt? = COMPILED_CODE, tolerance: kotlin.UInt? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.google.SoilMoistureMeasurementTrait.AttributesImpl { /* compiled code */ }
    }
}
