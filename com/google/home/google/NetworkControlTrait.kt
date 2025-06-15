// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public object NetworkControlTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class SpeedTestStatus private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.NetworkControlTrait.SpeedTestStatus> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull Success,

        @androidx.annotation.NonNull Failure,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.NetworkControlTrait.SpeedTestStatus> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final data class NetworkControlFeature public constructor(supportsEnablingNetworkProfile: kotlin.Boolean = COMPILED_CODE, supportsDisablingNetworkProfile: kotlin.Boolean = COMPILED_CODE, supportsEnablingGuestNetwork: kotlin.Boolean = COMPILED_CODE, supportsDisablingGuestNetwork: kotlin.Boolean = COMPILED_CODE, supportsGettingGuestNetworkPassword: kotlin.Boolean = COMPILED_CODE, supportsNetworkDownloadSpeedTest: kotlin.Boolean = COMPILED_CODE, supportsNetworkUploadSpeedTest: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.google.NetworkControlTrait.NetworkControlFeature> {
            private const final val SUPPORTS_ENABLING_NETWORK_PROFILE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val SUPPORTS_DISABLING_NETWORK_PROFILE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val SUPPORTS_ENABLING_GUEST_NETWORK_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val SUPPORTS_DISABLING_GUEST_NETWORK_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val SUPPORTS_GETTING_GUEST_NETWORK_PASSWORD_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val SUPPORTS_NETWORK_DOWNLOAD_SPEED_TEST_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val SUPPORTS_NETWORK_UPLOAD_SPEED_TEST_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.google.NetworkControlTrait.NetworkControlFeature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.google.NetworkControlTrait.NetworkControlFeature { /* compiled code */ }
        }

        public final val supportsEnablingNetworkProfile: kotlin.Boolean /* compiled code */

        public final val supportsDisablingNetworkProfile: kotlin.Boolean /* compiled code */

        public final val supportsEnablingGuestNetwork: kotlin.Boolean /* compiled code */

        public final val supportsDisablingGuestNetwork: kotlin.Boolean /* compiled code */

        public final val supportsGettingGuestNetworkPassword: kotlin.Boolean /* compiled code */

        public final val supportsNetworkDownloadSpeedTest: kotlin.Boolean /* compiled code */

        public final val supportsNetworkUploadSpeedTest: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component5(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component6(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component7(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(supportsEnablingNetworkProfile: kotlin.Boolean = COMPILED_CODE, supportsDisablingNetworkProfile: kotlin.Boolean = COMPILED_CODE, supportsEnablingGuestNetwork: kotlin.Boolean = COMPILED_CODE, supportsDisablingGuestNetwork: kotlin.Boolean = COMPILED_CODE, supportsGettingGuestNetworkPassword: kotlin.Boolean = COMPILED_CODE, supportsNetworkDownloadSpeedTest: kotlin.Boolean = COMPILED_CODE, supportsNetworkUploadSpeedTest: kotlin.Boolean = COMPILED_CODE): com.google.home.google.NetworkControlTrait.NetworkControlFeature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface TestNetworkSpeedFollowUp {
        public abstract val status: com.google.home.google.NetworkControlTrait.SpeedTestStatus?

        public abstract val networkUploadSpeedMbps: kotlin.Float?

        public abstract val networkDownloadSpeedMbps: kotlin.Float?

        public abstract val errorCode: kotlin.String?
    }

    public final class TestNetworkSpeedFollowUpImpl public constructor(status: com.google.home.google.NetworkControlTrait.SpeedTestStatus? = COMPILED_CODE, networkUploadSpeedMbps: kotlin.Float? = COMPILED_CODE, networkDownloadSpeedMbps: kotlin.Float? = COMPILED_CODE, errorCode: kotlin.String? = COMPILED_CODE) : com.google.home.google.NetworkControlTrait.TestNetworkSpeedFollowUp {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.NetworkControlTrait.TestNetworkSpeedFollowUp> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.NetworkControlTrait.TestNetworkSpeedFollowUp): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.NetworkControlTrait.TestNetworkSpeedFollowUp { /* compiled code */ }
        }

        public open val status: com.google.home.google.NetworkControlTrait.SpeedTestStatus? /* compiled code */

        public open val networkUploadSpeedMbps: kotlin.Float? /* compiled code */

        public open val networkDownloadSpeedMbps: kotlin.Float? /* compiled code */

        public open val errorCode: kotlin.String? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final class NetworkSettings public constructor(ssid: kotlin.String = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.NetworkControlTrait.NetworkSettings>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.NetworkControlTrait.NetworkSettings?>.ssid: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.NetworkControlTrait.NetworkSettings): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.NetworkControlTrait.NetworkSettings { /* compiled code */ }
        }

        public final val ssid: kotlin.String /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.NetworkControlTrait.NetworkSettings.StructFields> {
            @androidx.annotation.NonNull ssid;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class NetworkProfileState public constructor(networkProfileName: kotlin.String = COMPILED_CODE, enabled: kotlin.Boolean = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.NetworkControlTrait.NetworkProfileState>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.NetworkControlTrait.NetworkProfileState?>.networkProfileName: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.NetworkControlTrait.NetworkProfileState?>.enabled: com.google.home.automation.TypedExpression<kotlin.Boolean> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.NetworkControlTrait.NetworkProfileState): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.NetworkControlTrait.NetworkProfileState { /* compiled code */ }
        }

        public final val networkProfileName: kotlin.String /* compiled code */

        public final val enabled: kotlin.Boolean /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.NetworkControlTrait.NetworkProfileState.StructFields> {
            @androidx.annotation.NonNull networkProfileName,

            @androidx.annotation.NonNull enabled;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class LastNetworkUploadSpeedTest public constructor(unixTimestampSeconds: kotlin.Long = COMPILED_CODE, uploadSpeedMbps: kotlin.Float = COMPILED_CODE, status: com.google.home.google.NetworkControlTrait.SpeedTestStatus = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.NetworkControlTrait.LastNetworkUploadSpeedTest>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.NetworkControlTrait.LastNetworkUploadSpeedTest?>.unixTimestampSeconds: com.google.home.automation.TypedExpression<kotlin.Long> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.NetworkControlTrait.LastNetworkUploadSpeedTest?>.uploadSpeedMbps: com.google.home.automation.TypedExpression<kotlin.Float> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.NetworkControlTrait.LastNetworkUploadSpeedTest?>.status: com.google.home.automation.TypedExpression<com.google.home.google.NetworkControlTrait.SpeedTestStatus> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.NetworkControlTrait.LastNetworkUploadSpeedTest): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.NetworkControlTrait.LastNetworkUploadSpeedTest { /* compiled code */ }
        }

        public final val unixTimestampSeconds: kotlin.Long /* compiled code */

        public final val uploadSpeedMbps: kotlin.Float /* compiled code */

        public final val status: com.google.home.google.NetworkControlTrait.SpeedTestStatus /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.NetworkControlTrait.LastNetworkUploadSpeedTest.StructFields> {
            @androidx.annotation.NonNull unixTimestampSeconds,

            @androidx.annotation.NonNull uploadSpeedMbps,

            @androidx.annotation.NonNull status;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class GuestNetworkSettings public constructor(ssid: kotlin.String = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.NetworkControlTrait.GuestNetworkSettings>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.NetworkControlTrait.GuestNetworkSettings?>.ssid: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.NetworkControlTrait.GuestNetworkSettings): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.NetworkControlTrait.GuestNetworkSettings { /* compiled code */ }
        }

        public final val ssid: kotlin.String /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.NetworkControlTrait.GuestNetworkSettings.StructFields> {
            @androidx.annotation.NonNull ssid;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class LastNetworkDownloadSpeedTest public constructor(downloadSpeedMbps: kotlin.Float = COMPILED_CODE, unixTimestampSeconds: kotlin.Long = COMPILED_CODE, status: com.google.home.google.NetworkControlTrait.SpeedTestStatus = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.NetworkControlTrait.LastNetworkDownloadSpeedTest>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.NetworkControlTrait.LastNetworkDownloadSpeedTest?>.downloadSpeedMbps: com.google.home.automation.TypedExpression<kotlin.Float> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.NetworkControlTrait.LastNetworkDownloadSpeedTest?>.unixTimestampSeconds: com.google.home.automation.TypedExpression<kotlin.Long> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.NetworkControlTrait.LastNetworkDownloadSpeedTest?>.status: com.google.home.automation.TypedExpression<com.google.home.google.NetworkControlTrait.SpeedTestStatus> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.NetworkControlTrait.LastNetworkDownloadSpeedTest): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.NetworkControlTrait.LastNetworkDownloadSpeedTest { /* compiled code */ }
        }

        public final val downloadSpeedMbps: kotlin.Float /* compiled code */

        public final val unixTimestampSeconds: kotlin.Long /* compiled code */

        public final val status: com.google.home.google.NetworkControlTrait.SpeedTestStatus /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.NetworkControlTrait.LastNetworkDownloadSpeedTest.StructFields> {
            @androidx.annotation.NonNull downloadSpeedMbps,

            @androidx.annotation.NonNull unixTimestampSeconds,

            @androidx.annotation.NonNull status;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.NetworkControlTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.NetworkControlTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.NetworkControlTrait.Attributes { /* compiled code */ }
        }

        public abstract val networkProfiles: kotlin.collections.List<kotlin.String>?

        public abstract val networkEnabled: kotlin.Boolean?

        public abstract val guestNetworkEnabled: kotlin.Boolean?

        public abstract val networkSettings: com.google.home.google.NetworkControlTrait.NetworkSettings?

        public abstract val networkUsageUnlimited: kotlin.Boolean?

        public abstract val networkUsageLimitMb: kotlin.Float?

        public abstract val networkUsageMb: kotlin.Float?

        public abstract val networkProfileStates: kotlin.collections.List<com.google.home.google.NetworkControlTrait.NetworkProfileState>?

        public abstract val lastNetworkUploadSpeedTest: com.google.home.google.NetworkControlTrait.LastNetworkUploadSpeedTest?

        public abstract val networkSpeedTestInProgress: kotlin.Boolean?

        public abstract val guestNetworkSettings: com.google.home.google.NetworkControlTrait.GuestNetworkSettings?

        public abstract val numConnectedDevices: kotlin.UInt?

        public abstract val lastNetworkDownloadSpeedTest: com.google.home.google.NetworkControlTrait.LastNetworkDownloadSpeedTest?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: com.google.home.google.NetworkControlTrait.NetworkControlFeature

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(networkProfiles: kotlin.collections.List<kotlin.String>? = COMPILED_CODE, networkEnabled: kotlin.Boolean? = COMPILED_CODE, guestNetworkEnabled: kotlin.Boolean? = COMPILED_CODE, networkSettings: com.google.home.google.NetworkControlTrait.NetworkSettings? = COMPILED_CODE, networkUsageUnlimited: kotlin.Boolean? = COMPILED_CODE, networkUsageLimitMb: kotlin.Float? = COMPILED_CODE, networkUsageMb: kotlin.Float? = COMPILED_CODE, networkProfileStates: kotlin.collections.List<com.google.home.google.NetworkControlTrait.NetworkProfileState>? = COMPILED_CODE, lastNetworkUploadSpeedTest: com.google.home.google.NetworkControlTrait.LastNetworkUploadSpeedTest? = COMPILED_CODE, networkSpeedTestInProgress: kotlin.Boolean? = COMPILED_CODE, guestNetworkSettings: com.google.home.google.NetworkControlTrait.GuestNetworkSettings? = COMPILED_CODE, numConnectedDevices: kotlin.UInt? = COMPILED_CODE, lastNetworkDownloadSpeedTest: com.google.home.google.NetworkControlTrait.LastNetworkDownloadSpeedTest? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.google.NetworkControlTrait.NetworkControlFeature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.google.NetworkControlTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.google.NetworkControlTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.google.NetworkControlTrait.Attributes) { /* compiled code */ }

        public open val networkProfiles: kotlin.collections.List<kotlin.String>? /* compiled code */

        public open val networkEnabled: kotlin.Boolean? /* compiled code */

        public open val guestNetworkEnabled: kotlin.Boolean? /* compiled code */

        public open val networkSettings: com.google.home.google.NetworkControlTrait.NetworkSettings? /* compiled code */

        public open val networkUsageUnlimited: kotlin.Boolean? /* compiled code */

        public open val networkUsageLimitMb: kotlin.Float? /* compiled code */

        public open val networkUsageMb: kotlin.Float? /* compiled code */

        public open val networkProfileStates: kotlin.collections.List<com.google.home.google.NetworkControlTrait.NetworkProfileState>? /* compiled code */

        public open val lastNetworkUploadSpeedTest: com.google.home.google.NetworkControlTrait.LastNetworkUploadSpeedTest? /* compiled code */

        public open val networkSpeedTestInProgress: kotlin.Boolean? /* compiled code */

        public open val guestNetworkSettings: com.google.home.google.NetworkControlTrait.GuestNetworkSettings? /* compiled code */

        public open val numConnectedDevices: kotlin.UInt? /* compiled code */

        public open val lastNetworkDownloadSpeedTest: com.google.home.google.NetworkControlTrait.LastNetworkDownloadSpeedTest? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: com.google.home.google.NetworkControlTrait.NetworkControlFeature /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(networkProfiles: kotlin.collections.List<kotlin.String>? = COMPILED_CODE, networkEnabled: kotlin.Boolean? = COMPILED_CODE, guestNetworkEnabled: kotlin.Boolean? = COMPILED_CODE, networkSettings: com.google.home.google.NetworkControlTrait.NetworkSettings? = COMPILED_CODE, networkUsageUnlimited: kotlin.Boolean? = COMPILED_CODE, networkUsageLimitMb: kotlin.Float? = COMPILED_CODE, networkUsageMb: kotlin.Float? = COMPILED_CODE, networkProfileStates: kotlin.collections.List<com.google.home.google.NetworkControlTrait.NetworkProfileState>? = COMPILED_CODE, lastNetworkUploadSpeedTest: com.google.home.google.NetworkControlTrait.LastNetworkUploadSpeedTest? = COMPILED_CODE, networkSpeedTestInProgress: kotlin.Boolean? = COMPILED_CODE, guestNetworkSettings: com.google.home.google.NetworkControlTrait.GuestNetworkSettings? = COMPILED_CODE, numConnectedDevices: kotlin.UInt? = COMPILED_CODE, lastNetworkDownloadSpeedTest: com.google.home.google.NetworkControlTrait.LastNetworkDownloadSpeedTest? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.google.NetworkControlTrait.NetworkControlFeature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.google.NetworkControlTrait.AttributesImpl { /* compiled code */ }
    }

    public object EnableDisableGuestNetworkCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(enable: kotlin.Boolean = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.NetworkControlTrait.EnableDisableGuestNetworkCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.NetworkControlTrait.EnableDisableGuestNetworkCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.NetworkControlTrait.EnableDisableGuestNetworkCommand.Request { /* compiled code */ }
            }

            public final val enable: kotlin.Boolean /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.NetworkControlTrait.EnableDisableGuestNetworkCommand.Request.CommandFields> {
                @androidx.annotation.NonNull enable;

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

    public object EnableDisableNetworkProfileCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(enable: kotlin.Boolean = COMPILED_CODE, networkProfileName: kotlin.String = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.NetworkControlTrait.EnableDisableNetworkProfileCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.NetworkControlTrait.EnableDisableNetworkProfileCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.NetworkControlTrait.EnableDisableNetworkProfileCommand.Request { /* compiled code */ }
            }

            public final val enable: kotlin.Boolean /* compiled code */

            public final val networkProfileName: kotlin.String /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.NetworkControlTrait.EnableDisableNetworkProfileCommand.Request.CommandFields> {
                @androidx.annotation.NonNull enable,

                @androidx.annotation.NonNull networkProfileName;

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

    public object GetGuestNetworkPasswordCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public final class Request public constructor() {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.NetworkControlTrait.GetGuestNetworkPasswordCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.NetworkControlTrait.GetGuestNetworkPasswordCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.NetworkControlTrait.GetGuestNetworkPasswordCommand.Request { /* compiled code */ }
            }

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.NetworkControlTrait.GetGuestNetworkPasswordCommand.Request.CommandFields> {
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

        public final class Response public constructor(guestNetworkPassword: kotlin.String = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.NetworkControlTrait.GetGuestNetworkPasswordCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.NetworkControlTrait.GetGuestNetworkPasswordCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.NetworkControlTrait.GetGuestNetworkPasswordCommand.Response { /* compiled code */ }
            }

            public final val guestNetworkPassword: kotlin.String /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.NetworkControlTrait.GetGuestNetworkPasswordCommand.Response.CommandFields> {
                @androidx.annotation.NonNull guestNetworkPassword;

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

    public object TestNetworkSpeedCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(testUploadSpeed: kotlin.Boolean = COMPILED_CODE, testDownloadSpeed: kotlin.Boolean = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.NetworkControlTrait.TestNetworkSpeedCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.NetworkControlTrait.TestNetworkSpeedCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.NetworkControlTrait.TestNetworkSpeedCommand.Request { /* compiled code */ }
            }

            public final val testUploadSpeed: kotlin.Boolean /* compiled code */

            public final val testDownloadSpeed: kotlin.Boolean /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.NetworkControlTrait.TestNetworkSpeedCommand.Request.CommandFields> {
                @androidx.annotation.NonNull testUploadSpeed,

                @androidx.annotation.NonNull testDownloadSpeed;

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

