// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object EthernetNetworkDiagnosticsTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class PhyRateEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.EthernetNetworkDiagnosticsTrait.PhyRateEnum> {
        @androidx.annotation.NonNull Rate10M,

        @androidx.annotation.NonNull Rate100M,

        @androidx.annotation.NonNull Rate1G,

        @androidx.annotation.NonNull Rate25G,

        @androidx.annotation.NonNull Rate5G,

        @androidx.annotation.NonNull Rate10G,

        @androidx.annotation.NonNull Rate40G,

        @androidx.annotation.NonNull Rate100G,

        @androidx.annotation.NonNull Rate200G,

        @androidx.annotation.NonNull Rate400G,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.EthernetNetworkDiagnosticsTrait.PhyRateEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final data class Feature public constructor(packetCounts: kotlin.Boolean = COMPILED_CODE, errorCounts: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.EthernetNetworkDiagnosticsTrait.Feature> {
            private const final val PACKET_COUNTS_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val ERROR_COUNTS_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.EthernetNetworkDiagnosticsTrait.Feature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.EthernetNetworkDiagnosticsTrait.Feature { /* compiled code */ }
        }

        public final val packetCounts: kotlin.Boolean /* compiled code */

        public final val errorCounts: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(packetCounts: kotlin.Boolean = COMPILED_CODE, errorCounts: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.EthernetNetworkDiagnosticsTrait.Feature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.EthernetNetworkDiagnosticsTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.EthernetNetworkDiagnosticsTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.EthernetNetworkDiagnosticsTrait.Attributes { /* compiled code */ }
        }

        public abstract val phyRate: com.google.home.matter.standard.EthernetNetworkDiagnosticsTrait.PhyRateEnum?

        public abstract val fullDuplex: kotlin.Boolean?

        public abstract val packetRxCount: kotlin.ULong?

        public abstract val packetTxCount: kotlin.ULong?

        public abstract val txErrCount: kotlin.ULong?

        public abstract val collisionCount: kotlin.ULong?

        public abstract val overrunCount: kotlin.ULong?

        public abstract val carrierDetect: kotlin.Boolean?

        public abstract val timeSinceReset: kotlin.ULong?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: com.google.home.matter.standard.EthernetNetworkDiagnosticsTrait.Feature

        public abstract val clusterRevision: kotlin.UShort
    }

        public open class AttributesImpl public constructor(phyRate: com.google.home.matter.standard.EthernetNetworkDiagnosticsTrait.PhyRateEnum? = COMPILED_CODE, fullDuplex: kotlin.Boolean? = COMPILED_CODE, packetRxCount: kotlin.ULong? = COMPILED_CODE, packetTxCount: kotlin.ULong? = COMPILED_CODE, txErrCount: kotlin.ULong? = COMPILED_CODE, collisionCount: kotlin.ULong? = COMPILED_CODE, overrunCount: kotlin.ULong? = COMPILED_CODE, carrierDetect: kotlin.Boolean? = COMPILED_CODE, timeSinceReset: kotlin.ULong? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap:
        com.google.home.matter.standard.EthernetNetworkDiagnosticsTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.matter.standard.EthernetNetworkDiagnosticsTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.EthernetNetworkDiagnosticsTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.EthernetNetworkDiagnosticsTrait.Attributes) { /* compiled code */ }

        public open val phyRate: com.google.home.matter.standard.EthernetNetworkDiagnosticsTrait.PhyRateEnum? /* compiled code */

        public open val fullDuplex: kotlin.Boolean? /* compiled code */

        public open val packetRxCount: kotlin.ULong? /* compiled code */

        public open val packetTxCount: kotlin.ULong? /* compiled code */

        public open val txErrCount: kotlin.ULong? /* compiled code */

        public open val collisionCount: kotlin.ULong? /* compiled code */

        public open val overrunCount: kotlin.ULong? /* compiled code */

        public open val carrierDetect: kotlin.Boolean? /* compiled code */

        public open val timeSinceReset: kotlin.ULong? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: com.google.home.matter.standard.EthernetNetworkDiagnosticsTrait.Feature /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

                public final fun copy(phyRate: com.google.home.matter.standard.EthernetNetworkDiagnosticsTrait.PhyRateEnum? = COMPILED_CODE, fullDuplex: kotlin.Boolean? = COMPILED_CODE, packetRxCount: kotlin.ULong? = COMPILED_CODE, packetTxCount: kotlin.ULong? = COMPILED_CODE, txErrCount: kotlin.ULong? = COMPILED_CODE, collisionCount: kotlin.ULong? = COMPILED_CODE, overrunCount: kotlin.ULong? = COMPILED_CODE, carrierDetect: kotlin.Boolean? = COMPILED_CODE, timeSinceReset: kotlin.ULong? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap:
            com.google.home.matter.standard.EthernetNetworkDiagnosticsTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.matter.standard.EthernetNetworkDiagnosticsTrait.AttributesImpl { /* compiled code */ }
    }

    public object ResetCountsCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final class Request public constructor() {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.EthernetNetworkDiagnosticsTrait.ResetCountsCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.EthernetNetworkDiagnosticsTrait.ResetCountsCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.EthernetNetworkDiagnosticsTrait.ResetCountsCommand.Request { /* compiled code */ }
            }

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.EthernetNetworkDiagnosticsTrait.ResetCountsCommand.Request.CommandFields> {
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
        }
    }
}
