// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object NetworkCommissioningTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class NetworkCommissioningStatusEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.NetworkCommissioningTrait.NetworkCommissioningStatusEnum> {
        @androidx.annotation.NonNull Success,

        @androidx.annotation.NonNull OutOfRange,

        @androidx.annotation.NonNull BoundsExceeded,

        @androidx.annotation.NonNull NetworkIDNotFound,

        @androidx.annotation.NonNull DuplicateNetworkID,

        @androidx.annotation.NonNull NetworkNotFound,

        @androidx.annotation.NonNull RegulatoryError,

        @androidx.annotation.NonNull AuthFailure,

        @androidx.annotation.NonNull UnsupportedSecurity,

        @androidx.annotation.NonNull OtherConnectionFailure,

        @androidx.annotation.NonNull IPV6Failed,

        @androidx.annotation.NonNull IPBindFailed,

        @androidx.annotation.NonNull UnknownError,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.NetworkCommissioningTrait.NetworkCommissioningStatusEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class WiFiBandEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.NetworkCommissioningTrait.WiFiBandEnum> {
        @androidx.annotation.NonNull Num2G4,

        @androidx.annotation.NonNull Num3G65,

        @androidx.annotation.NonNull Num5G,

        @androidx.annotation.NonNull Num6G,

        @androidx.annotation.NonNull Num60G,

        @androidx.annotation.NonNull Num1G,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.NetworkCommissioningTrait.WiFiBandEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final data class Feature public constructor(wiFiNetworkInterface: kotlin.Boolean = COMPILED_CODE, threadNetworkInterface: kotlin.Boolean = COMPILED_CODE, ethernetNetworkInterface: kotlin.Boolean = COMPILED_CODE, perDeviceCredentials: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.NetworkCommissioningTrait.Feature> {
            private const final val WI_FI_NETWORK_INTERFACE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val THREAD_NETWORK_INTERFACE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val ETHERNET_NETWORK_INTERFACE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val PER_DEVICE_CREDENTIALS_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.NetworkCommissioningTrait.Feature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.NetworkCommissioningTrait.Feature { /* compiled code */ }
        }

        public final val wiFiNetworkInterface: kotlin.Boolean /* compiled code */

        public final val threadNetworkInterface: kotlin.Boolean /* compiled code */

        public final val ethernetNetworkInterface: kotlin.Boolean /* compiled code */

        public final val perDeviceCredentials: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(wiFiNetworkInterface: kotlin.Boolean = COMPILED_CODE, threadNetworkInterface: kotlin.Boolean = COMPILED_CODE, ethernetNetworkInterface: kotlin.Boolean = COMPILED_CODE, perDeviceCredentials: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.NetworkCommissioningTrait.Feature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final data class ThreadCapabilitiesBitmap public constructor(isBorderRouterCapable: kotlin.Boolean = COMPILED_CODE, isRouterCapable: kotlin.Boolean = COMPILED_CODE, isSleepyEndDeviceCapable: kotlin.Boolean = COMPILED_CODE, isFullThreadDevice: kotlin.Boolean = COMPILED_CODE, isSynchronizedSleepyEndDeviceCapable: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.NetworkCommissioningTrait.ThreadCapabilitiesBitmap> {
            private const final val IS_BORDER_ROUTER_CAPABLE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val IS_ROUTER_CAPABLE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val IS_SLEEPY_END_DEVICE_CAPABLE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val IS_FULL_THREAD_DEVICE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val IS_SYNCHRONIZED_SLEEPY_END_DEVICE_CAPABLE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.NetworkCommissioningTrait.ThreadCapabilitiesBitmap): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.NetworkCommissioningTrait.ThreadCapabilitiesBitmap { /* compiled code */ }
        }

        public final val isBorderRouterCapable: kotlin.Boolean /* compiled code */

        public final val isRouterCapable: kotlin.Boolean /* compiled code */

        public final val isSleepyEndDeviceCapable: kotlin.Boolean /* compiled code */

        public final val isFullThreadDevice: kotlin.Boolean /* compiled code */

        public final val isSynchronizedSleepyEndDeviceCapable: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component5(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(isBorderRouterCapable: kotlin.Boolean = COMPILED_CODE, isRouterCapable: kotlin.Boolean = COMPILED_CODE, isSleepyEndDeviceCapable: kotlin.Boolean = COMPILED_CODE, isFullThreadDevice: kotlin.Boolean = COMPILED_CODE, isSynchronizedSleepyEndDeviceCapable: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.NetworkCommissioningTrait.ThreadCapabilitiesBitmap { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final data class WiFiSecurityBitmap public constructor(unencrypted: kotlin.Boolean = COMPILED_CODE, wep: kotlin.Boolean = COMPILED_CODE, wpaPersonal: kotlin.Boolean = COMPILED_CODE, wpa2Personal: kotlin.Boolean = COMPILED_CODE, wpa3Personal: kotlin.Boolean = COMPILED_CODE, wpa3MatterPdc: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.NetworkCommissioningTrait.WiFiSecurityBitmap> {
            private const final val UNENCRYPTED_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val WEP_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val WPA_PERSONAL_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val WPA2_PERSONAL_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val WPA3_PERSONAL_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val WPA3_MATTER_PDC_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.NetworkCommissioningTrait.WiFiSecurityBitmap): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.NetworkCommissioningTrait.WiFiSecurityBitmap { /* compiled code */ }
        }

        public final val unencrypted: kotlin.Boolean /* compiled code */

        public final val wep: kotlin.Boolean /* compiled code */

        public final val wpaPersonal: kotlin.Boolean /* compiled code */

        public final val wpa2Personal: kotlin.Boolean /* compiled code */

        public final val wpa3Personal: kotlin.Boolean /* compiled code */

        public final val wpa3MatterPdc: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component5(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component6(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(unencrypted: kotlin.Boolean = COMPILED_CODE, wep: kotlin.Boolean = COMPILED_CODE, wpaPersonal: kotlin.Boolean = COMPILED_CODE, wpa2Personal: kotlin.Boolean = COMPILED_CODE, wpa3Personal: kotlin.Boolean = COMPILED_CODE, wpa3MatterPdc: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.NetworkCommissioningTrait.WiFiSecurityBitmap { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final class NetworkInfoStruct public constructor(networkId: kotlin.ByteArray = COMPILED_CODE, connected: kotlin.Boolean = COMPILED_CODE, networkIdentifier: com.google.home.matter.serialization.OptionalValue<kotlin.ByteArray?> = COMPILED_CODE, clientIdentifier: com.google.home.matter.serialization.OptionalValue<kotlin.ByteArray?> = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.NetworkCommissioningTrait.NetworkInfoStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.NetworkCommissioningTrait.NetworkInfoStruct?>.networkId: com.google.home.automation.TypedExpression<kotlin.ByteArray> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.NetworkCommissioningTrait.NetworkInfoStruct?>.connected: com.google.home.automation.TypedExpression<kotlin.Boolean> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.NetworkCommissioningTrait.NetworkInfoStruct?>.networkIdentifier: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.ByteArray?>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.NetworkCommissioningTrait.NetworkInfoStruct?>.clientIdentifier: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.ByteArray?>> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.NetworkCommissioningTrait.NetworkInfoStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.NetworkCommissioningTrait.NetworkInfoStruct { /* compiled code */ }
        }

        public final val networkId: kotlin.ByteArray /* compiled code */

        public final val connected: kotlin.Boolean /* compiled code */

        public final val networkIdentifier: com.google.home.matter.serialization.OptionalValue<kotlin.ByteArray?> /* compiled code */

        public final val clientIdentifier: com.google.home.matter.serialization.OptionalValue<kotlin.ByteArray?> /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.NetworkCommissioningTrait.NetworkInfoStruct.StructFields> {
            @androidx.annotation.NonNull networkId,

            @androidx.annotation.NonNull connected,

            @androidx.annotation.NonNull networkIdentifier,

            @androidx.annotation.NonNull clientIdentifier;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class ThreadInterfaceScanResultStruct public constructor(panId: kotlin.UShort = COMPILED_CODE, extendedPanId: kotlin.ULong = COMPILED_CODE, networkName: kotlin.String = COMPILED_CODE, channel: kotlin.UShort = COMPILED_CODE, version: kotlin.UByte = COMPILED_CODE, extendedAddress: kotlin.ByteArray = COMPILED_CODE, rssi: kotlin.Byte = COMPILED_CODE, lqi: kotlin.UByte = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.NetworkCommissioningTrait.ThreadInterfaceScanResultStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.NetworkCommissioningTrait.ThreadInterfaceScanResultStruct?>.panId: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.NetworkCommissioningTrait.ThreadInterfaceScanResultStruct?>.extendedPanId: com.google.home.automation.TypedExpression<kotlin.ULong> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.NetworkCommissioningTrait.ThreadInterfaceScanResultStruct?>.networkName: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.NetworkCommissioningTrait.ThreadInterfaceScanResultStruct?>.channel: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.NetworkCommissioningTrait.ThreadInterfaceScanResultStruct?>.version: com.google.home.automation.TypedExpression<kotlin.UByte> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.NetworkCommissioningTrait.ThreadInterfaceScanResultStruct?>.extendedAddress: com.google.home.automation.TypedExpression<kotlin.ByteArray> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.NetworkCommissioningTrait.ThreadInterfaceScanResultStruct?>.rssi: com.google.home.automation.TypedExpression<kotlin.Byte> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.NetworkCommissioningTrait.ThreadInterfaceScanResultStruct?>.lqi: com.google.home.automation.TypedExpression<kotlin.UByte> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.NetworkCommissioningTrait.ThreadInterfaceScanResultStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.NetworkCommissioningTrait.ThreadInterfaceScanResultStruct { /* compiled code */ }
        }

        public final val panId: kotlin.UShort /* compiled code */

        public final val extendedPanId: kotlin.ULong /* compiled code */

        public final val networkName: kotlin.String /* compiled code */

        public final val channel: kotlin.UShort /* compiled code */

        public final val version: kotlin.UByte /* compiled code */

        public final val extendedAddress: kotlin.ByteArray /* compiled code */

        public final val rssi: kotlin.Byte /* compiled code */

        public final val lqi: kotlin.UByte /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.NetworkCommissioningTrait.ThreadInterfaceScanResultStruct.StructFields> {
            @androidx.annotation.NonNull panId,

            @androidx.annotation.NonNull extendedPanId,

            @androidx.annotation.NonNull networkName,

            @androidx.annotation.NonNull channel,

            @androidx.annotation.NonNull version,

            @androidx.annotation.NonNull extendedAddress,

            @androidx.annotation.NonNull rssi,

            @androidx.annotation.NonNull lqi;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class WiFiInterfaceScanResultStruct public constructor(security: com.google.home.matter.standard.NetworkCommissioningTrait.WiFiSecurityBitmap = COMPILED_CODE, ssid: kotlin.ByteArray = COMPILED_CODE, bssid: kotlin.ByteArray = COMPILED_CODE, channel: kotlin.UShort = COMPILED_CODE, wiFiBand: com.google.home.matter.standard.NetworkCommissioningTrait.WiFiBandEnum = COMPILED_CODE, rssi: kotlin.Byte = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.NetworkCommissioningTrait.WiFiInterfaceScanResultStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.NetworkCommissioningTrait.WiFiInterfaceScanResultStruct?>.security: com.google.home.automation.TypedExpression<com.google.home.matter.standard.NetworkCommissioningTrait.WiFiSecurityBitmap> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.NetworkCommissioningTrait.WiFiInterfaceScanResultStruct?>.ssid: com.google.home.automation.TypedExpression<kotlin.ByteArray> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.NetworkCommissioningTrait.WiFiInterfaceScanResultStruct?>.bssid: com.google.home.automation.TypedExpression<kotlin.ByteArray> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.NetworkCommissioningTrait.WiFiInterfaceScanResultStruct?>.channel: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.NetworkCommissioningTrait.WiFiInterfaceScanResultStruct?>.wiFiBand: com.google.home.automation.TypedExpression<com.google.home.matter.standard.NetworkCommissioningTrait.WiFiBandEnum> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.NetworkCommissioningTrait.WiFiInterfaceScanResultStruct?>.rssi: com.google.home.automation.TypedExpression<kotlin.Byte> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.NetworkCommissioningTrait.WiFiInterfaceScanResultStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.NetworkCommissioningTrait.WiFiInterfaceScanResultStruct { /* compiled code */ }
        }

        public final val security: com.google.home.matter.standard.NetworkCommissioningTrait.WiFiSecurityBitmap /* compiled code */

        public final val ssid: kotlin.ByteArray /* compiled code */

        public final val bssid: kotlin.ByteArray /* compiled code */

        public final val channel: kotlin.UShort /* compiled code */

        public final val wiFiBand: com.google.home.matter.standard.NetworkCommissioningTrait.WiFiBandEnum /* compiled code */

        public final val rssi: kotlin.Byte /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.NetworkCommissioningTrait.WiFiInterfaceScanResultStruct.StructFields> {
            @androidx.annotation.NonNull security,

            @androidx.annotation.NonNull ssid,

            @androidx.annotation.NonNull bssid,

            @androidx.annotation.NonNull channel,

            @androidx.annotation.NonNull wiFiBand,

            @androidx.annotation.NonNull rssi;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.NetworkCommissioningTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.NetworkCommissioningTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.NetworkCommissioningTrait.Attributes { /* compiled code */ }
        }

        public abstract val maxNetworks: kotlin.UByte?

        public abstract val networks: kotlin.collections.List<com.google.home.matter.standard.NetworkCommissioningTrait.NetworkInfoStruct>?

        public abstract val scanMaxTimeSeconds: kotlin.UByte?

        public abstract val connectMaxTimeSeconds: kotlin.UByte?

        public abstract val interfaceEnabled: kotlin.Boolean?

        public abstract val lastNetworkingStatus: com.google.home.matter.standard.NetworkCommissioningTrait.NetworkCommissioningStatusEnum?

        public abstract val lastNetworkId: kotlin.ByteArray?

        public abstract val lastConnectErrorValue: kotlin.Int?

        public abstract val supportedWiFiBands: kotlin.collections.List<com.google.home.matter.standard.NetworkCommissioningTrait.WiFiBandEnum>?

        public abstract val supportedThreadFeatures: com.google.home.matter.standard.NetworkCommissioningTrait.ThreadCapabilitiesBitmap?

        public abstract val threadVersion: kotlin.UShort?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: com.google.home.matter.standard.NetworkCommissioningTrait.Feature

        public abstract val clusterRevision: kotlin.UShort
    }

        public open class AttributesImpl public constructor(maxNetworks: kotlin.UByte? = COMPILED_CODE, networks: kotlin.collections.List<com.google.home.matter.standard.NetworkCommissioningTrait.NetworkInfoStruct>? = COMPILED_CODE, scanMaxTimeSeconds: kotlin.UByte? = COMPILED_CODE, connectMaxTimeSeconds: kotlin.UByte? = COMPILED_CODE, interfaceEnabled: kotlin.Boolean? = COMPILED_CODE, lastNetworkingStatus: com.google.home.matter.standard.NetworkCommissioningTrait.NetworkCommissioningStatusEnum? = COMPILED_CODE, lastNetworkId: kotlin.ByteArray? = COMPILED_CODE, lastConnectErrorValue: kotlin.Int? = COMPILED_CODE, supportedWiFiBands: kotlin.collections.List<com.google.home.matter.standard.NetworkCommissioningTrait.WiFiBandEnum>? = COMPILED_CODE, supportedThreadFeatures:
        com.google.home.matter.standard.NetworkCommissioningTrait.ThreadCapabilitiesBitmap? = COMPILED_CODE, threadVersion: kotlin.UShort? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.NetworkCommissioningTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.matter.standard.NetworkCommissioningTrait.Attributes, com.google.home.matter.serialization.CanMutate<com.google.home.matter.standard.NetworkCommissioningTrait.Attributes, com.google.home.matter.standard.NetworkCommissioningTrait.MutableAttributes> {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.NetworkCommissioningTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.NetworkCommissioningTrait.Attributes) { /* compiled code */ }

        public open val maxNetworks: kotlin.UByte? /* compiled code */

        public open val networks: kotlin.collections.List<com.google.home.matter.standard.NetworkCommissioningTrait.NetworkInfoStruct>? /* compiled code */

        public open val scanMaxTimeSeconds: kotlin.UByte? /* compiled code */

        public open val connectMaxTimeSeconds: kotlin.UByte? /* compiled code */

        public open val interfaceEnabled: kotlin.Boolean? /* compiled code */

        public open val lastNetworkingStatus: com.google.home.matter.standard.NetworkCommissioningTrait.NetworkCommissioningStatusEnum? /* compiled code */

        public open val lastNetworkId: kotlin.ByteArray? /* compiled code */

        public open val lastConnectErrorValue: kotlin.Int? /* compiled code */

        public open val supportedWiFiBands: kotlin.collections.List<com.google.home.matter.standard.NetworkCommissioningTrait.WiFiBandEnum>? /* compiled code */

        public open val supportedThreadFeatures: com.google.home.matter.standard.NetworkCommissioningTrait.ThreadCapabilitiesBitmap? /* compiled code */

        public open val threadVersion: kotlin.UShort? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: com.google.home.matter.standard.NetworkCommissioningTrait.Feature /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open fun mutate(init: com.google.home.matter.standard.NetworkCommissioningTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.NetworkCommissioningTrait.Attributes { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

                public final fun copy(maxNetworks: kotlin.UByte? = COMPILED_CODE, networks: kotlin.collections.List<com.google.home.matter.standard.NetworkCommissioningTrait.NetworkInfoStruct>? = COMPILED_CODE, scanMaxTimeSeconds: kotlin.UByte? = COMPILED_CODE, connectMaxTimeSeconds: kotlin.UByte? = COMPILED_CODE, interfaceEnabled: kotlin.Boolean? = COMPILED_CODE, lastNetworkingStatus: com.google.home.matter.standard.NetworkCommissioningTrait.NetworkCommissioningStatusEnum? = COMPILED_CODE, lastNetworkId: kotlin.ByteArray? = COMPILED_CODE, lastConnectErrorValue: kotlin.Int? = COMPILED_CODE, supportedWiFiBands: kotlin.collections.List<com.google.home.matter.standard.NetworkCommissioningTrait.WiFiBandEnum>? = COMPILED_CODE, supportedThreadFeatures:
            com.google.home.matter.standard.NetworkCommissioningTrait.ThreadCapabilitiesBitmap? = COMPILED_CODE, threadVersion: kotlin.UShort? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.NetworkCommissioningTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.matter.standard.NetworkCommissioningTrait.AttributesImpl { /* compiled code */ }
    }

    public final class MutableAttributes public constructor(attributes: com.google.home.matter.standard.NetworkCommissioningTrait.Attributes) : com.google.home.matter.standard.NetworkCommissioningTrait.AttributesImpl {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.NetworkCommissioningTrait.MutableAttributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.NetworkCommissioningTrait.MutableAttributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.NetworkCommissioningTrait.MutableAttributes { /* compiled code */ }
        }

        internal final var _interfaceEnabled: kotlin.Boolean? /* compiled code */

        public open val interfaceEnabled: kotlin.Boolean? /* compiled code */
            public open get

        public final fun setInterfaceEnabled(value: kotlin.Boolean): kotlin.Unit { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public object ScanNetworksCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(ssid: com.google.home.matter.serialization.OptionalValue<kotlin.ByteArray?> = COMPILED_CODE, breadcrumb: com.google.home.matter.serialization.OptionalValue<kotlin.ULong> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.NetworkCommissioningTrait.ScanNetworksCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.NetworkCommissioningTrait.ScanNetworksCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.NetworkCommissioningTrait.ScanNetworksCommand.Request { /* compiled code */ }
            }

            public final val ssid: com.google.home.matter.serialization.OptionalValue<kotlin.ByteArray?> /* compiled code */

            public final val breadcrumb: com.google.home.matter.serialization.OptionalValue<kotlin.ULong> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.NetworkCommissioningTrait.ScanNetworksCommand.Request.CommandFields> {
                @androidx.annotation.NonNull ssid,

                @androidx.annotation.NonNull breadcrumb;

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

        public interface OptionalArgs {
            public abstract var ssid: kotlin.ByteArray?

            public abstract var breadcrumb: kotlin.ULong
        }

        public final class Response public constructor(networkingStatus: com.google.home.matter.standard.NetworkCommissioningTrait.NetworkCommissioningStatusEnum = COMPILED_CODE, debugText: kotlin.String? = COMPILED_CODE, wiFiScanResults: kotlin.collections.List<com.google.home.matter.standard.NetworkCommissioningTrait.WiFiInterfaceScanResultStruct>? = COMPILED_CODE, threadScanResults: kotlin.collections.List<com.google.home.matter.standard.NetworkCommissioningTrait.ThreadInterfaceScanResultStruct>? = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.NetworkCommissioningTrait.ScanNetworksCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.NetworkCommissioningTrait.ScanNetworksCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.NetworkCommissioningTrait.ScanNetworksCommand.Response { /* compiled code */ }
            }

            public final val networkingStatus: com.google.home.matter.standard.NetworkCommissioningTrait.NetworkCommissioningStatusEnum /* compiled code */

            public final val debugText: kotlin.String? /* compiled code */

            public final val wiFiScanResults: kotlin.collections.List<com.google.home.matter.standard.NetworkCommissioningTrait.WiFiInterfaceScanResultStruct>? /* compiled code */

            public final val threadScanResults: kotlin.collections.List<com.google.home.matter.standard.NetworkCommissioningTrait.ThreadInterfaceScanResultStruct>? /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.NetworkCommissioningTrait.ScanNetworksCommand.Response.CommandFields> {
                @androidx.annotation.NonNull networkingStatus,

                @androidx.annotation.NonNull debugText,

                @androidx.annotation.NonNull wiFiScanResults,

                @androidx.annotation.NonNull threadScanResults;

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

    public object AddOrUpdateWiFiNetworkCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(ssid: kotlin.ByteArray = COMPILED_CODE, credentials: kotlin.ByteArray = COMPILED_CODE, breadcrumb: com.google.home.matter.serialization.OptionalValue<kotlin.ULong> = COMPILED_CODE, networkIdentity: com.google.home.matter.serialization.OptionalValue<kotlin.ByteArray> = COMPILED_CODE, clientIdentifier: com.google.home.matter.serialization.OptionalValue<kotlin.ByteArray> = COMPILED_CODE, possessionNonce: com.google.home.matter.serialization.OptionalValue<kotlin.ByteArray> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.NetworkCommissioningTrait.AddOrUpdateWiFiNetworkCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.NetworkCommissioningTrait.AddOrUpdateWiFiNetworkCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.NetworkCommissioningTrait.AddOrUpdateWiFiNetworkCommand.Request { /* compiled code */ }
            }

            public final val ssid: kotlin.ByteArray /* compiled code */

            public final val credentials: kotlin.ByteArray /* compiled code */

            public final val breadcrumb: com.google.home.matter.serialization.OptionalValue<kotlin.ULong> /* compiled code */

            public final val networkIdentity: com.google.home.matter.serialization.OptionalValue<kotlin.ByteArray> /* compiled code */

            public final val clientIdentifier: com.google.home.matter.serialization.OptionalValue<kotlin.ByteArray> /* compiled code */

            public final val possessionNonce: com.google.home.matter.serialization.OptionalValue<kotlin.ByteArray> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.NetworkCommissioningTrait.AddOrUpdateWiFiNetworkCommand.Request.CommandFields> {
                @androidx.annotation.NonNull ssid,

                @androidx.annotation.NonNull credentials,

                @androidx.annotation.NonNull breadcrumb,

                @androidx.annotation.NonNull networkIdentity,

                @androidx.annotation.NonNull clientIdentifier,

                @androidx.annotation.NonNull possessionNonce;

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

        public interface OptionalArgs {
            public abstract var breadcrumb: kotlin.ULong

            public abstract var networkIdentity: kotlin.ByteArray

            public abstract var clientIdentifier: kotlin.ByteArray

            public abstract var possessionNonce: kotlin.ByteArray
        }

        public final class Response public constructor(networkingStatus: com.google.home.matter.standard.NetworkCommissioningTrait.NetworkCommissioningStatusEnum = COMPILED_CODE, debugText: kotlin.String? = COMPILED_CODE, networkIndex: kotlin.UByte? = COMPILED_CODE, clientIdentity: kotlin.ByteArray? = COMPILED_CODE, possessionSignature: kotlin.ByteArray? = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.NetworkCommissioningTrait.AddOrUpdateWiFiNetworkCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.NetworkCommissioningTrait.AddOrUpdateWiFiNetworkCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.NetworkCommissioningTrait.AddOrUpdateWiFiNetworkCommand.Response { /* compiled code */ }
            }

            public final val networkingStatus: com.google.home.matter.standard.NetworkCommissioningTrait.NetworkCommissioningStatusEnum /* compiled code */

            public final val debugText: kotlin.String? /* compiled code */

            public final val networkIndex: kotlin.UByte? /* compiled code */

            public final val clientIdentity: kotlin.ByteArray? /* compiled code */

            public final val possessionSignature: kotlin.ByteArray? /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.NetworkCommissioningTrait.AddOrUpdateWiFiNetworkCommand.Response.CommandFields> {
                @androidx.annotation.NonNull networkingStatus,

                @androidx.annotation.NonNull debugText,

                @androidx.annotation.NonNull networkIndex,

                @androidx.annotation.NonNull clientIdentity,

                @androidx.annotation.NonNull possessionSignature;

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

    public object AddOrUpdateThreadNetworkCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(operationalDataset: kotlin.ByteArray = COMPILED_CODE, breadcrumb: com.google.home.matter.serialization.OptionalValue<kotlin.ULong> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.NetworkCommissioningTrait.AddOrUpdateThreadNetworkCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.NetworkCommissioningTrait.AddOrUpdateThreadNetworkCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.NetworkCommissioningTrait.AddOrUpdateThreadNetworkCommand.Request { /* compiled code */ }
            }

            public final val operationalDataset: kotlin.ByteArray /* compiled code */

            public final val breadcrumb: com.google.home.matter.serialization.OptionalValue<kotlin.ULong> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.NetworkCommissioningTrait.AddOrUpdateThreadNetworkCommand.Request.CommandFields> {
                @androidx.annotation.NonNull operationalDataset,

                @androidx.annotation.NonNull breadcrumb;

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

        public interface OptionalArgs {
            public abstract var breadcrumb: kotlin.ULong
        }

        public final class Response public constructor(networkingStatus: com.google.home.matter.standard.NetworkCommissioningTrait.NetworkCommissioningStatusEnum = COMPILED_CODE, debugText: kotlin.String? = COMPILED_CODE, networkIndex: kotlin.UByte? = COMPILED_CODE, clientIdentity: kotlin.ByteArray? = COMPILED_CODE, possessionSignature: kotlin.ByteArray? = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.NetworkCommissioningTrait.AddOrUpdateThreadNetworkCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.NetworkCommissioningTrait.AddOrUpdateThreadNetworkCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.NetworkCommissioningTrait.AddOrUpdateThreadNetworkCommand.Response { /* compiled code */ }
            }

            public final val networkingStatus: com.google.home.matter.standard.NetworkCommissioningTrait.NetworkCommissioningStatusEnum /* compiled code */

            public final val debugText: kotlin.String? /* compiled code */

            public final val networkIndex: kotlin.UByte? /* compiled code */

            public final val clientIdentity: kotlin.ByteArray? /* compiled code */

            public final val possessionSignature: kotlin.ByteArray? /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.NetworkCommissioningTrait.AddOrUpdateThreadNetworkCommand.Response.CommandFields> {
                @androidx.annotation.NonNull networkingStatus,

                @androidx.annotation.NonNull debugText,

                @androidx.annotation.NonNull networkIndex,

                @androidx.annotation.NonNull clientIdentity,

                @androidx.annotation.NonNull possessionSignature;

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

    public object RemoveNetworkCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(networkId: kotlin.ByteArray = COMPILED_CODE, breadcrumb: com.google.home.matter.serialization.OptionalValue<kotlin.ULong> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.NetworkCommissioningTrait.RemoveNetworkCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.NetworkCommissioningTrait.RemoveNetworkCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.NetworkCommissioningTrait.RemoveNetworkCommand.Request { /* compiled code */ }
            }

            public final val networkId: kotlin.ByteArray /* compiled code */

            public final val breadcrumb: com.google.home.matter.serialization.OptionalValue<kotlin.ULong> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.NetworkCommissioningTrait.RemoveNetworkCommand.Request.CommandFields> {
                @androidx.annotation.NonNull networkId,

                @androidx.annotation.NonNull breadcrumb;

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

        public interface OptionalArgs {
            public abstract var breadcrumb: kotlin.ULong
        }

        public final class Response public constructor(networkingStatus: com.google.home.matter.standard.NetworkCommissioningTrait.NetworkCommissioningStatusEnum = COMPILED_CODE, debugText: kotlin.String? = COMPILED_CODE, networkIndex: kotlin.UByte? = COMPILED_CODE, clientIdentity: kotlin.ByteArray? = COMPILED_CODE, possessionSignature: kotlin.ByteArray? = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.NetworkCommissioningTrait.RemoveNetworkCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.NetworkCommissioningTrait.RemoveNetworkCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.NetworkCommissioningTrait.RemoveNetworkCommand.Response { /* compiled code */ }
            }

            public final val networkingStatus: com.google.home.matter.standard.NetworkCommissioningTrait.NetworkCommissioningStatusEnum /* compiled code */

            public final val debugText: kotlin.String? /* compiled code */

            public final val networkIndex: kotlin.UByte? /* compiled code */

            public final val clientIdentity: kotlin.ByteArray? /* compiled code */

            public final val possessionSignature: kotlin.ByteArray? /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.NetworkCommissioningTrait.RemoveNetworkCommand.Response.CommandFields> {
                @androidx.annotation.NonNull networkingStatus,

                @androidx.annotation.NonNull debugText,

                @androidx.annotation.NonNull networkIndex,

                @androidx.annotation.NonNull clientIdentity,

                @androidx.annotation.NonNull possessionSignature;

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

    public object ConnectNetworkCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(networkId: kotlin.ByteArray = COMPILED_CODE, breadcrumb: com.google.home.matter.serialization.OptionalValue<kotlin.ULong> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.NetworkCommissioningTrait.ConnectNetworkCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.NetworkCommissioningTrait.ConnectNetworkCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.NetworkCommissioningTrait.ConnectNetworkCommand.Request { /* compiled code */ }
            }

            public final val networkId: kotlin.ByteArray /* compiled code */

            public final val breadcrumb: com.google.home.matter.serialization.OptionalValue<kotlin.ULong> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.NetworkCommissioningTrait.ConnectNetworkCommand.Request.CommandFields> {
                @androidx.annotation.NonNull networkId,

                @androidx.annotation.NonNull breadcrumb;

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

        public interface OptionalArgs {
            public abstract var breadcrumb: kotlin.ULong
        }

        public final class Response public constructor(networkingStatus: com.google.home.matter.standard.NetworkCommissioningTrait.NetworkCommissioningStatusEnum = COMPILED_CODE, debugText: kotlin.String? = COMPILED_CODE, errorValue: kotlin.Int? = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.NetworkCommissioningTrait.ConnectNetworkCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.NetworkCommissioningTrait.ConnectNetworkCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.NetworkCommissioningTrait.ConnectNetworkCommand.Response { /* compiled code */ }
            }

            public final val networkingStatus: com.google.home.matter.standard.NetworkCommissioningTrait.NetworkCommissioningStatusEnum /* compiled code */

            public final val debugText: kotlin.String? /* compiled code */

            public final val errorValue: kotlin.Int? /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.NetworkCommissioningTrait.ConnectNetworkCommand.Response.CommandFields> {
                @androidx.annotation.NonNull networkingStatus,

                @androidx.annotation.NonNull debugText,

                @androidx.annotation.NonNull errorValue;

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

    public object ReorderNetworkCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(networkId: kotlin.ByteArray = COMPILED_CODE, networkIndex: kotlin.UByte = COMPILED_CODE, breadcrumb: com.google.home.matter.serialization.OptionalValue<kotlin.ULong> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.NetworkCommissioningTrait.ReorderNetworkCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.NetworkCommissioningTrait.ReorderNetworkCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.NetworkCommissioningTrait.ReorderNetworkCommand.Request { /* compiled code */ }
            }

            public final val networkId: kotlin.ByteArray /* compiled code */

            public final val networkIndex: kotlin.UByte /* compiled code */

            public final val breadcrumb: com.google.home.matter.serialization.OptionalValue<kotlin.ULong> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.NetworkCommissioningTrait.ReorderNetworkCommand.Request.CommandFields> {
                @androidx.annotation.NonNull networkId,

                @androidx.annotation.NonNull networkIndex,

                @androidx.annotation.NonNull breadcrumb;

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

        public interface OptionalArgs {
            public abstract var breadcrumb: kotlin.ULong
        }

        public final class Response public constructor(networkingStatus: com.google.home.matter.standard.NetworkCommissioningTrait.NetworkCommissioningStatusEnum = COMPILED_CODE, debugText: kotlin.String? = COMPILED_CODE, networkIndex: kotlin.UByte? = COMPILED_CODE, clientIdentity: kotlin.ByteArray? = COMPILED_CODE, possessionSignature: kotlin.ByteArray? = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.NetworkCommissioningTrait.ReorderNetworkCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.NetworkCommissioningTrait.ReorderNetworkCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.NetworkCommissioningTrait.ReorderNetworkCommand.Response { /* compiled code */ }
            }

            public final val networkingStatus: com.google.home.matter.standard.NetworkCommissioningTrait.NetworkCommissioningStatusEnum /* compiled code */

            public final val debugText: kotlin.String? /* compiled code */

            public final val networkIndex: kotlin.UByte? /* compiled code */

            public final val clientIdentity: kotlin.ByteArray? /* compiled code */

            public final val possessionSignature: kotlin.ByteArray? /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.NetworkCommissioningTrait.ReorderNetworkCommand.Response.CommandFields> {
                @androidx.annotation.NonNull networkingStatus,

                @androidx.annotation.NonNull debugText,

                @androidx.annotation.NonNull networkIndex,

                @androidx.annotation.NonNull clientIdentity,

                @androidx.annotation.NonNull possessionSignature;

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

    public object QueryIdentityCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(keyIdentifier: kotlin.ByteArray = COMPILED_CODE, possessionNonce: com.google.home.matter.serialization.OptionalValue<kotlin.ByteArray> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.NetworkCommissioningTrait.QueryIdentityCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.NetworkCommissioningTrait.QueryIdentityCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.NetworkCommissioningTrait.QueryIdentityCommand.Request { /* compiled code */ }
            }

            public final val keyIdentifier: kotlin.ByteArray /* compiled code */

            public final val possessionNonce: com.google.home.matter.serialization.OptionalValue<kotlin.ByteArray> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.NetworkCommissioningTrait.QueryIdentityCommand.Request.CommandFields> {
                @androidx.annotation.NonNull keyIdentifier,

                @androidx.annotation.NonNull possessionNonce;

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

        public interface OptionalArgs {
            public abstract var possessionNonce: kotlin.ByteArray
        }

        public final class Response public constructor(identity: kotlin.ByteArray = COMPILED_CODE, possessionSignature: kotlin.ByteArray? = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.NetworkCommissioningTrait.QueryIdentityCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.NetworkCommissioningTrait.QueryIdentityCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.NetworkCommissioningTrait.QueryIdentityCommand.Response { /* compiled code */ }
            }

            public final val identity: kotlin.ByteArray /* compiled code */

            public final val possessionSignature: kotlin.ByteArray? /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.NetworkCommissioningTrait.QueryIdentityCommand.Response.CommandFields> {
                @androidx.annotation.NonNull identity,

                @androidx.annotation.NonNull possessionSignature;

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
