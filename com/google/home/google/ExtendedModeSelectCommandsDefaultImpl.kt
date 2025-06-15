// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface ExtendedModeSelectCommandsDefaultImpl : com.google.home.google.ExtendedModeSelectCommands {
    public open suspend fun changeModeSettings(updateModeSettings: kotlin.collections.List<com.google.home.google.ExtendedModeSelectTrait.ModeSetting>): kotlin.Unit { /* compiled code */ }

    public open fun changeModeSettingsBatchable(updateModeSettings: kotlin.collections.List<com.google.home.google.ExtendedModeSelectTrait.ModeSetting>): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}

