// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface WiFiNetworkDiagnostics : com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.Attributes, com.google.home.matter.MatterTrait, com.google.home.matter.standard.WiFiNetworkDiagnosticsCommands {
    public companion object : com.google.home.TraitFactory<com.google.home.matter.standard.WiFiNetworkDiagnostics> {
        public final val bssid: com.google.home.automation.Attribute<kotlin.ByteArray?> /* compiled code */
            public final get

        public final val securityType: com.google.home.automation.Attribute<com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.SecurityTypeEnum?> /* compiled code */
            public final get

        public final val wiFiVersion: com.google.home.automation.Attribute<com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.WiFiVersionEnum?> /* compiled code */
            public final get

        public final val channelNumber: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val rssi: com.google.home.automation.Attribute<kotlin.Byte?> /* compiled code */
            public final get

        public final val beaconLostCount: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val beaconRxCount: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val packetMulticastRxCount: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val packetMulticastTxCount: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val packetUnicastRxCount: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val packetUnicastTxCount: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val currentMaxRate: com.google.home.automation.Attribute<kotlin.ULong?> /* compiled code */
            public final get

        public final val overrunCount: com.google.home.automation.Attribute<kotlin.ULong?> /* compiled code */
            public final get

        public final val generatedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val acceptedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val attributeList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val featureMap: com.google.home.automation.Attribute<com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.Feature> /* compiled code */
            public final get

        public final val clusterRevision: com.google.home.automation.Attribute<kotlin.UShort> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.WiFiNetworkDiagnostics?>.bssid: com.google.home.automation.TypedExpression<kotlin.ByteArray?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.WiFiNetworkDiagnostics?>.securityType: com.google.home.automation.TypedExpression<com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.SecurityTypeEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.WiFiNetworkDiagnostics?>.wiFiVersion: com.google.home.automation.TypedExpression<com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.WiFiVersionEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.WiFiNetworkDiagnostics?>.channelNumber: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.WiFiNetworkDiagnostics?>.rssi: com.google.home.automation.TypedExpression<kotlin.Byte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.WiFiNetworkDiagnostics?>.beaconLostCount: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.WiFiNetworkDiagnostics?>.beaconRxCount: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.WiFiNetworkDiagnostics?>.packetMulticastRxCount: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.WiFiNetworkDiagnostics?>.packetMulticastTxCount: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.WiFiNetworkDiagnostics?>.packetUnicastRxCount: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.WiFiNetworkDiagnostics?>.packetUnicastTxCount: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.WiFiNetworkDiagnostics?>.currentMaxRate: com.google.home.automation.TypedExpression<kotlin.ULong?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.WiFiNetworkDiagnostics?>.overrunCount: com.google.home.automation.TypedExpression<kotlin.ULong?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.WiFiNetworkDiagnostics?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.WiFiNetworkDiagnostics?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.WiFiNetworkDiagnostics?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.WiFiNetworkDiagnostics?>.featureMap: com.google.home.automation.TypedExpression<com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.Feature> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.WiFiNetworkDiagnostics?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        public final fun resetCounts(): com.google.home.automation.Command { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.matter.standard.WiFiNetworkDiagnostics> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.matter.standard.WiFiNetworkDiagnostics.Attribute): kotlin.Boolean

    public abstract fun supports(command: com.google.home.matter.standard.WiFiNetworkDiagnostics.Command): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.WiFiNetworkDiagnostics.Attribute> {
        @androidx.annotation.NonNull bssid,

        @androidx.annotation.NonNull securityType,

        @androidx.annotation.NonNull wiFiVersion,

        @androidx.annotation.NonNull channelNumber,

        @androidx.annotation.NonNull rssi,

        @androidx.annotation.NonNull beaconLostCount,

        @androidx.annotation.NonNull beaconRxCount,

        @androidx.annotation.NonNull packetMulticastRxCount,

        @androidx.annotation.NonNull packetMulticastTxCount,

        @androidx.annotation.NonNull packetUnicastRxCount,

        @androidx.annotation.NonNull packetUnicastTxCount,

        @androidx.annotation.NonNull currentMaxRate,

        @androidx.annotation.NonNull overrunCount,

        @androidx.annotation.NonNull generatedCommandList,

        @androidx.annotation.NonNull acceptedCommandList,

        @androidx.annotation.NonNull attributeList,

        @androidx.annotation.NonNull featureMap,

        @androidx.annotation.NonNull clusterRevision;

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

    public final enum class Command private constructor(tag: kotlin.UInt) : kotlin.Enum<com.google.home.matter.standard.WiFiNetworkDiagnostics.Command> {
        @androidx.annotation.NonNull ResetCounts;

        public final val tag: kotlin.UInt /* compiled code */
    }

    public final class DisconnectionEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.Disconnection) : com.google.home.Event, com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.Disconnection {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.WiFiNetworkDiagnostics.DisconnectionEvent> {
            public final val reasonCode: com.google.home.automation.EventField<kotlin.UShort?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.WiFiNetworkDiagnostics.DisconnectionEvent?>.reasonCode: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.Disconnection /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val reasonCode: kotlin.UShort? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.WiFiNetworkDiagnostics.DisconnectionEvent.EventFields> {
            @androidx.annotation.NonNull reasonCode;

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

    public final class AssociationFailureEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.AssociationFailure) : com.google.home.Event, com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.AssociationFailure {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.WiFiNetworkDiagnostics.AssociationFailureEvent> {
            public final val associationFailureCause: com.google.home.automation.EventField<com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.AssociationFailureCauseEnum?> /* compiled code */
                public final get

            public final val status: com.google.home.automation.EventField<kotlin.UShort?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.WiFiNetworkDiagnostics.AssociationFailureEvent?>.associationFailureCause: com.google.home.automation.TypedExpression<com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.AssociationFailureCauseEnum?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.WiFiNetworkDiagnostics.AssociationFailureEvent?>.status: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.AssociationFailure /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val associationFailureCause: com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.AssociationFailureCauseEnum? /* compiled code */

        public open val status: kotlin.UShort? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.WiFiNetworkDiagnostics.AssociationFailureEvent.EventFields> {
            @androidx.annotation.NonNull associationFailureCause,

            @androidx.annotation.NonNull status;

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

    public final class ConnectionStatusEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.ConnectionStatus) : com.google.home.Event, com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.ConnectionStatus {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.WiFiNetworkDiagnostics.ConnectionStatusEvent> {
            public final val connectionStatus: com.google.home.automation.EventField<com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.ConnectionStatusEnum?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.WiFiNetworkDiagnostics.ConnectionStatusEvent?>.connectionStatus: com.google.home.automation.TypedExpression<com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.ConnectionStatusEnum?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.ConnectionStatus /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val connectionStatus: com.google.home.matter.standard.WiFiNetworkDiagnosticsTrait.ConnectionStatusEnum? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.WiFiNetworkDiagnostics.ConnectionStatusEvent.EventFields> {
            @androidx.annotation.NonNull connectionStatus;

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

