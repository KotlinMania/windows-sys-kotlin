@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.performance

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
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Systemtime

public class PdhBrowseDlgConfigA internal constructor(
    public var bitfield: UInt,
    hWndOwnerCtorArg: Hwnd,
    szDataSourceCtorArg: Pstr,
    szReturnPathBufferCtorArg: Pstr,
    public var cchReturnPathLength: UInt,
    public var pCallBack: CounterPathCallBack,
    public var dwCallBackArg: Int,
    public var callBackStatus: Int,
    public var dwDefaultDetailLevel: PerfDetail,
    szDialogBoxCaptionCtorArg: Pstr,
) {
    public var hWndOwner: Hwnd = hWndOwnerCtorArg
        internal set

    public var szDataSource: Pstr = szDataSourceCtorArg
        internal set

    public var szReturnPathBuffer: Pstr = szReturnPathBufferCtorArg
        internal set

    public var szDialogBoxCaption: Pstr = szDialogBoxCaptionCtorArg
        internal set

    public constructor() : this(
        bitfield = 0u,
        hWndOwnerCtorArg = MutPtr(0L),
        szDataSourceCtorArg = MutPtr(0L),
        szReturnPathBufferCtorArg = MutPtr(0L),
        cchReturnPathLength = 0u,
        pCallBack = null,
        dwCallBackArg = 0,
        callBackStatus = 0,
        dwDefaultDetailLevel = 0u,
        szDialogBoxCaptionCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.bitfield

    public operator fun component2(): Hwnd = this.hWndOwner

    public operator fun component3(): Pstr = this.szDataSource

    public operator fun component4(): Pstr = this.szReturnPathBuffer

    public operator fun component5(): UInt = this.cchReturnPathLength

    public operator fun component6(): CounterPathCallBack = this.pCallBack

    public operator fun component7(): Int = this.dwCallBackArg

    public operator fun component8(): Int = this.callBackStatus

    public operator fun component9(): PerfDetail = this.dwDefaultDetailLevel

    public operator fun component10(): Pstr = this.szDialogBoxCaption

    public fun copy(bitfield: UInt = this.bitfield, hWndOwner: Hwnd = this.hWndOwner, szDataSource: Pstr = this.szDataSource, szReturnPathBuffer: Pstr = this.szReturnPathBuffer, cchReturnPathLength: UInt = this.cchReturnPathLength, pCallBack: CounterPathCallBack = this.pCallBack, dwCallBackArg: Int = this.dwCallBackArg, callBackStatus: Int = this.callBackStatus, dwDefaultDetailLevel: PerfDetail = this.dwDefaultDetailLevel, szDialogBoxCaption: Pstr = this.szDialogBoxCaption): PdhBrowseDlgConfigA = PdhBrowseDlgConfigA(bitfield = bitfield, hWndOwnerCtorArg = hWndOwner, szDataSourceCtorArg = szDataSource, szReturnPathBufferCtorArg = szReturnPathBuffer, cchReturnPathLength = cchReturnPathLength, pCallBack = pCallBack, dwCallBackArg = dwCallBackArg, callBackStatus = callBackStatus, dwDefaultDetailLevel = dwDefaultDetailLevel, szDialogBoxCaptionCtorArg = szDialogBoxCaption)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PdhBrowseDlgConfigA) return false
        if (this.bitfield != other.bitfield) return false
        if (this.hWndOwner != other.hWndOwner) return false
        if (this.szDataSource != other.szDataSource) return false
        if (this.szReturnPathBuffer != other.szReturnPathBuffer) return false
        if (this.cchReturnPathLength != other.cchReturnPathLength) return false
        if (this.pCallBack != other.pCallBack) return false
        if (this.dwCallBackArg != other.dwCallBackArg) return false
        if (this.callBackStatus != other.callBackStatus) return false
        if (this.dwDefaultDetailLevel != other.dwDefaultDetailLevel) return false
        if (this.szDialogBoxCaption != other.szDialogBoxCaption) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bitfield.hashCode()
        result = 31 * result + this.hWndOwner.hashCode()
        result = 31 * result + this.szDataSource.hashCode()
        result = 31 * result + this.szReturnPathBuffer.hashCode()
        result = 31 * result + this.cchReturnPathLength.hashCode()
        result = 31 * result + this.pCallBack.hashCode()
        result = 31 * result + this.dwCallBackArg.hashCode()
        result = 31 * result + this.callBackStatus.hashCode()
        result = 31 * result + this.dwDefaultDetailLevel.hashCode()
        result = 31 * result + this.szDialogBoxCaption.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            bitfield: UInt = 0u,
            hWndOwner: Hwnd = MutPtr(0L),
            szDataSource: Pstr = MutPtr(0L),
            szReturnPathBuffer: Pstr = MutPtr(0L),
            cchReturnPathLength: UInt = 0u,
            pCallBack: CounterPathCallBack = null,
            dwCallBackArg: Int = 0,
            callBackStatus: Int = 0,
            dwDefaultDetailLevel: PerfDetail = 0u,
            szDialogBoxCaption: Pstr = MutPtr(0L),
        ): PdhBrowseDlgConfigA =
            PdhBrowseDlgConfigA(
                bitfield = bitfield,
                hWndOwnerCtorArg = hWndOwner,
                szDataSourceCtorArg = szDataSource,
                szReturnPathBufferCtorArg = szReturnPathBuffer,
                cchReturnPathLength = cchReturnPathLength,
                pCallBack = pCallBack,
                dwCallBackArg = dwCallBackArg,
                callBackStatus = callBackStatus,
                dwDefaultDetailLevel = dwDefaultDetailLevel,
                szDialogBoxCaptionCtorArg = szDialogBoxCaption,
            )
    }
}

public class PdhBrowseDlgConfigHa internal constructor(
    public var bitfield: UInt,
    hWndOwnerCtorArg: Hwnd,
    hDataSourceCtorArg: PdhHlog,
    szReturnPathBufferCtorArg: Pstr,
    public var cchReturnPathLength: UInt,
    public var pCallBack: CounterPathCallBack,
    public var dwCallBackArg: Int,
    public var callBackStatus: Int,
    public var dwDefaultDetailLevel: PerfDetail,
    szDialogBoxCaptionCtorArg: Pstr,
) {
    public var hWndOwner: Hwnd = hWndOwnerCtorArg
        internal set

    public var hDataSource: PdhHlog = hDataSourceCtorArg
        internal set

    public var szReturnPathBuffer: Pstr = szReturnPathBufferCtorArg
        internal set

    public var szDialogBoxCaption: Pstr = szDialogBoxCaptionCtorArg
        internal set

    public constructor() : this(
        bitfield = 0u,
        hWndOwnerCtorArg = MutPtr(0L),
        hDataSourceCtorArg = MutPtr(0L),
        szReturnPathBufferCtorArg = MutPtr(0L),
        cchReturnPathLength = 0u,
        pCallBack = null,
        dwCallBackArg = 0,
        callBackStatus = 0,
        dwDefaultDetailLevel = 0u,
        szDialogBoxCaptionCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.bitfield

    public operator fun component2(): Hwnd = this.hWndOwner

    public operator fun component3(): PdhHlog = this.hDataSource

    public operator fun component4(): Pstr = this.szReturnPathBuffer

    public operator fun component5(): UInt = this.cchReturnPathLength

    public operator fun component6(): CounterPathCallBack = this.pCallBack

    public operator fun component7(): Int = this.dwCallBackArg

    public operator fun component8(): Int = this.callBackStatus

    public operator fun component9(): PerfDetail = this.dwDefaultDetailLevel

    public operator fun component10(): Pstr = this.szDialogBoxCaption

    public fun copy(bitfield: UInt = this.bitfield, hWndOwner: Hwnd = this.hWndOwner, hDataSource: PdhHlog = this.hDataSource, szReturnPathBuffer: Pstr = this.szReturnPathBuffer, cchReturnPathLength: UInt = this.cchReturnPathLength, pCallBack: CounterPathCallBack = this.pCallBack, dwCallBackArg: Int = this.dwCallBackArg, callBackStatus: Int = this.callBackStatus, dwDefaultDetailLevel: PerfDetail = this.dwDefaultDetailLevel, szDialogBoxCaption: Pstr = this.szDialogBoxCaption): PdhBrowseDlgConfigHa = PdhBrowseDlgConfigHa(bitfield = bitfield, hWndOwnerCtorArg = hWndOwner, hDataSourceCtorArg = hDataSource, szReturnPathBufferCtorArg = szReturnPathBuffer, cchReturnPathLength = cchReturnPathLength, pCallBack = pCallBack, dwCallBackArg = dwCallBackArg, callBackStatus = callBackStatus, dwDefaultDetailLevel = dwDefaultDetailLevel, szDialogBoxCaptionCtorArg = szDialogBoxCaption)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PdhBrowseDlgConfigHa) return false
        if (this.bitfield != other.bitfield) return false
        if (this.hWndOwner != other.hWndOwner) return false
        if (this.hDataSource != other.hDataSource) return false
        if (this.szReturnPathBuffer != other.szReturnPathBuffer) return false
        if (this.cchReturnPathLength != other.cchReturnPathLength) return false
        if (this.pCallBack != other.pCallBack) return false
        if (this.dwCallBackArg != other.dwCallBackArg) return false
        if (this.callBackStatus != other.callBackStatus) return false
        if (this.dwDefaultDetailLevel != other.dwDefaultDetailLevel) return false
        if (this.szDialogBoxCaption != other.szDialogBoxCaption) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bitfield.hashCode()
        result = 31 * result + this.hWndOwner.hashCode()
        result = 31 * result + this.hDataSource.hashCode()
        result = 31 * result + this.szReturnPathBuffer.hashCode()
        result = 31 * result + this.cchReturnPathLength.hashCode()
        result = 31 * result + this.pCallBack.hashCode()
        result = 31 * result + this.dwCallBackArg.hashCode()
        result = 31 * result + this.callBackStatus.hashCode()
        result = 31 * result + this.dwDefaultDetailLevel.hashCode()
        result = 31 * result + this.szDialogBoxCaption.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            bitfield: UInt = 0u,
            hWndOwner: Hwnd = MutPtr(0L),
            hDataSource: PdhHlog = MutPtr(0L),
            szReturnPathBuffer: Pstr = MutPtr(0L),
            cchReturnPathLength: UInt = 0u,
            pCallBack: CounterPathCallBack = null,
            dwCallBackArg: Int = 0,
            callBackStatus: Int = 0,
            dwDefaultDetailLevel: PerfDetail = 0u,
            szDialogBoxCaption: Pstr = MutPtr(0L),
        ): PdhBrowseDlgConfigHa =
            PdhBrowseDlgConfigHa(
                bitfield = bitfield,
                hWndOwnerCtorArg = hWndOwner,
                hDataSourceCtorArg = hDataSource,
                szReturnPathBufferCtorArg = szReturnPathBuffer,
                cchReturnPathLength = cchReturnPathLength,
                pCallBack = pCallBack,
                dwCallBackArg = dwCallBackArg,
                callBackStatus = callBackStatus,
                dwDefaultDetailLevel = dwDefaultDetailLevel,
                szDialogBoxCaptionCtorArg = szDialogBoxCaption,
            )
    }
}

public class PdhBrowseDlgConfigHw internal constructor(
    public var bitfield: UInt,
    hWndOwnerCtorArg: Hwnd,
    hDataSourceCtorArg: PdhHlog,
    szReturnPathBufferCtorArg: Pwstr,
    public var cchReturnPathLength: UInt,
    public var pCallBack: CounterPathCallBack,
    public var dwCallBackArg: Int,
    public var callBackStatus: Int,
    public var dwDefaultDetailLevel: PerfDetail,
    szDialogBoxCaptionCtorArg: Pwstr,
) {
    public var hWndOwner: Hwnd = hWndOwnerCtorArg
        internal set

    public var hDataSource: PdhHlog = hDataSourceCtorArg
        internal set

    public var szReturnPathBuffer: Pwstr = szReturnPathBufferCtorArg
        internal set

    public var szDialogBoxCaption: Pwstr = szDialogBoxCaptionCtorArg
        internal set

    public constructor() : this(
        bitfield = 0u,
        hWndOwnerCtorArg = MutPtr(0L),
        hDataSourceCtorArg = MutPtr(0L),
        szReturnPathBufferCtorArg = MutPtr(0L),
        cchReturnPathLength = 0u,
        pCallBack = null,
        dwCallBackArg = 0,
        callBackStatus = 0,
        dwDefaultDetailLevel = 0u,
        szDialogBoxCaptionCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.bitfield

    public operator fun component2(): Hwnd = this.hWndOwner

    public operator fun component3(): PdhHlog = this.hDataSource

    public operator fun component4(): Pwstr = this.szReturnPathBuffer

    public operator fun component5(): UInt = this.cchReturnPathLength

    public operator fun component6(): CounterPathCallBack = this.pCallBack

    public operator fun component7(): Int = this.dwCallBackArg

    public operator fun component8(): Int = this.callBackStatus

    public operator fun component9(): PerfDetail = this.dwDefaultDetailLevel

    public operator fun component10(): Pwstr = this.szDialogBoxCaption

    public fun copy(bitfield: UInt = this.bitfield, hWndOwner: Hwnd = this.hWndOwner, hDataSource: PdhHlog = this.hDataSource, szReturnPathBuffer: Pwstr = this.szReturnPathBuffer, cchReturnPathLength: UInt = this.cchReturnPathLength, pCallBack: CounterPathCallBack = this.pCallBack, dwCallBackArg: Int = this.dwCallBackArg, callBackStatus: Int = this.callBackStatus, dwDefaultDetailLevel: PerfDetail = this.dwDefaultDetailLevel, szDialogBoxCaption: Pwstr = this.szDialogBoxCaption): PdhBrowseDlgConfigHw = PdhBrowseDlgConfigHw(bitfield = bitfield, hWndOwnerCtorArg = hWndOwner, hDataSourceCtorArg = hDataSource, szReturnPathBufferCtorArg = szReturnPathBuffer, cchReturnPathLength = cchReturnPathLength, pCallBack = pCallBack, dwCallBackArg = dwCallBackArg, callBackStatus = callBackStatus, dwDefaultDetailLevel = dwDefaultDetailLevel, szDialogBoxCaptionCtorArg = szDialogBoxCaption)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PdhBrowseDlgConfigHw) return false
        if (this.bitfield != other.bitfield) return false
        if (this.hWndOwner != other.hWndOwner) return false
        if (this.hDataSource != other.hDataSource) return false
        if (this.szReturnPathBuffer != other.szReturnPathBuffer) return false
        if (this.cchReturnPathLength != other.cchReturnPathLength) return false
        if (this.pCallBack != other.pCallBack) return false
        if (this.dwCallBackArg != other.dwCallBackArg) return false
        if (this.callBackStatus != other.callBackStatus) return false
        if (this.dwDefaultDetailLevel != other.dwDefaultDetailLevel) return false
        if (this.szDialogBoxCaption != other.szDialogBoxCaption) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bitfield.hashCode()
        result = 31 * result + this.hWndOwner.hashCode()
        result = 31 * result + this.hDataSource.hashCode()
        result = 31 * result + this.szReturnPathBuffer.hashCode()
        result = 31 * result + this.cchReturnPathLength.hashCode()
        result = 31 * result + this.pCallBack.hashCode()
        result = 31 * result + this.dwCallBackArg.hashCode()
        result = 31 * result + this.callBackStatus.hashCode()
        result = 31 * result + this.dwDefaultDetailLevel.hashCode()
        result = 31 * result + this.szDialogBoxCaption.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            bitfield: UInt = 0u,
            hWndOwner: Hwnd = MutPtr(0L),
            hDataSource: PdhHlog = MutPtr(0L),
            szReturnPathBuffer: Pwstr = MutPtr(0L),
            cchReturnPathLength: UInt = 0u,
            pCallBack: CounterPathCallBack = null,
            dwCallBackArg: Int = 0,
            callBackStatus: Int = 0,
            dwDefaultDetailLevel: PerfDetail = 0u,
            szDialogBoxCaption: Pwstr = MutPtr(0L),
        ): PdhBrowseDlgConfigHw =
            PdhBrowseDlgConfigHw(
                bitfield = bitfield,
                hWndOwnerCtorArg = hWndOwner,
                hDataSourceCtorArg = hDataSource,
                szReturnPathBufferCtorArg = szReturnPathBuffer,
                cchReturnPathLength = cchReturnPathLength,
                pCallBack = pCallBack,
                dwCallBackArg = dwCallBackArg,
                callBackStatus = callBackStatus,
                dwDefaultDetailLevel = dwDefaultDetailLevel,
                szDialogBoxCaptionCtorArg = szDialogBoxCaption,
            )
    }
}

public class PdhBrowseDlgConfigW internal constructor(
    public var bitfield: UInt,
    hWndOwnerCtorArg: Hwnd,
    szDataSourceCtorArg: Pwstr,
    szReturnPathBufferCtorArg: Pwstr,
    public var cchReturnPathLength: UInt,
    public var pCallBack: CounterPathCallBack,
    public var dwCallBackArg: Int,
    public var callBackStatus: Int,
    public var dwDefaultDetailLevel: PerfDetail,
    szDialogBoxCaptionCtorArg: Pwstr,
) {
    public var hWndOwner: Hwnd = hWndOwnerCtorArg
        internal set

    public var szDataSource: Pwstr = szDataSourceCtorArg
        internal set

    public var szReturnPathBuffer: Pwstr = szReturnPathBufferCtorArg
        internal set

    public var szDialogBoxCaption: Pwstr = szDialogBoxCaptionCtorArg
        internal set

    public constructor() : this(
        bitfield = 0u,
        hWndOwnerCtorArg = MutPtr(0L),
        szDataSourceCtorArg = MutPtr(0L),
        szReturnPathBufferCtorArg = MutPtr(0L),
        cchReturnPathLength = 0u,
        pCallBack = null,
        dwCallBackArg = 0,
        callBackStatus = 0,
        dwDefaultDetailLevel = 0u,
        szDialogBoxCaptionCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.bitfield

    public operator fun component2(): Hwnd = this.hWndOwner

    public operator fun component3(): Pwstr = this.szDataSource

    public operator fun component4(): Pwstr = this.szReturnPathBuffer

    public operator fun component5(): UInt = this.cchReturnPathLength

    public operator fun component6(): CounterPathCallBack = this.pCallBack

    public operator fun component7(): Int = this.dwCallBackArg

    public operator fun component8(): Int = this.callBackStatus

    public operator fun component9(): PerfDetail = this.dwDefaultDetailLevel

    public operator fun component10(): Pwstr = this.szDialogBoxCaption

    public fun copy(bitfield: UInt = this.bitfield, hWndOwner: Hwnd = this.hWndOwner, szDataSource: Pwstr = this.szDataSource, szReturnPathBuffer: Pwstr = this.szReturnPathBuffer, cchReturnPathLength: UInt = this.cchReturnPathLength, pCallBack: CounterPathCallBack = this.pCallBack, dwCallBackArg: Int = this.dwCallBackArg, callBackStatus: Int = this.callBackStatus, dwDefaultDetailLevel: PerfDetail = this.dwDefaultDetailLevel, szDialogBoxCaption: Pwstr = this.szDialogBoxCaption): PdhBrowseDlgConfigW = PdhBrowseDlgConfigW(bitfield = bitfield, hWndOwnerCtorArg = hWndOwner, szDataSourceCtorArg = szDataSource, szReturnPathBufferCtorArg = szReturnPathBuffer, cchReturnPathLength = cchReturnPathLength, pCallBack = pCallBack, dwCallBackArg = dwCallBackArg, callBackStatus = callBackStatus, dwDefaultDetailLevel = dwDefaultDetailLevel, szDialogBoxCaptionCtorArg = szDialogBoxCaption)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PdhBrowseDlgConfigW) return false
        if (this.bitfield != other.bitfield) return false
        if (this.hWndOwner != other.hWndOwner) return false
        if (this.szDataSource != other.szDataSource) return false
        if (this.szReturnPathBuffer != other.szReturnPathBuffer) return false
        if (this.cchReturnPathLength != other.cchReturnPathLength) return false
        if (this.pCallBack != other.pCallBack) return false
        if (this.dwCallBackArg != other.dwCallBackArg) return false
        if (this.callBackStatus != other.callBackStatus) return false
        if (this.dwDefaultDetailLevel != other.dwDefaultDetailLevel) return false
        if (this.szDialogBoxCaption != other.szDialogBoxCaption) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bitfield.hashCode()
        result = 31 * result + this.hWndOwner.hashCode()
        result = 31 * result + this.szDataSource.hashCode()
        result = 31 * result + this.szReturnPathBuffer.hashCode()
        result = 31 * result + this.cchReturnPathLength.hashCode()
        result = 31 * result + this.pCallBack.hashCode()
        result = 31 * result + this.dwCallBackArg.hashCode()
        result = 31 * result + this.callBackStatus.hashCode()
        result = 31 * result + this.dwDefaultDetailLevel.hashCode()
        result = 31 * result + this.szDialogBoxCaption.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            bitfield: UInt = 0u,
            hWndOwner: Hwnd = MutPtr(0L),
            szDataSource: Pwstr = MutPtr(0L),
            szReturnPathBuffer: Pwstr = MutPtr(0L),
            cchReturnPathLength: UInt = 0u,
            pCallBack: CounterPathCallBack = null,
            dwCallBackArg: Int = 0,
            callBackStatus: Int = 0,
            dwDefaultDetailLevel: PerfDetail = 0u,
            szDialogBoxCaption: Pwstr = MutPtr(0L),
        ): PdhBrowseDlgConfigW =
            PdhBrowseDlgConfigW(
                bitfield = bitfield,
                hWndOwnerCtorArg = hWndOwner,
                szDataSourceCtorArg = szDataSource,
                szReturnPathBufferCtorArg = szReturnPathBuffer,
                cchReturnPathLength = cchReturnPathLength,
                pCallBack = pCallBack,
                dwCallBackArg = dwCallBackArg,
                callBackStatus = callBackStatus,
                dwDefaultDetailLevel = dwDefaultDetailLevel,
                szDialogBoxCaptionCtorArg = szDialogBoxCaption,
            )
    }
}

public class PdhCounterInfoA internal constructor(
    public var dwLength: UInt,
    public var dwType: UInt,
    public var cVersion: UInt,
    public var cStatus: UInt,
    public var lScale: Int,
    public var lDefaultScale: Int,
    public var dwUserData: Int,
    public var dwQueryUserData: Int,
    szFullPathCtorArg: Pstr,
    public var anonymous: PdhCounterInfoA0,
    szExplainTextCtorArg: Pstr,
    public var dataBuffer: UIntArray,
) {
    public var szFullPath: Pstr = szFullPathCtorArg
        internal set

    public var szExplainText: Pstr = szExplainTextCtorArg
        internal set

    public constructor() : this(
        dwLength = 0u,
        dwType = 0u,
        cVersion = 0u,
        cStatus = 0u,
        lScale = 0,
        lDefaultScale = 0,
        dwUserData = 0,
        dwQueryUserData = 0,
        szFullPathCtorArg = MutPtr(0L),
        anonymous = PdhCounterInfoA0(),
        szExplainTextCtorArg = MutPtr(0L),
        dataBuffer = UIntArray(1),
    )

    public operator fun component1(): UInt = this.dwLength

    public operator fun component2(): UInt = this.dwType

    public operator fun component3(): UInt = this.cVersion

    public operator fun component4(): UInt = this.cStatus

    public operator fun component5(): Int = this.lScale

    public operator fun component6(): Int = this.lDefaultScale

    public operator fun component7(): Int = this.dwUserData

    public operator fun component8(): Int = this.dwQueryUserData

    public operator fun component9(): Pstr = this.szFullPath

    public operator fun component10(): PdhCounterInfoA0 = this.anonymous

    public operator fun component11(): Pstr = this.szExplainText

    public operator fun component12(): UIntArray = this.dataBuffer

    public fun copy(dwLength: UInt = this.dwLength, dwType: UInt = this.dwType, cVersion: UInt = this.cVersion, cStatus: UInt = this.cStatus, lScale: Int = this.lScale, lDefaultScale: Int = this.lDefaultScale, dwUserData: Int = this.dwUserData, dwQueryUserData: Int = this.dwQueryUserData, szFullPath: Pstr = this.szFullPath, anonymous: PdhCounterInfoA0 = this.anonymous, szExplainText: Pstr = this.szExplainText, dataBuffer: UIntArray = this.dataBuffer): PdhCounterInfoA = PdhCounterInfoA(dwLength = dwLength, dwType = dwType, cVersion = cVersion, cStatus = cStatus, lScale = lScale, lDefaultScale = lDefaultScale, dwUserData = dwUserData, dwQueryUserData = dwQueryUserData, szFullPathCtorArg = szFullPath, anonymous = anonymous, szExplainTextCtorArg = szExplainText, dataBuffer = dataBuffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PdhCounterInfoA) return false
        if (this.dwLength != other.dwLength) return false
        if (this.dwType != other.dwType) return false
        if (this.cVersion != other.cVersion) return false
        if (this.cStatus != other.cStatus) return false
        if (this.lScale != other.lScale) return false
        if (this.lDefaultScale != other.lDefaultScale) return false
        if (this.dwUserData != other.dwUserData) return false
        if (this.dwQueryUserData != other.dwQueryUserData) return false
        if (this.szFullPath != other.szFullPath) return false
        if (this.anonymous != other.anonymous) return false
        if (this.szExplainText != other.szExplainText) return false
        if (!this.dataBuffer.contentEquals(other.dataBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwLength.hashCode()
        result = 31 * result + this.dwType.hashCode()
        result = 31 * result + this.cVersion.hashCode()
        result = 31 * result + this.cStatus.hashCode()
        result = 31 * result + this.lScale.hashCode()
        result = 31 * result + this.lDefaultScale.hashCode()
        result = 31 * result + this.dwUserData.hashCode()
        result = 31 * result + this.dwQueryUserData.hashCode()
        result = 31 * result + this.szFullPath.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.szExplainText.hashCode()
        result = 31 * result + this.dataBuffer.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwLength: UInt = 0u,
            dwType: UInt = 0u,
            cVersion: UInt = 0u,
            cStatus: UInt = 0u,
            lScale: Int = 0,
            lDefaultScale: Int = 0,
            dwUserData: Int = 0,
            dwQueryUserData: Int = 0,
            szFullPath: Pstr = MutPtr(0L),
            anonymous: PdhCounterInfoA0 = PdhCounterInfoA0(),
            szExplainText: Pstr = MutPtr(0L),
            dataBuffer: UIntArray = UIntArray(1),
        ): PdhCounterInfoA =
            PdhCounterInfoA(
                dwLength = dwLength,
                dwType = dwType,
                cVersion = cVersion,
                cStatus = cStatus,
                lScale = lScale,
                lDefaultScale = lDefaultScale,
                dwUserData = dwUserData,
                dwQueryUserData = dwQueryUserData,
                szFullPathCtorArg = szFullPath,
                anonymous = anonymous,
                szExplainTextCtorArg = szExplainText,
                dataBuffer = dataBuffer,
            )
    }
}

public data class PdhCounterInfoA0(
    public var dataItemPath: PdhDataItemPathElementsA = PdhDataItemPathElementsA(),
    public var counterPath: PdhCounterPathElementsA = PdhCounterPathElementsA(),
    public var anonymous: PdhCounterInfoA00 = PdhCounterInfoA00(),
)

public class PdhCounterInfoA00 internal constructor(
    szMachineNameCtorArg: Pstr,
    szObjectNameCtorArg: Pstr,
    szInstanceNameCtorArg: Pstr,
    szParentInstanceCtorArg: Pstr,
    public var dwInstanceIndex: UInt,
    szCounterNameCtorArg: Pstr,
) {
    public var szMachineName: Pstr = szMachineNameCtorArg
        internal set

    public var szObjectName: Pstr = szObjectNameCtorArg
        internal set

    public var szInstanceName: Pstr = szInstanceNameCtorArg
        internal set

    public var szParentInstance: Pstr = szParentInstanceCtorArg
        internal set

    public var szCounterName: Pstr = szCounterNameCtorArg
        internal set

    public constructor() : this(
        szMachineNameCtorArg = MutPtr(0L),
        szObjectNameCtorArg = MutPtr(0L),
        szInstanceNameCtorArg = MutPtr(0L),
        szParentInstanceCtorArg = MutPtr(0L),
        dwInstanceIndex = 0u,
        szCounterNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pstr = this.szMachineName

    public operator fun component2(): Pstr = this.szObjectName

    public operator fun component3(): Pstr = this.szInstanceName

    public operator fun component4(): Pstr = this.szParentInstance

    public operator fun component5(): UInt = this.dwInstanceIndex

    public operator fun component6(): Pstr = this.szCounterName

    public fun copy(szMachineName: Pstr = this.szMachineName, szObjectName: Pstr = this.szObjectName, szInstanceName: Pstr = this.szInstanceName, szParentInstance: Pstr = this.szParentInstance, dwInstanceIndex: UInt = this.dwInstanceIndex, szCounterName: Pstr = this.szCounterName): PdhCounterInfoA00 = PdhCounterInfoA00(szMachineNameCtorArg = szMachineName, szObjectNameCtorArg = szObjectName, szInstanceNameCtorArg = szInstanceName, szParentInstanceCtorArg = szParentInstance, dwInstanceIndex = dwInstanceIndex, szCounterNameCtorArg = szCounterName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PdhCounterInfoA00) return false
        if (this.szMachineName != other.szMachineName) return false
        if (this.szObjectName != other.szObjectName) return false
        if (this.szInstanceName != other.szInstanceName) return false
        if (this.szParentInstance != other.szParentInstance) return false
        if (this.dwInstanceIndex != other.dwInstanceIndex) return false
        if (this.szCounterName != other.szCounterName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szMachineName.hashCode()
        result = 31 * result + this.szObjectName.hashCode()
        result = 31 * result + this.szInstanceName.hashCode()
        result = 31 * result + this.szParentInstance.hashCode()
        result = 31 * result + this.dwInstanceIndex.hashCode()
        result = 31 * result + this.szCounterName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            szMachineName: Pstr = MutPtr(0L),
            szObjectName: Pstr = MutPtr(0L),
            szInstanceName: Pstr = MutPtr(0L),
            szParentInstance: Pstr = MutPtr(0L),
            dwInstanceIndex: UInt = 0u,
            szCounterName: Pstr = MutPtr(0L),
        ): PdhCounterInfoA00 =
            PdhCounterInfoA00(
                szMachineNameCtorArg = szMachineName,
                szObjectNameCtorArg = szObjectName,
                szInstanceNameCtorArg = szInstanceName,
                szParentInstanceCtorArg = szParentInstance,
                dwInstanceIndex = dwInstanceIndex,
                szCounterNameCtorArg = szCounterName,
            )
    }
}

public class PdhCounterInfoW internal constructor(
    public var dwLength: UInt,
    public var dwType: UInt,
    public var cVersion: UInt,
    public var cStatus: UInt,
    public var lScale: Int,
    public var lDefaultScale: Int,
    public var dwUserData: Int,
    public var dwQueryUserData: Int,
    szFullPathCtorArg: Pwstr,
    public var anonymous: PdhCounterInfoW0,
    szExplainTextCtorArg: Pwstr,
    public var dataBuffer: UIntArray,
) {
    public var szFullPath: Pwstr = szFullPathCtorArg
        internal set

    public var szExplainText: Pwstr = szExplainTextCtorArg
        internal set

    public constructor() : this(
        dwLength = 0u,
        dwType = 0u,
        cVersion = 0u,
        cStatus = 0u,
        lScale = 0,
        lDefaultScale = 0,
        dwUserData = 0,
        dwQueryUserData = 0,
        szFullPathCtorArg = MutPtr(0L),
        anonymous = PdhCounterInfoW0(),
        szExplainTextCtorArg = MutPtr(0L),
        dataBuffer = UIntArray(1),
    )

    public operator fun component1(): UInt = this.dwLength

    public operator fun component2(): UInt = this.dwType

    public operator fun component3(): UInt = this.cVersion

    public operator fun component4(): UInt = this.cStatus

    public operator fun component5(): Int = this.lScale

    public operator fun component6(): Int = this.lDefaultScale

    public operator fun component7(): Int = this.dwUserData

    public operator fun component8(): Int = this.dwQueryUserData

    public operator fun component9(): Pwstr = this.szFullPath

    public operator fun component10(): PdhCounterInfoW0 = this.anonymous

    public operator fun component11(): Pwstr = this.szExplainText

    public operator fun component12(): UIntArray = this.dataBuffer

    public fun copy(dwLength: UInt = this.dwLength, dwType: UInt = this.dwType, cVersion: UInt = this.cVersion, cStatus: UInt = this.cStatus, lScale: Int = this.lScale, lDefaultScale: Int = this.lDefaultScale, dwUserData: Int = this.dwUserData, dwQueryUserData: Int = this.dwQueryUserData, szFullPath: Pwstr = this.szFullPath, anonymous: PdhCounterInfoW0 = this.anonymous, szExplainText: Pwstr = this.szExplainText, dataBuffer: UIntArray = this.dataBuffer): PdhCounterInfoW = PdhCounterInfoW(dwLength = dwLength, dwType = dwType, cVersion = cVersion, cStatus = cStatus, lScale = lScale, lDefaultScale = lDefaultScale, dwUserData = dwUserData, dwQueryUserData = dwQueryUserData, szFullPathCtorArg = szFullPath, anonymous = anonymous, szExplainTextCtorArg = szExplainText, dataBuffer = dataBuffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PdhCounterInfoW) return false
        if (this.dwLength != other.dwLength) return false
        if (this.dwType != other.dwType) return false
        if (this.cVersion != other.cVersion) return false
        if (this.cStatus != other.cStatus) return false
        if (this.lScale != other.lScale) return false
        if (this.lDefaultScale != other.lDefaultScale) return false
        if (this.dwUserData != other.dwUserData) return false
        if (this.dwQueryUserData != other.dwQueryUserData) return false
        if (this.szFullPath != other.szFullPath) return false
        if (this.anonymous != other.anonymous) return false
        if (this.szExplainText != other.szExplainText) return false
        if (!this.dataBuffer.contentEquals(other.dataBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwLength.hashCode()
        result = 31 * result + this.dwType.hashCode()
        result = 31 * result + this.cVersion.hashCode()
        result = 31 * result + this.cStatus.hashCode()
        result = 31 * result + this.lScale.hashCode()
        result = 31 * result + this.lDefaultScale.hashCode()
        result = 31 * result + this.dwUserData.hashCode()
        result = 31 * result + this.dwQueryUserData.hashCode()
        result = 31 * result + this.szFullPath.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.szExplainText.hashCode()
        result = 31 * result + this.dataBuffer.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwLength: UInt = 0u,
            dwType: UInt = 0u,
            cVersion: UInt = 0u,
            cStatus: UInt = 0u,
            lScale: Int = 0,
            lDefaultScale: Int = 0,
            dwUserData: Int = 0,
            dwQueryUserData: Int = 0,
            szFullPath: Pwstr = MutPtr(0L),
            anonymous: PdhCounterInfoW0 = PdhCounterInfoW0(),
            szExplainText: Pwstr = MutPtr(0L),
            dataBuffer: UIntArray = UIntArray(1),
        ): PdhCounterInfoW =
            PdhCounterInfoW(
                dwLength = dwLength,
                dwType = dwType,
                cVersion = cVersion,
                cStatus = cStatus,
                lScale = lScale,
                lDefaultScale = lDefaultScale,
                dwUserData = dwUserData,
                dwQueryUserData = dwQueryUserData,
                szFullPathCtorArg = szFullPath,
                anonymous = anonymous,
                szExplainTextCtorArg = szExplainText,
                dataBuffer = dataBuffer,
            )
    }
}

public data class PdhCounterInfoW0(
    public var dataItemPath: PdhDataItemPathElementsW = PdhDataItemPathElementsW(),
    public var counterPath: PdhCounterPathElementsW = PdhCounterPathElementsW(),
    public var anonymous: PdhCounterInfoW00 = PdhCounterInfoW00(),
)

public class PdhCounterInfoW00 internal constructor(
    szMachineNameCtorArg: Pwstr,
    szObjectNameCtorArg: Pwstr,
    szInstanceNameCtorArg: Pwstr,
    szParentInstanceCtorArg: Pwstr,
    public var dwInstanceIndex: UInt,
    szCounterNameCtorArg: Pwstr,
) {
    public var szMachineName: Pwstr = szMachineNameCtorArg
        internal set

    public var szObjectName: Pwstr = szObjectNameCtorArg
        internal set

    public var szInstanceName: Pwstr = szInstanceNameCtorArg
        internal set

    public var szParentInstance: Pwstr = szParentInstanceCtorArg
        internal set

    public var szCounterName: Pwstr = szCounterNameCtorArg
        internal set

    public constructor() : this(
        szMachineNameCtorArg = MutPtr(0L),
        szObjectNameCtorArg = MutPtr(0L),
        szInstanceNameCtorArg = MutPtr(0L),
        szParentInstanceCtorArg = MutPtr(0L),
        dwInstanceIndex = 0u,
        szCounterNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.szMachineName

    public operator fun component2(): Pwstr = this.szObjectName

    public operator fun component3(): Pwstr = this.szInstanceName

    public operator fun component4(): Pwstr = this.szParentInstance

    public operator fun component5(): UInt = this.dwInstanceIndex

    public operator fun component6(): Pwstr = this.szCounterName

    public fun copy(szMachineName: Pwstr = this.szMachineName, szObjectName: Pwstr = this.szObjectName, szInstanceName: Pwstr = this.szInstanceName, szParentInstance: Pwstr = this.szParentInstance, dwInstanceIndex: UInt = this.dwInstanceIndex, szCounterName: Pwstr = this.szCounterName): PdhCounterInfoW00 = PdhCounterInfoW00(szMachineNameCtorArg = szMachineName, szObjectNameCtorArg = szObjectName, szInstanceNameCtorArg = szInstanceName, szParentInstanceCtorArg = szParentInstance, dwInstanceIndex = dwInstanceIndex, szCounterNameCtorArg = szCounterName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PdhCounterInfoW00) return false
        if (this.szMachineName != other.szMachineName) return false
        if (this.szObjectName != other.szObjectName) return false
        if (this.szInstanceName != other.szInstanceName) return false
        if (this.szParentInstance != other.szParentInstance) return false
        if (this.dwInstanceIndex != other.dwInstanceIndex) return false
        if (this.szCounterName != other.szCounterName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szMachineName.hashCode()
        result = 31 * result + this.szObjectName.hashCode()
        result = 31 * result + this.szInstanceName.hashCode()
        result = 31 * result + this.szParentInstance.hashCode()
        result = 31 * result + this.dwInstanceIndex.hashCode()
        result = 31 * result + this.szCounterName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            szMachineName: Pwstr = MutPtr(0L),
            szObjectName: Pwstr = MutPtr(0L),
            szInstanceName: Pwstr = MutPtr(0L),
            szParentInstance: Pwstr = MutPtr(0L),
            dwInstanceIndex: UInt = 0u,
            szCounterName: Pwstr = MutPtr(0L),
        ): PdhCounterInfoW00 =
            PdhCounterInfoW00(
                szMachineNameCtorArg = szMachineName,
                szObjectNameCtorArg = szObjectName,
                szInstanceNameCtorArg = szInstanceName,
                szParentInstanceCtorArg = szParentInstance,
                dwInstanceIndex = dwInstanceIndex,
                szCounterNameCtorArg = szCounterName,
            )
    }
}

public class PdhCounterPathElementsA internal constructor(
    szMachineNameCtorArg: Pstr,
    szObjectNameCtorArg: Pstr,
    szInstanceNameCtorArg: Pstr,
    szParentInstanceCtorArg: Pstr,
    public var dwInstanceIndex: UInt,
    szCounterNameCtorArg: Pstr,
) {
    public var szMachineName: Pstr = szMachineNameCtorArg
        internal set

    public var szObjectName: Pstr = szObjectNameCtorArg
        internal set

    public var szInstanceName: Pstr = szInstanceNameCtorArg
        internal set

    public var szParentInstance: Pstr = szParentInstanceCtorArg
        internal set

    public var szCounterName: Pstr = szCounterNameCtorArg
        internal set

    public constructor() : this(
        szMachineNameCtorArg = MutPtr(0L),
        szObjectNameCtorArg = MutPtr(0L),
        szInstanceNameCtorArg = MutPtr(0L),
        szParentInstanceCtorArg = MutPtr(0L),
        dwInstanceIndex = 0u,
        szCounterNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pstr = this.szMachineName

    public operator fun component2(): Pstr = this.szObjectName

    public operator fun component3(): Pstr = this.szInstanceName

    public operator fun component4(): Pstr = this.szParentInstance

    public operator fun component5(): UInt = this.dwInstanceIndex

    public operator fun component6(): Pstr = this.szCounterName

    public fun copy(szMachineName: Pstr = this.szMachineName, szObjectName: Pstr = this.szObjectName, szInstanceName: Pstr = this.szInstanceName, szParentInstance: Pstr = this.szParentInstance, dwInstanceIndex: UInt = this.dwInstanceIndex, szCounterName: Pstr = this.szCounterName): PdhCounterPathElementsA = PdhCounterPathElementsA(szMachineNameCtorArg = szMachineName, szObjectNameCtorArg = szObjectName, szInstanceNameCtorArg = szInstanceName, szParentInstanceCtorArg = szParentInstance, dwInstanceIndex = dwInstanceIndex, szCounterNameCtorArg = szCounterName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PdhCounterPathElementsA) return false
        if (this.szMachineName != other.szMachineName) return false
        if (this.szObjectName != other.szObjectName) return false
        if (this.szInstanceName != other.szInstanceName) return false
        if (this.szParentInstance != other.szParentInstance) return false
        if (this.dwInstanceIndex != other.dwInstanceIndex) return false
        if (this.szCounterName != other.szCounterName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szMachineName.hashCode()
        result = 31 * result + this.szObjectName.hashCode()
        result = 31 * result + this.szInstanceName.hashCode()
        result = 31 * result + this.szParentInstance.hashCode()
        result = 31 * result + this.dwInstanceIndex.hashCode()
        result = 31 * result + this.szCounterName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            szMachineName: Pstr = MutPtr(0L),
            szObjectName: Pstr = MutPtr(0L),
            szInstanceName: Pstr = MutPtr(0L),
            szParentInstance: Pstr = MutPtr(0L),
            dwInstanceIndex: UInt = 0u,
            szCounterName: Pstr = MutPtr(0L),
        ): PdhCounterPathElementsA =
            PdhCounterPathElementsA(
                szMachineNameCtorArg = szMachineName,
                szObjectNameCtorArg = szObjectName,
                szInstanceNameCtorArg = szInstanceName,
                szParentInstanceCtorArg = szParentInstance,
                dwInstanceIndex = dwInstanceIndex,
                szCounterNameCtorArg = szCounterName,
            )
    }
}

public class PdhCounterPathElementsW internal constructor(
    szMachineNameCtorArg: Pwstr,
    szObjectNameCtorArg: Pwstr,
    szInstanceNameCtorArg: Pwstr,
    szParentInstanceCtorArg: Pwstr,
    public var dwInstanceIndex: UInt,
    szCounterNameCtorArg: Pwstr,
) {
    public var szMachineName: Pwstr = szMachineNameCtorArg
        internal set

    public var szObjectName: Pwstr = szObjectNameCtorArg
        internal set

    public var szInstanceName: Pwstr = szInstanceNameCtorArg
        internal set

    public var szParentInstance: Pwstr = szParentInstanceCtorArg
        internal set

    public var szCounterName: Pwstr = szCounterNameCtorArg
        internal set

    public constructor() : this(
        szMachineNameCtorArg = MutPtr(0L),
        szObjectNameCtorArg = MutPtr(0L),
        szInstanceNameCtorArg = MutPtr(0L),
        szParentInstanceCtorArg = MutPtr(0L),
        dwInstanceIndex = 0u,
        szCounterNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.szMachineName

    public operator fun component2(): Pwstr = this.szObjectName

    public operator fun component3(): Pwstr = this.szInstanceName

    public operator fun component4(): Pwstr = this.szParentInstance

    public operator fun component5(): UInt = this.dwInstanceIndex

    public operator fun component6(): Pwstr = this.szCounterName

    public fun copy(szMachineName: Pwstr = this.szMachineName, szObjectName: Pwstr = this.szObjectName, szInstanceName: Pwstr = this.szInstanceName, szParentInstance: Pwstr = this.szParentInstance, dwInstanceIndex: UInt = this.dwInstanceIndex, szCounterName: Pwstr = this.szCounterName): PdhCounterPathElementsW = PdhCounterPathElementsW(szMachineNameCtorArg = szMachineName, szObjectNameCtorArg = szObjectName, szInstanceNameCtorArg = szInstanceName, szParentInstanceCtorArg = szParentInstance, dwInstanceIndex = dwInstanceIndex, szCounterNameCtorArg = szCounterName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PdhCounterPathElementsW) return false
        if (this.szMachineName != other.szMachineName) return false
        if (this.szObjectName != other.szObjectName) return false
        if (this.szInstanceName != other.szInstanceName) return false
        if (this.szParentInstance != other.szParentInstance) return false
        if (this.dwInstanceIndex != other.dwInstanceIndex) return false
        if (this.szCounterName != other.szCounterName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szMachineName.hashCode()
        result = 31 * result + this.szObjectName.hashCode()
        result = 31 * result + this.szInstanceName.hashCode()
        result = 31 * result + this.szParentInstance.hashCode()
        result = 31 * result + this.dwInstanceIndex.hashCode()
        result = 31 * result + this.szCounterName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            szMachineName: Pwstr = MutPtr(0L),
            szObjectName: Pwstr = MutPtr(0L),
            szInstanceName: Pwstr = MutPtr(0L),
            szParentInstance: Pwstr = MutPtr(0L),
            dwInstanceIndex: UInt = 0u,
            szCounterName: Pwstr = MutPtr(0L),
        ): PdhCounterPathElementsW =
            PdhCounterPathElementsW(
                szMachineNameCtorArg = szMachineName,
                szObjectNameCtorArg = szObjectName,
                szInstanceNameCtorArg = szInstanceName,
                szParentInstanceCtorArg = szParentInstance,
                dwInstanceIndex = dwInstanceIndex,
                szCounterNameCtorArg = szCounterName,
            )
    }
}

public class PdhDataItemPathElementsA internal constructor(
    szMachineNameCtorArg: Pstr,
    public var objectGUID: Guid,
    public var dwItemId: UInt,
    szInstanceNameCtorArg: Pstr,
) {
    public var szMachineName: Pstr = szMachineNameCtorArg
        internal set

    public var szInstanceName: Pstr = szInstanceNameCtorArg
        internal set

    public constructor() : this(
        szMachineNameCtorArg = MutPtr(0L),
        objectGUID = Guid(),
        dwItemId = 0u,
        szInstanceNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pstr = this.szMachineName

    public operator fun component2(): Guid = this.objectGUID

    public operator fun component3(): UInt = this.dwItemId

    public operator fun component4(): Pstr = this.szInstanceName

    public fun copy(szMachineName: Pstr = this.szMachineName, objectGUID: Guid = this.objectGUID, dwItemId: UInt = this.dwItemId, szInstanceName: Pstr = this.szInstanceName): PdhDataItemPathElementsA = PdhDataItemPathElementsA(szMachineNameCtorArg = szMachineName, objectGUID = objectGUID, dwItemId = dwItemId, szInstanceNameCtorArg = szInstanceName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PdhDataItemPathElementsA) return false
        if (this.szMachineName != other.szMachineName) return false
        if (this.objectGUID != other.objectGUID) return false
        if (this.dwItemId != other.dwItemId) return false
        if (this.szInstanceName != other.szInstanceName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szMachineName.hashCode()
        result = 31 * result + this.objectGUID.hashCode()
        result = 31 * result + this.dwItemId.hashCode()
        result = 31 * result + this.szInstanceName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            szMachineName: Pstr = MutPtr(0L),
            objectGUID: Guid = Guid(),
            dwItemId: UInt = 0u,
            szInstanceName: Pstr = MutPtr(0L),
        ): PdhDataItemPathElementsA =
            PdhDataItemPathElementsA(
                szMachineNameCtorArg = szMachineName,
                objectGUID = objectGUID,
                dwItemId = dwItemId,
                szInstanceNameCtorArg = szInstanceName,
            )
    }
}

public class PdhDataItemPathElementsW internal constructor(
    szMachineNameCtorArg: Pwstr,
    public var objectGUID: Guid,
    public var dwItemId: UInt,
    szInstanceNameCtorArg: Pwstr,
) {
    public var szMachineName: Pwstr = szMachineNameCtorArg
        internal set

    public var szInstanceName: Pwstr = szInstanceNameCtorArg
        internal set

    public constructor() : this(
        szMachineNameCtorArg = MutPtr(0L),
        objectGUID = Guid(),
        dwItemId = 0u,
        szInstanceNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.szMachineName

    public operator fun component2(): Guid = this.objectGUID

    public operator fun component3(): UInt = this.dwItemId

    public operator fun component4(): Pwstr = this.szInstanceName

    public fun copy(szMachineName: Pwstr = this.szMachineName, objectGUID: Guid = this.objectGUID, dwItemId: UInt = this.dwItemId, szInstanceName: Pwstr = this.szInstanceName): PdhDataItemPathElementsW = PdhDataItemPathElementsW(szMachineNameCtorArg = szMachineName, objectGUID = objectGUID, dwItemId = dwItemId, szInstanceNameCtorArg = szInstanceName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PdhDataItemPathElementsW) return false
        if (this.szMachineName != other.szMachineName) return false
        if (this.objectGUID != other.objectGUID) return false
        if (this.dwItemId != other.dwItemId) return false
        if (this.szInstanceName != other.szInstanceName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szMachineName.hashCode()
        result = 31 * result + this.objectGUID.hashCode()
        result = 31 * result + this.dwItemId.hashCode()
        result = 31 * result + this.szInstanceName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            szMachineName: Pwstr = MutPtr(0L),
            objectGUID: Guid = Guid(),
            dwItemId: UInt = 0u,
            szInstanceName: Pwstr = MutPtr(0L),
        ): PdhDataItemPathElementsW =
            PdhDataItemPathElementsW(
                szMachineNameCtorArg = szMachineName,
                objectGUID = objectGUID,
                dwItemId = dwItemId,
                szInstanceNameCtorArg = szInstanceName,
            )
    }
}

public data class PdhFmtCountervalue(
    public var cStatus: UInt = 0u,
    public var anonymous: PdhFmtCountervalue0 = PdhFmtCountervalue0(),
)

public class PdhFmtCountervalue0 internal constructor(
    public var longValue: Int,
    public var doubleValue: Double,
    public var largeValue: Long,
    ansiStringValueCtorArg: Pcstr,
    wideStringValueCtorArg: Pcwstr,
) {
    public var ansiStringValue: Pcstr = ansiStringValueCtorArg
        internal set

    public var wideStringValue: Pcwstr = wideStringValueCtorArg
        internal set

    public constructor() : this(
        longValue = 0,
        doubleValue = 0.0,
        largeValue = 0L,
        ansiStringValueCtorArg = ConstPtr(0L),
        wideStringValueCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Int = this.longValue

    public operator fun component2(): Double = this.doubleValue

    public operator fun component3(): Long = this.largeValue

    public operator fun component4(): Pcstr = this.ansiStringValue

    public operator fun component5(): Pcwstr = this.wideStringValue

    public fun copy(longValue: Int = this.longValue, doubleValue: Double = this.doubleValue, largeValue: Long = this.largeValue, ansiStringValue: Pcstr = this.ansiStringValue, wideStringValue: Pcwstr = this.wideStringValue): PdhFmtCountervalue0 = PdhFmtCountervalue0(longValue = longValue, doubleValue = doubleValue, largeValue = largeValue, ansiStringValueCtorArg = ansiStringValue, wideStringValueCtorArg = wideStringValue)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PdhFmtCountervalue0) return false
        if (this.longValue != other.longValue) return false
        if (this.doubleValue != other.doubleValue) return false
        if (this.largeValue != other.largeValue) return false
        if (this.ansiStringValue != other.ansiStringValue) return false
        if (this.wideStringValue != other.wideStringValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.longValue.hashCode()
        result = 31 * result + this.doubleValue.hashCode()
        result = 31 * result + this.largeValue.hashCode()
        result = 31 * result + this.ansiStringValue.hashCode()
        result = 31 * result + this.wideStringValue.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            longValue: Int = 0,
            doubleValue: Double = 0.0,
            largeValue: Long = 0L,
            ansiStringValue: Pcstr = ConstPtr(0L),
            wideStringValue: Pcwstr = ConstPtr(0L),
        ): PdhFmtCountervalue0 =
            PdhFmtCountervalue0(
                longValue = longValue,
                doubleValue = doubleValue,
                largeValue = largeValue,
                ansiStringValueCtorArg = ansiStringValue,
                wideStringValueCtorArg = wideStringValue,
            )
    }
}

public class PdhFmtCountervalueItemA internal constructor(
    szNameCtorArg: Pstr,
    public var fmtValue: PdhFmtCountervalue,
) {
    public var szName: Pstr = szNameCtorArg
        internal set

    public constructor() : this(
        szNameCtorArg = MutPtr(0L),
        fmtValue = PdhFmtCountervalue(),
    )

    public operator fun component1(): Pstr = this.szName

    public operator fun component2(): PdhFmtCountervalue = this.fmtValue

    public fun copy(szName: Pstr = this.szName, fmtValue: PdhFmtCountervalue = this.fmtValue): PdhFmtCountervalueItemA = PdhFmtCountervalueItemA(szNameCtorArg = szName, fmtValue = fmtValue)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PdhFmtCountervalueItemA) return false
        if (this.szName != other.szName) return false
        if (this.fmtValue != other.fmtValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szName.hashCode()
        result = 31 * result + this.fmtValue.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            szName: Pstr = MutPtr(0L),
            fmtValue: PdhFmtCountervalue = PdhFmtCountervalue(),
        ): PdhFmtCountervalueItemA =
            PdhFmtCountervalueItemA(
                szNameCtorArg = szName,
                fmtValue = fmtValue,
            )
    }
}

public class PdhFmtCountervalueItemW internal constructor(
    szNameCtorArg: Pwstr,
    public var fmtValue: PdhFmtCountervalue,
) {
    public var szName: Pwstr = szNameCtorArg
        internal set

    public constructor() : this(
        szNameCtorArg = MutPtr(0L),
        fmtValue = PdhFmtCountervalue(),
    )

    public operator fun component1(): Pwstr = this.szName

    public operator fun component2(): PdhFmtCountervalue = this.fmtValue

    public fun copy(szName: Pwstr = this.szName, fmtValue: PdhFmtCountervalue = this.fmtValue): PdhFmtCountervalueItemW = PdhFmtCountervalueItemW(szNameCtorArg = szName, fmtValue = fmtValue)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PdhFmtCountervalueItemW) return false
        if (this.szName != other.szName) return false
        if (this.fmtValue != other.fmtValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szName.hashCode()
        result = 31 * result + this.fmtValue.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            szName: Pwstr = MutPtr(0L),
            fmtValue: PdhFmtCountervalue = PdhFmtCountervalue(),
        ): PdhFmtCountervalueItemW =
            PdhFmtCountervalueItemW(
                szNameCtorArg = szName,
                fmtValue = fmtValue,
            )
    }
}

public class PdhLogServiceQueryInfoA internal constructor(
    public var dwSize: UInt,
    public var dwFlags: UInt,
    public var dwLogQuota: UInt,
    szLogFileCaptionCtorArg: Pstr,
    szDefaultDirCtorArg: Pstr,
    szBaseFileNameCtorArg: Pstr,
    public var dwFileType: UInt,
    public var dwReserved: UInt,
    public var anonymous: PdhLogServiceQueryInfoA0,
) {
    public var szLogFileCaption: Pstr = szLogFileCaptionCtorArg
        internal set

    public var szDefaultDir: Pstr = szDefaultDirCtorArg
        internal set

    public var szBaseFileName: Pstr = szBaseFileNameCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        dwFlags = 0u,
        dwLogQuota = 0u,
        szLogFileCaptionCtorArg = MutPtr(0L),
        szDefaultDirCtorArg = MutPtr(0L),
        szBaseFileNameCtorArg = MutPtr(0L),
        dwFileType = 0u,
        dwReserved = 0u,
        anonymous = PdhLogServiceQueryInfoA0(),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): UInt = this.dwLogQuota

    public operator fun component4(): Pstr = this.szLogFileCaption

    public operator fun component5(): Pstr = this.szDefaultDir

    public operator fun component6(): Pstr = this.szBaseFileName

    public operator fun component7(): UInt = this.dwFileType

    public operator fun component8(): UInt = this.dwReserved

    public operator fun component9(): PdhLogServiceQueryInfoA0 = this.anonymous

    public fun copy(dwSize: UInt = this.dwSize, dwFlags: UInt = this.dwFlags, dwLogQuota: UInt = this.dwLogQuota, szLogFileCaption: Pstr = this.szLogFileCaption, szDefaultDir: Pstr = this.szDefaultDir, szBaseFileName: Pstr = this.szBaseFileName, dwFileType: UInt = this.dwFileType, dwReserved: UInt = this.dwReserved, anonymous: PdhLogServiceQueryInfoA0 = this.anonymous): PdhLogServiceQueryInfoA = PdhLogServiceQueryInfoA(dwSize = dwSize, dwFlags = dwFlags, dwLogQuota = dwLogQuota, szLogFileCaptionCtorArg = szLogFileCaption, szDefaultDirCtorArg = szDefaultDir, szBaseFileNameCtorArg = szBaseFileName, dwFileType = dwFileType, dwReserved = dwReserved, anonymous = anonymous)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PdhLogServiceQueryInfoA) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwLogQuota != other.dwLogQuota) return false
        if (this.szLogFileCaption != other.szLogFileCaption) return false
        if (this.szDefaultDir != other.szDefaultDir) return false
        if (this.szBaseFileName != other.szBaseFileName) return false
        if (this.dwFileType != other.dwFileType) return false
        if (this.dwReserved != other.dwReserved) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwLogQuota.hashCode()
        result = 31 * result + this.szLogFileCaption.hashCode()
        result = 31 * result + this.szDefaultDir.hashCode()
        result = 31 * result + this.szBaseFileName.hashCode()
        result = 31 * result + this.dwFileType.hashCode()
        result = 31 * result + this.dwReserved.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            dwFlags: UInt = 0u,
            dwLogQuota: UInt = 0u,
            szLogFileCaption: Pstr = MutPtr(0L),
            szDefaultDir: Pstr = MutPtr(0L),
            szBaseFileName: Pstr = MutPtr(0L),
            dwFileType: UInt = 0u,
            dwReserved: UInt = 0u,
            anonymous: PdhLogServiceQueryInfoA0 = PdhLogServiceQueryInfoA0(),
        ): PdhLogServiceQueryInfoA =
            PdhLogServiceQueryInfoA(
                dwSize = dwSize,
                dwFlags = dwFlags,
                dwLogQuota = dwLogQuota,
                szLogFileCaptionCtorArg = szLogFileCaption,
                szDefaultDirCtorArg = szDefaultDir,
                szBaseFileNameCtorArg = szBaseFileName,
                dwFileType = dwFileType,
                dwReserved = dwReserved,
                anonymous = anonymous,
            )
    }
}

public data class PdhLogServiceQueryInfoA0(
    public var anonymous1: PdhLogServiceQueryInfoA00 = PdhLogServiceQueryInfoA00(),
    public var anonymous2: PdhLogServiceQueryInfoA01 = PdhLogServiceQueryInfoA01(),
)

public class PdhLogServiceQueryInfoA00 internal constructor(
    public var pdlAutoNameInterval: UInt,
    public var pdlAutoNameUnits: UInt,
    pdlCommandFilenameCtorArg: Pstr,
    pdlCounterListCtorArg: Pstr,
    public var pdlAutoNameFormat: UInt,
    public var pdlSampleInterval: UInt,
    public var pdlLogStartTime: Filetime,
    public var pdlLogEndTime: Filetime,
) {
    public var pdlCommandFilename: Pstr = pdlCommandFilenameCtorArg
        internal set

    public var pdlCounterList: Pstr = pdlCounterListCtorArg
        internal set

    public constructor() : this(
        pdlAutoNameInterval = 0u,
        pdlAutoNameUnits = 0u,
        pdlCommandFilenameCtorArg = MutPtr(0L),
        pdlCounterListCtorArg = MutPtr(0L),
        pdlAutoNameFormat = 0u,
        pdlSampleInterval = 0u,
        pdlLogStartTime = Filetime(),
        pdlLogEndTime = Filetime(),
    )

    public operator fun component1(): UInt = this.pdlAutoNameInterval

    public operator fun component2(): UInt = this.pdlAutoNameUnits

    public operator fun component3(): Pstr = this.pdlCommandFilename

    public operator fun component4(): Pstr = this.pdlCounterList

    public operator fun component5(): UInt = this.pdlAutoNameFormat

    public operator fun component6(): UInt = this.pdlSampleInterval

    public operator fun component7(): Filetime = this.pdlLogStartTime

    public operator fun component8(): Filetime = this.pdlLogEndTime

    public fun copy(pdlAutoNameInterval: UInt = this.pdlAutoNameInterval, pdlAutoNameUnits: UInt = this.pdlAutoNameUnits, pdlCommandFilename: Pstr = this.pdlCommandFilename, pdlCounterList: Pstr = this.pdlCounterList, pdlAutoNameFormat: UInt = this.pdlAutoNameFormat, pdlSampleInterval: UInt = this.pdlSampleInterval, pdlLogStartTime: Filetime = this.pdlLogStartTime, pdlLogEndTime: Filetime = this.pdlLogEndTime): PdhLogServiceQueryInfoA00 = PdhLogServiceQueryInfoA00(pdlAutoNameInterval = pdlAutoNameInterval, pdlAutoNameUnits = pdlAutoNameUnits, pdlCommandFilenameCtorArg = pdlCommandFilename, pdlCounterListCtorArg = pdlCounterList, pdlAutoNameFormat = pdlAutoNameFormat, pdlSampleInterval = pdlSampleInterval, pdlLogStartTime = pdlLogStartTime, pdlLogEndTime = pdlLogEndTime)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PdhLogServiceQueryInfoA00) return false
        if (this.pdlAutoNameInterval != other.pdlAutoNameInterval) return false
        if (this.pdlAutoNameUnits != other.pdlAutoNameUnits) return false
        if (this.pdlCommandFilename != other.pdlCommandFilename) return false
        if (this.pdlCounterList != other.pdlCounterList) return false
        if (this.pdlAutoNameFormat != other.pdlAutoNameFormat) return false
        if (this.pdlSampleInterval != other.pdlSampleInterval) return false
        if (this.pdlLogStartTime != other.pdlLogStartTime) return false
        if (this.pdlLogEndTime != other.pdlLogEndTime) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pdlAutoNameInterval.hashCode()
        result = 31 * result + this.pdlAutoNameUnits.hashCode()
        result = 31 * result + this.pdlCommandFilename.hashCode()
        result = 31 * result + this.pdlCounterList.hashCode()
        result = 31 * result + this.pdlAutoNameFormat.hashCode()
        result = 31 * result + this.pdlSampleInterval.hashCode()
        result = 31 * result + this.pdlLogStartTime.hashCode()
        result = 31 * result + this.pdlLogEndTime.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pdlAutoNameInterval: UInt = 0u,
            pdlAutoNameUnits: UInt = 0u,
            pdlCommandFilename: Pstr = MutPtr(0L),
            pdlCounterList: Pstr = MutPtr(0L),
            pdlAutoNameFormat: UInt = 0u,
            pdlSampleInterval: UInt = 0u,
            pdlLogStartTime: Filetime = Filetime(),
            pdlLogEndTime: Filetime = Filetime(),
        ): PdhLogServiceQueryInfoA00 =
            PdhLogServiceQueryInfoA00(
                pdlAutoNameInterval = pdlAutoNameInterval,
                pdlAutoNameUnits = pdlAutoNameUnits,
                pdlCommandFilenameCtorArg = pdlCommandFilename,
                pdlCounterListCtorArg = pdlCounterList,
                pdlAutoNameFormat = pdlAutoNameFormat,
                pdlSampleInterval = pdlSampleInterval,
                pdlLogStartTime = pdlLogStartTime,
                pdlLogEndTime = pdlLogEndTime,
            )
    }
}

public class PdhLogServiceQueryInfoA01 internal constructor(
    public var tlNumberOfBuffers: UInt,
    public var tlMinimumBuffers: UInt,
    public var tlMaximumBuffers: UInt,
    public var tlFreeBuffers: UInt,
    public var tlBufferSize: UInt,
    public var tlEventsLost: UInt,
    public var tlLoggerThreadId: UInt,
    public var tlBuffersWritten: UInt,
    public var tlLogHandle: UInt,
    tlLogFileNameCtorArg: Pstr,
) {
    public var tlLogFileName: Pstr = tlLogFileNameCtorArg
        internal set

    public constructor() : this(
        tlNumberOfBuffers = 0u,
        tlMinimumBuffers = 0u,
        tlMaximumBuffers = 0u,
        tlFreeBuffers = 0u,
        tlBufferSize = 0u,
        tlEventsLost = 0u,
        tlLoggerThreadId = 0u,
        tlBuffersWritten = 0u,
        tlLogHandle = 0u,
        tlLogFileNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.tlNumberOfBuffers

    public operator fun component2(): UInt = this.tlMinimumBuffers

    public operator fun component3(): UInt = this.tlMaximumBuffers

    public operator fun component4(): UInt = this.tlFreeBuffers

    public operator fun component5(): UInt = this.tlBufferSize

    public operator fun component6(): UInt = this.tlEventsLost

    public operator fun component7(): UInt = this.tlLoggerThreadId

    public operator fun component8(): UInt = this.tlBuffersWritten

    public operator fun component9(): UInt = this.tlLogHandle

    public operator fun component10(): Pstr = this.tlLogFileName

    public fun copy(tlNumberOfBuffers: UInt = this.tlNumberOfBuffers, tlMinimumBuffers: UInt = this.tlMinimumBuffers, tlMaximumBuffers: UInt = this.tlMaximumBuffers, tlFreeBuffers: UInt = this.tlFreeBuffers, tlBufferSize: UInt = this.tlBufferSize, tlEventsLost: UInt = this.tlEventsLost, tlLoggerThreadId: UInt = this.tlLoggerThreadId, tlBuffersWritten: UInt = this.tlBuffersWritten, tlLogHandle: UInt = this.tlLogHandle, tlLogFileName: Pstr = this.tlLogFileName): PdhLogServiceQueryInfoA01 = PdhLogServiceQueryInfoA01(tlNumberOfBuffers = tlNumberOfBuffers, tlMinimumBuffers = tlMinimumBuffers, tlMaximumBuffers = tlMaximumBuffers, tlFreeBuffers = tlFreeBuffers, tlBufferSize = tlBufferSize, tlEventsLost = tlEventsLost, tlLoggerThreadId = tlLoggerThreadId, tlBuffersWritten = tlBuffersWritten, tlLogHandle = tlLogHandle, tlLogFileNameCtorArg = tlLogFileName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PdhLogServiceQueryInfoA01) return false
        if (this.tlNumberOfBuffers != other.tlNumberOfBuffers) return false
        if (this.tlMinimumBuffers != other.tlMinimumBuffers) return false
        if (this.tlMaximumBuffers != other.tlMaximumBuffers) return false
        if (this.tlFreeBuffers != other.tlFreeBuffers) return false
        if (this.tlBufferSize != other.tlBufferSize) return false
        if (this.tlEventsLost != other.tlEventsLost) return false
        if (this.tlLoggerThreadId != other.tlLoggerThreadId) return false
        if (this.tlBuffersWritten != other.tlBuffersWritten) return false
        if (this.tlLogHandle != other.tlLogHandle) return false
        if (this.tlLogFileName != other.tlLogFileName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.tlNumberOfBuffers.hashCode()
        result = 31 * result + this.tlMinimumBuffers.hashCode()
        result = 31 * result + this.tlMaximumBuffers.hashCode()
        result = 31 * result + this.tlFreeBuffers.hashCode()
        result = 31 * result + this.tlBufferSize.hashCode()
        result = 31 * result + this.tlEventsLost.hashCode()
        result = 31 * result + this.tlLoggerThreadId.hashCode()
        result = 31 * result + this.tlBuffersWritten.hashCode()
        result = 31 * result + this.tlLogHandle.hashCode()
        result = 31 * result + this.tlLogFileName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            tlNumberOfBuffers: UInt = 0u,
            tlMinimumBuffers: UInt = 0u,
            tlMaximumBuffers: UInt = 0u,
            tlFreeBuffers: UInt = 0u,
            tlBufferSize: UInt = 0u,
            tlEventsLost: UInt = 0u,
            tlLoggerThreadId: UInt = 0u,
            tlBuffersWritten: UInt = 0u,
            tlLogHandle: UInt = 0u,
            tlLogFileName: Pstr = MutPtr(0L),
        ): PdhLogServiceQueryInfoA01 =
            PdhLogServiceQueryInfoA01(
                tlNumberOfBuffers = tlNumberOfBuffers,
                tlMinimumBuffers = tlMinimumBuffers,
                tlMaximumBuffers = tlMaximumBuffers,
                tlFreeBuffers = tlFreeBuffers,
                tlBufferSize = tlBufferSize,
                tlEventsLost = tlEventsLost,
                tlLoggerThreadId = tlLoggerThreadId,
                tlBuffersWritten = tlBuffersWritten,
                tlLogHandle = tlLogHandle,
                tlLogFileNameCtorArg = tlLogFileName,
            )
    }
}

public class PdhLogServiceQueryInfoW internal constructor(
    public var dwSize: UInt,
    public var dwFlags: UInt,
    public var dwLogQuota: UInt,
    szLogFileCaptionCtorArg: Pwstr,
    szDefaultDirCtorArg: Pwstr,
    szBaseFileNameCtorArg: Pwstr,
    public var dwFileType: UInt,
    public var dwReserved: UInt,
    public var anonymous: PdhLogServiceQueryInfoW0,
) {
    public var szLogFileCaption: Pwstr = szLogFileCaptionCtorArg
        internal set

    public var szDefaultDir: Pwstr = szDefaultDirCtorArg
        internal set

    public var szBaseFileName: Pwstr = szBaseFileNameCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        dwFlags = 0u,
        dwLogQuota = 0u,
        szLogFileCaptionCtorArg = MutPtr(0L),
        szDefaultDirCtorArg = MutPtr(0L),
        szBaseFileNameCtorArg = MutPtr(0L),
        dwFileType = 0u,
        dwReserved = 0u,
        anonymous = PdhLogServiceQueryInfoW0(),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): UInt = this.dwLogQuota

    public operator fun component4(): Pwstr = this.szLogFileCaption

    public operator fun component5(): Pwstr = this.szDefaultDir

    public operator fun component6(): Pwstr = this.szBaseFileName

    public operator fun component7(): UInt = this.dwFileType

    public operator fun component8(): UInt = this.dwReserved

    public operator fun component9(): PdhLogServiceQueryInfoW0 = this.anonymous

    public fun copy(dwSize: UInt = this.dwSize, dwFlags: UInt = this.dwFlags, dwLogQuota: UInt = this.dwLogQuota, szLogFileCaption: Pwstr = this.szLogFileCaption, szDefaultDir: Pwstr = this.szDefaultDir, szBaseFileName: Pwstr = this.szBaseFileName, dwFileType: UInt = this.dwFileType, dwReserved: UInt = this.dwReserved, anonymous: PdhLogServiceQueryInfoW0 = this.anonymous): PdhLogServiceQueryInfoW = PdhLogServiceQueryInfoW(dwSize = dwSize, dwFlags = dwFlags, dwLogQuota = dwLogQuota, szLogFileCaptionCtorArg = szLogFileCaption, szDefaultDirCtorArg = szDefaultDir, szBaseFileNameCtorArg = szBaseFileName, dwFileType = dwFileType, dwReserved = dwReserved, anonymous = anonymous)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PdhLogServiceQueryInfoW) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwLogQuota != other.dwLogQuota) return false
        if (this.szLogFileCaption != other.szLogFileCaption) return false
        if (this.szDefaultDir != other.szDefaultDir) return false
        if (this.szBaseFileName != other.szBaseFileName) return false
        if (this.dwFileType != other.dwFileType) return false
        if (this.dwReserved != other.dwReserved) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwLogQuota.hashCode()
        result = 31 * result + this.szLogFileCaption.hashCode()
        result = 31 * result + this.szDefaultDir.hashCode()
        result = 31 * result + this.szBaseFileName.hashCode()
        result = 31 * result + this.dwFileType.hashCode()
        result = 31 * result + this.dwReserved.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            dwFlags: UInt = 0u,
            dwLogQuota: UInt = 0u,
            szLogFileCaption: Pwstr = MutPtr(0L),
            szDefaultDir: Pwstr = MutPtr(0L),
            szBaseFileName: Pwstr = MutPtr(0L),
            dwFileType: UInt = 0u,
            dwReserved: UInt = 0u,
            anonymous: PdhLogServiceQueryInfoW0 = PdhLogServiceQueryInfoW0(),
        ): PdhLogServiceQueryInfoW =
            PdhLogServiceQueryInfoW(
                dwSize = dwSize,
                dwFlags = dwFlags,
                dwLogQuota = dwLogQuota,
                szLogFileCaptionCtorArg = szLogFileCaption,
                szDefaultDirCtorArg = szDefaultDir,
                szBaseFileNameCtorArg = szBaseFileName,
                dwFileType = dwFileType,
                dwReserved = dwReserved,
                anonymous = anonymous,
            )
    }
}

public data class PdhLogServiceQueryInfoW0(
    public var anonymous1: PdhLogServiceQueryInfoW00 = PdhLogServiceQueryInfoW00(),
    public var anonymous2: PdhLogServiceQueryInfoW01 = PdhLogServiceQueryInfoW01(),
)

public class PdhLogServiceQueryInfoW00 internal constructor(
    public var pdlAutoNameInterval: UInt,
    public var pdlAutoNameUnits: UInt,
    pdlCommandFilenameCtorArg: Pwstr,
    pdlCounterListCtorArg: Pwstr,
    public var pdlAutoNameFormat: UInt,
    public var pdlSampleInterval: UInt,
    public var pdlLogStartTime: Filetime,
    public var pdlLogEndTime: Filetime,
) {
    public var pdlCommandFilename: Pwstr = pdlCommandFilenameCtorArg
        internal set

    public var pdlCounterList: Pwstr = pdlCounterListCtorArg
        internal set

    public constructor() : this(
        pdlAutoNameInterval = 0u,
        pdlAutoNameUnits = 0u,
        pdlCommandFilenameCtorArg = MutPtr(0L),
        pdlCounterListCtorArg = MutPtr(0L),
        pdlAutoNameFormat = 0u,
        pdlSampleInterval = 0u,
        pdlLogStartTime = Filetime(),
        pdlLogEndTime = Filetime(),
    )

    public operator fun component1(): UInt = this.pdlAutoNameInterval

    public operator fun component2(): UInt = this.pdlAutoNameUnits

    public operator fun component3(): Pwstr = this.pdlCommandFilename

    public operator fun component4(): Pwstr = this.pdlCounterList

    public operator fun component5(): UInt = this.pdlAutoNameFormat

    public operator fun component6(): UInt = this.pdlSampleInterval

    public operator fun component7(): Filetime = this.pdlLogStartTime

    public operator fun component8(): Filetime = this.pdlLogEndTime

    public fun copy(pdlAutoNameInterval: UInt = this.pdlAutoNameInterval, pdlAutoNameUnits: UInt = this.pdlAutoNameUnits, pdlCommandFilename: Pwstr = this.pdlCommandFilename, pdlCounterList: Pwstr = this.pdlCounterList, pdlAutoNameFormat: UInt = this.pdlAutoNameFormat, pdlSampleInterval: UInt = this.pdlSampleInterval, pdlLogStartTime: Filetime = this.pdlLogStartTime, pdlLogEndTime: Filetime = this.pdlLogEndTime): PdhLogServiceQueryInfoW00 = PdhLogServiceQueryInfoW00(pdlAutoNameInterval = pdlAutoNameInterval, pdlAutoNameUnits = pdlAutoNameUnits, pdlCommandFilenameCtorArg = pdlCommandFilename, pdlCounterListCtorArg = pdlCounterList, pdlAutoNameFormat = pdlAutoNameFormat, pdlSampleInterval = pdlSampleInterval, pdlLogStartTime = pdlLogStartTime, pdlLogEndTime = pdlLogEndTime)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PdhLogServiceQueryInfoW00) return false
        if (this.pdlAutoNameInterval != other.pdlAutoNameInterval) return false
        if (this.pdlAutoNameUnits != other.pdlAutoNameUnits) return false
        if (this.pdlCommandFilename != other.pdlCommandFilename) return false
        if (this.pdlCounterList != other.pdlCounterList) return false
        if (this.pdlAutoNameFormat != other.pdlAutoNameFormat) return false
        if (this.pdlSampleInterval != other.pdlSampleInterval) return false
        if (this.pdlLogStartTime != other.pdlLogStartTime) return false
        if (this.pdlLogEndTime != other.pdlLogEndTime) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pdlAutoNameInterval.hashCode()
        result = 31 * result + this.pdlAutoNameUnits.hashCode()
        result = 31 * result + this.pdlCommandFilename.hashCode()
        result = 31 * result + this.pdlCounterList.hashCode()
        result = 31 * result + this.pdlAutoNameFormat.hashCode()
        result = 31 * result + this.pdlSampleInterval.hashCode()
        result = 31 * result + this.pdlLogStartTime.hashCode()
        result = 31 * result + this.pdlLogEndTime.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pdlAutoNameInterval: UInt = 0u,
            pdlAutoNameUnits: UInt = 0u,
            pdlCommandFilename: Pwstr = MutPtr(0L),
            pdlCounterList: Pwstr = MutPtr(0L),
            pdlAutoNameFormat: UInt = 0u,
            pdlSampleInterval: UInt = 0u,
            pdlLogStartTime: Filetime = Filetime(),
            pdlLogEndTime: Filetime = Filetime(),
        ): PdhLogServiceQueryInfoW00 =
            PdhLogServiceQueryInfoW00(
                pdlAutoNameInterval = pdlAutoNameInterval,
                pdlAutoNameUnits = pdlAutoNameUnits,
                pdlCommandFilenameCtorArg = pdlCommandFilename,
                pdlCounterListCtorArg = pdlCounterList,
                pdlAutoNameFormat = pdlAutoNameFormat,
                pdlSampleInterval = pdlSampleInterval,
                pdlLogStartTime = pdlLogStartTime,
                pdlLogEndTime = pdlLogEndTime,
            )
    }
}

public class PdhLogServiceQueryInfoW01 internal constructor(
    public var tlNumberOfBuffers: UInt,
    public var tlMinimumBuffers: UInt,
    public var tlMaximumBuffers: UInt,
    public var tlFreeBuffers: UInt,
    public var tlBufferSize: UInt,
    public var tlEventsLost: UInt,
    public var tlLoggerThreadId: UInt,
    public var tlBuffersWritten: UInt,
    public var tlLogHandle: UInt,
    tlLogFileNameCtorArg: Pwstr,
) {
    public var tlLogFileName: Pwstr = tlLogFileNameCtorArg
        internal set

    public constructor() : this(
        tlNumberOfBuffers = 0u,
        tlMinimumBuffers = 0u,
        tlMaximumBuffers = 0u,
        tlFreeBuffers = 0u,
        tlBufferSize = 0u,
        tlEventsLost = 0u,
        tlLoggerThreadId = 0u,
        tlBuffersWritten = 0u,
        tlLogHandle = 0u,
        tlLogFileNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.tlNumberOfBuffers

    public operator fun component2(): UInt = this.tlMinimumBuffers

    public operator fun component3(): UInt = this.tlMaximumBuffers

    public operator fun component4(): UInt = this.tlFreeBuffers

    public operator fun component5(): UInt = this.tlBufferSize

    public operator fun component6(): UInt = this.tlEventsLost

    public operator fun component7(): UInt = this.tlLoggerThreadId

    public operator fun component8(): UInt = this.tlBuffersWritten

    public operator fun component9(): UInt = this.tlLogHandle

    public operator fun component10(): Pwstr = this.tlLogFileName

    public fun copy(tlNumberOfBuffers: UInt = this.tlNumberOfBuffers, tlMinimumBuffers: UInt = this.tlMinimumBuffers, tlMaximumBuffers: UInt = this.tlMaximumBuffers, tlFreeBuffers: UInt = this.tlFreeBuffers, tlBufferSize: UInt = this.tlBufferSize, tlEventsLost: UInt = this.tlEventsLost, tlLoggerThreadId: UInt = this.tlLoggerThreadId, tlBuffersWritten: UInt = this.tlBuffersWritten, tlLogHandle: UInt = this.tlLogHandle, tlLogFileName: Pwstr = this.tlLogFileName): PdhLogServiceQueryInfoW01 = PdhLogServiceQueryInfoW01(tlNumberOfBuffers = tlNumberOfBuffers, tlMinimumBuffers = tlMinimumBuffers, tlMaximumBuffers = tlMaximumBuffers, tlFreeBuffers = tlFreeBuffers, tlBufferSize = tlBufferSize, tlEventsLost = tlEventsLost, tlLoggerThreadId = tlLoggerThreadId, tlBuffersWritten = tlBuffersWritten, tlLogHandle = tlLogHandle, tlLogFileNameCtorArg = tlLogFileName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PdhLogServiceQueryInfoW01) return false
        if (this.tlNumberOfBuffers != other.tlNumberOfBuffers) return false
        if (this.tlMinimumBuffers != other.tlMinimumBuffers) return false
        if (this.tlMaximumBuffers != other.tlMaximumBuffers) return false
        if (this.tlFreeBuffers != other.tlFreeBuffers) return false
        if (this.tlBufferSize != other.tlBufferSize) return false
        if (this.tlEventsLost != other.tlEventsLost) return false
        if (this.tlLoggerThreadId != other.tlLoggerThreadId) return false
        if (this.tlBuffersWritten != other.tlBuffersWritten) return false
        if (this.tlLogHandle != other.tlLogHandle) return false
        if (this.tlLogFileName != other.tlLogFileName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.tlNumberOfBuffers.hashCode()
        result = 31 * result + this.tlMinimumBuffers.hashCode()
        result = 31 * result + this.tlMaximumBuffers.hashCode()
        result = 31 * result + this.tlFreeBuffers.hashCode()
        result = 31 * result + this.tlBufferSize.hashCode()
        result = 31 * result + this.tlEventsLost.hashCode()
        result = 31 * result + this.tlLoggerThreadId.hashCode()
        result = 31 * result + this.tlBuffersWritten.hashCode()
        result = 31 * result + this.tlLogHandle.hashCode()
        result = 31 * result + this.tlLogFileName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            tlNumberOfBuffers: UInt = 0u,
            tlMinimumBuffers: UInt = 0u,
            tlMaximumBuffers: UInt = 0u,
            tlFreeBuffers: UInt = 0u,
            tlBufferSize: UInt = 0u,
            tlEventsLost: UInt = 0u,
            tlLoggerThreadId: UInt = 0u,
            tlBuffersWritten: UInt = 0u,
            tlLogHandle: UInt = 0u,
            tlLogFileName: Pwstr = MutPtr(0L),
        ): PdhLogServiceQueryInfoW01 =
            PdhLogServiceQueryInfoW01(
                tlNumberOfBuffers = tlNumberOfBuffers,
                tlMinimumBuffers = tlMinimumBuffers,
                tlMaximumBuffers = tlMaximumBuffers,
                tlFreeBuffers = tlFreeBuffers,
                tlBufferSize = tlBufferSize,
                tlEventsLost = tlEventsLost,
                tlLoggerThreadId = tlLoggerThreadId,
                tlBuffersWritten = tlBuffersWritten,
                tlLogHandle = tlLogHandle,
                tlLogFileNameCtorArg = tlLogFileName,
            )
    }
}

public data class PdhRawCounter(
    public var cStatus: UInt = 0u,
    public var timeStamp: Filetime = Filetime(),
    public var firstValue: Long = 0L,
    public var secondValue: Long = 0L,
    public var multiCount: UInt = 0u,
)

public class PdhRawCounterItemA internal constructor(
    szNameCtorArg: Pstr,
    public var rawValue: PdhRawCounter,
) {
    public var szName: Pstr = szNameCtorArg
        internal set

    public constructor() : this(
        szNameCtorArg = MutPtr(0L),
        rawValue = PdhRawCounter(),
    )

    public operator fun component1(): Pstr = this.szName

    public operator fun component2(): PdhRawCounter = this.rawValue

    public fun copy(szName: Pstr = this.szName, rawValue: PdhRawCounter = this.rawValue): PdhRawCounterItemA = PdhRawCounterItemA(szNameCtorArg = szName, rawValue = rawValue)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PdhRawCounterItemA) return false
        if (this.szName != other.szName) return false
        if (this.rawValue != other.rawValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szName.hashCode()
        result = 31 * result + this.rawValue.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            szName: Pstr = MutPtr(0L),
            rawValue: PdhRawCounter = PdhRawCounter(),
        ): PdhRawCounterItemA =
            PdhRawCounterItemA(
                szNameCtorArg = szName,
                rawValue = rawValue,
            )
    }
}

public class PdhRawCounterItemW internal constructor(
    szNameCtorArg: Pwstr,
    public var rawValue: PdhRawCounter,
) {
    public var szName: Pwstr = szNameCtorArg
        internal set

    public constructor() : this(
        szNameCtorArg = MutPtr(0L),
        rawValue = PdhRawCounter(),
    )

    public operator fun component1(): Pwstr = this.szName

    public operator fun component2(): PdhRawCounter = this.rawValue

    public fun copy(szName: Pwstr = this.szName, rawValue: PdhRawCounter = this.rawValue): PdhRawCounterItemW = PdhRawCounterItemW(szNameCtorArg = szName, rawValue = rawValue)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PdhRawCounterItemW) return false
        if (this.szName != other.szName) return false
        if (this.rawValue != other.rawValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szName.hashCode()
        result = 31 * result + this.rawValue.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            szName: Pwstr = MutPtr(0L),
            rawValue: PdhRawCounter = PdhRawCounter(),
        ): PdhRawCounterItemW =
            PdhRawCounterItemW(
                szNameCtorArg = szName,
                rawValue = rawValue,
            )
    }
}

public data class PdhRawLogRecord(
    public var dwStructureSize: UInt = 0u,
    public var dwRecordType: PdhLogType = 0u,
    public var dwItems: UInt = 0u,
    public var rawBytes: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PdhRawLogRecord) return false
        if (this.dwStructureSize != other.dwStructureSize) return false
        if (this.dwRecordType != other.dwRecordType) return false
        if (this.dwItems != other.dwItems) return false
        if (!this.rawBytes.contentEquals(other.rawBytes)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwStructureSize.hashCode()
        result = 31 * result + this.dwRecordType.hashCode()
        result = 31 * result + this.dwItems.hashCode()
        result = 31 * result + this.rawBytes.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PdhRawLogRecord> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PdhRawLogRecord> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): PdhRawLogRecord =
                    PdhRawLogRecord(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 12L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: PdhRawLogRecord) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwStructureSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwRecordType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwItems)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 12L, value.rawBytes.toList())
                }
            }
    }
}

public data class PdhStatistics(
    public var dwFormat: UInt = 0u,
    public var count: UInt = 0u,
    public var min: PdhFmtCountervalue = PdhFmtCountervalue(),
    public var max: PdhFmtCountervalue = PdhFmtCountervalue(),
    public var mean: PdhFmtCountervalue = PdhFmtCountervalue(),
)

public data class PdhTimeInfo(
    public var startTime: Long = 0L,
    public var endTime: Long = 0L,
    public var sampleCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PdhTimeInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PdhTimeInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): PdhTimeInfo =
                    PdhTimeInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: PdhTimeInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.startTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.endTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.sampleCount)
                }
            }
    }
}

public data class PerfCountersetInfo(
    public var counterSetGuid: Guid = Guid(),
    public var providerGuid: Guid = Guid(),
    public var numCounters: UInt = 0u,
    public var instanceType: UInt = 0u,
)

public data class PerfCountersetInstance(
    public var counterSetGuid: Guid = Guid(),
    public var dwSize: UInt = 0u,
    public var instanceId: UInt = 0u,
    public var instanceNameOffset: UInt = 0u,
    public var instanceNameSize: UInt = 0u,
)

public data class PerfCountersetRegInfo(
    public var counterSetGuid: Guid = Guid(),
    public var counterSetType: UInt = 0u,
    public var detailLevel: UInt = 0u,
    public var numCounters: UInt = 0u,
    public var instanceType: UInt = 0u,
)

public data class PerfCounterBlock(
    public var byteLength: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PerfCounterBlock> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PerfCounterBlock> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PerfCounterBlock =
                    PerfCounterBlock(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PerfCounterBlock) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.byteLength)
                }
            }
    }
}

public data class PerfCounterData(
    public var dwDataSize: UInt = 0u,
    public var dwSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PerfCounterData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PerfCounterData> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): PerfCounterData =
                    PerfCounterData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: PerfCounterData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwDataSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwSize)
                }
            }
    }
}

public data class PerfCounterDefinition(
    public var byteLength: UInt = 0u,
    public var counterNameTitleIndex: UInt = 0u,
    public var counterNameTitle: UInt = 0u,
    public var counterHelpTitleIndex: UInt = 0u,
    public var counterHelpTitle: UInt = 0u,
    public var defaultScale: Int = 0,
    public var detailLevel: UInt = 0u,
    public var counterType: UInt = 0u,
    public var counterSize: UInt = 0u,
    public var counterOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PerfCounterDefinition> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PerfCounterDefinition> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): PerfCounterDefinition =
                    PerfCounterDefinition(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: PerfCounterDefinition) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.byteLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.counterNameTitleIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.counterNameTitle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.counterHelpTitleIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.counterHelpTitle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.defaultScale)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.detailLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.counterType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.counterSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.counterOffset)
                }
            }
    }
}

public data class PerfCounterHeader(
    public var dwStatus: UInt = 0u,
    public var dwType: PerfCounterDataType = 0,
    public var dwSize: UInt = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PerfCounterHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PerfCounterHeader> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): PerfCounterHeader =
                    PerfCounterHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: PerfCounterHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.dwType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.reserved)
                }
            }
    }
}

public data class PerfCounterIdentifier(
    public var counterSetGuid: Guid = Guid(),
    public var status: UInt = 0u,
    public var size: UInt = 0u,
    public var counterId: UInt = 0u,
    public var instanceId: UInt = 0u,
    public var index: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class PerfCounterIdentity(
    public var counterSetGuid: Guid = Guid(),
    public var bufferSize: UInt = 0u,
    public var counterId: UInt = 0u,
    public var instanceId: UInt = 0u,
    public var machineOffset: UInt = 0u,
    public var nameOffset: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class PerfCounterInfo(
    public var counterId: UInt = 0u,
    public var type: UInt = 0u,
    public var attrib: ULong = 0uL,
    public var size: UInt = 0u,
    public var detailLevel: UInt = 0u,
    public var scale: Int = 0,
    public var offset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PerfCounterInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PerfCounterInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): PerfCounterInfo =
                    PerfCounterInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: PerfCounterInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.counterId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.attrib)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.detailLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.scale)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.offset)
                }
            }
    }
}

public data class PerfCounterRegInfo(
    public var counterId: UInt = 0u,
    public var type: UInt = 0u,
    public var attrib: ULong = 0uL,
    public var detailLevel: UInt = 0u,
    public var defaultScale: Int = 0,
    public var baseCounterId: UInt = 0u,
    public var perfTimeId: UInt = 0u,
    public var perfFreqId: UInt = 0u,
    public var multiId: UInt = 0u,
    public var aggregateFunc: PerfCounterAggregateFunc = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PerfCounterRegInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PerfCounterRegInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): PerfCounterRegInfo =
                    PerfCounterRegInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                    )
                override fun writeNative(addr: Long, value: PerfCounterRegInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.counterId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.attrib)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.detailLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.defaultScale)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.baseCounterId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.perfTimeId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.perfFreqId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.multiId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.aggregateFunc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.reserved)
                }
            }
    }
}

public data class PerfDataBlock(
    public var signature: UShortArray = UShortArray(4),
    public var littleEndian: UInt = 0u,
    public var version: UInt = 0u,
    public var revision: UInt = 0u,
    public var totalByteLength: UInt = 0u,
    public var headerLength: UInt = 0u,
    public var numObjectTypes: UInt = 0u,
    public var defaultObject: Int = 0,
    public var systemTime: Systemtime = Systemtime(),
    public var perfTime: Long = 0L,
    public var perfFreq: Long = 0L,
    public var perfTime100nSec: Long = 0L,
    public var systemNameLength: UInt = 0u,
    public var systemNameOffset: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PerfDataBlock) return false
        if (!this.signature.contentEquals(other.signature)) return false
        if (this.littleEndian != other.littleEndian) return false
        if (this.version != other.version) return false
        if (this.revision != other.revision) return false
        if (this.totalByteLength != other.totalByteLength) return false
        if (this.headerLength != other.headerLength) return false
        if (this.numObjectTypes != other.numObjectTypes) return false
        if (this.defaultObject != other.defaultObject) return false
        if (this.systemTime != other.systemTime) return false
        if (this.perfTime != other.perfTime) return false
        if (this.perfFreq != other.perfFreq) return false
        if (this.perfTime100nSec != other.perfTime100nSec) return false
        if (this.systemNameLength != other.systemNameLength) return false
        if (this.systemNameOffset != other.systemNameOffset) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.signature.contentHashCode()
        result = 31 * result + this.littleEndian.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.revision.hashCode()
        result = 31 * result + this.totalByteLength.hashCode()
        result = 31 * result + this.headerLength.hashCode()
        result = 31 * result + this.numObjectTypes.hashCode()
        result = 31 * result + this.defaultObject.hashCode()
        result = 31 * result + this.systemTime.hashCode()
        result = 31 * result + this.perfTime.hashCode()
        result = 31 * result + this.perfFreq.hashCode()
        result = 31 * result + this.perfTime100nSec.hashCode()
        result = 31 * result + this.systemNameLength.hashCode()
        result = 31 * result + this.systemNameOffset.hashCode()
        return result
    }
}

public data class PerfDataHeader(
    public var dwTotalSize: UInt = 0u,
    public var dwNumCounters: UInt = 0u,
    public var perfTimeStamp: Long = 0L,
    public var perfTime100NSec: Long = 0L,
    public var perfFreq: Long = 0L,
    public var systemTime: Systemtime = Systemtime(),
)

public data class PerfInstanceDefinition(
    public var byteLength: UInt = 0u,
    public var parentObjectTitleIndex: UInt = 0u,
    public var parentObjectInstance: UInt = 0u,
    public var uniqueID: Int = 0,
    public var nameOffset: UInt = 0u,
    public var nameLength: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PerfInstanceDefinition> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PerfInstanceDefinition> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): PerfInstanceDefinition =
                    PerfInstanceDefinition(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: PerfInstanceDefinition) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.byteLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.parentObjectTitleIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.parentObjectInstance)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.uniqueID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.nameOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.nameLength)
                }
            }
    }
}

public data class PerfInstanceHeader(
    public var size: UInt = 0u,
    public var instanceId: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PerfInstanceHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PerfInstanceHeader> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): PerfInstanceHeader =
                    PerfInstanceHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: PerfInstanceHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.instanceId)
                }
            }
    }
}

public data class PerfMultiCounters(
    public var dwSize: UInt = 0u,
    public var dwCounters: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PerfMultiCounters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PerfMultiCounters> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): PerfMultiCounters =
                    PerfMultiCounters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: PerfMultiCounters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwCounters)
                }
            }
    }
}

public data class PerfMultiInstances(
    public var dwTotalSize: UInt = 0u,
    public var dwInstances: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PerfMultiInstances> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PerfMultiInstances> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): PerfMultiInstances =
                    PerfMultiInstances(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: PerfMultiInstances) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwTotalSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwInstances)
                }
            }
    }
}

public data class PerfObjectType(
    public var totalByteLength: UInt = 0u,
    public var definitionLength: UInt = 0u,
    public var headerLength: UInt = 0u,
    public var objectNameTitleIndex: UInt = 0u,
    public var objectNameTitle: UInt = 0u,
    public var objectHelpTitleIndex: UInt = 0u,
    public var objectHelpTitle: UInt = 0u,
    public var detailLevel: UInt = 0u,
    public var numCounters: UInt = 0u,
    public var defaultCounter: Int = 0,
    public var numInstances: Int = 0,
    public var codePage: UInt = 0u,
    public var perfTime: Long = 0L,
    public var perfFreq: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PerfObjectType> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PerfObjectType> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): PerfObjectType =
                    PerfObjectType(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: PerfObjectType) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.totalByteLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.definitionLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.headerLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.objectNameTitleIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.objectNameTitle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.objectHelpTitleIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.objectHelpTitle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.detailLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.numCounters)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 36L, value.defaultCounter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 40L, value.numInstances)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.codePage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 48L, value.perfTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 56L, value.perfFreq)
                }
            }
    }
}

public class PerfProviderContext internal constructor(
    public var contextSize: UInt,
    public var reserved: UInt,
    public var controlCallback: Perflibrequest,
    public var memAllocRoutine: PerfMemAlloc,
    public var memFreeRoutine: PerfMemFree,
    pMemContextCtorArg: MutPtr<CVoid>,
) {
    public var pMemContext: MutPtr<CVoid> = pMemContextCtorArg
        internal set

    public constructor() : this(
        contextSize = 0u,
        reserved = 0u,
        controlCallback = null,
        memAllocRoutine = null,
        memFreeRoutine = null,
        pMemContextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.contextSize

    public operator fun component2(): UInt = this.reserved

    public operator fun component3(): Perflibrequest = this.controlCallback

    public operator fun component4(): PerfMemAlloc = this.memAllocRoutine

    public operator fun component5(): PerfMemFree = this.memFreeRoutine

    public operator fun component6(): MutPtr<CVoid> = this.pMemContext

    public fun copy(contextSize: UInt = this.contextSize, reserved: UInt = this.reserved, controlCallback: Perflibrequest = this.controlCallback, memAllocRoutine: PerfMemAlloc = this.memAllocRoutine, memFreeRoutine: PerfMemFree = this.memFreeRoutine, pMemContext: MutPtr<CVoid> = this.pMemContext): PerfProviderContext = PerfProviderContext(contextSize = contextSize, reserved = reserved, controlCallback = controlCallback, memAllocRoutine = memAllocRoutine, memFreeRoutine = memFreeRoutine, pMemContextCtorArg = pMemContext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PerfProviderContext) return false
        if (this.contextSize != other.contextSize) return false
        if (this.reserved != other.reserved) return false
        if (this.controlCallback != other.controlCallback) return false
        if (this.memAllocRoutine != other.memAllocRoutine) return false
        if (this.memFreeRoutine != other.memFreeRoutine) return false
        if (this.pMemContext != other.pMemContext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.contextSize.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.controlCallback.hashCode()
        result = 31 * result + this.memAllocRoutine.hashCode()
        result = 31 * result + this.memFreeRoutine.hashCode()
        result = 31 * result + this.pMemContext.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            contextSize: UInt = 0u,
            reserved: UInt = 0u,
            controlCallback: Perflibrequest = null,
            memAllocRoutine: PerfMemAlloc = null,
            memFreeRoutine: PerfMemFree = null,
            pMemContext: MutPtr<CVoid> = MutPtr(0L),
        ): PerfProviderContext =
            PerfProviderContext(
                contextSize = contextSize,
                reserved = reserved,
                controlCallback = controlCallback,
                memAllocRoutine = memAllocRoutine,
                memFreeRoutine = memFreeRoutine,
                pMemContextCtorArg = pMemContext,
            )
    }
}

public data class PerfStringBufferHeader(
    public var dwSize: UInt = 0u,
    public var dwCounters: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PerfStringBufferHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PerfStringBufferHeader> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): PerfStringBufferHeader =
                    PerfStringBufferHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: PerfStringBufferHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwCounters)
                }
            }
    }
}

public data class PerfStringCounterHeader(
    public var dwCounterId: UInt = 0u,
    public var dwOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PerfStringCounterHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PerfStringCounterHeader> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): PerfStringCounterHeader =
                    PerfStringCounterHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: PerfStringCounterHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwCounterId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwOffset)
                }
            }
    }
}
