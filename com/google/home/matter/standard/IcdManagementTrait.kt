// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object IcdManagementTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class ClientTypeEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.IcdManagementTrait.ClientTypeEnum> {
        @androidx.annotation.NonNull Permanent,

        @androidx.annotation.NonNull Ephemeral,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.IcdManagementTrait.ClientTypeEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class OperatingModeEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.IcdManagementTrait.OperatingModeEnum> {
        @androidx.annotation.NonNull SIT,

        @androidx.annotation.NonNull LIT,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.IcdManagementTrait.OperatingModeEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final data class Feature public constructor(checkInProtocolSupport: kotlin.Boolean = COMPILED_CODE, userActiveModeTrigger: kotlin.Boolean = COMPILED_CODE, longIdleTimeSupport: kotlin.Boolean = COMPILED_CODE, dynamicSitLitSupport: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.IcdManagementTrait.Feature> {
            private const final val CHECK_IN_PROTOCOL_SUPPORT_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val USER_ACTIVE_MODE_TRIGGER_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val LONG_IDLE_TIME_SUPPORT_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val DYNAMIC_SIT_LIT_SUPPORT_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.IcdManagementTrait.Feature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.IcdManagementTrait.Feature { /* compiled code */ }
        }

        public final val checkInProtocolSupport: kotlin.Boolean /* compiled code */

        public final val userActiveModeTrigger: kotlin.Boolean /* compiled code */

        public final val longIdleTimeSupport: kotlin.Boolean /* compiled code */

        public final val dynamicSitLitSupport: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(checkInProtocolSupport: kotlin.Boolean = COMPILED_CODE, userActiveModeTrigger: kotlin.Boolean = COMPILED_CODE, longIdleTimeSupport: kotlin.Boolean = COMPILED_CODE, dynamicSitLitSupport: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.IcdManagementTrait.Feature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final data class UserActiveModeTriggerBitmap public constructor(powerCycle: kotlin.Boolean = COMPILED_CODE, settingsMenu: kotlin.Boolean = COMPILED_CODE, customInstruction: kotlin.Boolean = COMPILED_CODE, deviceManual: kotlin.Boolean = COMPILED_CODE, actuateSensor: kotlin.Boolean = COMPILED_CODE, actuateSensorSeconds: kotlin.Boolean = COMPILED_CODE, actuateSensorTimes: kotlin.Boolean = COMPILED_CODE, actuateSensorLightsBlink: kotlin.Boolean = COMPILED_CODE, resetButton: kotlin.Boolean = COMPILED_CODE, resetButtonLightsBlink: kotlin.Boolean = COMPILED_CODE, resetButtonSeconds: kotlin.Boolean = COMPILED_CODE, resetButtonTimes: kotlin.Boolean = COMPILED_CODE, setupButton: kotlin.Boolean = COMPILED_CODE, setupButtonSeconds: kotlin.Boolean = COMPILED_CODE, setupButtonLightsBlink: kotlin.Boolean = COMPILED_CODE, setupButtonTimes: kotlin.Boolean = COMPILED_CODE, appDefinedButton: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.IcdManagementTrait.UserActiveModeTriggerBitmap> {
            private const final val POWER_CYCLE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val SETTINGS_MENU_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val CUSTOM_INSTRUCTION_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val DEVICE_MANUAL_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val ACTUATE_SENSOR_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val ACTUATE_SENSOR_SECONDS_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val ACTUATE_SENSOR_TIMES_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val ACTUATE_SENSOR_LIGHTS_BLINK_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val RESET_BUTTON_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val RESET_BUTTON_LIGHTS_BLINK_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val RESET_BUTTON_SECONDS_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val RESET_BUTTON_TIMES_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val SETUP_BUTTON_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val SETUP_BUTTON_SECONDS_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val SETUP_BUTTON_LIGHTS_BLINK_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val SETUP_BUTTON_TIMES_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val APP_DEFINED_BUTTON_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.IcdManagementTrait.UserActiveModeTriggerBitmap): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.IcdManagementTrait.UserActiveModeTriggerBitmap { /* compiled code */ }
        }

        public final val powerCycle: kotlin.Boolean /* compiled code */

        public final val settingsMenu: kotlin.Boolean /* compiled code */

        public final val customInstruction: kotlin.Boolean /* compiled code */

        public final val deviceManual: kotlin.Boolean /* compiled code */

        public final val actuateSensor: kotlin.Boolean /* compiled code */

        public final val actuateSensorSeconds: kotlin.Boolean /* compiled code */

        public final val actuateSensorTimes: kotlin.Boolean /* compiled code */

        public final val actuateSensorLightsBlink: kotlin.Boolean /* compiled code */

        public final val resetButton: kotlin.Boolean /* compiled code */

        public final val resetButtonLightsBlink: kotlin.Boolean /* compiled code */

        public final val resetButtonSeconds: kotlin.Boolean /* compiled code */

        public final val resetButtonTimes: kotlin.Boolean /* compiled code */

        public final val setupButton: kotlin.Boolean /* compiled code */

        public final val setupButtonSeconds: kotlin.Boolean /* compiled code */

        public final val setupButtonLightsBlink: kotlin.Boolean /* compiled code */

        public final val setupButtonTimes: kotlin.Boolean /* compiled code */

        public final val appDefinedButton: kotlin.Boolean /* compiled code */

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

        public final operator fun component13(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component14(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component15(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component16(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component17(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(powerCycle: kotlin.Boolean = COMPILED_CODE, settingsMenu: kotlin.Boolean = COMPILED_CODE, customInstruction: kotlin.Boolean = COMPILED_CODE, deviceManual: kotlin.Boolean = COMPILED_CODE, actuateSensor: kotlin.Boolean = COMPILED_CODE, actuateSensorSeconds: kotlin.Boolean = COMPILED_CODE, actuateSensorTimes: kotlin.Boolean = COMPILED_CODE, actuateSensorLightsBlink: kotlin.Boolean = COMPILED_CODE, resetButton: kotlin.Boolean = COMPILED_CODE, resetButtonLightsBlink: kotlin.Boolean = COMPILED_CODE, resetButtonSeconds: kotlin.Boolean = COMPILED_CODE, resetButtonTimes: kotlin.Boolean = COMPILED_CODE, setupButton: kotlin.Boolean = COMPILED_CODE, setupButtonSeconds: kotlin.Boolean = COMPILED_CODE, setupButtonLightsBlink: kotlin.Boolean = COMPILED_CODE, setupButtonTimes: kotlin.Boolean = COMPILED_CODE, appDefinedButton: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.IcdManagementTrait.UserActiveModeTriggerBitmap { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final class MonitoringRegistrationStruct public constructor(checkInNodeId: kotlin.ULong = COMPILED_CODE, monitoredSubject: kotlin.ULong = COMPILED_CODE, clientType: com.google.home.matter.standard.IcdManagementTrait.ClientTypeEnum = COMPILED_CODE, fabricIndex: kotlin.UByte = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.IcdManagementTrait.MonitoringRegistrationStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.IcdManagementTrait.MonitoringRegistrationStruct?>.checkInNodeId: com.google.home.automation.TypedExpression<kotlin.ULong> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.IcdManagementTrait.MonitoringRegistrationStruct?>.monitoredSubject: com.google.home.automation.TypedExpression<kotlin.ULong> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.IcdManagementTrait.MonitoringRegistrationStruct?>.clientType: com.google.home.automation.TypedExpression<com.google.home.matter.standard.IcdManagementTrait.ClientTypeEnum> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.IcdManagementTrait.MonitoringRegistrationStruct?>.fabricIndex: com.google.home.automation.TypedExpression<kotlin.UByte> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.IcdManagementTrait.MonitoringRegistrationStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.IcdManagementTrait.MonitoringRegistrationStruct { /* compiled code */ }
        }

        public final val checkInNodeId: kotlin.ULong /* compiled code */

        public final val monitoredSubject: kotlin.ULong /* compiled code */

        public final val clientType: com.google.home.matter.standard.IcdManagementTrait.ClientTypeEnum /* compiled code */

        public final val fabricIndex: kotlin.UByte /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.IcdManagementTrait.MonitoringRegistrationStruct.StructFields> {
            @androidx.annotation.NonNull checkInNodeId,

            @androidx.annotation.NonNull monitoredSubject,

            @androidx.annotation.NonNull clientType,

            @androidx.annotation.NonNull fabricIndex;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.IcdManagementTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.IcdManagementTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.IcdManagementTrait.Attributes { /* compiled code */ }
        }

        public abstract val idleModeDuration: kotlin.UInt?

        public abstract val activeModeDuration: kotlin.UInt?

        public abstract val activeModeThreshold: kotlin.UShort?

        public abstract val registeredClients: kotlin.collections.List<com.google.home.matter.standard.IcdManagementTrait.MonitoringRegistrationStruct>?

        public abstract val icdCounter: kotlin.UInt?

        public abstract val clientsSupportedPerFabric: kotlin.UShort?

        public abstract val userActiveModeTriggerHint: com.google.home.matter.standard.IcdManagementTrait.UserActiveModeTriggerBitmap?

        public abstract val userActiveModeTriggerInstruction: kotlin.String?

        public abstract val operatingMode: com.google.home.matter.standard.IcdManagementTrait.OperatingModeEnum?

        public abstract val maximumCheckInBackOff: kotlin.UInt?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: com.google.home.matter.standard.IcdManagementTrait.Feature

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(idleModeDuration: kotlin.UInt? = COMPILED_CODE, activeModeDuration: kotlin.UInt? = COMPILED_CODE, activeModeThreshold: kotlin.UShort? = COMPILED_CODE, registeredClients: kotlin.collections.List<com.google.home.matter.standard.IcdManagementTrait.MonitoringRegistrationStruct>? = COMPILED_CODE, icdCounter: kotlin.UInt? = COMPILED_CODE, clientsSupportedPerFabric: kotlin.UShort? = COMPILED_CODE, userActiveModeTriggerHint: com.google.home.matter.standard.IcdManagementTrait.UserActiveModeTriggerBitmap? = COMPILED_CODE, userActiveModeTriggerInstruction: kotlin.String? = COMPILED_CODE, operatingMode: com.google.home.matter.standard.IcdManagementTrait.OperatingModeEnum? = COMPILED_CODE, maximumCheckInBackOff: kotlin.UInt? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.IcdManagementTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.matter.standard.IcdManagementTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.IcdManagementTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.IcdManagementTrait.Attributes) { /* compiled code */ }

        public open val idleModeDuration: kotlin.UInt? /* compiled code */

        public open val activeModeDuration: kotlin.UInt? /* compiled code */

        public open val activeModeThreshold: kotlin.UShort? /* compiled code */

        public open val registeredClients: kotlin.collections.List<com.google.home.matter.standard.IcdManagementTrait.MonitoringRegistrationStruct>? /* compiled code */

        public open val icdCounter: kotlin.UInt? /* compiled code */

        public open val clientsSupportedPerFabric: kotlin.UShort? /* compiled code */

        public open val userActiveModeTriggerHint: com.google.home.matter.standard.IcdManagementTrait.UserActiveModeTriggerBitmap? /* compiled code */

        public open val userActiveModeTriggerInstruction: kotlin.String? /* compiled code */

        public open val operatingMode: com.google.home.matter.standard.IcdManagementTrait.OperatingModeEnum? /* compiled code */

        public open val maximumCheckInBackOff: kotlin.UInt? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: com.google.home.matter.standard.IcdManagementTrait.Feature /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(idleModeDuration: kotlin.UInt? = COMPILED_CODE, activeModeDuration: kotlin.UInt? = COMPILED_CODE, activeModeThreshold: kotlin.UShort? = COMPILED_CODE, registeredClients: kotlin.collections.List<com.google.home.matter.standard.IcdManagementTrait.MonitoringRegistrationStruct>? = COMPILED_CODE, icdCounter: kotlin.UInt? = COMPILED_CODE, clientsSupportedPerFabric: kotlin.UShort? = COMPILED_CODE, userActiveModeTriggerHint: com.google.home.matter.standard.IcdManagementTrait.UserActiveModeTriggerBitmap? = COMPILED_CODE, userActiveModeTriggerInstruction: kotlin.String? = COMPILED_CODE, operatingMode: com.google.home.matter.standard.IcdManagementTrait.OperatingModeEnum? = COMPILED_CODE, maximumCheckInBackOff: kotlin.UInt? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.IcdManagementTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.matter.standard.IcdManagementTrait.AttributesImpl { /* compiled code */ }
    }

    public object RegisterClientCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(checkInNodeId: kotlin.ULong = COMPILED_CODE, monitoredSubject: kotlin.ULong = COMPILED_CODE, key: kotlin.ByteArray = COMPILED_CODE, verificationKey: com.google.home.matter.serialization.OptionalValue<kotlin.ByteArray> = COMPILED_CODE, clientType: com.google.home.matter.standard.IcdManagementTrait.ClientTypeEnum = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.IcdManagementTrait.RegisterClientCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.IcdManagementTrait.RegisterClientCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.IcdManagementTrait.RegisterClientCommand.Request { /* compiled code */ }
            }

            public final val checkInNodeId: kotlin.ULong /* compiled code */

            public final val monitoredSubject: kotlin.ULong /* compiled code */

            public final val key: kotlin.ByteArray /* compiled code */

            public final val verificationKey: com.google.home.matter.serialization.OptionalValue<kotlin.ByteArray> /* compiled code */

            public final val clientType: com.google.home.matter.standard.IcdManagementTrait.ClientTypeEnum /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.IcdManagementTrait.RegisterClientCommand.Request.CommandFields> {
                @androidx.annotation.NonNull checkInNodeId,

                @androidx.annotation.NonNull monitoredSubject,

                @androidx.annotation.NonNull key,

                @androidx.annotation.NonNull verificationKey,

                @androidx.annotation.NonNull clientType;

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

        public interface OptionalArgs {
            public abstract var verificationKey: kotlin.ByteArray
        }

        public final class Response public constructor(icdCounter: kotlin.UInt = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.IcdManagementTrait.RegisterClientCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.IcdManagementTrait.RegisterClientCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.IcdManagementTrait.RegisterClientCommand.Response { /* compiled code */ }
            }

            public final val icdCounter: kotlin.UInt /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.IcdManagementTrait.RegisterClientCommand.Response.CommandFields> {
                @androidx.annotation.NonNull icdCounter;

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

    public object UnregisterClientCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(checkInNodeId: kotlin.ULong = COMPILED_CODE, verificationKey: com.google.home.matter.serialization.OptionalValue<kotlin.ByteArray> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.IcdManagementTrait.UnregisterClientCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.IcdManagementTrait.UnregisterClientCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.IcdManagementTrait.UnregisterClientCommand.Request { /* compiled code */ }
            }

            public final val checkInNodeId: kotlin.ULong /* compiled code */

            public final val verificationKey: com.google.home.matter.serialization.OptionalValue<kotlin.ByteArray> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.IcdManagementTrait.UnregisterClientCommand.Request.CommandFields> {
                @androidx.annotation.NonNull checkInNodeId,

                @androidx.annotation.NonNull verificationKey;

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

        public interface OptionalArgs {
            public abstract var verificationKey: kotlin.ByteArray
        }
    }

    public object StayActiveRequestCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(stayActiveDuration: kotlin.UInt = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.IcdManagementTrait.StayActiveRequestCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.IcdManagementTrait.StayActiveRequestCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.IcdManagementTrait.StayActiveRequestCommand.Request { /* compiled code */ }
            }

            public final val stayActiveDuration: kotlin.UInt /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.IcdManagementTrait.StayActiveRequestCommand.Request.CommandFields> {
                @androidx.annotation.NonNull stayActiveDuration;

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

        public final class Response public constructor(promisedActiveDuration: kotlin.UInt = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.IcdManagementTrait.StayActiveRequestCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.IcdManagementTrait.StayActiveRequestCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.IcdManagementTrait.StayActiveRequestCommand.Response { /* compiled code */ }
            }

            public final val promisedActiveDuration: kotlin.UInt /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.IcdManagementTrait.StayActiveRequestCommand.Response.CommandFields> {
                @androidx.annotation.NonNull promisedActiveDuration;

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

