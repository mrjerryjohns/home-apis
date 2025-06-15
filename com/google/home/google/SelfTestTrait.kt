// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public object SelfTestTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class SelfTestStatus private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.SelfTestTrait.SelfTestStatus> {
        @androidx.annotation.NonNull Unknown,

        @androidx.annotation.NonNull InProgress,

        @androidx.annotation.NonNull Completed,

        @androidx.annotation.NonNull Canceled,

        @androidx.annotation.NonNull Failed,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.SelfTestTrait.SelfTestStatus> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class ErrorCode private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.SelfTestTrait.ErrorCode> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull SmokeSensorFault,

        @androidx.annotation.NonNull CoSensorFault,

        @androidx.annotation.NonNull TempSensorFault,

        @androidx.annotation.NonNull HumiditySensorFault,

        @androidx.annotation.NonNull AmbientLightSensorFault,

        @androidx.annotation.NonNull PassiveInfraredSensorFault,

        @androidx.annotation.NonNull AudioSpeakerFault,

        @androidx.annotation.NonNull Expired,

        @androidx.annotation.NonNull ExpiringSoon,

        @androidx.annotation.NonNull LowBattery,

        @androidx.annotation.NonNull VeryLowBattery,

        @androidx.annotation.NonNull LossOfWifi,

        @androidx.annotation.NonNull LedFault,

        @androidx.annotation.NonNull LossOfPower,

        @androidx.annotation.NonNull Offline,

        @androidx.annotation.NonNull Buzzer,

        @androidx.annotation.NonNull HardwareFault,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.SelfTestTrait.ErrorCode> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public interface StructureSelfTest {
        public abstract val priority: kotlin.UInt?

        public abstract val triggeredDeviceId: kotlin.String?

        public abstract val manualTest: com.google.home.google.SelfTestTrait.Test?

        public abstract val audioTest: com.google.home.google.SelfTestTrait.Test?

        public abstract val errorCode: kotlin.String?
    }

    public final class StructureSelfTestImpl public constructor(priority: kotlin.UInt? = COMPILED_CODE, triggeredDeviceId: kotlin.String? = COMPILED_CODE, manualTest: com.google.home.google.SelfTestTrait.Test? = COMPILED_CODE, audioTest: com.google.home.google.SelfTestTrait.Test? = COMPILED_CODE, errorCode: kotlin.String? = COMPILED_CODE) : com.google.home.google.SelfTestTrait.StructureSelfTest {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.SelfTestTrait.StructureSelfTest> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.SelfTestTrait.StructureSelfTest): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.SelfTestTrait.StructureSelfTest { /* compiled code */ }
        }

        public open val priority: kotlin.UInt? /* compiled code */

        public open val triggeredDeviceId: kotlin.String? /* compiled code */

        public open val manualTest: com.google.home.google.SelfTestTrait.Test? /* compiled code */

        public open val audioTest: com.google.home.google.SelfTestTrait.Test? /* compiled code */

        public open val errorCode: kotlin.String? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final class Test public constructor(status: com.google.home.google.SelfTestTrait.SelfTestStatus = COMPILED_CODE, startTimeSeconds: kotlin.Long = COMPILED_CODE, endTimeSeconds: kotlin.Long = COMPILED_CODE, testDeviceIds: kotlin.collections.List<kotlin.String> = COMPILED_CODE, lastSuccessfulTestTimeSeconds: kotlin.Long = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.SelfTestTrait.Test>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.SelfTestTrait.Test?>.status: com.google.home.automation.TypedExpression<com.google.home.google.SelfTestTrait.SelfTestStatus> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.SelfTestTrait.Test?>.startTimeSeconds: com.google.home.automation.TypedExpression<kotlin.Long> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.SelfTestTrait.Test?>.endTimeSeconds: com.google.home.automation.TypedExpression<kotlin.Long> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.SelfTestTrait.Test?>.testDeviceIds: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.String>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.SelfTestTrait.Test?>.lastSuccessfulTestTimeSeconds: com.google.home.automation.TypedExpression<kotlin.Long> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.SelfTestTrait.Test): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.SelfTestTrait.Test { /* compiled code */ }
        }

        public final val status: com.google.home.google.SelfTestTrait.SelfTestStatus /* compiled code */

        public final val startTimeSeconds: kotlin.Long /* compiled code */

        public final val endTimeSeconds: kotlin.Long /* compiled code */

        public final val testDeviceIds: kotlin.collections.List<kotlin.String> /* compiled code */

        public final val lastSuccessfulTestTimeSeconds: kotlin.Long /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.SelfTestTrait.Test.StructFields> {
            @androidx.annotation.NonNull status,

            @androidx.annotation.NonNull startTimeSeconds,

            @androidx.annotation.NonNull endTimeSeconds,

            @androidx.annotation.NonNull testDeviceIds,

            @androidx.annotation.NonNull lastSuccessfulTestTimeSeconds;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class DeviceStatus public constructor(deviceId: kotlin.String = COMPILED_CODE, errorCode: com.google.home.google.SelfTestTrait.ErrorCode = COMPILED_CODE, spokenWhere: kotlin.String = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.SelfTestTrait.DeviceStatus>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.SelfTestTrait.DeviceStatus?>.deviceId: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.SelfTestTrait.DeviceStatus?>.errorCode: com.google.home.automation.TypedExpression<com.google.home.google.SelfTestTrait.ErrorCode> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.SelfTestTrait.DeviceStatus?>.spokenWhere: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.SelfTestTrait.DeviceStatus): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.SelfTestTrait.DeviceStatus { /* compiled code */ }
        }

        public final val deviceId: kotlin.String /* compiled code */

        public final val errorCode: com.google.home.google.SelfTestTrait.ErrorCode /* compiled code */

        public final val spokenWhere: kotlin.String /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.SelfTestTrait.DeviceStatus.StructFields> {
            @androidx.annotation.NonNull deviceId,

            @androidx.annotation.NonNull errorCode,

            @androidx.annotation.NonNull spokenWhere;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.SelfTestTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.SelfTestTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.SelfTestTrait.Attributes { /* compiled code */ }
        }

        public abstract val manualTest: com.google.home.google.SelfTestTrait.Test?

        public abstract val audioTest: com.google.home.google.SelfTestTrait.Test?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: kotlin.UInt

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(manualTest: com.google.home.google.SelfTestTrait.Test? = COMPILED_CODE, audioTest: com.google.home.google.SelfTestTrait.Test? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.google.SelfTestTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.google.SelfTestTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.google.SelfTestTrait.Attributes) { /* compiled code */ }

        public open val manualTest: com.google.home.google.SelfTestTrait.Test? /* compiled code */

        public open val audioTest: com.google.home.google.SelfTestTrait.Test? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: kotlin.UInt /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(manualTest: com.google.home.google.SelfTestTrait.Test? = COMPILED_CODE, audioTest: com.google.home.google.SelfTestTrait.Test? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.google.SelfTestTrait.AttributesImpl { /* compiled code */ }
    }

    public object UpdateStructureSelfTestStatusCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(manualTest: com.google.home.google.SelfTestTrait.Test = COMPILED_CODE, audioTest: com.google.home.google.SelfTestTrait.Test = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.SelfTestTrait.UpdateStructureSelfTestStatusCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.SelfTestTrait.UpdateStructureSelfTestStatusCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.SelfTestTrait.UpdateStructureSelfTestStatusCommand.Request { /* compiled code */ }
            }

            public final val manualTest: com.google.home.google.SelfTestTrait.Test /* compiled code */

            public final val audioTest: com.google.home.google.SelfTestTrait.Test /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.SelfTestTrait.UpdateStructureSelfTestStatusCommand.Request.CommandFields> {
                @androidx.annotation.NonNull manualTest,

                @androidx.annotation.NonNull audioTest;

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

    public object SetExecutionSummaryCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(warningDevices: kotlin.collections.List<com.google.home.google.SelfTestTrait.DeviceStatus> = COMPILED_CODE, criticalDevices: kotlin.collections.List<com.google.home.google.SelfTestTrait.DeviceStatus> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.SelfTestTrait.SetExecutionSummaryCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.SelfTestTrait.SetExecutionSummaryCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.SelfTestTrait.SetExecutionSummaryCommand.Request { /* compiled code */ }
            }

            public final val warningDevices: kotlin.collections.List<com.google.home.google.SelfTestTrait.DeviceStatus> /* compiled code */

            public final val criticalDevices: kotlin.collections.List<com.google.home.google.SelfTestTrait.DeviceStatus> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.SelfTestTrait.SetExecutionSummaryCommand.Request.CommandFields> {
                @androidx.annotation.NonNull warningDevices,

                @androidx.annotation.NonNull criticalDevices;

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
