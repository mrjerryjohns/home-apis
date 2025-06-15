// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class RoomManagement private constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.google.PlatformTraitClient, attributes: com.google.home.google.RoomManagementTrait.Attributes) : com.google.home.google.PlatformTrait, com.google.home.google.RoomManagementTrait.Attributes {
    public companion object : com.google.home.TraitFactory<com.google.home.google.RoomManagement> {
    }

    internal final val attributes: com.google.home.google.RoomManagementTrait.Attributes /* compiled code */

    public open val factory: com.google.home.TraitFactory<com.google.home.google.RoomManagement> /* compiled code */

    public final suspend fun createRoom(name: kotlin.String): com.google.home.google.RoomManagementTrait.CreateRoomCommand.CreateRoomResponse { /* compiled code */ }

    public final suspend fun deleteRoom(roomId: kotlin.String): kotlin.Unit { /* compiled code */ }
}

