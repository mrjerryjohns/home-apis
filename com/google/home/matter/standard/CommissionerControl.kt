// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface CommissionerControl : com.google.home.matter.standard.CommissionerControlTrait.Attributes, com.google.home.matter.MatterTrait, com.google.home.matter.standard.CommissionerControlCommands {
    public companion object : com.google.home.TraitFactory<com.google.home.matter.standard.CommissionerControl> {
        public final val supportedDeviceCategories: com.google.home.automation.Attribute<com.google.home.matter.standard.CommissionerControlTrait.SupportedDeviceCategoryBitmap?> /* compiled code */
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

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.CommissionerControl?>.supportedDeviceCategories: com.google.home.automation.TypedExpression<com.google.home.matter.standard.CommissionerControlTrait.SupportedDeviceCategoryBitmap?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.CommissionerControl?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.CommissionerControl?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.CommissionerControl?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.CommissionerControl?>.featureMap: com.google.home.automation.TypedExpression<kotlin.UInt> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.CommissionerControl?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        public final fun requestCommissioningApproval(requestId: kotlin.ULong, vendorId: kotlin.UShort, productId: kotlin.UShort, optionalArgs: com.google.home.matter.standard.CommissionerControlTrait.RequestCommissioningApprovalCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.automation.Command { /* compiled code */ }

        public final fun commissionNode(requestId: kotlin.ULong, responseTimeoutSeconds: kotlin.UShort): com.google.home.automation.Command { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.matter.standard.CommissionerControl> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.matter.standard.CommissionerControl.Attribute): kotlin.Boolean

    public abstract fun supports(command: com.google.home.matter.standard.CommissionerControl.Command): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.CommissionerControl.Attribute> {
        @androidx.annotation.NonNull supportedDeviceCategories,

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

    public final enum class Command private constructor(tag: kotlin.UInt) : kotlin.Enum<com.google.home.matter.standard.CommissionerControl.Command> {
        @androidx.annotation.NonNull RequestCommissioningApproval,

        @androidx.annotation.NonNull CommissionNode;

        public final val tag: kotlin.UInt /* compiled code */
    }

    public final class CommissioningRequestResultEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.CommissionerControlTrait.CommissioningRequestResult) : com.google.home.Event, com.google.home.matter.standard.CommissionerControlTrait.CommissioningRequestResult {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.CommissionerControl.CommissioningRequestResultEvent> {
            public final val requestId: com.google.home.automation.EventField<kotlin.ULong?> /* compiled code */
                public final get

            public final val clientNodeId: com.google.home.automation.EventField<kotlin.ULong?> /* compiled code */
                public final get

            public final val statusCode: com.google.home.automation.EventField<kotlin.UByte?> /* compiled code */
                public final get

            public final val fabricIndex: com.google.home.automation.EventField<kotlin.UByte?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.CommissionerControl.CommissioningRequestResultEvent?>.requestId: com.google.home.automation.TypedExpression<kotlin.ULong?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.CommissionerControl.CommissioningRequestResultEvent?>.clientNodeId: com.google.home.automation.TypedExpression<kotlin.ULong?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.CommissionerControl.CommissioningRequestResultEvent?>.statusCode: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.CommissionerControl.CommissioningRequestResultEvent?>.fabricIndex: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.CommissionerControlTrait.CommissioningRequestResult /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val clientNodeId: kotlin.ULong? /* compiled code */

        public open val fabricIndex: kotlin.UByte? /* compiled code */

        public open val requestId: kotlin.ULong? /* compiled code */

        public open val statusCode: kotlin.UByte? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.CommissionerControl.CommissioningRequestResultEvent.EventFields> {
            @androidx.annotation.NonNull requestId,

            @androidx.annotation.NonNull clientNodeId,

            @androidx.annotation.NonNull statusCode,

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
