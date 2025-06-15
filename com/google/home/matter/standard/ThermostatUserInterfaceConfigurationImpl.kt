// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class ThermostatUserInterfaceConfigurationImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.Attributes) : com.google.home.matter.standard.ThermostatUserInterfaceConfiguration, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.Attributes, com.google.home.Updatable<com.google.home.matter.standard.ThermostatUserInterfaceConfiguration, com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.MutableAttributes> {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val featureMap: kotlin.UInt /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val keypadLockout: com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.KeypadLockoutEnum? /* compiled code */

    public open val scheduleProgrammingVisibility: com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.ScheduleProgrammingVisibilityEnum? /* compiled code */

    public open val temperatureDisplayMode: com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.TemperatureDisplayModeEnum? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.ThermostatUserInterfaceConfiguration.Attribute): kotlin.Boolean { /* compiled code */ }

    public open suspend fun update(optimisticReturn: (com.google.home.matter.standard.ThermostatUserInterfaceConfiguration) -> kotlin.Unit, init: com.google.home.matter.standard.ThermostatUserInterfaceConfigurationTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.ThermostatUserInterfaceConfiguration { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}
