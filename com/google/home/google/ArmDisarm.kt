// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface ArmDisarm : com.google.home.google.ArmDisarmTrait.Attributes, com.google.home.matter.MatterTrait, com.google.home.google.ArmDisarmCommands {
    public companion object : com.google.home.TraitFactory<com.google.home.google.ArmDisarm> {
        public final val availableArmLevels: com.google.home.automation.Attribute<com.google.home.google.ArmDisarmTrait.AvailableArmLevels?> /* compiled code */
            public final get

        public final val isArmed: com.google.home.automation.Attribute<kotlin.Boolean?> /* compiled code */
            public final get

        public final val currentArmLevel: com.google.home.automation.Attribute<kotlin.String?> /* compiled code */
            public final get

        public final val exitAllowanceSeconds: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val armState: com.google.home.automation.Attribute<com.google.home.google.ArmDisarmTrait.ArmState?> /* compiled code */
            public final get

        public final val targetArmLevel: com.google.home.automation.Attribute<kotlin.String?> /* compiled code */
            public final get

        public final val exitAllowanceEndTimeSeconds: com.google.home.automation.Attribute<kotlin.Long?> /* compiled code */
            public final get

        public final val entryAllowanceEndTimeSeconds: com.google.home.automation.Attribute<kotlin.Long?> /* compiled code */
            public final get

        public final val generatedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val acceptedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val attributeList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val featureMap: com.google.home.automation.Attribute<kotlin.UInt> /* compiled code */
            public final get

        public final val clusterRevision: com.google.home.automation.Attribute<kotlin.UShort> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ArmDisarm?>.availableArmLevels: com.google.home.automation.TypedExpression<com.google.home.google.ArmDisarmTrait.AvailableArmLevels?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ArmDisarm?>.isArmed: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ArmDisarm?>.currentArmLevel: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ArmDisarm?>.exitAllowanceSeconds: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ArmDisarm?>.armState: com.google.home.automation.TypedExpression<com.google.home.google.ArmDisarmTrait.ArmState?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ArmDisarm?>.targetArmLevel: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ArmDisarm?>.exitAllowanceEndTimeSeconds: com.google.home.automation.TypedExpression<kotlin.Long?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ArmDisarm?>.entryAllowanceEndTimeSeconds: com.google.home.automation.TypedExpression<kotlin.Long?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ArmDisarm?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ArmDisarm?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ArmDisarm?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ArmDisarm?>.featureMap: com.google.home.automation.TypedExpression<kotlin.UInt> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ArmDisarm?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        public final fun armDisarm(arm: kotlin.Boolean, optionalArgs: com.google.home.google.ArmDisarmTrait.ArmDisarmCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.automation.Command { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.google.ArmDisarm> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.google.ArmDisarm.Attribute): kotlin.Boolean

    public abstract fun supports(command: com.google.home.google.ArmDisarm.Command): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.ArmDisarm.Attribute> {
        @androidx.annotation.NonNull availableArmLevels,

        @androidx.annotation.NonNull isArmed,

        @androidx.annotation.NonNull currentArmLevel,

        @androidx.annotation.NonNull exitAllowanceSeconds,

        @androidx.annotation.NonNull armState,

        @androidx.annotation.NonNull targetArmLevel,

        @androidx.annotation.NonNull exitAllowanceEndTimeSeconds,

        @androidx.annotation.NonNull entryAllowanceEndTimeSeconds,

        @androidx.annotation.NonNull generatedCommandList,

        @androidx.annotation.NonNull acceptedCommandList,

        @androidx.annotation.NonNull attributeList,

        @androidx.annotation.NonNull featureMap,

        @androidx.annotation.NonNull clusterRevision;

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

    public final enum class Command private constructor(tag: kotlin.UInt) : kotlin.Enum<com.google.home.google.ArmDisarm.Command> {
        @androidx.annotation.NonNull ArmDisarm;

        public final val tag: kotlin.UInt /* compiled code */
    }

    public final class ArmDisarmFollowUpEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.google.ArmDisarmTrait.ArmDisarmFollowUp) : com.google.home.Event, com.google.home.google.ArmDisarmTrait.ArmDisarmFollowUp {
        public companion object : com.google.home.EventFactory<com.google.home.google.ArmDisarm.ArmDisarmFollowUpEvent> {
            public final val status: com.google.home.automation.EventField<com.google.home.google.ArmDisarmTrait.StatusEnum?> /* compiled code */
                public final get

            public final val armState: com.google.home.automation.EventField<com.google.home.google.ArmDisarmTrait.ArmState?> /* compiled code */
                public final get

            public final val errorCode: com.google.home.automation.EventField<kotlin.String?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ArmDisarm.ArmDisarmFollowUpEvent?>.status: com.google.home.automation.TypedExpression<com.google.home.google.ArmDisarmTrait.StatusEnum?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ArmDisarm.ArmDisarmFollowUpEvent?>.armState: com.google.home.automation.TypedExpression<com.google.home.google.ArmDisarmTrait.ArmState?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ArmDisarm.ArmDisarmFollowUpEvent?>.errorCode: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.google.ArmDisarmTrait.ArmDisarmFollowUp /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val armState: com.google.home.google.ArmDisarmTrait.ArmState? /* compiled code */

        public open val errorCode: kotlin.String? /* compiled code */

        public open val status: com.google.home.google.ArmDisarmTrait.StatusEnum? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.ArmDisarm.ArmDisarmFollowUpEvent.EventFields> {
            @androidx.annotation.NonNull status,

            @androidx.annotation.NonNull armState,

            @androidx.annotation.NonNull errorCode;

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

    public final class ArmDisarmArmStateEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.google.ArmDisarmTrait.ArmDisarmArmState) : com.google.home.Event, com.google.home.google.ArmDisarmTrait.ArmDisarmArmState {
        public companion object : com.google.home.EventFactory<com.google.home.google.ArmDisarm.ArmDisarmArmStateEvent> {
            public final val priority: com.google.home.automation.EventField<kotlin.UInt?> /* compiled code */
                public final get

            public final val armState: com.google.home.automation.EventField<com.google.home.google.ArmDisarmTrait.ArmState?> /* compiled code */
                public final get

            public final val exitAllowanceEndTimeSeconds: com.google.home.automation.EventField<kotlin.Long?> /* compiled code */
                public final get

            public final val entryAllowanceEndTimeSeconds: com.google.home.automation.EventField<kotlin.Long?> /* compiled code */
                public final get

            public final val currentArmLevel: com.google.home.automation.EventField<kotlin.String?> /* compiled code */
                public final get

            public final val targetArmLevel: com.google.home.automation.EventField<kotlin.String?> /* compiled code */
                public final get

            public final val triggeredDeviceId: com.google.home.automation.EventField<kotlin.String?> /* compiled code */
                public final get

            public final val errorCode: com.google.home.automation.EventField<com.google.home.google.ArmDisarmTrait.ErrorCode?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ArmDisarm.ArmDisarmArmStateEvent?>.priority: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ArmDisarm.ArmDisarmArmStateEvent?>.armState: com.google.home.automation.TypedExpression<com.google.home.google.ArmDisarmTrait.ArmState?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ArmDisarm.ArmDisarmArmStateEvent?>.exitAllowanceEndTimeSeconds: com.google.home.automation.TypedExpression<kotlin.Long?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ArmDisarm.ArmDisarmArmStateEvent?>.entryAllowanceEndTimeSeconds: com.google.home.automation.TypedExpression<kotlin.Long?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ArmDisarm.ArmDisarmArmStateEvent?>.currentArmLevel: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ArmDisarm.ArmDisarmArmStateEvent?>.targetArmLevel: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ArmDisarm.ArmDisarmArmStateEvent?>.triggeredDeviceId: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ArmDisarm.ArmDisarmArmStateEvent?>.errorCode: com.google.home.automation.TypedExpression<com.google.home.google.ArmDisarmTrait.ErrorCode?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.google.ArmDisarmTrait.ArmDisarmArmState /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val armState: com.google.home.google.ArmDisarmTrait.ArmState? /* compiled code */

        public open val currentArmLevel: kotlin.String? /* compiled code */

        public open val entryAllowanceEndTimeSeconds: kotlin.Long? /* compiled code */

        public open val errorCode: com.google.home.google.ArmDisarmTrait.ErrorCode? /* compiled code */

        public open val exitAllowanceEndTimeSeconds: kotlin.Long? /* compiled code */

        public open val priority: kotlin.UInt? /* compiled code */

        public open val targetArmLevel: kotlin.String? /* compiled code */

        public open val triggeredDeviceId: kotlin.String? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.ArmDisarm.ArmDisarmArmStateEvent.EventFields> {
            @androidx.annotation.NonNull priority,

            @androidx.annotation.NonNull armState,

            @androidx.annotation.NonNull exitAllowanceEndTimeSeconds,

            @androidx.annotation.NonNull entryAllowanceEndTimeSeconds,

            @androidx.annotation.NonNull currentArmLevel,

            @androidx.annotation.NonNull targetArmLevel,

            @androidx.annotation.NonNull triggeredDeviceId,

            @androidx.annotation.NonNull errorCode;

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

