// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home

public interface StructDescriptor : com.google.home.Descriptor {
    public abstract val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */
        public abstract @com.google.android.gms.common.internal.ShowFirstParty get

    @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getFieldById(tagId: kotlin.UInt /* from: com.google.home.TagId */): com.google.home.Field? { /* compiled code */ }
}

