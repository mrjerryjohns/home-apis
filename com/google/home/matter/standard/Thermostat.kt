// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface Thermostat : com.google.home.matter.standard.ThermostatTrait.Attributes, com.google.home.matter.MatterTrait, com.google.home.Updatable<com.google.home.matter.standard.Thermostat, com.google.home.matter.standard.ThermostatTrait.MutableAttributes>, com.google.home.matter.standard.ThermostatCommands {
    public companion object : com.google.home.TraitFactory<com.google.home.matter.standard.Thermostat> {
        public final val localTemperature: com.google.home.automation.Attribute<kotlin.Short?> /* compiled code */
            public final get

        public final val outdoorTemperature: com.google.home.automation.Attribute<kotlin.Short?> /* compiled code */
            public final get

        public final val occupancy: com.google.home.automation.Attribute<com.google.home.matter.standard.ThermostatTrait.OccupancyBitmap?> /* compiled code */
            public final get

        public final val absMinHeatSetpointLimit: com.google.home.automation.Attribute<kotlin.Short?> /* compiled code */
            public final get

        public final val absMaxHeatSetpointLimit: com.google.home.automation.Attribute<kotlin.Short?> /* compiled code */
            public final get

        public final val absMinCoolSetpointLimit: com.google.home.automation.Attribute<kotlin.Short?> /* compiled code */
            public final get

        public final val absMaxCoolSetpointLimit: com.google.home.automation.Attribute<kotlin.Short?> /* compiled code */
            public final get

        public final val piCoolingDemand: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val piHeatingDemand: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val hvacSystemTypeConfiguration: com.google.home.automation.Attribute<com.google.home.matter.standard.ThermostatTrait.HvacSystemTypeBitmap?> /* compiled code */
            public final get

        public final val localTemperatureCalibration: com.google.home.automation.Attribute<kotlin.Byte?> /* compiled code */
            public final get

        public final val occupiedCoolingSetpoint: com.google.home.automation.Attribute<kotlin.Short?> /* compiled code */
            public final get

        public final val occupiedHeatingSetpoint: com.google.home.automation.Attribute<kotlin.Short?> /* compiled code */
            public final get

        public final val unoccupiedCoolingSetpoint: com.google.home.automation.Attribute<kotlin.Short?> /* compiled code */
            public final get

        public final val unoccupiedHeatingSetpoint: com.google.home.automation.Attribute<kotlin.Short?> /* compiled code */
            public final get

        public final val minHeatSetpointLimit: com.google.home.automation.Attribute<kotlin.Short?> /* compiled code */
            public final get

        public final val maxHeatSetpointLimit: com.google.home.automation.Attribute<kotlin.Short?> /* compiled code */
            public final get

        public final val minCoolSetpointLimit: com.google.home.automation.Attribute<kotlin.Short?> /* compiled code */
            public final get

        public final val maxCoolSetpointLimit: com.google.home.automation.Attribute<kotlin.Short?> /* compiled code */
            public final get

        public final val minSetpointDeadBand: com.google.home.automation.Attribute<kotlin.Byte?> /* compiled code */
            public final get

        public final val remoteSensing: com.google.home.automation.Attribute<com.google.home.matter.standard.ThermostatTrait.RemoteSensingBitmap?> /* compiled code */
            public final get

        public final val controlSequenceOfOperation: com.google.home.automation.Attribute<com.google.home.matter.standard.ThermostatTrait.ControlSequenceOfOperationEnum?> /* compiled code */
            public final get

        public final val systemMode: com.google.home.automation.Attribute<com.google.home.matter.standard.ThermostatTrait.SystemModeEnum?> /* compiled code */
            public final get

        public final val thermostatRunningMode: com.google.home.automation.Attribute<com.google.home.matter.standard.ThermostatTrait.ThermostatRunningModeEnum?> /* compiled code */
            public final get

        public final val startOfWeek: com.google.home.automation.Attribute<com.google.home.matter.standard.ThermostatTrait.StartOfWeekEnum?> /* compiled code */
            public final get

        public final val numberOfWeeklyTransitions: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val numberOfDailyTransitions: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val temperatureSetpointHold: com.google.home.automation.Attribute<com.google.home.matter.standard.ThermostatTrait.TemperatureSetpointHoldEnum?> /* compiled code */
            public final get

        public final val temperatureSetpointHoldDuration: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val thermostatProgrammingOperationMode: com.google.home.automation.Attribute<com.google.home.matter.standard.ThermostatTrait.ProgrammingOperationModeBitmap?> /* compiled code */
            public final get

        public final val thermostatRunningState: com.google.home.automation.Attribute<com.google.home.matter.standard.ThermostatTrait.RelayStateBitmap?> /* compiled code */
            public final get

        public final val setpointChangeSource: com.google.home.automation.Attribute<com.google.home.matter.standard.ThermostatTrait.SetpointChangeSourceEnum?> /* compiled code */
            public final get

        public final val setpointChangeAmount: com.google.home.automation.Attribute<kotlin.Short?> /* compiled code */
            public final get

        public final val setpointChangeSourceTimestamp: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val occupiedSetback: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val occupiedSetbackMin: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val occupiedSetbackMax: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val unoccupiedSetback: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val unoccupiedSetbackMin: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val unoccupiedSetbackMax: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val emergencyHeatDelta: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val acType: com.google.home.automation.Attribute<com.google.home.matter.standard.ThermostatTrait.AcTypeEnum?> /* compiled code */
            public final get

        public final val acCapacity: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val acRefrigerantType: com.google.home.automation.Attribute<com.google.home.matter.standard.ThermostatTrait.AcRefrigerantTypeEnum?> /* compiled code */
            public final get

        public final val acCompressorType: com.google.home.automation.Attribute<com.google.home.matter.standard.ThermostatTrait.AcCompressorTypeEnum?> /* compiled code */
            public final get

        public final val acErrorCode: com.google.home.automation.Attribute<com.google.home.matter.standard.ThermostatTrait.AcErrorCodeBitmap?> /* compiled code */
            public final get

        public final val acLouverPosition: com.google.home.automation.Attribute<com.google.home.matter.standard.ThermostatTrait.AcLouverPositionEnum?> /* compiled code */
            public final get

        public final val acCoilTemperature: com.google.home.automation.Attribute<kotlin.Short?> /* compiled code */
            public final get

        public final val acCapacityformat: com.google.home.automation.Attribute<com.google.home.matter.standard.ThermostatTrait.AcCapacityFormatEnum?> /* compiled code */
            public final get

        public final val presetTypes: com.google.home.automation.Attribute<kotlin.collections.List<com.google.home.matter.standard.ThermostatTrait.PresetTypeStruct>?> /* compiled code */
            public final get

        public final val scheduleTypes: com.google.home.automation.Attribute<kotlin.collections.List<com.google.home.matter.standard.ThermostatTrait.ScheduleTypeStruct>?> /* compiled code */
            public final get

        public final val numberOfPresets: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val numberOfSchedules: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val numberOfScheduleTransitions: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val numberOfScheduleTransitionPerDay: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val activePresetHandle: com.google.home.automation.Attribute<kotlin.ByteArray?> /* compiled code */
            public final get

        public final val activeScheduleHandle: com.google.home.automation.Attribute<kotlin.ByteArray?> /* compiled code */
            public final get

        public final val presets: com.google.home.automation.Attribute<kotlin.collections.List<com.google.home.matter.standard.ThermostatTrait.PresetStruct>?> /* compiled code */
            public final get

        public final val schedules: com.google.home.automation.Attribute<kotlin.collections.List<com.google.home.matter.standard.ThermostatTrait.ScheduleStruct>?> /* compiled code */
            public final get

        public final val setpointHoldExpiryTimestamp: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val generatedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val acceptedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val attributeList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val featureMap: com.google.home.automation.Attribute<com.google.home.matter.standard.ThermostatTrait.Feature> /* compiled code */
            public final get

        public final val clusterRevision: com.google.home.automation.Attribute<kotlin.UShort> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.localTemperature: com.google.home.automation.TypedExpression<kotlin.Short?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.outdoorTemperature: com.google.home.automation.TypedExpression<kotlin.Short?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.occupancy: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ThermostatTrait.OccupancyBitmap?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.absMinHeatSetpointLimit: com.google.home.automation.TypedExpression<kotlin.Short?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.absMaxHeatSetpointLimit: com.google.home.automation.TypedExpression<kotlin.Short?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.absMinCoolSetpointLimit: com.google.home.automation.TypedExpression<kotlin.Short?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.absMaxCoolSetpointLimit: com.google.home.automation.TypedExpression<kotlin.Short?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.piCoolingDemand: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.piHeatingDemand: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.hvacSystemTypeConfiguration: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ThermostatTrait.HvacSystemTypeBitmap?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.localTemperatureCalibration: com.google.home.automation.TypedExpression<kotlin.Byte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.occupiedCoolingSetpoint: com.google.home.automation.TypedExpression<kotlin.Short?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.occupiedHeatingSetpoint: com.google.home.automation.TypedExpression<kotlin.Short?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.unoccupiedCoolingSetpoint: com.google.home.automation.TypedExpression<kotlin.Short?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.unoccupiedHeatingSetpoint: com.google.home.automation.TypedExpression<kotlin.Short?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.minHeatSetpointLimit: com.google.home.automation.TypedExpression<kotlin.Short?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.maxHeatSetpointLimit: com.google.home.automation.TypedExpression<kotlin.Short?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.minCoolSetpointLimit: com.google.home.automation.TypedExpression<kotlin.Short?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.maxCoolSetpointLimit: com.google.home.automation.TypedExpression<kotlin.Short?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.minSetpointDeadBand: com.google.home.automation.TypedExpression<kotlin.Byte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.remoteSensing: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ThermostatTrait.RemoteSensingBitmap?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.controlSequenceOfOperation: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ThermostatTrait.ControlSequenceOfOperationEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.systemMode: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ThermostatTrait.SystemModeEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.thermostatRunningMode: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ThermostatTrait.ThermostatRunningModeEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.startOfWeek: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ThermostatTrait.StartOfWeekEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.numberOfWeeklyTransitions: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.numberOfDailyTransitions: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.temperatureSetpointHold: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ThermostatTrait.TemperatureSetpointHoldEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.temperatureSetpointHoldDuration: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.thermostatProgrammingOperationMode: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ThermostatTrait.ProgrammingOperationModeBitmap?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.thermostatRunningState: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ThermostatTrait.RelayStateBitmap?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.setpointChangeSource: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ThermostatTrait.SetpointChangeSourceEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.setpointChangeAmount: com.google.home.automation.TypedExpression<kotlin.Short?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.setpointChangeSourceTimestamp: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.occupiedSetback: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.occupiedSetbackMin: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.occupiedSetbackMax: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.unoccupiedSetback: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.unoccupiedSetbackMin: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.unoccupiedSetbackMax: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.emergencyHeatDelta: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.acType: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ThermostatTrait.AcTypeEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.acCapacity: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.acRefrigerantType: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ThermostatTrait.AcRefrigerantTypeEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.acCompressorType: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ThermostatTrait.AcCompressorTypeEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.acErrorCode: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ThermostatTrait.AcErrorCodeBitmap?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.acLouverPosition: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ThermostatTrait.AcLouverPositionEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.acCoilTemperature: com.google.home.automation.TypedExpression<kotlin.Short?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.acCapacityformat: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ThermostatTrait.AcCapacityFormatEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.presetTypes: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.ThermostatTrait.PresetTypeStruct>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.scheduleTypes: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.ThermostatTrait.ScheduleTypeStruct>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.numberOfPresets: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.numberOfSchedules: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.numberOfScheduleTransitions: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.numberOfScheduleTransitionPerDay: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.activePresetHandle: com.google.home.automation.TypedExpression<kotlin.ByteArray?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.activeScheduleHandle: com.google.home.automation.TypedExpression<kotlin.ByteArray?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.presets: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.ThermostatTrait.PresetStruct>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.schedules: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.ThermostatTrait.ScheduleStruct>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.setpointHoldExpiryTimestamp: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.featureMap: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ThermostatTrait.Feature> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Thermostat?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.Thermostat>.setHvacSystemTypeConfiguration(value: com.google.home.matter.standard.ThermostatTrait.HvacSystemTypeBitmap): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.Thermostat>.setLocalTemperatureCalibration(value: kotlin.Byte): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.Thermostat>.setOccupiedCoolingSetpoint(value: kotlin.Short): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.Thermostat>.setOccupiedHeatingSetpoint(value: kotlin.Short): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.Thermostat>.setUnoccupiedCoolingSetpoint(value: kotlin.Short): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.Thermostat>.setUnoccupiedHeatingSetpoint(value: kotlin.Short): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.Thermostat>.setMinHeatSetpointLimit(value: kotlin.Short): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.Thermostat>.setMaxHeatSetpointLimit(value: kotlin.Short): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.Thermostat>.setMinCoolSetpointLimit(value: kotlin.Short): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.Thermostat>.setMaxCoolSetpointLimit(value: kotlin.Short): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.Thermostat>.setMinSetpointDeadBand(value: kotlin.Byte): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.Thermostat>.setRemoteSensing(value: com.google.home.matter.standard.ThermostatTrait.RemoteSensingBitmap): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.Thermostat>.setControlSequenceOfOperation(value: com.google.home.matter.standard.ThermostatTrait.ControlSequenceOfOperationEnum): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.Thermostat>.setSystemMode(value: com.google.home.matter.standard.ThermostatTrait.SystemModeEnum): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.Thermostat>.setTemperatureSetpointHold(value: com.google.home.matter.standard.ThermostatTrait.TemperatureSetpointHoldEnum): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.Thermostat>.setTemperatureSetpointHoldDuration(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.Thermostat>.setThermostatProgrammingOperationMode(value: com.google.home.matter.standard.ThermostatTrait.ProgrammingOperationModeBitmap): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.Thermostat>.setOccupiedSetback(value: kotlin.UByte): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.Thermostat>.setUnoccupiedSetback(value: kotlin.UByte): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.Thermostat>.setEmergencyHeatDelta(value: kotlin.UByte): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.Thermostat>.setAcType(value: com.google.home.matter.standard.ThermostatTrait.AcTypeEnum): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.Thermostat>.setAcCapacity(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.Thermostat>.setAcRefrigerantType(value: com.google.home.matter.standard.ThermostatTrait.AcRefrigerantTypeEnum): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.Thermostat>.setAcCompressorType(value: com.google.home.matter.standard.ThermostatTrait.AcCompressorTypeEnum): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.Thermostat>.setAcErrorCode(value: com.google.home.matter.standard.ThermostatTrait.AcErrorCodeBitmap): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.Thermostat>.setAcLouverPosition(value: com.google.home.matter.standard.ThermostatTrait.AcLouverPositionEnum): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.Thermostat>.setAcCapacityformat(value: com.google.home.matter.standard.ThermostatTrait.AcCapacityFormatEnum): kotlin.Unit { /* compiled code */ }

        public final fun setpointRaiseLower(mode: com.google.home.matter.standard.ThermostatTrait.SetpointRaiseLowerModeEnum, amount: kotlin.Byte): com.google.home.automation.Command { /* compiled code */ }

        public final fun getWeeklySchedule(daysToReturn: com.google.home.matter.standard.ThermostatTrait.ScheduleDayOfWeekBitmap, modeToReturn: com.google.home.matter.standard.ThermostatTrait.ScheduleModeBitmap): com.google.home.automation.Command { /* compiled code */ }

        public final fun clearWeeklySchedule(): com.google.home.automation.Command { /* compiled code */ }

        public final fun setActiveScheduleRequest(scheduleHandle: kotlin.ByteArray): com.google.home.automation.Command { /* compiled code */ }

        public final fun setActivePresetRequest(presetHandle: kotlin.ByteArray?): com.google.home.automation.Command { /* compiled code */ }

        public final fun atomicRequest(requestType: com.google.home.matter.standard.ThermostatTrait.AtomicRequestTypeEnum, attributeRequests: kotlin.collections.List<kotlin.UInt>, optionalArgs: com.google.home.matter.standard.ThermostatTrait.AtomicRequestCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.automation.Command { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.matter.standard.Thermostat> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.matter.standard.Thermostat.Attribute): kotlin.Boolean

    public abstract fun supports(command: com.google.home.matter.standard.Thermostat.Command): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.Thermostat.Attribute> {
        @androidx.annotation.NonNull localTemperature,

        @androidx.annotation.NonNull outdoorTemperature,

        @androidx.annotation.NonNull occupancy,

        @androidx.annotation.NonNull absMinHeatSetpointLimit,

        @androidx.annotation.NonNull absMaxHeatSetpointLimit,

        @androidx.annotation.NonNull absMinCoolSetpointLimit,

        @androidx.annotation.NonNull absMaxCoolSetpointLimit,

        @androidx.annotation.NonNull piCoolingDemand,

        @androidx.annotation.NonNull piHeatingDemand,

        @androidx.annotation.NonNull hvacSystemTypeConfiguration,

        @androidx.annotation.NonNull localTemperatureCalibration,

        @androidx.annotation.NonNull occupiedCoolingSetpoint,

        @androidx.annotation.NonNull occupiedHeatingSetpoint,

        @androidx.annotation.NonNull unoccupiedCoolingSetpoint,

        @androidx.annotation.NonNull unoccupiedHeatingSetpoint,

        @androidx.annotation.NonNull minHeatSetpointLimit,

        @androidx.annotation.NonNull maxHeatSetpointLimit,

        @androidx.annotation.NonNull minCoolSetpointLimit,

        @androidx.annotation.NonNull maxCoolSetpointLimit,

        @androidx.annotation.NonNull minSetpointDeadBand,

        @androidx.annotation.NonNull remoteSensing,

        @androidx.annotation.NonNull controlSequenceOfOperation,

        @androidx.annotation.NonNull systemMode,

        @androidx.annotation.NonNull thermostatRunningMode,

        @androidx.annotation.NonNull startOfWeek,

        @androidx.annotation.NonNull numberOfWeeklyTransitions,

        @androidx.annotation.NonNull numberOfDailyTransitions,

        @androidx.annotation.NonNull temperatureSetpointHold,

        @androidx.annotation.NonNull temperatureSetpointHoldDuration,

        @androidx.annotation.NonNull thermostatProgrammingOperationMode,

        @androidx.annotation.NonNull thermostatRunningState,

        @androidx.annotation.NonNull setpointChangeSource,

        @androidx.annotation.NonNull setpointChangeAmount,

        @androidx.annotation.NonNull setpointChangeSourceTimestamp,

        @androidx.annotation.NonNull occupiedSetback,

        @androidx.annotation.NonNull occupiedSetbackMin,

        @androidx.annotation.NonNull occupiedSetbackMax,

        @androidx.annotation.NonNull unoccupiedSetback,

        @androidx.annotation.NonNull unoccupiedSetbackMin,

        @androidx.annotation.NonNull unoccupiedSetbackMax,

        @androidx.annotation.NonNull emergencyHeatDelta,

        @androidx.annotation.NonNull acType,

        @androidx.annotation.NonNull acCapacity,

        @androidx.annotation.NonNull acRefrigerantType,

        @androidx.annotation.NonNull acCompressorType,

        @androidx.annotation.NonNull acErrorCode,

        @androidx.annotation.NonNull acLouverPosition,

        @androidx.annotation.NonNull acCoilTemperature,

        @androidx.annotation.NonNull acCapacityformat,

        @androidx.annotation.NonNull presetTypes,

        @androidx.annotation.NonNull scheduleTypes,

        @androidx.annotation.NonNull numberOfPresets,

        @androidx.annotation.NonNull numberOfSchedules,

        @androidx.annotation.NonNull numberOfScheduleTransitions,

        @androidx.annotation.NonNull numberOfScheduleTransitionPerDay,

        @androidx.annotation.NonNull activePresetHandle,

        @androidx.annotation.NonNull activeScheduleHandle,

        @androidx.annotation.NonNull presets,

        @androidx.annotation.NonNull schedules,

        @androidx.annotation.NonNull setpointHoldExpiryTimestamp,

        @androidx.annotation.NonNull generatedCommandList,

        @androidx.annotation.NonNull acceptedCommandList,

        @androidx.annotation.NonNull attributeList,

        @androidx.annotation.NonNull featureMap,

        @androidx.annotation.NonNull clusterRevision;

        public companion object {
            public final val StructDescriptor: com.google.home.StructDescriptor /* compiled code */
        }

        public open val fieldName: kotlin.String /* compiled code */

        public open val tag: kotlin.UInt /* compiled code */

        public open val typeName: kotlin.String /* compiled code */

        public open val typeEnum: com.google.home.Type /* compiled code */

        public open val descriptor: com.google.home.Descriptor /* compiled code */

        public final val isNullable: kotlin.Boolean /* compiled code */
    }

    public final enum class Command private constructor(tag: kotlin.UInt) : kotlin.Enum<com.google.home.matter.standard.Thermostat.Command> {
        @androidx.annotation.NonNull SetpointRaiseLower,

        @androidx.annotation.NonNull SetWeeklySchedule,

        @androidx.annotation.NonNull GetWeeklySchedule,

        @androidx.annotation.NonNull ClearWeeklySchedule,

        @androidx.annotation.NonNull SetActiveScheduleRequest,

        @androidx.annotation.NonNull SetActivePresetRequest,

        @androidx.annotation.NonNull AtomicRequest;

        public final val tag: kotlin.UInt /* compiled code */
    }
}
