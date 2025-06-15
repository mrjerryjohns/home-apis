// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface ThermostatUserInterfaceConfiguration : com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.Attributes, com.google.home.matter.MatterTrait, com.google.home.Updatable<com.google.home.matter.standard.ThermostatUserInterfaceConfiguration, com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.MutableAttributes> {
    public companion object : com.google.home.TraitFactory<com.google.home.matter.standard.ThermostatUserInterfaceConfiguration> {
        public final val temperatureDisplayMode: com.google.home.automation.Attribute<com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.TemperatureDisplayModeEnum?> /* compiled code */
            public final get

        public final val keypadLockout: com.google.home.automation.Attribute<com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.KeypadLockoutEnum?> /* compiled code */
            public final get

        public final val scheduleProgrammingVisibility: com.google.home.automation.Attribute<com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.ScheduleProgrammingVisibilityEnum?> /* compiled code */
            public final get

        public final val generatedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val acceptedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val attributeList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val featureMap: com.google.home.automation.Attribute<kotlin.UInt> /* compiled code */
            public final get

        public final val clusterRevision: com.google.home.automation.Attribute<kotlin.UShort> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThermostatUserInterfaceConfiguration?>.temperatureDisplayMode: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.TemperatureDisplayModeEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThermostatUserInterfaceConfiguration?>.keypadLockout: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.KeypadLockoutEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThermostatUserInterfaceConfiguration?>.scheduleProgrammingVisibility: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.ScheduleProgrammingVisibilityEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThermostatUserInterfaceConfiguration?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThermostatUserInterfaceConfiguration?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThermostatUserInterfaceConfiguration?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThermostatUserInterfaceConfiguration?>.featureMap: com.google.home.automation.TypedExpression<kotlin.UInt> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ThermostatUserInterfaceConfiguration?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.ThermostatUserInterfaceConfiguration>.setTemperatureDisplayMode(value: com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.TemperatureDisplayModeEnum): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.ThermostatUserInterfaceConfiguration>.setKeypadLockout(value: com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.KeypadLockoutEnum): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.ThermostatUserInterfaceConfiguration>.setScheduleProgrammingVisibility(value: com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.ScheduleProgrammingVisibilityEnum): kotlin.Unit { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.matter.standard.ThermostatUserInterfaceConfiguration> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.matter.standard.ThermostatUserInterfaceConfiguration.Attribute): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ThermostatUserInterfaceConfiguration.Attribute> {
        @androidx.annotation.NonNull temperatureDisplayMode,

        @androidx.annotation.NonNull keypadLockout,

        @androidx.annotation.NonNull scheduleProgrammingVisibility,

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
}
