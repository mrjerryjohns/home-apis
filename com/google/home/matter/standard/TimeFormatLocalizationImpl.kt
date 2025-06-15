// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class TimeFormatLocalizationImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.TimeFormatLocalizationTrait.Attributes) : com.google.home.matter.standard.TimeFormatLocalization, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.TimeFormatLocalizationTrait.Attributes, com.google.home.Updatable<com.google.home.matter.standard.TimeFormatLocalization, com.google.home.matter.standard.TimeFormatLocalizationTrait.MutableAttributes> {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.TimeFormatLocalizationTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val activeCalendarType: com.google.home.matter.standard.TimeFormatLocalizationTrait.CalendarTypeEnum? /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val featureMap: com.google.home.matter.standard.TimeFormatLocalizationTrait.Feature /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val hourFormat: com.google.home.matter.standard.TimeFormatLocalizationTrait.HourFormatEnum? /* compiled code */

    public open val supportedCalendarTypes: kotlin.collections.List<com.google.home.matter.standard.TimeFormatLocalizationTrait.CalendarTypeEnum>? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.TimeFormatLocalization.Attribute): kotlin.Boolean { /* compiled code */ }

    public open suspend fun update(optimisticReturn: (com.google.home.matter.standard.TimeFormatLocalization) -> kotlin.Unit, init: com.google.home.matter.standard.TimeFormatLocalizationTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.TimeFormatLocalization { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

