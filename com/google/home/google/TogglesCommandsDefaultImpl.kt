// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface TogglesCommandsDefaultImpl : com.google.home.google.TogglesCommands {
    public open suspend fun changeToggleSettings(updatedToggleSettings: kotlin.collections.List<com.google.home.google.TogglesTrait.ToggleSetting>): kotlin.Unit { /* compiled code */ }

    public open fun changeToggleSettingsBatchable(updatedToggleSettings: kotlin.collections.List<com.google.home.google.TogglesTrait.ToggleSetting>): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}

