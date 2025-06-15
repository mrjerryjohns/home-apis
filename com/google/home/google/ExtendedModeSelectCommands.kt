// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface ExtendedModeSelectCommands {
    public abstract suspend fun changeModeSettings(updateModeSettings: kotlin.collections.List<com.google.home.google.ExtendedModeSelectTrait.ModeSetting>): kotlin.Unit

    public abstract fun changeModeSettingsBatchable(updateModeSettings: kotlin.collections.List<com.google.home.google.ExtendedModeSelectTrait.ModeSetting>): com.google.home.BatchableCommand<kotlin.Unit>
}
