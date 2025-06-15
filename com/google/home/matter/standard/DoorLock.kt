// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface DoorLock : com.google.home.matter.standard.DoorLockTrait.Attributes, com.google.home.matter.MatterTrait, com.google.home.Updatable<com.google.home.matter.standard.DoorLock, com.google.home.matter.standard.DoorLockTrait.MutableAttributes>, com.google.home.matter.standard.DoorLockCommands {
    public companion object : com.google.home.TraitFactory<com.google.home.matter.standard.DoorLock> {
        public final val lockState: com.google.home.automation.Attribute<com.google.home.matter.standard.DoorLockTrait.DlLockState?> /* compiled code */
            public final get

        public final val lockType: com.google.home.automation.Attribute<com.google.home.matter.standard.DoorLockTrait.DlLockType?> /* compiled code */
            public final get

        public final val actuatorEnabled: com.google.home.automation.Attribute<kotlin.Boolean?> /* compiled code */
            public final get

        public final val doorState: com.google.home.automation.Attribute<com.google.home.matter.standard.DoorLockTrait.DoorStateEnum?> /* compiled code */
            public final get

        public final val doorOpenEvents: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val doorClosedEvents: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val openPeriod: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val numberOfTotalUsersSupported: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val numberOfPinUsersSupported: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val numberOfRfidUsersSupported: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val numberOfWeekDaySchedulesSupportedPerUser: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val numberOfYearDaySchedulesSupportedPerUser: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val numberOfHolidaySchedulesSupported: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val maxPinCodeLength: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val minPinCodeLength: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val maxRfidCodeLength: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val minRfidCodeLength: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val credentialRulesSupport: com.google.home.automation.Attribute<com.google.home.matter.standard.DoorLockTrait.DlCredentialRuleMask?> /* compiled code */
            public final get

        public final val numberOfCredentialsSupportedPerUser: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val language: com.google.home.automation.Attribute<kotlin.String?> /* compiled code */
            public final get

        public final val ledSettings: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val autoRelockTime: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val soundVolume: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val operatingMode: com.google.home.automation.Attribute<com.google.home.matter.standard.DoorLockTrait.OperatingModeEnum?> /* compiled code */
            public final get

        public final val supportedOperatingModes: com.google.home.automation.Attribute<com.google.home.matter.standard.DoorLockTrait.DlSupportedOperatingModes?> /* compiled code */
            public final get

        public final val defaultConfigurationRegister: com.google.home.automation.Attribute<com.google.home.matter.standard.DoorLockTrait.DlDefaultConfigurationRegister?> /* compiled code */
            public final get

        public final val enableLocalProgramming: com.google.home.automation.Attribute<kotlin.Boolean?> /* compiled code */
            public final get

        public final val enableOneTouchLocking: com.google.home.automation.Attribute<kotlin.Boolean?> /* compiled code */
            public final get

        public final val enableInsideStatusLed: com.google.home.automation.Attribute<kotlin.Boolean?> /* compiled code */
            public final get

        public final val enablePrivacyModeButton: com.google.home.automation.Attribute<kotlin.Boolean?> /* compiled code */
            public final get

        public final val localProgrammingFeatures: com.google.home.automation.Attribute<com.google.home.matter.standard.DoorLockTrait.DlLocalProgrammingFeatures?> /* compiled code */
            public final get

        public final val wrongCodeEntryLimit: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val userCodeTemporaryDisableTime: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val sendPinOverTheAir: com.google.home.automation.Attribute<kotlin.Boolean?> /* compiled code */
            public final get

        public final val requirePinforRemoteOperation: com.google.home.automation.Attribute<kotlin.Boolean?> /* compiled code */
            public final get

        public final val expiringUserTimeout: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val aliroReaderVerificationKey: com.google.home.automation.Attribute<kotlin.ByteArray?> /* compiled code */
            public final get

        public final val aliroReaderGroupIdentifier: com.google.home.automation.Attribute<kotlin.ByteArray?> /* compiled code */
            public final get

        public final val aliroReaderGroupSubIdentifier: com.google.home.automation.Attribute<kotlin.ByteArray?> /* compiled code */
            public final get

        public final val aliroExpeditedTransactionSupportedProtocolVersions: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.ByteArray>?> /* compiled code */
            public final get

        public final val aliroGroupResolvingKey: com.google.home.automation.Attribute<kotlin.ByteArray?> /* compiled code */
            public final get

        public final val aliroSupportedBleUwbProtocolVersions: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.ByteArray>?> /* compiled code */
            public final get

        public final val aliroBleAdvertisingVersion: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val numberOfAliroCredentialIssuerKeysSupported: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val numberOfAliroEndpointKeysSupported: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val generatedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val acceptedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val attributeList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val featureMap: com.google.home.automation.Attribute<com.google.home.matter.standard.DoorLockTrait.Feature> /* compiled code */
            public final get

        public final val clusterRevision: com.google.home.automation.Attribute<kotlin.UShort> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock?>.lockState: com.google.home.automation.TypedExpression<com.google.home.matter.standard.DoorLockTrait.DlLockState?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock?>.lockType: com.google.home.automation.TypedExpression<com.google.home.matter.standard.DoorLockTrait.DlLockType?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock?>.actuatorEnabled: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock?>.doorState: com.google.home.automation.TypedExpression<com.google.home.matter.standard.DoorLockTrait.DoorStateEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock?>.doorOpenEvents: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock?>.doorClosedEvents: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock?>.openPeriod: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock?>.numberOfTotalUsersSupported: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock?>.numberOfPinUsersSupported: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock?>.numberOfRfidUsersSupported: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock?>.numberOfWeekDaySchedulesSupportedPerUser: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock?>.numberOfYearDaySchedulesSupportedPerUser: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock?>.numberOfHolidaySchedulesSupported: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock?>.maxPinCodeLength: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock?>.minPinCodeLength: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock?>.maxRfidCodeLength: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock?>.minRfidCodeLength: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock?>.credentialRulesSupport: com.google.home.automation.TypedExpression<com.google.home.matter.standard.DoorLockTrait.DlCredentialRuleMask?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock?>.numberOfCredentialsSupportedPerUser: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock?>.language: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock?>.ledSettings: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock?>.autoRelockTime: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock?>.soundVolume: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock?>.operatingMode: com.google.home.automation.TypedExpression<com.google.home.matter.standard.DoorLockTrait.OperatingModeEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock?>.supportedOperatingModes: com.google.home.automation.TypedExpression<com.google.home.matter.standard.DoorLockTrait.DlSupportedOperatingModes?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock?>.defaultConfigurationRegister: com.google.home.automation.TypedExpression<com.google.home.matter.standard.DoorLockTrait.DlDefaultConfigurationRegister?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock?>.enableLocalProgramming: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock?>.enableOneTouchLocking: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock?>.enableInsideStatusLed: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock?>.enablePrivacyModeButton: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock?>.localProgrammingFeatures: com.google.home.automation.TypedExpression<com.google.home.matter.standard.DoorLockTrait.DlLocalProgrammingFeatures?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock?>.wrongCodeEntryLimit: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock?>.userCodeTemporaryDisableTime: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock?>.sendPinOverTheAir: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock?>.requirePinforRemoteOperation: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock?>.expiringUserTimeout: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock?>.aliroReaderVerificationKey: com.google.home.automation.TypedExpression<kotlin.ByteArray?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock?>.aliroReaderGroupIdentifier: com.google.home.automation.TypedExpression<kotlin.ByteArray?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock?>.aliroReaderGroupSubIdentifier: com.google.home.automation.TypedExpression<kotlin.ByteArray?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock?>.aliroExpeditedTransactionSupportedProtocolVersions: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.ByteArray>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock?>.aliroGroupResolvingKey: com.google.home.automation.TypedExpression<kotlin.ByteArray?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock?>.aliroSupportedBleUwbProtocolVersions: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.ByteArray>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock?>.aliroBleAdvertisingVersion: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock?>.numberOfAliroCredentialIssuerKeysSupported: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock?>.numberOfAliroEndpointKeysSupported: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock?>.featureMap: com.google.home.automation.TypedExpression<com.google.home.matter.standard.DoorLockTrait.Feature> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.DoorLock>.setDoorOpenEvents(value: kotlin.UInt): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.DoorLock>.setDoorClosedEvents(value: kotlin.UInt): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.DoorLock>.setOpenPeriod(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.DoorLock>.setLanguage(value: kotlin.String): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.DoorLock>.setLedSettings(value: kotlin.UByte): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.DoorLock>.setAutoRelockTime(value: kotlin.UInt): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.DoorLock>.setSoundVolume(value: kotlin.UByte): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.DoorLock>.setOperatingMode(value: com.google.home.matter.standard.DoorLockTrait.OperatingModeEnum): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.DoorLock>.setEnableLocalProgramming(value: kotlin.Boolean): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.DoorLock>.setEnableOneTouchLocking(value: kotlin.Boolean): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.DoorLock>.setEnableInsideStatusLed(value: kotlin.Boolean): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.DoorLock>.setEnablePrivacyModeButton(value: kotlin.Boolean): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.DoorLock>.setLocalProgrammingFeatures(value: com.google.home.matter.standard.DoorLockTrait.DlLocalProgrammingFeatures): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.DoorLock>.setWrongCodeEntryLimit(value: kotlin.UByte): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.DoorLock>.setUserCodeTemporaryDisableTime(value: kotlin.UByte): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.DoorLock>.setSendPinOverTheAir(value: kotlin.Boolean): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.DoorLock>.setRequirePinforRemoteOperation(value: kotlin.Boolean): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.DoorLock>.setExpiringUserTimeout(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun lockDoor(optionalArgs: com.google.home.matter.standard.DoorLockTrait.LockDoorCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.automation.Command { /* compiled code */ }

        public final fun unlockDoor(optionalArgs: com.google.home.matter.standard.DoorLockTrait.UnlockDoorCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.automation.Command { /* compiled code */ }

        public final fun unlockWithTimeout(timeout: kotlin.UShort, optionalArgs: com.google.home.matter.standard.DoorLockTrait.UnlockWithTimeoutCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.automation.Command { /* compiled code */ }

        public final fun setWeekDaySchedule(weekDayIndex: kotlin.UByte, userIndex: kotlin.UShort, daysMask: com.google.home.matter.standard.DoorLockTrait.DaysMaskMap, startHour: kotlin.UByte, startMinute: kotlin.UByte, endHour: kotlin.UByte, endMinute: kotlin.UByte): com.google.home.automation.Command { /* compiled code */ }

        public final fun getWeekDaySchedule(weekDayIndex: kotlin.UByte, userIndex: kotlin.UShort): com.google.home.automation.Command { /* compiled code */ }

        public final fun clearWeekDaySchedule(weekDayIndex: kotlin.UByte, userIndex: kotlin.UShort): com.google.home.automation.Command { /* compiled code */ }

        public final fun setYearDaySchedule(yearDayIndex: kotlin.UByte, userIndex: kotlin.UShort, localStartTime: kotlin.UInt, localEndTime: kotlin.UInt): com.google.home.automation.Command { /* compiled code */ }

        public final fun getYearDaySchedule(yearDayIndex: kotlin.UByte, userIndex: kotlin.UShort): com.google.home.automation.Command { /* compiled code */ }

        public final fun clearYearDaySchedule(yearDayIndex: kotlin.UByte, userIndex: kotlin.UShort): com.google.home.automation.Command { /* compiled code */ }

        public final fun setHolidaySchedule(holidayIndex: kotlin.UByte, localStartTime: kotlin.UInt, localEndTime: kotlin.UInt, operatingMode: com.google.home.matter.standard.DoorLockTrait.OperatingModeEnum): com.google.home.automation.Command { /* compiled code */ }

        public final fun getHolidaySchedule(holidayIndex: kotlin.UByte): com.google.home.automation.Command { /* compiled code */ }

        public final fun clearHolidaySchedule(holidayIndex: kotlin.UByte): com.google.home.automation.Command { /* compiled code */ }

        public final fun setUser(operationType: com.google.home.matter.standard.DoorLockTrait.DataOperationTypeEnum, userIndex: kotlin.UShort, userName: kotlin.String?, userUniqueId: kotlin.UInt?, userStatus: com.google.home.matter.standard.DoorLockTrait.UserStatusEnum?, userType: com.google.home.matter.standard.DoorLockTrait.UserTypeEnum?, credentialRule: com.google.home.matter.standard.DoorLockTrait.CredentialRuleEnum?): com.google.home.automation.Command { /* compiled code */ }

        public final fun getUser(userIndex: kotlin.UShort): com.google.home.automation.Command { /* compiled code */ }

        public final fun clearUser(userIndex: kotlin.UShort): com.google.home.automation.Command { /* compiled code */ }

        public final fun unboltDoor(optionalArgs: com.google.home.matter.standard.DoorLockTrait.UnboltDoorCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.automation.Command { /* compiled code */ }

        public final fun setAliroReaderConfig(signingKey: kotlin.ByteArray, verificationKey: kotlin.ByteArray, groupIdentifier: kotlin.ByteArray, optionalArgs: com.google.home.matter.standard.DoorLockTrait.SetAliroReaderConfigCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.automation.Command { /* compiled code */ }

        public final fun clearAliroReaderConfig(): com.google.home.automation.Command { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.matter.standard.DoorLock> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.matter.standard.DoorLock.Attribute): kotlin.Boolean

    public abstract fun supports(command: com.google.home.matter.standard.DoorLock.Command): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.DoorLock.Attribute> {
        @androidx.annotation.NonNull lockState,

        @androidx.annotation.NonNull lockType,

        @androidx.annotation.NonNull actuatorEnabled,

        @androidx.annotation.NonNull doorState,

        @androidx.annotation.NonNull doorOpenEvents,

        @androidx.annotation.NonNull doorClosedEvents,

        @androidx.annotation.NonNull openPeriod,

        @androidx.annotation.NonNull numberOfTotalUsersSupported,

        @androidx.annotation.NonNull numberOfPinUsersSupported,

        @androidx.annotation.NonNull numberOfRfidUsersSupported,

        @androidx.annotation.NonNull numberOfWeekDaySchedulesSupportedPerUser,

        @androidx.annotation.NonNull numberOfYearDaySchedulesSupportedPerUser,

        @androidx.annotation.NonNull numberOfHolidaySchedulesSupported,

        @androidx.annotation.NonNull maxPinCodeLength,

        @androidx.annotation.NonNull minPinCodeLength,

        @androidx.annotation.NonNull maxRfidCodeLength,

        @androidx.annotation.NonNull minRfidCodeLength,

        @androidx.annotation.NonNull credentialRulesSupport,

        @androidx.annotation.NonNull numberOfCredentialsSupportedPerUser,

        @androidx.annotation.NonNull language,

        @androidx.annotation.NonNull ledSettings,

        @androidx.annotation.NonNull autoRelockTime,

        @androidx.annotation.NonNull soundVolume,

        @androidx.annotation.NonNull operatingMode,

        @androidx.annotation.NonNull supportedOperatingModes,

        @androidx.annotation.NonNull defaultConfigurationRegister,

        @androidx.annotation.NonNull enableLocalProgramming,

        @androidx.annotation.NonNull enableOneTouchLocking,

        @androidx.annotation.NonNull enableInsideStatusLed,

        @androidx.annotation.NonNull enablePrivacyModeButton,

        @androidx.annotation.NonNull localProgrammingFeatures,

        @androidx.annotation.NonNull wrongCodeEntryLimit,

        @androidx.annotation.NonNull userCodeTemporaryDisableTime,

        @androidx.annotation.NonNull sendPinOverTheAir,

        @androidx.annotation.NonNull requirePinforRemoteOperation,

        @androidx.annotation.NonNull expiringUserTimeout,

        @androidx.annotation.NonNull aliroReaderVerificationKey,

        @androidx.annotation.NonNull aliroReaderGroupIdentifier,

        @androidx.annotation.NonNull aliroReaderGroupSubIdentifier,

        @androidx.annotation.NonNull aliroExpeditedTransactionSupportedProtocolVersions,

        @androidx.annotation.NonNull aliroGroupResolvingKey,

        @androidx.annotation.NonNull aliroSupportedBleUwbProtocolVersions,

        @androidx.annotation.NonNull aliroBleAdvertisingVersion,

        @androidx.annotation.NonNull numberOfAliroCredentialIssuerKeysSupported,

        @androidx.annotation.NonNull numberOfAliroEndpointKeysSupported,

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

    public final enum class Command private constructor(tag: kotlin.UInt) : kotlin.Enum<com.google.home.matter.standard.DoorLock.Command> {
        @androidx.annotation.NonNull LockDoor,

        @androidx.annotation.NonNull UnlockDoor,

        @androidx.annotation.NonNull UnlockWithTimeout,

        @androidx.annotation.NonNull SetWeekDaySchedule,

        @androidx.annotation.NonNull GetWeekDaySchedule,

        @androidx.annotation.NonNull ClearWeekDaySchedule,

        @androidx.annotation.NonNull SetYearDaySchedule,

        @androidx.annotation.NonNull GetYearDaySchedule,

        @androidx.annotation.NonNull ClearYearDaySchedule,

        @androidx.annotation.NonNull SetHolidaySchedule,

        @androidx.annotation.NonNull GetHolidaySchedule,

        @androidx.annotation.NonNull ClearHolidaySchedule,

        @androidx.annotation.NonNull SetUser,

        @androidx.annotation.NonNull GetUser,

        @androidx.annotation.NonNull ClearUser,

        @androidx.annotation.NonNull SetCredential,

        @androidx.annotation.NonNull GetCredentialStatus,

        @androidx.annotation.NonNull ClearCredential,

        @androidx.annotation.NonNull UnboltDoor,

        @androidx.annotation.NonNull SetAliroReaderConfig,

        @androidx.annotation.NonNull ClearAliroReaderConfig;

        public final val tag: kotlin.UInt /* compiled code */
    }

    public final class DoorLockAlarmEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.DoorLockTrait.DoorLockAlarm) : com.google.home.Event, com.google.home.matter.standard.DoorLockTrait.DoorLockAlarm {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.DoorLock.DoorLockAlarmEvent> {
            public final val alarmCode: com.google.home.automation.EventField<com.google.home.matter.standard.DoorLockTrait.AlarmCodeEnum?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock.DoorLockAlarmEvent?>.alarmCode: com.google.home.automation.TypedExpression<com.google.home.matter.standard.DoorLockTrait.AlarmCodeEnum?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.DoorLockTrait.DoorLockAlarm /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val alarmCode: com.google.home.matter.standard.DoorLockTrait.AlarmCodeEnum? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.DoorLock.DoorLockAlarmEvent.EventFields> {
            @androidx.annotation.NonNull alarmCode;

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
    }

    public final class DoorStateChangeEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.DoorLockTrait.DoorStateChange) : com.google.home.Event, com.google.home.matter.standard.DoorLockTrait.DoorStateChange {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.DoorLock.DoorStateChangeEvent> {
            public final val doorState: com.google.home.automation.EventField<com.google.home.matter.standard.DoorLockTrait.DoorStateEnum?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock.DoorStateChangeEvent?>.doorState: com.google.home.automation.TypedExpression<com.google.home.matter.standard.DoorLockTrait.DoorStateEnum?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.DoorLockTrait.DoorStateChange /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val doorState: com.google.home.matter.standard.DoorLockTrait.DoorStateEnum? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.DoorLock.DoorStateChangeEvent.EventFields> {
            @androidx.annotation.NonNull doorState;

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
    }

    public final class LockOperationEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.DoorLockTrait.LockOperation) : com.google.home.Event, com.google.home.matter.standard.DoorLockTrait.LockOperation {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.DoorLock.LockOperationEvent> {
            public final val lockOperationType: com.google.home.automation.EventField<com.google.home.matter.standard.DoorLockTrait.LockOperationTypeEnum?> /* compiled code */
                public final get

            public final val operationSource: com.google.home.automation.EventField<com.google.home.matter.standard.DoorLockTrait.OperationSourceEnum?> /* compiled code */
                public final get

            public final val userIndex: com.google.home.automation.EventField<kotlin.UShort?> /* compiled code */
                public final get

            public final val fabricIndex: com.google.home.automation.EventField<kotlin.UByte?> /* compiled code */
                public final get

            public final val sourceNode: com.google.home.automation.EventField<kotlin.ULong?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock.LockOperationEvent?>.lockOperationType: com.google.home.automation.TypedExpression<com.google.home.matter.standard.DoorLockTrait.LockOperationTypeEnum?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock.LockOperationEvent?>.operationSource: com.google.home.automation.TypedExpression<com.google.home.matter.standard.DoorLockTrait.OperationSourceEnum?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock.LockOperationEvent?>.userIndex: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock.LockOperationEvent?>.fabricIndex: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock.LockOperationEvent?>.sourceNode: com.google.home.automation.TypedExpression<kotlin.ULong?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.DoorLockTrait.LockOperation /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val credentials: kotlin.collections.List<com.google.home.matter.standard.DoorLockTrait.CredentialStruct>? /* compiled code */

        public open val fabricIndex: kotlin.UByte? /* compiled code */

        public open val lockOperationType: com.google.home.matter.standard.DoorLockTrait.LockOperationTypeEnum? /* compiled code */

        public open val operationSource: com.google.home.matter.standard.DoorLockTrait.OperationSourceEnum? /* compiled code */

        public open val sourceNode: kotlin.ULong? /* compiled code */

        public open val userIndex: kotlin.UShort? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.DoorLock.LockOperationEvent.EventFields> {
            @androidx.annotation.NonNull lockOperationType,

            @androidx.annotation.NonNull operationSource,

            @androidx.annotation.NonNull userIndex,

            @androidx.annotation.NonNull fabricIndex,

            @androidx.annotation.NonNull sourceNode,

            @androidx.annotation.NonNull credentials;

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
    }

    public final class LockOperationErrorEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.DoorLockTrait.LockOperationError) : com.google.home.Event, com.google.home.matter.standard.DoorLockTrait.LockOperationError {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.DoorLock.LockOperationErrorEvent> {
            public final val lockOperationType: com.google.home.automation.EventField<com.google.home.matter.standard.DoorLockTrait.LockOperationTypeEnum?> /* compiled code */
                public final get

            public final val operationSource: com.google.home.automation.EventField<com.google.home.matter.standard.DoorLockTrait.OperationSourceEnum?> /* compiled code */
                public final get

            public final val operationError: com.google.home.automation.EventField<com.google.home.matter.standard.DoorLockTrait.OperationErrorEnum?> /* compiled code */
                public final get

            public final val userIndex: com.google.home.automation.EventField<kotlin.UShort?> /* compiled code */
                public final get

            public final val fabricIndex: com.google.home.automation.EventField<kotlin.UByte?> /* compiled code */
                public final get

            public final val sourceNode: com.google.home.automation.EventField<kotlin.ULong?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock.LockOperationErrorEvent?>.lockOperationType: com.google.home.automation.TypedExpression<com.google.home.matter.standard.DoorLockTrait.LockOperationTypeEnum?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock.LockOperationErrorEvent?>.operationSource: com.google.home.automation.TypedExpression<com.google.home.matter.standard.DoorLockTrait.OperationSourceEnum?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock.LockOperationErrorEvent?>.operationError: com.google.home.automation.TypedExpression<com.google.home.matter.standard.DoorLockTrait.OperationErrorEnum?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock.LockOperationErrorEvent?>.userIndex: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock.LockOperationErrorEvent?>.fabricIndex: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock.LockOperationErrorEvent?>.sourceNode: com.google.home.automation.TypedExpression<kotlin.ULong?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.DoorLockTrait.LockOperationError /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val credentials: kotlin.collections.List<com.google.home.matter.standard.DoorLockTrait.CredentialStruct>? /* compiled code */

        public open val fabricIndex: kotlin.UByte? /* compiled code */

        public open val lockOperationType: com.google.home.matter.standard.DoorLockTrait.LockOperationTypeEnum? /* compiled code */

        public open val operationError: com.google.home.matter.standard.DoorLockTrait.OperationErrorEnum? /* compiled code */

        public open val operationSource: com.google.home.matter.standard.DoorLockTrait.OperationSourceEnum? /* compiled code */

        public open val sourceNode: kotlin.ULong? /* compiled code */

        public open val userIndex: kotlin.UShort? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.DoorLock.LockOperationErrorEvent.EventFields> {
            @androidx.annotation.NonNull lockOperationType,

            @androidx.annotation.NonNull operationSource,

            @androidx.annotation.NonNull operationError,

            @androidx.annotation.NonNull userIndex,

            @androidx.annotation.NonNull fabricIndex,

            @androidx.annotation.NonNull sourceNode,

            @androidx.annotation.NonNull credentials;

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
    }

    public final class LockUserChangeEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.DoorLockTrait.LockUserChange) : com.google.home.Event, com.google.home.matter.standard.DoorLockTrait.LockUserChange {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.DoorLock.LockUserChangeEvent> {
            public final val lockDataType: com.google.home.automation.EventField<com.google.home.matter.standard.DoorLockTrait.LockDataTypeEnum?> /* compiled code */
                public final get

            public final val dataOperationType: com.google.home.automation.EventField<com.google.home.matter.standard.DoorLockTrait.DataOperationTypeEnum?> /* compiled code */
                public final get

            public final val operationSource: com.google.home.automation.EventField<com.google.home.matter.standard.DoorLockTrait.OperationSourceEnum?> /* compiled code */
                public final get

            public final val userIndex: com.google.home.automation.EventField<kotlin.UShort?> /* compiled code */
                public final get

            public final val fabricIndex: com.google.home.automation.EventField<kotlin.UByte?> /* compiled code */
                public final get

            public final val sourceNode: com.google.home.automation.EventField<kotlin.ULong?> /* compiled code */
                public final get

            public final val dataIndex: com.google.home.automation.EventField<kotlin.UShort?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock.LockUserChangeEvent?>.lockDataType: com.google.home.automation.TypedExpression<com.google.home.matter.standard.DoorLockTrait.LockDataTypeEnum?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock.LockUserChangeEvent?>.dataOperationType: com.google.home.automation.TypedExpression<com.google.home.matter.standard.DoorLockTrait.DataOperationTypeEnum?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock.LockUserChangeEvent?>.operationSource: com.google.home.automation.TypedExpression<com.google.home.matter.standard.DoorLockTrait.OperationSourceEnum?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock.LockUserChangeEvent?>.userIndex: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock.LockUserChangeEvent?>.fabricIndex: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock.LockUserChangeEvent?>.sourceNode: com.google.home.automation.TypedExpression<kotlin.ULong?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DoorLock.LockUserChangeEvent?>.dataIndex: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.DoorLockTrait.LockUserChange /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val dataIndex: kotlin.UShort? /* compiled code */

        public open val dataOperationType: com.google.home.matter.standard.DoorLockTrait.DataOperationTypeEnum? /* compiled code */

        public open val fabricIndex: kotlin.UByte? /* compiled code */

        public open val lockDataType: com.google.home.matter.standard.DoorLockTrait.LockDataTypeEnum? /* compiled code */

        public open val operationSource: com.google.home.matter.standard.DoorLockTrait.OperationSourceEnum? /* compiled code */

        public open val sourceNode: kotlin.ULong? /* compiled code */

        public open val userIndex: kotlin.UShort? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.DoorLock.LockUserChangeEvent.EventFields> {
            @androidx.annotation.NonNull lockDataType,

            @androidx.annotation.NonNull dataOperationType,

            @androidx.annotation.NonNull operationSource,

            @androidx.annotation.NonNull userIndex,

            @androidx.annotation.NonNull fabricIndex,

            @androidx.annotation.NonNull sourceNode,

            @androidx.annotation.NonNull dataIndex;

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
    }
}

