@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.variant

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantClearVariantArray
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantDosDateTimeToVariantTime
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantInitVariantFromBooleanArray
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantInitVariantFromBuffer
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantInitVariantFromDoubleArray
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantInitVariantFromFileTime
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantInitVariantFromFileTimeArray
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantInitVariantFromGUIDAsString
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantInitVariantFromInt16Array
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantInitVariantFromInt32Array
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantInitVariantFromInt64Array
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantInitVariantFromResource
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantInitVariantFromStringArray
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantInitVariantFromUInt16Array
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantInitVariantFromUInt32Array
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantInitVariantFromUInt64Array
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantInitVariantFromVariantArrayElem
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantSystemTimeToVariantTime
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantChangeType
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantChangeTypeEx
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantClear
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantCompare
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantCopy
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantCopyInd
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantGetBooleanElem
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantGetDoubleElem
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantGetElementCount
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantGetInt16Elem
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantGetInt32Elem
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantGetInt64Elem
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantGetStringElem
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantGetUInt16Elem
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantGetUInt32Elem
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantGetUInt64Elem
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantInit
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantTimeToDosDateTime
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantTimeToSystemTime
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantToBoolean
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantToBooleanArray
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantToBooleanArrayAlloc
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantToBooleanWithDefault
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantToBuffer
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantToDosDateTime
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantToDouble
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantToDoubleArray
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantToDoubleArrayAlloc
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantToDoubleWithDefault
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantToFileTime
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantToGUID
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantToInt16
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantToInt16Array
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantToInt16ArrayAlloc
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantToInt16WithDefault
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantToInt32
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantToInt32Array
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantToInt32ArrayAlloc
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantToInt32WithDefault
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantToInt64
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantToInt64Array
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantToInt64ArrayAlloc
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantToInt64WithDefault
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantToString
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantToStringAlloc
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantToStringArray
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantToStringArrayAlloc
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantToStringWithDefault
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantToUInt16
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantToUInt16Array
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantToUInt16ArrayAlloc
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantToUInt16WithDefault
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantToUInt32
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantToUInt32Array
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantToUInt32ArrayAlloc
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantToUInt32WithDefault
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantToUInt64
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantToUInt64Array
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantToUInt64ArrayAlloc
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantToUInt64WithDefault
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantUserFree
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantUserFree64
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantUserMarshal
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantUserMarshal64
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantUserSize
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantUserSize64
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantUserUnmarshal
import io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssysWindowsWin32SystemVariantVariantUserUnmarshal64
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun clearVariantArray(pvars: MutPtr, cvars: UInt) {
    windowssysWindowsWin32SystemVariantClearVariantArray(pvars.rawAddress.toCPointer<ByteVar>(), cvars)
}

public actual fun dosDateTimeToVariantTime(wdosdate: UShort, wdostime: UShort, pvtime: MutPtr): Int =
    windowssysWindowsWin32SystemVariantDosDateTimeToVariantTime(wdosdate, wdostime, pvtime.rawAddress.toCPointer<ByteVar>())

public actual fun initVariantFromBooleanArray(prgf: ConstPtr, celems: UInt, pvar: MutPtr): Hresult =
    windowssysWindowsWin32SystemVariantInitVariantFromBooleanArray(prgf.rawAddress.toCPointer<ByteVar>(), celems, pvar.rawAddress.toCPointer<ByteVar>())

public actual fun initVariantFromBuffer(pv: ConstPtr, cb: UInt, pvar: MutPtr): Hresult =
    windowssysWindowsWin32SystemVariantInitVariantFromBuffer(pv.rawAddress.toCPointer<ByteVar>(), cb, pvar.rawAddress.toCPointer<ByteVar>())

public actual fun initVariantFromDoubleArray(prgn: ConstPtr, celems: UInt, pvar: MutPtr): Hresult =
    windowssysWindowsWin32SystemVariantInitVariantFromDoubleArray(prgn.rawAddress.toCPointer<ByteVar>(), celems, pvar.rawAddress.toCPointer<ByteVar>())

public actual fun initVariantFromFileTime(pft: ConstPtr, pvar: MutPtr): Hresult =
    windowssysWindowsWin32SystemVariantInitVariantFromFileTime(pft.rawAddress.toCPointer<ByteVar>(), pvar.rawAddress.toCPointer<ByteVar>())

public actual fun initVariantFromFileTimeArray(prgft: ConstPtr, celems: UInt, pvar: MutPtr): Hresult =
    windowssysWindowsWin32SystemVariantInitVariantFromFileTimeArray(prgft.rawAddress.toCPointer<ByteVar>(), celems, pvar.rawAddress.toCPointer<ByteVar>())

public actual fun initVariantFromGUIDAsString(guid: ConstPtr, pvar: MutPtr): Hresult =
    windowssysWindowsWin32SystemVariantInitVariantFromGUIDAsString(guid.rawAddress.toCPointer<ByteVar>(), pvar.rawAddress.toCPointer<ByteVar>())

public actual fun initVariantFromInt16Array(prgn: ConstPtr, celems: UInt, pvar: MutPtr): Hresult =
    windowssysWindowsWin32SystemVariantInitVariantFromInt16Array(prgn.rawAddress.toCPointer<ByteVar>(), celems, pvar.rawAddress.toCPointer<ByteVar>())

public actual fun initVariantFromInt32Array(prgn: ConstPtr, celems: UInt, pvar: MutPtr): Hresult =
    windowssysWindowsWin32SystemVariantInitVariantFromInt32Array(prgn.rawAddress.toCPointer<ByteVar>(), celems, pvar.rawAddress.toCPointer<ByteVar>())

public actual fun initVariantFromInt64Array(prgn: ConstPtr, celems: UInt, pvar: MutPtr): Hresult =
    windowssysWindowsWin32SystemVariantInitVariantFromInt64Array(prgn.rawAddress.toCPointer<ByteVar>(), celems, pvar.rawAddress.toCPointer<ByteVar>())

public actual fun initVariantFromResource(hinst: Hinstance, id: UInt, pvar: MutPtr): Hresult =
    windowssysWindowsWin32SystemVariantInitVariantFromResource(hinst.rawAddress.toCPointer<ByteVar>(), id, pvar.rawAddress.toCPointer<ByteVar>())

public actual fun initVariantFromStringArray(prgsz: ConstPtr, celems: UInt, pvar: MutPtr): Hresult =
    windowssysWindowsWin32SystemVariantInitVariantFromStringArray(prgsz.rawAddress.toCPointer<ByteVar>(), celems, pvar.rawAddress.toCPointer<ByteVar>())

public actual fun initVariantFromUInt16Array(prgn: ConstPtr, celems: UInt, pvar: MutPtr): Hresult =
    windowssysWindowsWin32SystemVariantInitVariantFromUInt16Array(prgn.rawAddress.toCPointer<ByteVar>(), celems, pvar.rawAddress.toCPointer<ByteVar>())

public actual fun initVariantFromUInt32Array(prgn: ConstPtr, celems: UInt, pvar: MutPtr): Hresult =
    windowssysWindowsWin32SystemVariantInitVariantFromUInt32Array(prgn.rawAddress.toCPointer<ByteVar>(), celems, pvar.rawAddress.toCPointer<ByteVar>())

public actual fun initVariantFromUInt64Array(prgn: ConstPtr, celems: UInt, pvar: MutPtr): Hresult =
    windowssysWindowsWin32SystemVariantInitVariantFromUInt64Array(prgn.rawAddress.toCPointer<ByteVar>(), celems, pvar.rawAddress.toCPointer<ByteVar>())

public actual fun initVariantFromVariantArrayElem(varin: ConstPtr, ielem: UInt, pvar: MutPtr): Hresult =
    windowssysWindowsWin32SystemVariantInitVariantFromVariantArrayElem(varin.rawAddress.toCPointer<ByteVar>(), ielem, pvar.rawAddress.toCPointer<ByteVar>())

public actual fun systemTimeToVariantTime(lpsystemtime: ConstPtr, pvtime: MutPtr): Int =
    windowssysWindowsWin32SystemVariantSystemTimeToVariantTime(lpsystemtime.rawAddress.toCPointer<ByteVar>(), pvtime.rawAddress.toCPointer<ByteVar>())

public actual fun variantUserFree(param0: ConstPtr, param1: ConstPtr) {
    windowssysWindowsWin32SystemVariantVariantUserFree(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>())
}

public actual fun variantUserFree64(param0: ConstPtr, param1: ConstPtr) {
    windowssysWindowsWin32SystemVariantVariantUserFree64(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>())
}

public actual fun variantUserMarshal(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr =
    MutPtr(windowssysWindowsWin32SystemVariantVariantUserMarshal(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun variantUserMarshal64(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr =
    MutPtr(windowssysWindowsWin32SystemVariantVariantUserMarshal64(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun variantUserSize(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt =
    windowssysWindowsWin32SystemVariantVariantUserSize(param0.rawAddress.toCPointer<ByteVar>(), param1, param2.rawAddress.toCPointer<ByteVar>())

public actual fun variantUserSize64(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt =
    windowssysWindowsWin32SystemVariantVariantUserSize64(param0.rawAddress.toCPointer<ByteVar>(), param1, param2.rawAddress.toCPointer<ByteVar>())

public actual fun variantUserUnmarshal(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr =
    MutPtr(windowssysWindowsWin32SystemVariantVariantUserUnmarshal(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun variantUserUnmarshal64(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr =
    MutPtr(windowssysWindowsWin32SystemVariantVariantUserUnmarshal64(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun variantChangeType(pvargdest: MutPtr, pvarsrc: ConstPtr, wflags: VarChangeFlags, vt: Varenum): Hresult =
    windowssysWindowsWin32SystemVariantVariantChangeType(pvargdest.rawAddress.toCPointer<ByteVar>(), pvarsrc.rawAddress.toCPointer<ByteVar>(), wflags, vt)

public actual fun variantChangeTypeEx(pvargdest: MutPtr, pvarsrc: ConstPtr, lcid: UInt, wflags: VarChangeFlags, vt: Varenum): Hresult =
    windowssysWindowsWin32SystemVariantVariantChangeTypeEx(pvargdest.rawAddress.toCPointer<ByteVar>(), pvarsrc.rawAddress.toCPointer<ByteVar>(), lcid, wflags, vt)

public actual fun variantClear(pvarg: MutPtr): Hresult =
    windowssysWindowsWin32SystemVariantVariantClear(pvarg.rawAddress.toCPointer<ByteVar>())

public actual fun variantCompare(var1: ConstPtr, var2: ConstPtr): Int =
    windowssysWindowsWin32SystemVariantVariantCompare(var1.rawAddress.toCPointer<ByteVar>(), var2.rawAddress.toCPointer<ByteVar>())

public actual fun variantCopy(pvargdest: MutPtr, pvargsrc: ConstPtr): Hresult =
    windowssysWindowsWin32SystemVariantVariantCopy(pvargdest.rawAddress.toCPointer<ByteVar>(), pvargsrc.rawAddress.toCPointer<ByteVar>())

public actual fun variantCopyInd(pvardest: MutPtr, pvargsrc: ConstPtr): Hresult =
    windowssysWindowsWin32SystemVariantVariantCopyInd(pvardest.rawAddress.toCPointer<ByteVar>(), pvargsrc.rawAddress.toCPointer<ByteVar>())

public actual fun variantGetBooleanElem(variable: ConstPtr, ielem: UInt, pfval: MutPtr): Hresult =
    windowssysWindowsWin32SystemVariantVariantGetBooleanElem(variable.rawAddress.toCPointer<ByteVar>(), ielem, pfval.rawAddress.toCPointer<ByteVar>())

public actual fun variantGetDoubleElem(variable: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    windowssysWindowsWin32SystemVariantVariantGetDoubleElem(variable.rawAddress.toCPointer<ByteVar>(), ielem, pnval.rawAddress.toCPointer<ByteVar>())

public actual fun variantGetElementCount(varin: ConstPtr): UInt =
    windowssysWindowsWin32SystemVariantVariantGetElementCount(varin.rawAddress.toCPointer<ByteVar>())

public actual fun variantGetInt16Elem(variable: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    windowssysWindowsWin32SystemVariantVariantGetInt16Elem(variable.rawAddress.toCPointer<ByteVar>(), ielem, pnval.rawAddress.toCPointer<ByteVar>())

public actual fun variantGetInt32Elem(variable: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    windowssysWindowsWin32SystemVariantVariantGetInt32Elem(variable.rawAddress.toCPointer<ByteVar>(), ielem, pnval.rawAddress.toCPointer<ByteVar>())

public actual fun variantGetInt64Elem(variable: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    windowssysWindowsWin32SystemVariantVariantGetInt64Elem(variable.rawAddress.toCPointer<ByteVar>(), ielem, pnval.rawAddress.toCPointer<ByteVar>())

public actual fun variantGetStringElem(variable: ConstPtr, ielem: UInt, ppszval: MutPtr): Hresult =
    windowssysWindowsWin32SystemVariantVariantGetStringElem(variable.rawAddress.toCPointer<ByteVar>(), ielem, ppszval.rawAddress.toCPointer<ByteVar>())

public actual fun variantGetUInt16Elem(variable: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    windowssysWindowsWin32SystemVariantVariantGetUInt16Elem(variable.rawAddress.toCPointer<ByteVar>(), ielem, pnval.rawAddress.toCPointer<ByteVar>())

public actual fun variantGetUInt32Elem(variable: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    windowssysWindowsWin32SystemVariantVariantGetUInt32Elem(variable.rawAddress.toCPointer<ByteVar>(), ielem, pnval.rawAddress.toCPointer<ByteVar>())

public actual fun variantGetUInt64Elem(variable: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    windowssysWindowsWin32SystemVariantVariantGetUInt64Elem(variable.rawAddress.toCPointer<ByteVar>(), ielem, pnval.rawAddress.toCPointer<ByteVar>())

public actual fun variantInit(pvarg: MutPtr) {
    windowssysWindowsWin32SystemVariantVariantInit(pvarg.rawAddress.toCPointer<ByteVar>())
}

public actual fun variantTimeToDosDateTime(vtime: Double, pwdosdate: MutPtr, pwdostime: MutPtr): Int =
    windowssysWindowsWin32SystemVariantVariantTimeToDosDateTime(vtime, pwdosdate.rawAddress.toCPointer<ByteVar>(), pwdostime.rawAddress.toCPointer<ByteVar>())

public actual fun variantTimeToSystemTime(vtime: Double, lpsystemtime: MutPtr): Int =
    windowssysWindowsWin32SystemVariantVariantTimeToSystemTime(vtime, lpsystemtime.rawAddress.toCPointer<ByteVar>())

public actual fun variantToBoolean(varin: ConstPtr, pfret: MutPtr): Hresult =
    windowssysWindowsWin32SystemVariantVariantToBoolean(varin.rawAddress.toCPointer<ByteVar>(), pfret.rawAddress.toCPointer<ByteVar>())

public actual fun variantToBooleanArray(variable: ConstPtr, prgf: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    windowssysWindowsWin32SystemVariantVariantToBooleanArray(variable.rawAddress.toCPointer<ByteVar>(), prgf.rawAddress.toCPointer<ByteVar>(), crgn, pcelem.rawAddress.toCPointer<ByteVar>())

public actual fun variantToBooleanArrayAlloc(variable: ConstPtr, pprgf: MutPtr, pcelem: MutPtr): Hresult =
    windowssysWindowsWin32SystemVariantVariantToBooleanArrayAlloc(variable.rawAddress.toCPointer<ByteVar>(), pprgf.rawAddress.toCPointer<ByteVar>(), pcelem.rawAddress.toCPointer<ByteVar>())

public actual fun variantToBooleanWithDefault(varin: ConstPtr, fdefault: Bool): Bool =
    windowssysWindowsWin32SystemVariantVariantToBooleanWithDefault(varin.rawAddress.toCPointer<ByteVar>(), fdefault)

public actual fun variantToBuffer(varin: ConstPtr, pv: MutPtr, cb: UInt): Hresult =
    windowssysWindowsWin32SystemVariantVariantToBuffer(varin.rawAddress.toCPointer<ByteVar>(), pv.rawAddress.toCPointer<ByteVar>(), cb)

public actual fun variantToDosDateTime(varin: ConstPtr, pwdate: MutPtr, pwtime: MutPtr): Hresult =
    windowssysWindowsWin32SystemVariantVariantToDosDateTime(varin.rawAddress.toCPointer<ByteVar>(), pwdate.rawAddress.toCPointer<ByteVar>(), pwtime.rawAddress.toCPointer<ByteVar>())

public actual fun variantToDouble(varin: ConstPtr, pdblret: MutPtr): Hresult =
    windowssysWindowsWin32SystemVariantVariantToDouble(varin.rawAddress.toCPointer<ByteVar>(), pdblret.rawAddress.toCPointer<ByteVar>())

public actual fun variantToDoubleArray(variable: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    windowssysWindowsWin32SystemVariantVariantToDoubleArray(variable.rawAddress.toCPointer<ByteVar>(), prgn.rawAddress.toCPointer<ByteVar>(), crgn, pcelem.rawAddress.toCPointer<ByteVar>())

public actual fun variantToDoubleArrayAlloc(variable: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    windowssysWindowsWin32SystemVariantVariantToDoubleArrayAlloc(variable.rawAddress.toCPointer<ByteVar>(), pprgn.rawAddress.toCPointer<ByteVar>(), pcelem.rawAddress.toCPointer<ByteVar>())

public actual fun variantToDoubleWithDefault(varin: ConstPtr, dbldefault: Double): Double =
    windowssysWindowsWin32SystemVariantVariantToDoubleWithDefault(varin.rawAddress.toCPointer<ByteVar>(), dbldefault)

public actual fun variantToFileTime(varin: ConstPtr, stfout: PstimeFlags, pftout: MutPtr): Hresult =
    windowssysWindowsWin32SystemVariantVariantToFileTime(varin.rawAddress.toCPointer<ByteVar>(), stfout, pftout.rawAddress.toCPointer<ByteVar>())

public actual fun variantToGUID(varin: ConstPtr, pguid: MutPtr): Hresult =
    windowssysWindowsWin32SystemVariantVariantToGUID(varin.rawAddress.toCPointer<ByteVar>(), pguid.rawAddress.toCPointer<ByteVar>())

public actual fun variantToInt16(varin: ConstPtr, piret: MutPtr): Hresult =
    windowssysWindowsWin32SystemVariantVariantToInt16(varin.rawAddress.toCPointer<ByteVar>(), piret.rawAddress.toCPointer<ByteVar>())

public actual fun variantToInt16Array(variable: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    windowssysWindowsWin32SystemVariantVariantToInt16Array(variable.rawAddress.toCPointer<ByteVar>(), prgn.rawAddress.toCPointer<ByteVar>(), crgn, pcelem.rawAddress.toCPointer<ByteVar>())

public actual fun variantToInt16ArrayAlloc(variable: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    windowssysWindowsWin32SystemVariantVariantToInt16ArrayAlloc(variable.rawAddress.toCPointer<ByteVar>(), pprgn.rawAddress.toCPointer<ByteVar>(), pcelem.rawAddress.toCPointer<ByteVar>())

public actual fun variantToInt16WithDefault(varin: ConstPtr, idefault: Short): Short =
    windowssysWindowsWin32SystemVariantVariantToInt16WithDefault(varin.rawAddress.toCPointer<ByteVar>(), idefault)

public actual fun variantToInt32(varin: ConstPtr, plret: MutPtr): Hresult =
    windowssysWindowsWin32SystemVariantVariantToInt32(varin.rawAddress.toCPointer<ByteVar>(), plret.rawAddress.toCPointer<ByteVar>())

public actual fun variantToInt32Array(variable: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    windowssysWindowsWin32SystemVariantVariantToInt32Array(variable.rawAddress.toCPointer<ByteVar>(), prgn.rawAddress.toCPointer<ByteVar>(), crgn, pcelem.rawAddress.toCPointer<ByteVar>())

public actual fun variantToInt32ArrayAlloc(variable: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    windowssysWindowsWin32SystemVariantVariantToInt32ArrayAlloc(variable.rawAddress.toCPointer<ByteVar>(), pprgn.rawAddress.toCPointer<ByteVar>(), pcelem.rawAddress.toCPointer<ByteVar>())

public actual fun variantToInt32WithDefault(varin: ConstPtr, ldefault: Int): Int =
    windowssysWindowsWin32SystemVariantVariantToInt32WithDefault(varin.rawAddress.toCPointer<ByteVar>(), ldefault)

public actual fun variantToInt64(varin: ConstPtr, pllret: MutPtr): Hresult =
    windowssysWindowsWin32SystemVariantVariantToInt64(varin.rawAddress.toCPointer<ByteVar>(), pllret.rawAddress.toCPointer<ByteVar>())

public actual fun variantToInt64Array(variable: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    windowssysWindowsWin32SystemVariantVariantToInt64Array(variable.rawAddress.toCPointer<ByteVar>(), prgn.rawAddress.toCPointer<ByteVar>(), crgn, pcelem.rawAddress.toCPointer<ByteVar>())

public actual fun variantToInt64ArrayAlloc(variable: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    windowssysWindowsWin32SystemVariantVariantToInt64ArrayAlloc(variable.rawAddress.toCPointer<ByteVar>(), pprgn.rawAddress.toCPointer<ByteVar>(), pcelem.rawAddress.toCPointer<ByteVar>())

public actual fun variantToInt64WithDefault(varin: ConstPtr, lldefault: Long): Long =
    windowssysWindowsWin32SystemVariantVariantToInt64WithDefault(varin.rawAddress.toCPointer<ByteVar>(), lldefault)

public actual fun variantToString(varin: ConstPtr, pszbuf: Pwstr, cchbuf: UInt): Hresult =
    windowssysWindowsWin32SystemVariantVariantToString(varin.rawAddress.toCPointer<ByteVar>(), pszbuf.rawAddress.toCPointer<ByteVar>(), cchbuf)

public actual fun variantToStringAlloc(varin: ConstPtr, ppszbuf: MutPtr): Hresult =
    windowssysWindowsWin32SystemVariantVariantToStringAlloc(varin.rawAddress.toCPointer<ByteVar>(), ppszbuf.rawAddress.toCPointer<ByteVar>())

public actual fun variantToStringArray(variable: ConstPtr, prgsz: MutPtr, crgsz: UInt, pcelem: MutPtr): Hresult =
    windowssysWindowsWin32SystemVariantVariantToStringArray(variable.rawAddress.toCPointer<ByteVar>(), prgsz.rawAddress.toCPointer<ByteVar>(), crgsz, pcelem.rawAddress.toCPointer<ByteVar>())

public actual fun variantToStringArrayAlloc(variable: ConstPtr, pprgsz: MutPtr, pcelem: MutPtr): Hresult =
    windowssysWindowsWin32SystemVariantVariantToStringArrayAlloc(variable.rawAddress.toCPointer<ByteVar>(), pprgsz.rawAddress.toCPointer<ByteVar>(), pcelem.rawAddress.toCPointer<ByteVar>())

public actual fun variantToStringWithDefault(varin: ConstPtr, pszdefault: Pcwstr): Pcwstr =
    ConstPtr(windowssysWindowsWin32SystemVariantVariantToStringWithDefault(varin.rawAddress.toCPointer<ByteVar>(), pszdefault.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun variantToUInt16(varin: ConstPtr, puiret: MutPtr): Hresult =
    windowssysWindowsWin32SystemVariantVariantToUInt16(varin.rawAddress.toCPointer<ByteVar>(), puiret.rawAddress.toCPointer<ByteVar>())

public actual fun variantToUInt16Array(variable: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    windowssysWindowsWin32SystemVariantVariantToUInt16Array(variable.rawAddress.toCPointer<ByteVar>(), prgn.rawAddress.toCPointer<ByteVar>(), crgn, pcelem.rawAddress.toCPointer<ByteVar>())

public actual fun variantToUInt16ArrayAlloc(variable: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    windowssysWindowsWin32SystemVariantVariantToUInt16ArrayAlloc(variable.rawAddress.toCPointer<ByteVar>(), pprgn.rawAddress.toCPointer<ByteVar>(), pcelem.rawAddress.toCPointer<ByteVar>())

public actual fun variantToUInt16WithDefault(varin: ConstPtr, uidefault: UShort): UShort =
    windowssysWindowsWin32SystemVariantVariantToUInt16WithDefault(varin.rawAddress.toCPointer<ByteVar>(), uidefault)

public actual fun variantToUInt32(varin: ConstPtr, pulret: MutPtr): Hresult =
    windowssysWindowsWin32SystemVariantVariantToUInt32(varin.rawAddress.toCPointer<ByteVar>(), pulret.rawAddress.toCPointer<ByteVar>())

public actual fun variantToUInt32Array(variable: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    windowssysWindowsWin32SystemVariantVariantToUInt32Array(variable.rawAddress.toCPointer<ByteVar>(), prgn.rawAddress.toCPointer<ByteVar>(), crgn, pcelem.rawAddress.toCPointer<ByteVar>())

public actual fun variantToUInt32ArrayAlloc(variable: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    windowssysWindowsWin32SystemVariantVariantToUInt32ArrayAlloc(variable.rawAddress.toCPointer<ByteVar>(), pprgn.rawAddress.toCPointer<ByteVar>(), pcelem.rawAddress.toCPointer<ByteVar>())

public actual fun variantToUInt32WithDefault(varin: ConstPtr, uldefault: UInt): UInt =
    windowssysWindowsWin32SystemVariantVariantToUInt32WithDefault(varin.rawAddress.toCPointer<ByteVar>(), uldefault)

public actual fun variantToUInt64(varin: ConstPtr, pullret: MutPtr): Hresult =
    windowssysWindowsWin32SystemVariantVariantToUInt64(varin.rawAddress.toCPointer<ByteVar>(), pullret.rawAddress.toCPointer<ByteVar>())

public actual fun variantToUInt64Array(variable: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    windowssysWindowsWin32SystemVariantVariantToUInt64Array(variable.rawAddress.toCPointer<ByteVar>(), prgn.rawAddress.toCPointer<ByteVar>(), crgn, pcelem.rawAddress.toCPointer<ByteVar>())

public actual fun variantToUInt64ArrayAlloc(variable: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    windowssysWindowsWin32SystemVariantVariantToUInt64ArrayAlloc(variable.rawAddress.toCPointer<ByteVar>(), pprgn.rawAddress.toCPointer<ByteVar>(), pcelem.rawAddress.toCPointer<ByteVar>())

public actual fun variantToUInt64WithDefault(varin: ConstPtr, ulldefault: ULong): ULong =
    windowssysWindowsWin32SystemVariantVariantToUInt64WithDefault(varin.rawAddress.toCPointer<ByteVar>(), ulldefault)
