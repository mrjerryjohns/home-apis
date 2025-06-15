// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class WindowCoveringImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.WindowCoveringTrait.Attributes) : com.google.home.matter.standard.WindowCovering, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.WindowCoveringTrait.Attributes, com.google.home.Updatable<com.google.home.matter.standard.WindowCovering, com.google.home.matter.standard.WindowCoveringTrait.MutableAttributes> {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.WindowCoveringTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val configStatus: com.google.home.matter.standard.WindowCoveringTrait.ConfigStatus? /* compiled code */

    public open val currentPositionLift: kotlin.UShort? /* compiled code */

    public open val currentPositionLiftPercent100ths: kotlin.UShort? /* compiled code */

    public open val currentPositionLiftPercentage: kotlin.UByte? /* compiled code */

    public open val currentPositionTilt: kotlin.UShort? /* compiled code */

    public open val currentPositionTiltPercent100ths: kotlin.UShort? /* compiled code */

    public open val currentPositionTiltPercentage: kotlin.UByte? /* compiled code */

    public open val endProductType: com.google.home.matter.standard.WindowCoveringTrait.EndProductType? /* compiled code */

    public open val featureMap: com.google.home.matter.standard.WindowCoveringTrait.Feature /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val installedClosedLimitLift: kotlin.UShort? /* compiled code */

    public open val installedClosedLimitTilt: kotlin.UShort? /* compiled code */

    public open val installedOpenLimitLift: kotlin.UShort? /* compiled code */

    public open val installedOpenLimitTilt: kotlin.UShort? /* compiled code */

    public open val mode: com.google.home.matter.standard.WindowCoveringTrait.Mode? /* compiled code */

    public open val numberOfActuationsLift: kotlin.UShort? /* compiled code */

    public open val numberOfActuationsTilt: kotlin.UShort? /* compiled code */

    public open val operationalStatus: com.google.home.matter.standard.WindowCoveringTrait.OperationalStatus? /* compiled code */

    public open val physicalClosedLimitLift: kotlin.UShort? /* compiled code */

    public open val physicalClosedLimitTilt: kotlin.UShort? /* compiled code */

    public open val safetyStatus: com.google.home.matter.standard.WindowCoveringTrait.SafetyStatus? /* compiled code */

    public open val targetPositionLiftPercent100ths: kotlin.UShort? /* compiled code */

    public open val targetPositionTiltPercent100ths: kotlin.UShort? /* compiled code */

    public open val type: com.google.home.matter.standard.WindowCoveringTrait.Type? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.WindowCovering.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.matter.standard.WindowCovering.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun upOrOpen(): kotlin.Unit { /* compiled code */ }

    public open suspend fun downOrClose(): kotlin.Unit { /* compiled code */ }

    public open suspend fun stopMotion(): kotlin.Unit { /* compiled code */ }

    public open suspend fun goToLiftValue(liftValue: kotlin.UShort): kotlin.Unit { /* compiled code */ }

    public open suspend fun goToLiftPercentage(liftPercent100thsValue: kotlin.UShort): kotlin.Unit { /* compiled code */ }

    public open suspend fun goToTiltValue(tiltValue: kotlin.UShort): kotlin.Unit { /* compiled code */ }

    public open suspend fun goToTiltPercentage(tiltPercent100thsValue: kotlin.UShort): kotlin.Unit { /* compiled code */ }

    public open suspend fun update(optimisticReturn: (com.google.home.matter.standard.WindowCovering) -> kotlin.Unit, init: com.google.home.matter.standard.WindowCoveringTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.WindowCovering { /* compiled code */ }

    public open fun upOrOpenBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun downOrCloseBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun stopMotionBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun goToLiftValueBatchable(liftValue: kotlin.UShort): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun goToLiftPercentageBatchable(liftPercent100thsValue: kotlin.UShort): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun goToTiltValueBatchable(tiltValue: kotlin.UShort): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun goToTiltPercentageBatchable(tiltPercent100thsValue: kotlin.UShort): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}
