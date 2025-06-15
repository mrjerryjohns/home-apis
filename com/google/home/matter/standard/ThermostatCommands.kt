// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface ThermostatCommands {
    public abstract suspend fun setpointRaiseLower(mode: com.google.home.matter.standard.ThermostatTrait.SetpointRaiseLowerModeEnum, amount: kotlin.Byte): kotlin.Unit

    public abstract suspend fun setWeeklySchedule(numberOfTransitionsForSequence: kotlin.UByte, dayOfWeekForSequence: com.google.home.matter.standard.ThermostatTrait.ScheduleDayOfWeekBitmap, modeForSequence: com.google.home.matter.standard.ThermostatTrait.ScheduleModeBitmap, transitions: kotlin.collections.List<com.google.home.matter.standard.ThermostatTrait.WeeklyScheduleTransitionStruct>): kotlin.Unit

    public abstract suspend fun getWeeklySchedule(daysToReturn: com.google.home.matter.standard.ThermostatTrait.ScheduleDayOfWeekBitmap, modeToReturn: com.google.home.matter.standard.ThermostatTrait.ScheduleModeBitmap): com.google.home.matter.standard.ThermostatTrait.GetWeeklyScheduleCommand.Response

    public abstract suspend fun clearWeeklySchedule(): kotlin.Unit

    public abstract suspend fun setActiveScheduleRequest(scheduleHandle: kotlin.ByteArray): kotlin.Unit

    public abstract suspend fun setActivePresetRequest(presetHandle: kotlin.ByteArray?): kotlin.Unit

    public abstract suspend fun atomicRequest(requestType: com.google.home.matter.standard.ThermostatTrait.AtomicRequestTypeEnum, attributeRequests: kotlin.collections.List<kotlin.UInt>, optionalArgs: com.google.home.matter.standard.ThermostatTrait.AtomicRequestCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.matter.standard.ThermostatTrait.AtomicRequestCommand.Response

    public abstract fun setpointRaiseLowerBatchable(mode: com.google.home.matter.standard.ThermostatTrait.SetpointRaiseLowerModeEnum, amount: kotlin.Byte): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun setWeeklyScheduleBatchable(numberOfTransitionsForSequence: kotlin.UByte, dayOfWeekForSequence: com.google.home.matter.standard.ThermostatTrait.ScheduleDayOfWeekBitmap, modeForSequence: com.google.home.matter.standard.ThermostatTrait.ScheduleModeBitmap, transitions: kotlin.collections.List<com.google.home.matter.standard.ThermostatTrait.WeeklyScheduleTransitionStruct>): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun getWeeklyScheduleBatchable(daysToReturn: com.google.home.matter.standard.ThermostatTrait.ScheduleDayOfWeekBitmap, modeToReturn: com.google.home.matter.standard.ThermostatTrait.ScheduleModeBitmap): com.google.home.BatchableCommand<com.google.home.matter.standard.ThermostatTrait.GetWeeklyScheduleCommand.Response>

    public abstract fun clearWeeklyScheduleBatchable(): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun setActiveScheduleRequestBatchable(scheduleHandle: kotlin.ByteArray): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun setActivePresetRequestBatchable(presetHandle: kotlin.ByteArray?): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun atomicRequestBatchable(requestType: com.google.home.matter.standard.ThermostatTrait.AtomicRequestTypeEnum, attributeRequests: kotlin.collections.List<kotlin.UInt>, optionalArgs: com.google.home.matter.standard.ThermostatTrait.AtomicRequestCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.BatchableCommand<com.google.home.matter.standard.ThermostatTrait.AtomicRequestCommand.Response>
}
