// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object ThreadNetworkDiagnosticsTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class ConnectionStatusEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.ConnectionStatusEnum> {
        @androidx.annotation.NonNull Connected,

        @androidx.annotation.NonNull NotConnected,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.ConnectionStatusEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class NetworkFaultEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.NetworkFaultEnum> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull LinkDown,

        @androidx.annotation.NonNull HardwareFailure,

        @androidx.annotation.NonNull NetworkJammed,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.NetworkFaultEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class RoutingRoleEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.RoutingRoleEnum> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull Unassigned,

        @androidx.annotation.NonNull SleepyEndDevice,

        @androidx.annotation.NonNull EndDevice,

        @androidx.annotation.NonNull REED,

        @androidx.annotation.NonNull Router,

        @androidx.annotation.NonNull Leader,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.RoutingRoleEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final data class Feature public constructor(packetCounts: kotlin.Boolean = COMPILED_CODE, errorCounts: kotlin.Boolean = COMPILED_CODE, mleCounts: kotlin.Boolean = COMPILED_CODE, macCounts: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.Feature> {
            private const final val PACKET_COUNTS_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val ERROR_COUNTS_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val MLE_COUNTS_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val MAC_COUNTS_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.Feature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.Feature { /* compiled code */ }
        }

        public final val packetCounts: kotlin.Boolean /* compiled code */

        public final val errorCounts: kotlin.Boolean /* compiled code */

        public final val mleCounts: kotlin.Boolean /* compiled code */

        public final val macCounts: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(packetCounts: kotlin.Boolean = COMPILED_CODE, errorCounts: kotlin.Boolean = COMPILED_CODE, mleCounts: kotlin.Boolean = COMPILED_CODE, macCounts: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.Feature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface ConnectionStatus {
        public abstract val connectionStatus: com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.ConnectionStatusEnum?
    }

    public final class ConnectionStatusImpl public constructor(connectionStatus: com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.ConnectionStatusEnum? = COMPILED_CODE) : com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.ConnectionStatus {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.ConnectionStatus> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.ConnectionStatus): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.ConnectionStatus { /* compiled code */ }
        }

        public open val connectionStatus: com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.ConnectionStatusEnum? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface NetworkFaultChange {
        public abstract val current: kotlin.collections.List<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.NetworkFaultEnum>?

        public abstract val previous: kotlin.collections.List<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.NetworkFaultEnum>?
    }

    public final class NetworkFaultChangeImpl public constructor(current: kotlin.collections.List<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.NetworkFaultEnum>? = COMPILED_CODE, previous: kotlin.collections.List<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.NetworkFaultEnum>? = COMPILED_CODE) : com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.NetworkFaultChange {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.NetworkFaultChange> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.NetworkFaultChange): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.NetworkFaultChange { /* compiled code */ }
        }

        public open val current: kotlin.collections.List<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.NetworkFaultEnum>? /* compiled code */

        public open val previous: kotlin.collections.List<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.NetworkFaultEnum>? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final class NeighborTableStruct public constructor(extAddress: kotlin.ULong = COMPILED_CODE, age: kotlin.UInt = COMPILED_CODE, rloc16: kotlin.UShort = COMPILED_CODE, linkFrameCounter: kotlin.UInt = COMPILED_CODE, mleFrameCounter: kotlin.UInt = COMPILED_CODE, lqi: kotlin.UByte = COMPILED_CODE, averageRssi: kotlin.Byte? = COMPILED_CODE, lastRssi: kotlin.Byte? = COMPILED_CODE, frameErrorRate: kotlin.UByte = COMPILED_CODE, messageErrorRate: kotlin.UByte = COMPILED_CODE, rxOnWhenIdle: kotlin.Boolean = COMPILED_CODE, fullThreadDevice: kotlin.Boolean = COMPILED_CODE, fullNetworkData: kotlin.Boolean = COMPILED_CODE, isChild: kotlin.Boolean = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.NeighborTableStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.NeighborTableStruct?>.extAddress: com.google.home.automation.TypedExpression<kotlin.ULong> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.NeighborTableStruct?>.age: com.google.home.automation.TypedExpression<kotlin.UInt> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.NeighborTableStruct?>.rloc16: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.NeighborTableStruct?>.linkFrameCounter: com.google.home.automation.TypedExpression<kotlin.UInt> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.NeighborTableStruct?>.mleFrameCounter: com.google.home.automation.TypedExpression<kotlin.UInt> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.NeighborTableStruct?>.lqi: com.google.home.automation.TypedExpression<kotlin.UByte> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.NeighborTableStruct?>.averageRssi: com.google.home.automation.TypedExpression<kotlin.Byte?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.NeighborTableStruct?>.lastRssi: com.google.home.automation.TypedExpression<kotlin.Byte?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.NeighborTableStruct?>.frameErrorRate: com.google.home.automation.TypedExpression<kotlin.UByte> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.NeighborTableStruct?>.messageErrorRate: com.google.home.automation.TypedExpression<kotlin.UByte> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.NeighborTableStruct?>.rxOnWhenIdle: com.google.home.automation.TypedExpression<kotlin.Boolean> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.NeighborTableStruct?>.fullThreadDevice: com.google.home.automation.TypedExpression<kotlin.Boolean> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.NeighborTableStruct?>.fullNetworkData: com.google.home.automation.TypedExpression<kotlin.Boolean> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.NeighborTableStruct?>.isChild: com.google.home.automation.TypedExpression<kotlin.Boolean> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.NeighborTableStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.NeighborTableStruct { /* compiled code */ }
        }

        public final val extAddress: kotlin.ULong /* compiled code */

        public final val age: kotlin.UInt /* compiled code */

        public final val rloc16: kotlin.UShort /* compiled code */

        public final val linkFrameCounter: kotlin.UInt /* compiled code */

        public final val mleFrameCounter: kotlin.UInt /* compiled code */

        public final val lqi: kotlin.UByte /* compiled code */

        public final val averageRssi: kotlin.Byte? /* compiled code */

        public final val lastRssi: kotlin.Byte? /* compiled code */

        public final val frameErrorRate: kotlin.UByte /* compiled code */

        public final val messageErrorRate: kotlin.UByte /* compiled code */

        public final val rxOnWhenIdle: kotlin.Boolean /* compiled code */

        public final val fullThreadDevice: kotlin.Boolean /* compiled code */

        public final val fullNetworkData: kotlin.Boolean /* compiled code */

        public final val isChild: kotlin.Boolean /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.NeighborTableStruct.StructFields> {
            @androidx.annotation.NonNull extAddress,

            @androidx.annotation.NonNull age,

            @androidx.annotation.NonNull rloc16,

            @androidx.annotation.NonNull linkFrameCounter,

            @androidx.annotation.NonNull mleFrameCounter,

            @androidx.annotation.NonNull lqi,

            @androidx.annotation.NonNull averageRssi,

            @androidx.annotation.NonNull lastRssi,

            @androidx.annotation.NonNull frameErrorRate,

            @androidx.annotation.NonNull messageErrorRate,

            @androidx.annotation.NonNull rxOnWhenIdle,

            @androidx.annotation.NonNull fullThreadDevice,

            @androidx.annotation.NonNull fullNetworkData,

            @androidx.annotation.NonNull isChild;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class OperationalDatasetComponents public constructor(activeTimestampPresent: kotlin.Boolean = COMPILED_CODE, pendingTimestampPresent: kotlin.Boolean = COMPILED_CODE, masterKeyPresent: kotlin.Boolean = COMPILED_CODE, networkNamePresent: kotlin.Boolean = COMPILED_CODE, extendedPanIdPresent: kotlin.Boolean = COMPILED_CODE, meshLocalPrefixPresent: kotlin.Boolean = COMPILED_CODE, delayPresent: kotlin.Boolean = COMPILED_CODE, panIdPresent: kotlin.Boolean = COMPILED_CODE, channelPresent: kotlin.Boolean = COMPILED_CODE, pskcPresent: kotlin.Boolean = COMPILED_CODE, securityPolicyPresent: kotlin.Boolean = COMPILED_CODE, channelMaskPresent: kotlin.Boolean = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.OperationalDatasetComponents>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.OperationalDatasetComponents?>.activeTimestampPresent: com.google.home.automation.TypedExpression<kotlin.Boolean> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.OperationalDatasetComponents?>.pendingTimestampPresent: com.google.home.automation.TypedExpression<kotlin.Boolean> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.OperationalDatasetComponents?>.masterKeyPresent: com.google.home.automation.TypedExpression<kotlin.Boolean> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.OperationalDatasetComponents?>.networkNamePresent: com.google.home.automation.TypedExpression<kotlin.Boolean> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.OperationalDatasetComponents?>.extendedPanIdPresent: com.google.home.automation.TypedExpression<kotlin.Boolean> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.OperationalDatasetComponents?>.meshLocalPrefixPresent: com.google.home.automation.TypedExpression<kotlin.Boolean> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.OperationalDatasetComponents?>.delayPresent: com.google.home.automation.TypedExpression<kotlin.Boolean> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.OperationalDatasetComponents?>.panIdPresent: com.google.home.automation.TypedExpression<kotlin.Boolean> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.OperationalDatasetComponents?>.channelPresent: com.google.home.automation.TypedExpression<kotlin.Boolean> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.OperationalDatasetComponents?>.pskcPresent: com.google.home.automation.TypedExpression<kotlin.Boolean> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.OperationalDatasetComponents?>.securityPolicyPresent: com.google.home.automation.TypedExpression<kotlin.Boolean> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.OperationalDatasetComponents?>.channelMaskPresent: com.google.home.automation.TypedExpression<kotlin.Boolean> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.OperationalDatasetComponents): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.OperationalDatasetComponents { /* compiled code */ }
        }

        public final val activeTimestampPresent: kotlin.Boolean /* compiled code */

        public final val pendingTimestampPresent: kotlin.Boolean /* compiled code */

        public final val masterKeyPresent: kotlin.Boolean /* compiled code */

        public final val networkNamePresent: kotlin.Boolean /* compiled code */

        public final val extendedPanIdPresent: kotlin.Boolean /* compiled code */

        public final val meshLocalPrefixPresent: kotlin.Boolean /* compiled code */

        public final val delayPresent: kotlin.Boolean /* compiled code */

        public final val panIdPresent: kotlin.Boolean /* compiled code */

        public final val channelPresent: kotlin.Boolean /* compiled code */

        public final val pskcPresent: kotlin.Boolean /* compiled code */

        public final val securityPolicyPresent: kotlin.Boolean /* compiled code */

        public final val channelMaskPresent: kotlin.Boolean /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.OperationalDatasetComponents.StructFields> {
            @androidx.annotation.NonNull activeTimestampPresent,

            @androidx.annotation.NonNull pendingTimestampPresent,

            @androidx.annotation.NonNull masterKeyPresent,

            @androidx.annotation.NonNull networkNamePresent,

            @androidx.annotation.NonNull extendedPanIdPresent,

            @androidx.annotation.NonNull meshLocalPrefixPresent,

            @androidx.annotation.NonNull delayPresent,

            @androidx.annotation.NonNull panIdPresent,

            @androidx.annotation.NonNull channelPresent,

            @androidx.annotation.NonNull pskcPresent,

            @androidx.annotation.NonNull securityPolicyPresent,

            @androidx.annotation.NonNull channelMaskPresent;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class RouteTableStruct public constructor(extAddress: kotlin.ULong = COMPILED_CODE, rloc16: kotlin.UShort = COMPILED_CODE, routerId: kotlin.UByte = COMPILED_CODE, nextHop: kotlin.UByte = COMPILED_CODE, pathCost: kotlin.UByte = COMPILED_CODE, lqiIn: kotlin.UByte = COMPILED_CODE, lqiOut: kotlin.UByte = COMPILED_CODE, age: kotlin.UByte = COMPILED_CODE, allocated: kotlin.Boolean = COMPILED_CODE, linkEstablished: kotlin.Boolean = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.RouteTableStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.RouteTableStruct?>.extAddress: com.google.home.automation.TypedExpression<kotlin.ULong> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.RouteTableStruct?>.rloc16: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.RouteTableStruct?>.routerId: com.google.home.automation.TypedExpression<kotlin.UByte> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.RouteTableStruct?>.nextHop: com.google.home.automation.TypedExpression<kotlin.UByte> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.RouteTableStruct?>.pathCost: com.google.home.automation.TypedExpression<kotlin.UByte> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.RouteTableStruct?>.lqiIn: com.google.home.automation.TypedExpression<kotlin.UByte> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.RouteTableStruct?>.lqiOut: com.google.home.automation.TypedExpression<kotlin.UByte> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.RouteTableStruct?>.age: com.google.home.automation.TypedExpression<kotlin.UByte> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.RouteTableStruct?>.allocated: com.google.home.automation.TypedExpression<kotlin.Boolean> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.RouteTableStruct?>.linkEstablished: com.google.home.automation.TypedExpression<kotlin.Boolean> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.RouteTableStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.RouteTableStruct { /* compiled code */ }
        }

        public final val extAddress: kotlin.ULong /* compiled code */

        public final val rloc16: kotlin.UShort /* compiled code */

        public final val routerId: kotlin.UByte /* compiled code */

        public final val nextHop: kotlin.UByte /* compiled code */

        public final val pathCost: kotlin.UByte /* compiled code */

        public final val lqiIn: kotlin.UByte /* compiled code */

        public final val lqiOut: kotlin.UByte /* compiled code */

        public final val age: kotlin.UByte /* compiled code */

        public final val allocated: kotlin.Boolean /* compiled code */

        public final val linkEstablished: kotlin.Boolean /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.RouteTableStruct.StructFields> {
            @androidx.annotation.NonNull extAddress,

            @androidx.annotation.NonNull rloc16,

            @androidx.annotation.NonNull routerId,

            @androidx.annotation.NonNull nextHop,

            @androidx.annotation.NonNull pathCost,

            @androidx.annotation.NonNull lqiIn,

            @androidx.annotation.NonNull lqiOut,

            @androidx.annotation.NonNull age,

            @androidx.annotation.NonNull allocated,

            @androidx.annotation.NonNull linkEstablished;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class SecurityPolicy public constructor(rotationTime: kotlin.UShort = COMPILED_CODE, flags: kotlin.UShort = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.SecurityPolicy>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.SecurityPolicy?>.rotationTime: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.SecurityPolicy?>.flags: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.SecurityPolicy): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.SecurityPolicy { /* compiled code */ }
        }

        public final val rotationTime: kotlin.UShort /* compiled code */

        public final val flags: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.SecurityPolicy.StructFields> {
            @androidx.annotation.NonNull rotationTime,

            @androidx.annotation.NonNull flags;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.Attributes { /* compiled code */ }
        }

        public abstract val channel: kotlin.UShort?

        public abstract val routingRole: com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.RoutingRoleEnum?

        public abstract val networkName: kotlin.String?

        public abstract val panId: kotlin.UShort?

        public abstract val extendedPanId: kotlin.ULong?

        public abstract val meshLocalPrefix: kotlin.ByteArray?

        public abstract val overrunCount: kotlin.ULong?

        public abstract val neighborTable: kotlin.collections.List<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.NeighborTableStruct>?

        public abstract val routeTable: kotlin.collections.List<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.RouteTableStruct>?

        public abstract val partitionId: kotlin.UInt?

        public abstract val weighting: kotlin.UShort?

        public abstract val dataVersion: kotlin.UShort?

        public abstract val stableDataVersion: kotlin.UShort?

        public abstract val leaderRouterId: kotlin.UByte?

        public abstract val detachedRoleCount: kotlin.UShort?

        public abstract val childRoleCount: kotlin.UShort?

        public abstract val routerRoleCount: kotlin.UShort?

        public abstract val leaderRoleCount: kotlin.UShort?

        public abstract val attachAttemptCount: kotlin.UShort?

        public abstract val partitionIdChangeCount: kotlin.UShort?

        public abstract val betterPartitionAttachAttemptCount: kotlin.UShort?

        public abstract val parentChangeCount: kotlin.UShort?

        public abstract val txTotalCount: kotlin.UInt?

        public abstract val txUnicastCount: kotlin.UInt?

        public abstract val txBroadcastCount: kotlin.UInt?

        public abstract val txAckRequestedCount: kotlin.UInt?

        public abstract val txAckedCount: kotlin.UInt?

        public abstract val txNoAckRequestedCount: kotlin.UInt?

        public abstract val txDataCount: kotlin.UInt?

        public abstract val txDataPollCount: kotlin.UInt?

        public abstract val txBeaconCount: kotlin.UInt?

        public abstract val txBeaconRequestCount: kotlin.UInt?

        public abstract val txOtherCount: kotlin.UInt?

        public abstract val txRetryCount: kotlin.UInt?

        public abstract val txDirectMaxRetryExpiryCount: kotlin.UInt?

        public abstract val txIndirectMaxRetryExpiryCount: kotlin.UInt?

        public abstract val txErrCcaCount: kotlin.UInt?

        public abstract val txErrAbortCount: kotlin.UInt?

        public abstract val txErrBusyChannelCount: kotlin.UInt?

        public abstract val rxTotalCount: kotlin.UInt?

        public abstract val rxUnicastCount: kotlin.UInt?

        public abstract val rxBroadcastCount: kotlin.UInt?

        public abstract val rxDataCount: kotlin.UInt?

        public abstract val rxDataPollCount: kotlin.UInt?

        public abstract val rxBeaconCount: kotlin.UInt?

        public abstract val rxBeaconRequestCount: kotlin.UInt?

        public abstract val rxOtherCount: kotlin.UInt?

        public abstract val rxAddressFilteredCount: kotlin.UInt?

        public abstract val rxDestAddrFilteredCount: kotlin.UInt?

        public abstract val rxDuplicatedCount: kotlin.UInt?

        public abstract val rxErrNoFrameCount: kotlin.UInt?

        public abstract val rxErrUnknownNeighborCount: kotlin.UInt?

        public abstract val rxErrInvalidSrcAddrCount: kotlin.UInt?

        public abstract val rxErrSecCount: kotlin.UInt?

        public abstract val rxErrFcsCount: kotlin.UInt?

        public abstract val rxErrOtherCount: kotlin.UInt?

        public abstract val activeTimestamp: kotlin.ULong?

        public abstract val pendingTimestamp: kotlin.ULong?

        public abstract val delay: kotlin.UInt?

        public abstract val securityPolicy: com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.SecurityPolicy?

        public abstract val channelPage0Mask: kotlin.ByteArray?

        public abstract val operationalDatasetComponents: com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.OperationalDatasetComponents?

        public abstract val activeNetworkFaultsList: kotlin.collections.List<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.NetworkFaultEnum>?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.Feature

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(channel: kotlin.UShort? = COMPILED_CODE, routingRole: com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.RoutingRoleEnum? = COMPILED_CODE, networkName: kotlin.String? = COMPILED_CODE, panId: kotlin.UShort? = COMPILED_CODE, extendedPanId: kotlin.ULong? = COMPILED_CODE, meshLocalPrefix: kotlin.ByteArray? = COMPILED_CODE, overrunCount: kotlin.ULong? = COMPILED_CODE, neighborTable: kotlin.collections.List<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.NeighborTableStruct>? = COMPILED_CODE, routeTable: kotlin.collections.List<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.RouteTableStruct>? = COMPILED_CODE, partitionId: kotlin.UInt? = COMPILED_CODE, weighting: kotlin.UShort? = COMPILED_CODE, dataVersion: kotlin.UShort? = COMPILED_CODE, stableDataVersion: kotlin.UShort? = COMPILED_CODE, leaderRouterId: kotlin.UByte? = COMPILED_CODE, detachedRoleCount: kotlin.UShort? = COMPILED_CODE, childRoleCount: kotlin.UShort? = COMPILED_CODE, routerRoleCount: kotlin.UShort? = COMPILED_CODE, leaderRoleCount: kotlin.UShort? = COMPILED_CODE, attachAttemptCount: kotlin.UShort? = COMPILED_CODE, partitionIdChangeCount: kotlin.UShort? = COMPILED_CODE, betterPartitionAttachAttemptCount: kotlin.UShort? = COMPILED_CODE, parentChangeCount: kotlin.UShort? = COMPILED_CODE, txTotalCount: kotlin.UInt? = COMPILED_CODE, txUnicastCount: kotlin.UInt? = COMPILED_CODE, txBroadcastCount: kotlin.UInt? = COMPILED_CODE, txAckRequestedCount: kotlin.UInt? = COMPILED_CODE, txAckedCount: kotlin.UInt? = COMPILED_CODE, txNoAckRequestedCount: kotlin.UInt? = COMPILED_CODE, txDataCount: kotlin.UInt? = COMPILED_CODE, txDataPollCount: kotlin.UInt? = COMPILED_CODE, txBeaconCount: kotlin.UInt? = COMPILED_CODE, txBeaconRequestCount: kotlin.UInt? = COMPILED_CODE, txOtherCount: kotlin.UInt? = COMPILED_CODE, txRetryCount: kotlin.UInt? = COMPILED_CODE, txDirectMaxRetryExpiryCount: kotlin.UInt? = COMPILED_CODE, txIndirectMaxRetryExpiryCount: kotlin.UInt? = COMPILED_CODE, txErrCcaCount: kotlin.UInt? = COMPILED_CODE, txErrAbortCount: kotlin.UInt? = COMPILED_CODE, txErrBusyChannelCount: kotlin.UInt? = COMPILED_CODE, rxTotalCount: kotlin.UInt? = COMPILED_CODE, rxUnicastCount: kotlin.UInt? = COMPILED_CODE, rxBroadcastCount: kotlin.UInt? = COMPILED_CODE, rxDataCount: kotlin.UInt? = COMPILED_CODE, rxDataPollCount: kotlin.UInt? = COMPILED_CODE, rxBeaconCount: kotlin.UInt? = COMPILED_CODE, rxBeaconRequestCount: kotlin.UInt? = COMPILED_CODE, rxOtherCount: kotlin.UInt? = COMPILED_CODE, rxAddressFilteredCount: kotlin.UInt? = COMPILED_CODE, rxDestAddrFilteredCount: kotlin.UInt? = COMPILED_CODE, rxDuplicatedCount: kotlin.UInt? = COMPILED_CODE, rxErrNoFrameCount: kotlin.UInt? = COMPILED_CODE, rxErrUnknownNeighborCount: kotlin.UInt? = COMPILED_CODE, rxErrInvalidSrcAddrCount: kotlin.UInt? = COMPILED_CODE, rxErrSecCount: kotlin.UInt? = COMPILED_CODE, rxErrFcsCount: kotlin.UInt? = COMPILED_CODE, rxErrOtherCount: kotlin.UInt? = COMPILED_CODE, activeTimestamp: kotlin.ULong? = COMPILED_CODE, pendingTimestamp: kotlin.ULong? = COMPILED_CODE, delay: kotlin.UInt? = COMPILED_CODE, securityPolicy: com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.SecurityPolicy? = COMPILED_CODE, channelPage0Mask: kotlin.ByteArray? = COMPILED_CODE, operationalDatasetComponents: com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.OperationalDatasetComponents? = COMPILED_CODE, activeNetworkFaultsList: kotlin.collections.List<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.NetworkFaultEnum>? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.Attributes) { /* compiled code */ }

        public open val channel: kotlin.UShort? /* compiled code */

        public open val routingRole: com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.RoutingRoleEnum? /* compiled code */

        public open val networkName: kotlin.String? /* compiled code */

        public open val panId: kotlin.UShort? /* compiled code */

        public open val extendedPanId: kotlin.ULong? /* compiled code */

        public open val meshLocalPrefix: kotlin.ByteArray? /* compiled code */

        public open val overrunCount: kotlin.ULong? /* compiled code */

        public open val neighborTable: kotlin.collections.List<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.NeighborTableStruct>? /* compiled code */

        public open val routeTable: kotlin.collections.List<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.RouteTableStruct>? /* compiled code */

        public open val partitionId: kotlin.UInt? /* compiled code */

        public open val weighting: kotlin.UShort? /* compiled code */

        public open val dataVersion: kotlin.UShort? /* compiled code */

        public open val stableDataVersion: kotlin.UShort? /* compiled code */

        public open val leaderRouterId: kotlin.UByte? /* compiled code */

        public open val detachedRoleCount: kotlin.UShort? /* compiled code */

        public open val childRoleCount: kotlin.UShort? /* compiled code */

        public open val routerRoleCount: kotlin.UShort? /* compiled code */

        public open val leaderRoleCount: kotlin.UShort? /* compiled code */

        public open val attachAttemptCount: kotlin.UShort? /* compiled code */

        public open val partitionIdChangeCount: kotlin.UShort? /* compiled code */

        public open val betterPartitionAttachAttemptCount: kotlin.UShort? /* compiled code */

        public open val parentChangeCount: kotlin.UShort? /* compiled code */

        public open val txTotalCount: kotlin.UInt? /* compiled code */

        public open val txUnicastCount: kotlin.UInt? /* compiled code */

        public open val txBroadcastCount: kotlin.UInt? /* compiled code */

        public open val txAckRequestedCount: kotlin.UInt? /* compiled code */

        public open val txAckedCount: kotlin.UInt? /* compiled code */

        public open val txNoAckRequestedCount: kotlin.UInt? /* compiled code */

        public open val txDataCount: kotlin.UInt? /* compiled code */

        public open val txDataPollCount: kotlin.UInt? /* compiled code */

        public open val txBeaconCount: kotlin.UInt? /* compiled code */

        public open val txBeaconRequestCount: kotlin.UInt? /* compiled code */

        public open val txOtherCount: kotlin.UInt? /* compiled code */

        public open val txRetryCount: kotlin.UInt? /* compiled code */

        public open val txDirectMaxRetryExpiryCount: kotlin.UInt? /* compiled code */

        public open val txIndirectMaxRetryExpiryCount: kotlin.UInt? /* compiled code */

        public open val txErrCcaCount: kotlin.UInt? /* compiled code */

        public open val txErrAbortCount: kotlin.UInt? /* compiled code */

        public open val txErrBusyChannelCount: kotlin.UInt? /* compiled code */

        public open val rxTotalCount: kotlin.UInt? /* compiled code */

        public open val rxUnicastCount: kotlin.UInt? /* compiled code */

        public open val rxBroadcastCount: kotlin.UInt? /* compiled code */

        public open val rxDataCount: kotlin.UInt? /* compiled code */

        public open val rxDataPollCount: kotlin.UInt? /* compiled code */

        public open val rxBeaconCount: kotlin.UInt? /* compiled code */

        public open val rxBeaconRequestCount: kotlin.UInt? /* compiled code */

        public open val rxOtherCount: kotlin.UInt? /* compiled code */

        public open val rxAddressFilteredCount: kotlin.UInt? /* compiled code */

        public open val rxDestAddrFilteredCount: kotlin.UInt? /* compiled code */

        public open val rxDuplicatedCount: kotlin.UInt? /* compiled code */

        public open val rxErrNoFrameCount: kotlin.UInt? /* compiled code */

        public open val rxErrUnknownNeighborCount: kotlin.UInt? /* compiled code */

        public open val rxErrInvalidSrcAddrCount: kotlin.UInt? /* compiled code */

        public open val rxErrSecCount: kotlin.UInt? /* compiled code */

        public open val rxErrFcsCount: kotlin.UInt? /* compiled code */

        public open val rxErrOtherCount: kotlin.UInt? /* compiled code */

        public open val activeTimestamp: kotlin.ULong? /* compiled code */

        public open val pendingTimestamp: kotlin.ULong? /* compiled code */

        public open val delay: kotlin.UInt? /* compiled code */

        public open val securityPolicy: com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.SecurityPolicy? /* compiled code */

        public open val channelPage0Mask: kotlin.ByteArray? /* compiled code */

        public open val operationalDatasetComponents: com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.OperationalDatasetComponents? /* compiled code */

        public open val activeNetworkFaultsList: kotlin.collections.List<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.NetworkFaultEnum>? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.Feature /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(channel: kotlin.UShort? = COMPILED_CODE, routingRole: com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.RoutingRoleEnum? = COMPILED_CODE, networkName: kotlin.String? = COMPILED_CODE, panId: kotlin.UShort? = COMPILED_CODE, extendedPanId: kotlin.ULong? = COMPILED_CODE, meshLocalPrefix: kotlin.ByteArray? = COMPILED_CODE, overrunCount: kotlin.ULong? = COMPILED_CODE, neighborTable: kotlin.collections.List<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.NeighborTableStruct>? = COMPILED_CODE, routeTable: kotlin.collections.List<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.RouteTableStruct>? = COMPILED_CODE, partitionId: kotlin.UInt? = COMPILED_CODE, weighting: kotlin.UShort? = COMPILED_CODE, dataVersion: kotlin.UShort? = COMPILED_CODE, stableDataVersion: kotlin.UShort? = COMPILED_CODE, leaderRouterId: kotlin.UByte? = COMPILED_CODE, detachedRoleCount: kotlin.UShort? = COMPILED_CODE, childRoleCount: kotlin.UShort? = COMPILED_CODE, routerRoleCount: kotlin.UShort? = COMPILED_CODE, leaderRoleCount: kotlin.UShort? = COMPILED_CODE, attachAttemptCount: kotlin.UShort? = COMPILED_CODE, partitionIdChangeCount: kotlin.UShort? = COMPILED_CODE, betterPartitionAttachAttemptCount: kotlin.UShort? = COMPILED_CODE, parentChangeCount: kotlin.UShort? = COMPILED_CODE, txTotalCount: kotlin.UInt? = COMPILED_CODE, txUnicastCount: kotlin.UInt? = COMPILED_CODE, txBroadcastCount: kotlin.UInt? = COMPILED_CODE, txAckRequestedCount: kotlin.UInt? = COMPILED_CODE, txAckedCount: kotlin.UInt? = COMPILED_CODE, txNoAckRequestedCount: kotlin.UInt? = COMPILED_CODE, txDataCount: kotlin.UInt? = COMPILED_CODE, txDataPollCount: kotlin.UInt? = COMPILED_CODE, txBeaconCount: kotlin.UInt? = COMPILED_CODE, txBeaconRequestCount: kotlin.UInt? = COMPILED_CODE, txOtherCount: kotlin.UInt? = COMPILED_CODE, txRetryCount: kotlin.UInt? = COMPILED_CODE, txDirectMaxRetryExpiryCount: kotlin.UInt? = COMPILED_CODE, txIndirectMaxRetryExpiryCount: kotlin.UInt? = COMPILED_CODE, txErrCcaCount: kotlin.UInt? = COMPILED_CODE, txErrAbortCount: kotlin.UInt? = COMPILED_CODE, txErrBusyChannelCount: kotlin.UInt? = COMPILED_CODE, rxTotalCount: kotlin.UInt? = COMPILED_CODE, rxUnicastCount: kotlin.UInt? = COMPILED_CODE, rxBroadcastCount: kotlin.UInt? = COMPILED_CODE, rxDataCount: kotlin.UInt? = COMPILED_CODE, rxDataPollCount: kotlin.UInt? = COMPILED_CODE, rxBeaconCount: kotlin.UInt? = COMPILED_CODE, rxBeaconRequestCount: kotlin.UInt? = COMPILED_CODE, rxOtherCount: kotlin.UInt? = COMPILED_CODE, rxAddressFilteredCount: kotlin.UInt? = COMPILED_CODE, rxDestAddrFilteredCount: kotlin.UInt? = COMPILED_CODE, rxDuplicatedCount: kotlin.UInt? = COMPILED_CODE, rxErrNoFrameCount: kotlin.UInt? = COMPILED_CODE, rxErrUnknownNeighborCount: kotlin.UInt? = COMPILED_CODE, rxErrInvalidSrcAddrCount: kotlin.UInt? = COMPILED_CODE, rxErrSecCount: kotlin.UInt? = COMPILED_CODE, rxErrFcsCount: kotlin.UInt? = COMPILED_CODE, rxErrOtherCount: kotlin.UInt? = COMPILED_CODE, activeTimestamp: kotlin.ULong? = COMPILED_CODE, pendingTimestamp: kotlin.ULong? = COMPILED_CODE, delay: kotlin.UInt? = COMPILED_CODE, securityPolicy: com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.SecurityPolicy? = COMPILED_CODE, channelPage0Mask: kotlin.ByteArray? = COMPILED_CODE, operationalDatasetComponents: com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.OperationalDatasetComponents? = COMPILED_CODE, activeNetworkFaultsList: kotlin.collections.List<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.NetworkFaultEnum>? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.AttributesImpl { /* compiled code */ }
    }

    public object ResetCountsCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final class Request public constructor() {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.ResetCountsCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.ResetCountsCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.ResetCountsCommand.Request { /* compiled code */ }
            }

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ThreadNetworkDiagnosticsTrait.ResetCountsCommand.Request.CommandFields> {
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

