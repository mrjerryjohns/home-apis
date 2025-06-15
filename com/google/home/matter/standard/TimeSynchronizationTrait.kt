// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object TimeSynchronizationTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class GranularityEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.TimeSynchronizationTrait.GranularityEnum> {
        @androidx.annotation.NonNull NoTimeGranularity,

        @androidx.annotation.NonNull MinutesGranularity,

        @androidx.annotation.NonNull SecondsGranularity,

        @androidx.annotation.NonNull MillisecondsGranularity,

        @androidx.annotation.NonNull MicrosecondsGranularity,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.TimeSynchronizationTrait.GranularityEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class StatusCode private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.TimeSynchronizationTrait.StatusCode> {
        @androidx.annotation.NonNull TimeNotAccepted,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.TimeSynchronizationTrait.StatusCode> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class TimeSourceEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.TimeSynchronizationTrait.TimeSourceEnum> {
        @androidx.annotation.NonNull None,

        @androidx.annotation.NonNull Unknown,

        @androidx.annotation.NonNull Admin,

        @androidx.annotation.NonNull NodeTimeCluster,

        @androidx.annotation.NonNull NonMatterSNTP,

        @androidx.annotation.NonNull NonMatterNTP,

        @androidx.annotation.NonNull MatterSNTP,

        @androidx.annotation.NonNull MatterNTP,

        @androidx.annotation.NonNull MixedNTP,

        @androidx.annotation.NonNull NonMatterSNTPNTS,

        @androidx.annotation.NonNull NonMatterNTPNTS,

        @androidx.annotation.NonNull MatterSNTPNTS,

        @androidx.annotation.NonNull MatterNTPNTS,

        @androidx.annotation.NonNull MixedNTPNTS,

        @androidx.annotation.NonNull CloudSource,

        @androidx.annotation.NonNull PTP,

        @androidx.annotation.NonNull GNSS,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.TimeSynchronizationTrait.TimeSourceEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class TimeZoneDatabaseEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.TimeSynchronizationTrait.TimeZoneDatabaseEnum> {
        @androidx.annotation.NonNull Full,

        @androidx.annotation.NonNull Partial,

        @androidx.annotation.NonNull None,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.TimeSynchronizationTrait.TimeZoneDatabaseEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final data class Feature public constructor(timeZone: kotlin.Boolean = COMPILED_CODE, ntpClient: kotlin.Boolean = COMPILED_CODE, ntpServer: kotlin.Boolean = COMPILED_CODE, timeSyncClient: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.TimeSynchronizationTrait.Feature> {
            private const final val TIME_ZONE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val NTP_CLIENT_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val NTP_SERVER_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val TIME_SYNC_CLIENT_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.TimeSynchronizationTrait.Feature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.TimeSynchronizationTrait.Feature { /* compiled code */ }
        }

        public final val timeZone: kotlin.Boolean /* compiled code */

        public final val ntpClient: kotlin.Boolean /* compiled code */

        public final val ntpServer: kotlin.Boolean /* compiled code */

        public final val timeSyncClient: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(timeZone: kotlin.Boolean = COMPILED_CODE, ntpClient: kotlin.Boolean = COMPILED_CODE, ntpServer: kotlin.Boolean = COMPILED_CODE, timeSyncClient: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.TimeSynchronizationTrait.Feature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface DstTableEmpty {
    }

    public final class DstTableEmptyImpl public constructor() : com.google.home.matter.standard.TimeSynchronizationTrait.DstTableEmpty {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.TimeSynchronizationTrait.DstTableEmpty> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.TimeSynchronizationTrait.DstTableEmptyImpl { /* compiled code */ }
        }
    }

    public interface DstStatus {
        public abstract val dstOffsetActive: kotlin.Boolean?
    }

    public final class DstStatusImpl public constructor(dstOffsetActive: kotlin.Boolean? = COMPILED_CODE) : com.google.home.matter.standard.TimeSynchronizationTrait.DstStatus {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.TimeSynchronizationTrait.DstStatus> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.TimeSynchronizationTrait.DstStatus): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.TimeSynchronizationTrait.DstStatus { /* compiled code */ }
        }

        public open val dstOffsetActive: kotlin.Boolean? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface TimeZoneStatus {
        public abstract val offset: kotlin.Int?

        public abstract val name: kotlin.String?
    }

    public final class TimeZoneStatusImpl public constructor(offset: kotlin.Int? = COMPILED_CODE, name: kotlin.String? = COMPILED_CODE) : com.google.home.matter.standard.TimeSynchronizationTrait.TimeZoneStatus {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.TimeSynchronizationTrait.TimeZoneStatus> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.TimeSynchronizationTrait.TimeZoneStatus): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.TimeSynchronizationTrait.TimeZoneStatus { /* compiled code */ }
        }

        public open val offset: kotlin.Int? /* compiled code */

        public open val name: kotlin.String? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface TimeFailure {
    }

    public final class TimeFailureImpl public constructor() : com.google.home.matter.standard.TimeSynchronizationTrait.TimeFailure {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.TimeSynchronizationTrait.TimeFailure> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.TimeSynchronizationTrait.TimeFailureImpl { /* compiled code */ }
        }
    }

    public interface MissingTrustedTimeSource {
    }

    public final class MissingTrustedTimeSourceImpl public constructor() : com.google.home.matter.standard.TimeSynchronizationTrait.MissingTrustedTimeSource {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.TimeSynchronizationTrait.MissingTrustedTimeSource> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.TimeSynchronizationTrait.MissingTrustedTimeSourceImpl { /* compiled code */ }
        }
    }

    public final class DstOffsetStruct public constructor(offset: kotlin.Int = COMPILED_CODE, validStarting: kotlin.ULong = COMPILED_CODE, validUntil: kotlin.ULong? = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.TimeSynchronizationTrait.DstOffsetStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.TimeSynchronizationTrait.DstOffsetStruct?>.offset: com.google.home.automation.TypedExpression<kotlin.Int> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.TimeSynchronizationTrait.DstOffsetStruct?>.validStarting: com.google.home.automation.TypedExpression<kotlin.ULong> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.TimeSynchronizationTrait.DstOffsetStruct?>.validUntil: com.google.home.automation.TypedExpression<kotlin.ULong?> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.TimeSynchronizationTrait.DstOffsetStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.TimeSynchronizationTrait.DstOffsetStruct { /* compiled code */ }
        }

        public final val offset: kotlin.Int /* compiled code */

        public final val validStarting: kotlin.ULong /* compiled code */

        public final val validUntil: kotlin.ULong? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.TimeSynchronizationTrait.DstOffsetStruct.StructFields> {
            @androidx.annotation.NonNull offset,

            @androidx.annotation.NonNull validStarting,

            @androidx.annotation.NonNull validUntil;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class FabricScopedTrustedTimeSourceStruct public constructor(nodeId: kotlin.ULong = COMPILED_CODE, endpoint: kotlin.UShort = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.TimeSynchronizationTrait.FabricScopedTrustedTimeSourceStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.TimeSynchronizationTrait.FabricScopedTrustedTimeSourceStruct?>.nodeId: com.google.home.automation.TypedExpression<kotlin.ULong> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.TimeSynchronizationTrait.FabricScopedTrustedTimeSourceStruct?>.endpoint: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.TimeSynchronizationTrait.FabricScopedTrustedTimeSourceStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.TimeSynchronizationTrait.FabricScopedTrustedTimeSourceStruct { /* compiled code */ }
        }

        public final val nodeId: kotlin.ULong /* compiled code */

        public final val endpoint: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.TimeSynchronizationTrait.FabricScopedTrustedTimeSourceStruct.StructFields> {
            @androidx.annotation.NonNull nodeId,

            @androidx.annotation.NonNull endpoint;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class TimeZoneStruct public constructor(offset: kotlin.Int = COMPILED_CODE, validAt: kotlin.ULong = COMPILED_CODE, name: com.google.home.matter.serialization.OptionalValue<kotlin.String> = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.TimeSynchronizationTrait.TimeZoneStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.TimeSynchronizationTrait.TimeZoneStruct?>.offset: com.google.home.automation.TypedExpression<kotlin.Int> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.TimeSynchronizationTrait.TimeZoneStruct?>.validAt: com.google.home.automation.TypedExpression<kotlin.ULong> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.TimeSynchronizationTrait.TimeZoneStruct?>.name: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.String>> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.TimeSynchronizationTrait.TimeZoneStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.TimeSynchronizationTrait.TimeZoneStruct { /* compiled code */ }
        }

        public final val offset: kotlin.Int /* compiled code */

        public final val validAt: kotlin.ULong /* compiled code */

        public final val name: com.google.home.matter.serialization.OptionalValue<kotlin.String> /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.TimeSynchronizationTrait.TimeZoneStruct.StructFields> {
            @androidx.annotation.NonNull offset,

            @androidx.annotation.NonNull validAt,

            @androidx.annotation.NonNull Name;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class TrustedTimeSourceStruct public constructor(fabricIndex: kotlin.UByte = COMPILED_CODE, nodeId: kotlin.ULong = COMPILED_CODE, endpoint: kotlin.UShort = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.TimeSynchronizationTrait.TrustedTimeSourceStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.TimeSynchronizationTrait.TrustedTimeSourceStruct?>.fabricIndex: com.google.home.automation.TypedExpression<kotlin.UByte> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.TimeSynchronizationTrait.TrustedTimeSourceStruct?>.nodeId: com.google.home.automation.TypedExpression<kotlin.ULong> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.TimeSynchronizationTrait.TrustedTimeSourceStruct?>.endpoint: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.TimeSynchronizationTrait.TrustedTimeSourceStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.TimeSynchronizationTrait.TrustedTimeSourceStruct { /* compiled code */ }
        }

        public final val fabricIndex: kotlin.UByte /* compiled code */

        public final val nodeId: kotlin.ULong /* compiled code */

        public final val endpoint: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.TimeSynchronizationTrait.TrustedTimeSourceStruct.StructFields> {
            @androidx.annotation.NonNull fabricIndex,

            @androidx.annotation.NonNull nodeId,

            @androidx.annotation.NonNull endpoint;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.TimeSynchronizationTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.TimeSynchronizationTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.TimeSynchronizationTrait.Attributes { /* compiled code */ }
        }

        public abstract val utcTime: kotlin.ULong?

        public abstract val granularity: com.google.home.matter.standard.TimeSynchronizationTrait.GranularityEnum?

        public abstract val timeSource: com.google.home.matter.standard.TimeSynchronizationTrait.TimeSourceEnum?

        public abstract val trustedTimeSource: com.google.home.matter.standard.TimeSynchronizationTrait.TrustedTimeSourceStruct?

        public abstract val defaultNtp: kotlin.String?

        public abstract val timeZone: kotlin.collections.List<com.google.home.matter.standard.TimeSynchronizationTrait.TimeZoneStruct>?

        public abstract val dstOffset: kotlin.collections.List<com.google.home.matter.standard.TimeSynchronizationTrait.DstOffsetStruct>?

        public abstract val localTime: kotlin.ULong?

        public abstract val timeZoneDatabase: com.google.home.matter.standard.TimeSynchronizationTrait.TimeZoneDatabaseEnum?

        public abstract val ntpServerAvailable: kotlin.Boolean?

        public abstract val timeZoneListMaxSize: kotlin.UByte?

        public abstract val dstOffsetListMaxSize: kotlin.UByte?

        public abstract val supportsDnsResolve: kotlin.Boolean?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: com.google.home.matter.standard.TimeSynchronizationTrait.Feature

        public abstract val clusterRevision: kotlin.UShort
    }

        public open class AttributesImpl public constructor(utcTime: kotlin.ULong? = COMPILED_CODE, granularity: com.google.home.matter.standard.TimeSynchronizationTrait.GranularityEnum? = COMPILED_CODE, timeSource: com.google.home.matter.standard.TimeSynchronizationTrait.TimeSourceEnum? = COMPILED_CODE, trustedTimeSource: com.google.home.matter.standard.TimeSynchronizationTrait.TrustedTimeSourceStruct? = COMPILED_CODE, defaultNtp: kotlin.String? = COMPILED_CODE, timeZone: kotlin.collections.List<com.google.home.matter.standard.TimeSynchronizationTrait.TimeZoneStruct>? = COMPILED_CODE, dstOffset: kotlin.collections.List<com.google.home.matter.standard.TimeSynchronizationTrait.DstOffsetStruct>? = COMPILED_CODE, localTime: kotlin.ULong? = COMPILED_CODE, timeZoneDatabase:
        com.google.home.matter.standard.TimeSynchronizationTrait.TimeZoneDatabaseEnum? = COMPILED_CODE, ntpServerAvailable: kotlin.Boolean? = COMPILED_CODE, timeZoneListMaxSize: kotlin.UByte? = COMPILED_CODE, dstOffsetListMaxSize: kotlin.UByte? = COMPILED_CODE, supportsDnsResolve: kotlin.Boolean? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.TimeSynchronizationTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.matter.standard.TimeSynchronizationTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.TimeSynchronizationTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.TimeSynchronizationTrait.Attributes) { /* compiled code */ }

        public open val utcTime: kotlin.ULong? /* compiled code */

        public open val granularity: com.google.home.matter.standard.TimeSynchronizationTrait.GranularityEnum? /* compiled code */

        public open val timeSource: com.google.home.matter.standard.TimeSynchronizationTrait.TimeSourceEnum? /* compiled code */

        public open val trustedTimeSource: com.google.home.matter.standard.TimeSynchronizationTrait.TrustedTimeSourceStruct? /* compiled code */

        public open val defaultNtp: kotlin.String? /* compiled code */

        public open val timeZone: kotlin.collections.List<com.google.home.matter.standard.TimeSynchronizationTrait.TimeZoneStruct>? /* compiled code */

        public open val dstOffset: kotlin.collections.List<com.google.home.matter.standard.TimeSynchronizationTrait.DstOffsetStruct>? /* compiled code */

        public open val localTime: kotlin.ULong? /* compiled code */

        public open val timeZoneDatabase: com.google.home.matter.standard.TimeSynchronizationTrait.TimeZoneDatabaseEnum? /* compiled code */

        public open val ntpServerAvailable: kotlin.Boolean? /* compiled code */

        public open val timeZoneListMaxSize: kotlin.UByte? /* compiled code */

        public open val dstOffsetListMaxSize: kotlin.UByte? /* compiled code */

        public open val supportsDnsResolve: kotlin.Boolean? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: com.google.home.matter.standard.TimeSynchronizationTrait.Feature /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

                public final fun copy(utcTime: kotlin.ULong? = COMPILED_CODE, granularity: com.google.home.matter.standard.TimeSynchronizationTrait.GranularityEnum? = COMPILED_CODE, timeSource: com.google.home.matter.standard.TimeSynchronizationTrait.TimeSourceEnum? = COMPILED_CODE, trustedTimeSource: com.google.home.matter.standard.TimeSynchronizationTrait.TrustedTimeSourceStruct? = COMPILED_CODE, defaultNtp: kotlin.String? = COMPILED_CODE, timeZone: kotlin.collections.List<com.google.home.matter.standard.TimeSynchronizationTrait.TimeZoneStruct>? = COMPILED_CODE, dstOffset: kotlin.collections.List<com.google.home.matter.standard.TimeSynchronizationTrait.DstOffsetStruct>? = COMPILED_CODE, localTime: kotlin.ULong? = COMPILED_CODE, timeZoneDatabase:
            com.google.home.matter.standard.TimeSynchronizationTrait.TimeZoneDatabaseEnum? = COMPILED_CODE, ntpServerAvailable: kotlin.Boolean? = COMPILED_CODE, timeZoneListMaxSize: kotlin.UByte? = COMPILED_CODE, dstOffsetListMaxSize: kotlin.UByte? = COMPILED_CODE, supportsDnsResolve: kotlin.Boolean? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.TimeSynchronizationTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.matter.standard.TimeSynchronizationTrait.AttributesImpl { /* compiled code */ }
    }

    public object SetUtcTimeCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(utcTime: kotlin.ULong = COMPILED_CODE, granularity: com.google.home.matter.standard.TimeSynchronizationTrait.GranularityEnum = COMPILED_CODE, timeSource: com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.TimeSynchronizationTrait.TimeSourceEnum> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.TimeSynchronizationTrait.SetUtcTimeCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.TimeSynchronizationTrait.SetUtcTimeCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.TimeSynchronizationTrait.SetUtcTimeCommand.Request { /* compiled code */ }
            }

            public final val utcTime: kotlin.ULong /* compiled code */

            public final val granularity: com.google.home.matter.standard.TimeSynchronizationTrait.GranularityEnum /* compiled code */

            public final val timeSource: com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.TimeSynchronizationTrait.TimeSourceEnum> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.TimeSynchronizationTrait.SetUtcTimeCommand.Request.CommandFields> {
                @androidx.annotation.NonNull utcTime,

                @androidx.annotation.NonNull granularity,

                @androidx.annotation.NonNull timeSource;

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
            public abstract var timeSource: com.google.home.matter.standard.TimeSynchronizationTrait.TimeSourceEnum
        }
    }

    public object SetTrustedTimeSourceCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(trustedTimeSource: com.google.home.matter.standard.TimeSynchronizationTrait.FabricScopedTrustedTimeSourceStruct? = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.TimeSynchronizationTrait.SetTrustedTimeSourceCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.TimeSynchronizationTrait.SetTrustedTimeSourceCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.TimeSynchronizationTrait.SetTrustedTimeSourceCommand.Request { /* compiled code */ }
            }

            public final val trustedTimeSource: com.google.home.matter.standard.TimeSynchronizationTrait.FabricScopedTrustedTimeSourceStruct? /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.TimeSynchronizationTrait.SetTrustedTimeSourceCommand.Request.CommandFields> {
                @androidx.annotation.NonNull trustedTimeSource;

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

    public object SetTimeZoneCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(timeZone: kotlin.collections.List<com.google.home.matter.standard.TimeSynchronizationTrait.TimeZoneStruct> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.TimeSynchronizationTrait.SetTimeZoneCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.TimeSynchronizationTrait.SetTimeZoneCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.TimeSynchronizationTrait.SetTimeZoneCommand.Request { /* compiled code */ }
            }

            public final val timeZone: kotlin.collections.List<com.google.home.matter.standard.TimeSynchronizationTrait.TimeZoneStruct> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.TimeSynchronizationTrait.SetTimeZoneCommand.Request.CommandFields> {
                @androidx.annotation.NonNull timeZone;

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

        public final class Response public constructor(dstOffsetRequired: kotlin.Boolean = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.TimeSynchronizationTrait.SetTimeZoneCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.TimeSynchronizationTrait.SetTimeZoneCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.TimeSynchronizationTrait.SetTimeZoneCommand.Response { /* compiled code */ }
            }

            public final val dstOffsetRequired: kotlin.Boolean /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.TimeSynchronizationTrait.SetTimeZoneCommand.Response.CommandFields> {
                @androidx.annotation.NonNull dstOffsetRequired;

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

    public object SetDstOffsetCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(dstOffset: kotlin.collections.List<com.google.home.matter.standard.TimeSynchronizationTrait.DstOffsetStruct> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.TimeSynchronizationTrait.SetDstOffsetCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.TimeSynchronizationTrait.SetDstOffsetCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.TimeSynchronizationTrait.SetDstOffsetCommand.Request { /* compiled code */ }
            }

            public final val dstOffset: kotlin.collections.List<com.google.home.matter.standard.TimeSynchronizationTrait.DstOffsetStruct> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.TimeSynchronizationTrait.SetDstOffsetCommand.Request.CommandFields> {
                @androidx.annotation.NonNull dstOffset;

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

    public object SetDefaultNtpCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(defaultNtp: kotlin.String? = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.TimeSynchronizationTrait.SetDefaultNtpCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.TimeSynchronizationTrait.SetDefaultNtpCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.TimeSynchronizationTrait.SetDefaultNtpCommand.Request { /* compiled code */ }
            }

            public final val defaultNtp: kotlin.String? /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.TimeSynchronizationTrait.SetDefaultNtpCommand.Request.CommandFields> {
                @androidx.annotation.NonNull defaultNtp;

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
