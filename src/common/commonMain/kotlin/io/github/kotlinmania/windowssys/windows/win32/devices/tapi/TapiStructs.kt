@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.tapi

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Systemtime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam
import io.github.kotlinmania.windowssys.windows.win32.system.com.CY

public data class Addralias(
    public var rgchName: ByteArray = ByteArray(41),
    public var rgchEName: ByteArray = ByteArray(11),
    public var rgchSrvr: ByteArray = ByteArray(12),
    public var dibDetail: UInt = 0u,
    public var type: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Addralias) return false
        if (!this.rgchName.contentEquals(other.rgchName)) return false
        if (!this.rgchEName.contentEquals(other.rgchEName)) return false
        if (!this.rgchSrvr.contentEquals(other.rgchSrvr)) return false
        if (this.dibDetail != other.dibDetail) return false
        if (this.type != other.type) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.rgchName.contentHashCode()
        result = 31 * result + this.rgchEName.contentHashCode()
        result = 31 * result + this.rgchSrvr.contentHashCode()
        result = 31 * result + this.dibDetail.hashCode()
        result = 31 * result + this.type.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Addralias> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Addralias> {
                override val sizeBytes: Long = 72L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Addralias =
                    Addralias(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (41).toInt())
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (11).toInt())
                        ).readNative(addr + 41L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (12).toInt())
                        ).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 68L),
                    )
                override fun writeNative(addr: Long, value: Addralias) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (41).toInt())
                    ).writeNative(addr, value.rgchName)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (11).toInt())
                    ).writeNative(addr + 41L, value.rgchEName)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (12).toInt())
                    ).writeNative(addr + 52L, value.rgchSrvr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.dibDetail)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 68L, value.type)
                }
            }
    }
}

public data class Dtr(
    public var wYear: UShort = 0u,
    public var wMonth: UShort = 0u,
    public var wDay: UShort = 0u,
    public var wHour: UShort = 0u,
    public var wMinute: UShort = 0u,
    public var wSecond: UShort = 0u,
    public var wDayOfWeek: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dtr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dtr> {
                override val sizeBytes: Long = 14L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Dtr =
                    Dtr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Dtr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wYear)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wMonth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.wDay)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.wHour)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.wMinute)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.wSecond)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.wDayOfWeek)
                }
            }
    }
}

public class Lineaddresscaps(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwLineDeviceID: UInt = 0u,
    public var dwAddressSize: UInt = 0u,
    public var dwAddressOffset: UInt = 0u,
    public var dwDevSpecificSize: UInt = 0u,
    public var dwDevSpecificOffset: UInt = 0u,
    public var dwAddressSharing: UInt = 0u,
    public var dwAddressStates: UInt = 0u,
    public var dwCallInfoStates: UInt = 0u,
    public var dwCallerIDFlags: UInt = 0u,
    public var dwCalledIDFlags: UInt = 0u,
    public var dwConnectedIDFlags: UInt = 0u,
    public var dwRedirectionIDFlags: UInt = 0u,
    public var dwRedirectingIDFlags: UInt = 0u,
    public var dwCallStates: UInt = 0u,
    public var dwDialToneModes: UInt = 0u,
    public var dwBusyModes: UInt = 0u,
    public var dwSpecialInfo: UInt = 0u,
    public var dwDisconnectModes: UInt = 0u,
    public var dwMaxNumActiveCalls: UInt = 0u,
    public var dwMaxNumOnHoldCalls: UInt = 0u,
    public var dwMaxNumOnHoldPendingCalls: UInt = 0u,
    public var dwMaxNumConference: UInt = 0u,
    public var dwMaxNumTransConf: UInt = 0u,
    public var dwAddrCapFlags: UInt = 0u,
    public var dwCallFeatures: UInt = 0u,
    public var dwRemoveFromConfCaps: UInt = 0u,
    public var dwRemoveFromConfState: UInt = 0u,
    public var dwTransferModes: UInt = 0u,
    public var dwParkModes: UInt = 0u,
    public var dwForwardModes: UInt = 0u,
    public var dwMaxForwardEntries: UInt = 0u,
    public var dwMaxSpecificEntries: UInt = 0u,
    public var dwMinFwdNumRings: UInt = 0u,
    public var dwMaxFwdNumRings: UInt = 0u,
    public var dwMaxCallCompletions: UInt = 0u,
    public var dwCallCompletionConds: UInt = 0u,
    public var dwCallCompletionModes: UInt = 0u,
    public var dwNumCompletionMessages: UInt = 0u,
    public var dwCompletionMsgTextEntrySize: UInt = 0u,
    public var dwCompletionMsgTextSize: UInt = 0u,
    public var dwCompletionMsgTextOffset: UInt = 0u,
    public var dwAddressFeatures: UInt = 0u,
    public var dwPredictiveAutoTransferStates: UInt = 0u,
    public var dwNumCallTreatments: UInt = 0u,
    public var dwCallTreatmentListSize: UInt = 0u,
    public var dwCallTreatmentListOffset: UInt = 0u,
    public var dwDeviceClassesSize: UInt = 0u,
    public var dwDeviceClassesOffset: UInt = 0u,
    public var dwMaxCallDataSize: UInt = 0u,
    public var dwCallFeatures2: UInt = 0u,
    public var dwMaxNoAnswerTimeout: UInt = 0u,
    public var dwConnectedModes: UInt = 0u,
    public var dwOfferingModes: UInt = 0u,
    public var dwAvailableMediaModes: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineaddresscaps> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineaddresscaps> {
                override val sizeBytes: Long = 228L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Lineaddresscaps =
                    Lineaddresscaps(
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 84L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 92L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 100L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 108L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 116L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 124L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 132L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 140L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 144L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 148L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 152L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 156L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 160L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 164L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 168L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 172L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 176L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 180L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 184L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 188L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 192L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 196L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 200L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 204L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 208L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 212L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 216L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 220L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 224L),
                    )
                override fun writeNative(addr: Long, value: Lineaddresscaps) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwTotalSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwNeededSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwUsedSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwLineDeviceID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwAddressSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwAddressOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwDevSpecificSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwDevSpecificOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwAddressSharing)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.dwAddressStates)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.dwCallInfoStates)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.dwCallerIDFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.dwCalledIDFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.dwConnectedIDFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.dwRedirectionIDFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.dwRedirectingIDFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.dwCallStates)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.dwDialToneModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.dwBusyModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 76L, value.dwSpecialInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 80L, value.dwDisconnectModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 84L, value.dwMaxNumActiveCalls)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 88L, value.dwMaxNumOnHoldCalls)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 92L, value.dwMaxNumOnHoldPendingCalls)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 96L, value.dwMaxNumConference)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 100L, value.dwMaxNumTransConf)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 104L, value.dwAddrCapFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 108L, value.dwCallFeatures)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 112L, value.dwRemoveFromConfCaps)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 116L, value.dwRemoveFromConfState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 120L, value.dwTransferModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 124L, value.dwParkModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 128L, value.dwForwardModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 132L, value.dwMaxForwardEntries)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 136L, value.dwMaxSpecificEntries)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 140L, value.dwMinFwdNumRings)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 144L, value.dwMaxFwdNumRings)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 148L, value.dwMaxCallCompletions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 152L, value.dwCallCompletionConds)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 156L, value.dwCallCompletionModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 160L, value.dwNumCompletionMessages)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 164L, value.dwCompletionMsgTextEntrySize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 168L, value.dwCompletionMsgTextSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 172L, value.dwCompletionMsgTextOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 176L, value.dwAddressFeatures)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 180L, value.dwPredictiveAutoTransferStates)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 184L, value.dwNumCallTreatments)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 188L, value.dwCallTreatmentListSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 192L, value.dwCallTreatmentListOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 196L, value.dwDeviceClassesSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 200L, value.dwDeviceClassesOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 204L, value.dwMaxCallDataSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 208L, value.dwCallFeatures2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 212L, value.dwMaxNoAnswerTimeout)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 216L, value.dwConnectedModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 220L, value.dwOfferingModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 224L, value.dwAvailableMediaModes)
                }
            }
    }
}

public data class Lineaddressstatus(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwNumInUse: UInt = 0u,
    public var dwNumActiveCalls: UInt = 0u,
    public var dwNumOnHoldCalls: UInt = 0u,
    public var dwNumOnHoldPendCalls: UInt = 0u,
    public var dwAddressFeatures: UInt = 0u,
    public var dwNumRingsNoAnswer: UInt = 0u,
    public var dwForwardNumEntries: UInt = 0u,
    public var dwForwardSize: UInt = 0u,
    public var dwForwardOffset: UInt = 0u,
    public var dwTerminalModesSize: UInt = 0u,
    public var dwTerminalModesOffset: UInt = 0u,
    public var dwDevSpecificSize: UInt = 0u,
    public var dwDevSpecificOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineaddressstatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineaddressstatus> {
                override val sizeBytes: Long = 64L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Lineaddressstatus =
                    Lineaddressstatus(
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                    )
                override fun writeNative(addr: Long, value: Lineaddressstatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwTotalSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwNeededSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwUsedSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwNumInUse)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwNumActiveCalls)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwNumOnHoldCalls)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwNumOnHoldPendCalls)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwAddressFeatures)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwNumRingsNoAnswer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.dwForwardNumEntries)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.dwForwardSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.dwForwardOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.dwTerminalModesSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.dwTerminalModesOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.dwDevSpecificSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.dwDevSpecificOffset)
                }
            }
    }
}

public data class Lineagentactivityentry(
    public var dwID: UInt = 0u,
    public var dwNameSize: UInt = 0u,
    public var dwNameOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineagentactivityentry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineagentactivityentry> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Lineagentactivityentry =
                    Lineagentactivityentry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Lineagentactivityentry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwNameSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwNameOffset)
                }
            }
    }
}

public data class Lineagentactivitylist(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwNumEntries: UInt = 0u,
    public var dwListSize: UInt = 0u,
    public var dwListOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineagentactivitylist> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineagentactivitylist> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Lineagentactivitylist =
                    Lineagentactivitylist(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: Lineagentactivitylist) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwTotalSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwNeededSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwUsedSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwNumEntries)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwListSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwListOffset)
                }
            }
    }
}

public data class Lineagentcaps(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwAgentHandlerInfoSize: UInt = 0u,
    public var dwAgentHandlerInfoOffset: UInt = 0u,
    public var dwCapsVersion: UInt = 0u,
    public var dwFeatures: UInt = 0u,
    public var dwStates: UInt = 0u,
    public var dwNextStates: UInt = 0u,
    public var dwMaxNumGroupEntries: UInt = 0u,
    public var dwAgentStatusMessages: UInt = 0u,
    public var dwNumAgentExtensionIDs: UInt = 0u,
    public var dwAgentExtensionIDListSize: UInt = 0u,
    public var dwAgentExtensionIDListOffset: UInt = 0u,
    public var proxyGUID: Guid = Guid(),
)

public data class Lineagententry(
    public var hAgent: UInt = 0u,
    public var dwNameSize: UInt = 0u,
    public var dwNameOffset: UInt = 0u,
    public var dwIDSize: UInt = 0u,
    public var dwIDOffset: UInt = 0u,
    public var dwPINSize: UInt = 0u,
    public var dwPINOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineagententry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineagententry> {
                override val sizeBytes: Long = 28L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Lineagententry =
                    Lineagententry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Lineagententry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hAgent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwNameSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwNameOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwIDSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwIDOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwPINSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwPINOffset)
                }
            }
    }
}

public data class Lineagentgroupentry(
    public var groupID: Lineagentgroupentry0 = Lineagentgroupentry0(),
    public var dwNameSize: UInt = 0u,
    public var dwNameOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineagentgroupentry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineagentgroupentry> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Lineagentgroupentry =
                    Lineagentgroupentry(
                        (Lineagentgroupentry0.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: Lineagentgroupentry) {
                    (Lineagentgroupentry0.typeLayout()).writeNative(addr, value.groupID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwNameSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwNameOffset)
                }
            }
    }
}

public data class Lineagentgroupentry0(
    public var dwGroupID1: UInt = 0u,
    public var dwGroupID2: UInt = 0u,
    public var dwGroupID3: UInt = 0u,
    public var dwGroupID4: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineagentgroupentry0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineagentgroupentry0> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Lineagentgroupentry0 =
                    Lineagentgroupentry0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Lineagentgroupentry0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwGroupID1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwGroupID2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwGroupID3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwGroupID4)
                }
            }
    }
}

public data class Lineagentgrouplist(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwNumEntries: UInt = 0u,
    public var dwListSize: UInt = 0u,
    public var dwListOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineagentgrouplist> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineagentgrouplist> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Lineagentgrouplist =
                    Lineagentgrouplist(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: Lineagentgrouplist) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwTotalSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwNeededSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwUsedSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwNumEntries)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwListSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwListOffset)
                }
            }
    }
}

public data class Lineagentinfo(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwAgentState: UInt = 0u,
    public var dwNextAgentState: UInt = 0u,
    public var dwMeasurementPeriod: UInt = 0u,
    public var cyOverallCallRate: CY = CY(),
    public var dwNumberOfACDCalls: UInt = 0u,
    public var dwNumberOfIncomingCalls: UInt = 0u,
    public var dwNumberOfOutgoingCalls: UInt = 0u,
    public var dwTotalACDTalkTime: UInt = 0u,
    public var dwTotalACDCallTime: UInt = 0u,
    public var dwTotalACDWrapUpTime: UInt = 0u,
)

public data class Lineagentlist(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwNumEntries: UInt = 0u,
    public var dwListSize: UInt = 0u,
    public var dwListOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineagentlist> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineagentlist> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Lineagentlist =
                    Lineagentlist(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: Lineagentlist) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwTotalSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwNeededSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwUsedSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwNumEntries)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwListSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwListOffset)
                }
            }
    }
}

public data class Lineagentsessionentry(
    public var hAgentSession: UInt = 0u,
    public var hAgent: UInt = 0u,
    public var groupID: Guid = Guid(),
    public var dwWorkingAddressID: UInt = 0u,
)

public class Lineagentsessioninfo(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwAgentSessionState: UInt = 0u,
    public var dwNextAgentSessionState: UInt = 0u,
    public var dateSessionStartTime: Double = 0.0,
    public var dwSessionDuration: UInt = 0u,
    public var dwNumberOfCalls: UInt = 0u,
    public var dwTotalTalkTime: UInt = 0u,
    public var dwAverageTalkTime: UInt = 0u,
    public var dwTotalCallTime: UInt = 0u,
    public var dwAverageCallTime: UInt = 0u,
    public var dwTotalWrapUpTime: UInt = 0u,
    public var dwAverageWrapUpTime: UInt = 0u,
    public var cyACDCallRate: CY = CY(),
    public var dwLongestTimeToAnswer: UInt = 0u,
    public var dwAverageTimeToAnswer: UInt = 0u,
)

public data class Lineagentsessionlist(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwNumEntries: UInt = 0u,
    public var dwListSize: UInt = 0u,
    public var dwListOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineagentsessionlist> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineagentsessionlist> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Lineagentsessionlist =
                    Lineagentsessionlist(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: Lineagentsessionlist) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwTotalSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwNeededSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwUsedSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwNumEntries)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwListSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwListOffset)
                }
            }
    }
}

public data class Lineagentstatus(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwNumEntries: UInt = 0u,
    public var dwGroupListSize: UInt = 0u,
    public var dwGroupListOffset: UInt = 0u,
    public var dwState: UInt = 0u,
    public var dwNextState: UInt = 0u,
    public var dwActivityID: UInt = 0u,
    public var dwActivitySize: UInt = 0u,
    public var dwActivityOffset: UInt = 0u,
    public var dwAgentFeatures: UInt = 0u,
    public var dwValidStates: UInt = 0u,
    public var dwValidNextStates: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineagentstatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineagentstatus> {
                override val sizeBytes: Long = 56L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Lineagentstatus =
                    Lineagentstatus(
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                    )
                override fun writeNative(addr: Long, value: Lineagentstatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwTotalSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwNeededSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwUsedSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwNumEntries)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwGroupListSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwGroupListOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwNextState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwActivityID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.dwActivitySize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.dwActivityOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.dwAgentFeatures)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.dwValidStates)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.dwValidNextStates)
                }
            }
    }
}

public data class Lineappinfo(
    public var dwMachineNameSize: UInt = 0u,
    public var dwMachineNameOffset: UInt = 0u,
    public var dwUserNameSize: UInt = 0u,
    public var dwUserNameOffset: UInt = 0u,
    public var dwModuleFilenameSize: UInt = 0u,
    public var dwModuleFilenameOffset: UInt = 0u,
    public var dwFriendlyNameSize: UInt = 0u,
    public var dwFriendlyNameOffset: UInt = 0u,
    public var dwMediaModes: UInt = 0u,
    public var dwAddressID: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineappinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineappinfo> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Lineappinfo =
                    Lineappinfo(
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
                    )
                override fun writeNative(addr: Long, value: Lineappinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwMachineNameSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwMachineNameOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwUserNameSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwUserNameOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwModuleFilenameSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwModuleFilenameOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwFriendlyNameSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwFriendlyNameOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwMediaModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.dwAddressID)
                }
            }
    }
}

public class Linecallinfo {
    public var dwTotalSize: UInt = 0u

    public var dwNeededSize: UInt = 0u

    public var dwUsedSize: UInt = 0u

    public var hLine: UInt = 0u

    public var dwLineDeviceID: UInt = 0u

    public var dwAddressID: UInt = 0u

    public var dwBearerMode: UInt = 0u

    public var dwRate: UInt = 0u

    public var dwMediaMode: UInt = 0u

    public var dwAppSpecific: UInt = 0u

    public var dwCallID: UInt = 0u

    public var dwRelatedCallID: UInt = 0u

    public var dwCallParamFlags: UInt = 0u

    public var dwCallStates: UInt = 0u

    public var dwMonitorDigitModes: UInt = 0u

    public var dwMonitorMediaModes: UInt = 0u

    public var dialParams: Linedialparams = Linedialparams()

    public var dwOrigin: UInt = 0u

    public var dwReason: UInt = 0u

    public var dwCompletionID: UInt = 0u

    public var dwNumOwners: UInt = 0u

    public var dwNumMonitors: UInt = 0u

    public var dwCountryCode: UInt = 0u

    public var dwTrunk: UInt = 0u

    public var dwCallerIDFlags: UInt = 0u

    public var dwCallerIDSize: UInt = 0u

    public var dwCallerIDOffset: UInt = 0u

    public var dwCallerIDNameSize: UInt = 0u

    public var dwCallerIDNameOffset: UInt = 0u

    public var dwCalledIDFlags: UInt = 0u

    public var dwCalledIDSize: UInt = 0u

    public var dwCalledIDOffset: UInt = 0u

    public var dwCalledIDNameSize: UInt = 0u

    public var dwCalledIDNameOffset: UInt = 0u

    public var dwConnectedIDFlags: UInt = 0u

    public var dwConnectedIDSize: UInt = 0u

    public var dwConnectedIDOffset: UInt = 0u

    public var dwConnectedIDNameSize: UInt = 0u

    public var dwConnectedIDNameOffset: UInt = 0u

    public var dwRedirectionIDFlags: UInt = 0u

    public var dwRedirectionIDSize: UInt = 0u

    public var dwRedirectionIDOffset: UInt = 0u

    public var dwRedirectionIDNameSize: UInt = 0u

    public var dwRedirectionIDNameOffset: UInt = 0u

    public var dwRedirectingIDFlags: UInt = 0u

    public var dwRedirectingIDSize: UInt = 0u

    public var dwRedirectingIDOffset: UInt = 0u

    public var dwRedirectingIDNameSize: UInt = 0u

    public var dwRedirectingIDNameOffset: UInt = 0u

    public var dwAppNameSize: UInt = 0u

    public var dwAppNameOffset: UInt = 0u

    public var dwDisplayableAddressSize: UInt = 0u

    public var dwDisplayableAddressOffset: UInt = 0u

    public var dwCalledPartySize: UInt = 0u

    public var dwCalledPartyOffset: UInt = 0u

    public var dwCommentSize: UInt = 0u

    public var dwCommentOffset: UInt = 0u

    public var dwDisplaySize: UInt = 0u

    public var dwDisplayOffset: UInt = 0u

    public var dwUserUserInfoSize: UInt = 0u

    public var dwUserUserInfoOffset: UInt = 0u

    public var dwHighLevelCompSize: UInt = 0u

    public var dwHighLevelCompOffset: UInt = 0u

    public var dwLowLevelCompSize: UInt = 0u

    public var dwLowLevelCompOffset: UInt = 0u

    public var dwChargingInfoSize: UInt = 0u

    public var dwChargingInfoOffset: UInt = 0u

    public var dwTerminalModesSize: UInt = 0u

    public var dwTerminalModesOffset: UInt = 0u

    public var dwDevSpecificSize: UInt = 0u

    public var dwDevSpecificOffset: UInt = 0u

    public var dwCallTreatment: UInt = 0u

    public var dwCallDataSize: UInt = 0u

    public var dwCallDataOffset: UInt = 0u

    public var dwSendingFlowspecSize: UInt = 0u

    public var dwSendingFlowspecOffset: UInt = 0u

    public var dwReceivingFlowspecSize: UInt = 0u

    public var dwReceivingFlowspecOffset: UInt = 0u

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linecallinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linecallinfo> {
                override val sizeBytes: Long = 324L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Linecallinfo =
                    Linecallinfo(
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (Linedialparams.typeLayout()).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 84L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 92L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 100L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 108L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 116L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 124L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 132L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 140L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 144L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 148L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 152L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 156L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 160L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 164L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 168L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 172L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 176L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 180L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 184L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 188L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 192L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 196L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 200L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 204L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 208L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 212L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 216L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 220L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 224L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 228L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 232L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 236L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 240L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 244L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 248L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 252L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 256L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 260L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 264L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 268L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 272L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 276L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 280L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 284L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 288L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 292L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 296L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 300L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 304L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 308L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 312L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 316L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 320L),
                    )
                override fun writeNative(addr: Long, value: Linecallinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwTotalSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwNeededSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwUsedSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.hLine)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwLineDeviceID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwAddressID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwBearerMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwRate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwMediaMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.dwAppSpecific)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.dwCallID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.dwRelatedCallID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.dwCallParamFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.dwCallStates)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.dwMonitorDigitModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.dwMonitorMediaModes)
                    (Linedialparams.typeLayout()).writeNative(addr + 64L, value.dialParams)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 80L, value.dwOrigin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 84L, value.dwReason)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 88L, value.dwCompletionID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 92L, value.dwNumOwners)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 96L, value.dwNumMonitors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 100L, value.dwCountryCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 104L, value.dwTrunk)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 108L, value.dwCallerIDFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 112L, value.dwCallerIDSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 116L, value.dwCallerIDOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 120L, value.dwCallerIDNameSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 124L, value.dwCallerIDNameOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 128L, value.dwCalledIDFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 132L, value.dwCalledIDSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 136L, value.dwCalledIDOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 140L, value.dwCalledIDNameSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 144L, value.dwCalledIDNameOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 148L, value.dwConnectedIDFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 152L, value.dwConnectedIDSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 156L, value.dwConnectedIDOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 160L, value.dwConnectedIDNameSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 164L, value.dwConnectedIDNameOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 168L, value.dwRedirectionIDFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 172L, value.dwRedirectionIDSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 176L, value.dwRedirectionIDOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 180L, value.dwRedirectionIDNameSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 184L, value.dwRedirectionIDNameOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 188L, value.dwRedirectingIDFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 192L, value.dwRedirectingIDSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 196L, value.dwRedirectingIDOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 200L, value.dwRedirectingIDNameSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 204L, value.dwRedirectingIDNameOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 208L, value.dwAppNameSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 212L, value.dwAppNameOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 216L, value.dwDisplayableAddressSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 220L, value.dwDisplayableAddressOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 224L, value.dwCalledPartySize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 228L, value.dwCalledPartyOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 232L, value.dwCommentSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 236L, value.dwCommentOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 240L, value.dwDisplaySize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 244L, value.dwDisplayOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 248L, value.dwUserUserInfoSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 252L, value.dwUserUserInfoOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 256L, value.dwHighLevelCompSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 260L, value.dwHighLevelCompOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 264L, value.dwLowLevelCompSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 268L, value.dwLowLevelCompOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 272L, value.dwChargingInfoSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 276L, value.dwChargingInfoOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 280L, value.dwTerminalModesSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 284L, value.dwTerminalModesOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 288L, value.dwDevSpecificSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 292L, value.dwDevSpecificOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 296L, value.dwCallTreatment)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 300L, value.dwCallDataSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 304L, value.dwCallDataOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 308L, value.dwSendingFlowspecSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 312L, value.dwSendingFlowspecOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 316L, value.dwReceivingFlowspecSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 320L, value.dwReceivingFlowspecOffset)
                }
            }
    }
}

public data class Linecalllist(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwCallsNumEntries: UInt = 0u,
    public var dwCallsSize: UInt = 0u,
    public var dwCallsOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linecalllist> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linecalllist> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Linecalllist =
                    Linecalllist(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: Linecalllist) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwTotalSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwNeededSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwUsedSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwCallsNumEntries)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwCallsSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwCallsOffset)
                }
            }
    }
}

public class Linecallparams(
    public var dwTotalSize: UInt = 0u,
    public var dwBearerMode: UInt = 0u,
    public var dwMinRate: UInt = 0u,
    public var dwMaxRate: UInt = 0u,
    public var dwMediaMode: UInt = 0u,
    public var dwCallParamFlags: UInt = 0u,
    public var dwAddressMode: UInt = 0u,
    public var dwAddressID: UInt = 0u,
    public var dialParams: Linedialparams = Linedialparams(),
    public var dwOrigAddressSize: UInt = 0u,
    public var dwOrigAddressOffset: UInt = 0u,
    public var dwDisplayableAddressSize: UInt = 0u,
    public var dwDisplayableAddressOffset: UInt = 0u,
    public var dwCalledPartySize: UInt = 0u,
    public var dwCalledPartyOffset: UInt = 0u,
    public var dwCommentSize: UInt = 0u,
    public var dwCommentOffset: UInt = 0u,
    public var dwUserUserInfoSize: UInt = 0u,
    public var dwUserUserInfoOffset: UInt = 0u,
    public var dwHighLevelCompSize: UInt = 0u,
    public var dwHighLevelCompOffset: UInt = 0u,
    public var dwLowLevelCompSize: UInt = 0u,
    public var dwLowLevelCompOffset: UInt = 0u,
    public var dwDevSpecificSize: UInt = 0u,
    public var dwDevSpecificOffset: UInt = 0u,
    public var dwPredictiveAutoTransferStates: UInt = 0u,
    public var dwTargetAddressSize: UInt = 0u,
    public var dwTargetAddressOffset: UInt = 0u,
    public var dwSendingFlowspecSize: UInt = 0u,
    public var dwSendingFlowspecOffset: UInt = 0u,
    public var dwReceivingFlowspecSize: UInt = 0u,
    public var dwReceivingFlowspecOffset: UInt = 0u,
    public var dwDeviceClassSize: UInt = 0u,
    public var dwDeviceClassOffset: UInt = 0u,
    public var dwDeviceConfigSize: UInt = 0u,
    public var dwDeviceConfigOffset: UInt = 0u,
    public var dwCallDataSize: UInt = 0u,
    public var dwCallDataOffset: UInt = 0u,
    public var dwNoAnswerTimeout: UInt = 0u,
    public var dwCallingPartyIDSize: UInt = 0u,
    public var dwCallingPartyIDOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linecallparams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linecallparams> {
                override val sizeBytes: Long = 176L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Linecallparams =
                    Linecallparams(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (Linedialparams.typeLayout()).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 84L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 92L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 100L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 108L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 116L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 124L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 132L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 140L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 144L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 148L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 152L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 156L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 160L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 164L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 168L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 172L),
                    )
                override fun writeNative(addr: Long, value: Linecallparams) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwTotalSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwBearerMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwMinRate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwMaxRate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwMediaMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwCallParamFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwAddressMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwAddressID)
                    (Linedialparams.typeLayout()).writeNative(addr + 32L, value.dialParams)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.dwOrigAddressSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.dwOrigAddressOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.dwDisplayableAddressSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.dwDisplayableAddressOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.dwCalledPartySize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.dwCalledPartyOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.dwCommentSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 76L, value.dwCommentOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 80L, value.dwUserUserInfoSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 84L, value.dwUserUserInfoOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 88L, value.dwHighLevelCompSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 92L, value.dwHighLevelCompOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 96L, value.dwLowLevelCompSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 100L, value.dwLowLevelCompOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 104L, value.dwDevSpecificSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 108L, value.dwDevSpecificOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 112L, value.dwPredictiveAutoTransferStates)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 116L, value.dwTargetAddressSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 120L, value.dwTargetAddressOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 124L, value.dwSendingFlowspecSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 128L, value.dwSendingFlowspecOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 132L, value.dwReceivingFlowspecSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 136L, value.dwReceivingFlowspecOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 140L, value.dwDeviceClassSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 144L, value.dwDeviceClassOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 148L, value.dwDeviceConfigSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 152L, value.dwDeviceConfigOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 156L, value.dwCallDataSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 160L, value.dwCallDataOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 164L, value.dwNoAnswerTimeout)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 168L, value.dwCallingPartyIDSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 172L, value.dwCallingPartyIDOffset)
                }
            }
    }
}

public data class Linecallstatus(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwCallState: UInt = 0u,
    public var dwCallStateMode: UInt = 0u,
    public var dwCallPrivilege: UInt = 0u,
    public var dwCallFeatures: UInt = 0u,
    public var dwDevSpecificSize: UInt = 0u,
    public var dwDevSpecificOffset: UInt = 0u,
    public var dwCallFeatures2: UInt = 0u,
    public var tStateEntryTime: Systemtime = Systemtime(),
)

public data class Linecalltreatmententry(
    public var dwCallTreatmentID: UInt = 0u,
    public var dwCallTreatmentNameSize: UInt = 0u,
    public var dwCallTreatmentNameOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linecalltreatmententry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linecalltreatmententry> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Linecalltreatmententry =
                    Linecalltreatmententry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Linecalltreatmententry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwCallTreatmentID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwCallTreatmentNameSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwCallTreatmentNameOffset)
                }
            }
    }
}

public data class Linecardentry(
    public var dwPermanentCardID: UInt = 0u,
    public var dwCardNameSize: UInt = 0u,
    public var dwCardNameOffset: UInt = 0u,
    public var dwCardNumberDigits: UInt = 0u,
    public var dwSameAreaRuleSize: UInt = 0u,
    public var dwSameAreaRuleOffset: UInt = 0u,
    public var dwLongDistanceRuleSize: UInt = 0u,
    public var dwLongDistanceRuleOffset: UInt = 0u,
    public var dwInternationalRuleSize: UInt = 0u,
    public var dwInternationalRuleOffset: UInt = 0u,
    public var dwOptions: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linecardentry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linecardentry> {
                override val sizeBytes: Long = 44L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Linecardentry =
                    Linecardentry(
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
                override fun writeNative(addr: Long, value: Linecardentry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwPermanentCardID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwCardNameSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwCardNameOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwCardNumberDigits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwSameAreaRuleSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwSameAreaRuleOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwLongDistanceRuleSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwLongDistanceRuleOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwInternationalRuleSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.dwInternationalRuleOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.dwOptions)
                }
            }
    }
}

public data class Linecountryentry(
    public var dwCountryID: UInt = 0u,
    public var dwCountryCode: UInt = 0u,
    public var dwNextCountryID: UInt = 0u,
    public var dwCountryNameSize: UInt = 0u,
    public var dwCountryNameOffset: UInt = 0u,
    public var dwSameAreaRuleSize: UInt = 0u,
    public var dwSameAreaRuleOffset: UInt = 0u,
    public var dwLongDistanceRuleSize: UInt = 0u,
    public var dwLongDistanceRuleOffset: UInt = 0u,
    public var dwInternationalRuleSize: UInt = 0u,
    public var dwInternationalRuleOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linecountryentry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linecountryentry> {
                override val sizeBytes: Long = 44L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Linecountryentry =
                    Linecountryentry(
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
                override fun writeNative(addr: Long, value: Linecountryentry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwCountryID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwCountryCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwNextCountryID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwCountryNameSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwCountryNameOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwSameAreaRuleSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwSameAreaRuleOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwLongDistanceRuleSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwLongDistanceRuleOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.dwInternationalRuleSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.dwInternationalRuleOffset)
                }
            }
    }
}

public data class Linecountrylist(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwNumCountries: UInt = 0u,
    public var dwCountryListSize: UInt = 0u,
    public var dwCountryListOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linecountrylist> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linecountrylist> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Linecountrylist =
                    Linecountrylist(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: Linecountrylist) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwTotalSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwNeededSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwUsedSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwNumCountries)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwCountryListSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwCountryListOffset)
                }
            }
    }
}

public class Linedevcaps(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwProviderInfoSize: UInt = 0u,
    public var dwProviderInfoOffset: UInt = 0u,
    public var dwSwitchInfoSize: UInt = 0u,
    public var dwSwitchInfoOffset: UInt = 0u,
    public var dwPermanentLineID: UInt = 0u,
    public var dwLineNameSize: UInt = 0u,
    public var dwLineNameOffset: UInt = 0u,
    public var dwStringFormat: UInt = 0u,
    public var dwAddressModes: UInt = 0u,
    public var dwNumAddresses: UInt = 0u,
    public var dwBearerModes: UInt = 0u,
    public var dwMaxRate: UInt = 0u,
    public var dwMediaModes: UInt = 0u,
    public var dwGenerateToneModes: UInt = 0u,
    public var dwGenerateToneMaxNumFreq: UInt = 0u,
    public var dwGenerateDigitModes: UInt = 0u,
    public var dwMonitorToneMaxNumFreq: UInt = 0u,
    public var dwMonitorToneMaxNumEntries: UInt = 0u,
    public var dwMonitorDigitModes: UInt = 0u,
    public var dwGatherDigitsMinTimeout: UInt = 0u,
    public var dwGatherDigitsMaxTimeout: UInt = 0u,
    public var dwMedCtlDigitMaxListSize: UInt = 0u,
    public var dwMedCtlMediaMaxListSize: UInt = 0u,
    public var dwMedCtlToneMaxListSize: UInt = 0u,
    public var dwMedCtlCallStateMaxListSize: UInt = 0u,
    public var dwDevCapFlags: UInt = 0u,
    public var dwMaxNumActiveCalls: UInt = 0u,
    public var dwAnswerMode: UInt = 0u,
    public var dwRingModes: UInt = 0u,
    public var dwLineStates: UInt = 0u,
    public var dwUUIAcceptSize: UInt = 0u,
    public var dwUUIAnswerSize: UInt = 0u,
    public var dwUUIMakeCallSize: UInt = 0u,
    public var dwUUIDropSize: UInt = 0u,
    public var dwUUISendUserUserInfoSize: UInt = 0u,
    public var dwUUICallInfoSize: UInt = 0u,
    public var minDialParams: Linedialparams = Linedialparams(),
    public var maxDialParams: Linedialparams = Linedialparams(),
    public var defaultDialParams: Linedialparams = Linedialparams(),
    public var dwNumTerminals: UInt = 0u,
    public var dwTerminalCapsSize: UInt = 0u,
    public var dwTerminalCapsOffset: UInt = 0u,
    public var dwTerminalTextEntrySize: UInt = 0u,
    public var dwTerminalTextSize: UInt = 0u,
    public var dwTerminalTextOffset: UInt = 0u,
    public var dwDevSpecificSize: UInt = 0u,
    public var dwDevSpecificOffset: UInt = 0u,
    public var dwLineFeatures: UInt = 0u,
    public var dwSettableDevStatus: UInt = 0u,
    public var dwDeviceClassesSize: UInt = 0u,
    public var dwDeviceClassesOffset: UInt = 0u,
    public var permanentLineGuid: Guid = Guid(),
)

public class Linedevstatus(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwNumOpens: UInt = 0u,
    public var dwOpenMediaModes: UInt = 0u,
    public var dwNumActiveCalls: UInt = 0u,
    public var dwNumOnHoldCalls: UInt = 0u,
    public var dwNumOnHoldPendCalls: UInt = 0u,
    public var dwLineFeatures: UInt = 0u,
    public var dwNumCallCompletions: UInt = 0u,
    public var dwRingMode: UInt = 0u,
    public var dwSignalLevel: UInt = 0u,
    public var dwBatteryLevel: UInt = 0u,
    public var dwRoamMode: UInt = 0u,
    public var dwDevStatusFlags: UInt = 0u,
    public var dwTerminalModesSize: UInt = 0u,
    public var dwTerminalModesOffset: UInt = 0u,
    public var dwDevSpecificSize: UInt = 0u,
    public var dwDevSpecificOffset: UInt = 0u,
    public var dwAvailableMediaModes: UInt = 0u,
    public var dwAppInfoSize: UInt = 0u,
    public var dwAppInfoOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linedevstatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linedevstatus> {
                override val sizeBytes: Long = 88L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Linedevstatus =
                    Linedevstatus(
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 84L),
                    )
                override fun writeNative(addr: Long, value: Linedevstatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwTotalSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwNeededSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwUsedSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwNumOpens)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwOpenMediaModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwNumActiveCalls)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwNumOnHoldCalls)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwNumOnHoldPendCalls)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwLineFeatures)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.dwNumCallCompletions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.dwRingMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.dwSignalLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.dwBatteryLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.dwRoamMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.dwDevStatusFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.dwTerminalModesSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.dwTerminalModesOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.dwDevSpecificSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.dwDevSpecificOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 76L, value.dwAvailableMediaModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 80L, value.dwAppInfoSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 84L, value.dwAppInfoOffset)
                }
            }
    }
}

public data class Linedialparams(
    public var dwDialPause: UInt = 0u,
    public var dwDialSpeed: UInt = 0u,
    public var dwDigitDuration: UInt = 0u,
    public var dwWaitForDialtone: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linedialparams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linedialparams> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Linedialparams =
                    Linedialparams(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Linedialparams) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwDialPause)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwDialSpeed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwDigitDuration)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwWaitForDialtone)
                }
            }
    }
}

public data class Lineextensionid(
    public var dwExtensionID0: UInt = 0u,
    public var dwExtensionID1: UInt = 0u,
    public var dwExtensionID2: UInt = 0u,
    public var dwExtensionID3: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineextensionid> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineextensionid> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Lineextensionid =
                    Lineextensionid(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Lineextensionid) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwExtensionID0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwExtensionID1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwExtensionID2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwExtensionID3)
                }
            }
    }
}

public data class Lineforward(
    public var dwForwardMode: UInt = 0u,
    public var dwCallerAddressSize: UInt = 0u,
    public var dwCallerAddressOffset: UInt = 0u,
    public var dwDestCountryCode: UInt = 0u,
    public var dwDestAddressSize: UInt = 0u,
    public var dwDestAddressOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineforward> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineforward> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Lineforward =
                    Lineforward(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: Lineforward) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwForwardMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwCallerAddressSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwCallerAddressOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwDestCountryCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwDestAddressSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwDestAddressOffset)
                }
            }
    }
}

public data class Lineforwardlist(
    public var dwTotalSize: UInt = 0u,
    public var dwNumEntries: UInt = 0u,
    public var forwardList: List<Lineforward> = List(1) { Lineforward() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineforwardlist> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineforwardlist> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Lineforwardlist =
                    Lineforwardlist(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(Lineforward.typeLayout(), (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Lineforwardlist) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwTotalSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwNumEntries)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(Lineforward.typeLayout(), (1).toInt())
                    ).writeNative(addr + 8L, value.forwardList)
                }
            }
    }
}

public data class Linegeneratetone(
    public var dwFrequency: UInt = 0u,
    public var dwCadenceOn: UInt = 0u,
    public var dwCadenceOff: UInt = 0u,
    public var dwVolume: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linegeneratetone> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linegeneratetone> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Linegeneratetone =
                    Linegeneratetone(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Linegeneratetone) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwFrequency)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwCadenceOn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwCadenceOff)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwVolume)
                }
            }
    }
}

public data class Lineinitializeexparams(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwOptions: UInt = 0u,
    public var handles: Lineinitializeexparams0 = Lineinitializeexparams0(),
    public var dwCompletionKey: UInt = 0u,
)

public class Lineinitializeexparams0 internal constructor(
    hEventCtorArg: Handle,
    hCompletionPortCtorArg: Handle,
) {
    public var hEvent: Handle = hEventCtorArg
        internal set

    public var hCompletionPort: Handle = hCompletionPortCtorArg
        internal set

    public constructor() : this(
        hEventCtorArg = MutPtr(0L),
        hCompletionPortCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Handle = this.hEvent

    public operator fun component2(): Handle = this.hCompletionPort

    public fun copy(hEvent: Handle = this.hEvent, hCompletionPort: Handle = this.hCompletionPort): Lineinitializeexparams0 = Lineinitializeexparams0(hEventCtorArg = hEvent, hCompletionPortCtorArg = hCompletionPort)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Lineinitializeexparams0) return false
        if (this.hEvent != other.hEvent) return false
        if (this.hCompletionPort != other.hCompletionPort) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hEvent.hashCode()
        result = 31 * result + this.hCompletionPort.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hEvent: Handle = MutPtr(0L),
            hCompletionPort: Handle = MutPtr(0L),
        ): Lineinitializeexparams0 =
            Lineinitializeexparams0(
                hEventCtorArg = hEvent,
                hCompletionPortCtorArg = hCompletionPort,
            )
    }
}

public class Linelocationentry(
    public var dwPermanentLocationID: UInt = 0u,
    public var dwLocationNameSize: UInt = 0u,
    public var dwLocationNameOffset: UInt = 0u,
    public var dwCountryCode: UInt = 0u,
    public var dwCityCodeSize: UInt = 0u,
    public var dwCityCodeOffset: UInt = 0u,
    public var dwPreferredCardID: UInt = 0u,
    public var dwLocalAccessCodeSize: UInt = 0u,
    public var dwLocalAccessCodeOffset: UInt = 0u,
    public var dwLongDistanceAccessCodeSize: UInt = 0u,
    public var dwLongDistanceAccessCodeOffset: UInt = 0u,
    public var dwTollPrefixListSize: UInt = 0u,
    public var dwTollPrefixListOffset: UInt = 0u,
    public var dwCountryID: UInt = 0u,
    public var dwOptions: UInt = 0u,
    public var dwCancelCallWaitingSize: UInt = 0u,
    public var dwCancelCallWaitingOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linelocationentry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linelocationentry> {
                override val sizeBytes: Long = 68L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Linelocationentry =
                    Linelocationentry(
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                    )
                override fun writeNative(addr: Long, value: Linelocationentry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwPermanentLocationID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwLocationNameSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwLocationNameOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwCountryCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwCityCodeSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwCityCodeOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwPreferredCardID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwLocalAccessCodeSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwLocalAccessCodeOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.dwLongDistanceAccessCodeSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.dwLongDistanceAccessCodeOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.dwTollPrefixListSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.dwTollPrefixListOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.dwCountryID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.dwOptions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.dwCancelCallWaitingSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.dwCancelCallWaitingOffset)
                }
            }
    }
}

public data class Linemediacontrolcallstate(
    public var dwCallStates: UInt = 0u,
    public var dwMediaControl: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linemediacontrolcallstate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linemediacontrolcallstate> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Linemediacontrolcallstate =
                    Linemediacontrolcallstate(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Linemediacontrolcallstate) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwCallStates)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwMediaControl)
                }
            }
    }
}

public data class Linemediacontroldigit(
    public var dwDigit: UInt = 0u,
    public var dwDigitModes: UInt = 0u,
    public var dwMediaControl: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linemediacontroldigit> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linemediacontroldigit> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Linemediacontroldigit =
                    Linemediacontroldigit(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Linemediacontroldigit) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwDigit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwDigitModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwMediaControl)
                }
            }
    }
}

public data class Linemediacontrolmedia(
    public var dwMediaModes: UInt = 0u,
    public var dwDuration: UInt = 0u,
    public var dwMediaControl: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linemediacontrolmedia> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linemediacontrolmedia> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Linemediacontrolmedia =
                    Linemediacontrolmedia(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Linemediacontrolmedia) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwMediaModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwDuration)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwMediaControl)
                }
            }
    }
}

public data class Linemediacontroltone(
    public var dwAppSpecific: UInt = 0u,
    public var dwDuration: UInt = 0u,
    public var dwFrequency1: UInt = 0u,
    public var dwFrequency2: UInt = 0u,
    public var dwFrequency3: UInt = 0u,
    public var dwMediaControl: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linemediacontroltone> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linemediacontroltone> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Linemediacontroltone =
                    Linemediacontroltone(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: Linemediacontroltone) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwAppSpecific)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwDuration)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwFrequency1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwFrequency2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwFrequency3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwMediaControl)
                }
            }
    }
}

public data class Linemessage(
    public var hDevice: UInt = 0u,
    public var dwMessageID: UInt = 0u,
    public var dwCallbackInstance: Int = 0,
    public var dwParam1: Int = 0,
    public var dwParam2: Int = 0,
    public var dwParam3: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linemessage> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linemessage> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Linemessage =
                    Linemessage(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: Linemessage) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hDevice)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwMessageID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.dwCallbackInstance)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.dwParam1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 24L, value.dwParam2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 32L, value.dwParam3)
                }
            }
    }
}

public data class Linemonitortone(
    public var dwAppSpecific: UInt = 0u,
    public var dwDuration: UInt = 0u,
    public var dwFrequency1: UInt = 0u,
    public var dwFrequency2: UInt = 0u,
    public var dwFrequency3: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linemonitortone> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linemonitortone> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Linemonitortone =
                    Linemonitortone(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Linemonitortone) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwAppSpecific)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwDuration)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwFrequency1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwFrequency2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwFrequency3)
                }
            }
    }
}

public data class Lineproviderentry(
    public var dwPermanentProviderID: UInt = 0u,
    public var dwProviderFilenameSize: UInt = 0u,
    public var dwProviderFilenameOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineproviderentry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineproviderentry> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Lineproviderentry =
                    Lineproviderentry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Lineproviderentry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwPermanentProviderID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwProviderFilenameSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwProviderFilenameOffset)
                }
            }
    }
}

public data class Lineproviderlist(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwNumProviders: UInt = 0u,
    public var dwProviderListSize: UInt = 0u,
    public var dwProviderListOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineproviderlist> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineproviderlist> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Lineproviderlist =
                    Lineproviderlist(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: Lineproviderlist) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwTotalSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwNeededSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwUsedSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwNumProviders)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwProviderListSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwProviderListOffset)
                }
            }
    }
}

public data class Lineproxyrequest(
    public var dwSize: UInt = 0u,
    public var dwClientMachineNameSize: UInt = 0u,
    public var dwClientMachineNameOffset: UInt = 0u,
    public var dwClientUserNameSize: UInt = 0u,
    public var dwClientUserNameOffset: UInt = 0u,
    public var dwClientAppAPIVersion: UInt = 0u,
    public var dwRequestType: UInt = 0u,
    public var anonymous: Lineproxyrequest0 = Lineproxyrequest0(),
)

public class Lineproxyrequest0(
    public var setAgentGroup: Lineproxyrequest00 = Lineproxyrequest00(),
    public var setAgentState: Lineproxyrequest01 = Lineproxyrequest01(),
    public var setAgentActivity: Lineproxyrequest02 = Lineproxyrequest02(),
    public var getAgentCaps: Lineproxyrequest03 = Lineproxyrequest03(),
    public var getAgentStatus: Lineproxyrequest04 = Lineproxyrequest04(),
    public var agentSpecific: Lineproxyrequest05 = Lineproxyrequest05(),
    public var getAgentActivityList: Lineproxyrequest06 = Lineproxyrequest06(),
    public var getAgentGroupList: Lineproxyrequest07 = Lineproxyrequest07(),
    public var createAgent: Lineproxyrequest08 = Lineproxyrequest08(),
    public var setAgentStateEx: Lineproxyrequest09 = Lineproxyrequest09(),
    public var setAgentMeasurementPeriod: Lineproxyrequest010 = Lineproxyrequest010(),
    public var getAgentInfo: Lineproxyrequest011 = Lineproxyrequest011(),
    public var createAgentSession: Lineproxyrequest012 = Lineproxyrequest012(),
    public var getAgentSessionList: Lineproxyrequest013 = Lineproxyrequest013(),
    public var getAgentSessionInfo: Lineproxyrequest014 = Lineproxyrequest014(),
    public var setAgentSessionState: Lineproxyrequest015 = Lineproxyrequest015(),
    public var getQueueList: Lineproxyrequest016 = Lineproxyrequest016(),
    public var setQueueMeasurementPeriod: Lineproxyrequest017 = Lineproxyrequest017(),
    public var getQueueInfo: Lineproxyrequest018 = Lineproxyrequest018(),
    public var getGroupList: Lineproxyrequest019 = Lineproxyrequest019(),
)

public data class Lineproxyrequest05(
    public var dwAddressID: UInt = 0u,
    public var dwAgentExtensionIDIndex: UInt = 0u,
    public var dwSize: UInt = 0u,
    public var params: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Lineproxyrequest05) return false
        if (this.dwAddressID != other.dwAddressID) return false
        if (this.dwAgentExtensionIDIndex != other.dwAgentExtensionIDIndex) return false
        if (this.dwSize != other.dwSize) return false
        if (!this.params.contentEquals(other.params)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwAddressID.hashCode()
        result = 31 * result + this.dwAgentExtensionIDIndex.hashCode()
        result = 31 * result + this.dwSize.hashCode()
        result = 31 * result + this.params.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineproxyrequest05> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineproxyrequest05> {
                override val sizeBytes: Long = 13L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Lineproxyrequest05 =
                    Lineproxyrequest05(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Lineproxyrequest05) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwAddressID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwAgentExtensionIDIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 12L, value.params)
                }
            }
    }
}

public data class Lineproxyrequest012(
    public var hAgentSession: UInt = 0u,
    public var dwAgentPINSize: UInt = 0u,
    public var dwAgentPINOffset: UInt = 0u,
    public var hAgent: UInt = 0u,
    public var groupID: Guid = Guid(),
    public var dwWorkingAddressID: UInt = 0u,
)

public data class Lineproxyrequest08(
    public var hAgent: UInt = 0u,
    public var dwAgentIDSize: UInt = 0u,
    public var dwAgentIDOffset: UInt = 0u,
    public var dwAgentPINSize: UInt = 0u,
    public var dwAgentPINOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineproxyrequest08> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineproxyrequest08> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Lineproxyrequest08 =
                    Lineproxyrequest08(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Lineproxyrequest08) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hAgent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwAgentIDSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwAgentIDOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwAgentPINSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwAgentPINOffset)
                }
            }
    }
}

public data class Lineproxyrequest06(
    public var dwAddressID: UInt = 0u,
    public var activityList: Lineagentactivitylist = Lineagentactivitylist(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineproxyrequest06> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineproxyrequest06> {
                override val sizeBytes: Long = 28L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Lineproxyrequest06 =
                    Lineproxyrequest06(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (Lineagentactivitylist.typeLayout()).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Lineproxyrequest06) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwAddressID)
                    (Lineagentactivitylist.typeLayout()).writeNative(addr + 4L, value.activityList)
                }
            }
    }
}

public data class Lineproxyrequest03(
    public var dwAddressID: UInt = 0u,
    public var agentCaps: Lineagentcaps = Lineagentcaps(),
)

public data class Lineproxyrequest07(
    public var dwAddressID: UInt = 0u,
    public var groupList: Lineagentgrouplist = Lineagentgrouplist(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineproxyrequest07> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineproxyrequest07> {
                override val sizeBytes: Long = 28L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Lineproxyrequest07 =
                    Lineproxyrequest07(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (Lineagentgrouplist.typeLayout()).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Lineproxyrequest07) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwAddressID)
                    (Lineagentgrouplist.typeLayout()).writeNative(addr + 4L, value.groupList)
                }
            }
    }
}

public data class Lineproxyrequest011(
    public var hAgent: UInt = 0u,
    public var agentInfo: Lineagentinfo = Lineagentinfo(),
)

public data class Lineproxyrequest014(
    public var hAgentSession: UInt = 0u,
    public var sessionInfo: Lineagentsessioninfo = Lineagentsessioninfo(),
)

public data class Lineproxyrequest013(
    public var hAgent: UInt = 0u,
    public var sessionList: Lineagentsessionlist = Lineagentsessionlist(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineproxyrequest013> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineproxyrequest013> {
                override val sizeBytes: Long = 28L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Lineproxyrequest013 =
                    Lineproxyrequest013(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (Lineagentsessionlist.typeLayout()).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Lineproxyrequest013) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hAgent)
                    (Lineagentsessionlist.typeLayout()).writeNative(addr + 4L, value.sessionList)
                }
            }
    }
}

public data class Lineproxyrequest04(
    public var dwAddressID: UInt = 0u,
    public var agentStatus: Lineagentstatus = Lineagentstatus(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineproxyrequest04> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineproxyrequest04> {
                override val sizeBytes: Long = 60L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Lineproxyrequest04 =
                    Lineproxyrequest04(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (Lineagentstatus.typeLayout()).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Lineproxyrequest04) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwAddressID)
                    (Lineagentstatus.typeLayout()).writeNative(addr + 4L, value.agentStatus)
                }
            }
    }
}

public data class Lineproxyrequest019(
    public var groupList: Lineagentgrouplist = Lineagentgrouplist(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineproxyrequest019> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineproxyrequest019> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Lineproxyrequest019 =
                    Lineproxyrequest019(
                        (Lineagentgrouplist.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Lineproxyrequest019) {
                    (Lineagentgrouplist.typeLayout()).writeNative(addr, value.groupList)
                }
            }
    }
}

public data class Lineproxyrequest018(
    public var dwQueueID: UInt = 0u,
    public var queueInfo: Linequeueinfo = Linequeueinfo(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineproxyrequest018> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineproxyrequest018> {
                override val sizeBytes: Long = 56L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Lineproxyrequest018 =
                    Lineproxyrequest018(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (Linequeueinfo.typeLayout()).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Lineproxyrequest018) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwQueueID)
                    (Linequeueinfo.typeLayout()).writeNative(addr + 4L, value.queueInfo)
                }
            }
    }
}

public data class Lineproxyrequest016(
    public var groupID: Guid = Guid(),
    public var queueList: Linequeuelist = Linequeuelist(),
)

public data class Lineproxyrequest02(
    public var dwAddressID: UInt = 0u,
    public var dwActivityID: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineproxyrequest02> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineproxyrequest02> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Lineproxyrequest02 =
                    Lineproxyrequest02(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Lineproxyrequest02) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwAddressID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwActivityID)
                }
            }
    }
}

public data class Lineproxyrequest00(
    public var dwAddressID: UInt = 0u,
    public var groupList: Lineagentgrouplist = Lineagentgrouplist(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineproxyrequest00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineproxyrequest00> {
                override val sizeBytes: Long = 28L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Lineproxyrequest00 =
                    Lineproxyrequest00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (Lineagentgrouplist.typeLayout()).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Lineproxyrequest00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwAddressID)
                    (Lineagentgrouplist.typeLayout()).writeNative(addr + 4L, value.groupList)
                }
            }
    }
}

public data class Lineproxyrequest010(
    public var hAgent: UInt = 0u,
    public var dwMeasurementPeriod: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineproxyrequest010> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineproxyrequest010> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Lineproxyrequest010 =
                    Lineproxyrequest010(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Lineproxyrequest010) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hAgent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwMeasurementPeriod)
                }
            }
    }
}

public data class Lineproxyrequest015(
    public var hAgentSession: UInt = 0u,
    public var dwAgentSessionState: UInt = 0u,
    public var dwNextAgentSessionState: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineproxyrequest015> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineproxyrequest015> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Lineproxyrequest015 =
                    Lineproxyrequest015(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Lineproxyrequest015) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hAgentSession)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwAgentSessionState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwNextAgentSessionState)
                }
            }
    }
}

public data class Lineproxyrequest09(
    public var hAgent: UInt = 0u,
    public var dwAgentState: UInt = 0u,
    public var dwNextAgentState: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineproxyrequest09> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineproxyrequest09> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Lineproxyrequest09 =
                    Lineproxyrequest09(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Lineproxyrequest09) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hAgent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwAgentState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwNextAgentState)
                }
            }
    }
}

public data class Lineproxyrequest01(
    public var dwAddressID: UInt = 0u,
    public var dwAgentState: UInt = 0u,
    public var dwNextAgentState: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineproxyrequest01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineproxyrequest01> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Lineproxyrequest01 =
                    Lineproxyrequest01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Lineproxyrequest01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwAddressID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwAgentState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwNextAgentState)
                }
            }
    }
}

public data class Lineproxyrequest017(
    public var dwQueueID: UInt = 0u,
    public var dwMeasurementPeriod: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineproxyrequest017> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineproxyrequest017> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Lineproxyrequest017 =
                    Lineproxyrequest017(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Lineproxyrequest017) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwQueueID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwMeasurementPeriod)
                }
            }
    }
}

public data class Lineproxyrequestlist(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwNumEntries: UInt = 0u,
    public var dwListSize: UInt = 0u,
    public var dwListOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineproxyrequestlist> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lineproxyrequestlist> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Lineproxyrequestlist =
                    Lineproxyrequestlist(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: Lineproxyrequestlist) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwTotalSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwNeededSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwUsedSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwNumEntries)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwListSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwListOffset)
                }
            }
    }
}

public data class Linequeueentry(
    public var dwQueueID: UInt = 0u,
    public var dwNameSize: UInt = 0u,
    public var dwNameOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linequeueentry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linequeueentry> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Linequeueentry =
                    Linequeueentry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Linequeueentry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwQueueID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwNameSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwNameOffset)
                }
            }
    }
}

public data class Linequeueinfo(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwMeasurementPeriod: UInt = 0u,
    public var dwTotalCallsQueued: UInt = 0u,
    public var dwCurrentCallsQueued: UInt = 0u,
    public var dwTotalCallsAbandoned: UInt = 0u,
    public var dwTotalCallsFlowedIn: UInt = 0u,
    public var dwTotalCallsFlowedOut: UInt = 0u,
    public var dwLongestEverWaitTime: UInt = 0u,
    public var dwCurrentLongestWaitTime: UInt = 0u,
    public var dwAverageWaitTime: UInt = 0u,
    public var dwFinalDisposition: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linequeueinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linequeueinfo> {
                override val sizeBytes: Long = 52L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Linequeueinfo =
                    Linequeueinfo(
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: Linequeueinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwTotalSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwNeededSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwUsedSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwMeasurementPeriod)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwTotalCallsQueued)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwCurrentCallsQueued)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwTotalCallsAbandoned)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwTotalCallsFlowedIn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwTotalCallsFlowedOut)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.dwLongestEverWaitTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.dwCurrentLongestWaitTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.dwAverageWaitTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.dwFinalDisposition)
                }
            }
    }
}

public data class Linequeuelist(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwNumEntries: UInt = 0u,
    public var dwListSize: UInt = 0u,
    public var dwListOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linequeuelist> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linequeuelist> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Linequeuelist =
                    Linequeuelist(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: Linequeuelist) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwTotalSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwNeededSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwUsedSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwNumEntries)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwListSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwListOffset)
                }
            }
    }
}

public data class Linereqmakecall(
    public var szDestAddress: ByteArray = ByteArray(80),
    public var szAppName: ByteArray = ByteArray(40),
    public var szCalledParty: ByteArray = ByteArray(40),
    public var szComment: ByteArray = ByteArray(80),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Linereqmakecall) return false
        if (!this.szDestAddress.contentEquals(other.szDestAddress)) return false
        if (!this.szAppName.contentEquals(other.szAppName)) return false
        if (!this.szCalledParty.contentEquals(other.szCalledParty)) return false
        if (!this.szComment.contentEquals(other.szComment)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szDestAddress.contentHashCode()
        result = 31 * result + this.szAppName.contentHashCode()
        result = 31 * result + this.szCalledParty.contentHashCode()
        result = 31 * result + this.szComment.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linereqmakecall> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linereqmakecall> {
                override val sizeBytes: Long = 240L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Linereqmakecall =
                    Linereqmakecall(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (80).toInt())
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (40).toInt())
                        ).readNative(addr + 80L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (40).toInt())
                        ).readNative(addr + 120L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (80).toInt())
                        ).readNative(addr + 160L),
                    )
                override fun writeNative(addr: Long, value: Linereqmakecall) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (80).toInt())
                    ).writeNative(addr, value.szDestAddress)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (40).toInt())
                    ).writeNative(addr + 80L, value.szAppName)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (40).toInt())
                    ).writeNative(addr + 120L, value.szCalledParty)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (80).toInt())
                    ).writeNative(addr + 160L, value.szComment)
                }
            }
    }
}

public data class Linereqmakecallw(
    public var szDestAddress: UShortArray = UShortArray(80),
    public var szAppName: UShortArray = UShortArray(40),
    public var szCalledParty: UShortArray = UShortArray(40),
    public var szComment: UShortArray = UShortArray(80),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Linereqmakecallw) return false
        if (!this.szDestAddress.contentEquals(other.szDestAddress)) return false
        if (!this.szAppName.contentEquals(other.szAppName)) return false
        if (!this.szCalledParty.contentEquals(other.szCalledParty)) return false
        if (!this.szComment.contentEquals(other.szComment)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szDestAddress.contentHashCode()
        result = 31 * result + this.szAppName.contentHashCode()
        result = 31 * result + this.szCalledParty.contentHashCode()
        result = 31 * result + this.szComment.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linereqmakecallw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linereqmakecallw> {
                override val sizeBytes: Long = 480L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Linereqmakecallw =
                    Linereqmakecallw(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (80).toInt())
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (40).toInt())
                        ).readNative(addr + 160L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (40).toInt())
                        ).readNative(addr + 240L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (80).toInt())
                        ).readNative(addr + 320L),
                    )
                override fun writeNative(addr: Long, value: Linereqmakecallw) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (80).toInt())
                    ).writeNative(addr, value.szDestAddress)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (40).toInt())
                    ).writeNative(addr + 160L, value.szAppName)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (40).toInt())
                    ).writeNative(addr + 240L, value.szCalledParty)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (80).toInt())
                    ).writeNative(addr + 320L, value.szComment)
                }
            }
    }
}

public class Linereqmediacall internal constructor(
    hWndCtorArg: Hwnd,
    public var wRequestID: Wparam,
    public var szDeviceClass: ByteArray,
    public var ucDeviceID: UByteArray,
    public var dwSize: UInt,
    public var dwSecure: UInt,
    public var szDestAddress: ByteArray,
    public var szAppName: ByteArray,
    public var szCalledParty: ByteArray,
    public var szComment: ByteArray,
) {
    public var hWnd: Hwnd = hWndCtorArg
        internal set

    public constructor() : this(
        hWndCtorArg = MutPtr(0L),
        wRequestID = 0uL,
        szDeviceClass = ByteArray(40),
        ucDeviceID = UByteArray(40),
        dwSize = 0u,
        dwSecure = 0u,
        szDestAddress = ByteArray(80),
        szAppName = ByteArray(40),
        szCalledParty = ByteArray(40),
        szComment = ByteArray(80),
    )

    public operator fun component1(): Hwnd = this.hWnd

    public operator fun component2(): Wparam = this.wRequestID

    public operator fun component3(): ByteArray = this.szDeviceClass

    public operator fun component4(): UByteArray = this.ucDeviceID

    public operator fun component5(): UInt = this.dwSize

    public operator fun component6(): UInt = this.dwSecure

    public operator fun component7(): ByteArray = this.szDestAddress

    public operator fun component8(): ByteArray = this.szAppName

    public operator fun component9(): ByteArray = this.szCalledParty

    public operator fun component10(): ByteArray = this.szComment

    public fun copy(hWnd: Hwnd = this.hWnd, wRequestID: Wparam = this.wRequestID, szDeviceClass: ByteArray = this.szDeviceClass, ucDeviceID: UByteArray = this.ucDeviceID, dwSize: UInt = this.dwSize, dwSecure: UInt = this.dwSecure, szDestAddress: ByteArray = this.szDestAddress, szAppName: ByteArray = this.szAppName, szCalledParty: ByteArray = this.szCalledParty, szComment: ByteArray = this.szComment): Linereqmediacall = Linereqmediacall(hWndCtorArg = hWnd, wRequestID = wRequestID, szDeviceClass = szDeviceClass, ucDeviceID = ucDeviceID, dwSize = dwSize, dwSecure = dwSecure, szDestAddress = szDestAddress, szAppName = szAppName, szCalledParty = szCalledParty, szComment = szComment)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Linereqmediacall) return false
        if (this.hWnd != other.hWnd) return false
        if (this.wRequestID != other.wRequestID) return false
        if (!this.szDeviceClass.contentEquals(other.szDeviceClass)) return false
        if (!this.ucDeviceID.contentEquals(other.ucDeviceID)) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwSecure != other.dwSecure) return false
        if (!this.szDestAddress.contentEquals(other.szDestAddress)) return false
        if (!this.szAppName.contentEquals(other.szAppName)) return false
        if (!this.szCalledParty.contentEquals(other.szCalledParty)) return false
        if (!this.szComment.contentEquals(other.szComment)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hWnd.hashCode()
        result = 31 * result + this.wRequestID.hashCode()
        result = 31 * result + this.szDeviceClass.contentHashCode()
        result = 31 * result + this.ucDeviceID.contentHashCode()
        result = 31 * result + this.dwSize.hashCode()
        result = 31 * result + this.dwSecure.hashCode()
        result = 31 * result + this.szDestAddress.contentHashCode()
        result = 31 * result + this.szAppName.contentHashCode()
        result = 31 * result + this.szCalledParty.contentHashCode()
        result = 31 * result + this.szComment.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hWnd: Hwnd = MutPtr(0L),
            wRequestID: Wparam = 0uL,
            szDeviceClass: ByteArray = ByteArray(40),
            ucDeviceID: UByteArray = UByteArray(40),
            dwSize: UInt = 0u,
            dwSecure: UInt = 0u,
            szDestAddress: ByteArray = ByteArray(80),
            szAppName: ByteArray = ByteArray(40),
            szCalledParty: ByteArray = ByteArray(40),
            szComment: ByteArray = ByteArray(80),
        ): Linereqmediacall =
            Linereqmediacall(
                hWndCtorArg = hWnd,
                wRequestID = wRequestID,
                szDeviceClass = szDeviceClass,
                ucDeviceID = ucDeviceID,
                dwSize = dwSize,
                dwSecure = dwSecure,
                szDestAddress = szDestAddress,
                szAppName = szAppName,
                szCalledParty = szCalledParty,
                szComment = szComment,
            )
    }
}

public class Linereqmediacallw internal constructor(
    hWndCtorArg: Hwnd,
    public var wRequestID: Wparam,
    public var szDeviceClass: UShortArray,
    public var ucDeviceID: UByteArray,
    public var dwSize: UInt,
    public var dwSecure: UInt,
    public var szDestAddress: UShortArray,
    public var szAppName: UShortArray,
    public var szCalledParty: UShortArray,
    public var szComment: UShortArray,
) {
    public var hWnd: Hwnd = hWndCtorArg
        internal set

    public constructor() : this(
        hWndCtorArg = MutPtr(0L),
        wRequestID = 0uL,
        szDeviceClass = UShortArray(40),
        ucDeviceID = UByteArray(40),
        dwSize = 0u,
        dwSecure = 0u,
        szDestAddress = UShortArray(80),
        szAppName = UShortArray(40),
        szCalledParty = UShortArray(40),
        szComment = UShortArray(80),
    )

    public operator fun component1(): Hwnd = this.hWnd

    public operator fun component2(): Wparam = this.wRequestID

    public operator fun component3(): UShortArray = this.szDeviceClass

    public operator fun component4(): UByteArray = this.ucDeviceID

    public operator fun component5(): UInt = this.dwSize

    public operator fun component6(): UInt = this.dwSecure

    public operator fun component7(): UShortArray = this.szDestAddress

    public operator fun component8(): UShortArray = this.szAppName

    public operator fun component9(): UShortArray = this.szCalledParty

    public operator fun component10(): UShortArray = this.szComment

    public fun copy(hWnd: Hwnd = this.hWnd, wRequestID: Wparam = this.wRequestID, szDeviceClass: UShortArray = this.szDeviceClass, ucDeviceID: UByteArray = this.ucDeviceID, dwSize: UInt = this.dwSize, dwSecure: UInt = this.dwSecure, szDestAddress: UShortArray = this.szDestAddress, szAppName: UShortArray = this.szAppName, szCalledParty: UShortArray = this.szCalledParty, szComment: UShortArray = this.szComment): Linereqmediacallw = Linereqmediacallw(hWndCtorArg = hWnd, wRequestID = wRequestID, szDeviceClass = szDeviceClass, ucDeviceID = ucDeviceID, dwSize = dwSize, dwSecure = dwSecure, szDestAddress = szDestAddress, szAppName = szAppName, szCalledParty = szCalledParty, szComment = szComment)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Linereqmediacallw) return false
        if (this.hWnd != other.hWnd) return false
        if (this.wRequestID != other.wRequestID) return false
        if (!this.szDeviceClass.contentEquals(other.szDeviceClass)) return false
        if (!this.ucDeviceID.contentEquals(other.ucDeviceID)) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwSecure != other.dwSecure) return false
        if (!this.szDestAddress.contentEquals(other.szDestAddress)) return false
        if (!this.szAppName.contentEquals(other.szAppName)) return false
        if (!this.szCalledParty.contentEquals(other.szCalledParty)) return false
        if (!this.szComment.contentEquals(other.szComment)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hWnd.hashCode()
        result = 31 * result + this.wRequestID.hashCode()
        result = 31 * result + this.szDeviceClass.contentHashCode()
        result = 31 * result + this.ucDeviceID.contentHashCode()
        result = 31 * result + this.dwSize.hashCode()
        result = 31 * result + this.dwSecure.hashCode()
        result = 31 * result + this.szDestAddress.contentHashCode()
        result = 31 * result + this.szAppName.contentHashCode()
        result = 31 * result + this.szCalledParty.contentHashCode()
        result = 31 * result + this.szComment.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hWnd: Hwnd = MutPtr(0L),
            wRequestID: Wparam = 0uL,
            szDeviceClass: UShortArray = UShortArray(40),
            ucDeviceID: UByteArray = UByteArray(40),
            dwSize: UInt = 0u,
            dwSecure: UInt = 0u,
            szDestAddress: UShortArray = UShortArray(80),
            szAppName: UShortArray = UShortArray(40),
            szCalledParty: UShortArray = UShortArray(40),
            szComment: UShortArray = UShortArray(80),
        ): Linereqmediacallw =
            Linereqmediacallw(
                hWndCtorArg = hWnd,
                wRequestID = wRequestID,
                szDeviceClass = szDeviceClass,
                ucDeviceID = ucDeviceID,
                dwSize = dwSize,
                dwSecure = dwSecure,
                szDestAddress = szDestAddress,
                szAppName = szAppName,
                szCalledParty = szCalledParty,
                szComment = szComment,
            )
    }
}

public data class Linetermcaps(
    public var dwTermDev: UInt = 0u,
    public var dwTermModes: UInt = 0u,
    public var dwTermSharing: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linetermcaps> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linetermcaps> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Linetermcaps =
                    Linetermcaps(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Linetermcaps) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwTermDev)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwTermModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwTermSharing)
                }
            }
    }
}

public data class Linetranslatecaps(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwNumLocations: UInt = 0u,
    public var dwLocationListSize: UInt = 0u,
    public var dwLocationListOffset: UInt = 0u,
    public var dwCurrentLocationID: UInt = 0u,
    public var dwNumCards: UInt = 0u,
    public var dwCardListSize: UInt = 0u,
    public var dwCardListOffset: UInt = 0u,
    public var dwCurrentPreferredCardID: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linetranslatecaps> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linetranslatecaps> {
                override val sizeBytes: Long = 44L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Linetranslatecaps =
                    Linetranslatecaps(
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
                override fun writeNative(addr: Long, value: Linetranslatecaps) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwTotalSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwNeededSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwUsedSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwNumLocations)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwLocationListSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwLocationListOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwCurrentLocationID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwNumCards)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwCardListSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.dwCardListOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.dwCurrentPreferredCardID)
                }
            }
    }
}

public data class Linetranslateoutput(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwDialableStringSize: UInt = 0u,
    public var dwDialableStringOffset: UInt = 0u,
    public var dwDisplayableStringSize: UInt = 0u,
    public var dwDisplayableStringOffset: UInt = 0u,
    public var dwCurrentCountry: UInt = 0u,
    public var dwDestCountry: UInt = 0u,
    public var dwTranslateResults: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linetranslateoutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linetranslateoutput> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Linetranslateoutput =
                    Linetranslateoutput(
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
                    )
                override fun writeNative(addr: Long, value: Linetranslateoutput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwTotalSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwNeededSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwUsedSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwDialableStringSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwDialableStringOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwDisplayableStringSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwDisplayableStringOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwCurrentCountry)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwDestCountry)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.dwTranslateResults)
                }
            }
    }
}

public class MspEventInfo internal constructor(
    public var dwSize: UInt,
    public var event: MspEvent,
    hCallCtorArg: MutPtr<Int>,
    public var anonymous: MspEventInfo0,
) {
    public var hCall: MutPtr<Int> = hCallCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        event = 0,
        hCallCtorArg = MutPtr(0L),
        anonymous = MspEventInfo0(),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): MspEvent = this.event

    public operator fun component3(): MutPtr<Int> = this.hCall

    public operator fun component4(): MspEventInfo0 = this.anonymous

    public fun copy(dwSize: UInt = this.dwSize, event: MspEvent = this.event, hCall: MutPtr<Int> = this.hCall, anonymous: MspEventInfo0 = this.anonymous): MspEventInfo = MspEventInfo(dwSize = dwSize, event = event, hCallCtorArg = hCall, anonymous = anonymous)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MspEventInfo) return false
        if (this.dwSize != other.dwSize) return false
        if (this.event != other.event) return false
        if (this.hCall != other.hCall) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.event.hashCode()
        result = 31 * result + this.hCall.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            event: MspEvent = 0,
            hCall: MutPtr<Int> = MutPtr(0L),
            anonymous: MspEventInfo0 = MspEventInfo0(),
        ): MspEventInfo =
            MspEventInfo(
                dwSize = dwSize,
                event = event,
                hCallCtorArg = hCall,
                anonymous = anonymous,
            )
    }
}

public data class MspEventInfo0(
    public var mspAddressEventInfo: MspEventInfo00 = MspEventInfo00(),
    public var mspCallEventInfo: MspEventInfo01 = MspEventInfo01(),
    public var mspTspData: MspEventInfo02 = MspEventInfo02(),
    public var mspPrivateEventInfo: MspEventInfo03 = MspEventInfo03(),
    public var mspFileTerminalEventInfo: MspEventInfo04 = MspEventInfo04(),
    public var mspAsrTerminalEventInfo: MspEventInfo05 = MspEventInfo05(),
    public var mspTtsTerminalEventInfo: MspEventInfo06 = MspEventInfo06(),
    public var mspToneTerminalEventInfo: MspEventInfo07 = MspEventInfo07(),
)

public class MspEventInfo00 internal constructor(
    public var type: MspAddressEvent,
    pTerminalCtorArg: MutPtr<CVoid>,
) {
    public var pTerminal: MutPtr<CVoid> = pTerminalCtorArg
        internal set

    public constructor() : this(
        type = 0,
        pTerminalCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MspAddressEvent = this.type

    public operator fun component2(): MutPtr<CVoid> = this.pTerminal

    public fun copy(type: MspAddressEvent = this.type, pTerminal: MutPtr<CVoid> = this.pTerminal): MspEventInfo00 = MspEventInfo00(type = type, pTerminalCtorArg = pTerminal)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MspEventInfo00) return false
        if (this.type != other.type) return false
        if (this.pTerminal != other.pTerminal) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.pTerminal.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MspEventInfo00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MspEventInfo00> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): MspEventInfo00 =
                    MspEventInfo00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MspEventInfo00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.type)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.pTerminal)
                }
            }

        public operator fun invoke(
            type: MspAddressEvent = 0,
            pTerminal: MutPtr<CVoid> = MutPtr(0L),
        ): MspEventInfo00 =
            MspEventInfo00(
                type = type,
                pTerminalCtorArg = pTerminal,
            )
    }
}

public class MspEventInfo05 internal constructor(
    pASRTerminalCtorArg: MutPtr<CVoid>,
    public var hrErrorCode: Hresult,
) {
    public var pASRTerminal: MutPtr<CVoid> = pASRTerminalCtorArg
        internal set

    public constructor() : this(
        pASRTerminalCtorArg = MutPtr(0L),
        hrErrorCode = 0,
    )

    public operator fun component1(): MutPtr<CVoid> = this.pASRTerminal

    public operator fun component2(): Hresult = this.hrErrorCode

    public fun copy(pASRTerminal: MutPtr<CVoid> = this.pASRTerminal, hrErrorCode: Hresult = this.hrErrorCode): MspEventInfo05 = MspEventInfo05(pASRTerminalCtorArg = pASRTerminal, hrErrorCode = hrErrorCode)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MspEventInfo05) return false
        if (this.pASRTerminal != other.pASRTerminal) return false
        if (this.hrErrorCode != other.hrErrorCode) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pASRTerminal.hashCode()
        result = 31 * result + this.hrErrorCode.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pASRTerminal: MutPtr<CVoid> = MutPtr(0L),
            hrErrorCode: Hresult = 0,
        ): MspEventInfo05 =
            MspEventInfo05(
                pASRTerminalCtorArg = pASRTerminal,
                hrErrorCode = hrErrorCode,
            )
    }
}

public class MspEventInfo01 internal constructor(
    public var type: MspCallEvent,
    public var cause: MspCallEventCause,
    pStreamCtorArg: MutPtr<CVoid>,
    pTerminalCtorArg: MutPtr<CVoid>,
    public var hrError: Hresult,
) {
    public var pStream: MutPtr<CVoid> = pStreamCtorArg
        internal set

    public var pTerminal: MutPtr<CVoid> = pTerminalCtorArg
        internal set

    public constructor() : this(
        type = 0,
        cause = 0,
        pStreamCtorArg = MutPtr(0L),
        pTerminalCtorArg = MutPtr(0L),
        hrError = 0,
    )

    public operator fun component1(): MspCallEvent = this.type

    public operator fun component2(): MspCallEventCause = this.cause

    public operator fun component3(): MutPtr<CVoid> = this.pStream

    public operator fun component4(): MutPtr<CVoid> = this.pTerminal

    public operator fun component5(): Hresult = this.hrError

    public fun copy(type: MspCallEvent = this.type, cause: MspCallEventCause = this.cause, pStream: MutPtr<CVoid> = this.pStream, pTerminal: MutPtr<CVoid> = this.pTerminal, hrError: Hresult = this.hrError): MspEventInfo01 = MspEventInfo01(type = type, cause = cause, pStreamCtorArg = pStream, pTerminalCtorArg = pTerminal, hrError = hrError)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MspEventInfo01) return false
        if (this.type != other.type) return false
        if (this.cause != other.cause) return false
        if (this.pStream != other.pStream) return false
        if (this.pTerminal != other.pTerminal) return false
        if (this.hrError != other.hrError) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.cause.hashCode()
        result = 31 * result + this.pStream.hashCode()
        result = 31 * result + this.pTerminal.hashCode()
        result = 31 * result + this.hrError.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            type: MspCallEvent = 0,
            cause: MspCallEventCause = 0,
            pStream: MutPtr<CVoid> = MutPtr(0L),
            pTerminal: MutPtr<CVoid> = MutPtr(0L),
            hrError: Hresult = 0,
        ): MspEventInfo01 =
            MspEventInfo01(
                type = type,
                cause = cause,
                pStreamCtorArg = pStream,
                pTerminalCtorArg = pTerminal,
                hrError = hrError,
            )
    }
}

public class MspEventInfo04 internal constructor(
    pParentFileTerminalCtorArg: MutPtr<CVoid>,
    pFileTrackCtorArg: MutPtr<CVoid>,
    public var terminalMediaState: TerminalMediaState,
    public var ftecEventCause: FtStateEventCause,
    public var hrErrorCode: Hresult,
) {
    public var pParentFileTerminal: MutPtr<CVoid> = pParentFileTerminalCtorArg
        internal set

    public var pFileTrack: MutPtr<CVoid> = pFileTrackCtorArg
        internal set

    public constructor() : this(
        pParentFileTerminalCtorArg = MutPtr(0L),
        pFileTrackCtorArg = MutPtr(0L),
        terminalMediaState = 0,
        ftecEventCause = 0,
        hrErrorCode = 0,
    )

    public operator fun component1(): MutPtr<CVoid> = this.pParentFileTerminal

    public operator fun component2(): MutPtr<CVoid> = this.pFileTrack

    public operator fun component3(): TerminalMediaState = this.terminalMediaState

    public operator fun component4(): FtStateEventCause = this.ftecEventCause

    public operator fun component5(): Hresult = this.hrErrorCode

    public fun copy(pParentFileTerminal: MutPtr<CVoid> = this.pParentFileTerminal, pFileTrack: MutPtr<CVoid> = this.pFileTrack, terminalMediaState: TerminalMediaState = this.terminalMediaState, ftecEventCause: FtStateEventCause = this.ftecEventCause, hrErrorCode: Hresult = this.hrErrorCode): MspEventInfo04 = MspEventInfo04(pParentFileTerminalCtorArg = pParentFileTerminal, pFileTrackCtorArg = pFileTrack, terminalMediaState = terminalMediaState, ftecEventCause = ftecEventCause, hrErrorCode = hrErrorCode)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MspEventInfo04) return false
        if (this.pParentFileTerminal != other.pParentFileTerminal) return false
        if (this.pFileTrack != other.pFileTrack) return false
        if (this.terminalMediaState != other.terminalMediaState) return false
        if (this.ftecEventCause != other.ftecEventCause) return false
        if (this.hrErrorCode != other.hrErrorCode) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pParentFileTerminal.hashCode()
        result = 31 * result + this.pFileTrack.hashCode()
        result = 31 * result + this.terminalMediaState.hashCode()
        result = 31 * result + this.ftecEventCause.hashCode()
        result = 31 * result + this.hrErrorCode.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pParentFileTerminal: MutPtr<CVoid> = MutPtr(0L),
            pFileTrack: MutPtr<CVoid> = MutPtr(0L),
            terminalMediaState: TerminalMediaState = 0,
            ftecEventCause: FtStateEventCause = 0,
            hrErrorCode: Hresult = 0,
        ): MspEventInfo04 =
            MspEventInfo04(
                pParentFileTerminalCtorArg = pParentFileTerminal,
                pFileTrackCtorArg = pFileTrack,
                terminalMediaState = terminalMediaState,
                ftecEventCause = ftecEventCause,
                hrErrorCode = hrErrorCode,
            )
    }
}

public class MspEventInfo03 internal constructor(
    pEventCtorArg: MutPtr<CVoid>,
    public var lEventCode: Int,
) {
    public var pEvent: MutPtr<CVoid> = pEventCtorArg
        internal set

    public constructor() : this(
        pEventCtorArg = MutPtr(0L),
        lEventCode = 0,
    )

    public operator fun component1(): MutPtr<CVoid> = this.pEvent

    public operator fun component2(): Int = this.lEventCode

    public fun copy(pEvent: MutPtr<CVoid> = this.pEvent, lEventCode: Int = this.lEventCode): MspEventInfo03 = MspEventInfo03(pEventCtorArg = pEvent, lEventCode = lEventCode)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MspEventInfo03) return false
        if (this.pEvent != other.pEvent) return false
        if (this.lEventCode != other.lEventCode) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pEvent.hashCode()
        result = 31 * result + this.lEventCode.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MspEventInfo03> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MspEventInfo03> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): MspEventInfo03 =
                    MspEventInfo03(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MspEventInfo03) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.pEvent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.lEventCode)
                }
            }

        public operator fun invoke(
            pEvent: MutPtr<CVoid> = MutPtr(0L),
            lEventCode: Int = 0,
        ): MspEventInfo03 =
            MspEventInfo03(
                pEventCtorArg = pEvent,
                lEventCode = lEventCode,
            )
    }
}

public class MspEventInfo07 internal constructor(
    pToneTerminalCtorArg: MutPtr<CVoid>,
    public var hrErrorCode: Hresult,
) {
    public var pToneTerminal: MutPtr<CVoid> = pToneTerminalCtorArg
        internal set

    public constructor() : this(
        pToneTerminalCtorArg = MutPtr(0L),
        hrErrorCode = 0,
    )

    public operator fun component1(): MutPtr<CVoid> = this.pToneTerminal

    public operator fun component2(): Hresult = this.hrErrorCode

    public fun copy(pToneTerminal: MutPtr<CVoid> = this.pToneTerminal, hrErrorCode: Hresult = this.hrErrorCode): MspEventInfo07 = MspEventInfo07(pToneTerminalCtorArg = pToneTerminal, hrErrorCode = hrErrorCode)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MspEventInfo07) return false
        if (this.pToneTerminal != other.pToneTerminal) return false
        if (this.hrErrorCode != other.hrErrorCode) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pToneTerminal.hashCode()
        result = 31 * result + this.hrErrorCode.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pToneTerminal: MutPtr<CVoid> = MutPtr(0L),
            hrErrorCode: Hresult = 0,
        ): MspEventInfo07 =
            MspEventInfo07(
                pToneTerminalCtorArg = pToneTerminal,
                hrErrorCode = hrErrorCode,
            )
    }
}

public data class MspEventInfo02(
    public var dwBufferSize: UInt = 0u,
    public var pBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MspEventInfo02) return false
        if (this.dwBufferSize != other.dwBufferSize) return false
        if (!this.pBuffer.contentEquals(other.pBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwBufferSize.hashCode()
        result = 31 * result + this.pBuffer.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MspEventInfo02> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MspEventInfo02> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): MspEventInfo02 =
                    MspEventInfo02(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: MspEventInfo02) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwBufferSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 4L, value.pBuffer)
                }
            }
    }
}

public class MspEventInfo06 internal constructor(
    pTTSTerminalCtorArg: MutPtr<CVoid>,
    public var hrErrorCode: Hresult,
) {
    public var pTTSTerminal: MutPtr<CVoid> = pTTSTerminalCtorArg
        internal set

    public constructor() : this(
        pTTSTerminalCtorArg = MutPtr(0L),
        hrErrorCode = 0,
    )

    public operator fun component1(): MutPtr<CVoid> = this.pTTSTerminal

    public operator fun component2(): Hresult = this.hrErrorCode

    public fun copy(pTTSTerminal: MutPtr<CVoid> = this.pTTSTerminal, hrErrorCode: Hresult = this.hrErrorCode): MspEventInfo06 = MspEventInfo06(pTTSTerminalCtorArg = pTTSTerminal, hrErrorCode = hrErrorCode)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MspEventInfo06) return false
        if (this.pTTSTerminal != other.pTTSTerminal) return false
        if (this.hrErrorCode != other.hrErrorCode) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pTTSTerminal.hashCode()
        result = 31 * result + this.hrErrorCode.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pTTSTerminal: MutPtr<CVoid> = MutPtr(0L),
            hrErrorCode: Hresult = 0,
        ): MspEventInfo06 =
            MspEventInfo06(
                pTTSTerminalCtorArg = pTTSTerminal,
                hrErrorCode = hrErrorCode,
            )
    }
}

public data class Nsid(
    public var dwSize: UInt = 0u,
    public var uchType: UByteArray = UByteArray(16),
    public var xtype: UInt = 0u,
    public var lTime: Int = 0,
    public var address: Nsid0 = Nsid0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Nsid) return false
        if (this.dwSize != other.dwSize) return false
        if (!this.uchType.contentEquals(other.uchType)) return false
        if (this.xtype != other.xtype) return false
        if (this.lTime != other.lTime) return false
        if (this.address != other.address) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.uchType.contentHashCode()
        result = 31 * result + this.xtype.hashCode()
        result = 31 * result + this.lTime.hashCode()
        result = 31 * result + this.address.hashCode()
        return result
    }
}

public data class Nsid0(
    public var alias: Addralias = Addralias(),
    public var rgchInterNet: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Nsid0) return false
        if (this.alias != other.alias) return false
        if (!this.rgchInterNet.contentEquals(other.rgchInterNet)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.alias.hashCode()
        result = 31 * result + this.rgchInterNet.contentHashCode()
        return result
    }
}

public data class Phonebuttoninfo(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwButtonMode: UInt = 0u,
    public var dwButtonFunction: UInt = 0u,
    public var dwButtonTextSize: UInt = 0u,
    public var dwButtonTextOffset: UInt = 0u,
    public var dwDevSpecificSize: UInt = 0u,
    public var dwDevSpecificOffset: UInt = 0u,
    public var dwButtonState: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Phonebuttoninfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Phonebuttoninfo> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Phonebuttoninfo =
                    Phonebuttoninfo(
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
                    )
                override fun writeNative(addr: Long, value: Phonebuttoninfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwTotalSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwNeededSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwUsedSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwButtonMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwButtonFunction)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwButtonTextSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwButtonTextOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwDevSpecificSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwDevSpecificOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.dwButtonState)
                }
            }
    }
}

public class Phonecaps(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwProviderInfoSize: UInt = 0u,
    public var dwProviderInfoOffset: UInt = 0u,
    public var dwPhoneInfoSize: UInt = 0u,
    public var dwPhoneInfoOffset: UInt = 0u,
    public var dwPermanentPhoneID: UInt = 0u,
    public var dwPhoneNameSize: UInt = 0u,
    public var dwPhoneNameOffset: UInt = 0u,
    public var dwStringFormat: UInt = 0u,
    public var dwPhoneStates: UInt = 0u,
    public var dwHookSwitchDevs: UInt = 0u,
    public var dwHandsetHookSwitchModes: UInt = 0u,
    public var dwSpeakerHookSwitchModes: UInt = 0u,
    public var dwHeadsetHookSwitchModes: UInt = 0u,
    public var dwVolumeFlags: UInt = 0u,
    public var dwGainFlags: UInt = 0u,
    public var dwDisplayNumRows: UInt = 0u,
    public var dwDisplayNumColumns: UInt = 0u,
    public var dwNumRingModes: UInt = 0u,
    public var dwNumButtonLamps: UInt = 0u,
    public var dwButtonModesSize: UInt = 0u,
    public var dwButtonModesOffset: UInt = 0u,
    public var dwButtonFunctionsSize: UInt = 0u,
    public var dwButtonFunctionsOffset: UInt = 0u,
    public var dwLampModesSize: UInt = 0u,
    public var dwLampModesOffset: UInt = 0u,
    public var dwNumSetData: UInt = 0u,
    public var dwSetDataSize: UInt = 0u,
    public var dwSetDataOffset: UInt = 0u,
    public var dwNumGetData: UInt = 0u,
    public var dwGetDataSize: UInt = 0u,
    public var dwGetDataOffset: UInt = 0u,
    public var dwDevSpecificSize: UInt = 0u,
    public var dwDevSpecificOffset: UInt = 0u,
    public var dwDeviceClassesSize: UInt = 0u,
    public var dwDeviceClassesOffset: UInt = 0u,
    public var dwPhoneFeatures: UInt = 0u,
    public var dwSettableHandsetHookSwitchModes: UInt = 0u,
    public var dwSettableSpeakerHookSwitchModes: UInt = 0u,
    public var dwSettableHeadsetHookSwitchModes: UInt = 0u,
    public var dwMonitoredHandsetHookSwitchModes: UInt = 0u,
    public var dwMonitoredSpeakerHookSwitchModes: UInt = 0u,
    public var dwMonitoredHeadsetHookSwitchModes: UInt = 0u,
    public var permanentPhoneGuid: Guid = Guid(),
)

public data class Phoneextensionid(
    public var dwExtensionID0: UInt = 0u,
    public var dwExtensionID1: UInt = 0u,
    public var dwExtensionID2: UInt = 0u,
    public var dwExtensionID3: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Phoneextensionid> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Phoneextensionid> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Phoneextensionid =
                    Phoneextensionid(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Phoneextensionid) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwExtensionID0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwExtensionID1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwExtensionID2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwExtensionID3)
                }
            }
    }
}

public data class Phoneinitializeexparams(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwOptions: UInt = 0u,
    public var handles: Phoneinitializeexparams0 = Phoneinitializeexparams0(),
    public var dwCompletionKey: UInt = 0u,
)

public class Phoneinitializeexparams0 internal constructor(
    hEventCtorArg: Handle,
    hCompletionPortCtorArg: Handle,
) {
    public var hEvent: Handle = hEventCtorArg
        internal set

    public var hCompletionPort: Handle = hCompletionPortCtorArg
        internal set

    public constructor() : this(
        hEventCtorArg = MutPtr(0L),
        hCompletionPortCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Handle = this.hEvent

    public operator fun component2(): Handle = this.hCompletionPort

    public fun copy(hEvent: Handle = this.hEvent, hCompletionPort: Handle = this.hCompletionPort): Phoneinitializeexparams0 = Phoneinitializeexparams0(hEventCtorArg = hEvent, hCompletionPortCtorArg = hCompletionPort)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Phoneinitializeexparams0) return false
        if (this.hEvent != other.hEvent) return false
        if (this.hCompletionPort != other.hCompletionPort) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hEvent.hashCode()
        result = 31 * result + this.hCompletionPort.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hEvent: Handle = MutPtr(0L),
            hCompletionPort: Handle = MutPtr(0L),
        ): Phoneinitializeexparams0 =
            Phoneinitializeexparams0(
                hEventCtorArg = hEvent,
                hCompletionPortCtorArg = hCompletionPort,
            )
    }
}

public data class Phonemessage(
    public var hDevice: UInt = 0u,
    public var dwMessageID: UInt = 0u,
    public var dwCallbackInstance: Int = 0,
    public var dwParam1: Int = 0,
    public var dwParam2: Int = 0,
    public var dwParam3: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Phonemessage> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Phonemessage> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Phonemessage =
                    Phonemessage(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: Phonemessage) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hDevice)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwMessageID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.dwCallbackInstance)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.dwParam1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 24L, value.dwParam2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 32L, value.dwParam3)
                }
            }
    }
}

public class Phonestatus(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwStatusFlags: UInt = 0u,
    public var dwNumOwners: UInt = 0u,
    public var dwNumMonitors: UInt = 0u,
    public var dwRingMode: UInt = 0u,
    public var dwRingVolume: UInt = 0u,
    public var dwHandsetHookSwitchMode: UInt = 0u,
    public var dwHandsetVolume: UInt = 0u,
    public var dwHandsetGain: UInt = 0u,
    public var dwSpeakerHookSwitchMode: UInt = 0u,
    public var dwSpeakerVolume: UInt = 0u,
    public var dwSpeakerGain: UInt = 0u,
    public var dwHeadsetHookSwitchMode: UInt = 0u,
    public var dwHeadsetVolume: UInt = 0u,
    public var dwHeadsetGain: UInt = 0u,
    public var dwDisplaySize: UInt = 0u,
    public var dwDisplayOffset: UInt = 0u,
    public var dwLampModesSize: UInt = 0u,
    public var dwLampModesOffset: UInt = 0u,
    public var dwOwnerNameSize: UInt = 0u,
    public var dwOwnerNameOffset: UInt = 0u,
    public var dwDevSpecificSize: UInt = 0u,
    public var dwDevSpecificOffset: UInt = 0u,
    public var dwPhoneFeatures: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Phonestatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Phonestatus> {
                override val sizeBytes: Long = 104L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Phonestatus =
                    Phonestatus(
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 84L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 92L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 100L),
                    )
                override fun writeNative(addr: Long, value: Phonestatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwTotalSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwNeededSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwUsedSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwStatusFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwNumOwners)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwNumMonitors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwRingMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwRingVolume)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwHandsetHookSwitchMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.dwHandsetVolume)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.dwHandsetGain)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.dwSpeakerHookSwitchMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.dwSpeakerVolume)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.dwSpeakerGain)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.dwHeadsetHookSwitchMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.dwHeadsetVolume)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.dwHeadsetGain)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.dwDisplaySize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.dwDisplayOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 76L, value.dwLampModesSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 80L, value.dwLampModesOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 84L, value.dwOwnerNameSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 88L, value.dwOwnerNameOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 92L, value.dwDevSpecificSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 96L, value.dwDevSpecificOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 100L, value.dwPhoneFeatures)
                }
            }
    }
}

public data class Renddata(
    public var atyp: UShort = 0u,
    public var ulPosition: UInt = 0u,
    public var dxWidth: UShort = 0u,
    public var dyHeight: UShort = 0u,
    public var dwFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Renddata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Renddata> {
                override val sizeBytes: Long = 14L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Renddata =
                    Renddata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 10L),
                    )
                override fun writeNative(addr: Long, value: Renddata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.atyp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 2L, value.ulPosition)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.dxWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.dyHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 10L, value.dwFlags)
                }
            }
    }
}

public data class STnefProblem(
    public var ulComponent: UInt = 0u,
    public var ulAttribute: UInt = 0u,
    public var ulPropTag: UInt = 0u,
    public var scode: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<STnefProblem> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<STnefProblem> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): STnefProblem =
                    STnefProblem(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: STnefProblem) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ulComponent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ulAttribute)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ulPropTag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.scode)
                }
            }
    }
}

public data class STnefProblemArray(
    public var cProblem: UInt = 0u,
    public var aProblem: List<STnefProblem> = List(1) { STnefProblem() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<STnefProblemArray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<STnefProblemArray> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): STnefProblemArray =
                    STnefProblemArray(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(STnefProblem.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: STnefProblemArray) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cProblem)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(STnefProblem.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.aProblem)
                }
            }
    }
}

public data class TapiCustomtone(
    public var dwFrequency: UInt = 0u,
    public var dwCadenceOn: UInt = 0u,
    public var dwCadenceOff: UInt = 0u,
    public var dwVolume: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TapiCustomtone> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TapiCustomtone> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): TapiCustomtone =
                    TapiCustomtone(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: TapiCustomtone) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwFrequency)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwCadenceOn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwCadenceOff)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwVolume)
                }
            }
    }
}

public data class TapiDetecttone(
    public var dwAppSpecific: UInt = 0u,
    public var dwDuration: UInt = 0u,
    public var dwFrequency1: UInt = 0u,
    public var dwFrequency2: UInt = 0u,
    public var dwFrequency3: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TapiDetecttone> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TapiDetecttone> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): TapiDetecttone =
                    TapiDetecttone(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: TapiDetecttone) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwAppSpecific)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwDuration)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwFrequency1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwFrequency2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwFrequency3)
                }
            }
    }
}

public data class Trp(
    public var trpid: UShort = 0u,
    public var cbgrtrp: UShort = 0u,
    public var cch: UShort = 0u,
    public var cbRgb: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Trp> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Trp> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): Trp =
                    Trp(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: Trp) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.trpid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.cbgrtrp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.cch)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.cbRgb)
                }
            }
    }
}

public class Tuispicreatedialoginstanceparams internal constructor(
    public var dwRequestID: UInt,
    hdDlgInstCtorArg: Hdrvdialoginstance,
    public var htDlgInst: UInt,
    lpszUIDLLNameCtorArg: Pcwstr,
    lpParamsCtorArg: MutPtr<CVoid>,
    public var dwSize: UInt,
) {
    public var hdDlgInst: Hdrvdialoginstance = hdDlgInstCtorArg
        internal set

    public var lpszUIDLLName: Pcwstr = lpszUIDLLNameCtorArg
        internal set

    public var lpParams: MutPtr<CVoid> = lpParamsCtorArg
        internal set

    public constructor() : this(
        dwRequestID = 0u,
        hdDlgInstCtorArg = MutPtr(0L),
        htDlgInst = 0u,
        lpszUIDLLNameCtorArg = ConstPtr(0L),
        lpParamsCtorArg = MutPtr(0L),
        dwSize = 0u,
    )

    public operator fun component1(): UInt = this.dwRequestID

    public operator fun component2(): Hdrvdialoginstance = this.hdDlgInst

    public operator fun component3(): UInt = this.htDlgInst

    public operator fun component4(): Pcwstr = this.lpszUIDLLName

    public operator fun component5(): MutPtr<CVoid> = this.lpParams

    public operator fun component6(): UInt = this.dwSize

    public fun copy(dwRequestID: UInt = this.dwRequestID, hdDlgInst: Hdrvdialoginstance = this.hdDlgInst, htDlgInst: UInt = this.htDlgInst, lpszUIDLLName: Pcwstr = this.lpszUIDLLName, lpParams: MutPtr<CVoid> = this.lpParams, dwSize: UInt = this.dwSize): Tuispicreatedialoginstanceparams = Tuispicreatedialoginstanceparams(dwRequestID = dwRequestID, hdDlgInstCtorArg = hdDlgInst, htDlgInst = htDlgInst, lpszUIDLLNameCtorArg = lpszUIDLLName, lpParamsCtorArg = lpParams, dwSize = dwSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Tuispicreatedialoginstanceparams) return false
        if (this.dwRequestID != other.dwRequestID) return false
        if (this.hdDlgInst != other.hdDlgInst) return false
        if (this.htDlgInst != other.htDlgInst) return false
        if (this.lpszUIDLLName != other.lpszUIDLLName) return false
        if (this.lpParams != other.lpParams) return false
        if (this.dwSize != other.dwSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwRequestID.hashCode()
        result = 31 * result + this.hdDlgInst.hashCode()
        result = 31 * result + this.htDlgInst.hashCode()
        result = 31 * result + this.lpszUIDLLName.hashCode()
        result = 31 * result + this.lpParams.hashCode()
        result = 31 * result + this.dwSize.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwRequestID: UInt = 0u,
            hdDlgInst: Hdrvdialoginstance = MutPtr(0L),
            htDlgInst: UInt = 0u,
            lpszUIDLLName: Pcwstr = ConstPtr(0L),
            lpParams: MutPtr<CVoid> = MutPtr(0L),
            dwSize: UInt = 0u,
        ): Tuispicreatedialoginstanceparams =
            Tuispicreatedialoginstanceparams(
                dwRequestID = dwRequestID,
                hdDlgInstCtorArg = hdDlgInst,
                htDlgInst = htDlgInst,
                lpszUIDLLNameCtorArg = lpszUIDLLName,
                lpParamsCtorArg = lpParams,
                dwSize = dwSize,
            )
    }
}

public data class Varstring(
    public var dwTotalSize: UInt = 0u,
    public var dwNeededSize: UInt = 0u,
    public var dwUsedSize: UInt = 0u,
    public var dwStringFormat: UInt = 0u,
    public var dwStringSize: UInt = 0u,
    public var dwStringOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Varstring> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Varstring> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Varstring =
                    Varstring(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: Varstring) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwTotalSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwNeededSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwUsedSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwStringFormat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwStringSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwStringOffset)
                }
            }
    }
}
