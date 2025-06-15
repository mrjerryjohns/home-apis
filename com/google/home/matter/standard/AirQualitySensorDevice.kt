// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class AirQualitySensorDevice public constructor(metadata: com.google.home.DeviceType.Metadata, traitProvider: com.google.home.TraitProvider, eventProvider: com.google.home.HasEvents, standardTraits: com.google.home.matter.standard.AirQualitySensorDevice.StandardTraits) : com.google.home.DeviceType {
    public companion object : com.google.home.DeviceTypeFactory<com.google.home.matter.standard.AirQualitySensorDevice> {
        public const final val TYPE_ID: kotlin.String = COMPILED_CODE /* compiled code */

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val metadata: com.google.home.DeviceType.Metadata /* compiled code */

    public final val standardTraits: com.google.home.matter.standard.AirQualitySensorDevice.StandardTraits /* compiled code */

    public open val factory: com.google.home.DeviceTypeFactory<com.google.home.matter.standard.AirQualitySensorDevice> /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun hashCode(): kotlin.Int { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }

        public final class StandardTraits public constructor(identify: com.google.home.matter.standard.Identify?, airQuality: com.google.home.matter.standard.AirQuality?, temperatureMeasurement: com.google.home.matter.standard.TemperatureMeasurement?, relativeHumidityMeasurement: com.google.home.matter.standard.RelativeHumidityMeasurement?, carbonMonoxideConcentrationMeasurement: com.google.home.matter.standard.CarbonMonoxideConcentrationMeasurement?, carbonDioxideConcentrationMeasurement: com.google.home.matter.standard.CarbonDioxideConcentrationMeasurement?, nitrogenDioxideConcentrationMeasurement: com.google.home.matter.standard.NitrogenDioxideConcentrationMeasurement?, ozoneConcentrationMeasurement: com.google.home.matter.standard.OzoneConcentrationMeasurement?,
        pm25ConcentrationMeasurement: com.google.home.matter.standard.Pm25ConcentrationMeasurement?, formaldehydeConcentrationMeasurement: com.google.home.matter.standard.FormaldehydeConcentrationMeasurement?, pm1ConcentrationMeasurement: com.google.home.matter.standard.Pm1ConcentrationMeasurement?, pm10ConcentrationMeasurement: com.google.home.matter.standard.Pm10ConcentrationMeasurement?, totalVolatileOrganicCompoundsConcentrationMeasurement: com.google.home.matter.standard.TotalVolatileOrganicCompoundsConcentrationMeasurement?, radonConcentrationMeasurement: com.google.home.matter.standard.RadonConcentrationMeasurement?) {
        public final val identify: com.google.home.matter.standard.Identify? /* compiled code */

        public final val airQuality: com.google.home.matter.standard.AirQuality? /* compiled code */

        public final val temperatureMeasurement: com.google.home.matter.standard.TemperatureMeasurement? /* compiled code */

        public final val relativeHumidityMeasurement: com.google.home.matter.standard.RelativeHumidityMeasurement? /* compiled code */

        public final val carbonMonoxideConcentrationMeasurement: com.google.home.matter.standard.CarbonMonoxideConcentrationMeasurement? /* compiled code */

        public final val carbonDioxideConcentrationMeasurement: com.google.home.matter.standard.CarbonDioxideConcentrationMeasurement? /* compiled code */

        public final val nitrogenDioxideConcentrationMeasurement: com.google.home.matter.standard.NitrogenDioxideConcentrationMeasurement? /* compiled code */

        public final val ozoneConcentrationMeasurement: com.google.home.matter.standard.OzoneConcentrationMeasurement? /* compiled code */

        public final val pm25ConcentrationMeasurement: com.google.home.matter.standard.Pm25ConcentrationMeasurement? /* compiled code */

        public final val formaldehydeConcentrationMeasurement: com.google.home.matter.standard.FormaldehydeConcentrationMeasurement? /* compiled code */

        public final val pm1ConcentrationMeasurement: com.google.home.matter.standard.Pm1ConcentrationMeasurement? /* compiled code */

        public final val pm10ConcentrationMeasurement: com.google.home.matter.standard.Pm10ConcentrationMeasurement? /* compiled code */

        public final val totalVolatileOrganicCompoundsConcentrationMeasurement: com.google.home.matter.standard.TotalVolatileOrganicCompoundsConcentrationMeasurement? /* compiled code */

        public final val radonConcentrationMeasurement: com.google.home.matter.standard.RadonConcentrationMeasurement? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    private object Factory : com.google.home.matter.MatterDeviceTypeFactory<com.google.home.matter.standard.AirQualitySensorDevice> {
        public open fun createType(traits: kotlin.collections.Map<com.google.home.TraitFactory<*>, com.google.home.Trait?>, metadataBuilder: (kotlin.collections.List<com.google.home.Trait>?) -> com.google.home.DeviceType.Metadata, traitProvider: com.google.home.TraitProvider, eventProvider: com.google.home.HasEvents): com.google.home.matter.standard.AirQualitySensorDevice { /* compiled code */ }
    }
}
