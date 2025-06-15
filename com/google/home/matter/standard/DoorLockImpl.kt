// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class DoorLockImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.DoorLockTrait.Attributes) : com.google.home.matter.standard.DoorLock, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.DoorLockTrait.Attributes, com.google.home.Updatable<com.google.home.matter.standard.DoorLock, com.google.home.matter.standard.DoorLockTrait.MutableAttributes> {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.DoorLockTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val actuatorEnabled: kotlin.Boolean? /* compiled code */

    public open val aliroBleAdvertisingVersion: kotlin.UByte? /* compiled code */

    public open val aliroExpeditedTransactionSupportedProtocolVersions: kotlin.collections.List<kotlin.ByteArray>? /* compiled code */

    public open val aliroGroupResolvingKey: kotlin.ByteArray? /* compiled code */

    public open val aliroReaderGroupIdentifier: kotlin.ByteArray? /* compiled code */

    public open val aliroReaderGroupSubIdentifier: kotlin.ByteArray? /* compiled code */

    public open val aliroReaderVerificationKey: kotlin.ByteArray? /* compiled code */

    public open val aliroSupportedBleUwbProtocolVersions: kotlin.collections.List<kotlin.ByteArray>? /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val autoRelockTime: kotlin.UInt? /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val credentialRulesSupport: com.google.home.matter.standard.DoorLockTrait.DlCredentialRuleMask? /* compiled code */

    public open val defaultConfigurationRegister: com.google.home.matter.standard.DoorLockTrait.DlDefaultConfigurationRegister? /* compiled code */

    public open val doorClosedEvents: kotlin.UInt? /* compiled code */

    public open val doorOpenEvents: kotlin.UInt? /* compiled code */

    public open val doorState: com.google.home.matter.standard.DoorLockTrait.DoorStateEnum? /* compiled code */

    public open val enableInsideStatusLed: kotlin.Boolean? /* compiled code */

    public open val enableLocalProgramming: kotlin.Boolean? /* compiled code */

    public open val enableOneTouchLocking: kotlin.Boolean? /* compiled code */

    public open val enablePrivacyModeButton: kotlin.Boolean? /* compiled code */

    public open val expiringUserTimeout: kotlin.UShort? /* compiled code */

    public open val featureMap: com.google.home.matter.standard.DoorLockTrait.Feature /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val language: kotlin.String? /* compiled code */

    public open val ledSettings: kotlin.UByte? /* compiled code */

    public open val localProgrammingFeatures: com.google.home.matter.standard.DoorLockTrait.DlLocalProgrammingFeatures? /* compiled code */

    public open val lockState: com.google.home.matter.standard.DoorLockTrait.DlLockState? /* compiled code */

    public open val lockType: com.google.home.matter.standard.DoorLockTrait.DlLockType? /* compiled code */

    public open val maxPinCodeLength: kotlin.UByte? /* compiled code */

    public open val maxRfidCodeLength: kotlin.UByte? /* compiled code */

    public open val minPinCodeLength: kotlin.UByte? /* compiled code */

    public open val minRfidCodeLength: kotlin.UByte? /* compiled code */

    public open val numberOfAliroCredentialIssuerKeysSupported: kotlin.UShort? /* compiled code */

    public open val numberOfAliroEndpointKeysSupported: kotlin.UShort? /* compiled code */

    public open val numberOfCredentialsSupportedPerUser: kotlin.UByte? /* compiled code */

    public open val numberOfHolidaySchedulesSupported: kotlin.UByte? /* compiled code */

    public open val numberOfPinUsersSupported: kotlin.UShort? /* compiled code */

    public open val numberOfRfidUsersSupported: kotlin.UShort? /* compiled code */

    public open val numberOfTotalUsersSupported: kotlin.UShort? /* compiled code */

    public open val numberOfWeekDaySchedulesSupportedPerUser: kotlin.UByte? /* compiled code */

    public open val numberOfYearDaySchedulesSupportedPerUser: kotlin.UByte? /* compiled code */

    public open val openPeriod: kotlin.UShort? /* compiled code */

    public open val operatingMode: com.google.home.matter.standard.DoorLockTrait.OperatingModeEnum? /* compiled code */

    public open val requirePinforRemoteOperation: kotlin.Boolean? /* compiled code */

    public open val sendPinOverTheAir: kotlin.Boolean? /* compiled code */

    public open val soundVolume: kotlin.UByte? /* compiled code */

    public open val supportedOperatingModes: com.google.home.matter.standard.DoorLockTrait.DlSupportedOperatingModes? /* compiled code */

    public open val userCodeTemporaryDisableTime: kotlin.UByte? /* compiled code */

    public open val wrongCodeEntryLimit: kotlin.UByte? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.DoorLock.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.matter.standard.DoorLock.Command): kotlin.Boolean { /* compiled code */ }

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

    public open suspend fun update(optimisticReturn: (com.google.home.matter.standard.DoorLock) -> kotlin.Unit, init: com.google.home.matter.standard.DoorLockTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.DoorLock { /* compiled code */ }

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

    public open fun toString(): kotlin.String { /* compiled code */ }
}

