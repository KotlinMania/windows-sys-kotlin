@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hglobal
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hlocal
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hmodule
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.system.registry.Hkey

private val _windowsWin32SystemWindowsprogrammingNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun addDelBackupEntryA(lpcszfilelist: Pcstr, lpcszbackupdir: Pcstr, lpcszbasename: Pcstr, dwflags: UInt): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_addDelBackupEntryA((lpcszfilelist?.value ?: 0L).toString(), (lpcszbackupdir?.value ?: 0L).toString(), (lpcszbasename?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addDelBackupEntryW(lpcszfilelist: Pcwstr, lpcszbackupdir: Pcwstr, lpcszbasename: Pcwstr, dwflags: UInt): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_addDelBackupEntryW((lpcszfilelist?.value ?: 0L).toString(), (lpcszbackupdir?.value ?: 0L).toString(), (lpcszbasename?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun advInstallFileA(hwnd: Hwnd, lpszsourcedir: Pcstr, lpszsourcefile: Pcstr, lpszdestdir: Pcstr, lpszdestfile: Pcstr, dwflags: UInt, dwreserved: UInt): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_advInstallFileA((hwnd?.value ?: 0L).toString(), (lpszsourcedir?.value ?: 0L).toString(), (lpszsourcefile?.value ?: 0L).toString(), (lpszdestdir?.value ?: 0L).toString(), (lpszdestfile?.value ?: 0L).toString(), dwflags.toInt(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun advInstallFileW(hwnd: Hwnd, lpszsourcedir: Pcwstr, lpszsourcefile: Pcwstr, lpszdestdir: Pcwstr, lpszdestfile: Pcwstr, dwflags: UInt, dwreserved: UInt): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_advInstallFileW((hwnd?.value ?: 0L).toString(), (lpszsourcedir?.value ?: 0L).toString(), (lpszsourcefile?.value ?: 0L).toString(), (lpszdestdir?.value ?: 0L).toString(), (lpszdestfile?.value ?: 0L).toString(), dwflags.toInt(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun apphelpCheckShellObject(objectclsid: COpaquePointer?, bshimifnecessary: Bool, pullflags: COpaquePointer?): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_apphelpCheckShellObject((objectclsid?.value ?: 0L).toString(), bshimifnecessary, (pullflags?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cancelDeviceWakeupRequest(hdevice: Handle): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_cancelDeviceWakeupRequest((hdevice?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeINFEngine(hinf: COpaquePointer?): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_closeINFEngine((hinf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertAuxiliaryCounterToPerformanceCounter(ullauxiliarycountervalue: ULong, lpperformancecountervalue: COpaquePointer?, lpconversionerror: COpaquePointer?): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_convertAuxiliaryCounterToPerformanceCounter(ullauxiliarycountervalue.toString(), (lpperformancecountervalue?.value ?: 0L).toString(), (lpconversionerror?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertPerformanceCounterToAuxiliaryCounter(ullperformancecountervalue: ULong, lpauxiliarycountervalue: COpaquePointer?, lpconversionerror: COpaquePointer?): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_convertPerformanceCounterToAuxiliaryCounter(ullperformancecountervalue.toString(), (lpauxiliarycountervalue?.value ?: 0L).toString(), (lpconversionerror?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dCIBeginAccess(pdci: COpaquePointer?, x: Int, y: Int, dx: Int, dy: Int): Int =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_dCIBeginAccess((pdci?.value ?: 0L).toString(), x, y, dx, dy) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dCICloseProvider(hdc: Hdc) {
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        _windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_dCICloseProvider((hdc?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dCICreateOffscreen(hdc: Hdc, dwcompression: UInt, dwredmask: UInt, dwgreenmask: UInt, dwbluemask: UInt, dwwidth: UInt, dwheight: UInt, dwdcicaps: UInt, dwbitcount: UInt, lplpsurface: COpaquePointer?): Int =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_dCICreateOffscreen((hdc?.value ?: 0L).toString(), dwcompression.toInt(), dwredmask.toInt(), dwgreenmask.toInt(), dwbluemask.toInt(), dwwidth.toInt(), dwheight.toInt(), dwdcicaps.toInt(), dwbitcount.toInt(), (lplpsurface?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dCICreateOverlay(hdc: Hdc, lpoffscreensurf: COpaquePointer?, lplpsurface: COpaquePointer?): Int =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_dCICreateOverlay((hdc?.value ?: 0L).toString(), (lpoffscreensurf?.value ?: 0L).toString(), (lplpsurface?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dCICreatePrimary(hdc: Hdc, lplpsurface: COpaquePointer?): Int =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_dCICreatePrimary((hdc?.value ?: 0L).toString(), (lplpsurface?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dCIDestroy(pdci: COpaquePointer?) {
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        _windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_dCIDestroy((pdci?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dCIDraw(pdci: COpaquePointer?): Int =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_dCIDraw((pdci?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dCIEndAccess(pdci: COpaquePointer?) {
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        _windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_dCIEndAccess((pdci?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dCIEnum(hdc: Hdc, lprdst: COpaquePointer?, lprsrc: COpaquePointer?, lpfncallback: COpaquePointer?, lpcontext: COpaquePointer?): Int =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_dCIEnum((hdc?.value ?: 0L).toString(), (lprdst?.value ?: 0L).toString(), (lprsrc?.value ?: 0L).toString(), (lpfncallback?.value ?: 0L).toString(), (lpcontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dCIOpenProvider(): Hdc =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_dCIOpenProvider() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dCISetClipList(pdci: COpaquePointer?, prd: COpaquePointer?): Int =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_dCISetClipList((pdci?.value ?: 0L).toString(), (prd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dCISetDestination(pdci: COpaquePointer?, dst: COpaquePointer?, src: COpaquePointer?): Int =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_dCISetDestination((pdci?.value ?: 0L).toString(), (dst?.value ?: 0L).toString(), (src?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dCISetSrcDestClip(pdci: COpaquePointer?, srcrc: COpaquePointer?, destrc: COpaquePointer?, prd: COpaquePointer?): Int =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_dCISetSrcDestClip((pdci?.value ?: 0L).toString(), (srcrc?.value ?: 0L).toString(), (destrc?.value ?: 0L).toString(), (prd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun delNodeA(pszfileordirname: Pcstr, dwflags: UInt): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_delNodeA((pszfileordirname?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun delNodeRunDLL32W(hwnd: Hwnd, hinstance: Hinstance, pszparms: Pwstr, nshow: Int): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_delNodeRunDLL32W((hwnd?.value ?: 0L).toString(), (hinstance?.value ?: 0L).toString(), (pszparms?.value ?: 0L).toString(), nshow) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun delNodeW(pszfileordirname: Pcwstr, dwflags: UInt): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_delNodeW((pszfileordirname?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsHostnameToComputerNameA(hostname: Pcstr, computername: Pstr, nsize: COpaquePointer?): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_dnsHostnameToComputerNameA((hostname?.value ?: 0L).toString(), (computername?.value ?: 0L).toString(), (nsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsHostnameToComputerNameW(hostname: Pcwstr, computername: Pwstr, nsize: COpaquePointer?): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_dnsHostnameToComputerNameW((hostname?.value ?: 0L).toString(), (computername?.value ?: 0L).toString(), (nsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dosDateTimeToFileTime(wfatdate: UShort, wfattime: UShort, lpfiletime: COpaquePointer?): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_dosDateTimeToFileTime(wfatdate.toInt(), wfattime.toInt(), (lpfiletime?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enableProcessOptionalXStateFeatures(features: ULong): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_enableProcessOptionalXStateFeatures(features.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun executeCabA(hwnd: Hwnd, pcab: COpaquePointer?, preserved: COpaquePointer?): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_executeCabA((hwnd?.value ?: 0L).toString(), (pcab?.value ?: 0L).toString(), (preserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun executeCabW(hwnd: Hwnd, pcab: COpaquePointer?, preserved: COpaquePointer?): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_executeCabW((hwnd?.value ?: 0L).toString(), (pcab?.value ?: 0L).toString(), (preserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extractFilesA(pszcabname: Pcstr, pszexpanddir: Pcstr, dwflags: UInt, pszfilelist: Pcstr, lpreserved: COpaquePointer?, dwreserved: UInt): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_extractFilesA((pszcabname?.value ?: 0L).toString(), (pszexpanddir?.value ?: 0L).toString(), dwflags.toInt(), (pszfilelist?.value ?: 0L).toString(), (lpreserved?.value ?: 0L).toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extractFilesW(pszcabname: Pcwstr, pszexpanddir: Pcwstr, dwflags: UInt, pszfilelist: Pcwstr, lpreserved: COpaquePointer?, dwreserved: UInt): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_extractFilesW((pszcabname?.value ?: 0L).toString(), (pszexpanddir?.value ?: 0L).toString(), dwflags.toInt(), (pszfilelist?.value ?: 0L).toString(), (lpreserved?.value ?: 0L).toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fileSaveMarkNotExistA(lpfilelist: Pcstr, lpdir: Pcstr, lpbasename: Pcstr): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_fileSaveMarkNotExistA((lpfilelist?.value ?: 0L).toString(), (lpdir?.value ?: 0L).toString(), (lpbasename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fileSaveMarkNotExistW(lpfilelist: Pcwstr, lpdir: Pcwstr, lpbasename: Pcwstr): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_fileSaveMarkNotExistW((lpfilelist?.value ?: 0L).toString(), (lpdir?.value ?: 0L).toString(), (lpbasename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fileSaveRestoreOnINFA(hwnd: Hwnd, psztitle: Pcstr, pszinf: Pcstr, pszsection: Pcstr, pszbackupdir: Pcstr, pszbasebackupfile: Pcstr, dwflags: UInt): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_fileSaveRestoreOnINFA((hwnd?.value ?: 0L).toString(), (psztitle?.value ?: 0L).toString(), (pszinf?.value ?: 0L).toString(), (pszsection?.value ?: 0L).toString(), (pszbackupdir?.value ?: 0L).toString(), (pszbasebackupfile?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fileSaveRestoreOnINFW(hwnd: Hwnd, psztitle: Pcwstr, pszinf: Pcwstr, pszsection: Pcwstr, pszbackupdir: Pcwstr, pszbasebackupfile: Pcwstr, dwflags: UInt): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_fileSaveRestoreOnINFW((hwnd?.value ?: 0L).toString(), (psztitle?.value ?: 0L).toString(), (pszinf?.value ?: 0L).toString(), (pszsection?.value ?: 0L).toString(), (pszbackupdir?.value ?: 0L).toString(), (pszbasebackupfile?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fileSaveRestoreW(hdlg: Hwnd, lpfilelist: Pcwstr, lpdir: Pcwstr, lpbasename: Pcwstr, dwflags: UInt): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_fileSaveRestoreW((hdlg?.value ?: 0L).toString(), (lpfilelist?.value ?: 0L).toString(), (lpdir?.value ?: 0L).toString(), (lpbasename?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fileTimeToDosDateTime(lpfiletime: COpaquePointer?, lpfatdate: COpaquePointer?, lpfattime: COpaquePointer?): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_fileTimeToDosDateTime((lpfiletime?.value ?: 0L).toString(), (lpfatdate?.value ?: 0L).toString(), (lpfattime?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiEntry13(): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_gdiEntry13() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getComputerNameA(lpbuffer: Pstr, nsize: COpaquePointer?): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_getComputerNameA((lpbuffer?.value ?: 0L).toString(), (nsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getComputerNameW(lpbuffer: Pwstr, nsize: COpaquePointer?): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_getComputerNameW((lpbuffer?.value ?: 0L).toString(), (nsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentHwProfileA(lphwprofileinfo: COpaquePointer?): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_getCurrentHwProfileA((lphwprofileinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentHwProfileW(lphwprofileinfo: COpaquePointer?): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_getCurrentHwProfileW((lphwprofileinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDCRegionData(hdc: Hdc, size: UInt, prd: COpaquePointer?): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_getDCRegionData((hdc?.value ?: 0L).toString(), size.toInt(), (prd?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFeatureEnabledState(featureid: UInt, changetime: FeatureChangeTime): FeatureEnabledState =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_getFeatureEnabledState(featureid.toInt(), changetime) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFeatureVariant(featureid: UInt, changetime: FeatureChangeTime, payloadid: COpaquePointer?, hasnotification: COpaquePointer?): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_getFeatureVariant(featureid.toInt(), changetime, (payloadid?.value ?: 0L).toString(), (hasnotification?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFirmwareEnvironmentVariableA(lpname: Pcstr, lpguid: Pcstr, pbuffer: COpaquePointer?, nsize: UInt): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_getFirmwareEnvironmentVariableA((lpname?.value ?: 0L).toString(), (lpguid?.value ?: 0L).toString(), (pbuffer?.value ?: 0L).toString(), nsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFirmwareEnvironmentVariableExA(lpname: Pcstr, lpguid: Pcstr, pbuffer: COpaquePointer?, nsize: UInt, pdwattribubutes: COpaquePointer?): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_getFirmwareEnvironmentVariableExA((lpname?.value ?: 0L).toString(), (lpguid?.value ?: 0L).toString(), (pbuffer?.value ?: 0L).toString(), nsize.toInt(), (pdwattribubutes?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFirmwareEnvironmentVariableExW(lpname: Pcwstr, lpguid: Pcwstr, pbuffer: COpaquePointer?, nsize: UInt, pdwattribubutes: COpaquePointer?): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_getFirmwareEnvironmentVariableExW((lpname?.value ?: 0L).toString(), (lpguid?.value ?: 0L).toString(), (pbuffer?.value ?: 0L).toString(), nsize.toInt(), (pdwattribubutes?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFirmwareEnvironmentVariableW(lpname: Pcwstr, lpguid: Pcwstr, pbuffer: COpaquePointer?, nsize: UInt): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_getFirmwareEnvironmentVariableW((lpname?.value ?: 0L).toString(), (lpguid?.value ?: 0L).toString(), (pbuffer?.value ?: 0L).toString(), nsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrivateProfileIntA(lpappname: Pcstr, lpkeyname: Pcstr, ndefault: Int, lpfilename: Pcstr): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_getPrivateProfileIntA((lpappname?.value ?: 0L).toString(), (lpkeyname?.value ?: 0L).toString(), ndefault, (lpfilename?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrivateProfileIntW(lpappname: Pcwstr, lpkeyname: Pcwstr, ndefault: Int, lpfilename: Pcwstr): Int =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_getPrivateProfileIntW((lpappname?.value ?: 0L).toString(), (lpkeyname?.value ?: 0L).toString(), ndefault, (lpfilename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrivateProfileSectionA(lpappname: Pcstr, lpreturnedstring: Pstr, nsize: UInt, lpfilename: Pcstr): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_getPrivateProfileSectionA((lpappname?.value ?: 0L).toString(), (lpreturnedstring?.value ?: 0L).toString(), nsize.toInt(), (lpfilename?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrivateProfileSectionNamesA(lpszreturnbuffer: Pstr, nsize: UInt, lpfilename: Pcstr): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_getPrivateProfileSectionNamesA((lpszreturnbuffer?.value ?: 0L).toString(), nsize.toInt(), (lpfilename?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrivateProfileSectionNamesW(lpszreturnbuffer: Pwstr, nsize: UInt, lpfilename: Pcwstr): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_getPrivateProfileSectionNamesW((lpszreturnbuffer?.value ?: 0L).toString(), nsize.toInt(), (lpfilename?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrivateProfileSectionW(lpappname: Pcwstr, lpreturnedstring: Pwstr, nsize: UInt, lpfilename: Pcwstr): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_getPrivateProfileSectionW((lpappname?.value ?: 0L).toString(), (lpreturnedstring?.value ?: 0L).toString(), nsize.toInt(), (lpfilename?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrivateProfileStringA(lpappname: Pcstr, lpkeyname: Pcstr, lpdefault: Pcstr, lpreturnedstring: Pstr, nsize: UInt, lpfilename: Pcstr): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_getPrivateProfileStringA((lpappname?.value ?: 0L).toString(), (lpkeyname?.value ?: 0L).toString(), (lpdefault?.value ?: 0L).toString(), (lpreturnedstring?.value ?: 0L).toString(), nsize.toInt(), (lpfilename?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrivateProfileStringW(lpappname: Pcwstr, lpkeyname: Pcwstr, lpdefault: Pcwstr, lpreturnedstring: Pwstr, nsize: UInt, lpfilename: Pcwstr): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_getPrivateProfileStringW((lpappname?.value ?: 0L).toString(), (lpkeyname?.value ?: 0L).toString(), (lpdefault?.value ?: 0L).toString(), (lpreturnedstring?.value ?: 0L).toString(), nsize.toInt(), (lpfilename?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrivateProfileStructA(lpszsection: Pcstr, lpszkey: Pcstr, lpstruct: COpaquePointer?, usizestruct: UInt, szfile: Pcstr): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_getPrivateProfileStructA((lpszsection?.value ?: 0L).toString(), (lpszkey?.value ?: 0L).toString(), (lpstruct?.value ?: 0L).toString(), usizestruct.toInt(), (szfile?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrivateProfileStructW(lpszsection: Pcwstr, lpszkey: Pcwstr, lpstruct: COpaquePointer?, usizestruct: UInt, szfile: Pcwstr): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_getPrivateProfileStructW((lpszsection?.value ?: 0L).toString(), (lpszkey?.value ?: 0L).toString(), (lpstruct?.value ?: 0L).toString(), usizestruct.toInt(), (szfile?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProfileIntA(lpappname: Pcstr, lpkeyname: Pcstr, ndefault: Int): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_getProfileIntA((lpappname?.value ?: 0L).toString(), (lpkeyname?.value ?: 0L).toString(), ndefault) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProfileIntW(lpappname: Pcwstr, lpkeyname: Pcwstr, ndefault: Int): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_getProfileIntW((lpappname?.value ?: 0L).toString(), (lpkeyname?.value ?: 0L).toString(), ndefault) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProfileSectionA(lpappname: Pcstr, lpreturnedstring: Pstr, nsize: UInt): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_getProfileSectionA((lpappname?.value ?: 0L).toString(), (lpreturnedstring?.value ?: 0L).toString(), nsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProfileSectionW(lpappname: Pcwstr, lpreturnedstring: Pwstr, nsize: UInt): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_getProfileSectionW((lpappname?.value ?: 0L).toString(), (lpreturnedstring?.value ?: 0L).toString(), nsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProfileStringA(lpappname: Pcstr, lpkeyname: Pcstr, lpdefault: Pcstr, lpreturnedstring: Pstr, nsize: UInt): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_getProfileStringA((lpappname?.value ?: 0L).toString(), (lpkeyname?.value ?: 0L).toString(), (lpdefault?.value ?: 0L).toString(), (lpreturnedstring?.value ?: 0L).toString(), nsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProfileStringW(lpappname: Pcwstr, lpkeyname: Pcwstr, lpdefault: Pcwstr, lpreturnedstring: Pwstr, nsize: UInt): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_getProfileStringW((lpappname?.value ?: 0L).toString(), (lpkeyname?.value ?: 0L).toString(), (lpdefault?.value ?: 0L).toString(), (lpreturnedstring?.value ?: 0L).toString(), nsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemRegistryQuota(pdwquotaallowed: COpaquePointer?, pdwquotaused: COpaquePointer?): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_getSystemRegistryQuota((pdwquotaallowed?.value ?: 0L).toString(), (pdwquotaused?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadEnabledXStateFeatures(): ULong =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_getThreadEnabledXStateFeatures() as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUserNameA(lpbuffer: Pstr, pcbbuffer: COpaquePointer?): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_getUserNameA((lpbuffer?.value ?: 0L).toString(), (pcbbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUserNameW(lpbuffer: Pwstr, pcbbuffer: COpaquePointer?): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_getUserNameW((lpbuffer?.value ?: 0L).toString(), (pcbbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVersionFromFileA(lpszfilename: Pcstr, pdwmsver: COpaquePointer?, pdwlsver: COpaquePointer?, bversion: Bool): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_getVersionFromFileA((lpszfilename?.value ?: 0L).toString(), (pdwmsver?.value ?: 0L).toString(), (pdwlsver?.value ?: 0L).toString(), bversion) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVersionFromFileExA(lpszfilename: Pcstr, pdwmsver: COpaquePointer?, pdwlsver: COpaquePointer?, bversion: Bool): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_getVersionFromFileExA((lpszfilename?.value ?: 0L).toString(), (pdwmsver?.value ?: 0L).toString(), (pdwlsver?.value ?: 0L).toString(), bversion) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVersionFromFileExW(lpszfilename: Pcwstr, pdwmsver: COpaquePointer?, pdwlsver: COpaquePointer?, bversion: Bool): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_getVersionFromFileExW((lpszfilename?.value ?: 0L).toString(), (pdwmsver?.value ?: 0L).toString(), (pdwlsver?.value ?: 0L).toString(), bversion) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVersionFromFileW(lpszfilename: Pcwstr, pdwmsver: COpaquePointer?, pdwlsver: COpaquePointer?, bversion: Bool): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_getVersionFromFileW((lpszfilename?.value ?: 0L).toString(), (pdwmsver?.value ?: 0L).toString(), (pdwlsver?.value ?: 0L).toString(), bversion) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowRegionData(hwnd: Hwnd, size: UInt, prd: COpaquePointer?): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_getWindowRegionData((hwnd?.value ?: 0L).toString(), size.toInt(), (prd?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalCompact(dwminfree: UInt): ULong =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_globalCompact(dwminfree.toInt()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalFix(hmem: Hglobal) {
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        _windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_globalFix((hmem?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun globalUnWire(hmem: Hglobal): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_globalUnWire((hmem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalUnfix(hmem: Hglobal) {
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        _windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_globalUnfix((hmem?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun globalWire(hmem: Hglobal): COpaquePointer? =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_globalWire((hmem?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iMPGetIMEA(param0: Hwnd, param1: COpaquePointer?): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_iMPGetIMEA((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iMPGetIMEW(param0: Hwnd, param1: COpaquePointer?): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_iMPGetIMEW((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iMPQueryIMEA(param0: COpaquePointer?): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_iMPQueryIMEA((param0?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iMPQueryIMEW(param0: COpaquePointer?): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_iMPQueryIMEW((param0?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iMPSetIMEA(param0: Hwnd, param1: COpaquePointer?): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_iMPSetIMEA((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iMPSetIMEW(param0: Hwnd, param1: COpaquePointer?): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_iMPSetIMEW((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isApiSetImplemented(contract: Pcstr): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_isApiSetImplemented((contract?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isBadHugeReadPtr(lp: COpaquePointer?, ucb: ULong): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_isBadHugeReadPtr((lp?.value ?: 0L).toString(), ucb.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isBadHugeWritePtr(lp: COpaquePointer?, ucb: ULong): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_isBadHugeWritePtr((lp?.value ?: 0L).toString(), ucb.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isNTAdmin(dwreserved: UInt, lpdwreserved: COpaquePointer?): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_isNTAdmin(dwreserved.toInt(), (lpdwreserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isNativeVhdBoot(nativevhdboot: COpaquePointer?): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_isNativeVhdBoot((nativevhdboot?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isTokenUntrusted(tokenhandle: Handle): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_isTokenUntrusted((tokenhandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun launchINFSectionExW(hwnd: Hwnd, hinstance: Hinstance, pszparms: Pcwstr, nshow: Int): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_launchINFSectionExW((hwnd?.value ?: 0L).toString(), (hinstance?.value ?: 0L).toString(), (pszparms?.value ?: 0L).toString(), nshow) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun launchINFSectionW(hwndowner: Hwnd, hinstance: Hinstance, pszparams: Pwstr, nshow: Int): Int =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_launchINFSectionW((hwndowner?.value ?: 0L).toString(), (hinstance?.value ?: 0L).toString(), (pszparams?.value ?: 0L).toString(), nshow) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localCompact(uminfree: UInt): ULong =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_localCompact(uminfree.toInt()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localShrink(hmem: Hlocal, cbnewsize: UInt): ULong =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_localShrink((hmem?.value ?: 0L).toString(), cbnewsize.toInt()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mulDiv(nnumber: Int, nnumerator: Int, ndenominator: Int): Int =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_mulDiv(nnumber, nnumerator, ndenominator) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun needReboot(dwrebootcheck: UInt): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_needReboot(dwrebootcheck.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun needRebootInit(): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_needRebootInit() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openINFEngineA(pszinffilename: Pcstr, pszinstallsection: Pcstr, dwflags: UInt, phinf: COpaquePointer?, pvreserved: COpaquePointer?): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_openINFEngineA((pszinffilename?.value ?: 0L).toString(), (pszinstallsection?.value ?: 0L).toString(), dwflags.toInt(), (phinf?.value ?: 0L).toString(), (pvreserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openINFEngineW(pszinffilename: Pcwstr, pszinstallsection: Pcwstr, dwflags: UInt, phinf: COpaquePointer?, pvreserved: COpaquePointer?): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_openINFEngineW((pszinffilename?.value ?: 0L).toString(), (pszinstallsection?.value ?: 0L).toString(), dwflags.toInt(), (phinf?.value ?: 0L).toString(), (pvreserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openMutexA(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcstr): Handle =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_openMutexA(dwdesiredaccess.toInt(), binherithandle, (lpname?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openSemaphoreA(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcstr): Handle =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_openSemaphoreA(dwdesiredaccess.toInt(), binherithandle, (lpname?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryAuxiliaryCounterFrequency(lpauxiliarycounterfrequency: COpaquePointer?): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_queryAuxiliaryCounterFrequency((lpauxiliarycounterfrequency?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryIdleProcessorCycleTime(bufferlength: COpaquePointer?, processoridlecycletime: COpaquePointer?): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_queryIdleProcessorCycleTime((bufferlength?.value ?: 0L).toString(), (processoridlecycletime?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryIdleProcessorCycleTimeEx(group: UShort, bufferlength: COpaquePointer?, processoridlecycletime: COpaquePointer?): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_queryIdleProcessorCycleTimeEx(group.toInt(), (bufferlength?.value ?: 0L).toString(), (processoridlecycletime?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryInterruptTime(lpinterrupttime: COpaquePointer?) {
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        _windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_queryInterruptTime((lpinterrupttime?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun queryInterruptTimePrecise(lpinterrupttimeprecise: COpaquePointer?) {
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        _windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_queryInterruptTimePrecise((lpinterrupttimeprecise?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun queryProcessCycleTime(processhandle: Handle, cycletime: COpaquePointer?): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_queryProcessCycleTime((processhandle?.value ?: 0L).toString(), (cycletime?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryThreadCycleTime(threadhandle: Handle, cycletime: COpaquePointer?): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_queryThreadCycleTime((threadhandle?.value ?: 0L).toString(), (cycletime?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryUnbiasedInterruptTime(unbiasedtime: COpaquePointer?): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_queryUnbiasedInterruptTime((unbiasedtime?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryUnbiasedInterruptTimePrecise(lpunbiasedinterrupttimeprecise: COpaquePointer?) {
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        _windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_queryUnbiasedInterruptTimePrecise((lpunbiasedinterrupttimeprecise?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun raiseCustomSystemEventTrigger(customsystemeventtriggerconfig: COpaquePointer?): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_raiseCustomSystemEventTrigger((customsystemeventtriggerconfig?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rebootCheckOnInstallA(hwnd: Hwnd, pszinf: Pcstr, pszsec: Pcstr, dwreserved: UInt): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_rebootCheckOnInstallA((hwnd?.value ?: 0L).toString(), (pszinf?.value ?: 0L).toString(), (pszsec?.value ?: 0L).toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rebootCheckOnInstallW(hwnd: Hwnd, pszinf: Pcwstr, pszsec: Pcwstr, dwreserved: UInt): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_rebootCheckOnInstallW((hwnd?.value ?: 0L).toString(), (pszinf?.value ?: 0L).toString(), (pszsec?.value ?: 0L).toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recordFeatureError(featureid: UInt, error: COpaquePointer?) {
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        _windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_recordFeatureError(featureid.toInt(), (error?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun recordFeatureUsage(featureid: UInt, kind: UInt, addend: UInt, originname: Pcstr) {
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        _windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_recordFeatureUsage(featureid.toInt(), kind.toInt(), addend.toInt(), (originname?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun regInstallA(hmod: Hmodule, pszsection: Pcstr, psttable: COpaquePointer?): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_regInstallA((hmod?.value ?: 0L).toString(), (pszsection?.value ?: 0L).toString(), (psttable?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regInstallW(hmod: Hmodule, pszsection: Pcwstr, psttable: COpaquePointer?): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_regInstallW((hmod?.value ?: 0L).toString(), (pszsection?.value ?: 0L).toString(), (psttable?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regRestoreAllA(hwnd: Hwnd, psztitlestring: Pcstr, hkbckupkey: Hkey): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_regRestoreAllA((hwnd?.value ?: 0L).toString(), (psztitlestring?.value ?: 0L).toString(), (hkbckupkey?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regRestoreAllW(hwnd: Hwnd, psztitlestring: Pcwstr, hkbckupkey: Hkey): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_regRestoreAllW((hwnd?.value ?: 0L).toString(), (psztitlestring?.value ?: 0L).toString(), (hkbckupkey?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regSaveRestoreA(hwnd: Hwnd, psztitlestring: Pcstr, hkbckupkey: Hkey, pcszrootkey: Pcstr, pcszsubkey: Pcstr, pcszvaluename: Pcstr, dwflags: UInt): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_regSaveRestoreA((hwnd?.value ?: 0L).toString(), (psztitlestring?.value ?: 0L).toString(), (hkbckupkey?.value ?: 0L).toString(), (pcszrootkey?.value ?: 0L).toString(), (pcszsubkey?.value ?: 0L).toString(), (pcszvaluename?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regSaveRestoreOnINFA(hwnd: Hwnd, psztitle: Pcstr, pszinf: Pcstr, pszsection: Pcstr, hhklmbackkey: Hkey, hhkcubackkey: Hkey, dwflags: UInt): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_regSaveRestoreOnINFA((hwnd?.value ?: 0L).toString(), (psztitle?.value ?: 0L).toString(), (pszinf?.value ?: 0L).toString(), (pszsection?.value ?: 0L).toString(), (hhklmbackkey?.value ?: 0L).toString(), (hhkcubackkey?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regSaveRestoreOnINFW(hwnd: Hwnd, psztitle: Pcwstr, pszinf: Pcwstr, pszsection: Pcwstr, hhklmbackkey: Hkey, hhkcubackkey: Hkey, dwflags: UInt): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_regSaveRestoreOnINFW((hwnd?.value ?: 0L).toString(), (psztitle?.value ?: 0L).toString(), (pszinf?.value ?: 0L).toString(), (pszsection?.value ?: 0L).toString(), (hhklmbackkey?.value ?: 0L).toString(), (hhkcubackkey?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regSaveRestoreW(hwnd: Hwnd, psztitlestring: Pcwstr, hkbckupkey: Hkey, pcszrootkey: Pcwstr, pcszsubkey: Pcwstr, pcszvaluename: Pcwstr, dwflags: UInt): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_regSaveRestoreW((hwnd?.value ?: 0L).toString(), (psztitlestring?.value ?: 0L).toString(), (hkbckupkey?.value ?: 0L).toString(), (pcszrootkey?.value ?: 0L).toString(), (pcszsubkey?.value ?: 0L).toString(), (pcszvaluename?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun replacePartitionUnit(targetpartition: Pcwstr, sparepartition: Pcwstr, flags: UInt): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_replacePartitionUnit((targetpartition?.value ?: 0L).toString(), (sparepartition?.value ?: 0L).toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun requestDeviceWakeup(hdevice: Handle): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_requestDeviceWakeup((hdevice?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlAnsiStringToUnicodeString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?, allocatedestinationstring: Boolean): Ntstatus =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_rtlAnsiStringToUnicodeString((destinationstring?.value ?: 0L).toString(), (sourcestring?.value ?: 0L).toString(), allocatedestinationstring) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCharToInteger(string: COpaquePointer?, base: UInt, value: COpaquePointer?): Ntstatus =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_rtlCharToInteger((string?.value ?: 0L).toString(), base.toInt(), (value?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFreeAnsiString(ansistring: COpaquePointer?) {
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        _windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_rtlFreeAnsiString((ansistring?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlFreeOemString(oemstring: COpaquePointer?) {
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        _windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_rtlFreeOemString((oemstring?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlFreeUnicodeString(unicodestring: COpaquePointer?) {
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        _windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_rtlFreeUnicodeString((unicodestring?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlGetReturnAddressHijackTarget(): ULong =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_rtlGetReturnAddressHijackTarget() as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInitAnsiString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?) {
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        _windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_rtlInitAnsiString((destinationstring?.value ?: 0L).toString(), (sourcestring?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlInitAnsiStringEx(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?): Ntstatus =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_rtlInitAnsiStringEx((destinationstring?.value ?: 0L).toString(), (sourcestring?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInitString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?) {
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        _windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_rtlInitString((destinationstring?.value ?: 0L).toString(), (sourcestring?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlInitStringEx(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?): Ntstatus =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_rtlInitStringEx((destinationstring?.value ?: 0L).toString(), (sourcestring?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInitUnicodeString(destinationstring: COpaquePointer?, sourcestring: Pcwstr) {
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        _windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_rtlInitUnicodeString((destinationstring?.value ?: 0L).toString(), (sourcestring?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlIsNameLegalDOS8Dot3(name: COpaquePointer?, oemname: COpaquePointer?, namecontainsspaces: COpaquePointer?): Boolean =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_rtlIsNameLegalDOS8Dot3((name?.value ?: 0L).toString(), (oemname?.value ?: 0L).toString(), (namecontainsspaces?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlLocalTimeToSystemTime(localtime: COpaquePointer?, systemtime: COpaquePointer?): Ntstatus =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_rtlLocalTimeToSystemTime((localtime?.value ?: 0L).toString(), (systemtime?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlRaiseCustomSystemEventTrigger(triggerconfig: COpaquePointer?): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_rtlRaiseCustomSystemEventTrigger((triggerconfig?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlTimeToSecondsSince1970(time: COpaquePointer?, elapsedseconds: COpaquePointer?): Boolean =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_rtlTimeToSecondsSince1970((time?.value ?: 0L).toString(), (elapsedseconds?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUnicodeStringToAnsiString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?, allocatedestinationstring: Boolean): Ntstatus =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_rtlUnicodeStringToAnsiString((destinationstring?.value ?: 0L).toString(), (sourcestring?.value ?: 0L).toString(), allocatedestinationstring) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUnicodeStringToOemString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?, allocatedestinationstring: Boolean): Ntstatus =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_rtlUnicodeStringToOemString((destinationstring?.value ?: 0L).toString(), (sourcestring?.value ?: 0L).toString(), allocatedestinationstring) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUnicodeToMultiByteSize(bytesinmultibytestring: COpaquePointer?, unicodestring: Pcwstr, bytesinunicodestring: UInt): Ntstatus =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_rtlUnicodeToMultiByteSize((bytesinmultibytestring?.value ?: 0L).toString(), (unicodestring?.value ?: 0L).toString(), bytesinunicodestring.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUniform(seed: COpaquePointer?): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_rtlUniform((seed?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun runSetupCommandA(hwnd: Hwnd, szcmdname: Pcstr, szinfsection: Pcstr, szdir: Pcstr, lpsztitle: Pcstr, phexe: COpaquePointer?, dwflags: UInt, pvreserved: COpaquePointer?): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_runSetupCommandA((hwnd?.value ?: 0L).toString(), (szcmdname?.value ?: 0L).toString(), (szinfsection?.value ?: 0L).toString(), (szdir?.value ?: 0L).toString(), (lpsztitle?.value ?: 0L).toString(), (phexe?.value ?: 0L).toString(), dwflags.toInt(), (pvreserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun runSetupCommandW(hwnd: Hwnd, szcmdname: Pcwstr, szinfsection: Pcwstr, szdir: Pcwstr, lpsztitle: Pcwstr, phexe: COpaquePointer?, dwflags: UInt, pvreserved: COpaquePointer?): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_runSetupCommandW((hwnd?.value ?: 0L).toString(), (szcmdname?.value ?: 0L).toString(), (szinfsection?.value ?: 0L).toString(), (szdir?.value ?: 0L).toString(), (lpsztitle?.value ?: 0L).toString(), (phexe?.value ?: 0L).toString(), dwflags.toInt(), (pvreserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendIMEMessageExA(param0: Hwnd, param1: Lparam): Lresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_sendIMEMessageExA((param0?.value ?: 0L).toString(), param1.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendIMEMessageExW(param0: Hwnd, param1: Lparam): Lresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_sendIMEMessageExW((param0?.value ?: 0L).toString(), param1.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setEnvironmentStringsA(newenvironment: Pcstr): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_setEnvironmentStringsA((newenvironment?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFirmwareEnvironmentVariableA(lpname: Pcstr, lpguid: Pcstr, pvalue: COpaquePointer?, nsize: UInt): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_setFirmwareEnvironmentVariableA((lpname?.value ?: 0L).toString(), (lpguid?.value ?: 0L).toString(), (pvalue?.value ?: 0L).toString(), nsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFirmwareEnvironmentVariableExA(lpname: Pcstr, lpguid: Pcstr, pvalue: COpaquePointer?, nsize: UInt, dwattributes: UInt): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_setFirmwareEnvironmentVariableExA((lpname?.value ?: 0L).toString(), (lpguid?.value ?: 0L).toString(), (pvalue?.value ?: 0L).toString(), nsize.toInt(), dwattributes.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFirmwareEnvironmentVariableExW(lpname: Pcwstr, lpguid: Pcwstr, pvalue: COpaquePointer?, nsize: UInt, dwattributes: UInt): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_setFirmwareEnvironmentVariableExW((lpname?.value ?: 0L).toString(), (lpguid?.value ?: 0L).toString(), (pvalue?.value ?: 0L).toString(), nsize.toInt(), dwattributes.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFirmwareEnvironmentVariableW(lpname: Pcwstr, lpguid: Pcwstr, pvalue: COpaquePointer?, nsize: UInt): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_setFirmwareEnvironmentVariableW((lpname?.value ?: 0L).toString(), (lpguid?.value ?: 0L).toString(), (pvalue?.value ?: 0L).toString(), nsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setHandleCount(unumber: UInt): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_setHandleCount(unumber.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMessageWaitingIndicator(hmsgindicator: Handle, ulmsgcount: UInt): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_setMessageWaitingIndicator((hmsgindicator?.value ?: 0L).toString(), ulmsgcount.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPerUserSecValuesA(pperuser: COpaquePointer?): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_setPerUserSecValuesA((pperuser?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPerUserSecValuesW(pperuser: COpaquePointer?): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_setPerUserSecValuesW((pperuser?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun subscribeFeatureStateChangeNotification(subscription: COpaquePointer?, callback: PfeatureStateChangeCallback, context: COpaquePointer?) {
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        _windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_subscribeFeatureStateChangeNotification((subscription?.value ?: 0L).toString(), 0L.toString(), (context?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun translateInfStringA(pszinffilename: Pcstr, pszinstallsection: Pcstr, psztranslatesection: Pcstr, psztranslatekey: Pcstr, pszbuffer: Pstr, cchbuffer: UInt, pdwrequiredsize: COpaquePointer?, pvreserved: COpaquePointer?): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_translateInfStringA((pszinffilename?.value ?: 0L).toString(), (pszinstallsection?.value ?: 0L).toString(), (psztranslatesection?.value ?: 0L).toString(), (psztranslatekey?.value ?: 0L).toString(), (pszbuffer?.value ?: 0L).toString(), cchbuffer.toInt(), (pdwrequiredsize?.value ?: 0L).toString(), (pvreserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun translateInfStringExA(hinf: COpaquePointer?, pszinffilename: Pcstr, psztranslatesection: Pcstr, psztranslatekey: Pcstr, pszbuffer: Pstr, dwbuffersize: UInt, pdwrequiredsize: COpaquePointer?, pvreserved: COpaquePointer?): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_translateInfStringExA((hinf?.value ?: 0L).toString(), (pszinffilename?.value ?: 0L).toString(), (psztranslatesection?.value ?: 0L).toString(), (psztranslatekey?.value ?: 0L).toString(), (pszbuffer?.value ?: 0L).toString(), dwbuffersize.toInt(), (pdwrequiredsize?.value ?: 0L).toString(), (pvreserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun translateInfStringExW(hinf: COpaquePointer?, pszinffilename: Pcwstr, psztranslatesection: Pcwstr, psztranslatekey: Pcwstr, pszbuffer: Pwstr, dwbuffersize: UInt, pdwrequiredsize: COpaquePointer?, pvreserved: COpaquePointer?): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_translateInfStringExW((hinf?.value ?: 0L).toString(), (pszinffilename?.value ?: 0L).toString(), (psztranslatesection?.value ?: 0L).toString(), (psztranslatekey?.value ?: 0L).toString(), (pszbuffer?.value ?: 0L).toString(), dwbuffersize.toInt(), (pdwrequiredsize?.value ?: 0L).toString(), (pvreserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun translateInfStringW(pszinffilename: Pcwstr, pszinstallsection: Pcwstr, psztranslatesection: Pcwstr, psztranslatekey: Pcwstr, pszbuffer: Pwstr, cchbuffer: UInt, pdwrequiredsize: COpaquePointer?, pvreserved: COpaquePointer?): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_translateInfStringW((pszinffilename?.value ?: 0L).toString(), (pszinstallsection?.value ?: 0L).toString(), (psztranslatesection?.value ?: 0L).toString(), (psztranslatekey?.value ?: 0L).toString(), (pszbuffer?.value ?: 0L).toString(), cchbuffer.toInt(), (pdwrequiredsize?.value ?: 0L).toString(), (pvreserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unsubscribeFeatureStateChangeNotification(subscription: FeatureStateChangeSubscription) {
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        _windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_unsubscribeFeatureStateChangeNotification((subscription?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun userInstStubWrapperA(hwnd: Hwnd, hinstance: Hinstance, pszparms: Pcstr, nshow: Int): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_userInstStubWrapperA((hwnd?.value ?: 0L).toString(), (hinstance?.value ?: 0L).toString(), (pszparms?.value ?: 0L).toString(), nshow) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun userInstStubWrapperW(hwnd: Hwnd, hinstance: Hinstance, pszparms: Pcwstr, nshow: Int): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_userInstStubWrapperW((hwnd?.value ?: 0L).toString(), (hinstance?.value ?: 0L).toString(), (pszparms?.value ?: 0L).toString(), nshow) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun userUnInstStubWrapperA(hwnd: Hwnd, hinstance: Hinstance, pszparms: Pcstr, nshow: Int): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_userUnInstStubWrapperA((hwnd?.value ?: 0L).toString(), (hinstance?.value ?: 0L).toString(), (pszparms?.value ?: 0L).toString(), nshow) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun userUnInstStubWrapperW(hwnd: Hwnd, hinstance: Hinstance, pszparms: Pcwstr, nshow: Int): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_userUnInstStubWrapperW((hwnd?.value ?: 0L).toString(), (hinstance?.value ?: 0L).toString(), (pszparms?.value ?: 0L).toString(), nshow) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wINNLSEnableIME(param0: Hwnd, param1: Bool): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_wINNLSEnableIME((param0?.value ?: 0L).toString(), param1) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wINNLSGetEnableStatus(param0: Hwnd): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_wINNLSGetEnableStatus((param0?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wINNLSGetIMEHotkey(param0: Hwnd): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_wINNLSGetIMEHotkey((param0?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winWatchClose(hww: Hwinwatch) {
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        _windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_winWatchClose((hww?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun winWatchDidStatusChange(hww: Hwinwatch): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_winWatchDidStatusChange((hww?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winWatchGetClipList(hww: Hwinwatch, prc: COpaquePointer?, size: UInt, prd: COpaquePointer?): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_winWatchGetClipList((hww?.value ?: 0L).toString(), (prc?.value ?: 0L).toString(), size.toInt(), (prd?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winWatchNotify(hww: Hwinwatch, notifycallback: Winwatchnotifyproc, notifyparam: Lparam): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_winWatchNotify((hww?.value ?: 0L).toString(), 0L.toString(), notifyparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winWatchOpen(hwnd: Hwnd): Hwinwatch =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_winWatchOpen((hwnd?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wldpCanExecuteBuffer(host: COpaquePointer?, options: WldpExecutionEvaluationOptions, buffer: COpaquePointer?, buffersize: UInt, auditinfo: Pcwstr, result: COpaquePointer?): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_wldpCanExecuteBuffer((host?.value ?: 0L).toString(), options, (buffer?.value ?: 0L).toString(), buffersize.toInt(), (auditinfo?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wldpCanExecuteFile(host: COpaquePointer?, options: WldpExecutionEvaluationOptions, filehandle: Handle, auditinfo: Pcwstr, result: COpaquePointer?): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_wldpCanExecuteFile((host?.value ?: 0L).toString(), options, (filehandle?.value ?: 0L).toString(), (auditinfo?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wldpCanExecuteStream(host: COpaquePointer?, options: WldpExecutionEvaluationOptions, stream: COpaquePointer?, auditinfo: Pcwstr, result: COpaquePointer?): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_wldpCanExecuteStream((host?.value ?: 0L).toString(), options, (stream?.value ?: 0L).toString(), (auditinfo?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wldpGetLockdownPolicy(hostinformation: COpaquePointer?, lockdownstate: COpaquePointer?, lockdownflags: UInt): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_wldpGetLockdownPolicy((hostinformation?.value ?: 0L).toString(), (lockdownstate?.value ?: 0L).toString(), lockdownflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wldpIsClassInApprovedList(classid: COpaquePointer?, hostinformation: COpaquePointer?, isapproved: COpaquePointer?, optionalflags: UInt): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_wldpIsClassInApprovedList((classid?.value ?: 0L).toString(), (hostinformation?.value ?: 0L).toString(), (isapproved?.value ?: 0L).toString(), optionalflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wldpIsDynamicCodePolicyEnabled(isenabled: COpaquePointer?): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_wldpIsDynamicCodePolicyEnabled((isenabled?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wldpQueryDeviceSecurityInformation(information: COpaquePointer?, informationlength: UInt, returnlength: COpaquePointer?): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_wldpQueryDeviceSecurityInformation((information?.value ?: 0L).toString(), informationlength.toInt(), (returnlength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wldpQueryDynamicCodeTrust(filehandle: Handle, baseimage: COpaquePointer?, imagesize: UInt): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_wldpQueryDynamicCodeTrust((filehandle?.value ?: 0L).toString(), (baseimage?.value ?: 0L).toString(), imagesize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wldpSetDynamicCodeTrust(filehandle: Handle): Hresult =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_wldpSetDynamicCodeTrust((filehandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writePrivateProfileSectionA(lpappname: Pcstr, lpstring: Pcstr, lpfilename: Pcstr): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_writePrivateProfileSectionA((lpappname?.value ?: 0L).toString(), (lpstring?.value ?: 0L).toString(), (lpfilename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writePrivateProfileSectionW(lpappname: Pcwstr, lpstring: Pcwstr, lpfilename: Pcwstr): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_writePrivateProfileSectionW((lpappname?.value ?: 0L).toString(), (lpstring?.value ?: 0L).toString(), (lpfilename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writePrivateProfileStringA(lpappname: Pcstr, lpkeyname: Pcstr, lpstring: Pcstr, lpfilename: Pcstr): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_writePrivateProfileStringA((lpappname?.value ?: 0L).toString(), (lpkeyname?.value ?: 0L).toString(), (lpstring?.value ?: 0L).toString(), (lpfilename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writePrivateProfileStringW(lpappname: Pcwstr, lpkeyname: Pcwstr, lpstring: Pcwstr, lpfilename: Pcwstr): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_writePrivateProfileStringW((lpappname?.value ?: 0L).toString(), (lpkeyname?.value ?: 0L).toString(), (lpstring?.value ?: 0L).toString(), (lpfilename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writePrivateProfileStructA(lpszsection: Pcstr, lpszkey: Pcstr, lpstruct: COpaquePointer?, usizestruct: UInt, szfile: Pcstr): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_writePrivateProfileStructA((lpszsection?.value ?: 0L).toString(), (lpszkey?.value ?: 0L).toString(), (lpstruct?.value ?: 0L).toString(), usizestruct.toInt(), (szfile?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writePrivateProfileStructW(lpszsection: Pcwstr, lpszkey: Pcwstr, lpstruct: COpaquePointer?, usizestruct: UInt, szfile: Pcwstr): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_writePrivateProfileStructW((lpszsection?.value ?: 0L).toString(), (lpszkey?.value ?: 0L).toString(), (lpstruct?.value ?: 0L).toString(), usizestruct.toInt(), (szfile?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeProfileSectionA(lpappname: Pcstr, lpstring: Pcstr): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_writeProfileSectionA((lpappname?.value ?: 0L).toString(), (lpstring?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeProfileSectionW(lpappname: Pcwstr, lpstring: Pcwstr): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_writeProfileSectionW((lpappname?.value ?: 0L).toString(), (lpstring?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeProfileStringA(lpappname: Pcstr, lpkeyname: Pcstr, lpstring: Pcstr): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_writeProfileStringA((lpappname?.value ?: 0L).toString(), (lpkeyname?.value ?: 0L).toString(), (lpstring?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeProfileStringW(lpappname: Pcwstr, lpkeyname: Pcwstr, lpstring: Pcwstr): Bool =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_writeProfileStringW((lpappname?.value ?: 0L).toString(), (lpkeyname?.value ?: 0L).toString(), (lpstring?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hread(hfile: Int, lpbuffer: COpaquePointer?, lbytes: Int): Int =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_hread(hfile, (lpbuffer?.value ?: 0L).toString(), lbytes) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hwrite(hfile: Int, lpbuffer: Pcstr, lbytes: Int): Int =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_hwrite(hfile, (lpbuffer?.value ?: 0L).toString(), lbytes) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lclose(hfile: Int): Int =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_lclose(hfile) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lcreat(lppathname: Pcstr, iattribute: Int): Int =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_lcreat((lppathname?.value ?: 0L).toString(), iattribute) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun llseek(hfile: Int, loffset: Int, iorigin: Int): Int =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_llseek(hfile, loffset, iorigin) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lopen(lppathname: Pcstr, ireadwrite: Int): Int =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_lopen((lppathname?.value ?: 0L).toString(), ireadwrite) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lread(hfile: Int, lpbuffer: COpaquePointer?, ubytes: UInt): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_lread(hfile, (lpbuffer?.value ?: 0L).toString(), ubytes.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lwrite(hfile: Int, lpbuffer: Pcstr, ubytes: UInt): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_lwrite(hfile, (lpbuffer?.value ?: 0L).toString(), ubytes.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uawLstrcmpW(string1: COpaquePointer?, string2: COpaquePointer?): Int =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_uawLstrcmpW((string1?.value ?: 0L).toString(), (string2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uawLstrcmpiW(string1: COpaquePointer?, string2: COpaquePointer?): Int =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_uawLstrcmpiW((string1?.value ?: 0L).toString(), (string2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uawLstrlenW(string: COpaquePointer?): Int =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_uawLstrlenW((string?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uawWcschr(string: COpaquePointer?, character: UShort): COpaquePointer? =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_uawWcschr((string?.value ?: 0L).toString(), character.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uawWcscpy(destination: COpaquePointer?, source: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_uawWcscpy((destination?.value ?: 0L).toString(), (source?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uawWcsicmp(string1: COpaquePointer?, string2: COpaquePointer?): Int =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_uawWcsicmp((string1?.value ?: 0L).toString(), (string2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uawWcslen(string: COpaquePointer?): ULong =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_uawWcslen((string?.value ?: 0L).toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uawWcsrchr(string: COpaquePointer?, character: UShort): COpaquePointer? =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_uawWcsrchr((string?.value ?: 0L).toString(), character.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")
