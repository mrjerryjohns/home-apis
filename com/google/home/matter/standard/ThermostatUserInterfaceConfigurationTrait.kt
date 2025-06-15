// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object ThermostatUserInterfaceConfigurationTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class KeypadLockoutEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.KeypadLockoutEnum> {
        @androidx.annotation.NonNull NoLockout,

        @androidx.annotation.NonNull Lockout1,

        @androidx.annotation.NonNull Lockout2,

        @androidx.annotation.NonNull Lockout3,

        @androidx.annotation.NonNull Lockout4,

        @androidx.annotation.NonNull Lockout5,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.KeypadLockoutEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class ScheduleProgrammingVisibilityEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.ScheduleProgrammingVisibilityEnum> {
        @androidx.annotation.NonNull ScheduleProgrammingPermitted,

        @androidx.annotation.NonNull ScheduleProgrammingDenied,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.ScheduleProgrammingVisibilityEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class TemperatureDisplayModeEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.TemperatureDisplayModeEnum> {
        @androidx.annotation.NonNull Celsius,

        @androidx.annotation.NonNull Fahrenheit,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.TemperatureDisplayModeEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.Attributes { /* compiled code */ }
        }

        public abstract val temperatureDisplayMode: com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.TemperatureDisplayModeEnum?

        public abstract val keypadLockout: com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.KeypadLockoutEnum?

        public abstract val scheduleProgrammingVisibility: com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.ScheduleProgrammingVisibilityEnum?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: kotlin.UInt

        public abstract val clusterRevision: kotlin.UShort
    }

        public open class AttributesImpl public constructor(temperatureDisplayMode: com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.TemperatureDisplayModeEnum? = COMPILED_CODE, keypadLockout: com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.KeypadLockoutEnum? = COMPILED_CODE, scheduleProgrammingVisibility: com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.ScheduleProgrammingVisibilityEnum? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) :
        com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.Attributes, com.google.home.matter.serialization.CanMutate<com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.Attributes, com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.MutableAttributes> {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.Attributes) { /* compiled code */ }

        public open val temperatureDisplayMode: com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.TemperatureDisplayModeEnum? /* compiled code */

        public open val keypadLockout: com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.KeypadLockoutEnum? /* compiled code */

        public open val scheduleProgrammingVisibility: com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.ScheduleProgrammingVisibilityEnum? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: kotlin.UInt /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open fun mutate(init: com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.Attributes { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

                public final fun copy(temperatureDisplayMode: com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.TemperatureDisplayModeEnum? = COMPILED_CODE, keypadLockout: com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.KeypadLockoutEnum? = COMPILED_CODE, scheduleProgrammingVisibility: com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.ScheduleProgrammingVisibilityEnum? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE):
            com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.AttributesImpl { /* compiled code */ }
    }

    public final class MutableAttributes public constructor(attributes: com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.Attributes) : com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.AttributesImpl {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.MutableAttributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.MutableAttributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.MutableAttributes { /* compiled code */ }
        }

        internal final var _temperatureDisplayMode: com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.TemperatureDisplayModeEnum? /* compiled code */

        public open val temperatureDisplayMode: com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.TemperatureDisplayModeEnum? /* compiled code */
            public open get

        internal final var _keypadLockout: com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.KeypadLockoutEnum? /* compiled code */

        public open val keypadLockout: com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.KeypadLockoutEnum? /* compiled code */
            public open get

        internal final var _scheduleProgrammingVisibility: com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.ScheduleProgrammingVisibilityEnum? /* compiled code */

        public open val scheduleProgrammingVisibility: com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.ScheduleProgrammingVisibilityEnum? /* compiled code */
            public open get

        public final fun setTemperatureDisplayMode(value: com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.TemperatureDisplayModeEnum): kotlin.Unit { /* compiled code */ }

        public final fun setKeypadLockout(value: com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.KeypadLockoutEnum): kotlin.Unit { /* compiled code */ }

        public final fun setScheduleProgrammingVisibility(value: com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.ScheduleProgrammingVisibilityEnum): kotlin.Unit { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }
}
