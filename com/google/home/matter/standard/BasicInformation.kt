// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface BasicInformation : com.google.home.matter.standard.BasicInformationTrait.Attributes, com.google.home.matter.MatterTrait, com.google.home.Updatable<com.google.home.matter.standard.BasicInformation, com.google.home.matter.standard.BasicInformationTrait.MutableAttributes>, com.google.home.matter.standard.BasicInformationCommands {
    public companion object : com.google.home.TraitFactory<com.google.home.matter.standard.BasicInformation> {
        public final val dataModelRevision: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

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

        public final val location: com.google.home.automation.Attribute<kotlin.String?> /* compiled code */
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

        public final val localConfigDisabled: com.google.home.automation.Attribute<kotlin.Boolean?> /* compiled code */
            public final get

        public final val reachable: com.google.home.automation.Attribute<kotlin.Boolean?> /* compiled code */
            public final get

        public final val uniqueId: com.google.home.automation.Attribute<kotlin.String?> /* compiled code */
            public final get

        public final val capabilityMinima: com.google.home.automation.Attribute<com.google.home.matter.standard.BasicInformationTrait.CapabilityMinimaStruct?> /* compiled code */
            public final get

        public final val productAppearance: com.google.home.automation.Attribute<com.google.home.matter.standard.BasicInformationTrait.ProductAppearanceStruct?> /* compiled code */
            public final get

        public final val specificationVersion: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val maxPathsPerInvoke: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
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

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BasicInformation?>.dataModelRevision: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BasicInformation?>.vendorName: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BasicInformation?>.vendorId: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BasicInformation?>.productName: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BasicInformation?>.productId: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BasicInformation?>.nodeLabel: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BasicInformation?>.location: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BasicInformation?>.hardwareVersion: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BasicInformation?>.hardwareVersionString: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BasicInformation?>.softwareVersion: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BasicInformation?>.softwareVersionString: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BasicInformation?>.manufacturingDate: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BasicInformation?>.partNumber: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BasicInformation?>.productUrl: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BasicInformation?>.productLabel: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BasicInformation?>.serialNumber: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BasicInformation?>.localConfigDisabled: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BasicInformation?>.reachable: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BasicInformation?>.uniqueId: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BasicInformation?>.capabilityMinima: com.google.home.automation.TypedExpression<com.google.home.matter.standard.BasicInformationTrait.CapabilityMinimaStruct?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BasicInformation?>.productAppearance: com.google.home.automation.TypedExpression<com.google.home.matter.standard.BasicInformationTrait.ProductAppearanceStruct?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BasicInformation?>.specificationVersion: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BasicInformation?>.maxPathsPerInvoke: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BasicInformation?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BasicInformation?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BasicInformation?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BasicInformation?>.featureMap: com.google.home.automation.TypedExpression<kotlin.UInt> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BasicInformation?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.BasicInformation>.setNodeLabel(value: kotlin.String): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.BasicInformation>.setLocation(value: kotlin.String): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.BasicInformation>.setLocalConfigDisabled(value: kotlin.Boolean): kotlin.Unit { /* compiled code */ }

        public final fun mfgSpecificPing(): com.google.home.automation.Command { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.matter.standard.BasicInformation> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.matter.standard.BasicInformation.Attribute): kotlin.Boolean

    public abstract fun supports(command: com.google.home.matter.standard.BasicInformation.Command): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.BasicInformation.Attribute> {
        @androidx.annotation.NonNull dataModelRevision,

        @androidx.annotation.NonNull vendorName,

        @androidx.annotation.NonNull vendorId,

        @androidx.annotation.NonNull productName,

        @androidx.annotation.NonNull productId,

        @androidx.annotation.NonNull nodeLabel,

        @androidx.annotation.NonNull location,

        @androidx.annotation.NonNull hardwareVersion,

        @androidx.annotation.NonNull hardwareVersionString,

        @androidx.annotation.NonNull softwareVersion,

        @androidx.annotation.NonNull softwareVersionString,

        @androidx.annotation.NonNull manufacturingDate,

        @androidx.annotation.NonNull partNumber,

        @androidx.annotation.NonNull productUrl,

        @androidx.annotation.NonNull productLabel,

        @androidx.annotation.NonNull serialNumber,

        @androidx.annotation.NonNull localConfigDisabled,

        @androidx.annotation.NonNull reachable,

        @androidx.annotation.NonNull uniqueId,

        @androidx.annotation.NonNull capabilityMinima,

        @androidx.annotation.NonNull productAppearance,

        @androidx.annotation.NonNull specificationVersion,

        @androidx.annotation.NonNull maxPathsPerInvoke,

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

    public final enum class Command private constructor(tag: kotlin.UInt) : kotlin.Enum<com.google.home.matter.standard.BasicInformation.Command> {
        @androidx.annotation.NonNull MfgSpecificPing;

        public final val tag: kotlin.UInt /* compiled code */
    }

    public final class StartUpEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.BasicInformationTrait.StartUp) : com.google.home.Event, com.google.home.matter.standard.BasicInformationTrait.StartUp {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.BasicInformation.StartUpEvent> {
            public final val softwareVersion: com.google.home.automation.EventField<kotlin.UInt?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BasicInformation.StartUpEvent?>.softwareVersion: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.BasicInformationTrait.StartUp /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val softwareVersion: kotlin.UInt? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.BasicInformation.StartUpEvent.EventFields> {
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

    public final class ShutDownEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.BasicInformationTrait.ShutDown) : com.google.home.Event, com.google.home.matter.standard.BasicInformationTrait.ShutDown {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.BasicInformation.ShutDownEvent> {
            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.BasicInformationTrait.ShutDown /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.BasicInformation.ShutDownEvent.EventFields> {
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

    public final class LeaveEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.BasicInformationTrait.Leave) : com.google.home.Event, com.google.home.matter.standard.BasicInformationTrait.Leave {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.BasicInformation.LeaveEvent> {
            public final val fabricIndex: com.google.home.automation.EventField<kotlin.UByte?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BasicInformation.LeaveEvent?>.fabricIndex: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.BasicInformationTrait.Leave /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val fabricIndex: kotlin.UByte? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.BasicInformation.LeaveEvent.EventFields> {
            @androidx.annotation.NonNull fabricIndex;

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

    public final class ReachableChangedEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.BasicInformationTrait.ReachableChanged) : com.google.home.Event, com.google.home.matter.standard.BasicInformationTrait.ReachableChanged {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.BasicInformation.ReachableChangedEvent> {
            public final val reachableNewValue: com.google.home.automation.EventField<kotlin.Boolean?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BasicInformation.ReachableChangedEvent?>.reachableNewValue: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.BasicInformationTrait.ReachableChanged /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val reachableNewValue: kotlin.Boolean? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.BasicInformation.ReachableChangedEvent.EventFields> {
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
}

