// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface OpenClose : com.google.home.google.OpenCloseTrait.Attributes, com.google.home.matter.MatterTrait, com.google.home.google.OpenCloseCommands {
    public companion object : com.google.home.TraitFactory<com.google.home.google.OpenClose> {
        public final val supportedDirections: com.google.home.automation.Attribute<kotlin.collections.List<com.google.home.google.OpenCloseTrait.Direction>?> /* compiled code */
            public final get

        public final val openPercent: com.google.home.automation.Attribute<kotlin.Double?> /* compiled code */
            public final get

        public final val targetOpenPercent: com.google.home.automation.Attribute<kotlin.Double?> /* compiled code */
            public final get

        public final val openState: com.google.home.automation.Attribute<kotlin.collections.List<com.google.home.google.OpenCloseTrait.DirectionOpenState>?> /* compiled code */
            public final get

        public final val generatedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val acceptedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val attributeList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val featureMap: com.google.home.automation.Attribute<com.google.home.google.OpenCloseTrait.OpenCloseFeature> /* compiled code */
            public final get

        public final val clusterRevision: com.google.home.automation.Attribute<kotlin.UShort> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.OpenClose?>.supportedDirections: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.google.OpenCloseTrait.Direction>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.OpenClose?>.openPercent: com.google.home.automation.TypedExpression<kotlin.Double?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.OpenClose?>.targetOpenPercent: com.google.home.automation.TypedExpression<kotlin.Double?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.OpenClose?>.openState: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.google.OpenCloseTrait.DirectionOpenState>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.OpenClose?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.OpenClose?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.OpenClose?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.OpenClose?>.featureMap: com.google.home.automation.TypedExpression<com.google.home.google.OpenCloseTrait.OpenCloseFeature> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.OpenClose?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        public final fun open(openDirection: com.google.home.google.OpenCloseTrait.Direction): com.google.home.automation.Command { /* compiled code */ }

        public final fun close(): com.google.home.automation.Command { /* compiled code */ }

        public final fun goToOpenPercentage(openPercent: kotlin.Double, openDirection: com.google.home.google.OpenCloseTrait.Direction): com.google.home.automation.Command { /* compiled code */ }

        public final fun step(openRelativePercent: kotlin.Double, openDirection: com.google.home.google.OpenCloseTrait.Direction): com.google.home.automation.Command { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.google.OpenClose> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.google.OpenClose.Attribute): kotlin.Boolean

    public abstract fun supports(command: com.google.home.google.OpenClose.Command): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.OpenClose.Attribute> {
        @androidx.annotation.NonNull supportedDirections,

        @androidx.annotation.NonNull openPercent,

        @androidx.annotation.NonNull targetOpenPercent,

        @androidx.annotation.NonNull openState,

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

    public final enum class Command private constructor(tag: kotlin.UInt) : kotlin.Enum<com.google.home.google.OpenClose.Command> {
        @androidx.annotation.NonNull Open,

        @androidx.annotation.NonNull Close,

        @androidx.annotation.NonNull GoToOpenPercentage,

        @androidx.annotation.NonNull Step;

        public final val tag: kotlin.UInt /* compiled code */
    }

    public final class OpenFollowUpEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.google.OpenCloseTrait.OpenFollowUp) : com.google.home.Event, com.google.home.google.OpenCloseTrait.OpenFollowUp {
        public companion object : com.google.home.EventFactory<com.google.home.google.OpenClose.OpenFollowUpEvent> {
            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.google.OpenCloseTrait.OpenFollowUp /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.OpenClose.OpenFollowUpEvent.EventFields> {
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

    public final class CloseFollowUpEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.google.OpenCloseTrait.CloseFollowUp) : com.google.home.Event, com.google.home.google.OpenCloseTrait.CloseFollowUp {
        public companion object : com.google.home.EventFactory<com.google.home.google.OpenClose.CloseFollowUpEvent> {
            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.google.OpenCloseTrait.CloseFollowUp /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.OpenClose.CloseFollowUpEvent.EventFields> {
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

    public final class GoToOpenPercentageFollowUpEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.google.OpenCloseTrait.GoToOpenPercentageFollowUp) : com.google.home.Event, com.google.home.google.OpenCloseTrait.GoToOpenPercentageFollowUp {
        public companion object : com.google.home.EventFactory<com.google.home.google.OpenClose.GoToOpenPercentageFollowUpEvent> {
            public final val openPercent: com.google.home.automation.EventField<kotlin.Double?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.OpenClose.GoToOpenPercentageFollowUpEvent?>.openPercent: com.google.home.automation.TypedExpression<kotlin.Double?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.google.OpenCloseTrait.GoToOpenPercentageFollowUp /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val openPercent: kotlin.Double? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.OpenClose.GoToOpenPercentageFollowUpEvent.EventFields> {
            @androidx.annotation.NonNull openPercent;

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

    public final class OpenCloseErrorFollowUpEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.google.OpenCloseTrait.OpenCloseErrorFollowUp) : com.google.home.Event, com.google.home.google.OpenCloseTrait.OpenCloseErrorFollowUp {
        public companion object : com.google.home.EventFactory<com.google.home.google.OpenClose.OpenCloseErrorFollowUpEvent> {
            public final val errorCode: com.google.home.automation.EventField<kotlin.String?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.OpenClose.OpenCloseErrorFollowUpEvent?>.errorCode: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.google.OpenCloseTrait.OpenCloseErrorFollowUp /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val errorCode: kotlin.String? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.OpenClose.OpenCloseErrorFollowUpEvent.EventFields> {
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

