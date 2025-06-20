// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class EnergyEvseDevice public constructor(metadata: com.google.home.DeviceType.Metadata, traitProvider: com.google.home.TraitProvider, eventProvider: com.google.home.HasEvents, googleTraits: com.google.home.matter.standard.EnergyEvseDevice.GoogleTraits, standardTraits: com.google.home.matter.standard.EnergyEvseDevice.StandardTraits) : com.google.home.DeviceType {
    public companion object : com.google.home.DeviceTypeFactory<com.google.home.matter.standard.EnergyEvseDevice> {
        public const final val TYPE_ID: kotlin.String = COMPILED_CODE /* compiled code */

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val metadata: com.google.home.DeviceType.Metadata /* compiled code */

    public final val googleTraits: com.google.home.matter.standard.EnergyEvseDevice.GoogleTraits /* compiled code */

    public final val standardTraits: com.google.home.matter.standard.EnergyEvseDevice.StandardTraits /* compiled code */

    public open val factory: com.google.home.DeviceTypeFactory<com.google.home.matter.standard.EnergyEvseDevice> /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun hashCode(): kotlin.Int { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }

    public final class GoogleTraits public constructor(extendedModeSelect: com.google.home.google.ExtendedModeSelect?, extendedPowerSource: com.google.home.google.ExtendedPowerSource?) {
        public final val extendedModeSelect: com.google.home.google.ExtendedModeSelect? /* compiled code */

        public final val extendedPowerSource: com.google.home.google.ExtendedPowerSource? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final class StandardTraits public constructor(energyEvse: com.google.home.matter.standard.EnergyEvse?, energyEvseMode: com.google.home.matter.standard.EnergyEvseMode?, identify: com.google.home.matter.standard.Identify?, temperatureMeasurement: com.google.home.matter.standard.TemperatureMeasurement?) {
        public final val energyEvse: com.google.home.matter.standard.EnergyEvse? /* compiled code */

        public final val energyEvseMode: com.google.home.matter.standard.EnergyEvseMode? /* compiled code */

        public final val identify: com.google.home.matter.standard.Identify? /* compiled code */

        public final val temperatureMeasurement: com.google.home.matter.standard.TemperatureMeasurement? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    private object Factory : com.google.home.matter.MatterDeviceTypeFactory<com.google.home.matter.standard.EnergyEvseDevice> {
        public open fun createType(traits: kotlin.collections.Map<com.google.home.TraitFactory<*>, com.google.home.Trait?>, metadataBuilder: (kotlin.collections.List<com.google.home.Trait>?) -> com.google.home.DeviceType.Metadata, traitProvider: com.google.home.TraitProvider, eventProvider: com.google.home.HasEvents): com.google.home.matter.standard.EnergyEvseDevice { /* compiled code */ }
    }
}
