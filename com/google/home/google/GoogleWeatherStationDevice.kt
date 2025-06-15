// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class GoogleWeatherStationDevice public constructor(metadata: com.google.home.DeviceType.Metadata, traitProvider: com.google.home.TraitProvider, eventProvider: com.google.home.HasEvents, googleTraits: com.google.home.google.GoogleWeatherStationDevice.GoogleTraits, standardTraits: com.google.home.google.GoogleWeatherStationDevice.StandardTraits) : com.google.home.DeviceType {
    public companion object : com.google.home.DeviceTypeFactory<com.google.home.google.GoogleWeatherStationDevice> {
        public const final val TYPE_ID: kotlin.String = COMPILED_CODE /* compiled code */

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val metadata: com.google.home.DeviceType.Metadata /* compiled code */

    public final val googleTraits: com.google.home.google.GoogleWeatherStationDevice.GoogleTraits /* compiled code */

    public final val standardTraits: com.google.home.google.GoogleWeatherStationDevice.StandardTraits /* compiled code */

    public open val factory: com.google.home.DeviceTypeFactory<com.google.home.google.GoogleWeatherStationDevice> /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun hashCode(): kotlin.Int { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }

    public final class GoogleTraits public constructor(extendedAirQuality: com.google.home.google.ExtendedAirQuality?, smokeLevelConcentrationMeasurement: com.google.home.google.SmokeLevelConcentrationMeasurement?) {
        public final val extendedAirQuality: com.google.home.google.ExtendedAirQuality? /* compiled code */

        public final val smokeLevelConcentrationMeasurement: com.google.home.google.SmokeLevelConcentrationMeasurement? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final class StandardTraits public constructor(carbonMonoxideConcentrationMeasurement: com.google.home.matter.standard.CarbonMonoxideConcentrationMeasurement?, airQuality: com.google.home.matter.standard.AirQuality?, pressureMeasurement: com.google.home.matter.standard.PressureMeasurement?, carbonDioxideConcentrationMeasurement: com.google.home.matter.standard.CarbonDioxideConcentrationMeasurement?, totalVolatileOrganicCompoundsConcentrationMeasurement: com.google.home.matter.standard.TotalVolatileOrganicCompoundsConcentrationMeasurement?, pm25ConcentrationMeasurement: com.google.home.matter.standard.Pm25ConcentrationMeasurement?, pm10ConcentrationMeasurement: com.google.home.matter.standard.Pm10ConcentrationMeasurement?, temperatureMeasurement: com.google.home.matter.standard.TemperatureMeasurement?) {
        public final val carbonMonoxideConcentrationMeasurement: com.google.home.matter.standard.CarbonMonoxideConcentrationMeasurement? /* compiled code */

        public final val airQuality: com.google.home.matter.standard.AirQuality? /* compiled code */

        public final val pressureMeasurement: com.google.home.matter.standard.PressureMeasurement? /* compiled code */

        public final val carbonDioxideConcentrationMeasurement: com.google.home.matter.standard.CarbonDioxideConcentrationMeasurement? /* compiled code */

        public final val totalVolatileOrganicCompoundsConcentrationMeasurement: com.google.home.matter.standard.TotalVolatileOrganicCompoundsConcentrationMeasurement? /* compiled code */

        public final val pm25ConcentrationMeasurement: com.google.home.matter.standard.Pm25ConcentrationMeasurement? /* compiled code */

        public final val pm10ConcentrationMeasurement: com.google.home.matter.standard.Pm10ConcentrationMeasurement? /* compiled code */

        public final val temperatureMeasurement: com.google.home.matter.standard.TemperatureMeasurement? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    private object Factory : com.google.home.matter.MatterDeviceTypeFactory<com.google.home.google.GoogleWeatherStationDevice> {
        public open fun createType(traits: kotlin.collections.Map<com.google.home.TraitFactory<*>, com.google.home.Trait?>, metadataBuilder: (kotlin.collections.List<com.google.home.Trait>?) -> com.google.home.DeviceType.Metadata, traitProvider: com.google.home.TraitProvider, eventProvider: com.google.home.HasEvents): com.google.home.google.GoogleWeatherStationDevice { /* compiled code */ }
    }
}

