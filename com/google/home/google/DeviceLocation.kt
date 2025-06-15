// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface DeviceLocation : com.google.home.google.DeviceLocationTrait.Attributes, com.google.home.matter.MatterTrait, com.google.home.Updatable<com.google.home.google.DeviceLocation, com.google.home.google.DeviceLocationTrait.MutableAttributes>, com.google.home.google.DeviceLocationCommands {
    public companion object : com.google.home.TraitFactory<com.google.home.google.DeviceLocation> {
        public final val spokenLocation: com.google.home.automation.Attribute<com.google.home.google.DeviceLocationTrait.Location?> /* compiled code */
            public final get

        public final val presenceEnabledStructureIdList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.String>?> /* compiled code */
            public final get

        public final val generatedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val acceptedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val attributeList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val featureMap: com.google.home.automation.Attribute<kotlin.UInt> /* compiled code */
            public final get

        public final val clusterRevision: com.google.home.automation.Attribute<kotlin.UShort> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.DeviceLocation?>.spokenLocation: com.google.home.automation.TypedExpression<com.google.home.google.DeviceLocationTrait.Location?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.DeviceLocation?>.presenceEnabledStructureIdList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.String>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.DeviceLocation?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.DeviceLocation?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.DeviceLocation?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.DeviceLocation?>.featureMap: com.google.home.automation.TypedExpression<kotlin.UInt> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.DeviceLocation?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.google.DeviceLocation>.setSpokenLocation(value: com.google.home.google.DeviceLocationTrait.Location): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.google.DeviceLocation>.setPresenceEnabledStructureIdList(value: kotlin.collections.List<kotlin.String>): kotlin.Unit { /* compiled code */ }

        public final fun setSpokenLocation(spokenLocation: com.google.home.google.DeviceLocationTrait.Location): com.google.home.automation.Command { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.google.DeviceLocation> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.google.DeviceLocation.Attribute): kotlin.Boolean

    public abstract fun supports(command: com.google.home.google.DeviceLocation.Command): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.DeviceLocation.Attribute> {
        @androidx.annotation.NonNull spokenLocation,

        @androidx.annotation.NonNull presenceEnabledStructureIdList,

        @androidx.annotation.NonNull generatedCommandList,

        @androidx.annotation.NonNull acceptedCommandList,

        @androidx.annotation.NonNull attributeList,

        @androidx.annotation.NonNull featureMap,

        @androidx.annotation.NonNull clusterRevision;

        public companion object {
            public final val StructDescriptor: com.google.home.StructDescriptor /* compiled code */
        }

        public open val fieldName: kotlin.String /* compiled code */

        public open val tag: kotlin.UInt /* compiled code */

        public open val typeName: kotlin.String /* compiled code */

        public open val typeEnum: com.google.home.Type /* compiled code */

        public open val descriptor: com.google.home.Descriptor /* compiled code */

        public final val isNullable: kotlin.Boolean /* compiled code */
    }

    public final enum class Command private constructor(tag: kotlin.UInt) : kotlin.Enum<com.google.home.google.DeviceLocation.Command> {
        @androidx.annotation.NonNull SetSpokenLocation;

        public final val tag: kotlin.UInt /* compiled code */
    }
}

