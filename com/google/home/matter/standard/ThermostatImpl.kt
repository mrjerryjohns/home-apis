// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class ThermostatImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.ThermostatTrait.Attributes) : com.google.home.matter.standard.Thermostat, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.ThermostatTrait.Attributes, com.google.home.Updatable<com.google.home.matter.standard.Thermostat, com.google.home.matter.standard.ThermostatTrait.MutableAttributes> {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.ThermostatTrait.Attributes /* compiled code */

    public open val absMaxCoolSetpointLimit: kotlin.Short? /* compiled code */

    public open val absMaxHeatSetpointLimit: kotlin.Short? /* compiled code */

    public open val absMinCoolSetpointLimit: kotlin.Short? /* compiled code */

    public open val absMinHeatSetpointLimit: kotlin.Short? /* compiled code */

    public open val acCapacity: kotlin.UShort? /* compiled code */

    public open val acCapacityformat: com.google.home.matter.standard.ThermostatTrait.AcCapacityFormatEnum? /* compiled code */

    public open val acCoilTemperature: kotlin.Short? /* compiled code */

    public open val acCompressorType: com.google.home.matter.standard.ThermostatTrait.AcCompressorTypeEnum? /* compiled code */

    public open val acErrorCode: com.google.home.matter.standard.ThermostatTrait.AcErrorCodeBitmap? /* compiled code */

    public open val acLouverPosition: com.google.home.matter.standard.ThermostatTrait.AcLouverPositionEnum? /* compiled code */

    public open val acRefrigerantType: com.google.home.matter.standard.ThermostatTrait.AcRefrigerantTypeEnum? /* compiled code */

    public open val acType: com.google.home.matter.standard.ThermostatTrait.AcTypeEnum? /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val activePresetHandle: kotlin.ByteArray? /* compiled code */

    public open val activeScheduleHandle: kotlin.ByteArray? /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val controlSequenceOfOperation: com.google.home.matter.standard.ThermostatTrait.ControlSequenceOfOperationEnum? /* compiled code */

    public open val emergencyHeatDelta: kotlin.UByte? /* compiled code */

    public open val featureMap: com.google.home.matter.standard.ThermostatTrait.Feature /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val hvacSystemTypeConfiguration: com.google.home.matter.standard.ThermostatTrait.HvacSystemTypeBitmap? /* compiled code */

    public open val localTemperature: kotlin.Short? /* compiled code */

    public open val localTemperatureCalibration: kotlin.Byte? /* compiled code */

    public open val maxCoolSetpointLimit: kotlin.Short? /* compiled code */

    public open val maxHeatSetpointLimit: kotlin.Short? /* compiled code */

    public open val minCoolSetpointLimit: kotlin.Short? /* compiled code */

    public open val minHeatSetpointLimit: kotlin.Short? /* compiled code */

    public open val minSetpointDeadBand: kotlin.Byte? /* compiled code */

    public open val numberOfDailyTransitions: kotlin.UByte? /* compiled code */

    public open val numberOfPresets: kotlin.UByte? /* compiled code */

    public open val numberOfScheduleTransitionPerDay: kotlin.UByte? /* compiled code */

    public open val numberOfScheduleTransitions: kotlin.UByte? /* compiled code */

    public open val numberOfSchedules: kotlin.UByte? /* compiled code */

    public open val numberOfWeeklyTransitions: kotlin.UByte? /* compiled code */

    public open val occupancy: com.google.home.matter.standard.ThermostatTrait.OccupancyBitmap? /* compiled code */

    public open val occupiedCoolingSetpoint: kotlin.Short? /* compiled code */

    public open val occupiedHeatingSetpoint: kotlin.Short? /* compiled code */

    public open val occupiedSetback: kotlin.UByte? /* compiled code */

    public open val occupiedSetbackMax: kotlin.UByte? /* compiled code */

    public open val occupiedSetbackMin: kotlin.UByte? /* compiled code */

    public open val outdoorTemperature: kotlin.Short? /* compiled code */

    public open val piCoolingDemand: kotlin.UByte? /* compiled code */

    public open val piHeatingDemand: kotlin.UByte? /* compiled code */

    public open val presetTypes: kotlin.collections.List<com.google.home.matter.standard.ThermostatTrait.PresetTypeStruct>? /* compiled code */

    public open val presets: kotlin.collections.List<com.google.home.matter.standard.ThermostatTrait.PresetStruct>? /* compiled code */

    public open val remoteSensing: com.google.home.matter.standard.ThermostatTrait.RemoteSensingBitmap? /* compiled code */

    public open val scheduleTypes: kotlin.collections.List<com.google.home.matter.standard.ThermostatTrait.ScheduleTypeStruct>? /* compiled code */

    public open val schedules: kotlin.collections.List<com.google.home.matter.standard.ThermostatTrait.ScheduleStruct>? /* compiled code */

    public open val setpointChangeAmount: kotlin.Short? /* compiled code */

    public open val setpointChangeSource: com.google.home.matter.standard.ThermostatTrait.SetpointChangeSourceEnum? /* compiled code */

    public open val setpointChangeSourceTimestamp: kotlin.UInt? /* compiled code */

    public open val setpointHoldExpiryTimestamp: kotlin.UInt? /* compiled code */

    public open val startOfWeek: com.google.home.matter.standard.ThermostatTrait.StartOfWeekEnum? /* compiled code */

    public open val systemMode: com.google.home.matter.standard.ThermostatTrait.SystemModeEnum? /* compiled code */

    public open val temperatureSetpointHold: com.google.home.matter.standard.ThermostatTrait.TemperatureSetpointHoldEnum? /* compiled code */

    public open val temperatureSetpointHoldDuration: kotlin.UShort? /* compiled code */

    public open val thermostatProgrammingOperationMode: com.google.home.matter.standard.ThermostatTrait.ProgrammingOperationModeBitmap? /* compiled code */

    public open val thermostatRunningMode: com.google.home.matter.standard.ThermostatTrait.ThermostatRunningModeEnum? /* compiled code */

    public open val thermostatRunningState: com.google.home.matter.standard.ThermostatTrait.RelayStateBitmap? /* compiled code */

    public open val unoccupiedCoolingSetpoint: kotlin.Short? /* compiled code */

    public open val unoccupiedHeatingSetpoint: kotlin.Short? /* compiled code */

    public open val unoccupiedSetback: kotlin.UByte? /* compiled code */

    public open val unoccupiedSetbackMax: kotlin.UByte? /* compiled code */

    public open val unoccupiedSetbackMin: kotlin.UByte? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.Thermostat.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.matter.standard.Thermostat.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun setpointRaiseLower(mode: com.google.home.matter.standard.ThermostatTrait.SetpointRaiseLowerModeEnum, amount: kotlin.Byte): kotlin.Unit { /* compiled code */ }

    public open suspend fun setWeeklySchedule(numberOfTransitionsForSequence: kotlin.UByte, dayOfWeekForSequence: com.google.home.matter.standard.ThermostatTrait.ScheduleDayOfWeekBitmap, modeForSequence: com.google.home.matter.standard.ThermostatTrait.ScheduleModeBitmap, transitions: kotlin.collections.List<com.google.home.matter.standard.ThermostatTrait.WeeklyScheduleTransitionStruct>): kotlin.Unit { /* compiled code */ }

    public open suspend fun getWeeklySchedule(daysToReturn: com.google.home.matter.standard.ThermostatTrait.ScheduleDayOfWeekBitmap, modeToReturn: com.google.home.matter.standard.ThermostatTrait.ScheduleModeBitmap): com.google.home.matter.standard.ThermostatTrait.GetWeeklyScheduleCommand.Response { /* compiled code */ }

    public open suspend fun clearWeeklySchedule(): kotlin.Unit { /* compiled code */ }

    public open suspend fun setActiveScheduleRequest(scheduleHandle: kotlin.ByteArray): kotlin.Unit { /* compiled code */ }

    public open suspend fun setActivePresetRequest(presetHandle: kotlin.ByteArray?): kotlin.Unit { /* compiled code */ }

    public open suspend fun atomicRequest(requestType: com.google.home.matter.standard.ThermostatTrait.AtomicRequestTypeEnum, attributeRequests: kotlin.collections.List<kotlin.UInt>, optionalArgs: com.google.home.matter.standard.ThermostatTrait.AtomicRequestCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.matter.standard.ThermostatTrait.AtomicRequestCommand.Response { /* compiled code */ }

    public open suspend fun update(optimisticReturn: (com.google.home.matter.standard.Thermostat) -> kotlin.Unit, init: com.google.home.matter.standard.ThermostatTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.Thermostat { /* compiled code */ }

    public open fun setpointRaiseLowerBatchable(mode: com.google.home.matter.standard.ThermostatTrait.SetpointRaiseLowerModeEnum, amount: kotlin.Byte): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun setWeeklyScheduleBatchable(numberOfTransitionsForSequence: kotlin.UByte, dayOfWeekForSequence: com.google.home.matter.standard.ThermostatTrait.ScheduleDayOfWeekBitmap, modeForSequence: com.google.home.matter.standard.ThermostatTrait.ScheduleModeBitmap, transitions: kotlin.collections.List<com.google.home.matter.standard.ThermostatTrait.WeeklyScheduleTransitionStruct>): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun getWeeklyScheduleBatchable(daysToReturn: com.google.home.matter.standard.ThermostatTrait.ScheduleDayOfWeekBitmap, modeToReturn: com.google.home.matter.standard.ThermostatTrait.ScheduleModeBitmap): com.google.home.BatchableCommand<com.google.home.matter.standard.ThermostatTrait.GetWeeklyScheduleCommand.Response> { /* compiled code */ }

    public open fun clearWeeklyScheduleBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun setActiveScheduleRequestBatchable(scheduleHandle: kotlin.ByteArray): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun setActivePresetRequestBatchable(presetHandle: kotlin.ByteArray?): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun atomicRequestBatchable(requestType: com.google.home.matter.standard.ThermostatTrait.AtomicRequestTypeEnum, attributeRequests: kotlin.collections.List<kotlin.UInt>, optionalArgs: com.google.home.matter.standard.ThermostatTrait.AtomicRequestCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<com.google.home.matter.standard.ThermostatTrait.AtomicRequestCommand.Response> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}
