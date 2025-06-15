// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class TimeTrait public constructor() {
    public companion object {
        public const final val ID: kotlin.String /* from: com.google.home.google.TraitId */ = COMPILED_CODE /* compiled code */

        private final fun parseDaysOfWeek(scheduledEvent: com.google.home.platform.traits.TimeTrait.ScheduledEvent): kotlin.collections.List<java.time.DayOfWeek> { /* compiled code */ }

        private final fun parseDayOfWeek(dayOfWeek: com.google.type.DayOfWeek): java.time.DayOfWeek { /* compiled code */ }
    }

    public interface Attributes {
        public companion object : com.google.home.google.Parser<com.google.home.google.TimeTrait.Attributes> {
            public open fun parseFrom(byteArray: kotlin.ByteArray): com.google.home.google.TimeTrait.Attributes { /* compiled code */ }

            public open fun encode(payload: com.google.home.google.TimeTrait.Attributes): kotlin.ByteArray { /* compiled code */ }
        }

        public abstract val currentTime: java.time.LocalTime?

        public abstract val sunriseTime: java.time.LocalTime?

        public abstract val sunsetTime: java.time.LocalTime?

        public abstract val dayOfWeek: java.time.DayOfWeek?

        public abstract val currentDate: java.time.LocalDate?
    }

    public final enum class SolarTimeType private constructor() : kotlin.Enum<com.google.home.google.TimeTrait.SolarTimeType> {
        @androidx.annotation.NonNull Sunrise,

        @androidx.annotation.NonNull Sunset;
    }

    public interface ScheduledTimeEvent {
        public abstract val clockTime: java.time.LocalTime?

        public abstract val solarTime: com.google.home.google.TimeTrait.SolarTimeStruct?

        public abstract val daysOfWeek: kotlin.collections.List<java.time.DayOfWeek>

        public abstract val data: kotlin.ByteArray?
    }

    public final class ScheduledTimeEventImpl public constructor(clockTime: java.time.LocalTime? = COMPILED_CODE, solarTime: com.google.home.google.TimeTrait.SolarTimeStruct? = COMPILED_CODE, daysOfWeek: kotlin.collections.List<java.time.DayOfWeek> = COMPILED_CODE, data: kotlin.ByteArray? = COMPILED_CODE) : com.google.home.google.TimeTrait.ScheduledTimeEvent {
        public companion object : com.google.home.google.Parser<com.google.home.google.TimeTrait.ScheduledTimeEvent> {
            public const final val ID: kotlin.String = COMPILED_CODE /* compiled code */

            public open fun parseFrom(byteArray: kotlin.ByteArray): com.google.home.google.TimeTrait.ScheduledTimeEvent { /* compiled code */ }

            public open fun encode(payload: com.google.home.google.TimeTrait.ScheduledTimeEvent): kotlin.ByteArray { /* compiled code */ }
        }

        public open val clockTime: java.time.LocalTime? /* compiled code */

        public open val solarTime: com.google.home.google.TimeTrait.SolarTimeStruct? /* compiled code */

        public open val daysOfWeek: kotlin.collections.List<java.time.DayOfWeek> /* compiled code */

        public open val data: kotlin.ByteArray? /* compiled code */

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface RecurringSolarTimeScheduledEvent {
        public abstract val solarTime: com.google.home.google.TimeTrait.SolarTimeStruct?

        public abstract val cronExpression: kotlin.String?
    }

    public final class RecurringSolarTimeScheduledEventImpl public constructor(solarTime: com.google.home.google.TimeTrait.SolarTimeStruct, cronExpression: kotlin.String) : com.google.home.google.TimeTrait.RecurringSolarTimeScheduledEvent {
        public companion object : com.google.home.google.Parser<com.google.home.google.TimeTrait.RecurringSolarTimeScheduledEvent> {
            public const final val ID: kotlin.String = COMPILED_CODE /* compiled code */

            public open fun parseFrom(byteArray: kotlin.ByteArray): com.google.home.google.TimeTrait.RecurringSolarTimeScheduledEvent { /* compiled code */ }

            public open fun encode(payload: com.google.home.google.TimeTrait.RecurringSolarTimeScheduledEvent): kotlin.ByteArray { /* compiled code */ }
        }

        public open val solarTime: com.google.home.google.TimeTrait.SolarTimeStruct /* compiled code */

        public open val cronExpression: kotlin.String /* compiled code */
    }

    public interface RecurringClockTimeScheduledEvent {
        public abstract val cronExpression: kotlin.String?
    }

    public final class RecurringClockTimeScheduledEventImpl public constructor(cronExpression: kotlin.String) : com.google.home.google.TimeTrait.RecurringClockTimeScheduledEvent {
        public companion object : com.google.home.google.Parser<com.google.home.google.TimeTrait.RecurringClockTimeScheduledEvent> {
            public const final val ID: kotlin.String = COMPILED_CODE /* compiled code */

            public open fun parseFrom(byteArray: kotlin.ByteArray): com.google.home.google.TimeTrait.RecurringClockTimeScheduledEvent { /* compiled code */ }

            public open fun encode(payload: com.google.home.google.TimeTrait.RecurringClockTimeScheduledEvent): kotlin.ByteArray { /* compiled code */ }
        }

        public open val cronExpression: kotlin.String /* compiled code */
    }

    public final class SolarTimeStruct public constructor(type: com.google.home.google.TimeTrait.SolarTimeType, offset: java.time.Duration) {
        public companion object Adapter : com.google.home.StructDescriptor {
            public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */
        }

        public constructor(type: com.google.home.google.TimeTrait.SolarTimeType) { /* compiled code */ }

        public final val type: com.google.home.google.TimeTrait.SolarTimeType /* compiled code */

        public final val offset: java.time.Duration /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.TimeTrait.SolarTimeStruct.StructFields> {
            @androidx.annotation.NonNull type,

            @androidx.annotation.NonNull offset;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class AttributesImpl public constructor(currentTime: java.time.LocalTime?, sunriseTime: java.time.LocalTime?, sunsetTime: java.time.LocalTime?, dayOfWeek: java.time.DayOfWeek?, currentDate: java.time.LocalDate?) : com.google.home.google.TimeTrait.Attributes {
        public open val currentTime: java.time.LocalTime? /* compiled code */

        public open val sunriseTime: java.time.LocalTime? /* compiled code */

        public open val sunsetTime: java.time.LocalTime? /* compiled code */

        public open val dayOfWeek: java.time.DayOfWeek? /* compiled code */

        public open val currentDate: java.time.LocalDate? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }
    }
}

