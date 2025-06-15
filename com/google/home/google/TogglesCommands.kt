// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface TogglesCommands {
    public abstract suspend fun changeToggleSettings(updatedToggleSettings: kotlin.collections.List<com.google.home.google.TogglesTrait.ToggleSetting>): kotlin.Unit

    public abstract fun changeToggleSettingsBatchable(updatedToggleSettings: kotlin.collections.List<com.google.home.google.TogglesTrait.ToggleSetting>): com.google.home.BatchableCommand<kotlin.Unit>
}
