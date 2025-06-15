// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class PressureMeasurementImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.PressureMeasurementTrait.Attributes) : com.google.home.matter.standard.PressureMeasurement, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.PressureMeasurementTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.PressureMeasurementTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val featureMap: com.google.home.matter.standard.PressureMeasurementTrait.Feature /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val maxMeasuredValue: kotlin.Short? /* compiled code */

    public open val maxScaledValue: kotlin.Short? /* compiled code */

    public open val measuredValue: kotlin.Short? /* compiled code */

    public open val minMeasuredValue: kotlin.Short? /* compiled code */

    public open val minScaledValue: kotlin.Short? /* compiled code */

    public open val scale: kotlin.Byte? /* compiled code */

    public open val scaledTolerance: kotlin.UShort? /* compiled code */

    public open val scaledValue: kotlin.Short? /* compiled code */

    public open val tolerance: kotlin.UShort? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.PressureMeasurement.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

