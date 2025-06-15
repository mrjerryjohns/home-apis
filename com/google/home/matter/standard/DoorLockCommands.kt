// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface DoorLockCommands {
    public abstract suspend fun lockDoor(optionalArgs: com.google.home.matter.standard.DoorLockTrait.LockDoorCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): kotlin.Unit

    public abstract suspend fun unlockDoor(optionalArgs: com.google.home.matter.standard.DoorLockTrait.UnlockDoorCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): kotlin.Unit

    public abstract suspend fun unlockWithTimeout(timeout: kotlin.UShort, optionalArgs: com.google.home.matter.standard.DoorLockTrait.UnlockWithTimeoutCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): kotlin.Unit

    public abstract suspend fun setWeekDaySchedule(weekDayIndex: kotlin.UByte, userIndex: kotlin.UShort, daysMask: com.google.home.matter.standard.DoorLockTrait.DaysMaskMap, startHour: kotlin.UByte, startMinute: kotlin.UByte, endHour: kotlin.UByte, endMinute: kotlin.UByte): kotlin.Unit

    public abstract suspend fun getWeekDaySchedule(weekDayIndex: kotlin.UByte, userIndex: kotlin.UShort): com.google.home.matter.standard.DoorLockTrait.GetWeekDayScheduleCommand.Response

    public abstract suspend fun clearWeekDaySchedule(weekDayIndex: kotlin.UByte, userIndex: kotlin.UShort): kotlin.Unit

    public abstract suspend fun setYearDaySchedule(yearDayIndex: kotlin.UByte, userIndex: kotlin.UShort, localStartTime: kotlin.UInt, localEndTime: kotlin.UInt): kotlin.Unit

    public abstract suspend fun getYearDaySchedule(yearDayIndex: kotlin.UByte, userIndex: kotlin.UShort): com.google.home.matter.standard.DoorLockTrait.GetYearDayScheduleCommand.Response

    public abstract suspend fun clearYearDaySchedule(yearDayIndex: kotlin.UByte, userIndex: kotlin.UShort): kotlin.Unit

    public abstract suspend fun setHolidaySchedule(holidayIndex: kotlin.UByte, localStartTime: kotlin.UInt, localEndTime: kotlin.UInt, operatingMode: com.google.home.matter.standard.DoorLockTrait.OperatingModeEnum): kotlin.Unit

    public abstract suspend fun getHolidaySchedule(holidayIndex: kotlin.UByte): com.google.home.matter.standard.DoorLockTrait.GetHolidayScheduleCommand.Response

    public abstract suspend fun clearHolidaySchedule(holidayIndex: kotlin.UByte): kotlin.Unit

    public abstract suspend fun setUser(operationType: com.google.home.matter.standard.DoorLockTrait.DataOperationTypeEnum, userIndex: kotlin.UShort, userName: kotlin.String?, userUniqueId: kotlin.UInt?, userStatus: com.google.home.matter.standard.DoorLockTrait.UserStatusEnum?, userType: com.google.home.matter.standard.DoorLockTrait.UserTypeEnum?, credentialRule: com.google.home.matter.standard.DoorLockTrait.CredentialRuleEnum?): kotlin.Unit

    public abstract suspend fun getUser(userIndex: kotlin.UShort): com.google.home.matter.standard.DoorLockTrait.GetUserCommand.Response

    public abstract suspend fun clearUser(userIndex: kotlin.UShort): kotlin.Unit

    public abstract suspend fun setCredential(operationType: com.google.home.matter.standard.DoorLockTrait.DataOperationTypeEnum, credential: com.google.home.matter.standard.DoorLockTrait.CredentialStruct, credentialData: kotlin.ByteArray, userIndex: kotlin.UShort?, userStatus: com.google.home.matter.standard.DoorLockTrait.UserStatusEnum?, userType: com.google.home.matter.standard.DoorLockTrait.UserTypeEnum?): com.google.home.matter.standard.DoorLockTrait.SetCredentialCommand.Response

    public abstract suspend fun getCredentialStatus(credential: com.google.home.matter.standard.DoorLockTrait.CredentialStruct): com.google.home.matter.standard.DoorLockTrait.GetCredentialStatusCommand.Response

    public abstract suspend fun clearCredential(credential: com.google.home.matter.standard.DoorLockTrait.CredentialStruct?): kotlin.Unit

    public abstract suspend fun unboltDoor(optionalArgs: com.google.home.matter.standard.DoorLockTrait.UnboltDoorCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): kotlin.Unit

    public abstract suspend fun setAliroReaderConfig(signingKey: kotlin.ByteArray, verificationKey: kotlin.ByteArray, groupIdentifier: kotlin.ByteArray, optionalArgs: com.google.home.matter.standard.DoorLockTrait.SetAliroReaderConfigCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): kotlin.Unit

    public abstract suspend fun clearAliroReaderConfig(): kotlin.Unit

    public abstract fun lockDoorBatchable(optionalArgs: com.google.home.matter.standard.DoorLockTrait.LockDoorCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun unlockDoorBatchable(optionalArgs: com.google.home.matter.standard.DoorLockTrait.UnlockDoorCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun unlockWithTimeoutBatchable(timeout: kotlin.UShort, optionalArgs: com.google.home.matter.standard.DoorLockTrait.UnlockWithTimeoutCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun setWeekDayScheduleBatchable(weekDayIndex: kotlin.UByte, userIndex: kotlin.UShort, daysMask: com.google.home.matter.standard.DoorLockTrait.DaysMaskMap, startHour: kotlin.UByte, startMinute: kotlin.UByte, endHour: kotlin.UByte, endMinute: kotlin.UByte): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun getWeekDayScheduleBatchable(weekDayIndex: kotlin.UByte, userIndex: kotlin.UShort): com.google.home.BatchableCommand<com.google.home.matter.standard.DoorLockTrait.GetWeekDayScheduleCommand.Response>

    public abstract fun clearWeekDayScheduleBatchable(weekDayIndex: kotlin.UByte, userIndex: kotlin.UShort): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun setYearDayScheduleBatchable(yearDayIndex: kotlin.UByte, userIndex: kotlin.UShort, localStartTime: kotlin.UInt, localEndTime: kotlin.UInt): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun getYearDayScheduleBatchable(yearDayIndex: kotlin.UByte, userIndex: kotlin.UShort): com.google.home.BatchableCommand<com.google.home.matter.standard.DoorLockTrait.GetYearDayScheduleCommand.Response>

    public abstract fun clearYearDayScheduleBatchable(yearDayIndex: kotlin.UByte, userIndex: kotlin.UShort): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun setHolidayScheduleBatchable(holidayIndex: kotlin.UByte, localStartTime: kotlin.UInt, localEndTime: kotlin.UInt, operatingMode: com.google.home.matter.standard.DoorLockTrait.OperatingModeEnum): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun getHolidayScheduleBatchable(holidayIndex: kotlin.UByte): com.google.home.BatchableCommand<com.google.home.matter.standard.DoorLockTrait.GetHolidayScheduleCommand.Response>

    public abstract fun clearHolidayScheduleBatchable(holidayIndex: kotlin.UByte): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun setUserBatchable(operationType: com.google.home.matter.standard.DoorLockTrait.DataOperationTypeEnum, userIndex: kotlin.UShort, userName: kotlin.String?, userUniqueId: kotlin.UInt?, userStatus: com.google.home.matter.standard.DoorLockTrait.UserStatusEnum?, userType: com.google.home.matter.standard.DoorLockTrait.UserTypeEnum?, credentialRule: com.google.home.matter.standard.DoorLockTrait.CredentialRuleEnum?): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun getUserBatchable(userIndex: kotlin.UShort): com.google.home.BatchableCommand<com.google.home.matter.standard.DoorLockTrait.GetUserCommand.Response>

    public abstract fun clearUserBatchable(userIndex: kotlin.UShort): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun setCredentialBatchable(operationType: com.google.home.matter.standard.DoorLockTrait.DataOperationTypeEnum, credential: com.google.home.matter.standard.DoorLockTrait.CredentialStruct, credentialData: kotlin.ByteArray, userIndex: kotlin.UShort?, userStatus: com.google.home.matter.standard.DoorLockTrait.UserStatusEnum?, userType: com.google.home.matter.standard.DoorLockTrait.UserTypeEnum?): com.google.home.BatchableCommand<com.google.home.matter.standard.DoorLockTrait.SetCredentialCommand.Response>

    public abstract fun getCredentialStatusBatchable(credential: com.google.home.matter.standard.DoorLockTrait.CredentialStruct): com.google.home.BatchableCommand<com.google.home.matter.standard.DoorLockTrait.GetCredentialStatusCommand.Response>

    public abstract fun clearCredentialBatchable(credential: com.google.home.matter.standard.DoorLockTrait.CredentialStruct?): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun unboltDoorBatchable(optionalArgs: com.google.home.matter.standard.DoorLockTrait.UnboltDoorCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun setAliroReaderConfigBatchable(signingKey: kotlin.ByteArray, verificationKey: kotlin.ByteArray, groupIdentifier: kotlin.ByteArray, optionalArgs: com.google.home.matter.standard.DoorLockTrait.SetAliroReaderConfigCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun clearAliroReaderConfigBatchable(): com.google.home.BatchableCommand<kotlin.Unit>
}

