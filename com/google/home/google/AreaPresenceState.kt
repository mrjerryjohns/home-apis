// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class AreaPresenceState private constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.google.PlatformTraitClient, attributes: com.google.home.google.AreaPresenceStateTrait.Attributes) : com.google.home.google.PlatformTrait, com.google.home.google.AreaPresenceStateTrait.Attributes {
    public companion object : com.google.home.TraitFactory<com.google.home.google.AreaPresenceState> {
        public final val presenceState: com.google.home.automation.Attribute<com.google.home.google.AreaPresenceStateTrait.PresenceState> /* compiled code */

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.AreaPresenceState?>.presenceState: com.google.home.automation.TypedExpression<com.google.home.google.AreaPresenceStateTrait.PresenceState> /* compiled code */
            public final get

        public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }
    }

    internal final val attributes: com.google.home.google.AreaPresenceStateTrait.Attributes /* compiled code */

    public open val factory: com.google.home.TraitFactory<com.google.home.google.AreaPresenceState> /* compiled code */

    public open val presenceState: com.google.home.google.AreaPresenceStateTrait.PresenceState? /* compiled code */

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.AreaPresenceState.Attribute> {
        @androidx.annotation.NonNull presenceState;

        public open val fieldName: kotlin.String /* compiled code */

        public open val tag: kotlin.UInt /* compiled code */

        public open val typeName: kotlin.String /* compiled code */

        public open val typeEnum: com.google.home.Type /* compiled code */

        public open val descriptor: com.google.home.Descriptor /* compiled code */

        public final val isNullable: kotlin.Boolean /* compiled code */
    }
}

