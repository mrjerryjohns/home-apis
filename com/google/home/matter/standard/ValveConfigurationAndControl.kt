// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface ValveConfigurationAndControl : com.google.home.matter.standard.ValveConfigurationAndControlTrait.Attributes, com.google.home.matter.MatterTrait, com.google.home.Updatable<com.google.home.matter.standard.ValveConfigurationAndControl, com.google.home.matter.standard.ValveConfigurationAndControlTrait.MutableAttributes>, com.google.home.matter.standard.ValveConfigurationAndControlCommands {
    public companion object : com.google.home.TraitFactory<com.google.home.matter.standard.ValveConfigurationAndControl> {
        public final val openDuration: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val defaultOpenDuration: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val autoCloseTime: com.google.home.automation.Attribute<kotlin.ULong?> /* compiled code */
            public final get

        public final val remainingDuration: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val currentState: com.google.home.automation.Attribute<com.google.home.matter.standard.ValveConfigurationAndControlTrait.ValveStateEnum?> /* compiled code */
            public final get

        public final val targetState: com.google.home.automation.Attribute<com.google.home.matter.standard.ValveConfigurationAndControlTrait.ValveStateEnum?> /* compiled code */
            public final get

        public final val currentLevel: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val targetLevel: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val defaultOpenLevel: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val valveFault: com.google.home.automation.Attribute<com.google.home.matter.standard.ValveConfigurationAndControlTrait.ValveFaultBitmap?> /* compiled code */
            public final get

        public final val levelStep: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val generatedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val acceptedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val attributeList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val featureMap: com.google.home.automation.Attribute<com.google.home.matter.standard.ValveConfigurationAndControlTrait.Feature> /* compiled code */
            public final get

        public final val clusterRevision: com.google.home.automation.Attribute<kotlin.UShort> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ValveConfigurationAndControl?>.openDuration: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ValveConfigurationAndControl?>.defaultOpenDuration: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ValveConfigurationAndControl?>.autoCloseTime: com.google.home.automation.TypedExpression<kotlin.ULong?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ValveConfigurationAndControl?>.remainingDuration: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ValveConfigurationAndControl?>.currentState: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ValveConfigurationAndControlTrait.ValveStateEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ValveConfigurationAndControl?>.targetState: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ValveConfigurationAndControlTrait.ValveStateEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ValveConfigurationAndControl?>.currentLevel: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ValveConfigurationAndControl?>.targetLevel: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ValveConfigurationAndControl?>.defaultOpenLevel: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ValveConfigurationAndControl?>.valveFault: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ValveConfigurationAndControlTrait.ValveFaultBitmap?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ValveConfigurationAndControl?>.levelStep: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ValveConfigurationAndControl?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ValveConfigurationAndControl?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ValveConfigurationAndControl?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ValveConfigurationAndControl?>.featureMap: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ValveConfigurationAndControlTrait.Feature> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ValveConfigurationAndControl?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.ValveConfigurationAndControl>.setDefaultOpenDuration(value: kotlin.UInt): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.ValveConfigurationAndControl>.setDefaultOpenLevel(value: kotlin.UByte): kotlin.Unit { /* compiled code */ }

        public final fun open(optionalArgs: com.google.home.matter.standard.ValveConfigurationAndControlTrait.OpenCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.automation.Command { /* compiled code */ }

        public final fun close(): com.google.home.automation.Command { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.matter.standard.ValveConfigurationAndControl> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.matter.standard.ValveConfigurationAndControl.Attribute): kotlin.Boolean

    public abstract fun supports(command: com.google.home.matter.standard.ValveConfigurationAndControl.Command): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ValveConfigurationAndControl.Attribute> {
        @androidx.annotation.NonNull openDuration,

        @androidx.annotation.NonNull defaultOpenDuration,

        @androidx.annotation.NonNull autoCloseTime,

        @androidx.annotation.NonNull remainingDuration,

        @androidx.annotation.NonNull currentState,

        @androidx.annotation.NonNull targetState,

        @androidx.annotation.NonNull currentLevel,

        @androidx.annotation.NonNull targetLevel,

        @androidx.annotation.NonNull defaultOpenLevel,

        @androidx.annotation.NonNull valveFault,

        @androidx.annotation.NonNull levelStep,

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

    public final enum class Command private constructor(tag: kotlin.UInt) : kotlin.Enum<com.google.home.matter.standard.ValveConfigurationAndControl.Command> {
        @androidx.annotation.NonNull Open,

        @androidx.annotation.NonNull Close;

        public final val tag: kotlin.UInt /* compiled code */
    }

    public final class ValveStateChangedEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.ValveConfigurationAndControlTrait.ValveStateChanged) : com.google.home.Event, com.google.home.matter.standard.ValveConfigurationAndControlTrait.ValveStateChanged {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.ValveConfigurationAndControl.ValveStateChangedEvent> {
            public final val valveState: com.google.home.automation.EventField<com.google.home.matter.standard.ValveConfigurationAndControlTrait.ValveStateEnum?> /* compiled code */
                public final get

            public final val valveLevel: com.google.home.automation.EventField<kotlin.UByte?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ValveConfigurationAndControl.ValveStateChangedEvent?>.valveState: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ValveConfigurationAndControlTrait.ValveStateEnum?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ValveConfigurationAndControl.ValveStateChangedEvent?>.valveLevel: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.ValveConfigurationAndControlTrait.ValveStateChanged /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val valveLevel: kotlin.UByte? /* compiled code */

        public open val valveState: com.google.home.matter.standard.ValveConfigurationAndControlTrait.ValveStateEnum? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ValveConfigurationAndControl.ValveStateChangedEvent.EventFields> {
            @androidx.annotation.NonNull valveState,

            @androidx.annotation.NonNull valveLevel;

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

    public final class ValveFaultEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.ValveConfigurationAndControlTrait.ValveFault) : com.google.home.Event, com.google.home.matter.standard.ValveConfigurationAndControlTrait.ValveFault {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.ValveConfigurationAndControl.ValveFaultEvent> {
            public final val valveFault: com.google.home.automation.EventField<com.google.home.matter.standard.ValveConfigurationAndControlTrait.ValveFaultBitmap?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ValveConfigurationAndControl.ValveFaultEvent?>.valveFault: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ValveConfigurationAndControlTrait.ValveFaultBitmap?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.ValveConfigurationAndControlTrait.ValveFault /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val valveFault: com.google.home.matter.standard.ValveConfigurationAndControlTrait.ValveFaultBitmap? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ValveConfigurationAndControl.ValveFaultEvent.EventFields> {
            @androidx.annotation.NonNull valveFault;

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
