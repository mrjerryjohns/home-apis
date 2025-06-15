// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.serialization.codec.proto

public object ProtoFormat {
    public final val FIELD_NUMBER_BITS_TYPE: kotlin.Int /* compiled code */

    public final val FIELD_NUMBER_SHIFT_TYPE: kotlin.Int /* compiled code */

    public final val FIELD_NUMBER_MASK_TYPE: kotlin.Int /* compiled code */

    public final val FIELD_NUMBER_BITS_LIST: kotlin.Int /* compiled code */

    public final val FIELD_NUMBER_SHIFT_LIST: kotlin.Int /* compiled code */

    public final val FIELD_NUMBER_MASK_LIST: kotlin.Int /* compiled code */

    public final val FIELD_NUMBER_BITS_ID: kotlin.Int /* compiled code */

    public final val FIELD_NUMBER_SHIFT_ID: kotlin.Int /* compiled code */

    public final val FIELD_NUMBER_MASK_ID: kotlin.Int /* compiled code */

    public final val FIELD_NUMBER_BITS_VENDOR: kotlin.Int /* compiled code */

    public final val FIELD_NUMBER_SHIFT_VENDOR: kotlin.Int /* compiled code */

    public final val FIELD_NUMBER_MASK_VENDOR: kotlin.Int /* compiled code */

    public final val FIELD_NUMBER_BITS_RESERVED: kotlin.Int /* compiled code */

    public final val FIELD_NUMBER_SHIFT_RESERVED: kotlin.Int /* compiled code */

    public final val FIELD_NUMBER_MASK_RESERVED: kotlin.Int /* compiled code */

    public final val WIRETYPE_LENGTH_DELIMITED: kotlin.Int /* compiled code */

    public final val FIELD_NUMBER_UDDM_INCREMENT: kotlin.Int /* compiled code */

    public final fun getContainerIdFromFieldNumber(fieldNumber: kotlin.Int): kotlin.UInt /* from: com.google.home.matter.serialization.TagId */ { /* compiled code */ }

    public final fun getIdFromFieldNumber(fieldNumber: kotlin.Int): kotlin.UInt /* from: com.google.home.matter.serialization.TagId */ { /* compiled code */ }

    public final fun getIsListFromFieldNumber(fieldNumber: kotlin.Int): kotlin.Boolean { /* compiled code */ }

    public final fun getIsVendorFromFieldNumber(fieldNumber: kotlin.Int): kotlin.Boolean { /* compiled code */ }

    public final fun getTypeFromFieldNumber(fieldNumber: kotlin.Int): com.google.home.matter.serialization.codec.proto.ProtoFormat.Type { /* compiled code */ }

    public final fun getIsLengthDelimitedFromTagNumber(protoTag: kotlin.Int): kotlin.Boolean { /* compiled code */ }

    public final fun getIsPrimitiveFromFieldNumber(fieldNumber: kotlin.Int): kotlin.Boolean { /* compiled code */ }

    public final fun makeFieldNumber(id: kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, type: com.google.home.matter.serialization.codec.proto.ProtoFormat.Type, isList: kotlin.Boolean = COMPILED_CODE, isVendor: kotlin.Boolean = COMPILED_CODE): kotlin.Int { /* compiled code */ }

    public final fun makeContainerFieldNumber(id: kotlin.UInt /* from: com.google.home.matter.serialization.TagId */): kotlin.Int { /* compiled code */ }

    private final fun isReserved(fieldNumber: kotlin.Int): kotlin.Boolean { /* compiled code */ }

    public final enum class Type private constructor(value: kotlin.Int) : kotlin.Enum<com.google.home.matter.serialization.codec.proto.ProtoFormat.Type> {
        @androidx.annotation.NonNull UINT,

        @androidx.annotation.NonNull INT,

        @androidx.annotation.NonNull BOOL,

        @androidx.annotation.NonNull CHAR_STRING,

        @androidx.annotation.NonNull BYTE_STRING,

        @androidx.annotation.NonNull STRUCT,

        @androidx.annotation.NonNull FLOAT,

        @androidx.annotation.NonNull DOUBLE,

        @androidx.annotation.NonNull NULL;

        public companion object {
            public final fun fromInt(value: kotlin.Int): com.google.home.matter.serialization.codec.proto.ProtoFormat.Type { /* compiled code */ }
        }

        public final val value: kotlin.Int /* compiled code */
    }
}
