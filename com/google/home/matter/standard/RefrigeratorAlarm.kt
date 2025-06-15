// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface RefrigeratorAlarm : com.google.home.matter.standard.RefrigeratorAlarmTrait.Attributes, com.google.home.matter.MatterTrait {
    public companion object : com.google.home.TraitFactory<com.google.home.matter.standard.RefrigeratorAlarm> {
        public final val mask: com.google.home.automation.Attribute<com.google.home.matter.standard.RefrigeratorAlarmTrait.AlarmBitmap?> /* compiled code */
            public final get

        public final val state: com.google.home.automation.Attribute<com.google.home.matter.standard.RefrigeratorAlarmTrait.AlarmBitmap?> /* compiled code */
            public final get

        public final val supported: com.google.home.automation.Attribute<com.google.home.matter.standard.RefrigeratorAlarmTrait.AlarmBitmap?> /* compiled code */
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

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.RefrigeratorAlarm?>.mask: com.google.home.automation.TypedExpression<com.google.home.matter.standard.RefrigeratorAlarmTrait.AlarmBitmap?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.RefrigeratorAlarm?>.state: com.google.home.automation.TypedExpression<com.google.home.matter.standard.RefrigeratorAlarmTrait.AlarmBitmap?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.RefrigeratorAlarm?>.supported: com.google.home.automation.TypedExpression<com.google.home.matter.standard.RefrigeratorAlarmTrait.AlarmBitmap?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.RefrigeratorAlarm?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.RefrigeratorAlarm?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.RefrigeratorAlarm?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.RefrigeratorAlarm?>.featureMap: com.google.home.automation.TypedExpression<kotlin.UInt> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.RefrigeratorAlarm?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.matter.standard.RefrigeratorAlarm> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.matter.standard.RefrigeratorAlarm.Attribute): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.RefrigeratorAlarm.Attribute> {
        @androidx.annotation.NonNull mask,

        @androidx.annotation.NonNull state,

        @androidx.annotation.NonNull supported,

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

    public final class NotifyEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.RefrigeratorAlarmTrait.Notify) : com.google.home.Event, com.google.home.matter.standard.RefrigeratorAlarmTrait.Notify {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.RefrigeratorAlarm.NotifyEvent> {
            public final val active: com.google.home.automation.EventField<com.google.home.matter.standard.RefrigeratorAlarmTrait.AlarmBitmap?> /* compiled code */
                public final get

            public final val inactive: com.google.home.automation.EventField<com.google.home.matter.standard.RefrigeratorAlarmTrait.AlarmBitmap?> /* compiled code */
                public final get

            public final val state: com.google.home.automation.EventField<com.google.home.matter.standard.RefrigeratorAlarmTrait.AlarmBitmap?> /* compiled code */
                public final get

            public final val mask: com.google.home.automation.EventField<com.google.home.matter.standard.RefrigeratorAlarmTrait.AlarmBitmap?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.RefrigeratorAlarm.NotifyEvent?>.active: com.google.home.automation.TypedExpression<com.google.home.matter.standard.RefrigeratorAlarmTrait.AlarmBitmap?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.RefrigeratorAlarm.NotifyEvent?>.inactive: com.google.home.automation.TypedExpression<com.google.home.matter.standard.RefrigeratorAlarmTrait.AlarmBitmap?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.RefrigeratorAlarm.NotifyEvent?>.state: com.google.home.automation.TypedExpression<com.google.home.matter.standard.RefrigeratorAlarmTrait.AlarmBitmap?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.RefrigeratorAlarm.NotifyEvent?>.mask: com.google.home.automation.TypedExpression<com.google.home.matter.standard.RefrigeratorAlarmTrait.AlarmBitmap?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.RefrigeratorAlarmTrait.Notify /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val active: com.google.home.matter.standard.RefrigeratorAlarmTrait.AlarmBitmap? /* compiled code */

        public open val inactive: com.google.home.matter.standard.RefrigeratorAlarmTrait.AlarmBitmap? /* compiled code */

        public open val mask: com.google.home.matter.standard.RefrigeratorAlarmTrait.AlarmBitmap? /* compiled code */

        public open val state: com.google.home.matter.standard.RefrigeratorAlarmTrait.AlarmBitmap? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.RefrigeratorAlarm.NotifyEvent.EventFields> {
            @androidx.annotation.NonNull active,

            @androidx.annotation.NonNull inactive,

            @androidx.annotation.NonNull state,

            @androidx.annotation.NonNull mask;

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

