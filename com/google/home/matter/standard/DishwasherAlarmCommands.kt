// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface DishwasherAlarmCommands {
    public abstract suspend fun reset(alarms: com.google.home.matter.standard.DishwasherAlarmTrait.AlarmBitmap): kotlin.Unit

    public abstract suspend fun modifyEnabledAlarms(mask: com.google.home.matter.standard.DishwasherAlarmTrait.AlarmBitmap): kotlin.Unit

    public abstract fun resetBatchable(alarms: com.google.home.matter.standard.DishwasherAlarmTrait.AlarmBitmap): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun modifyEnabledAlarmsBatchable(mask: com.google.home.matter.standard.DishwasherAlarmTrait.AlarmBitmap): com.google.home.BatchableCommand<kotlin.Unit>
}

