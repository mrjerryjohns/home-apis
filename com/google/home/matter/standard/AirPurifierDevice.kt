// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class AirPurifierDevice public constructor(metadata: com.google.home.DeviceType.Metadata, traitProvider: com.google.home.TraitProvider, eventProvider: com.google.home.HasEvents, googleTraits: com.google.home.matter.standard.AirPurifierDevice.GoogleTraits, standardTraits: com.google.home.matter.standard.AirPurifierDevice.StandardTraits) : com.google.home.DeviceType {
    public companion object : com.google.home.DeviceTypeFactory<com.google.home.matter.standard.AirPurifierDevice> {
        public const final val TYPE_ID: kotlin.String = COMPILED_CODE /* compiled code */

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val metadata: com.google.home.DeviceType.Metadata /* compiled code */

    public final val googleTraits: com.google.home.matter.standard.AirPurifierDevice.GoogleTraits /* compiled code */

    public final val standardTraits: com.google.home.matter.standard.AirPurifierDevice.StandardTraits /* compiled code */

    public open val factory: com.google.home.DeviceTypeFactory<com.google.home.matter.standard.AirPurifierDevice> /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun hashCode(): kotlin.Int { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }

    public final class GoogleTraits public constructor(extendedFanControl: com.google.home.google.ExtendedFanControl?, extendedAirQuality: com.google.home.google.ExtendedAirQuality?, filterMonitoring: com.google.home.google.FilterMonitoring?) {
        public final val extendedFanControl: com.google.home.google.ExtendedFanControl? /* compiled code */

        public final val extendedAirQuality: com.google.home.google.ExtendedAirQuality? /* compiled code */

        public final val filterMonitoring: com.google.home.google.FilterMonitoring? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final class StandardTraits public constructor(identify: com.google.home.matter.standard.Identify?, fanControl: com.google.home.matter.standard.FanControl?, hepaFilterMonitoring: com.google.home.matter.standard.HepaFilterMonitoring?, activatedCarbonFilterMonitoring: com.google.home.matter.standard.ActivatedCarbonFilterMonitoring?) {
        public final val identify: com.google.home.matter.standard.Identify? /* compiled code */

        public final val fanControl: com.google.home.matter.standard.FanControl? /* compiled code */

        public final val hepaFilterMonitoring: com.google.home.matter.standard.HepaFilterMonitoring? /* compiled code */

        public final val activatedCarbonFilterMonitoring: com.google.home.matter.standard.ActivatedCarbonFilterMonitoring? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    private object Factory : com.google.home.matter.MatterDeviceTypeFactory<com.google.home.matter.standard.AirPurifierDevice> {
        public open fun createType(traits: kotlin.collections.Map<com.google.home.TraitFactory<*>, com.google.home.Trait?>, metadataBuilder: (kotlin.collections.List<com.google.home.Trait>?) -> com.google.home.DeviceType.Metadata, traitProvider: com.google.home.TraitProvider, eventProvider: com.google.home.HasEvents): com.google.home.matter.standard.AirPurifierDevice { /* compiled code */ }
    }
}

