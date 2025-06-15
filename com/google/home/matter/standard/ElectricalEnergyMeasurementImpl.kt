// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class ElectricalEnergyMeasurementImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.Attributes) : com.google.home.matter.standard.ElectricalEnergyMeasurement, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val accuracy: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.MeasurementAccuracyStruct? /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val cumulativeEnergyExported: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.EnergyMeasurementStruct? /* compiled code */

    public open val cumulativeEnergyImported: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.EnergyMeasurementStruct? /* compiled code */

    public open val cumulativeEnergyReset: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.CumulativeEnergyResetStruct? /* compiled code */

    public open val featureMap: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.Feature /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val periodicEnergyExported: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.EnergyMeasurementStruct? /* compiled code */

    public open val periodicEnergyImported: com.google.home.matter.standard.ElectricalEnergyMeasurementTrait.EnergyMeasurementStruct? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.ElectricalEnergyMeasurement.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

