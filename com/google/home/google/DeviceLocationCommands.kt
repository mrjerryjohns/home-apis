// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface DeviceLocationCommands {
    public abstract suspend fun setSpokenLocation(spokenLocation: com.google.home.google.DeviceLocationTrait.Location): kotlin.Unit

    public abstract fun setSpokenLocationBatchable(spokenLocation: com.google.home.google.DeviceLocationTrait.Location): com.google.home.BatchableCommand<kotlin.Unit>
}
