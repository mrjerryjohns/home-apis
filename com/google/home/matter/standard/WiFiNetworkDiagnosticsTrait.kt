// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object WiFiNetworkDiagnosticsTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class AssociationFailureCauseEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.AssociationFailureCauseEnum> {
        @androidx.annotation.NonNull Unknown,

        @androidx.annotation.NonNull AssociationFailed,

        @androidx.annotation.NonNull AuthenticationFailed,

        @androidx.annotation.NonNull SsidNotFound,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.AssociationFailureCauseEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class ConnectionStatusEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.ConnectionStatusEnum> {
        @androidx.annotation.NonNull Connected,

        @androidx.annotation.NonNull NotConnected,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.ConnectionStatusEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class SecurityTypeEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.SecurityTypeEnum> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull None,

        @androidx.annotation.NonNull WEP,

        @androidx.annotation.NonNull WPA,

        @androidx.annotation.NonNull WPA2,

        @androidx.annotation.NonNull WPA3,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.SecurityTypeEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class WiFiVersionEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.WiFiVersionEnum> {
        @androidx.annotation.NonNull A,

        @androidx.annotation.NonNull B,

        @androidx.annotation.NonNull G,

        @androidx.annotation.NonNull N,

        @androidx.annotation.NonNull Ac,

        @androidx.annotation.NonNull Ax,

        @androidx.annotation.NonNull Ah,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.WiFiVersionEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final data class Feature public constructor(packetCounts: kotlin.Boolean = COMPILED_CODE, errorCounts: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.Feature> {
            private const final val PACKET_COUNTS_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val ERROR_COUNTS_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.Feature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.Feature { /* compiled code */ }
        }

        public final val packetCounts: kotlin.Boolean /* compiled code */

        public final val errorCounts: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(packetCounts: kotlin.Boolean = COMPILED_CODE, errorCounts: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.Feature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface Disconnection {
        public abstract val reasonCode: kotlin.UShort?
    }

    public final class DisconnectionImpl public constructor(reasonCode: kotlin.UShort? = COMPILED_CODE) : com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.Disconnection {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.Disconnection> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.Disconnection): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.Disconnection { /* compiled code */ }
        }

        public open val reasonCode: kotlin.UShort? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface AssociationFailure {
        public abstract val associationFailureCause: com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.AssociationFailureCauseEnum?

        public abstract val status: kotlin.UShort?
    }

    public final class AssociationFailureImpl public constructor(associationFailureCause: com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.AssociationFailureCauseEnum? = COMPILED_CODE, status: kotlin.UShort? = COMPILED_CODE) : com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.AssociationFailure {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.AssociationFailure> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.AssociationFailure): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.AssociationFailure { /* compiled code */ }
        }

        public open val associationFailureCause: com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.AssociationFailureCauseEnum? /* compiled code */

        public open val status: kotlin.UShort? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface ConnectionStatus {
        public abstract val connectionStatus: com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.ConnectionStatusEnum?
    }

    public final class ConnectionStatusImpl public constructor(connectionStatus: com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.ConnectionStatusEnum? = COMPILED_CODE) : com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.ConnectionStatus {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.ConnectionStatus> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.ConnectionStatus): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.ConnectionStatus { /* compiled code */ }
        }

        public open val connectionStatus: com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.ConnectionStatusEnum? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.Attributes { /* compiled code */ }
        }

        public abstract val bssid: kotlin.ByteArray?

        public abstract val securityType: com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.SecurityTypeEnum?

        public abstract val wiFiVersion: com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.WiFiVersionEnum?

        public abstract val channelNumber: kotlin.UShort?

        public abstract val rssi: kotlin.Byte?

        public abstract val beaconLostCount: kotlin.UInt?

        public abstract val beaconRxCount: kotlin.UInt?

        public abstract val packetMulticastRxCount: kotlin.UInt?

        public abstract val packetMulticastTxCount: kotlin.UInt?

        public abstract val packetUnicastRxCount: kotlin.UInt?

        public abstract val packetUnicastTxCount: kotlin.UInt?

        public abstract val currentMaxRate: kotlin.ULong?

        public abstract val overrunCount: kotlin.ULong?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.Feature

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(bssid: kotlin.ByteArray? = COMPILED_CODE, securityType: com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.SecurityTypeEnum? = COMPILED_CODE, wiFiVersion: com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.WiFiVersionEnum? = COMPILED_CODE, channelNumber: kotlin.UShort? = COMPILED_CODE, rssi: kotlin.Byte? = COMPILED_CODE, beaconLostCount: kotlin.UInt? = COMPILED_CODE, beaconRxCount: kotlin.UInt? = COMPILED_CODE, packetMulticastRxCount: kotlin.UInt? = COMPILED_CODE, packetMulticastTxCount: kotlin.UInt? = COMPILED_CODE, packetUnicastRxCount: kotlin.UInt? = COMPILED_CODE, packetUnicastTxCount: kotlin.UInt? = COMPILED_CODE, currentMaxRate: kotlin.ULong? = COMPILED_CODE, overrunCount: kotlin.ULong? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.Attributes) { /* compiled code */ }

        public open val bssid: kotlin.ByteArray? /* compiled code */

        public open val securityType: com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.SecurityTypeEnum? /* compiled code */

        public open val wiFiVersion: com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.WiFiVersionEnum? /* compiled code */

        public open val channelNumber: kotlin.UShort? /* compiled code */

        public open val rssi: kotlin.Byte? /* compiled code */

        public open val beaconLostCount: kotlin.UInt? /* compiled code */

        public open val beaconRxCount: kotlin.UInt? /* compiled code */

        public open val packetMulticastRxCount: kotlin.UInt? /* compiled code */

        public open val packetMulticastTxCount: kotlin.UInt? /* compiled code */

        public open val packetUnicastRxCount: kotlin.UInt? /* compiled code */

        public open val packetUnicastTxCount: kotlin.UInt? /* compiled code */

        public open val currentMaxRate: kotlin.ULong? /* compiled code */

        public open val overrunCount: kotlin.ULong? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.Feature /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(bssid: kotlin.ByteArray? = COMPILED_CODE, securityType: com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.SecurityTypeEnum? = COMPILED_CODE, wiFiVersion: com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.WiFiVersionEnum? = COMPILED_CODE, channelNumber: kotlin.UShort? = COMPILED_CODE, rssi: kotlin.Byte? = COMPILED_CODE, beaconLostCount: kotlin.UInt? = COMPILED_CODE, beaconRxCount: kotlin.UInt? = COMPILED_CODE, packetMulticastRxCount: kotlin.UInt? = COMPILED_CODE, packetMulticastTxCount: kotlin.UInt? = COMPILED_CODE, packetUnicastRxCount: kotlin.UInt? = COMPILED_CODE, packetUnicastTxCount: kotlin.UInt? = COMPILED_CODE, currentMaxRate: kotlin.ULong? = COMPILED_CODE, overrunCount: kotlin.ULong? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.AttributesImpl { /* compiled code */ }
    }

    public object ResetCountsCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final class Request public constructor() {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.ResetCountsCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.ResetCountsCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.ResetCountsCommand.Request { /* compiled code */ }
            }

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.ResetCountsCommand.Request.CommandFields> {
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

