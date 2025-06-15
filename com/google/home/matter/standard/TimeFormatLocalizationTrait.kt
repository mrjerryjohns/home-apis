// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object TimeFormatLocalizationTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class CalendarTypeEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.TimeFormatLocalizationTrait.CalendarTypeEnum> {
        @androidx.annotation.NonNull Buddhist,

        @androidx.annotation.NonNull Chinese,

        @androidx.annotation.NonNull Coptic,

        @androidx.annotation.NonNull Ethiopian,

        @androidx.annotation.NonNull Gregorian,

        @androidx.annotation.NonNull Hebrew,

        @androidx.annotation.NonNull Indian,

        @androidx.annotation.NonNull Islamic,

        @androidx.annotation.NonNull Japanese,

        @androidx.annotation.NonNull Korean,

        @androidx.annotation.NonNull Persian,

        @androidx.annotation.NonNull Taiwanese,

        @androidx.annotation.NonNull UseActiveLocale,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.TimeFormatLocalizationTrait.CalendarTypeEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class HourFormatEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.TimeFormatLocalizationTrait.HourFormatEnum> {
        @androidx.annotation.NonNull Num12hr,

        @androidx.annotation.NonNull Num24hr,

        @androidx.annotation.NonNull UseActiveLocale,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.TimeFormatLocalizationTrait.HourFormatEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final data class Feature public constructor(calendarFormat: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.TimeFormatLocalizationTrait.Feature> {
            private const final val CALENDAR_FORMAT_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.TimeFormatLocalizationTrait.Feature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.TimeFormatLocalizationTrait.Feature { /* compiled code */ }
        }

        public final val calendarFormat: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(calendarFormat: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.TimeFormatLocalizationTrait.Feature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.TimeFormatLocalizationTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.TimeFormatLocalizationTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.TimeFormatLocalizationTrait.Attributes { /* compiled code */ }
        }

        public abstract val hourFormat: com.google.home.matter.standard.TimeFormatLocalizationTrait.HourFormatEnum?

        public abstract val activeCalendarType: com.google.home.matter.standard.TimeFormatLocalizationTrait.CalendarTypeEnum?

        public abstract val supportedCalendarTypes: kotlin.collections.List<com.google.home.matter.standard.TimeFormatLocalizationTrait.CalendarTypeEnum>?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: com.google.home.matter.standard.TimeFormatLocalizationTrait.Feature

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(hourFormat: com.google.home.matter.standard.TimeFormatLocalizationTrait.HourFormatEnum? = COMPILED_CODE, activeCalendarType: com.google.home.matter.standard.TimeFormatLocalizationTrait.CalendarTypeEnum? = COMPILED_CODE, supportedCalendarTypes: kotlin.collections.List<com.google.home.matter.standard.TimeFormatLocalizationTrait.CalendarTypeEnum>? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.TimeFormatLocalizationTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.matter.standard.TimeFormatLocalizationTrait.Attributes, com.google.home.matter.serialization.CanMutate<com.google.home.matter.standard.TimeFormatLocalizationTrait.Attributes, com.google.home.matter.standard.TimeFormatLocalizationTrait.MutableAttributes> {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.TimeFormatLocalizationTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.TimeFormatLocalizationTrait.Attributes) { /* compiled code */ }

        public open val hourFormat: com.google.home.matter.standard.TimeFormatLocalizationTrait.HourFormatEnum? /* compiled code */

        public open val activeCalendarType: com.google.home.matter.standard.TimeFormatLocalizationTrait.CalendarTypeEnum? /* compiled code */

        public open val supportedCalendarTypes: kotlin.collections.List<com.google.home.matter.standard.TimeFormatLocalizationTrait.CalendarTypeEnum>? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: com.google.home.matter.standard.TimeFormatLocalizationTrait.Feature /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open fun mutate(init: com.google.home.matter.standard.TimeFormatLocalizationTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.TimeFormatLocalizationTrait.Attributes { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(hourFormat: com.google.home.matter.standard.TimeFormatLocalizationTrait.HourFormatEnum? = COMPILED_CODE, activeCalendarType: com.google.home.matter.standard.TimeFormatLocalizationTrait.CalendarTypeEnum? = COMPILED_CODE, supportedCalendarTypes: kotlin.collections.List<com.google.home.matter.standard.TimeFormatLocalizationTrait.CalendarTypeEnum>? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.TimeFormatLocalizationTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.matter.standard.TimeFormatLocalizationTrait.AttributesImpl { /* compiled code */ }
    }

    public final class MutableAttributes public constructor(attributes: com.google.home.matter.standard.TimeFormatLocalizationTrait.Attributes) : com.google.home.matter.standard.TimeFormatLocalizationTrait.AttributesImpl {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.TimeFormatLocalizationTrait.MutableAttributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.TimeFormatLocalizationTrait.MutableAttributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.TimeFormatLocalizationTrait.MutableAttributes { /* compiled code */ }
        }

        internal final var _hourFormat: com.google.home.matter.standard.TimeFormatLocalizationTrait.HourFormatEnum? /* compiled code */

        public open val hourFormat: com.google.home.matter.standard.TimeFormatLocalizationTrait.HourFormatEnum? /* compiled code */
            public open get

        internal final var _activeCalendarType: com.google.home.matter.standard.TimeFormatLocalizationTrait.CalendarTypeEnum? /* compiled code */

        public open val activeCalendarType: com.google.home.matter.standard.TimeFormatLocalizationTrait.CalendarTypeEnum? /* compiled code */
            public open get

        public final fun setHourFormat(value: com.google.home.matter.standard.TimeFormatLocalizationTrait.HourFormatEnum): kotlin.Unit { /* compiled code */ }

        public final fun setActiveCalendarType(value: com.google.home.matter.standard.TimeFormatLocalizationTrait.CalendarTypeEnum): kotlin.Unit { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }
}

