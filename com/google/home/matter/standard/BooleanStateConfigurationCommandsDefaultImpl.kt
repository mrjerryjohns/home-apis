// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface BooleanStateConfigurationCommandsDefaultImpl : com.google.home.matter.standard.BooleanStateConfigurationCommands {
    public open suspend fun suppressAlarm(alarmsToSuppress: com.google.home.matter.standard.BooleanStateConfigurationTrait.AlarmModeBitmap): kotlin.Unit { /* compiled code */ }

    public open suspend fun enableDisableAlarm(alarmsToEnableDisable: com.google.home.matter.standard.BooleanStateConfigurationTrait.AlarmModeBitmap): kotlin.Unit { /* compiled code */ }

    public open fun suppressAlarmBatchable(alarmsToSuppress: com.google.home.matter.standard.BooleanStateConfigurationTrait.AlarmModeBitmap): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun enableDisableAlarmBatchable(alarmsToEnableDisable: com.google.home.matter.standard.BooleanStateConfigurationTrait.AlarmModeBitmap): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}
