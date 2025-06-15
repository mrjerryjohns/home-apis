// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class RoomAirConditionerDevice public constructor(metadata: com.google.home.DeviceType.Metadata, traitProvider: com.google.home.TraitProvider, eventProvider: com.google.home.HasEvents, googleTraits: com.google.home.matter.standard.RoomAirConditionerDevice.GoogleTraits, standardTraits: com.google.home.matter.standard.RoomAirConditionerDevice.StandardTraits) : com.google.home.DeviceType {
    public companion object : com.google.home.DeviceTypeFactory<com.google.home.matter.standard.RoomAirConditionerDevice> {
        public const final val TYPE_ID: kotlin.String = COMPILED_CODE /* compiled code */

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val metadata: com.google.home.DeviceType.Metadata /* compiled code */

    public final val googleTraits: com.google.home.matter.standard.RoomAirConditionerDevice.GoogleTraits /* compiled code */

    public final val standardTraits: com.google.home.matter.standard.RoomAirConditionerDevice.StandardTraits /* compiled code */

    public open val factory: com.google.home.DeviceTypeFactory<com.google.home.matter.standard.RoomAirConditionerDevice> /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun hashCode(): kotlin.Int { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }

    public final class GoogleTraits public constructor(extendedFanControl: com.google.home.google.ExtendedFanControl?, extendedThermostat: com.google.home.google.ExtendedThermostat?) {
        public final val extendedFanControl: com.google.home.google.ExtendedFanControl? /* compiled code */

        public final val extendedThermostat: com.google.home.google.ExtendedThermostat? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final class StandardTraits public constructor(identify: com.google.home.matter.standard.Identify?, onOff: com.google.home.matter.standard.OnOff?, thermostat: com.google.home.matter.standard.Thermostat?, fanControl: com.google.home.matter.standard.FanControl?, thermostatUserInterfaceConfiguration: com.google.home.matter.standard.ThermostatUserInterfaceConfiguration?, temperatureMeasurement: com.google.home.matter.standard.TemperatureMeasurement?, relativeHumidityMeasurement: com.google.home.matter.standard.RelativeHumidityMeasurement?) {
        public final val identify: com.google.home.matter.standard.Identify? /* compiled code */

        public final val onOff: com.google.home.matter.standard.OnOff? /* compiled code */

        public final val thermostat: com.google.home.matter.standard.Thermostat? /* compiled code */

        public final val fanControl: com.google.home.matter.standard.FanControl? /* compiled code */

        public final val thermostatUserInterfaceConfiguration: com.google.home.matter.standard.ThermostatUserInterfaceConfiguration? /* compiled code */

        public final val temperatureMeasurement: com.google.home.matter.standard.TemperatureMeasurement? /* compiled code */

        public final val relativeHumidityMeasurement: com.google.home.matter.standard.RelativeHumidityMeasurement? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    private object Factory : com.google.home.matter.MatterDeviceTypeFactory<com.google.home.matter.standard.RoomAirConditionerDevice> {
        public open fun createType(traits: kotlin.collections.Map<com.google.home.TraitFactory<*>, com.google.home.Trait?>, metadataBuilder: (kotlin.collections.List<com.google.home.Trait>?) -> com.google.home.DeviceType.Metadata, traitProvider: com.google.home.TraitProvider, eventProvider: com.google.home.HasEvents): com.google.home.matter.standard.RoomAirConditionerDevice { /* compiled code */ }
    }
}
