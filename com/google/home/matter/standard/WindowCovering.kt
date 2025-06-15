// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface WindowCovering : com.google.home.matter.standard.WindowCoveringTrait.Attributes, com.google.home.matter.MatterTrait, com.google.home.Updatable<com.google.home.matter.standard.WindowCovering, com.google.home.matter.standard.WindowCoveringTrait.MutableAttributes>, com.google.home.matter.standard.WindowCoveringCommands {
    public companion object : com.google.home.TraitFactory<com.google.home.matter.standard.WindowCovering> {
        public final val type: com.google.home.automation.Attribute<com.google.home.matter.standard.WindowCoveringTrait.Type?> /* compiled code */
            public final get

        public final val physicalClosedLimitLift: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val physicalClosedLimitTilt: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val currentPositionLift: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val currentPositionTilt: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val numberOfActuationsLift: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val numberOfActuationsTilt: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val configStatus: com.google.home.automation.Attribute<com.google.home.matter.standard.WindowCoveringTrait.ConfigStatus?> /* compiled code */
            public final get

        public final val currentPositionLiftPercentage: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val currentPositionTiltPercentage: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val operationalStatus: com.google.home.automation.Attribute<com.google.home.matter.standard.WindowCoveringTrait.OperationalStatus?> /* compiled code */
            public final get

        public final val targetPositionLiftPercent100ths: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val targetPositionTiltPercent100ths: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val endProductType: com.google.home.automation.Attribute<com.google.home.matter.standard.WindowCoveringTrait.EndProductType?> /* compiled code */
            public final get

        public final val currentPositionLiftPercent100ths: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val currentPositionTiltPercent100ths: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val installedOpenLimitLift: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val installedClosedLimitLift: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val installedOpenLimitTilt: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val installedClosedLimitTilt: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val mode: com.google.home.automation.Attribute<com.google.home.matter.standard.WindowCoveringTrait.Mode?> /* compiled code */
            public final get

        public final val safetyStatus: com.google.home.automation.Attribute<com.google.home.matter.standard.WindowCoveringTrait.SafetyStatus?> /* compiled code */
            public final get

        public final val generatedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val acceptedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val attributeList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val featureMap: com.google.home.automation.Attribute<com.google.home.matter.standard.WindowCoveringTrait.Feature> /* compiled code */
            public final get

        public final val clusterRevision: com.google.home.automation.Attribute<kotlin.UShort> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.WindowCovering?>.type: com.google.home.automation.TypedExpression<com.google.home.matter.standard.WindowCoveringTrait.Type?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.WindowCovering?>.physicalClosedLimitLift: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.WindowCovering?>.physicalClosedLimitTilt: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.WindowCovering?>.currentPositionLift: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.WindowCovering?>.currentPositionTilt: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.WindowCovering?>.numberOfActuationsLift: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.WindowCovering?>.numberOfActuationsTilt: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.WindowCovering?>.configStatus: com.google.home.automation.TypedExpression<com.google.home.matter.standard.WindowCoveringTrait.ConfigStatus?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.WindowCovering?>.currentPositionLiftPercentage: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.WindowCovering?>.currentPositionTiltPercentage: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.WindowCovering?>.operationalStatus: com.google.home.automation.TypedExpression<com.google.home.matter.standard.WindowCoveringTrait.OperationalStatus?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.WindowCovering?>.targetPositionLiftPercent100ths: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.WindowCovering?>.targetPositionTiltPercent100ths: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.WindowCovering?>.endProductType: com.google.home.automation.TypedExpression<com.google.home.matter.standard.WindowCoveringTrait.EndProductType?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.WindowCovering?>.currentPositionLiftPercent100ths: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.WindowCovering?>.currentPositionTiltPercent100ths: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.WindowCovering?>.installedOpenLimitLift: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.WindowCovering?>.installedClosedLimitLift: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.WindowCovering?>.installedOpenLimitTilt: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.WindowCovering?>.installedClosedLimitTilt: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.WindowCovering?>.mode: com.google.home.automation.TypedExpression<com.google.home.matter.standard.WindowCoveringTrait.Mode?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.WindowCovering?>.safetyStatus: com.google.home.automation.TypedExpression<com.google.home.matter.standard.WindowCoveringTrait.SafetyStatus?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.WindowCovering?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.WindowCovering?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.WindowCovering?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.WindowCovering?>.featureMap: com.google.home.automation.TypedExpression<com.google.home.matter.standard.WindowCoveringTrait.Feature> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.WindowCovering?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.WindowCovering>.setMode(value: com.google.home.matter.standard.WindowCoveringTrait.Mode): kotlin.Unit { /* compiled code */ }

        public final fun upOrOpen(): com.google.home.automation.Command { /* compiled code */ }

        public final fun downOrClose(): com.google.home.automation.Command { /* compiled code */ }

        public final fun stopMotion(): com.google.home.automation.Command { /* compiled code */ }

        public final fun goToLiftValue(liftValue: kotlin.UShort): com.google.home.automation.Command { /* compiled code */ }

        public final fun goToLiftPercentage(liftPercent100thsValue: kotlin.UShort): com.google.home.automation.Command { /* compiled code */ }

        public final fun goToTiltValue(tiltValue: kotlin.UShort): com.google.home.automation.Command { /* compiled code */ }

        public final fun goToTiltPercentage(tiltPercent100thsValue: kotlin.UShort): com.google.home.automation.Command { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.matter.standard.WindowCovering> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.matter.standard.WindowCovering.Attribute): kotlin.Boolean

    public abstract fun supports(command: com.google.home.matter.standard.WindowCovering.Command): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.WindowCovering.Attribute> {
        @androidx.annotation.NonNull type,

        @androidx.annotation.NonNull physicalClosedLimitLift,

        @androidx.annotation.NonNull physicalClosedLimitTilt,

        @androidx.annotation.NonNull currentPositionLift,

        @androidx.annotation.NonNull currentPositionTilt,

        @androidx.annotation.NonNull numberOfActuationsLift,

        @androidx.annotation.NonNull numberOfActuationsTilt,

        @androidx.annotation.NonNull configStatus,

        @androidx.annotation.NonNull currentPositionLiftPercentage,

        @androidx.annotation.NonNull currentPositionTiltPercentage,

        @androidx.annotation.NonNull operationalStatus,

        @androidx.annotation.NonNull targetPositionLiftPercent100ths,

        @androidx.annotation.NonNull targetPositionTiltPercent100ths,

        @androidx.annotation.NonNull endProductType,

        @androidx.annotation.NonNull currentPositionLiftPercent100ths,

        @androidx.annotation.NonNull currentPositionTiltPercent100ths,

        @androidx.annotation.NonNull installedOpenLimitLift,

        @androidx.annotation.NonNull installedClosedLimitLift,

        @androidx.annotation.NonNull installedOpenLimitTilt,

        @androidx.annotation.NonNull installedClosedLimitTilt,

        @androidx.annotation.NonNull mode,

        @androidx.annotation.NonNull safetyStatus,

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

    public final enum class Command private constructor(tag: kotlin.UInt) : kotlin.Enum<com.google.home.matter.standard.WindowCovering.Command> {
        @androidx.annotation.NonNull UpOrOpen,

        @androidx.annotation.NonNull DownOrClose,

        @androidx.annotation.NonNull StopMotion,

        @androidx.annotation.NonNull GoToLiftValue,

        @androidx.annotation.NonNull GoToLiftPercentage,

        @androidx.annotation.NonNull GoToTiltValue,

        @androidx.annotation.NonNull GoToTiltPercentage;

        public final val tag: kotlin.UInt /* compiled code */
    }
}
