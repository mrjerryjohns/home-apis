// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class DeviceManagement private constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.google.PlatformTraitClient, attributes: com.google.home.google.DeviceManagementTrait.Attributes) : com.google.home.google.PlatformTrait, com.google.home.google.DeviceManagementTrait.Attributes {
    public companion object : com.google.home.TraitFactory<com.google.home.google.DeviceManagement> {
    }

    internal final val attributes: com.google.home.google.DeviceManagementTrait.Attributes /* compiled code */

    public open val factory: com.google.home.TraitFactory<com.google.home.google.DeviceManagement> /* compiled code */

    public final suspend fun moveDevicesToRoom(roomId: kotlin.String, deviceIds: kotlin.collections.List<kotlin.String>): com.google.home.google.DeviceManagementTrait.MoveDevicesToRoomCommand.MoveDevicesToRoomResponse { /* compiled code */ }
}
