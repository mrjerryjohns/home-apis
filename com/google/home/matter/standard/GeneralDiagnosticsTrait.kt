// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object GeneralDiagnosticsTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class BootReasonEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.GeneralDiagnosticsTrait.BootReasonEnum> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull PowerOnReboot,

        @androidx.annotation.NonNull BrownOutReset,

        @androidx.annotation.NonNull SoftwareWatchdogReset,

        @androidx.annotation.NonNull HardwareWatchdogReset,

        @androidx.annotation.NonNull SoftwareUpdateCompleted,

        @androidx.annotation.NonNull SoftwareReset,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.GeneralDiagnosticsTrait.BootReasonEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class HardwareFaultEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.GeneralDiagnosticsTrait.HardwareFaultEnum> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull Radio,

        @androidx.annotation.NonNull Sensor,

        @androidx.annotation.NonNull ResettableOverTemp,

        @androidx.annotation.NonNull NonResettableOverTemp,

        @androidx.annotation.NonNull PowerSource,

        @androidx.annotation.NonNull VisualDisplayFault,

        @androidx.annotation.NonNull AudioOutputFault,

        @androidx.annotation.NonNull UserInterfaceFault,

        @androidx.annotation.NonNull NonVolatileMemoryError,

        @androidx.annotation.NonNull TamperDetected,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.GeneralDiagnosticsTrait.HardwareFaultEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class InterfaceTypeEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.GeneralDiagnosticsTrait.InterfaceTypeEnum> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull WiFi,

        @androidx.annotation.NonNull Ethernet,

        @androidx.annotation.NonNull Cellular,

        @androidx.annotation.NonNull Thread,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.GeneralDiagnosticsTrait.InterfaceTypeEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class NetworkFaultEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.GeneralDiagnosticsTrait.NetworkFaultEnum> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull HardwareFailure,

        @androidx.annotation.NonNull NetworkJammed,

        @androidx.annotation.NonNull ConnectionFailed,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.GeneralDiagnosticsTrait.NetworkFaultEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class RadioFaultEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.GeneralDiagnosticsTrait.RadioFaultEnum> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull WiFiFault,

        @androidx.annotation.NonNull CellularFault,

        @androidx.annotation.NonNull ThreadFault,

        @androidx.annotation.NonNull NfcFault,

        @androidx.annotation.NonNull BLEFault,

        @androidx.annotation.NonNull EthernetFault,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.GeneralDiagnosticsTrait.RadioFaultEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final data class Feature public constructor(dataModelTest: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.GeneralDiagnosticsTrait.Feature> {
            private const final val DATA_MODEL_TEST_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.GeneralDiagnosticsTrait.Feature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.GeneralDiagnosticsTrait.Feature { /* compiled code */ }
        }

        public final val dataModelTest: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(dataModelTest: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.GeneralDiagnosticsTrait.Feature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface HardwareFaultChange {
        public abstract val current: kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.HardwareFaultEnum>?

        public abstract val previous: kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.HardwareFaultEnum>?
    }

    public final class HardwareFaultChangeImpl public constructor(current: kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.HardwareFaultEnum>? = COMPILED_CODE, previous: kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.HardwareFaultEnum>? = COMPILED_CODE) : com.google.home.matter.standard.GeneralDiagnosticsTrait.HardwareFaultChange {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.GeneralDiagnosticsTrait.HardwareFaultChange> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.GeneralDiagnosticsTrait.HardwareFaultChange): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.GeneralDiagnosticsTrait.HardwareFaultChange { /* compiled code */ }
        }

        public open val current: kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.HardwareFaultEnum>? /* compiled code */

        public open val previous: kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.HardwareFaultEnum>? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface RadioFaultChange {
        public abstract val current: kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.RadioFaultEnum>?

        public abstract val previous: kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.RadioFaultEnum>?
    }

    public final class RadioFaultChangeImpl public constructor(current: kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.RadioFaultEnum>? = COMPILED_CODE, previous: kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.RadioFaultEnum>? = COMPILED_CODE) : com.google.home.matter.standard.GeneralDiagnosticsTrait.RadioFaultChange {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.GeneralDiagnosticsTrait.RadioFaultChange> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.GeneralDiagnosticsTrait.RadioFaultChange): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.GeneralDiagnosticsTrait.RadioFaultChange { /* compiled code */ }
        }

        public open val current: kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.RadioFaultEnum>? /* compiled code */

        public open val previous: kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.RadioFaultEnum>? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface NetworkFaultChange {
        public abstract val current: kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.NetworkFaultEnum>?

        public abstract val previous: kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.NetworkFaultEnum>?
    }

    public final class NetworkFaultChangeImpl public constructor(current: kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.NetworkFaultEnum>? = COMPILED_CODE, previous: kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.NetworkFaultEnum>? = COMPILED_CODE) : com.google.home.matter.standard.GeneralDiagnosticsTrait.NetworkFaultChange {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.GeneralDiagnosticsTrait.NetworkFaultChange> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.GeneralDiagnosticsTrait.NetworkFaultChange): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.GeneralDiagnosticsTrait.NetworkFaultChange { /* compiled code */ }
        }

        public open val current: kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.NetworkFaultEnum>? /* compiled code */

        public open val previous: kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.NetworkFaultEnum>? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface BootReason {
        public abstract val bootReason: com.google.home.matter.standard.GeneralDiagnosticsTrait.BootReasonEnum?
    }

    public final class BootReasonImpl public constructor(bootReason: com.google.home.matter.standard.GeneralDiagnosticsTrait.BootReasonEnum? = COMPILED_CODE) : com.google.home.matter.standard.GeneralDiagnosticsTrait.BootReason {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.GeneralDiagnosticsTrait.BootReason> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.GeneralDiagnosticsTrait.BootReason): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.GeneralDiagnosticsTrait.BootReason { /* compiled code */ }
        }

        public open val bootReason: com.google.home.matter.standard.GeneralDiagnosticsTrait.BootReasonEnum? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final class NetworkInterface public constructor(name: kotlin.String = COMPILED_CODE, isOperational: kotlin.Boolean = COMPILED_CODE, offPremiseServicesReachableIpv4: kotlin.Boolean? = COMPILED_CODE, offPremiseServicesReachableIpv6: kotlin.Boolean? = COMPILED_CODE, hardwareAddress: kotlin.ByteArray = COMPILED_CODE, ipv4Addresses: kotlin.collections.List<kotlin.ByteArray> = COMPILED_CODE, ipv6Addresses: kotlin.collections.List<kotlin.ByteArray> = COMPILED_CODE, type: com.google.home.matter.standard.GeneralDiagnosticsTrait.InterfaceTypeEnum = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.GeneralDiagnosticsTrait.NetworkInterface>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GeneralDiagnosticsTrait.NetworkInterface?>.name: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GeneralDiagnosticsTrait.NetworkInterface?>.isOperational: com.google.home.automation.TypedExpression<kotlin.Boolean> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GeneralDiagnosticsTrait.NetworkInterface?>.offPremiseServicesReachableIpv4: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GeneralDiagnosticsTrait.NetworkInterface?>.offPremiseServicesReachableIpv6: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GeneralDiagnosticsTrait.NetworkInterface?>.hardwareAddress: com.google.home.automation.TypedExpression<kotlin.ByteArray> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GeneralDiagnosticsTrait.NetworkInterface?>.ipv4Addresses: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.ByteArray>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GeneralDiagnosticsTrait.NetworkInterface?>.ipv6Addresses: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.ByteArray>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GeneralDiagnosticsTrait.NetworkInterface?>.type: com.google.home.automation.TypedExpression<com.google.home.matter.standard.GeneralDiagnosticsTrait.InterfaceTypeEnum> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.GeneralDiagnosticsTrait.NetworkInterface): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.GeneralDiagnosticsTrait.NetworkInterface { /* compiled code */ }
        }

        public final val name: kotlin.String /* compiled code */

        public final val isOperational: kotlin.Boolean /* compiled code */

        public final val offPremiseServicesReachableIpv4: kotlin.Boolean? /* compiled code */

        public final val offPremiseServicesReachableIpv6: kotlin.Boolean? /* compiled code */

        public final val hardwareAddress: kotlin.ByteArray /* compiled code */

        public final val ipv4Addresses: kotlin.collections.List<kotlin.ByteArray> /* compiled code */

        public final val ipv6Addresses: kotlin.collections.List<kotlin.ByteArray> /* compiled code */

        public final val type: com.google.home.matter.standard.GeneralDiagnosticsTrait.InterfaceTypeEnum /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.GeneralDiagnosticsTrait.NetworkInterface.StructFields> {
            @androidx.annotation.NonNull Name,

            @androidx.annotation.NonNull isOperational,

            @androidx.annotation.NonNull offPremiseServicesReachableIpv4,

            @androidx.annotation.NonNull offPremiseServicesReachableIpv6,

            @androidx.annotation.NonNull hardwareAddress,

            @androidx.annotation.NonNull ipv4Addresses,

            @androidx.annotation.NonNull ipv6Addresses,

            @androidx.annotation.NonNull type;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.GeneralDiagnosticsTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.GeneralDiagnosticsTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.GeneralDiagnosticsTrait.Attributes { /* compiled code */ }
        }

        public abstract val networkInterfaces: kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.NetworkInterface>?

        public abstract val rebootCount: kotlin.UShort?

        public abstract val upTime: kotlin.ULong?

        public abstract val totalOperationalHours: kotlin.UInt?

        public abstract val bootReason: com.google.home.matter.standard.GeneralDiagnosticsTrait.BootReasonEnum?

        public abstract val activeHardwareFaults: kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.HardwareFaultEnum>?

        public abstract val activeRadioFaults: kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.RadioFaultEnum>?

        public abstract val activeNetworkFaults: kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.NetworkFaultEnum>?

        public abstract val testEventTriggersEnabled: kotlin.Boolean?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: com.google.home.matter.standard.GeneralDiagnosticsTrait.Feature

        public abstract val clusterRevision: kotlin.UShort
    }

        public open class AttributesImpl public constructor(networkInterfaces: kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.NetworkInterface>? = COMPILED_CODE, rebootCount: kotlin.UShort? = COMPILED_CODE, upTime: kotlin.ULong? = COMPILED_CODE, totalOperationalHours: kotlin.UInt? = COMPILED_CODE, bootReason: com.google.home.matter.standard.GeneralDiagnosticsTrait.BootReasonEnum? = COMPILED_CODE, activeHardwareFaults: kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.HardwareFaultEnum>? = COMPILED_CODE, activeRadioFaults: kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.RadioFaultEnum>? = COMPILED_CODE, activeNetworkFaults:
        kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.NetworkFaultEnum>? = COMPILED_CODE, testEventTriggersEnabled: kotlin.Boolean? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.GeneralDiagnosticsTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.matter.standard.GeneralDiagnosticsTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.GeneralDiagnosticsTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.GeneralDiagnosticsTrait.Attributes) { /* compiled code */ }

        public open val networkInterfaces: kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.NetworkInterface>? /* compiled code */

        public open val rebootCount: kotlin.UShort? /* compiled code */

        public open val upTime: kotlin.ULong? /* compiled code */

        public open val totalOperationalHours: kotlin.UInt? /* compiled code */

        public open val bootReason: com.google.home.matter.standard.GeneralDiagnosticsTrait.BootReasonEnum? /* compiled code */

        public open val activeHardwareFaults: kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.HardwareFaultEnum>? /* compiled code */

        public open val activeRadioFaults: kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.RadioFaultEnum>? /* compiled code */

        public open val activeNetworkFaults: kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.NetworkFaultEnum>? /* compiled code */

        public open val testEventTriggersEnabled: kotlin.Boolean? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: com.google.home.matter.standard.GeneralDiagnosticsTrait.Feature /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

                public final fun copy(networkInterfaces: kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.NetworkInterface>? = COMPILED_CODE, rebootCount: kotlin.UShort? = COMPILED_CODE, upTime: kotlin.ULong? = COMPILED_CODE, totalOperationalHours: kotlin.UInt? = COMPILED_CODE, bootReason: com.google.home.matter.standard.GeneralDiagnosticsTrait.BootReasonEnum? = COMPILED_CODE, activeHardwareFaults: kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.HardwareFaultEnum>? = COMPILED_CODE, activeRadioFaults: kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.RadioFaultEnum>? = COMPILED_CODE, activeNetworkFaults:
            kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.NetworkFaultEnum>? = COMPILED_CODE, testEventTriggersEnabled: kotlin.Boolean? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.GeneralDiagnosticsTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.matter.standard.GeneralDiagnosticsTrait.AttributesImpl { /* compiled code */ }
    }

    public object TestEventTriggerCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(enableKey: kotlin.ByteArray = COMPILED_CODE, eventTrigger: kotlin.ULong = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.GeneralDiagnosticsTrait.TestEventTriggerCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.GeneralDiagnosticsTrait.TestEventTriggerCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.GeneralDiagnosticsTrait.TestEventTriggerCommand.Request { /* compiled code */ }
            }

            public final val enableKey: kotlin.ByteArray /* compiled code */

            public final val eventTrigger: kotlin.ULong /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.GeneralDiagnosticsTrait.TestEventTriggerCommand.Request.CommandFields> {
                @androidx.annotation.NonNull enableKey,

                @androidx.annotation.NonNull eventTrigger;

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

    public object TimeSnapshotCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public final class Request public constructor() {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.GeneralDiagnosticsTrait.TimeSnapshotCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.GeneralDiagnosticsTrait.TimeSnapshotCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.GeneralDiagnosticsTrait.TimeSnapshotCommand.Request { /* compiled code */ }
            }

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.GeneralDiagnosticsTrait.TimeSnapshotCommand.Request.CommandFields> {
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

        public final class Response public constructor(systemTimeMs: kotlin.ULong = COMPILED_CODE, posixTimeMs: kotlin.ULong? = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.GeneralDiagnosticsTrait.TimeSnapshotCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.GeneralDiagnosticsTrait.TimeSnapshotCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.GeneralDiagnosticsTrait.TimeSnapshotCommand.Response { /* compiled code */ }
            }

            public final val systemTimeMs: kotlin.ULong /* compiled code */

            public final val posixTimeMs: kotlin.ULong? /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.GeneralDiagnosticsTrait.TimeSnapshotCommand.Response.CommandFields> {
                @androidx.annotation.NonNull systemTimeMs,

                @androidx.annotation.NonNull posixTimeMs;

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

    public object PayloadTestRequestCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(enableKey: kotlin.ByteArray = COMPILED_CODE, value: kotlin.UByte = COMPILED_CODE, count: kotlin.UShort = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.GeneralDiagnosticsTrait.PayloadTestRequestCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.GeneralDiagnosticsTrait.PayloadTestRequestCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.GeneralDiagnosticsTrait.PayloadTestRequestCommand.Request { /* compiled code */ }
            }

            public final val enableKey: kotlin.ByteArray /* compiled code */

            public final val value: kotlin.UByte /* compiled code */

            public final val count: kotlin.UShort /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.GeneralDiagnosticsTrait.PayloadTestRequestCommand.Request.CommandFields> {
                @androidx.annotation.NonNull enableKey,

                @androidx.annotation.NonNull value,

                @androidx.annotation.NonNull count;

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

        public final class Response public constructor(payload: kotlin.ByteArray = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.GeneralDiagnosticsTrait.PayloadTestRequestCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.GeneralDiagnosticsTrait.PayloadTestRequestCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.GeneralDiagnosticsTrait.PayloadTestRequestCommand.Response { /* compiled code */ }
            }

            public final val payload: kotlin.ByteArray /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.GeneralDiagnosticsTrait.PayloadTestRequestCommand.Response.CommandFields> {
                @androidx.annotation.NonNull payload;

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
