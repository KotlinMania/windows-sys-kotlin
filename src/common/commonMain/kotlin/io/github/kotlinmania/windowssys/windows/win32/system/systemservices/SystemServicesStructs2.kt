package io.github.kotlinmania.windowssys.windows.win32.system.systemservices

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Logpalette

public data class UserHmetafilepict(
    public var fContext: Int = 0,
    public var u: UserHmetafilepict0 = UserHmetafilepict0(),
)

public class UserHmetafilepict0 internal constructor(
    public var hInproc: Int,
    hRemoteCtorArg: MutPtr<RemoteMetafilepict>,
    public var hInproc64: Long,
) {
    public var hRemote: MutPtr<RemoteMetafilepict> = hRemoteCtorArg
        internal set

    public constructor() : this(
        hInproc = 0,
        hRemoteCtorArg = MutPtr(0L),
        hInproc64 = 0L,
    )

    public operator fun component1(): Int = this.hInproc

    public operator fun component2(): MutPtr<RemoteMetafilepict> = this.hRemote

    public operator fun component3(): Long = this.hInproc64

    public fun copy(hInproc: Int = this.hInproc, hRemote: MutPtr<RemoteMetafilepict> = this.hRemote, hInproc64: Long = this.hInproc64): UserHmetafilepict0 = UserHmetafilepict0(hInproc = hInproc, hRemoteCtorArg = hRemote, hInproc64 = hInproc64)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UserHmetafilepict0) return false
        if (this.hInproc != other.hInproc) return false
        if (this.hRemote != other.hRemote) return false
        if (this.hInproc64 != other.hInproc64) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hInproc.hashCode()
        result = 31 * result + this.hRemote.hashCode()
        result = 31 * result + this.hInproc64.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hInproc: Int = 0,
            hRemote: MutPtr<RemoteMetafilepict> = MutPtr(0L),
            hInproc64: Long = 0L,
        ): UserHmetafilepict0 =
            UserHmetafilepict0(
                hInproc = hInproc,
                hRemoteCtorArg = hRemote,
                hInproc64 = hInproc64,
            )
    }
}

public data class UserHpalette(
    public var fContext: Int = 0,
    public var u: UserHpalette0 = UserHpalette0(),
)

public class UserHpalette0 internal constructor(
    public var hInproc: Int,
    hRemoteCtorArg: MutPtr<Logpalette>,
    public var hInproc64: Long,
) {
    public var hRemote: MutPtr<Logpalette> = hRemoteCtorArg
        internal set

    public constructor() : this(
        hInproc = 0,
        hRemoteCtorArg = MutPtr(0L),
        hInproc64 = 0L,
    )

    public operator fun component1(): Int = this.hInproc

    public operator fun component2(): MutPtr<Logpalette> = this.hRemote

    public operator fun component3(): Long = this.hInproc64

    public fun copy(hInproc: Int = this.hInproc, hRemote: MutPtr<Logpalette> = this.hRemote, hInproc64: Long = this.hInproc64): UserHpalette0 = UserHpalette0(hInproc = hInproc, hRemoteCtorArg = hRemote, hInproc64 = hInproc64)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UserHpalette0) return false
        if (this.hInproc != other.hInproc) return false
        if (this.hRemote != other.hRemote) return false
        if (this.hInproc64 != other.hInproc64) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hInproc.hashCode()
        result = 31 * result + this.hRemote.hashCode()
        result = 31 * result + this.hInproc64.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hInproc: Int = 0,
            hRemote: MutPtr<Logpalette> = MutPtr(0L),
            hInproc64: Long = 0L,
        ): UserHpalette0 =
            UserHpalette0(
                hInproc = hInproc,
                hRemoteCtorArg = hRemote,
                hInproc64 = hInproc64,
            )
    }
}
