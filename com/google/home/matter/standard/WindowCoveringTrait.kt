// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object WindowCoveringTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class EndProductType private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.WindowCoveringTrait.EndProductType> {
        @androidx.annotation.NonNull RollerShade,

        @androidx.annotation.NonNull RomanShade,

        @androidx.annotation.NonNull BalloonShade,

        @androidx.annotation.NonNull WovenWood,

        @androidx.annotation.NonNull PleatedShade,

        @androidx.annotation.NonNull CellularShade,

        @androidx.annotation.NonNull LayeredShade,

        @androidx.annotation.NonNull LayeredShade2D,

        @androidx.annotation.NonNull SheerShade,

        @androidx.annotation.NonNull TiltOnlyInteriorBlind,

        @androidx.annotation.NonNull InteriorBlind,

        @androidx.annotation.NonNull VerticalBlindStripCurtain,

        @androidx.annotation.NonNull InteriorVenetianBlind,

        @androidx.annotation.NonNull ExteriorVenetianBlind,

        @androidx.annotation.NonNull LateralLeftCurtain,

        @androidx.annotation.NonNull LateralRightCurtain,

        @androidx.annotation.NonNull CentralCurtain,

        @androidx.annotation.NonNull RollerShutter,

        @androidx.annotation.NonNull ExteriorVerticalScreen,

        @androidx.annotation.NonNull AwningTerracePatio,

        @androidx.annotation.NonNull AwningVerticalScreen,

        @androidx.annotation.NonNull TiltOnlyPergola,

        @androidx.annotation.NonNull SwingingShutter,

        @androidx.annotation.NonNull SlidingShutter,

        @androidx.annotation.NonNull Unknown,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.WindowCoveringTrait.EndProductType> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class Type private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.WindowCoveringTrait.Type> {
        @androidx.annotation.NonNull RollerShade,

        @androidx.annotation.NonNull RollerShade2Motor,

        @androidx.annotation.NonNull RollerShadeExterior,

        @androidx.annotation.NonNull RollerShadeExterior2Motor,

        @androidx.annotation.NonNull Drapery,

        @androidx.annotation.NonNull Awning,

        @androidx.annotation.NonNull Shutter,

        @androidx.annotation.NonNull TiltBlindTiltOnly,

        @androidx.annotation.NonNull TiltBlindLiftAndTilt,

        @androidx.annotation.NonNull ProjectorScreen,

        @androidx.annotation.NonNull Unknown,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.WindowCoveringTrait.Type> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final data class ConfigStatus public constructor(operational: kotlin.Boolean = COMPILED_CODE, onlineReserved: kotlin.Boolean = COMPILED_CODE, liftMovementReversed: kotlin.Boolean = COMPILED_CODE, liftPositionAware: kotlin.Boolean = COMPILED_CODE, tiltPositionAware: kotlin.Boolean = COMPILED_CODE, liftEncoderControlled: kotlin.Boolean = COMPILED_CODE, tiltEncoderControlled: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.WindowCoveringTrait.ConfigStatus> {
            private const final val OPERATIONAL_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val ONLINE_RESERVED_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val LIFT_MOVEMENT_REVERSED_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val LIFT_POSITION_AWARE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val TILT_POSITION_AWARE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val LIFT_ENCODER_CONTROLLED_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val TILT_ENCODER_CONTROLLED_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.WindowCoveringTrait.ConfigStatus): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.WindowCoveringTrait.ConfigStatus { /* compiled code */ }
        }

        public final val operational: kotlin.Boolean /* compiled code */

        public final val onlineReserved: kotlin.Boolean /* compiled code */

        public final val liftMovementReversed: kotlin.Boolean /* compiled code */

        public final val liftPositionAware: kotlin.Boolean /* compiled code */

        public final val tiltPositionAware: kotlin.Boolean /* compiled code */

        public final val liftEncoderControlled: kotlin.Boolean /* compiled code */

        public final val tiltEncoderControlled: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component5(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component6(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component7(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(operational: kotlin.Boolean = COMPILED_CODE, onlineReserved: kotlin.Boolean = COMPILED_CODE, liftMovementReversed: kotlin.Boolean = COMPILED_CODE, liftPositionAware: kotlin.Boolean = COMPILED_CODE, tiltPositionAware: kotlin.Boolean = COMPILED_CODE, liftEncoderControlled: kotlin.Boolean = COMPILED_CODE, tiltEncoderControlled: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.WindowCoveringTrait.ConfigStatus { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final data class Feature public constructor(lift: kotlin.Boolean = COMPILED_CODE, tilt: kotlin.Boolean = COMPILED_CODE, positionAwareLift: kotlin.Boolean = COMPILED_CODE, absolutePosition: kotlin.Boolean = COMPILED_CODE, positionAwareTilt: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.WindowCoveringTrait.Feature> {
            private const final val LIFT_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val TILT_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val POSITION_AWARE_LIFT_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val ABSOLUTE_POSITION_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val POSITION_AWARE_TILT_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.WindowCoveringTrait.Feature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.WindowCoveringTrait.Feature { /* compiled code */ }
        }

        public final val lift: kotlin.Boolean /* compiled code */

        public final val tilt: kotlin.Boolean /* compiled code */

        public final val positionAwareLift: kotlin.Boolean /* compiled code */

        public final val absolutePosition: kotlin.Boolean /* compiled code */

        public final val positionAwareTilt: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component5(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(lift: kotlin.Boolean = COMPILED_CODE, tilt: kotlin.Boolean = COMPILED_CODE, positionAwareLift: kotlin.Boolean = COMPILED_CODE, absolutePosition: kotlin.Boolean = COMPILED_CODE, positionAwareTilt: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.WindowCoveringTrait.Feature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final data class Mode public constructor(motorDirectionReversed: kotlin.Boolean = COMPILED_CODE, calibrationMode: kotlin.Boolean = COMPILED_CODE, maintenanceMode: kotlin.Boolean = COMPILED_CODE, ledFeedback: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.WindowCoveringTrait.Mode> {
            private const final val MOTOR_DIRECTION_REVERSED_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val CALIBRATION_MODE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val MAINTENANCE_MODE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val LED_FEEDBACK_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.WindowCoveringTrait.Mode): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.WindowCoveringTrait.Mode { /* compiled code */ }
        }

        public final val motorDirectionReversed: kotlin.Boolean /* compiled code */

        public final val calibrationMode: kotlin.Boolean /* compiled code */

        public final val maintenanceMode: kotlin.Boolean /* compiled code */

        public final val ledFeedback: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(motorDirectionReversed: kotlin.Boolean = COMPILED_CODE, calibrationMode: kotlin.Boolean = COMPILED_CODE, maintenanceMode: kotlin.Boolean = COMPILED_CODE, ledFeedback: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.WindowCoveringTrait.Mode { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final data class OperationalStatus public constructor(global: kotlin.Boolean = COMPILED_CODE, lift: kotlin.Boolean = COMPILED_CODE, tilt: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.WindowCoveringTrait.OperationalStatus> {
            private const final val GLOBAL_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val LIFT_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val TILT_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.WindowCoveringTrait.OperationalStatus): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.WindowCoveringTrait.OperationalStatus { /* compiled code */ }
        }

        public final val global: kotlin.Boolean /* compiled code */

        public final val lift: kotlin.Boolean /* compiled code */

        public final val tilt: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(global: kotlin.Boolean = COMPILED_CODE, lift: kotlin.Boolean = COMPILED_CODE, tilt: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.WindowCoveringTrait.OperationalStatus { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final data class SafetyStatus public constructor(remoteLockout: kotlin.Boolean = COMPILED_CODE, tamperDetection: kotlin.Boolean = COMPILED_CODE, failedCommunication: kotlin.Boolean = COMPILED_CODE, positionFailure: kotlin.Boolean = COMPILED_CODE, thermalProtection: kotlin.Boolean = COMPILED_CODE, obstacleDetected: kotlin.Boolean = COMPILED_CODE, power: kotlin.Boolean = COMPILED_CODE, stopInput: kotlin.Boolean = COMPILED_CODE, motorJammed: kotlin.Boolean = COMPILED_CODE, hardwareFailure: kotlin.Boolean = COMPILED_CODE, manualOperation: kotlin.Boolean = COMPILED_CODE, protection: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.WindowCoveringTrait.SafetyStatus> {
            private const final val REMOTE_LOCKOUT_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val TAMPER_DETECTION_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val FAILED_COMMUNICATION_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val POSITION_FAILURE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val THERMAL_PROTECTION_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val OBSTACLE_DETECTED_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val POWER_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val STOP_INPUT_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val MOTOR_JAMMED_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val HARDWARE_FAILURE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val MANUAL_OPERATION_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val PROTECTION_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.WindowCoveringTrait.SafetyStatus): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.WindowCoveringTrait.SafetyStatus { /* compiled code */ }
        }

        public final val remoteLockout: kotlin.Boolean /* compiled code */

        public final val tamperDetection: kotlin.Boolean /* compiled code */

        public final val failedCommunication: kotlin.Boolean /* compiled code */

        public final val positionFailure: kotlin.Boolean /* compiled code */

        public final val thermalProtection: kotlin.Boolean /* compiled code */

        public final val obstacleDetected: kotlin.Boolean /* compiled code */

        public final val power: kotlin.Boolean /* compiled code */

        public final val stopInput: kotlin.Boolean /* compiled code */

        public final val motorJammed: kotlin.Boolean /* compiled code */

        public final val hardwareFailure: kotlin.Boolean /* compiled code */

        public final val manualOperation: kotlin.Boolean /* compiled code */

        public final val protection: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component5(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component6(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component7(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component8(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component9(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component10(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component11(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component12(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(remoteLockout: kotlin.Boolean = COMPILED_CODE, tamperDetection: kotlin.Boolean = COMPILED_CODE, failedCommunication: kotlin.Boolean = COMPILED_CODE, positionFailure: kotlin.Boolean = COMPILED_CODE, thermalProtection: kotlin.Boolean = COMPILED_CODE, obstacleDetected: kotlin.Boolean = COMPILED_CODE, power: kotlin.Boolean = COMPILED_CODE, stopInput: kotlin.Boolean = COMPILED_CODE, motorJammed: kotlin.Boolean = COMPILED_CODE, hardwareFailure: kotlin.Boolean = COMPILED_CODE, manualOperation: kotlin.Boolean = COMPILED_CODE, protection: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.WindowCoveringTrait.SafetyStatus { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.WindowCoveringTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.WindowCoveringTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.WindowCoveringTrait.Attributes { /* compiled code */ }
        }

        public abstract val type: com.google.home.matter.standard.WindowCoveringTrait.Type?

        public abstract val physicalClosedLimitLift: kotlin.UShort?

        public abstract val physicalClosedLimitTilt: kotlin.UShort?

        public abstract val currentPositionLift: kotlin.UShort?

        public abstract val currentPositionTilt: kotlin.UShort?

        public abstract val numberOfActuationsLift: kotlin.UShort?

        public abstract val numberOfActuationsTilt: kotlin.UShort?

        public abstract val configStatus: com.google.home.matter.standard.WindowCoveringTrait.ConfigStatus?

        public abstract val currentPositionLiftPercentage: kotlin.UByte?

        public abstract val currentPositionTiltPercentage: kotlin.UByte?

        public abstract val operationalStatus: com.google.home.matter.standard.WindowCoveringTrait.OperationalStatus?

        public abstract val targetPositionLiftPercent100ths: kotlin.UShort?

        public abstract val targetPositionTiltPercent100ths: kotlin.UShort?

        public abstract val endProductType: com.google.home.matter.standard.WindowCoveringTrait.EndProductType?

        public abstract val currentPositionLiftPercent100ths: kotlin.UShort?

        public abstract val currentPositionTiltPercent100ths: kotlin.UShort?

        public abstract val installedOpenLimitLift: kotlin.UShort?

        public abstract val installedClosedLimitLift: kotlin.UShort?

        public abstract val installedOpenLimitTilt: kotlin.UShort?

        public abstract val installedClosedLimitTilt: kotlin.UShort?

        public abstract val mode: com.google.home.matter.standard.WindowCoveringTrait.Mode?

        public abstract val safetyStatus: com.google.home.matter.standard.WindowCoveringTrait.SafetyStatus?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: com.google.home.matter.standard.WindowCoveringTrait.Feature

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(type: com.google.home.matter.standard.WindowCoveringTrait.Type? = COMPILED_CODE, physicalClosedLimitLift: kotlin.UShort? = COMPILED_CODE, physicalClosedLimitTilt: kotlin.UShort? = COMPILED_CODE, currentPositionLift: kotlin.UShort? = COMPILED_CODE, currentPositionTilt: kotlin.UShort? = COMPILED_CODE, numberOfActuationsLift: kotlin.UShort? = COMPILED_CODE, numberOfActuationsTilt: kotlin.UShort? = COMPILED_CODE, configStatus: com.google.home.matter.standard.WindowCoveringTrait.ConfigStatus? = COMPILED_CODE, currentPositionLiftPercentage: kotlin.UByte? = COMPILED_CODE, currentPositionTiltPercentage: kotlin.UByte? = COMPILED_CODE, operationalStatus: com.google.home.matter.standard.WindowCoveringTrait.OperationalStatus? = COMPILED_CODE, targetPositionLiftPercent100ths: kotlin.UShort? = COMPILED_CODE, targetPositionTiltPercent100ths: kotlin.UShort? = COMPILED_CODE, endProductType: com.google.home.matter.standard.WindowCoveringTrait.EndProductType? = COMPILED_CODE, currentPositionLiftPercent100ths: kotlin.UShort? = COMPILED_CODE, currentPositionTiltPercent100ths: kotlin.UShort? = COMPILED_CODE, installedOpenLimitLift: kotlin.UShort? = COMPILED_CODE, installedClosedLimitLift: kotlin.UShort? = COMPILED_CODE, installedOpenLimitTilt: kotlin.UShort? = COMPILED_CODE, installedClosedLimitTilt: kotlin.UShort? = COMPILED_CODE, mode: com.google.home.matter.standard.WindowCoveringTrait.Mode? = COMPILED_CODE, safetyStatus: com.google.home.matter.standard.WindowCoveringTrait.SafetyStatus? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.WindowCoveringTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.matter.standard.WindowCoveringTrait.Attributes, com.google.home.matter.serialization.CanMutate<com.google.home.matter.standard.WindowCoveringTrait.Attributes, com.google.home.matter.standard.WindowCoveringTrait.MutableAttributes> {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.WindowCoveringTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.WindowCoveringTrait.Attributes) { /* compiled code */ }

        public open val type: com.google.home.matter.standard.WindowCoveringTrait.Type? /* compiled code */

        public open val physicalClosedLimitLift: kotlin.UShort? /* compiled code */

        public open val physicalClosedLimitTilt: kotlin.UShort? /* compiled code */

        public open val currentPositionLift: kotlin.UShort? /* compiled code */

        public open val currentPositionTilt: kotlin.UShort? /* compiled code */

        public open val numberOfActuationsLift: kotlin.UShort? /* compiled code */

        public open val numberOfActuationsTilt: kotlin.UShort? /* compiled code */

        public open val configStatus: com.google.home.matter.standard.WindowCoveringTrait.ConfigStatus? /* compiled code */

        public open val currentPositionLiftPercentage: kotlin.UByte? /* compiled code */

        public open val currentPositionTiltPercentage: kotlin.UByte? /* compiled code */

        public open val operationalStatus: com.google.home.matter.standard.WindowCoveringTrait.OperationalStatus? /* compiled code */

        public open val targetPositionLiftPercent100ths: kotlin.UShort? /* compiled code */

        public open val targetPositionTiltPercent100ths: kotlin.UShort? /* compiled code */

        public open val endProductType: com.google.home.matter.standard.WindowCoveringTrait.EndProductType? /* compiled code */

        public open val currentPositionLiftPercent100ths: kotlin.UShort? /* compiled code */

        public open val currentPositionTiltPercent100ths: kotlin.UShort? /* compiled code */

        public open val installedOpenLimitLift: kotlin.UShort? /* compiled code */

        public open val installedClosedLimitLift: kotlin.UShort? /* compiled code */

        public open val installedOpenLimitTilt: kotlin.UShort? /* compiled code */

        public open val installedClosedLimitTilt: kotlin.UShort? /* compiled code */

        public open val mode: com.google.home.matter.standard.WindowCoveringTrait.Mode? /* compiled code */

        public open val safetyStatus: com.google.home.matter.standard.WindowCoveringTrait.SafetyStatus? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: com.google.home.matter.standard.WindowCoveringTrait.Feature /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open fun mutate(init: com.google.home.matter.standard.WindowCoveringTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.WindowCoveringTrait.Attributes { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(type: com.google.home.matter.standard.WindowCoveringTrait.Type? = COMPILED_CODE, physicalClosedLimitLift: kotlin.UShort? = COMPILED_CODE, physicalClosedLimitTilt: kotlin.UShort? = COMPILED_CODE, currentPositionLift: kotlin.UShort? = COMPILED_CODE, currentPositionTilt: kotlin.UShort? = COMPILED_CODE, numberOfActuationsLift: kotlin.UShort? = COMPILED_CODE, numberOfActuationsTilt: kotlin.UShort? = COMPILED_CODE, configStatus: com.google.home.matter.standard.WindowCoveringTrait.ConfigStatus? = COMPILED_CODE, currentPositionLiftPercentage: kotlin.UByte? = COMPILED_CODE, currentPositionTiltPercentage: kotlin.UByte? = COMPILED_CODE, operationalStatus: com.google.home.matter.standard.WindowCoveringTrait.OperationalStatus? = COMPILED_CODE, targetPositionLiftPercent100ths: kotlin.UShort? = COMPILED_CODE, targetPositionTiltPercent100ths: kotlin.UShort? = COMPILED_CODE, endProductType: com.google.home.matter.standard.WindowCoveringTrait.EndProductType? = COMPILED_CODE, currentPositionLiftPercent100ths: kotlin.UShort? = COMPILED_CODE, currentPositionTiltPercent100ths: kotlin.UShort? = COMPILED_CODE, installedOpenLimitLift: kotlin.UShort? = COMPILED_CODE, installedClosedLimitLift: kotlin.UShort? = COMPILED_CODE, installedOpenLimitTilt: kotlin.UShort? = COMPILED_CODE, installedClosedLimitTilt: kotlin.UShort? = COMPILED_CODE, mode: com.google.home.matter.standard.WindowCoveringTrait.Mode? = COMPILED_CODE, safetyStatus: com.google.home.matter.standard.WindowCoveringTrait.SafetyStatus? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.WindowCoveringTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.matter.standard.WindowCoveringTrait.AttributesImpl { /* compiled code */ }
    }

    public final class MutableAttributes public constructor(attributes: com.google.home.matter.standard.WindowCoveringTrait.Attributes) : com.google.home.matter.standard.WindowCoveringTrait.AttributesImpl {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.WindowCoveringTrait.MutableAttributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.WindowCoveringTrait.MutableAttributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.WindowCoveringTrait.MutableAttributes { /* compiled code */ }
        }

        internal final var _mode: com.google.home.matter.standard.WindowCoveringTrait.Mode? /* compiled code */

        public open val mode: com.google.home.matter.standard.WindowCoveringTrait.Mode? /* compiled code */
            public open get

        public final fun setMode(value: com.google.home.matter.standard.WindowCoveringTrait.Mode): kotlin.Unit { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public object UpOrOpenCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final class Request public constructor() {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.WindowCoveringTrait.UpOrOpenCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.WindowCoveringTrait.UpOrOpenCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.WindowCoveringTrait.UpOrOpenCommand.Request { /* compiled code */ }
            }

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.WindowCoveringTrait.UpOrOpenCommand.Request.CommandFields> {
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
        }
    }

    public object DownOrCloseCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final class Request public constructor() {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.WindowCoveringTrait.DownOrCloseCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.WindowCoveringTrait.DownOrCloseCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.WindowCoveringTrait.DownOrCloseCommand.Request { /* compiled code */ }
            }

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.WindowCoveringTrait.DownOrCloseCommand.Request.CommandFields> {
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
        }
    }

    public object StopMotionCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final class Request public constructor() {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.WindowCoveringTrait.StopMotionCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.WindowCoveringTrait.StopMotionCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.WindowCoveringTrait.StopMotionCommand.Request { /* compiled code */ }
            }

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.WindowCoveringTrait.StopMotionCommand.Request.CommandFields> {
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
        }
    }

    public object GoToLiftValueCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(liftValue: kotlin.UShort = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.WindowCoveringTrait.GoToLiftValueCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.WindowCoveringTrait.GoToLiftValueCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.WindowCoveringTrait.GoToLiftValueCommand.Request { /* compiled code */ }
            }

            public final val liftValue: kotlin.UShort /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.WindowCoveringTrait.GoToLiftValueCommand.Request.CommandFields> {
                @androidx.annotation.NonNull liftValue;

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
        }
    }

    public object GoToLiftPercentageCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(liftPercent100thsValue: kotlin.UShort = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.WindowCoveringTrait.GoToLiftPercentageCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.WindowCoveringTrait.GoToLiftPercentageCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.WindowCoveringTrait.GoToLiftPercentageCommand.Request { /* compiled code */ }
            }

            public final val liftPercent100thsValue: kotlin.UShort /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.WindowCoveringTrait.GoToLiftPercentageCommand.Request.CommandFields> {
                @androidx.annotation.NonNull liftPercent100thsValue;

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
        }
    }

    public object GoToTiltValueCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(tiltValue: kotlin.UShort = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.WindowCoveringTrait.GoToTiltValueCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.WindowCoveringTrait.GoToTiltValueCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.WindowCoveringTrait.GoToTiltValueCommand.Request { /* compiled code */ }
            }

            public final val tiltValue: kotlin.UShort /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.WindowCoveringTrait.GoToTiltValueCommand.Request.CommandFields> {
                @androidx.annotation.NonNull tiltValue;

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
        }
    }

    public object GoToTiltPercentageCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(tiltPercent100thsValue: kotlin.UShort = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.WindowCoveringTrait.GoToTiltPercentageCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.WindowCoveringTrait.GoToTiltPercentageCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.WindowCoveringTrait.GoToTiltPercentageCommand.Request { /* compiled code */ }
            }

            public final val tiltPercent100thsValue: kotlin.UShort /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.WindowCoveringTrait.GoToTiltPercentageCommand.Request.CommandFields> {
                @androidx.annotation.NonNull tiltPercent100thsValue;

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
        }
    }
}

