// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface DeviceLinksCommandsDefaultImpl : com.google.home.google.DeviceLinksCommands {
    public open suspend fun getDeviceLinks(): com.google.home.google.DeviceLinksTrait.GetDeviceLinksCommand.Response { /* compiled code */ }

    public open fun getDeviceLinksBatchable(): com.google.home.BatchableCommand<com.google.home.google.DeviceLinksTrait.GetDeviceLinksCommand.Response> { /* compiled code */ }
}

