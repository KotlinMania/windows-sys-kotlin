package io.github.kotlinmania.windowssys.windows.win32.system.variant

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Systemtime

public expect fun clearVariantArray(pvars: MutPtr<Variant>, cvars: UInt)

public expect fun dosDateTimeToVariantTime(wdosdate: UShort, wdostime: UShort, pvtime: MutPtr<Double>): Int

public expect fun initVariantFromBooleanArray(prgf: ConstPtr<Bool>, celems: UInt, pvar: MutPtr<Variant>): Hresult

public expect fun initVariantFromBuffer(pv: ConstPtr<CVoid>, cb: UInt, pvar: MutPtr<Variant>): Hresult

public expect fun initVariantFromDoubleArray(prgn: ConstPtr<Double>, celems: UInt, pvar: MutPtr<Variant>): Hresult

public expect fun initVariantFromFileTime(pft: ConstPtr<Filetime>, pvar: MutPtr<Variant>): Hresult

public expect fun initVariantFromFileTimeArray(prgft: ConstPtr<Filetime>, celems: UInt, pvar: MutPtr<Variant>): Hresult

public expect fun initVariantFromGUIDAsString(guid: ConstPtr<Guid>, pvar: MutPtr<Variant>): Hresult

public expect fun initVariantFromInt16Array(prgn: ConstPtr<Short>, celems: UInt, pvar: MutPtr<Variant>): Hresult

public expect fun initVariantFromInt32Array(prgn: ConstPtr<Int>, celems: UInt, pvar: MutPtr<Variant>): Hresult

public expect fun initVariantFromInt64Array(prgn: ConstPtr<Long>, celems: UInt, pvar: MutPtr<Variant>): Hresult

public expect fun initVariantFromResource(hinst: Hinstance, id: UInt, pvar: MutPtr<Variant>): Hresult

public expect fun initVariantFromStringArray(prgsz: ConstPtr<Pcwstr>, celems: UInt, pvar: MutPtr<Variant>): Hresult

public expect fun initVariantFromUInt16Array(prgn: ConstPtr<UShort>, celems: UInt, pvar: MutPtr<Variant>): Hresult

public expect fun initVariantFromUInt32Array(prgn: ConstPtr<UInt>, celems: UInt, pvar: MutPtr<Variant>): Hresult

public expect fun initVariantFromUInt64Array(prgn: ConstPtr<ULong>, celems: UInt, pvar: MutPtr<Variant>): Hresult

public expect fun initVariantFromVariantArrayElem(varin: ConstPtr<Variant>, ielem: UInt, pvar: MutPtr<Variant>): Hresult

public expect fun systemTimeToVariantTime(lpsystemtime: ConstPtr<Systemtime>, pvtime: MutPtr<Double>): Int

public expect fun variantUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Variant>)

public expect fun variantUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Variant>)

public expect fun variantUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Variant>): MutPtr<UByte>

public expect fun variantUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Variant>): MutPtr<UByte>

public expect fun variantUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Variant>): UInt

public expect fun variantUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Variant>): UInt

public expect fun variantUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Variant>): MutPtr<UByte>

public expect fun variantUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Variant>): MutPtr<UByte>

public expect fun variantChangeType(pvargdest: MutPtr<Variant>, pvarsrc: ConstPtr<Variant>, wflags: VarChangeFlags, vt: Varenum): Hresult

public expect fun variantChangeTypeEx(pvargdest: MutPtr<Variant>, pvarsrc: ConstPtr<Variant>, lcid: UInt, wflags: VarChangeFlags, vt: Varenum): Hresult

public expect fun variantClear(pvarg: MutPtr<Variant>): Hresult

public expect fun variantCompare(var1: ConstPtr<Variant>, var2: ConstPtr<Variant>): Int

public expect fun variantCopy(pvargdest: MutPtr<Variant>, pvargsrc: ConstPtr<Variant>): Hresult

public expect fun variantCopyInd(pvardest: MutPtr<Variant>, pvargsrc: ConstPtr<Variant>): Hresult

public expect fun variantGetBooleanElem(variable: ConstPtr<Variant>, ielem: UInt, pfval: MutPtr<Bool>): Hresult

public expect fun variantGetDoubleElem(variable: ConstPtr<Variant>, ielem: UInt, pnval: MutPtr<Double>): Hresult

public expect fun variantGetElementCount(varin: ConstPtr<Variant>): UInt

public expect fun variantGetInt16Elem(variable: ConstPtr<Variant>, ielem: UInt, pnval: MutPtr<Short>): Hresult

public expect fun variantGetInt32Elem(variable: ConstPtr<Variant>, ielem: UInt, pnval: MutPtr<Int>): Hresult

public expect fun variantGetInt64Elem(variable: ConstPtr<Variant>, ielem: UInt, pnval: MutPtr<Long>): Hresult

public expect fun variantGetStringElem(variable: ConstPtr<Variant>, ielem: UInt, ppszval: MutPtr<Pwstr>): Hresult

public expect fun variantGetUInt16Elem(variable: ConstPtr<Variant>, ielem: UInt, pnval: MutPtr<UShort>): Hresult

public expect fun variantGetUInt32Elem(variable: ConstPtr<Variant>, ielem: UInt, pnval: MutPtr<UInt>): Hresult

public expect fun variantGetUInt64Elem(variable: ConstPtr<Variant>, ielem: UInt, pnval: MutPtr<ULong>): Hresult

public expect fun variantInit(pvarg: MutPtr<Variant>)

public expect fun variantTimeToDosDateTime(vtime: Double, pwdosdate: MutPtr<UShort>, pwdostime: MutPtr<UShort>): Int

public expect fun variantTimeToSystemTime(vtime: Double, lpsystemtime: MutPtr<Systemtime>): Int

public expect fun variantToBoolean(varin: ConstPtr<Variant>, pfret: MutPtr<Bool>): Hresult

public expect fun variantToBooleanArray(variable: ConstPtr<Variant>, prgf: MutPtr<Bool>, crgn: UInt, pcelem: MutPtr<UInt>): Hresult

public expect fun variantToBooleanArrayAlloc(variable: ConstPtr<Variant>, pprgf: MutPtr<MutPtr<Bool>>, pcelem: MutPtr<UInt>): Hresult

public expect fun variantToBooleanWithDefault(varin: ConstPtr<Variant>, fdefault: Bool): Bool

public expect fun variantToBuffer(varin: ConstPtr<Variant>, pv: MutPtr<CVoid>, cb: UInt): Hresult

public expect fun variantToDosDateTime(varin: ConstPtr<Variant>, pwdate: MutPtr<UShort>, pwtime: MutPtr<UShort>): Hresult

public expect fun variantToDouble(varin: ConstPtr<Variant>, pdblret: MutPtr<Double>): Hresult

public expect fun variantToDoubleArray(variable: ConstPtr<Variant>, prgn: MutPtr<Double>, crgn: UInt, pcelem: MutPtr<UInt>): Hresult

public expect fun variantToDoubleArrayAlloc(variable: ConstPtr<Variant>, pprgn: MutPtr<MutPtr<Double>>, pcelem: MutPtr<UInt>): Hresult

public expect fun variantToDoubleWithDefault(varin: ConstPtr<Variant>, dbldefault: Double): Double

public expect fun variantToFileTime(varin: ConstPtr<Variant>, stfout: PstimeFlags, pftout: MutPtr<Filetime>): Hresult

public expect fun variantToGUID(varin: ConstPtr<Variant>, pguid: MutPtr<Guid>): Hresult

public expect fun variantToInt16(varin: ConstPtr<Variant>, piret: MutPtr<Short>): Hresult

public expect fun variantToInt16Array(variable: ConstPtr<Variant>, prgn: MutPtr<Short>, crgn: UInt, pcelem: MutPtr<UInt>): Hresult

public expect fun variantToInt16ArrayAlloc(variable: ConstPtr<Variant>, pprgn: MutPtr<MutPtr<Short>>, pcelem: MutPtr<UInt>): Hresult

public expect fun variantToInt16WithDefault(varin: ConstPtr<Variant>, idefault: Short): Short

public expect fun variantToInt32(varin: ConstPtr<Variant>, plret: MutPtr<Int>): Hresult

public expect fun variantToInt32Array(variable: ConstPtr<Variant>, prgn: MutPtr<Int>, crgn: UInt, pcelem: MutPtr<UInt>): Hresult

public expect fun variantToInt32ArrayAlloc(variable: ConstPtr<Variant>, pprgn: MutPtr<MutPtr<Int>>, pcelem: MutPtr<UInt>): Hresult

public expect fun variantToInt32WithDefault(varin: ConstPtr<Variant>, ldefault: Int): Int

public expect fun variantToInt64(varin: ConstPtr<Variant>, pllret: MutPtr<Long>): Hresult

public expect fun variantToInt64Array(variable: ConstPtr<Variant>, prgn: MutPtr<Long>, crgn: UInt, pcelem: MutPtr<UInt>): Hresult

public expect fun variantToInt64ArrayAlloc(variable: ConstPtr<Variant>, pprgn: MutPtr<MutPtr<Long>>, pcelem: MutPtr<UInt>): Hresult

public expect fun variantToInt64WithDefault(varin: ConstPtr<Variant>, lldefault: Long): Long

public expect fun variantToString(varin: ConstPtr<Variant>, pszbuf: Pwstr, cchbuf: UInt): Hresult

public expect fun variantToStringAlloc(varin: ConstPtr<Variant>, ppszbuf: MutPtr<Pwstr>): Hresult

public expect fun variantToStringArray(variable: ConstPtr<Variant>, prgsz: MutPtr<Pwstr>, crgsz: UInt, pcelem: MutPtr<UInt>): Hresult

public expect fun variantToStringArrayAlloc(variable: ConstPtr<Variant>, pprgsz: MutPtr<MutPtr<Pwstr>>, pcelem: MutPtr<UInt>): Hresult

public expect fun variantToStringWithDefault(varin: ConstPtr<Variant>, pszdefault: Pcwstr): Pcwstr

public expect fun variantToUInt16(varin: ConstPtr<Variant>, puiret: MutPtr<UShort>): Hresult

public expect fun variantToUInt16Array(variable: ConstPtr<Variant>, prgn: MutPtr<UShort>, crgn: UInt, pcelem: MutPtr<UInt>): Hresult

public expect fun variantToUInt16ArrayAlloc(variable: ConstPtr<Variant>, pprgn: MutPtr<MutPtr<UShort>>, pcelem: MutPtr<UInt>): Hresult

public expect fun variantToUInt16WithDefault(varin: ConstPtr<Variant>, uidefault: UShort): UShort

public expect fun variantToUInt32(varin: ConstPtr<Variant>, pulret: MutPtr<UInt>): Hresult

public expect fun variantToUInt32Array(variable: ConstPtr<Variant>, prgn: MutPtr<UInt>, crgn: UInt, pcelem: MutPtr<UInt>): Hresult

public expect fun variantToUInt32ArrayAlloc(variable: ConstPtr<Variant>, pprgn: MutPtr<MutPtr<UInt>>, pcelem: MutPtr<UInt>): Hresult

public expect fun variantToUInt32WithDefault(varin: ConstPtr<Variant>, uldefault: UInt): UInt

public expect fun variantToUInt64(varin: ConstPtr<Variant>, pullret: MutPtr<ULong>): Hresult

public expect fun variantToUInt64Array(variable: ConstPtr<Variant>, prgn: MutPtr<ULong>, crgn: UInt, pcelem: MutPtr<UInt>): Hresult

public expect fun variantToUInt64ArrayAlloc(variable: ConstPtr<Variant>, pprgn: MutPtr<MutPtr<ULong>>, pcelem: MutPtr<UInt>): Hresult

public expect fun variantToUInt64WithDefault(varin: ConstPtr<Variant>, ulldefault: ULong): ULong
