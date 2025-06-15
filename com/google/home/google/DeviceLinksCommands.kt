// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface DeviceLinksCommands {
    public abstract suspend fun getDeviceLinks(): com.google.home.google.DeviceLinksTrait.GetDeviceLinksCommand.Response

    public abstract fun getDeviceLinksBatchable(): com.google.home.BatchableCommand<com.google.home.google.DeviceLinksTrait.GetDeviceLinksCommand.Response>
}
