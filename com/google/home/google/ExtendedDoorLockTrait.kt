// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public object ExtendedDoorLockTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class StructureMode private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.ExtendedDoorLockTrait.StructureMode> {
        @androidx.annotation.NonNull StructureModeUnspecified,

        @androidx.annotation.NonNull StructureModeHome,

        @androidx.annotation.NonNull StructureModeAway,

        @androidx.annotation.NonNull StructureModeSleep,

        @androidx.annotation.NonNull StructureModeVacation,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.ExtendedDoorLockTrait.StructureMode> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class LockOperationTypeEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.ExtendedDoorLockTrait.LockOperationTypeEnum> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull Lock,

        @androidx.annotation.NonNull Unlock,

        @androidx.annotation.NonNull NonAccessUserEvent,

        @androidx.annotation.NonNull ForcedUserEvent,

        @androidx.annotation.NonNull Unlatch,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.ExtendedDoorLockTrait.LockOperationTypeEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class LockOperationSourceEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.ExtendedDoorLockTrait.LockOperationSourceEnum> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull Manual,

        @androidx.annotation.NonNull ProprietaryRemote,

        @androidx.annotation.NonNull Keypad,

        @androidx.annotation.NonNull Auto,

        @androidx.annotation.NonNull Button,

        @androidx.annotation.NonNull Schedule,

        @androidx.annotation.NonNull Remote,

        @androidx.annotation.NonNull Rfid,

        @androidx.annotation.NonNull Biometric,

        @androidx.annotation.NonNull Aliro,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.ExtendedDoorLockTrait.LockOperationSourceEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class PrivacyModeActorMethodEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.ExtendedDoorLockTrait.PrivacyModeActorMethodEnum> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull Other,

        @androidx.annotation.NonNull Physical,

        @androidx.annotation.NonNull RemoteUserExplicit,

        @androidx.annotation.NonNull RemoteUserImplicit,

        @androidx.annotation.NonNull RemoteReminderExplicit,

        @androidx.annotation.NonNull RemoteReminderImplicit,

        @androidx.annotation.NonNull RemoteUserOther,

        @androidx.annotation.NonNull RemoteDelegate,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.ExtendedDoorLockTrait.PrivacyModeActorMethodEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public interface LockStateChange {
        public abstract val priority: kotlin.UInt?

        public abstract val lock_operation_type: com.google.home.google.ExtendedDoorLockTrait.LockOperationTypeEnum?

        public abstract val lock_operation_source: com.google.home.google.ExtendedDoorLockTrait.LockOperationSourceEnum?

        public abstract val user_index: kotlin.UInt?

        public abstract val user_id: kotlin.Long?

        public abstract val fabric_index: kotlin.UInt?

        public abstract val actor_name: kotlin.String?

        public abstract val timeStampSeconds: kotlin.Long?
    }

    public final class LockStateChangeImpl public constructor(priority: kotlin.UInt? = COMPILED_CODE, lock_operation_type: com.google.home.google.ExtendedDoorLockTrait.LockOperationTypeEnum? = COMPILED_CODE, lock_operation_source: com.google.home.google.ExtendedDoorLockTrait.LockOperationSourceEnum? = COMPILED_CODE, user_index: kotlin.UInt? = COMPILED_CODE, user_id: kotlin.Long? = COMPILED_CODE, fabric_index: kotlin.UInt? = COMPILED_CODE, actor_name: kotlin.String? = COMPILED_CODE, timeStampSeconds: kotlin.Long? = COMPILED_CODE) : com.google.home.google.ExtendedDoorLockTrait.LockStateChange {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ExtendedDoorLockTrait.LockStateChange> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ExtendedDoorLockTrait.LockStateChange): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ExtendedDoorLockTrait.LockStateChange { /* compiled code */ }
        }

        public open val priority: kotlin.UInt? /* compiled code */

        public open val lock_operation_type: com.google.home.google.ExtendedDoorLockTrait.LockOperationTypeEnum? /* compiled code */

        public open val lock_operation_source: com.google.home.google.ExtendedDoorLockTrait.LockOperationSourceEnum? /* compiled code */

        public open val user_index: kotlin.UInt? /* compiled code */

        public open val user_id: kotlin.Long? /* compiled code */

        public open val fabric_index: kotlin.UInt? /* compiled code */

        public open val actor_name: kotlin.String? /* compiled code */

        public open val timeStampSeconds: kotlin.Long? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface PrivacyModeStateChange {
        public abstract val privacy_mode_on: kotlin.Boolean?

        public abstract val privacy_mode_actor: com.google.home.google.ExtendedDoorLockTrait.PrivacyModeActor?
    }

    public final class PrivacyModeStateChangeImpl public constructor(privacy_mode_on: kotlin.Boolean? = COMPILED_CODE, privacy_mode_actor: com.google.home.google.ExtendedDoorLockTrait.PrivacyModeActor? = COMPILED_CODE) : com.google.home.google.ExtendedDoorLockTrait.PrivacyModeStateChange {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ExtendedDoorLockTrait.PrivacyModeStateChange> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ExtendedDoorLockTrait.PrivacyModeStateChange): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ExtendedDoorLockTrait.PrivacyModeStateChange { /* compiled code */ }
        }

        public open val privacy_mode_on: kotlin.Boolean? /* compiled code */

        public open val privacy_mode_actor: com.google.home.google.ExtendedDoorLockTrait.PrivacyModeActor? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final class PrivacyModeActor public constructor(privacy_mode_actor_method: com.google.home.google.ExtendedDoorLockTrait.PrivacyModeActorMethodEnum = COMPILED_CODE, actor_name: kotlin.String = COMPILED_CODE, user_id: kotlin.Long = COMPILED_CODE, timeStampSeconds: kotlin.Long = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ExtendedDoorLockTrait.PrivacyModeActor>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedDoorLockTrait.PrivacyModeActor?>.privacy_mode_actor_method: com.google.home.automation.TypedExpression<com.google.home.google.ExtendedDoorLockTrait.PrivacyModeActorMethodEnum> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedDoorLockTrait.PrivacyModeActor?>.actor_name: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedDoorLockTrait.PrivacyModeActor?>.user_id: com.google.home.automation.TypedExpression<kotlin.Long> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedDoorLockTrait.PrivacyModeActor?>.timeStampSeconds: com.google.home.automation.TypedExpression<kotlin.Long> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ExtendedDoorLockTrait.PrivacyModeActor): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ExtendedDoorLockTrait.PrivacyModeActor { /* compiled code */ }
        }

        public final val privacy_mode_actor_method: com.google.home.google.ExtendedDoorLockTrait.PrivacyModeActorMethodEnum /* compiled code */

        public final val actor_name: kotlin.String /* compiled code */

        public final val user_id: kotlin.Long /* compiled code */

        public final val timeStampSeconds: kotlin.Long /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.ExtendedDoorLockTrait.PrivacyModeActor.StructFields> {
            @androidx.annotation.NonNull privacy_mode_actor_method,

            @androidx.annotation.NonNull actor_name,

            @androidx.annotation.NonNull user_id,

            @androidx.annotation.NonNull timeStampSeconds;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ExtendedDoorLockTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ExtendedDoorLockTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ExtendedDoorLockTrait.Attributes { /* compiled code */ }
        }

        public abstract val enableLockHomeAwayAssist: kotlin.Boolean?

        public abstract val ignoreAutoRelockOnStructureMode: kotlin.collections.List<com.google.home.google.ExtendedDoorLockTrait.StructureMode>?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: kotlin.UInt

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(enableLockHomeAwayAssist: kotlin.Boolean? = COMPILED_CODE, ignoreAutoRelockOnStructureMode: kotlin.collections.List<com.google.home.google.ExtendedDoorLockTrait.StructureMode>? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.google.ExtendedDoorLockTrait.Attributes, com.google.home.matter.serialization.CanMutate<com.google.home.google.ExtendedDoorLockTrait.Attributes, com.google.home.google.ExtendedDoorLockTrait.MutableAttributes> {
        public companion object {
            public final val Adapter: com.google.home.google.ExtendedDoorLockTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.google.ExtendedDoorLockTrait.Attributes) { /* compiled code */ }

        public open val enableLockHomeAwayAssist: kotlin.Boolean? /* compiled code */

        public open val ignoreAutoRelockOnStructureMode: kotlin.collections.List<com.google.home.google.ExtendedDoorLockTrait.StructureMode>? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: kotlin.UInt /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open fun mutate(init: com.google.home.google.ExtendedDoorLockTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.google.ExtendedDoorLockTrait.Attributes { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(enableLockHomeAwayAssist: kotlin.Boolean? = COMPILED_CODE, ignoreAutoRelockOnStructureMode: kotlin.collections.List<com.google.home.google.ExtendedDoorLockTrait.StructureMode>? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.google.ExtendedDoorLockTrait.AttributesImpl { /* compiled code */ }
    }

    public final class MutableAttributes public constructor(attributes: com.google.home.google.ExtendedDoorLockTrait.Attributes) : com.google.home.google.ExtendedDoorLockTrait.AttributesImpl {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ExtendedDoorLockTrait.MutableAttributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ExtendedDoorLockTrait.MutableAttributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ExtendedDoorLockTrait.MutableAttributes { /* compiled code */ }
        }

        internal final var _enableLockHomeAwayAssist: kotlin.Boolean? /* compiled code */

        public open val enableLockHomeAwayAssist: kotlin.Boolean? /* compiled code */
            public open get

        internal final var _ignoreAutoRelockOnStructureMode: kotlin.collections.List<com.google.home.google.ExtendedDoorLockTrait.StructureMode>? /* compiled code */

        public open val ignoreAutoRelockOnStructureMode: kotlin.collections.List<com.google.home.google.ExtendedDoorLockTrait.StructureMode>? /* compiled code */
            public open get

        public final fun setEnableLockHomeAwayAssist(value: kotlin.Boolean): kotlin.Unit { /* compiled code */ }

        public final fun setIgnoreAutoRelockOnStructureMode(value: kotlin.collections.List<com.google.home.google.ExtendedDoorLockTrait.StructureMode>): kotlin.Unit { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }
}

