// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class ActivatedCarbonFilterMonitoringImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.ActivatedCarbonFilterMonitoringTrait.Attributes) : com.google.home.matter.standard.ActivatedCarbonFilterMonitoring, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.ActivatedCarbonFilterMonitoringTrait.Attributes, com.google.home.Updatable<com.google.home.matter.standard.ActivatedCarbonFilterMonitoring, com.google.home.matter.standard.ActivatedCarbonFilterMonitoringTrait.MutableAttributes> {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.ActivatedCarbonFilterMonitoringTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val changeIndication: com.google.home.matter.standard.ActivatedCarbonFilterMonitoringTrait.ChangeIndicationEnum? /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val condition: kotlin.UByte? /* compiled code */

    public open val degradationDirection: com.google.home.matter.standard.ActivatedCarbonFilterMonitoringTrait.DegradationDirectionEnum? /* compiled code */

    public open val featureMap: com.google.home.matter.standard.ActivatedCarbonFilterMonitoringTrait.Feature /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val inPlaceIndicator: kotlin.Boolean? /* compiled code */

    public open val lastChangedTime: kotlin.UInt? /* compiled code */

    public open val replacementProductList: kotlin.collections.List<com.google.home.matter.standard.ActivatedCarbonFilterMonitoringTrait.ReplacementProductStruct>? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.ActivatedCarbonFilterMonitoring.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.matter.standard.ActivatedCarbonFilterMonitoring.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun resetCondition(): kotlin.Unit { /* compiled code */ }

    public open suspend fun update(optimisticReturn: (com.google.home.matter.standard.ActivatedCarbonFilterMonitoring) -> kotlin.Unit, init: com.google.home.matter.standard.ActivatedCarbonFilterMonitoringTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.ActivatedCarbonFilterMonitoring { /* compiled code */ }

    public open fun resetConditionBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}
