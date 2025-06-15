// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface AudioOutput : com.google.home.matter.standard.AudioOutputTrait.Attributes, com.google.home.matter.MatterTrait, com.google.home.matter.standard.AudioOutputCommands {
    public companion object : com.google.home.TraitFactory<com.google.home.matter.standard.AudioOutput> {
        public final val outputList: com.google.home.automation.Attribute<kotlin.collections.List<com.google.home.matter.standard.AudioOutputTrait.OutputInfoStruct>?> /* compiled code */
            public final get

        public final val currentOutput: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val generatedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val acceptedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val attributeList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val featureMap: com.google.home.automation.Attribute<com.google.home.matter.standard.AudioOutputTrait.Feature> /* compiled code */
            public final get

        public final val clusterRevision: com.google.home.automation.Attribute<kotlin.UShort> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AudioOutput?>.outputList: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.AudioOutputTrait.OutputInfoStruct>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AudioOutput?>.currentOutput: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AudioOutput?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AudioOutput?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AudioOutput?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AudioOutput?>.featureMap: com.google.home.automation.TypedExpression<com.google.home.matter.standard.AudioOutputTrait.Feature> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AudioOutput?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        public final fun selectOutput(index: kotlin.UByte): com.google.home.automation.Command { /* compiled code */ }

        public final fun renameOutput(index: kotlin.UByte, name: kotlin.String): com.google.home.automation.Command { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.matter.standard.AudioOutput> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.matter.standard.AudioOutput.Attribute): kotlin.Boolean

    public abstract fun supports(command: com.google.home.matter.standard.AudioOutput.Command): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.AudioOutput.Attribute> {
        @androidx.annotation.NonNull outputList,

        @androidx.annotation.NonNull currentOutput,

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

    public final enum class Command private constructor(tag: kotlin.UInt) : kotlin.Enum<com.google.home.matter.standard.AudioOutput.Command> {
        @androidx.annotation.NonNull SelectOutput,

        @androidx.annotation.NonNull RenameOutput;

        public final val tag: kotlin.UInt /* compiled code */
    }
}

