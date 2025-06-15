// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class UnitLocalizationImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.UnitLocalizationTrait.Attributes) : com.google.home.matter.standard.UnitLocalization, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.UnitLocalizationTrait.Attributes, com.google.home.Updatable<com.google.home.matter.standard.UnitLocalization, com.google.home.matter.standard.UnitLocalizationTrait.MutableAttributes> {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.UnitLocalizationTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val featureMap: com.google.home.matter.standard.UnitLocalizationTrait.Feature /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val temperatureUnit: com.google.home.matter.standard.UnitLocalizationTrait.TempUnitEnum? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.UnitLocalization.Attribute): kotlin.Boolean { /* compiled code */ }

    public open suspend fun update(optimisticReturn: (com.google.home.matter.standard.UnitLocalization) -> kotlin.Unit, init: com.google.home.matter.standard.UnitLocalizationTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.UnitLocalization { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

