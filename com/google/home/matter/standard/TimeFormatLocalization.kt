// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface TimeFormatLocalization : com.google.home.matter.standard.TimeFormatLocalizationTrait.Attributes, com.google.home.matter.MatterTrait, com.google.home.Updatable<com.google.home.matter.standard.TimeFormatLocalization, com.google.home.matter.standard.TimeFormatLocalizationTrait.MutableAttributes> {
    public companion object : com.google.home.TraitFactory<com.google.home.matter.standard.TimeFormatLocalization> {
        public final val hourFormat: com.google.home.automation.Attribute<com.google.home.matter.standard.TimeFormatLocalizationTrait.HourFormatEnum?> /* compiled code */
            public final get

        public final val activeCalendarType: com.google.home.automation.Attribute<com.google.home.matter.standard.TimeFormatLocalizationTrait.CalendarTypeEnum?> /* compiled code */
            public final get

        public final val supportedCalendarTypes: com.google.home.automation.Attribute<kotlin.collections.List<com.google.home.matter.standard.TimeFormatLocalizationTrait.CalendarTypeEnum>?> /* compiled code */
            public final get

        public final val generatedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val acceptedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val attributeList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val featureMap: com.google.home.automation.Attribute<com.google.home.matter.standard.TimeFormatLocalizationTrait.Feature> /* compiled code */
            public final get

        public final val clusterRevision: com.google.home.automation.Attribute<kotlin.UShort> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.TimeFormatLocalization?>.hourFormat: com.google.home.automation.TypedExpression<com.google.home.matter.standard.TimeFormatLocalizationTrait.HourFormatEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.TimeFormatLocalization?>.activeCalendarType: com.google.home.automation.TypedExpression<com.google.home.matter.standard.TimeFormatLocalizationTrait.CalendarTypeEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.TimeFormatLocalization?>.supportedCalendarTypes: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.TimeFormatLocalizationTrait.CalendarTypeEnum>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.TimeFormatLocalization?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.TimeFormatLocalization?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.TimeFormatLocalization?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.TimeFormatLocalization?>.featureMap: com.google.home.automation.TypedExpression<com.google.home.matter.standard.TimeFormatLocalizationTrait.Feature> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.TimeFormatLocalization?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.TimeFormatLocalization>.setHourFormat(value: com.google.home.matter.standard.TimeFormatLocalizationTrait.HourFormatEnum): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.TimeFormatLocalization>.setActiveCalendarType(value: com.google.home.matter.standard.TimeFormatLocalizationTrait.CalendarTypeEnum): kotlin.Unit { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.matter.standard.TimeFormatLocalization> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.matter.standard.TimeFormatLocalization.Attribute): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.TimeFormatLocalization.Attribute> {
        @androidx.annotation.NonNull hourFormat,

        @androidx.annotation.NonNull activeCalendarType,

        @androidx.annotation.NonNull supportedCalendarTypes,

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
}
