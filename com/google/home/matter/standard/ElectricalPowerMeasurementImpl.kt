// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class ElectricalPowerMeasurementImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.ElectricalPowerMeasurementTrait.Attributes) : com.google.home.matter.standard.ElectricalPowerMeasurement, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.ElectricalPowerMeasurementTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.ElectricalPowerMeasurementTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val accuracy: kotlin.collections.List<com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementAccuracyStruct>? /* compiled code */

    public open val activeCurrent: kotlin.Long? /* compiled code */

    public open val activePower: kotlin.Long? /* compiled code */

    public open val apparentCurrent: kotlin.Long? /* compiled code */

    public open val apparentPower: kotlin.Long? /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val featureMap: com.google.home.matter.standard.ElectricalPowerMeasurementTrait.Feature /* compiled code */

    public open val frequency: kotlin.Long? /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val harmonicCurrents: kotlin.collections.List<com.google.home.matter.standard.ElectricalPowerMeasurementTrait.HarmonicMeasurementStruct>? /* compiled code */

    public open val harmonicPhases: kotlin.collections.List<com.google.home.matter.standard.ElectricalPowerMeasurementTrait.HarmonicMeasurementStruct>? /* compiled code */

    public open val neutralCurrent: kotlin.Long? /* compiled code */

    public open val numberOfMeasurementTypes: kotlin.UByte? /* compiled code */

    public open val powerFactor: kotlin.Long? /* compiled code */

    public open val powerMode: com.google.home.matter.standard.ElectricalPowerMeasurementTrait.PowerModeEnum? /* compiled code */

    public open val ranges: kotlin.collections.List<com.google.home.matter.standard.ElectricalPowerMeasurementTrait.MeasurementRangeStruct>? /* compiled code */

    public open val reactiveCurrent: kotlin.Long? /* compiled code */

    public open val reactivePower: kotlin.Long? /* compiled code */

    public open val rmsCurrent: kotlin.Long? /* compiled code */

    public open val rmsPower: kotlin.Long? /* compiled code */

    public open val rmsVoltage: kotlin.Long? /* compiled code */

    public open val voltage: kotlin.Long? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.ElectricalPowerMeasurement.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

