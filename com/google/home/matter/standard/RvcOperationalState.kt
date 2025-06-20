// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface RvcOperationalState : com.google.home.matter.standard.RvcOperationalStateTrait.Attributes, com.google.home.matter.MatterTrait, com.google.home.matter.standard.RvcOperationalStateCommands {
    public companion object : com.google.home.TraitFactory<com.google.home.matter.standard.RvcOperationalState> {
        public final val phaseList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.String>?> /* compiled code */
            public final get

        public final val currentPhase: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val countdownTime: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val operationalStateList: com.google.home.automation.Attribute<kotlin.collections.List<com.google.home.matter.standard.RvcOperationalStateTrait.OperationalStateStruct>?> /* compiled code */
            public final get

        public final val operationalState: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val operationalError: com.google.home.automation.Attribute<com.google.home.matter.standard.RvcOperationalStateTrait.ErrorStateStruct?> /* compiled code */
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

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.RvcOperationalState?>.phaseList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.String>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.RvcOperationalState?>.currentPhase: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.RvcOperationalState?>.countdownTime: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.RvcOperationalState?>.operationalStateList: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.RvcOperationalStateTrait.OperationalStateStruct>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.RvcOperationalState?>.operationalState: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.RvcOperationalState?>.operationalError: com.google.home.automation.TypedExpression<com.google.home.matter.standard.RvcOperationalStateTrait.ErrorStateStruct?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.RvcOperationalState?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.RvcOperationalState?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.RvcOperationalState?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.RvcOperationalState?>.featureMap: com.google.home.automation.TypedExpression<kotlin.UInt> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.RvcOperationalState?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        public final fun pause(): com.google.home.automation.Command { /* compiled code */ }

        public final fun resume(): com.google.home.automation.Command { /* compiled code */ }

        public final fun goHome(): com.google.home.automation.Command { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.matter.standard.RvcOperationalState> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.matter.standard.RvcOperationalState.Attribute): kotlin.Boolean

    public abstract fun supports(command: com.google.home.matter.standard.RvcOperationalState.Command): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.RvcOperationalState.Attribute> {
        @androidx.annotation.NonNull phaseList,

        @androidx.annotation.NonNull currentPhase,

        @androidx.annotation.NonNull countdownTime,

        @androidx.annotation.NonNull operationalStateList,

        @androidx.annotation.NonNull operationalState,

        @androidx.annotation.NonNull operationalError,

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

    public final enum class Command private constructor(tag: kotlin.UInt) : kotlin.Enum<com.google.home.matter.standard.RvcOperationalState.Command> {
        @androidx.annotation.NonNull Pause,

        @androidx.annotation.NonNull Resume,

        @androidx.annotation.NonNull GoHome;

        public final val tag: kotlin.UInt /* compiled code */
    }

    public final class OperationalErrorEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.RvcOperationalStateTrait.OperationalError) : com.google.home.Event, com.google.home.matter.standard.RvcOperationalStateTrait.OperationalError {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.RvcOperationalState.OperationalErrorEvent> {
            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.RvcOperationalStateTrait.OperationalError /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val errorState: com.google.home.matter.standard.RvcOperationalStateTrait.ErrorStateStruct? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.RvcOperationalState.OperationalErrorEvent.EventFields> {
            @androidx.annotation.NonNull errorState;

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

    public final class OperationCompletionEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.RvcOperationalStateTrait.OperationCompletion) : com.google.home.Event, com.google.home.matter.standard.RvcOperationalStateTrait.OperationCompletion {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.RvcOperationalState.OperationCompletionEvent> {
            public final val completionErrorCode: com.google.home.automation.EventField<kotlin.UByte?> /* compiled code */
                public final get

            public final val totalOperationalTime: com.google.home.automation.EventField<kotlin.UInt?> /* compiled code */
                public final get

            public final val pausedTime: com.google.home.automation.EventField<kotlin.UInt?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.RvcOperationalState.OperationCompletionEvent?>.completionErrorCode: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.RvcOperationalState.OperationCompletionEvent?>.totalOperationalTime: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.RvcOperationalState.OperationCompletionEvent?>.pausedTime: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.RvcOperationalStateTrait.OperationCompletion /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val completionErrorCode: kotlin.UByte? /* compiled code */

        public open val pausedTime: kotlin.UInt? /* compiled code */

        public open val totalOperationalTime: kotlin.UInt? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.RvcOperationalState.OperationCompletionEvent.EventFields> {
            @androidx.annotation.NonNull completionErrorCode,

            @androidx.annotation.NonNull totalOperationalTime,

            @androidx.annotation.NonNull pausedTime;

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
