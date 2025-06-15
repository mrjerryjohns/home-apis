// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public object ExtendedOperationalStateTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class StatusEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.ExtendedOperationalStateTrait.StatusEnum> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull Success,

        @androidx.annotation.NonNull Failure,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.ExtendedOperationalStateTrait.StatusEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final data class OperationalStateFeature public constructor(supportsZones: kotlin.Boolean = COMPILED_CODE, supportsDuration: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.google.ExtendedOperationalStateTrait.OperationalStateFeature> {
            private const final val SUPPORTS_ZONES_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val SUPPORTS_DURATION_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.google.ExtendedOperationalStateTrait.OperationalStateFeature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.google.ExtendedOperationalStateTrait.OperationalStateFeature { /* compiled code */ }
        }

        public final val supportsZones: kotlin.Boolean /* compiled code */

        public final val supportsDuration: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(supportsZones: kotlin.Boolean = COMPILED_CODE, supportsDuration: kotlin.Boolean = COMPILED_CODE): com.google.home.google.ExtendedOperationalStateTrait.OperationalStateFeature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface StartStopFollowUp {
        public abstract val isRunning: kotlin.Boolean?
    }

    public final class StartStopFollowUpImpl public constructor(isRunning: kotlin.Boolean? = COMPILED_CODE) : com.google.home.google.ExtendedOperationalStateTrait.StartStopFollowUp {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ExtendedOperationalStateTrait.StartStopFollowUp> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ExtendedOperationalStateTrait.StartStopFollowUp): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ExtendedOperationalStateTrait.StartStopFollowUp { /* compiled code */ }
        }

        public open val isRunning: kotlin.Boolean? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface PauseUnpauseFollowUp {
        public abstract val isPaused: kotlin.Boolean?
    }

    public final class PauseUnpauseFollowUpImpl public constructor(isPaused: kotlin.Boolean? = COMPILED_CODE) : com.google.home.google.ExtendedOperationalStateTrait.PauseUnpauseFollowUp {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ExtendedOperationalStateTrait.PauseUnpauseFollowUp> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ExtendedOperationalStateTrait.PauseUnpauseFollowUp): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ExtendedOperationalStateTrait.PauseUnpauseFollowUp { /* compiled code */ }
        }

        public open val isPaused: kotlin.Boolean? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface StartStopErrorFollowUp {
        public abstract val errorCode: kotlin.String?
    }

    public final class StartStopErrorFollowUpImpl public constructor(errorCode: kotlin.String? = COMPILED_CODE) : com.google.home.google.ExtendedOperationalStateTrait.StartStopErrorFollowUp {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ExtendedOperationalStateTrait.StartStopErrorFollowUp> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ExtendedOperationalStateTrait.StartStopErrorFollowUp): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ExtendedOperationalStateTrait.StartStopErrorFollowUp { /* compiled code */ }
        }

        public open val errorCode: kotlin.String? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ExtendedOperationalStateTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ExtendedOperationalStateTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ExtendedOperationalStateTrait.Attributes { /* compiled code */ }
        }

        public abstract val operationZones: kotlin.collections.List<kotlin.String>?

        public abstract val activeOperationZones: kotlin.collections.List<kotlin.String>?

        public abstract val currentPhaseCountdownTimeSeconds: kotlin.UInt?

        public abstract val minOperationDurationSeconds: kotlin.UInt?

        public abstract val maxOperationDurationSeconds: kotlin.UInt?

        public abstract val operationCompletionTimestamp: kotlin.Long?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: kotlin.UInt

        public abstract val clusterRevision: kotlin.UShort
    }

        public open class AttributesImpl public constructor(operationZones: kotlin.collections.List<kotlin.String>? = COMPILED_CODE, activeOperationZones: kotlin.collections.List<kotlin.String>? = COMPILED_CODE, currentPhaseCountdownTimeSeconds: kotlin.UInt? = COMPILED_CODE, minOperationDurationSeconds: kotlin.UInt? = COMPILED_CODE, maxOperationDurationSeconds: kotlin.UInt? = COMPILED_CODE, operationCompletionTimestamp: kotlin.Long? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) :
        com.google.home.google.ExtendedOperationalStateTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.google.ExtendedOperationalStateTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.google.ExtendedOperationalStateTrait.Attributes) { /* compiled code */ }

        public open val operationZones: kotlin.collections.List<kotlin.String>? /* compiled code */

        public open val activeOperationZones: kotlin.collections.List<kotlin.String>? /* compiled code */

        public open val currentPhaseCountdownTimeSeconds: kotlin.UInt? /* compiled code */

        public open val minOperationDurationSeconds: kotlin.UInt? /* compiled code */

        public open val maxOperationDurationSeconds: kotlin.UInt? /* compiled code */

        public open val operationCompletionTimestamp: kotlin.Long? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: kotlin.UInt /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

                public final fun copy(operationZones: kotlin.collections.List<kotlin.String>? = COMPILED_CODE, activeOperationZones: kotlin.collections.List<kotlin.String>? = COMPILED_CODE, currentPhaseCountdownTimeSeconds: kotlin.UInt? = COMPILED_CODE, minOperationDurationSeconds: kotlin.UInt? = COMPILED_CODE, maxOperationDurationSeconds: kotlin.UInt? = COMPILED_CODE, operationCompletionTimestamp: kotlin.Long? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE):
            com.google.home.google.ExtendedOperationalStateTrait.AttributesImpl { /* compiled code */ }
    }

    public object StartWithOperationZonesCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(operationZones: kotlin.collections.List<kotlin.String> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ExtendedOperationalStateTrait.StartWithOperationZonesCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ExtendedOperationalStateTrait.StartWithOperationZonesCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ExtendedOperationalStateTrait.StartWithOperationZonesCommand.Request { /* compiled code */ }
            }

            public final val operationZones: kotlin.collections.List<kotlin.String> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.ExtendedOperationalStateTrait.StartWithOperationZonesCommand.Request.CommandFields> {
                @androidx.annotation.NonNull operationZones;

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

    public object StartWithDurationCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(operationZones: kotlin.collections.List<kotlin.String> = COMPILED_CODE, durationSeconds: kotlin.UInt = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ExtendedOperationalStateTrait.StartWithDurationCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ExtendedOperationalStateTrait.StartWithDurationCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ExtendedOperationalStateTrait.StartWithDurationCommand.Request { /* compiled code */ }
            }

            public final val operationZones: kotlin.collections.List<kotlin.String> /* compiled code */

            public final val durationSeconds: kotlin.UInt /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.ExtendedOperationalStateTrait.StartWithDurationCommand.Request.CommandFields> {
                @androidx.annotation.NonNull operationZones,

                @androidx.annotation.NonNull durationSeconds;

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
