// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public object GeofenceTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class LocationState private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.GeofenceTrait.LocationState> {
        @androidx.annotation.NonNull LocationStateUnspecified,

        @androidx.annotation.NonNull LocationStateInside,

        @androidx.annotation.NonNull LocationStateOutside,

        @androidx.annotation.NonNull LocationStateEntered,

        @androidx.annotation.NonNull LocationStateExited,

        @androidx.annotation.NonNull LocationStateUnknown,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.GeofenceTrait.LocationState> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final class AndroidInfo public constructor(appReleaseVersion: kotlin.String = COMPILED_CODE, sdkVersion: kotlin.Int = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.GeofenceTrait.AndroidInfo>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.GeofenceTrait.AndroidInfo?>.appReleaseVersion: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.GeofenceTrait.AndroidInfo?>.sdkVersion: com.google.home.automation.TypedExpression<kotlin.Int> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.GeofenceTrait.AndroidInfo): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.GeofenceTrait.AndroidInfo { /* compiled code */ }
        }

        public final val appReleaseVersion: kotlin.String /* compiled code */

        public final val sdkVersion: kotlin.Int /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.GeofenceTrait.AndroidInfo.StructFields> {
            @androidx.annotation.NonNull appReleaseVersion,

            @androidx.annotation.NonNull sdkVersion;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class IosInfo public constructor(appReleaseVersion: kotlin.String = COMPILED_CODE, osMajorVersion: kotlin.String = COMPILED_CODE, osFullVersion: kotlin.String = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.GeofenceTrait.IosInfo>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.GeofenceTrait.IosInfo?>.appReleaseVersion: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.GeofenceTrait.IosInfo?>.osMajorVersion: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.GeofenceTrait.IosInfo?>.osFullVersion: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.GeofenceTrait.IosInfo): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.GeofenceTrait.IosInfo { /* compiled code */ }
        }

        public final val appReleaseVersion: kotlin.String /* compiled code */

        public final val osMajorVersion: kotlin.String /* compiled code */

        public final val osFullVersion: kotlin.String /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.GeofenceTrait.IosInfo.StructFields> {
            @androidx.annotation.NonNull appReleaseVersion,

            @androidx.annotation.NonNull osMajorVersion,

            @androidx.annotation.NonNull osFullVersion;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class ClientEnvironment public constructor(androidInfo: com.google.home.google.GeofenceTrait.AndroidInfo = COMPILED_CODE, iOsInfo: com.google.home.google.GeofenceTrait.IosInfo = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.GeofenceTrait.ClientEnvironment>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.GeofenceTrait.ClientEnvironment?>.androidInfo: com.google.home.automation.TypedExpression<com.google.home.google.GeofenceTrait.AndroidInfo> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.GeofenceTrait.ClientEnvironment?>.iOsInfo: com.google.home.automation.TypedExpression<com.google.home.google.GeofenceTrait.IosInfo> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.GeofenceTrait.ClientEnvironment): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.GeofenceTrait.ClientEnvironment { /* compiled code */ }
        }

        public final val androidInfo: com.google.home.google.GeofenceTrait.AndroidInfo /* compiled code */

        public final val iOsInfo: com.google.home.google.GeofenceTrait.IosInfo /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.GeofenceTrait.ClientEnvironment.StructFields> {
            @androidx.annotation.NonNull androidInfo,

            @androidx.annotation.NonNull iOsInfo;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.GeofenceTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.GeofenceTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.GeofenceTrait.Attributes { /* compiled code */ }
        }

        public abstract val currentGeofenceRadius: kotlin.Double?

        public abstract val agentId: kotlin.String?

        public abstract val structureId: kotlin.String?

        public abstract val durationSinceRebootSeconds: kotlin.Long?

        public abstract val addressId: kotlin.String?

        public abstract val supportedGeofenceRadii: kotlin.collections.List<kotlin.Double>?

        public abstract val agentDeviceId: kotlin.String?

        public abstract val clientEnvironment: com.google.home.google.GeofenceTrait.ClientEnvironment?

        public abstract val locationState: com.google.home.google.GeofenceTrait.LocationState?

        public abstract val observedTimestampSeconds: kotlin.Long?

        public abstract val localizedEventTime: kotlin.String?

        public abstract val accuracyInMeters: kotlin.Double?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: kotlin.UInt

        public abstract val clusterRevision: kotlin.UShort
    }

        public open class AttributesImpl public constructor(currentGeofenceRadius: kotlin.Double? = COMPILED_CODE, agentId: kotlin.String? = COMPILED_CODE, structureId: kotlin.String? = COMPILED_CODE, durationSinceRebootSeconds: kotlin.Long? = COMPILED_CODE, addressId: kotlin.String? = COMPILED_CODE, supportedGeofenceRadii: kotlin.collections.List<kotlin.Double>? = COMPILED_CODE, agentDeviceId: kotlin.String? = COMPILED_CODE, clientEnvironment: com.google.home.google.GeofenceTrait.ClientEnvironment? = COMPILED_CODE, locationState: com.google.home.google.GeofenceTrait.LocationState? = COMPILED_CODE, observedTimestampSeconds: kotlin.Long? = COMPILED_CODE, localizedEventTime: kotlin.String? = COMPILED_CODE, accuracyInMeters: kotlin.Double? = COMPILED_CODE, generatedCommandList:
        kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.google.GeofenceTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.google.GeofenceTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.google.GeofenceTrait.Attributes) { /* compiled code */ }

        public open val currentGeofenceRadius: kotlin.Double? /* compiled code */

        public open val agentId: kotlin.String? /* compiled code */

        public open val structureId: kotlin.String? /* compiled code */

        public open val durationSinceRebootSeconds: kotlin.Long? /* compiled code */

        public open val addressId: kotlin.String? /* compiled code */

        public open val supportedGeofenceRadii: kotlin.collections.List<kotlin.Double>? /* compiled code */

        public open val agentDeviceId: kotlin.String? /* compiled code */

        public open val clientEnvironment: com.google.home.google.GeofenceTrait.ClientEnvironment? /* compiled code */

        public open val locationState: com.google.home.google.GeofenceTrait.LocationState? /* compiled code */

        public open val observedTimestampSeconds: kotlin.Long? /* compiled code */

        public open val localizedEventTime: kotlin.String? /* compiled code */

        public open val accuracyInMeters: kotlin.Double? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: kotlin.UInt /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

                public final fun copy(currentGeofenceRadius: kotlin.Double? = COMPILED_CODE, agentId: kotlin.String? = COMPILED_CODE, structureId: kotlin.String? = COMPILED_CODE, durationSinceRebootSeconds: kotlin.Long? = COMPILED_CODE, addressId: kotlin.String? = COMPILED_CODE, supportedGeofenceRadii: kotlin.collections.List<kotlin.Double>? = COMPILED_CODE, agentDeviceId: kotlin.String? = COMPILED_CODE, clientEnvironment: com.google.home.google.GeofenceTrait.ClientEnvironment? = COMPILED_CODE, locationState: com.google.home.google.GeofenceTrait.LocationState? = COMPILED_CODE, observedTimestampSeconds: kotlin.Long? = COMPILED_CODE, localizedEventTime: kotlin.String? = COMPILED_CODE, accuracyInMeters: kotlin.Double? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt>
            = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.google.GeofenceTrait.AttributesImpl { /* compiled code */ }
    }
}
