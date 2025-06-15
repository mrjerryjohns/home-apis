// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.platform.traits

public object TimeTraitKt {
    @kotlin.jvm.JvmName public final inline fun scheduledEvent(block: com.google.home.platform.traits.TimeTraitKt.ScheduledEventKt.Dsl.() -> kotlin.Unit): com.google.home.platform.traits.TimeTrait.ScheduledEvent { /* compiled code */ }

    @kotlin.jvm.JvmName public final inline fun delayedEvent(block: com.google.home.platform.traits.TimeTraitKt.DelayedEventKt.Dsl.() -> kotlin.Unit): com.google.home.platform.traits.TimeTrait.DelayedEvent { /* compiled code */ }

    @kotlin.jvm.JvmName public final inline fun recurringClockTimeScheduledEvent(block: com.google.home.platform.traits.TimeTraitKt.RecurringClockTimeScheduledEventKt.Dsl.() -> kotlin.Unit): com.google.home.platform.traits.TimeTrait.RecurringClockTimeScheduledEvent { /* compiled code */ }

    @kotlin.jvm.JvmName public final inline fun recurringSolarTimeScheduledEvent(block: com.google.home.platform.traits.TimeTraitKt.RecurringSolarTimeScheduledEventKt.Dsl.() -> kotlin.Unit): com.google.home.platform.traits.TimeTrait.RecurringSolarTimeScheduledEvent { /* compiled code */ }

    @kotlin.jvm.JvmName public final inline fun solarTime(block: com.google.home.platform.traits.TimeTraitKt.SolarTimeKt.Dsl.() -> kotlin.Unit): com.google.home.platform.traits.TimeTrait.SolarTime { /* compiled code */ }

    public final class Dsl private constructor(_builder: com.google.home.platform.traits.TimeTrait.Builder) {
        public companion object {
            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.TimeTrait.Builder): com.google.home.platform.traits.TimeTraitKt.Dsl { /* compiled code */ }
        }

        private final val _builder: com.google.home.platform.traits.TimeTrait.Builder /* compiled code */

        public final var currentTime: com.google.type.TimeOfDay /* compiled code */
            public final get
            public final set(value: com.google.type.TimeOfDay) {/* compiled code */ }

        public final val com.google.home.platform.traits.TimeTraitKt.Dsl.currentTimeOrNull: com.google.type.TimeOfDay? /* compiled code */
            public final get

        public final var sunriseTime: com.google.type.TimeOfDay /* compiled code */
            public final get
            public final set(value: com.google.type.TimeOfDay) {/* compiled code */ }

        public final val com.google.home.platform.traits.TimeTraitKt.Dsl.sunriseTimeOrNull: com.google.type.TimeOfDay? /* compiled code */
            public final get

        public final var sunsetTime: com.google.type.TimeOfDay /* compiled code */
            public final get
            public final set(value: com.google.type.TimeOfDay) {/* compiled code */ }

        public final val com.google.home.platform.traits.TimeTraitKt.Dsl.sunsetTimeOrNull: com.google.type.TimeOfDay? /* compiled code */
            public final get

        @kotlin.Deprecated public final var solarTime: com.google.home.platform.traits.TimeTrait.SolarTime /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: com.google.home.platform.traits.TimeTrait.SolarTime) {/* compiled code */ }

        @kotlin.Deprecated public final val @receiver:androidx.annotation.NonNull com.google.home.platform.traits.TimeTraitKt.Dsl.solarTimeOrNull: com.google.home.platform.traits.TimeTrait.SolarTime? /* compiled code */
            public final get

        public final var dayOfWeek: com.google.type.DayOfWeek /* compiled code */
            public final get
            public final set(value: com.google.type.DayOfWeek) {/* compiled code */ }

        public final var dayOfWeekValue: kotlin.Int /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.Int) {/* compiled code */ }

        public final var missingStructureLocation: kotlin.Boolean /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.Boolean) {/* compiled code */ }

        public final var currentDate: com.google.type.Date /* compiled code */
            public final get
            public final set(value: com.google.type.Date) {/* compiled code */ }

        public final val com.google.home.platform.traits.TimeTraitKt.Dsl.currentDateOrNull: com.google.type.Date? /* compiled code */
            public final get

        @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.TimeTrait { /* compiled code */ }

        public final fun clearCurrentTime(): kotlin.Unit { /* compiled code */ }

        public final fun hasCurrentTime(): kotlin.Boolean { /* compiled code */ }

        public final fun clearSunriseTime(): kotlin.Unit { /* compiled code */ }

        public final fun hasSunriseTime(): kotlin.Boolean { /* compiled code */ }

        public final fun clearSunsetTime(): kotlin.Unit { /* compiled code */ }

        public final fun hasSunsetTime(): kotlin.Boolean { /* compiled code */ }

        public final fun clearSolarTime(): kotlin.Unit { /* compiled code */ }

        public final fun hasSolarTime(): kotlin.Boolean { /* compiled code */ }

        public final fun clearDayOfWeek(): kotlin.Unit { /* compiled code */ }

        public final fun clearMissingStructureLocation(): kotlin.Unit { /* compiled code */ }

        public final fun hasMissingStructureLocation(): kotlin.Boolean { /* compiled code */ }

        public final fun clearCurrentDate(): kotlin.Unit { /* compiled code */ }

        public final fun hasCurrentDate(): kotlin.Boolean { /* compiled code */ }
    }

    public object ScheduledEventKt {
        public final class Dsl private constructor(_builder: com.google.home.platform.traits.TimeTrait.ScheduledEvent.Builder) {
            public companion object {
                @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.TimeTrait.ScheduledEvent.Builder): com.google.home.platform.traits.TimeTraitKt.ScheduledEventKt.Dsl { /* compiled code */ }
            }

            private final val _builder: com.google.home.platform.traits.TimeTrait.ScheduledEvent.Builder /* compiled code */

            public final var clockTime: com.google.type.TimeOfDay /* compiled code */
                public final get
                public final set(value: com.google.type.TimeOfDay) {/* compiled code */ }

            public final var solarTime: com.google.home.platform.traits.TimeTrait.SolarTime /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: com.google.home.platform.traits.TimeTrait.SolarTime) {/* compiled code */ }

            public final val daysOfWeek: com.google.protobuf.kotlin.DslList<com.google.type.DayOfWeek, com.google.home.platform.traits.TimeTraitKt.ScheduledEventKt.Dsl.DaysOfWeekProxy> /* compiled code */
                public final get

            public final val atCase: com.google.home.platform.traits.TimeTrait.ScheduledEvent.AtCase /* compiled code */
                public final @kotlin.jvm.JvmName get

            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.TimeTrait.ScheduledEvent { /* compiled code */ }

            public final fun clearClockTime(): kotlin.Unit { /* compiled code */ }

            public final fun hasClockTime(): kotlin.Boolean { /* compiled code */ }

            public final fun clearSolarTime(): kotlin.Unit { /* compiled code */ }

            public final fun hasSolarTime(): kotlin.Boolean { /* compiled code */ }

            public final fun com.google.protobuf.kotlin.DslList<com.google.type.DayOfWeek, com.google.home.platform.traits.TimeTraitKt.ScheduledEventKt.Dsl.DaysOfWeekProxy>.add(value: com.google.type.DayOfWeek): kotlin.Unit { /* compiled code */ }

            public final inline operator fun com.google.protobuf.kotlin.DslList<com.google.type.DayOfWeek, com.google.home.platform.traits.TimeTraitKt.ScheduledEventKt.Dsl.DaysOfWeekProxy>.plusAssign(value: com.google.type.DayOfWeek): kotlin.Unit { /* compiled code */ }

            public final fun com.google.protobuf.kotlin.DslList<com.google.type.DayOfWeek, com.google.home.platform.traits.TimeTraitKt.ScheduledEventKt.Dsl.DaysOfWeekProxy>.addAll(values: kotlin.collections.Iterable<com.google.type.DayOfWeek>): kotlin.Unit { /* compiled code */ }

            public final inline operator fun com.google.protobuf.kotlin.DslList<com.google.type.DayOfWeek, com.google.home.platform.traits.TimeTraitKt.ScheduledEventKt.Dsl.DaysOfWeekProxy>.plusAssign(values: kotlin.collections.Iterable<com.google.type.DayOfWeek>): kotlin.Unit { /* compiled code */ }

            public final operator fun com.google.protobuf.kotlin.DslList<com.google.type.DayOfWeek, com.google.home.platform.traits.TimeTraitKt.ScheduledEventKt.Dsl.DaysOfWeekProxy>.set(index: kotlin.Int, value: com.google.type.DayOfWeek): kotlin.Unit { /* compiled code */ }

            public final fun com.google.protobuf.kotlin.DslList<com.google.type.DayOfWeek, com.google.home.platform.traits.TimeTraitKt.ScheduledEventKt.Dsl.DaysOfWeekProxy>.clear(): kotlin.Unit { /* compiled code */ }

            public final fun clearAt(): kotlin.Unit { /* compiled code */ }

            public final class DaysOfWeekProxy private constructor() : com.google.protobuf.kotlin.DslProxy {
            }
        }
    }

    public object DelayedEventKt {
        public final class Dsl private constructor(_builder: com.google.home.platform.traits.TimeTrait.DelayedEvent.Builder) {
            public companion object {
                @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.TimeTrait.DelayedEvent.Builder): com.google.home.platform.traits.TimeTraitKt.DelayedEventKt.Dsl { /* compiled code */ }
            }

            private final val _builder: com.google.home.platform.traits.TimeTrait.DelayedEvent.Builder /* compiled code */

            public final var forDuration: com.google.protobuf.Duration /* compiled code */
                public final get
                public final set(value: com.google.protobuf.Duration) {/* compiled code */ }

            public final val com.google.home.platform.traits.TimeTraitKt.DelayedEventKt.Dsl.forDurationOrNull: com.google.protobuf.Duration? /* compiled code */
                public final get

            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.TimeTrait.DelayedEvent { /* compiled code */ }

            public final fun clearForDuration(): kotlin.Unit { /* compiled code */ }

            public final fun hasForDuration(): kotlin.Boolean { /* compiled code */ }
        }
    }

    public object RecurringClockTimeScheduledEventKt {
        public final class Dsl private constructor(_builder: com.google.home.platform.traits.TimeTrait.RecurringClockTimeScheduledEvent.Builder) {
            public companion object {
                @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.TimeTrait.RecurringClockTimeScheduledEvent.Builder): com.google.home.platform.traits.TimeTraitKt.RecurringClockTimeScheduledEventKt.Dsl { /* compiled code */ }
            }

            private final val _builder: com.google.home.platform.traits.TimeTrait.RecurringClockTimeScheduledEvent.Builder /* compiled code */

            public final var cronExpression: kotlin.String /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.TimeTrait.RecurringClockTimeScheduledEvent { /* compiled code */ }

            public final fun clearCronExpression(): kotlin.Unit { /* compiled code */ }
        }
    }

    public object RecurringSolarTimeScheduledEventKt {
        public final class Dsl private constructor(_builder: com.google.home.platform.traits.TimeTrait.RecurringSolarTimeScheduledEvent.Builder) {
            public companion object {
                @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.TimeTrait.RecurringSolarTimeScheduledEvent.Builder): com.google.home.platform.traits.TimeTraitKt.RecurringSolarTimeScheduledEventKt.Dsl { /* compiled code */ }
            }

            private final val _builder: com.google.home.platform.traits.TimeTrait.RecurringSolarTimeScheduledEvent.Builder /* compiled code */

            public final var solarTime: com.google.home.platform.traits.TimeTrait.SolarTime /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: com.google.home.platform.traits.TimeTrait.SolarTime) {/* compiled code */ }

            public final val @receiver:androidx.annotation.NonNull com.google.home.platform.traits.TimeTraitKt.RecurringSolarTimeScheduledEventKt.Dsl.solarTimeOrNull: com.google.home.platform.traits.TimeTrait.SolarTime? /* compiled code */
                public final get

            public final var cronExpression: kotlin.String /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.TimeTrait.RecurringSolarTimeScheduledEvent { /* compiled code */ }

            public final fun clearSolarTime(): kotlin.Unit { /* compiled code */ }

            public final fun hasSolarTime(): kotlin.Boolean { /* compiled code */ }

            public final fun clearCronExpression(): kotlin.Unit { /* compiled code */ }
        }
    }

    public object SolarTimeKt {
        public final class Dsl private constructor(_builder: com.google.home.platform.traits.TimeTrait.SolarTime.Builder) {
            public companion object {
                @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.TimeTrait.SolarTime.Builder): com.google.home.platform.traits.TimeTraitKt.SolarTimeKt.Dsl { /* compiled code */ }
            }

            private final val _builder: com.google.home.platform.traits.TimeTrait.SolarTime.Builder /* compiled code */

            public final var type: com.google.home.platform.traits.TimeTrait.SolarTime.SolarTimeType /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: com.google.home.platform.traits.TimeTrait.SolarTime.SolarTimeType) {/* compiled code */ }

            public final var typeValue: kotlin.Int /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: kotlin.Int) {/* compiled code */ }

            public final var offset: com.google.protobuf.Duration /* compiled code */
                public final get
                public final set(value: com.google.protobuf.Duration) {/* compiled code */ }

            public final val com.google.home.platform.traits.TimeTraitKt.SolarTimeKt.Dsl.offsetOrNull: com.google.protobuf.Duration? /* compiled code */
                public final get

            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.TimeTrait.SolarTime { /* compiled code */ }

            public final fun clearType(): kotlin.Unit { /* compiled code */ }

            public final fun clearOffset(): kotlin.Unit { /* compiled code */ }

            public final fun hasOffset(): kotlin.Boolean { /* compiled code */ }
        }
    }
}
