// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public object MeterStateTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class CollectionType private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.MeterStateTrait.CollectionType> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull Measured,

        @androidx.annotation.NonNull Estimated,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.MeterStateTrait.CollectionType> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class MeasurementUnit private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.MeterStateTrait.MeasurementUnit> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull KilowattHours,

        @androidx.annotation.NonNull CubicMeters,

        @androidx.annotation.NonNull Btus,

        @androidx.annotation.NonNull Therms,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.MeterStateTrait.MeasurementUnit> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class CollectionScope private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.MeterStateTrait.CollectionScope> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull Self,

        @androidx.annotation.NonNull ConnectedDevice,

        @androidx.annotation.NonNull Aggregate,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.MeterStateTrait.CollectionScope> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class ResourceType private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.MeterStateTrait.ResourceType> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull Electricity,

        @androidx.annotation.NonNull Water,

        @androidx.annotation.NonNull NaturalGas,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.MeterStateTrait.ResourceType> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final data class MeterStateFeature public constructor(meterStateHistoryFetching: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.google.MeterStateTrait.MeterStateFeature> {
            private const final val METER_STATE_HISTORY_FETCHING_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.google.MeterStateTrait.MeterStateFeature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.google.MeterStateTrait.MeterStateFeature { /* compiled code */ }
        }

        public final val meterStateHistoryFetching: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(meterStateHistoryFetching: kotlin.Boolean = COMPILED_CODE): com.google.home.google.MeterStateTrait.MeterStateFeature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final class CurrentMeterStateData public constructor(resourceType: com.google.home.google.MeterStateTrait.ResourceType = COMPILED_CODE, collectionType: com.google.home.google.MeterStateTrait.CollectionType = COMPILED_CODE, collectionScope: com.google.home.google.MeterStateTrait.CollectionScope = COMPILED_CODE, startTimeUnixTimestampSeconds: kotlin.Long = COMPILED_CODE, endTimeUnixTimestampSeconds: kotlin.Long = COMPILED_CODE, rawValue: kotlin.Float = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.MeterStateTrait.CurrentMeterStateData>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.MeterStateTrait.CurrentMeterStateData?>.resourceType: com.google.home.automation.TypedExpression<com.google.home.google.MeterStateTrait.ResourceType> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.MeterStateTrait.CurrentMeterStateData?>.collectionType: com.google.home.automation.TypedExpression<com.google.home.google.MeterStateTrait.CollectionType> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.MeterStateTrait.CurrentMeterStateData?>.collectionScope: com.google.home.automation.TypedExpression<com.google.home.google.MeterStateTrait.CollectionScope> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.MeterStateTrait.CurrentMeterStateData?>.startTimeUnixTimestampSeconds: com.google.home.automation.TypedExpression<kotlin.Long> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.MeterStateTrait.CurrentMeterStateData?>.endTimeUnixTimestampSeconds: com.google.home.automation.TypedExpression<kotlin.Long> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.MeterStateTrait.CurrentMeterStateData?>.rawValue: com.google.home.automation.TypedExpression<kotlin.Float> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.MeterStateTrait.CurrentMeterStateData): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.MeterStateTrait.CurrentMeterStateData { /* compiled code */ }
        }

        public final val resourceType: com.google.home.google.MeterStateTrait.ResourceType /* compiled code */

        public final val collectionType: com.google.home.google.MeterStateTrait.CollectionType /* compiled code */

        public final val collectionScope: com.google.home.google.MeterStateTrait.CollectionScope /* compiled code */

        public final val startTimeUnixTimestampSeconds: kotlin.Long /* compiled code */

        public final val endTimeUnixTimestampSeconds: kotlin.Long /* compiled code */

        public final val rawValue: kotlin.Float /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.MeterStateTrait.CurrentMeterStateData.StructFields> {
            @androidx.annotation.NonNull resourceType,

            @androidx.annotation.NonNull collectionType,

            @androidx.annotation.NonNull collectionScope,

            @androidx.annotation.NonNull startTimeUnixTimestampSeconds,

            @androidx.annotation.NonNull endTimeUnixTimestampSeconds,

            @androidx.annotation.NonNull rawValue;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class SupportedMeterState public constructor(resourceType: com.google.home.google.MeterStateTrait.ResourceType = COMPILED_CODE, collectionType: com.google.home.google.MeterStateTrait.CollectionType = COMPILED_CODE, unit: com.google.home.google.MeterStateTrait.MeasurementUnit = COMPILED_CODE, collectionScope: com.google.home.google.MeterStateTrait.CollectionScope = COMPILED_CODE, tolerance: kotlin.Float = COMPILED_CODE, cadenceSeconds: kotlin.UInt = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.MeterStateTrait.SupportedMeterState>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.MeterStateTrait.SupportedMeterState?>.resourceType: com.google.home.automation.TypedExpression<com.google.home.google.MeterStateTrait.ResourceType> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.MeterStateTrait.SupportedMeterState?>.collectionType: com.google.home.automation.TypedExpression<com.google.home.google.MeterStateTrait.CollectionType> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.MeterStateTrait.SupportedMeterState?>.unit: com.google.home.automation.TypedExpression<com.google.home.google.MeterStateTrait.MeasurementUnit> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.MeterStateTrait.SupportedMeterState?>.collectionScope: com.google.home.automation.TypedExpression<com.google.home.google.MeterStateTrait.CollectionScope> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.MeterStateTrait.SupportedMeterState?>.tolerance: com.google.home.automation.TypedExpression<kotlin.Float> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.MeterStateTrait.SupportedMeterState?>.cadenceSeconds: com.google.home.automation.TypedExpression<kotlin.UInt> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.MeterStateTrait.SupportedMeterState): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.MeterStateTrait.SupportedMeterState { /* compiled code */ }
        }

        public final val resourceType: com.google.home.google.MeterStateTrait.ResourceType /* compiled code */

        public final val collectionType: com.google.home.google.MeterStateTrait.CollectionType /* compiled code */

        public final val unit: com.google.home.google.MeterStateTrait.MeasurementUnit /* compiled code */

        public final val collectionScope: com.google.home.google.MeterStateTrait.CollectionScope /* compiled code */

        public final val tolerance: kotlin.Float /* compiled code */

        public final val cadenceSeconds: kotlin.UInt /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.MeterStateTrait.SupportedMeterState.StructFields> {
            @androidx.annotation.NonNull resourceType,

            @androidx.annotation.NonNull collectionType,

            @androidx.annotation.NonNull unit,

            @androidx.annotation.NonNull collectionScope,

            @androidx.annotation.NonNull tolerance,

            @androidx.annotation.NonNull cadenceSeconds;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class MeterStates public constructor(resourceType: com.google.home.google.MeterStateTrait.ResourceType = COMPILED_CODE, collectionType: com.google.home.google.MeterStateTrait.CollectionType = COMPILED_CODE, collectionScope: com.google.home.google.MeterStateTrait.CollectionScope = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.MeterStateTrait.MeterStates>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.MeterStateTrait.MeterStates?>.resourceType: com.google.home.automation.TypedExpression<com.google.home.google.MeterStateTrait.ResourceType> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.MeterStateTrait.MeterStates?>.collectionType: com.google.home.automation.TypedExpression<com.google.home.google.MeterStateTrait.CollectionType> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.MeterStateTrait.MeterStates?>.collectionScope: com.google.home.automation.TypedExpression<com.google.home.google.MeterStateTrait.CollectionScope> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.MeterStateTrait.MeterStates): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.MeterStateTrait.MeterStates { /* compiled code */ }
        }

        public final val resourceType: com.google.home.google.MeterStateTrait.ResourceType /* compiled code */

        public final val collectionType: com.google.home.google.MeterStateTrait.CollectionType /* compiled code */

        public final val collectionScope: com.google.home.google.MeterStateTrait.CollectionScope /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.MeterStateTrait.MeterStates.StructFields> {
            @androidx.annotation.NonNull resourceType,

            @androidx.annotation.NonNull collectionType,

            @androidx.annotation.NonNull collectionScope;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.MeterStateTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.MeterStateTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.MeterStateTrait.Attributes { /* compiled code */ }
        }

        public abstract val supportedMeterStates: kotlin.collections.List<com.google.home.google.MeterStateTrait.SupportedMeterState>?

        public abstract val currentMeterStateData: kotlin.collections.List<com.google.home.google.MeterStateTrait.CurrentMeterStateData>?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: com.google.home.google.MeterStateTrait.MeterStateFeature

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(supportedMeterStates: kotlin.collections.List<com.google.home.google.MeterStateTrait.SupportedMeterState>? = COMPILED_CODE, currentMeterStateData: kotlin.collections.List<com.google.home.google.MeterStateTrait.CurrentMeterStateData>? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.google.MeterStateTrait.MeterStateFeature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.google.MeterStateTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.google.MeterStateTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.google.MeterStateTrait.Attributes) { /* compiled code */ }

        public open val supportedMeterStates: kotlin.collections.List<com.google.home.google.MeterStateTrait.SupportedMeterState>? /* compiled code */

        public open val currentMeterStateData: kotlin.collections.List<com.google.home.google.MeterStateTrait.CurrentMeterStateData>? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: com.google.home.google.MeterStateTrait.MeterStateFeature /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(supportedMeterStates: kotlin.collections.List<com.google.home.google.MeterStateTrait.SupportedMeterState>? = COMPILED_CODE, currentMeterStateData: kotlin.collections.List<com.google.home.google.MeterStateTrait.CurrentMeterStateData>? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.google.MeterStateTrait.MeterStateFeature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.google.MeterStateTrait.AttributesImpl { /* compiled code */ }
    }

    public object FetchMeterStateHistoryCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(startTimeUnixTimestampSeconds: kotlin.Long = COMPILED_CODE, endTimeUnixTimestampSeconds: kotlin.Long = COMPILED_CODE, meterStates: kotlin.collections.List<com.google.home.google.MeterStateTrait.MeterStates> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.MeterStateTrait.FetchMeterStateHistoryCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.MeterStateTrait.FetchMeterStateHistoryCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.MeterStateTrait.FetchMeterStateHistoryCommand.Request { /* compiled code */ }
            }

            public final val startTimeUnixTimestampSeconds: kotlin.Long /* compiled code */

            public final val endTimeUnixTimestampSeconds: kotlin.Long /* compiled code */

            public final val meterStates: kotlin.collections.List<com.google.home.google.MeterStateTrait.MeterStates> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.MeterStateTrait.FetchMeterStateHistoryCommand.Request.CommandFields> {
                @androidx.annotation.NonNull startTimeUnixTimestampSeconds,

                @androidx.annotation.NonNull endTimeUnixTimestampSeconds,

                @androidx.annotation.NonNull meterStates;

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

