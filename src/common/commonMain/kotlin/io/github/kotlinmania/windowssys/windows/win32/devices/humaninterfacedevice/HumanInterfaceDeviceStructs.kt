@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Point
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect

public data class Cpoint(
    public var lP: Int = 0,
    public var dwLog: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cpoint> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cpoint> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Cpoint =
                    Cpoint(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Cpoint) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.lP)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwLog)
                }
            }
    }
}

public data class Diactiona(
    public var uAppData: Int = 0,
    public var dwSemantic: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var anonymous: Diactiona0 = Diactiona0(),
    public var guidInstance: Guid = Guid(),
    public var dwObjID: UInt = 0u,
    public var dwHow: UInt = 0u,
)

public class Diactiona0 internal constructor(
    lptszActionNameCtorArg: Pcstr,
    public var uResIdString: UInt,
) {
    public var lptszActionName: Pcstr = lptszActionNameCtorArg
        internal set

    public constructor() : this(
        lptszActionNameCtorArg = ConstPtr(0L),
        uResIdString = 0u,
    )

    public operator fun component1(): Pcstr = this.lptszActionName

    public operator fun component2(): UInt = this.uResIdString

    public fun copy(lptszActionName: Pcstr = this.lptszActionName, uResIdString: UInt = this.uResIdString): Diactiona0 = Diactiona0(lptszActionNameCtorArg = lptszActionName, uResIdString = uResIdString)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Diactiona0) return false
        if (this.lptszActionName != other.lptszActionName) return false
        if (this.uResIdString != other.uResIdString) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lptszActionName.hashCode()
        result = 31 * result + this.uResIdString.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lptszActionName: Pcstr = ConstPtr(0L),
            uResIdString: UInt = 0u,
        ): Diactiona0 =
            Diactiona0(
                lptszActionNameCtorArg = lptszActionName,
                uResIdString = uResIdString,
            )
    }
}

public class Diactionformata internal constructor(
    public var dwSize: UInt,
    public var dwActionSize: UInt,
    public var dwDataSize: UInt,
    public var dwNumActions: UInt,
    rgoActionCtorArg: MutPtr<Diactiona>,
    public var guidActionMap: Guid,
    public var dwGenre: UInt,
    public var dwBufferSize: UInt,
    public var lAxisMin: Int,
    public var lAxisMax: Int,
    hInstStringCtorArg: Hinstance,
    public var ftTimeStamp: Filetime,
    public var dwCRC: UInt,
    public var tszActionMap: ByteArray,
) {
    public var rgoAction: MutPtr<Diactiona> = rgoActionCtorArg
        internal set

    public var hInstString: Hinstance = hInstStringCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        dwActionSize = 0u,
        dwDataSize = 0u,
        dwNumActions = 0u,
        rgoActionCtorArg = MutPtr(0L),
        guidActionMap = Guid(),
        dwGenre = 0u,
        dwBufferSize = 0u,
        lAxisMin = 0,
        lAxisMax = 0,
        hInstStringCtorArg = MutPtr(0L),
        ftTimeStamp = Filetime(),
        dwCRC = 0u,
        tszActionMap = ByteArray(260),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): UInt = this.dwActionSize

    public operator fun component3(): UInt = this.dwDataSize

    public operator fun component4(): UInt = this.dwNumActions

    public operator fun component5(): MutPtr<Diactiona> = this.rgoAction

    public operator fun component6(): Guid = this.guidActionMap

    public operator fun component7(): UInt = this.dwGenre

    public operator fun component8(): UInt = this.dwBufferSize

    public operator fun component9(): Int = this.lAxisMin

    public operator fun component10(): Int = this.lAxisMax

    public operator fun component11(): Hinstance = this.hInstString

    public operator fun component12(): Filetime = this.ftTimeStamp

    public operator fun component13(): UInt = this.dwCRC

    public operator fun component14(): ByteArray = this.tszActionMap

    public fun copy(dwSize: UInt = this.dwSize, dwActionSize: UInt = this.dwActionSize, dwDataSize: UInt = this.dwDataSize, dwNumActions: UInt = this.dwNumActions, rgoAction: MutPtr<Diactiona> = this.rgoAction, guidActionMap: Guid = this.guidActionMap, dwGenre: UInt = this.dwGenre, dwBufferSize: UInt = this.dwBufferSize, lAxisMin: Int = this.lAxisMin, lAxisMax: Int = this.lAxisMax, hInstString: Hinstance = this.hInstString, ftTimeStamp: Filetime = this.ftTimeStamp, dwCRC: UInt = this.dwCRC, tszActionMap: ByteArray = this.tszActionMap): Diactionformata = Diactionformata(dwSize = dwSize, dwActionSize = dwActionSize, dwDataSize = dwDataSize, dwNumActions = dwNumActions, rgoActionCtorArg = rgoAction, guidActionMap = guidActionMap, dwGenre = dwGenre, dwBufferSize = dwBufferSize, lAxisMin = lAxisMin, lAxisMax = lAxisMax, hInstStringCtorArg = hInstString, ftTimeStamp = ftTimeStamp, dwCRC = dwCRC, tszActionMap = tszActionMap)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Diactionformata) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwActionSize != other.dwActionSize) return false
        if (this.dwDataSize != other.dwDataSize) return false
        if (this.dwNumActions != other.dwNumActions) return false
        if (this.rgoAction != other.rgoAction) return false
        if (this.guidActionMap != other.guidActionMap) return false
        if (this.dwGenre != other.dwGenre) return false
        if (this.dwBufferSize != other.dwBufferSize) return false
        if (this.lAxisMin != other.lAxisMin) return false
        if (this.lAxisMax != other.lAxisMax) return false
        if (this.hInstString != other.hInstString) return false
        if (this.ftTimeStamp != other.ftTimeStamp) return false
        if (this.dwCRC != other.dwCRC) return false
        if (!this.tszActionMap.contentEquals(other.tszActionMap)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwActionSize.hashCode()
        result = 31 * result + this.dwDataSize.hashCode()
        result = 31 * result + this.dwNumActions.hashCode()
        result = 31 * result + this.rgoAction.hashCode()
        result = 31 * result + this.guidActionMap.hashCode()
        result = 31 * result + this.dwGenre.hashCode()
        result = 31 * result + this.dwBufferSize.hashCode()
        result = 31 * result + this.lAxisMin.hashCode()
        result = 31 * result + this.lAxisMax.hashCode()
        result = 31 * result + this.hInstString.hashCode()
        result = 31 * result + this.ftTimeStamp.hashCode()
        result = 31 * result + this.dwCRC.hashCode()
        result = 31 * result + this.tszActionMap.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            dwActionSize: UInt = 0u,
            dwDataSize: UInt = 0u,
            dwNumActions: UInt = 0u,
            rgoAction: MutPtr<Diactiona> = MutPtr(0L),
            guidActionMap: Guid = Guid(),
            dwGenre: UInt = 0u,
            dwBufferSize: UInt = 0u,
            lAxisMin: Int = 0,
            lAxisMax: Int = 0,
            hInstString: Hinstance = MutPtr(0L),
            ftTimeStamp: Filetime = Filetime(),
            dwCRC: UInt = 0u,
            tszActionMap: ByteArray = ByteArray(260),
        ): Diactionformata =
            Diactionformata(
                dwSize = dwSize,
                dwActionSize = dwActionSize,
                dwDataSize = dwDataSize,
                dwNumActions = dwNumActions,
                rgoActionCtorArg = rgoAction,
                guidActionMap = guidActionMap,
                dwGenre = dwGenre,
                dwBufferSize = dwBufferSize,
                lAxisMin = lAxisMin,
                lAxisMax = lAxisMax,
                hInstStringCtorArg = hInstString,
                ftTimeStamp = ftTimeStamp,
                dwCRC = dwCRC,
                tszActionMap = tszActionMap,
            )
    }
}

public class Diactionformatw internal constructor(
    public var dwSize: UInt,
    public var dwActionSize: UInt,
    public var dwDataSize: UInt,
    public var dwNumActions: UInt,
    rgoActionCtorArg: MutPtr<Diactionw>,
    public var guidActionMap: Guid,
    public var dwGenre: UInt,
    public var dwBufferSize: UInt,
    public var lAxisMin: Int,
    public var lAxisMax: Int,
    hInstStringCtorArg: Hinstance,
    public var ftTimeStamp: Filetime,
    public var dwCRC: UInt,
    public var tszActionMap: UShortArray,
) {
    public var rgoAction: MutPtr<Diactionw> = rgoActionCtorArg
        internal set

    public var hInstString: Hinstance = hInstStringCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        dwActionSize = 0u,
        dwDataSize = 0u,
        dwNumActions = 0u,
        rgoActionCtorArg = MutPtr(0L),
        guidActionMap = Guid(),
        dwGenre = 0u,
        dwBufferSize = 0u,
        lAxisMin = 0,
        lAxisMax = 0,
        hInstStringCtorArg = MutPtr(0L),
        ftTimeStamp = Filetime(),
        dwCRC = 0u,
        tszActionMap = UShortArray(260),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): UInt = this.dwActionSize

    public operator fun component3(): UInt = this.dwDataSize

    public operator fun component4(): UInt = this.dwNumActions

    public operator fun component5(): MutPtr<Diactionw> = this.rgoAction

    public operator fun component6(): Guid = this.guidActionMap

    public operator fun component7(): UInt = this.dwGenre

    public operator fun component8(): UInt = this.dwBufferSize

    public operator fun component9(): Int = this.lAxisMin

    public operator fun component10(): Int = this.lAxisMax

    public operator fun component11(): Hinstance = this.hInstString

    public operator fun component12(): Filetime = this.ftTimeStamp

    public operator fun component13(): UInt = this.dwCRC

    public operator fun component14(): UShortArray = this.tszActionMap

    public fun copy(dwSize: UInt = this.dwSize, dwActionSize: UInt = this.dwActionSize, dwDataSize: UInt = this.dwDataSize, dwNumActions: UInt = this.dwNumActions, rgoAction: MutPtr<Diactionw> = this.rgoAction, guidActionMap: Guid = this.guidActionMap, dwGenre: UInt = this.dwGenre, dwBufferSize: UInt = this.dwBufferSize, lAxisMin: Int = this.lAxisMin, lAxisMax: Int = this.lAxisMax, hInstString: Hinstance = this.hInstString, ftTimeStamp: Filetime = this.ftTimeStamp, dwCRC: UInt = this.dwCRC, tszActionMap: UShortArray = this.tszActionMap): Diactionformatw = Diactionformatw(dwSize = dwSize, dwActionSize = dwActionSize, dwDataSize = dwDataSize, dwNumActions = dwNumActions, rgoActionCtorArg = rgoAction, guidActionMap = guidActionMap, dwGenre = dwGenre, dwBufferSize = dwBufferSize, lAxisMin = lAxisMin, lAxisMax = lAxisMax, hInstStringCtorArg = hInstString, ftTimeStamp = ftTimeStamp, dwCRC = dwCRC, tszActionMap = tszActionMap)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Diactionformatw) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwActionSize != other.dwActionSize) return false
        if (this.dwDataSize != other.dwDataSize) return false
        if (this.dwNumActions != other.dwNumActions) return false
        if (this.rgoAction != other.rgoAction) return false
        if (this.guidActionMap != other.guidActionMap) return false
        if (this.dwGenre != other.dwGenre) return false
        if (this.dwBufferSize != other.dwBufferSize) return false
        if (this.lAxisMin != other.lAxisMin) return false
        if (this.lAxisMax != other.lAxisMax) return false
        if (this.hInstString != other.hInstString) return false
        if (this.ftTimeStamp != other.ftTimeStamp) return false
        if (this.dwCRC != other.dwCRC) return false
        if (!this.tszActionMap.contentEquals(other.tszActionMap)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwActionSize.hashCode()
        result = 31 * result + this.dwDataSize.hashCode()
        result = 31 * result + this.dwNumActions.hashCode()
        result = 31 * result + this.rgoAction.hashCode()
        result = 31 * result + this.guidActionMap.hashCode()
        result = 31 * result + this.dwGenre.hashCode()
        result = 31 * result + this.dwBufferSize.hashCode()
        result = 31 * result + this.lAxisMin.hashCode()
        result = 31 * result + this.lAxisMax.hashCode()
        result = 31 * result + this.hInstString.hashCode()
        result = 31 * result + this.ftTimeStamp.hashCode()
        result = 31 * result + this.dwCRC.hashCode()
        result = 31 * result + this.tszActionMap.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            dwActionSize: UInt = 0u,
            dwDataSize: UInt = 0u,
            dwNumActions: UInt = 0u,
            rgoAction: MutPtr<Diactionw> = MutPtr(0L),
            guidActionMap: Guid = Guid(),
            dwGenre: UInt = 0u,
            dwBufferSize: UInt = 0u,
            lAxisMin: Int = 0,
            lAxisMax: Int = 0,
            hInstString: Hinstance = MutPtr(0L),
            ftTimeStamp: Filetime = Filetime(),
            dwCRC: UInt = 0u,
            tszActionMap: UShortArray = UShortArray(260),
        ): Diactionformatw =
            Diactionformatw(
                dwSize = dwSize,
                dwActionSize = dwActionSize,
                dwDataSize = dwDataSize,
                dwNumActions = dwNumActions,
                rgoActionCtorArg = rgoAction,
                guidActionMap = guidActionMap,
                dwGenre = dwGenre,
                dwBufferSize = dwBufferSize,
                lAxisMin = lAxisMin,
                lAxisMax = lAxisMax,
                hInstStringCtorArg = hInstString,
                ftTimeStamp = ftTimeStamp,
                dwCRC = dwCRC,
                tszActionMap = tszActionMap,
            )
    }
}

public data class Diactionw(
    public var uAppData: Int = 0,
    public var dwSemantic: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var anonymous: Diactionw0 = Diactionw0(),
    public var guidInstance: Guid = Guid(),
    public var dwObjID: UInt = 0u,
    public var dwHow: UInt = 0u,
)

public class Diactionw0 internal constructor(
    lptszActionNameCtorArg: Pcwstr,
    public var uResIdString: UInt,
) {
    public var lptszActionName: Pcwstr = lptszActionNameCtorArg
        internal set

    public constructor() : this(
        lptszActionNameCtorArg = ConstPtr(0L),
        uResIdString = 0u,
    )

    public operator fun component1(): Pcwstr = this.lptszActionName

    public operator fun component2(): UInt = this.uResIdString

    public fun copy(lptszActionName: Pcwstr = this.lptszActionName, uResIdString: UInt = this.uResIdString): Diactionw0 = Diactionw0(lptszActionNameCtorArg = lptszActionName, uResIdString = uResIdString)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Diactionw0) return false
        if (this.lptszActionName != other.lptszActionName) return false
        if (this.uResIdString != other.uResIdString) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lptszActionName.hashCode()
        result = 31 * result + this.uResIdString.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lptszActionName: Pcwstr = ConstPtr(0L),
            uResIdString: UInt = 0u,
        ): Diactionw0 =
            Diactionw0(
                lptszActionNameCtorArg = lptszActionName,
                uResIdString = uResIdString,
            )
    }
}

public data class Dicolorset(
    public var dwSize: UInt = 0u,
    public var cTextFore: UInt = 0u,
    public var cTextHighlight: UInt = 0u,
    public var cCalloutLine: UInt = 0u,
    public var cCalloutHighlight: UInt = 0u,
    public var cBorder: UInt = 0u,
    public var cControlFill: UInt = 0u,
    public var cHighlightFill: UInt = 0u,
    public var cAreaFill: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dicolorset> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dicolorset> {
                override val sizeBytes: Long = 36L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dicolorset =
                    Dicolorset(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: Dicolorset) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cTextFore)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cTextHighlight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cCalloutLine)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cCalloutHighlight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.cBorder)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.cControlFill)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.cHighlightFill)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.cAreaFill)
                }
            }
    }
}

public data class Dicondition(
    public var lOffset: Int = 0,
    public var lPositiveCoefficient: Int = 0,
    public var lNegativeCoefficient: Int = 0,
    public var dwPositiveSaturation: UInt = 0u,
    public var dwNegativeSaturation: UInt = 0u,
    public var lDeadBand: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dicondition> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dicondition> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dicondition =
                    Dicondition(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: Dicondition) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.lOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.lPositiveCoefficient)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.lNegativeCoefficient)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwPositiveSaturation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwNegativeSaturation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.lDeadBand)
                }
            }
    }
}

public class Diconfiguredevicesparamsa internal constructor(
    public var dwSize: UInt,
    public var dwcUsers: UInt,
    lptszUserNamesCtorArg: Pstr,
    public var dwcFormats: UInt,
    lprgFormatsCtorArg: MutPtr<Diactionformata>,
    hwndCtorArg: Hwnd,
    public var dics: Dicolorset,
    lpUnkDDSTargetCtorArg: MutPtr<CVoid>,
) {
    public var lptszUserNames: Pstr = lptszUserNamesCtorArg
        internal set

    public var lprgFormats: MutPtr<Diactionformata> = lprgFormatsCtorArg
        internal set

    public var hwnd: Hwnd = hwndCtorArg
        internal set

    public var lpUnkDDSTarget: MutPtr<CVoid> = lpUnkDDSTargetCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        dwcUsers = 0u,
        lptszUserNamesCtorArg = MutPtr(0L),
        dwcFormats = 0u,
        lprgFormatsCtorArg = MutPtr(0L),
        hwndCtorArg = MutPtr(0L),
        dics = Dicolorset(),
        lpUnkDDSTargetCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): UInt = this.dwcUsers

    public operator fun component3(): Pstr = this.lptszUserNames

    public operator fun component4(): UInt = this.dwcFormats

    public operator fun component5(): MutPtr<Diactionformata> = this.lprgFormats

    public operator fun component6(): Hwnd = this.hwnd

    public operator fun component7(): Dicolorset = this.dics

    public operator fun component8(): MutPtr<CVoid> = this.lpUnkDDSTarget

    public fun copy(dwSize: UInt = this.dwSize, dwcUsers: UInt = this.dwcUsers, lptszUserNames: Pstr = this.lptszUserNames, dwcFormats: UInt = this.dwcFormats, lprgFormats: MutPtr<Diactionformata> = this.lprgFormats, hwnd: Hwnd = this.hwnd, dics: Dicolorset = this.dics, lpUnkDDSTarget: MutPtr<CVoid> = this.lpUnkDDSTarget): Diconfiguredevicesparamsa = Diconfiguredevicesparamsa(dwSize = dwSize, dwcUsers = dwcUsers, lptszUserNamesCtorArg = lptszUserNames, dwcFormats = dwcFormats, lprgFormatsCtorArg = lprgFormats, hwndCtorArg = hwnd, dics = dics, lpUnkDDSTargetCtorArg = lpUnkDDSTarget)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Diconfiguredevicesparamsa) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwcUsers != other.dwcUsers) return false
        if (this.lptszUserNames != other.lptszUserNames) return false
        if (this.dwcFormats != other.dwcFormats) return false
        if (this.lprgFormats != other.lprgFormats) return false
        if (this.hwnd != other.hwnd) return false
        if (this.dics != other.dics) return false
        if (this.lpUnkDDSTarget != other.lpUnkDDSTarget) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwcUsers.hashCode()
        result = 31 * result + this.lptszUserNames.hashCode()
        result = 31 * result + this.dwcFormats.hashCode()
        result = 31 * result + this.lprgFormats.hashCode()
        result = 31 * result + this.hwnd.hashCode()
        result = 31 * result + this.dics.hashCode()
        result = 31 * result + this.lpUnkDDSTarget.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            dwcUsers: UInt = 0u,
            lptszUserNames: Pstr = MutPtr(0L),
            dwcFormats: UInt = 0u,
            lprgFormats: MutPtr<Diactionformata> = MutPtr(0L),
            hwnd: Hwnd = MutPtr(0L),
            dics: Dicolorset = Dicolorset(),
            lpUnkDDSTarget: MutPtr<CVoid> = MutPtr(0L),
        ): Diconfiguredevicesparamsa =
            Diconfiguredevicesparamsa(
                dwSize = dwSize,
                dwcUsers = dwcUsers,
                lptszUserNamesCtorArg = lptszUserNames,
                dwcFormats = dwcFormats,
                lprgFormatsCtorArg = lprgFormats,
                hwndCtorArg = hwnd,
                dics = dics,
                lpUnkDDSTargetCtorArg = lpUnkDDSTarget,
            )
    }
}

public class Diconfiguredevicesparamsw internal constructor(
    public var dwSize: UInt,
    public var dwcUsers: UInt,
    lptszUserNamesCtorArg: Pwstr,
    public var dwcFormats: UInt,
    lprgFormatsCtorArg: MutPtr<Diactionformatw>,
    hwndCtorArg: Hwnd,
    public var dics: Dicolorset,
    lpUnkDDSTargetCtorArg: MutPtr<CVoid>,
) {
    public var lptszUserNames: Pwstr = lptszUserNamesCtorArg
        internal set

    public var lprgFormats: MutPtr<Diactionformatw> = lprgFormatsCtorArg
        internal set

    public var hwnd: Hwnd = hwndCtorArg
        internal set

    public var lpUnkDDSTarget: MutPtr<CVoid> = lpUnkDDSTargetCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        dwcUsers = 0u,
        lptszUserNamesCtorArg = MutPtr(0L),
        dwcFormats = 0u,
        lprgFormatsCtorArg = MutPtr(0L),
        hwndCtorArg = MutPtr(0L),
        dics = Dicolorset(),
        lpUnkDDSTargetCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): UInt = this.dwcUsers

    public operator fun component3(): Pwstr = this.lptszUserNames

    public operator fun component4(): UInt = this.dwcFormats

    public operator fun component5(): MutPtr<Diactionformatw> = this.lprgFormats

    public operator fun component6(): Hwnd = this.hwnd

    public operator fun component7(): Dicolorset = this.dics

    public operator fun component8(): MutPtr<CVoid> = this.lpUnkDDSTarget

    public fun copy(dwSize: UInt = this.dwSize, dwcUsers: UInt = this.dwcUsers, lptszUserNames: Pwstr = this.lptszUserNames, dwcFormats: UInt = this.dwcFormats, lprgFormats: MutPtr<Diactionformatw> = this.lprgFormats, hwnd: Hwnd = this.hwnd, dics: Dicolorset = this.dics, lpUnkDDSTarget: MutPtr<CVoid> = this.lpUnkDDSTarget): Diconfiguredevicesparamsw = Diconfiguredevicesparamsw(dwSize = dwSize, dwcUsers = dwcUsers, lptszUserNamesCtorArg = lptszUserNames, dwcFormats = dwcFormats, lprgFormatsCtorArg = lprgFormats, hwndCtorArg = hwnd, dics = dics, lpUnkDDSTargetCtorArg = lpUnkDDSTarget)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Diconfiguredevicesparamsw) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwcUsers != other.dwcUsers) return false
        if (this.lptszUserNames != other.lptszUserNames) return false
        if (this.dwcFormats != other.dwcFormats) return false
        if (this.lprgFormats != other.lprgFormats) return false
        if (this.hwnd != other.hwnd) return false
        if (this.dics != other.dics) return false
        if (this.lpUnkDDSTarget != other.lpUnkDDSTarget) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwcUsers.hashCode()
        result = 31 * result + this.lptszUserNames.hashCode()
        result = 31 * result + this.dwcFormats.hashCode()
        result = 31 * result + this.lprgFormats.hashCode()
        result = 31 * result + this.hwnd.hashCode()
        result = 31 * result + this.dics.hashCode()
        result = 31 * result + this.lpUnkDDSTarget.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            dwcUsers: UInt = 0u,
            lptszUserNames: Pwstr = MutPtr(0L),
            dwcFormats: UInt = 0u,
            lprgFormats: MutPtr<Diactionformatw> = MutPtr(0L),
            hwnd: Hwnd = MutPtr(0L),
            dics: Dicolorset = Dicolorset(),
            lpUnkDDSTarget: MutPtr<CVoid> = MutPtr(0L),
        ): Diconfiguredevicesparamsw =
            Diconfiguredevicesparamsw(
                dwSize = dwSize,
                dwcUsers = dwcUsers,
                lptszUserNamesCtorArg = lptszUserNames,
                dwcFormats = dwcFormats,
                lprgFormatsCtorArg = lprgFormats,
                hwndCtorArg = hwnd,
                dics = dics,
                lpUnkDDSTargetCtorArg = lpUnkDDSTarget,
            )
    }
}

public data class Diconstantforce(
    public var lMagnitude: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Diconstantforce> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Diconstantforce> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Diconstantforce =
                    Diconstantforce(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Diconstantforce) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.lMagnitude)
                }
            }
    }
}

public class Dicustomforce internal constructor(
    public var cChannels: UInt,
    public var dwSamplePeriod: UInt,
    public var cSamples: UInt,
    rglForceDataCtorArg: MutPtr<Int>,
) {
    public var rglForceData: MutPtr<Int> = rglForceDataCtorArg
        internal set

    public constructor() : this(
        cChannels = 0u,
        dwSamplePeriod = 0u,
        cSamples = 0u,
        rglForceDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cChannels

    public operator fun component2(): UInt = this.dwSamplePeriod

    public operator fun component3(): UInt = this.cSamples

    public operator fun component4(): MutPtr<Int> = this.rglForceData

    public fun copy(cChannels: UInt = this.cChannels, dwSamplePeriod: UInt = this.dwSamplePeriod, cSamples: UInt = this.cSamples, rglForceData: MutPtr<Int> = this.rglForceData): Dicustomforce = Dicustomforce(cChannels = cChannels, dwSamplePeriod = dwSamplePeriod, cSamples = cSamples, rglForceDataCtorArg = rglForceData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dicustomforce) return false
        if (this.cChannels != other.cChannels) return false
        if (this.dwSamplePeriod != other.dwSamplePeriod) return false
        if (this.cSamples != other.cSamples) return false
        if (this.rglForceData != other.rglForceData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cChannels.hashCode()
        result = 31 * result + this.dwSamplePeriod.hashCode()
        result = 31 * result + this.cSamples.hashCode()
        result = 31 * result + this.rglForceData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dicustomforce> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dicustomforce> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Dicustomforce =
                    Dicustomforce(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Int>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Dicustomforce) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cChannels)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwSamplePeriod)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cSamples)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Int>(64)
                    ).writeNative(addr + 16L, value.rglForceData)
                }
            }

        public operator fun invoke(
            cChannels: UInt = 0u,
            dwSamplePeriod: UInt = 0u,
            cSamples: UInt = 0u,
            rglForceData: MutPtr<Int> = MutPtr(0L),
        ): Dicustomforce =
            Dicustomforce(
                cChannels = cChannels,
                dwSamplePeriod = dwSamplePeriod,
                cSamples = cSamples,
                rglForceDataCtorArg = rglForceData,
            )
    }
}

public class Didataformat internal constructor(
    public var dwSize: UInt,
    public var dwObjSize: UInt,
    public var dwFlags: UInt,
    public var dwDataSize: UInt,
    public var dwNumObjs: UInt,
    rgodfCtorArg: MutPtr<Diobjectdataformat>,
) {
    public var rgodf: MutPtr<Diobjectdataformat> = rgodfCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        dwObjSize = 0u,
        dwFlags = 0u,
        dwDataSize = 0u,
        dwNumObjs = 0u,
        rgodfCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): UInt = this.dwObjSize

    public operator fun component3(): UInt = this.dwFlags

    public operator fun component4(): UInt = this.dwDataSize

    public operator fun component5(): UInt = this.dwNumObjs

    public operator fun component6(): MutPtr<Diobjectdataformat> = this.rgodf

    public fun copy(dwSize: UInt = this.dwSize, dwObjSize: UInt = this.dwObjSize, dwFlags: UInt = this.dwFlags, dwDataSize: UInt = this.dwDataSize, dwNumObjs: UInt = this.dwNumObjs, rgodf: MutPtr<Diobjectdataformat> = this.rgodf): Didataformat = Didataformat(dwSize = dwSize, dwObjSize = dwObjSize, dwFlags = dwFlags, dwDataSize = dwDataSize, dwNumObjs = dwNumObjs, rgodfCtorArg = rgodf)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Didataformat) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwObjSize != other.dwObjSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwDataSize != other.dwDataSize) return false
        if (this.dwNumObjs != other.dwNumObjs) return false
        if (this.rgodf != other.rgodf) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwObjSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwDataSize.hashCode()
        result = 31 * result + this.dwNumObjs.hashCode()
        result = 31 * result + this.rgodf.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Didataformat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Didataformat> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Didataformat =
                    Didataformat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Diobjectdataformat>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Didataformat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwObjSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwDataSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwNumObjs)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Diobjectdataformat>(64)
                    ).writeNative(addr + 24L, value.rgodf)
                }
            }

        public operator fun invoke(
            dwSize: UInt = 0u,
            dwObjSize: UInt = 0u,
            dwFlags: UInt = 0u,
            dwDataSize: UInt = 0u,
            dwNumObjs: UInt = 0u,
            rgodf: MutPtr<Diobjectdataformat> = MutPtr(0L),
        ): Didataformat =
            Didataformat(
                dwSize = dwSize,
                dwObjSize = dwObjSize,
                dwFlags = dwFlags,
                dwDataSize = dwDataSize,
                dwNumObjs = dwNumObjs,
                rgodfCtorArg = rgodf,
            )
    }
}

public data class Didevcaps(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwDevType: UInt = 0u,
    public var dwAxes: UInt = 0u,
    public var dwButtons: UInt = 0u,
    public var dwPOVs: UInt = 0u,
    public var dwFFSamplePeriod: UInt = 0u,
    public var dwFFMinTimeResolution: UInt = 0u,
    public var dwFirmwareRevision: UInt = 0u,
    public var dwHardwareRevision: UInt = 0u,
    public var dwFFDriverVersion: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Didevcaps> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Didevcaps> {
                override val sizeBytes: Long = 44L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Didevcaps =
                    Didevcaps(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: Didevcaps) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwDevType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwAxes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwButtons)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwPOVs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwFFSamplePeriod)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwFFMinTimeResolution)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwFirmwareRevision)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.dwHardwareRevision)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.dwFFDriverVersion)
                }
            }
    }
}

public data class DidevcapsDx3(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwDevType: UInt = 0u,
    public var dwAxes: UInt = 0u,
    public var dwButtons: UInt = 0u,
    public var dwPOVs: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DidevcapsDx3> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DidevcapsDx3> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): DidevcapsDx3 =
                    DidevcapsDx3(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: DidevcapsDx3) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwDevType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwAxes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwButtons)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwPOVs)
                }
            }
    }
}

public data class Dideviceimageinfoa(
    public var tszImagePath: ByteArray = ByteArray(260),
    public var dwFlags: UInt = 0u,
    public var dwViewID: UInt = 0u,
    public var rcOverlay: Rect = Rect(),
    public var dwObjID: UInt = 0u,
    public var dwcValidPts: UInt = 0u,
    public var rgptCalloutLine: List<Point> = List(5) { Point() },
    public var rcCalloutRect: Rect = Rect(),
    public var dwTextAlign: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dideviceimageinfoa) return false
        if (!this.tszImagePath.contentEquals(other.tszImagePath)) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwViewID != other.dwViewID) return false
        if (this.rcOverlay != other.rcOverlay) return false
        if (this.dwObjID != other.dwObjID) return false
        if (this.dwcValidPts != other.dwcValidPts) return false
        if (this.rgptCalloutLine != other.rgptCalloutLine) return false
        if (this.rcCalloutRect != other.rcCalloutRect) return false
        if (this.dwTextAlign != other.dwTextAlign) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.tszImagePath.contentHashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwViewID.hashCode()
        result = 31 * result + this.rcOverlay.hashCode()
        result = 31 * result + this.dwObjID.hashCode()
        result = 31 * result + this.dwcValidPts.hashCode()
        result = 31 * result + this.rgptCalloutLine.hashCode()
        result = 31 * result + this.rcCalloutRect.hashCode()
        result = 31 * result + this.dwTextAlign.hashCode()
        return result
    }
}

public class Dideviceimageinfoheadera internal constructor(
    public var dwSize: UInt,
    public var dwSizeImageInfo: UInt,
    public var dwcViews: UInt,
    public var dwcButtons: UInt,
    public var dwcAxes: UInt,
    public var dwcPOVs: UInt,
    public var dwBufferSize: UInt,
    public var dwBufferUsed: UInt,
    lprgImageInfoArrayCtorArg: MutPtr<Dideviceimageinfoa>,
) {
    public var lprgImageInfoArray: MutPtr<Dideviceimageinfoa> = lprgImageInfoArrayCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        dwSizeImageInfo = 0u,
        dwcViews = 0u,
        dwcButtons = 0u,
        dwcAxes = 0u,
        dwcPOVs = 0u,
        dwBufferSize = 0u,
        dwBufferUsed = 0u,
        lprgImageInfoArrayCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): UInt = this.dwSizeImageInfo

    public operator fun component3(): UInt = this.dwcViews

    public operator fun component4(): UInt = this.dwcButtons

    public operator fun component5(): UInt = this.dwcAxes

    public operator fun component6(): UInt = this.dwcPOVs

    public operator fun component7(): UInt = this.dwBufferSize

    public operator fun component8(): UInt = this.dwBufferUsed

    public operator fun component9(): MutPtr<Dideviceimageinfoa> = this.lprgImageInfoArray

    public fun copy(dwSize: UInt = this.dwSize, dwSizeImageInfo: UInt = this.dwSizeImageInfo, dwcViews: UInt = this.dwcViews, dwcButtons: UInt = this.dwcButtons, dwcAxes: UInt = this.dwcAxes, dwcPOVs: UInt = this.dwcPOVs, dwBufferSize: UInt = this.dwBufferSize, dwBufferUsed: UInt = this.dwBufferUsed, lprgImageInfoArray: MutPtr<Dideviceimageinfoa> = this.lprgImageInfoArray): Dideviceimageinfoheadera = Dideviceimageinfoheadera(dwSize = dwSize, dwSizeImageInfo = dwSizeImageInfo, dwcViews = dwcViews, dwcButtons = dwcButtons, dwcAxes = dwcAxes, dwcPOVs = dwcPOVs, dwBufferSize = dwBufferSize, dwBufferUsed = dwBufferUsed, lprgImageInfoArrayCtorArg = lprgImageInfoArray)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dideviceimageinfoheadera) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwSizeImageInfo != other.dwSizeImageInfo) return false
        if (this.dwcViews != other.dwcViews) return false
        if (this.dwcButtons != other.dwcButtons) return false
        if (this.dwcAxes != other.dwcAxes) return false
        if (this.dwcPOVs != other.dwcPOVs) return false
        if (this.dwBufferSize != other.dwBufferSize) return false
        if (this.dwBufferUsed != other.dwBufferUsed) return false
        if (this.lprgImageInfoArray != other.lprgImageInfoArray) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwSizeImageInfo.hashCode()
        result = 31 * result + this.dwcViews.hashCode()
        result = 31 * result + this.dwcButtons.hashCode()
        result = 31 * result + this.dwcAxes.hashCode()
        result = 31 * result + this.dwcPOVs.hashCode()
        result = 31 * result + this.dwBufferSize.hashCode()
        result = 31 * result + this.dwBufferUsed.hashCode()
        result = 31 * result + this.lprgImageInfoArray.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dideviceimageinfoheadera> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dideviceimageinfoheadera> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Dideviceimageinfoheadera =
                    Dideviceimageinfoheadera(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Dideviceimageinfoa>(64)
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: Dideviceimageinfoheadera) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwSizeImageInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwcViews)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwcButtons)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwcAxes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwcPOVs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwBufferSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwBufferUsed)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Dideviceimageinfoa>(64)
                    ).writeNative(addr + 32L, value.lprgImageInfoArray)
                }
            }

        public operator fun invoke(
            dwSize: UInt = 0u,
            dwSizeImageInfo: UInt = 0u,
            dwcViews: UInt = 0u,
            dwcButtons: UInt = 0u,
            dwcAxes: UInt = 0u,
            dwcPOVs: UInt = 0u,
            dwBufferSize: UInt = 0u,
            dwBufferUsed: UInt = 0u,
            lprgImageInfoArray: MutPtr<Dideviceimageinfoa> = MutPtr(0L),
        ): Dideviceimageinfoheadera =
            Dideviceimageinfoheadera(
                dwSize = dwSize,
                dwSizeImageInfo = dwSizeImageInfo,
                dwcViews = dwcViews,
                dwcButtons = dwcButtons,
                dwcAxes = dwcAxes,
                dwcPOVs = dwcPOVs,
                dwBufferSize = dwBufferSize,
                dwBufferUsed = dwBufferUsed,
                lprgImageInfoArrayCtorArg = lprgImageInfoArray,
            )
    }
}

public class Dideviceimageinfoheaderw internal constructor(
    public var dwSize: UInt,
    public var dwSizeImageInfo: UInt,
    public var dwcViews: UInt,
    public var dwcButtons: UInt,
    public var dwcAxes: UInt,
    public var dwcPOVs: UInt,
    public var dwBufferSize: UInt,
    public var dwBufferUsed: UInt,
    lprgImageInfoArrayCtorArg: MutPtr<Dideviceimageinfow>,
) {
    public var lprgImageInfoArray: MutPtr<Dideviceimageinfow> = lprgImageInfoArrayCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        dwSizeImageInfo = 0u,
        dwcViews = 0u,
        dwcButtons = 0u,
        dwcAxes = 0u,
        dwcPOVs = 0u,
        dwBufferSize = 0u,
        dwBufferUsed = 0u,
        lprgImageInfoArrayCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): UInt = this.dwSizeImageInfo

    public operator fun component3(): UInt = this.dwcViews

    public operator fun component4(): UInt = this.dwcButtons

    public operator fun component5(): UInt = this.dwcAxes

    public operator fun component6(): UInt = this.dwcPOVs

    public operator fun component7(): UInt = this.dwBufferSize

    public operator fun component8(): UInt = this.dwBufferUsed

    public operator fun component9(): MutPtr<Dideviceimageinfow> = this.lprgImageInfoArray

    public fun copy(dwSize: UInt = this.dwSize, dwSizeImageInfo: UInt = this.dwSizeImageInfo, dwcViews: UInt = this.dwcViews, dwcButtons: UInt = this.dwcButtons, dwcAxes: UInt = this.dwcAxes, dwcPOVs: UInt = this.dwcPOVs, dwBufferSize: UInt = this.dwBufferSize, dwBufferUsed: UInt = this.dwBufferUsed, lprgImageInfoArray: MutPtr<Dideviceimageinfow> = this.lprgImageInfoArray): Dideviceimageinfoheaderw = Dideviceimageinfoheaderw(dwSize = dwSize, dwSizeImageInfo = dwSizeImageInfo, dwcViews = dwcViews, dwcButtons = dwcButtons, dwcAxes = dwcAxes, dwcPOVs = dwcPOVs, dwBufferSize = dwBufferSize, dwBufferUsed = dwBufferUsed, lprgImageInfoArrayCtorArg = lprgImageInfoArray)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dideviceimageinfoheaderw) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwSizeImageInfo != other.dwSizeImageInfo) return false
        if (this.dwcViews != other.dwcViews) return false
        if (this.dwcButtons != other.dwcButtons) return false
        if (this.dwcAxes != other.dwcAxes) return false
        if (this.dwcPOVs != other.dwcPOVs) return false
        if (this.dwBufferSize != other.dwBufferSize) return false
        if (this.dwBufferUsed != other.dwBufferUsed) return false
        if (this.lprgImageInfoArray != other.lprgImageInfoArray) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwSizeImageInfo.hashCode()
        result = 31 * result + this.dwcViews.hashCode()
        result = 31 * result + this.dwcButtons.hashCode()
        result = 31 * result + this.dwcAxes.hashCode()
        result = 31 * result + this.dwcPOVs.hashCode()
        result = 31 * result + this.dwBufferSize.hashCode()
        result = 31 * result + this.dwBufferUsed.hashCode()
        result = 31 * result + this.lprgImageInfoArray.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dideviceimageinfoheaderw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dideviceimageinfoheaderw> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Dideviceimageinfoheaderw =
                    Dideviceimageinfoheaderw(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Dideviceimageinfow>(64)
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: Dideviceimageinfoheaderw) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwSizeImageInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwcViews)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwcButtons)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwcAxes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwcPOVs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwBufferSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwBufferUsed)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Dideviceimageinfow>(64)
                    ).writeNative(addr + 32L, value.lprgImageInfoArray)
                }
            }

        public operator fun invoke(
            dwSize: UInt = 0u,
            dwSizeImageInfo: UInt = 0u,
            dwcViews: UInt = 0u,
            dwcButtons: UInt = 0u,
            dwcAxes: UInt = 0u,
            dwcPOVs: UInt = 0u,
            dwBufferSize: UInt = 0u,
            dwBufferUsed: UInt = 0u,
            lprgImageInfoArray: MutPtr<Dideviceimageinfow> = MutPtr(0L),
        ): Dideviceimageinfoheaderw =
            Dideviceimageinfoheaderw(
                dwSize = dwSize,
                dwSizeImageInfo = dwSizeImageInfo,
                dwcViews = dwcViews,
                dwcButtons = dwcButtons,
                dwcAxes = dwcAxes,
                dwcPOVs = dwcPOVs,
                dwBufferSize = dwBufferSize,
                dwBufferUsed = dwBufferUsed,
                lprgImageInfoArrayCtorArg = lprgImageInfoArray,
            )
    }
}

public data class Dideviceimageinfow(
    public var tszImagePath: UShortArray = UShortArray(260),
    public var dwFlags: UInt = 0u,
    public var dwViewID: UInt = 0u,
    public var rcOverlay: Rect = Rect(),
    public var dwObjID: UInt = 0u,
    public var dwcValidPts: UInt = 0u,
    public var rgptCalloutLine: List<Point> = List(5) { Point() },
    public var rcCalloutRect: Rect = Rect(),
    public var dwTextAlign: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dideviceimageinfow) return false
        if (!this.tszImagePath.contentEquals(other.tszImagePath)) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwViewID != other.dwViewID) return false
        if (this.rcOverlay != other.rcOverlay) return false
        if (this.dwObjID != other.dwObjID) return false
        if (this.dwcValidPts != other.dwcValidPts) return false
        if (this.rgptCalloutLine != other.rgptCalloutLine) return false
        if (this.rcCalloutRect != other.rcCalloutRect) return false
        if (this.dwTextAlign != other.dwTextAlign) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.tszImagePath.contentHashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwViewID.hashCode()
        result = 31 * result + this.rcOverlay.hashCode()
        result = 31 * result + this.dwObjID.hashCode()
        result = 31 * result + this.dwcValidPts.hashCode()
        result = 31 * result + this.rgptCalloutLine.hashCode()
        result = 31 * result + this.rcCalloutRect.hashCode()
        result = 31 * result + this.dwTextAlign.hashCode()
        return result
    }
}

public data class Dideviceinstancea(
    public var dwSize: UInt = 0u,
    public var guidInstance: Guid = Guid(),
    public var guidProduct: Guid = Guid(),
    public var dwDevType: UInt = 0u,
    public var tszInstanceName: ByteArray = ByteArray(260),
    public var tszProductName: ByteArray = ByteArray(260),
    public var guidFFDriver: Guid = Guid(),
    public var wUsagePage: UShort = 0u,
    public var wUsage: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dideviceinstancea) return false
        if (this.dwSize != other.dwSize) return false
        if (this.guidInstance != other.guidInstance) return false
        if (this.guidProduct != other.guidProduct) return false
        if (this.dwDevType != other.dwDevType) return false
        if (!this.tszInstanceName.contentEquals(other.tszInstanceName)) return false
        if (!this.tszProductName.contentEquals(other.tszProductName)) return false
        if (this.guidFFDriver != other.guidFFDriver) return false
        if (this.wUsagePage != other.wUsagePage) return false
        if (this.wUsage != other.wUsage) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.guidInstance.hashCode()
        result = 31 * result + this.guidProduct.hashCode()
        result = 31 * result + this.dwDevType.hashCode()
        result = 31 * result + this.tszInstanceName.contentHashCode()
        result = 31 * result + this.tszProductName.contentHashCode()
        result = 31 * result + this.guidFFDriver.hashCode()
        result = 31 * result + this.wUsagePage.hashCode()
        result = 31 * result + this.wUsage.hashCode()
        return result
    }
}

public data class Dideviceinstancew(
    public var dwSize: UInt = 0u,
    public var guidInstance: Guid = Guid(),
    public var guidProduct: Guid = Guid(),
    public var dwDevType: UInt = 0u,
    public var tszInstanceName: UShortArray = UShortArray(260),
    public var tszProductName: UShortArray = UShortArray(260),
    public var guidFFDriver: Guid = Guid(),
    public var wUsagePage: UShort = 0u,
    public var wUsage: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dideviceinstancew) return false
        if (this.dwSize != other.dwSize) return false
        if (this.guidInstance != other.guidInstance) return false
        if (this.guidProduct != other.guidProduct) return false
        if (this.dwDevType != other.dwDevType) return false
        if (!this.tszInstanceName.contentEquals(other.tszInstanceName)) return false
        if (!this.tszProductName.contentEquals(other.tszProductName)) return false
        if (this.guidFFDriver != other.guidFFDriver) return false
        if (this.wUsagePage != other.wUsagePage) return false
        if (this.wUsage != other.wUsage) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.guidInstance.hashCode()
        result = 31 * result + this.guidProduct.hashCode()
        result = 31 * result + this.dwDevType.hashCode()
        result = 31 * result + this.tszInstanceName.contentHashCode()
        result = 31 * result + this.tszProductName.contentHashCode()
        result = 31 * result + this.guidFFDriver.hashCode()
        result = 31 * result + this.wUsagePage.hashCode()
        result = 31 * result + this.wUsage.hashCode()
        return result
    }
}

public data class DideviceinstanceDx3a(
    public var dwSize: UInt = 0u,
    public var guidInstance: Guid = Guid(),
    public var guidProduct: Guid = Guid(),
    public var dwDevType: UInt = 0u,
    public var tszInstanceName: ByteArray = ByteArray(260),
    public var tszProductName: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DideviceinstanceDx3a) return false
        if (this.dwSize != other.dwSize) return false
        if (this.guidInstance != other.guidInstance) return false
        if (this.guidProduct != other.guidProduct) return false
        if (this.dwDevType != other.dwDevType) return false
        if (!this.tszInstanceName.contentEquals(other.tszInstanceName)) return false
        if (!this.tszProductName.contentEquals(other.tszProductName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.guidInstance.hashCode()
        result = 31 * result + this.guidProduct.hashCode()
        result = 31 * result + this.dwDevType.hashCode()
        result = 31 * result + this.tszInstanceName.contentHashCode()
        result = 31 * result + this.tszProductName.contentHashCode()
        return result
    }
}

public data class DideviceinstanceDx3w(
    public var dwSize: UInt = 0u,
    public var guidInstance: Guid = Guid(),
    public var guidProduct: Guid = Guid(),
    public var dwDevType: UInt = 0u,
    public var tszInstanceName: UShortArray = UShortArray(260),
    public var tszProductName: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DideviceinstanceDx3w) return false
        if (this.dwSize != other.dwSize) return false
        if (this.guidInstance != other.guidInstance) return false
        if (this.guidProduct != other.guidProduct) return false
        if (this.dwDevType != other.dwDevType) return false
        if (!this.tszInstanceName.contentEquals(other.tszInstanceName)) return false
        if (!this.tszProductName.contentEquals(other.tszProductName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.guidInstance.hashCode()
        result = 31 * result + this.guidProduct.hashCode()
        result = 31 * result + this.dwDevType.hashCode()
        result = 31 * result + this.tszInstanceName.contentHashCode()
        result = 31 * result + this.tszProductName.contentHashCode()
        return result
    }
}

public data class Dideviceobjectdata(
    public var dwOfs: UInt = 0u,
    public var dwData: UInt = 0u,
    public var dwTimeStamp: UInt = 0u,
    public var dwSequence: UInt = 0u,
    public var uAppData: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dideviceobjectdata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dideviceobjectdata> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Dideviceobjectdata =
                    Dideviceobjectdata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Dideviceobjectdata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwOfs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwTimeStamp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwSequence)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.uAppData)
                }
            }
    }
}

public data class DideviceobjectdataDx3(
    public var dwOfs: UInt = 0u,
    public var dwData: UInt = 0u,
    public var dwTimeStamp: UInt = 0u,
    public var dwSequence: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DideviceobjectdataDx3> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DideviceobjectdataDx3> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): DideviceobjectdataDx3 =
                    DideviceobjectdataDx3(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: DideviceobjectdataDx3) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwOfs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwTimeStamp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwSequence)
                }
            }
    }
}

public data class Dideviceobjectinstancea(
    public var dwSize: UInt = 0u,
    public var guidType: Guid = Guid(),
    public var dwOfs: UInt = 0u,
    public var dwType: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var tszName: ByteArray = ByteArray(260),
    public var dwFFMaxForce: UInt = 0u,
    public var dwFFForceResolution: UInt = 0u,
    public var wCollectionNumber: UShort = 0u,
    public var wDesignatorIndex: UShort = 0u,
    public var wUsagePage: UShort = 0u,
    public var wUsage: UShort = 0u,
    public var dwDimension: UInt = 0u,
    public var wExponent: UShort = 0u,
    public var wReportId: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dideviceobjectinstancea) return false
        if (this.dwSize != other.dwSize) return false
        if (this.guidType != other.guidType) return false
        if (this.dwOfs != other.dwOfs) return false
        if (this.dwType != other.dwType) return false
        if (this.dwFlags != other.dwFlags) return false
        if (!this.tszName.contentEquals(other.tszName)) return false
        if (this.dwFFMaxForce != other.dwFFMaxForce) return false
        if (this.dwFFForceResolution != other.dwFFForceResolution) return false
        if (this.wCollectionNumber != other.wCollectionNumber) return false
        if (this.wDesignatorIndex != other.wDesignatorIndex) return false
        if (this.wUsagePage != other.wUsagePage) return false
        if (this.wUsage != other.wUsage) return false
        if (this.dwDimension != other.dwDimension) return false
        if (this.wExponent != other.wExponent) return false
        if (this.wReportId != other.wReportId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.guidType.hashCode()
        result = 31 * result + this.dwOfs.hashCode()
        result = 31 * result + this.dwType.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.tszName.contentHashCode()
        result = 31 * result + this.dwFFMaxForce.hashCode()
        result = 31 * result + this.dwFFForceResolution.hashCode()
        result = 31 * result + this.wCollectionNumber.hashCode()
        result = 31 * result + this.wDesignatorIndex.hashCode()
        result = 31 * result + this.wUsagePage.hashCode()
        result = 31 * result + this.wUsage.hashCode()
        result = 31 * result + this.dwDimension.hashCode()
        result = 31 * result + this.wExponent.hashCode()
        result = 31 * result + this.wReportId.hashCode()
        return result
    }
}

public data class Dideviceobjectinstancew(
    public var dwSize: UInt = 0u,
    public var guidType: Guid = Guid(),
    public var dwOfs: UInt = 0u,
    public var dwType: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var tszName: UShortArray = UShortArray(260),
    public var dwFFMaxForce: UInt = 0u,
    public var dwFFForceResolution: UInt = 0u,
    public var wCollectionNumber: UShort = 0u,
    public var wDesignatorIndex: UShort = 0u,
    public var wUsagePage: UShort = 0u,
    public var wUsage: UShort = 0u,
    public var dwDimension: UInt = 0u,
    public var wExponent: UShort = 0u,
    public var wReportId: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dideviceobjectinstancew) return false
        if (this.dwSize != other.dwSize) return false
        if (this.guidType != other.guidType) return false
        if (this.dwOfs != other.dwOfs) return false
        if (this.dwType != other.dwType) return false
        if (this.dwFlags != other.dwFlags) return false
        if (!this.tszName.contentEquals(other.tszName)) return false
        if (this.dwFFMaxForce != other.dwFFMaxForce) return false
        if (this.dwFFForceResolution != other.dwFFForceResolution) return false
        if (this.wCollectionNumber != other.wCollectionNumber) return false
        if (this.wDesignatorIndex != other.wDesignatorIndex) return false
        if (this.wUsagePage != other.wUsagePage) return false
        if (this.wUsage != other.wUsage) return false
        if (this.dwDimension != other.dwDimension) return false
        if (this.wExponent != other.wExponent) return false
        if (this.wReportId != other.wReportId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.guidType.hashCode()
        result = 31 * result + this.dwOfs.hashCode()
        result = 31 * result + this.dwType.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.tszName.contentHashCode()
        result = 31 * result + this.dwFFMaxForce.hashCode()
        result = 31 * result + this.dwFFForceResolution.hashCode()
        result = 31 * result + this.wCollectionNumber.hashCode()
        result = 31 * result + this.wDesignatorIndex.hashCode()
        result = 31 * result + this.wUsagePage.hashCode()
        result = 31 * result + this.wUsage.hashCode()
        result = 31 * result + this.dwDimension.hashCode()
        result = 31 * result + this.wExponent.hashCode()
        result = 31 * result + this.wReportId.hashCode()
        return result
    }
}

public data class DideviceobjectinstanceDx3a(
    public var dwSize: UInt = 0u,
    public var guidType: Guid = Guid(),
    public var dwOfs: UInt = 0u,
    public var dwType: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var tszName: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DideviceobjectinstanceDx3a) return false
        if (this.dwSize != other.dwSize) return false
        if (this.guidType != other.guidType) return false
        if (this.dwOfs != other.dwOfs) return false
        if (this.dwType != other.dwType) return false
        if (this.dwFlags != other.dwFlags) return false
        if (!this.tszName.contentEquals(other.tszName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.guidType.hashCode()
        result = 31 * result + this.dwOfs.hashCode()
        result = 31 * result + this.dwType.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.tszName.contentHashCode()
        return result
    }
}

public data class DideviceobjectinstanceDx3w(
    public var dwSize: UInt = 0u,
    public var guidType: Guid = Guid(),
    public var dwOfs: UInt = 0u,
    public var dwType: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var tszName: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DideviceobjectinstanceDx3w) return false
        if (this.dwSize != other.dwSize) return false
        if (this.guidType != other.guidType) return false
        if (this.dwOfs != other.dwOfs) return false
        if (this.dwType != other.dwType) return false
        if (this.dwFlags != other.dwFlags) return false
        if (!this.tszName.contentEquals(other.tszName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.guidType.hashCode()
        result = 31 * result + this.dwOfs.hashCode()
        result = 31 * result + this.dwType.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.tszName.contentHashCode()
        return result
    }
}

public data class Didevicestate(
    public var dwSize: UInt = 0u,
    public var dwState: UInt = 0u,
    public var dwLoad: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Didevicestate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Didevicestate> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Didevicestate =
                    Didevicestate(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Didevicestate) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwLoad)
                }
            }
    }
}

public data class Didriverversions(
    public var dwSize: UInt = 0u,
    public var dwFirmwareRevision: UInt = 0u,
    public var dwHardwareRevision: UInt = 0u,
    public var dwFFDriverVersion: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Didriverversions> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Didriverversions> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Didriverversions =
                    Didriverversions(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Didriverversions) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFirmwareRevision)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwHardwareRevision)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwFFDriverVersion)
                }
            }
    }
}

public class Dieffect internal constructor(
    public var dwSize: UInt,
    public var dwFlags: UInt,
    public var dwDuration: UInt,
    public var dwSamplePeriod: UInt,
    public var dwGain: UInt,
    public var dwTriggerButton: UInt,
    public var dwTriggerRepeatInterval: UInt,
    public var cAxes: UInt,
    rgdwAxesCtorArg: MutPtr<UInt>,
    rglDirectionCtorArg: MutPtr<Int>,
    lpEnvelopeCtorArg: MutPtr<Dienvelope>,
    public var cbTypeSpecificParams: UInt,
    lpvTypeSpecificParamsCtorArg: MutPtr<CVoid>,
    public var dwStartDelay: UInt,
) {
    public var rgdwAxes: MutPtr<UInt> = rgdwAxesCtorArg
        internal set

    public var rglDirection: MutPtr<Int> = rglDirectionCtorArg
        internal set

    public var lpEnvelope: MutPtr<Dienvelope> = lpEnvelopeCtorArg
        internal set

    public var lpvTypeSpecificParams: MutPtr<CVoid> = lpvTypeSpecificParamsCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        dwFlags = 0u,
        dwDuration = 0u,
        dwSamplePeriod = 0u,
        dwGain = 0u,
        dwTriggerButton = 0u,
        dwTriggerRepeatInterval = 0u,
        cAxes = 0u,
        rgdwAxesCtorArg = MutPtr(0L),
        rglDirectionCtorArg = MutPtr(0L),
        lpEnvelopeCtorArg = MutPtr(0L),
        cbTypeSpecificParams = 0u,
        lpvTypeSpecificParamsCtorArg = MutPtr(0L),
        dwStartDelay = 0u,
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): UInt = this.dwDuration

    public operator fun component4(): UInt = this.dwSamplePeriod

    public operator fun component5(): UInt = this.dwGain

    public operator fun component6(): UInt = this.dwTriggerButton

    public operator fun component7(): UInt = this.dwTriggerRepeatInterval

    public operator fun component8(): UInt = this.cAxes

    public operator fun component9(): MutPtr<UInt> = this.rgdwAxes

    public operator fun component10(): MutPtr<Int> = this.rglDirection

    public operator fun component11(): MutPtr<Dienvelope> = this.lpEnvelope

    public operator fun component12(): UInt = this.cbTypeSpecificParams

    public operator fun component13(): MutPtr<CVoid> = this.lpvTypeSpecificParams

    public operator fun component14(): UInt = this.dwStartDelay

    public fun copy(dwSize: UInt = this.dwSize, dwFlags: UInt = this.dwFlags, dwDuration: UInt = this.dwDuration, dwSamplePeriod: UInt = this.dwSamplePeriod, dwGain: UInt = this.dwGain, dwTriggerButton: UInt = this.dwTriggerButton, dwTriggerRepeatInterval: UInt = this.dwTriggerRepeatInterval, cAxes: UInt = this.cAxes, rgdwAxes: MutPtr<UInt> = this.rgdwAxes, rglDirection: MutPtr<Int> = this.rglDirection, lpEnvelope: MutPtr<Dienvelope> = this.lpEnvelope, cbTypeSpecificParams: UInt = this.cbTypeSpecificParams, lpvTypeSpecificParams: MutPtr<CVoid> = this.lpvTypeSpecificParams, dwStartDelay: UInt = this.dwStartDelay): Dieffect = Dieffect(dwSize = dwSize, dwFlags = dwFlags, dwDuration = dwDuration, dwSamplePeriod = dwSamplePeriod, dwGain = dwGain, dwTriggerButton = dwTriggerButton, dwTriggerRepeatInterval = dwTriggerRepeatInterval, cAxes = cAxes, rgdwAxesCtorArg = rgdwAxes, rglDirectionCtorArg = rglDirection, lpEnvelopeCtorArg = lpEnvelope, cbTypeSpecificParams = cbTypeSpecificParams, lpvTypeSpecificParamsCtorArg = lpvTypeSpecificParams, dwStartDelay = dwStartDelay)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dieffect) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwDuration != other.dwDuration) return false
        if (this.dwSamplePeriod != other.dwSamplePeriod) return false
        if (this.dwGain != other.dwGain) return false
        if (this.dwTriggerButton != other.dwTriggerButton) return false
        if (this.dwTriggerRepeatInterval != other.dwTriggerRepeatInterval) return false
        if (this.cAxes != other.cAxes) return false
        if (this.rgdwAxes != other.rgdwAxes) return false
        if (this.rglDirection != other.rglDirection) return false
        if (this.lpEnvelope != other.lpEnvelope) return false
        if (this.cbTypeSpecificParams != other.cbTypeSpecificParams) return false
        if (this.lpvTypeSpecificParams != other.lpvTypeSpecificParams) return false
        if (this.dwStartDelay != other.dwStartDelay) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwDuration.hashCode()
        result = 31 * result + this.dwSamplePeriod.hashCode()
        result = 31 * result + this.dwGain.hashCode()
        result = 31 * result + this.dwTriggerButton.hashCode()
        result = 31 * result + this.dwTriggerRepeatInterval.hashCode()
        result = 31 * result + this.cAxes.hashCode()
        result = 31 * result + this.rgdwAxes.hashCode()
        result = 31 * result + this.rglDirection.hashCode()
        result = 31 * result + this.lpEnvelope.hashCode()
        result = 31 * result + this.cbTypeSpecificParams.hashCode()
        result = 31 * result + this.lpvTypeSpecificParams.hashCode()
        result = 31 * result + this.dwStartDelay.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dieffect> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dieffect> {
                override val sizeBytes: Long = 80L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Dieffect =
                    Dieffect(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UInt>(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Int>(64)
                        ).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Dienvelope>(64)
                        ).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                    )
                override fun writeNative(addr: Long, value: Dieffect) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwDuration)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwSamplePeriod)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwGain)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwTriggerButton)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwTriggerRepeatInterval)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.cAxes)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UInt>(64)
                    ).writeNative(addr + 32L, value.rgdwAxes)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Int>(64)
                    ).writeNative(addr + 40L, value.rglDirection)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Dienvelope>(64)
                    ).writeNative(addr + 48L, value.lpEnvelope)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.cbTypeSpecificParams)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 64L, value.lpvTypeSpecificParams)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.dwStartDelay)
                }
            }

        public operator fun invoke(
            dwSize: UInt = 0u,
            dwFlags: UInt = 0u,
            dwDuration: UInt = 0u,
            dwSamplePeriod: UInt = 0u,
            dwGain: UInt = 0u,
            dwTriggerButton: UInt = 0u,
            dwTriggerRepeatInterval: UInt = 0u,
            cAxes: UInt = 0u,
            rgdwAxes: MutPtr<UInt> = MutPtr(0L),
            rglDirection: MutPtr<Int> = MutPtr(0L),
            lpEnvelope: MutPtr<Dienvelope> = MutPtr(0L),
            cbTypeSpecificParams: UInt = 0u,
            lpvTypeSpecificParams: MutPtr<CVoid> = MutPtr(0L),
            dwStartDelay: UInt = 0u,
        ): Dieffect =
            Dieffect(
                dwSize = dwSize,
                dwFlags = dwFlags,
                dwDuration = dwDuration,
                dwSamplePeriod = dwSamplePeriod,
                dwGain = dwGain,
                dwTriggerButton = dwTriggerButton,
                dwTriggerRepeatInterval = dwTriggerRepeatInterval,
                cAxes = cAxes,
                rgdwAxesCtorArg = rgdwAxes,
                rglDirectionCtorArg = rglDirection,
                lpEnvelopeCtorArg = lpEnvelope,
                cbTypeSpecificParams = cbTypeSpecificParams,
                lpvTypeSpecificParamsCtorArg = lpvTypeSpecificParams,
                dwStartDelay = dwStartDelay,
            )
    }
}

public data class Dieffectattributes(
    public var dwEffectId: UInt = 0u,
    public var dwEffType: UInt = 0u,
    public var dwStaticParams: UInt = 0u,
    public var dwDynamicParams: UInt = 0u,
    public var dwCoords: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dieffectattributes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dieffectattributes> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dieffectattributes =
                    Dieffectattributes(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Dieffectattributes) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwEffectId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwEffType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwStaticParams)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwDynamicParams)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwCoords)
                }
            }
    }
}

public data class Dieffectinfoa(
    public var dwSize: UInt = 0u,
    public var guid: Guid = Guid(),
    public var dwEffType: UInt = 0u,
    public var dwStaticParams: UInt = 0u,
    public var dwDynamicParams: UInt = 0u,
    public var tszName: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dieffectinfoa) return false
        if (this.dwSize != other.dwSize) return false
        if (this.guid != other.guid) return false
        if (this.dwEffType != other.dwEffType) return false
        if (this.dwStaticParams != other.dwStaticParams) return false
        if (this.dwDynamicParams != other.dwDynamicParams) return false
        if (!this.tszName.contentEquals(other.tszName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.guid.hashCode()
        result = 31 * result + this.dwEffType.hashCode()
        result = 31 * result + this.dwStaticParams.hashCode()
        result = 31 * result + this.dwDynamicParams.hashCode()
        result = 31 * result + this.tszName.contentHashCode()
        return result
    }
}

public data class Dieffectinfow(
    public var dwSize: UInt = 0u,
    public var guid: Guid = Guid(),
    public var dwEffType: UInt = 0u,
    public var dwStaticParams: UInt = 0u,
    public var dwDynamicParams: UInt = 0u,
    public var tszName: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dieffectinfow) return false
        if (this.dwSize != other.dwSize) return false
        if (this.guid != other.guid) return false
        if (this.dwEffType != other.dwEffType) return false
        if (this.dwStaticParams != other.dwStaticParams) return false
        if (this.dwDynamicParams != other.dwDynamicParams) return false
        if (!this.tszName.contentEquals(other.tszName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.guid.hashCode()
        result = 31 * result + this.dwEffType.hashCode()
        result = 31 * result + this.dwStaticParams.hashCode()
        result = 31 * result + this.dwDynamicParams.hashCode()
        result = 31 * result + this.tszName.contentHashCode()
        return result
    }
}

public class DieffectDx5 internal constructor(
    public var dwSize: UInt,
    public var dwFlags: UInt,
    public var dwDuration: UInt,
    public var dwSamplePeriod: UInt,
    public var dwGain: UInt,
    public var dwTriggerButton: UInt,
    public var dwTriggerRepeatInterval: UInt,
    public var cAxes: UInt,
    rgdwAxesCtorArg: MutPtr<UInt>,
    rglDirectionCtorArg: MutPtr<Int>,
    lpEnvelopeCtorArg: MutPtr<Dienvelope>,
    public var cbTypeSpecificParams: UInt,
    lpvTypeSpecificParamsCtorArg: MutPtr<CVoid>,
) {
    public var rgdwAxes: MutPtr<UInt> = rgdwAxesCtorArg
        internal set

    public var rglDirection: MutPtr<Int> = rglDirectionCtorArg
        internal set

    public var lpEnvelope: MutPtr<Dienvelope> = lpEnvelopeCtorArg
        internal set

    public var lpvTypeSpecificParams: MutPtr<CVoid> = lpvTypeSpecificParamsCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        dwFlags = 0u,
        dwDuration = 0u,
        dwSamplePeriod = 0u,
        dwGain = 0u,
        dwTriggerButton = 0u,
        dwTriggerRepeatInterval = 0u,
        cAxes = 0u,
        rgdwAxesCtorArg = MutPtr(0L),
        rglDirectionCtorArg = MutPtr(0L),
        lpEnvelopeCtorArg = MutPtr(0L),
        cbTypeSpecificParams = 0u,
        lpvTypeSpecificParamsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): UInt = this.dwDuration

    public operator fun component4(): UInt = this.dwSamplePeriod

    public operator fun component5(): UInt = this.dwGain

    public operator fun component6(): UInt = this.dwTriggerButton

    public operator fun component7(): UInt = this.dwTriggerRepeatInterval

    public operator fun component8(): UInt = this.cAxes

    public operator fun component9(): MutPtr<UInt> = this.rgdwAxes

    public operator fun component10(): MutPtr<Int> = this.rglDirection

    public operator fun component11(): MutPtr<Dienvelope> = this.lpEnvelope

    public operator fun component12(): UInt = this.cbTypeSpecificParams

    public operator fun component13(): MutPtr<CVoid> = this.lpvTypeSpecificParams

    public fun copy(dwSize: UInt = this.dwSize, dwFlags: UInt = this.dwFlags, dwDuration: UInt = this.dwDuration, dwSamplePeriod: UInt = this.dwSamplePeriod, dwGain: UInt = this.dwGain, dwTriggerButton: UInt = this.dwTriggerButton, dwTriggerRepeatInterval: UInt = this.dwTriggerRepeatInterval, cAxes: UInt = this.cAxes, rgdwAxes: MutPtr<UInt> = this.rgdwAxes, rglDirection: MutPtr<Int> = this.rglDirection, lpEnvelope: MutPtr<Dienvelope> = this.lpEnvelope, cbTypeSpecificParams: UInt = this.cbTypeSpecificParams, lpvTypeSpecificParams: MutPtr<CVoid> = this.lpvTypeSpecificParams): DieffectDx5 = DieffectDx5(dwSize = dwSize, dwFlags = dwFlags, dwDuration = dwDuration, dwSamplePeriod = dwSamplePeriod, dwGain = dwGain, dwTriggerButton = dwTriggerButton, dwTriggerRepeatInterval = dwTriggerRepeatInterval, cAxes = cAxes, rgdwAxesCtorArg = rgdwAxes, rglDirectionCtorArg = rglDirection, lpEnvelopeCtorArg = lpEnvelope, cbTypeSpecificParams = cbTypeSpecificParams, lpvTypeSpecificParamsCtorArg = lpvTypeSpecificParams)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DieffectDx5) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwDuration != other.dwDuration) return false
        if (this.dwSamplePeriod != other.dwSamplePeriod) return false
        if (this.dwGain != other.dwGain) return false
        if (this.dwTriggerButton != other.dwTriggerButton) return false
        if (this.dwTriggerRepeatInterval != other.dwTriggerRepeatInterval) return false
        if (this.cAxes != other.cAxes) return false
        if (this.rgdwAxes != other.rgdwAxes) return false
        if (this.rglDirection != other.rglDirection) return false
        if (this.lpEnvelope != other.lpEnvelope) return false
        if (this.cbTypeSpecificParams != other.cbTypeSpecificParams) return false
        if (this.lpvTypeSpecificParams != other.lpvTypeSpecificParams) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwDuration.hashCode()
        result = 31 * result + this.dwSamplePeriod.hashCode()
        result = 31 * result + this.dwGain.hashCode()
        result = 31 * result + this.dwTriggerButton.hashCode()
        result = 31 * result + this.dwTriggerRepeatInterval.hashCode()
        result = 31 * result + this.cAxes.hashCode()
        result = 31 * result + this.rgdwAxes.hashCode()
        result = 31 * result + this.rglDirection.hashCode()
        result = 31 * result + this.lpEnvelope.hashCode()
        result = 31 * result + this.cbTypeSpecificParams.hashCode()
        result = 31 * result + this.lpvTypeSpecificParams.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DieffectDx5> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DieffectDx5> {
                override val sizeBytes: Long = 72L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DieffectDx5 =
                    DieffectDx5(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UInt>(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Int>(64)
                        ).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Dienvelope>(64)
                        ).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 64L),
                    )
                override fun writeNative(addr: Long, value: DieffectDx5) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwDuration)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwSamplePeriod)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwGain)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwTriggerButton)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwTriggerRepeatInterval)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.cAxes)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UInt>(64)
                    ).writeNative(addr + 32L, value.rgdwAxes)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Int>(64)
                    ).writeNative(addr + 40L, value.rglDirection)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Dienvelope>(64)
                    ).writeNative(addr + 48L, value.lpEnvelope)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.cbTypeSpecificParams)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 64L, value.lpvTypeSpecificParams)
                }
            }

        public operator fun invoke(
            dwSize: UInt = 0u,
            dwFlags: UInt = 0u,
            dwDuration: UInt = 0u,
            dwSamplePeriod: UInt = 0u,
            dwGain: UInt = 0u,
            dwTriggerButton: UInt = 0u,
            dwTriggerRepeatInterval: UInt = 0u,
            cAxes: UInt = 0u,
            rgdwAxes: MutPtr<UInt> = MutPtr(0L),
            rglDirection: MutPtr<Int> = MutPtr(0L),
            lpEnvelope: MutPtr<Dienvelope> = MutPtr(0L),
            cbTypeSpecificParams: UInt = 0u,
            lpvTypeSpecificParams: MutPtr<CVoid> = MutPtr(0L),
        ): DieffectDx5 =
            DieffectDx5(
                dwSize = dwSize,
                dwFlags = dwFlags,
                dwDuration = dwDuration,
                dwSamplePeriod = dwSamplePeriod,
                dwGain = dwGain,
                dwTriggerButton = dwTriggerButton,
                dwTriggerRepeatInterval = dwTriggerRepeatInterval,
                cAxes = cAxes,
                rgdwAxesCtorArg = rgdwAxes,
                rglDirectionCtorArg = rglDirection,
                lpEnvelopeCtorArg = lpEnvelope,
                cbTypeSpecificParams = cbTypeSpecificParams,
                lpvTypeSpecificParamsCtorArg = lpvTypeSpecificParams,
            )
    }
}

public class Dieffescape internal constructor(
    public var dwSize: UInt,
    public var dwCommand: UInt,
    lpvInBufferCtorArg: MutPtr<CVoid>,
    public var cbInBuffer: UInt,
    lpvOutBufferCtorArg: MutPtr<CVoid>,
    public var cbOutBuffer: UInt,
) {
    public var lpvInBuffer: MutPtr<CVoid> = lpvInBufferCtorArg
        internal set

    public var lpvOutBuffer: MutPtr<CVoid> = lpvOutBufferCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        dwCommand = 0u,
        lpvInBufferCtorArg = MutPtr(0L),
        cbInBuffer = 0u,
        lpvOutBufferCtorArg = MutPtr(0L),
        cbOutBuffer = 0u,
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): UInt = this.dwCommand

    public operator fun component3(): MutPtr<CVoid> = this.lpvInBuffer

    public operator fun component4(): UInt = this.cbInBuffer

    public operator fun component5(): MutPtr<CVoid> = this.lpvOutBuffer

    public operator fun component6(): UInt = this.cbOutBuffer

    public fun copy(dwSize: UInt = this.dwSize, dwCommand: UInt = this.dwCommand, lpvInBuffer: MutPtr<CVoid> = this.lpvInBuffer, cbInBuffer: UInt = this.cbInBuffer, lpvOutBuffer: MutPtr<CVoid> = this.lpvOutBuffer, cbOutBuffer: UInt = this.cbOutBuffer): Dieffescape = Dieffescape(dwSize = dwSize, dwCommand = dwCommand, lpvInBufferCtorArg = lpvInBuffer, cbInBuffer = cbInBuffer, lpvOutBufferCtorArg = lpvOutBuffer, cbOutBuffer = cbOutBuffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dieffescape) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwCommand != other.dwCommand) return false
        if (this.lpvInBuffer != other.lpvInBuffer) return false
        if (this.cbInBuffer != other.cbInBuffer) return false
        if (this.lpvOutBuffer != other.lpvOutBuffer) return false
        if (this.cbOutBuffer != other.cbOutBuffer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwCommand.hashCode()
        result = 31 * result + this.lpvInBuffer.hashCode()
        result = 31 * result + this.cbInBuffer.hashCode()
        result = 31 * result + this.lpvOutBuffer.hashCode()
        result = 31 * result + this.cbOutBuffer.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dieffescape> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dieffescape> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Dieffescape =
                    Dieffescape(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: Dieffescape) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwCommand)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.lpvInBuffer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cbInBuffer)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.lpvOutBuffer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.cbOutBuffer)
                }
            }

        public operator fun invoke(
            dwSize: UInt = 0u,
            dwCommand: UInt = 0u,
            lpvInBuffer: MutPtr<CVoid> = MutPtr(0L),
            cbInBuffer: UInt = 0u,
            lpvOutBuffer: MutPtr<CVoid> = MutPtr(0L),
            cbOutBuffer: UInt = 0u,
        ): Dieffescape =
            Dieffescape(
                dwSize = dwSize,
                dwCommand = dwCommand,
                lpvInBufferCtorArg = lpvInBuffer,
                cbInBuffer = cbInBuffer,
                lpvOutBufferCtorArg = lpvOutBuffer,
                cbOutBuffer = cbOutBuffer,
            )
    }
}

public data class Dienvelope(
    public var dwSize: UInt = 0u,
    public var dwAttackLevel: UInt = 0u,
    public var dwAttackTime: UInt = 0u,
    public var dwFadeLevel: UInt = 0u,
    public var dwFadeTime: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dienvelope> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dienvelope> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dienvelope =
                    Dienvelope(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Dienvelope) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwAttackLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwAttackTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwFadeLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwFadeTime)
                }
            }
    }
}

public data class Diffdeviceattributes(
    public var dwFlags: UInt = 0u,
    public var dwFFSamplePeriod: UInt = 0u,
    public var dwFFMinTimeResolution: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Diffdeviceattributes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Diffdeviceattributes> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Diffdeviceattributes =
                    Diffdeviceattributes(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Diffdeviceattributes) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFFSamplePeriod)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwFFMinTimeResolution)
                }
            }
    }
}

public data class Diffobjectattributes(
    public var dwFFMaxForce: UInt = 0u,
    public var dwFFForceResolution: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Diffobjectattributes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Diffobjectattributes> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Diffobjectattributes =
                    Diffobjectattributes(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Diffobjectattributes) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwFFMaxForce)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFFForceResolution)
                }
            }
    }
}

public class Difileeffect internal constructor(
    public var dwSize: UInt,
    public var guidEffect: Guid,
    lpDiEffectCtorArg: MutPtr<Dieffect>,
    public var szFriendlyName: ByteArray,
) {
    public var lpDiEffect: MutPtr<Dieffect> = lpDiEffectCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        guidEffect = Guid(),
        lpDiEffectCtorArg = MutPtr(0L),
        szFriendlyName = ByteArray(260),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): Guid = this.guidEffect

    public operator fun component3(): MutPtr<Dieffect> = this.lpDiEffect

    public operator fun component4(): ByteArray = this.szFriendlyName

    public fun copy(dwSize: UInt = this.dwSize, guidEffect: Guid = this.guidEffect, lpDiEffect: MutPtr<Dieffect> = this.lpDiEffect, szFriendlyName: ByteArray = this.szFriendlyName): Difileeffect = Difileeffect(dwSize = dwSize, guidEffect = guidEffect, lpDiEffectCtorArg = lpDiEffect, szFriendlyName = szFriendlyName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Difileeffect) return false
        if (this.dwSize != other.dwSize) return false
        if (this.guidEffect != other.guidEffect) return false
        if (this.lpDiEffect != other.lpDiEffect) return false
        if (!this.szFriendlyName.contentEquals(other.szFriendlyName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.guidEffect.hashCode()
        result = 31 * result + this.lpDiEffect.hashCode()
        result = 31 * result + this.szFriendlyName.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            guidEffect: Guid = Guid(),
            lpDiEffect: MutPtr<Dieffect> = MutPtr(0L),
            szFriendlyName: ByteArray = ByteArray(260),
        ): Difileeffect =
            Difileeffect(
                dwSize = dwSize,
                guidEffect = guidEffect,
                lpDiEffectCtorArg = lpDiEffect,
                szFriendlyName = szFriendlyName,
            )
    }
}

public class Dihidffinitinfo internal constructor(
    public var dwSize: UInt,
    pwszDeviceInterfaceCtorArg: Pwstr,
    public var guidInstance: Guid,
) {
    public var pwszDeviceInterface: Pwstr = pwszDeviceInterfaceCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        pwszDeviceInterfaceCtorArg = MutPtr(0L),
        guidInstance = Guid(),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): Pwstr = this.pwszDeviceInterface

    public operator fun component3(): Guid = this.guidInstance

    public fun copy(dwSize: UInt = this.dwSize, pwszDeviceInterface: Pwstr = this.pwszDeviceInterface, guidInstance: Guid = this.guidInstance): Dihidffinitinfo = Dihidffinitinfo(dwSize = dwSize, pwszDeviceInterfaceCtorArg = pwszDeviceInterface, guidInstance = guidInstance)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dihidffinitinfo) return false
        if (this.dwSize != other.dwSize) return false
        if (this.pwszDeviceInterface != other.pwszDeviceInterface) return false
        if (this.guidInstance != other.guidInstance) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.pwszDeviceInterface.hashCode()
        result = 31 * result + this.guidInstance.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            pwszDeviceInterface: Pwstr = MutPtr(0L),
            guidInstance: Guid = Guid(),
        ): Dihidffinitinfo =
            Dihidffinitinfo(
                dwSize = dwSize,
                pwszDeviceInterfaceCtorArg = pwszDeviceInterface,
                guidInstance = guidInstance,
            )
    }
}

public data class Dijoyconfig(
    public var dwSize: UInt = 0u,
    public var guidInstance: Guid = Guid(),
    public var hwc: Joyreghwconfig = Joyreghwconfig(),
    public var dwGain: UInt = 0u,
    public var wszType: UShortArray = UShortArray(256),
    public var wszCallout: UShortArray = UShortArray(256),
    public var guidGameport: Guid = Guid(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dijoyconfig) return false
        if (this.dwSize != other.dwSize) return false
        if (this.guidInstance != other.guidInstance) return false
        if (this.hwc != other.hwc) return false
        if (this.dwGain != other.dwGain) return false
        if (!this.wszType.contentEquals(other.wszType)) return false
        if (!this.wszCallout.contentEquals(other.wszCallout)) return false
        if (this.guidGameport != other.guidGameport) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.guidInstance.hashCode()
        result = 31 * result + this.hwc.hashCode()
        result = 31 * result + this.dwGain.hashCode()
        result = 31 * result + this.wszType.contentHashCode()
        result = 31 * result + this.wszCallout.contentHashCode()
        result = 31 * result + this.guidGameport.hashCode()
        return result
    }
}

public data class DijoyconfigDx5(
    public var dwSize: UInt = 0u,
    public var guidInstance: Guid = Guid(),
    public var hwc: Joyreghwconfig = Joyreghwconfig(),
    public var dwGain: UInt = 0u,
    public var wszType: UShortArray = UShortArray(256),
    public var wszCallout: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DijoyconfigDx5) return false
        if (this.dwSize != other.dwSize) return false
        if (this.guidInstance != other.guidInstance) return false
        if (this.hwc != other.hwc) return false
        if (this.dwGain != other.dwGain) return false
        if (!this.wszType.contentEquals(other.wszType)) return false
        if (!this.wszCallout.contentEquals(other.wszCallout)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.guidInstance.hashCode()
        result = 31 * result + this.hwc.hashCode()
        result = 31 * result + this.dwGain.hashCode()
        result = 31 * result + this.wszType.contentHashCode()
        result = 31 * result + this.wszCallout.contentHashCode()
        return result
    }
}

public data class Dijoystate(
    public var lX: Int = 0,
    public var lY: Int = 0,
    public var lZ: Int = 0,
    public var lRx: Int = 0,
    public var lRy: Int = 0,
    public var lRz: Int = 0,
    public var rglSlider: IntArray = IntArray(2),
    public var rgdwPOV: UIntArray = UIntArray(4),
    public var rgbButtons: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dijoystate) return false
        if (this.lX != other.lX) return false
        if (this.lY != other.lY) return false
        if (this.lZ != other.lZ) return false
        if (this.lRx != other.lRx) return false
        if (this.lRy != other.lRy) return false
        if (this.lRz != other.lRz) return false
        if (!this.rglSlider.contentEquals(other.rglSlider)) return false
        if (!this.rgdwPOV.contentEquals(other.rgdwPOV)) return false
        if (!this.rgbButtons.contentEquals(other.rgbButtons)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lX.hashCode()
        result = 31 * result + this.lY.hashCode()
        result = 31 * result + this.lZ.hashCode()
        result = 31 * result + this.lRx.hashCode()
        result = 31 * result + this.lRy.hashCode()
        result = 31 * result + this.lRz.hashCode()
        result = 31 * result + this.rglSlider.contentHashCode()
        result = 31 * result + this.rgdwPOV.contentHashCode()
        result = 31 * result + this.rgbButtons.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dijoystate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dijoystate> {
                override val sizeBytes: Long = 80L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dijoystate =
                    Dijoystate(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (2).toInt())
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                        ).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: Dijoystate) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.lX)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.lY)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.lZ)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.lRx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.lRy)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.lRz)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (2).toInt())
                    ).writeNative(addr + 24L, value.rglSlider)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                    ).writeNative(addr + 32L, value.rgdwPOV)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                    ).writeNative(addr + 48L, value.rgbButtons)
                }
            }
    }
}

public class Dijoystate2(
    public var lX: Int = 0,
    public var lY: Int = 0,
    public var lZ: Int = 0,
    public var lRx: Int = 0,
    public var lRy: Int = 0,
    public var lRz: Int = 0,
    public var rglSlider: IntArray = IntArray(2),
    public var rgdwPOV: UIntArray = UIntArray(4),
    public var rgbButtons: UByteArray = UByteArray(128),
    public var lVX: Int = 0,
    public var lVY: Int = 0,
    public var lVZ: Int = 0,
    public var lVRx: Int = 0,
    public var lVRy: Int = 0,
    public var lVRz: Int = 0,
    public var rglVSlider: IntArray = IntArray(2),
    public var lAX: Int = 0,
    public var lAY: Int = 0,
    public var lAZ: Int = 0,
    public var lARx: Int = 0,
    public var lARy: Int = 0,
    public var lARz: Int = 0,
    public var rglASlider: IntArray = IntArray(2),
    public var lFX: Int = 0,
    public var lFY: Int = 0,
    public var lFZ: Int = 0,
    public var lFRx: Int = 0,
    public var lFRy: Int = 0,
    public var lFRz: Int = 0,
    public var rglFSlider: IntArray = IntArray(2),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dijoystate2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dijoystate2> {
                override val sizeBytes: Long = 272L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dijoystate2 =
                    Dijoystate2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (2).toInt())
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (128).toInt())
                        ).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 176L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 180L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 184L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 188L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 192L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 196L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (2).toInt())
                        ).readNative(addr + 200L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 208L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 212L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 216L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 220L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 224L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 228L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (2).toInt())
                        ).readNative(addr + 232L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 240L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 244L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 248L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 252L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 256L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 260L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (2).toInt())
                        ).readNative(addr + 264L),
                    )
                override fun writeNative(addr: Long, value: Dijoystate2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.lX)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.lY)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.lZ)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.lRx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.lRy)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.lRz)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (2).toInt())
                    ).writeNative(addr + 24L, value.rglSlider)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                    ).writeNative(addr + 32L, value.rgdwPOV)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (128).toInt())
                    ).writeNative(addr + 48L, value.rgbButtons)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 176L, value.lVX)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 180L, value.lVY)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 184L, value.lVZ)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 188L, value.lVRx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 192L, value.lVRy)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 196L, value.lVRz)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (2).toInt())
                    ).writeNative(addr + 200L, value.rglVSlider)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 208L, value.lAX)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 212L, value.lAY)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 216L, value.lAZ)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 220L, value.lARx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 224L, value.lARy)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 228L, value.lARz)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (2).toInt())
                    ).writeNative(addr + 232L, value.rglASlider)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 240L, value.lFX)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 244L, value.lFY)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 248L, value.lFZ)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 252L, value.lFRx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 256L, value.lFRy)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 260L, value.lFRz)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (2).toInt())
                    ).writeNative(addr + 264L, value.rglFSlider)
                }
            }
    }
}

public data class Dijoytypeinfo(
    public var dwSize: UInt = 0u,
    public var hws: Joyreghwsettings = Joyreghwsettings(),
    public var clsidConfig: Guid = Guid(),
    public var wszDisplayName: UShortArray = UShortArray(256),
    public var wszCallout: UShortArray = UShortArray(260),
    public var wszHardwareId: UShortArray = UShortArray(256),
    public var dwFlags1: UInt = 0u,
    public var dwFlags2: UInt = 0u,
    public var wszMapFile: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dijoytypeinfo) return false
        if (this.dwSize != other.dwSize) return false
        if (this.hws != other.hws) return false
        if (this.clsidConfig != other.clsidConfig) return false
        if (!this.wszDisplayName.contentEquals(other.wszDisplayName)) return false
        if (!this.wszCallout.contentEquals(other.wszCallout)) return false
        if (!this.wszHardwareId.contentEquals(other.wszHardwareId)) return false
        if (this.dwFlags1 != other.dwFlags1) return false
        if (this.dwFlags2 != other.dwFlags2) return false
        if (!this.wszMapFile.contentEquals(other.wszMapFile)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.hws.hashCode()
        result = 31 * result + this.clsidConfig.hashCode()
        result = 31 * result + this.wszDisplayName.contentHashCode()
        result = 31 * result + this.wszCallout.contentHashCode()
        result = 31 * result + this.wszHardwareId.contentHashCode()
        result = 31 * result + this.dwFlags1.hashCode()
        result = 31 * result + this.dwFlags2.hashCode()
        result = 31 * result + this.wszMapFile.contentHashCode()
        return result
    }
}

public data class DijoytypeinfoDx5(
    public var dwSize: UInt = 0u,
    public var hws: Joyreghwsettings = Joyreghwsettings(),
    public var clsidConfig: Guid = Guid(),
    public var wszDisplayName: UShortArray = UShortArray(256),
    public var wszCallout: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DijoytypeinfoDx5) return false
        if (this.dwSize != other.dwSize) return false
        if (this.hws != other.hws) return false
        if (this.clsidConfig != other.clsidConfig) return false
        if (!this.wszDisplayName.contentEquals(other.wszDisplayName)) return false
        if (!this.wszCallout.contentEquals(other.wszCallout)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.hws.hashCode()
        result = 31 * result + this.clsidConfig.hashCode()
        result = 31 * result + this.wszDisplayName.contentHashCode()
        result = 31 * result + this.wszCallout.contentHashCode()
        return result
    }
}

public data class DijoytypeinfoDx6(
    public var dwSize: UInt = 0u,
    public var hws: Joyreghwsettings = Joyreghwsettings(),
    public var clsidConfig: Guid = Guid(),
    public var wszDisplayName: UShortArray = UShortArray(256),
    public var wszCallout: UShortArray = UShortArray(260),
    public var wszHardwareId: UShortArray = UShortArray(256),
    public var dwFlags1: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DijoytypeinfoDx6) return false
        if (this.dwSize != other.dwSize) return false
        if (this.hws != other.hws) return false
        if (this.clsidConfig != other.clsidConfig) return false
        if (!this.wszDisplayName.contentEquals(other.wszDisplayName)) return false
        if (!this.wszCallout.contentEquals(other.wszCallout)) return false
        if (!this.wszHardwareId.contentEquals(other.wszHardwareId)) return false
        if (this.dwFlags1 != other.dwFlags1) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.hws.hashCode()
        result = 31 * result + this.clsidConfig.hashCode()
        result = 31 * result + this.wszDisplayName.contentHashCode()
        result = 31 * result + this.wszCallout.contentHashCode()
        result = 31 * result + this.wszHardwareId.contentHashCode()
        result = 31 * result + this.dwFlags1.hashCode()
        return result
    }
}

public data class Dijoyuservalues(
    public var dwSize: UInt = 0u,
    public var ruv: Joyreguservalues = Joyreguservalues(),
    public var wszGlobalDriver: UShortArray = UShortArray(256),
    public var wszGameportEmulator: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dijoyuservalues) return false
        if (this.dwSize != other.dwSize) return false
        if (this.ruv != other.ruv) return false
        if (!this.wszGlobalDriver.contentEquals(other.wszGlobalDriver)) return false
        if (!this.wszGameportEmulator.contentEquals(other.wszGameportEmulator)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.ruv.hashCode()
        result = 31 * result + this.wszGlobalDriver.contentHashCode()
        result = 31 * result + this.wszGameportEmulator.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dijoyuservalues> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dijoyuservalues> {
                override val sizeBytes: Long = 1128L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dijoyuservalues =
                    Dijoyuservalues(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (Joyreguservalues.typeLayout()).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr + 104L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr + 616L),
                    )
                override fun writeNative(addr: Long, value: Dijoyuservalues) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (Joyreguservalues.typeLayout()).writeNative(addr + 4L, value.ruv)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr + 104L, value.wszGlobalDriver)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr + 616L, value.wszGameportEmulator)
                }
            }
    }
}

public data class Dimousestate(
    public var lX: Int = 0,
    public var lY: Int = 0,
    public var lZ: Int = 0,
    public var rgbButtons: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dimousestate) return false
        if (this.lX != other.lX) return false
        if (this.lY != other.lY) return false
        if (this.lZ != other.lZ) return false
        if (!this.rgbButtons.contentEquals(other.rgbButtons)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lX.hashCode()
        result = 31 * result + this.lY.hashCode()
        result = 31 * result + this.lZ.hashCode()
        result = 31 * result + this.rgbButtons.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dimousestate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dimousestate> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dimousestate =
                    Dimousestate(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Dimousestate) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.lX)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.lY)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.lZ)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 12L, value.rgbButtons)
                }
            }
    }
}

public data class Dimousestate2(
    public var lX: Int = 0,
    public var lY: Int = 0,
    public var lZ: Int = 0,
    public var rgbButtons: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dimousestate2) return false
        if (this.lX != other.lX) return false
        if (this.lY != other.lY) return false
        if (this.lZ != other.lZ) return false
        if (!this.rgbButtons.contentEquals(other.rgbButtons)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lX.hashCode()
        result = 31 * result + this.lY.hashCode()
        result = 31 * result + this.lZ.hashCode()
        result = 31 * result + this.rgbButtons.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dimousestate2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dimousestate2> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dimousestate2 =
                    Dimousestate2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Dimousestate2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.lX)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.lY)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.lZ)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 12L, value.rgbButtons)
                }
            }
    }
}

public data class Diobjectattributes(
    public var dwFlags: UInt = 0u,
    public var wUsagePage: UShort = 0u,
    public var wUsage: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Diobjectattributes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Diobjectattributes> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Diobjectattributes =
                    Diobjectattributes(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: Diobjectattributes) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.wUsagePage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.wUsage)
                }
            }
    }
}

public data class Diobjectcalibration(
    public var lMin: Int = 0,
    public var lCenter: Int = 0,
    public var lMax: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Diobjectcalibration> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Diobjectcalibration> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Diobjectcalibration =
                    Diobjectcalibration(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Diobjectcalibration) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.lMin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.lCenter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.lMax)
                }
            }
    }
}

public class Diobjectdataformat internal constructor(
    pguidCtorArg: ConstPtr<Guid>,
    public var dwOfs: UInt,
    public var dwType: UInt,
    public var dwFlags: UInt,
) {
    public var pguid: ConstPtr<Guid> = pguidCtorArg
        internal set

    public constructor() : this(
        pguidCtorArg = ConstPtr(0L),
        dwOfs = 0u,
        dwType = 0u,
        dwFlags = 0u,
    )

    public operator fun component1(): ConstPtr<Guid> = this.pguid

    public operator fun component2(): UInt = this.dwOfs

    public operator fun component3(): UInt = this.dwType

    public operator fun component4(): UInt = this.dwFlags

    public fun copy(pguid: ConstPtr<Guid> = this.pguid, dwOfs: UInt = this.dwOfs, dwType: UInt = this.dwType, dwFlags: UInt = this.dwFlags): Diobjectdataformat = Diobjectdataformat(pguidCtorArg = pguid, dwOfs = dwOfs, dwType = dwType, dwFlags = dwFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Diobjectdataformat) return false
        if (this.pguid != other.pguid) return false
        if (this.dwOfs != other.dwOfs) return false
        if (this.dwType != other.dwType) return false
        if (this.dwFlags != other.dwFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pguid.hashCode()
        result = 31 * result + this.dwOfs.hashCode()
        result = 31 * result + this.dwType.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Diobjectdataformat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Diobjectdataformat> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Diobjectdataformat =
                    Diobjectdataformat(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<Guid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Diobjectdataformat) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<Guid>(64)
                    ).writeNative(addr, value.pguid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwOfs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwFlags)
                }
            }

        public operator fun invoke(
            pguid: ConstPtr<Guid> = ConstPtr(0L),
            dwOfs: UInt = 0u,
            dwType: UInt = 0u,
            dwFlags: UInt = 0u,
        ): Diobjectdataformat =
            Diobjectdataformat(
                pguidCtorArg = pguid,
                dwOfs = dwOfs,
                dwType = dwType,
                dwFlags = dwFlags,
            )
    }
}

public data class Diperiodic(
    public var dwMagnitude: UInt = 0u,
    public var lOffset: Int = 0,
    public var dwPhase: UInt = 0u,
    public var dwPeriod: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Diperiodic> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Diperiodic> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Diperiodic =
                    Diperiodic(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Diperiodic) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwMagnitude)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.lOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwPhase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwPeriod)
                }
            }
    }
}

public data class Dipovcalibration(
    public var lMin: IntArray = IntArray(5),
    public var lMax: IntArray = IntArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dipovcalibration) return false
        if (!this.lMin.contentEquals(other.lMin)) return false
        if (!this.lMax.contentEquals(other.lMax)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lMin.contentHashCode()
        result = 31 * result + this.lMax.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dipovcalibration> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dipovcalibration> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dipovcalibration =
                    Dipovcalibration(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (5).toInt())
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (5).toInt())
                        ).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: Dipovcalibration) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (5).toInt())
                    ).writeNative(addr, value.lMin)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (5).toInt())
                    ).writeNative(addr + 20L, value.lMax)
                }
            }
    }
}

public data class Dipropcal(
    public var diph: Dipropheader = Dipropheader(),
    public var lMin: Int = 0,
    public var lCenter: Int = 0,
    public var lMax: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dipropcal> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dipropcal> {
                override val sizeBytes: Long = 28L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dipropcal =
                    Dipropcal(
                        (Dipropheader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Dipropcal) {
                    (Dipropheader.typeLayout()).writeNative(addr, value.diph)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.lMin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.lCenter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.lMax)
                }
            }
    }
}

public data class Dipropcalpov(
    public var diph: Dipropheader = Dipropheader(),
    public var lMin: IntArray = IntArray(5),
    public var lMax: IntArray = IntArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dipropcalpov) return false
        if (this.diph != other.diph) return false
        if (!this.lMin.contentEquals(other.lMin)) return false
        if (!this.lMax.contentEquals(other.lMax)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.diph.hashCode()
        result = 31 * result + this.lMin.contentHashCode()
        result = 31 * result + this.lMax.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dipropcalpov> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dipropcalpov> {
                override val sizeBytes: Long = 56L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dipropcalpov =
                    Dipropcalpov(
                        (Dipropheader.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (5).toInt())
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (5).toInt())
                        ).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: Dipropcalpov) {
                    (Dipropheader.typeLayout()).writeNative(addr, value.diph)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (5).toInt())
                    ).writeNative(addr + 16L, value.lMin)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (5).toInt())
                    ).writeNative(addr + 36L, value.lMax)
                }
            }
    }
}

public data class Dipropcpoints(
    public var diph: Dipropheader = Dipropheader(),
    public var dwCPointsNum: UInt = 0u,
    public var cp: List<Cpoint> = List(8) { Cpoint() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dipropcpoints> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dipropcpoints> {
                override val sizeBytes: Long = 84L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dipropcpoints =
                    Dipropcpoints(
                        (Dipropheader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(Cpoint.typeLayout(), (8).toInt())
                        ).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: Dipropcpoints) {
                    (Dipropheader.typeLayout()).writeNative(addr, value.diph)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwCPointsNum)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(Cpoint.typeLayout(), (8).toInt())
                    ).writeNative(addr + 20L, value.cp)
                }
            }
    }
}

public data class Dipropdword(
    public var diph: Dipropheader = Dipropheader(),
    public var dwData: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dipropdword> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dipropdword> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dipropdword =
                    Dipropdword(
                        (Dipropheader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Dipropdword) {
                    (Dipropheader.typeLayout()).writeNative(addr, value.diph)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwData)
                }
            }
    }
}

public data class Dipropguidandpath(
    public var diph: Dipropheader = Dipropheader(),
    public var guidClass: Guid = Guid(),
    public var wszPath: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dipropguidandpath) return false
        if (this.diph != other.diph) return false
        if (this.guidClass != other.guidClass) return false
        if (!this.wszPath.contentEquals(other.wszPath)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.diph.hashCode()
        result = 31 * result + this.guidClass.hashCode()
        result = 31 * result + this.wszPath.contentHashCode()
        return result
    }
}

public data class Dipropheader(
    public var dwSize: UInt = 0u,
    public var dwHeaderSize: UInt = 0u,
    public var dwObj: UInt = 0u,
    public var dwHow: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dipropheader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dipropheader> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dipropheader =
                    Dipropheader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Dipropheader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwHeaderSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwObj)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwHow)
                }
            }
    }
}

public data class Diproppointer(
    public var diph: Dipropheader = Dipropheader(),
    public var uData: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Diproppointer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Diproppointer> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Diproppointer =
                    Diproppointer(
                        (Dipropheader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Diproppointer) {
                    (Dipropheader.typeLayout()).writeNative(addr, value.diph)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.uData)
                }
            }
    }
}

public data class Diproprange(
    public var diph: Dipropheader = Dipropheader(),
    public var lMin: Int = 0,
    public var lMax: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Diproprange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Diproprange> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Diproprange =
                    Diproprange(
                        (Dipropheader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: Diproprange) {
                    (Dipropheader.typeLayout()).writeNative(addr, value.diph)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.lMin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.lMax)
                }
            }
    }
}

public data class Dipropstring(
    public var diph: Dipropheader = Dipropheader(),
    public var wsz: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dipropstring) return false
        if (this.diph != other.diph) return false
        if (!this.wsz.contentEquals(other.wsz)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.diph.hashCode()
        result = 31 * result + this.wsz.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dipropstring> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dipropstring> {
                override val sizeBytes: Long = 536L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dipropstring =
                    Dipropstring(
                        (Dipropheader.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Dipropstring) {
                    (Dipropheader.typeLayout()).writeNative(addr, value.diph)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 16L, value.wsz)
                }
            }
    }
}

public data class Dirampforce(
    public var lStart: Int = 0,
    public var lEnd: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dirampforce> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dirampforce> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dirampforce =
                    Dirampforce(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Dirampforce) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.lStart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.lEnd)
                }
            }
    }
}

public data class HiddAttributes(
    public var size: UInt = 0u,
    public var vendorID: UShort = 0u,
    public var productID: UShort = 0u,
    public var versionNumber: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HiddAttributes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HiddAttributes> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): HiddAttributes =
                    HiddAttributes(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: HiddAttributes) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.vendorID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.productID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.versionNumber)
                }
            }
    }
}

public class HiddConfiguration internal constructor(
    cookieCtorArg: MutPtr<CVoid>,
    public var size: UInt,
    public var ringBufferSize: UInt,
) {
    public var cookie: MutPtr<CVoid> = cookieCtorArg
        internal set

    public constructor() : this(
        cookieCtorArg = MutPtr(0L),
        size = 0u,
        ringBufferSize = 0u,
    )

    public operator fun component1(): MutPtr<CVoid> = this.cookie

    public operator fun component2(): UInt = this.size

    public operator fun component3(): UInt = this.ringBufferSize

    public fun copy(cookie: MutPtr<CVoid> = this.cookie, size: UInt = this.size, ringBufferSize: UInt = this.ringBufferSize): HiddConfiguration = HiddConfiguration(cookieCtorArg = cookie, size = size, ringBufferSize = ringBufferSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HiddConfiguration) return false
        if (this.cookie != other.cookie) return false
        if (this.size != other.size) return false
        if (this.ringBufferSize != other.ringBufferSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cookie.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.ringBufferSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HiddConfiguration> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HiddConfiguration> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): HiddConfiguration =
                    HiddConfiguration(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: HiddConfiguration) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.cookie)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.ringBufferSize)
                }
            }

        public operator fun invoke(
            cookie: MutPtr<CVoid> = MutPtr(0L),
            size: UInt = 0u,
            ringBufferSize: UInt = 0u,
        ): HiddConfiguration =
            HiddConfiguration(
                cookieCtorArg = cookie,
                size = size,
                ringBufferSize = ringBufferSize,
            )
    }
}

public data class HidpButtonArrayData(
    public var arrayIndex: UShort = 0u,
    public var on: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HidpButtonArrayData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HidpButtonArrayData> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): HidpButtonArrayData =
                    HidpButtonArrayData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: HidpButtonArrayData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.arrayIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 2L, value.on)
                }
            }
    }
}

public data class HidpButtonCaps(
    public var usagePage: UShort = 0u,
    public var reportID: UByte = 0u,
    public var isAlias: Boolean = false,
    public var bitField: UShort = 0u,
    public var linkCollection: UShort = 0u,
    public var linkUsage: UShort = 0u,
    public var linkUsagePage: UShort = 0u,
    public var isRange: Boolean = false,
    public var isStringRange: Boolean = false,
    public var isDesignatorRange: Boolean = false,
    public var isAbsolute: Boolean = false,
    public var reportCount: UShort = 0u,
    public var reserved2: UShort = 0u,
    public var reserved: UIntArray = UIntArray(9),
    public var anonymous: HidpButtonCaps0 = HidpButtonCaps0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HidpButtonCaps) return false
        if (this.usagePage != other.usagePage) return false
        if (this.reportID != other.reportID) return false
        if (this.isAlias != other.isAlias) return false
        if (this.bitField != other.bitField) return false
        if (this.linkCollection != other.linkCollection) return false
        if (this.linkUsage != other.linkUsage) return false
        if (this.linkUsagePage != other.linkUsagePage) return false
        if (this.isRange != other.isRange) return false
        if (this.isStringRange != other.isStringRange) return false
        if (this.isDesignatorRange != other.isDesignatorRange) return false
        if (this.isAbsolute != other.isAbsolute) return false
        if (this.reportCount != other.reportCount) return false
        if (this.reserved2 != other.reserved2) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.usagePage.hashCode()
        result = 31 * result + this.reportID.hashCode()
        result = 31 * result + this.isAlias.hashCode()
        result = 31 * result + this.bitField.hashCode()
        result = 31 * result + this.linkCollection.hashCode()
        result = 31 * result + this.linkUsage.hashCode()
        result = 31 * result + this.linkUsagePage.hashCode()
        result = 31 * result + this.isRange.hashCode()
        result = 31 * result + this.isStringRange.hashCode()
        result = 31 * result + this.isDesignatorRange.hashCode()
        result = 31 * result + this.isAbsolute.hashCode()
        result = 31 * result + this.reportCount.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }
}

public data class HidpButtonCaps0(
    public var range: HidpButtonCaps00 = HidpButtonCaps00(),
    public var notRange: HidpButtonCaps01 = HidpButtonCaps01(),
)

public data class HidpButtonCaps01(
    public var usage: UShort = 0u,
    public var reserved1: UShort = 0u,
    public var stringIndex: UShort = 0u,
    public var reserved2: UShort = 0u,
    public var designatorIndex: UShort = 0u,
    public var reserved3: UShort = 0u,
    public var dataIndex: UShort = 0u,
    public var reserved4: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HidpButtonCaps01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HidpButtonCaps01> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): HidpButtonCaps01 =
                    HidpButtonCaps01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                    )
                override fun writeNative(addr: Long, value: HidpButtonCaps01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.usage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.stringIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.reserved2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.designatorIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.reserved3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.dataIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.reserved4)
                }
            }
    }
}

public data class HidpButtonCaps00(
    public var usageMin: UShort = 0u,
    public var usageMax: UShort = 0u,
    public var stringMin: UShort = 0u,
    public var stringMax: UShort = 0u,
    public var designatorMin: UShort = 0u,
    public var designatorMax: UShort = 0u,
    public var dataIndexMin: UShort = 0u,
    public var dataIndexMax: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HidpButtonCaps00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HidpButtonCaps00> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): HidpButtonCaps00 =
                    HidpButtonCaps00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                    )
                override fun writeNative(addr: Long, value: HidpButtonCaps00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.usageMin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.usageMax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.stringMin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.stringMax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.designatorMin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.designatorMax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.dataIndexMin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.dataIndexMax)
                }
            }
    }
}

public data class HidpCaps(
    public var usage: UShort = 0u,
    public var usagePage: UShort = 0u,
    public var inputReportByteLength: UShort = 0u,
    public var outputReportByteLength: UShort = 0u,
    public var featureReportByteLength: UShort = 0u,
    public var reserved: UShortArray = UShortArray(17),
    public var numberLinkCollectionNodes: UShort = 0u,
    public var numberInputButtonCaps: UShort = 0u,
    public var numberInputValueCaps: UShort = 0u,
    public var numberInputDataIndices: UShort = 0u,
    public var numberOutputButtonCaps: UShort = 0u,
    public var numberOutputValueCaps: UShort = 0u,
    public var numberOutputDataIndices: UShort = 0u,
    public var numberFeatureButtonCaps: UShort = 0u,
    public var numberFeatureValueCaps: UShort = 0u,
    public var numberFeatureDataIndices: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HidpCaps) return false
        if (this.usage != other.usage) return false
        if (this.usagePage != other.usagePage) return false
        if (this.inputReportByteLength != other.inputReportByteLength) return false
        if (this.outputReportByteLength != other.outputReportByteLength) return false
        if (this.featureReportByteLength != other.featureReportByteLength) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.numberLinkCollectionNodes != other.numberLinkCollectionNodes) return false
        if (this.numberInputButtonCaps != other.numberInputButtonCaps) return false
        if (this.numberInputValueCaps != other.numberInputValueCaps) return false
        if (this.numberInputDataIndices != other.numberInputDataIndices) return false
        if (this.numberOutputButtonCaps != other.numberOutputButtonCaps) return false
        if (this.numberOutputValueCaps != other.numberOutputValueCaps) return false
        if (this.numberOutputDataIndices != other.numberOutputDataIndices) return false
        if (this.numberFeatureButtonCaps != other.numberFeatureButtonCaps) return false
        if (this.numberFeatureValueCaps != other.numberFeatureValueCaps) return false
        if (this.numberFeatureDataIndices != other.numberFeatureDataIndices) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.usage.hashCode()
        result = 31 * result + this.usagePage.hashCode()
        result = 31 * result + this.inputReportByteLength.hashCode()
        result = 31 * result + this.outputReportByteLength.hashCode()
        result = 31 * result + this.featureReportByteLength.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.numberLinkCollectionNodes.hashCode()
        result = 31 * result + this.numberInputButtonCaps.hashCode()
        result = 31 * result + this.numberInputValueCaps.hashCode()
        result = 31 * result + this.numberInputDataIndices.hashCode()
        result = 31 * result + this.numberOutputButtonCaps.hashCode()
        result = 31 * result + this.numberOutputValueCaps.hashCode()
        result = 31 * result + this.numberOutputDataIndices.hashCode()
        result = 31 * result + this.numberFeatureButtonCaps.hashCode()
        result = 31 * result + this.numberFeatureValueCaps.hashCode()
        result = 31 * result + this.numberFeatureDataIndices.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HidpCaps> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HidpCaps> {
                override val sizeBytes: Long = 64L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): HidpCaps =
                    HidpCaps(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (17).toInt())
                        ).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 46L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 50L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 54L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 58L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 62L),
                    )
                override fun writeNative(addr: Long, value: HidpCaps) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.usage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.usagePage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.inputReportByteLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.outputReportByteLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.featureReportByteLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (17).toInt())
                    ).writeNative(addr + 10L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 44L, value.numberLinkCollectionNodes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 46L, value.numberInputButtonCaps)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 48L, value.numberInputValueCaps)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 50L, value.numberInputDataIndices)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 52L, value.numberOutputButtonCaps)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 54L, value.numberOutputValueCaps)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 56L, value.numberOutputDataIndices)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 58L, value.numberFeatureButtonCaps)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 60L, value.numberFeatureValueCaps)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 62L, value.numberFeatureDataIndices)
                }
            }
    }
}

public data class HidpData(
    public var dataIndex: UShort = 0u,
    public var reserved: UShort = 0u,
    public var anonymous: HidpData0 = HidpData0(),
)

public data class HidpData0(
    public var rawValue: UInt = 0u,
    public var on: Boolean = false,
)

public class HidpExtendedAttributes internal constructor(
    public var numGlobalUnknowns: UByte,
    public var reserved: UByteArray,
    globalUnknownsCtorArg: MutPtr<HidpUnknownToken>,
    public var data: UIntArray,
) {
    public var globalUnknowns: MutPtr<HidpUnknownToken> = globalUnknownsCtorArg
        internal set

    public constructor() : this(
        numGlobalUnknowns = 0u,
        reserved = UByteArray(3),
        globalUnknownsCtorArg = MutPtr(0L),
        data = UIntArray(1),
    )

    public operator fun component1(): UByte = this.numGlobalUnknowns

    public operator fun component2(): UByteArray = this.reserved

    public operator fun component3(): MutPtr<HidpUnknownToken> = this.globalUnknowns

    public operator fun component4(): UIntArray = this.data

    public fun copy(numGlobalUnknowns: UByte = this.numGlobalUnknowns, reserved: UByteArray = this.reserved, globalUnknowns: MutPtr<HidpUnknownToken> = this.globalUnknowns, data: UIntArray = this.data): HidpExtendedAttributes = HidpExtendedAttributes(numGlobalUnknowns = numGlobalUnknowns, reserved = reserved, globalUnknownsCtorArg = globalUnknowns, data = data)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HidpExtendedAttributes) return false
        if (this.numGlobalUnknowns != other.numGlobalUnknowns) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.globalUnknowns != other.globalUnknowns) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numGlobalUnknowns.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.globalUnknowns.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HidpExtendedAttributes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HidpExtendedAttributes> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): HidpExtendedAttributes =
                    HidpExtendedAttributes(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 1L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<HidpUnknownToken>(64)
                        ).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                        ).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: HidpExtendedAttributes) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.numGlobalUnknowns)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 1L, value.reserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<HidpUnknownToken>(64)
                    ).writeNative(addr + 4L, value.globalUnknowns)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                    ).writeNative(addr + 12L, value.data)
                }
            }

        public operator fun invoke(
            numGlobalUnknowns: UByte = 0u,
            reserved: UByteArray = UByteArray(3),
            globalUnknowns: MutPtr<HidpUnknownToken> = MutPtr(0L),
            data: UIntArray = UIntArray(1),
        ): HidpExtendedAttributes =
            HidpExtendedAttributes(
                numGlobalUnknowns = numGlobalUnknowns,
                reserved = reserved,
                globalUnknownsCtorArg = globalUnknowns,
                data = data,
            )
    }
}

public data class HidpKeyboardModifierState(
    public var anonymous: HidpKeyboardModifierState0 = HidpKeyboardModifierState0(),
)

public data class HidpKeyboardModifierState0(
    public var anonymous: HidpKeyboardModifierState00 = HidpKeyboardModifierState00(),
    public var ul: UInt = 0u,
)

public data class HidpKeyboardModifierState00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HidpKeyboardModifierState00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HidpKeyboardModifierState00> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): HidpKeyboardModifierState00 =
                    HidpKeyboardModifierState00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: HidpKeyboardModifierState00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class HidpLinkCollectionNode internal constructor(
    public var linkUsage: UShort,
    public var linkUsagePage: UShort,
    public var parent: UShort,
    public var numberOfChildren: UShort,
    public var nextSibling: UShort,
    public var firstChild: UShort,
    public var bitfield: UInt,
    userContextCtorArg: MutPtr<CVoid>,
) {
    public var userContext: MutPtr<CVoid> = userContextCtorArg
        internal set

    public constructor() : this(
        linkUsage = 0u,
        linkUsagePage = 0u,
        parent = 0u,
        numberOfChildren = 0u,
        nextSibling = 0u,
        firstChild = 0u,
        bitfield = 0u,
        userContextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.linkUsage

    public operator fun component2(): UShort = this.linkUsagePage

    public operator fun component3(): UShort = this.parent

    public operator fun component4(): UShort = this.numberOfChildren

    public operator fun component5(): UShort = this.nextSibling

    public operator fun component6(): UShort = this.firstChild

    public operator fun component7(): UInt = this.bitfield

    public operator fun component8(): MutPtr<CVoid> = this.userContext

    public fun copy(linkUsage: UShort = this.linkUsage, linkUsagePage: UShort = this.linkUsagePage, parent: UShort = this.parent, numberOfChildren: UShort = this.numberOfChildren, nextSibling: UShort = this.nextSibling, firstChild: UShort = this.firstChild, bitfield: UInt = this.bitfield, userContext: MutPtr<CVoid> = this.userContext): HidpLinkCollectionNode = HidpLinkCollectionNode(linkUsage = linkUsage, linkUsagePage = linkUsagePage, parent = parent, numberOfChildren = numberOfChildren, nextSibling = nextSibling, firstChild = firstChild, bitfield = bitfield, userContextCtorArg = userContext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HidpLinkCollectionNode) return false
        if (this.linkUsage != other.linkUsage) return false
        if (this.linkUsagePage != other.linkUsagePage) return false
        if (this.parent != other.parent) return false
        if (this.numberOfChildren != other.numberOfChildren) return false
        if (this.nextSibling != other.nextSibling) return false
        if (this.firstChild != other.firstChild) return false
        if (this.bitfield != other.bitfield) return false
        if (this.userContext != other.userContext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.linkUsage.hashCode()
        result = 31 * result + this.linkUsagePage.hashCode()
        result = 31 * result + this.parent.hashCode()
        result = 31 * result + this.numberOfChildren.hashCode()
        result = 31 * result + this.nextSibling.hashCode()
        result = 31 * result + this.firstChild.hashCode()
        result = 31 * result + this.bitfield.hashCode()
        result = 31 * result + this.userContext.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HidpLinkCollectionNode> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HidpLinkCollectionNode> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): HidpLinkCollectionNode =
                    HidpLinkCollectionNode(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: HidpLinkCollectionNode) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.linkUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.linkUsagePage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.parent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.numberOfChildren)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.nextSibling)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.firstChild)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.bitfield)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.userContext)
                }
            }

        public operator fun invoke(
            linkUsage: UShort = 0u,
            linkUsagePage: UShort = 0u,
            parent: UShort = 0u,
            numberOfChildren: UShort = 0u,
            nextSibling: UShort = 0u,
            firstChild: UShort = 0u,
            bitfield: UInt = 0u,
            userContext: MutPtr<CVoid> = MutPtr(0L),
        ): HidpLinkCollectionNode =
            HidpLinkCollectionNode(
                linkUsage = linkUsage,
                linkUsagePage = linkUsagePage,
                parent = parent,
                numberOfChildren = numberOfChildren,
                nextSibling = nextSibling,
                firstChild = firstChild,
                bitfield = bitfield,
                userContextCtorArg = userContext,
            )
    }
}

public data class HidpUnknownToken(
    public var token: UByte = 0u,
    public var reserved: UByteArray = UByteArray(3),
    public var bitField: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HidpUnknownToken) return false
        if (this.token != other.token) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.bitField != other.bitField) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.token.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.bitField.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HidpUnknownToken> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HidpUnknownToken> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): HidpUnknownToken =
                    HidpUnknownToken(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: HidpUnknownToken) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.token)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 1L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.bitField)
                }
            }
    }
}

public class HidpValueCaps(
    public var usagePage: UShort = 0u,
    public var reportID: UByte = 0u,
    public var isAlias: Boolean = false,
    public var bitField: UShort = 0u,
    public var linkCollection: UShort = 0u,
    public var linkUsage: UShort = 0u,
    public var linkUsagePage: UShort = 0u,
    public var isRange: Boolean = false,
    public var isStringRange: Boolean = false,
    public var isDesignatorRange: Boolean = false,
    public var isAbsolute: Boolean = false,
    public var hasNull: Boolean = false,
    public var reserved: UByte = 0u,
    public var bitSize: UShort = 0u,
    public var reportCount: UShort = 0u,
    public var reserved2: UShortArray = UShortArray(5),
    public var unitsExp: UInt = 0u,
    public var units: UInt = 0u,
    public var logicalMin: Int = 0,
    public var logicalMax: Int = 0,
    public var physicalMin: Int = 0,
    public var physicalMax: Int = 0,
    public var anonymous: HidpValueCaps0 = HidpValueCaps0(),
)

public data class HidpValueCaps0(
    public var range: HidpValueCaps00 = HidpValueCaps00(),
    public var notRange: HidpValueCaps01 = HidpValueCaps01(),
)

public data class HidpValueCaps01(
    public var usage: UShort = 0u,
    public var reserved1: UShort = 0u,
    public var stringIndex: UShort = 0u,
    public var reserved2: UShort = 0u,
    public var designatorIndex: UShort = 0u,
    public var reserved3: UShort = 0u,
    public var dataIndex: UShort = 0u,
    public var reserved4: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HidpValueCaps01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HidpValueCaps01> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): HidpValueCaps01 =
                    HidpValueCaps01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                    )
                override fun writeNative(addr: Long, value: HidpValueCaps01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.usage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.stringIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.reserved2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.designatorIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.reserved3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.dataIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.reserved4)
                }
            }
    }
}

public data class HidpValueCaps00(
    public var usageMin: UShort = 0u,
    public var usageMax: UShort = 0u,
    public var stringMin: UShort = 0u,
    public var stringMax: UShort = 0u,
    public var designatorMin: UShort = 0u,
    public var designatorMax: UShort = 0u,
    public var dataIndexMin: UShort = 0u,
    public var dataIndexMax: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HidpValueCaps00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HidpValueCaps00> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): HidpValueCaps00 =
                    HidpValueCaps00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                    )
                override fun writeNative(addr: Long, value: HidpValueCaps00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.usageMin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.usageMax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.stringMin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.stringMax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.designatorMin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.designatorMax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.dataIndexMin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.dataIndexMax)
                }
            }
    }
}

public data class HidCollectionInformation(
    public var descriptorSize: UInt = 0u,
    public var polled: Boolean = false,
    public var reserved1: UByteArray = UByteArray(1),
    public var vendorID: UShort = 0u,
    public var productID: UShort = 0u,
    public var versionNumber: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HidCollectionInformation) return false
        if (this.descriptorSize != other.descriptorSize) return false
        if (this.polled != other.polled) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (this.vendorID != other.vendorID) return false
        if (this.productID != other.productID) return false
        if (this.versionNumber != other.versionNumber) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.descriptorSize.hashCode()
        result = 31 * result + this.polled.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        result = 31 * result + this.vendorID.hashCode()
        result = 31 * result + this.productID.hashCode()
        result = 31 * result + this.versionNumber.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HidCollectionInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HidCollectionInformation> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): HidCollectionInformation =
                    HidCollectionInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                    )
                override fun writeNative(addr: Long, value: HidCollectionInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.descriptorSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 4L, value.polled)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 5L, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.vendorID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.productID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.versionNumber)
                }
            }
    }
}

public data class HidDriverConfig(
    public var size: UInt = 0u,
    public var ringBufferSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HidDriverConfig> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HidDriverConfig> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): HidDriverConfig =
                    HidDriverConfig(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: HidDriverConfig) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ringBufferSize)
                }
            }
    }
}

public class HidXferPacket internal constructor(
    reportBufferCtorArg: MutPtr<UByte>,
    public var reportBufferLen: UInt,
    public var reportId: UByte,
) {
    public var reportBuffer: MutPtr<UByte> = reportBufferCtorArg
        internal set

    public constructor() : this(
        reportBufferCtorArg = MutPtr(0L),
        reportBufferLen = 0u,
        reportId = 0u,
    )

    public operator fun component1(): MutPtr<UByte> = this.reportBuffer

    public operator fun component2(): UInt = this.reportBufferLen

    public operator fun component3(): UByte = this.reportId

    public fun copy(reportBuffer: MutPtr<UByte> = this.reportBuffer, reportBufferLen: UInt = this.reportBufferLen, reportId: UByte = this.reportId): HidXferPacket = HidXferPacket(reportBufferCtorArg = reportBuffer, reportBufferLen = reportBufferLen, reportId = reportId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HidXferPacket) return false
        if (this.reportBuffer != other.reportBuffer) return false
        if (this.reportBufferLen != other.reportBufferLen) return false
        if (this.reportId != other.reportId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reportBuffer.hashCode()
        result = 31 * result + this.reportBufferLen.hashCode()
        result = 31 * result + this.reportId.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HidXferPacket> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HidXferPacket> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): HidXferPacket =
                    HidXferPacket(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: HidXferPacket) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr, value.reportBuffer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.reportBufferLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 12L, value.reportId)
                }
            }

        public operator fun invoke(
            reportBuffer: MutPtr<UByte> = MutPtr(0L),
            reportBufferLen: UInt = 0u,
            reportId: UByte = 0u,
        ): HidXferPacket =
            HidXferPacket(
                reportBufferCtorArg = reportBuffer,
                reportBufferLen = reportBufferLen,
                reportId = reportId,
            )
    }
}

public data class IndicatorList(
    public var makeCode: UShort = 0u,
    public var indicatorFlags: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IndicatorList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IndicatorList> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): IndicatorList =
                    IndicatorList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: IndicatorList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.makeCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.indicatorFlags)
                }
            }
    }
}

public data class InputButtonEnableInfo(
    public var buttonType: GpiobuttonsButtonType = 0,
    public var enabled: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InputButtonEnableInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InputButtonEnableInfo> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): InputButtonEnableInfo =
                    InputButtonEnableInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: InputButtonEnableInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.buttonType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 4L, value.enabled)
                }
            }
    }
}

public data class Joycalibrate(
    public var wXbase: UInt = 0u,
    public var wXdelta: UInt = 0u,
    public var wYbase: UInt = 0u,
    public var wYdelta: UInt = 0u,
    public var wZbase: UInt = 0u,
    public var wZdelta: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Joycalibrate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Joycalibrate> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Joycalibrate =
                    Joycalibrate(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: Joycalibrate) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.wXbase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.wXdelta)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.wYbase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.wYdelta)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.wZbase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.wZdelta)
                }
            }
    }
}

public data class Joypos(
    public var dwX: UInt = 0u,
    public var dwY: UInt = 0u,
    public var dwZ: UInt = 0u,
    public var dwR: UInt = 0u,
    public var dwU: UInt = 0u,
    public var dwV: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Joypos> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Joypos> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Joypos =
                    Joypos(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: Joypos) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwX)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwY)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwZ)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwR)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwU)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwV)
                }
            }
    }
}

public data class Joyrange(
    public var jpMin: Joypos = Joypos(),
    public var jpMax: Joypos = Joypos(),
    public var jpCenter: Joypos = Joypos(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Joyrange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Joyrange> {
                override val sizeBytes: Long = 72L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Joyrange =
                    Joyrange(
                        (Joypos.typeLayout()).readNative(addr),
                        (Joypos.typeLayout()).readNative(addr + 24L),
                        (Joypos.typeLayout()).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: Joyrange) {
                    (Joypos.typeLayout()).writeNative(addr, value.jpMin)
                    (Joypos.typeLayout()).writeNative(addr + 24L, value.jpMax)
                    (Joypos.typeLayout()).writeNative(addr + 48L, value.jpCenter)
                }
            }
    }
}

public data class Joyreghwconfig(
    public var hws: Joyreghwsettings = Joyreghwsettings(),
    public var dwUsageSettings: UInt = 0u,
    public var hwv: Joyreghwvalues = Joyreghwvalues(),
    public var dwType: UInt = 0u,
    public var dwReserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Joyreghwconfig> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Joyreghwconfig> {
                override val sizeBytes: Long = 112L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Joyreghwconfig =
                    Joyreghwconfig(
                        (Joyreghwsettings.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (Joyreghwvalues.typeLayout()).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 108L),
                    )
                override fun writeNative(addr: Long, value: Joyreghwconfig) {
                    (Joyreghwsettings.typeLayout()).writeNative(addr, value.hws)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwUsageSettings)
                    (Joyreghwvalues.typeLayout()).writeNative(addr + 12L, value.hwv)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 104L, value.dwType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 108L, value.dwReserved)
                }
            }
    }
}

public data class Joyreghwsettings(
    public var dwFlags: UInt = 0u,
    public var dwNumButtons: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Joyreghwsettings> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Joyreghwsettings> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Joyreghwsettings =
                    Joyreghwsettings(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Joyreghwsettings) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwNumButtons)
                }
            }
    }
}

public data class Joyreghwvalues(
    public var jrvHardware: Joyrange = Joyrange(),
    public var dwPOVValues: UIntArray = UIntArray(4),
    public var dwCalFlags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Joyreghwvalues) return false
        if (this.jrvHardware != other.jrvHardware) return false
        if (!this.dwPOVValues.contentEquals(other.dwPOVValues)) return false
        if (this.dwCalFlags != other.dwCalFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.jrvHardware.hashCode()
        result = 31 * result + this.dwPOVValues.contentHashCode()
        result = 31 * result + this.dwCalFlags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Joyreghwvalues> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Joyreghwvalues> {
                override val sizeBytes: Long = 92L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Joyreghwvalues =
                    Joyreghwvalues(
                        (Joyrange.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                        ).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 88L),
                    )
                override fun writeNative(addr: Long, value: Joyreghwvalues) {
                    (Joyrange.typeLayout()).writeNative(addr, value.jrvHardware)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                    ).writeNative(addr + 72L, value.dwPOVValues)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 88L, value.dwCalFlags)
                }
            }
    }
}

public data class Joyreguservalues(
    public var dwTimeOut: UInt = 0u,
    public var jrvRanges: Joyrange = Joyrange(),
    public var jpDeadZone: Joypos = Joypos(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Joyreguservalues> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Joyreguservalues> {
                override val sizeBytes: Long = 100L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Joyreguservalues =
                    Joyreguservalues(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (Joyrange.typeLayout()).readNative(addr + 4L),
                        (Joypos.typeLayout()).readNative(addr + 76L),
                    )
                override fun writeNative(addr: Long, value: Joyreguservalues) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwTimeOut)
                    (Joyrange.typeLayout()).writeNative(addr + 4L, value.jrvRanges)
                    (Joypos.typeLayout()).writeNative(addr + 76L, value.jpDeadZone)
                }
            }
    }
}

public data class KeyboardAttributes(
    public var keyboardIdentifier: KeyboardId = KeyboardId(),
    public var keyboardMode: UShort = 0u,
    public var numberOfFunctionKeys: UShort = 0u,
    public var numberOfIndicators: UShort = 0u,
    public var numberOfKeysTotal: UShort = 0u,
    public var inputDataQueueLength: UInt = 0u,
    public var keyRepeatMinimum: KeyboardTypematicParameters = KeyboardTypematicParameters(),
    public var keyRepeatMaximum: KeyboardTypematicParameters = KeyboardTypematicParameters(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KeyboardAttributes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KeyboardAttributes> {
                override val sizeBytes: Long = 28L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): KeyboardAttributes =
                    KeyboardAttributes(
                        (KeyboardId.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (KeyboardTypematicParameters.typeLayout()).readNative(addr + 16L),
                        (KeyboardTypematicParameters.typeLayout()).readNative(addr + 22L),
                    )
                override fun writeNative(addr: Long, value: KeyboardAttributes) {
                    (KeyboardId.typeLayout()).writeNative(addr, value.keyboardIdentifier)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.keyboardMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.numberOfFunctionKeys)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.numberOfIndicators)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.numberOfKeysTotal)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.inputDataQueueLength)
                    (KeyboardTypematicParameters.typeLayout()).writeNative(addr + 16L, value.keyRepeatMinimum)
                    (KeyboardTypematicParameters.typeLayout()).writeNative(addr + 22L, value.keyRepeatMaximum)
                }
            }
    }
}

public data class KeyboardExtendedAttributes(
    public var version: UByte = 0u,
    public var formFactor: UByte = 0u,
    public var keyType: UByte = 0u,
    public var physicalLayout: UByte = 0u,
    public var vendorSpecificPhysicalLayout: UByte = 0u,
    public var iETFLanguageTagIndex: UByte = 0u,
    public var implementedInputAssistControls: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KeyboardExtendedAttributes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KeyboardExtendedAttributes> {
                override val sizeBytes: Long = 7L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): KeyboardExtendedAttributes =
                    KeyboardExtendedAttributes(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: KeyboardExtendedAttributes) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.formFactor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.keyType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.physicalLayout)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.vendorSpecificPhysicalLayout)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.iETFLanguageTagIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.implementedInputAssistControls)
                }
            }
    }
}

public data class KeyboardId(
    public var type: UByte = 0u,
    public var subtype: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KeyboardId> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KeyboardId> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): KeyboardId =
                    KeyboardId(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: KeyboardId) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.subtype)
                }
            }
    }
}

public data class KeyboardImeStatus(
    public var unitId: UShort = 0u,
    public var imeOpen: UInt = 0u,
    public var imeConvMode: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KeyboardImeStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KeyboardImeStatus> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): KeyboardImeStatus =
                    KeyboardImeStatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: KeyboardImeStatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.unitId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.imeOpen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.imeConvMode)
                }
            }
    }
}

public data class KeyboardIndicatorParameters(
    public var unitId: UShort = 0u,
    public var ledFlags: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KeyboardIndicatorParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KeyboardIndicatorParameters> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): KeyboardIndicatorParameters =
                    KeyboardIndicatorParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: KeyboardIndicatorParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.unitId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.ledFlags)
                }
            }
    }
}

public data class KeyboardIndicatorTranslation(
    public var numberOfIndicatorKeys: UShort = 0u,
    public var indicatorList: List<IndicatorList> = List(1) { IndicatorList() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KeyboardIndicatorTranslation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KeyboardIndicatorTranslation> {
                override val sizeBytes: Long = 6L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): KeyboardIndicatorTranslation =
                    KeyboardIndicatorTranslation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(IndicatorList.typeLayout(), (1).toInt())
                        ).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: KeyboardIndicatorTranslation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.numberOfIndicatorKeys)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(IndicatorList.typeLayout(), (1).toInt())
                    ).writeNative(addr + 2L, value.indicatorList)
                }
            }
    }
}

public data class KeyboardInputData(
    public var unitId: UShort = 0u,
    public var makeCode: UShort = 0u,
    public var flags: UShort = 0u,
    public var reserved: UShort = 0u,
    public var extraInformation: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KeyboardInputData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KeyboardInputData> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): KeyboardInputData =
                    KeyboardInputData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: KeyboardInputData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.unitId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.makeCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.extraInformation)
                }
            }
    }
}

public data class KeyboardTypematicParameters(
    public var unitId: UShort = 0u,
    public var rate: UShort = 0u,
    public var delay: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KeyboardTypematicParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KeyboardTypematicParameters> {
                override val sizeBytes: Long = 6L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): KeyboardTypematicParameters =
                    KeyboardTypematicParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: KeyboardTypematicParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.unitId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.rate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.delay)
                }
            }
    }
}

public data class KeyboardUnitIdParameter(
    public var unitId: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KeyboardUnitIdParameter> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KeyboardUnitIdParameter> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): KeyboardUnitIdParameter =
                    KeyboardUnitIdParameter(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: KeyboardUnitIdParameter) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.unitId)
                }
            }
    }
}

public data class MouseAttributes(
    public var mouseIdentifier: UShort = 0u,
    public var numberOfButtons: UShort = 0u,
    public var sampleRate: UShort = 0u,
    public var inputDataQueueLength: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MouseAttributes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MouseAttributes> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): MouseAttributes =
                    MouseAttributes(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MouseAttributes) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.mouseIdentifier)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.numberOfButtons)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.sampleRate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.inputDataQueueLength)
                }
            }
    }
}

public data class MouseInputData(
    public var unitId: UShort = 0u,
    public var flags: UShort = 0u,
    public var anonymous: MouseInputData0 = MouseInputData0(),
    public var rawButtons: UInt = 0u,
    public var lastX: Int = 0,
    public var lastY: Int = 0,
    public var extraInformation: UInt = 0u,
)

public data class MouseInputData0(
    public var buttons: UInt = 0u,
    public var anonymous: MouseInputData00 = MouseInputData00(),
)

public data class MouseInputData00(
    public var buttonFlags: UShort = 0u,
    public var buttonData: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MouseInputData00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MouseInputData00> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): MouseInputData00 =
                    MouseInputData00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: MouseInputData00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.buttonFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.buttonData)
                }
            }
    }
}

public data class MouseUnitIdParameter(
    public var unitId: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MouseUnitIdParameter> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MouseUnitIdParameter> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): MouseUnitIdParameter =
                    MouseUnitIdParameter(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: MouseUnitIdParameter) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.unitId)
                }
            }
    }
}

public data class UsageAndPage(
    public var usage: UShort = 0u,
    public var usagePage: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsageAndPage> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsageAndPage> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): UsageAndPage =
                    UsageAndPage(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: UsageAndPage) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.usage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.usagePage)
                }
            }
    }
}
