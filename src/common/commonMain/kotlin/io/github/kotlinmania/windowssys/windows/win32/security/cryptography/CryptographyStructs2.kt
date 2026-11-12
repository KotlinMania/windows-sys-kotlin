@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

public class CryptAsyncRetrievalCompletion internal constructor(
    public var pfnCompletion: PfnCryptAsyncRetrievalCompletionFunc,
    pvCompletionCtorArg: MutPtr,
) {
    public var pvCompletion: MutPtr = pvCompletionCtorArg
        internal set

    public constructor() : this(
        pfnCompletion = null,
        pvCompletionCtorArg = MutPtr(0L),
    )

    public operator fun component1(): PfnCryptAsyncRetrievalCompletionFunc = this.pfnCompletion

    public operator fun component2(): MutPtr = this.pvCompletion

    public fun copy(pfnCompletion: PfnCryptAsyncRetrievalCompletionFunc = this.pfnCompletion, pvCompletion: MutPtr = this.pvCompletion): CryptAsyncRetrievalCompletion = CryptAsyncRetrievalCompletion(pfnCompletion = pfnCompletion, pvCompletionCtorArg = pvCompletion)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptAsyncRetrievalCompletion) return false
        if (this.pfnCompletion != other.pfnCompletion) return false
        if (this.pvCompletion != other.pvCompletion) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pfnCompletion.hashCode()
        result = 31 * result + this.pvCompletion.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pfnCompletion: PfnCryptAsyncRetrievalCompletionFunc = null,
            pvCompletion: MutPtr = MutPtr(0L),
        ): CryptAsyncRetrievalCompletion =
            CryptAsyncRetrievalCompletion(
                pfnCompletion = pfnCompletion,
                pvCompletionCtorArg = pvCompletion,
            )
    }
}

public class CryptAttribute internal constructor(
    pszObjIdCtorArg: Pstr,
    public var cValue: UInt,
    rgValueCtorArg: MutPtr,
) {
    public var pszObjId: Pstr = pszObjIdCtorArg
        internal set

    public var rgValue: MutPtr = rgValueCtorArg
        internal set

    public constructor() : this(
        pszObjIdCtorArg = MutPtr(0L),
        cValue = 0u,
        rgValueCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pstr = this.pszObjId

    public operator fun component2(): UInt = this.cValue

    public operator fun component3(): MutPtr = this.rgValue

    public fun copy(pszObjId: Pstr = this.pszObjId, cValue: UInt = this.cValue, rgValue: MutPtr = this.rgValue): CryptAttribute = CryptAttribute(pszObjIdCtorArg = pszObjId, cValue = cValue, rgValueCtorArg = rgValue)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptAttribute) return false
        if (this.pszObjId != other.pszObjId) return false
        if (this.cValue != other.cValue) return false
        if (this.rgValue != other.rgValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszObjId.hashCode()
        result = 31 * result + this.cValue.hashCode()
        result = 31 * result + this.rgValue.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszObjId: Pstr = MutPtr(0L),
            cValue: UInt = 0u,
            rgValue: MutPtr = MutPtr(0L),
        ): CryptAttribute =
            CryptAttribute(
                pszObjIdCtorArg = pszObjId,
                cValue = cValue,
                rgValueCtorArg = rgValue,
            )
    }
}

public class CryptAttributes internal constructor(
    public var cAttr: UInt,
    rgAttrCtorArg: MutPtr,
) {
    public var rgAttr: MutPtr = rgAttrCtorArg
        internal set

    public constructor() : this(
        cAttr = 0u,
        rgAttrCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cAttr

    public operator fun component2(): MutPtr = this.rgAttr

    public fun copy(cAttr: UInt = this.cAttr, rgAttr: MutPtr = this.rgAttr): CryptAttributes = CryptAttributes(cAttr = cAttr, rgAttrCtorArg = rgAttr)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptAttributes) return false
        if (this.cAttr != other.cAttr) return false
        if (this.rgAttr != other.rgAttr) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cAttr.hashCode()
        result = 31 * result + this.rgAttr.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptAttributes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptAttributes> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CryptAttributes =
                    CryptAttributes(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CryptAttributes) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cAttr)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.rgAttr)
                }
            }

        public operator fun invoke(
            cAttr: UInt = 0u,
            rgAttr: MutPtr = MutPtr(0L),
        ): CryptAttributes =
            CryptAttributes(
                cAttr = cAttr,
                rgAttrCtorArg = rgAttr,
            )
    }
}

public class CryptAttributeTypeValue internal constructor(
    pszObjIdCtorArg: Pstr,
    public var value: CryptIntegerBlob,
) {
    public var pszObjId: Pstr = pszObjIdCtorArg
        internal set

    public constructor() : this(
        pszObjIdCtorArg = MutPtr(0L),
        value = CryptIntegerBlob(),
    )

    public operator fun component1(): Pstr = this.pszObjId

    public operator fun component2(): CryptIntegerBlob = this.value

    public fun copy(pszObjId: Pstr = this.pszObjId, value: CryptIntegerBlob = this.value): CryptAttributeTypeValue = CryptAttributeTypeValue(pszObjIdCtorArg = pszObjId, value = value)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptAttributeTypeValue) return false
        if (this.pszObjId != other.pszObjId) return false
        if (this.value != other.value) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszObjId.hashCode()
        result = 31 * result + this.value.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszObjId: Pstr = MutPtr(0L),
            value: CryptIntegerBlob = CryptIntegerBlob(),
        ): CryptAttributeTypeValue =
            CryptAttributeTypeValue(
                pszObjIdCtorArg = pszObjId,
                value = value,
            )
    }
}

public class CryptBitBlob internal constructor(
    public var cbData: UInt,
    pbDataCtorArg: MutPtr,
    public var cUnusedBits: UInt,
) {
    public var pbData: MutPtr = pbDataCtorArg
        internal set

    public constructor() : this(
        cbData = 0u,
        pbDataCtorArg = MutPtr(0L),
        cUnusedBits = 0u,
    )

    public operator fun component1(): UInt = this.cbData

    public operator fun component2(): MutPtr = this.pbData

    public operator fun component3(): UInt = this.cUnusedBits

    public fun copy(cbData: UInt = this.cbData, pbData: MutPtr = this.pbData, cUnusedBits: UInt = this.cUnusedBits): CryptBitBlob = CryptBitBlob(cbData = cbData, pbDataCtorArg = pbData, cUnusedBits = cUnusedBits)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptBitBlob) return false
        if (this.cbData != other.cbData) return false
        if (this.pbData != other.pbData) return false
        if (this.cUnusedBits != other.cUnusedBits) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbData.hashCode()
        result = 31 * result + this.pbData.hashCode()
        result = 31 * result + this.cUnusedBits.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptBitBlob> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptBitBlob> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): CryptBitBlob =
                    CryptBitBlob(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: CryptBitBlob) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbData)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pbData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cUnusedBits)
                }
            }

        public operator fun invoke(
            cbData: UInt = 0u,
            pbData: MutPtr = MutPtr(0L),
            cUnusedBits: UInt = 0u,
        ): CryptBitBlob =
            CryptBitBlob(
                cbData = cbData,
                pbDataCtorArg = pbData,
                cUnusedBits = cUnusedBits,
            )
    }
}

public class CryptBlobArray internal constructor(
    public var cBlob: UInt,
    rgBlobCtorArg: MutPtr,
) {
    public var rgBlob: MutPtr = rgBlobCtorArg
        internal set

    public constructor() : this(
        cBlob = 0u,
        rgBlobCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cBlob

    public operator fun component2(): MutPtr = this.rgBlob

    public fun copy(cBlob: UInt = this.cBlob, rgBlob: MutPtr = this.rgBlob): CryptBlobArray = CryptBlobArray(cBlob = cBlob, rgBlobCtorArg = rgBlob)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptBlobArray) return false
        if (this.cBlob != other.cBlob) return false
        if (this.rgBlob != other.rgBlob) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cBlob.hashCode()
        result = 31 * result + this.rgBlob.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptBlobArray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptBlobArray> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CryptBlobArray =
                    CryptBlobArray(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CryptBlobArray) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cBlob)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.rgBlob)
                }
            }

        public operator fun invoke(
            cBlob: UInt = 0u,
            rgBlob: MutPtr = MutPtr(0L),
        ): CryptBlobArray =
            CryptBlobArray(
                cBlob = cBlob,
                rgBlobCtorArg = rgBlob,
            )
    }
}

public class CryptContentInfo internal constructor(
    pszObjIdCtorArg: Pstr,
    public var content: CryptIntegerBlob,
) {
    public var pszObjId: Pstr = pszObjIdCtorArg
        internal set

    public constructor() : this(
        pszObjIdCtorArg = MutPtr(0L),
        content = CryptIntegerBlob(),
    )

    public operator fun component1(): Pstr = this.pszObjId

    public operator fun component2(): CryptIntegerBlob = this.content

    public fun copy(pszObjId: Pstr = this.pszObjId, content: CryptIntegerBlob = this.content): CryptContentInfo = CryptContentInfo(pszObjIdCtorArg = pszObjId, content = content)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptContentInfo) return false
        if (this.pszObjId != other.pszObjId) return false
        if (this.content != other.content) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszObjId.hashCode()
        result = 31 * result + this.content.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszObjId: Pstr = MutPtr(0L),
            content: CryptIntegerBlob = CryptIntegerBlob(),
        ): CryptContentInfo =
            CryptContentInfo(
                pszObjIdCtorArg = pszObjId,
                content = content,
            )
    }
}

public class CryptContentInfoSequenceOfAny internal constructor(
    pszObjIdCtorArg: Pstr,
    public var cValue: UInt,
    rgValueCtorArg: MutPtr,
) {
    public var pszObjId: Pstr = pszObjIdCtorArg
        internal set

    public var rgValue: MutPtr = rgValueCtorArg
        internal set

    public constructor() : this(
        pszObjIdCtorArg = MutPtr(0L),
        cValue = 0u,
        rgValueCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pstr = this.pszObjId

    public operator fun component2(): UInt = this.cValue

    public operator fun component3(): MutPtr = this.rgValue

    public fun copy(pszObjId: Pstr = this.pszObjId, cValue: UInt = this.cValue, rgValue: MutPtr = this.rgValue): CryptContentInfoSequenceOfAny = CryptContentInfoSequenceOfAny(pszObjIdCtorArg = pszObjId, cValue = cValue, rgValueCtorArg = rgValue)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptContentInfoSequenceOfAny) return false
        if (this.pszObjId != other.pszObjId) return false
        if (this.cValue != other.cValue) return false
        if (this.rgValue != other.rgValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszObjId.hashCode()
        result = 31 * result + this.cValue.hashCode()
        result = 31 * result + this.rgValue.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszObjId: Pstr = MutPtr(0L),
            cValue: UInt = 0u,
            rgValue: MutPtr = MutPtr(0L),
        ): CryptContentInfoSequenceOfAny =
            CryptContentInfoSequenceOfAny(
                pszObjIdCtorArg = pszObjId,
                cValue = cValue,
                rgValueCtorArg = rgValue,
            )
    }
}

public class CryptContexts internal constructor(
    public var cContexts: UInt,
    rgpszContextsCtorArg: MutPtr,
) {
    public var rgpszContexts: MutPtr = rgpszContextsCtorArg
        internal set

    public constructor() : this(
        cContexts = 0u,
        rgpszContextsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cContexts

    public operator fun component2(): MutPtr = this.rgpszContexts

    public fun copy(cContexts: UInt = this.cContexts, rgpszContexts: MutPtr = this.rgpszContexts): CryptContexts = CryptContexts(cContexts = cContexts, rgpszContextsCtorArg = rgpszContexts)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptContexts) return false
        if (this.cContexts != other.cContexts) return false
        if (this.rgpszContexts != other.rgpszContexts) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cContexts.hashCode()
        result = 31 * result + this.rgpszContexts.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptContexts> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptContexts> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CryptContexts =
                    CryptContexts(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CryptContexts) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cContexts)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.rgpszContexts)
                }
            }

        public operator fun invoke(
            cContexts: UInt = 0u,
            rgpszContexts: MutPtr = MutPtr(0L),
        ): CryptContexts =
            CryptContexts(
                cContexts = cContexts,
                rgpszContextsCtorArg = rgpszContexts,
            )
    }
}

public data class CryptContextConfig(
    public var dwFlags: CryptContextConfigFlags = 0u,
    public var dwReserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptContextConfig> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptContextConfig> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): CryptContextConfig =
                    CryptContextConfig(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: CryptContextConfig) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwReserved)
                }
            }
    }
}

public class CryptContextFunctions internal constructor(
    public var cFunctions: UInt,
    rgpszFunctionsCtorArg: MutPtr,
) {
    public var rgpszFunctions: MutPtr = rgpszFunctionsCtorArg
        internal set

    public constructor() : this(
        cFunctions = 0u,
        rgpszFunctionsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cFunctions

    public operator fun component2(): MutPtr = this.rgpszFunctions

    public fun copy(cFunctions: UInt = this.cFunctions, rgpszFunctions: MutPtr = this.rgpszFunctions): CryptContextFunctions = CryptContextFunctions(cFunctions = cFunctions, rgpszFunctionsCtorArg = rgpszFunctions)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptContextFunctions) return false
        if (this.cFunctions != other.cFunctions) return false
        if (this.rgpszFunctions != other.rgpszFunctions) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cFunctions.hashCode()
        result = 31 * result + this.rgpszFunctions.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptContextFunctions> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptContextFunctions> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CryptContextFunctions =
                    CryptContextFunctions(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CryptContextFunctions) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cFunctions)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.rgpszFunctions)
                }
            }

        public operator fun invoke(
            cFunctions: UInt = 0u,
            rgpszFunctions: MutPtr = MutPtr(0L),
        ): CryptContextFunctions =
            CryptContextFunctions(
                cFunctions = cFunctions,
                rgpszFunctionsCtorArg = rgpszFunctions,
            )
    }
}

public data class CryptContextFunctionConfig(
    public var dwFlags: UInt = 0u,
    public var dwReserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptContextFunctionConfig> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptContextFunctionConfig> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): CryptContextFunctionConfig =
                    CryptContextFunctionConfig(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: CryptContextFunctionConfig) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwReserved)
                }
            }
    }
}

public class CryptContextFunctionProviders internal constructor(
    public var cProviders: UInt,
    rgpszProvidersCtorArg: MutPtr,
) {
    public var rgpszProviders: MutPtr = rgpszProvidersCtorArg
        internal set

    public constructor() : this(
        cProviders = 0u,
        rgpszProvidersCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cProviders

    public operator fun component2(): MutPtr = this.rgpszProviders

    public fun copy(cProviders: UInt = this.cProviders, rgpszProviders: MutPtr = this.rgpszProviders): CryptContextFunctionProviders = CryptContextFunctionProviders(cProviders = cProviders, rgpszProvidersCtorArg = rgpszProviders)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptContextFunctionProviders) return false
        if (this.cProviders != other.cProviders) return false
        if (this.rgpszProviders != other.rgpszProviders) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cProviders.hashCode()
        result = 31 * result + this.rgpszProviders.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptContextFunctionProviders> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptContextFunctionProviders> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CryptContextFunctionProviders =
                    CryptContextFunctionProviders(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CryptContextFunctionProviders) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cProviders)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.rgpszProviders)
                }
            }

        public operator fun invoke(
            cProviders: UInt = 0u,
            rgpszProviders: MutPtr = MutPtr(0L),
        ): CryptContextFunctionProviders =
            CryptContextFunctionProviders(
                cProviders = cProviders,
                rgpszProvidersCtorArg = rgpszProviders,
            )
    }
}

public class CryptCredentials internal constructor(
    public var cbSize: UInt,
    pszCredentialsOidCtorArg: Pcstr,
    pvCredentialsCtorArg: MutPtr,
) {
    public var pszCredentialsOid: Pcstr = pszCredentialsOidCtorArg
        internal set

    public var pvCredentials: MutPtr = pvCredentialsCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        pszCredentialsOidCtorArg = ConstPtr(0L),
        pvCredentialsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Pcstr = this.pszCredentialsOid

    public operator fun component3(): MutPtr = this.pvCredentials

    public fun copy(cbSize: UInt = this.cbSize, pszCredentialsOid: Pcstr = this.pszCredentialsOid, pvCredentials: MutPtr = this.pvCredentials): CryptCredentials = CryptCredentials(cbSize = cbSize, pszCredentialsOidCtorArg = pszCredentialsOid, pvCredentialsCtorArg = pvCredentials)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptCredentials) return false
        if (this.cbSize != other.cbSize) return false
        if (this.pszCredentialsOid != other.pszCredentialsOid) return false
        if (this.pvCredentials != other.pvCredentials) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.pszCredentialsOid.hashCode()
        result = 31 * result + this.pvCredentials.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            pszCredentialsOid: Pcstr = ConstPtr(0L),
            pvCredentials: MutPtr = MutPtr(0L),
        ): CryptCredentials =
            CryptCredentials(
                cbSize = cbSize,
                pszCredentialsOidCtorArg = pszCredentialsOid,
                pvCredentialsCtorArg = pvCredentials,
            )
    }
}

public class CryptCspProvider internal constructor(
    public var dwKeySpec: UInt,
    pwszProviderNameCtorArg: Pwstr,
    public var signature: CryptBitBlob,
) {
    public var pwszProviderName: Pwstr = pwszProviderNameCtorArg
        internal set

    public constructor() : this(
        dwKeySpec = 0u,
        pwszProviderNameCtorArg = MutPtr(0L),
        signature = CryptBitBlob(),
    )

    public operator fun component1(): UInt = this.dwKeySpec

    public operator fun component2(): Pwstr = this.pwszProviderName

    public operator fun component3(): CryptBitBlob = this.signature

    public fun copy(dwKeySpec: UInt = this.dwKeySpec, pwszProviderName: Pwstr = this.pwszProviderName, signature: CryptBitBlob = this.signature): CryptCspProvider = CryptCspProvider(dwKeySpec = dwKeySpec, pwszProviderNameCtorArg = pwszProviderName, signature = signature)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptCspProvider) return false
        if (this.dwKeySpec != other.dwKeySpec) return false
        if (this.pwszProviderName != other.pwszProviderName) return false
        if (this.signature != other.signature) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwKeySpec.hashCode()
        result = 31 * result + this.pwszProviderName.hashCode()
        result = 31 * result + this.signature.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwKeySpec: UInt = 0u,
            pwszProviderName: Pwstr = MutPtr(0L),
            signature: CryptBitBlob = CryptBitBlob(),
        ): CryptCspProvider =
            CryptCspProvider(
                dwKeySpec = dwKeySpec,
                pwszProviderNameCtorArg = pwszProviderName,
                signature = signature,
            )
    }
}

public data class CryptDecodePara(
    public var cbSize: UInt = 0u,
    public var pfnAlloc: PfnCryptAlloc = null,
    public var pfnFree: PfnCryptFree = null,
)

public class CryptDecryptMessagePara internal constructor(
    public var cbSize: UInt,
    public var dwMsgAndCertEncodingType: UInt,
    public var cCertStore: UInt,
    rghCertStoreCtorArg: MutPtr,
) {
    public var rghCertStore: MutPtr = rghCertStoreCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        dwMsgAndCertEncodingType = 0u,
        cCertStore = 0u,
        rghCertStoreCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): UInt = this.dwMsgAndCertEncodingType

    public operator fun component3(): UInt = this.cCertStore

    public operator fun component4(): MutPtr = this.rghCertStore

    public fun copy(cbSize: UInt = this.cbSize, dwMsgAndCertEncodingType: UInt = this.dwMsgAndCertEncodingType, cCertStore: UInt = this.cCertStore, rghCertStore: MutPtr = this.rghCertStore): CryptDecryptMessagePara = CryptDecryptMessagePara(cbSize = cbSize, dwMsgAndCertEncodingType = dwMsgAndCertEncodingType, cCertStore = cCertStore, rghCertStoreCtorArg = rghCertStore)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptDecryptMessagePara) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwMsgAndCertEncodingType != other.dwMsgAndCertEncodingType) return false
        if (this.cCertStore != other.cCertStore) return false
        if (this.rghCertStore != other.rghCertStore) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwMsgAndCertEncodingType.hashCode()
        result = 31 * result + this.cCertStore.hashCode()
        result = 31 * result + this.rghCertStore.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptDecryptMessagePara> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptDecryptMessagePara> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): CryptDecryptMessagePara =
                    CryptDecryptMessagePara(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: CryptDecryptMessagePara) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwMsgAndCertEncodingType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cCertStore)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.rghCertStore)
                }
            }

        public operator fun invoke(
            cbSize: UInt = 0u,
            dwMsgAndCertEncodingType: UInt = 0u,
            cCertStore: UInt = 0u,
            rghCertStore: MutPtr = MutPtr(0L),
        ): CryptDecryptMessagePara =
            CryptDecryptMessagePara(
                cbSize = cbSize,
                dwMsgAndCertEncodingType = dwMsgAndCertEncodingType,
                cCertStore = cCertStore,
                rghCertStoreCtorArg = rghCertStore,
            )
    }
}

public class CryptDefaultContextMultiOidPara internal constructor(
    public var cOID: UInt,
    rgpszOIDCtorArg: MutPtr,
) {
    public var rgpszOID: MutPtr = rgpszOIDCtorArg
        internal set

    public constructor() : this(
        cOID = 0u,
        rgpszOIDCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cOID

    public operator fun component2(): MutPtr = this.rgpszOID

    public fun copy(cOID: UInt = this.cOID, rgpszOID: MutPtr = this.rgpszOID): CryptDefaultContextMultiOidPara = CryptDefaultContextMultiOidPara(cOID = cOID, rgpszOIDCtorArg = rgpszOID)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptDefaultContextMultiOidPara) return false
        if (this.cOID != other.cOID) return false
        if (this.rgpszOID != other.rgpszOID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cOID.hashCode()
        result = 31 * result + this.rgpszOID.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptDefaultContextMultiOidPara> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptDefaultContextMultiOidPara> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CryptDefaultContextMultiOidPara =
                    CryptDefaultContextMultiOidPara(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CryptDefaultContextMultiOidPara) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cOID)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.rgpszOID)
                }
            }

        public operator fun invoke(
            cOID: UInt = 0u,
            rgpszOID: MutPtr = MutPtr(0L),
        ): CryptDefaultContextMultiOidPara =
            CryptDefaultContextMultiOidPara(
                cOID = cOID,
                rgpszOIDCtorArg = rgpszOID,
            )
    }
}

public data class CryptDesKeyState(
    public var key: UByteArray = UByteArray(8),
    public var iv: UByteArray = UByteArray(8),
    public var feedback: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptDesKeyState) return false
        if (!this.key.contentEquals(other.key)) return false
        if (!this.iv.contentEquals(other.iv)) return false
        if (!this.feedback.contentEquals(other.feedback)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.key.contentHashCode()
        result = 31 * result + this.iv.contentHashCode()
        result = 31 * result + this.feedback.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptDesKeyState> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptDesKeyState> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): CryptDesKeyState =
                    CryptDesKeyState(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 16L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: CryptDesKeyState) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr, value.key.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 8L, value.iv.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 16L, value.feedback.toList())
                }
            }
    }
}

public data class CryptEccCmsSharedInfo(
    public var algorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var entityUInfo: CryptIntegerBlob = CryptIntegerBlob(),
    public var rgbSuppPubInfo: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptEccCmsSharedInfo) return false
        if (this.algorithm != other.algorithm) return false
        if (this.entityUInfo != other.entityUInfo) return false
        if (!this.rgbSuppPubInfo.contentEquals(other.rgbSuppPubInfo)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.algorithm.hashCode()
        result = 31 * result + this.entityUInfo.hashCode()
        result = 31 * result + this.rgbSuppPubInfo.contentHashCode()
        return result
    }
}

public class CryptEccPrivateKeyInfo internal constructor(
    public var dwVersion: UInt,
    public var privateKey: CryptIntegerBlob,
    szCurveOidCtorArg: Pstr,
    public var publicKey: CryptBitBlob,
) {
    public var szCurveOid: Pstr = szCurveOidCtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        privateKey = CryptIntegerBlob(),
        szCurveOidCtorArg = MutPtr(0L),
        publicKey = CryptBitBlob(),
    )

    public operator fun component1(): UInt = this.dwVersion

    public operator fun component2(): CryptIntegerBlob = this.privateKey

    public operator fun component3(): Pstr = this.szCurveOid

    public operator fun component4(): CryptBitBlob = this.publicKey

    public fun copy(dwVersion: UInt = this.dwVersion, privateKey: CryptIntegerBlob = this.privateKey, szCurveOid: Pstr = this.szCurveOid, publicKey: CryptBitBlob = this.publicKey): CryptEccPrivateKeyInfo = CryptEccPrivateKeyInfo(dwVersion = dwVersion, privateKey = privateKey, szCurveOidCtorArg = szCurveOid, publicKey = publicKey)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptEccPrivateKeyInfo) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.privateKey != other.privateKey) return false
        if (this.szCurveOid != other.szCurveOid) return false
        if (this.publicKey != other.publicKey) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.privateKey.hashCode()
        result = 31 * result + this.szCurveOid.hashCode()
        result = 31 * result + this.publicKey.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwVersion: UInt = 0u,
            privateKey: CryptIntegerBlob = CryptIntegerBlob(),
            szCurveOid: Pstr = MutPtr(0L),
            publicKey: CryptBitBlob = CryptBitBlob(),
        ): CryptEccPrivateKeyInfo =
            CryptEccPrivateKeyInfo(
                dwVersion = dwVersion,
                privateKey = privateKey,
                szCurveOidCtorArg = szCurveOid,
                publicKey = publicKey,
            )
    }
}

public data class CryptEncodePara(
    public var cbSize: UInt = 0u,
    public var pfnAlloc: PfnCryptAlloc = null,
    public var pfnFree: PfnCryptFree = null,
)

public data class CryptEncryptedPrivateKeyInfo(
    public var encryptionAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var encryptedPrivateKey: CryptIntegerBlob = CryptIntegerBlob(),
)

public class CryptEncryptMessagePara internal constructor(
    public var cbSize: UInt,
    public var dwMsgEncodingType: UInt,
    public var hCryptProv: HcryptprovLegacy,
    public var contentEncryptionAlgorithm: CryptAlgorithmIdentifier,
    pvEncryptionAuxInfoCtorArg: MutPtr,
    public var dwFlags: UInt,
    public var dwInnerContentType: UInt,
) {
    public var pvEncryptionAuxInfo: MutPtr = pvEncryptionAuxInfoCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        dwMsgEncodingType = 0u,
        hCryptProv = 0uL,
        contentEncryptionAlgorithm = CryptAlgorithmIdentifier(),
        pvEncryptionAuxInfoCtorArg = MutPtr(0L),
        dwFlags = 0u,
        dwInnerContentType = 0u,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): UInt = this.dwMsgEncodingType

    public operator fun component3(): HcryptprovLegacy = this.hCryptProv

    public operator fun component4(): CryptAlgorithmIdentifier = this.contentEncryptionAlgorithm

    public operator fun component5(): MutPtr = this.pvEncryptionAuxInfo

    public operator fun component6(): UInt = this.dwFlags

    public operator fun component7(): UInt = this.dwInnerContentType

    public fun copy(cbSize: UInt = this.cbSize, dwMsgEncodingType: UInt = this.dwMsgEncodingType, hCryptProv: HcryptprovLegacy = this.hCryptProv, contentEncryptionAlgorithm: CryptAlgorithmIdentifier = this.contentEncryptionAlgorithm, pvEncryptionAuxInfo: MutPtr = this.pvEncryptionAuxInfo, dwFlags: UInt = this.dwFlags, dwInnerContentType: UInt = this.dwInnerContentType): CryptEncryptMessagePara = CryptEncryptMessagePara(cbSize = cbSize, dwMsgEncodingType = dwMsgEncodingType, hCryptProv = hCryptProv, contentEncryptionAlgorithm = contentEncryptionAlgorithm, pvEncryptionAuxInfoCtorArg = pvEncryptionAuxInfo, dwFlags = dwFlags, dwInnerContentType = dwInnerContentType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptEncryptMessagePara) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwMsgEncodingType != other.dwMsgEncodingType) return false
        if (this.hCryptProv != other.hCryptProv) return false
        if (this.contentEncryptionAlgorithm != other.contentEncryptionAlgorithm) return false
        if (this.pvEncryptionAuxInfo != other.pvEncryptionAuxInfo) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwInnerContentType != other.dwInnerContentType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwMsgEncodingType.hashCode()
        result = 31 * result + this.hCryptProv.hashCode()
        result = 31 * result + this.contentEncryptionAlgorithm.hashCode()
        result = 31 * result + this.pvEncryptionAuxInfo.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwInnerContentType.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            dwMsgEncodingType: UInt = 0u,
            hCryptProv: HcryptprovLegacy = 0uL,
            contentEncryptionAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
            pvEncryptionAuxInfo: MutPtr = MutPtr(0L),
            dwFlags: UInt = 0u,
            dwInnerContentType: UInt = 0u,
        ): CryptEncryptMessagePara =
            CryptEncryptMessagePara(
                cbSize = cbSize,
                dwMsgEncodingType = dwMsgEncodingType,
                hCryptProv = hCryptProv,
                contentEncryptionAlgorithm = contentEncryptionAlgorithm,
                pvEncryptionAuxInfoCtorArg = pvEncryptionAuxInfo,
                dwFlags = dwFlags,
                dwInnerContentType = dwInnerContentType,
            )
    }
}

public class CryptEnrollmentNameValuePair internal constructor(
    pwszNameCtorArg: Pwstr,
    pwszValueCtorArg: Pwstr,
) {
    public var pwszName: Pwstr = pwszNameCtorArg
        internal set

    public var pwszValue: Pwstr = pwszValueCtorArg
        internal set

    public constructor() : this(
        pwszNameCtorArg = MutPtr(0L),
        pwszValueCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.pwszName

    public operator fun component2(): Pwstr = this.pwszValue

    public fun copy(pwszName: Pwstr = this.pwszName, pwszValue: Pwstr = this.pwszValue): CryptEnrollmentNameValuePair = CryptEnrollmentNameValuePair(pwszNameCtorArg = pwszName, pwszValueCtorArg = pwszValue)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptEnrollmentNameValuePair) return false
        if (this.pwszName != other.pwszName) return false
        if (this.pwszValue != other.pwszValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwszName.hashCode()
        result = 31 * result + this.pwszValue.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwszName: Pwstr = MutPtr(0L),
            pwszValue: Pwstr = MutPtr(0L),
        ): CryptEnrollmentNameValuePair =
            CryptEnrollmentNameValuePair(
                pwszNameCtorArg = pwszName,
                pwszValueCtorArg = pwszValue,
            )
    }
}

public class CryptGetTimeValidObjectExtraInfo internal constructor(
    public var cbSize: UInt,
    public var iDeltaCrlIndicator: Int,
    pftCacheResyncCtorArg: MutPtr,
    pLastSyncTimeCtorArg: MutPtr,
    pMaxAgeTimeCtorArg: MutPtr,
    pChainParaCtorArg: MutPtr,
    pDeltaCrlIndicatorCtorArg: MutPtr,
) {
    public var pftCacheResync: MutPtr = pftCacheResyncCtorArg
        internal set

    public var pLastSyncTime: MutPtr = pLastSyncTimeCtorArg
        internal set

    public var pMaxAgeTime: MutPtr = pMaxAgeTimeCtorArg
        internal set

    public var pChainPara: MutPtr = pChainParaCtorArg
        internal set

    public var pDeltaCrlIndicator: MutPtr = pDeltaCrlIndicatorCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        iDeltaCrlIndicator = 0,
        pftCacheResyncCtorArg = MutPtr(0L),
        pLastSyncTimeCtorArg = MutPtr(0L),
        pMaxAgeTimeCtorArg = MutPtr(0L),
        pChainParaCtorArg = MutPtr(0L),
        pDeltaCrlIndicatorCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Int = this.iDeltaCrlIndicator

    public operator fun component3(): MutPtr = this.pftCacheResync

    public operator fun component4(): MutPtr = this.pLastSyncTime

    public operator fun component5(): MutPtr = this.pMaxAgeTime

    public operator fun component6(): MutPtr = this.pChainPara

    public operator fun component7(): MutPtr = this.pDeltaCrlIndicator

    public fun copy(cbSize: UInt = this.cbSize, iDeltaCrlIndicator: Int = this.iDeltaCrlIndicator, pftCacheResync: MutPtr = this.pftCacheResync, pLastSyncTime: MutPtr = this.pLastSyncTime, pMaxAgeTime: MutPtr = this.pMaxAgeTime, pChainPara: MutPtr = this.pChainPara, pDeltaCrlIndicator: MutPtr = this.pDeltaCrlIndicator): CryptGetTimeValidObjectExtraInfo = CryptGetTimeValidObjectExtraInfo(cbSize = cbSize, iDeltaCrlIndicator = iDeltaCrlIndicator, pftCacheResyncCtorArg = pftCacheResync, pLastSyncTimeCtorArg = pLastSyncTime, pMaxAgeTimeCtorArg = pMaxAgeTime, pChainParaCtorArg = pChainPara, pDeltaCrlIndicatorCtorArg = pDeltaCrlIndicator)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptGetTimeValidObjectExtraInfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.iDeltaCrlIndicator != other.iDeltaCrlIndicator) return false
        if (this.pftCacheResync != other.pftCacheResync) return false
        if (this.pLastSyncTime != other.pLastSyncTime) return false
        if (this.pMaxAgeTime != other.pMaxAgeTime) return false
        if (this.pChainPara != other.pChainPara) return false
        if (this.pDeltaCrlIndicator != other.pDeltaCrlIndicator) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.iDeltaCrlIndicator.hashCode()
        result = 31 * result + this.pftCacheResync.hashCode()
        result = 31 * result + this.pLastSyncTime.hashCode()
        result = 31 * result + this.pMaxAgeTime.hashCode()
        result = 31 * result + this.pChainPara.hashCode()
        result = 31 * result + this.pDeltaCrlIndicator.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptGetTimeValidObjectExtraInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptGetTimeValidObjectExtraInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): CryptGetTimeValidObjectExtraInfo =
                    CryptGetTimeValidObjectExtraInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: CryptGetTimeValidObjectExtraInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.iDeltaCrlIndicator)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pftCacheResync)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.pLastSyncTime)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.pMaxAgeTime)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 32L, value.pChainPara)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 40L, value.pDeltaCrlIndicator)
                }
            }

        public operator fun invoke(
            cbSize: UInt = 0u,
            iDeltaCrlIndicator: Int = 0,
            pftCacheResync: MutPtr = MutPtr(0L),
            pLastSyncTime: MutPtr = MutPtr(0L),
            pMaxAgeTime: MutPtr = MutPtr(0L),
            pChainPara: MutPtr = MutPtr(0L),
            pDeltaCrlIndicator: MutPtr = MutPtr(0L),
        ): CryptGetTimeValidObjectExtraInfo =
            CryptGetTimeValidObjectExtraInfo(
                cbSize = cbSize,
                iDeltaCrlIndicator = iDeltaCrlIndicator,
                pftCacheResyncCtorArg = pftCacheResync,
                pLastSyncTimeCtorArg = pLastSyncTime,
                pMaxAgeTimeCtorArg = pMaxAgeTime,
                pChainParaCtorArg = pChainPara,
                pDeltaCrlIndicatorCtorArg = pDeltaCrlIndicator,
            )
    }
}

public data class CryptHashInfo(
    public var hashAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var hash: CryptIntegerBlob = CryptIntegerBlob(),
)

public class CryptHashMessagePara internal constructor(
    public var cbSize: UInt,
    public var dwMsgEncodingType: UInt,
    public var hCryptProv: HcryptprovLegacy,
    public var hashAlgorithm: CryptAlgorithmIdentifier,
    pvHashAuxInfoCtorArg: MutPtr,
) {
    public var pvHashAuxInfo: MutPtr = pvHashAuxInfoCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        dwMsgEncodingType = 0u,
        hCryptProv = 0uL,
        hashAlgorithm = CryptAlgorithmIdentifier(),
        pvHashAuxInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): UInt = this.dwMsgEncodingType

    public operator fun component3(): HcryptprovLegacy = this.hCryptProv

    public operator fun component4(): CryptAlgorithmIdentifier = this.hashAlgorithm

    public operator fun component5(): MutPtr = this.pvHashAuxInfo

    public fun copy(cbSize: UInt = this.cbSize, dwMsgEncodingType: UInt = this.dwMsgEncodingType, hCryptProv: HcryptprovLegacy = this.hCryptProv, hashAlgorithm: CryptAlgorithmIdentifier = this.hashAlgorithm, pvHashAuxInfo: MutPtr = this.pvHashAuxInfo): CryptHashMessagePara = CryptHashMessagePara(cbSize = cbSize, dwMsgEncodingType = dwMsgEncodingType, hCryptProv = hCryptProv, hashAlgorithm = hashAlgorithm, pvHashAuxInfoCtorArg = pvHashAuxInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptHashMessagePara) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwMsgEncodingType != other.dwMsgEncodingType) return false
        if (this.hCryptProv != other.hCryptProv) return false
        if (this.hashAlgorithm != other.hashAlgorithm) return false
        if (this.pvHashAuxInfo != other.pvHashAuxInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwMsgEncodingType.hashCode()
        result = 31 * result + this.hCryptProv.hashCode()
        result = 31 * result + this.hashAlgorithm.hashCode()
        result = 31 * result + this.pvHashAuxInfo.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            dwMsgEncodingType: UInt = 0u,
            hCryptProv: HcryptprovLegacy = 0uL,
            hashAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
            pvHashAuxInfo: MutPtr = MutPtr(0L),
        ): CryptHashMessagePara =
            CryptHashMessagePara(
                cbSize = cbSize,
                dwMsgEncodingType = dwMsgEncodingType,
                hCryptProv = hCryptProv,
                hashAlgorithm = hashAlgorithm,
                pvHashAuxInfoCtorArg = pvHashAuxInfo,
            )
    }
}

public class CryptImageRef internal constructor(
    pszImageCtorArg: Pwstr,
    public var dwFlags: CryptImageRefFlags,
) {
    public var pszImage: Pwstr = pszImageCtorArg
        internal set

    public constructor() : this(
        pszImageCtorArg = MutPtr(0L),
        dwFlags = 0u,
    )

    public operator fun component1(): Pwstr = this.pszImage

    public operator fun component2(): CryptImageRefFlags = this.dwFlags

    public fun copy(pszImage: Pwstr = this.pszImage, dwFlags: CryptImageRefFlags = this.dwFlags): CryptImageRef = CryptImageRef(pszImageCtorArg = pszImage, dwFlags = dwFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptImageRef) return false
        if (this.pszImage != other.pszImage) return false
        if (this.dwFlags != other.dwFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszImage.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszImage: Pwstr = MutPtr(0L),
            dwFlags: CryptImageRefFlags = 0u,
        ): CryptImageRef =
            CryptImageRef(
                pszImageCtorArg = pszImage,
                dwFlags = dwFlags,
            )
    }
}

public class CryptImageReg internal constructor(
    pszImageCtorArg: Pwstr,
    public var cInterfaces: UInt,
    rgpInterfacesCtorArg: MutPtr,
) {
    public var pszImage: Pwstr = pszImageCtorArg
        internal set

    public var rgpInterfaces: MutPtr = rgpInterfacesCtorArg
        internal set

    public constructor() : this(
        pszImageCtorArg = MutPtr(0L),
        cInterfaces = 0u,
        rgpInterfacesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.pszImage

    public operator fun component2(): UInt = this.cInterfaces

    public operator fun component3(): MutPtr = this.rgpInterfaces

    public fun copy(pszImage: Pwstr = this.pszImage, cInterfaces: UInt = this.cInterfaces, rgpInterfaces: MutPtr = this.rgpInterfaces): CryptImageReg = CryptImageReg(pszImageCtorArg = pszImage, cInterfaces = cInterfaces, rgpInterfacesCtorArg = rgpInterfaces)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptImageReg) return false
        if (this.pszImage != other.pszImage) return false
        if (this.cInterfaces != other.cInterfaces) return false
        if (this.rgpInterfaces != other.rgpInterfaces) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszImage.hashCode()
        result = 31 * result + this.cInterfaces.hashCode()
        result = 31 * result + this.rgpInterfaces.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszImage: Pwstr = MutPtr(0L),
            cInterfaces: UInt = 0u,
            rgpInterfaces: MutPtr = MutPtr(0L),
        ): CryptImageReg =
            CryptImageReg(
                pszImageCtorArg = pszImage,
                cInterfaces = cInterfaces,
                rgpInterfacesCtorArg = rgpInterfaces,
            )
    }
}

public class CryptIntegerBlob internal constructor(
    public var cbData: UInt,
    pbDataCtorArg: MutPtr,
) {
    public var pbData: MutPtr = pbDataCtorArg
        internal set

    public constructor() : this(
        cbData = 0u,
        pbDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbData

    public operator fun component2(): MutPtr = this.pbData

    public fun copy(cbData: UInt = this.cbData, pbData: MutPtr = this.pbData): CryptIntegerBlob = CryptIntegerBlob(cbData = cbData, pbDataCtorArg = pbData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptIntegerBlob) return false
        if (this.cbData != other.cbData) return false
        if (this.pbData != other.pbData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbData.hashCode()
        result = 31 * result + this.pbData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptIntegerBlob> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptIntegerBlob> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CryptIntegerBlob =
                    CryptIntegerBlob(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CryptIntegerBlob) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbData)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pbData)
                }
            }

        public operator fun invoke(
            cbData: UInt = 0u,
            pbData: MutPtr = MutPtr(0L),
        ): CryptIntegerBlob =
            CryptIntegerBlob(
                cbData = cbData,
                pbDataCtorArg = pbData,
            )
    }
}

public class CryptInterfaceReg internal constructor(
    public var dwInterface: BcryptInterface,
    public var dwFlags: BcryptTable,
    public var cFunctions: UInt,
    rgpszFunctionsCtorArg: MutPtr,
) {
    public var rgpszFunctions: MutPtr = rgpszFunctionsCtorArg
        internal set

    public constructor() : this(
        dwInterface = 0u,
        dwFlags = 0u,
        cFunctions = 0u,
        rgpszFunctionsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): BcryptInterface = this.dwInterface

    public operator fun component2(): BcryptTable = this.dwFlags

    public operator fun component3(): UInt = this.cFunctions

    public operator fun component4(): MutPtr = this.rgpszFunctions

    public fun copy(dwInterface: BcryptInterface = this.dwInterface, dwFlags: BcryptTable = this.dwFlags, cFunctions: UInt = this.cFunctions, rgpszFunctions: MutPtr = this.rgpszFunctions): CryptInterfaceReg = CryptInterfaceReg(dwInterface = dwInterface, dwFlags = dwFlags, cFunctions = cFunctions, rgpszFunctionsCtorArg = rgpszFunctions)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptInterfaceReg) return false
        if (this.dwInterface != other.dwInterface) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.cFunctions != other.cFunctions) return false
        if (this.rgpszFunctions != other.rgpszFunctions) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwInterface.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.cFunctions.hashCode()
        result = 31 * result + this.rgpszFunctions.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptInterfaceReg> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptInterfaceReg> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): CryptInterfaceReg =
                    CryptInterfaceReg(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: CryptInterfaceReg) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwInterface)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cFunctions)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.rgpszFunctions)
                }
            }

        public operator fun invoke(
            dwInterface: BcryptInterface = 0u,
            dwFlags: BcryptTable = 0u,
            cFunctions: UInt = 0u,
            rgpszFunctions: MutPtr = MutPtr(0L),
        ): CryptInterfaceReg =
            CryptInterfaceReg(
                dwInterface = dwInterface,
                dwFlags = dwFlags,
                cFunctions = cFunctions,
                rgpszFunctionsCtorArg = rgpszFunctions,
            )
    }
}

public class CryptKeyProvInfo internal constructor(
    pwszContainerNameCtorArg: Pwstr,
    pwszProvNameCtorArg: Pwstr,
    public var dwProvType: UInt,
    public var dwFlags: CryptKeyFlags,
    public var cProvParam: UInt,
    rgProvParamCtorArg: MutPtr,
    public var dwKeySpec: UInt,
) {
    public var pwszContainerName: Pwstr = pwszContainerNameCtorArg
        internal set

    public var pwszProvName: Pwstr = pwszProvNameCtorArg
        internal set

    public var rgProvParam: MutPtr = rgProvParamCtorArg
        internal set

    public constructor() : this(
        pwszContainerNameCtorArg = MutPtr(0L),
        pwszProvNameCtorArg = MutPtr(0L),
        dwProvType = 0u,
        dwFlags = 0u,
        cProvParam = 0u,
        rgProvParamCtorArg = MutPtr(0L),
        dwKeySpec = 0u,
    )

    public operator fun component1(): Pwstr = this.pwszContainerName

    public operator fun component2(): Pwstr = this.pwszProvName

    public operator fun component3(): UInt = this.dwProvType

    public operator fun component4(): CryptKeyFlags = this.dwFlags

    public operator fun component5(): UInt = this.cProvParam

    public operator fun component6(): MutPtr = this.rgProvParam

    public operator fun component7(): UInt = this.dwKeySpec

    public fun copy(pwszContainerName: Pwstr = this.pwszContainerName, pwszProvName: Pwstr = this.pwszProvName, dwProvType: UInt = this.dwProvType, dwFlags: CryptKeyFlags = this.dwFlags, cProvParam: UInt = this.cProvParam, rgProvParam: MutPtr = this.rgProvParam, dwKeySpec: UInt = this.dwKeySpec): CryptKeyProvInfo = CryptKeyProvInfo(pwszContainerNameCtorArg = pwszContainerName, pwszProvNameCtorArg = pwszProvName, dwProvType = dwProvType, dwFlags = dwFlags, cProvParam = cProvParam, rgProvParamCtorArg = rgProvParam, dwKeySpec = dwKeySpec)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptKeyProvInfo) return false
        if (this.pwszContainerName != other.pwszContainerName) return false
        if (this.pwszProvName != other.pwszProvName) return false
        if (this.dwProvType != other.dwProvType) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.cProvParam != other.cProvParam) return false
        if (this.rgProvParam != other.rgProvParam) return false
        if (this.dwKeySpec != other.dwKeySpec) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwszContainerName.hashCode()
        result = 31 * result + this.pwszProvName.hashCode()
        result = 31 * result + this.dwProvType.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.cProvParam.hashCode()
        result = 31 * result + this.rgProvParam.hashCode()
        result = 31 * result + this.dwKeySpec.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwszContainerName: Pwstr = MutPtr(0L),
            pwszProvName: Pwstr = MutPtr(0L),
            dwProvType: UInt = 0u,
            dwFlags: CryptKeyFlags = 0u,
            cProvParam: UInt = 0u,
            rgProvParam: MutPtr = MutPtr(0L),
            dwKeySpec: UInt = 0u,
        ): CryptKeyProvInfo =
            CryptKeyProvInfo(
                pwszContainerNameCtorArg = pwszContainerName,
                pwszProvNameCtorArg = pwszProvName,
                dwProvType = dwProvType,
                dwFlags = dwFlags,
                cProvParam = cProvParam,
                rgProvParamCtorArg = rgProvParam,
                dwKeySpec = dwKeySpec,
            )
    }
}

public class CryptKeyProvParam internal constructor(
    public var dwParam: UInt,
    pbDataCtorArg: MutPtr,
    public var cbData: UInt,
    public var dwFlags: UInt,
) {
    public var pbData: MutPtr = pbDataCtorArg
        internal set

    public constructor() : this(
        dwParam = 0u,
        pbDataCtorArg = MutPtr(0L),
        cbData = 0u,
        dwFlags = 0u,
    )

    public operator fun component1(): UInt = this.dwParam

    public operator fun component2(): MutPtr = this.pbData

    public operator fun component3(): UInt = this.cbData

    public operator fun component4(): UInt = this.dwFlags

    public fun copy(dwParam: UInt = this.dwParam, pbData: MutPtr = this.pbData, cbData: UInt = this.cbData, dwFlags: UInt = this.dwFlags): CryptKeyProvParam = CryptKeyProvParam(dwParam = dwParam, pbDataCtorArg = pbData, cbData = cbData, dwFlags = dwFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptKeyProvParam) return false
        if (this.dwParam != other.dwParam) return false
        if (this.pbData != other.pbData) return false
        if (this.cbData != other.cbData) return false
        if (this.dwFlags != other.dwFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwParam.hashCode()
        result = 31 * result + this.pbData.hashCode()
        result = 31 * result + this.cbData.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptKeyProvParam> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptKeyProvParam> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): CryptKeyProvParam =
                    CryptKeyProvParam(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: CryptKeyProvParam) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwParam)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pbData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cbData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwFlags)
                }
            }

        public operator fun invoke(
            dwParam: UInt = 0u,
            pbData: MutPtr = MutPtr(0L),
            cbData: UInt = 0u,
            dwFlags: UInt = 0u,
        ): CryptKeyProvParam =
            CryptKeyProvParam(
                dwParam = dwParam,
                pbDataCtorArg = pbData,
                cbData = cbData,
                dwFlags = dwFlags,
            )
    }
}

public class CryptKeySignMessagePara internal constructor(
    public var cbSize: UInt,
    public var dwMsgAndCertEncodingType: CertQueryEncodingType,
    public var anonymous: CryptKeySignMessagePara0,
    public var dwKeySpec: CertKeySpec,
    public var hashAlgorithm: CryptAlgorithmIdentifier,
    pvHashAuxInfoCtorArg: MutPtr,
    public var pubKeyAlgorithm: CryptAlgorithmIdentifier,
) {
    public var pvHashAuxInfo: MutPtr = pvHashAuxInfoCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        dwMsgAndCertEncodingType = 0u,
        anonymous = CryptKeySignMessagePara0(),
        dwKeySpec = 0u,
        hashAlgorithm = CryptAlgorithmIdentifier(),
        pvHashAuxInfoCtorArg = MutPtr(0L),
        pubKeyAlgorithm = CryptAlgorithmIdentifier(),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): CertQueryEncodingType = this.dwMsgAndCertEncodingType

    public operator fun component3(): CryptKeySignMessagePara0 = this.anonymous

    public operator fun component4(): CertKeySpec = this.dwKeySpec

    public operator fun component5(): CryptAlgorithmIdentifier = this.hashAlgorithm

    public operator fun component6(): MutPtr = this.pvHashAuxInfo

    public operator fun component7(): CryptAlgorithmIdentifier = this.pubKeyAlgorithm

    public fun copy(cbSize: UInt = this.cbSize, dwMsgAndCertEncodingType: CertQueryEncodingType = this.dwMsgAndCertEncodingType, anonymous: CryptKeySignMessagePara0 = this.anonymous, dwKeySpec: CertKeySpec = this.dwKeySpec, hashAlgorithm: CryptAlgorithmIdentifier = this.hashAlgorithm, pvHashAuxInfo: MutPtr = this.pvHashAuxInfo, pubKeyAlgorithm: CryptAlgorithmIdentifier = this.pubKeyAlgorithm): CryptKeySignMessagePara = CryptKeySignMessagePara(cbSize = cbSize, dwMsgAndCertEncodingType = dwMsgAndCertEncodingType, anonymous = anonymous, dwKeySpec = dwKeySpec, hashAlgorithm = hashAlgorithm, pvHashAuxInfoCtorArg = pvHashAuxInfo, pubKeyAlgorithm = pubKeyAlgorithm)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptKeySignMessagePara) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwMsgAndCertEncodingType != other.dwMsgAndCertEncodingType) return false
        if (this.anonymous != other.anonymous) return false
        if (this.dwKeySpec != other.dwKeySpec) return false
        if (this.hashAlgorithm != other.hashAlgorithm) return false
        if (this.pvHashAuxInfo != other.pvHashAuxInfo) return false
        if (this.pubKeyAlgorithm != other.pubKeyAlgorithm) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwMsgAndCertEncodingType.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.dwKeySpec.hashCode()
        result = 31 * result + this.hashAlgorithm.hashCode()
        result = 31 * result + this.pvHashAuxInfo.hashCode()
        result = 31 * result + this.pubKeyAlgorithm.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            dwMsgAndCertEncodingType: CertQueryEncodingType = 0u,
            anonymous: CryptKeySignMessagePara0 = CryptKeySignMessagePara0(),
            dwKeySpec: CertKeySpec = 0u,
            hashAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
            pvHashAuxInfo: MutPtr = MutPtr(0L),
            pubKeyAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
        ): CryptKeySignMessagePara =
            CryptKeySignMessagePara(
                cbSize = cbSize,
                dwMsgAndCertEncodingType = dwMsgAndCertEncodingType,
                anonymous = anonymous,
                dwKeySpec = dwKeySpec,
                hashAlgorithm = hashAlgorithm,
                pvHashAuxInfoCtorArg = pvHashAuxInfo,
                pubKeyAlgorithm = pubKeyAlgorithm,
            )
    }
}

public data class CryptKeySignMessagePara0(
    public var hCryptProv: Int = 0,
    public var hNCryptKey: NcryptKeyHandle = 0uL,
)

public data class CryptKeyVerifyMessagePara(
    public var cbSize: UInt = 0u,
    public var dwMsgEncodingType: UInt = 0u,
    public var hCryptProv: HcryptprovLegacy = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptKeyVerifyMessagePara> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptKeyVerifyMessagePara> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CryptKeyVerifyMessagePara =
                    CryptKeyVerifyMessagePara(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CryptKeyVerifyMessagePara) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwMsgEncodingType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.hCryptProv)
                }
            }
    }
}

public class CryptMaskGenAlgorithm internal constructor(
    pszObjIdCtorArg: Pstr,
    public var hashAlgorithm: CryptAlgorithmIdentifier,
) {
    public var pszObjId: Pstr = pszObjIdCtorArg
        internal set

    public constructor() : this(
        pszObjIdCtorArg = MutPtr(0L),
        hashAlgorithm = CryptAlgorithmIdentifier(),
    )

    public operator fun component1(): Pstr = this.pszObjId

    public operator fun component2(): CryptAlgorithmIdentifier = this.hashAlgorithm

    public fun copy(pszObjId: Pstr = this.pszObjId, hashAlgorithm: CryptAlgorithmIdentifier = this.hashAlgorithm): CryptMaskGenAlgorithm = CryptMaskGenAlgorithm(pszObjIdCtorArg = pszObjId, hashAlgorithm = hashAlgorithm)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptMaskGenAlgorithm) return false
        if (this.pszObjId != other.pszObjId) return false
        if (this.hashAlgorithm != other.hashAlgorithm) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszObjId.hashCode()
        result = 31 * result + this.hashAlgorithm.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszObjId: Pstr = MutPtr(0L),
            hashAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
        ): CryptMaskGenAlgorithm =
            CryptMaskGenAlgorithm(
                pszObjIdCtorArg = pszObjId,
                hashAlgorithm = hashAlgorithm,
            )
    }
}

public data class CryptObjectLocatorProviderTable(
    public var cbSize: UInt = 0u,
    public var pfnGet: PfnCryptObjectLocatorProviderGet = null,
    public var pfnRelease: PfnCryptObjectLocatorProviderRelease = null,
    public var pfnFreePassword: PfnCryptObjectLocatorProviderFreePassword = null,
    public var pfnFree: PfnCryptObjectLocatorProviderFree = null,
    public var pfnFreeIdentifier: PfnCryptObjectLocatorProviderFreeIdentifier = null,
)

public class CryptObjidTable internal constructor(
    public var dwAlgId: UInt,
    pszObjIdCtorArg: Pcstr,
) {
    public var pszObjId: Pcstr = pszObjIdCtorArg
        internal set

    public constructor() : this(
        dwAlgId = 0u,
        pszObjIdCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.dwAlgId

    public operator fun component2(): Pcstr = this.pszObjId

    public fun copy(dwAlgId: UInt = this.dwAlgId, pszObjId: Pcstr = this.pszObjId): CryptObjidTable = CryptObjidTable(dwAlgId = dwAlgId, pszObjIdCtorArg = pszObjId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptObjidTable) return false
        if (this.dwAlgId != other.dwAlgId) return false
        if (this.pszObjId != other.pszObjId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwAlgId.hashCode()
        result = 31 * result + this.pszObjId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwAlgId: UInt = 0u,
            pszObjId: Pcstr = ConstPtr(0L),
        ): CryptObjidTable =
            CryptObjidTable(
                dwAlgId = dwAlgId,
                pszObjIdCtorArg = pszObjId,
            )
    }
}

public class CryptOidFuncEntry internal constructor(
    pszOIDCtorArg: Pcstr,
    pvFuncAddrCtorArg: MutPtr,
) {
    public var pszOID: Pcstr = pszOIDCtorArg
        internal set

    public var pvFuncAddr: MutPtr = pvFuncAddrCtorArg
        internal set

    public constructor() : this(
        pszOIDCtorArg = ConstPtr(0L),
        pvFuncAddrCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pcstr = this.pszOID

    public operator fun component2(): MutPtr = this.pvFuncAddr

    public fun copy(pszOID: Pcstr = this.pszOID, pvFuncAddr: MutPtr = this.pvFuncAddr): CryptOidFuncEntry = CryptOidFuncEntry(pszOIDCtorArg = pszOID, pvFuncAddrCtorArg = pvFuncAddr)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptOidFuncEntry) return false
        if (this.pszOID != other.pszOID) return false
        if (this.pvFuncAddr != other.pvFuncAddr) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszOID.hashCode()
        result = 31 * result + this.pvFuncAddr.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszOID: Pcstr = ConstPtr(0L),
            pvFuncAddr: MutPtr = MutPtr(0L),
        ): CryptOidFuncEntry =
            CryptOidFuncEntry(
                pszOIDCtorArg = pszOID,
                pvFuncAddrCtorArg = pvFuncAddr,
            )
    }
}

public class CryptOidInfo internal constructor(
    public var cbSize: UInt,
    pszOIDCtorArg: Pcstr,
    pwszNameCtorArg: Pcwstr,
    public var dwGroupId: UInt,
    public var anonymous: CryptOidInfo0,
    public var extraInfo: CryptIntegerBlob,
) {
    public var pszOID: Pcstr = pszOIDCtorArg
        internal set

    public var pwszName: Pcwstr = pwszNameCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        pszOIDCtorArg = ConstPtr(0L),
        pwszNameCtorArg = ConstPtr(0L),
        dwGroupId = 0u,
        anonymous = CryptOidInfo0(),
        extraInfo = CryptIntegerBlob(),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Pcstr = this.pszOID

    public operator fun component3(): Pcwstr = this.pwszName

    public operator fun component4(): UInt = this.dwGroupId

    public operator fun component5(): CryptOidInfo0 = this.anonymous

    public operator fun component6(): CryptIntegerBlob = this.extraInfo

    public fun copy(cbSize: UInt = this.cbSize, pszOID: Pcstr = this.pszOID, pwszName: Pcwstr = this.pwszName, dwGroupId: UInt = this.dwGroupId, anonymous: CryptOidInfo0 = this.anonymous, extraInfo: CryptIntegerBlob = this.extraInfo): CryptOidInfo = CryptOidInfo(cbSize = cbSize, pszOIDCtorArg = pszOID, pwszNameCtorArg = pwszName, dwGroupId = dwGroupId, anonymous = anonymous, extraInfo = extraInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptOidInfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.pszOID != other.pszOID) return false
        if (this.pwszName != other.pwszName) return false
        if (this.dwGroupId != other.dwGroupId) return false
        if (this.anonymous != other.anonymous) return false
        if (this.extraInfo != other.extraInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.pszOID.hashCode()
        result = 31 * result + this.pwszName.hashCode()
        result = 31 * result + this.dwGroupId.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.extraInfo.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            pszOID: Pcstr = ConstPtr(0L),
            pwszName: Pcwstr = ConstPtr(0L),
            dwGroupId: UInt = 0u,
            anonymous: CryptOidInfo0 = CryptOidInfo0(),
            extraInfo: CryptIntegerBlob = CryptIntegerBlob(),
        ): CryptOidInfo =
            CryptOidInfo(
                cbSize = cbSize,
                pszOIDCtorArg = pszOID,
                pwszNameCtorArg = pwszName,
                dwGroupId = dwGroupId,
                anonymous = anonymous,
                extraInfo = extraInfo,
            )
    }
}

public data class CryptOidInfo0(
    public var dwValue: UInt = 0u,
    public var algid: AlgId = 0u,
    public var dwLength: UInt = 0u,
)

public class CryptPasswordCredentialsa internal constructor(
    public var cbSize: UInt,
    pszUsernameCtorArg: Pstr,
    pszPasswordCtorArg: Pstr,
) {
    public var pszUsername: Pstr = pszUsernameCtorArg
        internal set

    public var pszPassword: Pstr = pszPasswordCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        pszUsernameCtorArg = MutPtr(0L),
        pszPasswordCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Pstr = this.pszUsername

    public operator fun component3(): Pstr = this.pszPassword

    public fun copy(cbSize: UInt = this.cbSize, pszUsername: Pstr = this.pszUsername, pszPassword: Pstr = this.pszPassword): CryptPasswordCredentialsa = CryptPasswordCredentialsa(cbSize = cbSize, pszUsernameCtorArg = pszUsername, pszPasswordCtorArg = pszPassword)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptPasswordCredentialsa) return false
        if (this.cbSize != other.cbSize) return false
        if (this.pszUsername != other.pszUsername) return false
        if (this.pszPassword != other.pszPassword) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.pszUsername.hashCode()
        result = 31 * result + this.pszPassword.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            pszUsername: Pstr = MutPtr(0L),
            pszPassword: Pstr = MutPtr(0L),
        ): CryptPasswordCredentialsa =
            CryptPasswordCredentialsa(
                cbSize = cbSize,
                pszUsernameCtorArg = pszUsername,
                pszPasswordCtorArg = pszPassword,
            )
    }
}

public class CryptPasswordCredentialsw internal constructor(
    public var cbSize: UInt,
    pszUsernameCtorArg: Pwstr,
    pszPasswordCtorArg: Pwstr,
) {
    public var pszUsername: Pwstr = pszUsernameCtorArg
        internal set

    public var pszPassword: Pwstr = pszPasswordCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        pszUsernameCtorArg = MutPtr(0L),
        pszPasswordCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Pwstr = this.pszUsername

    public operator fun component3(): Pwstr = this.pszPassword

    public fun copy(cbSize: UInt = this.cbSize, pszUsername: Pwstr = this.pszUsername, pszPassword: Pwstr = this.pszPassword): CryptPasswordCredentialsw = CryptPasswordCredentialsw(cbSize = cbSize, pszUsernameCtorArg = pszUsername, pszPasswordCtorArg = pszPassword)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptPasswordCredentialsw) return false
        if (this.cbSize != other.cbSize) return false
        if (this.pszUsername != other.pszUsername) return false
        if (this.pszPassword != other.pszPassword) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.pszUsername.hashCode()
        result = 31 * result + this.pszPassword.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            pszUsername: Pwstr = MutPtr(0L),
            pszPassword: Pwstr = MutPtr(0L),
        ): CryptPasswordCredentialsw =
            CryptPasswordCredentialsw(
                cbSize = cbSize,
                pszUsernameCtorArg = pszUsername,
                pszPasswordCtorArg = pszPassword,
            )
    }
}

public data class CryptPkcs12PbeParams(
    public var iIterations: Int = 0,
    public var cbSalt: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptPkcs12PbeParams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptPkcs12PbeParams> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): CryptPkcs12PbeParams =
                    CryptPkcs12PbeParams(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: CryptPkcs12PbeParams) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.iIterations)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cbSalt)
                }
            }
    }
}

public class CryptPkcs8ExportParams internal constructor(
    public var hCryptProv: Int,
    public var dwKeySpec: UInt,
    pszPrivateKeyObjIdCtorArg: Pstr,
    public var pEncryptPrivateKeyFunc: PcryptEncryptPrivateKeyFunc,
    pVoidEncryptFuncCtorArg: MutPtr,
) {
    public var pszPrivateKeyObjId: Pstr = pszPrivateKeyObjIdCtorArg
        internal set

    public var pVoidEncryptFunc: MutPtr = pVoidEncryptFuncCtorArg
        internal set

    public constructor() : this(
        hCryptProv = 0,
        dwKeySpec = 0u,
        pszPrivateKeyObjIdCtorArg = MutPtr(0L),
        pEncryptPrivateKeyFunc = null,
        pVoidEncryptFuncCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.hCryptProv

    public operator fun component2(): UInt = this.dwKeySpec

    public operator fun component3(): Pstr = this.pszPrivateKeyObjId

    public operator fun component4(): PcryptEncryptPrivateKeyFunc = this.pEncryptPrivateKeyFunc

    public operator fun component5(): MutPtr = this.pVoidEncryptFunc

    public fun copy(hCryptProv: Int = this.hCryptProv, dwKeySpec: UInt = this.dwKeySpec, pszPrivateKeyObjId: Pstr = this.pszPrivateKeyObjId, pEncryptPrivateKeyFunc: PcryptEncryptPrivateKeyFunc = this.pEncryptPrivateKeyFunc, pVoidEncryptFunc: MutPtr = this.pVoidEncryptFunc): CryptPkcs8ExportParams = CryptPkcs8ExportParams(hCryptProv = hCryptProv, dwKeySpec = dwKeySpec, pszPrivateKeyObjIdCtorArg = pszPrivateKeyObjId, pEncryptPrivateKeyFunc = pEncryptPrivateKeyFunc, pVoidEncryptFuncCtorArg = pVoidEncryptFunc)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptPkcs8ExportParams) return false
        if (this.hCryptProv != other.hCryptProv) return false
        if (this.dwKeySpec != other.dwKeySpec) return false
        if (this.pszPrivateKeyObjId != other.pszPrivateKeyObjId) return false
        if (this.pEncryptPrivateKeyFunc != other.pEncryptPrivateKeyFunc) return false
        if (this.pVoidEncryptFunc != other.pVoidEncryptFunc) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hCryptProv.hashCode()
        result = 31 * result + this.dwKeySpec.hashCode()
        result = 31 * result + this.pszPrivateKeyObjId.hashCode()
        result = 31 * result + this.pEncryptPrivateKeyFunc.hashCode()
        result = 31 * result + this.pVoidEncryptFunc.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hCryptProv: Int = 0,
            dwKeySpec: UInt = 0u,
            pszPrivateKeyObjId: Pstr = MutPtr(0L),
            pEncryptPrivateKeyFunc: PcryptEncryptPrivateKeyFunc = null,
            pVoidEncryptFunc: MutPtr = MutPtr(0L),
        ): CryptPkcs8ExportParams =
            CryptPkcs8ExportParams(
                hCryptProv = hCryptProv,
                dwKeySpec = dwKeySpec,
                pszPrivateKeyObjIdCtorArg = pszPrivateKeyObjId,
                pEncryptPrivateKeyFunc = pEncryptPrivateKeyFunc,
                pVoidEncryptFuncCtorArg = pVoidEncryptFunc,
            )
    }
}

public class CryptPkcs8ImportParams internal constructor(
    public var privateKey: CryptIntegerBlob,
    public var pResolvehCryptProvFunc: PcryptResolveHcryptprovFunc,
    pVoidResolveFuncCtorArg: MutPtr,
    public var pDecryptPrivateKeyFunc: PcryptDecryptPrivateKeyFunc,
    pVoidDecryptFuncCtorArg: MutPtr,
) {
    public var pVoidResolveFunc: MutPtr = pVoidResolveFuncCtorArg
        internal set

    public var pVoidDecryptFunc: MutPtr = pVoidDecryptFuncCtorArg
        internal set

    public constructor() : this(
        privateKey = CryptIntegerBlob(),
        pResolvehCryptProvFunc = null,
        pVoidResolveFuncCtorArg = MutPtr(0L),
        pDecryptPrivateKeyFunc = null,
        pVoidDecryptFuncCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CryptIntegerBlob = this.privateKey

    public operator fun component2(): PcryptResolveHcryptprovFunc = this.pResolvehCryptProvFunc

    public operator fun component3(): MutPtr = this.pVoidResolveFunc

    public operator fun component4(): PcryptDecryptPrivateKeyFunc = this.pDecryptPrivateKeyFunc

    public operator fun component5(): MutPtr = this.pVoidDecryptFunc

    public fun copy(privateKey: CryptIntegerBlob = this.privateKey, pResolvehCryptProvFunc: PcryptResolveHcryptprovFunc = this.pResolvehCryptProvFunc, pVoidResolveFunc: MutPtr = this.pVoidResolveFunc, pDecryptPrivateKeyFunc: PcryptDecryptPrivateKeyFunc = this.pDecryptPrivateKeyFunc, pVoidDecryptFunc: MutPtr = this.pVoidDecryptFunc): CryptPkcs8ImportParams = CryptPkcs8ImportParams(privateKey = privateKey, pResolvehCryptProvFunc = pResolvehCryptProvFunc, pVoidResolveFuncCtorArg = pVoidResolveFunc, pDecryptPrivateKeyFunc = pDecryptPrivateKeyFunc, pVoidDecryptFuncCtorArg = pVoidDecryptFunc)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptPkcs8ImportParams) return false
        if (this.privateKey != other.privateKey) return false
        if (this.pResolvehCryptProvFunc != other.pResolvehCryptProvFunc) return false
        if (this.pVoidResolveFunc != other.pVoidResolveFunc) return false
        if (this.pDecryptPrivateKeyFunc != other.pDecryptPrivateKeyFunc) return false
        if (this.pVoidDecryptFunc != other.pVoidDecryptFunc) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.privateKey.hashCode()
        result = 31 * result + this.pResolvehCryptProvFunc.hashCode()
        result = 31 * result + this.pVoidResolveFunc.hashCode()
        result = 31 * result + this.pDecryptPrivateKeyFunc.hashCode()
        result = 31 * result + this.pVoidDecryptFunc.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            privateKey: CryptIntegerBlob = CryptIntegerBlob(),
            pResolvehCryptProvFunc: PcryptResolveHcryptprovFunc = null,
            pVoidResolveFunc: MutPtr = MutPtr(0L),
            pDecryptPrivateKeyFunc: PcryptDecryptPrivateKeyFunc = null,
            pVoidDecryptFunc: MutPtr = MutPtr(0L),
        ): CryptPkcs8ImportParams =
            CryptPkcs8ImportParams(
                privateKey = privateKey,
                pResolvehCryptProvFunc = pResolvehCryptProvFunc,
                pVoidResolveFuncCtorArg = pVoidResolveFunc,
                pDecryptPrivateKeyFunc = pDecryptPrivateKeyFunc,
                pVoidDecryptFuncCtorArg = pVoidDecryptFunc,
            )
    }
}

public class CryptPrivateKeyInfo internal constructor(
    public var version: UInt,
    public var algorithm: CryptAlgorithmIdentifier,
    public var privateKey: CryptIntegerBlob,
    pAttributesCtorArg: MutPtr,
) {
    public var pAttributes: MutPtr = pAttributesCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        algorithm = CryptAlgorithmIdentifier(),
        privateKey = CryptIntegerBlob(),
        pAttributesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): CryptAlgorithmIdentifier = this.algorithm

    public operator fun component3(): CryptIntegerBlob = this.privateKey

    public operator fun component4(): MutPtr = this.pAttributes

    public fun copy(version: UInt = this.version, algorithm: CryptAlgorithmIdentifier = this.algorithm, privateKey: CryptIntegerBlob = this.privateKey, pAttributes: MutPtr = this.pAttributes): CryptPrivateKeyInfo = CryptPrivateKeyInfo(version = version, algorithm = algorithm, privateKey = privateKey, pAttributesCtorArg = pAttributes)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptPrivateKeyInfo) return false
        if (this.version != other.version) return false
        if (this.algorithm != other.algorithm) return false
        if (this.privateKey != other.privateKey) return false
        if (this.pAttributes != other.pAttributes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.algorithm.hashCode()
        result = 31 * result + this.privateKey.hashCode()
        result = 31 * result + this.pAttributes.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version: UInt = 0u,
            algorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
            privateKey: CryptIntegerBlob = CryptIntegerBlob(),
            pAttributes: MutPtr = MutPtr(0L),
        ): CryptPrivateKeyInfo =
            CryptPrivateKeyInfo(
                version = version,
                algorithm = algorithm,
                privateKey = privateKey,
                pAttributesCtorArg = pAttributes,
            )
    }
}

public class CryptPropertyRef internal constructor(
    pszPropertyCtorArg: Pwstr,
    public var cbValue: UInt,
    pbValueCtorArg: MutPtr,
) {
    public var pszProperty: Pwstr = pszPropertyCtorArg
        internal set

    public var pbValue: MutPtr = pbValueCtorArg
        internal set

    public constructor() : this(
        pszPropertyCtorArg = MutPtr(0L),
        cbValue = 0u,
        pbValueCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.pszProperty

    public operator fun component2(): UInt = this.cbValue

    public operator fun component3(): MutPtr = this.pbValue

    public fun copy(pszProperty: Pwstr = this.pszProperty, cbValue: UInt = this.cbValue, pbValue: MutPtr = this.pbValue): CryptPropertyRef = CryptPropertyRef(pszPropertyCtorArg = pszProperty, cbValue = cbValue, pbValueCtorArg = pbValue)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptPropertyRef) return false
        if (this.pszProperty != other.pszProperty) return false
        if (this.cbValue != other.cbValue) return false
        if (this.pbValue != other.pbValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszProperty.hashCode()
        result = 31 * result + this.cbValue.hashCode()
        result = 31 * result + this.pbValue.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszProperty: Pwstr = MutPtr(0L),
            cbValue: UInt = 0u,
            pbValue: MutPtr = MutPtr(0L),
        ): CryptPropertyRef =
            CryptPropertyRef(
                pszPropertyCtorArg = pszProperty,
                cbValue = cbValue,
                pbValueCtorArg = pbValue,
            )
    }
}

public class CryptProviders internal constructor(
    public var cProviders: UInt,
    rgpszProvidersCtorArg: MutPtr,
) {
    public var rgpszProviders: MutPtr = rgpszProvidersCtorArg
        internal set

    public constructor() : this(
        cProviders = 0u,
        rgpszProvidersCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cProviders

    public operator fun component2(): MutPtr = this.rgpszProviders

    public fun copy(cProviders: UInt = this.cProviders, rgpszProviders: MutPtr = this.rgpszProviders): CryptProviders = CryptProviders(cProviders = cProviders, rgpszProvidersCtorArg = rgpszProviders)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptProviders) return false
        if (this.cProviders != other.cProviders) return false
        if (this.rgpszProviders != other.rgpszProviders) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cProviders.hashCode()
        result = 31 * result + this.rgpszProviders.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptProviders> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptProviders> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CryptProviders =
                    CryptProviders(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CryptProviders) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cProviders)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.rgpszProviders)
                }
            }

        public operator fun invoke(
            cProviders: UInt = 0u,
            rgpszProviders: MutPtr = MutPtr(0L),
        ): CryptProviders =
            CryptProviders(
                cProviders = cProviders,
                rgpszProvidersCtorArg = rgpszProviders,
            )
    }
}

public class CryptProviderRef internal constructor(
    public var dwInterface: UInt,
    pszFunctionCtorArg: Pwstr,
    pszProviderCtorArg: Pwstr,
    public var cProperties: UInt,
    rgpPropertiesCtorArg: MutPtr,
    pUMCtorArg: MutPtr,
    pKMCtorArg: MutPtr,
) {
    public var pszFunction: Pwstr = pszFunctionCtorArg
        internal set

    public var pszProvider: Pwstr = pszProviderCtorArg
        internal set

    public var rgpProperties: MutPtr = rgpPropertiesCtorArg
        internal set

    public var pUM: MutPtr = pUMCtorArg
        internal set

    public var pKM: MutPtr = pKMCtorArg
        internal set

    public constructor() : this(
        dwInterface = 0u,
        pszFunctionCtorArg = MutPtr(0L),
        pszProviderCtorArg = MutPtr(0L),
        cProperties = 0u,
        rgpPropertiesCtorArg = MutPtr(0L),
        pUMCtorArg = MutPtr(0L),
        pKMCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwInterface

    public operator fun component2(): Pwstr = this.pszFunction

    public operator fun component3(): Pwstr = this.pszProvider

    public operator fun component4(): UInt = this.cProperties

    public operator fun component5(): MutPtr = this.rgpProperties

    public operator fun component6(): MutPtr = this.pUM

    public operator fun component7(): MutPtr = this.pKM

    public fun copy(dwInterface: UInt = this.dwInterface, pszFunction: Pwstr = this.pszFunction, pszProvider: Pwstr = this.pszProvider, cProperties: UInt = this.cProperties, rgpProperties: MutPtr = this.rgpProperties, pUM: MutPtr = this.pUM, pKM: MutPtr = this.pKM): CryptProviderRef = CryptProviderRef(dwInterface = dwInterface, pszFunctionCtorArg = pszFunction, pszProviderCtorArg = pszProvider, cProperties = cProperties, rgpPropertiesCtorArg = rgpProperties, pUMCtorArg = pUM, pKMCtorArg = pKM)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptProviderRef) return false
        if (this.dwInterface != other.dwInterface) return false
        if (this.pszFunction != other.pszFunction) return false
        if (this.pszProvider != other.pszProvider) return false
        if (this.cProperties != other.cProperties) return false
        if (this.rgpProperties != other.rgpProperties) return false
        if (this.pUM != other.pUM) return false
        if (this.pKM != other.pKM) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwInterface.hashCode()
        result = 31 * result + this.pszFunction.hashCode()
        result = 31 * result + this.pszProvider.hashCode()
        result = 31 * result + this.cProperties.hashCode()
        result = 31 * result + this.rgpProperties.hashCode()
        result = 31 * result + this.pUM.hashCode()
        result = 31 * result + this.pKM.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwInterface: UInt = 0u,
            pszFunction: Pwstr = MutPtr(0L),
            pszProvider: Pwstr = MutPtr(0L),
            cProperties: UInt = 0u,
            rgpProperties: MutPtr = MutPtr(0L),
            pUM: MutPtr = MutPtr(0L),
            pKM: MutPtr = MutPtr(0L),
        ): CryptProviderRef =
            CryptProviderRef(
                dwInterface = dwInterface,
                pszFunctionCtorArg = pszFunction,
                pszProviderCtorArg = pszProvider,
                cProperties = cProperties,
                rgpPropertiesCtorArg = rgpProperties,
                pUMCtorArg = pUM,
                pKMCtorArg = pKM,
            )
    }
}

public class CryptProviderRefs internal constructor(
    public var cProviders: UInt,
    rgpProvidersCtorArg: MutPtr,
) {
    public var rgpProviders: MutPtr = rgpProvidersCtorArg
        internal set

    public constructor() : this(
        cProviders = 0u,
        rgpProvidersCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cProviders

    public operator fun component2(): MutPtr = this.rgpProviders

    public fun copy(cProviders: UInt = this.cProviders, rgpProviders: MutPtr = this.rgpProviders): CryptProviderRefs = CryptProviderRefs(cProviders = cProviders, rgpProvidersCtorArg = rgpProviders)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptProviderRefs) return false
        if (this.cProviders != other.cProviders) return false
        if (this.rgpProviders != other.rgpProviders) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cProviders.hashCode()
        result = 31 * result + this.rgpProviders.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptProviderRefs> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptProviderRefs> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CryptProviderRefs =
                    CryptProviderRefs(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CryptProviderRefs) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cProviders)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.rgpProviders)
                }
            }

        public operator fun invoke(
            cProviders: UInt = 0u,
            rgpProviders: MutPtr = MutPtr(0L),
        ): CryptProviderRefs =
            CryptProviderRefs(
                cProviders = cProviders,
                rgpProvidersCtorArg = rgpProviders,
            )
    }
}

public class CryptProviderReg internal constructor(
    public var cAliases: UInt,
    rgpszAliasesCtorArg: MutPtr,
    pUMCtorArg: MutPtr,
    pKMCtorArg: MutPtr,
) {
    public var rgpszAliases: MutPtr = rgpszAliasesCtorArg
        internal set

    public var pUM: MutPtr = pUMCtorArg
        internal set

    public var pKM: MutPtr = pKMCtorArg
        internal set

    public constructor() : this(
        cAliases = 0u,
        rgpszAliasesCtorArg = MutPtr(0L),
        pUMCtorArg = MutPtr(0L),
        pKMCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cAliases

    public operator fun component2(): MutPtr = this.rgpszAliases

    public operator fun component3(): MutPtr = this.pUM

    public operator fun component4(): MutPtr = this.pKM

    public fun copy(cAliases: UInt = this.cAliases, rgpszAliases: MutPtr = this.rgpszAliases, pUM: MutPtr = this.pUM, pKM: MutPtr = this.pKM): CryptProviderReg = CryptProviderReg(cAliases = cAliases, rgpszAliasesCtorArg = rgpszAliases, pUMCtorArg = pUM, pKMCtorArg = pKM)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptProviderReg) return false
        if (this.cAliases != other.cAliases) return false
        if (this.rgpszAliases != other.rgpszAliases) return false
        if (this.pUM != other.pUM) return false
        if (this.pKM != other.pKM) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cAliases.hashCode()
        result = 31 * result + this.rgpszAliases.hashCode()
        result = 31 * result + this.pUM.hashCode()
        result = 31 * result + this.pKM.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptProviderReg> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptProviderReg> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): CryptProviderReg =
                    CryptProviderReg(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: CryptProviderReg) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cAliases)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.rgpszAliases)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.pUM)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.pKM)
                }
            }

        public operator fun invoke(
            cAliases: UInt = 0u,
            rgpszAliases: MutPtr = MutPtr(0L),
            pUM: MutPtr = MutPtr(0L),
            pKM: MutPtr = MutPtr(0L),
        ): CryptProviderReg =
            CryptProviderReg(
                cAliases = cAliases,
                rgpszAliasesCtorArg = rgpszAliases,
                pUMCtorArg = pUM,
                pKMCtorArg = pKM,
            )
    }
}

public class CryptPsourceAlgorithm internal constructor(
    pszObjIdCtorArg: Pstr,
    public var encodingParameters: CryptIntegerBlob,
) {
    public var pszObjId: Pstr = pszObjIdCtorArg
        internal set

    public constructor() : this(
        pszObjIdCtorArg = MutPtr(0L),
        encodingParameters = CryptIntegerBlob(),
    )

    public operator fun component1(): Pstr = this.pszObjId

    public operator fun component2(): CryptIntegerBlob = this.encodingParameters

    public fun copy(pszObjId: Pstr = this.pszObjId, encodingParameters: CryptIntegerBlob = this.encodingParameters): CryptPsourceAlgorithm = CryptPsourceAlgorithm(pszObjIdCtorArg = pszObjId, encodingParameters = encodingParameters)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptPsourceAlgorithm) return false
        if (this.pszObjId != other.pszObjId) return false
        if (this.encodingParameters != other.encodingParameters) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszObjId.hashCode()
        result = 31 * result + this.encodingParameters.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszObjId: Pstr = MutPtr(0L),
            encodingParameters: CryptIntegerBlob = CryptIntegerBlob(),
        ): CryptPsourceAlgorithm =
            CryptPsourceAlgorithm(
                pszObjIdCtorArg = pszObjId,
                encodingParameters = encodingParameters,
            )
    }
}

public data class CryptRc2CbcParameters(
    public var dwVersion: UInt = 0u,
    public var fIV: Bool = 0,
    public var rgbIV: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptRc2CbcParameters) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.fIV != other.fIV) return false
        if (!this.rgbIV.contentEquals(other.rgbIV)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.fIV.hashCode()
        result = 31 * result + this.rgbIV.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptRc2CbcParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptRc2CbcParameters> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CryptRc2CbcParameters =
                    CryptRc2CbcParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: CryptRc2CbcParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.fIV)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 8L, value.rgbIV.toList())
                }
            }
    }
}

public data class CryptRc4KeyState(
    public var key: UByteArray = UByteArray(16),
    public var sBox: UByteArray = UByteArray(256),
    public var i: UByte = 0u,
    public var j: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptRc4KeyState) return false
        if (!this.key.contentEquals(other.key)) return false
        if (!this.sBox.contentEquals(other.sBox)) return false
        if (this.i != other.i) return false
        if (this.j != other.j) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.key.contentHashCode()
        result = 31 * result + this.sBox.contentHashCode()
        result = 31 * result + this.i.hashCode()
        result = 31 * result + this.j.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptRc4KeyState> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptRc4KeyState> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 274L
                override fun readNative(addr: Long): CryptRc4KeyState =
                    CryptRc4KeyState(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                        ).readNative(addr + 16L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 272L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 273L),
                    )
                override fun writeNative(addr: Long, value: CryptRc4KeyState) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.key.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                    ).writeNative(addr + 16L, value.sBox.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 272L, value.i)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 273L, value.j)
                }
            }
    }
}

public class CryptRetrieveAuxInfo internal constructor(
    public var cbSize: UInt,
    pLastSyncTimeCtorArg: MutPtr,
    public var dwMaxUrlRetrievalByteCount: UInt,
    pPreFetchInfoCtorArg: MutPtr,
    pFlushInfoCtorArg: MutPtr,
    ppResponseInfoCtorArg: MutPtr,
    pwszCacheFileNamePrefixCtorArg: Pwstr,
    pftCacheResyncCtorArg: MutPtr,
    public var fProxyCacheRetrieval: Bool,
    public var dwHttpStatusCode: UInt,
    ppwszErrorResponseHeadersCtorArg: MutPtr,
    ppErrorContentBlobCtorArg: MutPtr,
) {
    public var pLastSyncTime: MutPtr = pLastSyncTimeCtorArg
        internal set

    public var pPreFetchInfo: MutPtr = pPreFetchInfoCtorArg
        internal set

    public var pFlushInfo: MutPtr = pFlushInfoCtorArg
        internal set

    public var ppResponseInfo: MutPtr = ppResponseInfoCtorArg
        internal set

    public var pwszCacheFileNamePrefix: Pwstr = pwszCacheFileNamePrefixCtorArg
        internal set

    public var pftCacheResync: MutPtr = pftCacheResyncCtorArg
        internal set

    public var ppwszErrorResponseHeaders: MutPtr = ppwszErrorResponseHeadersCtorArg
        internal set

    public var ppErrorContentBlob: MutPtr = ppErrorContentBlobCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        pLastSyncTimeCtorArg = MutPtr(0L),
        dwMaxUrlRetrievalByteCount = 0u,
        pPreFetchInfoCtorArg = MutPtr(0L),
        pFlushInfoCtorArg = MutPtr(0L),
        ppResponseInfoCtorArg = MutPtr(0L),
        pwszCacheFileNamePrefixCtorArg = MutPtr(0L),
        pftCacheResyncCtorArg = MutPtr(0L),
        fProxyCacheRetrieval = 0,
        dwHttpStatusCode = 0u,
        ppwszErrorResponseHeadersCtorArg = MutPtr(0L),
        ppErrorContentBlobCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): MutPtr = this.pLastSyncTime

    public operator fun component3(): UInt = this.dwMaxUrlRetrievalByteCount

    public operator fun component4(): MutPtr = this.pPreFetchInfo

    public operator fun component5(): MutPtr = this.pFlushInfo

    public operator fun component6(): MutPtr = this.ppResponseInfo

    public operator fun component7(): Pwstr = this.pwszCacheFileNamePrefix

    public operator fun component8(): MutPtr = this.pftCacheResync

    public operator fun component9(): Bool = this.fProxyCacheRetrieval

    public operator fun component10(): UInt = this.dwHttpStatusCode

    public operator fun component11(): MutPtr = this.ppwszErrorResponseHeaders

    public operator fun component12(): MutPtr = this.ppErrorContentBlob

    public fun copy(cbSize: UInt = this.cbSize, pLastSyncTime: MutPtr = this.pLastSyncTime, dwMaxUrlRetrievalByteCount: UInt = this.dwMaxUrlRetrievalByteCount, pPreFetchInfo: MutPtr = this.pPreFetchInfo, pFlushInfo: MutPtr = this.pFlushInfo, ppResponseInfo: MutPtr = this.ppResponseInfo, pwszCacheFileNamePrefix: Pwstr = this.pwszCacheFileNamePrefix, pftCacheResync: MutPtr = this.pftCacheResync, fProxyCacheRetrieval: Bool = this.fProxyCacheRetrieval, dwHttpStatusCode: UInt = this.dwHttpStatusCode, ppwszErrorResponseHeaders: MutPtr = this.ppwszErrorResponseHeaders, ppErrorContentBlob: MutPtr = this.ppErrorContentBlob): CryptRetrieveAuxInfo = CryptRetrieveAuxInfo(cbSize = cbSize, pLastSyncTimeCtorArg = pLastSyncTime, dwMaxUrlRetrievalByteCount = dwMaxUrlRetrievalByteCount, pPreFetchInfoCtorArg = pPreFetchInfo, pFlushInfoCtorArg = pFlushInfo, ppResponseInfoCtorArg = ppResponseInfo, pwszCacheFileNamePrefixCtorArg = pwszCacheFileNamePrefix, pftCacheResyncCtorArg = pftCacheResync, fProxyCacheRetrieval = fProxyCacheRetrieval, dwHttpStatusCode = dwHttpStatusCode, ppwszErrorResponseHeadersCtorArg = ppwszErrorResponseHeaders, ppErrorContentBlobCtorArg = ppErrorContentBlob)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptRetrieveAuxInfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.pLastSyncTime != other.pLastSyncTime) return false
        if (this.dwMaxUrlRetrievalByteCount != other.dwMaxUrlRetrievalByteCount) return false
        if (this.pPreFetchInfo != other.pPreFetchInfo) return false
        if (this.pFlushInfo != other.pFlushInfo) return false
        if (this.ppResponseInfo != other.ppResponseInfo) return false
        if (this.pwszCacheFileNamePrefix != other.pwszCacheFileNamePrefix) return false
        if (this.pftCacheResync != other.pftCacheResync) return false
        if (this.fProxyCacheRetrieval != other.fProxyCacheRetrieval) return false
        if (this.dwHttpStatusCode != other.dwHttpStatusCode) return false
        if (this.ppwszErrorResponseHeaders != other.ppwszErrorResponseHeaders) return false
        if (this.ppErrorContentBlob != other.ppErrorContentBlob) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.pLastSyncTime.hashCode()
        result = 31 * result + this.dwMaxUrlRetrievalByteCount.hashCode()
        result = 31 * result + this.pPreFetchInfo.hashCode()
        result = 31 * result + this.pFlushInfo.hashCode()
        result = 31 * result + this.ppResponseInfo.hashCode()
        result = 31 * result + this.pwszCacheFileNamePrefix.hashCode()
        result = 31 * result + this.pftCacheResync.hashCode()
        result = 31 * result + this.fProxyCacheRetrieval.hashCode()
        result = 31 * result + this.dwHttpStatusCode.hashCode()
        result = 31 * result + this.ppwszErrorResponseHeaders.hashCode()
        result = 31 * result + this.ppErrorContentBlob.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            pLastSyncTime: MutPtr = MutPtr(0L),
            dwMaxUrlRetrievalByteCount: UInt = 0u,
            pPreFetchInfo: MutPtr = MutPtr(0L),
            pFlushInfo: MutPtr = MutPtr(0L),
            ppResponseInfo: MutPtr = MutPtr(0L),
            pwszCacheFileNamePrefix: Pwstr = MutPtr(0L),
            pftCacheResync: MutPtr = MutPtr(0L),
            fProxyCacheRetrieval: Bool = 0,
            dwHttpStatusCode: UInt = 0u,
            ppwszErrorResponseHeaders: MutPtr = MutPtr(0L),
            ppErrorContentBlob: MutPtr = MutPtr(0L),
        ): CryptRetrieveAuxInfo =
            CryptRetrieveAuxInfo(
                cbSize = cbSize,
                pLastSyncTimeCtorArg = pLastSyncTime,
                dwMaxUrlRetrievalByteCount = dwMaxUrlRetrievalByteCount,
                pPreFetchInfoCtorArg = pPreFetchInfo,
                pFlushInfoCtorArg = pFlushInfo,
                ppResponseInfoCtorArg = ppResponseInfo,
                pwszCacheFileNamePrefixCtorArg = pwszCacheFileNamePrefix,
                pftCacheResyncCtorArg = pftCacheResync,
                fProxyCacheRetrieval = fProxyCacheRetrieval,
                dwHttpStatusCode = dwHttpStatusCode,
                ppwszErrorResponseHeadersCtorArg = ppwszErrorResponseHeaders,
                ppErrorContentBlobCtorArg = ppErrorContentBlob,
            )
    }
}

public data class CryptRsaesOaepParameters(
    public var hashAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var maskGenAlgorithm: CryptMaskGenAlgorithm = CryptMaskGenAlgorithm(),
    public var pSourceAlgorithm: CryptPsourceAlgorithm = CryptPsourceAlgorithm(),
)

public data class CryptRsaSsaPssParameters(
    public var hashAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var maskGenAlgorithm: CryptMaskGenAlgorithm = CryptMaskGenAlgorithm(),
    public var dwSaltLength: UInt = 0u,
    public var dwTrailerField: UInt = 0u,
)

public class CryptSequenceOfAny internal constructor(
    public var cValue: UInt,
    rgValueCtorArg: MutPtr,
) {
    public var rgValue: MutPtr = rgValueCtorArg
        internal set

    public constructor() : this(
        cValue = 0u,
        rgValueCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cValue

    public operator fun component2(): MutPtr = this.rgValue

    public fun copy(cValue: UInt = this.cValue, rgValue: MutPtr = this.rgValue): CryptSequenceOfAny = CryptSequenceOfAny(cValue = cValue, rgValueCtorArg = rgValue)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptSequenceOfAny) return false
        if (this.cValue != other.cValue) return false
        if (this.rgValue != other.rgValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cValue.hashCode()
        result = 31 * result + this.rgValue.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptSequenceOfAny> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptSequenceOfAny> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CryptSequenceOfAny =
                    CryptSequenceOfAny(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CryptSequenceOfAny) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cValue)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.rgValue)
                }
            }

        public operator fun invoke(
            cValue: UInt = 0u,
            rgValue: MutPtr = MutPtr(0L),
        ): CryptSequenceOfAny =
            CryptSequenceOfAny(
                cValue = cValue,
                rgValueCtorArg = rgValue,
            )
    }
}

public class CryptSignMessagePara internal constructor(
    public var cbSize: UInt,
    public var dwMsgEncodingType: UInt,
    pSigningCertCtorArg: ConstPtr,
    public var hashAlgorithm: CryptAlgorithmIdentifier,
    pvHashAuxInfoCtorArg: MutPtr,
    public var cMsgCert: UInt,
    rgpMsgCertCtorArg: MutPtr,
    public var cMsgCrl: UInt,
    rgpMsgCrlCtorArg: MutPtr,
    public var cAuthAttr: UInt,
    rgAuthAttrCtorArg: MutPtr,
    public var cUnauthAttr: UInt,
    rgUnauthAttrCtorArg: MutPtr,
    public var dwFlags: UInt,
    public var dwInnerContentType: UInt,
) {
    public var pSigningCert: ConstPtr = pSigningCertCtorArg
        internal set

    public var pvHashAuxInfo: MutPtr = pvHashAuxInfoCtorArg
        internal set

    public var rgpMsgCert: MutPtr = rgpMsgCertCtorArg
        internal set

    public var rgpMsgCrl: MutPtr = rgpMsgCrlCtorArg
        internal set

    public var rgAuthAttr: MutPtr = rgAuthAttrCtorArg
        internal set

    public var rgUnauthAttr: MutPtr = rgUnauthAttrCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        dwMsgEncodingType = 0u,
        pSigningCertCtorArg = ConstPtr(0L),
        hashAlgorithm = CryptAlgorithmIdentifier(),
        pvHashAuxInfoCtorArg = MutPtr(0L),
        cMsgCert = 0u,
        rgpMsgCertCtorArg = MutPtr(0L),
        cMsgCrl = 0u,
        rgpMsgCrlCtorArg = MutPtr(0L),
        cAuthAttr = 0u,
        rgAuthAttrCtorArg = MutPtr(0L),
        cUnauthAttr = 0u,
        rgUnauthAttrCtorArg = MutPtr(0L),
        dwFlags = 0u,
        dwInnerContentType = 0u,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): UInt = this.dwMsgEncodingType

    public operator fun component3(): ConstPtr = this.pSigningCert

    public operator fun component4(): CryptAlgorithmIdentifier = this.hashAlgorithm

    public operator fun component5(): MutPtr = this.pvHashAuxInfo

    public operator fun component6(): UInt = this.cMsgCert

    public operator fun component7(): MutPtr = this.rgpMsgCert

    public operator fun component8(): UInt = this.cMsgCrl

    public operator fun component9(): MutPtr = this.rgpMsgCrl

    public operator fun component10(): UInt = this.cAuthAttr

    public operator fun component11(): MutPtr = this.rgAuthAttr

    public operator fun component12(): UInt = this.cUnauthAttr

    public operator fun component13(): MutPtr = this.rgUnauthAttr

    public operator fun component14(): UInt = this.dwFlags

    public operator fun component15(): UInt = this.dwInnerContentType

    public fun copy(cbSize: UInt = this.cbSize, dwMsgEncodingType: UInt = this.dwMsgEncodingType, pSigningCert: ConstPtr = this.pSigningCert, hashAlgorithm: CryptAlgorithmIdentifier = this.hashAlgorithm, pvHashAuxInfo: MutPtr = this.pvHashAuxInfo, cMsgCert: UInt = this.cMsgCert, rgpMsgCert: MutPtr = this.rgpMsgCert, cMsgCrl: UInt = this.cMsgCrl, rgpMsgCrl: MutPtr = this.rgpMsgCrl, cAuthAttr: UInt = this.cAuthAttr, rgAuthAttr: MutPtr = this.rgAuthAttr, cUnauthAttr: UInt = this.cUnauthAttr, rgUnauthAttr: MutPtr = this.rgUnauthAttr, dwFlags: UInt = this.dwFlags, dwInnerContentType: UInt = this.dwInnerContentType): CryptSignMessagePara = CryptSignMessagePara(cbSize = cbSize, dwMsgEncodingType = dwMsgEncodingType, pSigningCertCtorArg = pSigningCert, hashAlgorithm = hashAlgorithm, pvHashAuxInfoCtorArg = pvHashAuxInfo, cMsgCert = cMsgCert, rgpMsgCertCtorArg = rgpMsgCert, cMsgCrl = cMsgCrl, rgpMsgCrlCtorArg = rgpMsgCrl, cAuthAttr = cAuthAttr, rgAuthAttrCtorArg = rgAuthAttr, cUnauthAttr = cUnauthAttr, rgUnauthAttrCtorArg = rgUnauthAttr, dwFlags = dwFlags, dwInnerContentType = dwInnerContentType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptSignMessagePara) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwMsgEncodingType != other.dwMsgEncodingType) return false
        if (this.pSigningCert != other.pSigningCert) return false
        if (this.hashAlgorithm != other.hashAlgorithm) return false
        if (this.pvHashAuxInfo != other.pvHashAuxInfo) return false
        if (this.cMsgCert != other.cMsgCert) return false
        if (this.rgpMsgCert != other.rgpMsgCert) return false
        if (this.cMsgCrl != other.cMsgCrl) return false
        if (this.rgpMsgCrl != other.rgpMsgCrl) return false
        if (this.cAuthAttr != other.cAuthAttr) return false
        if (this.rgAuthAttr != other.rgAuthAttr) return false
        if (this.cUnauthAttr != other.cUnauthAttr) return false
        if (this.rgUnauthAttr != other.rgUnauthAttr) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwInnerContentType != other.dwInnerContentType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwMsgEncodingType.hashCode()
        result = 31 * result + this.pSigningCert.hashCode()
        result = 31 * result + this.hashAlgorithm.hashCode()
        result = 31 * result + this.pvHashAuxInfo.hashCode()
        result = 31 * result + this.cMsgCert.hashCode()
        result = 31 * result + this.rgpMsgCert.hashCode()
        result = 31 * result + this.cMsgCrl.hashCode()
        result = 31 * result + this.rgpMsgCrl.hashCode()
        result = 31 * result + this.cAuthAttr.hashCode()
        result = 31 * result + this.rgAuthAttr.hashCode()
        result = 31 * result + this.cUnauthAttr.hashCode()
        result = 31 * result + this.rgUnauthAttr.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwInnerContentType.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            dwMsgEncodingType: UInt = 0u,
            pSigningCert: ConstPtr = ConstPtr(0L),
            hashAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
            pvHashAuxInfo: MutPtr = MutPtr(0L),
            cMsgCert: UInt = 0u,
            rgpMsgCert: MutPtr = MutPtr(0L),
            cMsgCrl: UInt = 0u,
            rgpMsgCrl: MutPtr = MutPtr(0L),
            cAuthAttr: UInt = 0u,
            rgAuthAttr: MutPtr = MutPtr(0L),
            cUnauthAttr: UInt = 0u,
            rgUnauthAttr: MutPtr = MutPtr(0L),
            dwFlags: UInt = 0u,
            dwInnerContentType: UInt = 0u,
        ): CryptSignMessagePara =
            CryptSignMessagePara(
                cbSize = cbSize,
                dwMsgEncodingType = dwMsgEncodingType,
                pSigningCertCtorArg = pSigningCert,
                hashAlgorithm = hashAlgorithm,
                pvHashAuxInfoCtorArg = pvHashAuxInfo,
                cMsgCert = cMsgCert,
                rgpMsgCertCtorArg = rgpMsgCert,
                cMsgCrl = cMsgCrl,
                rgpMsgCrlCtorArg = rgpMsgCrl,
                cAuthAttr = cAuthAttr,
                rgAuthAttrCtorArg = rgAuthAttr,
                cUnauthAttr = cUnauthAttr,
                rgUnauthAttrCtorArg = rgUnauthAttr,
                dwFlags = dwFlags,
                dwInnerContentType = dwInnerContentType,
            )
    }
}

public data class CryptSmartCardRootInfo(
    public var rgbCardID: UByteArray = UByteArray(16),
    public var luid: RootInfoLuid = RootInfoLuid(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptSmartCardRootInfo) return false
        if (!this.rgbCardID.contentEquals(other.rgbCardID)) return false
        if (this.luid != other.luid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.rgbCardID.contentHashCode()
        result = 31 * result + this.luid.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptSmartCardRootInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptSmartCardRootInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): CryptSmartCardRootInfo =
                    CryptSmartCardRootInfo(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr).toUByteArray(),
                        (RootInfoLuid.typeLayout()).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: CryptSmartCardRootInfo) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.rgbCardID.toList())
                    (RootInfoLuid.typeLayout()).writeNative(addr + 16L, value.luid)
                }
            }
    }
}

public class CryptSmimeCapabilities internal constructor(
    public var cCapability: UInt,
    rgCapabilityCtorArg: MutPtr,
) {
    public var rgCapability: MutPtr = rgCapabilityCtorArg
        internal set

    public constructor() : this(
        cCapability = 0u,
        rgCapabilityCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cCapability

    public operator fun component2(): MutPtr = this.rgCapability

    public fun copy(cCapability: UInt = this.cCapability, rgCapability: MutPtr = this.rgCapability): CryptSmimeCapabilities = CryptSmimeCapabilities(cCapability = cCapability, rgCapabilityCtorArg = rgCapability)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptSmimeCapabilities) return false
        if (this.cCapability != other.cCapability) return false
        if (this.rgCapability != other.rgCapability) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cCapability.hashCode()
        result = 31 * result + this.rgCapability.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptSmimeCapabilities> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptSmimeCapabilities> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CryptSmimeCapabilities =
                    CryptSmimeCapabilities(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CryptSmimeCapabilities) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cCapability)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.rgCapability)
                }
            }

        public operator fun invoke(
            cCapability: UInt = 0u,
            rgCapability: MutPtr = MutPtr(0L),
        ): CryptSmimeCapabilities =
            CryptSmimeCapabilities(
                cCapability = cCapability,
                rgCapabilityCtorArg = rgCapability,
            )
    }
}

public class CryptSmimeCapability internal constructor(
    pszObjIdCtorArg: Pstr,
    public var parameters: CryptIntegerBlob,
) {
    public var pszObjId: Pstr = pszObjIdCtorArg
        internal set

    public constructor() : this(
        pszObjIdCtorArg = MutPtr(0L),
        parameters = CryptIntegerBlob(),
    )

    public operator fun component1(): Pstr = this.pszObjId

    public operator fun component2(): CryptIntegerBlob = this.parameters

    public fun copy(pszObjId: Pstr = this.pszObjId, parameters: CryptIntegerBlob = this.parameters): CryptSmimeCapability = CryptSmimeCapability(pszObjIdCtorArg = pszObjId, parameters = parameters)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptSmimeCapability) return false
        if (this.pszObjId != other.pszObjId) return false
        if (this.parameters != other.parameters) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszObjId.hashCode()
        result = 31 * result + this.parameters.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszObjId: Pstr = MutPtr(0L),
            parameters: CryptIntegerBlob = CryptIntegerBlob(),
        ): CryptSmimeCapability =
            CryptSmimeCapability(
                pszObjIdCtorArg = pszObjId,
                parameters = parameters,
            )
    }
}

public data class CryptTimestampAccuracy(
    public var dwSeconds: UInt = 0u,
    public var dwMillis: UInt = 0u,
    public var dwMicros: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptTimestampAccuracy> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptTimestampAccuracy> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): CryptTimestampAccuracy =
                    CryptTimestampAccuracy(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CryptTimestampAccuracy) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSeconds)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwMillis)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwMicros)
                }
            }
    }
}

public class CryptTimestampContext internal constructor(
    public var cbEncoded: UInt,
    pbEncodedCtorArg: MutPtr,
    pTimeStampCtorArg: MutPtr,
) {
    public var pbEncoded: MutPtr = pbEncodedCtorArg
        internal set

    public var pTimeStamp: MutPtr = pTimeStampCtorArg
        internal set

    public constructor() : this(
        cbEncoded = 0u,
        pbEncodedCtorArg = MutPtr(0L),
        pTimeStampCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbEncoded

    public operator fun component2(): MutPtr = this.pbEncoded

    public operator fun component3(): MutPtr = this.pTimeStamp

    public fun copy(cbEncoded: UInt = this.cbEncoded, pbEncoded: MutPtr = this.pbEncoded, pTimeStamp: MutPtr = this.pTimeStamp): CryptTimestampContext = CryptTimestampContext(cbEncoded = cbEncoded, pbEncodedCtorArg = pbEncoded, pTimeStampCtorArg = pTimeStamp)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptTimestampContext) return false
        if (this.cbEncoded != other.cbEncoded) return false
        if (this.pbEncoded != other.pbEncoded) return false
        if (this.pTimeStamp != other.pTimeStamp) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbEncoded.hashCode()
        result = 31 * result + this.pbEncoded.hashCode()
        result = 31 * result + this.pTimeStamp.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptTimestampContext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptTimestampContext> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): CryptTimestampContext =
                    CryptTimestampContext(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: CryptTimestampContext) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbEncoded)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pbEncoded)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.pTimeStamp)
                }
            }

        public operator fun invoke(
            cbEncoded: UInt = 0u,
            pbEncoded: MutPtr = MutPtr(0L),
            pTimeStamp: MutPtr = MutPtr(0L),
        ): CryptTimestampContext =
            CryptTimestampContext(
                cbEncoded = cbEncoded,
                pbEncodedCtorArg = pbEncoded,
                pTimeStampCtorArg = pTimeStamp,
            )
    }
}

public class CryptTimestampInfo internal constructor(
    public var dwVersion: UInt,
    pszTSAPolicyIdCtorArg: Pstr,
    public var hashAlgorithm: CryptAlgorithmIdentifier,
    public var hashedMessage: CryptIntegerBlob,
    public var serialNumber: CryptIntegerBlob,
    public var ftTime: Filetime,
    pvAccuracyCtorArg: MutPtr,
    public var fOrdering: Bool,
    public var nonce: CryptIntegerBlob,
    public var tsa: CryptIntegerBlob,
    public var cExtension: UInt,
    rgExtensionCtorArg: MutPtr,
) {
    public var pszTSAPolicyId: Pstr = pszTSAPolicyIdCtorArg
        internal set

    public var pvAccuracy: MutPtr = pvAccuracyCtorArg
        internal set

    public var rgExtension: MutPtr = rgExtensionCtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        pszTSAPolicyIdCtorArg = MutPtr(0L),
        hashAlgorithm = CryptAlgorithmIdentifier(),
        hashedMessage = CryptIntegerBlob(),
        serialNumber = CryptIntegerBlob(),
        ftTime = Filetime(),
        pvAccuracyCtorArg = MutPtr(0L),
        fOrdering = 0,
        nonce = CryptIntegerBlob(),
        tsa = CryptIntegerBlob(),
        cExtension = 0u,
        rgExtensionCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwVersion

    public operator fun component2(): Pstr = this.pszTSAPolicyId

    public operator fun component3(): CryptAlgorithmIdentifier = this.hashAlgorithm

    public operator fun component4(): CryptIntegerBlob = this.hashedMessage

    public operator fun component5(): CryptIntegerBlob = this.serialNumber

    public operator fun component6(): Filetime = this.ftTime

    public operator fun component7(): MutPtr = this.pvAccuracy

    public operator fun component8(): Bool = this.fOrdering

    public operator fun component9(): CryptIntegerBlob = this.nonce

    public operator fun component10(): CryptIntegerBlob = this.tsa

    public operator fun component11(): UInt = this.cExtension

    public operator fun component12(): MutPtr = this.rgExtension

    public fun copy(dwVersion: UInt = this.dwVersion, pszTSAPolicyId: Pstr = this.pszTSAPolicyId, hashAlgorithm: CryptAlgorithmIdentifier = this.hashAlgorithm, hashedMessage: CryptIntegerBlob = this.hashedMessage, serialNumber: CryptIntegerBlob = this.serialNumber, ftTime: Filetime = this.ftTime, pvAccuracy: MutPtr = this.pvAccuracy, fOrdering: Bool = this.fOrdering, nonce: CryptIntegerBlob = this.nonce, tsa: CryptIntegerBlob = this.tsa, cExtension: UInt = this.cExtension, rgExtension: MutPtr = this.rgExtension): CryptTimestampInfo = CryptTimestampInfo(dwVersion = dwVersion, pszTSAPolicyIdCtorArg = pszTSAPolicyId, hashAlgorithm = hashAlgorithm, hashedMessage = hashedMessage, serialNumber = serialNumber, ftTime = ftTime, pvAccuracyCtorArg = pvAccuracy, fOrdering = fOrdering, nonce = nonce, tsa = tsa, cExtension = cExtension, rgExtensionCtorArg = rgExtension)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptTimestampInfo) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.pszTSAPolicyId != other.pszTSAPolicyId) return false
        if (this.hashAlgorithm != other.hashAlgorithm) return false
        if (this.hashedMessage != other.hashedMessage) return false
        if (this.serialNumber != other.serialNumber) return false
        if (this.ftTime != other.ftTime) return false
        if (this.pvAccuracy != other.pvAccuracy) return false
        if (this.fOrdering != other.fOrdering) return false
        if (this.nonce != other.nonce) return false
        if (this.tsa != other.tsa) return false
        if (this.cExtension != other.cExtension) return false
        if (this.rgExtension != other.rgExtension) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.pszTSAPolicyId.hashCode()
        result = 31 * result + this.hashAlgorithm.hashCode()
        result = 31 * result + this.hashedMessage.hashCode()
        result = 31 * result + this.serialNumber.hashCode()
        result = 31 * result + this.ftTime.hashCode()
        result = 31 * result + this.pvAccuracy.hashCode()
        result = 31 * result + this.fOrdering.hashCode()
        result = 31 * result + this.nonce.hashCode()
        result = 31 * result + this.tsa.hashCode()
        result = 31 * result + this.cExtension.hashCode()
        result = 31 * result + this.rgExtension.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwVersion: UInt = 0u,
            pszTSAPolicyId: Pstr = MutPtr(0L),
            hashAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
            hashedMessage: CryptIntegerBlob = CryptIntegerBlob(),
            serialNumber: CryptIntegerBlob = CryptIntegerBlob(),
            ftTime: Filetime = Filetime(),
            pvAccuracy: MutPtr = MutPtr(0L),
            fOrdering: Bool = 0,
            nonce: CryptIntegerBlob = CryptIntegerBlob(),
            tsa: CryptIntegerBlob = CryptIntegerBlob(),
            cExtension: UInt = 0u,
            rgExtension: MutPtr = MutPtr(0L),
        ): CryptTimestampInfo =
            CryptTimestampInfo(
                dwVersion = dwVersion,
                pszTSAPolicyIdCtorArg = pszTSAPolicyId,
                hashAlgorithm = hashAlgorithm,
                hashedMessage = hashedMessage,
                serialNumber = serialNumber,
                ftTime = ftTime,
                pvAccuracyCtorArg = pvAccuracy,
                fOrdering = fOrdering,
                nonce = nonce,
                tsa = tsa,
                cExtension = cExtension,
                rgExtensionCtorArg = rgExtension,
            )
    }
}

public class CryptTimestampPara internal constructor(
    pszTSAPolicyIdCtorArg: Pcstr,
    public var fRequestCerts: Bool,
    public var nonce: CryptIntegerBlob,
    public var cExtension: UInt,
    rgExtensionCtorArg: MutPtr,
) {
    public var pszTSAPolicyId: Pcstr = pszTSAPolicyIdCtorArg
        internal set

    public var rgExtension: MutPtr = rgExtensionCtorArg
        internal set

    public constructor() : this(
        pszTSAPolicyIdCtorArg = ConstPtr(0L),
        fRequestCerts = 0,
        nonce = CryptIntegerBlob(),
        cExtension = 0u,
        rgExtensionCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pcstr = this.pszTSAPolicyId

    public operator fun component2(): Bool = this.fRequestCerts

    public operator fun component3(): CryptIntegerBlob = this.nonce

    public operator fun component4(): UInt = this.cExtension

    public operator fun component5(): MutPtr = this.rgExtension

    public fun copy(pszTSAPolicyId: Pcstr = this.pszTSAPolicyId, fRequestCerts: Bool = this.fRequestCerts, nonce: CryptIntegerBlob = this.nonce, cExtension: UInt = this.cExtension, rgExtension: MutPtr = this.rgExtension): CryptTimestampPara = CryptTimestampPara(pszTSAPolicyIdCtorArg = pszTSAPolicyId, fRequestCerts = fRequestCerts, nonce = nonce, cExtension = cExtension, rgExtensionCtorArg = rgExtension)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptTimestampPara) return false
        if (this.pszTSAPolicyId != other.pszTSAPolicyId) return false
        if (this.fRequestCerts != other.fRequestCerts) return false
        if (this.nonce != other.nonce) return false
        if (this.cExtension != other.cExtension) return false
        if (this.rgExtension != other.rgExtension) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszTSAPolicyId.hashCode()
        result = 31 * result + this.fRequestCerts.hashCode()
        result = 31 * result + this.nonce.hashCode()
        result = 31 * result + this.cExtension.hashCode()
        result = 31 * result + this.rgExtension.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszTSAPolicyId: Pcstr = ConstPtr(0L),
            fRequestCerts: Bool = 0,
            nonce: CryptIntegerBlob = CryptIntegerBlob(),
            cExtension: UInt = 0u,
            rgExtension: MutPtr = MutPtr(0L),
        ): CryptTimestampPara =
            CryptTimestampPara(
                pszTSAPolicyIdCtorArg = pszTSAPolicyId,
                fRequestCerts = fRequestCerts,
                nonce = nonce,
                cExtension = cExtension,
                rgExtensionCtorArg = rgExtension,
            )
    }
}

public class CryptTimestampRequest internal constructor(
    public var dwVersion: CryptTimestampVersion,
    public var hashAlgorithm: CryptAlgorithmIdentifier,
    public var hashedMessage: CryptIntegerBlob,
    pszTSAPolicyIdCtorArg: Pstr,
    public var nonce: CryptIntegerBlob,
    public var fCertReq: Bool,
    public var cExtension: UInt,
    rgExtensionCtorArg: MutPtr,
) {
    public var pszTSAPolicyId: Pstr = pszTSAPolicyIdCtorArg
        internal set

    public var rgExtension: MutPtr = rgExtensionCtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        hashAlgorithm = CryptAlgorithmIdentifier(),
        hashedMessage = CryptIntegerBlob(),
        pszTSAPolicyIdCtorArg = MutPtr(0L),
        nonce = CryptIntegerBlob(),
        fCertReq = 0,
        cExtension = 0u,
        rgExtensionCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CryptTimestampVersion = this.dwVersion

    public operator fun component2(): CryptAlgorithmIdentifier = this.hashAlgorithm

    public operator fun component3(): CryptIntegerBlob = this.hashedMessage

    public operator fun component4(): Pstr = this.pszTSAPolicyId

    public operator fun component5(): CryptIntegerBlob = this.nonce

    public operator fun component6(): Bool = this.fCertReq

    public operator fun component7(): UInt = this.cExtension

    public operator fun component8(): MutPtr = this.rgExtension

    public fun copy(dwVersion: CryptTimestampVersion = this.dwVersion, hashAlgorithm: CryptAlgorithmIdentifier = this.hashAlgorithm, hashedMessage: CryptIntegerBlob = this.hashedMessage, pszTSAPolicyId: Pstr = this.pszTSAPolicyId, nonce: CryptIntegerBlob = this.nonce, fCertReq: Bool = this.fCertReq, cExtension: UInt = this.cExtension, rgExtension: MutPtr = this.rgExtension): CryptTimestampRequest = CryptTimestampRequest(dwVersion = dwVersion, hashAlgorithm = hashAlgorithm, hashedMessage = hashedMessage, pszTSAPolicyIdCtorArg = pszTSAPolicyId, nonce = nonce, fCertReq = fCertReq, cExtension = cExtension, rgExtensionCtorArg = rgExtension)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptTimestampRequest) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.hashAlgorithm != other.hashAlgorithm) return false
        if (this.hashedMessage != other.hashedMessage) return false
        if (this.pszTSAPolicyId != other.pszTSAPolicyId) return false
        if (this.nonce != other.nonce) return false
        if (this.fCertReq != other.fCertReq) return false
        if (this.cExtension != other.cExtension) return false
        if (this.rgExtension != other.rgExtension) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.hashAlgorithm.hashCode()
        result = 31 * result + this.hashedMessage.hashCode()
        result = 31 * result + this.pszTSAPolicyId.hashCode()
        result = 31 * result + this.nonce.hashCode()
        result = 31 * result + this.fCertReq.hashCode()
        result = 31 * result + this.cExtension.hashCode()
        result = 31 * result + this.rgExtension.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwVersion: CryptTimestampVersion = 0u,
            hashAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
            hashedMessage: CryptIntegerBlob = CryptIntegerBlob(),
            pszTSAPolicyId: Pstr = MutPtr(0L),
            nonce: CryptIntegerBlob = CryptIntegerBlob(),
            fCertReq: Bool = 0,
            cExtension: UInt = 0u,
            rgExtension: MutPtr = MutPtr(0L),
        ): CryptTimestampRequest =
            CryptTimestampRequest(
                dwVersion = dwVersion,
                hashAlgorithm = hashAlgorithm,
                hashedMessage = hashedMessage,
                pszTSAPolicyIdCtorArg = pszTSAPolicyId,
                nonce = nonce,
                fCertReq = fCertReq,
                cExtension = cExtension,
                rgExtensionCtorArg = rgExtension,
            )
    }
}

public class CryptTimestampResponse internal constructor(
    public var dwStatus: CryptTimestampResponseStatus,
    public var cFreeText: UInt,
    rgFreeTextCtorArg: MutPtr,
    public var failureInfo: CryptBitBlob,
    public var contentInfo: CryptIntegerBlob,
) {
    public var rgFreeText: MutPtr = rgFreeTextCtorArg
        internal set

    public constructor() : this(
        dwStatus = 0u,
        cFreeText = 0u,
        rgFreeTextCtorArg = MutPtr(0L),
        failureInfo = CryptBitBlob(),
        contentInfo = CryptIntegerBlob(),
    )

    public operator fun component1(): CryptTimestampResponseStatus = this.dwStatus

    public operator fun component2(): UInt = this.cFreeText

    public operator fun component3(): MutPtr = this.rgFreeText

    public operator fun component4(): CryptBitBlob = this.failureInfo

    public operator fun component5(): CryptIntegerBlob = this.contentInfo

    public fun copy(dwStatus: CryptTimestampResponseStatus = this.dwStatus, cFreeText: UInt = this.cFreeText, rgFreeText: MutPtr = this.rgFreeText, failureInfo: CryptBitBlob = this.failureInfo, contentInfo: CryptIntegerBlob = this.contentInfo): CryptTimestampResponse = CryptTimestampResponse(dwStatus = dwStatus, cFreeText = cFreeText, rgFreeTextCtorArg = rgFreeText, failureInfo = failureInfo, contentInfo = contentInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptTimestampResponse) return false
        if (this.dwStatus != other.dwStatus) return false
        if (this.cFreeText != other.cFreeText) return false
        if (this.rgFreeText != other.rgFreeText) return false
        if (this.failureInfo != other.failureInfo) return false
        if (this.contentInfo != other.contentInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwStatus.hashCode()
        result = 31 * result + this.cFreeText.hashCode()
        result = 31 * result + this.rgFreeText.hashCode()
        result = 31 * result + this.failureInfo.hashCode()
        result = 31 * result + this.contentInfo.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptTimestampResponse> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptTimestampResponse> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): CryptTimestampResponse =
                    CryptTimestampResponse(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (CryptBitBlob.typeLayout()).readNative(addr + 16L),
                        (CryptIntegerBlob.typeLayout()).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: CryptTimestampResponse) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cFreeText)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.rgFreeText)
                    (CryptBitBlob.typeLayout()).writeNative(addr + 16L, value.failureInfo)
                    (CryptIntegerBlob.typeLayout()).writeNative(addr + 40L, value.contentInfo)
                }
            }

        public operator fun invoke(
            dwStatus: CryptTimestampResponseStatus = 0u,
            cFreeText: UInt = 0u,
            rgFreeText: MutPtr = MutPtr(0L),
            failureInfo: CryptBitBlob = CryptBitBlob(),
            contentInfo: CryptIntegerBlob = CryptIntegerBlob(),
        ): CryptTimestampResponse =
            CryptTimestampResponse(
                dwStatus = dwStatus,
                cFreeText = cFreeText,
                rgFreeTextCtorArg = rgFreeText,
                failureInfo = failureInfo,
                contentInfo = contentInfo,
            )
    }
}

public class CryptTimeStampRequestInfo internal constructor(
    pszTimeStampAlgorithmCtorArg: Pstr,
    pszContentTypeCtorArg: Pstr,
    public var content: CryptIntegerBlob,
    public var cAttribute: UInt,
    rgAttributeCtorArg: MutPtr,
) {
    public var pszTimeStampAlgorithm: Pstr = pszTimeStampAlgorithmCtorArg
        internal set

    public var pszContentType: Pstr = pszContentTypeCtorArg
        internal set

    public var rgAttribute: MutPtr = rgAttributeCtorArg
        internal set

    public constructor() : this(
        pszTimeStampAlgorithmCtorArg = MutPtr(0L),
        pszContentTypeCtorArg = MutPtr(0L),
        content = CryptIntegerBlob(),
        cAttribute = 0u,
        rgAttributeCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pstr = this.pszTimeStampAlgorithm

    public operator fun component2(): Pstr = this.pszContentType

    public operator fun component3(): CryptIntegerBlob = this.content

    public operator fun component4(): UInt = this.cAttribute

    public operator fun component5(): MutPtr = this.rgAttribute

    public fun copy(pszTimeStampAlgorithm: Pstr = this.pszTimeStampAlgorithm, pszContentType: Pstr = this.pszContentType, content: CryptIntegerBlob = this.content, cAttribute: UInt = this.cAttribute, rgAttribute: MutPtr = this.rgAttribute): CryptTimeStampRequestInfo = CryptTimeStampRequestInfo(pszTimeStampAlgorithmCtorArg = pszTimeStampAlgorithm, pszContentTypeCtorArg = pszContentType, content = content, cAttribute = cAttribute, rgAttributeCtorArg = rgAttribute)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptTimeStampRequestInfo) return false
        if (this.pszTimeStampAlgorithm != other.pszTimeStampAlgorithm) return false
        if (this.pszContentType != other.pszContentType) return false
        if (this.content != other.content) return false
        if (this.cAttribute != other.cAttribute) return false
        if (this.rgAttribute != other.rgAttribute) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszTimeStampAlgorithm.hashCode()
        result = 31 * result + this.pszContentType.hashCode()
        result = 31 * result + this.content.hashCode()
        result = 31 * result + this.cAttribute.hashCode()
        result = 31 * result + this.rgAttribute.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszTimeStampAlgorithm: Pstr = MutPtr(0L),
            pszContentType: Pstr = MutPtr(0L),
            content: CryptIntegerBlob = CryptIntegerBlob(),
            cAttribute: UInt = 0u,
            rgAttribute: MutPtr = MutPtr(0L),
        ): CryptTimeStampRequestInfo =
            CryptTimeStampRequestInfo(
                pszTimeStampAlgorithmCtorArg = pszTimeStampAlgorithm,
                pszContentTypeCtorArg = pszContentType,
                content = content,
                cAttribute = cAttribute,
                rgAttributeCtorArg = rgAttribute,
            )
    }
}

public class CryptUrlArray internal constructor(
    public var cUrl: UInt,
    rgwszUrlCtorArg: MutPtr,
) {
    public var rgwszUrl: MutPtr = rgwszUrlCtorArg
        internal set

    public constructor() : this(
        cUrl = 0u,
        rgwszUrlCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cUrl

    public operator fun component2(): MutPtr = this.rgwszUrl

    public fun copy(cUrl: UInt = this.cUrl, rgwszUrl: MutPtr = this.rgwszUrl): CryptUrlArray = CryptUrlArray(cUrl = cUrl, rgwszUrlCtorArg = rgwszUrl)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptUrlArray) return false
        if (this.cUrl != other.cUrl) return false
        if (this.rgwszUrl != other.rgwszUrl) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cUrl.hashCode()
        result = 31 * result + this.rgwszUrl.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptUrlArray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptUrlArray> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CryptUrlArray =
                    CryptUrlArray(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CryptUrlArray) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cUrl)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.rgwszUrl)
                }
            }

        public operator fun invoke(
            cUrl: UInt = 0u,
            rgwszUrl: MutPtr = MutPtr(0L),
        ): CryptUrlArray =
            CryptUrlArray(
                cUrl = cUrl,
                rgwszUrlCtorArg = rgwszUrl,
            )
    }
}

public class CryptUrlInfo internal constructor(
    public var cbSize: UInt,
    public var dwSyncDeltaTime: UInt,
    public var cGroup: UInt,
    rgcGroupEntryCtorArg: MutPtr,
) {
    public var rgcGroupEntry: MutPtr = rgcGroupEntryCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        dwSyncDeltaTime = 0u,
        cGroup = 0u,
        rgcGroupEntryCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): UInt = this.dwSyncDeltaTime

    public operator fun component3(): UInt = this.cGroup

    public operator fun component4(): MutPtr = this.rgcGroupEntry

    public fun copy(cbSize: UInt = this.cbSize, dwSyncDeltaTime: UInt = this.dwSyncDeltaTime, cGroup: UInt = this.cGroup, rgcGroupEntry: MutPtr = this.rgcGroupEntry): CryptUrlInfo = CryptUrlInfo(cbSize = cbSize, dwSyncDeltaTime = dwSyncDeltaTime, cGroup = cGroup, rgcGroupEntryCtorArg = rgcGroupEntry)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptUrlInfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwSyncDeltaTime != other.dwSyncDeltaTime) return false
        if (this.cGroup != other.cGroup) return false
        if (this.rgcGroupEntry != other.rgcGroupEntry) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwSyncDeltaTime.hashCode()
        result = 31 * result + this.cGroup.hashCode()
        result = 31 * result + this.rgcGroupEntry.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptUrlInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptUrlInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): CryptUrlInfo =
                    CryptUrlInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: CryptUrlInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwSyncDeltaTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cGroup)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.rgcGroupEntry)
                }
            }

        public operator fun invoke(
            cbSize: UInt = 0u,
            dwSyncDeltaTime: UInt = 0u,
            cGroup: UInt = 0u,
            rgcGroupEntry: MutPtr = MutPtr(0L),
        ): CryptUrlInfo =
            CryptUrlInfo(
                cbSize = cbSize,
                dwSyncDeltaTime = dwSyncDeltaTime,
                cGroup = cGroup,
                rgcGroupEntryCtorArg = rgcGroupEntry,
            )
    }
}

public data class CryptVerifyCertSignStrongPropertiesInfo(
    public var certSignHashCNGAlgPropData: CryptIntegerBlob = CryptIntegerBlob(),
    public var certIssuerPubKeyBitLengthPropData: CryptIntegerBlob = CryptIntegerBlob(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptVerifyCertSignStrongPropertiesInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptVerifyCertSignStrongPropertiesInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): CryptVerifyCertSignStrongPropertiesInfo =
                    CryptVerifyCertSignStrongPropertiesInfo(
                        (CryptIntegerBlob.typeLayout()).readNative(addr),
                        (CryptIntegerBlob.typeLayout()).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: CryptVerifyCertSignStrongPropertiesInfo) {
                    (CryptIntegerBlob.typeLayout()).writeNative(addr, value.certSignHashCNGAlgPropData)
                    (CryptIntegerBlob.typeLayout()).writeNative(addr + 16L, value.certIssuerPubKeyBitLengthPropData)
                }
            }
    }
}

public class CryptVerifyCertSignWeakHashInfo internal constructor(
    public var cCNGHashAlgid: UInt,
    rgpwszCNGHashAlgidCtorArg: ConstPtr,
    public var dwWeakIndex: UInt,
) {
    public var rgpwszCNGHashAlgid: ConstPtr = rgpwszCNGHashAlgidCtorArg
        internal set

    public constructor() : this(
        cCNGHashAlgid = 0u,
        rgpwszCNGHashAlgidCtorArg = ConstPtr(0L),
        dwWeakIndex = 0u,
    )

    public operator fun component1(): UInt = this.cCNGHashAlgid

    public operator fun component2(): ConstPtr = this.rgpwszCNGHashAlgid

    public operator fun component3(): UInt = this.dwWeakIndex

    public fun copy(cCNGHashAlgid: UInt = this.cCNGHashAlgid, rgpwszCNGHashAlgid: ConstPtr = this.rgpwszCNGHashAlgid, dwWeakIndex: UInt = this.dwWeakIndex): CryptVerifyCertSignWeakHashInfo = CryptVerifyCertSignWeakHashInfo(cCNGHashAlgid = cCNGHashAlgid, rgpwszCNGHashAlgidCtorArg = rgpwszCNGHashAlgid, dwWeakIndex = dwWeakIndex)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptVerifyCertSignWeakHashInfo) return false
        if (this.cCNGHashAlgid != other.cCNGHashAlgid) return false
        if (this.rgpwszCNGHashAlgid != other.rgpwszCNGHashAlgid) return false
        if (this.dwWeakIndex != other.dwWeakIndex) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cCNGHashAlgid.hashCode()
        result = 31 * result + this.rgpwszCNGHashAlgid.hashCode()
        result = 31 * result + this.dwWeakIndex.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptVerifyCertSignWeakHashInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptVerifyCertSignWeakHashInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): CryptVerifyCertSignWeakHashInfo =
                    CryptVerifyCertSignWeakHashInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: CryptVerifyCertSignWeakHashInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cCNGHashAlgid)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout(64)
                    ).writeNative(addr + 8L, value.rgpwszCNGHashAlgid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwWeakIndex)
                }
            }

        public operator fun invoke(
            cCNGHashAlgid: UInt = 0u,
            rgpwszCNGHashAlgid: ConstPtr = ConstPtr(0L),
            dwWeakIndex: UInt = 0u,
        ): CryptVerifyCertSignWeakHashInfo =
            CryptVerifyCertSignWeakHashInfo(
                cCNGHashAlgid = cCNGHashAlgid,
                rgpwszCNGHashAlgidCtorArg = rgpwszCNGHashAlgid,
                dwWeakIndex = dwWeakIndex,
            )
    }
}

public class CryptVerifyMessagePara internal constructor(
    public var cbSize: UInt,
    public var dwMsgAndCertEncodingType: UInt,
    public var hCryptProv: HcryptprovLegacy,
    public var pfnGetSignerCertificate: PfnCryptGetSignerCertificate,
    pvGetArgCtorArg: MutPtr,
) {
    public var pvGetArg: MutPtr = pvGetArgCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        dwMsgAndCertEncodingType = 0u,
        hCryptProv = 0uL,
        pfnGetSignerCertificate = null,
        pvGetArgCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): UInt = this.dwMsgAndCertEncodingType

    public operator fun component3(): HcryptprovLegacy = this.hCryptProv

    public operator fun component4(): PfnCryptGetSignerCertificate = this.pfnGetSignerCertificate

    public operator fun component5(): MutPtr = this.pvGetArg

    public fun copy(cbSize: UInt = this.cbSize, dwMsgAndCertEncodingType: UInt = this.dwMsgAndCertEncodingType, hCryptProv: HcryptprovLegacy = this.hCryptProv, pfnGetSignerCertificate: PfnCryptGetSignerCertificate = this.pfnGetSignerCertificate, pvGetArg: MutPtr = this.pvGetArg): CryptVerifyMessagePara = CryptVerifyMessagePara(cbSize = cbSize, dwMsgAndCertEncodingType = dwMsgAndCertEncodingType, hCryptProv = hCryptProv, pfnGetSignerCertificate = pfnGetSignerCertificate, pvGetArgCtorArg = pvGetArg)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptVerifyMessagePara) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwMsgAndCertEncodingType != other.dwMsgAndCertEncodingType) return false
        if (this.hCryptProv != other.hCryptProv) return false
        if (this.pfnGetSignerCertificate != other.pfnGetSignerCertificate) return false
        if (this.pvGetArg != other.pvGetArg) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwMsgAndCertEncodingType.hashCode()
        result = 31 * result + this.hCryptProv.hashCode()
        result = 31 * result + this.pfnGetSignerCertificate.hashCode()
        result = 31 * result + this.pvGetArg.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            dwMsgAndCertEncodingType: UInt = 0u,
            hCryptProv: HcryptprovLegacy = 0uL,
            pfnGetSignerCertificate: PfnCryptGetSignerCertificate = null,
            pvGetArg: MutPtr = MutPtr(0L),
        ): CryptVerifyMessagePara =
            CryptVerifyMessagePara(
                cbSize = cbSize,
                dwMsgAndCertEncodingType = dwMsgAndCertEncodingType,
                hCryptProv = hCryptProv,
                pfnGetSignerCertificate = pfnGetSignerCertificate,
                pvGetArgCtorArg = pvGetArg,
            )
    }
}

public class CryptX942OtherInfo internal constructor(
    pszContentEncryptionObjIdCtorArg: Pstr,
    public var rgbCounter: UByteArray,
    public var rgbKeyLength: UByteArray,
    public var pubInfo: CryptIntegerBlob,
) {
    public var pszContentEncryptionObjId: Pstr = pszContentEncryptionObjIdCtorArg
        internal set

    public constructor() : this(
        pszContentEncryptionObjIdCtorArg = MutPtr(0L),
        rgbCounter = UByteArray(4),
        rgbKeyLength = UByteArray(4),
        pubInfo = CryptIntegerBlob(),
    )

    public operator fun component1(): Pstr = this.pszContentEncryptionObjId

    public operator fun component2(): UByteArray = this.rgbCounter

    public operator fun component3(): UByteArray = this.rgbKeyLength

    public operator fun component4(): CryptIntegerBlob = this.pubInfo

    public fun copy(pszContentEncryptionObjId: Pstr = this.pszContentEncryptionObjId, rgbCounter: UByteArray = this.rgbCounter, rgbKeyLength: UByteArray = this.rgbKeyLength, pubInfo: CryptIntegerBlob = this.pubInfo): CryptX942OtherInfo = CryptX942OtherInfo(pszContentEncryptionObjIdCtorArg = pszContentEncryptionObjId, rgbCounter = rgbCounter, rgbKeyLength = rgbKeyLength, pubInfo = pubInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptX942OtherInfo) return false
        if (this.pszContentEncryptionObjId != other.pszContentEncryptionObjId) return false
        if (!this.rgbCounter.contentEquals(other.rgbCounter)) return false
        if (!this.rgbKeyLength.contentEquals(other.rgbKeyLength)) return false
        if (this.pubInfo != other.pubInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszContentEncryptionObjId.hashCode()
        result = 31 * result + this.rgbCounter.contentHashCode()
        result = 31 * result + this.rgbKeyLength.contentHashCode()
        result = 31 * result + this.pubInfo.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszContentEncryptionObjId: Pstr = MutPtr(0L),
            rgbCounter: UByteArray = UByteArray(4),
            rgbKeyLength: UByteArray = UByteArray(4),
            pubInfo: CryptIntegerBlob = CryptIntegerBlob(),
        ): CryptX942OtherInfo =
            CryptX942OtherInfo(
                pszContentEncryptionObjIdCtorArg = pszContentEncryptionObjId,
                rgbCounter = rgbCounter,
                rgbKeyLength = rgbKeyLength,
                pubInfo = pubInfo,
            )
    }
}

public class CryptXmlAlgorithm internal constructor(
    public var cbSize: UInt,
    wszAlgorithmCtorArg: Pcwstr,
    public var encoded: CryptXmlBlob,
) {
    public var wszAlgorithm: Pcwstr = wszAlgorithmCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        wszAlgorithmCtorArg = ConstPtr(0L),
        encoded = CryptXmlBlob(),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Pcwstr = this.wszAlgorithm

    public operator fun component3(): CryptXmlBlob = this.encoded

    public fun copy(cbSize: UInt = this.cbSize, wszAlgorithm: Pcwstr = this.wszAlgorithm, encoded: CryptXmlBlob = this.encoded): CryptXmlAlgorithm = CryptXmlAlgorithm(cbSize = cbSize, wszAlgorithmCtorArg = wszAlgorithm, encoded = encoded)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptXmlAlgorithm) return false
        if (this.cbSize != other.cbSize) return false
        if (this.wszAlgorithm != other.wszAlgorithm) return false
        if (this.encoded != other.encoded) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.wszAlgorithm.hashCode()
        result = 31 * result + this.encoded.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            wszAlgorithm: Pcwstr = ConstPtr(0L),
            encoded: CryptXmlBlob = CryptXmlBlob(),
        ): CryptXmlAlgorithm =
            CryptXmlAlgorithm(
                cbSize = cbSize,
                wszAlgorithmCtorArg = wszAlgorithm,
                encoded = encoded,
            )
    }
}

public class CryptXmlAlgorithmInfo internal constructor(
    public var cbSize: UInt,
    wszAlgorithmURICtorArg: Pwstr,
    wszNameCtorArg: Pwstr,
    public var dwGroupId: CryptXmlGroupId,
    wszCNGAlgidCtorArg: Pwstr,
    wszCNGExtraAlgidCtorArg: Pwstr,
    public var dwSignFlags: UInt,
    public var dwVerifyFlags: UInt,
    pvPaddingInfoCtorArg: MutPtr,
    pvExtraInfoCtorArg: MutPtr,
) {
    public var wszAlgorithmURI: Pwstr = wszAlgorithmURICtorArg
        internal set

    public var wszName: Pwstr = wszNameCtorArg
        internal set

    public var wszCNGAlgid: Pwstr = wszCNGAlgidCtorArg
        internal set

    public var wszCNGExtraAlgid: Pwstr = wszCNGExtraAlgidCtorArg
        internal set

    public var pvPaddingInfo: MutPtr = pvPaddingInfoCtorArg
        internal set

    public var pvExtraInfo: MutPtr = pvExtraInfoCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        wszAlgorithmURICtorArg = MutPtr(0L),
        wszNameCtorArg = MutPtr(0L),
        dwGroupId = 0u,
        wszCNGAlgidCtorArg = MutPtr(0L),
        wszCNGExtraAlgidCtorArg = MutPtr(0L),
        dwSignFlags = 0u,
        dwVerifyFlags = 0u,
        pvPaddingInfoCtorArg = MutPtr(0L),
        pvExtraInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Pwstr = this.wszAlgorithmURI

    public operator fun component3(): Pwstr = this.wszName

    public operator fun component4(): CryptXmlGroupId = this.dwGroupId

    public operator fun component5(): Pwstr = this.wszCNGAlgid

    public operator fun component6(): Pwstr = this.wszCNGExtraAlgid

    public operator fun component7(): UInt = this.dwSignFlags

    public operator fun component8(): UInt = this.dwVerifyFlags

    public operator fun component9(): MutPtr = this.pvPaddingInfo

    public operator fun component10(): MutPtr = this.pvExtraInfo

    public fun copy(cbSize: UInt = this.cbSize, wszAlgorithmURI: Pwstr = this.wszAlgorithmURI, wszName: Pwstr = this.wszName, dwGroupId: CryptXmlGroupId = this.dwGroupId, wszCNGAlgid: Pwstr = this.wszCNGAlgid, wszCNGExtraAlgid: Pwstr = this.wszCNGExtraAlgid, dwSignFlags: UInt = this.dwSignFlags, dwVerifyFlags: UInt = this.dwVerifyFlags, pvPaddingInfo: MutPtr = this.pvPaddingInfo, pvExtraInfo: MutPtr = this.pvExtraInfo): CryptXmlAlgorithmInfo = CryptXmlAlgorithmInfo(cbSize = cbSize, wszAlgorithmURICtorArg = wszAlgorithmURI, wszNameCtorArg = wszName, dwGroupId = dwGroupId, wszCNGAlgidCtorArg = wszCNGAlgid, wszCNGExtraAlgidCtorArg = wszCNGExtraAlgid, dwSignFlags = dwSignFlags, dwVerifyFlags = dwVerifyFlags, pvPaddingInfoCtorArg = pvPaddingInfo, pvExtraInfoCtorArg = pvExtraInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptXmlAlgorithmInfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.wszAlgorithmURI != other.wszAlgorithmURI) return false
        if (this.wszName != other.wszName) return false
        if (this.dwGroupId != other.dwGroupId) return false
        if (this.wszCNGAlgid != other.wszCNGAlgid) return false
        if (this.wszCNGExtraAlgid != other.wszCNGExtraAlgid) return false
        if (this.dwSignFlags != other.dwSignFlags) return false
        if (this.dwVerifyFlags != other.dwVerifyFlags) return false
        if (this.pvPaddingInfo != other.pvPaddingInfo) return false
        if (this.pvExtraInfo != other.pvExtraInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.wszAlgorithmURI.hashCode()
        result = 31 * result + this.wszName.hashCode()
        result = 31 * result + this.dwGroupId.hashCode()
        result = 31 * result + this.wszCNGAlgid.hashCode()
        result = 31 * result + this.wszCNGExtraAlgid.hashCode()
        result = 31 * result + this.dwSignFlags.hashCode()
        result = 31 * result + this.dwVerifyFlags.hashCode()
        result = 31 * result + this.pvPaddingInfo.hashCode()
        result = 31 * result + this.pvExtraInfo.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            wszAlgorithmURI: Pwstr = MutPtr(0L),
            wszName: Pwstr = MutPtr(0L),
            dwGroupId: CryptXmlGroupId = 0u,
            wszCNGAlgid: Pwstr = MutPtr(0L),
            wszCNGExtraAlgid: Pwstr = MutPtr(0L),
            dwSignFlags: UInt = 0u,
            dwVerifyFlags: UInt = 0u,
            pvPaddingInfo: MutPtr = MutPtr(0L),
            pvExtraInfo: MutPtr = MutPtr(0L),
        ): CryptXmlAlgorithmInfo =
            CryptXmlAlgorithmInfo(
                cbSize = cbSize,
                wszAlgorithmURICtorArg = wszAlgorithmURI,
                wszNameCtorArg = wszName,
                dwGroupId = dwGroupId,
                wszCNGAlgidCtorArg = wszCNGAlgid,
                wszCNGExtraAlgidCtorArg = wszCNGExtraAlgid,
                dwSignFlags = dwSignFlags,
                dwVerifyFlags = dwVerifyFlags,
                pvPaddingInfoCtorArg = pvPaddingInfo,
                pvExtraInfoCtorArg = pvExtraInfo,
            )
    }
}

public class CryptXmlBlob internal constructor(
    public var dwCharset: CryptXmlCharset,
    public var cbData: UInt,
    pbDataCtorArg: MutPtr,
) {
    public var pbData: MutPtr = pbDataCtorArg
        internal set

    public constructor() : this(
        dwCharset = 0,
        cbData = 0u,
        pbDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CryptXmlCharset = this.dwCharset

    public operator fun component2(): UInt = this.cbData

    public operator fun component3(): MutPtr = this.pbData

    public fun copy(dwCharset: CryptXmlCharset = this.dwCharset, cbData: UInt = this.cbData, pbData: MutPtr = this.pbData): CryptXmlBlob = CryptXmlBlob(dwCharset = dwCharset, cbData = cbData, pbDataCtorArg = pbData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptXmlBlob) return false
        if (this.dwCharset != other.dwCharset) return false
        if (this.cbData != other.cbData) return false
        if (this.pbData != other.pbData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCharset.hashCode()
        result = 31 * result + this.cbData.hashCode()
        result = 31 * result + this.pbData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptXmlBlob> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptXmlBlob> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CryptXmlBlob =
                    CryptXmlBlob(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CryptXmlBlob) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.dwCharset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cbData)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pbData)
                }
            }

        public operator fun invoke(
            dwCharset: CryptXmlCharset = 0,
            cbData: UInt = 0u,
            pbData: MutPtr = MutPtr(0L),
        ): CryptXmlBlob =
            CryptXmlBlob(
                dwCharset = dwCharset,
                cbData = cbData,
                pbDataCtorArg = pbData,
            )
    }
}

public data class CryptXmlCryptographicInterface(
    public var cbSize: UInt = 0u,
    public var fpCryptXmlEncodeAlgorithm: CryptXmlDllEncodeAlgorithm = null,
    public var fpCryptXmlCreateDigest: CryptXmlDllCreateDigest = null,
    public var fpCryptXmlDigestData: CryptXmlDllDigestData = null,
    public var fpCryptXmlFinalizeDigest: CryptXmlDllFinalizeDigest = null,
    public var fpCryptXmlCloseDigest: CryptXmlDllCloseDigest = null,
    public var fpCryptXmlSignData: CryptXmlDllSignData = null,
    public var fpCryptXmlVerifySignature: CryptXmlDllVerifySignature = null,
    public var fpCryptXmlGetAlgorithmInfo: CryptXmlDllGetAlgorithmInfo = null,
)

public class CryptXmlDataBlob internal constructor(
    public var cbData: UInt,
    pbDataCtorArg: MutPtr,
) {
    public var pbData: MutPtr = pbDataCtorArg
        internal set

    public constructor() : this(
        cbData = 0u,
        pbDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbData

    public operator fun component2(): MutPtr = this.pbData

    public fun copy(cbData: UInt = this.cbData, pbData: MutPtr = this.pbData): CryptXmlDataBlob = CryptXmlDataBlob(cbData = cbData, pbDataCtorArg = pbData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptXmlDataBlob) return false
        if (this.cbData != other.cbData) return false
        if (this.pbData != other.pbData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbData.hashCode()
        result = 31 * result + this.pbData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptXmlDataBlob> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptXmlDataBlob> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CryptXmlDataBlob =
                    CryptXmlDataBlob(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CryptXmlDataBlob) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbData)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pbData)
                }
            }

        public operator fun invoke(
            cbData: UInt = 0u,
            pbData: MutPtr = MutPtr(0L),
        ): CryptXmlDataBlob =
            CryptXmlDataBlob(
                cbData = cbData,
                pbDataCtorArg = pbData,
            )
    }
}

public class CryptXmlDataProvider internal constructor(
    pvCallbackStateCtorArg: MutPtr,
    public var cbBufferSize: UInt,
    public var pfnRead: PfnCryptXmlDataProviderRead,
    public var pfnClose: PfnCryptXmlDataProviderClose,
) {
    public var pvCallbackState: MutPtr = pvCallbackStateCtorArg
        internal set

    public constructor() : this(
        pvCallbackStateCtorArg = MutPtr(0L),
        cbBufferSize = 0u,
        pfnRead = null,
        pfnClose = null,
    )

    public operator fun component1(): MutPtr = this.pvCallbackState

    public operator fun component2(): UInt = this.cbBufferSize

    public operator fun component3(): PfnCryptXmlDataProviderRead = this.pfnRead

    public operator fun component4(): PfnCryptXmlDataProviderClose = this.pfnClose

    public fun copy(pvCallbackState: MutPtr = this.pvCallbackState, cbBufferSize: UInt = this.cbBufferSize, pfnRead: PfnCryptXmlDataProviderRead = this.pfnRead, pfnClose: PfnCryptXmlDataProviderClose = this.pfnClose): CryptXmlDataProvider = CryptXmlDataProvider(pvCallbackStateCtorArg = pvCallbackState, cbBufferSize = cbBufferSize, pfnRead = pfnRead, pfnClose = pfnClose)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptXmlDataProvider) return false
        if (this.pvCallbackState != other.pvCallbackState) return false
        if (this.cbBufferSize != other.cbBufferSize) return false
        if (this.pfnRead != other.pfnRead) return false
        if (this.pfnClose != other.pfnClose) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pvCallbackState.hashCode()
        result = 31 * result + this.cbBufferSize.hashCode()
        result = 31 * result + this.pfnRead.hashCode()
        result = 31 * result + this.pfnClose.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pvCallbackState: MutPtr = MutPtr(0L),
            cbBufferSize: UInt = 0u,
            pfnRead: PfnCryptXmlDataProviderRead = null,
            pfnClose: PfnCryptXmlDataProviderClose = null,
        ): CryptXmlDataProvider =
            CryptXmlDataProvider(
                pvCallbackStateCtorArg = pvCallbackState,
                cbBufferSize = cbBufferSize,
                pfnRead = pfnRead,
                pfnClose = pfnClose,
            )
    }
}

public class CryptXmlDocCtxt internal constructor(
    public var cbSize: UInt,
    hDocCtxtCtorArg: MutPtr,
    pTransformsConfigCtorArg: MutPtr,
    public var cSignature: UInt,
    rgpSignatureCtorArg: MutPtr,
) {
    public var hDocCtxt: MutPtr = hDocCtxtCtorArg
        internal set

    public var pTransformsConfig: MutPtr = pTransformsConfigCtorArg
        internal set

    public var rgpSignature: MutPtr = rgpSignatureCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        hDocCtxtCtorArg = MutPtr(0L),
        pTransformsConfigCtorArg = MutPtr(0L),
        cSignature = 0u,
        rgpSignatureCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): MutPtr = this.hDocCtxt

    public operator fun component3(): MutPtr = this.pTransformsConfig

    public operator fun component4(): UInt = this.cSignature

    public operator fun component5(): MutPtr = this.rgpSignature

    public fun copy(cbSize: UInt = this.cbSize, hDocCtxt: MutPtr = this.hDocCtxt, pTransformsConfig: MutPtr = this.pTransformsConfig, cSignature: UInt = this.cSignature, rgpSignature: MutPtr = this.rgpSignature): CryptXmlDocCtxt = CryptXmlDocCtxt(cbSize = cbSize, hDocCtxtCtorArg = hDocCtxt, pTransformsConfigCtorArg = pTransformsConfig, cSignature = cSignature, rgpSignatureCtorArg = rgpSignature)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptXmlDocCtxt) return false
        if (this.cbSize != other.cbSize) return false
        if (this.hDocCtxt != other.hDocCtxt) return false
        if (this.pTransformsConfig != other.pTransformsConfig) return false
        if (this.cSignature != other.cSignature) return false
        if (this.rgpSignature != other.rgpSignature) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.hDocCtxt.hashCode()
        result = 31 * result + this.pTransformsConfig.hashCode()
        result = 31 * result + this.cSignature.hashCode()
        result = 31 * result + this.rgpSignature.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptXmlDocCtxt> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptXmlDocCtxt> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): CryptXmlDocCtxt =
                    CryptXmlDocCtxt(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: CryptXmlDocCtxt) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.hDocCtxt)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.pTransformsConfig)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.cSignature)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 32L, value.rgpSignature)
                }
            }

        public operator fun invoke(
            cbSize: UInt = 0u,
            hDocCtxt: MutPtr = MutPtr(0L),
            pTransformsConfig: MutPtr = MutPtr(0L),
            cSignature: UInt = 0u,
            rgpSignature: MutPtr = MutPtr(0L),
        ): CryptXmlDocCtxt =
            CryptXmlDocCtxt(
                cbSize = cbSize,
                hDocCtxtCtorArg = hDocCtxt,
                pTransformsConfigCtorArg = pTransformsConfig,
                cSignature = cSignature,
                rgpSignatureCtorArg = rgpSignature,
            )
    }
}

public class CryptXmlIssuerSerial internal constructor(
    wszIssuerCtorArg: Pcwstr,
    wszSerialCtorArg: Pcwstr,
) {
    public var wszIssuer: Pcwstr = wszIssuerCtorArg
        internal set

    public var wszSerial: Pcwstr = wszSerialCtorArg
        internal set

    public constructor() : this(
        wszIssuerCtorArg = ConstPtr(0L),
        wszSerialCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Pcwstr = this.wszIssuer

    public operator fun component2(): Pcwstr = this.wszSerial

    public fun copy(wszIssuer: Pcwstr = this.wszIssuer, wszSerial: Pcwstr = this.wszSerial): CryptXmlIssuerSerial = CryptXmlIssuerSerial(wszIssuerCtorArg = wszIssuer, wszSerialCtorArg = wszSerial)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptXmlIssuerSerial) return false
        if (this.wszIssuer != other.wszIssuer) return false
        if (this.wszSerial != other.wszSerial) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wszIssuer.hashCode()
        result = 31 * result + this.wszSerial.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            wszIssuer: Pcwstr = ConstPtr(0L),
            wszSerial: Pcwstr = ConstPtr(0L),
        ): CryptXmlIssuerSerial =
            CryptXmlIssuerSerial(
                wszIssuerCtorArg = wszIssuer,
                wszSerialCtorArg = wszSerial,
            )
    }
}

public class CryptXmlKeyinfoParam internal constructor(
    wszIdCtorArg: Pcwstr,
    wszKeyNameCtorArg: Pcwstr,
    public var ski: CryptIntegerBlob,
    wszSubjectNameCtorArg: Pcwstr,
    public var cCertificate: UInt,
    rgCertificateCtorArg: MutPtr,
    public var cCRL: UInt,
    rgCRLCtorArg: MutPtr,
) {
    public var wszId: Pcwstr = wszIdCtorArg
        internal set

    public var wszKeyName: Pcwstr = wszKeyNameCtorArg
        internal set

    public var wszSubjectName: Pcwstr = wszSubjectNameCtorArg
        internal set

    public var rgCertificate: MutPtr = rgCertificateCtorArg
        internal set

    public var rgCRL: MutPtr = rgCRLCtorArg
        internal set

    public constructor() : this(
        wszIdCtorArg = ConstPtr(0L),
        wszKeyNameCtorArg = ConstPtr(0L),
        ski = CryptIntegerBlob(),
        wszSubjectNameCtorArg = ConstPtr(0L),
        cCertificate = 0u,
        rgCertificateCtorArg = MutPtr(0L),
        cCRL = 0u,
        rgCRLCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pcwstr = this.wszId

    public operator fun component2(): Pcwstr = this.wszKeyName

    public operator fun component3(): CryptIntegerBlob = this.ski

    public operator fun component4(): Pcwstr = this.wszSubjectName

    public operator fun component5(): UInt = this.cCertificate

    public operator fun component6(): MutPtr = this.rgCertificate

    public operator fun component7(): UInt = this.cCRL

    public operator fun component8(): MutPtr = this.rgCRL

    public fun copy(wszId: Pcwstr = this.wszId, wszKeyName: Pcwstr = this.wszKeyName, ski: CryptIntegerBlob = this.ski, wszSubjectName: Pcwstr = this.wszSubjectName, cCertificate: UInt = this.cCertificate, rgCertificate: MutPtr = this.rgCertificate, cCRL: UInt = this.cCRL, rgCRL: MutPtr = this.rgCRL): CryptXmlKeyinfoParam = CryptXmlKeyinfoParam(wszIdCtorArg = wszId, wszKeyNameCtorArg = wszKeyName, ski = ski, wszSubjectNameCtorArg = wszSubjectName, cCertificate = cCertificate, rgCertificateCtorArg = rgCertificate, cCRL = cCRL, rgCRLCtorArg = rgCRL)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptXmlKeyinfoParam) return false
        if (this.wszId != other.wszId) return false
        if (this.wszKeyName != other.wszKeyName) return false
        if (this.ski != other.ski) return false
        if (this.wszSubjectName != other.wszSubjectName) return false
        if (this.cCertificate != other.cCertificate) return false
        if (this.rgCertificate != other.rgCertificate) return false
        if (this.cCRL != other.cCRL) return false
        if (this.rgCRL != other.rgCRL) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wszId.hashCode()
        result = 31 * result + this.wszKeyName.hashCode()
        result = 31 * result + this.ski.hashCode()
        result = 31 * result + this.wszSubjectName.hashCode()
        result = 31 * result + this.cCertificate.hashCode()
        result = 31 * result + this.rgCertificate.hashCode()
        result = 31 * result + this.cCRL.hashCode()
        result = 31 * result + this.rgCRL.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            wszId: Pcwstr = ConstPtr(0L),
            wszKeyName: Pcwstr = ConstPtr(0L),
            ski: CryptIntegerBlob = CryptIntegerBlob(),
            wszSubjectName: Pcwstr = ConstPtr(0L),
            cCertificate: UInt = 0u,
            rgCertificate: MutPtr = MutPtr(0L),
            cCRL: UInt = 0u,
            rgCRL: MutPtr = MutPtr(0L),
        ): CryptXmlKeyinfoParam =
            CryptXmlKeyinfoParam(
                wszIdCtorArg = wszId,
                wszKeyNameCtorArg = wszKeyName,
                ski = ski,
                wszSubjectNameCtorArg = wszSubjectName,
                cCertificate = cCertificate,
                rgCertificateCtorArg = rgCertificate,
                cCRL = cCRL,
                rgCRLCtorArg = rgCRL,
            )
    }
}

public data class CryptXmlKeyDsaKeyValue(
    public var p: CryptXmlDataBlob = CryptXmlDataBlob(),
    public var q: CryptXmlDataBlob = CryptXmlDataBlob(),
    public var g: CryptXmlDataBlob = CryptXmlDataBlob(),
    public var y: CryptXmlDataBlob = CryptXmlDataBlob(),
    public var j: CryptXmlDataBlob = CryptXmlDataBlob(),
    public var seed: CryptXmlDataBlob = CryptXmlDataBlob(),
    public var counter: CryptXmlDataBlob = CryptXmlDataBlob(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptXmlKeyDsaKeyValue> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptXmlKeyDsaKeyValue> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 112L
                override fun readNative(addr: Long): CryptXmlKeyDsaKeyValue =
                    CryptXmlKeyDsaKeyValue(
                        (CryptXmlDataBlob.typeLayout()).readNative(addr),
                        (CryptXmlDataBlob.typeLayout()).readNative(addr + 16L),
                        (CryptXmlDataBlob.typeLayout()).readNative(addr + 32L),
                        (CryptXmlDataBlob.typeLayout()).readNative(addr + 48L),
                        (CryptXmlDataBlob.typeLayout()).readNative(addr + 64L),
                        (CryptXmlDataBlob.typeLayout()).readNative(addr + 80L),
                        (CryptXmlDataBlob.typeLayout()).readNative(addr + 96L),
                    )
                override fun writeNative(addr: Long, value: CryptXmlKeyDsaKeyValue) {
                    (CryptXmlDataBlob.typeLayout()).writeNative(addr, value.p)
                    (CryptXmlDataBlob.typeLayout()).writeNative(addr + 16L, value.q)
                    (CryptXmlDataBlob.typeLayout()).writeNative(addr + 32L, value.g)
                    (CryptXmlDataBlob.typeLayout()).writeNative(addr + 48L, value.y)
                    (CryptXmlDataBlob.typeLayout()).writeNative(addr + 64L, value.j)
                    (CryptXmlDataBlob.typeLayout()).writeNative(addr + 80L, value.seed)
                    (CryptXmlDataBlob.typeLayout()).writeNative(addr + 96L, value.counter)
                }
            }
    }
}

public class CryptXmlKeyEcdsaKeyValue internal constructor(
    wszNamedCurveCtorArg: Pcwstr,
    public var x: CryptXmlDataBlob,
    public var y: CryptXmlDataBlob,
    public var explicitPara: CryptXmlBlob,
) {
    public var wszNamedCurve: Pcwstr = wszNamedCurveCtorArg
        internal set

    public constructor() : this(
        wszNamedCurveCtorArg = ConstPtr(0L),
        x = CryptXmlDataBlob(),
        y = CryptXmlDataBlob(),
        explicitPara = CryptXmlBlob(),
    )

    public operator fun component1(): Pcwstr = this.wszNamedCurve

    public operator fun component2(): CryptXmlDataBlob = this.x

    public operator fun component3(): CryptXmlDataBlob = this.y

    public operator fun component4(): CryptXmlBlob = this.explicitPara

    public fun copy(wszNamedCurve: Pcwstr = this.wszNamedCurve, x: CryptXmlDataBlob = this.x, y: CryptXmlDataBlob = this.y, explicitPara: CryptXmlBlob = this.explicitPara): CryptXmlKeyEcdsaKeyValue = CryptXmlKeyEcdsaKeyValue(wszNamedCurveCtorArg = wszNamedCurve, x = x, y = y, explicitPara = explicitPara)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptXmlKeyEcdsaKeyValue) return false
        if (this.wszNamedCurve != other.wszNamedCurve) return false
        if (this.x != other.x) return false
        if (this.y != other.y) return false
        if (this.explicitPara != other.explicitPara) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wszNamedCurve.hashCode()
        result = 31 * result + this.x.hashCode()
        result = 31 * result + this.y.hashCode()
        result = 31 * result + this.explicitPara.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            wszNamedCurve: Pcwstr = ConstPtr(0L),
            x: CryptXmlDataBlob = CryptXmlDataBlob(),
            y: CryptXmlDataBlob = CryptXmlDataBlob(),
            explicitPara: CryptXmlBlob = CryptXmlBlob(),
        ): CryptXmlKeyEcdsaKeyValue =
            CryptXmlKeyEcdsaKeyValue(
                wszNamedCurveCtorArg = wszNamedCurve,
                x = x,
                y = y,
                explicitPara = explicitPara,
            )
    }
}

public class CryptXmlKeyInfo internal constructor(
    public var cbSize: UInt,
    wszIdCtorArg: Pcwstr,
    public var cKeyInfo: UInt,
    rgKeyInfoCtorArg: MutPtr,
    hVerifyKeyCtorArg: BcryptKeyHandle,
) {
    public var wszId: Pcwstr = wszIdCtorArg
        internal set

    public var rgKeyInfo: MutPtr = rgKeyInfoCtorArg
        internal set

    public var hVerifyKey: BcryptKeyHandle = hVerifyKeyCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        wszIdCtorArg = ConstPtr(0L),
        cKeyInfo = 0u,
        rgKeyInfoCtorArg = MutPtr(0L),
        hVerifyKeyCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Pcwstr = this.wszId

    public operator fun component3(): UInt = this.cKeyInfo

    public operator fun component4(): MutPtr = this.rgKeyInfo

    public operator fun component5(): BcryptKeyHandle = this.hVerifyKey

    public fun copy(cbSize: UInt = this.cbSize, wszId: Pcwstr = this.wszId, cKeyInfo: UInt = this.cKeyInfo, rgKeyInfo: MutPtr = this.rgKeyInfo, hVerifyKey: BcryptKeyHandle = this.hVerifyKey): CryptXmlKeyInfo = CryptXmlKeyInfo(cbSize = cbSize, wszIdCtorArg = wszId, cKeyInfo = cKeyInfo, rgKeyInfoCtorArg = rgKeyInfo, hVerifyKeyCtorArg = hVerifyKey)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptXmlKeyInfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.wszId != other.wszId) return false
        if (this.cKeyInfo != other.cKeyInfo) return false
        if (this.rgKeyInfo != other.rgKeyInfo) return false
        if (this.hVerifyKey != other.hVerifyKey) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.wszId.hashCode()
        result = 31 * result + this.cKeyInfo.hashCode()
        result = 31 * result + this.rgKeyInfo.hashCode()
        result = 31 * result + this.hVerifyKey.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            wszId: Pcwstr = ConstPtr(0L),
            cKeyInfo: UInt = 0u,
            rgKeyInfo: MutPtr = MutPtr(0L),
            hVerifyKey: BcryptKeyHandle = MutPtr(0L),
        ): CryptXmlKeyInfo =
            CryptXmlKeyInfo(
                cbSize = cbSize,
                wszIdCtorArg = wszId,
                cKeyInfo = cKeyInfo,
                rgKeyInfoCtorArg = rgKeyInfo,
                hVerifyKeyCtorArg = hVerifyKey,
            )
    }
}

public data class CryptXmlKeyInfoItem(
    public var dwType: CryptXmlKeyinfoType = 0u,
    public var anonymous: CryptXmlKeyInfoItem0 = CryptXmlKeyInfoItem0(),
)

public class CryptXmlKeyInfoItem0 internal constructor(
    wszKeyNameCtorArg: Pcwstr,
    public var keyValue: CryptXmlKeyValue,
    public var retrievalMethod: CryptXmlBlob,
    public var x509Data: CryptXmlX509data,
    public var custom: CryptXmlBlob,
) {
    public var wszKeyName: Pcwstr = wszKeyNameCtorArg
        internal set

    public constructor() : this(
        wszKeyNameCtorArg = ConstPtr(0L),
        keyValue = CryptXmlKeyValue(),
        retrievalMethod = CryptXmlBlob(),
        x509Data = CryptXmlX509data(),
        custom = CryptXmlBlob(),
    )

    public operator fun component1(): Pcwstr = this.wszKeyName

    public operator fun component2(): CryptXmlKeyValue = this.keyValue

    public operator fun component3(): CryptXmlBlob = this.retrievalMethod

    public operator fun component4(): CryptXmlX509data = this.x509Data

    public operator fun component5(): CryptXmlBlob = this.custom

    public fun copy(wszKeyName: Pcwstr = this.wszKeyName, keyValue: CryptXmlKeyValue = this.keyValue, retrievalMethod: CryptXmlBlob = this.retrievalMethod, x509Data: CryptXmlX509data = this.x509Data, custom: CryptXmlBlob = this.custom): CryptXmlKeyInfoItem0 = CryptXmlKeyInfoItem0(wszKeyNameCtorArg = wszKeyName, keyValue = keyValue, retrievalMethod = retrievalMethod, x509Data = x509Data, custom = custom)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptXmlKeyInfoItem0) return false
        if (this.wszKeyName != other.wszKeyName) return false
        if (this.keyValue != other.keyValue) return false
        if (this.retrievalMethod != other.retrievalMethod) return false
        if (this.x509Data != other.x509Data) return false
        if (this.custom != other.custom) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wszKeyName.hashCode()
        result = 31 * result + this.keyValue.hashCode()
        result = 31 * result + this.retrievalMethod.hashCode()
        result = 31 * result + this.x509Data.hashCode()
        result = 31 * result + this.custom.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            wszKeyName: Pcwstr = ConstPtr(0L),
            keyValue: CryptXmlKeyValue = CryptXmlKeyValue(),
            retrievalMethod: CryptXmlBlob = CryptXmlBlob(),
            x509Data: CryptXmlX509data = CryptXmlX509data(),
            custom: CryptXmlBlob = CryptXmlBlob(),
        ): CryptXmlKeyInfoItem0 =
            CryptXmlKeyInfoItem0(
                wszKeyNameCtorArg = wszKeyName,
                keyValue = keyValue,
                retrievalMethod = retrievalMethod,
                x509Data = x509Data,
                custom = custom,
            )
    }
}

public data class CryptXmlKeyRsaKeyValue(
    public var modulus: CryptXmlDataBlob = CryptXmlDataBlob(),
    public var exponent: CryptXmlDataBlob = CryptXmlDataBlob(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptXmlKeyRsaKeyValue> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptXmlKeyRsaKeyValue> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): CryptXmlKeyRsaKeyValue =
                    CryptXmlKeyRsaKeyValue(
                        (CryptXmlDataBlob.typeLayout()).readNative(addr),
                        (CryptXmlDataBlob.typeLayout()).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: CryptXmlKeyRsaKeyValue) {
                    (CryptXmlDataBlob.typeLayout()).writeNative(addr, value.modulus)
                    (CryptXmlDataBlob.typeLayout()).writeNative(addr + 16L, value.exponent)
                }
            }
    }
}

public data class CryptXmlKeyValue(
    public var dwType: CryptXmlKeyValueType = 0u,
    public var anonymous: CryptXmlKeyValue0 = CryptXmlKeyValue0(),
)

public data class CryptXmlKeyValue0(
    public var dSAKeyValue: CryptXmlKeyDsaKeyValue = CryptXmlKeyDsaKeyValue(),
    public var rSAKeyValue: CryptXmlKeyRsaKeyValue = CryptXmlKeyRsaKeyValue(),
    public var eCDSAKeyValue: CryptXmlKeyEcdsaKeyValue = CryptXmlKeyEcdsaKeyValue(),
    public var custom: CryptXmlBlob = CryptXmlBlob(),
)

public class CryptXmlObject internal constructor(
    public var cbSize: UInt,
    hObjectCtorArg: MutPtr,
    wszIdCtorArg: Pcwstr,
    wszMimeTypeCtorArg: Pcwstr,
    wszEncodingCtorArg: Pcwstr,
    public var manifest: CryptXmlReferences,
    public var encoded: CryptXmlBlob,
) {
    public var hObject: MutPtr = hObjectCtorArg
        internal set

    public var wszId: Pcwstr = wszIdCtorArg
        internal set

    public var wszMimeType: Pcwstr = wszMimeTypeCtorArg
        internal set

    public var wszEncoding: Pcwstr = wszEncodingCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        hObjectCtorArg = MutPtr(0L),
        wszIdCtorArg = ConstPtr(0L),
        wszMimeTypeCtorArg = ConstPtr(0L),
        wszEncodingCtorArg = ConstPtr(0L),
        manifest = CryptXmlReferences(),
        encoded = CryptXmlBlob(),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): MutPtr = this.hObject

    public operator fun component3(): Pcwstr = this.wszId

    public operator fun component4(): Pcwstr = this.wszMimeType

    public operator fun component5(): Pcwstr = this.wszEncoding

    public operator fun component6(): CryptXmlReferences = this.manifest

    public operator fun component7(): CryptXmlBlob = this.encoded

    public fun copy(cbSize: UInt = this.cbSize, hObject: MutPtr = this.hObject, wszId: Pcwstr = this.wszId, wszMimeType: Pcwstr = this.wszMimeType, wszEncoding: Pcwstr = this.wszEncoding, manifest: CryptXmlReferences = this.manifest, encoded: CryptXmlBlob = this.encoded): CryptXmlObject = CryptXmlObject(cbSize = cbSize, hObjectCtorArg = hObject, wszIdCtorArg = wszId, wszMimeTypeCtorArg = wszMimeType, wszEncodingCtorArg = wszEncoding, manifest = manifest, encoded = encoded)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptXmlObject) return false
        if (this.cbSize != other.cbSize) return false
        if (this.hObject != other.hObject) return false
        if (this.wszId != other.wszId) return false
        if (this.wszMimeType != other.wszMimeType) return false
        if (this.wszEncoding != other.wszEncoding) return false
        if (this.manifest != other.manifest) return false
        if (this.encoded != other.encoded) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.hObject.hashCode()
        result = 31 * result + this.wszId.hashCode()
        result = 31 * result + this.wszMimeType.hashCode()
        result = 31 * result + this.wszEncoding.hashCode()
        result = 31 * result + this.manifest.hashCode()
        result = 31 * result + this.encoded.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            hObject: MutPtr = MutPtr(0L),
            wszId: Pcwstr = ConstPtr(0L),
            wszMimeType: Pcwstr = ConstPtr(0L),
            wszEncoding: Pcwstr = ConstPtr(0L),
            manifest: CryptXmlReferences = CryptXmlReferences(),
            encoded: CryptXmlBlob = CryptXmlBlob(),
        ): CryptXmlObject =
            CryptXmlObject(
                cbSize = cbSize,
                hObjectCtorArg = hObject,
                wszIdCtorArg = wszId,
                wszMimeTypeCtorArg = wszMimeType,
                wszEncodingCtorArg = wszEncoding,
                manifest = manifest,
                encoded = encoded,
            )
    }
}

public class CryptXmlProperty internal constructor(
    public var dwPropId: CryptXmlPropertyId,
    pvValueCtorArg: ConstPtr,
    public var cbValue: UInt,
) {
    public var pvValue: ConstPtr = pvValueCtorArg
        internal set

    public constructor() : this(
        dwPropId = 0,
        pvValueCtorArg = ConstPtr(0L),
        cbValue = 0u,
    )

    public operator fun component1(): CryptXmlPropertyId = this.dwPropId

    public operator fun component2(): ConstPtr = this.pvValue

    public operator fun component3(): UInt = this.cbValue

    public fun copy(dwPropId: CryptXmlPropertyId = this.dwPropId, pvValue: ConstPtr = this.pvValue, cbValue: UInt = this.cbValue): CryptXmlProperty = CryptXmlProperty(dwPropId = dwPropId, pvValueCtorArg = pvValue, cbValue = cbValue)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptXmlProperty) return false
        if (this.dwPropId != other.dwPropId) return false
        if (this.pvValue != other.pvValue) return false
        if (this.cbValue != other.cbValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwPropId.hashCode()
        result = 31 * result + this.pvValue.hashCode()
        result = 31 * result + this.cbValue.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptXmlProperty> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptXmlProperty> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): CryptXmlProperty =
                    CryptXmlProperty(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: CryptXmlProperty) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.dwPropId)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout(64)
                    ).writeNative(addr + 8L, value.pvValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cbValue)
                }
            }

        public operator fun invoke(
            dwPropId: CryptXmlPropertyId = 0,
            pvValue: ConstPtr = ConstPtr(0L),
            cbValue: UInt = 0u,
        ): CryptXmlProperty =
            CryptXmlProperty(
                dwPropId = dwPropId,
                pvValueCtorArg = pvValue,
                cbValue = cbValue,
            )
    }
}

public class CryptXmlReference internal constructor(
    public var cbSize: UInt,
    hReferenceCtorArg: MutPtr,
    wszIdCtorArg: Pcwstr,
    wszUriCtorArg: Pcwstr,
    wszTypeCtorArg: Pcwstr,
    public var digestMethod: CryptXmlAlgorithm,
    public var digestValue: CryptIntegerBlob,
    public var cTransform: UInt,
    rgTransformCtorArg: MutPtr,
) {
    public var hReference: MutPtr = hReferenceCtorArg
        internal set

    public var wszId: Pcwstr = wszIdCtorArg
        internal set

    public var wszUri: Pcwstr = wszUriCtorArg
        internal set

    public var wszType: Pcwstr = wszTypeCtorArg
        internal set

    public var rgTransform: MutPtr = rgTransformCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        hReferenceCtorArg = MutPtr(0L),
        wszIdCtorArg = ConstPtr(0L),
        wszUriCtorArg = ConstPtr(0L),
        wszTypeCtorArg = ConstPtr(0L),
        digestMethod = CryptXmlAlgorithm(),
        digestValue = CryptIntegerBlob(),
        cTransform = 0u,
        rgTransformCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): MutPtr = this.hReference

    public operator fun component3(): Pcwstr = this.wszId

    public operator fun component4(): Pcwstr = this.wszUri

    public operator fun component5(): Pcwstr = this.wszType

    public operator fun component6(): CryptXmlAlgorithm = this.digestMethod

    public operator fun component7(): CryptIntegerBlob = this.digestValue

    public operator fun component8(): UInt = this.cTransform

    public operator fun component9(): MutPtr = this.rgTransform

    public fun copy(cbSize: UInt = this.cbSize, hReference: MutPtr = this.hReference, wszId: Pcwstr = this.wszId, wszUri: Pcwstr = this.wszUri, wszType: Pcwstr = this.wszType, digestMethod: CryptXmlAlgorithm = this.digestMethod, digestValue: CryptIntegerBlob = this.digestValue, cTransform: UInt = this.cTransform, rgTransform: MutPtr = this.rgTransform): CryptXmlReference = CryptXmlReference(cbSize = cbSize, hReferenceCtorArg = hReference, wszIdCtorArg = wszId, wszUriCtorArg = wszUri, wszTypeCtorArg = wszType, digestMethod = digestMethod, digestValue = digestValue, cTransform = cTransform, rgTransformCtorArg = rgTransform)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptXmlReference) return false
        if (this.cbSize != other.cbSize) return false
        if (this.hReference != other.hReference) return false
        if (this.wszId != other.wszId) return false
        if (this.wszUri != other.wszUri) return false
        if (this.wszType != other.wszType) return false
        if (this.digestMethod != other.digestMethod) return false
        if (this.digestValue != other.digestValue) return false
        if (this.cTransform != other.cTransform) return false
        if (this.rgTransform != other.rgTransform) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.hReference.hashCode()
        result = 31 * result + this.wszId.hashCode()
        result = 31 * result + this.wszUri.hashCode()
        result = 31 * result + this.wszType.hashCode()
        result = 31 * result + this.digestMethod.hashCode()
        result = 31 * result + this.digestValue.hashCode()
        result = 31 * result + this.cTransform.hashCode()
        result = 31 * result + this.rgTransform.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            hReference: MutPtr = MutPtr(0L),
            wszId: Pcwstr = ConstPtr(0L),
            wszUri: Pcwstr = ConstPtr(0L),
            wszType: Pcwstr = ConstPtr(0L),
            digestMethod: CryptXmlAlgorithm = CryptXmlAlgorithm(),
            digestValue: CryptIntegerBlob = CryptIntegerBlob(),
            cTransform: UInt = 0u,
            rgTransform: MutPtr = MutPtr(0L),
        ): CryptXmlReference =
            CryptXmlReference(
                cbSize = cbSize,
                hReferenceCtorArg = hReference,
                wszIdCtorArg = wszId,
                wszUriCtorArg = wszUri,
                wszTypeCtorArg = wszType,
                digestMethod = digestMethod,
                digestValue = digestValue,
                cTransform = cTransform,
                rgTransformCtorArg = rgTransform,
            )
    }
}

public class CryptXmlReferences internal constructor(
    public var cReference: UInt,
    rgpReferenceCtorArg: MutPtr,
) {
    public var rgpReference: MutPtr = rgpReferenceCtorArg
        internal set

    public constructor() : this(
        cReference = 0u,
        rgpReferenceCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cReference

    public operator fun component2(): MutPtr = this.rgpReference

    public fun copy(cReference: UInt = this.cReference, rgpReference: MutPtr = this.rgpReference): CryptXmlReferences = CryptXmlReferences(cReference = cReference, rgpReferenceCtorArg = rgpReference)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptXmlReferences) return false
        if (this.cReference != other.cReference) return false
        if (this.rgpReference != other.rgpReference) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cReference.hashCode()
        result = 31 * result + this.rgpReference.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptXmlReferences> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptXmlReferences> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CryptXmlReferences =
                    CryptXmlReferences(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CryptXmlReferences) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cReference)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.rgpReference)
                }
            }

        public operator fun invoke(
            cReference: UInt = 0u,
            rgpReference: MutPtr = MutPtr(0L),
        ): CryptXmlReferences =
            CryptXmlReferences(
                cReference = cReference,
                rgpReferenceCtorArg = rgpReference,
            )
    }
}

public class CryptXmlSignature internal constructor(
    public var cbSize: UInt,
    hSignatureCtorArg: MutPtr,
    wszIdCtorArg: Pcwstr,
    public var signedInfo: CryptXmlSignedInfo,
    public var signatureValue: CryptIntegerBlob,
    pKeyInfoCtorArg: MutPtr,
    public var cObject: UInt,
    rgpObjectCtorArg: MutPtr,
) {
    public var hSignature: MutPtr = hSignatureCtorArg
        internal set

    public var wszId: Pcwstr = wszIdCtorArg
        internal set

    public var pKeyInfo: MutPtr = pKeyInfoCtorArg
        internal set

    public var rgpObject: MutPtr = rgpObjectCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        hSignatureCtorArg = MutPtr(0L),
        wszIdCtorArg = ConstPtr(0L),
        signedInfo = CryptXmlSignedInfo(),
        signatureValue = CryptIntegerBlob(),
        pKeyInfoCtorArg = MutPtr(0L),
        cObject = 0u,
        rgpObjectCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): MutPtr = this.hSignature

    public operator fun component3(): Pcwstr = this.wszId

    public operator fun component4(): CryptXmlSignedInfo = this.signedInfo

    public operator fun component5(): CryptIntegerBlob = this.signatureValue

    public operator fun component6(): MutPtr = this.pKeyInfo

    public operator fun component7(): UInt = this.cObject

    public operator fun component8(): MutPtr = this.rgpObject

    public fun copy(cbSize: UInt = this.cbSize, hSignature: MutPtr = this.hSignature, wszId: Pcwstr = this.wszId, signedInfo: CryptXmlSignedInfo = this.signedInfo, signatureValue: CryptIntegerBlob = this.signatureValue, pKeyInfo: MutPtr = this.pKeyInfo, cObject: UInt = this.cObject, rgpObject: MutPtr = this.rgpObject): CryptXmlSignature = CryptXmlSignature(cbSize = cbSize, hSignatureCtorArg = hSignature, wszIdCtorArg = wszId, signedInfo = signedInfo, signatureValue = signatureValue, pKeyInfoCtorArg = pKeyInfo, cObject = cObject, rgpObjectCtorArg = rgpObject)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptXmlSignature) return false
        if (this.cbSize != other.cbSize) return false
        if (this.hSignature != other.hSignature) return false
        if (this.wszId != other.wszId) return false
        if (this.signedInfo != other.signedInfo) return false
        if (this.signatureValue != other.signatureValue) return false
        if (this.pKeyInfo != other.pKeyInfo) return false
        if (this.cObject != other.cObject) return false
        if (this.rgpObject != other.rgpObject) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.hSignature.hashCode()
        result = 31 * result + this.wszId.hashCode()
        result = 31 * result + this.signedInfo.hashCode()
        result = 31 * result + this.signatureValue.hashCode()
        result = 31 * result + this.pKeyInfo.hashCode()
        result = 31 * result + this.cObject.hashCode()
        result = 31 * result + this.rgpObject.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            hSignature: MutPtr = MutPtr(0L),
            wszId: Pcwstr = ConstPtr(0L),
            signedInfo: CryptXmlSignedInfo = CryptXmlSignedInfo(),
            signatureValue: CryptIntegerBlob = CryptIntegerBlob(),
            pKeyInfo: MutPtr = MutPtr(0L),
            cObject: UInt = 0u,
            rgpObject: MutPtr = MutPtr(0L),
        ): CryptXmlSignature =
            CryptXmlSignature(
                cbSize = cbSize,
                hSignatureCtorArg = hSignature,
                wszIdCtorArg = wszId,
                signedInfo = signedInfo,
                signatureValue = signatureValue,
                pKeyInfoCtorArg = pKeyInfo,
                cObject = cObject,
                rgpObjectCtorArg = rgpObject,
            )
    }
}

public class CryptXmlSignedInfo internal constructor(
    public var cbSize: UInt,
    wszIdCtorArg: Pcwstr,
    public var canonicalization: CryptXmlAlgorithm,
    public var signatureMethod: CryptXmlAlgorithm,
    public var cReference: UInt,
    rgpReferenceCtorArg: MutPtr,
    public var encoded: CryptXmlBlob,
) {
    public var wszId: Pcwstr = wszIdCtorArg
        internal set

    public var rgpReference: MutPtr = rgpReferenceCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        wszIdCtorArg = ConstPtr(0L),
        canonicalization = CryptXmlAlgorithm(),
        signatureMethod = CryptXmlAlgorithm(),
        cReference = 0u,
        rgpReferenceCtorArg = MutPtr(0L),
        encoded = CryptXmlBlob(),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Pcwstr = this.wszId

    public operator fun component3(): CryptXmlAlgorithm = this.canonicalization

    public operator fun component4(): CryptXmlAlgorithm = this.signatureMethod

    public operator fun component5(): UInt = this.cReference

    public operator fun component6(): MutPtr = this.rgpReference

    public operator fun component7(): CryptXmlBlob = this.encoded

    public fun copy(cbSize: UInt = this.cbSize, wszId: Pcwstr = this.wszId, canonicalization: CryptXmlAlgorithm = this.canonicalization, signatureMethod: CryptXmlAlgorithm = this.signatureMethod, cReference: UInt = this.cReference, rgpReference: MutPtr = this.rgpReference, encoded: CryptXmlBlob = this.encoded): CryptXmlSignedInfo = CryptXmlSignedInfo(cbSize = cbSize, wszIdCtorArg = wszId, canonicalization = canonicalization, signatureMethod = signatureMethod, cReference = cReference, rgpReferenceCtorArg = rgpReference, encoded = encoded)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptXmlSignedInfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.wszId != other.wszId) return false
        if (this.canonicalization != other.canonicalization) return false
        if (this.signatureMethod != other.signatureMethod) return false
        if (this.cReference != other.cReference) return false
        if (this.rgpReference != other.rgpReference) return false
        if (this.encoded != other.encoded) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.wszId.hashCode()
        result = 31 * result + this.canonicalization.hashCode()
        result = 31 * result + this.signatureMethod.hashCode()
        result = 31 * result + this.cReference.hashCode()
        result = 31 * result + this.rgpReference.hashCode()
        result = 31 * result + this.encoded.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            wszId: Pcwstr = ConstPtr(0L),
            canonicalization: CryptXmlAlgorithm = CryptXmlAlgorithm(),
            signatureMethod: CryptXmlAlgorithm = CryptXmlAlgorithm(),
            cReference: UInt = 0u,
            rgpReference: MutPtr = MutPtr(0L),
            encoded: CryptXmlBlob = CryptXmlBlob(),
        ): CryptXmlSignedInfo =
            CryptXmlSignedInfo(
                cbSize = cbSize,
                wszIdCtorArg = wszId,
                canonicalization = canonicalization,
                signatureMethod = signatureMethod,
                cReference = cReference,
                rgpReferenceCtorArg = rgpReference,
                encoded = encoded,
            )
    }
}

public data class CryptXmlStatus(
    public var cbSize: UInt = 0u,
    public var dwErrorStatus: CryptXmlStatusErrorStatus = 0u,
    public var dwInfoStatus: CryptXmlStatusInfoStatus = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptXmlStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptXmlStatus> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): CryptXmlStatus =
                    CryptXmlStatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CryptXmlStatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwErrorStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwInfoStatus)
                }
            }
    }
}

public class CryptXmlTransformChainConfig internal constructor(
    public var cbSize: UInt,
    public var cTransformInfo: UInt,
    rgpTransformInfoCtorArg: MutPtr,
) {
    public var rgpTransformInfo: MutPtr = rgpTransformInfoCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        cTransformInfo = 0u,
        rgpTransformInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): UInt = this.cTransformInfo

    public operator fun component3(): MutPtr = this.rgpTransformInfo

    public fun copy(cbSize: UInt = this.cbSize, cTransformInfo: UInt = this.cTransformInfo, rgpTransformInfo: MutPtr = this.rgpTransformInfo): CryptXmlTransformChainConfig = CryptXmlTransformChainConfig(cbSize = cbSize, cTransformInfo = cTransformInfo, rgpTransformInfoCtorArg = rgpTransformInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptXmlTransformChainConfig) return false
        if (this.cbSize != other.cbSize) return false
        if (this.cTransformInfo != other.cTransformInfo) return false
        if (this.rgpTransformInfo != other.rgpTransformInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.cTransformInfo.hashCode()
        result = 31 * result + this.rgpTransformInfo.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptXmlTransformChainConfig> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptXmlTransformChainConfig> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CryptXmlTransformChainConfig =
                    CryptXmlTransformChainConfig(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CryptXmlTransformChainConfig) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cTransformInfo)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.rgpTransformInfo)
                }
            }

        public operator fun invoke(
            cbSize: UInt = 0u,
            cTransformInfo: UInt = 0u,
            rgpTransformInfo: MutPtr = MutPtr(0L),
        ): CryptXmlTransformChainConfig =
            CryptXmlTransformChainConfig(
                cbSize = cbSize,
                cTransformInfo = cTransformInfo,
                rgpTransformInfoCtorArg = rgpTransformInfo,
            )
    }
}

public class CryptXmlTransformInfo internal constructor(
    public var cbSize: UInt,
    wszAlgorithmCtorArg: Pcwstr,
    public var cbBufferSize: UInt,
    public var dwFlags: CryptXmlTransformFlags,
    public var pfnCreateTransform: PfnCryptXmlCreateTransform,
) {
    public var wszAlgorithm: Pcwstr = wszAlgorithmCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        wszAlgorithmCtorArg = ConstPtr(0L),
        cbBufferSize = 0u,
        dwFlags = 0u,
        pfnCreateTransform = null,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Pcwstr = this.wszAlgorithm

    public operator fun component3(): UInt = this.cbBufferSize

    public operator fun component4(): CryptXmlTransformFlags = this.dwFlags

    public operator fun component5(): PfnCryptXmlCreateTransform = this.pfnCreateTransform

    public fun copy(cbSize: UInt = this.cbSize, wszAlgorithm: Pcwstr = this.wszAlgorithm, cbBufferSize: UInt = this.cbBufferSize, dwFlags: CryptXmlTransformFlags = this.dwFlags, pfnCreateTransform: PfnCryptXmlCreateTransform = this.pfnCreateTransform): CryptXmlTransformInfo = CryptXmlTransformInfo(cbSize = cbSize, wszAlgorithmCtorArg = wszAlgorithm, cbBufferSize = cbBufferSize, dwFlags = dwFlags, pfnCreateTransform = pfnCreateTransform)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptXmlTransformInfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.wszAlgorithm != other.wszAlgorithm) return false
        if (this.cbBufferSize != other.cbBufferSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.pfnCreateTransform != other.pfnCreateTransform) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.wszAlgorithm.hashCode()
        result = 31 * result + this.cbBufferSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.pfnCreateTransform.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            wszAlgorithm: Pcwstr = ConstPtr(0L),
            cbBufferSize: UInt = 0u,
            dwFlags: CryptXmlTransformFlags = 0u,
            pfnCreateTransform: PfnCryptXmlCreateTransform = null,
        ): CryptXmlTransformInfo =
            CryptXmlTransformInfo(
                cbSize = cbSize,
                wszAlgorithmCtorArg = wszAlgorithm,
                cbBufferSize = cbBufferSize,
                dwFlags = dwFlags,
                pfnCreateTransform = pfnCreateTransform,
            )
    }
}

public class CryptXmlX509data internal constructor(
    public var cX509Data: UInt,
    rgX509DataCtorArg: MutPtr,
) {
    public var rgX509Data: MutPtr = rgX509DataCtorArg
        internal set

    public constructor() : this(
        cX509Data = 0u,
        rgX509DataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cX509Data

    public operator fun component2(): MutPtr = this.rgX509Data

    public fun copy(cX509Data: UInt = this.cX509Data, rgX509Data: MutPtr = this.rgX509Data): CryptXmlX509data = CryptXmlX509data(cX509Data = cX509Data, rgX509DataCtorArg = rgX509Data)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptXmlX509data) return false
        if (this.cX509Data != other.cX509Data) return false
        if (this.rgX509Data != other.rgX509Data) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cX509Data.hashCode()
        result = 31 * result + this.rgX509Data.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptXmlX509data> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptXmlX509data> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CryptXmlX509data =
                    CryptXmlX509data(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CryptXmlX509data) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cX509Data)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.rgX509Data)
                }
            }

        public operator fun invoke(
            cX509Data: UInt = 0u,
            rgX509Data: MutPtr = MutPtr(0L),
        ): CryptXmlX509data =
            CryptXmlX509data(
                cX509Data = cX509Data,
                rgX509DataCtorArg = rgX509Data,
            )
    }
}

public data class CryptXmlX509dataItem(
    public var dwType: CryptXmlX509dataType = 0u,
    public var anonymous: CryptXmlX509dataItem0 = CryptXmlX509dataItem0(),
)

public class CryptXmlX509dataItem0 internal constructor(
    public var issuerSerial: CryptXmlIssuerSerial,
    public var ski: CryptXmlDataBlob,
    wszSubjectNameCtorArg: Pcwstr,
    public var certificate: CryptXmlDataBlob,
    public var crl: CryptXmlDataBlob,
    public var custom: CryptXmlBlob,
) {
    public var wszSubjectName: Pcwstr = wszSubjectNameCtorArg
        internal set

    public constructor() : this(
        issuerSerial = CryptXmlIssuerSerial(),
        ski = CryptXmlDataBlob(),
        wszSubjectNameCtorArg = ConstPtr(0L),
        certificate = CryptXmlDataBlob(),
        crl = CryptXmlDataBlob(),
        custom = CryptXmlBlob(),
    )

    public operator fun component1(): CryptXmlIssuerSerial = this.issuerSerial

    public operator fun component2(): CryptXmlDataBlob = this.ski

    public operator fun component3(): Pcwstr = this.wszSubjectName

    public operator fun component4(): CryptXmlDataBlob = this.certificate

    public operator fun component5(): CryptXmlDataBlob = this.crl

    public operator fun component6(): CryptXmlBlob = this.custom

    public fun copy(issuerSerial: CryptXmlIssuerSerial = this.issuerSerial, ski: CryptXmlDataBlob = this.ski, wszSubjectName: Pcwstr = this.wszSubjectName, certificate: CryptXmlDataBlob = this.certificate, crl: CryptXmlDataBlob = this.crl, custom: CryptXmlBlob = this.custom): CryptXmlX509dataItem0 = CryptXmlX509dataItem0(issuerSerial = issuerSerial, ski = ski, wszSubjectNameCtorArg = wszSubjectName, certificate = certificate, crl = crl, custom = custom)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptXmlX509dataItem0) return false
        if (this.issuerSerial != other.issuerSerial) return false
        if (this.ski != other.ski) return false
        if (this.wszSubjectName != other.wszSubjectName) return false
        if (this.certificate != other.certificate) return false
        if (this.crl != other.crl) return false
        if (this.custom != other.custom) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.issuerSerial.hashCode()
        result = 31 * result + this.ski.hashCode()
        result = 31 * result + this.wszSubjectName.hashCode()
        result = 31 * result + this.certificate.hashCode()
        result = 31 * result + this.crl.hashCode()
        result = 31 * result + this.custom.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            issuerSerial: CryptXmlIssuerSerial = CryptXmlIssuerSerial(),
            ski: CryptXmlDataBlob = CryptXmlDataBlob(),
            wszSubjectName: Pcwstr = ConstPtr(0L),
            certificate: CryptXmlDataBlob = CryptXmlDataBlob(),
            crl: CryptXmlDataBlob = CryptXmlDataBlob(),
            custom: CryptXmlBlob = CryptXmlBlob(),
        ): CryptXmlX509dataItem0 =
            CryptXmlX509dataItem0(
                issuerSerial = issuerSerial,
                ski = ski,
                wszSubjectNameCtorArg = wszSubjectName,
                certificate = certificate,
                crl = crl,
                custom = custom,
            )
    }
}

public data class CtlAnySubjectInfo(
    public var subjectAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var subjectIdentifier: CryptIntegerBlob = CryptIntegerBlob(),
)

public class CtlContext internal constructor(
    public var dwMsgAndCertEncodingType: UInt,
    pbCtlEncodedCtorArg: MutPtr,
    public var cbCtlEncoded: UInt,
    pCtlInfoCtorArg: MutPtr,
    hCertStoreCtorArg: Hcertstore,
    hCryptMsgCtorArg: MutPtr,
    pbCtlContentCtorArg: MutPtr,
    public var cbCtlContent: UInt,
) {
    public var pbCtlEncoded: MutPtr = pbCtlEncodedCtorArg
        internal set

    public var pCtlInfo: MutPtr = pCtlInfoCtorArg
        internal set

    public var hCertStore: Hcertstore = hCertStoreCtorArg
        internal set

    public var hCryptMsg: MutPtr = hCryptMsgCtorArg
        internal set

    public var pbCtlContent: MutPtr = pbCtlContentCtorArg
        internal set

    public constructor() : this(
        dwMsgAndCertEncodingType = 0u,
        pbCtlEncodedCtorArg = MutPtr(0L),
        cbCtlEncoded = 0u,
        pCtlInfoCtorArg = MutPtr(0L),
        hCertStoreCtorArg = MutPtr(0L),
        hCryptMsgCtorArg = MutPtr(0L),
        pbCtlContentCtorArg = MutPtr(0L),
        cbCtlContent = 0u,
    )

    public operator fun component1(): UInt = this.dwMsgAndCertEncodingType

    public operator fun component2(): MutPtr = this.pbCtlEncoded

    public operator fun component3(): UInt = this.cbCtlEncoded

    public operator fun component4(): MutPtr = this.pCtlInfo

    public operator fun component5(): Hcertstore = this.hCertStore

    public operator fun component6(): MutPtr = this.hCryptMsg

    public operator fun component7(): MutPtr = this.pbCtlContent

    public operator fun component8(): UInt = this.cbCtlContent

    public fun copy(dwMsgAndCertEncodingType: UInt = this.dwMsgAndCertEncodingType, pbCtlEncoded: MutPtr = this.pbCtlEncoded, cbCtlEncoded: UInt = this.cbCtlEncoded, pCtlInfo: MutPtr = this.pCtlInfo, hCertStore: Hcertstore = this.hCertStore, hCryptMsg: MutPtr = this.hCryptMsg, pbCtlContent: MutPtr = this.pbCtlContent, cbCtlContent: UInt = this.cbCtlContent): CtlContext = CtlContext(dwMsgAndCertEncodingType = dwMsgAndCertEncodingType, pbCtlEncodedCtorArg = pbCtlEncoded, cbCtlEncoded = cbCtlEncoded, pCtlInfoCtorArg = pCtlInfo, hCertStoreCtorArg = hCertStore, hCryptMsgCtorArg = hCryptMsg, pbCtlContentCtorArg = pbCtlContent, cbCtlContent = cbCtlContent)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CtlContext) return false
        if (this.dwMsgAndCertEncodingType != other.dwMsgAndCertEncodingType) return false
        if (this.pbCtlEncoded != other.pbCtlEncoded) return false
        if (this.cbCtlEncoded != other.cbCtlEncoded) return false
        if (this.pCtlInfo != other.pCtlInfo) return false
        if (this.hCertStore != other.hCertStore) return false
        if (this.hCryptMsg != other.hCryptMsg) return false
        if (this.pbCtlContent != other.pbCtlContent) return false
        if (this.cbCtlContent != other.cbCtlContent) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwMsgAndCertEncodingType.hashCode()
        result = 31 * result + this.pbCtlEncoded.hashCode()
        result = 31 * result + this.cbCtlEncoded.hashCode()
        result = 31 * result + this.pCtlInfo.hashCode()
        result = 31 * result + this.hCertStore.hashCode()
        result = 31 * result + this.hCryptMsg.hashCode()
        result = 31 * result + this.pbCtlContent.hashCode()
        result = 31 * result + this.cbCtlContent.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CtlContext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CtlContext> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): CtlContext =
                    CtlContext(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: CtlContext) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwMsgAndCertEncodingType)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pbCtlEncoded)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cbCtlEncoded)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.pCtlInfo)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 32L, value.hCertStore)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 40L, value.hCryptMsg)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 48L, value.pbCtlContent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.cbCtlContent)
                }
            }

        public operator fun invoke(
            dwMsgAndCertEncodingType: UInt = 0u,
            pbCtlEncoded: MutPtr = MutPtr(0L),
            cbCtlEncoded: UInt = 0u,
            pCtlInfo: MutPtr = MutPtr(0L),
            hCertStore: Hcertstore = MutPtr(0L),
            hCryptMsg: MutPtr = MutPtr(0L),
            pbCtlContent: MutPtr = MutPtr(0L),
            cbCtlContent: UInt = 0u,
        ): CtlContext =
            CtlContext(
                dwMsgAndCertEncodingType = dwMsgAndCertEncodingType,
                pbCtlEncodedCtorArg = pbCtlEncoded,
                cbCtlEncoded = cbCtlEncoded,
                pCtlInfoCtorArg = pCtlInfo,
                hCertStoreCtorArg = hCertStore,
                hCryptMsgCtorArg = hCryptMsg,
                pbCtlContentCtorArg = pbCtlContent,
                cbCtlContent = cbCtlContent,
            )
    }
}

public class CtlEntry internal constructor(
    public var subjectIdentifier: CryptIntegerBlob,
    public var cAttribute: UInt,
    rgAttributeCtorArg: MutPtr,
) {
    public var rgAttribute: MutPtr = rgAttributeCtorArg
        internal set

    public constructor() : this(
        subjectIdentifier = CryptIntegerBlob(),
        cAttribute = 0u,
        rgAttributeCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CryptIntegerBlob = this.subjectIdentifier

    public operator fun component2(): UInt = this.cAttribute

    public operator fun component3(): MutPtr = this.rgAttribute

    public fun copy(subjectIdentifier: CryptIntegerBlob = this.subjectIdentifier, cAttribute: UInt = this.cAttribute, rgAttribute: MutPtr = this.rgAttribute): CtlEntry = CtlEntry(subjectIdentifier = subjectIdentifier, cAttribute = cAttribute, rgAttributeCtorArg = rgAttribute)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CtlEntry) return false
        if (this.subjectIdentifier != other.subjectIdentifier) return false
        if (this.cAttribute != other.cAttribute) return false
        if (this.rgAttribute != other.rgAttribute) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.subjectIdentifier.hashCode()
        result = 31 * result + this.cAttribute.hashCode()
        result = 31 * result + this.rgAttribute.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CtlEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CtlEntry> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): CtlEntry =
                    CtlEntry(
                        (CryptIntegerBlob.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: CtlEntry) {
                    (CryptIntegerBlob.typeLayout()).writeNative(addr, value.subjectIdentifier)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cAttribute)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.rgAttribute)
                }
            }

        public operator fun invoke(
            subjectIdentifier: CryptIntegerBlob = CryptIntegerBlob(),
            cAttribute: UInt = 0u,
            rgAttribute: MutPtr = MutPtr(0L),
        ): CtlEntry =
            CtlEntry(
                subjectIdentifier = subjectIdentifier,
                cAttribute = cAttribute,
                rgAttributeCtorArg = rgAttribute,
            )
    }
}

public class CtlFindSubjectPara internal constructor(
    public var cbSize: UInt,
    pUsageParaCtorArg: MutPtr,
    public var dwSubjectType: UInt,
    pvSubjectCtorArg: MutPtr,
) {
    public var pUsagePara: MutPtr = pUsageParaCtorArg
        internal set

    public var pvSubject: MutPtr = pvSubjectCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        pUsageParaCtorArg = MutPtr(0L),
        dwSubjectType = 0u,
        pvSubjectCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): MutPtr = this.pUsagePara

    public operator fun component3(): UInt = this.dwSubjectType

    public operator fun component4(): MutPtr = this.pvSubject

    public fun copy(cbSize: UInt = this.cbSize, pUsagePara: MutPtr = this.pUsagePara, dwSubjectType: UInt = this.dwSubjectType, pvSubject: MutPtr = this.pvSubject): CtlFindSubjectPara = CtlFindSubjectPara(cbSize = cbSize, pUsageParaCtorArg = pUsagePara, dwSubjectType = dwSubjectType, pvSubjectCtorArg = pvSubject)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CtlFindSubjectPara) return false
        if (this.cbSize != other.cbSize) return false
        if (this.pUsagePara != other.pUsagePara) return false
        if (this.dwSubjectType != other.dwSubjectType) return false
        if (this.pvSubject != other.pvSubject) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.pUsagePara.hashCode()
        result = 31 * result + this.dwSubjectType.hashCode()
        result = 31 * result + this.pvSubject.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CtlFindSubjectPara> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CtlFindSubjectPara> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): CtlFindSubjectPara =
                    CtlFindSubjectPara(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: CtlFindSubjectPara) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pUsagePara)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwSubjectType)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.pvSubject)
                }
            }

        public operator fun invoke(
            cbSize: UInt = 0u,
            pUsagePara: MutPtr = MutPtr(0L),
            dwSubjectType: UInt = 0u,
            pvSubject: MutPtr = MutPtr(0L),
        ): CtlFindSubjectPara =
            CtlFindSubjectPara(
                cbSize = cbSize,
                pUsageParaCtorArg = pUsagePara,
                dwSubjectType = dwSubjectType,
                pvSubjectCtorArg = pvSubject,
            )
    }
}

public class CtlFindUsagePara internal constructor(
    public var cbSize: UInt,
    public var subjectUsage: CtlUsage,
    public var listIdentifier: CryptIntegerBlob,
    pSignerCtorArg: MutPtr,
) {
    public var pSigner: MutPtr = pSignerCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        subjectUsage = CtlUsage(),
        listIdentifier = CryptIntegerBlob(),
        pSignerCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): CtlUsage = this.subjectUsage

    public operator fun component3(): CryptIntegerBlob = this.listIdentifier

    public operator fun component4(): MutPtr = this.pSigner

    public fun copy(cbSize: UInt = this.cbSize, subjectUsage: CtlUsage = this.subjectUsage, listIdentifier: CryptIntegerBlob = this.listIdentifier, pSigner: MutPtr = this.pSigner): CtlFindUsagePara = CtlFindUsagePara(cbSize = cbSize, subjectUsage = subjectUsage, listIdentifier = listIdentifier, pSignerCtorArg = pSigner)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CtlFindUsagePara) return false
        if (this.cbSize != other.cbSize) return false
        if (this.subjectUsage != other.subjectUsage) return false
        if (this.listIdentifier != other.listIdentifier) return false
        if (this.pSigner != other.pSigner) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.subjectUsage.hashCode()
        result = 31 * result + this.listIdentifier.hashCode()
        result = 31 * result + this.pSigner.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CtlFindUsagePara> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CtlFindUsagePara> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): CtlFindUsagePara =
                    CtlFindUsagePara(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (CtlUsage.typeLayout()).readNative(addr + 8L),
                        (CryptIntegerBlob.typeLayout()).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: CtlFindUsagePara) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (CtlUsage.typeLayout()).writeNative(addr + 8L, value.subjectUsage)
                    (CryptIntegerBlob.typeLayout()).writeNative(addr + 24L, value.listIdentifier)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 40L, value.pSigner)
                }
            }

        public operator fun invoke(
            cbSize: UInt = 0u,
            subjectUsage: CtlUsage = CtlUsage(),
            listIdentifier: CryptIntegerBlob = CryptIntegerBlob(),
            pSigner: MutPtr = MutPtr(0L),
        ): CtlFindUsagePara =
            CtlFindUsagePara(
                cbSize = cbSize,
                subjectUsage = subjectUsage,
                listIdentifier = listIdentifier,
                pSignerCtorArg = pSigner,
            )
    }
}

public class CtlInfo internal constructor(
    public var dwVersion: UInt,
    public var subjectUsage: CtlUsage,
    public var listIdentifier: CryptIntegerBlob,
    public var sequenceNumber: CryptIntegerBlob,
    public var thisUpdate: Filetime,
    public var nextUpdate: Filetime,
    public var subjectAlgorithm: CryptAlgorithmIdentifier,
    public var cCTLEntry: UInt,
    rgCTLEntryCtorArg: MutPtr,
    public var cExtension: UInt,
    rgExtensionCtorArg: MutPtr,
) {
    public var rgCTLEntry: MutPtr = rgCTLEntryCtorArg
        internal set

    public var rgExtension: MutPtr = rgExtensionCtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        subjectUsage = CtlUsage(),
        listIdentifier = CryptIntegerBlob(),
        sequenceNumber = CryptIntegerBlob(),
        thisUpdate = Filetime(),
        nextUpdate = Filetime(),
        subjectAlgorithm = CryptAlgorithmIdentifier(),
        cCTLEntry = 0u,
        rgCTLEntryCtorArg = MutPtr(0L),
        cExtension = 0u,
        rgExtensionCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwVersion

    public operator fun component2(): CtlUsage = this.subjectUsage

    public operator fun component3(): CryptIntegerBlob = this.listIdentifier

    public operator fun component4(): CryptIntegerBlob = this.sequenceNumber

    public operator fun component5(): Filetime = this.thisUpdate

    public operator fun component6(): Filetime = this.nextUpdate

    public operator fun component7(): CryptAlgorithmIdentifier = this.subjectAlgorithm

    public operator fun component8(): UInt = this.cCTLEntry

    public operator fun component9(): MutPtr = this.rgCTLEntry

    public operator fun component10(): UInt = this.cExtension

    public operator fun component11(): MutPtr = this.rgExtension

    public fun copy(dwVersion: UInt = this.dwVersion, subjectUsage: CtlUsage = this.subjectUsage, listIdentifier: CryptIntegerBlob = this.listIdentifier, sequenceNumber: CryptIntegerBlob = this.sequenceNumber, thisUpdate: Filetime = this.thisUpdate, nextUpdate: Filetime = this.nextUpdate, subjectAlgorithm: CryptAlgorithmIdentifier = this.subjectAlgorithm, cCTLEntry: UInt = this.cCTLEntry, rgCTLEntry: MutPtr = this.rgCTLEntry, cExtension: UInt = this.cExtension, rgExtension: MutPtr = this.rgExtension): CtlInfo = CtlInfo(dwVersion = dwVersion, subjectUsage = subjectUsage, listIdentifier = listIdentifier, sequenceNumber = sequenceNumber, thisUpdate = thisUpdate, nextUpdate = nextUpdate, subjectAlgorithm = subjectAlgorithm, cCTLEntry = cCTLEntry, rgCTLEntryCtorArg = rgCTLEntry, cExtension = cExtension, rgExtensionCtorArg = rgExtension)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CtlInfo) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.subjectUsage != other.subjectUsage) return false
        if (this.listIdentifier != other.listIdentifier) return false
        if (this.sequenceNumber != other.sequenceNumber) return false
        if (this.thisUpdate != other.thisUpdate) return false
        if (this.nextUpdate != other.nextUpdate) return false
        if (this.subjectAlgorithm != other.subjectAlgorithm) return false
        if (this.cCTLEntry != other.cCTLEntry) return false
        if (this.rgCTLEntry != other.rgCTLEntry) return false
        if (this.cExtension != other.cExtension) return false
        if (this.rgExtension != other.rgExtension) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.subjectUsage.hashCode()
        result = 31 * result + this.listIdentifier.hashCode()
        result = 31 * result + this.sequenceNumber.hashCode()
        result = 31 * result + this.thisUpdate.hashCode()
        result = 31 * result + this.nextUpdate.hashCode()
        result = 31 * result + this.subjectAlgorithm.hashCode()
        result = 31 * result + this.cCTLEntry.hashCode()
        result = 31 * result + this.rgCTLEntry.hashCode()
        result = 31 * result + this.cExtension.hashCode()
        result = 31 * result + this.rgExtension.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwVersion: UInt = 0u,
            subjectUsage: CtlUsage = CtlUsage(),
            listIdentifier: CryptIntegerBlob = CryptIntegerBlob(),
            sequenceNumber: CryptIntegerBlob = CryptIntegerBlob(),
            thisUpdate: Filetime = Filetime(),
            nextUpdate: Filetime = Filetime(),
            subjectAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
            cCTLEntry: UInt = 0u,
            rgCTLEntry: MutPtr = MutPtr(0L),
            cExtension: UInt = 0u,
            rgExtension: MutPtr = MutPtr(0L),
        ): CtlInfo =
            CtlInfo(
                dwVersion = dwVersion,
                subjectUsage = subjectUsage,
                listIdentifier = listIdentifier,
                sequenceNumber = sequenceNumber,
                thisUpdate = thisUpdate,
                nextUpdate = nextUpdate,
                subjectAlgorithm = subjectAlgorithm,
                cCTLEntry = cCTLEntry,
                rgCTLEntryCtorArg = rgCTLEntry,
                cExtension = cExtension,
                rgExtensionCtorArg = rgExtension,
            )
    }
}

public class CtlUsage internal constructor(
    public var cUsageIdentifier: UInt,
    rgpszUsageIdentifierCtorArg: MutPtr,
) {
    public var rgpszUsageIdentifier: MutPtr = rgpszUsageIdentifierCtorArg
        internal set

    public constructor() : this(
        cUsageIdentifier = 0u,
        rgpszUsageIdentifierCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cUsageIdentifier

    public operator fun component2(): MutPtr = this.rgpszUsageIdentifier

    public fun copy(cUsageIdentifier: UInt = this.cUsageIdentifier, rgpszUsageIdentifier: MutPtr = this.rgpszUsageIdentifier): CtlUsage = CtlUsage(cUsageIdentifier = cUsageIdentifier, rgpszUsageIdentifierCtorArg = rgpszUsageIdentifier)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CtlUsage) return false
        if (this.cUsageIdentifier != other.cUsageIdentifier) return false
        if (this.rgpszUsageIdentifier != other.rgpszUsageIdentifier) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cUsageIdentifier.hashCode()
        result = 31 * result + this.rgpszUsageIdentifier.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CtlUsage> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CtlUsage> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CtlUsage =
                    CtlUsage(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CtlUsage) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cUsageIdentifier)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.rgpszUsageIdentifier)
                }
            }

        public operator fun invoke(
            cUsageIdentifier: UInt = 0u,
            rgpszUsageIdentifier: MutPtr = MutPtr(0L),
        ): CtlUsage =
            CtlUsage(
                cUsageIdentifier = cUsageIdentifier,
                rgpszUsageIdentifierCtorArg = rgpszUsageIdentifier,
            )
    }
}

public data class CtlUsageMatch(
    public var dwType: UInt = 0u,
    public var usage: CtlUsage = CtlUsage(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CtlUsageMatch> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CtlUsageMatch> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): CtlUsageMatch =
                    CtlUsageMatch(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (CtlUsage.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CtlUsageMatch) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwType)
                    (CtlUsage.typeLayout()).writeNative(addr + 8L, value.usage)
                }
            }
    }
}

public class CtlVerifyUsagePara internal constructor(
    public var cbSize: UInt,
    public var listIdentifier: CryptIntegerBlob,
    public var cCtlStore: UInt,
    rghCtlStoreCtorArg: MutPtr,
    public var cSignerStore: UInt,
    rghSignerStoreCtorArg: MutPtr,
) {
    public var rghCtlStore: MutPtr = rghCtlStoreCtorArg
        internal set

    public var rghSignerStore: MutPtr = rghSignerStoreCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        listIdentifier = CryptIntegerBlob(),
        cCtlStore = 0u,
        rghCtlStoreCtorArg = MutPtr(0L),
        cSignerStore = 0u,
        rghSignerStoreCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): CryptIntegerBlob = this.listIdentifier

    public operator fun component3(): UInt = this.cCtlStore

    public operator fun component4(): MutPtr = this.rghCtlStore

    public operator fun component5(): UInt = this.cSignerStore

    public operator fun component6(): MutPtr = this.rghSignerStore

    public fun copy(cbSize: UInt = this.cbSize, listIdentifier: CryptIntegerBlob = this.listIdentifier, cCtlStore: UInt = this.cCtlStore, rghCtlStore: MutPtr = this.rghCtlStore, cSignerStore: UInt = this.cSignerStore, rghSignerStore: MutPtr = this.rghSignerStore): CtlVerifyUsagePara = CtlVerifyUsagePara(cbSize = cbSize, listIdentifier = listIdentifier, cCtlStore = cCtlStore, rghCtlStoreCtorArg = rghCtlStore, cSignerStore = cSignerStore, rghSignerStoreCtorArg = rghSignerStore)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CtlVerifyUsagePara) return false
        if (this.cbSize != other.cbSize) return false
        if (this.listIdentifier != other.listIdentifier) return false
        if (this.cCtlStore != other.cCtlStore) return false
        if (this.rghCtlStore != other.rghCtlStore) return false
        if (this.cSignerStore != other.cSignerStore) return false
        if (this.rghSignerStore != other.rghSignerStore) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.listIdentifier.hashCode()
        result = 31 * result + this.cCtlStore.hashCode()
        result = 31 * result + this.rghCtlStore.hashCode()
        result = 31 * result + this.cSignerStore.hashCode()
        result = 31 * result + this.rghSignerStore.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CtlVerifyUsagePara> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CtlVerifyUsagePara> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): CtlVerifyUsagePara =
                    CtlVerifyUsagePara(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (CryptIntegerBlob.typeLayout()).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: CtlVerifyUsagePara) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (CryptIntegerBlob.typeLayout()).writeNative(addr + 8L, value.listIdentifier)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.cCtlStore)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 32L, value.rghCtlStore)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.cSignerStore)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 48L, value.rghSignerStore)
                }
            }

        public operator fun invoke(
            cbSize: UInt = 0u,
            listIdentifier: CryptIntegerBlob = CryptIntegerBlob(),
            cCtlStore: UInt = 0u,
            rghCtlStore: MutPtr = MutPtr(0L),
            cSignerStore: UInt = 0u,
            rghSignerStore: MutPtr = MutPtr(0L),
        ): CtlVerifyUsagePara =
            CtlVerifyUsagePara(
                cbSize = cbSize,
                listIdentifier = listIdentifier,
                cCtlStore = cCtlStore,
                rghCtlStoreCtorArg = rghCtlStore,
                cSignerStore = cSignerStore,
                rghSignerStoreCtorArg = rghSignerStore,
            )
    }
}

public class CtlVerifyUsageStatus internal constructor(
    public var cbSize: UInt,
    public var dwError: UInt,
    public var dwFlags: UInt,
    ppCtlCtorArg: MutPtr,
    public var dwCtlEntryIndex: UInt,
    ppSignerCtorArg: MutPtr,
    public var dwSignerIndex: UInt,
) {
    public var ppCtl: MutPtr = ppCtlCtorArg
        internal set

    public var ppSigner: MutPtr = ppSignerCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        dwError = 0u,
        dwFlags = 0u,
        ppCtlCtorArg = MutPtr(0L),
        dwCtlEntryIndex = 0u,
        ppSignerCtorArg = MutPtr(0L),
        dwSignerIndex = 0u,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): UInt = this.dwError

    public operator fun component3(): UInt = this.dwFlags

    public operator fun component4(): MutPtr = this.ppCtl

    public operator fun component5(): UInt = this.dwCtlEntryIndex

    public operator fun component6(): MutPtr = this.ppSigner

    public operator fun component7(): UInt = this.dwSignerIndex

    public fun copy(cbSize: UInt = this.cbSize, dwError: UInt = this.dwError, dwFlags: UInt = this.dwFlags, ppCtl: MutPtr = this.ppCtl, dwCtlEntryIndex: UInt = this.dwCtlEntryIndex, ppSigner: MutPtr = this.ppSigner, dwSignerIndex: UInt = this.dwSignerIndex): CtlVerifyUsageStatus = CtlVerifyUsageStatus(cbSize = cbSize, dwError = dwError, dwFlags = dwFlags, ppCtlCtorArg = ppCtl, dwCtlEntryIndex = dwCtlEntryIndex, ppSignerCtorArg = ppSigner, dwSignerIndex = dwSignerIndex)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CtlVerifyUsageStatus) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwError != other.dwError) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.ppCtl != other.ppCtl) return false
        if (this.dwCtlEntryIndex != other.dwCtlEntryIndex) return false
        if (this.ppSigner != other.ppSigner) return false
        if (this.dwSignerIndex != other.dwSignerIndex) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwError.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.ppCtl.hashCode()
        result = 31 * result + this.dwCtlEntryIndex.hashCode()
        result = 31 * result + this.ppSigner.hashCode()
        result = 31 * result + this.dwSignerIndex.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CtlVerifyUsageStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CtlVerifyUsageStatus> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): CtlVerifyUsageStatus =
                    CtlVerifyUsageStatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: CtlVerifyUsageStatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwError)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.ppCtl)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwCtlEntryIndex)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 32L, value.ppSigner)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.dwSignerIndex)
                }
            }

        public operator fun invoke(
            cbSize: UInt = 0u,
            dwError: UInt = 0u,
            dwFlags: UInt = 0u,
            ppCtl: MutPtr = MutPtr(0L),
            dwCtlEntryIndex: UInt = 0u,
            ppSigner: MutPtr = MutPtr(0L),
            dwSignerIndex: UInt = 0u,
        ): CtlVerifyUsageStatus =
            CtlVerifyUsageStatus(
                cbSize = cbSize,
                dwError = dwError,
                dwFlags = dwFlags,
                ppCtlCtorArg = ppCtl,
                dwCtlEntryIndex = dwCtlEntryIndex,
                ppSignerCtorArg = ppSigner,
                dwSignerIndex = dwSignerIndex,
            )
    }
}

public data class Dssseed(
    public var counter: UInt = 0u,
    public var seed: UByteArray = UByteArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dssseed) return false
        if (this.counter != other.counter) return false
        if (!this.seed.contentEquals(other.seed)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.counter.hashCode()
        result = 31 * result + this.seed.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dssseed> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dssseed> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Dssseed =
                    Dssseed(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Dssseed) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.counter)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                    ).writeNative(addr + 4L, value.seed.toList())
                }
            }
    }
}

public class Endpointaddress internal constructor(
    serviceUrlCtorArg: Pcwstr,
    policyUrlCtorArg: Pcwstr,
    public var rawCertificate: CryptIntegerBlob,
) {
    public var serviceUrl: Pcwstr = serviceUrlCtorArg
        internal set

    public var policyUrl: Pcwstr = policyUrlCtorArg
        internal set

    public constructor() : this(
        serviceUrlCtorArg = ConstPtr(0L),
        policyUrlCtorArg = ConstPtr(0L),
        rawCertificate = CryptIntegerBlob(),
    )

    public operator fun component1(): Pcwstr = this.serviceUrl

    public operator fun component2(): Pcwstr = this.policyUrl

    public operator fun component3(): CryptIntegerBlob = this.rawCertificate

    public fun copy(serviceUrl: Pcwstr = this.serviceUrl, policyUrl: Pcwstr = this.policyUrl, rawCertificate: CryptIntegerBlob = this.rawCertificate): Endpointaddress = Endpointaddress(serviceUrlCtorArg = serviceUrl, policyUrlCtorArg = policyUrl, rawCertificate = rawCertificate)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Endpointaddress) return false
        if (this.serviceUrl != other.serviceUrl) return false
        if (this.policyUrl != other.policyUrl) return false
        if (this.rawCertificate != other.rawCertificate) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.serviceUrl.hashCode()
        result = 31 * result + this.policyUrl.hashCode()
        result = 31 * result + this.rawCertificate.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            serviceUrl: Pcwstr = ConstPtr(0L),
            policyUrl: Pcwstr = ConstPtr(0L),
            rawCertificate: CryptIntegerBlob = CryptIntegerBlob(),
        ): Endpointaddress =
            Endpointaddress(
                serviceUrlCtorArg = serviceUrl,
                policyUrlCtorArg = policyUrl,
                rawCertificate = rawCertificate,
            )
    }
}

public class Endpointaddress2 internal constructor(
    serviceUrlCtorArg: Pcwstr,
    policyUrlCtorArg: Pcwstr,
    public var identityType: UInt,
    identityBytesCtorArg: MutPtr,
) {
    public var serviceUrl: Pcwstr = serviceUrlCtorArg
        internal set

    public var policyUrl: Pcwstr = policyUrlCtorArg
        internal set

    public var identityBytes: MutPtr = identityBytesCtorArg
        internal set

    public constructor() : this(
        serviceUrlCtorArg = ConstPtr(0L),
        policyUrlCtorArg = ConstPtr(0L),
        identityType = 0u,
        identityBytesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pcwstr = this.serviceUrl

    public operator fun component2(): Pcwstr = this.policyUrl

    public operator fun component3(): UInt = this.identityType

    public operator fun component4(): MutPtr = this.identityBytes

    public fun copy(serviceUrl: Pcwstr = this.serviceUrl, policyUrl: Pcwstr = this.policyUrl, identityType: UInt = this.identityType, identityBytes: MutPtr = this.identityBytes): Endpointaddress2 = Endpointaddress2(serviceUrlCtorArg = serviceUrl, policyUrlCtorArg = policyUrl, identityType = identityType, identityBytesCtorArg = identityBytes)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Endpointaddress2) return false
        if (this.serviceUrl != other.serviceUrl) return false
        if (this.policyUrl != other.policyUrl) return false
        if (this.identityType != other.identityType) return false
        if (this.identityBytes != other.identityBytes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.serviceUrl.hashCode()
        result = 31 * result + this.policyUrl.hashCode()
        result = 31 * result + this.identityType.hashCode()
        result = 31 * result + this.identityBytes.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            serviceUrl: Pcwstr = ConstPtr(0L),
            policyUrl: Pcwstr = ConstPtr(0L),
            identityType: UInt = 0u,
            identityBytes: MutPtr = MutPtr(0L),
        ): Endpointaddress2 =
            Endpointaddress2(
                serviceUrlCtorArg = serviceUrl,
                policyUrlCtorArg = policyUrl,
                identityType = identityType,
                identityBytesCtorArg = identityBytes,
            )
    }
}

public data class EvExtraCertChainPolicyPara(
    public var cbSize: UInt = 0u,
    public var dwRootProgramQualifierFlags: CertRootProgramFlags = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EvExtraCertChainPolicyPara> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EvExtraCertChainPolicyPara> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): EvExtraCertChainPolicyPara =
                    EvExtraCertChainPolicyPara(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: EvExtraCertChainPolicyPara) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwRootProgramQualifierFlags)
                }
            }
    }
}

public data class EvExtraCertChainPolicyStatus(
    public var cbSize: UInt = 0u,
    public var dwQualifiers: UInt = 0u,
    public var dwIssuanceUsageIndex: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EvExtraCertChainPolicyStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EvExtraCertChainPolicyStatus> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): EvExtraCertChainPolicyStatus =
                    EvExtraCertChainPolicyStatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: EvExtraCertChainPolicyStatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwQualifiers)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwIssuanceUsageIndex)
                }
            }
    }
}

public class GenericXmlToken internal constructor(
    public var createDate: Filetime,
    public var expiryDate: Filetime,
    xmlTokenCtorArg: Pwstr,
    internalTokenReferenceCtorArg: Pwstr,
    externalTokenReferenceCtorArg: Pwstr,
) {
    public var xmlToken: Pwstr = xmlTokenCtorArg
        internal set

    public var internalTokenReference: Pwstr = internalTokenReferenceCtorArg
        internal set

    public var externalTokenReference: Pwstr = externalTokenReferenceCtorArg
        internal set

    public constructor() : this(
        createDate = Filetime(),
        expiryDate = Filetime(),
        xmlTokenCtorArg = MutPtr(0L),
        internalTokenReferenceCtorArg = MutPtr(0L),
        externalTokenReferenceCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Filetime = this.createDate

    public operator fun component2(): Filetime = this.expiryDate

    public operator fun component3(): Pwstr = this.xmlToken

    public operator fun component4(): Pwstr = this.internalTokenReference

    public operator fun component5(): Pwstr = this.externalTokenReference

    public fun copy(createDate: Filetime = this.createDate, expiryDate: Filetime = this.expiryDate, xmlToken: Pwstr = this.xmlToken, internalTokenReference: Pwstr = this.internalTokenReference, externalTokenReference: Pwstr = this.externalTokenReference): GenericXmlToken = GenericXmlToken(createDate = createDate, expiryDate = expiryDate, xmlTokenCtorArg = xmlToken, internalTokenReferenceCtorArg = internalTokenReference, externalTokenReferenceCtorArg = externalTokenReference)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GenericXmlToken) return false
        if (this.createDate != other.createDate) return false
        if (this.expiryDate != other.expiryDate) return false
        if (this.xmlToken != other.xmlToken) return false
        if (this.internalTokenReference != other.internalTokenReference) return false
        if (this.externalTokenReference != other.externalTokenReference) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.createDate.hashCode()
        result = 31 * result + this.expiryDate.hashCode()
        result = 31 * result + this.xmlToken.hashCode()
        result = 31 * result + this.internalTokenReference.hashCode()
        result = 31 * result + this.externalTokenReference.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            createDate: Filetime = Filetime(),
            expiryDate: Filetime = Filetime(),
            xmlToken: Pwstr = MutPtr(0L),
            internalTokenReference: Pwstr = MutPtr(0L),
            externalTokenReference: Pwstr = MutPtr(0L),
        ): GenericXmlToken =
            GenericXmlToken(
                createDate = createDate,
                expiryDate = expiryDate,
                xmlTokenCtorArg = xmlToken,
                internalTokenReferenceCtorArg = internalTokenReference,
                externalTokenReferenceCtorArg = externalTokenReference,
            )
    }
}

public class HmacInfo internal constructor(
    public var hashAlgid: AlgId,
    pbInnerStringCtorArg: MutPtr,
    public var cbInnerString: UInt,
    pbOuterStringCtorArg: MutPtr,
    public var cbOuterString: UInt,
) {
    public var pbInnerString: MutPtr = pbInnerStringCtorArg
        internal set

    public var pbOuterString: MutPtr = pbOuterStringCtorArg
        internal set

    public constructor() : this(
        hashAlgid = 0u,
        pbInnerStringCtorArg = MutPtr(0L),
        cbInnerString = 0u,
        pbOuterStringCtorArg = MutPtr(0L),
        cbOuterString = 0u,
    )

    public operator fun component1(): AlgId = this.hashAlgid

    public operator fun component2(): MutPtr = this.pbInnerString

    public operator fun component3(): UInt = this.cbInnerString

    public operator fun component4(): MutPtr = this.pbOuterString

    public operator fun component5(): UInt = this.cbOuterString

    public fun copy(hashAlgid: AlgId = this.hashAlgid, pbInnerString: MutPtr = this.pbInnerString, cbInnerString: UInt = this.cbInnerString, pbOuterString: MutPtr = this.pbOuterString, cbOuterString: UInt = this.cbOuterString): HmacInfo = HmacInfo(hashAlgid = hashAlgid, pbInnerStringCtorArg = pbInnerString, cbInnerString = cbInnerString, pbOuterStringCtorArg = pbOuterString, cbOuterString = cbOuterString)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HmacInfo) return false
        if (this.hashAlgid != other.hashAlgid) return false
        if (this.pbInnerString != other.pbInnerString) return false
        if (this.cbInnerString != other.cbInnerString) return false
        if (this.pbOuterString != other.pbOuterString) return false
        if (this.cbOuterString != other.cbOuterString) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hashAlgid.hashCode()
        result = 31 * result + this.pbInnerString.hashCode()
        result = 31 * result + this.cbInnerString.hashCode()
        result = 31 * result + this.pbOuterString.hashCode()
        result = 31 * result + this.cbOuterString.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HmacInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HmacInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): HmacInfo =
                    HmacInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: HmacInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hashAlgid)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pbInnerString)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cbInnerString)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.pbOuterString)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.cbOuterString)
                }
            }

        public operator fun invoke(
            hashAlgid: AlgId = 0u,
            pbInnerString: MutPtr = MutPtr(0L),
            cbInnerString: UInt = 0u,
            pbOuterString: MutPtr = MutPtr(0L),
            cbOuterString: UInt = 0u,
        ): HmacInfo =
            HmacInfo(
                hashAlgid = hashAlgid,
                pbInnerStringCtorArg = pbInnerString,
                cbInnerString = cbInnerString,
                pbOuterStringCtorArg = pbOuterString,
                cbOuterString = cbOuterString,
            )
    }
}

public class HTTPSPolicyCallbackData internal constructor(
    public var anonymous: HttpspolicyCallbackData0,
    public var dwAuthType: HttpspolicyCallbackDataAuthType,
    public var fdwChecks: UInt,
    pwszServerNameCtorArg: Pwstr,
) {
    public var pwszServerName: Pwstr = pwszServerNameCtorArg
        internal set

    public constructor() : this(
        anonymous = HttpspolicyCallbackData0(),
        dwAuthType = 0u,
        fdwChecks = 0u,
        pwszServerNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): HttpspolicyCallbackData0 = this.anonymous

    public operator fun component2(): HttpspolicyCallbackDataAuthType = this.dwAuthType

    public operator fun component3(): UInt = this.fdwChecks

    public operator fun component4(): Pwstr = this.pwszServerName

    public fun copy(anonymous: HttpspolicyCallbackData0 = this.anonymous, dwAuthType: HttpspolicyCallbackDataAuthType = this.dwAuthType, fdwChecks: UInt = this.fdwChecks, pwszServerName: Pwstr = this.pwszServerName): HTTPSPolicyCallbackData = HTTPSPolicyCallbackData(anonymous = anonymous, dwAuthType = dwAuthType, fdwChecks = fdwChecks, pwszServerNameCtorArg = pwszServerName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HTTPSPolicyCallbackData) return false
        if (this.anonymous != other.anonymous) return false
        if (this.dwAuthType != other.dwAuthType) return false
        if (this.fdwChecks != other.fdwChecks) return false
        if (this.pwszServerName != other.pwszServerName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.dwAuthType.hashCode()
        result = 31 * result + this.fdwChecks.hashCode()
        result = 31 * result + this.pwszServerName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            anonymous: HttpspolicyCallbackData0 = HttpspolicyCallbackData0(),
            dwAuthType: HttpspolicyCallbackDataAuthType = 0u,
            fdwChecks: UInt = 0u,
            pwszServerName: Pwstr = MutPtr(0L),
        ): HTTPSPolicyCallbackData =
            HTTPSPolicyCallbackData(
                anonymous = anonymous,
                dwAuthType = dwAuthType,
                fdwChecks = fdwChecks,
                pwszServerNameCtorArg = pwszServerName,
            )
    }
}

public data class HttpspolicyCallbackData0(
    public var cbStruct: UInt = 0u,
    public var cbSize: UInt = 0u,
)

public data class HandleType(
    public var value: Int = 0,
) {
    public var field0: Int
        get() = value
        set(v) {
            value = v
        }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HandleType> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HandleType> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): HandleType =
                    HandleType(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: HandleType) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.value)
                }
            }

        public val ASYMMETRIC: HandleType = HandleType(1)

        public val SYMMETRIC: HandleType = HandleType(2)

        public val TRANSFORM: HandleType = HandleType(3)

        public val HASH: HandleType = HandleType(4)
    }
}

public class InformationcardAsymmetricCryptoParameters internal constructor(
    public var keySize: Int,
    keyExchangeAlgorithmCtorArg: Pwstr,
    signatureAlgorithmCtorArg: Pwstr,
) {
    public var keyExchangeAlgorithm: Pwstr = keyExchangeAlgorithmCtorArg
        internal set

    public var signatureAlgorithm: Pwstr = signatureAlgorithmCtorArg
        internal set

    public constructor() : this(
        keySize = 0,
        keyExchangeAlgorithmCtorArg = MutPtr(0L),
        signatureAlgorithmCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.keySize

    public operator fun component2(): Pwstr = this.keyExchangeAlgorithm

    public operator fun component3(): Pwstr = this.signatureAlgorithm

    public fun copy(keySize: Int = this.keySize, keyExchangeAlgorithm: Pwstr = this.keyExchangeAlgorithm, signatureAlgorithm: Pwstr = this.signatureAlgorithm): InformationcardAsymmetricCryptoParameters = InformationcardAsymmetricCryptoParameters(keySize = keySize, keyExchangeAlgorithmCtorArg = keyExchangeAlgorithm, signatureAlgorithmCtorArg = signatureAlgorithm)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is InformationcardAsymmetricCryptoParameters) return false
        if (this.keySize != other.keySize) return false
        if (this.keyExchangeAlgorithm != other.keyExchangeAlgorithm) return false
        if (this.signatureAlgorithm != other.signatureAlgorithm) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.keySize.hashCode()
        result = 31 * result + this.keyExchangeAlgorithm.hashCode()
        result = 31 * result + this.signatureAlgorithm.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            keySize: Int = 0,
            keyExchangeAlgorithm: Pwstr = MutPtr(0L),
            signatureAlgorithm: Pwstr = MutPtr(0L),
        ): InformationcardAsymmetricCryptoParameters =
            InformationcardAsymmetricCryptoParameters(
                keySize = keySize,
                keyExchangeAlgorithmCtorArg = keyExchangeAlgorithm,
                signatureAlgorithmCtorArg = signatureAlgorithm,
            )
    }
}

public class InformationcardCryptoHandle internal constructor(
    public var type: HandleType,
    public var expiration: Long,
    cryptoParametersCtorArg: MutPtr,
) {
    public var cryptoParameters: MutPtr = cryptoParametersCtorArg
        internal set

    public constructor() : this(
        type = HandleType(),
        expiration = 0L,
        cryptoParametersCtorArg = MutPtr(0L),
    )

    public operator fun component1(): HandleType = this.type

    public operator fun component2(): Long = this.expiration

    public operator fun component3(): MutPtr = this.cryptoParameters

    public fun copy(type: HandleType = this.type, expiration: Long = this.expiration, cryptoParameters: MutPtr = this.cryptoParameters): InformationcardCryptoHandle = InformationcardCryptoHandle(type = type, expiration = expiration, cryptoParametersCtorArg = cryptoParameters)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is InformationcardCryptoHandle) return false
        if (this.type != other.type) return false
        if (this.expiration != other.expiration) return false
        if (this.cryptoParameters != other.cryptoParameters) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.expiration.hashCode()
        result = 31 * result + this.cryptoParameters.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InformationcardCryptoHandle> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InformationcardCryptoHandle> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): InformationcardCryptoHandle =
                    InformationcardCryptoHandle(
                        (HandleType.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: InformationcardCryptoHandle) {
                    (HandleType.typeLayout()).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.expiration)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.cryptoParameters)
                }
            }

        public operator fun invoke(
            type: HandleType = HandleType(),
            expiration: Long = 0L,
            cryptoParameters: MutPtr = MutPtr(0L),
        ): InformationcardCryptoHandle =
            InformationcardCryptoHandle(
                type = type,
                expiration = expiration,
                cryptoParametersCtorArg = cryptoParameters,
            )
    }
}

public data class InformationcardHashCryptoParameters(
    public var hashSize: Int = 0,
    public var transform: InformationcardTransformCryptoParameters = InformationcardTransformCryptoParameters(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InformationcardHashCryptoParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InformationcardHashCryptoParameters> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): InformationcardHashCryptoParameters =
                    InformationcardHashCryptoParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (InformationcardTransformCryptoParameters.typeLayout()).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: InformationcardHashCryptoParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.hashSize)
                    (InformationcardTransformCryptoParameters.typeLayout()).writeNative(addr + 4L, value.transform)
                }
            }
    }
}

public data class InformationcardSymmetricCryptoParameters(
    public var keySize: Int = 0,
    public var blockSize: Int = 0,
    public var feedbackSize: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InformationcardSymmetricCryptoParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InformationcardSymmetricCryptoParameters> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): InformationcardSymmetricCryptoParameters =
                    InformationcardSymmetricCryptoParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: InformationcardSymmetricCryptoParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.keySize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.blockSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.feedbackSize)
                }
            }
    }
}

public data class InformationcardTransformCryptoParameters(
    public var inputBlockSize: Int = 0,
    public var outputBlockSize: Int = 0,
    public var canTransformMultipleBlocks: Bool = 0,
    public var canReuseTransform: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InformationcardTransformCryptoParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InformationcardTransformCryptoParameters> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): InformationcardTransformCryptoParameters =
                    InformationcardTransformCryptoParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: InformationcardTransformCryptoParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.inputBlockSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.outputBlockSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.canTransformMultipleBlocks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.canReuseTransform)
                }
            }
    }
}

public data class InFileSignatureResource(
    public var dwVersion: UInt = 0u,
    public var dwCrcOffset: UInt = 0u,
    public var rgbSignature: UByteArray = UByteArray(88),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is InFileSignatureResource) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.dwCrcOffset != other.dwCrcOffset) return false
        if (!this.rgbSignature.contentEquals(other.rgbSignature)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.dwCrcOffset.hashCode()
        result = 31 * result + this.rgbSignature.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InFileSignatureResource> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InFileSignatureResource> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 96L
                override fun readNative(addr: Long): InFileSignatureResource =
                    InFileSignatureResource(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (88).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: InFileSignatureResource) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwCrcOffset)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (88).toInt())
                    ).writeNative(addr + 8L, value.rgbSignature.toList())
                }
            }
    }
}

public data class KeyTypeSubtype(
    public var dwKeySpec: UInt = 0u,
    public var type: Guid = Guid(),
    public var subtype: Guid = Guid(),
)

public data class NcryptAllocPara(
    public var cbSize: UInt = 0u,
    public var pfnAlloc: PfnNcryptAlloc = null,
    public var pfnFree: PfnNcryptFree = null,
)

public class NcryptCipherPaddingInfo internal constructor(
    public var cbSize: UInt,
    public var dwFlags: UInt,
    pbIVCtorArg: MutPtr,
    public var cbIV: UInt,
    pbOtherInfoCtorArg: MutPtr,
    public var cbOtherInfo: UInt,
) {
    public var pbIV: MutPtr = pbIVCtorArg
        internal set

    public var pbOtherInfo: MutPtr = pbOtherInfoCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        dwFlags = 0u,
        pbIVCtorArg = MutPtr(0L),
        cbIV = 0u,
        pbOtherInfoCtorArg = MutPtr(0L),
        cbOtherInfo = 0u,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): MutPtr = this.pbIV

    public operator fun component4(): UInt = this.cbIV

    public operator fun component5(): MutPtr = this.pbOtherInfo

    public operator fun component6(): UInt = this.cbOtherInfo

    public fun copy(cbSize: UInt = this.cbSize, dwFlags: UInt = this.dwFlags, pbIV: MutPtr = this.pbIV, cbIV: UInt = this.cbIV, pbOtherInfo: MutPtr = this.pbOtherInfo, cbOtherInfo: UInt = this.cbOtherInfo): NcryptCipherPaddingInfo = NcryptCipherPaddingInfo(cbSize = cbSize, dwFlags = dwFlags, pbIVCtorArg = pbIV, cbIV = cbIV, pbOtherInfoCtorArg = pbOtherInfo, cbOtherInfo = cbOtherInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NcryptCipherPaddingInfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.pbIV != other.pbIV) return false
        if (this.cbIV != other.cbIV) return false
        if (this.pbOtherInfo != other.pbOtherInfo) return false
        if (this.cbOtherInfo != other.cbOtherInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.pbIV.hashCode()
        result = 31 * result + this.cbIV.hashCode()
        result = 31 * result + this.pbOtherInfo.hashCode()
        result = 31 * result + this.cbOtherInfo.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NcryptCipherPaddingInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NcryptCipherPaddingInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): NcryptCipherPaddingInfo =
                    NcryptCipherPaddingInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: NcryptCipherPaddingInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pbIV)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cbIV)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.pbOtherInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.cbOtherInfo)
                }
            }

        public operator fun invoke(
            cbSize: UInt = 0u,
            dwFlags: UInt = 0u,
            pbIV: MutPtr = MutPtr(0L),
            cbIV: UInt = 0u,
            pbOtherInfo: MutPtr = MutPtr(0L),
            cbOtherInfo: UInt = 0u,
        ): NcryptCipherPaddingInfo =
            NcryptCipherPaddingInfo(
                cbSize = cbSize,
                dwFlags = dwFlags,
                pbIVCtorArg = pbIV,
                cbIV = cbIV,
                pbOtherInfoCtorArg = pbOtherInfo,
                cbOtherInfo = cbOtherInfo,
            )
    }
}

public data class NcryptExportedIsolatedKeyEnvelope(
    public var header: NcryptExportedIsolatedKeyHeader = NcryptExportedIsolatedKeyHeader(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NcryptExportedIsolatedKeyEnvelope> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NcryptExportedIsolatedKeyEnvelope> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): NcryptExportedIsolatedKeyEnvelope =
                    NcryptExportedIsolatedKeyEnvelope(
                        (NcryptExportedIsolatedKeyHeader.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NcryptExportedIsolatedKeyEnvelope) {
                    (NcryptExportedIsolatedKeyHeader.typeLayout()).writeNative(addr, value.header)
                }
            }
    }
}

public data class NcryptExportedIsolatedKeyHeader(
    public var version: UInt = 0u,
    public var keyUsage: UInt = 0u,
    public var bitfield: UInt = 0u,
    public var cbAlgName: UInt = 0u,
    public var cbNonce: UInt = 0u,
    public var cbAuthTag: UInt = 0u,
    public var cbWrappingKey: UInt = 0u,
    public var cbIsolatedKey: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NcryptExportedIsolatedKeyHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NcryptExportedIsolatedKeyHeader> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): NcryptExportedIsolatedKeyHeader =
                    NcryptExportedIsolatedKeyHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: NcryptExportedIsolatedKeyHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.keyUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.bitfield)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cbAlgName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cbNonce)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.cbAuthTag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.cbWrappingKey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.cbIsolatedKey)
                }
            }
    }
}

public data class NcryptIsolatedKeyAttestedAttributes(
    public var version: UInt = 0u,
    public var flags: UInt = 0u,
    public var cbPublicKeyBlob: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NcryptIsolatedKeyAttestedAttributes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NcryptIsolatedKeyAttestedAttributes> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): NcryptIsolatedKeyAttestedAttributes =
                    NcryptIsolatedKeyAttestedAttributes(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: NcryptIsolatedKeyAttestedAttributes) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cbPublicKeyBlob)
                }
            }
    }
}

public data class NcryptKeyAccessPolicyBlob(
    public var dwVersion: UInt = 0u,
    public var dwPolicyFlags: UInt = 0u,
    public var cbUserSid: UInt = 0u,
    public var cbApplicationSid: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NcryptKeyAccessPolicyBlob> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NcryptKeyAccessPolicyBlob> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): NcryptKeyAccessPolicyBlob =
                    NcryptKeyAccessPolicyBlob(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: NcryptKeyAccessPolicyBlob) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwPolicyFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cbUserSid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cbApplicationSid)
                }
            }
    }
}

public class NcryptKeyAttestPaddingInfo internal constructor(
    public var magic: UInt,
    pbKeyBlobCtorArg: MutPtr,
    public var cbKeyBlob: UInt,
    pbKeyAuthCtorArg: MutPtr,
    public var cbKeyAuth: UInt,
) {
    public var pbKeyBlob: MutPtr = pbKeyBlobCtorArg
        internal set

    public var pbKeyAuth: MutPtr = pbKeyAuthCtorArg
        internal set

    public constructor() : this(
        magic = 0u,
        pbKeyBlobCtorArg = MutPtr(0L),
        cbKeyBlob = 0u,
        pbKeyAuthCtorArg = MutPtr(0L),
        cbKeyAuth = 0u,
    )

    public operator fun component1(): UInt = this.magic

    public operator fun component2(): MutPtr = this.pbKeyBlob

    public operator fun component3(): UInt = this.cbKeyBlob

    public operator fun component4(): MutPtr = this.pbKeyAuth

    public operator fun component5(): UInt = this.cbKeyAuth

    public fun copy(magic: UInt = this.magic, pbKeyBlob: MutPtr = this.pbKeyBlob, cbKeyBlob: UInt = this.cbKeyBlob, pbKeyAuth: MutPtr = this.pbKeyAuth, cbKeyAuth: UInt = this.cbKeyAuth): NcryptKeyAttestPaddingInfo = NcryptKeyAttestPaddingInfo(magic = magic, pbKeyBlobCtorArg = pbKeyBlob, cbKeyBlob = cbKeyBlob, pbKeyAuthCtorArg = pbKeyAuth, cbKeyAuth = cbKeyAuth)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NcryptKeyAttestPaddingInfo) return false
        if (this.magic != other.magic) return false
        if (this.pbKeyBlob != other.pbKeyBlob) return false
        if (this.cbKeyBlob != other.cbKeyBlob) return false
        if (this.pbKeyAuth != other.pbKeyAuth) return false
        if (this.cbKeyAuth != other.cbKeyAuth) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.magic.hashCode()
        result = 31 * result + this.pbKeyBlob.hashCode()
        result = 31 * result + this.cbKeyBlob.hashCode()
        result = 31 * result + this.pbKeyAuth.hashCode()
        result = 31 * result + this.cbKeyAuth.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NcryptKeyAttestPaddingInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NcryptKeyAttestPaddingInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): NcryptKeyAttestPaddingInfo =
                    NcryptKeyAttestPaddingInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: NcryptKeyAttestPaddingInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.magic)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pbKeyBlob)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cbKeyBlob)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.pbKeyAuth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.cbKeyAuth)
                }
            }

        public operator fun invoke(
            magic: UInt = 0u,
            pbKeyBlob: MutPtr = MutPtr(0L),
            cbKeyBlob: UInt = 0u,
            pbKeyAuth: MutPtr = MutPtr(0L),
            cbKeyAuth: UInt = 0u,
        ): NcryptKeyAttestPaddingInfo =
            NcryptKeyAttestPaddingInfo(
                magic = magic,
                pbKeyBlobCtorArg = pbKeyBlob,
                cbKeyBlob = cbKeyBlob,
                pbKeyAuthCtorArg = pbKeyAuth,
                cbKeyAuth = cbKeyAuth,
            )
    }
}

public data class NcryptKeyBlobHeader(
    public var cbSize: UInt = 0u,
    public var dwMagic: UInt = 0u,
    public var cbAlgName: UInt = 0u,
    public var cbKeyData: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NcryptKeyBlobHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NcryptKeyBlobHeader> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): NcryptKeyBlobHeader =
                    NcryptKeyBlobHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: NcryptKeyBlobHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwMagic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cbAlgName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cbKeyData)
                }
            }
    }
}

public class NcryptKeyStorageFunctionTable(
    public var version: BcryptInterfaceVersion = BcryptInterfaceVersion(),
    public var openProvider: NCryptOpenStorageProviderFn = null,
    public var openKey: NCryptOpenKeyFn = null,
    public var createPersistedKey: NCryptCreatePersistedKeyFn = null,
    public var getProviderProperty: NCryptGetProviderPropertyFn = null,
    public var getKeyProperty: NCryptGetKeyPropertyFn = null,
    public var setProviderProperty: NCryptSetProviderPropertyFn = null,
    public var setKeyProperty: NCryptSetKeyPropertyFn = null,
    public var finalizeKey: NCryptFinalizeKeyFn = null,
    public var deleteKey: NCryptDeleteKeyFn = null,
    public var freeProvider: NCryptFreeProviderFn = null,
    public var freeKey: NCryptFreeKeyFn = null,
    public var freeBuffer: NCryptFreeBufferFn = null,
    public var encrypt: NCryptEncryptFn = null,
    public var decrypt: NCryptDecryptFn = null,
    public var isAlgSupported: NCryptIsAlgSupportedFn = null,
    public var enumAlgorithms: NCryptEnumAlgorithmsFn = null,
    public var enumKeys: NCryptEnumKeysFn = null,
    public var importKey: NCryptImportKeyFn = null,
    public var exportKey: NCryptExportKeyFn = null,
    public var signHash: NCryptSignHashFn = null,
    public var verifySignature: NCryptVerifySignatureFn = null,
    public var promptUser: NCryptPromptUserFn = null,
    public var notifyChangeKey: NCryptNotifyChangeKeyFn = null,
    public var secretAgreement: NCryptSecretAgreementFn = null,
    public var deriveKey: NCryptDeriveKeyFn = null,
    public var freeSecret: NCryptFreeSecretFn = null,
    public var keyDerivation: NCryptKeyDerivationFn = null,
    public var createClaim: NCryptCreateClaimFn = null,
    public var verifyClaim: NCryptVerifyClaimFn = null,
)

public data class NcryptPcpHmacAuthSignatureInfo(
    public var dwVersion: UInt = 0u,
    public var iExpiration: Int = 0,
    public var pabNonce: UByteArray = UByteArray(32),
    public var pabPolicyRef: UByteArray = UByteArray(32),
    public var pabHMAC: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NcryptPcpHmacAuthSignatureInfo) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.iExpiration != other.iExpiration) return false
        if (!this.pabNonce.contentEquals(other.pabNonce)) return false
        if (!this.pabPolicyRef.contentEquals(other.pabPolicyRef)) return false
        if (!this.pabHMAC.contentEquals(other.pabHMAC)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.iExpiration.hashCode()
        result = 31 * result + this.pabNonce.contentHashCode()
        result = 31 * result + this.pabPolicyRef.contentHashCode()
        result = 31 * result + this.pabHMAC.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NcryptPcpHmacAuthSignatureInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NcryptPcpHmacAuthSignatureInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 104L
                override fun readNative(addr: Long): NcryptPcpHmacAuthSignatureInfo =
                    NcryptPcpHmacAuthSignatureInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                        ).readNative(addr + 40L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                        ).readNative(addr + 72L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: NcryptPcpHmacAuthSignatureInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.iExpiration)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                    ).writeNative(addr + 8L, value.pabNonce.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                    ).writeNative(addr + 40L, value.pabPolicyRef.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                    ).writeNative(addr + 72L, value.pabHMAC.toList())
                }
            }
    }
}

public data class NcryptPcpRawPolicydigestInfo(
    public var dwVersion: UInt = 0u,
    public var cbDigest: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NcryptPcpRawPolicydigestInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NcryptPcpRawPolicydigestInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): NcryptPcpRawPolicydigestInfo =
                    NcryptPcpRawPolicydigestInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: NcryptPcpRawPolicydigestInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cbDigest)
                }
            }
    }
}

public data class NcryptPcpTpmFwVersionInfo(
    public var major1: UShort = 0u,
    public var major2: UShort = 0u,
    public var minor1: UShort = 0u,
    public var minor2: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NcryptPcpTpmFwVersionInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NcryptPcpTpmFwVersionInfo> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): NcryptPcpTpmFwVersionInfo =
                    NcryptPcpTpmFwVersionInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: NcryptPcpTpmFwVersionInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.major1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.major2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.minor1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.minor2)
                }
            }
    }
}

public data class NcryptPcpTpmWebAuthnAttestationStatement(
    public var magic: UInt = 0u,
    public var version: UInt = 0u,
    public var headerSize: UInt = 0u,
    public var cbCertifyInfo: UInt = 0u,
    public var cbSignature: UInt = 0u,
    public var cbTpmPublic: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NcryptPcpTpmWebAuthnAttestationStatement> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NcryptPcpTpmWebAuthnAttestationStatement> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): NcryptPcpTpmWebAuthnAttestationStatement =
                    NcryptPcpTpmWebAuthnAttestationStatement(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: NcryptPcpTpmWebAuthnAttestationStatement) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.magic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.headerSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cbCertifyInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cbSignature)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.cbTpmPublic)
                }
            }
    }
}

public data class NcryptPlatformAttestPaddingInfo(
    public var magic: UInt = 0u,
    public var pcrMask: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NcryptPlatformAttestPaddingInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NcryptPlatformAttestPaddingInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): NcryptPlatformAttestPaddingInfo =
                    NcryptPlatformAttestPaddingInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: NcryptPlatformAttestPaddingInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.magic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.pcrMask)
                }
            }
    }
}

public class NcryptProtectStreamInfo internal constructor(
    public var pfnStreamOutput: PFNCryptStreamOutputCallback,
    pvCallbackCtxtCtorArg: MutPtr,
) {
    public var pvCallbackCtxt: MutPtr = pvCallbackCtxtCtorArg
        internal set

    public constructor() : this(
        pfnStreamOutput = null,
        pvCallbackCtxtCtorArg = MutPtr(0L),
    )

    public operator fun component1(): PFNCryptStreamOutputCallback = this.pfnStreamOutput

    public operator fun component2(): MutPtr = this.pvCallbackCtxt

    public fun copy(pfnStreamOutput: PFNCryptStreamOutputCallback = this.pfnStreamOutput, pvCallbackCtxt: MutPtr = this.pvCallbackCtxt): NcryptProtectStreamInfo = NcryptProtectStreamInfo(pfnStreamOutput = pfnStreamOutput, pvCallbackCtxtCtorArg = pvCallbackCtxt)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NcryptProtectStreamInfo) return false
        if (this.pfnStreamOutput != other.pfnStreamOutput) return false
        if (this.pvCallbackCtxt != other.pvCallbackCtxt) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pfnStreamOutput.hashCode()
        result = 31 * result + this.pvCallbackCtxt.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pfnStreamOutput: PFNCryptStreamOutputCallback = null,
            pvCallbackCtxt: MutPtr = MutPtr(0L),
        ): NcryptProtectStreamInfo =
            NcryptProtectStreamInfo(
                pfnStreamOutput = pfnStreamOutput,
                pvCallbackCtxtCtorArg = pvCallbackCtxt,
            )
    }
}

public class NcryptProtectStreamInfoEx internal constructor(
    public var pfnStreamOutput: PFNCryptStreamOutputCallbackEx,
    pvCallbackCtxtCtorArg: MutPtr,
) {
    public var pvCallbackCtxt: MutPtr = pvCallbackCtxtCtorArg
        internal set

    public constructor() : this(
        pfnStreamOutput = null,
        pvCallbackCtxtCtorArg = MutPtr(0L),
    )

    public operator fun component1(): PFNCryptStreamOutputCallbackEx = this.pfnStreamOutput

    public operator fun component2(): MutPtr = this.pvCallbackCtxt

    public fun copy(pfnStreamOutput: PFNCryptStreamOutputCallbackEx = this.pfnStreamOutput, pvCallbackCtxt: MutPtr = this.pvCallbackCtxt): NcryptProtectStreamInfoEx = NcryptProtectStreamInfoEx(pfnStreamOutput = pfnStreamOutput, pvCallbackCtxtCtorArg = pvCallbackCtxt)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NcryptProtectStreamInfoEx) return false
        if (this.pfnStreamOutput != other.pfnStreamOutput) return false
        if (this.pvCallbackCtxt != other.pvCallbackCtxt) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pfnStreamOutput.hashCode()
        result = 31 * result + this.pvCallbackCtxt.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pfnStreamOutput: PFNCryptStreamOutputCallbackEx = null,
            pvCallbackCtxt: MutPtr = MutPtr(0L),
        ): NcryptProtectStreamInfoEx =
            NcryptProtectStreamInfoEx(
                pfnStreamOutput = pfnStreamOutput,
                pvCallbackCtxtCtorArg = pvCallbackCtxt,
            )
    }
}

public data class NcryptSslCipherLengths(
    public var cbLength: UInt = 0u,
    public var dwHeaderLen: UInt = 0u,
    public var dwFixedTrailerLen: UInt = 0u,
    public var dwMaxVariableTrailerLen: UInt = 0u,
    public var dwFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NcryptSslCipherLengths> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NcryptSslCipherLengths> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): NcryptSslCipherLengths =
                    NcryptSslCipherLengths(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: NcryptSslCipherLengths) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwHeaderLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwFixedTrailerLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwMaxVariableTrailerLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwFlags)
                }
            }
    }
}

public data class NcryptSslCipherSuite(
    public var dwProtocol: UInt = 0u,
    public var dwCipherSuite: UInt = 0u,
    public var dwBaseCipherSuite: UInt = 0u,
    public var szCipherSuite: UShortArray = UShortArray(64),
    public var szCipher: UShortArray = UShortArray(64),
    public var dwCipherLen: UInt = 0u,
    public var dwCipherBlockLen: UInt = 0u,
    public var szHash: UShortArray = UShortArray(64),
    public var dwHashLen: UInt = 0u,
    public var szExchange: UShortArray = UShortArray(64),
    public var dwMinExchangeLen: UInt = 0u,
    public var dwMaxExchangeLen: UInt = 0u,
    public var szCertificate: UShortArray = UShortArray(64),
    public var dwKeyType: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NcryptSslCipherSuite) return false
        if (this.dwProtocol != other.dwProtocol) return false
        if (this.dwCipherSuite != other.dwCipherSuite) return false
        if (this.dwBaseCipherSuite != other.dwBaseCipherSuite) return false
        if (!this.szCipherSuite.contentEquals(other.szCipherSuite)) return false
        if (!this.szCipher.contentEquals(other.szCipher)) return false
        if (this.dwCipherLen != other.dwCipherLen) return false
        if (this.dwCipherBlockLen != other.dwCipherBlockLen) return false
        if (!this.szHash.contentEquals(other.szHash)) return false
        if (this.dwHashLen != other.dwHashLen) return false
        if (!this.szExchange.contentEquals(other.szExchange)) return false
        if (this.dwMinExchangeLen != other.dwMinExchangeLen) return false
        if (this.dwMaxExchangeLen != other.dwMaxExchangeLen) return false
        if (!this.szCertificate.contentEquals(other.szCertificate)) return false
        if (this.dwKeyType != other.dwKeyType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwProtocol.hashCode()
        result = 31 * result + this.dwCipherSuite.hashCode()
        result = 31 * result + this.dwBaseCipherSuite.hashCode()
        result = 31 * result + this.szCipherSuite.contentHashCode()
        result = 31 * result + this.szCipher.contentHashCode()
        result = 31 * result + this.dwCipherLen.hashCode()
        result = 31 * result + this.dwCipherBlockLen.hashCode()
        result = 31 * result + this.szHash.contentHashCode()
        result = 31 * result + this.dwHashLen.hashCode()
        result = 31 * result + this.szExchange.contentHashCode()
        result = 31 * result + this.dwMinExchangeLen.hashCode()
        result = 31 * result + this.dwMaxExchangeLen.hashCode()
        result = 31 * result + this.szCertificate.contentHashCode()
        result = 31 * result + this.dwKeyType.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NcryptSslCipherSuite> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NcryptSslCipherSuite> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 676L
                override fun readNative(addr: Long): NcryptSslCipherSuite =
                    NcryptSslCipherSuite(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                        ).readNative(addr + 12L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                        ).readNative(addr + 140L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 268L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 272L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                        ).readNative(addr + 276L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 404L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                        ).readNative(addr + 408L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 536L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 540L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                        ).readNative(addr + 544L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 672L),
                    )
                override fun writeNative(addr: Long, value: NcryptSslCipherSuite) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwProtocol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwCipherSuite)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwBaseCipherSuite)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                    ).writeNative(addr + 12L, value.szCipherSuite.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                    ).writeNative(addr + 140L, value.szCipher.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 268L, value.dwCipherLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 272L, value.dwCipherBlockLen)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                    ).writeNative(addr + 276L, value.szHash.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 404L, value.dwHashLen)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                    ).writeNative(addr + 408L, value.szExchange.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 536L, value.dwMinExchangeLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 540L, value.dwMaxExchangeLen)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                    ).writeNative(addr + 544L, value.szCertificate.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 672L, value.dwKeyType)
                }
            }
    }
}

public data class NcryptSslCipherSuiteEx(
    public var dwVersion: UInt = 0u,
    public var dwProtocol: UInt = 0u,
    public var dwCipherSuite: UInt = 0u,
    public var dwBaseCipherSuite: UInt = 0u,
    public var szCipherSuite: UShortArray = UShortArray(64),
    public var szCipher: UShortArray = UShortArray(64),
    public var dwCipherLen: UInt = 0u,
    public var dwCipherBlockLen: UInt = 0u,
    public var szHash: UShortArray = UShortArray(64),
    public var dwHashLen: UInt = 0u,
    public var szExchange: UShortArray = UShortArray(64),
    public var dwMinExchangeLen: UInt = 0u,
    public var dwMaxExchangeLen: UInt = 0u,
    public var szCertificate: UShortArray = UShortArray(64),
    public var dwKeyType: UInt = 0u,
    public var szCipherMode: UShortArray = UShortArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NcryptSslCipherSuiteEx) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.dwProtocol != other.dwProtocol) return false
        if (this.dwCipherSuite != other.dwCipherSuite) return false
        if (this.dwBaseCipherSuite != other.dwBaseCipherSuite) return false
        if (!this.szCipherSuite.contentEquals(other.szCipherSuite)) return false
        if (!this.szCipher.contentEquals(other.szCipher)) return false
        if (this.dwCipherLen != other.dwCipherLen) return false
        if (this.dwCipherBlockLen != other.dwCipherBlockLen) return false
        if (!this.szHash.contentEquals(other.szHash)) return false
        if (this.dwHashLen != other.dwHashLen) return false
        if (!this.szExchange.contentEquals(other.szExchange)) return false
        if (this.dwMinExchangeLen != other.dwMinExchangeLen) return false
        if (this.dwMaxExchangeLen != other.dwMaxExchangeLen) return false
        if (!this.szCertificate.contentEquals(other.szCertificate)) return false
        if (this.dwKeyType != other.dwKeyType) return false
        if (!this.szCipherMode.contentEquals(other.szCipherMode)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.dwProtocol.hashCode()
        result = 31 * result + this.dwCipherSuite.hashCode()
        result = 31 * result + this.dwBaseCipherSuite.hashCode()
        result = 31 * result + this.szCipherSuite.contentHashCode()
        result = 31 * result + this.szCipher.contentHashCode()
        result = 31 * result + this.dwCipherLen.hashCode()
        result = 31 * result + this.dwCipherBlockLen.hashCode()
        result = 31 * result + this.szHash.contentHashCode()
        result = 31 * result + this.dwHashLen.hashCode()
        result = 31 * result + this.szExchange.contentHashCode()
        result = 31 * result + this.dwMinExchangeLen.hashCode()
        result = 31 * result + this.dwMaxExchangeLen.hashCode()
        result = 31 * result + this.szCertificate.contentHashCode()
        result = 31 * result + this.dwKeyType.hashCode()
        result = 31 * result + this.szCipherMode.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NcryptSslCipherSuiteEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NcryptSslCipherSuiteEx> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 808L
                override fun readNative(addr: Long): NcryptSslCipherSuiteEx =
                    NcryptSslCipherSuiteEx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                        ).readNative(addr + 16L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                        ).readNative(addr + 144L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 272L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 276L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                        ).readNative(addr + 280L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 408L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                        ).readNative(addr + 412L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 540L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 544L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                        ).readNative(addr + 548L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 676L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                        ).readNative(addr + 680L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: NcryptSslCipherSuiteEx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwProtocol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwCipherSuite)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwBaseCipherSuite)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                    ).writeNative(addr + 16L, value.szCipherSuite.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                    ).writeNative(addr + 144L, value.szCipher.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 272L, value.dwCipherLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 276L, value.dwCipherBlockLen)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                    ).writeNative(addr + 280L, value.szHash.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 408L, value.dwHashLen)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                    ).writeNative(addr + 412L, value.szExchange.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 540L, value.dwMinExchangeLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 544L, value.dwMaxExchangeLen)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                    ).writeNative(addr + 548L, value.szCertificate.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 676L, value.dwKeyType)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                    ).writeNative(addr + 680L, value.szCipherMode.toList())
                }
            }
    }
}

public data class NcryptSslEccCurve(
    public var szCurveName: UShortArray = UShortArray(255),
    public var szOID: ByteArray = ByteArray(255),
    public var dwPublicKeyLength: UInt = 0u,
    public var dwCurveType: UInt = 0u,
    public var dwFlags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NcryptSslEccCurve) return false
        if (!this.szCurveName.contentEquals(other.szCurveName)) return false
        if (!this.szOID.contentEquals(other.szOID)) return false
        if (this.dwPublicKeyLength != other.dwPublicKeyLength) return false
        if (this.dwCurveType != other.dwCurveType) return false
        if (this.dwFlags != other.dwFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szCurveName.contentHashCode()
        result = 31 * result + this.szOID.contentHashCode()
        result = 31 * result + this.dwPublicKeyLength.hashCode()
        result = 31 * result + this.dwCurveType.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NcryptSslEccCurve> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NcryptSslEccCurve> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 780L
                override fun readNative(addr: Long): NcryptSslEccCurve =
                    NcryptSslEccCurve(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (255).toInt())
                        ).readNative(addr).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (255).toInt())
                        ).readNative(addr + 510L).toByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 768L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 772L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 776L),
                    )
                override fun writeNative(addr: Long, value: NcryptSslEccCurve) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (255).toInt())
                    ).writeNative(addr, value.szCurveName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (255).toInt())
                    ).writeNative(addr + 510L, value.szOID.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 768L, value.dwPublicKeyLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 772L, value.dwCurveType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 776L, value.dwFlags)
                }
            }
    }
}

public class NcryptSslFunctionTable(
    public var version: BcryptInterfaceVersion = BcryptInterfaceVersion(),
    public var computeClientAuthHash: SslComputeClientAuthHashFn = null,
    public var computeEapKeyBlock: SslComputeEapKeyBlockFn = null,
    public var computeFinishedHash: SslComputeFinishedHashFn = null,
    public var createEphemeralKey: SslCreateEphemeralKeyFn = null,
    public var createHandshakeHash: SslCreateHandshakeHashFn = null,
    public var decryptPacket: SslDecryptPacketFn = null,
    public var encryptPacket: SslEncryptPacketFn = null,
    public var enumCipherSuites: SslEnumCipherSuitesFn = null,
    public var exportKey: SslExportKeyFn = null,
    public var freeBuffer: SslFreeBufferFn = null,
    public var freeObject: SslFreeObjectFn = null,
    public var generateMasterKey: SslGenerateMasterKeyFn = null,
    public var generateSessionKeys: SslGenerateSessionKeysFn = null,
    public var getKeyProperty: SslGetKeyPropertyFn = null,
    public var getProviderProperty: SslGetProviderPropertyFn = null,
    public var hashHandshake: SslHashHandshakeFn = null,
    public var importMasterKey: SslImportMasterKeyFn = null,
    public var importKey: SslImportKeyFn = null,
    public var lookupCipherSuiteInfo: SslLookupCipherSuiteInfoFn = null,
    public var openPrivateKey: SslOpenPrivateKeyFn = null,
    public var openProvider: SslOpenProviderFn = null,
    public var signHash: SslSignHashFn = null,
    public var verifySignature: SslVerifySignatureFn = null,
    public var lookupCipherLengths: SslLookupCipherLengthsFn = null,
    public var createClientAuthHash: SslCreateClientAuthHashFn = null,
    public var getCipherSuitePRFHashAlgorithm: SslGetCipherSuitePRFHashAlgorithmFn = null,
    public var computeSessionHash: SslComputeSessionHashFn = null,
    public var generatePreMasterKey: SslGeneratePreMasterKeyFn = null,
    public var enumEccCurves: SslEnumEccCurvesFn = null,
    public var exportKeyingMaterial: SslExportKeyingMaterialFn = null,
    public var extractEarlyKey: SslExtractEarlyKeyFn = null,
    public var extractHandshakeKey: SslExtractHandshakeKeyFn = null,
    public var extractMasterKey: SslExtractMasterKeyFn = null,
    public var expandTrafficKeys: SslExpandTrafficKeysFn = null,
    public var expandWriteKey: SslExpandWriteKeyFn = null,
    public var expandExporterMasterKey: SslExpandExporterMasterKeyFn = null,
    public var enumCipherSuitesEx: SslEnumCipherSuitesExFn = null,
    public var expandResumptionMasterKey: SslExpandResumptionMasterKeyFn = null,
    public var duplicateTranscriptHash: SslDuplicateTranscriptHashFn = null,
    public var expandBinderKey: SslExpandBinderKeyFn = null,
    public var expandPreSharedKey: SslExpandPreSharedKeyFn = null,
)

public data class NcryptSupportedLengths(
    public var dwMinLength: UInt = 0u,
    public var dwMaxLength: UInt = 0u,
    public var dwIncrement: UInt = 0u,
    public var dwDefaultLength: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NcryptSupportedLengths> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NcryptSupportedLengths> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): NcryptSupportedLengths =
                    NcryptSupportedLengths(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: NcryptSupportedLengths) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwMinLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwMaxLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwIncrement)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwDefaultLength)
                }
            }
    }
}

public data class NcryptTpmLoadableKeyBlobHeader(
    public var magic: UInt = 0u,
    public var cbHeader: UInt = 0u,
    public var cbPublic: UInt = 0u,
    public var cbPrivate: UInt = 0u,
    public var cbName: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NcryptTpmLoadableKeyBlobHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NcryptTpmLoadableKeyBlobHeader> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): NcryptTpmLoadableKeyBlobHeader =
                    NcryptTpmLoadableKeyBlobHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: NcryptTpmLoadableKeyBlobHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.magic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cbHeader)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cbPublic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cbPrivate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cbName)
                }
            }
    }
}

public data class NcryptTpmPlatformAttestationStatement(
    public var magic: UInt = 0u,
    public var version: UInt = 0u,
    public var pcrAlg: UInt = 0u,
    public var cbSignature: UInt = 0u,
    public var cbQuote: UInt = 0u,
    public var cbPcrs: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NcryptTpmPlatformAttestationStatement> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NcryptTpmPlatformAttestationStatement> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): NcryptTpmPlatformAttestationStatement =
                    NcryptTpmPlatformAttestationStatement(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: NcryptTpmPlatformAttestationStatement) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.magic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.pcrAlg)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cbSignature)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cbQuote)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.cbPcrs)
                }
            }
    }
}

public class NcryptUiPolicy internal constructor(
    public var dwVersion: UInt,
    public var dwFlags: UInt,
    pszCreationTitleCtorArg: Pcwstr,
    pszFriendlyNameCtorArg: Pcwstr,
    pszDescriptionCtorArg: Pcwstr,
) {
    public var pszCreationTitle: Pcwstr = pszCreationTitleCtorArg
        internal set

    public var pszFriendlyName: Pcwstr = pszFriendlyNameCtorArg
        internal set

    public var pszDescription: Pcwstr = pszDescriptionCtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        dwFlags = 0u,
        pszCreationTitleCtorArg = ConstPtr(0L),
        pszFriendlyNameCtorArg = ConstPtr(0L),
        pszDescriptionCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.dwVersion

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): Pcwstr = this.pszCreationTitle

    public operator fun component4(): Pcwstr = this.pszFriendlyName

    public operator fun component5(): Pcwstr = this.pszDescription

    public fun copy(dwVersion: UInt = this.dwVersion, dwFlags: UInt = this.dwFlags, pszCreationTitle: Pcwstr = this.pszCreationTitle, pszFriendlyName: Pcwstr = this.pszFriendlyName, pszDescription: Pcwstr = this.pszDescription): NcryptUiPolicy = NcryptUiPolicy(dwVersion = dwVersion, dwFlags = dwFlags, pszCreationTitleCtorArg = pszCreationTitle, pszFriendlyNameCtorArg = pszFriendlyName, pszDescriptionCtorArg = pszDescription)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NcryptUiPolicy) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.pszCreationTitle != other.pszCreationTitle) return false
        if (this.pszFriendlyName != other.pszFriendlyName) return false
        if (this.pszDescription != other.pszDescription) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.pszCreationTitle.hashCode()
        result = 31 * result + this.pszFriendlyName.hashCode()
        result = 31 * result + this.pszDescription.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwVersion: UInt = 0u,
            dwFlags: UInt = 0u,
            pszCreationTitle: Pcwstr = ConstPtr(0L),
            pszFriendlyName: Pcwstr = ConstPtr(0L),
            pszDescription: Pcwstr = ConstPtr(0L),
        ): NcryptUiPolicy =
            NcryptUiPolicy(
                dwVersion = dwVersion,
                dwFlags = dwFlags,
                pszCreationTitleCtorArg = pszCreationTitle,
                pszFriendlyNameCtorArg = pszFriendlyName,
                pszDescriptionCtorArg = pszDescription,
            )
    }
}

public data class NcryptUiPolicyBlob(
    public var dwVersion: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var cbCreationTitle: UInt = 0u,
    public var cbFriendlyName: UInt = 0u,
    public var cbDescription: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NcryptUiPolicyBlob> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NcryptUiPolicyBlob> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): NcryptUiPolicyBlob =
                    NcryptUiPolicyBlob(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: NcryptUiPolicyBlob) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cbCreationTitle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cbFriendlyName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cbDescription)
                }
            }
    }
}

public data class NcryptVsmKeyAttestationClaimRestrictions(
    public var version: UInt = 0u,
    public var trustletId: ULong = 0uL,
    public var minSvn: UInt = 0u,
    public var flagsMask: UInt = 0u,
    public var flagsExpected: UInt = 0u,
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NcryptVsmKeyAttestationClaimRestrictions> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NcryptVsmKeyAttestationClaimRestrictions> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): NcryptVsmKeyAttestationClaimRestrictions =
                    NcryptVsmKeyAttestationClaimRestrictions(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: NcryptVsmKeyAttestationClaimRestrictions) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.trustletId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.minSvn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.flagsMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.flagsExpected)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.bitfield)
                }
            }
    }
}

public data class NcryptVsmKeyAttestationStatement(
    public var magic: UInt = 0u,
    public var version: UInt = 0u,
    public var cbSignature: UInt = 0u,
    public var cbReport: UInt = 0u,
    public var cbAttributes: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NcryptVsmKeyAttestationStatement> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NcryptVsmKeyAttestationStatement> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): NcryptVsmKeyAttestationStatement =
                    NcryptVsmKeyAttestationStatement(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: NcryptVsmKeyAttestationStatement) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.magic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cbSignature)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cbReport)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cbAttributes)
                }
            }
    }
}

public class NCryptAlgorithmName internal constructor(
    pszNameCtorArg: Pwstr,
    public var dwClass: NcryptAlgorithmNameClass,
    public var dwAlgOperations: NcryptOperation,
    public var dwFlags: UInt,
) {
    public var pszName: Pwstr = pszNameCtorArg
        internal set

    public constructor() : this(
        pszNameCtorArg = MutPtr(0L),
        dwClass = 0u,
        dwAlgOperations = 0u,
        dwFlags = 0u,
    )

    public operator fun component1(): Pwstr = this.pszName

    public operator fun component2(): NcryptAlgorithmNameClass = this.dwClass

    public operator fun component3(): NcryptOperation = this.dwAlgOperations

    public operator fun component4(): UInt = this.dwFlags

    public fun copy(pszName: Pwstr = this.pszName, dwClass: NcryptAlgorithmNameClass = this.dwClass, dwAlgOperations: NcryptOperation = this.dwAlgOperations, dwFlags: UInt = this.dwFlags): NCryptAlgorithmName = NCryptAlgorithmName(pszNameCtorArg = pszName, dwClass = dwClass, dwAlgOperations = dwAlgOperations, dwFlags = dwFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NCryptAlgorithmName) return false
        if (this.pszName != other.pszName) return false
        if (this.dwClass != other.dwClass) return false
        if (this.dwAlgOperations != other.dwAlgOperations) return false
        if (this.dwFlags != other.dwFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszName.hashCode()
        result = 31 * result + this.dwClass.hashCode()
        result = 31 * result + this.dwAlgOperations.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszName: Pwstr = MutPtr(0L),
            dwClass: NcryptAlgorithmNameClass = 0u,
            dwAlgOperations: NcryptOperation = 0u,
            dwFlags: UInt = 0u,
        ): NCryptAlgorithmName =
            NCryptAlgorithmName(
                pszNameCtorArg = pszName,
                dwClass = dwClass,
                dwAlgOperations = dwAlgOperations,
                dwFlags = dwFlags,
            )
    }
}

public class NCryptKeyName internal constructor(
    pszNameCtorArg: Pwstr,
    pszAlgidCtorArg: Pwstr,
    public var dwLegacyKeySpec: CertKeySpec,
    public var dwFlags: UInt,
) {
    public var pszName: Pwstr = pszNameCtorArg
        internal set

    public var pszAlgid: Pwstr = pszAlgidCtorArg
        internal set

    public constructor() : this(
        pszNameCtorArg = MutPtr(0L),
        pszAlgidCtorArg = MutPtr(0L),
        dwLegacyKeySpec = 0u,
        dwFlags = 0u,
    )

    public operator fun component1(): Pwstr = this.pszName

    public operator fun component2(): Pwstr = this.pszAlgid

    public operator fun component3(): CertKeySpec = this.dwLegacyKeySpec

    public operator fun component4(): UInt = this.dwFlags

    public fun copy(pszName: Pwstr = this.pszName, pszAlgid: Pwstr = this.pszAlgid, dwLegacyKeySpec: CertKeySpec = this.dwLegacyKeySpec, dwFlags: UInt = this.dwFlags): NCryptKeyName = NCryptKeyName(pszNameCtorArg = pszName, pszAlgidCtorArg = pszAlgid, dwLegacyKeySpec = dwLegacyKeySpec, dwFlags = dwFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NCryptKeyName) return false
        if (this.pszName != other.pszName) return false
        if (this.pszAlgid != other.pszAlgid) return false
        if (this.dwLegacyKeySpec != other.dwLegacyKeySpec) return false
        if (this.dwFlags != other.dwFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszName.hashCode()
        result = 31 * result + this.pszAlgid.hashCode()
        result = 31 * result + this.dwLegacyKeySpec.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszName: Pwstr = MutPtr(0L),
            pszAlgid: Pwstr = MutPtr(0L),
            dwLegacyKeySpec: CertKeySpec = 0u,
            dwFlags: UInt = 0u,
        ): NCryptKeyName =
            NCryptKeyName(
                pszNameCtorArg = pszName,
                pszAlgidCtorArg = pszAlgid,
                dwLegacyKeySpec = dwLegacyKeySpec,
                dwFlags = dwFlags,
            )
    }
}

public class NCryptProviderName internal constructor(
    pszNameCtorArg: Pwstr,
    pszCommentCtorArg: Pwstr,
) {
    public var pszName: Pwstr = pszNameCtorArg
        internal set

    public var pszComment: Pwstr = pszCommentCtorArg
        internal set

    public constructor() : this(
        pszNameCtorArg = MutPtr(0L),
        pszCommentCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.pszName

    public operator fun component2(): Pwstr = this.pszComment

    public fun copy(pszName: Pwstr = this.pszName, pszComment: Pwstr = this.pszComment): NCryptProviderName = NCryptProviderName(pszNameCtorArg = pszName, pszCommentCtorArg = pszComment)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NCryptProviderName) return false
        if (this.pszName != other.pszName) return false
        if (this.pszComment != other.pszComment) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszName.hashCode()
        result = 31 * result + this.pszComment.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszName: Pwstr = MutPtr(0L),
            pszComment: Pwstr = MutPtr(0L),
        ): NCryptProviderName =
            NCryptProviderName(
                pszNameCtorArg = pszName,
                pszCommentCtorArg = pszComment,
            )
    }
}

public class OcspBasicResponseEntry internal constructor(
    public var certId: OcspCertId,
    public var dwCertStatus: UInt,
    public var anonymous: OcspBasicResponseEntry0,
    public var thisUpdate: Filetime,
    public var nextUpdate: Filetime,
    public var cExtension: UInt,
    rgExtensionCtorArg: MutPtr,
) {
    public var rgExtension: MutPtr = rgExtensionCtorArg
        internal set

    public constructor() : this(
        certId = OcspCertId(),
        dwCertStatus = 0u,
        anonymous = OcspBasicResponseEntry0(),
        thisUpdate = Filetime(),
        nextUpdate = Filetime(),
        cExtension = 0u,
        rgExtensionCtorArg = MutPtr(0L),
    )

    public operator fun component1(): OcspCertId = this.certId

    public operator fun component2(): UInt = this.dwCertStatus

    public operator fun component3(): OcspBasicResponseEntry0 = this.anonymous

    public operator fun component4(): Filetime = this.thisUpdate

    public operator fun component5(): Filetime = this.nextUpdate

    public operator fun component6(): UInt = this.cExtension

    public operator fun component7(): MutPtr = this.rgExtension

    public fun copy(certId: OcspCertId = this.certId, dwCertStatus: UInt = this.dwCertStatus, anonymous: OcspBasicResponseEntry0 = this.anonymous, thisUpdate: Filetime = this.thisUpdate, nextUpdate: Filetime = this.nextUpdate, cExtension: UInt = this.cExtension, rgExtension: MutPtr = this.rgExtension): OcspBasicResponseEntry = OcspBasicResponseEntry(certId = certId, dwCertStatus = dwCertStatus, anonymous = anonymous, thisUpdate = thisUpdate, nextUpdate = nextUpdate, cExtension = cExtension, rgExtensionCtorArg = rgExtension)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OcspBasicResponseEntry) return false
        if (this.certId != other.certId) return false
        if (this.dwCertStatus != other.dwCertStatus) return false
        if (this.anonymous != other.anonymous) return false
        if (this.thisUpdate != other.thisUpdate) return false
        if (this.nextUpdate != other.nextUpdate) return false
        if (this.cExtension != other.cExtension) return false
        if (this.rgExtension != other.rgExtension) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.certId.hashCode()
        result = 31 * result + this.dwCertStatus.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.thisUpdate.hashCode()
        result = 31 * result + this.nextUpdate.hashCode()
        result = 31 * result + this.cExtension.hashCode()
        result = 31 * result + this.rgExtension.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            certId: OcspCertId = OcspCertId(),
            dwCertStatus: UInt = 0u,
            anonymous: OcspBasicResponseEntry0 = OcspBasicResponseEntry0(),
            thisUpdate: Filetime = Filetime(),
            nextUpdate: Filetime = Filetime(),
            cExtension: UInt = 0u,
            rgExtension: MutPtr = MutPtr(0L),
        ): OcspBasicResponseEntry =
            OcspBasicResponseEntry(
                certId = certId,
                dwCertStatus = dwCertStatus,
                anonymous = anonymous,
                thisUpdate = thisUpdate,
                nextUpdate = nextUpdate,
                cExtension = cExtension,
                rgExtensionCtorArg = rgExtension,
            )
    }
}

public class OcspBasicResponseEntry0 internal constructor(
    pRevokedInfoCtorArg: MutPtr,
) {
    public var pRevokedInfo: MutPtr = pRevokedInfoCtorArg
        internal set

    public constructor() : this(
        pRevokedInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.pRevokedInfo

    public fun copy(pRevokedInfo: MutPtr = this.pRevokedInfo): OcspBasicResponseEntry0 = OcspBasicResponseEntry0(pRevokedInfoCtorArg = pRevokedInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OcspBasicResponseEntry0) return false
        if (this.pRevokedInfo != other.pRevokedInfo) return false
        return true
    }

    override fun hashCode(): Int = this.pRevokedInfo.hashCode()

    public companion object {
        public operator fun invoke(
            pRevokedInfo: MutPtr = MutPtr(0L),
        ): OcspBasicResponseEntry0 =
            OcspBasicResponseEntry0(
                pRevokedInfoCtorArg = pRevokedInfo,
            )
    }
}

public class OcspBasicResponseInfo internal constructor(
    public var dwVersion: UInt,
    public var dwResponderIdChoice: UInt,
    public var anonymous: OcspBasicResponseInfo0,
    public var producedAt: Filetime,
    public var cResponseEntry: UInt,
    rgResponseEntryCtorArg: MutPtr,
    public var cExtension: UInt,
    rgExtensionCtorArg: MutPtr,
) {
    public var rgResponseEntry: MutPtr = rgResponseEntryCtorArg
        internal set

    public var rgExtension: MutPtr = rgExtensionCtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        dwResponderIdChoice = 0u,
        anonymous = OcspBasicResponseInfo0(),
        producedAt = Filetime(),
        cResponseEntry = 0u,
        rgResponseEntryCtorArg = MutPtr(0L),
        cExtension = 0u,
        rgExtensionCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwVersion

    public operator fun component2(): UInt = this.dwResponderIdChoice

    public operator fun component3(): OcspBasicResponseInfo0 = this.anonymous

    public operator fun component4(): Filetime = this.producedAt

    public operator fun component5(): UInt = this.cResponseEntry

    public operator fun component6(): MutPtr = this.rgResponseEntry

    public operator fun component7(): UInt = this.cExtension

    public operator fun component8(): MutPtr = this.rgExtension

    public fun copy(dwVersion: UInt = this.dwVersion, dwResponderIdChoice: UInt = this.dwResponderIdChoice, anonymous: OcspBasicResponseInfo0 = this.anonymous, producedAt: Filetime = this.producedAt, cResponseEntry: UInt = this.cResponseEntry, rgResponseEntry: MutPtr = this.rgResponseEntry, cExtension: UInt = this.cExtension, rgExtension: MutPtr = this.rgExtension): OcspBasicResponseInfo = OcspBasicResponseInfo(dwVersion = dwVersion, dwResponderIdChoice = dwResponderIdChoice, anonymous = anonymous, producedAt = producedAt, cResponseEntry = cResponseEntry, rgResponseEntryCtorArg = rgResponseEntry, cExtension = cExtension, rgExtensionCtorArg = rgExtension)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OcspBasicResponseInfo) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.dwResponderIdChoice != other.dwResponderIdChoice) return false
        if (this.anonymous != other.anonymous) return false
        if (this.producedAt != other.producedAt) return false
        if (this.cResponseEntry != other.cResponseEntry) return false
        if (this.rgResponseEntry != other.rgResponseEntry) return false
        if (this.cExtension != other.cExtension) return false
        if (this.rgExtension != other.rgExtension) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.dwResponderIdChoice.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.producedAt.hashCode()
        result = 31 * result + this.cResponseEntry.hashCode()
        result = 31 * result + this.rgResponseEntry.hashCode()
        result = 31 * result + this.cExtension.hashCode()
        result = 31 * result + this.rgExtension.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwVersion: UInt = 0u,
            dwResponderIdChoice: UInt = 0u,
            anonymous: OcspBasicResponseInfo0 = OcspBasicResponseInfo0(),
            producedAt: Filetime = Filetime(),
            cResponseEntry: UInt = 0u,
            rgResponseEntry: MutPtr = MutPtr(0L),
            cExtension: UInt = 0u,
            rgExtension: MutPtr = MutPtr(0L),
        ): OcspBasicResponseInfo =
            OcspBasicResponseInfo(
                dwVersion = dwVersion,
                dwResponderIdChoice = dwResponderIdChoice,
                anonymous = anonymous,
                producedAt = producedAt,
                cResponseEntry = cResponseEntry,
                rgResponseEntryCtorArg = rgResponseEntry,
                cExtension = cExtension,
                rgExtensionCtorArg = rgExtension,
            )
    }
}

public data class OcspBasicResponseInfo0(
    public var byNameResponderId: CryptIntegerBlob = CryptIntegerBlob(),
    public var byKeyResponderId: CryptIntegerBlob = CryptIntegerBlob(),
)

public data class OcspBasicRevokedInfo(
    public var revocationDate: Filetime = Filetime(),
    public var dwCrlReasonCode: CertRevocationStatusReason = 0u,
)

public data class OcspBasicSignedResponseInfo(
    public var toBeSigned: CryptIntegerBlob = CryptIntegerBlob(),
    public var signatureInfo: OcspSignatureInfo = OcspSignatureInfo(),
)

public data class OcspCertId(
    public var hashAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var issuerNameHash: CryptIntegerBlob = CryptIntegerBlob(),
    public var issuerKeyHash: CryptIntegerBlob = CryptIntegerBlob(),
    public var serialNumber: CryptIntegerBlob = CryptIntegerBlob(),
)

public class OcspRequestEntry internal constructor(
    public var certId: OcspCertId,
    public var cExtension: UInt,
    rgExtensionCtorArg: MutPtr,
) {
    public var rgExtension: MutPtr = rgExtensionCtorArg
        internal set

    public constructor() : this(
        certId = OcspCertId(),
        cExtension = 0u,
        rgExtensionCtorArg = MutPtr(0L),
    )

    public operator fun component1(): OcspCertId = this.certId

    public operator fun component2(): UInt = this.cExtension

    public operator fun component3(): MutPtr = this.rgExtension

    public fun copy(certId: OcspCertId = this.certId, cExtension: UInt = this.cExtension, rgExtension: MutPtr = this.rgExtension): OcspRequestEntry = OcspRequestEntry(certId = certId, cExtension = cExtension, rgExtensionCtorArg = rgExtension)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OcspRequestEntry) return false
        if (this.certId != other.certId) return false
        if (this.cExtension != other.cExtension) return false
        if (this.rgExtension != other.rgExtension) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.certId.hashCode()
        result = 31 * result + this.cExtension.hashCode()
        result = 31 * result + this.rgExtension.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            certId: OcspCertId = OcspCertId(),
            cExtension: UInt = 0u,
            rgExtension: MutPtr = MutPtr(0L),
        ): OcspRequestEntry =
            OcspRequestEntry(
                certId = certId,
                cExtension = cExtension,
                rgExtensionCtorArg = rgExtension,
            )
    }
}

public class OcspRequestInfo internal constructor(
    public var dwVersion: UInt,
    pRequestorNameCtorArg: MutPtr,
    public var cRequestEntry: UInt,
    rgRequestEntryCtorArg: MutPtr,
    public var cExtension: UInt,
    rgExtensionCtorArg: MutPtr,
) {
    public var pRequestorName: MutPtr = pRequestorNameCtorArg
        internal set

    public var rgRequestEntry: MutPtr = rgRequestEntryCtorArg
        internal set

    public var rgExtension: MutPtr = rgExtensionCtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        pRequestorNameCtorArg = MutPtr(0L),
        cRequestEntry = 0u,
        rgRequestEntryCtorArg = MutPtr(0L),
        cExtension = 0u,
        rgExtensionCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwVersion

    public operator fun component2(): MutPtr = this.pRequestorName

    public operator fun component3(): UInt = this.cRequestEntry

    public operator fun component4(): MutPtr = this.rgRequestEntry

    public operator fun component5(): UInt = this.cExtension

    public operator fun component6(): MutPtr = this.rgExtension

    public fun copy(dwVersion: UInt = this.dwVersion, pRequestorName: MutPtr = this.pRequestorName, cRequestEntry: UInt = this.cRequestEntry, rgRequestEntry: MutPtr = this.rgRequestEntry, cExtension: UInt = this.cExtension, rgExtension: MutPtr = this.rgExtension): OcspRequestInfo = OcspRequestInfo(dwVersion = dwVersion, pRequestorNameCtorArg = pRequestorName, cRequestEntry = cRequestEntry, rgRequestEntryCtorArg = rgRequestEntry, cExtension = cExtension, rgExtensionCtorArg = rgExtension)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OcspRequestInfo) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.pRequestorName != other.pRequestorName) return false
        if (this.cRequestEntry != other.cRequestEntry) return false
        if (this.rgRequestEntry != other.rgRequestEntry) return false
        if (this.cExtension != other.cExtension) return false
        if (this.rgExtension != other.rgExtension) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.pRequestorName.hashCode()
        result = 31 * result + this.cRequestEntry.hashCode()
        result = 31 * result + this.rgRequestEntry.hashCode()
        result = 31 * result + this.cExtension.hashCode()
        result = 31 * result + this.rgExtension.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<OcspRequestInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<OcspRequestInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): OcspRequestInfo =
                    OcspRequestInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: OcspRequestInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVersion)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pRequestorName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cRequestEntry)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.rgRequestEntry)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.cExtension)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 40L, value.rgExtension)
                }
            }

        public operator fun invoke(
            dwVersion: UInt = 0u,
            pRequestorName: MutPtr = MutPtr(0L),
            cRequestEntry: UInt = 0u,
            rgRequestEntry: MutPtr = MutPtr(0L),
            cExtension: UInt = 0u,
            rgExtension: MutPtr = MutPtr(0L),
        ): OcspRequestInfo =
            OcspRequestInfo(
                dwVersion = dwVersion,
                pRequestorNameCtorArg = pRequestorName,
                cRequestEntry = cRequestEntry,
                rgRequestEntryCtorArg = rgRequestEntry,
                cExtension = cExtension,
                rgExtensionCtorArg = rgExtension,
            )
    }
}

public class OcspResponseInfo internal constructor(
    public var dwStatus: UInt,
    pszObjIdCtorArg: Pstr,
    public var value: CryptIntegerBlob,
) {
    public var pszObjId: Pstr = pszObjIdCtorArg
        internal set

    public constructor() : this(
        dwStatus = 0u,
        pszObjIdCtorArg = MutPtr(0L),
        value = CryptIntegerBlob(),
    )

    public operator fun component1(): UInt = this.dwStatus

    public operator fun component2(): Pstr = this.pszObjId

    public operator fun component3(): CryptIntegerBlob = this.value

    public fun copy(dwStatus: UInt = this.dwStatus, pszObjId: Pstr = this.pszObjId, value: CryptIntegerBlob = this.value): OcspResponseInfo = OcspResponseInfo(dwStatus = dwStatus, pszObjIdCtorArg = pszObjId, value = value)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OcspResponseInfo) return false
        if (this.dwStatus != other.dwStatus) return false
        if (this.pszObjId != other.pszObjId) return false
        if (this.value != other.value) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwStatus.hashCode()
        result = 31 * result + this.pszObjId.hashCode()
        result = 31 * result + this.value.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwStatus: UInt = 0u,
            pszObjId: Pstr = MutPtr(0L),
            value: CryptIntegerBlob = CryptIntegerBlob(),
        ): OcspResponseInfo =
            OcspResponseInfo(
                dwStatus = dwStatus,
                pszObjIdCtorArg = pszObjId,
                value = value,
            )
    }
}

public class OcspSignatureInfo internal constructor(
    public var signatureAlgorithm: CryptAlgorithmIdentifier,
    public var signature: CryptBitBlob,
    public var cCertEncoded: UInt,
    rgCertEncodedCtorArg: MutPtr,
) {
    public var rgCertEncoded: MutPtr = rgCertEncodedCtorArg
        internal set

    public constructor() : this(
        signatureAlgorithm = CryptAlgorithmIdentifier(),
        signature = CryptBitBlob(),
        cCertEncoded = 0u,
        rgCertEncodedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CryptAlgorithmIdentifier = this.signatureAlgorithm

    public operator fun component2(): CryptBitBlob = this.signature

    public operator fun component3(): UInt = this.cCertEncoded

    public operator fun component4(): MutPtr = this.rgCertEncoded

    public fun copy(signatureAlgorithm: CryptAlgorithmIdentifier = this.signatureAlgorithm, signature: CryptBitBlob = this.signature, cCertEncoded: UInt = this.cCertEncoded, rgCertEncoded: MutPtr = this.rgCertEncoded): OcspSignatureInfo = OcspSignatureInfo(signatureAlgorithm = signatureAlgorithm, signature = signature, cCertEncoded = cCertEncoded, rgCertEncodedCtorArg = rgCertEncoded)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OcspSignatureInfo) return false
        if (this.signatureAlgorithm != other.signatureAlgorithm) return false
        if (this.signature != other.signature) return false
        if (this.cCertEncoded != other.cCertEncoded) return false
        if (this.rgCertEncoded != other.rgCertEncoded) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.signatureAlgorithm.hashCode()
        result = 31 * result + this.signature.hashCode()
        result = 31 * result + this.cCertEncoded.hashCode()
        result = 31 * result + this.rgCertEncoded.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            signatureAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
            signature: CryptBitBlob = CryptBitBlob(),
            cCertEncoded: UInt = 0u,
            rgCertEncoded: MutPtr = MutPtr(0L),
        ): OcspSignatureInfo =
            OcspSignatureInfo(
                signatureAlgorithm = signatureAlgorithm,
                signature = signature,
                cCertEncoded = cCertEncoded,
                rgCertEncodedCtorArg = rgCertEncoded,
            )
    }
}

public class OcspSignedRequestInfo internal constructor(
    public var toBeSigned: CryptIntegerBlob,
    pOptionalSignatureInfoCtorArg: MutPtr,
) {
    public var pOptionalSignatureInfo: MutPtr = pOptionalSignatureInfoCtorArg
        internal set

    public constructor() : this(
        toBeSigned = CryptIntegerBlob(),
        pOptionalSignatureInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CryptIntegerBlob = this.toBeSigned

    public operator fun component2(): MutPtr = this.pOptionalSignatureInfo

    public fun copy(toBeSigned: CryptIntegerBlob = this.toBeSigned, pOptionalSignatureInfo: MutPtr = this.pOptionalSignatureInfo): OcspSignedRequestInfo = OcspSignedRequestInfo(toBeSigned = toBeSigned, pOptionalSignatureInfoCtorArg = pOptionalSignatureInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OcspSignedRequestInfo) return false
        if (this.toBeSigned != other.toBeSigned) return false
        if (this.pOptionalSignatureInfo != other.pOptionalSignatureInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.toBeSigned.hashCode()
        result = 31 * result + this.pOptionalSignatureInfo.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<OcspSignedRequestInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<OcspSignedRequestInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): OcspSignedRequestInfo =
                    OcspSignedRequestInfo(
                        (CryptIntegerBlob.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: OcspSignedRequestInfo) {
                    (CryptIntegerBlob.typeLayout()).writeNative(addr, value.toBeSigned)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.pOptionalSignatureInfo)
                }
            }

        public operator fun invoke(
            toBeSigned: CryptIntegerBlob = CryptIntegerBlob(),
            pOptionalSignatureInfo: MutPtr = MutPtr(0L),
        ): OcspSignedRequestInfo =
            OcspSignedRequestInfo(
                toBeSigned = toBeSigned,
                pOptionalSignatureInfoCtorArg = pOptionalSignatureInfo,
            )
    }
}

public class OffloadPrivateKey internal constructor(
    public var dwVersion: UInt,
    public var cbPrime1: UInt,
    public var cbPrime2: UInt,
    pbPrime1CtorArg: MutPtr,
    pbPrime2CtorArg: MutPtr,
) {
    public var pbPrime1: MutPtr = pbPrime1CtorArg
        internal set

    public var pbPrime2: MutPtr = pbPrime2CtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        cbPrime1 = 0u,
        cbPrime2 = 0u,
        pbPrime1CtorArg = MutPtr(0L),
        pbPrime2CtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwVersion

    public operator fun component2(): UInt = this.cbPrime1

    public operator fun component3(): UInt = this.cbPrime2

    public operator fun component4(): MutPtr = this.pbPrime1

    public operator fun component5(): MutPtr = this.pbPrime2

    public fun copy(dwVersion: UInt = this.dwVersion, cbPrime1: UInt = this.cbPrime1, cbPrime2: UInt = this.cbPrime2, pbPrime1: MutPtr = this.pbPrime1, pbPrime2: MutPtr = this.pbPrime2): OffloadPrivateKey = OffloadPrivateKey(dwVersion = dwVersion, cbPrime1 = cbPrime1, cbPrime2 = cbPrime2, pbPrime1CtorArg = pbPrime1, pbPrime2CtorArg = pbPrime2)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OffloadPrivateKey) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.cbPrime1 != other.cbPrime1) return false
        if (this.cbPrime2 != other.cbPrime2) return false
        if (this.pbPrime1 != other.pbPrime1) return false
        if (this.pbPrime2 != other.pbPrime2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.cbPrime1.hashCode()
        result = 31 * result + this.cbPrime2.hashCode()
        result = 31 * result + this.pbPrime1.hashCode()
        result = 31 * result + this.pbPrime2.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<OffloadPrivateKey> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<OffloadPrivateKey> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): OffloadPrivateKey =
                    OffloadPrivateKey(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: OffloadPrivateKey) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cbPrime1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cbPrime2)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.pbPrime1)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.pbPrime2)
                }
            }

        public operator fun invoke(
            dwVersion: UInt = 0u,
            cbPrime1: UInt = 0u,
            cbPrime2: UInt = 0u,
            pbPrime1: MutPtr = MutPtr(0L),
            pbPrime2: MutPtr = MutPtr(0L),
        ): OffloadPrivateKey =
            OffloadPrivateKey(
                dwVersion = dwVersion,
                cbPrime1 = cbPrime1,
                cbPrime2 = cbPrime2,
                pbPrime1CtorArg = pbPrime1,
                pbPrime2CtorArg = pbPrime2,
            )
    }
}

public data class PinCachePolicy(
    public var dwVersion: UInt = 0u,
    public var pinCachePolicyType: PinCachePolicyType = 0,
    public var dwPinCachePolicyInfo: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PinCachePolicy> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PinCachePolicy> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): PinCachePolicy =
                    PinCachePolicy(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PinCachePolicy) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.pinCachePolicyType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwPinCachePolicyInfo)
                }
            }
    }
}

public data class PinInfo(
    public var dwVersion: UInt = 0u,
    public var pinType: SecretType = 0,
    public var pinPurpose: SecretPurpose = 0,
    public var dwChangePermission: UInt = 0u,
    public var dwUnblockPermission: UInt = 0u,
    public var pinCachePolicy: PinCachePolicy = PinCachePolicy(),
    public var dwFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PinInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PinInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 36L
                override fun readNative(addr: Long): PinInfo =
                    PinInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (PinCachePolicy.typeLayout()).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: PinInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.pinType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.pinPurpose)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwChangePermission)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwUnblockPermission)
                    (PinCachePolicy.typeLayout()).writeNative(addr + 20L, value.pinCachePolicy)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwFlags)
                }
            }
    }
}

public class Pkcs12Pbes2ExportParams internal constructor(
    public var dwSize: UInt,
    hNcryptDescriptorCtorArg: MutPtr,
    pwszPbes2AlgCtorArg: Pwstr,
) {
    public var hNcryptDescriptor: MutPtr = hNcryptDescriptorCtorArg
        internal set

    public var pwszPbes2Alg: Pwstr = pwszPbes2AlgCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        hNcryptDescriptorCtorArg = MutPtr(0L),
        pwszPbes2AlgCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): MutPtr = this.hNcryptDescriptor

    public operator fun component3(): Pwstr = this.pwszPbes2Alg

    public fun copy(dwSize: UInt = this.dwSize, hNcryptDescriptor: MutPtr = this.hNcryptDescriptor, pwszPbes2Alg: Pwstr = this.pwszPbes2Alg): Pkcs12Pbes2ExportParams = Pkcs12Pbes2ExportParams(dwSize = dwSize, hNcryptDescriptorCtorArg = hNcryptDescriptor, pwszPbes2AlgCtorArg = pwszPbes2Alg)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Pkcs12Pbes2ExportParams) return false
        if (this.dwSize != other.dwSize) return false
        if (this.hNcryptDescriptor != other.hNcryptDescriptor) return false
        if (this.pwszPbes2Alg != other.pwszPbes2Alg) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.hNcryptDescriptor.hashCode()
        result = 31 * result + this.pwszPbes2Alg.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            hNcryptDescriptor: MutPtr = MutPtr(0L),
            pwszPbes2Alg: Pwstr = MutPtr(0L),
        ): Pkcs12Pbes2ExportParams =
            Pkcs12Pbes2ExportParams(
                dwSize = dwSize,
                hNcryptDescriptorCtorArg = hNcryptDescriptor,
                pwszPbes2AlgCtorArg = pwszPbes2Alg,
            )
    }
}

public class PolicyElement internal constructor(
    targetEndpointAddressCtorArg: Pcwstr,
    issuerEndpointAddressCtorArg: Pcwstr,
    issuedTokenParametersCtorArg: Pcwstr,
    privacyNoticeLinkCtorArg: Pcwstr,
    public var privacyNoticeVersion: UInt,
    public var useManagedPresentation: Bool,
) {
    public var targetEndpointAddress: Pcwstr = targetEndpointAddressCtorArg
        internal set

    public var issuerEndpointAddress: Pcwstr = issuerEndpointAddressCtorArg
        internal set

    public var issuedTokenParameters: Pcwstr = issuedTokenParametersCtorArg
        internal set

    public var privacyNoticeLink: Pcwstr = privacyNoticeLinkCtorArg
        internal set

    public constructor() : this(
        targetEndpointAddressCtorArg = ConstPtr(0L),
        issuerEndpointAddressCtorArg = ConstPtr(0L),
        issuedTokenParametersCtorArg = ConstPtr(0L),
        privacyNoticeLinkCtorArg = ConstPtr(0L),
        privacyNoticeVersion = 0u,
        useManagedPresentation = 0,
    )

    public operator fun component1(): Pcwstr = this.targetEndpointAddress

    public operator fun component2(): Pcwstr = this.issuerEndpointAddress

    public operator fun component3(): Pcwstr = this.issuedTokenParameters

    public operator fun component4(): Pcwstr = this.privacyNoticeLink

    public operator fun component5(): UInt = this.privacyNoticeVersion

    public operator fun component6(): Bool = this.useManagedPresentation

    public fun copy(targetEndpointAddress: Pcwstr = this.targetEndpointAddress, issuerEndpointAddress: Pcwstr = this.issuerEndpointAddress, issuedTokenParameters: Pcwstr = this.issuedTokenParameters, privacyNoticeLink: Pcwstr = this.privacyNoticeLink, privacyNoticeVersion: UInt = this.privacyNoticeVersion, useManagedPresentation: Bool = this.useManagedPresentation): PolicyElement = PolicyElement(targetEndpointAddressCtorArg = targetEndpointAddress, issuerEndpointAddressCtorArg = issuerEndpointAddress, issuedTokenParametersCtorArg = issuedTokenParameters, privacyNoticeLinkCtorArg = privacyNoticeLink, privacyNoticeVersion = privacyNoticeVersion, useManagedPresentation = useManagedPresentation)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PolicyElement) return false
        if (this.targetEndpointAddress != other.targetEndpointAddress) return false
        if (this.issuerEndpointAddress != other.issuerEndpointAddress) return false
        if (this.issuedTokenParameters != other.issuedTokenParameters) return false
        if (this.privacyNoticeLink != other.privacyNoticeLink) return false
        if (this.privacyNoticeVersion != other.privacyNoticeVersion) return false
        if (this.useManagedPresentation != other.useManagedPresentation) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.targetEndpointAddress.hashCode()
        result = 31 * result + this.issuerEndpointAddress.hashCode()
        result = 31 * result + this.issuedTokenParameters.hashCode()
        result = 31 * result + this.privacyNoticeLink.hashCode()
        result = 31 * result + this.privacyNoticeVersion.hashCode()
        result = 31 * result + this.useManagedPresentation.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            targetEndpointAddress: Pcwstr = ConstPtr(0L),
            issuerEndpointAddress: Pcwstr = ConstPtr(0L),
            issuedTokenParameters: Pcwstr = ConstPtr(0L),
            privacyNoticeLink: Pcwstr = ConstPtr(0L),
            privacyNoticeVersion: UInt = 0u,
            useManagedPresentation: Bool = 0,
        ): PolicyElement =
            PolicyElement(
                targetEndpointAddressCtorArg = targetEndpointAddress,
                issuerEndpointAddressCtorArg = issuerEndpointAddress,
                issuedTokenParametersCtorArg = issuedTokenParameters,
                privacyNoticeLinkCtorArg = privacyNoticeLink,
                privacyNoticeVersion = privacyNoticeVersion,
                useManagedPresentation = useManagedPresentation,
            )
    }
}

public data class Privkeyver3(
    public var magic: UInt = 0u,
    public var bitlenP: UInt = 0u,
    public var bitlenQ: UInt = 0u,
    public var bitlenJ: UInt = 0u,
    public var bitlenX: UInt = 0u,
    public var dSSSeed: Dssseed = Dssseed(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Privkeyver3> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Privkeyver3> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 44L
                override fun readNative(addr: Long): Privkeyver3 =
                    Privkeyver3(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (Dssseed.typeLayout()).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: Privkeyver3) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.magic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.bitlenP)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.bitlenQ)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.bitlenJ)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.bitlenX)
                    (Dssseed.typeLayout()).writeNative(addr + 20L, value.dSSSeed)
                }
            }
    }
}

public data class ProvEnumalgs(
    public var aiAlgid: AlgId = 0u,
    public var dwBitLen: UInt = 0u,
    public var dwNameLen: UInt = 0u,
    public var szName: ByteArray = ByteArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProvEnumalgs) return false
        if (this.aiAlgid != other.aiAlgid) return false
        if (this.dwBitLen != other.dwBitLen) return false
        if (this.dwNameLen != other.dwNameLen) return false
        if (!this.szName.contentEquals(other.szName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.aiAlgid.hashCode()
        result = 31 * result + this.dwBitLen.hashCode()
        result = 31 * result + this.dwNameLen.hashCode()
        result = 31 * result + this.szName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProvEnumalgs> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProvEnumalgs> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): ProvEnumalgs =
                    ProvEnumalgs(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (20).toInt())
                        ).readNative(addr + 12L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: ProvEnumalgs) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.aiAlgid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwBitLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwNameLen)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (20).toInt())
                    ).writeNative(addr + 12L, value.szName.toList())
                }
            }
    }
}

public data class ProvEnumalgsEx(
    public var aiAlgid: AlgId = 0u,
    public var dwDefaultLen: UInt = 0u,
    public var dwMinLen: UInt = 0u,
    public var dwMaxLen: UInt = 0u,
    public var dwProtocols: UInt = 0u,
    public var dwNameLen: UInt = 0u,
    public var szName: ByteArray = ByteArray(20),
    public var dwLongNameLen: UInt = 0u,
    public var szLongName: ByteArray = ByteArray(40),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProvEnumalgsEx) return false
        if (this.aiAlgid != other.aiAlgid) return false
        if (this.dwDefaultLen != other.dwDefaultLen) return false
        if (this.dwMinLen != other.dwMinLen) return false
        if (this.dwMaxLen != other.dwMaxLen) return false
        if (this.dwProtocols != other.dwProtocols) return false
        if (this.dwNameLen != other.dwNameLen) return false
        if (!this.szName.contentEquals(other.szName)) return false
        if (this.dwLongNameLen != other.dwLongNameLen) return false
        if (!this.szLongName.contentEquals(other.szLongName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.aiAlgid.hashCode()
        result = 31 * result + this.dwDefaultLen.hashCode()
        result = 31 * result + this.dwMinLen.hashCode()
        result = 31 * result + this.dwMaxLen.hashCode()
        result = 31 * result + this.dwProtocols.hashCode()
        result = 31 * result + this.dwNameLen.hashCode()
        result = 31 * result + this.szName.contentHashCode()
        result = 31 * result + this.dwLongNameLen.hashCode()
        result = 31 * result + this.szLongName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProvEnumalgsEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProvEnumalgsEx> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 88L
                override fun readNative(addr: Long): ProvEnumalgsEx =
                    ProvEnumalgsEx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (20).toInt())
                        ).readNative(addr + 24L).toByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (40).toInt())
                        ).readNative(addr + 48L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: ProvEnumalgsEx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.aiAlgid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwDefaultLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwMinLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwMaxLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwProtocols)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwNameLen)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (20).toInt())
                    ).writeNative(addr + 24L, value.szName.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.dwLongNameLen)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (40).toInt())
                    ).writeNative(addr + 48L, value.szLongName.toList())
                }
            }
    }
}

public data class Pubkey(
    public var magic: UInt = 0u,
    public var bitlen: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Pubkey> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Pubkey> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Pubkey =
                    Pubkey(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Pubkey) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.magic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.bitlen)
                }
            }
    }
}

public data class Pubkeyver3(
    public var magic: UInt = 0u,
    public var bitlenP: UInt = 0u,
    public var bitlenQ: UInt = 0u,
    public var bitlenJ: UInt = 0u,
    public var dSSSeed: Dssseed = Dssseed(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Pubkeyver3> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Pubkeyver3> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): Pubkeyver3 =
                    Pubkeyver3(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (Dssseed.typeLayout()).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Pubkeyver3) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.magic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.bitlenP)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.bitlenQ)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.bitlenJ)
                    (Dssseed.typeLayout()).writeNative(addr + 16L, value.dSSSeed)
                }
            }
    }
}

public data class Publickeystruc(
    public var bType: UByte = 0u,
    public var bVersion: UByte = 0u,
    public var reserved: UShort = 0u,
    public var aiKeyAlg: AlgId = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Publickeystruc> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Publickeystruc> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Publickeystruc =
                    Publickeystruc(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Publickeystruc) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.bVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.aiKeyAlg)
                }
            }
    }
}

public data class PaddingMode(
    public var value: Int = 0,
) {
    public var field0: Int
        get() = value
        set(v) {
            value = v
        }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PaddingMode> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PaddingMode> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PaddingMode =
                    PaddingMode(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PaddingMode) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.value)
                }
            }

        public val NONE: PaddingMode = PaddingMode(1)

        public val PKCS7: PaddingMode = PaddingMode(2)

        public val ZEROS: PaddingMode = PaddingMode(3)

        public val ANSIX923: PaddingMode = PaddingMode(4)

        public val ISO10126: PaddingMode = PaddingMode(5)
    }
}

public class Recipientpolicy internal constructor(
    public var recipient: Endpointaddress,
    public var issuer: Endpointaddress,
    tokenTypeCtorArg: Pcwstr,
    public var requiredClaims: Claimlist,
    public var optionalClaims: Claimlist,
    privacyUrlCtorArg: Pcwstr,
    public var privacyVersion: UInt,
) {
    public var tokenType: Pcwstr = tokenTypeCtorArg
        internal set

    public var privacyUrl: Pcwstr = privacyUrlCtorArg
        internal set

    public constructor() : this(
        recipient = Endpointaddress(),
        issuer = Endpointaddress(),
        tokenTypeCtorArg = ConstPtr(0L),
        requiredClaims = Claimlist(),
        optionalClaims = Claimlist(),
        privacyUrlCtorArg = ConstPtr(0L),
        privacyVersion = 0u,
    )

    public operator fun component1(): Endpointaddress = this.recipient

    public operator fun component2(): Endpointaddress = this.issuer

    public operator fun component3(): Pcwstr = this.tokenType

    public operator fun component4(): Claimlist = this.requiredClaims

    public operator fun component5(): Claimlist = this.optionalClaims

    public operator fun component6(): Pcwstr = this.privacyUrl

    public operator fun component7(): UInt = this.privacyVersion

    public fun copy(recipient: Endpointaddress = this.recipient, issuer: Endpointaddress = this.issuer, tokenType: Pcwstr = this.tokenType, requiredClaims: Claimlist = this.requiredClaims, optionalClaims: Claimlist = this.optionalClaims, privacyUrl: Pcwstr = this.privacyUrl, privacyVersion: UInt = this.privacyVersion): Recipientpolicy = Recipientpolicy(recipient = recipient, issuer = issuer, tokenTypeCtorArg = tokenType, requiredClaims = requiredClaims, optionalClaims = optionalClaims, privacyUrlCtorArg = privacyUrl, privacyVersion = privacyVersion)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Recipientpolicy) return false
        if (this.recipient != other.recipient) return false
        if (this.issuer != other.issuer) return false
        if (this.tokenType != other.tokenType) return false
        if (this.requiredClaims != other.requiredClaims) return false
        if (this.optionalClaims != other.optionalClaims) return false
        if (this.privacyUrl != other.privacyUrl) return false
        if (this.privacyVersion != other.privacyVersion) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.recipient.hashCode()
        result = 31 * result + this.issuer.hashCode()
        result = 31 * result + this.tokenType.hashCode()
        result = 31 * result + this.requiredClaims.hashCode()
        result = 31 * result + this.optionalClaims.hashCode()
        result = 31 * result + this.privacyUrl.hashCode()
        result = 31 * result + this.privacyVersion.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            recipient: Endpointaddress = Endpointaddress(),
            issuer: Endpointaddress = Endpointaddress(),
            tokenType: Pcwstr = ConstPtr(0L),
            requiredClaims: Claimlist = Claimlist(),
            optionalClaims: Claimlist = Claimlist(),
            privacyUrl: Pcwstr = ConstPtr(0L),
            privacyVersion: UInt = 0u,
        ): Recipientpolicy =
            Recipientpolicy(
                recipient = recipient,
                issuer = issuer,
                tokenTypeCtorArg = tokenType,
                requiredClaims = requiredClaims,
                optionalClaims = optionalClaims,
                privacyUrlCtorArg = privacyUrl,
                privacyVersion = privacyVersion,
            )
    }
}

public class Recipientpolicy2 internal constructor(
    public var recipient: Endpointaddress2,
    public var issuer: Endpointaddress2,
    tokenTypeCtorArg: Pcwstr,
    public var requiredClaims: Claimlist,
    public var optionalClaims: Claimlist,
    privacyUrlCtorArg: Pcwstr,
    public var privacyVersion: UInt,
) {
    public var tokenType: Pcwstr = tokenTypeCtorArg
        internal set

    public var privacyUrl: Pcwstr = privacyUrlCtorArg
        internal set

    public constructor() : this(
        recipient = Endpointaddress2(),
        issuer = Endpointaddress2(),
        tokenTypeCtorArg = ConstPtr(0L),
        requiredClaims = Claimlist(),
        optionalClaims = Claimlist(),
        privacyUrlCtorArg = ConstPtr(0L),
        privacyVersion = 0u,
    )

    public operator fun component1(): Endpointaddress2 = this.recipient

    public operator fun component2(): Endpointaddress2 = this.issuer

    public operator fun component3(): Pcwstr = this.tokenType

    public operator fun component4(): Claimlist = this.requiredClaims

    public operator fun component5(): Claimlist = this.optionalClaims

    public operator fun component6(): Pcwstr = this.privacyUrl

    public operator fun component7(): UInt = this.privacyVersion

    public fun copy(recipient: Endpointaddress2 = this.recipient, issuer: Endpointaddress2 = this.issuer, tokenType: Pcwstr = this.tokenType, requiredClaims: Claimlist = this.requiredClaims, optionalClaims: Claimlist = this.optionalClaims, privacyUrl: Pcwstr = this.privacyUrl, privacyVersion: UInt = this.privacyVersion): Recipientpolicy2 = Recipientpolicy2(recipient = recipient, issuer = issuer, tokenTypeCtorArg = tokenType, requiredClaims = requiredClaims, optionalClaims = optionalClaims, privacyUrlCtorArg = privacyUrl, privacyVersion = privacyVersion)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Recipientpolicy2) return false
        if (this.recipient != other.recipient) return false
        if (this.issuer != other.issuer) return false
        if (this.tokenType != other.tokenType) return false
        if (this.requiredClaims != other.requiredClaims) return false
        if (this.optionalClaims != other.optionalClaims) return false
        if (this.privacyUrl != other.privacyUrl) return false
        if (this.privacyVersion != other.privacyVersion) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.recipient.hashCode()
        result = 31 * result + this.issuer.hashCode()
        result = 31 * result + this.tokenType.hashCode()
        result = 31 * result + this.requiredClaims.hashCode()
        result = 31 * result + this.optionalClaims.hashCode()
        result = 31 * result + this.privacyUrl.hashCode()
        result = 31 * result + this.privacyVersion.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            recipient: Endpointaddress2 = Endpointaddress2(),
            issuer: Endpointaddress2 = Endpointaddress2(),
            tokenType: Pcwstr = ConstPtr(0L),
            requiredClaims: Claimlist = Claimlist(),
            optionalClaims: Claimlist = Claimlist(),
            privacyUrl: Pcwstr = ConstPtr(0L),
            privacyVersion: UInt = 0u,
        ): Recipientpolicy2 =
            Recipientpolicy2(
                recipient = recipient,
                issuer = issuer,
                tokenTypeCtorArg = tokenType,
                requiredClaims = requiredClaims,
                optionalClaims = optionalClaims,
                privacyUrlCtorArg = privacyUrl,
                privacyVersion = privacyVersion,
            )
    }
}

public data class RootInfoLuid(
    public var lowPart: UInt = 0u,
    public var highPart: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RootInfoLuid> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RootInfoLuid> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): RootInfoLuid =
                    RootInfoLuid(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: RootInfoLuid) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.lowPart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.highPart)
                }
            }
    }
}

public data class Rsapubkey(
    public var magic: UInt = 0u,
    public var bitlen: UInt = 0u,
    public var pubexp: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rsapubkey> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rsapubkey> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): Rsapubkey =
                    Rsapubkey(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Rsapubkey) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.magic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.bitlen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.pubexp)
                }
            }
    }
}

public data class SchannelAlg(
    public var dwUse: UInt = 0u,
    public var algid: AlgId = 0u,
    public var cBits: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwReserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SchannelAlg> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SchannelAlg> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): SchannelAlg =
                    SchannelAlg(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: SchannelAlg) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwUse)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.algid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cBits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwReserved)
                }
            }
    }
}

public class SignerAttrAuthcode internal constructor(
    public var cbSize: UInt,
    public var fCommercial: Bool,
    public var fIndividual: Bool,
    pwszNameCtorArg: Pcwstr,
    pwszInfoCtorArg: Pcwstr,
) {
    public var pwszName: Pcwstr = pwszNameCtorArg
        internal set

    public var pwszInfo: Pcwstr = pwszInfoCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        fCommercial = 0,
        fIndividual = 0,
        pwszNameCtorArg = ConstPtr(0L),
        pwszInfoCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Bool = this.fCommercial

    public operator fun component3(): Bool = this.fIndividual

    public operator fun component4(): Pcwstr = this.pwszName

    public operator fun component5(): Pcwstr = this.pwszInfo

    public fun copy(cbSize: UInt = this.cbSize, fCommercial: Bool = this.fCommercial, fIndividual: Bool = this.fIndividual, pwszName: Pcwstr = this.pwszName, pwszInfo: Pcwstr = this.pwszInfo): SignerAttrAuthcode = SignerAttrAuthcode(cbSize = cbSize, fCommercial = fCommercial, fIndividual = fIndividual, pwszNameCtorArg = pwszName, pwszInfoCtorArg = pwszInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SignerAttrAuthcode) return false
        if (this.cbSize != other.cbSize) return false
        if (this.fCommercial != other.fCommercial) return false
        if (this.fIndividual != other.fIndividual) return false
        if (this.pwszName != other.pwszName) return false
        if (this.pwszInfo != other.pwszInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.fCommercial.hashCode()
        result = 31 * result + this.fIndividual.hashCode()
        result = 31 * result + this.pwszName.hashCode()
        result = 31 * result + this.pwszInfo.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            fCommercial: Bool = 0,
            fIndividual: Bool = 0,
            pwszName: Pcwstr = ConstPtr(0L),
            pwszInfo: Pcwstr = ConstPtr(0L),
        ): SignerAttrAuthcode =
            SignerAttrAuthcode(
                cbSize = cbSize,
                fCommercial = fCommercial,
                fIndividual = fIndividual,
                pwszNameCtorArg = pwszName,
                pwszInfoCtorArg = pwszInfo,
            )
    }
}

public class SignerBlobInfo internal constructor(
    public var cbSize: UInt,
    pGuidSubjectCtorArg: MutPtr,
    public var cbBlob: UInt,
    pbBlobCtorArg: MutPtr,
    pwszDisplayNameCtorArg: Pcwstr,
) {
    public var pGuidSubject: MutPtr = pGuidSubjectCtorArg
        internal set

    public var pbBlob: MutPtr = pbBlobCtorArg
        internal set

    public var pwszDisplayName: Pcwstr = pwszDisplayNameCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        pGuidSubjectCtorArg = MutPtr(0L),
        cbBlob = 0u,
        pbBlobCtorArg = MutPtr(0L),
        pwszDisplayNameCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): MutPtr = this.pGuidSubject

    public operator fun component3(): UInt = this.cbBlob

    public operator fun component4(): MutPtr = this.pbBlob

    public operator fun component5(): Pcwstr = this.pwszDisplayName

    public fun copy(cbSize: UInt = this.cbSize, pGuidSubject: MutPtr = this.pGuidSubject, cbBlob: UInt = this.cbBlob, pbBlob: MutPtr = this.pbBlob, pwszDisplayName: Pcwstr = this.pwszDisplayName): SignerBlobInfo = SignerBlobInfo(cbSize = cbSize, pGuidSubjectCtorArg = pGuidSubject, cbBlob = cbBlob, pbBlobCtorArg = pbBlob, pwszDisplayNameCtorArg = pwszDisplayName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SignerBlobInfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.pGuidSubject != other.pGuidSubject) return false
        if (this.cbBlob != other.cbBlob) return false
        if (this.pbBlob != other.pbBlob) return false
        if (this.pwszDisplayName != other.pwszDisplayName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.pGuidSubject.hashCode()
        result = 31 * result + this.cbBlob.hashCode()
        result = 31 * result + this.pbBlob.hashCode()
        result = 31 * result + this.pwszDisplayName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            pGuidSubject: MutPtr = MutPtr(0L),
            cbBlob: UInt = 0u,
            pbBlob: MutPtr = MutPtr(0L),
            pwszDisplayName: Pcwstr = ConstPtr(0L),
        ): SignerBlobInfo =
            SignerBlobInfo(
                cbSize = cbSize,
                pGuidSubjectCtorArg = pGuidSubject,
                cbBlob = cbBlob,
                pbBlobCtorArg = pbBlob,
                pwszDisplayNameCtorArg = pwszDisplayName,
            )
    }
}

public class SignerCert internal constructor(
    public var cbSize: UInt,
    public var dwCertChoice: SignerCertChoice,
    public var anonymous: SignerCert0,
    hwndCtorArg: Hwnd,
) {
    public var hwnd: Hwnd = hwndCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        dwCertChoice = 0u,
        anonymous = SignerCert0(),
        hwndCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): SignerCertChoice = this.dwCertChoice

    public operator fun component3(): SignerCert0 = this.anonymous

    public operator fun component4(): Hwnd = this.hwnd

    public fun copy(cbSize: UInt = this.cbSize, dwCertChoice: SignerCertChoice = this.dwCertChoice, anonymous: SignerCert0 = this.anonymous, hwnd: Hwnd = this.hwnd): SignerCert = SignerCert(cbSize = cbSize, dwCertChoice = dwCertChoice, anonymous = anonymous, hwndCtorArg = hwnd)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SignerCert) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwCertChoice != other.dwCertChoice) return false
        if (this.anonymous != other.anonymous) return false
        if (this.hwnd != other.hwnd) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwCertChoice.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.hwnd.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            dwCertChoice: SignerCertChoice = 0u,
            anonymous: SignerCert0 = SignerCert0(),
            hwnd: Hwnd = MutPtr(0L),
        ): SignerCert =
            SignerCert(
                cbSize = cbSize,
                dwCertChoice = dwCertChoice,
                anonymous = anonymous,
                hwndCtorArg = hwnd,
            )
    }
}

public class SignerCert0 internal constructor(
    pwszSpcFileCtorArg: Pcwstr,
    pCertStoreInfoCtorArg: MutPtr,
    pSpcChainInfoCtorArg: MutPtr,
) {
    public var pwszSpcFile: Pcwstr = pwszSpcFileCtorArg
        internal set

    public var pCertStoreInfo: MutPtr = pCertStoreInfoCtorArg
        internal set

    public var pSpcChainInfo: MutPtr = pSpcChainInfoCtorArg
        internal set

    public constructor() : this(
        pwszSpcFileCtorArg = ConstPtr(0L),
        pCertStoreInfoCtorArg = MutPtr(0L),
        pSpcChainInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pcwstr = this.pwszSpcFile

    public operator fun component2(): MutPtr = this.pCertStoreInfo

    public operator fun component3(): MutPtr = this.pSpcChainInfo

    public fun copy(pwszSpcFile: Pcwstr = this.pwszSpcFile, pCertStoreInfo: MutPtr = this.pCertStoreInfo, pSpcChainInfo: MutPtr = this.pSpcChainInfo): SignerCert0 = SignerCert0(pwszSpcFileCtorArg = pwszSpcFile, pCertStoreInfoCtorArg = pCertStoreInfo, pSpcChainInfoCtorArg = pSpcChainInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SignerCert0) return false
        if (this.pwszSpcFile != other.pwszSpcFile) return false
        if (this.pCertStoreInfo != other.pCertStoreInfo) return false
        if (this.pSpcChainInfo != other.pSpcChainInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwszSpcFile.hashCode()
        result = 31 * result + this.pCertStoreInfo.hashCode()
        result = 31 * result + this.pSpcChainInfo.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwszSpcFile: Pcwstr = ConstPtr(0L),
            pCertStoreInfo: MutPtr = MutPtr(0L),
            pSpcChainInfo: MutPtr = MutPtr(0L),
        ): SignerCert0 =
            SignerCert0(
                pwszSpcFileCtorArg = pwszSpcFile,
                pCertStoreInfoCtorArg = pCertStoreInfo,
                pSpcChainInfoCtorArg = pSpcChainInfo,
            )
    }
}

public class SignerCertStoreInfo internal constructor(
    public var cbSize: UInt,
    pSigningCertCtorArg: ConstPtr,
    public var dwCertPolicy: SignerCertPolicy,
    hCertStoreCtorArg: Hcertstore,
) {
    public var pSigningCert: ConstPtr = pSigningCertCtorArg
        internal set

    public var hCertStore: Hcertstore = hCertStoreCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        pSigningCertCtorArg = ConstPtr(0L),
        dwCertPolicy = 0u,
        hCertStoreCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): ConstPtr = this.pSigningCert

    public operator fun component3(): SignerCertPolicy = this.dwCertPolicy

    public operator fun component4(): Hcertstore = this.hCertStore

    public fun copy(cbSize: UInt = this.cbSize, pSigningCert: ConstPtr = this.pSigningCert, dwCertPolicy: SignerCertPolicy = this.dwCertPolicy, hCertStore: Hcertstore = this.hCertStore): SignerCertStoreInfo = SignerCertStoreInfo(cbSize = cbSize, pSigningCertCtorArg = pSigningCert, dwCertPolicy = dwCertPolicy, hCertStoreCtorArg = hCertStore)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SignerCertStoreInfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.pSigningCert != other.pSigningCert) return false
        if (this.dwCertPolicy != other.dwCertPolicy) return false
        if (this.hCertStore != other.hCertStore) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.pSigningCert.hashCode()
        result = 31 * result + this.dwCertPolicy.hashCode()
        result = 31 * result + this.hCertStore.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SignerCertStoreInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SignerCertStoreInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): SignerCertStoreInfo =
                    SignerCertStoreInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: SignerCertStoreInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout(64)
                    ).writeNative(addr + 8L, value.pSigningCert)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwCertPolicy)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.hCertStore)
                }
            }

        public operator fun invoke(
            cbSize: UInt = 0u,
            pSigningCert: ConstPtr = ConstPtr(0L),
            dwCertPolicy: SignerCertPolicy = 0u,
            hCertStore: Hcertstore = MutPtr(0L),
        ): SignerCertStoreInfo =
            SignerCertStoreInfo(
                cbSize = cbSize,
                pSigningCertCtorArg = pSigningCert,
                dwCertPolicy = dwCertPolicy,
                hCertStoreCtorArg = hCertStore,
            )
    }
}

public class SignerContext internal constructor(
    public var cbSize: UInt,
    public var cbBlob: UInt,
    pbBlobCtorArg: MutPtr,
) {
    public var pbBlob: MutPtr = pbBlobCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        cbBlob = 0u,
        pbBlobCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): UInt = this.cbBlob

    public operator fun component3(): MutPtr = this.pbBlob

    public fun copy(cbSize: UInt = this.cbSize, cbBlob: UInt = this.cbBlob, pbBlob: MutPtr = this.pbBlob): SignerContext = SignerContext(cbSize = cbSize, cbBlob = cbBlob, pbBlobCtorArg = pbBlob)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SignerContext) return false
        if (this.cbSize != other.cbSize) return false
        if (this.cbBlob != other.cbBlob) return false
        if (this.pbBlob != other.pbBlob) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.cbBlob.hashCode()
        result = 31 * result + this.pbBlob.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SignerContext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SignerContext> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SignerContext =
                    SignerContext(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SignerContext) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cbBlob)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pbBlob)
                }
            }

        public operator fun invoke(
            cbSize: UInt = 0u,
            cbBlob: UInt = 0u,
            pbBlob: MutPtr = MutPtr(0L),
        ): SignerContext =
            SignerContext(
                cbSize = cbSize,
                cbBlob = cbBlob,
                pbBlobCtorArg = pbBlob,
            )
    }
}

public class SignerDigestSignInfo internal constructor(
    public var cbSize: UInt,
    public var dwDigestSignChoice: UInt,
    public var anonymous: SignerDigestSignInfo0,
    pMetadataBlobCtorArg: MutPtr,
    public var dwReserved: UInt,
    public var dwReserved2: UInt,
    public var dwReserved3: UInt,
) {
    public var pMetadataBlob: MutPtr = pMetadataBlobCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        dwDigestSignChoice = 0u,
        anonymous = SignerDigestSignInfo0(),
        pMetadataBlobCtorArg = MutPtr(0L),
        dwReserved = 0u,
        dwReserved2 = 0u,
        dwReserved3 = 0u,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): UInt = this.dwDigestSignChoice

    public operator fun component3(): SignerDigestSignInfo0 = this.anonymous

    public operator fun component4(): MutPtr = this.pMetadataBlob

    public operator fun component5(): UInt = this.dwReserved

    public operator fun component6(): UInt = this.dwReserved2

    public operator fun component7(): UInt = this.dwReserved3

    public fun copy(cbSize: UInt = this.cbSize, dwDigestSignChoice: UInt = this.dwDigestSignChoice, anonymous: SignerDigestSignInfo0 = this.anonymous, pMetadataBlob: MutPtr = this.pMetadataBlob, dwReserved: UInt = this.dwReserved, dwReserved2: UInt = this.dwReserved2, dwReserved3: UInt = this.dwReserved3): SignerDigestSignInfo = SignerDigestSignInfo(cbSize = cbSize, dwDigestSignChoice = dwDigestSignChoice, anonymous = anonymous, pMetadataBlobCtorArg = pMetadataBlob, dwReserved = dwReserved, dwReserved2 = dwReserved2, dwReserved3 = dwReserved3)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SignerDigestSignInfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwDigestSignChoice != other.dwDigestSignChoice) return false
        if (this.anonymous != other.anonymous) return false
        if (this.pMetadataBlob != other.pMetadataBlob) return false
        if (this.dwReserved != other.dwReserved) return false
        if (this.dwReserved2 != other.dwReserved2) return false
        if (this.dwReserved3 != other.dwReserved3) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwDigestSignChoice.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.pMetadataBlob.hashCode()
        result = 31 * result + this.dwReserved.hashCode()
        result = 31 * result + this.dwReserved2.hashCode()
        result = 31 * result + this.dwReserved3.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            dwDigestSignChoice: UInt = 0u,
            anonymous: SignerDigestSignInfo0 = SignerDigestSignInfo0(),
            pMetadataBlob: MutPtr = MutPtr(0L),
            dwReserved: UInt = 0u,
            dwReserved2: UInt = 0u,
            dwReserved3: UInt = 0u,
        ): SignerDigestSignInfo =
            SignerDigestSignInfo(
                cbSize = cbSize,
                dwDigestSignChoice = dwDigestSignChoice,
                anonymous = anonymous,
                pMetadataBlobCtorArg = pMetadataBlob,
                dwReserved = dwReserved,
                dwReserved2 = dwReserved2,
                dwReserved3 = dwReserved3,
            )
    }
}

public data class SignerDigestSignInfo0(
    public var pfnAuthenticodeDigestSign: PfnAuthenticodeDigestSign = null,
    public var pfnAuthenticodeDigestSignWithFileHandle: PfnAuthenticodeDigestSignWithfilehandle = null,
    public var pfnAuthenticodeDigestSignEx: PfnAuthenticodeDigestSignEx = null,
    public var pfnAuthenticodeDigestSignExWithFileHandle: PfnAuthenticodeDigestSignExWithfilehandle = null,
)

public class SignerDigestSignInfoV1 internal constructor(
    public var cbSize: UInt,
    public var pfnAuthenticodeDigestSign: PfnAuthenticodeDigestSign,
    pMetadataBlobCtorArg: MutPtr,
) {
    public var pMetadataBlob: MutPtr = pMetadataBlobCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        pfnAuthenticodeDigestSign = null,
        pMetadataBlobCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): PfnAuthenticodeDigestSign = this.pfnAuthenticodeDigestSign

    public operator fun component3(): MutPtr = this.pMetadataBlob

    public fun copy(cbSize: UInt = this.cbSize, pfnAuthenticodeDigestSign: PfnAuthenticodeDigestSign = this.pfnAuthenticodeDigestSign, pMetadataBlob: MutPtr = this.pMetadataBlob): SignerDigestSignInfoV1 = SignerDigestSignInfoV1(cbSize = cbSize, pfnAuthenticodeDigestSign = pfnAuthenticodeDigestSign, pMetadataBlobCtorArg = pMetadataBlob)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SignerDigestSignInfoV1) return false
        if (this.cbSize != other.cbSize) return false
        if (this.pfnAuthenticodeDigestSign != other.pfnAuthenticodeDigestSign) return false
        if (this.pMetadataBlob != other.pMetadataBlob) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.pfnAuthenticodeDigestSign.hashCode()
        result = 31 * result + this.pMetadataBlob.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            pfnAuthenticodeDigestSign: PfnAuthenticodeDigestSign = null,
            pMetadataBlob: MutPtr = MutPtr(0L),
        ): SignerDigestSignInfoV1 =
            SignerDigestSignInfoV1(
                cbSize = cbSize,
                pfnAuthenticodeDigestSign = pfnAuthenticodeDigestSign,
                pMetadataBlobCtorArg = pMetadataBlob,
            )
    }
}

public class SignerDigestSignInfoV2 internal constructor(
    public var cbSize: UInt,
    public var pfnAuthenticodeDigestSign: PfnAuthenticodeDigestSign,
    public var pfnAuthenticodeDigestSignEx: PfnAuthenticodeDigestSignEx,
    pMetadataBlobCtorArg: MutPtr,
) {
    public var pMetadataBlob: MutPtr = pMetadataBlobCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        pfnAuthenticodeDigestSign = null,
        pfnAuthenticodeDigestSignEx = null,
        pMetadataBlobCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): PfnAuthenticodeDigestSign = this.pfnAuthenticodeDigestSign

    public operator fun component3(): PfnAuthenticodeDigestSignEx = this.pfnAuthenticodeDigestSignEx

    public operator fun component4(): MutPtr = this.pMetadataBlob

    public fun copy(cbSize: UInt = this.cbSize, pfnAuthenticodeDigestSign: PfnAuthenticodeDigestSign = this.pfnAuthenticodeDigestSign, pfnAuthenticodeDigestSignEx: PfnAuthenticodeDigestSignEx = this.pfnAuthenticodeDigestSignEx, pMetadataBlob: MutPtr = this.pMetadataBlob): SignerDigestSignInfoV2 = SignerDigestSignInfoV2(cbSize = cbSize, pfnAuthenticodeDigestSign = pfnAuthenticodeDigestSign, pfnAuthenticodeDigestSignEx = pfnAuthenticodeDigestSignEx, pMetadataBlobCtorArg = pMetadataBlob)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SignerDigestSignInfoV2) return false
        if (this.cbSize != other.cbSize) return false
        if (this.pfnAuthenticodeDigestSign != other.pfnAuthenticodeDigestSign) return false
        if (this.pfnAuthenticodeDigestSignEx != other.pfnAuthenticodeDigestSignEx) return false
        if (this.pMetadataBlob != other.pMetadataBlob) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.pfnAuthenticodeDigestSign.hashCode()
        result = 31 * result + this.pfnAuthenticodeDigestSignEx.hashCode()
        result = 31 * result + this.pMetadataBlob.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            pfnAuthenticodeDigestSign: PfnAuthenticodeDigestSign = null,
            pfnAuthenticodeDigestSignEx: PfnAuthenticodeDigestSignEx = null,
            pMetadataBlob: MutPtr = MutPtr(0L),
        ): SignerDigestSignInfoV2 =
            SignerDigestSignInfoV2(
                cbSize = cbSize,
                pfnAuthenticodeDigestSign = pfnAuthenticodeDigestSign,
                pfnAuthenticodeDigestSignEx = pfnAuthenticodeDigestSignEx,
                pMetadataBlobCtorArg = pMetadataBlob,
            )
    }
}

public class SignerFileInfo internal constructor(
    public var cbSize: UInt,
    pwszFileNameCtorArg: Pcwstr,
    hFileCtorArg: Handle,
) {
    public var pwszFileName: Pcwstr = pwszFileNameCtorArg
        internal set

    public var hFile: Handle = hFileCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        pwszFileNameCtorArg = ConstPtr(0L),
        hFileCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Pcwstr = this.pwszFileName

    public operator fun component3(): Handle = this.hFile

    public fun copy(cbSize: UInt = this.cbSize, pwszFileName: Pcwstr = this.pwszFileName, hFile: Handle = this.hFile): SignerFileInfo = SignerFileInfo(cbSize = cbSize, pwszFileNameCtorArg = pwszFileName, hFileCtorArg = hFile)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SignerFileInfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.pwszFileName != other.pwszFileName) return false
        if (this.hFile != other.hFile) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.pwszFileName.hashCode()
        result = 31 * result + this.hFile.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            pwszFileName: Pcwstr = ConstPtr(0L),
            hFile: Handle = MutPtr(0L),
        ): SignerFileInfo =
            SignerFileInfo(
                cbSize = cbSize,
                pwszFileNameCtorArg = pwszFileName,
                hFileCtorArg = hFile,
            )
    }
}

public class SignerProviderInfo internal constructor(
    public var cbSize: UInt,
    pwszProviderNameCtorArg: Pcwstr,
    public var dwProviderType: UInt,
    public var dwKeySpec: UInt,
    public var dwPvkChoice: SignerPrivateKeyChoice,
    public var anonymous: SignerProviderInfo0,
) {
    public var pwszProviderName: Pcwstr = pwszProviderNameCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        pwszProviderNameCtorArg = ConstPtr(0L),
        dwProviderType = 0u,
        dwKeySpec = 0u,
        dwPvkChoice = 0u,
        anonymous = SignerProviderInfo0(),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Pcwstr = this.pwszProviderName

    public operator fun component3(): UInt = this.dwProviderType

    public operator fun component4(): UInt = this.dwKeySpec

    public operator fun component5(): SignerPrivateKeyChoice = this.dwPvkChoice

    public operator fun component6(): SignerProviderInfo0 = this.anonymous

    public fun copy(cbSize: UInt = this.cbSize, pwszProviderName: Pcwstr = this.pwszProviderName, dwProviderType: UInt = this.dwProviderType, dwKeySpec: UInt = this.dwKeySpec, dwPvkChoice: SignerPrivateKeyChoice = this.dwPvkChoice, anonymous: SignerProviderInfo0 = this.anonymous): SignerProviderInfo = SignerProviderInfo(cbSize = cbSize, pwszProviderNameCtorArg = pwszProviderName, dwProviderType = dwProviderType, dwKeySpec = dwKeySpec, dwPvkChoice = dwPvkChoice, anonymous = anonymous)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SignerProviderInfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.pwszProviderName != other.pwszProviderName) return false
        if (this.dwProviderType != other.dwProviderType) return false
        if (this.dwKeySpec != other.dwKeySpec) return false
        if (this.dwPvkChoice != other.dwPvkChoice) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.pwszProviderName.hashCode()
        result = 31 * result + this.dwProviderType.hashCode()
        result = 31 * result + this.dwKeySpec.hashCode()
        result = 31 * result + this.dwPvkChoice.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            pwszProviderName: Pcwstr = ConstPtr(0L),
            dwProviderType: UInt = 0u,
            dwKeySpec: UInt = 0u,
            dwPvkChoice: SignerPrivateKeyChoice = 0u,
            anonymous: SignerProviderInfo0 = SignerProviderInfo0(),
        ): SignerProviderInfo =
            SignerProviderInfo(
                cbSize = cbSize,
                pwszProviderNameCtorArg = pwszProviderName,
                dwProviderType = dwProviderType,
                dwKeySpec = dwKeySpec,
                dwPvkChoice = dwPvkChoice,
                anonymous = anonymous,
            )
    }
}

public class SignerProviderInfo0 internal constructor(
    pwszPvkFileNameCtorArg: Pwstr,
    pwszKeyContainerCtorArg: Pwstr,
) {
    public var pwszPvkFileName: Pwstr = pwszPvkFileNameCtorArg
        internal set

    public var pwszKeyContainer: Pwstr = pwszKeyContainerCtorArg
        internal set

    public constructor() : this(
        pwszPvkFileNameCtorArg = MutPtr(0L),
        pwszKeyContainerCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.pwszPvkFileName

    public operator fun component2(): Pwstr = this.pwszKeyContainer

    public fun copy(pwszPvkFileName: Pwstr = this.pwszPvkFileName, pwszKeyContainer: Pwstr = this.pwszKeyContainer): SignerProviderInfo0 = SignerProviderInfo0(pwszPvkFileNameCtorArg = pwszPvkFileName, pwszKeyContainerCtorArg = pwszKeyContainer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SignerProviderInfo0) return false
        if (this.pwszPvkFileName != other.pwszPvkFileName) return false
        if (this.pwszKeyContainer != other.pwszKeyContainer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwszPvkFileName.hashCode()
        result = 31 * result + this.pwszKeyContainer.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwszPvkFileName: Pwstr = MutPtr(0L),
            pwszKeyContainer: Pwstr = MutPtr(0L),
        ): SignerProviderInfo0 =
            SignerProviderInfo0(
                pwszPvkFileNameCtorArg = pwszPvkFileName,
                pwszKeyContainerCtorArg = pwszKeyContainer,
            )
    }
}

public class SignerSignatureInfo internal constructor(
    public var cbSize: UInt,
    public var algidHash: AlgId,
    public var dwAttrChoice: SignerSignatureAttributeChoice,
    public var anonymous: SignerSignatureInfo0,
    psAuthenticatedCtorArg: MutPtr,
    psUnauthenticatedCtorArg: MutPtr,
) {
    public var psAuthenticated: MutPtr = psAuthenticatedCtorArg
        internal set

    public var psUnauthenticated: MutPtr = psUnauthenticatedCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        algidHash = 0u,
        dwAttrChoice = 0u,
        anonymous = SignerSignatureInfo0(),
        psAuthenticatedCtorArg = MutPtr(0L),
        psUnauthenticatedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): AlgId = this.algidHash

    public operator fun component3(): SignerSignatureAttributeChoice = this.dwAttrChoice

    public operator fun component4(): SignerSignatureInfo0 = this.anonymous

    public operator fun component5(): MutPtr = this.psAuthenticated

    public operator fun component6(): MutPtr = this.psUnauthenticated

    public fun copy(cbSize: UInt = this.cbSize, algidHash: AlgId = this.algidHash, dwAttrChoice: SignerSignatureAttributeChoice = this.dwAttrChoice, anonymous: SignerSignatureInfo0 = this.anonymous, psAuthenticated: MutPtr = this.psAuthenticated, psUnauthenticated: MutPtr = this.psUnauthenticated): SignerSignatureInfo = SignerSignatureInfo(cbSize = cbSize, algidHash = algidHash, dwAttrChoice = dwAttrChoice, anonymous = anonymous, psAuthenticatedCtorArg = psAuthenticated, psUnauthenticatedCtorArg = psUnauthenticated)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SignerSignatureInfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.algidHash != other.algidHash) return false
        if (this.dwAttrChoice != other.dwAttrChoice) return false
        if (this.anonymous != other.anonymous) return false
        if (this.psAuthenticated != other.psAuthenticated) return false
        if (this.psUnauthenticated != other.psUnauthenticated) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.algidHash.hashCode()
        result = 31 * result + this.dwAttrChoice.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.psAuthenticated.hashCode()
        result = 31 * result + this.psUnauthenticated.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            algidHash: AlgId = 0u,
            dwAttrChoice: SignerSignatureAttributeChoice = 0u,
            anonymous: SignerSignatureInfo0 = SignerSignatureInfo0(),
            psAuthenticated: MutPtr = MutPtr(0L),
            psUnauthenticated: MutPtr = MutPtr(0L),
        ): SignerSignatureInfo =
            SignerSignatureInfo(
                cbSize = cbSize,
                algidHash = algidHash,
                dwAttrChoice = dwAttrChoice,
                anonymous = anonymous,
                psAuthenticatedCtorArg = psAuthenticated,
                psUnauthenticatedCtorArg = psUnauthenticated,
            )
    }
}

public class SignerSignatureInfo0 internal constructor(
    pAttrAuthcodeCtorArg: MutPtr,
) {
    public var pAttrAuthcode: MutPtr = pAttrAuthcodeCtorArg
        internal set

    public constructor() : this(
        pAttrAuthcodeCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.pAttrAuthcode

    public fun copy(pAttrAuthcode: MutPtr = this.pAttrAuthcode): SignerSignatureInfo0 = SignerSignatureInfo0(pAttrAuthcodeCtorArg = pAttrAuthcode)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SignerSignatureInfo0) return false
        if (this.pAttrAuthcode != other.pAttrAuthcode) return false
        return true
    }

    override fun hashCode(): Int = this.pAttrAuthcode.hashCode()

    public companion object {
        public operator fun invoke(
            pAttrAuthcode: MutPtr = MutPtr(0L),
        ): SignerSignatureInfo0 =
            SignerSignatureInfo0(
                pAttrAuthcodeCtorArg = pAttrAuthcode,
            )
    }
}

public class SignerSpcChainInfo internal constructor(
    public var cbSize: UInt,
    pwszSpcFileCtorArg: Pcwstr,
    public var dwCertPolicy: UInt,
    hCertStoreCtorArg: Hcertstore,
) {
    public var pwszSpcFile: Pcwstr = pwszSpcFileCtorArg
        internal set

    public var hCertStore: Hcertstore = hCertStoreCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        pwszSpcFileCtorArg = ConstPtr(0L),
        dwCertPolicy = 0u,
        hCertStoreCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Pcwstr = this.pwszSpcFile

    public operator fun component3(): UInt = this.dwCertPolicy

    public operator fun component4(): Hcertstore = this.hCertStore

    public fun copy(cbSize: UInt = this.cbSize, pwszSpcFile: Pcwstr = this.pwszSpcFile, dwCertPolicy: UInt = this.dwCertPolicy, hCertStore: Hcertstore = this.hCertStore): SignerSpcChainInfo = SignerSpcChainInfo(cbSize = cbSize, pwszSpcFileCtorArg = pwszSpcFile, dwCertPolicy = dwCertPolicy, hCertStoreCtorArg = hCertStore)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SignerSpcChainInfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.pwszSpcFile != other.pwszSpcFile) return false
        if (this.dwCertPolicy != other.dwCertPolicy) return false
        if (this.hCertStore != other.hCertStore) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.pwszSpcFile.hashCode()
        result = 31 * result + this.dwCertPolicy.hashCode()
        result = 31 * result + this.hCertStore.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            pwszSpcFile: Pcwstr = ConstPtr(0L),
            dwCertPolicy: UInt = 0u,
            hCertStore: Hcertstore = MutPtr(0L),
        ): SignerSpcChainInfo =
            SignerSpcChainInfo(
                cbSize = cbSize,
                pwszSpcFileCtorArg = pwszSpcFile,
                dwCertPolicy = dwCertPolicy,
                hCertStoreCtorArg = hCertStore,
            )
    }
}

public class SignerSubjectInfo internal constructor(
    public var cbSize: UInt,
    pdwIndexCtorArg: MutPtr,
    public var dwSubjectChoice: SignerSubjectChoice,
    public var anonymous: SignerSubjectInfo0,
) {
    public var pdwIndex: MutPtr = pdwIndexCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        pdwIndexCtorArg = MutPtr(0L),
        dwSubjectChoice = 0u,
        anonymous = SignerSubjectInfo0(),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): MutPtr = this.pdwIndex

    public operator fun component3(): SignerSubjectChoice = this.dwSubjectChoice

    public operator fun component4(): SignerSubjectInfo0 = this.anonymous

    public fun copy(cbSize: UInt = this.cbSize, pdwIndex: MutPtr = this.pdwIndex, dwSubjectChoice: SignerSubjectChoice = this.dwSubjectChoice, anonymous: SignerSubjectInfo0 = this.anonymous): SignerSubjectInfo = SignerSubjectInfo(cbSize = cbSize, pdwIndexCtorArg = pdwIndex, dwSubjectChoice = dwSubjectChoice, anonymous = anonymous)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SignerSubjectInfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.pdwIndex != other.pdwIndex) return false
        if (this.dwSubjectChoice != other.dwSubjectChoice) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.pdwIndex.hashCode()
        result = 31 * result + this.dwSubjectChoice.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            pdwIndex: MutPtr = MutPtr(0L),
            dwSubjectChoice: SignerSubjectChoice = 0u,
            anonymous: SignerSubjectInfo0 = SignerSubjectInfo0(),
        ): SignerSubjectInfo =
            SignerSubjectInfo(
                cbSize = cbSize,
                pdwIndexCtorArg = pdwIndex,
                dwSubjectChoice = dwSubjectChoice,
                anonymous = anonymous,
            )
    }
}

public class SignerSubjectInfo0 internal constructor(
    pSignerFileInfoCtorArg: MutPtr,
    pSignerBlobInfoCtorArg: MutPtr,
) {
    public var pSignerFileInfo: MutPtr = pSignerFileInfoCtorArg
        internal set

    public var pSignerBlobInfo: MutPtr = pSignerBlobInfoCtorArg
        internal set

    public constructor() : this(
        pSignerFileInfoCtorArg = MutPtr(0L),
        pSignerBlobInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.pSignerFileInfo

    public operator fun component2(): MutPtr = this.pSignerBlobInfo

    public fun copy(pSignerFileInfo: MutPtr = this.pSignerFileInfo, pSignerBlobInfo: MutPtr = this.pSignerBlobInfo): SignerSubjectInfo0 = SignerSubjectInfo0(pSignerFileInfoCtorArg = pSignerFileInfo, pSignerBlobInfoCtorArg = pSignerBlobInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SignerSubjectInfo0) return false
        if (this.pSignerFileInfo != other.pSignerFileInfo) return false
        if (this.pSignerBlobInfo != other.pSignerBlobInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pSignerFileInfo.hashCode()
        result = 31 * result + this.pSignerBlobInfo.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pSignerFileInfo: MutPtr = MutPtr(0L),
            pSignerBlobInfo: MutPtr = MutPtr(0L),
        ): SignerSubjectInfo0 =
            SignerSubjectInfo0(
                pSignerFileInfoCtorArg = pSignerFileInfo,
                pSignerBlobInfoCtorArg = pSignerBlobInfo,
            )
    }
}

public data class SslEcckeyBlob(
    public var dwCurveType: UInt = 0u,
    public var cbKey: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SslEcckeyBlob> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SslEcckeyBlob> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): SslEcckeyBlob =
                    SslEcckeyBlob(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: SslEcckeyBlob) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwCurveType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cbKey)
                }
            }
    }
}

public data class SslF12ExtraCertChainPolicyStatus(
    public var cbSize: UInt = 0u,
    public var dwErrorLevel: UInt = 0u,
    public var dwErrorCategory: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var wszErrorText: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SslF12ExtraCertChainPolicyStatus) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwErrorLevel != other.dwErrorLevel) return false
        if (this.dwErrorCategory != other.dwErrorCategory) return false
        if (this.dwReserved != other.dwReserved) return false
        if (!this.wszErrorText.contentEquals(other.wszErrorText)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwErrorLevel.hashCode()
        result = 31 * result + this.dwErrorCategory.hashCode()
        result = 31 * result + this.dwReserved.hashCode()
        result = 31 * result + this.wszErrorText.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SslF12ExtraCertChainPolicyStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SslF12ExtraCertChainPolicyStatus> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 528L
                override fun readNative(addr: Long): SslF12ExtraCertChainPolicyStatus =
                    SslF12ExtraCertChainPolicyStatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr + 16L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: SslF12ExtraCertChainPolicyStatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwErrorLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwErrorCategory)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwReserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr + 16L, value.wszErrorText.toList())
                }
            }
    }
}

public class SslHpkpHeaderExtraCertChainPolicyPara internal constructor(
    public var cbSize: UInt,
    public var dwReserved: UInt,
    pwszServerNameCtorArg: Pwstr,
    rgpszHpkpValueCtorArg: List<Pstr>,
) {
    public var pwszServerName: Pwstr = pwszServerNameCtorArg
        internal set

    public var rgpszHpkpValue: List<Pstr> = rgpszHpkpValueCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        dwReserved = 0u,
        pwszServerNameCtorArg = MutPtr(0L),
        rgpszHpkpValueCtorArg = List(2) { MutPtr(0L) },
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): UInt = this.dwReserved

    public operator fun component3(): Pwstr = this.pwszServerName

    public operator fun component4(): List<Pstr> = this.rgpszHpkpValue

    public fun copy(cbSize: UInt = this.cbSize, dwReserved: UInt = this.dwReserved, pwszServerName: Pwstr = this.pwszServerName, rgpszHpkpValue: List<Pstr> = this.rgpszHpkpValue): SslHpkpHeaderExtraCertChainPolicyPara = SslHpkpHeaderExtraCertChainPolicyPara(cbSize = cbSize, dwReserved = dwReserved, pwszServerNameCtorArg = pwszServerName, rgpszHpkpValueCtorArg = rgpszHpkpValue)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SslHpkpHeaderExtraCertChainPolicyPara) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwReserved != other.dwReserved) return false
        if (this.pwszServerName != other.pwszServerName) return false
        if (this.rgpszHpkpValue != other.rgpszHpkpValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwReserved.hashCode()
        result = 31 * result + this.pwszServerName.hashCode()
        result = 31 * result + this.rgpszHpkpValue.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            dwReserved: UInt = 0u,
            pwszServerName: Pwstr = MutPtr(0L),
            rgpszHpkpValue: List<Pstr> = List(2) { MutPtr(0L) },
        ): SslHpkpHeaderExtraCertChainPolicyPara =
            SslHpkpHeaderExtraCertChainPolicyPara(
                cbSize = cbSize,
                dwReserved = dwReserved,
                pwszServerNameCtorArg = pwszServerName,
                rgpszHpkpValueCtorArg = rgpszHpkpValue,
            )
    }
}

public class SslKeyPinExtraCertChainPolicyPara internal constructor(
    public var cbSize: UInt,
    public var dwReserved: UInt,
    pwszServerNameCtorArg: Pcwstr,
) {
    public var pwszServerName: Pcwstr = pwszServerNameCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        dwReserved = 0u,
        pwszServerNameCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): UInt = this.dwReserved

    public operator fun component3(): Pcwstr = this.pwszServerName

    public fun copy(cbSize: UInt = this.cbSize, dwReserved: UInt = this.dwReserved, pwszServerName: Pcwstr = this.pwszServerName): SslKeyPinExtraCertChainPolicyPara = SslKeyPinExtraCertChainPolicyPara(cbSize = cbSize, dwReserved = dwReserved, pwszServerNameCtorArg = pwszServerName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SslKeyPinExtraCertChainPolicyPara) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwReserved != other.dwReserved) return false
        if (this.pwszServerName != other.pwszServerName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwReserved.hashCode()
        result = 31 * result + this.pwszServerName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            dwReserved: UInt = 0u,
            pwszServerName: Pcwstr = ConstPtr(0L),
        ): SslKeyPinExtraCertChainPolicyPara =
            SslKeyPinExtraCertChainPolicyPara(
                cbSize = cbSize,
                dwReserved = dwReserved,
                pwszServerNameCtorArg = pwszServerName,
            )
    }
}

public data class SslKeyPinExtraCertChainPolicyStatus(
    public var cbSize: UInt = 0u,
    public var lError: Int = 0,
    public var wszErrorText: UShortArray = UShortArray(512),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SslKeyPinExtraCertChainPolicyStatus) return false
        if (this.cbSize != other.cbSize) return false
        if (this.lError != other.lError) return false
        if (!this.wszErrorText.contentEquals(other.wszErrorText)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.lError.hashCode()
        result = 31 * result + this.wszErrorText.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SslKeyPinExtraCertChainPolicyStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SslKeyPinExtraCertChainPolicyStatus> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 1032L
                override fun readNative(addr: Long): SslKeyPinExtraCertChainPolicyStatus =
                    SslKeyPinExtraCertChainPolicyStatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (512).toInt())
                        ).readNative(addr + 8L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: SslKeyPinExtraCertChainPolicyStatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.lError)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (512).toInt())
                    ).writeNative(addr + 8L, value.wszErrorText.toList())
                }
            }
    }
}

public class VTableProvStruc internal constructor(
    public var version: UInt,
    public var funcVerifyImage: CryptVerifyImageA,
    public var funcReturnhWnd: CryptReturnHwnd,
    public var dwProvType: UInt,
    pbContextInfoCtorArg: MutPtr,
    public var cbContextInfo: UInt,
    pszProvNameCtorArg: Pstr,
) {
    public var pbContextInfo: MutPtr = pbContextInfoCtorArg
        internal set

    public var pszProvName: Pstr = pszProvNameCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        funcVerifyImage = null,
        funcReturnhWnd = null,
        dwProvType = 0u,
        pbContextInfoCtorArg = MutPtr(0L),
        cbContextInfo = 0u,
        pszProvNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): CryptVerifyImageA = this.funcVerifyImage

    public operator fun component3(): CryptReturnHwnd = this.funcReturnhWnd

    public operator fun component4(): UInt = this.dwProvType

    public operator fun component5(): MutPtr = this.pbContextInfo

    public operator fun component6(): UInt = this.cbContextInfo

    public operator fun component7(): Pstr = this.pszProvName

    public fun copy(version: UInt = this.version, funcVerifyImage: CryptVerifyImageA = this.funcVerifyImage, funcReturnhWnd: CryptReturnHwnd = this.funcReturnhWnd, dwProvType: UInt = this.dwProvType, pbContextInfo: MutPtr = this.pbContextInfo, cbContextInfo: UInt = this.cbContextInfo, pszProvName: Pstr = this.pszProvName): VTableProvStruc = VTableProvStruc(version = version, funcVerifyImage = funcVerifyImage, funcReturnhWnd = funcReturnhWnd, dwProvType = dwProvType, pbContextInfoCtorArg = pbContextInfo, cbContextInfo = cbContextInfo, pszProvNameCtorArg = pszProvName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VTableProvStruc) return false
        if (this.version != other.version) return false
        if (this.funcVerifyImage != other.funcVerifyImage) return false
        if (this.funcReturnhWnd != other.funcReturnhWnd) return false
        if (this.dwProvType != other.dwProvType) return false
        if (this.pbContextInfo != other.pbContextInfo) return false
        if (this.cbContextInfo != other.cbContextInfo) return false
        if (this.pszProvName != other.pszProvName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.funcVerifyImage.hashCode()
        result = 31 * result + this.funcReturnhWnd.hashCode()
        result = 31 * result + this.dwProvType.hashCode()
        result = 31 * result + this.pbContextInfo.hashCode()
        result = 31 * result + this.cbContextInfo.hashCode()
        result = 31 * result + this.pszProvName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version: UInt = 0u,
            funcVerifyImage: CryptVerifyImageA = null,
            funcReturnhWnd: CryptReturnHwnd = null,
            dwProvType: UInt = 0u,
            pbContextInfo: MutPtr = MutPtr(0L),
            cbContextInfo: UInt = 0u,
            pszProvName: Pstr = MutPtr(0L),
        ): VTableProvStruc =
            VTableProvStruc(
                version = version,
                funcVerifyImage = funcVerifyImage,
                funcReturnhWnd = funcReturnhWnd,
                dwProvType = dwProvType,
                pbContextInfoCtorArg = pbContextInfo,
                cbContextInfo = cbContextInfo,
                pszProvNameCtorArg = pszProvName,
            )
    }
}

public class VTableProvStrucW internal constructor(
    public var version: UInt,
    public var funcVerifyImage: CryptVerifyImageW,
    public var funcReturnhWnd: CryptReturnHwnd,
    public var dwProvType: UInt,
    pbContextInfoCtorArg: MutPtr,
    public var cbContextInfo: UInt,
    pszProvNameCtorArg: Pwstr,
) {
    public var pbContextInfo: MutPtr = pbContextInfoCtorArg
        internal set

    public var pszProvName: Pwstr = pszProvNameCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        funcVerifyImage = null,
        funcReturnhWnd = null,
        dwProvType = 0u,
        pbContextInfoCtorArg = MutPtr(0L),
        cbContextInfo = 0u,
        pszProvNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): CryptVerifyImageW = this.funcVerifyImage

    public operator fun component3(): CryptReturnHwnd = this.funcReturnhWnd

    public operator fun component4(): UInt = this.dwProvType

    public operator fun component5(): MutPtr = this.pbContextInfo

    public operator fun component6(): UInt = this.cbContextInfo

    public operator fun component7(): Pwstr = this.pszProvName

    public fun copy(version: UInt = this.version, funcVerifyImage: CryptVerifyImageW = this.funcVerifyImage, funcReturnhWnd: CryptReturnHwnd = this.funcReturnhWnd, dwProvType: UInt = this.dwProvType, pbContextInfo: MutPtr = this.pbContextInfo, cbContextInfo: UInt = this.cbContextInfo, pszProvName: Pwstr = this.pszProvName): VTableProvStrucW = VTableProvStrucW(version = version, funcVerifyImage = funcVerifyImage, funcReturnhWnd = funcReturnhWnd, dwProvType = dwProvType, pbContextInfoCtorArg = pbContextInfo, cbContextInfo = cbContextInfo, pszProvNameCtorArg = pszProvName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VTableProvStrucW) return false
        if (this.version != other.version) return false
        if (this.funcVerifyImage != other.funcVerifyImage) return false
        if (this.funcReturnhWnd != other.funcReturnhWnd) return false
        if (this.dwProvType != other.dwProvType) return false
        if (this.pbContextInfo != other.pbContextInfo) return false
        if (this.cbContextInfo != other.cbContextInfo) return false
        if (this.pszProvName != other.pszProvName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.funcVerifyImage.hashCode()
        result = 31 * result + this.funcReturnhWnd.hashCode()
        result = 31 * result + this.dwProvType.hashCode()
        result = 31 * result + this.pbContextInfo.hashCode()
        result = 31 * result + this.cbContextInfo.hashCode()
        result = 31 * result + this.pszProvName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version: UInt = 0u,
            funcVerifyImage: CryptVerifyImageW = null,
            funcReturnhWnd: CryptReturnHwnd = null,
            dwProvType: UInt = 0u,
            pbContextInfo: MutPtr = MutPtr(0L),
            cbContextInfo: UInt = 0u,
            pszProvName: Pwstr = MutPtr(0L),
        ): VTableProvStrucW =
            VTableProvStrucW(
                version = version,
                funcVerifyImage = funcVerifyImage,
                funcReturnhWnd = funcReturnhWnd,
                dwProvType = dwProvType,
                pbContextInfoCtorArg = pbContextInfo,
                cbContextInfo = cbContextInfo,
                pszProvNameCtorArg = pszProvName,
            )
    }
}
