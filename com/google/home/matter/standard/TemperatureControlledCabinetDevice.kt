// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class TemperatureControlledCabinetDevice public constructor(metadata: com.google.home.DeviceType.Metadata, traitProvider: com.google.home.TraitProvider, eventProvider: com.google.home.HasEvents, googleTraits: com.google.home.matter.standard.TemperatureControlledCabinetDevice.GoogleTraits, standardTraits: com.google.home.matter.standard.TemperatureControlledCabinetDevice.StandardTraits) : com.google.home.DeviceType {
    public companion object : com.google.home.DeviceTypeFactory<com.google.home.matter.standard.TemperatureControlledCabinetDevice> {
        public const final val TYPE_ID: kotlin.String = COMPILED_CODE /* compiled code */

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val metadata: com.google.home.DeviceType.Metadata /* compiled code */

    public final val googleTraits: com.google.home.matter.standard.TemperatureControlledCabinetDevice.GoogleTraits /* compiled code */

    public final val standardTraits: com.google.home.matter.standard.TemperatureControlledCabinetDevice.StandardTraits /* compiled code */

    public open val factory: com.google.home.DeviceTypeFactory<com.google.home.matter.standard.TemperatureControlledCabinetDevice> /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun hashCode(): kotlin.Int { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }

    public final class GoogleTraits public constructor(extendedOperationalState: com.google.home.google.ExtendedOperationalState?, extendedModeSelect: com.google.home.google.ExtendedModeSelect?) {
        public final val extendedOperationalState: com.google.home.google.ExtendedOperationalState? /* compiled code */

        public final val extendedModeSelect: com.google.home.google.ExtendedModeSelect? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final class StandardTraits public constructor(temperatureControl: com.google.home.matter.standard.TemperatureControl?, ovenCavityOperationalState: com.google.home.matter.standard.OvenCavityOperationalState?, ovenMode: com.google.home.matter.standard.OvenMode?, refrigeratorAndTemperatureControlledCabinetMode: com.google.home.matter.standard.RefrigeratorAndTemperatureControlledCabinetMode?, temperatureMeasurement: com.google.home.matter.standard.TemperatureMeasurement?) {
        public final val temperatureControl: com.google.home.matter.standard.TemperatureControl? /* compiled code */

        public final val ovenCavityOperationalState: com.google.home.matter.standard.OvenCavityOperationalState? /* compiled code */

        public final val ovenMode: com.google.home.matter.standard.OvenMode? /* compiled code */

        public final val refrigeratorAndTemperatureControlledCabinetMode: com.google.home.matter.standard.RefrigeratorAndTemperatureControlledCabinetMode? /* compiled code */

        public final val temperatureMeasurement: com.google.home.matter.standard.TemperatureMeasurement? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    private object Factory : com.google.home.matter.MatterDeviceTypeFactory<com.google.home.matter.standard.TemperatureControlledCabinetDevice> {
        public open fun createType(traits: kotlin.collections.Map<com.google.home.TraitFactory<*>, com.google.home.Trait?>, metadataBuilder: (kotlin.collections.List<com.google.home.Trait>?) -> com.google.home.DeviceType.Metadata, traitProvider: com.google.home.TraitProvider, eventProvider: com.google.home.HasEvents): com.google.home.matter.standard.TemperatureControlledCabinetDevice { /* compiled code */ }
    }
}
