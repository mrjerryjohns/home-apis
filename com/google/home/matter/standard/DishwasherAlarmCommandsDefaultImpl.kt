// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface DishwasherAlarmCommandsDefaultImpl : com.google.home.matter.standard.DishwasherAlarmCommands {
    public open suspend fun reset(alarms: com.google.home.matter.standard.DishwasherAlarmTrait.AlarmBitmap): kotlin.Unit { /* compiled code */ }

    public open suspend fun modifyEnabledAlarms(mask: com.google.home.matter.standard.DishwasherAlarmTrait.AlarmBitmap): kotlin.Unit { /* compiled code */ }

    public open fun resetBatchable(alarms: com.google.home.matter.standard.DishwasherAlarmTrait.AlarmBitmap): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun modifyEnabledAlarmsBatchable(mask: com.google.home.matter.standard.DishwasherAlarmTrait.AlarmBitmap): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}

