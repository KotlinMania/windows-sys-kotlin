package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error

public class Connectdlgstructa internal constructor(
    public var cbStructure: UInt,
    hwndOwnerCtorArg: Hwnd,
    lpConnResCtorArg: MutPtr<Netresourcea>,
    public var dwFlags: ConnectdlgstructFlags,
    public var dwDevNum: UInt,
) {
    public var hwndOwner: Hwnd = hwndOwnerCtorArg
        internal set

    public var lpConnRes: MutPtr<Netresourcea> = lpConnResCtorArg
        internal set

    public constructor() : this(
        cbStructure = 0u,
        hwndOwnerCtorArg = MutPtr(0L),
        lpConnResCtorArg = MutPtr(0L),
        dwFlags = 0u,
        dwDevNum = 0u,
    )

    public operator fun component1(): UInt = this.cbStructure

    public operator fun component2(): Hwnd = this.hwndOwner

    public operator fun component3(): MutPtr<Netresourcea> = this.lpConnRes

    public operator fun component4(): ConnectdlgstructFlags = this.dwFlags

    public operator fun component5(): UInt = this.dwDevNum

    public fun copy(cbStructure: UInt = this.cbStructure, hwndOwner: Hwnd = this.hwndOwner, lpConnRes: MutPtr<Netresourcea> = this.lpConnRes, dwFlags: ConnectdlgstructFlags = this.dwFlags, dwDevNum: UInt = this.dwDevNum): Connectdlgstructa = Connectdlgstructa(cbStructure = cbStructure, hwndOwnerCtorArg = hwndOwner, lpConnResCtorArg = lpConnRes, dwFlags = dwFlags, dwDevNum = dwDevNum)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Connectdlgstructa) return false
        if (this.cbStructure != other.cbStructure) return false
        if (this.hwndOwner != other.hwndOwner) return false
        if (this.lpConnRes != other.lpConnRes) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwDevNum != other.dwDevNum) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStructure.hashCode()
        result = 31 * result + this.hwndOwner.hashCode()
        result = 31 * result + this.lpConnRes.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwDevNum.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStructure: UInt = 0u,
            hwndOwner: Hwnd = MutPtr(0L),
            lpConnRes: MutPtr<Netresourcea> = MutPtr(0L),
            dwFlags: ConnectdlgstructFlags = 0u,
            dwDevNum: UInt = 0u,
        ): Connectdlgstructa =
            Connectdlgstructa(
                cbStructure = cbStructure,
                hwndOwnerCtorArg = hwndOwner,
                lpConnResCtorArg = lpConnRes,
                dwFlags = dwFlags,
                dwDevNum = dwDevNum,
            )
    }
}

public class Connectdlgstructw internal constructor(
    public var cbStructure: UInt,
    hwndOwnerCtorArg: Hwnd,
    lpConnResCtorArg: MutPtr<Netresourcew>,
    public var dwFlags: ConnectdlgstructFlags,
    public var dwDevNum: UInt,
) {
    public var hwndOwner: Hwnd = hwndOwnerCtorArg
        internal set

    public var lpConnRes: MutPtr<Netresourcew> = lpConnResCtorArg
        internal set

    public constructor() : this(
        cbStructure = 0u,
        hwndOwnerCtorArg = MutPtr(0L),
        lpConnResCtorArg = MutPtr(0L),
        dwFlags = 0u,
        dwDevNum = 0u,
    )

    public operator fun component1(): UInt = this.cbStructure

    public operator fun component2(): Hwnd = this.hwndOwner

    public operator fun component3(): MutPtr<Netresourcew> = this.lpConnRes

    public operator fun component4(): ConnectdlgstructFlags = this.dwFlags

    public operator fun component5(): UInt = this.dwDevNum

    public fun copy(cbStructure: UInt = this.cbStructure, hwndOwner: Hwnd = this.hwndOwner, lpConnRes: MutPtr<Netresourcew> = this.lpConnRes, dwFlags: ConnectdlgstructFlags = this.dwFlags, dwDevNum: UInt = this.dwDevNum): Connectdlgstructw = Connectdlgstructw(cbStructure = cbStructure, hwndOwnerCtorArg = hwndOwner, lpConnResCtorArg = lpConnRes, dwFlags = dwFlags, dwDevNum = dwDevNum)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Connectdlgstructw) return false
        if (this.cbStructure != other.cbStructure) return false
        if (this.hwndOwner != other.hwndOwner) return false
        if (this.lpConnRes != other.lpConnRes) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwDevNum != other.dwDevNum) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStructure.hashCode()
        result = 31 * result + this.hwndOwner.hashCode()
        result = 31 * result + this.lpConnRes.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwDevNum.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStructure: UInt = 0u,
            hwndOwner: Hwnd = MutPtr(0L),
            lpConnRes: MutPtr<Netresourcew> = MutPtr(0L),
            dwFlags: ConnectdlgstructFlags = 0u,
            dwDevNum: UInt = 0u,
        ): Connectdlgstructw =
            Connectdlgstructw(
                cbStructure = cbStructure,
                hwndOwnerCtorArg = hwndOwner,
                lpConnResCtorArg = lpConnRes,
                dwFlags = dwFlags,
                dwDevNum = dwDevNum,
            )
    }
}

public class Discdlgstructa internal constructor(
    public var cbStructure: UInt,
    hwndOwnerCtorArg: Hwnd,
    lpLocalNameCtorArg: Pstr,
    lpRemoteNameCtorArg: Pstr,
    public var dwFlags: DiscdlgstructFlags,
) {
    public var hwndOwner: Hwnd = hwndOwnerCtorArg
        internal set

    public var lpLocalName: Pstr = lpLocalNameCtorArg
        internal set

    public var lpRemoteName: Pstr = lpRemoteNameCtorArg
        internal set

    public constructor() : this(
        cbStructure = 0u,
        hwndOwnerCtorArg = MutPtr(0L),
        lpLocalNameCtorArg = MutPtr(0L),
        lpRemoteNameCtorArg = MutPtr(0L),
        dwFlags = 0u,
    )

    public operator fun component1(): UInt = this.cbStructure

    public operator fun component2(): Hwnd = this.hwndOwner

    public operator fun component3(): Pstr = this.lpLocalName

    public operator fun component4(): Pstr = this.lpRemoteName

    public operator fun component5(): DiscdlgstructFlags = this.dwFlags

    public fun copy(cbStructure: UInt = this.cbStructure, hwndOwner: Hwnd = this.hwndOwner, lpLocalName: Pstr = this.lpLocalName, lpRemoteName: Pstr = this.lpRemoteName, dwFlags: DiscdlgstructFlags = this.dwFlags): Discdlgstructa = Discdlgstructa(cbStructure = cbStructure, hwndOwnerCtorArg = hwndOwner, lpLocalNameCtorArg = lpLocalName, lpRemoteNameCtorArg = lpRemoteName, dwFlags = dwFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Discdlgstructa) return false
        if (this.cbStructure != other.cbStructure) return false
        if (this.hwndOwner != other.hwndOwner) return false
        if (this.lpLocalName != other.lpLocalName) return false
        if (this.lpRemoteName != other.lpRemoteName) return false
        if (this.dwFlags != other.dwFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStructure.hashCode()
        result = 31 * result + this.hwndOwner.hashCode()
        result = 31 * result + this.lpLocalName.hashCode()
        result = 31 * result + this.lpRemoteName.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStructure: UInt = 0u,
            hwndOwner: Hwnd = MutPtr(0L),
            lpLocalName: Pstr = MutPtr(0L),
            lpRemoteName: Pstr = MutPtr(0L),
            dwFlags: DiscdlgstructFlags = 0u,
        ): Discdlgstructa =
            Discdlgstructa(
                cbStructure = cbStructure,
                hwndOwnerCtorArg = hwndOwner,
                lpLocalNameCtorArg = lpLocalName,
                lpRemoteNameCtorArg = lpRemoteName,
                dwFlags = dwFlags,
            )
    }
}

public class Discdlgstructw internal constructor(
    public var cbStructure: UInt,
    hwndOwnerCtorArg: Hwnd,
    lpLocalNameCtorArg: Pwstr,
    lpRemoteNameCtorArg: Pwstr,
    public var dwFlags: DiscdlgstructFlags,
) {
    public var hwndOwner: Hwnd = hwndOwnerCtorArg
        internal set

    public var lpLocalName: Pwstr = lpLocalNameCtorArg
        internal set

    public var lpRemoteName: Pwstr = lpRemoteNameCtorArg
        internal set

    public constructor() : this(
        cbStructure = 0u,
        hwndOwnerCtorArg = MutPtr(0L),
        lpLocalNameCtorArg = MutPtr(0L),
        lpRemoteNameCtorArg = MutPtr(0L),
        dwFlags = 0u,
    )

    public operator fun component1(): UInt = this.cbStructure

    public operator fun component2(): Hwnd = this.hwndOwner

    public operator fun component3(): Pwstr = this.lpLocalName

    public operator fun component4(): Pwstr = this.lpRemoteName

    public operator fun component5(): DiscdlgstructFlags = this.dwFlags

    public fun copy(cbStructure: UInt = this.cbStructure, hwndOwner: Hwnd = this.hwndOwner, lpLocalName: Pwstr = this.lpLocalName, lpRemoteName: Pwstr = this.lpRemoteName, dwFlags: DiscdlgstructFlags = this.dwFlags): Discdlgstructw = Discdlgstructw(cbStructure = cbStructure, hwndOwnerCtorArg = hwndOwner, lpLocalNameCtorArg = lpLocalName, lpRemoteNameCtorArg = lpRemoteName, dwFlags = dwFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Discdlgstructw) return false
        if (this.cbStructure != other.cbStructure) return false
        if (this.hwndOwner != other.hwndOwner) return false
        if (this.lpLocalName != other.lpLocalName) return false
        if (this.lpRemoteName != other.lpRemoteName) return false
        if (this.dwFlags != other.dwFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStructure.hashCode()
        result = 31 * result + this.hwndOwner.hashCode()
        result = 31 * result + this.lpLocalName.hashCode()
        result = 31 * result + this.lpRemoteName.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStructure: UInt = 0u,
            hwndOwner: Hwnd = MutPtr(0L),
            lpLocalName: Pwstr = MutPtr(0L),
            lpRemoteName: Pwstr = MutPtr(0L),
            dwFlags: DiscdlgstructFlags = 0u,
        ): Discdlgstructw =
            Discdlgstructw(
                cbStructure = cbStructure,
                hwndOwnerCtorArg = hwndOwner,
                lpLocalNameCtorArg = lpLocalName,
                lpRemoteNameCtorArg = lpRemoteName,
                dwFlags = dwFlags,
            )
    }
}

public data class Netconnectinfostruct(
    public var cbStructure: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwSpeed: UInt = 0u,
    public var dwDelay: UInt = 0u,
    public var dwOptDataSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Netconnectinfostruct> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Netconnectinfostruct> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): Netconnectinfostruct =
                    Netconnectinfostruct(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Netconnectinfostruct) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbStructure)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwSpeed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwDelay)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwOptDataSize)
                }
            }
    }
}

public data class Netinfostruct(
    public var cbStructure: UInt = 0u,
    public var dwProviderVersion: UInt = 0u,
    public var dwStatus: Win32Error = 0u,
    public var dwCharacteristics: NetinfostructCharacteristics = 0u,
    public var dwHandle: Int = 0,
    public var wNetType: UShort = 0u,
    public var dwPrinters: UInt = 0u,
    public var dwDrives: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Netinfostruct> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Netinfostruct> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): Netinfostruct =
                    Netinfostruct(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: Netinfostruct) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbStructure)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwProviderVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwCharacteristics)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.dwHandle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 24L, value.wNetType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwPrinters)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwDrives)
                }
            }
    }
}

public class Netresourcea internal constructor(
    public var dwScope: NetResourceScope,
    public var dwType: NetResourceType,
    public var dwDisplayType: UInt,
    public var dwUsage: UInt,
    lpLocalNameCtorArg: Pstr,
    lpRemoteNameCtorArg: Pstr,
    lpCommentCtorArg: Pstr,
    lpProviderCtorArg: Pstr,
) {
    public var lpLocalName: Pstr = lpLocalNameCtorArg
        internal set

    public var lpRemoteName: Pstr = lpRemoteNameCtorArg
        internal set

    public var lpComment: Pstr = lpCommentCtorArg
        internal set

    public var lpProvider: Pstr = lpProviderCtorArg
        internal set

    public constructor() : this(
        dwScope = 0u,
        dwType = 0u,
        dwDisplayType = 0u,
        dwUsage = 0u,
        lpLocalNameCtorArg = MutPtr(0L),
        lpRemoteNameCtorArg = MutPtr(0L),
        lpCommentCtorArg = MutPtr(0L),
        lpProviderCtorArg = MutPtr(0L),
    )

    public operator fun component1(): NetResourceScope = this.dwScope

    public operator fun component2(): NetResourceType = this.dwType

    public operator fun component3(): UInt = this.dwDisplayType

    public operator fun component4(): UInt = this.dwUsage

    public operator fun component5(): Pstr = this.lpLocalName

    public operator fun component6(): Pstr = this.lpRemoteName

    public operator fun component7(): Pstr = this.lpComment

    public operator fun component8(): Pstr = this.lpProvider

    public fun copy(dwScope: NetResourceScope = this.dwScope, dwType: NetResourceType = this.dwType, dwDisplayType: UInt = this.dwDisplayType, dwUsage: UInt = this.dwUsage, lpLocalName: Pstr = this.lpLocalName, lpRemoteName: Pstr = this.lpRemoteName, lpComment: Pstr = this.lpComment, lpProvider: Pstr = this.lpProvider): Netresourcea = Netresourcea(dwScope = dwScope, dwType = dwType, dwDisplayType = dwDisplayType, dwUsage = dwUsage, lpLocalNameCtorArg = lpLocalName, lpRemoteNameCtorArg = lpRemoteName, lpCommentCtorArg = lpComment, lpProviderCtorArg = lpProvider)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Netresourcea) return false
        if (this.dwScope != other.dwScope) return false
        if (this.dwType != other.dwType) return false
        if (this.dwDisplayType != other.dwDisplayType) return false
        if (this.dwUsage != other.dwUsage) return false
        if (this.lpLocalName != other.lpLocalName) return false
        if (this.lpRemoteName != other.lpRemoteName) return false
        if (this.lpComment != other.lpComment) return false
        if (this.lpProvider != other.lpProvider) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwScope.hashCode()
        result = 31 * result + this.dwType.hashCode()
        result = 31 * result + this.dwDisplayType.hashCode()
        result = 31 * result + this.dwUsage.hashCode()
        result = 31 * result + this.lpLocalName.hashCode()
        result = 31 * result + this.lpRemoteName.hashCode()
        result = 31 * result + this.lpComment.hashCode()
        result = 31 * result + this.lpProvider.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwScope: NetResourceScope = 0u,
            dwType: NetResourceType = 0u,
            dwDisplayType: UInt = 0u,
            dwUsage: UInt = 0u,
            lpLocalName: Pstr = MutPtr(0L),
            lpRemoteName: Pstr = MutPtr(0L),
            lpComment: Pstr = MutPtr(0L),
            lpProvider: Pstr = MutPtr(0L),
        ): Netresourcea =
            Netresourcea(
                dwScope = dwScope,
                dwType = dwType,
                dwDisplayType = dwDisplayType,
                dwUsage = dwUsage,
                lpLocalNameCtorArg = lpLocalName,
                lpRemoteNameCtorArg = lpRemoteName,
                lpCommentCtorArg = lpComment,
                lpProviderCtorArg = lpProvider,
            )
    }
}

public class Netresourcew internal constructor(
    public var dwScope: NetResourceScope,
    public var dwType: NetResourceType,
    public var dwDisplayType: UInt,
    public var dwUsage: UInt,
    lpLocalNameCtorArg: Pwstr,
    lpRemoteNameCtorArg: Pwstr,
    lpCommentCtorArg: Pwstr,
    lpProviderCtorArg: Pwstr,
) {
    public var lpLocalName: Pwstr = lpLocalNameCtorArg
        internal set

    public var lpRemoteName: Pwstr = lpRemoteNameCtorArg
        internal set

    public var lpComment: Pwstr = lpCommentCtorArg
        internal set

    public var lpProvider: Pwstr = lpProviderCtorArg
        internal set

    public constructor() : this(
        dwScope = 0u,
        dwType = 0u,
        dwDisplayType = 0u,
        dwUsage = 0u,
        lpLocalNameCtorArg = MutPtr(0L),
        lpRemoteNameCtorArg = MutPtr(0L),
        lpCommentCtorArg = MutPtr(0L),
        lpProviderCtorArg = MutPtr(0L),
    )

    public operator fun component1(): NetResourceScope = this.dwScope

    public operator fun component2(): NetResourceType = this.dwType

    public operator fun component3(): UInt = this.dwDisplayType

    public operator fun component4(): UInt = this.dwUsage

    public operator fun component5(): Pwstr = this.lpLocalName

    public operator fun component6(): Pwstr = this.lpRemoteName

    public operator fun component7(): Pwstr = this.lpComment

    public operator fun component8(): Pwstr = this.lpProvider

    public fun copy(dwScope: NetResourceScope = this.dwScope, dwType: NetResourceType = this.dwType, dwDisplayType: UInt = this.dwDisplayType, dwUsage: UInt = this.dwUsage, lpLocalName: Pwstr = this.lpLocalName, lpRemoteName: Pwstr = this.lpRemoteName, lpComment: Pwstr = this.lpComment, lpProvider: Pwstr = this.lpProvider): Netresourcew = Netresourcew(dwScope = dwScope, dwType = dwType, dwDisplayType = dwDisplayType, dwUsage = dwUsage, lpLocalNameCtorArg = lpLocalName, lpRemoteNameCtorArg = lpRemoteName, lpCommentCtorArg = lpComment, lpProviderCtorArg = lpProvider)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Netresourcew) return false
        if (this.dwScope != other.dwScope) return false
        if (this.dwType != other.dwType) return false
        if (this.dwDisplayType != other.dwDisplayType) return false
        if (this.dwUsage != other.dwUsage) return false
        if (this.lpLocalName != other.lpLocalName) return false
        if (this.lpRemoteName != other.lpRemoteName) return false
        if (this.lpComment != other.lpComment) return false
        if (this.lpProvider != other.lpProvider) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwScope.hashCode()
        result = 31 * result + this.dwType.hashCode()
        result = 31 * result + this.dwDisplayType.hashCode()
        result = 31 * result + this.dwUsage.hashCode()
        result = 31 * result + this.lpLocalName.hashCode()
        result = 31 * result + this.lpRemoteName.hashCode()
        result = 31 * result + this.lpComment.hashCode()
        result = 31 * result + this.lpProvider.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwScope: NetResourceScope = 0u,
            dwType: NetResourceType = 0u,
            dwDisplayType: UInt = 0u,
            dwUsage: UInt = 0u,
            lpLocalName: Pwstr = MutPtr(0L),
            lpRemoteName: Pwstr = MutPtr(0L),
            lpComment: Pwstr = MutPtr(0L),
            lpProvider: Pwstr = MutPtr(0L),
        ): Netresourcew =
            Netresourcew(
                dwScope = dwScope,
                dwType = dwType,
                dwDisplayType = dwDisplayType,
                dwUsage = dwUsage,
                lpLocalNameCtorArg = lpLocalName,
                lpRemoteNameCtorArg = lpRemoteName,
                lpCommentCtorArg = lpComment,
                lpProviderCtorArg = lpProvider,
            )
    }
}

public class Notifyadd internal constructor(
    hwndOwnerCtorArg: Hwnd,
    public var netResource: Netresourcea,
    public var dwAddFlags: NetConnectFlags,
) {
    public var hwndOwner: Hwnd = hwndOwnerCtorArg
        internal set

    public constructor() : this(
        hwndOwnerCtorArg = MutPtr(0L),
        netResource = Netresourcea(),
        dwAddFlags = 0u,
    )

    public operator fun component1(): Hwnd = this.hwndOwner

    public operator fun component2(): Netresourcea = this.netResource

    public operator fun component3(): NetConnectFlags = this.dwAddFlags

    public fun copy(hwndOwner: Hwnd = this.hwndOwner, netResource: Netresourcea = this.netResource, dwAddFlags: NetConnectFlags = this.dwAddFlags): Notifyadd = Notifyadd(hwndOwnerCtorArg = hwndOwner, netResource = netResource, dwAddFlags = dwAddFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Notifyadd) return false
        if (this.hwndOwner != other.hwndOwner) return false
        if (this.netResource != other.netResource) return false
        if (this.dwAddFlags != other.dwAddFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hwndOwner.hashCode()
        result = 31 * result + this.netResource.hashCode()
        result = 31 * result + this.dwAddFlags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hwndOwner: Hwnd = MutPtr(0L),
            netResource: Netresourcea = Netresourcea(),
            dwAddFlags: NetConnectFlags = 0u,
        ): Notifyadd =
            Notifyadd(
                hwndOwnerCtorArg = hwndOwner,
                netResource = netResource,
                dwAddFlags = dwAddFlags,
            )
    }
}

public class Notifycancel internal constructor(
    lpNameCtorArg: Pwstr,
    lpProviderCtorArg: Pwstr,
    public var dwFlags: UInt,
    public var fForce: Bool,
) {
    public var lpName: Pwstr = lpNameCtorArg
        internal set

    public var lpProvider: Pwstr = lpProviderCtorArg
        internal set

    public constructor() : this(
        lpNameCtorArg = MutPtr(0L),
        lpProviderCtorArg = MutPtr(0L),
        dwFlags = 0u,
        fForce = 0,
    )

    public operator fun component1(): Pwstr = this.lpName

    public operator fun component2(): Pwstr = this.lpProvider

    public operator fun component3(): UInt = this.dwFlags

    public operator fun component4(): Bool = this.fForce

    public fun copy(lpName: Pwstr = this.lpName, lpProvider: Pwstr = this.lpProvider, dwFlags: UInt = this.dwFlags, fForce: Bool = this.fForce): Notifycancel = Notifycancel(lpNameCtorArg = lpName, lpProviderCtorArg = lpProvider, dwFlags = dwFlags, fForce = fForce)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Notifycancel) return false
        if (this.lpName != other.lpName) return false
        if (this.lpProvider != other.lpProvider) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.fForce != other.fForce) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpName.hashCode()
        result = 31 * result + this.lpProvider.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.fForce.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lpName: Pwstr = MutPtr(0L),
            lpProvider: Pwstr = MutPtr(0L),
            dwFlags: UInt = 0u,
            fForce: Bool = 0,
        ): Notifycancel =
            Notifycancel(
                lpNameCtorArg = lpName,
                lpProviderCtorArg = lpProvider,
                dwFlags = dwFlags,
                fForce = fForce,
            )
    }
}

public class Notifyinfo internal constructor(
    public var dwNotifyStatus: UInt,
    public var dwOperationStatus: UInt,
    lpContextCtorArg: MutPtr<CVoid>,
) {
    public var lpContext: MutPtr<CVoid> = lpContextCtorArg
        internal set

    public constructor() : this(
        dwNotifyStatus = 0u,
        dwOperationStatus = 0u,
        lpContextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwNotifyStatus

    public operator fun component2(): UInt = this.dwOperationStatus

    public operator fun component3(): MutPtr<CVoid> = this.lpContext

    public fun copy(dwNotifyStatus: UInt = this.dwNotifyStatus, dwOperationStatus: UInt = this.dwOperationStatus, lpContext: MutPtr<CVoid> = this.lpContext): Notifyinfo = Notifyinfo(dwNotifyStatus = dwNotifyStatus, dwOperationStatus = dwOperationStatus, lpContextCtorArg = lpContext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Notifyinfo) return false
        if (this.dwNotifyStatus != other.dwNotifyStatus) return false
        if (this.dwOperationStatus != other.dwOperationStatus) return false
        if (this.lpContext != other.lpContext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwNotifyStatus.hashCode()
        result = 31 * result + this.dwOperationStatus.hashCode()
        result = 31 * result + this.lpContext.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Notifyinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Notifyinfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Notifyinfo =
                    Notifyinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Notifyinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwNotifyStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwOperationStatus)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.lpContext)
                }
            }

        public operator fun invoke(
            dwNotifyStatus: UInt = 0u,
            dwOperationStatus: UInt = 0u,
            lpContext: MutPtr<CVoid> = MutPtr(0L),
        ): Notifyinfo =
            Notifyinfo(
                dwNotifyStatus = dwNotifyStatus,
                dwOperationStatus = dwOperationStatus,
                lpContextCtorArg = lpContext,
            )
    }
}

public class RemoteNameInfoa internal constructor(
    lpUniversalNameCtorArg: Pstr,
    lpConnectionNameCtorArg: Pstr,
    lpRemainingPathCtorArg: Pstr,
) {
    public var lpUniversalName: Pstr = lpUniversalNameCtorArg
        internal set

    public var lpConnectionName: Pstr = lpConnectionNameCtorArg
        internal set

    public var lpRemainingPath: Pstr = lpRemainingPathCtorArg
        internal set

    public constructor() : this(
        lpUniversalNameCtorArg = MutPtr(0L),
        lpConnectionNameCtorArg = MutPtr(0L),
        lpRemainingPathCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pstr = this.lpUniversalName

    public operator fun component2(): Pstr = this.lpConnectionName

    public operator fun component3(): Pstr = this.lpRemainingPath

    public fun copy(lpUniversalName: Pstr = this.lpUniversalName, lpConnectionName: Pstr = this.lpConnectionName, lpRemainingPath: Pstr = this.lpRemainingPath): RemoteNameInfoa = RemoteNameInfoa(lpUniversalNameCtorArg = lpUniversalName, lpConnectionNameCtorArg = lpConnectionName, lpRemainingPathCtorArg = lpRemainingPath)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RemoteNameInfoa) return false
        if (this.lpUniversalName != other.lpUniversalName) return false
        if (this.lpConnectionName != other.lpConnectionName) return false
        if (this.lpRemainingPath != other.lpRemainingPath) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpUniversalName.hashCode()
        result = 31 * result + this.lpConnectionName.hashCode()
        result = 31 * result + this.lpRemainingPath.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lpUniversalName: Pstr = MutPtr(0L),
            lpConnectionName: Pstr = MutPtr(0L),
            lpRemainingPath: Pstr = MutPtr(0L),
        ): RemoteNameInfoa =
            RemoteNameInfoa(
                lpUniversalNameCtorArg = lpUniversalName,
                lpConnectionNameCtorArg = lpConnectionName,
                lpRemainingPathCtorArg = lpRemainingPath,
            )
    }
}

public class RemoteNameInfow internal constructor(
    lpUniversalNameCtorArg: Pwstr,
    lpConnectionNameCtorArg: Pwstr,
    lpRemainingPathCtorArg: Pwstr,
) {
    public var lpUniversalName: Pwstr = lpUniversalNameCtorArg
        internal set

    public var lpConnectionName: Pwstr = lpConnectionNameCtorArg
        internal set

    public var lpRemainingPath: Pwstr = lpRemainingPathCtorArg
        internal set

    public constructor() : this(
        lpUniversalNameCtorArg = MutPtr(0L),
        lpConnectionNameCtorArg = MutPtr(0L),
        lpRemainingPathCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.lpUniversalName

    public operator fun component2(): Pwstr = this.lpConnectionName

    public operator fun component3(): Pwstr = this.lpRemainingPath

    public fun copy(lpUniversalName: Pwstr = this.lpUniversalName, lpConnectionName: Pwstr = this.lpConnectionName, lpRemainingPath: Pwstr = this.lpRemainingPath): RemoteNameInfow = RemoteNameInfow(lpUniversalNameCtorArg = lpUniversalName, lpConnectionNameCtorArg = lpConnectionName, lpRemainingPathCtorArg = lpRemainingPath)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RemoteNameInfow) return false
        if (this.lpUniversalName != other.lpUniversalName) return false
        if (this.lpConnectionName != other.lpConnectionName) return false
        if (this.lpRemainingPath != other.lpRemainingPath) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpUniversalName.hashCode()
        result = 31 * result + this.lpConnectionName.hashCode()
        result = 31 * result + this.lpRemainingPath.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lpUniversalName: Pwstr = MutPtr(0L),
            lpConnectionName: Pwstr = MutPtr(0L),
            lpRemainingPath: Pwstr = MutPtr(0L),
        ): RemoteNameInfow =
            RemoteNameInfow(
                lpUniversalNameCtorArg = lpUniversalName,
                lpConnectionNameCtorArg = lpConnectionName,
                lpRemainingPathCtorArg = lpRemainingPath,
            )
    }
}

public class UniversalNameInfoa internal constructor(
    lpUniversalNameCtorArg: Pstr,
) {
    public var lpUniversalName: Pstr = lpUniversalNameCtorArg
        internal set

    public constructor() : this(
        lpUniversalNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pstr = this.lpUniversalName

    public fun copy(lpUniversalName: Pstr = this.lpUniversalName): UniversalNameInfoa = UniversalNameInfoa(lpUniversalNameCtorArg = lpUniversalName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UniversalNameInfoa) return false
        if (this.lpUniversalName != other.lpUniversalName) return false
        return true
    }

    override fun hashCode(): Int = this.lpUniversalName.hashCode()

    public companion object {
        public operator fun invoke(
            lpUniversalName: Pstr = MutPtr(0L),
        ): UniversalNameInfoa =
            UniversalNameInfoa(
                lpUniversalNameCtorArg = lpUniversalName,
            )
    }
}

public class UniversalNameInfow internal constructor(
    lpUniversalNameCtorArg: Pwstr,
) {
    public var lpUniversalName: Pwstr = lpUniversalNameCtorArg
        internal set

    public constructor() : this(
        lpUniversalNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.lpUniversalName

    public fun copy(lpUniversalName: Pwstr = this.lpUniversalName): UniversalNameInfow = UniversalNameInfow(lpUniversalNameCtorArg = lpUniversalName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UniversalNameInfow) return false
        if (this.lpUniversalName != other.lpUniversalName) return false
        return true
    }

    override fun hashCode(): Int = this.lpUniversalName.hashCode()

    public companion object {
        public operator fun invoke(
            lpUniversalName: Pwstr = MutPtr(0L),
        ): UniversalNameInfow =
            UniversalNameInfow(
                lpUniversalNameCtorArg = lpUniversalName,
            )
    }
}
