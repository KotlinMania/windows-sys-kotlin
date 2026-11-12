@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hglobal
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hlocal
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hmodule
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Rgndata
import io.github.kotlinmania.windowssys.windows.win32.system.registry.Hkey

private val windowsWin32SystemWindowsprogrammingNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun addDelBackupEntryA(lpcszfilelist: Pcstr, lpcszbackupdir: Pcstr, lpcszbasename: Pcstr, dwflags: UInt): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingAddDelBackupEntryA(lpcszfilelist.rawAddress.toString(), lpcszbackupdir.rawAddress.toString(), lpcszbasename.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addDelBackupEntryW(lpcszfilelist: Pcwstr, lpcszbackupdir: Pcwstr, lpcszbasename: Pcwstr, dwflags: UInt): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingAddDelBackupEntryW(lpcszfilelist.rawAddress.toString(), lpcszbackupdir.rawAddress.toString(), lpcszbasename.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun advInstallFileA(hwnd: Hwnd, lpszsourcedir: Pcstr, lpszsourcefile: Pcstr, lpszdestdir: Pcstr, lpszdestfile: Pcstr, dwflags: UInt, dwreserved: UInt): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingAdvInstallFileA(hwnd.rawAddress.toString(), lpszsourcedir.rawAddress.toString(), lpszsourcefile.rawAddress.toString(), lpszdestdir.rawAddress.toString(), lpszdestfile.rawAddress.toString(), dwflags.toInt(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun advInstallFileW(hwnd: Hwnd, lpszsourcedir: Pcwstr, lpszsourcefile: Pcwstr, lpszdestdir: Pcwstr, lpszdestfile: Pcwstr, dwflags: UInt, dwreserved: UInt): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingAdvInstallFileW(hwnd.rawAddress.toString(), lpszsourcedir.rawAddress.toString(), lpszsourcefile.rawAddress.toString(), lpszdestdir.rawAddress.toString(), lpszdestfile.rawAddress.toString(), dwflags.toInt(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun apphelpCheckShellObject(objectclsid: ConstPtr<Guid>, bshimifnecessary: Bool, pullflags: MutPtr<ULong>): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingApphelpCheckShellObject(objectclsid.rawAddress.toString(), bshimifnecessary, pullflags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cancelDeviceWakeupRequest(hdevice: Handle): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingCancelDeviceWakeupRequest(hdevice.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeINFEngine(hinf: MutPtr<CVoid>): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingCloseINFEngine(hinf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertAuxiliaryCounterToPerformanceCounter(ullauxiliarycountervalue: ULong, lpperformancecountervalue: MutPtr<ULong>, lpconversionerror: MutPtr<ULong>): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingConvertAuxiliaryCounterToPerformanceCounter(ullauxiliarycountervalue.toString(), lpperformancecountervalue.rawAddress.toString(), lpconversionerror.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertPerformanceCounterToAuxiliaryCounter(ullperformancecountervalue: ULong, lpauxiliarycountervalue: MutPtr<ULong>, lpconversionerror: MutPtr<ULong>): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingConvertPerformanceCounterToAuxiliaryCounter(ullperformancecountervalue.toString(), lpauxiliarycountervalue.rawAddress.toString(), lpconversionerror.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dCIBeginAccess(pdci: MutPtr<Dcisurfaceinfo>, x: Int, y: Int, dx: Int, dy: Int): Int =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingDCIBeginAccess(pdci.rawAddress.toString(), x, y, dx, dy) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dCICloseProvider(hdc: Hdc) {
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingDCICloseProvider(hdc.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dCICreateOffscreen(hdc: Hdc, dwcompression: UInt, dwredmask: UInt, dwgreenmask: UInt, dwbluemask: UInt, dwwidth: UInt, dwheight: UInt, dwdcicaps: UInt, dwbitcount: UInt, lplpsurface: MutPtr<MutPtr<Dcioffscreen>>): Int =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingDCICreateOffscreen(hdc.rawAddress.toString(), dwcompression.toInt(), dwredmask.toInt(), dwgreenmask.toInt(), dwbluemask.toInt(), dwwidth.toInt(), dwheight.toInt(), dwdcicaps.toInt(), dwbitcount.toInt(), lplpsurface.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dCICreateOverlay(hdc: Hdc, lpoffscreensurf: MutPtr<CVoid>, lplpsurface: MutPtr<MutPtr<Dcioverlay>>): Int =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingDCICreateOverlay(hdc.rawAddress.toString(), lpoffscreensurf.rawAddress.toString(), lplpsurface.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dCICreatePrimary(hdc: Hdc, lplpsurface: MutPtr<MutPtr<Dcisurfaceinfo>>): Int =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingDCICreatePrimary(hdc.rawAddress.toString(), lplpsurface.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dCIDestroy(pdci: MutPtr<Dcisurfaceinfo>) {
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingDCIDestroy(pdci.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dCIDraw(pdci: MutPtr<Dcioffscreen>): Int =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingDCIDraw(pdci.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dCIEndAccess(pdci: MutPtr<Dcisurfaceinfo>) {
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingDCIEndAccess(pdci.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dCIEnum(hdc: Hdc, lprdst: MutPtr<Rect>, lprsrc: MutPtr<Rect>, lpfncallback: MutPtr<CVoid>, lpcontext: MutPtr<CVoid>): Int =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingDCIEnum(hdc.rawAddress.toString(), lprdst.rawAddress.toString(), lprsrc.rawAddress.toString(), lpfncallback.rawAddress.toString(), lpcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dCIOpenProvider(): Hdc =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) MutPtr((windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingDCIOpenProvider() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dCISetClipList(pdci: MutPtr<Dcioffscreen>, prd: MutPtr<Rgndata>): Int =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingDCISetClipList(pdci.rawAddress.toString(), prd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dCISetDestination(pdci: MutPtr<Dcioffscreen>, dst: MutPtr<Rect>, src: MutPtr<Rect>): Int =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingDCISetDestination(pdci.rawAddress.toString(), dst.rawAddress.toString(), src.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dCISetSrcDestClip(pdci: MutPtr<Dcioffscreen>, srcrc: MutPtr<Rect>, destrc: MutPtr<Rect>, prd: MutPtr<Rgndata>): Int =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingDCISetSrcDestClip(pdci.rawAddress.toString(), srcrc.rawAddress.toString(), destrc.rawAddress.toString(), prd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun delNodeA(pszfileordirname: Pcstr, dwflags: UInt): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingDelNodeA(pszfileordirname.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun delNodeRunDLL32W(hwnd: Hwnd, hinstance: Hinstance, pszparms: Pwstr, nshow: Int): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingDelNodeRunDLL32W(hwnd.rawAddress.toString(), hinstance.rawAddress.toString(), pszparms.rawAddress.toString(), nshow) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun delNodeW(pszfileordirname: Pcwstr, dwflags: UInt): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingDelNodeW(pszfileordirname.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsHostnameToComputerNameA(hostname: Pcstr, computername: Pstr, nsize: MutPtr<UInt>): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingDnsHostnameToComputerNameA(hostname.rawAddress.toString(), computername.rawAddress.toString(), nsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsHostnameToComputerNameW(hostname: Pcwstr, computername: Pwstr, nsize: MutPtr<UInt>): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingDnsHostnameToComputerNameW(hostname.rawAddress.toString(), computername.rawAddress.toString(), nsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dosDateTimeToFileTime(wfatdate: UShort, wfattime: UShort, lpfiletime: MutPtr<Filetime>): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingDosDateTimeToFileTime(wfatdate.toInt(), wfattime.toInt(), lpfiletime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enableProcessOptionalXStateFeatures(features: ULong): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingEnableProcessOptionalXStateFeatures(features.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun executeCabA(hwnd: Hwnd, pcab: MutPtr<Cabinfoa>, preserved: MutPtr<CVoid>): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingExecuteCabA(hwnd.rawAddress.toString(), pcab.rawAddress.toString(), preserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun executeCabW(hwnd: Hwnd, pcab: MutPtr<Cabinfow>, preserved: MutPtr<CVoid>): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingExecuteCabW(hwnd.rawAddress.toString(), pcab.rawAddress.toString(), preserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extractFilesA(pszcabname: Pcstr, pszexpanddir: Pcstr, dwflags: UInt, pszfilelist: Pcstr, lpreserved: MutPtr<CVoid>, dwreserved: UInt): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingExtractFilesA(pszcabname.rawAddress.toString(), pszexpanddir.rawAddress.toString(), dwflags.toInt(), pszfilelist.rawAddress.toString(), lpreserved.rawAddress.toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extractFilesW(pszcabname: Pcwstr, pszexpanddir: Pcwstr, dwflags: UInt, pszfilelist: Pcwstr, lpreserved: MutPtr<CVoid>, dwreserved: UInt): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingExtractFilesW(pszcabname.rawAddress.toString(), pszexpanddir.rawAddress.toString(), dwflags.toInt(), pszfilelist.rawAddress.toString(), lpreserved.rawAddress.toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fileSaveMarkNotExistA(lpfilelist: Pcstr, lpdir: Pcstr, lpbasename: Pcstr): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingFileSaveMarkNotExistA(lpfilelist.rawAddress.toString(), lpdir.rawAddress.toString(), lpbasename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fileSaveMarkNotExistW(lpfilelist: Pcwstr, lpdir: Pcwstr, lpbasename: Pcwstr): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingFileSaveMarkNotExistW(lpfilelist.rawAddress.toString(), lpdir.rawAddress.toString(), lpbasename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fileSaveRestoreOnINFA(hwnd: Hwnd, psztitle: Pcstr, pszinf: Pcstr, pszsection: Pcstr, pszbackupdir: Pcstr, pszbasebackupfile: Pcstr, dwflags: UInt): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingFileSaveRestoreOnINFA(hwnd.rawAddress.toString(), psztitle.rawAddress.toString(), pszinf.rawAddress.toString(), pszsection.rawAddress.toString(), pszbackupdir.rawAddress.toString(), pszbasebackupfile.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fileSaveRestoreOnINFW(hwnd: Hwnd, psztitle: Pcwstr, pszinf: Pcwstr, pszsection: Pcwstr, pszbackupdir: Pcwstr, pszbasebackupfile: Pcwstr, dwflags: UInt): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingFileSaveRestoreOnINFW(hwnd.rawAddress.toString(), psztitle.rawAddress.toString(), pszinf.rawAddress.toString(), pszsection.rawAddress.toString(), pszbackupdir.rawAddress.toString(), pszbasebackupfile.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fileSaveRestoreW(hdlg: Hwnd, lpfilelist: Pcwstr, lpdir: Pcwstr, lpbasename: Pcwstr, dwflags: UInt): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingFileSaveRestoreW(hdlg.rawAddress.toString(), lpfilelist.rawAddress.toString(), lpdir.rawAddress.toString(), lpbasename.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fileTimeToDosDateTime(lpfiletime: ConstPtr<Filetime>, lpfatdate: MutPtr<UShort>, lpfattime: MutPtr<UShort>): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingFileTimeToDosDateTime(lpfiletime.rawAddress.toString(), lpfatdate.rawAddress.toString(), lpfattime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiEntry13(): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingGdiEntry13() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getComputerNameA(lpbuffer: Pstr, nsize: MutPtr<UInt>): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingGetComputerNameA(lpbuffer.rawAddress.toString(), nsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getComputerNameW(lpbuffer: Pwstr, nsize: MutPtr<UInt>): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingGetComputerNameW(lpbuffer.rawAddress.toString(), nsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentHwProfileA(lphwprofileinfo: MutPtr<HwProfileInfoa>): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingGetCurrentHwProfileA(lphwprofileinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentHwProfileW(lphwprofileinfo: MutPtr<HwProfileInfow>): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingGetCurrentHwProfileW(lphwprofileinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDCRegionData(hdc: Hdc, size: UInt, prd: MutPtr<Rgndata>): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingGetDCRegionData(hdc.rawAddress.toString(), size.toInt(), prd.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFeatureEnabledState(featureid: UInt, changetime: FeatureChangeTime): FeatureEnabledState =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingGetFeatureEnabledState(featureid.toInt(), changetime) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFeatureVariant(featureid: UInt, changetime: FeatureChangeTime, payloadid: MutPtr<UInt>, hasnotification: MutPtr<Bool>): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingGetFeatureVariant(featureid.toInt(), changetime, payloadid.rawAddress.toString(), hasnotification.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFirmwareEnvironmentVariableA(lpname: Pcstr, lpguid: Pcstr, pbuffer: MutPtr<CVoid>, nsize: UInt): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingGetFirmwareEnvironmentVariableA(lpname.rawAddress.toString(), lpguid.rawAddress.toString(), pbuffer.rawAddress.toString(), nsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFirmwareEnvironmentVariableExA(lpname: Pcstr, lpguid: Pcstr, pbuffer: MutPtr<CVoid>, nsize: UInt, pdwattribubutes: MutPtr<UInt>): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingGetFirmwareEnvironmentVariableExA(lpname.rawAddress.toString(), lpguid.rawAddress.toString(), pbuffer.rawAddress.toString(), nsize.toInt(), pdwattribubutes.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFirmwareEnvironmentVariableExW(lpname: Pcwstr, lpguid: Pcwstr, pbuffer: MutPtr<CVoid>, nsize: UInt, pdwattribubutes: MutPtr<UInt>): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingGetFirmwareEnvironmentVariableExW(lpname.rawAddress.toString(), lpguid.rawAddress.toString(), pbuffer.rawAddress.toString(), nsize.toInt(), pdwattribubutes.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFirmwareEnvironmentVariableW(lpname: Pcwstr, lpguid: Pcwstr, pbuffer: MutPtr<CVoid>, nsize: UInt): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingGetFirmwareEnvironmentVariableW(lpname.rawAddress.toString(), lpguid.rawAddress.toString(), pbuffer.rawAddress.toString(), nsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrivateProfileIntA(lpappname: Pcstr, lpkeyname: Pcstr, ndefault: Int, lpfilename: Pcstr): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileIntA(lpappname.rawAddress.toString(), lpkeyname.rawAddress.toString(), ndefault, lpfilename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrivateProfileIntW(lpappname: Pcwstr, lpkeyname: Pcwstr, ndefault: Int, lpfilename: Pcwstr): Int =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileIntW(lpappname.rawAddress.toString(), lpkeyname.rawAddress.toString(), ndefault, lpfilename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrivateProfileSectionA(lpappname: Pcstr, lpreturnedstring: Pstr, nsize: UInt, lpfilename: Pcstr): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileSectionA(lpappname.rawAddress.toString(), lpreturnedstring.rawAddress.toString(), nsize.toInt(), lpfilename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrivateProfileSectionNamesA(lpszreturnbuffer: Pstr, nsize: UInt, lpfilename: Pcstr): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileSectionNamesA(lpszreturnbuffer.rawAddress.toString(), nsize.toInt(), lpfilename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrivateProfileSectionNamesW(lpszreturnbuffer: Pwstr, nsize: UInt, lpfilename: Pcwstr): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileSectionNamesW(lpszreturnbuffer.rawAddress.toString(), nsize.toInt(), lpfilename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrivateProfileSectionW(lpappname: Pcwstr, lpreturnedstring: Pwstr, nsize: UInt, lpfilename: Pcwstr): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileSectionW(lpappname.rawAddress.toString(), lpreturnedstring.rawAddress.toString(), nsize.toInt(), lpfilename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrivateProfileStringA(lpappname: Pcstr, lpkeyname: Pcstr, lpdefault: Pcstr, lpreturnedstring: Pstr, nsize: UInt, lpfilename: Pcstr): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileStringA(lpappname.rawAddress.toString(), lpkeyname.rawAddress.toString(), lpdefault.rawAddress.toString(), lpreturnedstring.rawAddress.toString(), nsize.toInt(), lpfilename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrivateProfileStringW(lpappname: Pcwstr, lpkeyname: Pcwstr, lpdefault: Pcwstr, lpreturnedstring: Pwstr, nsize: UInt, lpfilename: Pcwstr): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileStringW(lpappname.rawAddress.toString(), lpkeyname.rawAddress.toString(), lpdefault.rawAddress.toString(), lpreturnedstring.rawAddress.toString(), nsize.toInt(), lpfilename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrivateProfileStructA(lpszsection: Pcstr, lpszkey: Pcstr, lpstruct: MutPtr<CVoid>, usizestruct: UInt, szfile: Pcstr): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileStructA(lpszsection.rawAddress.toString(), lpszkey.rawAddress.toString(), lpstruct.rawAddress.toString(), usizestruct.toInt(), szfile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrivateProfileStructW(lpszsection: Pcwstr, lpszkey: Pcwstr, lpstruct: MutPtr<CVoid>, usizestruct: UInt, szfile: Pcwstr): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileStructW(lpszsection.rawAddress.toString(), lpszkey.rawAddress.toString(), lpstruct.rawAddress.toString(), usizestruct.toInt(), szfile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProfileIntA(lpappname: Pcstr, lpkeyname: Pcstr, ndefault: Int): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingGetProfileIntA(lpappname.rawAddress.toString(), lpkeyname.rawAddress.toString(), ndefault) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProfileIntW(lpappname: Pcwstr, lpkeyname: Pcwstr, ndefault: Int): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingGetProfileIntW(lpappname.rawAddress.toString(), lpkeyname.rawAddress.toString(), ndefault) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProfileSectionA(lpappname: Pcstr, lpreturnedstring: Pstr, nsize: UInt): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingGetProfileSectionA(lpappname.rawAddress.toString(), lpreturnedstring.rawAddress.toString(), nsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProfileSectionW(lpappname: Pcwstr, lpreturnedstring: Pwstr, nsize: UInt): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingGetProfileSectionW(lpappname.rawAddress.toString(), lpreturnedstring.rawAddress.toString(), nsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProfileStringA(lpappname: Pcstr, lpkeyname: Pcstr, lpdefault: Pcstr, lpreturnedstring: Pstr, nsize: UInt): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingGetProfileStringA(lpappname.rawAddress.toString(), lpkeyname.rawAddress.toString(), lpdefault.rawAddress.toString(), lpreturnedstring.rawAddress.toString(), nsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProfileStringW(lpappname: Pcwstr, lpkeyname: Pcwstr, lpdefault: Pcwstr, lpreturnedstring: Pwstr, nsize: UInt): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingGetProfileStringW(lpappname.rawAddress.toString(), lpkeyname.rawAddress.toString(), lpdefault.rawAddress.toString(), lpreturnedstring.rawAddress.toString(), nsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemRegistryQuota(pdwquotaallowed: MutPtr<UInt>, pdwquotaused: MutPtr<UInt>): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingGetSystemRegistryQuota(pdwquotaallowed.rawAddress.toString(), pdwquotaused.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadEnabledXStateFeatures(): ULong =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingGetThreadEnabledXStateFeatures() as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUserNameA(lpbuffer: Pstr, pcbbuffer: MutPtr<UInt>): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingGetUserNameA(lpbuffer.rawAddress.toString(), pcbbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUserNameW(lpbuffer: Pwstr, pcbbuffer: MutPtr<UInt>): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingGetUserNameW(lpbuffer.rawAddress.toString(), pcbbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVersionFromFileA(lpszfilename: Pcstr, pdwmsver: MutPtr<UInt>, pdwlsver: MutPtr<UInt>, bversion: Bool): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingGetVersionFromFileA(lpszfilename.rawAddress.toString(), pdwmsver.rawAddress.toString(), pdwlsver.rawAddress.toString(), bversion) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVersionFromFileExA(lpszfilename: Pcstr, pdwmsver: MutPtr<UInt>, pdwlsver: MutPtr<UInt>, bversion: Bool): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingGetVersionFromFileExA(lpszfilename.rawAddress.toString(), pdwmsver.rawAddress.toString(), pdwlsver.rawAddress.toString(), bversion) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVersionFromFileExW(lpszfilename: Pcwstr, pdwmsver: MutPtr<UInt>, pdwlsver: MutPtr<UInt>, bversion: Bool): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingGetVersionFromFileExW(lpszfilename.rawAddress.toString(), pdwmsver.rawAddress.toString(), pdwlsver.rawAddress.toString(), bversion) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVersionFromFileW(lpszfilename: Pcwstr, pdwmsver: MutPtr<UInt>, pdwlsver: MutPtr<UInt>, bversion: Bool): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingGetVersionFromFileW(lpszfilename.rawAddress.toString(), pdwmsver.rawAddress.toString(), pdwlsver.rawAddress.toString(), bversion) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowRegionData(hwnd: Hwnd, size: UInt, prd: MutPtr<Rgndata>): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingGetWindowRegionData(hwnd.rawAddress.toString(), size.toInt(), prd.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalCompact(dwminfree: UInt): ULong =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingGlobalCompact(dwminfree.toInt()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalFix(hmem: Hglobal) {
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingGlobalFix(hmem.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun globalUnWire(hmem: Hglobal): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingGlobalUnWire(hmem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalUnfix(hmem: Hglobal) {
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingGlobalUnfix(hmem.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun globalWire(hmem: Hglobal): MutPtr<CVoid> =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) MutPtr((windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingGlobalWire(hmem.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iMPGetIMEA(param0: Hwnd, param1: MutPtr<Imeproa>): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingIMPGetIMEA(param0.rawAddress.toString(), param1.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iMPGetIMEW(param0: Hwnd, param1: MutPtr<Imeprow>): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingIMPGetIMEW(param0.rawAddress.toString(), param1.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iMPQueryIMEA(param0: MutPtr<Imeproa>): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingIMPQueryIMEA(param0.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iMPQueryIMEW(param0: MutPtr<Imeprow>): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingIMPQueryIMEW(param0.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iMPSetIMEA(param0: Hwnd, param1: MutPtr<Imeproa>): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingIMPSetIMEA(param0.rawAddress.toString(), param1.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iMPSetIMEW(param0: Hwnd, param1: MutPtr<Imeprow>): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingIMPSetIMEW(param0.rawAddress.toString(), param1.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isApiSetImplemented(contract: Pcstr): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingIsApiSetImplemented(contract.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isBadHugeReadPtr(lp: ConstPtr<CVoid>, ucb: ULong): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingIsBadHugeReadPtr(lp.rawAddress.toString(), ucb.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isBadHugeWritePtr(lp: ConstPtr<CVoid>, ucb: ULong): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingIsBadHugeWritePtr(lp.rawAddress.toString(), ucb.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isNTAdmin(dwreserved: UInt, lpdwreserved: MutPtr<UInt>): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingIsNTAdmin(dwreserved.toInt(), lpdwreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isNativeVhdBoot(nativevhdboot: MutPtr<Bool>): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingIsNativeVhdBoot(nativevhdboot.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isTokenUntrusted(tokenhandle: Handle): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingIsTokenUntrusted(tokenhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun launchINFSectionExW(hwnd: Hwnd, hinstance: Hinstance, pszparms: Pcwstr, nshow: Int): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingLaunchINFSectionExW(hwnd.rawAddress.toString(), hinstance.rawAddress.toString(), pszparms.rawAddress.toString(), nshow) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun launchINFSectionW(hwndowner: Hwnd, hinstance: Hinstance, pszparams: Pwstr, nshow: Int): Int =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingLaunchINFSectionW(hwndowner.rawAddress.toString(), hinstance.rawAddress.toString(), pszparams.rawAddress.toString(), nshow) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localCompact(uminfree: UInt): ULong =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingLocalCompact(uminfree.toInt()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localShrink(hmem: Hlocal, cbnewsize: UInt): ULong =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingLocalShrink(hmem.rawAddress.toString(), cbnewsize.toInt()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mulDiv(nnumber: Int, nnumerator: Int, ndenominator: Int): Int =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingMulDiv(nnumber, nnumerator, ndenominator) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun needReboot(dwrebootcheck: UInt): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingNeedReboot(dwrebootcheck.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun needRebootInit(): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingNeedRebootInit() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openINFEngineA(pszinffilename: Pcstr, pszinstallsection: Pcstr, dwflags: UInt, phinf: MutPtr<MutPtr<CVoid>>, pvreserved: MutPtr<CVoid>): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingOpenINFEngineA(pszinffilename.rawAddress.toString(), pszinstallsection.rawAddress.toString(), dwflags.toInt(), phinf.rawAddress.toString(), pvreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openINFEngineW(pszinffilename: Pcwstr, pszinstallsection: Pcwstr, dwflags: UInt, phinf: MutPtr<MutPtr<CVoid>>, pvreserved: MutPtr<CVoid>): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingOpenINFEngineW(pszinffilename.rawAddress.toString(), pszinstallsection.rawAddress.toString(), dwflags.toInt(), phinf.rawAddress.toString(), pvreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openMutexA(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcstr): Handle =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) MutPtr((windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingOpenMutexA(dwdesiredaccess.toInt(), binherithandle, lpname.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openSemaphoreA(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcstr): Handle =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) MutPtr((windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingOpenSemaphoreA(dwdesiredaccess.toInt(), binherithandle, lpname.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryAuxiliaryCounterFrequency(lpauxiliarycounterfrequency: MutPtr<ULong>): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingQueryAuxiliaryCounterFrequency(lpauxiliarycounterfrequency.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryIdleProcessorCycleTime(bufferlength: MutPtr<UInt>, processoridlecycletime: MutPtr<ULong>): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingQueryIdleProcessorCycleTime(bufferlength.rawAddress.toString(), processoridlecycletime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryIdleProcessorCycleTimeEx(group: UShort, bufferlength: MutPtr<UInt>, processoridlecycletime: MutPtr<ULong>): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingQueryIdleProcessorCycleTimeEx(group.toInt(), bufferlength.rawAddress.toString(), processoridlecycletime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryInterruptTime(lpinterrupttime: MutPtr<ULong>) {
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingQueryInterruptTime(lpinterrupttime.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun queryInterruptTimePrecise(lpinterrupttimeprecise: MutPtr<ULong>) {
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingQueryInterruptTimePrecise(lpinterrupttimeprecise.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun queryProcessCycleTime(processhandle: Handle, cycletime: MutPtr<ULong>): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingQueryProcessCycleTime(processhandle.rawAddress.toString(), cycletime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryThreadCycleTime(threadhandle: Handle, cycletime: MutPtr<ULong>): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingQueryThreadCycleTime(threadhandle.rawAddress.toString(), cycletime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryUnbiasedInterruptTime(unbiasedtime: MutPtr<ULong>): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingQueryUnbiasedInterruptTime(unbiasedtime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryUnbiasedInterruptTimePrecise(lpunbiasedinterrupttimeprecise: MutPtr<ULong>) {
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingQueryUnbiasedInterruptTimePrecise(lpunbiasedinterrupttimeprecise.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun raiseCustomSystemEventTrigger(customsystemeventtriggerconfig: ConstPtr<CustomSystemEventTriggerConfig>): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingRaiseCustomSystemEventTrigger(customsystemeventtriggerconfig.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rebootCheckOnInstallA(hwnd: Hwnd, pszinf: Pcstr, pszsec: Pcstr, dwreserved: UInt): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingRebootCheckOnInstallA(hwnd.rawAddress.toString(), pszinf.rawAddress.toString(), pszsec.rawAddress.toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rebootCheckOnInstallW(hwnd: Hwnd, pszinf: Pcwstr, pszsec: Pcwstr, dwreserved: UInt): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingRebootCheckOnInstallW(hwnd.rawAddress.toString(), pszinf.rawAddress.toString(), pszsec.rawAddress.toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recordFeatureError(featureid: UInt, error: ConstPtr<FeatureError>) {
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingRecordFeatureError(featureid.toInt(), error.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun recordFeatureUsage(featureid: UInt, kind: UInt, addend: UInt, originname: Pcstr) {
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingRecordFeatureUsage(featureid.toInt(), kind.toInt(), addend.toInt(), originname.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun regInstallA(hmod: Hmodule, pszsection: Pcstr, psttable: ConstPtr<Strtablea>): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingRegInstallA(hmod.rawAddress.toString(), pszsection.rawAddress.toString(), psttable.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regInstallW(hmod: Hmodule, pszsection: Pcwstr, psttable: ConstPtr<Strtablew>): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingRegInstallW(hmod.rawAddress.toString(), pszsection.rawAddress.toString(), psttable.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regRestoreAllA(hwnd: Hwnd, psztitlestring: Pcstr, hkbckupkey: Hkey): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingRegRestoreAllA(hwnd.rawAddress.toString(), psztitlestring.rawAddress.toString(), hkbckupkey.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regRestoreAllW(hwnd: Hwnd, psztitlestring: Pcwstr, hkbckupkey: Hkey): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingRegRestoreAllW(hwnd.rawAddress.toString(), psztitlestring.rawAddress.toString(), hkbckupkey.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regSaveRestoreA(hwnd: Hwnd, psztitlestring: Pcstr, hkbckupkey: Hkey, pcszrootkey: Pcstr, pcszsubkey: Pcstr, pcszvaluename: Pcstr, dwflags: UInt): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingRegSaveRestoreA(hwnd.rawAddress.toString(), psztitlestring.rawAddress.toString(), hkbckupkey.rawAddress.toString(), pcszrootkey.rawAddress.toString(), pcszsubkey.rawAddress.toString(), pcszvaluename.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regSaveRestoreOnINFA(hwnd: Hwnd, psztitle: Pcstr, pszinf: Pcstr, pszsection: Pcstr, hhklmbackkey: Hkey, hhkcubackkey: Hkey, dwflags: UInt): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingRegSaveRestoreOnINFA(hwnd.rawAddress.toString(), psztitle.rawAddress.toString(), pszinf.rawAddress.toString(), pszsection.rawAddress.toString(), hhklmbackkey.rawAddress.toString(), hhkcubackkey.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regSaveRestoreOnINFW(hwnd: Hwnd, psztitle: Pcwstr, pszinf: Pcwstr, pszsection: Pcwstr, hhklmbackkey: Hkey, hhkcubackkey: Hkey, dwflags: UInt): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingRegSaveRestoreOnINFW(hwnd.rawAddress.toString(), psztitle.rawAddress.toString(), pszinf.rawAddress.toString(), pszsection.rawAddress.toString(), hhklmbackkey.rawAddress.toString(), hhkcubackkey.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regSaveRestoreW(hwnd: Hwnd, psztitlestring: Pcwstr, hkbckupkey: Hkey, pcszrootkey: Pcwstr, pcszsubkey: Pcwstr, pcszvaluename: Pcwstr, dwflags: UInt): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingRegSaveRestoreW(hwnd.rawAddress.toString(), psztitlestring.rawAddress.toString(), hkbckupkey.rawAddress.toString(), pcszrootkey.rawAddress.toString(), pcszsubkey.rawAddress.toString(), pcszvaluename.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun replacePartitionUnit(targetpartition: Pcwstr, sparepartition: Pcwstr, flags: UInt): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingReplacePartitionUnit(targetpartition.rawAddress.toString(), sparepartition.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun requestDeviceWakeup(hdevice: Handle): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingRequestDeviceWakeup(hdevice.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlAnsiStringToUnicodeString(destinationstring: MutPtr<UnicodeString>, sourcestring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, allocatedestinationstring: Boolean): Ntstatus =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingRtlAnsiStringToUnicodeString(destinationstring.rawAddress.toString(), sourcestring.rawAddress.toString(), allocatedestinationstring) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCharToInteger(string: MutPtr<Byte>, base: UInt, value: MutPtr<UInt>): Ntstatus =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingRtlCharToInteger(string.rawAddress.toString(), base.toInt(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFreeAnsiString(ansistring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>) {
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingRtlFreeAnsiString(ansistring.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlFreeOemString(oemstring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>) {
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingRtlFreeOemString(oemstring.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlFreeUnicodeString(unicodestring: MutPtr<UnicodeString>) {
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingRtlFreeUnicodeString(unicodestring.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlGetReturnAddressHijackTarget(): ULong =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingRtlGetReturnAddressHijackTarget() as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInitAnsiString(destinationstring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, sourcestring: MutPtr<Byte>) {
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingRtlInitAnsiString(destinationstring.rawAddress.toString(), sourcestring.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlInitAnsiStringEx(destinationstring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, sourcestring: MutPtr<Byte>): Ntstatus =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingRtlInitAnsiStringEx(destinationstring.rawAddress.toString(), sourcestring.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInitString(destinationstring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, sourcestring: MutPtr<Byte>) {
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingRtlInitString(destinationstring.rawAddress.toString(), sourcestring.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlInitStringEx(destinationstring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, sourcestring: MutPtr<Byte>): Ntstatus =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingRtlInitStringEx(destinationstring.rawAddress.toString(), sourcestring.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInitUnicodeString(destinationstring: MutPtr<UnicodeString>, sourcestring: Pcwstr) {
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingRtlInitUnicodeString(destinationstring.rawAddress.toString(), sourcestring.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlIsNameLegalDOS8Dot3(name: MutPtr<UnicodeString>, oemname: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, namecontainsspaces: MutPtr<Boolean>): Boolean =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingRtlIsNameLegalDOS8Dot3(name.rawAddress.toString(), oemname.rawAddress.toString(), namecontainsspaces.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlLocalTimeToSystemTime(localtime: MutPtr<Long>, systemtime: MutPtr<Long>): Ntstatus =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingRtlLocalTimeToSystemTime(localtime.rawAddress.toString(), systemtime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlRaiseCustomSystemEventTrigger(triggerconfig: ConstPtr<CustomSystemEventTriggerConfig>): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingRtlRaiseCustomSystemEventTrigger(triggerconfig.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlTimeToSecondsSince1970(time: MutPtr<Long>, elapsedseconds: MutPtr<UInt>): Boolean =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingRtlTimeToSecondsSince1970(time.rawAddress.toString(), elapsedseconds.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUnicodeStringToAnsiString(destinationstring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, sourcestring: MutPtr<UnicodeString>, allocatedestinationstring: Boolean): Ntstatus =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingRtlUnicodeStringToAnsiString(destinationstring.rawAddress.toString(), sourcestring.rawAddress.toString(), allocatedestinationstring) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUnicodeStringToOemString(destinationstring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, sourcestring: MutPtr<UnicodeString>, allocatedestinationstring: Boolean): Ntstatus =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingRtlUnicodeStringToOemString(destinationstring.rawAddress.toString(), sourcestring.rawAddress.toString(), allocatedestinationstring) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUnicodeToMultiByteSize(bytesinmultibytestring: MutPtr<UInt>, unicodestring: Pcwstr, bytesinunicodestring: UInt): Ntstatus =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingRtlUnicodeToMultiByteSize(bytesinmultibytestring.rawAddress.toString(), unicodestring.rawAddress.toString(), bytesinunicodestring.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUniform(seed: MutPtr<UInt>): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingRtlUniform(seed.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun runSetupCommandA(hwnd: Hwnd, szcmdname: Pcstr, szinfsection: Pcstr, szdir: Pcstr, lpsztitle: Pcstr, phexe: MutPtr<Handle>, dwflags: UInt, pvreserved: MutPtr<CVoid>): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingRunSetupCommandA(hwnd.rawAddress.toString(), szcmdname.rawAddress.toString(), szinfsection.rawAddress.toString(), szdir.rawAddress.toString(), lpsztitle.rawAddress.toString(), phexe.rawAddress.toString(), dwflags.toInt(), pvreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun runSetupCommandW(hwnd: Hwnd, szcmdname: Pcwstr, szinfsection: Pcwstr, szdir: Pcwstr, lpsztitle: Pcwstr, phexe: MutPtr<Handle>, dwflags: UInt, pvreserved: MutPtr<CVoid>): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingRunSetupCommandW(hwnd.rawAddress.toString(), szcmdname.rawAddress.toString(), szinfsection.rawAddress.toString(), szdir.rawAddress.toString(), lpsztitle.rawAddress.toString(), phexe.rawAddress.toString(), dwflags.toInt(), pvreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendIMEMessageExA(param0: Hwnd, param1: Lparam): Lresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingSendIMEMessageExA(param0.rawAddress.toString(), param1.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendIMEMessageExW(param0: Hwnd, param1: Lparam): Lresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingSendIMEMessageExW(param0.rawAddress.toString(), param1.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setEnvironmentStringsA(newenvironment: Pcstr): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingSetEnvironmentStringsA(newenvironment.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFirmwareEnvironmentVariableA(lpname: Pcstr, lpguid: Pcstr, pvalue: ConstPtr<CVoid>, nsize: UInt): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingSetFirmwareEnvironmentVariableA(lpname.rawAddress.toString(), lpguid.rawAddress.toString(), pvalue.rawAddress.toString(), nsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFirmwareEnvironmentVariableExA(lpname: Pcstr, lpguid: Pcstr, pvalue: ConstPtr<CVoid>, nsize: UInt, dwattributes: UInt): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingSetFirmwareEnvironmentVariableExA(lpname.rawAddress.toString(), lpguid.rawAddress.toString(), pvalue.rawAddress.toString(), nsize.toInt(), dwattributes.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFirmwareEnvironmentVariableExW(lpname: Pcwstr, lpguid: Pcwstr, pvalue: ConstPtr<CVoid>, nsize: UInt, dwattributes: UInt): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingSetFirmwareEnvironmentVariableExW(lpname.rawAddress.toString(), lpguid.rawAddress.toString(), pvalue.rawAddress.toString(), nsize.toInt(), dwattributes.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFirmwareEnvironmentVariableW(lpname: Pcwstr, lpguid: Pcwstr, pvalue: ConstPtr<CVoid>, nsize: UInt): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingSetFirmwareEnvironmentVariableW(lpname.rawAddress.toString(), lpguid.rawAddress.toString(), pvalue.rawAddress.toString(), nsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setHandleCount(unumber: UInt): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingSetHandleCount(unumber.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMessageWaitingIndicator(hmsgindicator: Handle, ulmsgcount: UInt): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingSetMessageWaitingIndicator(hmsgindicator.rawAddress.toString(), ulmsgcount.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPerUserSecValuesA(pperuser: MutPtr<Perusersectiona>): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingSetPerUserSecValuesA(pperuser.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPerUserSecValuesW(pperuser: MutPtr<Perusersectionw>): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingSetPerUserSecValuesW(pperuser.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun subscribeFeatureStateChangeNotification(subscription: MutPtr<FeatureStateChangeSubscription>, callback: PfeatureStateChangeCallback, context: ConstPtr<CVoid>) {
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingSubscribeFeatureStateChangeNotification(subscription.rawAddress.toString(), 0L.toString(), context.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun translateInfStringA(pszinffilename: Pcstr, pszinstallsection: Pcstr, psztranslatesection: Pcstr, psztranslatekey: Pcstr, pszbuffer: Pstr, cchbuffer: UInt, pdwrequiredsize: MutPtr<UInt>, pvreserved: ConstPtr<CVoid>): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingTranslateInfStringA(pszinffilename.rawAddress.toString(), pszinstallsection.rawAddress.toString(), psztranslatesection.rawAddress.toString(), psztranslatekey.rawAddress.toString(), pszbuffer.rawAddress.toString(), cchbuffer.toInt(), pdwrequiredsize.rawAddress.toString(), pvreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun translateInfStringExA(hinf: MutPtr<CVoid>, pszinffilename: Pcstr, psztranslatesection: Pcstr, psztranslatekey: Pcstr, pszbuffer: Pstr, dwbuffersize: UInt, pdwrequiredsize: MutPtr<UInt>, pvreserved: ConstPtr<CVoid>): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingTranslateInfStringExA(hinf.rawAddress.toString(), pszinffilename.rawAddress.toString(), psztranslatesection.rawAddress.toString(), psztranslatekey.rawAddress.toString(), pszbuffer.rawAddress.toString(), dwbuffersize.toInt(), pdwrequiredsize.rawAddress.toString(), pvreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun translateInfStringExW(hinf: MutPtr<CVoid>, pszinffilename: Pcwstr, psztranslatesection: Pcwstr, psztranslatekey: Pcwstr, pszbuffer: Pwstr, dwbuffersize: UInt, pdwrequiredsize: MutPtr<UInt>, pvreserved: ConstPtr<CVoid>): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingTranslateInfStringExW(hinf.rawAddress.toString(), pszinffilename.rawAddress.toString(), psztranslatesection.rawAddress.toString(), psztranslatekey.rawAddress.toString(), pszbuffer.rawAddress.toString(), dwbuffersize.toInt(), pdwrequiredsize.rawAddress.toString(), pvreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun translateInfStringW(pszinffilename: Pcwstr, pszinstallsection: Pcwstr, psztranslatesection: Pcwstr, psztranslatekey: Pcwstr, pszbuffer: Pwstr, cchbuffer: UInt, pdwrequiredsize: MutPtr<UInt>, pvreserved: ConstPtr<CVoid>): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingTranslateInfStringW(pszinffilename.rawAddress.toString(), pszinstallsection.rawAddress.toString(), psztranslatesection.rawAddress.toString(), psztranslatekey.rawAddress.toString(), pszbuffer.rawAddress.toString(), cchbuffer.toInt(), pdwrequiredsize.rawAddress.toString(), pvreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unsubscribeFeatureStateChangeNotification(subscription: FeatureStateChangeSubscription) {
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingUnsubscribeFeatureStateChangeNotification(subscription.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun userInstStubWrapperA(hwnd: Hwnd, hinstance: Hinstance, pszparms: Pcstr, nshow: Int): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingUserInstStubWrapperA(hwnd.rawAddress.toString(), hinstance.rawAddress.toString(), pszparms.rawAddress.toString(), nshow) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun userInstStubWrapperW(hwnd: Hwnd, hinstance: Hinstance, pszparms: Pcwstr, nshow: Int): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingUserInstStubWrapperW(hwnd.rawAddress.toString(), hinstance.rawAddress.toString(), pszparms.rawAddress.toString(), nshow) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun userUnInstStubWrapperA(hwnd: Hwnd, hinstance: Hinstance, pszparms: Pcstr, nshow: Int): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingUserUnInstStubWrapperA(hwnd.rawAddress.toString(), hinstance.rawAddress.toString(), pszparms.rawAddress.toString(), nshow) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun userUnInstStubWrapperW(hwnd: Hwnd, hinstance: Hinstance, pszparms: Pcwstr, nshow: Int): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingUserUnInstStubWrapperW(hwnd.rawAddress.toString(), hinstance.rawAddress.toString(), pszparms.rawAddress.toString(), nshow) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wINNLSEnableIME(param0: Hwnd, param1: Bool): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingWINNLSEnableIME(param0.rawAddress.toString(), param1) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wINNLSGetEnableStatus(param0: Hwnd): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingWINNLSGetEnableStatus(param0.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wINNLSGetIMEHotkey(param0: Hwnd): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingWINNLSGetIMEHotkey(param0.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winWatchClose(hww: Hwinwatch) {
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingWinWatchClose(hww.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun winWatchDidStatusChange(hww: Hwinwatch): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingWinWatchDidStatusChange(hww.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winWatchGetClipList(hww: Hwinwatch, prc: MutPtr<Rect>, size: UInt, prd: MutPtr<Rgndata>): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingWinWatchGetClipList(hww.rawAddress.toString(), prc.rawAddress.toString(), size.toInt(), prd.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winWatchNotify(hww: Hwinwatch, notifycallback: Winwatchnotifyproc, notifyparam: Lparam): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingWinWatchNotify(hww.rawAddress.toString(), 0L.toString(), notifyparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winWatchOpen(hwnd: Hwnd): Hwinwatch =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) MutPtr((windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingWinWatchOpen(hwnd.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wldpCanExecuteBuffer(host: ConstPtr<Guid>, options: WldpExecutionEvaluationOptions, buffer: ConstPtr<UByte>, buffersize: UInt, auditinfo: Pcwstr, result: MutPtr<WldpExecutionPolicy>): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingWldpCanExecuteBuffer(host.rawAddress.toString(), options, buffer.rawAddress.toString(), buffersize.toInt(), auditinfo.rawAddress.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wldpCanExecuteFile(host: ConstPtr<Guid>, options: WldpExecutionEvaluationOptions, filehandle: Handle, auditinfo: Pcwstr, result: MutPtr<WldpExecutionPolicy>): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingWldpCanExecuteFile(host.rawAddress.toString(), options, filehandle.rawAddress.toString(), auditinfo.rawAddress.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wldpCanExecuteStream(host: ConstPtr<Guid>, options: WldpExecutionEvaluationOptions, stream: MutPtr<CVoid>, auditinfo: Pcwstr, result: MutPtr<WldpExecutionPolicy>): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingWldpCanExecuteStream(host.rawAddress.toString(), options, stream.rawAddress.toString(), auditinfo.rawAddress.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wldpGetLockdownPolicy(hostinformation: ConstPtr<WldpHostInformation>, lockdownstate: MutPtr<UInt>, lockdownflags: UInt): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingWldpGetLockdownPolicy(hostinformation.rawAddress.toString(), lockdownstate.rawAddress.toString(), lockdownflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wldpIsClassInApprovedList(classid: ConstPtr<Guid>, hostinformation: ConstPtr<WldpHostInformation>, isapproved: MutPtr<Bool>, optionalflags: UInt): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingWldpIsClassInApprovedList(classid.rawAddress.toString(), hostinformation.rawAddress.toString(), isapproved.rawAddress.toString(), optionalflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wldpIsDynamicCodePolicyEnabled(isenabled: MutPtr<Bool>): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingWldpIsDynamicCodePolicyEnabled(isenabled.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wldpQueryDeviceSecurityInformation(information: MutPtr<WldpDeviceSecurityInformation>, informationlength: UInt, returnlength: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingWldpQueryDeviceSecurityInformation(information.rawAddress.toString(), informationlength.toInt(), returnlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wldpQueryDynamicCodeTrust(filehandle: Handle, baseimage: ConstPtr<CVoid>, imagesize: UInt): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingWldpQueryDynamicCodeTrust(filehandle.rawAddress.toString(), baseimage.rawAddress.toString(), imagesize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wldpSetDynamicCodeTrust(filehandle: Handle): Hresult =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingWldpSetDynamicCodeTrust(filehandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writePrivateProfileSectionA(lpappname: Pcstr, lpstring: Pcstr, lpfilename: Pcstr): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingWritePrivateProfileSectionA(lpappname.rawAddress.toString(), lpstring.rawAddress.toString(), lpfilename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writePrivateProfileSectionW(lpappname: Pcwstr, lpstring: Pcwstr, lpfilename: Pcwstr): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingWritePrivateProfileSectionW(lpappname.rawAddress.toString(), lpstring.rawAddress.toString(), lpfilename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writePrivateProfileStringA(lpappname: Pcstr, lpkeyname: Pcstr, lpstring: Pcstr, lpfilename: Pcstr): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingWritePrivateProfileStringA(lpappname.rawAddress.toString(), lpkeyname.rawAddress.toString(), lpstring.rawAddress.toString(), lpfilename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writePrivateProfileStringW(lpappname: Pcwstr, lpkeyname: Pcwstr, lpstring: Pcwstr, lpfilename: Pcwstr): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingWritePrivateProfileStringW(lpappname.rawAddress.toString(), lpkeyname.rawAddress.toString(), lpstring.rawAddress.toString(), lpfilename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writePrivateProfileStructA(lpszsection: Pcstr, lpszkey: Pcstr, lpstruct: ConstPtr<CVoid>, usizestruct: UInt, szfile: Pcstr): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingWritePrivateProfileStructA(lpszsection.rawAddress.toString(), lpszkey.rawAddress.toString(), lpstruct.rawAddress.toString(), usizestruct.toInt(), szfile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writePrivateProfileStructW(lpszsection: Pcwstr, lpszkey: Pcwstr, lpstruct: ConstPtr<CVoid>, usizestruct: UInt, szfile: Pcwstr): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingWritePrivateProfileStructW(lpszsection.rawAddress.toString(), lpszkey.rawAddress.toString(), lpstruct.rawAddress.toString(), usizestruct.toInt(), szfile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeProfileSectionA(lpappname: Pcstr, lpstring: Pcstr): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingWriteProfileSectionA(lpappname.rawAddress.toString(), lpstring.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeProfileSectionW(lpappname: Pcwstr, lpstring: Pcwstr): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingWriteProfileSectionW(lpappname.rawAddress.toString(), lpstring.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeProfileStringA(lpappname: Pcstr, lpkeyname: Pcstr, lpstring: Pcstr): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingWriteProfileStringA(lpappname.rawAddress.toString(), lpkeyname.rawAddress.toString(), lpstring.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeProfileStringW(lpappname: Pcwstr, lpkeyname: Pcwstr, lpstring: Pcwstr): Bool =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingWriteProfileStringW(lpappname.rawAddress.toString(), lpkeyname.rawAddress.toString(), lpstring.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hread(hfile: Int, lpbuffer: MutPtr<CVoid>, lbytes: Int): Int =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingHread(hfile, lpbuffer.rawAddress.toString(), lbytes) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hwrite(hfile: Int, lpbuffer: Pcstr, lbytes: Int): Int =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingHwrite(hfile, lpbuffer.rawAddress.toString(), lbytes) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lclose(hfile: Int): Int =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingLclose(hfile) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lcreat(lppathname: Pcstr, iattribute: Int): Int =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingLcreat(lppathname.rawAddress.toString(), iattribute) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun llseek(hfile: Int, loffset: Int, iorigin: Int): Int =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingLlseek(hfile, loffset, iorigin) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lopen(lppathname: Pcstr, ireadwrite: Int): Int =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingLopen(lppathname.rawAddress.toString(), ireadwrite) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lread(hfile: Int, lpbuffer: MutPtr<CVoid>, ubytes: UInt): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingLread(hfile, lpbuffer.rawAddress.toString(), ubytes.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lwrite(hfile: Int, lpbuffer: Pcstr, ubytes: UInt): UInt =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingLwrite(hfile, lpbuffer.rawAddress.toString(), ubytes.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uawLstrcmpW(string1: ConstPtr<UShort>, string2: ConstPtr<UShort>): Int =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingUawLstrcmpW(string1.rawAddress.toString(), string2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uawLstrcmpiW(string1: ConstPtr<UShort>, string2: ConstPtr<UShort>): Int =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingUawLstrcmpiW(string1.rawAddress.toString(), string2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uawLstrlenW(string: ConstPtr<UShort>): Int =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingUawLstrlenW(string.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uawWcschr(string: ConstPtr<UShort>, character: UShort): MutPtr<UShort> =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) MutPtr((windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingUawWcschr(string.rawAddress.toString(), character.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uawWcscpy(destination: MutPtr<UShort>, source: ConstPtr<UShort>): MutPtr<UShort> =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) MutPtr((windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingUawWcscpy(destination.rawAddress.toString(), source.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uawWcsicmp(string1: ConstPtr<UShort>, string2: ConstPtr<UShort>): Int =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingUawWcsicmp(string1.rawAddress.toString(), string2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uawWcslen(string: ConstPtr<UShort>): ULong =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) (windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingUawWcslen(string.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uawWcsrchr(string: ConstPtr<UShort>, character: UShort): MutPtr<UShort> =
    if (windowsWin32SystemWindowsprogrammingNapiAddon != null) MutPtr((windowsWin32SystemWindowsprogrammingNapiAddon.windowssysWindowsWin32SystemWindowsprogrammingUawWcsrchr(string.rawAddress.toString(), character.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")
