// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface AccessControl : com.google.home.matter.standard.AccessControlTrait.Attributes, com.google.home.matter.MatterTrait, com.google.home.Updatable<com.google.home.matter.standard.AccessControl, com.google.home.matter.standard.AccessControlTrait.MutableAttributes>, com.google.home.matter.standard.AccessControlCommands {
    public companion object : com.google.home.TraitFactory<com.google.home.matter.standard.AccessControl> {
        public final val acl: com.google.home.automation.Attribute<kotlin.collections.List<com.google.home.matter.standard.AccessControlTrait.AccessControlEntryStruct>?> /* compiled code */
            public final get

        public final val extension: com.google.home.automation.Attribute<kotlin.collections.List<com.google.home.matter.standard.AccessControlTrait.AccessControlExtensionStruct>?> /* compiled code */
            public final get

        public final val subjectsPerAccessControlEntry: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val targetsPerAccessControlEntry: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val accessControlEntriesPerFabric: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val commissioningArl: com.google.home.automation.Attribute<kotlin.collections.List<com.google.home.matter.standard.AccessControlTrait.CommissioningAccessRestrictionEntryStruct>?> /* compiled code */
            public final get

        public final val arl: com.google.home.automation.Attribute<kotlin.collections.List<com.google.home.matter.standard.AccessControlTrait.AccessRestrictionEntryStruct>?> /* compiled code */
            public final get

        public final val generatedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val acceptedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val attributeList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val featureMap: com.google.home.automation.Attribute<com.google.home.matter.standard.AccessControlTrait.Feature> /* compiled code */
            public final get

        public final val clusterRevision: com.google.home.automation.Attribute<kotlin.UShort> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AccessControl?>.acl: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.AccessControlTrait.AccessControlEntryStruct>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AccessControl?>.extension: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.AccessControlTrait.AccessControlExtensionStruct>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AccessControl?>.subjectsPerAccessControlEntry: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AccessControl?>.targetsPerAccessControlEntry: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AccessControl?>.accessControlEntriesPerFabric: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AccessControl?>.commissioningArl: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.AccessControlTrait.CommissioningAccessRestrictionEntryStruct>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AccessControl?>.arl: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.AccessControlTrait.AccessRestrictionEntryStruct>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AccessControl?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AccessControl?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AccessControl?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AccessControl?>.featureMap: com.google.home.automation.TypedExpression<com.google.home.matter.standard.AccessControlTrait.Feature> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AccessControl?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.matter.standard.AccessControl> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.matter.standard.AccessControl.Attribute): kotlin.Boolean

    public abstract fun supports(command: com.google.home.matter.standard.AccessControl.Command): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.AccessControl.Attribute> {
        @androidx.annotation.NonNull acl,

        @androidx.annotation.NonNull extension,

        @androidx.annotation.NonNull subjectsPerAccessControlEntry,

        @androidx.annotation.NonNull targetsPerAccessControlEntry,

        @androidx.annotation.NonNull accessControlEntriesPerFabric,

        @androidx.annotation.NonNull commissioningArl,

        @androidx.annotation.NonNull arl,

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

    public final enum class Command private constructor(tag: kotlin.UInt) : kotlin.Enum<com.google.home.matter.standard.AccessControl.Command> {
        @androidx.annotation.NonNull ReviewFabricRestrictions;

        public final val tag: kotlin.UInt /* compiled code */
    }

    public final class AccessControlEntryChangedEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.AccessControlTrait.AccessControlEntryChanged) : com.google.home.Event, com.google.home.matter.standard.AccessControlTrait.AccessControlEntryChanged {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.AccessControl.AccessControlEntryChangedEvent> {
            public final val adminNodeId: com.google.home.automation.EventField<kotlin.ULong?> /* compiled code */
                public final get

            public final val adminPasscodeId: com.google.home.automation.EventField<kotlin.UShort?> /* compiled code */
                public final get

            public final val changeType: com.google.home.automation.EventField<com.google.home.matter.standard.AccessControlTrait.ChangeTypeEnum?> /* compiled code */
                public final get

            public final val fabricIndex: com.google.home.automation.EventField<kotlin.UByte?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AccessControl.AccessControlEntryChangedEvent?>.adminNodeId: com.google.home.automation.TypedExpression<kotlin.ULong?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AccessControl.AccessControlEntryChangedEvent?>.adminPasscodeId: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AccessControl.AccessControlEntryChangedEvent?>.changeType: com.google.home.automation.TypedExpression<com.google.home.matter.standard.AccessControlTrait.ChangeTypeEnum?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AccessControl.AccessControlEntryChangedEvent?>.fabricIndex: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.AccessControlTrait.AccessControlEntryChanged /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val adminNodeId: kotlin.ULong? /* compiled code */

        public open val adminPasscodeId: kotlin.UShort? /* compiled code */

        public open val changeType: com.google.home.matter.standard.AccessControlTrait.ChangeTypeEnum? /* compiled code */

        public open val fabricIndex: kotlin.UByte? /* compiled code */

        public open val latestValue: com.google.home.matter.standard.AccessControlTrait.AccessControlEntryStruct? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.AccessControl.AccessControlEntryChangedEvent.EventFields> {
            @androidx.annotation.NonNull adminNodeId,

            @androidx.annotation.NonNull adminPasscodeId,

            @androidx.annotation.NonNull changeType,

            @androidx.annotation.NonNull latestValue,

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

    public final class AccessControlExtensionChangedEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.AccessControlTrait.AccessControlExtensionChanged) : com.google.home.Event, com.google.home.matter.standard.AccessControlTrait.AccessControlExtensionChanged {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.AccessControl.AccessControlExtensionChangedEvent> {
            public final val adminNodeId: com.google.home.automation.EventField<kotlin.ULong?> /* compiled code */
                public final get

            public final val adminPasscodeId: com.google.home.automation.EventField<kotlin.UShort?> /* compiled code */
                public final get

            public final val changeType: com.google.home.automation.EventField<com.google.home.matter.standard.AccessControlTrait.ChangeTypeEnum?> /* compiled code */
                public final get

            public final val fabricIndex: com.google.home.automation.EventField<kotlin.UByte?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AccessControl.AccessControlExtensionChangedEvent?>.adminNodeId: com.google.home.automation.TypedExpression<kotlin.ULong?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AccessControl.AccessControlExtensionChangedEvent?>.adminPasscodeId: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AccessControl.AccessControlExtensionChangedEvent?>.changeType: com.google.home.automation.TypedExpression<com.google.home.matter.standard.AccessControlTrait.ChangeTypeEnum?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AccessControl.AccessControlExtensionChangedEvent?>.fabricIndex: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.AccessControlTrait.AccessControlExtensionChanged /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val adminNodeId: kotlin.ULong? /* compiled code */

        public open val adminPasscodeId: kotlin.UShort? /* compiled code */

        public open val changeType: com.google.home.matter.standard.AccessControlTrait.ChangeTypeEnum? /* compiled code */

        public open val fabricIndex: kotlin.UByte? /* compiled code */

        public open val latestValue: com.google.home.matter.standard.AccessControlTrait.AccessControlExtensionStruct? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.AccessControl.AccessControlExtensionChangedEvent.EventFields> {
            @androidx.annotation.NonNull adminNodeId,

            @androidx.annotation.NonNull adminPasscodeId,

            @androidx.annotation.NonNull changeType,

            @androidx.annotation.NonNull latestValue,

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

    public final class FabricRestrictionReviewUpdateEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.AccessControlTrait.FabricRestrictionReviewUpdate) : com.google.home.Event, com.google.home.matter.standard.AccessControlTrait.FabricRestrictionReviewUpdate {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.AccessControl.FabricRestrictionReviewUpdateEvent> {
            public final val token: com.google.home.automation.EventField<kotlin.ULong?> /* compiled code */
                public final get

            public final val instruction: com.google.home.automation.EventField<kotlin.String?> /* compiled code */
                public final get

            public final val arlRequestFlowUrl: com.google.home.automation.EventField<kotlin.String?> /* compiled code */
                public final get

            public final val fabricIndex: com.google.home.automation.EventField<kotlin.UByte?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AccessControl.FabricRestrictionReviewUpdateEvent?>.token: com.google.home.automation.TypedExpression<kotlin.ULong?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AccessControl.FabricRestrictionReviewUpdateEvent?>.instruction: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AccessControl.FabricRestrictionReviewUpdateEvent?>.arlRequestFlowUrl: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AccessControl.FabricRestrictionReviewUpdateEvent?>.fabricIndex: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.AccessControlTrait.FabricRestrictionReviewUpdate /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val arlRequestFlowUrl: kotlin.String? /* compiled code */

        public open val fabricIndex: kotlin.UByte? /* compiled code */

        public open val instruction: kotlin.String? /* compiled code */

        public open val token: kotlin.ULong? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.AccessControl.FabricRestrictionReviewUpdateEvent.EventFields> {
            @androidx.annotation.NonNull token,

            @androidx.annotation.NonNull instruction,

            @androidx.annotation.NonNull arlRequestFlowUrl,

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
}

