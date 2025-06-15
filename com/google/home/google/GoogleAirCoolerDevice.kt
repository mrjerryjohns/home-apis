// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class GoogleAirCoolerDevice public constructor(metadata: com.google.home.DeviceType.Metadata, traitProvider: com.google.home.TraitProvider, eventProvider: com.google.home.HasEvents, googleTraits: com.google.home.google.GoogleAirCoolerDevice.GoogleTraits, standardTraits: com.google.home.google.GoogleAirCoolerDevice.StandardTraits) : com.google.home.DeviceType {
    public companion object : com.google.home.DeviceTypeFactory<com.google.home.google.GoogleAirCoolerDevice> {
        public const final val TYPE_ID: kotlin.String = COMPILED_CODE /* compiled code */

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val metadata: com.google.home.DeviceType.Metadata /* compiled code */

    public final val googleTraits: com.google.home.google.GoogleAirCoolerDevice.GoogleTraits /* compiled code */

    public final val standardTraits: com.google.home.google.GoogleAirCoolerDevice.StandardTraits /* compiled code */

    public open val factory: com.google.home.DeviceTypeFactory<com.google.home.google.GoogleAirCoolerDevice> /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun hashCode(): kotlin.Int { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }

    public final class GoogleTraits public constructor(extendedFanControl: com.google.home.google.ExtendedFanControl?, relativeHumidityControl: com.google.home.google.RelativeHumidityControl?, extendedThermostat: com.google.home.google.ExtendedThermostat?) {
        public final val extendedFanControl: com.google.home.google.ExtendedFanControl? /* compiled code */

        public final val relativeHumidityControl: com.google.home.google.RelativeHumidityControl? /* compiled code */

        public final val extendedThermostat: com.google.home.google.ExtendedThermostat? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final class StandardTraits public constructor(onOff: com.google.home.matter.standard.OnOff?, fanControl: com.google.home.matter.standard.FanControl?, relativeHumidityMeasurement: com.google.home.matter.standard.RelativeHumidityMeasurement?, temperatureMeasurement: com.google.home.matter.standard.TemperatureMeasurement?, thermostat: com.google.home.matter.standard.Thermostat?, thermostatUserInterfaceConfiguration: com.google.home.matter.standard.ThermostatUserInterfaceConfiguration?) {
        public final val onOff: com.google.home.matter.standard.OnOff? /* compiled code */

        public final val fanControl: com.google.home.matter.standard.FanControl? /* compiled code */

        public final val relativeHumidityMeasurement: com.google.home.matter.standard.RelativeHumidityMeasurement? /* compiled code */

        public final val temperatureMeasurement: com.google.home.matter.standard.TemperatureMeasurement? /* compiled code */

        public final val thermostat: com.google.home.matter.standard.Thermostat? /* compiled code */

        public final val thermostatUserInterfaceConfiguration: com.google.home.matter.standard.ThermostatUserInterfaceConfiguration? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    private object Factory : com.google.home.matter.MatterDeviceTypeFactory<com.google.home.google.GoogleAirCoolerDevice> {
        public open fun createType(traits: kotlin.collections.Map<com.google.home.TraitFactory<*>, com.google.home.Trait?>, metadataBuilder: (kotlin.collections.List<com.google.home.Trait>?) -> com.google.home.DeviceType.Metadata, traitProvider: com.google.home.TraitProvider, eventProvider: com.google.home.HasEvents): com.google.home.google.GoogleAirCoolerDevice { /* compiled code */ }
    }
}
