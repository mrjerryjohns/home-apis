// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public object ExtendedGeneralDiagnosticsTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class ExtendedHardwareFault private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.ExtendedGeneralDiagnosticsTrait.ExtendedHardwareFault> {
        @androidx.annotation.NonNull Standard,

        @androidx.annotation.NonNull AudioOutputFault,

        @androidx.annotation.NonNull PiezoFault,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.ExtendedGeneralDiagnosticsTrait.ExtendedHardwareFault> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class SensorFaultType private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.ExtendedGeneralDiagnosticsTrait.SensorFaultType> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull Smoke,

        @androidx.annotation.NonNull CO,

        @androidx.annotation.NonNull Led,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.ExtendedGeneralDiagnosticsTrait.SensorFaultType> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public interface ExtendedHardwareFaultChange {
        public abstract val priority: kotlin.UInt?

        public abstract val current: kotlin.collections.List<com.google.home.google.ExtendedGeneralDiagnosticsTrait.ExtendedHardwareFault>?

        public abstract val currentSensorFaults: kotlin.collections.List<com.google.home.google.ExtendedGeneralDiagnosticsTrait.SensorFaultType>?

        public abstract val previous: kotlin.collections.List<com.google.home.google.ExtendedGeneralDiagnosticsTrait.ExtendedHardwareFault>?

        public abstract val previousSensorFaults: kotlin.collections.List<com.google.home.google.ExtendedGeneralDiagnosticsTrait.SensorFaultType>?
    }

    public final class ExtendedHardwareFaultChangeImpl public constructor(priority: kotlin.UInt? = COMPILED_CODE, current: kotlin.collections.List<com.google.home.google.ExtendedGeneralDiagnosticsTrait.ExtendedHardwareFault>? = COMPILED_CODE, currentSensorFaults: kotlin.collections.List<com.google.home.google.ExtendedGeneralDiagnosticsTrait.SensorFaultType>? = COMPILED_CODE, previous: kotlin.collections.List<com.google.home.google.ExtendedGeneralDiagnosticsTrait.ExtendedHardwareFault>? = COMPILED_CODE, previousSensorFaults: kotlin.collections.List<com.google.home.google.ExtendedGeneralDiagnosticsTrait.SensorFaultType>? = COMPILED_CODE) : com.google.home.google.ExtendedGeneralDiagnosticsTrait.ExtendedHardwareFaultChange {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ExtendedGeneralDiagnosticsTrait.ExtendedHardwareFaultChange> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ExtendedGeneralDiagnosticsTrait.ExtendedHardwareFaultChange): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ExtendedGeneralDiagnosticsTrait.ExtendedHardwareFaultChange { /* compiled code */ }
        }

        public open val priority: kotlin.UInt? /* compiled code */

        public open val current: kotlin.collections.List<com.google.home.google.ExtendedGeneralDiagnosticsTrait.ExtendedHardwareFault>? /* compiled code */

        public open val currentSensorFaults: kotlin.collections.List<com.google.home.google.ExtendedGeneralDiagnosticsTrait.SensorFaultType>? /* compiled code */

        public open val previous: kotlin.collections.List<com.google.home.google.ExtendedGeneralDiagnosticsTrait.ExtendedHardwareFault>? /* compiled code */

        public open val previousSensorFaults: kotlin.collections.List<com.google.home.google.ExtendedGeneralDiagnosticsTrait.SensorFaultType>? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ExtendedGeneralDiagnosticsTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ExtendedGeneralDiagnosticsTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ExtendedGeneralDiagnosticsTrait.Attributes { /* compiled code */ }
        }

        public abstract val extendedActiveHardwareFaults: kotlin.collections.List<com.google.home.google.ExtendedGeneralDiagnosticsTrait.ExtendedHardwareFault>?

        public abstract val sensorFaults: kotlin.collections.List<com.google.home.google.ExtendedGeneralDiagnosticsTrait.SensorFaultType>?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: kotlin.UInt

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(extendedActiveHardwareFaults: kotlin.collections.List<com.google.home.google.ExtendedGeneralDiagnosticsTrait.ExtendedHardwareFault>? = COMPILED_CODE, sensorFaults: kotlin.collections.List<com.google.home.google.ExtendedGeneralDiagnosticsTrait.SensorFaultType>? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.google.ExtendedGeneralDiagnosticsTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.google.ExtendedGeneralDiagnosticsTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.google.ExtendedGeneralDiagnosticsTrait.Attributes) { /* compiled code */ }

        public open val extendedActiveHardwareFaults: kotlin.collections.List<com.google.home.google.ExtendedGeneralDiagnosticsTrait.ExtendedHardwareFault>? /* compiled code */

        public open val sensorFaults: kotlin.collections.List<com.google.home.google.ExtendedGeneralDiagnosticsTrait.SensorFaultType>? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: kotlin.UInt /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(extendedActiveHardwareFaults: kotlin.collections.List<com.google.home.google.ExtendedGeneralDiagnosticsTrait.ExtendedHardwareFault>? = COMPILED_CODE, sensorFaults: kotlin.collections.List<com.google.home.google.ExtendedGeneralDiagnosticsTrait.SensorFaultType>? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.google.ExtendedGeneralDiagnosticsTrait.AttributesImpl { /* compiled code */ }
    }
}
