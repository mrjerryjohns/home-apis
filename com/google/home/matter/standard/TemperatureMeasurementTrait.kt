// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object TemperatureMeasurementTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.TemperatureMeasurementTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.TemperatureMeasurementTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.TemperatureMeasurementTrait.Attributes { /* compiled code */ }
        }

        public abstract val measuredValue: kotlin.Short?

        public abstract val minMeasuredValue: kotlin.Short?

        public abstract val maxMeasuredValue: kotlin.Short?

        public abstract val tolerance: kotlin.UShort?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: kotlin.UInt

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(measuredValue: kotlin.Short? = COMPILED_CODE, minMeasuredValue: kotlin.Short? = COMPILED_CODE, maxMeasuredValue: kotlin.Short? = COMPILED_CODE, tolerance: kotlin.UShort? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.matter.standard.TemperatureMeasurementTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.TemperatureMeasurementTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.TemperatureMeasurementTrait.Attributes) { /* compiled code */ }

        public open val measuredValue: kotlin.Short? /* compiled code */

        public open val minMeasuredValue: kotlin.Short? /* compiled code */

        public open val maxMeasuredValue: kotlin.Short? /* compiled code */

        public open val tolerance: kotlin.UShort? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: kotlin.UInt /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(measuredValue: kotlin.Short? = COMPILED_CODE, minMeasuredValue: kotlin.Short? = COMPILED_CODE, maxMeasuredValue: kotlin.Short? = COMPILED_CODE, tolerance: kotlin.UShort? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.matter.standard.TemperatureMeasurementTrait.AttributesImpl { /* compiled code */ }
    }
}
