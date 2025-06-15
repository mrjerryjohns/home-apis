// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class Time private constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.google.PlatformTraitClient, attributes: com.google.home.google.TimeTrait.Attributes) : com.google.home.google.PlatformTrait, com.google.home.google.TimeTrait.Attributes {
    public companion object : com.google.home.TraitFactory<com.google.home.google.Time> {
        public final val currentTime: com.google.home.automation.Attribute<java.time.LocalTime> /* compiled code */

        public final val sunriseTime: com.google.home.automation.Attribute<java.time.LocalTime> /* compiled code */

        public final val sunsetTime: com.google.home.automation.Attribute<java.time.LocalTime> /* compiled code */

        public final val dayOfWeek: com.google.home.automation.Attribute<java.time.DayOfWeek> /* compiled code */

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<com.google.home.google.Time>.currentTime: com.google.home.automation.TypedExpression<java.time.LocalTime> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<com.google.home.google.Time>.sunriseTime: com.google.home.automation.TypedExpression<java.time.LocalTime> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<com.google.home.google.Time>.sunsetTime: com.google.home.automation.TypedExpression<java.time.LocalTime> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<com.google.home.google.Time>.dayOfWeek: com.google.home.automation.TypedExpression<java.time.DayOfWeek> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<com.google.home.google.Time>.currentDate: com.google.home.automation.TypedExpression<java.time.LocalDate> /* compiled code */
            public final get

        public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public object LocalDateExtension {
            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<java.time.LocalDate>.year: com.google.home.automation.TypedExpression<kotlin.Int> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<java.time.LocalDate>.month: com.google.home.automation.TypedExpression<java.time.Month> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<java.time.LocalDate>.day: com.google.home.automation.TypedExpression<kotlin.Int> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<java.time.LocalDate>.monthDay: com.google.home.automation.TypedExpression<java.time.MonthDay> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<java.time.LocalDate>.yearMonth: com.google.home.automation.TypedExpression<java.time.YearMonth> /* compiled code */
                public final get
        }
    }

    internal final val attributes: com.google.home.google.TimeTrait.Attributes /* compiled code */

    public open val factory: com.google.home.TraitFactory<com.google.home.google.Time> /* compiled code */

    public open val currentDate: java.time.LocalDate? /* compiled code */

    public open val currentTime: java.time.LocalTime? /* compiled code */

    public open val dayOfWeek: java.time.DayOfWeek? /* compiled code */

    public open val sunriseTime: java.time.LocalTime? /* compiled code */

    public open val sunsetTime: java.time.LocalTime? /* compiled code */

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.Time.Attribute> {
        @androidx.annotation.NonNull currentTime,

        @androidx.annotation.NonNull sunriseTime,

        @androidx.annotation.NonNull sunsetTime,

        @androidx.annotation.NonNull dayOfWeek,

        @androidx.annotation.NonNull missingStructureLocation,

        @androidx.annotation.NonNull currentDate;

        public open val fieldName: kotlin.String /* compiled code */

        public open val tag: kotlin.UInt /* compiled code */

        public open val typeName: kotlin.String /* compiled code */

        public open val typeEnum: com.google.home.Type /* compiled code */

        public open val descriptor: com.google.home.Descriptor /* compiled code */

        public final val isNullable: kotlin.Boolean /* compiled code */
    }

    public final enum class LocalDateAttribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.Time.LocalDateAttribute> {
        @androidx.annotation.NonNull year,

        @androidx.annotation.NonNull month,

        @androidx.annotation.NonNull day,

        @androidx.annotation.NonNull monthDay,

        @androidx.annotation.NonNull yearMonth;

        public open val fieldName: kotlin.String /* compiled code */

        public open val tag: kotlin.UInt /* compiled code */

        public open val typeName: kotlin.String /* compiled code */

        public open val typeEnum: com.google.home.Type /* compiled code */

        public open val descriptor: com.google.home.Descriptor /* compiled code */

        public final val isNullable: kotlin.Boolean /* compiled code */
    }

    public final class ScheduledTimeEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMillis: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.google.TimeTrait.ScheduledTimeEvent) : com.google.home.Event, com.google.home.google.TimeTrait.ScheduledTimeEvent {
        public companion object : com.google.home.EventFactory<com.google.home.google.Time.ScheduledTimeEvent> {
            public final fun clockTime(clockTime: java.time.LocalTime): com.google.home.automation.Parameter { /* compiled code */ }

            public final fun solarTime(solarTime: com.google.home.google.TimeTrait.SolarTimeStruct): com.google.home.automation.Parameter { /* compiled code */ }

            public final fun daysOfWeek(daysOfWeek: kotlin.collections.List<java.time.DayOfWeek>): com.google.home.automation.Parameter { /* compiled code */ }

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getEventFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMillis: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.google.TimeTrait.ScheduledTimeEvent /* compiled code */

        public open val clockTime: java.time.LocalTime? /* compiled code */

        public open val data: kotlin.ByteArray? /* compiled code */

        public open val daysOfWeek: kotlin.collections.List<java.time.DayOfWeek> /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val solarTime: com.google.home.google.TimeTrait.SolarTimeStruct? /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.Time.ScheduledTimeEvent.EventFields> {
            @androidx.annotation.NonNull clockTime,

            @androidx.annotation.NonNull solarTime,

            @androidx.annotation.NonNull daysOfWeek;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class RecurringSolarTimeScheduledEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMillis: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.google.TimeTrait.RecurringSolarTimeScheduledEvent) : com.google.home.Event, com.google.home.google.TimeTrait.RecurringSolarTimeScheduledEvent {
        public companion object : com.google.home.EventFactory<com.google.home.google.Time.RecurringSolarTimeScheduledEvent> {
            public final fun solarTime(solarTime: com.google.home.google.TimeTrait.SolarTimeStruct): com.google.home.automation.Parameter { /* compiled code */ }

            public final fun cronExpression(cronExpression: kotlin.String): com.google.home.automation.Parameter { /* compiled code */ }

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getEventFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMillis: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.google.TimeTrait.RecurringSolarTimeScheduledEvent /* compiled code */

        public open val cronExpression: kotlin.String? /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val solarTime: com.google.home.google.TimeTrait.SolarTimeStruct? /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.Time.RecurringSolarTimeScheduledEvent.EventFields> {
            @androidx.annotation.NonNull solarTime,

            @androidx.annotation.NonNull cronExpression;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class RecurringClockTimeScheduledEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMillis: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.google.TimeTrait.RecurringClockTimeScheduledEvent) : com.google.home.Event, com.google.home.google.TimeTrait.RecurringClockTimeScheduledEvent {
        public companion object : com.google.home.EventFactory<com.google.home.google.Time.RecurringClockTimeScheduledEvent> {
            public final fun cronExpression(cronExpression: kotlin.String): com.google.home.automation.Parameter { /* compiled code */ }

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getEventFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMillis: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.google.TimeTrait.RecurringClockTimeScheduledEvent /* compiled code */

        public open val cronExpression: kotlin.String? /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.Time.RecurringClockTimeScheduledEvent.EventFields> {
            @androidx.annotation.NonNull cronExpression;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }
}
