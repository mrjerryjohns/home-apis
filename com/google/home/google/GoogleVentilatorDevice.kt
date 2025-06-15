// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class GoogleVentilatorDevice public constructor(metadata: com.google.home.DeviceType.Metadata, traitProvider: com.google.home.TraitProvider, eventProvider: com.google.home.HasEvents, googleTraits: com.google.home.google.GoogleVentilatorDevice.GoogleTraits, standardTraits: com.google.home.google.GoogleVentilatorDevice.StandardTraits) : com.google.home.DeviceType {
    public companion object : com.google.home.DeviceTypeFactory<com.google.home.google.GoogleVentilatorDevice> {
        public const final val TYPE_ID: kotlin.String = COMPILED_CODE /* compiled code */

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val metadata: com.google.home.DeviceType.Metadata /* compiled code */

    public final val googleTraits: com.google.home.google.GoogleVentilatorDevice.GoogleTraits /* compiled code */

    public final val standardTraits: com.google.home.google.GoogleVentilatorDevice.StandardTraits /* compiled code */

    public open val factory: com.google.home.DeviceTypeFactory<com.google.home.google.GoogleVentilatorDevice> /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun hashCode(): kotlin.Int { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }

    public final class GoogleTraits public constructor(extendedAirQuality: com.google.home.google.ExtendedAirQuality?, preFilterMonitoring: com.google.home.google.PreFilterMonitoring?, max2FilterMonitoring: com.google.home.google.Max2FilterMonitoring?, filterMonitoring: com.google.home.google.FilterMonitoring?, leafWetnessMeasurement: com.google.home.google.LeafWetnessMeasurement?, soilMoistureMeasurement: com.google.home.google.SoilMoistureMeasurement?, smokeLevelConcentrationMeasurement: com.google.home.google.SmokeLevelConcentrationMeasurement?) {
        public final val extendedAirQuality: com.google.home.google.ExtendedAirQuality? /* compiled code */

        public final val preFilterMonitoring: com.google.home.google.PreFilterMonitoring? /* compiled code */

        public final val max2FilterMonitoring: com.google.home.google.Max2FilterMonitoring? /* compiled code */

        public final val filterMonitoring: com.google.home.google.FilterMonitoring? /* compiled code */

        public final val leafWetnessMeasurement: com.google.home.google.LeafWetnessMeasurement? /* compiled code */

        public final val soilMoistureMeasurement: com.google.home.google.SoilMoistureMeasurement? /* compiled code */

        public final val smokeLevelConcentrationMeasurement: com.google.home.google.SmokeLevelConcentrationMeasurement? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

        public final class StandardTraits public constructor(smokeCoAlarm: com.google.home.matter.standard.SmokeCoAlarm?, carbonMonoxideConcentrationMeasurement: com.google.home.matter.standard.CarbonMonoxideConcentrationMeasurement?, airQuality: com.google.home.matter.standard.AirQuality?, hepaFilterMonitoring: com.google.home.matter.standard.HepaFilterMonitoring?, pressureMeasurement: com.google.home.matter.standard.PressureMeasurement?, flowMeasurement: com.google.home.matter.standard.FlowMeasurement?, illuminanceMeasurement: com.google.home.matter.standard.IlluminanceMeasurement?, carbonDioxideConcentrationMeasurement: com.google.home.matter.standard.CarbonDioxideConcentrationMeasurement?, totalVolatileOrganicCompoundsConcentrationMeasurement:
        com.google.home.matter.standard.TotalVolatileOrganicCompoundsConcentrationMeasurement?, booleanState: com.google.home.matter.standard.BooleanState?, pm25ConcentrationMeasurement: com.google.home.matter.standard.Pm25ConcentrationMeasurement?, pm10ConcentrationMeasurement: com.google.home.matter.standard.Pm10ConcentrationMeasurement?, onOff: com.google.home.matter.standard.OnOff?) {
        public final val smokeCoAlarm: com.google.home.matter.standard.SmokeCoAlarm? /* compiled code */

        public final val carbonMonoxideConcentrationMeasurement: com.google.home.matter.standard.CarbonMonoxideConcentrationMeasurement? /* compiled code */

        public final val airQuality: com.google.home.matter.standard.AirQuality? /* compiled code */

        public final val hepaFilterMonitoring: com.google.home.matter.standard.HepaFilterMonitoring? /* compiled code */

        public final val pressureMeasurement: com.google.home.matter.standard.PressureMeasurement? /* compiled code */

        public final val flowMeasurement: com.google.home.matter.standard.FlowMeasurement? /* compiled code */

        public final val illuminanceMeasurement: com.google.home.matter.standard.IlluminanceMeasurement? /* compiled code */

        public final val carbonDioxideConcentrationMeasurement: com.google.home.matter.standard.CarbonDioxideConcentrationMeasurement? /* compiled code */

        public final val totalVolatileOrganicCompoundsConcentrationMeasurement: com.google.home.matter.standard.TotalVolatileOrganicCompoundsConcentrationMeasurement? /* compiled code */

        public final val booleanState: com.google.home.matter.standard.BooleanState? /* compiled code */

        public final val pm25ConcentrationMeasurement: com.google.home.matter.standard.Pm25ConcentrationMeasurement? /* compiled code */

        public final val pm10ConcentrationMeasurement: com.google.home.matter.standard.Pm10ConcentrationMeasurement? /* compiled code */

        public final val onOff: com.google.home.matter.standard.OnOff? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    private object Factory : com.google.home.matter.MatterDeviceTypeFactory<com.google.home.google.GoogleVentilatorDevice> {
        public open fun createType(traits: kotlin.collections.Map<com.google.home.TraitFactory<*>, com.google.home.Trait?>, metadataBuilder: (kotlin.collections.List<com.google.home.Trait>?) -> com.google.home.DeviceType.Metadata, traitProvider: com.google.home.TraitProvider, eventProvider: com.google.home.HasEvents): com.google.home.google.GoogleVentilatorDevice { /* compiled code */ }
    }
}
