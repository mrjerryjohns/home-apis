// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object OperationalCredentialsTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class CertificateChainTypeEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.OperationalCredentialsTrait.CertificateChainTypeEnum> {
        @androidx.annotation.NonNull DacCertificate,

        @androidx.annotation.NonNull PaiCertificate,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.OperationalCredentialsTrait.CertificateChainTypeEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class NodeOperationalCertStatusEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.OperationalCredentialsTrait.NodeOperationalCertStatusEnum> {
        @androidx.annotation.NonNull OK,

        @androidx.annotation.NonNull InvalidPublicKey,

        @androidx.annotation.NonNull InvalidNodeOpId,

        @androidx.annotation.NonNull InvalidNoc,

        @androidx.annotation.NonNull MissingCsr,

        @androidx.annotation.NonNull TableFull,

        @androidx.annotation.NonNull InvalidAdminSubject,

        @androidx.annotation.NonNull FabricConflict,

        @androidx.annotation.NonNull LabelConflict,

        @androidx.annotation.NonNull InvalidFabricIndex,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.OperationalCredentialsTrait.NodeOperationalCertStatusEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final class FabricDescriptorStruct public constructor(rootPublicKey: kotlin.ByteArray = COMPILED_CODE, vendorId: kotlin.UShort = COMPILED_CODE, fabricId: kotlin.ULong = COMPILED_CODE, nodeId: kotlin.ULong = COMPILED_CODE, label: kotlin.String = COMPILED_CODE, fabricIndex: kotlin.UByte = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.OperationalCredentialsTrait.FabricDescriptorStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OperationalCredentialsTrait.FabricDescriptorStruct?>.rootPublicKey: com.google.home.automation.TypedExpression<kotlin.ByteArray> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OperationalCredentialsTrait.FabricDescriptorStruct?>.vendorId: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OperationalCredentialsTrait.FabricDescriptorStruct?>.fabricId: com.google.home.automation.TypedExpression<kotlin.ULong> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OperationalCredentialsTrait.FabricDescriptorStruct?>.nodeId: com.google.home.automation.TypedExpression<kotlin.ULong> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OperationalCredentialsTrait.FabricDescriptorStruct?>.label: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OperationalCredentialsTrait.FabricDescriptorStruct?>.fabricIndex: com.google.home.automation.TypedExpression<kotlin.UByte> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.OperationalCredentialsTrait.FabricDescriptorStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.OperationalCredentialsTrait.FabricDescriptorStruct { /* compiled code */ }
        }

        public final val rootPublicKey: kotlin.ByteArray /* compiled code */

        public final val vendorId: kotlin.UShort /* compiled code */

        public final val fabricId: kotlin.ULong /* compiled code */

        public final val nodeId: kotlin.ULong /* compiled code */

        public final val label: kotlin.String /* compiled code */

        public final val fabricIndex: kotlin.UByte /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.OperationalCredentialsTrait.FabricDescriptorStruct.StructFields> {
            @androidx.annotation.NonNull rootPublicKey,

            @androidx.annotation.NonNull vendorId,

            @androidx.annotation.NonNull fabricId,

            @androidx.annotation.NonNull nodeId,

            @androidx.annotation.NonNull label,

            @androidx.annotation.NonNull fabricIndex;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class NocStruct public constructor(noc: kotlin.ByteArray = COMPILED_CODE, icac: kotlin.ByteArray? = COMPILED_CODE, fabricIndex: kotlin.UByte = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.OperationalCredentialsTrait.NocStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OperationalCredentialsTrait.NocStruct?>.noc: com.google.home.automation.TypedExpression<kotlin.ByteArray> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OperationalCredentialsTrait.NocStruct?>.icac: com.google.home.automation.TypedExpression<kotlin.ByteArray?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OperationalCredentialsTrait.NocStruct?>.fabricIndex: com.google.home.automation.TypedExpression<kotlin.UByte> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.OperationalCredentialsTrait.NocStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.OperationalCredentialsTrait.NocStruct { /* compiled code */ }
        }

        public final val noc: kotlin.ByteArray /* compiled code */

        public final val icac: kotlin.ByteArray? /* compiled code */

        public final val fabricIndex: kotlin.UByte /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.OperationalCredentialsTrait.NocStruct.StructFields> {
            @androidx.annotation.NonNull noc,

            @androidx.annotation.NonNull icac,

            @androidx.annotation.NonNull fabricIndex;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.OperationalCredentialsTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.OperationalCredentialsTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.OperationalCredentialsTrait.Attributes { /* compiled code */ }
        }

        public abstract val nocs: kotlin.collections.List<com.google.home.matter.standard.OperationalCredentialsTrait.NocStruct>?

        public abstract val fabrics: kotlin.collections.List<com.google.home.matter.standard.OperationalCredentialsTrait.FabricDescriptorStruct>?

        public abstract val supportedFabrics: kotlin.UByte?

        public abstract val commissionedFabrics: kotlin.UByte?

        public abstract val trustedRootCertificates: kotlin.collections.List<kotlin.ByteArray>?

        public abstract val currentFabricIndex: kotlin.UByte?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: kotlin.UInt

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(nocs: kotlin.collections.List<com.google.home.matter.standard.OperationalCredentialsTrait.NocStruct>? = COMPILED_CODE, fabrics: kotlin.collections.List<com.google.home.matter.standard.OperationalCredentialsTrait.FabricDescriptorStruct>? = COMPILED_CODE, supportedFabrics: kotlin.UByte? = COMPILED_CODE, commissionedFabrics: kotlin.UByte? = COMPILED_CODE, trustedRootCertificates: kotlin.collections.List<kotlin.ByteArray>? = COMPILED_CODE, currentFabricIndex: kotlin.UByte? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.matter.standard.OperationalCredentialsTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.OperationalCredentialsTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.OperationalCredentialsTrait.Attributes) { /* compiled code */ }

        public open val nocs: kotlin.collections.List<com.google.home.matter.standard.OperationalCredentialsTrait.NocStruct>? /* compiled code */

        public open val fabrics: kotlin.collections.List<com.google.home.matter.standard.OperationalCredentialsTrait.FabricDescriptorStruct>? /* compiled code */

        public open val supportedFabrics: kotlin.UByte? /* compiled code */

        public open val commissionedFabrics: kotlin.UByte? /* compiled code */

        public open val trustedRootCertificates: kotlin.collections.List<kotlin.ByteArray>? /* compiled code */

        public open val currentFabricIndex: kotlin.UByte? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: kotlin.UInt /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(nocs: kotlin.collections.List<com.google.home.matter.standard.OperationalCredentialsTrait.NocStruct>? = COMPILED_CODE, fabrics: kotlin.collections.List<com.google.home.matter.standard.OperationalCredentialsTrait.FabricDescriptorStruct>? = COMPILED_CODE, supportedFabrics: kotlin.UByte? = COMPILED_CODE, commissionedFabrics: kotlin.UByte? = COMPILED_CODE, trustedRootCertificates: kotlin.collections.List<kotlin.ByteArray>? = COMPILED_CODE, currentFabricIndex: kotlin.UByte? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.matter.standard.OperationalCredentialsTrait.AttributesImpl { /* compiled code */ }
    }

    public object AttestationRequestCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(attestationNonce: kotlin.ByteArray = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.OperationalCredentialsTrait.AttestationRequestCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.OperationalCredentialsTrait.AttestationRequestCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.OperationalCredentialsTrait.AttestationRequestCommand.Request { /* compiled code */ }
            }

            public final val attestationNonce: kotlin.ByteArray /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.OperationalCredentialsTrait.AttestationRequestCommand.Request.CommandFields> {
                @androidx.annotation.NonNull attestationNonce;

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
        }

        public final class Response public constructor(attestationElements: kotlin.ByteArray = COMPILED_CODE, attestationSignature: kotlin.ByteArray = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.OperationalCredentialsTrait.AttestationRequestCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.OperationalCredentialsTrait.AttestationRequestCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.OperationalCredentialsTrait.AttestationRequestCommand.Response { /* compiled code */ }
            }

            public final val attestationElements: kotlin.ByteArray /* compiled code */

            public final val attestationSignature: kotlin.ByteArray /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.OperationalCredentialsTrait.AttestationRequestCommand.Response.CommandFields> {
                @androidx.annotation.NonNull attestationElements,

                @androidx.annotation.NonNull attestationSignature;

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
        }
    }

    public object CertificateChainRequestCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(certificateType: com.google.home.matter.standard.OperationalCredentialsTrait.CertificateChainTypeEnum = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.OperationalCredentialsTrait.CertificateChainRequestCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.OperationalCredentialsTrait.CertificateChainRequestCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.OperationalCredentialsTrait.CertificateChainRequestCommand.Request { /* compiled code */ }
            }

            public final val certificateType: com.google.home.matter.standard.OperationalCredentialsTrait.CertificateChainTypeEnum /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.OperationalCredentialsTrait.CertificateChainRequestCommand.Request.CommandFields> {
                @androidx.annotation.NonNull certificateType;

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
        }

        public final class Response public constructor(certificate: kotlin.ByteArray = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.OperationalCredentialsTrait.CertificateChainRequestCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.OperationalCredentialsTrait.CertificateChainRequestCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.OperationalCredentialsTrait.CertificateChainRequestCommand.Response { /* compiled code */ }
            }

            public final val certificate: kotlin.ByteArray /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.OperationalCredentialsTrait.CertificateChainRequestCommand.Response.CommandFields> {
                @androidx.annotation.NonNull certificate;

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
        }
    }

    public object CsrRequestCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(csrNonce: kotlin.ByteArray = COMPILED_CODE, isForUpdateNoc: com.google.home.matter.serialization.OptionalValue<kotlin.Boolean> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.OperationalCredentialsTrait.CsrRequestCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.OperationalCredentialsTrait.CsrRequestCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.OperationalCredentialsTrait.CsrRequestCommand.Request { /* compiled code */ }
            }

            public final val csrNonce: kotlin.ByteArray /* compiled code */

            public final val isForUpdateNoc: com.google.home.matter.serialization.OptionalValue<kotlin.Boolean> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.OperationalCredentialsTrait.CsrRequestCommand.Request.CommandFields> {
                @androidx.annotation.NonNull csrNonce,

                @androidx.annotation.NonNull isForUpdateNoc;

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
        }

        public interface OptionalArgs {
            public abstract var isForUpdateNoc: kotlin.Boolean
        }

        public final class Response public constructor(nocsrElements: kotlin.ByteArray = COMPILED_CODE, attestationSignature: kotlin.ByteArray = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.OperationalCredentialsTrait.CsrRequestCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.OperationalCredentialsTrait.CsrRequestCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.OperationalCredentialsTrait.CsrRequestCommand.Response { /* compiled code */ }
            }

            public final val nocsrElements: kotlin.ByteArray /* compiled code */

            public final val attestationSignature: kotlin.ByteArray /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.OperationalCredentialsTrait.CsrRequestCommand.Response.CommandFields> {
                @androidx.annotation.NonNull nocsrElements,

                @androidx.annotation.NonNull attestationSignature;

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
        }
    }

    public object AddNocCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(nocValue: kotlin.ByteArray = COMPILED_CODE, icacValue: com.google.home.matter.serialization.OptionalValue<kotlin.ByteArray> = COMPILED_CODE, ipkValue: kotlin.ByteArray = COMPILED_CODE, caseAdminSubject: kotlin.ULong = COMPILED_CODE, adminVendorId: kotlin.UShort = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.OperationalCredentialsTrait.AddNocCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.OperationalCredentialsTrait.AddNocCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.OperationalCredentialsTrait.AddNocCommand.Request { /* compiled code */ }
            }

            public final val nocValue: kotlin.ByteArray /* compiled code */

            public final val icacValue: com.google.home.matter.serialization.OptionalValue<kotlin.ByteArray> /* compiled code */

            public final val ipkValue: kotlin.ByteArray /* compiled code */

            public final val caseAdminSubject: kotlin.ULong /* compiled code */

            public final val adminVendorId: kotlin.UShort /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.OperationalCredentialsTrait.AddNocCommand.Request.CommandFields> {
                @androidx.annotation.NonNull nocValue,

                @androidx.annotation.NonNull icacValue,

                @androidx.annotation.NonNull ipkValue,

                @androidx.annotation.NonNull caseAdminSubject,

                @androidx.annotation.NonNull adminVendorId;

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
        }

        public interface OptionalArgs {
            public abstract var icacValue: kotlin.ByteArray
        }

        public final class Response public constructor(statusCode: com.google.home.matter.standard.OperationalCredentialsTrait.NodeOperationalCertStatusEnum = COMPILED_CODE, fabricIndex: kotlin.UByte? = COMPILED_CODE, debugText: kotlin.String? = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.OperationalCredentialsTrait.AddNocCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.OperationalCredentialsTrait.AddNocCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.OperationalCredentialsTrait.AddNocCommand.Response { /* compiled code */ }
            }

            public final val statusCode: com.google.home.matter.standard.OperationalCredentialsTrait.NodeOperationalCertStatusEnum /* compiled code */

            public final val fabricIndex: kotlin.UByte? /* compiled code */

            public final val debugText: kotlin.String? /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.OperationalCredentialsTrait.AddNocCommand.Response.CommandFields> {
                @androidx.annotation.NonNull statusCode,

                @androidx.annotation.NonNull fabricIndex,

                @androidx.annotation.NonNull debugText;

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
        }
    }

    public object UpdateNocCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(nocValue: kotlin.ByteArray = COMPILED_CODE, icacValue: com.google.home.matter.serialization.OptionalValue<kotlin.ByteArray> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.OperationalCredentialsTrait.UpdateNocCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.OperationalCredentialsTrait.UpdateNocCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.OperationalCredentialsTrait.UpdateNocCommand.Request { /* compiled code */ }
            }

            public final val nocValue: kotlin.ByteArray /* compiled code */

            public final val icacValue: com.google.home.matter.serialization.OptionalValue<kotlin.ByteArray> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.OperationalCredentialsTrait.UpdateNocCommand.Request.CommandFields> {
                @androidx.annotation.NonNull nocValue,

                @androidx.annotation.NonNull icacValue;

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
        }

        public interface OptionalArgs {
            public abstract var icacValue: kotlin.ByteArray
        }

        public final class Response public constructor(statusCode: com.google.home.matter.standard.OperationalCredentialsTrait.NodeOperationalCertStatusEnum = COMPILED_CODE, fabricIndex: kotlin.UByte? = COMPILED_CODE, debugText: kotlin.String? = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.OperationalCredentialsTrait.UpdateNocCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.OperationalCredentialsTrait.UpdateNocCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.OperationalCredentialsTrait.UpdateNocCommand.Response { /* compiled code */ }
            }

            public final val statusCode: com.google.home.matter.standard.OperationalCredentialsTrait.NodeOperationalCertStatusEnum /* compiled code */

            public final val fabricIndex: kotlin.UByte? /* compiled code */

            public final val debugText: kotlin.String? /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.OperationalCredentialsTrait.UpdateNocCommand.Response.CommandFields> {
                @androidx.annotation.NonNull statusCode,

                @androidx.annotation.NonNull fabricIndex,

                @androidx.annotation.NonNull debugText;

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
        }
    }

    public object UpdateFabricLabelCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(label: kotlin.String = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.OperationalCredentialsTrait.UpdateFabricLabelCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.OperationalCredentialsTrait.UpdateFabricLabelCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.OperationalCredentialsTrait.UpdateFabricLabelCommand.Request { /* compiled code */ }
            }

            public final val label: kotlin.String /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.OperationalCredentialsTrait.UpdateFabricLabelCommand.Request.CommandFields> {
                @androidx.annotation.NonNull label;

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
        }

        public final class Response public constructor(statusCode: com.google.home.matter.standard.OperationalCredentialsTrait.NodeOperationalCertStatusEnum = COMPILED_CODE, fabricIndex: kotlin.UByte? = COMPILED_CODE, debugText: kotlin.String? = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.OperationalCredentialsTrait.UpdateFabricLabelCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.OperationalCredentialsTrait.UpdateFabricLabelCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.OperationalCredentialsTrait.UpdateFabricLabelCommand.Response { /* compiled code */ }
            }

            public final val statusCode: com.google.home.matter.standard.OperationalCredentialsTrait.NodeOperationalCertStatusEnum /* compiled code */

            public final val fabricIndex: kotlin.UByte? /* compiled code */

            public final val debugText: kotlin.String? /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.OperationalCredentialsTrait.UpdateFabricLabelCommand.Response.CommandFields> {
                @androidx.annotation.NonNull statusCode,

                @androidx.annotation.NonNull fabricIndex,

                @androidx.annotation.NonNull debugText;

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
        }
    }

    public object RemoveFabricCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(fabricIndex: kotlin.UByte = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.OperationalCredentialsTrait.RemoveFabricCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.OperationalCredentialsTrait.RemoveFabricCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.OperationalCredentialsTrait.RemoveFabricCommand.Request { /* compiled code */ }
            }

            public final val fabricIndex: kotlin.UByte /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.OperationalCredentialsTrait.RemoveFabricCommand.Request.CommandFields> {
                @androidx.annotation.NonNull fabricIndex;

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
        }

        public final class Response public constructor(statusCode: com.google.home.matter.standard.OperationalCredentialsTrait.NodeOperationalCertStatusEnum = COMPILED_CODE, fabricIndex: kotlin.UByte? = COMPILED_CODE, debugText: kotlin.String? = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.OperationalCredentialsTrait.RemoveFabricCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.OperationalCredentialsTrait.RemoveFabricCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.OperationalCredentialsTrait.RemoveFabricCommand.Response { /* compiled code */ }
            }

            public final val statusCode: com.google.home.matter.standard.OperationalCredentialsTrait.NodeOperationalCertStatusEnum /* compiled code */

            public final val fabricIndex: kotlin.UByte? /* compiled code */

            public final val debugText: kotlin.String? /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.OperationalCredentialsTrait.RemoveFabricCommand.Response.CommandFields> {
                @androidx.annotation.NonNull statusCode,

                @androidx.annotation.NonNull fabricIndex,

                @androidx.annotation.NonNull debugText;

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
        }
    }

    public object AddTrustedRootCertificateCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(rootCaCertificate: kotlin.ByteArray = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.OperationalCredentialsTrait.AddTrustedRootCertificateCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.OperationalCredentialsTrait.AddTrustedRootCertificateCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.OperationalCredentialsTrait.AddTrustedRootCertificateCommand.Request { /* compiled code */ }
            }

            public final val rootCaCertificate: kotlin.ByteArray /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.OperationalCredentialsTrait.AddTrustedRootCertificateCommand.Request.CommandFields> {
                @androidx.annotation.NonNull rootCaCertificate;

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
        }
    }
}

