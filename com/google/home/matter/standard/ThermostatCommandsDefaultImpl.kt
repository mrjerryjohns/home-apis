// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface ThermostatCommandsDefaultImpl : com.google.home.matter.standard.ThermostatCommands {
    public open suspend fun setpointRaiseLower(mode: com.google.home.matter.standard.ThermostatTrait.SetpointRaiseLowerModeEnum, amount: kotlin.Byte): kotlin.Unit { /* compiled code */ }

    public open suspend fun setWeeklySchedule(numberOfTransitionsForSequence: kotlin.UByte, dayOfWeekForSequence: com.google.home.matter.standard.ThermostatTrait.ScheduleDayOfWeekBitmap, modeForSequence: com.google.home.matter.standard.ThermostatTrait.ScheduleModeBitmap, transitions: kotlin.collections.List<com.google.home.matter.standard.ThermostatTrait.WeeklyScheduleTransitionStruct>): kotlin.Unit { /* compiled code */ }

    public open suspend fun getWeeklySchedule(daysToReturn: com.google.home.matter.standard.ThermostatTrait.ScheduleDayOfWeekBitmap, modeToReturn: com.google.home.matter.standard.ThermostatTrait.ScheduleModeBitmap): com.google.home.matter.standard.ThermostatTrait.GetWeeklyScheduleCommand.Response { /* compiled code */ }

    public open suspend fun clearWeeklySchedule(): kotlin.Unit { /* compiled code */ }

    public open suspend fun setActiveScheduleRequest(scheduleHandle: kotlin.ByteArray): kotlin.Unit { /* compiled code */ }

    public open suspend fun setActivePresetRequest(presetHandle: kotlin.ByteArray?): kotlin.Unit { /* compiled code */ }

    public open suspend fun atomicRequest(requestType: com.google.home.matter.standard.ThermostatTrait.AtomicRequestTypeEnum, attributeRequests: kotlin.collections.List<kotlin.UInt>, optionalArgs: com.google.home.matter.standard.ThermostatTrait.AtomicRequestCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.matter.standard.ThermostatTrait.AtomicRequestCommand.Response { /* compiled code */ }

    public open fun setpointRaiseLowerBatchable(mode: com.google.home.matter.standard.ThermostatTrait.SetpointRaiseLowerModeEnum, amount: kotlin.Byte): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun setWeeklyScheduleBatchable(numberOfTransitionsForSequence: kotlin.UByte, dayOfWeekForSequence: com.google.home.matter.standard.ThermostatTrait.ScheduleDayOfWeekBitmap, modeForSequence: com.google.home.matter.standard.ThermostatTrait.ScheduleModeBitmap, transitions: kotlin.collections.List<com.google.home.matter.standard.ThermostatTrait.WeeklyScheduleTransitionStruct>): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun getWeeklyScheduleBatchable(daysToReturn: com.google.home.matter.standard.ThermostatTrait.ScheduleDayOfWeekBitmap, modeToReturn: com.google.home.matter.standard.ThermostatTrait.ScheduleModeBitmap): com.google.home.BatchableCommand<com.google.home.matter.standard.ThermostatTrait.GetWeeklyScheduleCommand.Response> { /* compiled code */ }

    public open fun clearWeeklyScheduleBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun setActiveScheduleRequestBatchable(scheduleHandle: kotlin.ByteArray): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun setActivePresetRequestBatchable(presetHandle: kotlin.ByteArray?): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun atomicRequestBatchable(requestType: com.google.home.matter.standard.ThermostatTrait.AtomicRequestTypeEnum, attributeRequests: kotlin.collections.List<kotlin.UInt>, optionalArgs: com.google.home.matter.standard.ThermostatTrait.AtomicRequestCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<com.google.home.matter.standard.ThermostatTrait.AtomicRequestCommand.Response> { /* compiled code */ }
}

