// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class GoogleGardenDevice public constructor(metadata: com.google.home.DeviceType.Metadata, traitProvider: com.google.home.TraitProvider, eventProvider: com.google.home.HasEvents, googleTraits: com.google.home.google.GoogleGardenDevice.GoogleTraits, standardTraits: com.google.home.google.GoogleGardenDevice.StandardTraits) : com.google.home.DeviceType {
    public companion object : com.google.home.DeviceTypeFactory<com.google.home.google.GoogleGardenDevice> {
        public const final val TYPE_ID: kotlin.String = COMPILED_CODE /* compiled code */

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val metadata: com.google.home.DeviceType.Metadata /* compiled code */

    public final val googleTraits: com.google.home.google.GoogleGardenDevice.GoogleTraits /* compiled code */

    public final val standardTraits: com.google.home.google.GoogleGardenDevice.StandardTraits /* compiled code */

    public open val factory: com.google.home.DeviceTypeFactory<com.google.home.google.GoogleGardenDevice> /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun hashCode(): kotlin.Int { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }

    public final class GoogleTraits public constructor(leafWetnessMeasurement: com.google.home.google.LeafWetnessMeasurement?, soilMoistureMeasurement: com.google.home.google.SoilMoistureMeasurement?, extendedTemperatureControl: com.google.home.google.ExtendedTemperatureControl?, relativeHumidityControl: com.google.home.google.RelativeHumidityControl?) {
        public final val leafWetnessMeasurement: com.google.home.google.LeafWetnessMeasurement? /* compiled code */

        public final val soilMoistureMeasurement: com.google.home.google.SoilMoistureMeasurement? /* compiled code */

        public final val extendedTemperatureControl: com.google.home.google.ExtendedTemperatureControl? /* compiled code */

        public final val relativeHumidityControl: com.google.home.google.RelativeHumidityControl? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final class StandardTraits public constructor(illuminanceMeasurement: com.google.home.matter.standard.IlluminanceMeasurement?, temperatureControl: com.google.home.matter.standard.TemperatureControl?, temperatureMeasurement: com.google.home.matter.standard.TemperatureMeasurement?, relativeHumidityMeasurement: com.google.home.matter.standard.RelativeHumidityMeasurement?) {
        public final val illuminanceMeasurement: com.google.home.matter.standard.IlluminanceMeasurement? /* compiled code */

        public final val temperatureControl: com.google.home.matter.standard.TemperatureControl? /* compiled code */

        public final val temperatureMeasurement: com.google.home.matter.standard.TemperatureMeasurement? /* compiled code */

        public final val relativeHumidityMeasurement: com.google.home.matter.standard.RelativeHumidityMeasurement? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    private object Factory : com.google.home.matter.MatterDeviceTypeFactory<com.google.home.google.GoogleGardenDevice> {
        public open fun createType(traits: kotlin.collections.Map<com.google.home.TraitFactory<*>, com.google.home.Trait?>, metadataBuilder: (kotlin.collections.List<com.google.home.Trait>?) -> com.google.home.DeviceType.Metadata, traitProvider: com.google.home.TraitProvider, eventProvider: com.google.home.HasEvents): com.google.home.google.GoogleGardenDevice { /* compiled code */ }
    }
}

