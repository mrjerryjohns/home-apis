// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface LaundryWasherMode : com.google.home.matter.standard.LaundryWasherModeTrait.Attributes, com.google.home.matter.MatterTrait, com.google.home.Updatable<com.google.home.matter.standard.LaundryWasherMode, com.google.home.matter.standard.LaundryWasherModeTrait.MutableAttributes>, com.google.home.matter.standard.LaundryWasherModeCommands {
    public companion object : com.google.home.TraitFactory<com.google.home.matter.standard.LaundryWasherMode> {
        public final val supportedModes: com.google.home.automation.Attribute<kotlin.collections.List<com.google.home.matter.standard.LaundryWasherModeTrait.ModeOptionStruct>?> /* compiled code */
            public final get

        public final val currentMode: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val startUpMode: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val onMode: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val generatedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val acceptedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val attributeList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val featureMap: com.google.home.automation.Attribute<com.google.home.matter.standard.LaundryWasherModeTrait.Feature> /* compiled code */
            public final get

        public final val clusterRevision: com.google.home.automation.Attribute<kotlin.UShort> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.LaundryWasherMode?>.supportedModes: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.LaundryWasherModeTrait.ModeOptionStruct>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.LaundryWasherMode?>.currentMode: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.LaundryWasherMode?>.startUpMode: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.LaundryWasherMode?>.onMode: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.LaundryWasherMode?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.LaundryWasherMode?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.LaundryWasherMode?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.LaundryWasherMode?>.featureMap: com.google.home.automation.TypedExpression<com.google.home.matter.standard.LaundryWasherModeTrait.Feature> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.LaundryWasherMode?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.LaundryWasherMode>.setStartUpMode(value: kotlin.UByte): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.LaundryWasherMode>.setOnMode(value: kotlin.UByte): kotlin.Unit { /* compiled code */ }

        public final fun changeToMode(newMode: kotlin.UByte): com.google.home.automation.Command { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.matter.standard.LaundryWasherMode> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.matter.standard.LaundryWasherMode.Attribute): kotlin.Boolean

    public abstract fun supports(command: com.google.home.matter.standard.LaundryWasherMode.Command): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.LaundryWasherMode.Attribute> {
        @androidx.annotation.NonNull supportedModes,

        @androidx.annotation.NonNull currentMode,

        @androidx.annotation.NonNull startUpMode,

        @androidx.annotation.NonNull onMode,

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

    public final enum class Command private constructor(tag: kotlin.UInt) : kotlin.Enum<com.google.home.matter.standard.LaundryWasherMode.Command> {
        @androidx.annotation.NonNull ChangeToMode;

        public final val tag: kotlin.UInt /* compiled code */
    }
}

