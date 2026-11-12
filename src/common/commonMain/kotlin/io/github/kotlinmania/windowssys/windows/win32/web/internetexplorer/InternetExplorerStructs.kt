package io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime

public data class Ielaunchurlinfo(
    public var cbSize: UInt = 0u,
    public var dwCreationFlags: UInt = 0u,
    public var dwLaunchOptionFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ielaunchurlinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ielaunchurlinfo> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Ielaunchurlinfo =
                    Ielaunchurlinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Ielaunchurlinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwCreationFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwLaunchOptionFlags)
                }
            }
    }
}

public data class Navigatedata(
    public var ulTarget: UInt = 0u,
    public var ulURL: UInt = 0u,
    public var ulRefURL: UInt = 0u,
    public var ulPostData: UInt = 0u,
    public var dwFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Navigatedata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Navigatedata> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Navigatedata =
                    Navigatedata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Navigatedata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ulTarget)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ulURL)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ulRefURL)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.ulPostData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwFlags)
                }
            }
    }
}

public class Staturl internal constructor(
    public var cbSize: UInt,
    pwcsUrlCtorArg: Pwstr,
    pwcsTitleCtorArg: Pwstr,
    public var ftLastVisited: Filetime,
    public var ftLastUpdated: Filetime,
    public var ftExpires: Filetime,
    public var dwFlags: UInt,
) {
    public var pwcsUrl: Pwstr = pwcsUrlCtorArg
        internal set

    public var pwcsTitle: Pwstr = pwcsTitleCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        pwcsUrlCtorArg = MutPtr(0L),
        pwcsTitleCtorArg = MutPtr(0L),
        ftLastVisited = Filetime(),
        ftLastUpdated = Filetime(),
        ftExpires = Filetime(),
        dwFlags = 0u,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Pwstr = this.pwcsUrl

    public operator fun component3(): Pwstr = this.pwcsTitle

    public operator fun component4(): Filetime = this.ftLastVisited

    public operator fun component5(): Filetime = this.ftLastUpdated

    public operator fun component6(): Filetime = this.ftExpires

    public operator fun component7(): UInt = this.dwFlags

    public fun copy(cbSize: UInt = this.cbSize, pwcsUrl: Pwstr = this.pwcsUrl, pwcsTitle: Pwstr = this.pwcsTitle, ftLastVisited: Filetime = this.ftLastVisited, ftLastUpdated: Filetime = this.ftLastUpdated, ftExpires: Filetime = this.ftExpires, dwFlags: UInt = this.dwFlags): Staturl = Staturl(cbSize = cbSize, pwcsUrlCtorArg = pwcsUrl, pwcsTitleCtorArg = pwcsTitle, ftLastVisited = ftLastVisited, ftLastUpdated = ftLastUpdated, ftExpires = ftExpires, dwFlags = dwFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Staturl) return false
        if (this.cbSize != other.cbSize) return false
        if (this.pwcsUrl != other.pwcsUrl) return false
        if (this.pwcsTitle != other.pwcsTitle) return false
        if (this.ftLastVisited != other.ftLastVisited) return false
        if (this.ftLastUpdated != other.ftLastUpdated) return false
        if (this.ftExpires != other.ftExpires) return false
        if (this.dwFlags != other.dwFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.pwcsUrl.hashCode()
        result = 31 * result + this.pwcsTitle.hashCode()
        result = 31 * result + this.ftLastVisited.hashCode()
        result = 31 * result + this.ftLastUpdated.hashCode()
        result = 31 * result + this.ftExpires.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            pwcsUrl: Pwstr = MutPtr(0L),
            pwcsTitle: Pwstr = MutPtr(0L),
            ftLastVisited: Filetime = Filetime(),
            ftLastUpdated: Filetime = Filetime(),
            ftExpires: Filetime = Filetime(),
            dwFlags: UInt = 0u,
        ): Staturl =
            Staturl(
                cbSize = cbSize,
                pwcsUrlCtorArg = pwcsUrl,
                pwcsTitleCtorArg = pwcsTitle,
                ftLastVisited = ftLastVisited,
                ftLastUpdated = ftLastUpdated,
                ftExpires = ftExpires,
                dwFlags = dwFlags,
            )
    }
}
