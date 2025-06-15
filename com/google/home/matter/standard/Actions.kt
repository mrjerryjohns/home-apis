// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface Actions : com.google.home.matter.standard.ActionsTrait.Attributes, com.google.home.matter.MatterTrait, com.google.home.matter.standard.ActionsCommands {
    public companion object : com.google.home.TraitFactory<com.google.home.matter.standard.Actions> {
        public final val actionList: com.google.home.automation.Attribute<kotlin.collections.List<com.google.home.matter.standard.ActionsTrait.ActionStruct>?> /* compiled code */
            public final get

        public final val endpointLists: com.google.home.automation.Attribute<kotlin.collections.List<com.google.home.matter.standard.ActionsTrait.EndpointListStruct>?> /* compiled code */
            public final get

        public final val setupUrl: com.google.home.automation.Attribute<kotlin.String?> /* compiled code */
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

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Actions?>.actionList: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.ActionsTrait.ActionStruct>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Actions?>.endpointLists: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.ActionsTrait.EndpointListStruct>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Actions?>.setupUrl: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Actions?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Actions?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Actions?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Actions?>.featureMap: com.google.home.automation.TypedExpression<kotlin.UInt> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Actions?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        public final fun instantAction(actionId: kotlin.UShort, optionalArgs: com.google.home.matter.standard.ActionsTrait.InstantActionCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.automation.Command { /* compiled code */ }

        public final fun instantActionWithTransition(actionId: kotlin.UShort, transitionTime: kotlin.UShort, optionalArgs: com.google.home.matter.standard.ActionsTrait.InstantActionWithTransitionCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.automation.Command { /* compiled code */ }

        public final fun startAction(actionId: kotlin.UShort, optionalArgs: com.google.home.matter.standard.ActionsTrait.StartActionCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.automation.Command { /* compiled code */ }

        public final fun startActionWithDuration(actionId: kotlin.UShort, duration: kotlin.UInt, optionalArgs: com.google.home.matter.standard.ActionsTrait.StartActionWithDurationCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.automation.Command { /* compiled code */ }

        public final fun stopAction(actionId: kotlin.UShort, optionalArgs: com.google.home.matter.standard.ActionsTrait.StopActionCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.automation.Command { /* compiled code */ }

        public final fun pauseAction(actionId: kotlin.UShort, optionalArgs: com.google.home.matter.standard.ActionsTrait.PauseActionCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.automation.Command { /* compiled code */ }

        public final fun pauseActionWithDuration(actionId: kotlin.UShort, duration: kotlin.UInt, optionalArgs: com.google.home.matter.standard.ActionsTrait.PauseActionWithDurationCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.automation.Command { /* compiled code */ }

        public final fun resumeAction(actionId: kotlin.UShort, optionalArgs: com.google.home.matter.standard.ActionsTrait.ResumeActionCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.automation.Command { /* compiled code */ }

        public final fun enableAction(actionId: kotlin.UShort, optionalArgs: com.google.home.matter.standard.ActionsTrait.EnableActionCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.automation.Command { /* compiled code */ }

        public final fun enableActionWithDuration(actionId: kotlin.UShort, duration: kotlin.UInt, optionalArgs: com.google.home.matter.standard.ActionsTrait.EnableActionWithDurationCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.automation.Command { /* compiled code */ }

        public final fun disableAction(actionId: kotlin.UShort, optionalArgs: com.google.home.matter.standard.ActionsTrait.DisableActionCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.automation.Command { /* compiled code */ }

        public final fun disableActionWithDuration(actionId: kotlin.UShort, duration: kotlin.UInt, optionalArgs: com.google.home.matter.standard.ActionsTrait.DisableActionWithDurationCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.automation.Command { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.matter.standard.Actions> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.matter.standard.Actions.Attribute): kotlin.Boolean

    public abstract fun supports(command: com.google.home.matter.standard.Actions.Command): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.Actions.Attribute> {
        @androidx.annotation.NonNull actionList,

        @androidx.annotation.NonNull endpointLists,

        @androidx.annotation.NonNull setupUrl,

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

    public final enum class Command private constructor(tag: kotlin.UInt) : kotlin.Enum<com.google.home.matter.standard.Actions.Command> {
        @androidx.annotation.NonNull InstantAction,

        @androidx.annotation.NonNull InstantActionWithTransition,

        @androidx.annotation.NonNull StartAction,

        @androidx.annotation.NonNull StartActionWithDuration,

        @androidx.annotation.NonNull StopAction,

        @androidx.annotation.NonNull PauseAction,

        @androidx.annotation.NonNull PauseActionWithDuration,

        @androidx.annotation.NonNull ResumeAction,

        @androidx.annotation.NonNull EnableAction,

        @androidx.annotation.NonNull EnableActionWithDuration,

        @androidx.annotation.NonNull DisableAction,

        @androidx.annotation.NonNull DisableActionWithDuration;

        public final val tag: kotlin.UInt /* compiled code */
    }

    public final class StateChangedEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.ActionsTrait.StateChanged) : com.google.home.Event, com.google.home.matter.standard.ActionsTrait.StateChanged {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.Actions.StateChangedEvent> {
            public final val actionId: com.google.home.automation.EventField<kotlin.UShort?> /* compiled code */
                public final get

            public final val invokeId: com.google.home.automation.EventField<kotlin.UInt?> /* compiled code */
                public final get

            public final val newState: com.google.home.automation.EventField<com.google.home.matter.standard.ActionsTrait.ActionStateEnum?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Actions.StateChangedEvent?>.actionId: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Actions.StateChangedEvent?>.invokeId: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Actions.StateChangedEvent?>.newState: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ActionsTrait.ActionStateEnum?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.ActionsTrait.StateChanged /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val actionId: kotlin.UShort? /* compiled code */

        public open val invokeId: kotlin.UInt? /* compiled code */

        public open val newState: com.google.home.matter.standard.ActionsTrait.ActionStateEnum? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.Actions.StateChangedEvent.EventFields> {
            @androidx.annotation.NonNull actionId,

            @androidx.annotation.NonNull invokeId,

            @androidx.annotation.NonNull newState;

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

    public final class ActionFailedEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.ActionsTrait.ActionFailed) : com.google.home.Event, com.google.home.matter.standard.ActionsTrait.ActionFailed {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.Actions.ActionFailedEvent> {
            public final val actionId: com.google.home.automation.EventField<kotlin.UShort?> /* compiled code */
                public final get

            public final val invokeId: com.google.home.automation.EventField<kotlin.UInt?> /* compiled code */
                public final get

            public final val newState: com.google.home.automation.EventField<com.google.home.matter.standard.ActionsTrait.ActionStateEnum?> /* compiled code */
                public final get

            public final val error: com.google.home.automation.EventField<com.google.home.matter.standard.ActionsTrait.ActionErrorEnum?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Actions.ActionFailedEvent?>.actionId: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Actions.ActionFailedEvent?>.invokeId: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Actions.ActionFailedEvent?>.newState: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ActionsTrait.ActionStateEnum?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Actions.ActionFailedEvent?>.error: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ActionsTrait.ActionErrorEnum?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.ActionsTrait.ActionFailed /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val actionId: kotlin.UShort? /* compiled code */

        public open val error: com.google.home.matter.standard.ActionsTrait.ActionErrorEnum? /* compiled code */

        public open val invokeId: kotlin.UInt? /* compiled code */

        public open val newState: com.google.home.matter.standard.ActionsTrait.ActionStateEnum? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.Actions.ActionFailedEvent.EventFields> {
            @androidx.annotation.NonNull actionId,

            @androidx.annotation.NonNull invokeId,

            @androidx.annotation.NonNull newState,

            @androidx.annotation.NonNull error;

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

