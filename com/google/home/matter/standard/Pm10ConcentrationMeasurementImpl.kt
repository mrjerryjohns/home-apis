// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class Pm10ConcentrationMeasurementImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.Pm10ConcentrationMeasurementTrait.Attributes) : com.google.home.matter.standard.Pm10ConcentrationMeasurement, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.Pm10ConcentrationMeasurementTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.Pm10ConcentrationMeasurementTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val averageMeasuredValue: kotlin.Float? /* compiled code */

    public open val averageMeasuredValueWindow: kotlin.UInt? /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val featureMap: com.google.home.matter.standard.Pm10ConcentrationMeasurementTrait.Feature /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val levelValue: com.google.home.matter.standard.Pm10ConcentrationMeasurementTrait.LevelValueEnum? /* compiled code */

    public open val maxMeasuredValue: kotlin.Float? /* compiled code */

    public open val measuredValue: kotlin.Float? /* compiled code */

    public open val measurementMedium: com.google.home.matter.standard.Pm10ConcentrationMeasurementTrait.MeasurementMediumEnum? /* compiled code */

    public open val measurementUnit: com.google.home.matter.standard.Pm10ConcentrationMeasurementTrait.MeasurementUnitEnum? /* compiled code */

    public open val minMeasuredValue: kotlin.Float? /* compiled code */

    public open val peakMeasuredValue: kotlin.Float? /* compiled code */

    public open val peakMeasuredValueWindow: kotlin.UInt? /* compiled code */

    public open val uncertainty: kotlin.Float? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.Pm10ConcentrationMeasurement.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}
