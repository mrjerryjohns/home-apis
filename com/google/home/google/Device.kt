// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class Device private constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.google.PlatformTraitClient, attributes: com.google.home.google.DeviceTrait.Attributes) : com.google.home.google.PlatformTrait, com.google.home.google.DeviceTrait.Attributes, com.google.home.Updatable<com.google.home.google.Device, com.google.home.google.DeviceTrait.MutableAttributes> {
    public companion object : com.google.home.TraitFactory<com.google.home.google.Device> {
        public final val Name: com.google.home.automation.Attribute<kotlin.String?> /* compiled code */

        public final val structureObjectId: com.google.home.automation.Attribute<kotlin.String?> /* compiled code */

        public final val roomObjectId: com.google.home.automation.Attribute<kotlin.String?> /* compiled code */

        public final val descriptiveType: com.google.home.automation.Attribute<kotlin.String?> /* compiled code */

        public final val isSelfDevice: com.google.home.automation.Attribute<kotlin.Boolean?> /* compiled code */

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<com.google.home.google.Device>.Name: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<com.google.home.google.Device>.structureObjectId: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<com.google.home.google.Device>.roomObjectId: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<com.google.home.google.Device>.descriptiveType: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<com.google.home.google.Device>.isSelfDevice: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
            public final get

        public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final fun deviceTraitDefault(): com.google.home.automation.Command { /* compiled code */ }
    }

    internal final val attributes: com.google.home.google.DeviceTrait.Attributes /* compiled code */

    public open val factory: com.google.home.TraitFactory<com.google.home.google.Device> /* compiled code */

    public open val Name: kotlin.String? /* compiled code */

    public open val descriptiveType: kotlin.String? /* compiled code */

    public open val isSelfDevice: kotlin.Boolean? /* compiled code */

    public open val roomObjectId: kotlin.String? /* compiled code */

    public open val structureObjectId: kotlin.String? /* compiled code */

    public open suspend fun update(optimisticReturn: (com.google.home.google.Device) -> kotlin.Unit, init: com.google.home.google.DeviceTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.google.Device { /* compiled code */ }

    public final suspend fun deviceTraitDefault(): com.google.home.google.DeviceTrait.DeviceTraitDefaultCommand.DeviceTraitDefaultCommandResponse { /* compiled code */ }

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.Device.Attribute> {
        @androidx.annotation.NonNull Name,

        @androidx.annotation.NonNull structureObjectId,

        @androidx.annotation.NonNull roomObjectId,

        @androidx.annotation.NonNull descriptiveType,

        @androidx.annotation.NonNull isSelfDevice;

        public open val fieldName: kotlin.String /* compiled code */

        public open val tag: kotlin.UInt /* compiled code */

        public open val typeName: kotlin.String /* compiled code */

        public open val typeEnum: com.google.home.Type /* compiled code */

        public open val descriptor: com.google.home.Descriptor /* compiled code */

        public final val isNullable: kotlin.Boolean /* compiled code */
    }
}

