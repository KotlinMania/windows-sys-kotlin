@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hglobal
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.system.com.Clsctx
import io.github.kotlinmania.windowssys.windows.win32.system.com.Stgm
import io.github.kotlinmania.windowssys.windows.win32.system.variant.PstimeFlags
import io.github.kotlinmania.windowssys.windows.win32.system.variant.Varenum

private object WindowsWin32SystemComStructuredstorageJniBridge {
    init {
        loadNativeLibrary()
    }

    private fun loadNativeLibrary() {
        val osRaw = System.getProperty("os.name", "").lowercase()
        val archRaw = System.getProperty("os.arch", "").lowercase()
        val hostPlatform =
            when {
                osRaw.contains("win") -> "windows"
                osRaw.contains("mac") || osRaw.contains("darwin") -> "macos"
                else -> "linux"
            }
        val hostArch =
            when {
                archRaw == "aarch64" || archRaw == "arm64" -> "aarch64"
                archRaw == "amd64" || archRaw == "x86_64" -> "x86_64"
                else -> archRaw
            }
        val libFileName =
            when (hostPlatform) {
                "windows" -> "windowssys_jni.dll"
                "macos" -> "libwindowssys_jni.dylib"
                else -> "libwindowssys_jni.so"
            }
        val pathSep = System.getProperty("path.separator", ":")
        val libPathProp = System.getProperty("java.library.path", "")
        for (dirEntry in libPathProp.split(pathSep)) {
            if (dirEntry.isEmpty()) continue
            val candidate = java.io.File(dirEntry, libFileName)
            if (candidate.isFile) {
                System.load(candidate.absolutePath)
                return
            }
        }
        val resourcePath = "io/github/kotlinmania/windowssys/native/$hostPlatform-$hostArch/$libFileName"
        val stream = WindowsWin32SystemComStructuredstorageJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
        if (stream != null) {
            val suffix = "." + libFileName.substringAfterLast('.')
            val extracted =
                java.nio.file.Files
                    .createTempFile("windowssys_jni-", suffix)
                    .toFile()
            extracted.deleteOnExit()
            stream.use { input ->
                extracted.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            System.load(extracted.absolutePath)
            return
        }
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageClearPropVariantArray(rgpropvar: Long, cvars: Int)

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageCoGetInstanceFromFile(pserverinfo: Long, pclsid: Long, punkouter: Long, dwclsctx: Int, grfmode: Int, pwszname: Long, dwcount: Int, presults: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageCoGetInstanceFromIStorage(pserverinfo: Long, pclsid: Long, punkouter: Long, dwclsctx: Int, pstg: Long, dwcount: Int, presults: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageCoGetInterfaceAndReleaseStream(pstm: Long, iid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageCreateILockBytesOnHGlobal(hglobal: Long, fdeleteonrelease: Int, pplkbyt: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageCreateStreamOnHGlobal(hglobal: Long, fdeleteonrelease: Int, ppstm: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageFmtIdToPropStgName(pfmtid: Long, oszname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageFreePropVariantArray(cvariants: Int, rgvars: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageGetConvertStg(pstg: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageGetHGlobalFromILockBytes(plkbyt: Long, phglobal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageGetHGlobalFromStream(pstm: Long, phglobal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromBooleanVector(prgf: Long, celems: Int, ppropvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromBuffer(pv: Long, cb: Int, ppropvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromCLSID(clsid: Long, ppropvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromDoubleVector(prgn: Long, celems: Int, ppropvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromFileTime(pftin: Long, ppropvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromFileTimeVector(prgft: Long, celems: Int, ppropvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromGUIDAsString(guid: Long, ppropvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromInt16Vector(prgn: Long, celems: Int, ppropvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromInt32Vector(prgn: Long, celems: Int, ppropvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromInt64Vector(prgn: Long, celems: Int, ppropvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromPropVariantVectorElem(propvarin: Long, ielem: Int, ppropvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromResource(hinst: Long, id: Int, ppropvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromStringAsVector(psz: Long, ppropvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromStringVector(prgsz: Long, celems: Int, ppropvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromUInt16Vector(prgn: Long, celems: Int, ppropvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromUInt32Vector(prgn: Long, celems: Int, ppropvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromUInt64Vector(prgn: Long, celems: Int, ppropvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageInitPropVariantVectorFromPropVariant(propvarsingle: Long, ppropvarvector: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageOleConvertIStorageToOLESTREAM(pstg: Long, lpolestream: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageOleConvertIStorageToOLESTREAMEx(pstg: Long, cfformat: Short, lwidth: Int, lheight: Int, dwsize: Int, pmedium: Long, polestm: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageOleConvertOLESTREAMToIStorage(lpolestream: Long, pstg: Long, ptd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageOleConvertOLESTREAMToIStorageEx(polestm: Long, pstg: Long, pcfformat: Long, plwwidth: Long, plheight: Long, pdwsize: Long, pmedium: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropStgNameToFmtId(oszname: Long, pfmtid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantChangeType(ppropvardest: Long, propvarsrc: Long, flags: Int, vt: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantClear(pvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantCompareEx(propvar1: Long, propvar2: Long, unit: Int, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantCopy(pvardest: Long, pvarsrc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantGetBooleanElem(propvar: Long, ielem: Int, pfval: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantGetDoubleElem(propvar: Long, ielem: Int, pnval: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantGetElementCount(propvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantGetFileTimeElem(propvar: Long, ielem: Int, pftval: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantGetInt16Elem(propvar: Long, ielem: Int, pnval: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantGetInt32Elem(propvar: Long, ielem: Int, pnval: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantGetInt64Elem(propvar: Long, ielem: Int, pnval: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantGetStringElem(propvar: Long, ielem: Int, ppszval: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantGetUInt16Elem(propvar: Long, ielem: Int, pnval: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantGetUInt32Elem(propvar: Long, ielem: Int, pnval: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantGetUInt64Elem(propvar: Long, ielem: Int, pnval: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantToBSTR(propvar: Long, pbstrout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantToBoolean(propvarin: Long, pfret: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantToBooleanVector(propvar: Long, prgf: Long, crgf: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantToBooleanVectorAlloc(propvar: Long, pprgf: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantToBooleanWithDefault(propvarin: Long, fdefault: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantToBuffer(propvar: Long, pv: Long, cb: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantToDouble(propvarin: Long, pdblret: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantToDoubleVector(propvar: Long, prgn: Long, crgn: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantToDoubleVectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantToDoubleWithDefault(propvarin: Long, dbldefault: Double): Double

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantToFileTime(propvar: Long, pstfout: Int, pftout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantToFileTimeVector(propvar: Long, prgft: Long, crgft: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantToFileTimeVectorAlloc(propvar: Long, pprgft: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantToGUID(propvar: Long, pguid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16(propvarin: Long, piret: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16Vector(propvar: Long, prgn: Long, crgn: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16VectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16WithDefault(propvarin: Long, idefault: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32(propvarin: Long, plret: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32Vector(propvar: Long, prgn: Long, crgn: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32VectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32WithDefault(propvarin: Long, ldefault: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64(propvarin: Long, pllret: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64Vector(propvar: Long, prgn: Long, crgn: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64VectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64WithDefault(propvarin: Long, lldefault: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantToString(propvar: Long, psz: Long, cch: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringAlloc(propvar: Long, ppszout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringVector(propvar: Long, prgsz: Long, crgsz: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringVectorAlloc(propvar: Long, pprgsz: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringWithDefault(propvarin: Long, pszdefault: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16(propvarin: Long, puiret: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16Vector(propvar: Long, prgn: Long, crgn: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16VectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16WithDefault(propvarin: Long, uidefault: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32(propvarin: Long, pulret: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32Vector(propvar: Long, prgn: Long, crgn: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32VectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32WithDefault(propvarin: Long, uldefault: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64(propvarin: Long, pullret: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64Vector(propvar: Long, prgn: Long, crgn: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64VectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64WithDefault(propvarin: Long, ulldefault: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantToVariant(ppropvar: Long, pvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstoragePropVariantToWinRTPropertyValue(propvar: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageReadClassStg(pstg: Long, pclsid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageReadClassStm(pstm: Long, pclsid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageReadFmtUserTypeStg(pstg: Long, pcf: Long, lplpszusertype: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageSetConvertStg(pstg: Long, fconvert: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageStgConvertPropertyToVariant(pprop: Long, codepage: Short, pvar: Long, pma: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageStgConvertVariantToProperty(pvar: Long, codepage: Short, pprop: Long, pcb: Long, pid: Int, freserved: Boolean, pcindirect: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageStgCreateDocfile(pwcsname: Long, grfmode: Int, reserved: Int, ppstgopen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageStgCreateDocfileOnILockBytes(plkbyt: Long, grfmode: Int, reserved: Int, ppstgopen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageStgCreatePropSetStg(pstorage: Long, dwreserved: Int, pppropsetstg: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageStgCreatePropStg(punk: Long, fmtid: Long, pclsid: Long, grfflags: Int, dwreserved: Int, pppropstg: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageStgCreateStorageEx(pwcsname: Long, grfmode: Int, stgfmt: Int, grfattrs: Int, pstgoptions: Long, psecuritydescriptor: Long, riid: Long, ppobjectopen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageStgDeserializePropVariant(pprop: Long, cbmax: Int, ppropvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageStgGetIFillLockBytesOnFile(pwcsname: Long, ppflb: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageStgGetIFillLockBytesOnILockBytes(pilb: Long, ppflb: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageStgIsStorageFile(pwcsname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageStgIsStorageILockBytes(plkbyt: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageStgOpenAsyncDocfileOnIFillLockBytes(pflb: Long, grfmode: Int, asyncflags: Int, ppstgopen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageStgOpenLayoutDocfile(pwcsdfname: Long, grfmode: Int, reserved: Int, ppstgopen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageStgOpenPropStg(punk: Long, fmtid: Long, grfflags: Int, dwreserved: Int, pppropstg: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageStgOpenStorage(pwcsname: Long, pstgpriority: Long, grfmode: Int, snbexclude: Long, reserved: Int, ppstgopen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageStgOpenStorageEx(pwcsname: Long, grfmode: Int, stgfmt: Int, grfattrs: Int, pstgoptions: Long, psecuritydescriptor: Long, riid: Long, ppobjectopen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageStgOpenStorageOnILockBytes(plkbyt: Long, pstgpriority: Long, grfmode: Int, snbexclude: Long, reserved: Int, ppstgopen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageStgPropertyLengthAsVariant(pprop: Long, cbprop: Int, codepage: Short, breserved: Byte): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageStgSerializePropVariant(ppropvar: Long, ppprop: Long, pcb: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageStgSetTimes(lpszname: Long, pctime: Long, patime: Long, pmtime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageVariantToPropVariant(pvar: Long, ppropvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageWinRTPropertyValueToPropVariant(punkpropertyvalue: Long, ppropvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageWriteClassStg(pstg: Long, rclsid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageWriteClassStm(pstm: Long, rclsid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStructuredstorageWriteFmtUserTypeStg(pstg: Long, cf: Short, lpszusertype: Long): Int
}

public actual fun clearPropVariantArray(rgpropvar: MutPtr, cvars: UInt) {
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageClearPropVariantArray(rgpropvar.rawAddress, cvars.toInt())
}

public actual fun coGetInstanceFromFile(pserverinfo: ConstPtr, pclsid: ConstPtr, punkouter: MutPtr, dwclsctx: Clsctx, grfmode: UInt, pwszname: Pcwstr, dwcount: UInt, presults: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageCoGetInstanceFromFile(pserverinfo.rawAddress, pclsid.rawAddress, punkouter.rawAddress, dwclsctx.toInt(), grfmode.toInt(), pwszname.rawAddress, dwcount.toInt(), presults.rawAddress)

public actual fun coGetInstanceFromIStorage(pserverinfo: ConstPtr, pclsid: ConstPtr, punkouter: MutPtr, dwclsctx: Clsctx, pstg: MutPtr, dwcount: UInt, presults: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageCoGetInstanceFromIStorage(pserverinfo.rawAddress, pclsid.rawAddress, punkouter.rawAddress, dwclsctx.toInt(), pstg.rawAddress, dwcount.toInt(), presults.rawAddress)

public actual fun coGetInterfaceAndReleaseStream(pstm: MutPtr, iid: ConstPtr, ppv: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageCoGetInterfaceAndReleaseStream(pstm.rawAddress, iid.rawAddress, ppv.rawAddress)

public actual fun createILockBytesOnHGlobal(hglobal: Hglobal, fdeleteonrelease: Bool, pplkbyt: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageCreateILockBytesOnHGlobal(hglobal.rawAddress, fdeleteonrelease, pplkbyt.rawAddress)

public actual fun createStreamOnHGlobal(hglobal: Hglobal, fdeleteonrelease: Bool, ppstm: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageCreateStreamOnHGlobal(hglobal.rawAddress, fdeleteonrelease, ppstm.rawAddress)

public actual fun fmtIdToPropStgName(pfmtid: ConstPtr, oszname: Pwstr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageFmtIdToPropStgName(pfmtid.rawAddress, oszname.rawAddress)

public actual fun freePropVariantArray(cvariants: UInt, rgvars: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageFreePropVariantArray(cvariants.toInt(), rgvars.rawAddress)

public actual fun getConvertStg(pstg: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageGetConvertStg(pstg.rawAddress)

public actual fun getHGlobalFromILockBytes(plkbyt: MutPtr, phglobal: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageGetHGlobalFromILockBytes(plkbyt.rawAddress, phglobal.rawAddress)

public actual fun getHGlobalFromStream(pstm: MutPtr, phglobal: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageGetHGlobalFromStream(pstm.rawAddress, phglobal.rawAddress)

public actual fun initPropVariantFromBooleanVector(prgf: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromBooleanVector(prgf.rawAddress, celems.toInt(), ppropvar.rawAddress)

public actual fun initPropVariantFromBuffer(pv: ConstPtr, cb: UInt, ppropvar: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromBuffer(pv.rawAddress, cb.toInt(), ppropvar.rawAddress)

public actual fun initPropVariantFromCLSID(clsid: ConstPtr, ppropvar: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromCLSID(clsid.rawAddress, ppropvar.rawAddress)

public actual fun initPropVariantFromDoubleVector(prgn: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromDoubleVector(prgn.rawAddress, celems.toInt(), ppropvar.rawAddress)

public actual fun initPropVariantFromFileTime(pftin: ConstPtr, ppropvar: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromFileTime(pftin.rawAddress, ppropvar.rawAddress)

public actual fun initPropVariantFromFileTimeVector(prgft: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromFileTimeVector(prgft.rawAddress, celems.toInt(), ppropvar.rawAddress)

public actual fun initPropVariantFromGUIDAsString(guid: ConstPtr, ppropvar: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromGUIDAsString(guid.rawAddress, ppropvar.rawAddress)

public actual fun initPropVariantFromInt16Vector(prgn: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromInt16Vector(prgn.rawAddress, celems.toInt(), ppropvar.rawAddress)

public actual fun initPropVariantFromInt32Vector(prgn: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromInt32Vector(prgn.rawAddress, celems.toInt(), ppropvar.rawAddress)

public actual fun initPropVariantFromInt64Vector(prgn: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromInt64Vector(prgn.rawAddress, celems.toInt(), ppropvar.rawAddress)

public actual fun initPropVariantFromPropVariantVectorElem(propvarin: ConstPtr, ielem: UInt, ppropvar: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromPropVariantVectorElem(propvarin.rawAddress, ielem.toInt(), ppropvar.rawAddress)

public actual fun initPropVariantFromResource(hinst: Hinstance, id: UInt, ppropvar: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromResource(hinst.rawAddress, id.toInt(), ppropvar.rawAddress)

public actual fun initPropVariantFromStringAsVector(psz: Pcwstr, ppropvar: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromStringAsVector(psz.rawAddress, ppropvar.rawAddress)

public actual fun initPropVariantFromStringVector(prgsz: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromStringVector(prgsz.rawAddress, celems.toInt(), ppropvar.rawAddress)

public actual fun initPropVariantFromUInt16Vector(prgn: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromUInt16Vector(prgn.rawAddress, celems.toInt(), ppropvar.rawAddress)

public actual fun initPropVariantFromUInt32Vector(prgn: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromUInt32Vector(prgn.rawAddress, celems.toInt(), ppropvar.rawAddress)

public actual fun initPropVariantFromUInt64Vector(prgn: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromUInt64Vector(prgn.rawAddress, celems.toInt(), ppropvar.rawAddress)

public actual fun initPropVariantVectorFromPropVariant(propvarsingle: ConstPtr, ppropvarvector: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantVectorFromPropVariant(propvarsingle.rawAddress, ppropvarvector.rawAddress)

public actual fun oleConvertIStorageToOLESTREAM(pstg: MutPtr, lpolestream: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageOleConvertIStorageToOLESTREAM(pstg.rawAddress, lpolestream.rawAddress)

public actual fun oleConvertIStorageToOLESTREAMEx(pstg: MutPtr, cfformat: UShort, lwidth: Int, lheight: Int, dwsize: UInt, pmedium: ConstPtr, polestm: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageOleConvertIStorageToOLESTREAMEx(pstg.rawAddress, cfformat.toShort(), lwidth, lheight, dwsize.toInt(), pmedium.rawAddress, polestm.rawAddress)

public actual fun oleConvertOLESTREAMToIStorage(lpolestream: ConstPtr, pstg: MutPtr, ptd: ConstPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageOleConvertOLESTREAMToIStorage(lpolestream.rawAddress, pstg.rawAddress, ptd.rawAddress)

public actual fun oleConvertOLESTREAMToIStorageEx(polestm: ConstPtr, pstg: MutPtr, pcfformat: MutPtr, plwwidth: MutPtr, plheight: MutPtr, pdwsize: MutPtr, pmedium: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageOleConvertOLESTREAMToIStorageEx(polestm.rawAddress, pstg.rawAddress, pcfformat.rawAddress, plwwidth.rawAddress, plheight.rawAddress, pdwsize.rawAddress, pmedium.rawAddress)

public actual fun propStgNameToFmtId(oszname: Pcwstr, pfmtid: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropStgNameToFmtId(oszname.rawAddress, pfmtid.rawAddress)

public actual fun propVariantChangeType(ppropvardest: MutPtr, propvarsrc: ConstPtr, flags: PropvarChangeFlags, vt: Varenum): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantChangeType(ppropvardest.rawAddress, propvarsrc.rawAddress, flags, vt.toShort())

public actual fun propVariantClear(pvar: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantClear(pvar.rawAddress)

public actual fun propVariantCompareEx(propvar1: ConstPtr, propvar2: ConstPtr, unit: PropvarCompareUnit, flags: PropvarCompareFlags): Int =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantCompareEx(propvar1.rawAddress, propvar2.rawAddress, unit, flags)

public actual fun propVariantCopy(pvardest: MutPtr, pvarsrc: ConstPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantCopy(pvardest.rawAddress, pvarsrc.rawAddress)

public actual fun propVariantGetBooleanElem(propvar: ConstPtr, ielem: UInt, pfval: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantGetBooleanElem(propvar.rawAddress, ielem.toInt(), pfval.rawAddress)

public actual fun propVariantGetDoubleElem(propvar: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantGetDoubleElem(propvar.rawAddress, ielem.toInt(), pnval.rawAddress)

public actual fun propVariantGetElementCount(propvar: ConstPtr): UInt =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantGetElementCount(propvar.rawAddress).toUInt()

public actual fun propVariantGetFileTimeElem(propvar: ConstPtr, ielem: UInt, pftval: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantGetFileTimeElem(propvar.rawAddress, ielem.toInt(), pftval.rawAddress)

public actual fun propVariantGetInt16Elem(propvar: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantGetInt16Elem(propvar.rawAddress, ielem.toInt(), pnval.rawAddress)

public actual fun propVariantGetInt32Elem(propvar: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantGetInt32Elem(propvar.rawAddress, ielem.toInt(), pnval.rawAddress)

public actual fun propVariantGetInt64Elem(propvar: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantGetInt64Elem(propvar.rawAddress, ielem.toInt(), pnval.rawAddress)

public actual fun propVariantGetStringElem(propvar: ConstPtr, ielem: UInt, ppszval: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantGetStringElem(propvar.rawAddress, ielem.toInt(), ppszval.rawAddress)

public actual fun propVariantGetUInt16Elem(propvar: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantGetUInt16Elem(propvar.rawAddress, ielem.toInt(), pnval.rawAddress)

public actual fun propVariantGetUInt32Elem(propvar: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantGetUInt32Elem(propvar.rawAddress, ielem.toInt(), pnval.rawAddress)

public actual fun propVariantGetUInt64Elem(propvar: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantGetUInt64Elem(propvar.rawAddress, ielem.toInt(), pnval.rawAddress)

public actual fun propVariantToBSTR(propvar: ConstPtr, pbstrout: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantToBSTR(propvar.rawAddress, pbstrout.rawAddress)

public actual fun propVariantToBoolean(propvarin: ConstPtr, pfret: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantToBoolean(propvarin.rawAddress, pfret.rawAddress)

public actual fun propVariantToBooleanVector(propvar: ConstPtr, prgf: MutPtr, crgf: UInt, pcelem: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantToBooleanVector(propvar.rawAddress, prgf.rawAddress, crgf.toInt(), pcelem.rawAddress)

public actual fun propVariantToBooleanVectorAlloc(propvar: ConstPtr, pprgf: MutPtr, pcelem: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantToBooleanVectorAlloc(propvar.rawAddress, pprgf.rawAddress, pcelem.rawAddress)

public actual fun propVariantToBooleanWithDefault(propvarin: ConstPtr, fdefault: Bool): Bool =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantToBooleanWithDefault(propvarin.rawAddress, fdefault)

public actual fun propVariantToBuffer(propvar: ConstPtr, pv: MutPtr, cb: UInt): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantToBuffer(propvar.rawAddress, pv.rawAddress, cb.toInt())

public actual fun propVariantToDouble(propvarin: ConstPtr, pdblret: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantToDouble(propvarin.rawAddress, pdblret.rawAddress)

public actual fun propVariantToDoubleVector(propvar: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantToDoubleVector(propvar.rawAddress, prgn.rawAddress, crgn.toInt(), pcelem.rawAddress)

public actual fun propVariantToDoubleVectorAlloc(propvar: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantToDoubleVectorAlloc(propvar.rawAddress, pprgn.rawAddress, pcelem.rawAddress)

public actual fun propVariantToDoubleWithDefault(propvarin: ConstPtr, dbldefault: Double): Double =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantToDoubleWithDefault(propvarin.rawAddress, dbldefault)

public actual fun propVariantToFileTime(propvar: ConstPtr, pstfout: PstimeFlags, pftout: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantToFileTime(propvar.rawAddress, pstfout, pftout.rawAddress)

public actual fun propVariantToFileTimeVector(propvar: ConstPtr, prgft: MutPtr, crgft: UInt, pcelem: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantToFileTimeVector(propvar.rawAddress, prgft.rawAddress, crgft.toInt(), pcelem.rawAddress)

public actual fun propVariantToFileTimeVectorAlloc(propvar: ConstPtr, pprgft: MutPtr, pcelem: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantToFileTimeVectorAlloc(propvar.rawAddress, pprgft.rawAddress, pcelem.rawAddress)

public actual fun propVariantToGUID(propvar: ConstPtr, pguid: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantToGUID(propvar.rawAddress, pguid.rawAddress)

public actual fun propVariantToInt16(propvarin: ConstPtr, piret: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16(propvarin.rawAddress, piret.rawAddress)

public actual fun propVariantToInt16Vector(propvar: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16Vector(propvar.rawAddress, prgn.rawAddress, crgn.toInt(), pcelem.rawAddress)

public actual fun propVariantToInt16VectorAlloc(propvar: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16VectorAlloc(propvar.rawAddress, pprgn.rawAddress, pcelem.rawAddress)

public actual fun propVariantToInt16WithDefault(propvarin: ConstPtr, idefault: Short): Short =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16WithDefault(propvarin.rawAddress, idefault)

public actual fun propVariantToInt32(propvarin: ConstPtr, plret: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32(propvarin.rawAddress, plret.rawAddress)

public actual fun propVariantToInt32Vector(propvar: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32Vector(propvar.rawAddress, prgn.rawAddress, crgn.toInt(), pcelem.rawAddress)

public actual fun propVariantToInt32VectorAlloc(propvar: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32VectorAlloc(propvar.rawAddress, pprgn.rawAddress, pcelem.rawAddress)

public actual fun propVariantToInt32WithDefault(propvarin: ConstPtr, ldefault: Int): Int =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32WithDefault(propvarin.rawAddress, ldefault)

public actual fun propVariantToInt64(propvarin: ConstPtr, pllret: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64(propvarin.rawAddress, pllret.rawAddress)

public actual fun propVariantToInt64Vector(propvar: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64Vector(propvar.rawAddress, prgn.rawAddress, crgn.toInt(), pcelem.rawAddress)

public actual fun propVariantToInt64VectorAlloc(propvar: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64VectorAlloc(propvar.rawAddress, pprgn.rawAddress, pcelem.rawAddress)

public actual fun propVariantToInt64WithDefault(propvarin: ConstPtr, lldefault: Long): Long =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64WithDefault(propvarin.rawAddress, lldefault)

public actual fun propVariantToString(propvar: ConstPtr, psz: Pwstr, cch: UInt): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantToString(propvar.rawAddress, psz.rawAddress, cch.toInt())

public actual fun propVariantToStringAlloc(propvar: ConstPtr, ppszout: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringAlloc(propvar.rawAddress, ppszout.rawAddress)

public actual fun propVariantToStringVector(propvar: ConstPtr, prgsz: MutPtr, crgsz: UInt, pcelem: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringVector(propvar.rawAddress, prgsz.rawAddress, crgsz.toInt(), pcelem.rawAddress)

public actual fun propVariantToStringVectorAlloc(propvar: ConstPtr, pprgsz: MutPtr, pcelem: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringVectorAlloc(propvar.rawAddress, pprgsz.rawAddress, pcelem.rawAddress)

public actual fun propVariantToStringWithDefault(propvarin: ConstPtr, pszdefault: Pcwstr): Pcwstr =
    ConstPtr(WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringWithDefault(propvarin.rawAddress, pszdefault.rawAddress))

public actual fun propVariantToUInt16(propvarin: ConstPtr, puiret: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16(propvarin.rawAddress, puiret.rawAddress)

public actual fun propVariantToUInt16Vector(propvar: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16Vector(propvar.rawAddress, prgn.rawAddress, crgn.toInt(), pcelem.rawAddress)

public actual fun propVariantToUInt16VectorAlloc(propvar: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16VectorAlloc(propvar.rawAddress, pprgn.rawAddress, pcelem.rawAddress)

public actual fun propVariantToUInt16WithDefault(propvarin: ConstPtr, uidefault: UShort): UShort =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16WithDefault(propvarin.rawAddress, uidefault.toShort()).toUShort()

public actual fun propVariantToUInt32(propvarin: ConstPtr, pulret: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32(propvarin.rawAddress, pulret.rawAddress)

public actual fun propVariantToUInt32Vector(propvar: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32Vector(propvar.rawAddress, prgn.rawAddress, crgn.toInt(), pcelem.rawAddress)

public actual fun propVariantToUInt32VectorAlloc(propvar: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32VectorAlloc(propvar.rawAddress, pprgn.rawAddress, pcelem.rawAddress)

public actual fun propVariantToUInt32WithDefault(propvarin: ConstPtr, uldefault: UInt): UInt =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32WithDefault(propvarin.rawAddress, uldefault.toInt()).toUInt()

public actual fun propVariantToUInt64(propvarin: ConstPtr, pullret: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64(propvarin.rawAddress, pullret.rawAddress)

public actual fun propVariantToUInt64Vector(propvar: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64Vector(propvar.rawAddress, prgn.rawAddress, crgn.toInt(), pcelem.rawAddress)

public actual fun propVariantToUInt64VectorAlloc(propvar: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64VectorAlloc(propvar.rawAddress, pprgn.rawAddress, pcelem.rawAddress)

public actual fun propVariantToUInt64WithDefault(propvarin: ConstPtr, ulldefault: ULong): ULong =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64WithDefault(propvarin.rawAddress, ulldefault.toLong()).toULong()

public actual fun propVariantToVariant(ppropvar: ConstPtr, pvar: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantToVariant(ppropvar.rawAddress, pvar.rawAddress)

public actual fun propVariantToWinRTPropertyValue(propvar: ConstPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstoragePropVariantToWinRTPropertyValue(propvar.rawAddress, riid.rawAddress, ppv.rawAddress)

public actual fun readClassStg(pstg: MutPtr, pclsid: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageReadClassStg(pstg.rawAddress, pclsid.rawAddress)

public actual fun readClassStm(pstm: MutPtr, pclsid: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageReadClassStm(pstm.rawAddress, pclsid.rawAddress)

public actual fun readFmtUserTypeStg(pstg: MutPtr, pcf: MutPtr, lplpszusertype: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageReadFmtUserTypeStg(pstg.rawAddress, pcf.rawAddress, lplpszusertype.rawAddress)

public actual fun setConvertStg(pstg: MutPtr, fconvert: Bool): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageSetConvertStg(pstg.rawAddress, fconvert)

public actual fun stgConvertPropertyToVariant(pprop: ConstPtr, codepage: UShort, pvar: MutPtr, pma: MutPtr): Boolean =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageStgConvertPropertyToVariant(pprop.rawAddress, codepage.toShort(), pvar.rawAddress, pma.rawAddress)

public actual fun stgConvertVariantToProperty(pvar: ConstPtr, codepage: UShort, pprop: MutPtr, pcb: MutPtr, pid: UInt, freserved: Boolean, pcindirect: MutPtr): MutPtr =
    MutPtr(WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageStgConvertVariantToProperty(pvar.rawAddress, codepage.toShort(), pprop.rawAddress, pcb.rawAddress, pid.toInt(), freserved, pcindirect.rawAddress))

public actual fun stgCreateDocfile(pwcsname: Pcwstr, grfmode: Stgm, reserved: UInt, ppstgopen: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageStgCreateDocfile(pwcsname.rawAddress, grfmode.toInt(), reserved.toInt(), ppstgopen.rawAddress)

public actual fun stgCreateDocfileOnILockBytes(plkbyt: MutPtr, grfmode: Stgm, reserved: UInt, ppstgopen: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageStgCreateDocfileOnILockBytes(plkbyt.rawAddress, grfmode.toInt(), reserved.toInt(), ppstgopen.rawAddress)

public actual fun stgCreatePropSetStg(pstorage: MutPtr, dwreserved: UInt, pppropsetstg: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageStgCreatePropSetStg(pstorage.rawAddress, dwreserved.toInt(), pppropsetstg.rawAddress)

public actual fun stgCreatePropStg(punk: MutPtr, fmtid: ConstPtr, pclsid: ConstPtr, grfflags: UInt, dwreserved: UInt, pppropstg: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageStgCreatePropStg(punk.rawAddress, fmtid.rawAddress, pclsid.rawAddress, grfflags.toInt(), dwreserved.toInt(), pppropstg.rawAddress)

public actual fun stgCreateStorageEx(pwcsname: Pcwstr, grfmode: Stgm, stgfmt: Stgfmt, grfattrs: UInt, pstgoptions: MutPtr, psecuritydescriptor: PsecurityDescriptor, riid: ConstPtr, ppobjectopen: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageStgCreateStorageEx(pwcsname.rawAddress, grfmode.toInt(), stgfmt.toInt(), grfattrs.toInt(), pstgoptions.rawAddress, psecuritydescriptor.rawAddress, riid.rawAddress, ppobjectopen.rawAddress)

public actual fun stgDeserializePropVariant(pprop: ConstPtr, cbmax: UInt, ppropvar: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageStgDeserializePropVariant(pprop.rawAddress, cbmax.toInt(), ppropvar.rawAddress)

public actual fun stgGetIFillLockBytesOnFile(pwcsname: Pcwstr, ppflb: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageStgGetIFillLockBytesOnFile(pwcsname.rawAddress, ppflb.rawAddress)

public actual fun stgGetIFillLockBytesOnILockBytes(pilb: MutPtr, ppflb: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageStgGetIFillLockBytesOnILockBytes(pilb.rawAddress, ppflb.rawAddress)

public actual fun stgIsStorageFile(pwcsname: Pcwstr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageStgIsStorageFile(pwcsname.rawAddress)

public actual fun stgIsStorageILockBytes(plkbyt: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageStgIsStorageILockBytes(plkbyt.rawAddress)

public actual fun stgOpenAsyncDocfileOnIFillLockBytes(pflb: MutPtr, grfmode: UInt, asyncflags: UInt, ppstgopen: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageStgOpenAsyncDocfileOnIFillLockBytes(pflb.rawAddress, grfmode.toInt(), asyncflags.toInt(), ppstgopen.rawAddress)

public actual fun stgOpenLayoutDocfile(pwcsdfname: Pcwstr, grfmode: UInt, reserved: UInt, ppstgopen: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageStgOpenLayoutDocfile(pwcsdfname.rawAddress, grfmode.toInt(), reserved.toInt(), ppstgopen.rawAddress)

public actual fun stgOpenPropStg(punk: MutPtr, fmtid: ConstPtr, grfflags: UInt, dwreserved: UInt, pppropstg: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageStgOpenPropStg(punk.rawAddress, fmtid.rawAddress, grfflags.toInt(), dwreserved.toInt(), pppropstg.rawAddress)

public actual fun stgOpenStorage(pwcsname: Pcwstr, pstgpriority: MutPtr, grfmode: Stgm, snbexclude: ConstPtr, reserved: UInt, ppstgopen: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageStgOpenStorage(pwcsname.rawAddress, pstgpriority.rawAddress, grfmode.toInt(), snbexclude.rawAddress, reserved.toInt(), ppstgopen.rawAddress)

public actual fun stgOpenStorageEx(pwcsname: Pcwstr, grfmode: Stgm, stgfmt: Stgfmt, grfattrs: UInt, pstgoptions: MutPtr, psecuritydescriptor: PsecurityDescriptor, riid: ConstPtr, ppobjectopen: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageStgOpenStorageEx(pwcsname.rawAddress, grfmode.toInt(), stgfmt.toInt(), grfattrs.toInt(), pstgoptions.rawAddress, psecuritydescriptor.rawAddress, riid.rawAddress, ppobjectopen.rawAddress)

public actual fun stgOpenStorageOnILockBytes(plkbyt: MutPtr, pstgpriority: MutPtr, grfmode: Stgm, snbexclude: ConstPtr, reserved: UInt, ppstgopen: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageStgOpenStorageOnILockBytes(plkbyt.rawAddress, pstgpriority.rawAddress, grfmode.toInt(), snbexclude.rawAddress, reserved.toInt(), ppstgopen.rawAddress)

public actual fun stgPropertyLengthAsVariant(pprop: ConstPtr, cbprop: UInt, codepage: UShort, breserved: UByte): UInt =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageStgPropertyLengthAsVariant(pprop.rawAddress, cbprop.toInt(), codepage.toShort(), breserved.toByte()).toUInt()

public actual fun stgSerializePropVariant(ppropvar: ConstPtr, ppprop: MutPtr, pcb: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageStgSerializePropVariant(ppropvar.rawAddress, ppprop.rawAddress, pcb.rawAddress)

public actual fun stgSetTimes(lpszname: Pcwstr, pctime: ConstPtr, patime: ConstPtr, pmtime: ConstPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageStgSetTimes(lpszname.rawAddress, pctime.rawAddress, patime.rawAddress, pmtime.rawAddress)

public actual fun variantToPropVariant(pvar: ConstPtr, ppropvar: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageVariantToPropVariant(pvar.rawAddress, ppropvar.rawAddress)

public actual fun winRTPropertyValueToPropVariant(punkpropertyvalue: MutPtr, ppropvar: MutPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageWinRTPropertyValueToPropVariant(punkpropertyvalue.rawAddress, ppropvar.rawAddress)

public actual fun writeClassStg(pstg: MutPtr, rclsid: ConstPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageWriteClassStg(pstg.rawAddress, rclsid.rawAddress)

public actual fun writeClassStm(pstm: MutPtr, rclsid: ConstPtr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageWriteClassStm(pstm.rawAddress, rclsid.rawAddress)

public actual fun writeFmtUserTypeStg(pstg: MutPtr, cf: UShort, lpszusertype: Pcwstr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssysWindowsWin32SystemComStructuredstorageWriteFmtUserTypeStg(pstg.rawAddress, cf.toShort(), lpszusertype.rawAddress)
