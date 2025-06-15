// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface DeviceLocationCommandsDefaultImpl : com.google.home.google.DeviceLocationCommands {
    public open suspend fun setSpokenLocation(spokenLocation: com.google.home.google.DeviceLocationTrait.Location): kotlin.Unit { /* compiled code */ }

    public open fun setSpokenLocationBatchable(spokenLocation: com.google.home.google.DeviceLocationTrait.Location): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}
