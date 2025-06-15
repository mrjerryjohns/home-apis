// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface BooleanStateConfigurationCommands {
    public abstract suspend fun suppressAlarm(alarmsToSuppress: com.google.home.matter.standard.BooleanStateConfigurationTrait.AlarmModeBitmap): kotlin.Unit

    public abstract suspend fun enableDisableAlarm(alarmsToEnableDisable: com.google.home.matter.standard.BooleanStateConfigurationTrait.AlarmModeBitmap): kotlin.Unit

    public abstract fun suppressAlarmBatchable(alarmsToSuppress: com.google.home.matter.standard.BooleanStateConfigurationTrait.AlarmModeBitmap): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun enableDisableAlarmBatchable(alarmsToEnableDisable: com.google.home.matter.standard.BooleanStateConfigurationTrait.AlarmModeBitmap): com.google.home.BatchableCommand<kotlin.Unit>
}

