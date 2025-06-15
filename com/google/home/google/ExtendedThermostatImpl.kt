// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class ExtendedThermostatImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.google.ExtendedThermostatTrait.Attributes) : com.google.home.google.ExtendedThermostat, com.google.home.matter.MatterTraitImpl, com.google.home.google.ExtendedThermostatTrait.Attributes, com.google.home.Updatable<com.google.home.google.ExtendedThermostat, com.google.home.google.ExtendedThermostatTrait.MutableAttributes> {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.google.ExtendedThermostatTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val activePresetHandle: kotlin.String? /* compiled code */

    public open val activeRemoteTemperatureSensorIds: kotlin.collections.List<kotlin.String>? /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val averageLocalTemperature: kotlin.Short? /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val extendedProgrammingOperationMode: kotlin.UInt? /* compiled code */

    public open val extendedRunningMode: com.google.home.google.ExtendedThermostatTrait.ExtendedRunningMode? /* compiled code */

    public open val extendedSetpointChangeSource: com.google.home.google.ExtendedThermostatTrait.ExtendedSetpointChangeSource? /* compiled code */

    public open val extendedSupportedModes: kotlin.collections.List<com.google.home.google.ExtendedThermostatTrait.ExtendedThermostatMode>? /* compiled code */

    public open val extendedSystemMode: com.google.home.google.ExtendedThermostatTrait.ExtendedThermostatMode? /* compiled code */

    public open val featureMap: com.google.home.google.ExtendedThermostatTrait.ExtendedThermostatFeature /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val maxCoolSafetySetpointLimit: kotlin.Short? /* compiled code */

    public open val maxHeatSafetySetpointLimit: kotlin.Short? /* compiled code */

    public open val maxSetpointHoldSeconds: kotlin.Int? /* compiled code */

    public open val maxSettableThermostatTemperatureSensors: kotlin.UInt? /* compiled code */

    public open val minCoolSafetySetpointLimit: kotlin.Short? /* compiled code */

    public open val minHeatSafetySetpointLimit: kotlin.Short? /* compiled code */

    public open val presets: kotlin.collections.List<com.google.home.google.ExtendedThermostatTrait.Preset>? /* compiled code */

    public open val remoteTemperatureSensorIds: kotlin.collections.List<kotlin.String>? /* compiled code */

    public open val targetTemperatureTimestampSeconds: kotlin.Long? /* compiled code */

    public open val temperatureSetpointHoldExpiryTimestampSeconds: kotlin.Long? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.google.ExtendedThermostat.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.google.ExtendedThermostat.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun notifySensorStateChange(sensorType: com.google.home.google.ExtendedThermostatTrait.SensorType, alarmType: com.google.home.google.ExtendedThermostatTrait.AlarmType): kotlin.Unit { /* compiled code */ }

    public open suspend fun update(optimisticReturn: (com.google.home.google.ExtendedThermostat) -> kotlin.Unit, init: com.google.home.google.ExtendedThermostatTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.google.ExtendedThermostat { /* compiled code */ }

    public open fun notifySensorStateChangeBatchable(sensorType: com.google.home.google.ExtendedThermostatTrait.SensorType, alarmType: com.google.home.google.ExtendedThermostatTrait.AlarmType): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

