// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface DoorLockCommandsDefaultImpl : com.google.home.matter.standard.DoorLockCommands {
    public open suspend fun lockDoor(optionalArgs: com.google.home.matter.standard.DoorLockTrait.LockDoorCommand.OptionalArgs.() -> kotlin.Unit): kotlin.Unit { /* compiled code */ }

    public open suspend fun unlockDoor(optionalArgs: com.google.home.matter.standard.DoorLockTrait.UnlockDoorCommand.OptionalArgs.() -> kotlin.Unit): kotlin.Unit { /* compiled code */ }

    public open suspend fun unlockWithTimeout(timeout: kotlin.UShort, optionalArgs: com.google.home.matter.standard.DoorLockTrait.UnlockWithTimeoutCommand.OptionalArgs.() -> kotlin.Unit): kotlin.Unit { /* compiled code */ }

    public open suspend fun setWeekDaySchedule(weekDayIndex: kotlin.UByte, userIndex: kotlin.UShort, daysMask: com.google.home.matter.standard.DoorLockTrait.DaysMaskMap, startHour: kotlin.UByte, startMinute: kotlin.UByte, endHour: kotlin.UByte, endMinute: kotlin.UByte): kotlin.Unit { /* compiled code */ }

    public open suspend fun getWeekDaySchedule(weekDayIndex: kotlin.UByte, userIndex: kotlin.UShort): com.google.home.matter.standard.DoorLockTrait.GetWeekDayScheduleCommand.Response { /* compiled code */ }

    public open suspend fun clearWeekDaySchedule(weekDayIndex: kotlin.UByte, userIndex: kotlin.UShort): kotlin.Unit { /* compiled code */ }

    public open suspend fun setYearDaySchedule(yearDayIndex: kotlin.UByte, userIndex: kotlin.UShort, localStartTime: kotlin.UInt, localEndTime: kotlin.UInt): kotlin.Unit { /* compiled code */ }

    public open suspend fun getYearDaySchedule(yearDayIndex: kotlin.UByte, userIndex: kotlin.UShort): com.google.home.matter.standard.DoorLockTrait.GetYearDayScheduleCommand.Response { /* compiled code */ }

    public open suspend fun clearYearDaySchedule(yearDayIndex: kotlin.UByte, userIndex: kotlin.UShort): kotlin.Unit { /* compiled code */ }

    public open suspend fun setHolidaySchedule(holidayIndex: kotlin.UByte, localStartTime: kotlin.UInt, localEndTime: kotlin.UInt, operatingMode: com.google.home.matter.standard.DoorLockTrait.OperatingModeEnum): kotlin.Unit { /* compiled code */ }

    public open suspend fun getHolidaySchedule(holidayIndex: kotlin.UByte): com.google.home.matter.standard.DoorLockTrait.GetHolidayScheduleCommand.Response { /* compiled code */ }

    public open suspend fun clearHolidaySchedule(holidayIndex: kotlin.UByte): kotlin.Unit { /* compiled code */ }

    public open suspend fun setUser(operationType: com.google.home.matter.standard.DoorLockTrait.DataOperationTypeEnum, userIndex: kotlin.UShort, userName: kotlin.String?, userUniqueId: kotlin.UInt?, userStatus: com.google.home.matter.standard.DoorLockTrait.UserStatusEnum?, userType: com.google.home.matter.standard.DoorLockTrait.UserTypeEnum?, credentialRule: com.google.home.matter.standard.DoorLockTrait.CredentialRuleEnum?): kotlin.Unit { /* compiled code */ }

    public open suspend fun getUser(userIndex: kotlin.UShort): com.google.home.matter.standard.DoorLockTrait.GetUserCommand.Response { /* compiled code */ }

    public open suspend fun clearUser(userIndex: kotlin.UShort): kotlin.Unit { /* compiled code */ }

    public open suspend fun setCredential(operationType: com.google.home.matter.standard.DoorLockTrait.DataOperationTypeEnum, credential: com.google.home.matter.standard.DoorLockTrait.CredentialStruct, credentialData: kotlin.ByteArray, userIndex: kotlin.UShort?, userStatus: com.google.home.matter.standard.DoorLockTrait.UserStatusEnum?, userType: com.google.home.matter.standard.DoorLockTrait.UserTypeEnum?): com.google.home.matter.standard.DoorLockTrait.SetCredentialCommand.Response { /* compiled code */ }

    public open suspend fun getCredentialStatus(credential: com.google.home.matter.standard.DoorLockTrait.CredentialStruct): com.google.home.matter.standard.DoorLockTrait.GetCredentialStatusCommand.Response { /* compiled code */ }

    public open suspend fun clearCredential(credential: com.google.home.matter.standard.DoorLockTrait.CredentialStruct?): kotlin.Unit { /* compiled code */ }

    public open suspend fun unboltDoor(optionalArgs: com.google.home.matter.standard.DoorLockTrait.UnboltDoorCommand.OptionalArgs.() -> kotlin.Unit): kotlin.Unit { /* compiled code */ }

    public open suspend fun setAliroReaderConfig(signingKey: kotlin.ByteArray, verificationKey: kotlin.ByteArray, groupIdentifier: kotlin.ByteArray, optionalArgs: com.google.home.matter.standard.DoorLockTrait.SetAliroReaderConfigCommand.OptionalArgs.() -> kotlin.Unit): kotlin.Unit { /* compiled code */ }

    public open suspend fun clearAliroReaderConfig(): kotlin.Unit { /* compiled code */ }

    public open fun lockDoorBatchable(optionalArgs: com.google.home.matter.standard.DoorLockTrait.LockDoorCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun unlockDoorBatchable(optionalArgs: com.google.home.matter.standard.DoorLockTrait.UnlockDoorCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun unlockWithTimeoutBatchable(timeout: kotlin.UShort, optionalArgs: com.google.home.matter.standard.DoorLockTrait.UnlockWithTimeoutCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun setWeekDayScheduleBatchable(weekDayIndex: kotlin.UByte, userIndex: kotlin.UShort, daysMask: com.google.home.matter.standard.DoorLockTrait.DaysMaskMap, startHour: kotlin.UByte, startMinute: kotlin.UByte, endHour: kotlin.UByte, endMinute: kotlin.UByte): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun getWeekDayScheduleBatchable(weekDayIndex: kotlin.UByte, userIndex: kotlin.UShort): com.google.home.BatchableCommand<com.google.home.matter.standard.DoorLockTrait.GetWeekDayScheduleCommand.Response> { /* compiled code */ }

    public open fun clearWeekDayScheduleBatchable(weekDayIndex: kotlin.UByte, userIndex: kotlin.UShort): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun setYearDayScheduleBatchable(yearDayIndex: kotlin.UByte, userIndex: kotlin.UShort, localStartTime: kotlin.UInt, localEndTime: kotlin.UInt): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun getYearDayScheduleBatchable(yearDayIndex: kotlin.UByte, userIndex: kotlin.UShort): com.google.home.BatchableCommand<com.google.home.matter.standard.DoorLockTrait.GetYearDayScheduleCommand.Response> { /* compiled code */ }

    public open fun clearYearDayScheduleBatchable(yearDayIndex: kotlin.UByte, userIndex: kotlin.UShort): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun setHolidayScheduleBatchable(holidayIndex: kotlin.UByte, localStartTime: kotlin.UInt, localEndTime: kotlin.UInt, operatingMode: com.google.home.matter.standard.DoorLockTrait.OperatingModeEnum): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun getHolidayScheduleBatchable(holidayIndex: kotlin.UByte): com.google.home.BatchableCommand<com.google.home.matter.standard.DoorLockTrait.GetHolidayScheduleCommand.Response> { /* compiled code */ }

    public open fun clearHolidayScheduleBatchable(holidayIndex: kotlin.UByte): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun setUserBatchable(operationType: com.google.home.matter.standard.DoorLockTrait.DataOperationTypeEnum, userIndex: kotlin.UShort, userName: kotlin.String?, userUniqueId: kotlin.UInt?, userStatus: com.google.home.matter.standard.DoorLockTrait.UserStatusEnum?, userType: com.google.home.matter.standard.DoorLockTrait.UserTypeEnum?, credentialRule: com.google.home.matter.standard.DoorLockTrait.CredentialRuleEnum?): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun getUserBatchable(userIndex: kotlin.UShort): com.google.home.BatchableCommand<com.google.home.matter.standard.DoorLockTrait.GetUserCommand.Response> { /* compiled code */ }

    public open fun clearUserBatchable(userIndex: kotlin.UShort): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun setCredentialBatchable(operationType: com.google.home.matter.standard.DoorLockTrait.DataOperationTypeEnum, credential: com.google.home.matter.standard.DoorLockTrait.CredentialStruct, credentialData: kotlin.ByteArray, userIndex: kotlin.UShort?, userStatus: com.google.home.matter.standard.DoorLockTrait.UserStatusEnum?, userType: com.google.home.matter.standard.DoorLockTrait.UserTypeEnum?): com.google.home.BatchableCommand<com.google.home.matter.standard.DoorLockTrait.SetCredentialCommand.Response> { /* compiled code */ }

    public open fun getCredentialStatusBatchable(credential: com.google.home.matter.standard.DoorLockTrait.CredentialStruct): com.google.home.BatchableCommand<com.google.home.matter.standard.DoorLockTrait.GetCredentialStatusCommand.Response> { /* compiled code */ }

    public open fun clearCredentialBatchable(credential: com.google.home.matter.standard.DoorLockTrait.CredentialStruct?): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun unboltDoorBatchable(optionalArgs: com.google.home.matter.standard.DoorLockTrait.UnboltDoorCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun setAliroReaderConfigBatchable(signingKey: kotlin.ByteArray, verificationKey: kotlin.ByteArray, groupIdentifier: kotlin.ByteArray, optionalArgs: com.google.home.matter.standard.DoorLockTrait.SetAliroReaderConfigCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun clearAliroReaderConfigBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}
