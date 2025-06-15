// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class ExtendedAirQualityImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.google.ExtendedAirQualityTrait.Attributes) : com.google.home.google.ExtendedAirQuality, com.google.home.matter.MatterTraitImpl, com.google.home.google.ExtendedAirQualityTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.google.ExtendedAirQualityTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val featureMap: kotlin.UInt /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val indoorAirQuality: com.google.home.google.ExtendedAirQualityTrait.AirQualityLevel? /* compiled code */

    public open val indoorMeasuredValue: kotlin.Int? /* compiled code */

    public open val maxMeasuredValue: kotlin.Int? /* compiled code */

    public open val measuredValue: kotlin.Int? /* compiled code */

    public open val minMeasuredValue: kotlin.Int? /* compiled code */

    public open val outdoorAirQuality: com.google.home.google.ExtendedAirQualityTrait.AirQualityLevel? /* compiled code */

    public open val outdoorMeasuredValue: kotlin.Int? /* compiled code */

    public open val tolerance: kotlin.Int? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.google.ExtendedAirQuality.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}
