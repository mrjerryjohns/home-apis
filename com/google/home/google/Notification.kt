// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class Notification private constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.google.PlatformTraitClient, attributes: com.google.home.google.NotificationTrait.Attributes) : com.google.home.google.PlatformTrait, com.google.home.google.NotificationTrait.Attributes {
    public companion object : com.google.home.TraitFactory<com.google.home.google.Notification> {
        public final fun sendNotifications(title: kotlin.String, optionalArgs: com.google.home.google.NotificationTrait.SendNotificationsCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.automation.Command { /* compiled code */ }

        public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }
    }

    internal final val attributes: com.google.home.google.NotificationTrait.Attributes /* compiled code */

    public open val factory: com.google.home.TraitFactory<com.google.home.google.Notification> /* compiled code */

    public open val structureMembersList: kotlin.collections.List<com.google.home.google.NotificationTrait.User>? /* compiled code */

    public final suspend fun sendNotifications(title: kotlin.String, optionalArgs: com.google.home.google.NotificationTrait.SendNotificationsCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): kotlin.Unit { /* compiled code */ }

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.Notification.Attribute> {
        @androidx.annotation.NonNull structureMembers;

        public open val fieldName: kotlin.String /* compiled code */

        public open val tag: kotlin.UInt /* compiled code */

        public open val typeName: kotlin.String /* compiled code */

        public open val typeEnum: com.google.home.Type /* compiled code */

        public open val descriptor: com.google.home.Descriptor /* compiled code */

        public final val isNullable: kotlin.Boolean /* compiled code */
    }
}

