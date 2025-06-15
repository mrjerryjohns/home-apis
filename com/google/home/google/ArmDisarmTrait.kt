// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public object ArmDisarmTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class LevelCategory private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.ArmDisarmTrait.LevelCategory> {
        @androidx.annotation.NonNull Unknown,

        @androidx.annotation.NonNull Stay,

        @androidx.annotation.NonNull Away,

        @androidx.annotation.NonNull Instant,

        @androidx.annotation.NonNull Night,

        @androidx.annotation.NonNull Custom,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.ArmDisarmTrait.LevelCategory> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class ArmState private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.ArmDisarmTrait.ArmState> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull Armed,

        @androidx.annotation.NonNull Disarmed,

        @androidx.annotation.NonNull PreAlarm,

        @androidx.annotation.NonNull Alarm,

        @androidx.annotation.NonNull ExitCountdown,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.ArmDisarmTrait.ArmState> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class StatusEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.ArmDisarmTrait.StatusEnum> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull Success,

        @androidx.annotation.NonNull Failure,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.ArmDisarmTrait.StatusEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class ErrorCode private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.ArmDisarmTrait.ErrorCode> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull DoorOpen,

        @androidx.annotation.NonNull WindowOpen,

        @androidx.annotation.NonNull IsOpen,

        @androidx.annotation.NonNull MotionDetected,

        @androidx.annotation.NonNull DeviceTampered,

        @androidx.annotation.NonNull DeviceMoved,

        @androidx.annotation.NonNull DeviceUnplugged,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.ArmDisarmTrait.ErrorCode> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public interface ArmDisarmFollowUp {
        public abstract val status: com.google.home.google.ArmDisarmTrait.StatusEnum?

        public abstract val armState: com.google.home.google.ArmDisarmTrait.ArmState?

        public abstract val errorCode: kotlin.String?
    }

    public final class ArmDisarmFollowUpImpl public constructor(status: com.google.home.google.ArmDisarmTrait.StatusEnum? = COMPILED_CODE, armState: com.google.home.google.ArmDisarmTrait.ArmState? = COMPILED_CODE, errorCode: kotlin.String? = COMPILED_CODE) : com.google.home.google.ArmDisarmTrait.ArmDisarmFollowUp {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ArmDisarmTrait.ArmDisarmFollowUp> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ArmDisarmTrait.ArmDisarmFollowUp): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ArmDisarmTrait.ArmDisarmFollowUp { /* compiled code */ }
        }

        public open val status: com.google.home.google.ArmDisarmTrait.StatusEnum? /* compiled code */

        public open val armState: com.google.home.google.ArmDisarmTrait.ArmState? /* compiled code */

        public open val errorCode: kotlin.String? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface ArmDisarmArmState {
        public abstract val priority: kotlin.UInt?

        public abstract val armState: com.google.home.google.ArmDisarmTrait.ArmState?

        public abstract val exitAllowanceEndTimeSeconds: kotlin.Long?

        public abstract val entryAllowanceEndTimeSeconds: kotlin.Long?

        public abstract val currentArmLevel: kotlin.String?

        public abstract val targetArmLevel: kotlin.String?

        public abstract val triggeredDeviceId: kotlin.String?

        public abstract val errorCode: com.google.home.google.ArmDisarmTrait.ErrorCode?
    }

    public final class ArmDisarmArmStateImpl public constructor(priority: kotlin.UInt? = COMPILED_CODE, armState: com.google.home.google.ArmDisarmTrait.ArmState? = COMPILED_CODE, exitAllowanceEndTimeSeconds: kotlin.Long? = COMPILED_CODE, entryAllowanceEndTimeSeconds: kotlin.Long? = COMPILED_CODE, currentArmLevel: kotlin.String? = COMPILED_CODE, targetArmLevel: kotlin.String? = COMPILED_CODE, triggeredDeviceId: kotlin.String? = COMPILED_CODE, errorCode: com.google.home.google.ArmDisarmTrait.ErrorCode? = COMPILED_CODE) : com.google.home.google.ArmDisarmTrait.ArmDisarmArmState {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ArmDisarmTrait.ArmDisarmArmState> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ArmDisarmTrait.ArmDisarmArmState): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ArmDisarmTrait.ArmDisarmArmState { /* compiled code */ }
        }

        public open val priority: kotlin.UInt? /* compiled code */

        public open val armState: com.google.home.google.ArmDisarmTrait.ArmState? /* compiled code */

        public open val exitAllowanceEndTimeSeconds: kotlin.Long? /* compiled code */

        public open val entryAllowanceEndTimeSeconds: kotlin.Long? /* compiled code */

        public open val currentArmLevel: kotlin.String? /* compiled code */

        public open val targetArmLevel: kotlin.String? /* compiled code */

        public open val triggeredDeviceId: kotlin.String? /* compiled code */

        public open val errorCode: com.google.home.google.ArmDisarmTrait.ErrorCode? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final class LevelValues public constructor(levelSynonym: kotlin.collections.List<kotlin.String> = COMPILED_CODE, languageCode: kotlin.String = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ArmDisarmTrait.LevelValues>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ArmDisarmTrait.LevelValues?>.levelSynonym: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.String>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ArmDisarmTrait.LevelValues?>.languageCode: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ArmDisarmTrait.LevelValues): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ArmDisarmTrait.LevelValues { /* compiled code */ }
        }

        public final val levelSynonym: kotlin.collections.List<kotlin.String> /* compiled code */

        public final val languageCode: kotlin.String /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.ArmDisarmTrait.LevelValues.StructFields> {
            @androidx.annotation.NonNull levelSynonym,

            @androidx.annotation.NonNull languageCode;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class Levels public constructor(level: kotlin.String = COMPILED_CODE, levelValues: kotlin.collections.List<com.google.home.google.ArmDisarmTrait.LevelValues> = COMPILED_CODE, levelCategory: com.google.home.google.ArmDisarmTrait.LevelCategory = COMPILED_CODE, exitAllowanceSeconds: kotlin.UInt = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ArmDisarmTrait.Levels>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ArmDisarmTrait.Levels?>.level: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ArmDisarmTrait.Levels?>.levelValues: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.google.ArmDisarmTrait.LevelValues>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ArmDisarmTrait.Levels?>.levelCategory: com.google.home.automation.TypedExpression<com.google.home.google.ArmDisarmTrait.LevelCategory> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ArmDisarmTrait.Levels?>.exitAllowanceSeconds: com.google.home.automation.TypedExpression<kotlin.UInt> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ArmDisarmTrait.Levels): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ArmDisarmTrait.Levels { /* compiled code */ }
        }

        public final val level: kotlin.String /* compiled code */

        public final val levelValues: kotlin.collections.List<com.google.home.google.ArmDisarmTrait.LevelValues> /* compiled code */

        public final val levelCategory: com.google.home.google.ArmDisarmTrait.LevelCategory /* compiled code */

        public final val exitAllowanceSeconds: kotlin.UInt /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.ArmDisarmTrait.Levels.StructFields> {
            @androidx.annotation.NonNull level,

            @androidx.annotation.NonNull levelValues,

            @androidx.annotation.NonNull levelCategory,

            @androidx.annotation.NonNull exitAllowanceSeconds;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class AvailableArmLevels public constructor(levels: kotlin.collections.List<com.google.home.google.ArmDisarmTrait.Levels> = COMPILED_CODE, ordered: kotlin.Boolean = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ArmDisarmTrait.AvailableArmLevels>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ArmDisarmTrait.AvailableArmLevels?>.levels: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.google.ArmDisarmTrait.Levels>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ArmDisarmTrait.AvailableArmLevels?>.ordered: com.google.home.automation.TypedExpression<kotlin.Boolean> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ArmDisarmTrait.AvailableArmLevels): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ArmDisarmTrait.AvailableArmLevels { /* compiled code */ }
        }

        public final val levels: kotlin.collections.List<com.google.home.google.ArmDisarmTrait.Levels> /* compiled code */

        public final val ordered: kotlin.Boolean /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.ArmDisarmTrait.AvailableArmLevels.StructFields> {
            @androidx.annotation.NonNull levels,

            @androidx.annotation.NonNull ordered;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ArmDisarmTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ArmDisarmTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ArmDisarmTrait.Attributes { /* compiled code */ }
        }

        public abstract val availableArmLevels: com.google.home.google.ArmDisarmTrait.AvailableArmLevels?

        public abstract val isArmed: kotlin.Boolean?

        public abstract val currentArmLevel: kotlin.String?

        public abstract val exitAllowanceSeconds: kotlin.UInt?

        public abstract val armState: com.google.home.google.ArmDisarmTrait.ArmState?

        public abstract val targetArmLevel: kotlin.String?

        public abstract val exitAllowanceEndTimeSeconds: kotlin.Long?

        public abstract val entryAllowanceEndTimeSeconds: kotlin.Long?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: kotlin.UInt

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(availableArmLevels: com.google.home.google.ArmDisarmTrait.AvailableArmLevels? = COMPILED_CODE, isArmed: kotlin.Boolean? = COMPILED_CODE, currentArmLevel: kotlin.String? = COMPILED_CODE, exitAllowanceSeconds: kotlin.UInt? = COMPILED_CODE, armState: com.google.home.google.ArmDisarmTrait.ArmState? = COMPILED_CODE, targetArmLevel: kotlin.String? = COMPILED_CODE, exitAllowanceEndTimeSeconds: kotlin.Long? = COMPILED_CODE, entryAllowanceEndTimeSeconds: kotlin.Long? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.google.ArmDisarmTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.google.ArmDisarmTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.google.ArmDisarmTrait.Attributes) { /* compiled code */ }

        public open val availableArmLevels: com.google.home.google.ArmDisarmTrait.AvailableArmLevels? /* compiled code */

        public open val isArmed: kotlin.Boolean? /* compiled code */

        public open val currentArmLevel: kotlin.String? /* compiled code */

        public open val exitAllowanceSeconds: kotlin.UInt? /* compiled code */

        public open val armState: com.google.home.google.ArmDisarmTrait.ArmState? /* compiled code */

        public open val targetArmLevel: kotlin.String? /* compiled code */

        public open val exitAllowanceEndTimeSeconds: kotlin.Long? /* compiled code */

        public open val entryAllowanceEndTimeSeconds: kotlin.Long? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: kotlin.UInt /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(availableArmLevels: com.google.home.google.ArmDisarmTrait.AvailableArmLevels? = COMPILED_CODE, isArmed: kotlin.Boolean? = COMPILED_CODE, currentArmLevel: kotlin.String? = COMPILED_CODE, exitAllowanceSeconds: kotlin.UInt? = COMPILED_CODE, armState: com.google.home.google.ArmDisarmTrait.ArmState? = COMPILED_CODE, targetArmLevel: kotlin.String? = COMPILED_CODE, exitAllowanceEndTimeSeconds: kotlin.Long? = COMPILED_CODE, entryAllowanceEndTimeSeconds: kotlin.Long? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.google.ArmDisarmTrait.AttributesImpl { /* compiled code */ }
    }

    public object ArmDisarmCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(arm: kotlin.Boolean = COMPILED_CODE, armLevel: com.google.home.matter.serialization.OptionalValue<kotlin.String> = COMPILED_CODE, cancel: com.google.home.matter.serialization.OptionalValue<kotlin.Boolean> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ArmDisarmTrait.ArmDisarmCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ArmDisarmTrait.ArmDisarmCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ArmDisarmTrait.ArmDisarmCommand.Request { /* compiled code */ }
            }

            public final val arm: kotlin.Boolean /* compiled code */

            public final val armLevel: com.google.home.matter.serialization.OptionalValue<kotlin.String> /* compiled code */

            public final val cancel: com.google.home.matter.serialization.OptionalValue<kotlin.Boolean> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.ArmDisarmTrait.ArmDisarmCommand.Request.CommandFields> {
                @androidx.annotation.NonNull arm,

                @androidx.annotation.NonNull armLevel,

                @androidx.annotation.NonNull cancel;

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
            public abstract var armLevel: kotlin.String

            public abstract var cancel: kotlin.Boolean
        }
    }
}

