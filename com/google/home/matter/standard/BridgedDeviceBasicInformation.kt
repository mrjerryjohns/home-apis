// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface BridgedDeviceBasicInformation : com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.Attributes, com.google.home.matter.MatterTrait, com.google.home.Updatable<com.google.home.matter.standard.BridgedDeviceBasicInformation, com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.MutableAttributes>, com.google.home.matter.standard.BridgedDeviceBasicInformationCommands {
    public companion object : com.google.home.TraitFactory<com.google.home.matter.standard.BridgedDeviceBasicInformation> {
        public final val vendorName: com.google.home.automation.Attribute<kotlin.String?> /* compiled code */
            public final get

        public final val vendorId: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val productName: com.google.home.automation.Attribute<kotlin.String?> /* compiled code */
            public final get

        public final val productId: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val nodeLabel: com.google.home.automation.Attribute<kotlin.String?> /* compiled code */
            public final get

        public final val hardwareVersion: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val hardwareVersionString: com.google.home.automation.Attribute<kotlin.String?> /* compiled code */
            public final get

        public final val softwareVersion: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val softwareVersionString: com.google.home.automation.Attribute<kotlin.String?> /* compiled code */
            public final get

        public final val manufacturingDate: com.google.home.automation.Attribute<kotlin.String?> /* compiled code */
            public final get

        public final val partNumber: com.google.home.automation.Attribute<kotlin.String?> /* compiled code */
            public final get

        public final val productUrl: com.google.home.automation.Attribute<kotlin.String?> /* compiled code */
            public final get

        public final val productLabel: com.google.home.automation.Attribute<kotlin.String?> /* compiled code */
            public final get

        public final val serialNumber: com.google.home.automation.Attribute<kotlin.String?> /* compiled code */
            public final get

        public final val reachable: com.google.home.automation.Attribute<kotlin.Boolean?> /* compiled code */
            public final get

        public final val uniqueId: com.google.home.automation.Attribute<kotlin.String?> /* compiled code */
            public final get

        public final val productAppearance: com.google.home.automation.Attribute<com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.ProductAppearanceStruct?> /* compiled code */
            public final get

        public final val generatedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val acceptedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val attributeList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val featureMap: com.google.home.automation.Attribute<com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.Feature> /* compiled code */
            public final get

        public final val clusterRevision: com.google.home.automation.Attribute<kotlin.UShort> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BridgedDeviceBasicInformation?>.vendorName: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BridgedDeviceBasicInformation?>.vendorId: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BridgedDeviceBasicInformation?>.productName: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BridgedDeviceBasicInformation?>.productId: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BridgedDeviceBasicInformation?>.nodeLabel: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BridgedDeviceBasicInformation?>.hardwareVersion: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BridgedDeviceBasicInformation?>.hardwareVersionString: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BridgedDeviceBasicInformation?>.softwareVersion: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BridgedDeviceBasicInformation?>.softwareVersionString: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BridgedDeviceBasicInformation?>.manufacturingDate: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BridgedDeviceBasicInformation?>.partNumber: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BridgedDeviceBasicInformation?>.productUrl: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BridgedDeviceBasicInformation?>.productLabel: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BridgedDeviceBasicInformation?>.serialNumber: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BridgedDeviceBasicInformation?>.reachable: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BridgedDeviceBasicInformation?>.uniqueId: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BridgedDeviceBasicInformation?>.productAppearance: com.google.home.automation.TypedExpression<com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.ProductAppearanceStruct?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BridgedDeviceBasicInformation?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BridgedDeviceBasicInformation?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BridgedDeviceBasicInformation?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BridgedDeviceBasicInformation?>.featureMap: com.google.home.automation.TypedExpression<com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.Feature> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BridgedDeviceBasicInformation?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.BridgedDeviceBasicInformation>.setNodeLabel(value: kotlin.String): kotlin.Unit { /* compiled code */ }

        public final fun keepActive(stayActiveDuration: kotlin.UInt, timeoutMs: kotlin.UInt): com.google.home.automation.Command { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.matter.standard.BridgedDeviceBasicInformation> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.matter.standard.BridgedDeviceBasicInformation.Attribute): kotlin.Boolean

    public abstract fun supports(command: com.google.home.matter.standard.BridgedDeviceBasicInformation.Command): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.BridgedDeviceBasicInformation.Attribute> {
        @androidx.annotation.NonNull vendorName,

        @androidx.annotation.NonNull vendorId,

        @androidx.annotation.NonNull productName,

        @androidx.annotation.NonNull productId,

        @androidx.annotation.NonNull nodeLabel,

        @androidx.annotation.NonNull hardwareVersion,

        @androidx.annotation.NonNull hardwareVersionString,

        @androidx.annotation.NonNull softwareVersion,

        @androidx.annotation.NonNull softwareVersionString,

        @androidx.annotation.NonNull manufacturingDate,

        @androidx.annotation.NonNull partNumber,

        @androidx.annotation.NonNull productUrl,

        @androidx.annotation.NonNull productLabel,

        @androidx.annotation.NonNull serialNumber,

        @androidx.annotation.NonNull reachable,

        @androidx.annotation.NonNull uniqueId,

        @androidx.annotation.NonNull productAppearance,

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

    public final enum class Command private constructor(tag: kotlin.UInt) : kotlin.Enum<com.google.home.matter.standard.BridgedDeviceBasicInformation.Command> {
        @androidx.annotation.NonNull KeepActive;

        public final val tag: kotlin.UInt /* compiled code */
    }

    public final class StartUpEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.StartUp) : com.google.home.Event, com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.StartUp {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.BridgedDeviceBasicInformation.StartUpEvent> {
            public final val softwareVersion: com.google.home.automation.EventField<kotlin.UInt?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BridgedDeviceBasicInformation.StartUpEvent?>.softwareVersion: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.StartUp /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val softwareVersion: kotlin.UInt? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.BridgedDeviceBasicInformation.StartUpEvent.EventFields> {
            @androidx.annotation.NonNull softwareVersion;

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

    public final class ShutDownEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.ShutDown) : com.google.home.Event, com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.ShutDown {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.BridgedDeviceBasicInformation.ShutDownEvent> {
            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.ShutDown /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.BridgedDeviceBasicInformation.ShutDownEvent.EventFields> {
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

    public final class LeaveEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.Leave) : com.google.home.Event, com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.Leave {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.BridgedDeviceBasicInformation.LeaveEvent> {
            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.Leave /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.BridgedDeviceBasicInformation.LeaveEvent.EventFields> {
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

    public final class ReachableChangedEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.ReachableChanged) : com.google.home.Event, com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.ReachableChanged {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.BridgedDeviceBasicInformation.ReachableChangedEvent> {
            public final val reachableNewValue: com.google.home.automation.EventField<kotlin.Boolean?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BridgedDeviceBasicInformation.ReachableChangedEvent?>.reachableNewValue: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.ReachableChanged /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val reachableNewValue: kotlin.Boolean? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.BridgedDeviceBasicInformation.ReachableChangedEvent.EventFields> {
            @androidx.annotation.NonNull reachableNewValue;

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

    public final class ActiveChangedEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.ActiveChanged) : com.google.home.Event, com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.ActiveChanged {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.BridgedDeviceBasicInformation.ActiveChangedEvent> {
            public final val promisedActiveDuration: com.google.home.automation.EventField<kotlin.UInt?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BridgedDeviceBasicInformation.ActiveChangedEvent?>.promisedActiveDuration: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.ActiveChanged /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val promisedActiveDuration: kotlin.UInt? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.BridgedDeviceBasicInformation.ActiveChangedEvent.EventFields> {
            @androidx.annotation.NonNull promisedActiveDuration;

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

