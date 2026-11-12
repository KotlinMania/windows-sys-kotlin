package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.webdav

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pwstr

public class DavCallbackAuthBlob internal constructor(
    pBufferCtorArg: MutPtr<CVoid>,
    public var ulSize: UInt,
    public var ulType: UInt,
) {
    public var pBuffer: MutPtr<CVoid> = pBufferCtorArg
        internal set

    public constructor() : this(
        pBufferCtorArg = MutPtr(0L),
        ulSize = 0u,
        ulType = 0u,
    )

    public operator fun component1(): MutPtr<CVoid> = this.pBuffer

    public operator fun component2(): UInt = this.ulSize

    public operator fun component3(): UInt = this.ulType

    public fun copy(pBuffer: MutPtr<CVoid> = this.pBuffer, ulSize: UInt = this.ulSize, ulType: UInt = this.ulType): DavCallbackAuthBlob = DavCallbackAuthBlob(pBufferCtorArg = pBuffer, ulSize = ulSize, ulType = ulType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DavCallbackAuthBlob) return false
        if (this.pBuffer != other.pBuffer) return false
        if (this.ulSize != other.ulSize) return false
        if (this.ulType != other.ulType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pBuffer.hashCode()
        result = 31 * result + this.ulSize.hashCode()
        result = 31 * result + this.ulType.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DavCallbackAuthBlob> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DavCallbackAuthBlob> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DavCallbackAuthBlob =
                    DavCallbackAuthBlob(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: DavCallbackAuthBlob) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.pBuffer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ulSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.ulType)
                }
            }

        public operator fun invoke(
            pBuffer: MutPtr<CVoid> = MutPtr(0L),
            ulSize: UInt = 0u,
            ulType: UInt = 0u,
        ): DavCallbackAuthBlob =
            DavCallbackAuthBlob(
                pBufferCtorArg = pBuffer,
                ulSize = ulSize,
                ulType = ulType,
            )
    }
}

public class DavCallbackAuthUnp internal constructor(
    pszUserNameCtorArg: Pwstr,
    public var ulUserNameLength: UInt,
    pszPasswordCtorArg: Pwstr,
    public var ulPasswordLength: UInt,
) {
    public var pszUserName: Pwstr = pszUserNameCtorArg
        internal set

    public var pszPassword: Pwstr = pszPasswordCtorArg
        internal set

    public constructor() : this(
        pszUserNameCtorArg = MutPtr(0L),
        ulUserNameLength = 0u,
        pszPasswordCtorArg = MutPtr(0L),
        ulPasswordLength = 0u,
    )

    public operator fun component1(): Pwstr = this.pszUserName

    public operator fun component2(): UInt = this.ulUserNameLength

    public operator fun component3(): Pwstr = this.pszPassword

    public operator fun component4(): UInt = this.ulPasswordLength

    public fun copy(pszUserName: Pwstr = this.pszUserName, ulUserNameLength: UInt = this.ulUserNameLength, pszPassword: Pwstr = this.pszPassword, ulPasswordLength: UInt = this.ulPasswordLength): DavCallbackAuthUnp = DavCallbackAuthUnp(pszUserNameCtorArg = pszUserName, ulUserNameLength = ulUserNameLength, pszPasswordCtorArg = pszPassword, ulPasswordLength = ulPasswordLength)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DavCallbackAuthUnp) return false
        if (this.pszUserName != other.pszUserName) return false
        if (this.ulUserNameLength != other.ulUserNameLength) return false
        if (this.pszPassword != other.pszPassword) return false
        if (this.ulPasswordLength != other.ulPasswordLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszUserName.hashCode()
        result = 31 * result + this.ulUserNameLength.hashCode()
        result = 31 * result + this.pszPassword.hashCode()
        result = 31 * result + this.ulPasswordLength.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszUserName: Pwstr = MutPtr(0L),
            ulUserNameLength: UInt = 0u,
            pszPassword: Pwstr = MutPtr(0L),
            ulPasswordLength: UInt = 0u,
        ): DavCallbackAuthUnp =
            DavCallbackAuthUnp(
                pszUserNameCtorArg = pszUserName,
                ulUserNameLength = ulUserNameLength,
                pszPasswordCtorArg = pszPassword,
                ulPasswordLength = ulPasswordLength,
            )
    }
}

public data class DavCallbackCred(
    public var authBlob: DavCallbackAuthBlob = DavCallbackAuthBlob(),
    public var uNPBlob: DavCallbackAuthUnp = DavCallbackAuthUnp(),
    public var bAuthBlobValid: Bool = 0,
    public var bSave: Bool = 0,
)
