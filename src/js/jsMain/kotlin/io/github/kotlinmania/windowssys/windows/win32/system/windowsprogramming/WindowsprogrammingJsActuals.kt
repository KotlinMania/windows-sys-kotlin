@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HGLOBAL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HLOCAL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HMODULE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM
import io.github.kotlinmania.windowssys.windows.win32.foundation.LRESULT
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HDC
import io.github.kotlinmania.windowssys.windows.win32.system.registry.HKEY

private val _windowsWin32SystemWindowsprogrammingNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun AddDelBackupEntryA(lpcszfilelist: PCSTR, lpcszbackupdir: PCSTR, lpcszbasename: PCSTR, dwflags: UInt): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_AddDelBackupEntryA(lpcszfilelist.toString(), lpcszbackupdir.toString(), lpcszbasename.toString(), dwflags.toInt()) as Int) else 0

public actual fun AddDelBackupEntryW(lpcszfilelist: PCWSTR, lpcszbackupdir: PCWSTR, lpcszbasename: PCWSTR, dwflags: UInt): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_AddDelBackupEntryW(lpcszfilelist.toString(), lpcszbackupdir.toString(), lpcszbasename.toString(), dwflags.toInt()) as Int) else 0

public actual fun AdvInstallFileA(hwnd: HWND, lpszsourcedir: PCSTR, lpszsourcefile: PCSTR, lpszdestdir: PCSTR, lpszdestfile: PCSTR, dwflags: UInt, dwreserved: UInt): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_AdvInstallFileA(hwnd.toString(), lpszsourcedir.toString(), lpszsourcefile.toString(), lpszdestdir.toString(), lpszdestfile.toString(), dwflags.toInt(), dwreserved.toInt()) as Int) else 0

public actual fun AdvInstallFileW(hwnd: HWND, lpszsourcedir: PCWSTR, lpszsourcefile: PCWSTR, lpszdestdir: PCWSTR, lpszdestfile: PCWSTR, dwflags: UInt, dwreserved: UInt): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_AdvInstallFileW(hwnd.toString(), lpszsourcedir.toString(), lpszsourcefile.toString(), lpszdestdir.toString(), lpszdestfile.toString(), dwflags.toInt(), dwreserved.toInt()) as Int) else 0

public actual fun ApphelpCheckShellObject(objectclsid: Long, bshimifnecessary: BOOL, pullflags: Long): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_ApphelpCheckShellObject(objectclsid.toString(), bshimifnecessary, pullflags.toString()) as Int) else 0

public actual fun CancelDeviceWakeupRequest(hdevice: HANDLE): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_CancelDeviceWakeupRequest(hdevice.toString()) as Int) else 0

public actual fun CloseINFEngine(hinf: Long): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_CloseINFEngine(hinf.toString()) as Int) else 0

public actual fun ConvertAuxiliaryCounterToPerformanceCounter(ullauxiliarycountervalue: ULong, lpperformancecountervalue: Long, lpconversionerror: Long): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_ConvertAuxiliaryCounterToPerformanceCounter(ullauxiliarycountervalue.toString(), lpperformancecountervalue.toString(), lpconversionerror.toString()) as Int) else 0

public actual fun ConvertPerformanceCounterToAuxiliaryCounter(ullperformancecountervalue: ULong, lpauxiliarycountervalue: Long, lpconversionerror: Long): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_ConvertPerformanceCounterToAuxiliaryCounter(ullperformancecountervalue.toString(), lpauxiliarycountervalue.toString(), lpconversionerror.toString()) as Int) else 0

public actual fun DCIBeginAccess(pdci: Long, x: Int, y: Int, dx: Int, dy: Int): Int =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_DCIBeginAccess(pdci.toString(), x, y, dx, dy) as Int) else 0

public actual fun DCICloseProvider(hdc: HDC) {
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        _windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_DCICloseProvider(hdc.toString())
    }
}

public actual fun DCICreateOffscreen(hdc: HDC, dwcompression: UInt, dwredmask: UInt, dwgreenmask: UInt, dwbluemask: UInt, dwwidth: UInt, dwheight: UInt, dwdcicaps: UInt, dwbitcount: UInt, lplpsurface: Long): Int =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_DCICreateOffscreen(hdc.toString(), dwcompression.toInt(), dwredmask.toInt(), dwgreenmask.toInt(), dwbluemask.toInt(), dwwidth.toInt(), dwheight.toInt(), dwdcicaps.toInt(), dwbitcount.toInt(), lplpsurface.toString()) as Int) else 0

public actual fun DCICreateOverlay(hdc: HDC, lpoffscreensurf: Long, lplpsurface: Long): Int =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_DCICreateOverlay(hdc.toString(), lpoffscreensurf.toString(), lplpsurface.toString()) as Int) else 0

public actual fun DCICreatePrimary(hdc: HDC, lplpsurface: Long): Int =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_DCICreatePrimary(hdc.toString(), lplpsurface.toString()) as Int) else 0

public actual fun DCIDestroy(pdci: Long) {
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        _windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_DCIDestroy(pdci.toString())
    }
}

public actual fun DCIDraw(pdci: Long): Int =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_DCIDraw(pdci.toString()) as Int) else 0

public actual fun DCIEndAccess(pdci: Long) {
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        _windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_DCIEndAccess(pdci.toString())
    }
}

public actual fun DCIEnum(hdc: HDC, lprdst: Long, lprsrc: Long, lpfncallback: Long, lpcontext: Long): Int =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_DCIEnum(hdc.toString(), lprdst.toString(), lprsrc.toString(), lpfncallback.toString(), lpcontext.toString()) as Int) else 0

public actual fun DCIOpenProvider(): HDC =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_DCIOpenProvider() as String).toLong() else 0L

public actual fun DCISetClipList(pdci: Long, prd: Long): Int =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_DCISetClipList(pdci.toString(), prd.toString()) as Int) else 0

public actual fun DCISetDestination(pdci: Long, dst: Long, src: Long): Int =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_DCISetDestination(pdci.toString(), dst.toString(), src.toString()) as Int) else 0

public actual fun DCISetSrcDestClip(pdci: Long, srcrc: Long, destrc: Long, prd: Long): Int =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_DCISetSrcDestClip(pdci.toString(), srcrc.toString(), destrc.toString(), prd.toString()) as Int) else 0

public actual fun DelNodeA(pszfileordirname: PCSTR, dwflags: UInt): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_DelNodeA(pszfileordirname.toString(), dwflags.toInt()) as Int) else 0

public actual fun DelNodeRunDLL32W(hwnd: HWND, hinstance: HINSTANCE, pszparms: PWSTR, nshow: Int): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_DelNodeRunDLL32W(hwnd.toString(), hinstance.toString(), pszparms.toString(), nshow) as Int) else 0

public actual fun DelNodeW(pszfileordirname: PCWSTR, dwflags: UInt): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_DelNodeW(pszfileordirname.toString(), dwflags.toInt()) as Int) else 0

public actual fun DnsHostnameToComputerNameA(hostname: PCSTR, computername: PSTR, nsize: Long): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_DnsHostnameToComputerNameA(hostname.toString(), computername.toString(), nsize.toString()) as Int) else 0

public actual fun DnsHostnameToComputerNameW(hostname: PCWSTR, computername: PWSTR, nsize: Long): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_DnsHostnameToComputerNameW(hostname.toString(), computername.toString(), nsize.toString()) as Int) else 0

public actual fun DosDateTimeToFileTime(wfatdate: UShort, wfattime: UShort, lpfiletime: Long): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_DosDateTimeToFileTime(wfatdate.toInt(), wfattime.toInt(), lpfiletime.toString()) as Int) else 0

public actual fun EnableProcessOptionalXStateFeatures(features: ULong): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_EnableProcessOptionalXStateFeatures(features.toString()) as Int) else 0

public actual fun ExecuteCabA(hwnd: HWND, pcab: Long, preserved: Long): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_ExecuteCabA(hwnd.toString(), pcab.toString(), preserved.toString()) as Int) else 0

public actual fun ExecuteCabW(hwnd: HWND, pcab: Long, preserved: Long): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_ExecuteCabW(hwnd.toString(), pcab.toString(), preserved.toString()) as Int) else 0

public actual fun ExtractFilesA(pszcabname: PCSTR, pszexpanddir: PCSTR, dwflags: UInt, pszfilelist: PCSTR, lpreserved: Long, dwreserved: UInt): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_ExtractFilesA(pszcabname.toString(), pszexpanddir.toString(), dwflags.toInt(), pszfilelist.toString(), lpreserved.toString(), dwreserved.toInt()) as Int) else 0

public actual fun ExtractFilesW(pszcabname: PCWSTR, pszexpanddir: PCWSTR, dwflags: UInt, pszfilelist: PCWSTR, lpreserved: Long, dwreserved: UInt): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_ExtractFilesW(pszcabname.toString(), pszexpanddir.toString(), dwflags.toInt(), pszfilelist.toString(), lpreserved.toString(), dwreserved.toInt()) as Int) else 0

public actual fun FileSaveMarkNotExistA(lpfilelist: PCSTR, lpdir: PCSTR, lpbasename: PCSTR): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_FileSaveMarkNotExistA(lpfilelist.toString(), lpdir.toString(), lpbasename.toString()) as Int) else 0

public actual fun FileSaveMarkNotExistW(lpfilelist: PCWSTR, lpdir: PCWSTR, lpbasename: PCWSTR): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_FileSaveMarkNotExistW(lpfilelist.toString(), lpdir.toString(), lpbasename.toString()) as Int) else 0

public actual fun FileSaveRestoreOnINFA(hwnd: HWND, psztitle: PCSTR, pszinf: PCSTR, pszsection: PCSTR, pszbackupdir: PCSTR, pszbasebackupfile: PCSTR, dwflags: UInt): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_FileSaveRestoreOnINFA(hwnd.toString(), psztitle.toString(), pszinf.toString(), pszsection.toString(), pszbackupdir.toString(), pszbasebackupfile.toString(), dwflags.toInt()) as Int) else 0

public actual fun FileSaveRestoreOnINFW(hwnd: HWND, psztitle: PCWSTR, pszinf: PCWSTR, pszsection: PCWSTR, pszbackupdir: PCWSTR, pszbasebackupfile: PCWSTR, dwflags: UInt): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_FileSaveRestoreOnINFW(hwnd.toString(), psztitle.toString(), pszinf.toString(), pszsection.toString(), pszbackupdir.toString(), pszbasebackupfile.toString(), dwflags.toInt()) as Int) else 0

public actual fun FileSaveRestoreW(hdlg: HWND, lpfilelist: PCWSTR, lpdir: PCWSTR, lpbasename: PCWSTR, dwflags: UInt): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_FileSaveRestoreW(hdlg.toString(), lpfilelist.toString(), lpdir.toString(), lpbasename.toString(), dwflags.toInt()) as Int) else 0

public actual fun FileTimeToDosDateTime(lpfiletime: Long, lpfatdate: Long, lpfattime: Long): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_FileTimeToDosDateTime(lpfiletime.toString(), lpfatdate.toString(), lpfattime.toString()) as Int) else 0

public actual fun GdiEntry13(): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_GdiEntry13() as Int).toUInt() else 0u

public actual fun GetComputerNameA(lpbuffer: PSTR, nsize: Long): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_GetComputerNameA(lpbuffer.toString(), nsize.toString()) as Int) else 0

public actual fun GetComputerNameW(lpbuffer: PWSTR, nsize: Long): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_GetComputerNameW(lpbuffer.toString(), nsize.toString()) as Int) else 0

public actual fun GetCurrentHwProfileA(lphwprofileinfo: Long): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_GetCurrentHwProfileA(lphwprofileinfo.toString()) as Int) else 0

public actual fun GetCurrentHwProfileW(lphwprofileinfo: Long): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_GetCurrentHwProfileW(lphwprofileinfo.toString()) as Int) else 0

public actual fun GetDCRegionData(hdc: HDC, size: UInt, prd: Long): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_GetDCRegionData(hdc.toString(), size.toInt(), prd.toString()) as Int).toUInt() else 0u

public actual fun GetFeatureEnabledState(featureid: UInt, changetime: FEATURE_CHANGE_TIME): FEATURE_ENABLED_STATE =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_GetFeatureEnabledState(featureid.toInt(), changetime) as Int) else 0

public actual fun GetFeatureVariant(featureid: UInt, changetime: FEATURE_CHANGE_TIME, payloadid: Long, hasnotification: Long): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_GetFeatureVariant(featureid.toInt(), changetime, payloadid.toString(), hasnotification.toString()) as Int).toUInt() else 0u

public actual fun GetFirmwareEnvironmentVariableA(lpname: PCSTR, lpguid: PCSTR, pbuffer: Long, nsize: UInt): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_GetFirmwareEnvironmentVariableA(lpname.toString(), lpguid.toString(), pbuffer.toString(), nsize.toInt()) as Int).toUInt() else 0u

public actual fun GetFirmwareEnvironmentVariableExA(lpname: PCSTR, lpguid: PCSTR, pbuffer: Long, nsize: UInt, pdwattribubutes: Long): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_GetFirmwareEnvironmentVariableExA(lpname.toString(), lpguid.toString(), pbuffer.toString(), nsize.toInt(), pdwattribubutes.toString()) as Int).toUInt() else 0u

public actual fun GetFirmwareEnvironmentVariableExW(lpname: PCWSTR, lpguid: PCWSTR, pbuffer: Long, nsize: UInt, pdwattribubutes: Long): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_GetFirmwareEnvironmentVariableExW(lpname.toString(), lpguid.toString(), pbuffer.toString(), nsize.toInt(), pdwattribubutes.toString()) as Int).toUInt() else 0u

public actual fun GetFirmwareEnvironmentVariableW(lpname: PCWSTR, lpguid: PCWSTR, pbuffer: Long, nsize: UInt): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_GetFirmwareEnvironmentVariableW(lpname.toString(), lpguid.toString(), pbuffer.toString(), nsize.toInt()) as Int).toUInt() else 0u

public actual fun GetPrivateProfileIntA(lpappname: PCSTR, lpkeyname: PCSTR, ndefault: Int, lpfilename: PCSTR): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_GetPrivateProfileIntA(lpappname.toString(), lpkeyname.toString(), ndefault, lpfilename.toString()) as Int).toUInt() else 0u

public actual fun GetPrivateProfileIntW(lpappname: PCWSTR, lpkeyname: PCWSTR, ndefault: Int, lpfilename: PCWSTR): Int =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_GetPrivateProfileIntW(lpappname.toString(), lpkeyname.toString(), ndefault, lpfilename.toString()) as Int) else 0

public actual fun GetPrivateProfileSectionA(lpappname: PCSTR, lpreturnedstring: PSTR, nsize: UInt, lpfilename: PCSTR): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_GetPrivateProfileSectionA(lpappname.toString(), lpreturnedstring.toString(), nsize.toInt(), lpfilename.toString()) as Int).toUInt() else 0u

public actual fun GetPrivateProfileSectionNamesA(lpszreturnbuffer: PSTR, nsize: UInt, lpfilename: PCSTR): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_GetPrivateProfileSectionNamesA(lpszreturnbuffer.toString(), nsize.toInt(), lpfilename.toString()) as Int).toUInt() else 0u

public actual fun GetPrivateProfileSectionNamesW(lpszreturnbuffer: PWSTR, nsize: UInt, lpfilename: PCWSTR): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_GetPrivateProfileSectionNamesW(lpszreturnbuffer.toString(), nsize.toInt(), lpfilename.toString()) as Int).toUInt() else 0u

public actual fun GetPrivateProfileSectionW(lpappname: PCWSTR, lpreturnedstring: PWSTR, nsize: UInt, lpfilename: PCWSTR): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_GetPrivateProfileSectionW(lpappname.toString(), lpreturnedstring.toString(), nsize.toInt(), lpfilename.toString()) as Int).toUInt() else 0u

public actual fun GetPrivateProfileStringA(lpappname: PCSTR, lpkeyname: PCSTR, lpdefault: PCSTR, lpreturnedstring: PSTR, nsize: UInt, lpfilename: PCSTR): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_GetPrivateProfileStringA(lpappname.toString(), lpkeyname.toString(), lpdefault.toString(), lpreturnedstring.toString(), nsize.toInt(), lpfilename.toString()) as Int).toUInt() else 0u

public actual fun GetPrivateProfileStringW(lpappname: PCWSTR, lpkeyname: PCWSTR, lpdefault: PCWSTR, lpreturnedstring: PWSTR, nsize: UInt, lpfilename: PCWSTR): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_GetPrivateProfileStringW(lpappname.toString(), lpkeyname.toString(), lpdefault.toString(), lpreturnedstring.toString(), nsize.toInt(), lpfilename.toString()) as Int).toUInt() else 0u

public actual fun GetPrivateProfileStructA(lpszsection: PCSTR, lpszkey: PCSTR, lpstruct: Long, usizestruct: UInt, szfile: PCSTR): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_GetPrivateProfileStructA(lpszsection.toString(), lpszkey.toString(), lpstruct.toString(), usizestruct.toInt(), szfile.toString()) as Int) else 0

public actual fun GetPrivateProfileStructW(lpszsection: PCWSTR, lpszkey: PCWSTR, lpstruct: Long, usizestruct: UInt, szfile: PCWSTR): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_GetPrivateProfileStructW(lpszsection.toString(), lpszkey.toString(), lpstruct.toString(), usizestruct.toInt(), szfile.toString()) as Int) else 0

public actual fun GetProfileIntA(lpappname: PCSTR, lpkeyname: PCSTR, ndefault: Int): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_GetProfileIntA(lpappname.toString(), lpkeyname.toString(), ndefault) as Int).toUInt() else 0u

public actual fun GetProfileIntW(lpappname: PCWSTR, lpkeyname: PCWSTR, ndefault: Int): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_GetProfileIntW(lpappname.toString(), lpkeyname.toString(), ndefault) as Int).toUInt() else 0u

public actual fun GetProfileSectionA(lpappname: PCSTR, lpreturnedstring: PSTR, nsize: UInt): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_GetProfileSectionA(lpappname.toString(), lpreturnedstring.toString(), nsize.toInt()) as Int).toUInt() else 0u

public actual fun GetProfileSectionW(lpappname: PCWSTR, lpreturnedstring: PWSTR, nsize: UInt): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_GetProfileSectionW(lpappname.toString(), lpreturnedstring.toString(), nsize.toInt()) as Int).toUInt() else 0u

public actual fun GetProfileStringA(lpappname: PCSTR, lpkeyname: PCSTR, lpdefault: PCSTR, lpreturnedstring: PSTR, nsize: UInt): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_GetProfileStringA(lpappname.toString(), lpkeyname.toString(), lpdefault.toString(), lpreturnedstring.toString(), nsize.toInt()) as Int).toUInt() else 0u

public actual fun GetProfileStringW(lpappname: PCWSTR, lpkeyname: PCWSTR, lpdefault: PCWSTR, lpreturnedstring: PWSTR, nsize: UInt): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_GetProfileStringW(lpappname.toString(), lpkeyname.toString(), lpdefault.toString(), lpreturnedstring.toString(), nsize.toInt()) as Int).toUInt() else 0u

public actual fun GetSystemRegistryQuota(pdwquotaallowed: Long, pdwquotaused: Long): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_GetSystemRegistryQuota(pdwquotaallowed.toString(), pdwquotaused.toString()) as Int) else 0

public actual fun GetThreadEnabledXStateFeatures(): ULong =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_GetThreadEnabledXStateFeatures() as String).toULong() else 0uL

public actual fun GetUserNameA(lpbuffer: PSTR, pcbbuffer: Long): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_GetUserNameA(lpbuffer.toString(), pcbbuffer.toString()) as Int) else 0

public actual fun GetUserNameW(lpbuffer: PWSTR, pcbbuffer: Long): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_GetUserNameW(lpbuffer.toString(), pcbbuffer.toString()) as Int) else 0

public actual fun GetVersionFromFileA(lpszfilename: PCSTR, pdwmsver: Long, pdwlsver: Long, bversion: BOOL): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_GetVersionFromFileA(lpszfilename.toString(), pdwmsver.toString(), pdwlsver.toString(), bversion) as Int) else 0

public actual fun GetVersionFromFileExA(lpszfilename: PCSTR, pdwmsver: Long, pdwlsver: Long, bversion: BOOL): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_GetVersionFromFileExA(lpszfilename.toString(), pdwmsver.toString(), pdwlsver.toString(), bversion) as Int) else 0

public actual fun GetVersionFromFileExW(lpszfilename: PCWSTR, pdwmsver: Long, pdwlsver: Long, bversion: BOOL): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_GetVersionFromFileExW(lpszfilename.toString(), pdwmsver.toString(), pdwlsver.toString(), bversion) as Int) else 0

public actual fun GetVersionFromFileW(lpszfilename: PCWSTR, pdwmsver: Long, pdwlsver: Long, bversion: BOOL): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_GetVersionFromFileW(lpszfilename.toString(), pdwmsver.toString(), pdwlsver.toString(), bversion) as Int) else 0

public actual fun GetWindowRegionData(hwnd: HWND, size: UInt, prd: Long): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_GetWindowRegionData(hwnd.toString(), size.toInt(), prd.toString()) as Int).toUInt() else 0u

public actual fun GlobalCompact(dwminfree: UInt): ULong =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_GlobalCompact(dwminfree.toInt()) as String).toULong() else 0uL

public actual fun GlobalFix(hmem: HGLOBAL) {
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        _windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_GlobalFix(hmem.toString())
    }
}

public actual fun GlobalUnWire(hmem: HGLOBAL): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_GlobalUnWire(hmem.toString()) as Int) else 0

public actual fun GlobalUnfix(hmem: HGLOBAL) {
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        _windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_GlobalUnfix(hmem.toString())
    }
}

public actual fun GlobalWire(hmem: HGLOBAL): Long =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_GlobalWire(hmem.toString()) as String).toLong() else 0L

public actual fun IMPGetIMEA(param0: HWND, param1: Long): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_IMPGetIMEA(param0.toString(), param1.toString()) as Int) else 0

public actual fun IMPGetIMEW(param0: HWND, param1: Long): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_IMPGetIMEW(param0.toString(), param1.toString()) as Int) else 0

public actual fun IMPQueryIMEA(param0: Long): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_IMPQueryIMEA(param0.toString()) as Int) else 0

public actual fun IMPQueryIMEW(param0: Long): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_IMPQueryIMEW(param0.toString()) as Int) else 0

public actual fun IMPSetIMEA(param0: HWND, param1: Long): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_IMPSetIMEA(param0.toString(), param1.toString()) as Int) else 0

public actual fun IMPSetIMEW(param0: HWND, param1: Long): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_IMPSetIMEW(param0.toString(), param1.toString()) as Int) else 0

public actual fun IsApiSetImplemented(contract: PCSTR): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_IsApiSetImplemented(contract.toString()) as Int) else 0

public actual fun IsBadHugeReadPtr(lp: Long, ucb: ULong): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_IsBadHugeReadPtr(lp.toString(), ucb.toString()) as Int) else 0

public actual fun IsBadHugeWritePtr(lp: Long, ucb: ULong): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_IsBadHugeWritePtr(lp.toString(), ucb.toString()) as Int) else 0

public actual fun IsNTAdmin(dwreserved: UInt, lpdwreserved: Long): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_IsNTAdmin(dwreserved.toInt(), lpdwreserved.toString()) as Int) else 0

public actual fun IsNativeVhdBoot(nativevhdboot: Long): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_IsNativeVhdBoot(nativevhdboot.toString()) as Int) else 0

public actual fun IsTokenUntrusted(tokenhandle: HANDLE): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_IsTokenUntrusted(tokenhandle.toString()) as Int) else 0

public actual fun LaunchINFSectionExW(hwnd: HWND, hinstance: HINSTANCE, pszparms: PCWSTR, nshow: Int): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_LaunchINFSectionExW(hwnd.toString(), hinstance.toString(), pszparms.toString(), nshow) as Int) else 0

public actual fun LaunchINFSectionW(hwndowner: HWND, hinstance: HINSTANCE, pszparams: PWSTR, nshow: Int): Int =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_LaunchINFSectionW(hwndowner.toString(), hinstance.toString(), pszparams.toString(), nshow) as Int) else 0

public actual fun LocalCompact(uminfree: UInt): ULong =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_LocalCompact(uminfree.toInt()) as String).toULong() else 0uL

public actual fun LocalShrink(hmem: HLOCAL, cbnewsize: UInt): ULong =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_LocalShrink(hmem.toString(), cbnewsize.toInt()) as String).toULong() else 0uL

public actual fun MulDiv(nnumber: Int, nnumerator: Int, ndenominator: Int): Int =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_MulDiv(nnumber, nnumerator, ndenominator) as Int) else 0

public actual fun NeedReboot(dwrebootcheck: UInt): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_NeedReboot(dwrebootcheck.toInt()) as Int) else 0

public actual fun NeedRebootInit(): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_NeedRebootInit() as Int).toUInt() else 0u

public actual fun OpenINFEngineA(pszinffilename: PCSTR, pszinstallsection: PCSTR, dwflags: UInt, phinf: Long, pvreserved: Long): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_OpenINFEngineA(pszinffilename.toString(), pszinstallsection.toString(), dwflags.toInt(), phinf.toString(), pvreserved.toString()) as Int) else 0

public actual fun OpenINFEngineW(pszinffilename: PCWSTR, pszinstallsection: PCWSTR, dwflags: UInt, phinf: Long, pvreserved: Long): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_OpenINFEngineW(pszinffilename.toString(), pszinstallsection.toString(), dwflags.toInt(), phinf.toString(), pvreserved.toString()) as Int) else 0

public actual fun OpenMutexA(dwdesiredaccess: UInt, binherithandle: BOOL, lpname: PCSTR): HANDLE =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_OpenMutexA(dwdesiredaccess.toInt(), binherithandle, lpname.toString()) as String).toLong() else 0L

public actual fun OpenSemaphoreA(dwdesiredaccess: UInt, binherithandle: BOOL, lpname: PCSTR): HANDLE =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_OpenSemaphoreA(dwdesiredaccess.toInt(), binherithandle, lpname.toString()) as String).toLong() else 0L

public actual fun QueryAuxiliaryCounterFrequency(lpauxiliarycounterfrequency: Long): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_QueryAuxiliaryCounterFrequency(lpauxiliarycounterfrequency.toString()) as Int) else 0

public actual fun QueryIdleProcessorCycleTime(bufferlength: Long, processoridlecycletime: Long): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_QueryIdleProcessorCycleTime(bufferlength.toString(), processoridlecycletime.toString()) as Int) else 0

public actual fun QueryIdleProcessorCycleTimeEx(group: UShort, bufferlength: Long, processoridlecycletime: Long): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_QueryIdleProcessorCycleTimeEx(group.toInt(), bufferlength.toString(), processoridlecycletime.toString()) as Int) else 0

public actual fun QueryInterruptTime(lpinterrupttime: Long) {
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        _windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_QueryInterruptTime(lpinterrupttime.toString())
    }
}

public actual fun QueryInterruptTimePrecise(lpinterrupttimeprecise: Long) {
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        _windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_QueryInterruptTimePrecise(lpinterrupttimeprecise.toString())
    }
}

public actual fun QueryProcessCycleTime(processhandle: HANDLE, cycletime: Long): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_QueryProcessCycleTime(processhandle.toString(), cycletime.toString()) as Int) else 0

public actual fun QueryThreadCycleTime(threadhandle: HANDLE, cycletime: Long): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_QueryThreadCycleTime(threadhandle.toString(), cycletime.toString()) as Int) else 0

public actual fun QueryUnbiasedInterruptTime(unbiasedtime: Long): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_QueryUnbiasedInterruptTime(unbiasedtime.toString()) as Int) else 0

public actual fun QueryUnbiasedInterruptTimePrecise(lpunbiasedinterrupttimeprecise: Long) {
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        _windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_QueryUnbiasedInterruptTimePrecise(lpunbiasedinterrupttimeprecise.toString())
    }
}

public actual fun RaiseCustomSystemEventTrigger(customsystemeventtriggerconfig: Long): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_RaiseCustomSystemEventTrigger(customsystemeventtriggerconfig.toString()) as Int).toUInt() else 0u

public actual fun RebootCheckOnInstallA(hwnd: HWND, pszinf: PCSTR, pszsec: PCSTR, dwreserved: UInt): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_RebootCheckOnInstallA(hwnd.toString(), pszinf.toString(), pszsec.toString(), dwreserved.toInt()) as Int) else 0

public actual fun RebootCheckOnInstallW(hwnd: HWND, pszinf: PCWSTR, pszsec: PCWSTR, dwreserved: UInt): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_RebootCheckOnInstallW(hwnd.toString(), pszinf.toString(), pszsec.toString(), dwreserved.toInt()) as Int) else 0

public actual fun RecordFeatureError(featureid: UInt, error: Long) {
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        _windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_RecordFeatureError(featureid.toInt(), error.toString())
    }
}

public actual fun RecordFeatureUsage(featureid: UInt, kind: UInt, addend: UInt, originname: PCSTR) {
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        _windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_RecordFeatureUsage(featureid.toInt(), kind.toInt(), addend.toInt(), originname.toString())
    }
}

public actual fun RegInstallA(hmod: HMODULE, pszsection: PCSTR, psttable: Long): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_RegInstallA(hmod.toString(), pszsection.toString(), psttable.toString()) as Int) else 0

public actual fun RegInstallW(hmod: HMODULE, pszsection: PCWSTR, psttable: Long): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_RegInstallW(hmod.toString(), pszsection.toString(), psttable.toString()) as Int) else 0

public actual fun RegRestoreAllA(hwnd: HWND, psztitlestring: PCSTR, hkbckupkey: HKEY): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_RegRestoreAllA(hwnd.toString(), psztitlestring.toString(), hkbckupkey.toString()) as Int) else 0

public actual fun RegRestoreAllW(hwnd: HWND, psztitlestring: PCWSTR, hkbckupkey: HKEY): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_RegRestoreAllW(hwnd.toString(), psztitlestring.toString(), hkbckupkey.toString()) as Int) else 0

public actual fun RegSaveRestoreA(hwnd: HWND, psztitlestring: PCSTR, hkbckupkey: HKEY, pcszrootkey: PCSTR, pcszsubkey: PCSTR, pcszvaluename: PCSTR, dwflags: UInt): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_RegSaveRestoreA(hwnd.toString(), psztitlestring.toString(), hkbckupkey.toString(), pcszrootkey.toString(), pcszsubkey.toString(), pcszvaluename.toString(), dwflags.toInt()) as Int) else 0

public actual fun RegSaveRestoreOnINFA(hwnd: HWND, psztitle: PCSTR, pszinf: PCSTR, pszsection: PCSTR, hhklmbackkey: HKEY, hhkcubackkey: HKEY, dwflags: UInt): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_RegSaveRestoreOnINFA(hwnd.toString(), psztitle.toString(), pszinf.toString(), pszsection.toString(), hhklmbackkey.toString(), hhkcubackkey.toString(), dwflags.toInt()) as Int) else 0

public actual fun RegSaveRestoreOnINFW(hwnd: HWND, psztitle: PCWSTR, pszinf: PCWSTR, pszsection: PCWSTR, hhklmbackkey: HKEY, hhkcubackkey: HKEY, dwflags: UInt): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_RegSaveRestoreOnINFW(hwnd.toString(), psztitle.toString(), pszinf.toString(), pszsection.toString(), hhklmbackkey.toString(), hhkcubackkey.toString(), dwflags.toInt()) as Int) else 0

public actual fun RegSaveRestoreW(hwnd: HWND, psztitlestring: PCWSTR, hkbckupkey: HKEY, pcszrootkey: PCWSTR, pcszsubkey: PCWSTR, pcszvaluename: PCWSTR, dwflags: UInt): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_RegSaveRestoreW(hwnd.toString(), psztitlestring.toString(), hkbckupkey.toString(), pcszrootkey.toString(), pcszsubkey.toString(), pcszvaluename.toString(), dwflags.toInt()) as Int) else 0

public actual fun ReplacePartitionUnit(targetpartition: PCWSTR, sparepartition: PCWSTR, flags: UInt): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_ReplacePartitionUnit(targetpartition.toString(), sparepartition.toString(), flags.toInt()) as Int) else 0

public actual fun RequestDeviceWakeup(hdevice: HANDLE): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_RequestDeviceWakeup(hdevice.toString()) as Int) else 0

public actual fun RtlAnsiStringToUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_RtlAnsiStringToUnicodeString(destinationstring.toString(), sourcestring.toString(), allocatedestinationstring) as Int) else 0

public actual fun RtlCharToInteger(string: Long, base: UInt, value: Long): NTSTATUS =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_RtlCharToInteger(string.toString(), base.toInt(), value.toString()) as Int) else 0

public actual fun RtlFreeAnsiString(ansistring: Long) {
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        _windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_RtlFreeAnsiString(ansistring.toString())
    }
}

public actual fun RtlFreeOemString(oemstring: Long) {
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        _windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_RtlFreeOemString(oemstring.toString())
    }
}

public actual fun RtlFreeUnicodeString(unicodestring: Long) {
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        _windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_RtlFreeUnicodeString(unicodestring.toString())
    }
}

public actual fun RtlGetReturnAddressHijackTarget(): ULong =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_RtlGetReturnAddressHijackTarget() as String).toULong() else 0uL

public actual fun RtlInitAnsiString(destinationstring: Long, sourcestring: Long) {
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        _windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_RtlInitAnsiString(destinationstring.toString(), sourcestring.toString())
    }
}

public actual fun RtlInitAnsiStringEx(destinationstring: Long, sourcestring: Long): NTSTATUS =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_RtlInitAnsiStringEx(destinationstring.toString(), sourcestring.toString()) as Int) else 0

public actual fun RtlInitString(destinationstring: Long, sourcestring: Long) {
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        _windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_RtlInitString(destinationstring.toString(), sourcestring.toString())
    }
}

public actual fun RtlInitStringEx(destinationstring: Long, sourcestring: Long): NTSTATUS =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_RtlInitStringEx(destinationstring.toString(), sourcestring.toString()) as Int) else 0

public actual fun RtlInitUnicodeString(destinationstring: Long, sourcestring: PCWSTR) {
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        _windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_RtlInitUnicodeString(destinationstring.toString(), sourcestring.toString())
    }
}

public actual fun RtlIsNameLegalDOS8Dot3(name: Long, oemname: Long, namecontainsspaces: Long): Boolean =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_RtlIsNameLegalDOS8Dot3(name.toString(), oemname.toString(), namecontainsspaces.toString()) as Boolean) else false

public actual fun RtlLocalTimeToSystemTime(localtime: Long, systemtime: Long): NTSTATUS =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_RtlLocalTimeToSystemTime(localtime.toString(), systemtime.toString()) as Int) else 0

public actual fun RtlRaiseCustomSystemEventTrigger(triggerconfig: Long): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_RtlRaiseCustomSystemEventTrigger(triggerconfig.toString()) as Int).toUInt() else 0u

public actual fun RtlTimeToSecondsSince1970(time: Long, elapsedseconds: Long): Boolean =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_RtlTimeToSecondsSince1970(time.toString(), elapsedseconds.toString()) as Boolean) else false

public actual fun RtlUnicodeStringToAnsiString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_RtlUnicodeStringToAnsiString(destinationstring.toString(), sourcestring.toString(), allocatedestinationstring) as Int) else 0

public actual fun RtlUnicodeStringToOemString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_RtlUnicodeStringToOemString(destinationstring.toString(), sourcestring.toString(), allocatedestinationstring) as Int) else 0

public actual fun RtlUnicodeToMultiByteSize(bytesinmultibytestring: Long, unicodestring: PCWSTR, bytesinunicodestring: UInt): NTSTATUS =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_RtlUnicodeToMultiByteSize(bytesinmultibytestring.toString(), unicodestring.toString(), bytesinunicodestring.toInt()) as Int) else 0

public actual fun RtlUniform(seed: Long): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_RtlUniform(seed.toString()) as Int).toUInt() else 0u

public actual fun RunSetupCommandA(hwnd: HWND, szcmdname: PCSTR, szinfsection: PCSTR, szdir: PCSTR, lpsztitle: PCSTR, phexe: Long, dwflags: UInt, pvreserved: Long): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_RunSetupCommandA(hwnd.toString(), szcmdname.toString(), szinfsection.toString(), szdir.toString(), lpsztitle.toString(), phexe.toString(), dwflags.toInt(), pvreserved.toString()) as Int) else 0

public actual fun RunSetupCommandW(hwnd: HWND, szcmdname: PCWSTR, szinfsection: PCWSTR, szdir: PCWSTR, lpsztitle: PCWSTR, phexe: Long, dwflags: UInt, pvreserved: Long): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_RunSetupCommandW(hwnd.toString(), szcmdname.toString(), szinfsection.toString(), szdir.toString(), lpsztitle.toString(), phexe.toString(), dwflags.toInt(), pvreserved.toString()) as Int) else 0

public actual fun SendIMEMessageExA(param0: HWND, param1: LPARAM): LRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_SendIMEMessageExA(param0.toString(), param1.toString()) as String).toLong() else 0L

public actual fun SendIMEMessageExW(param0: HWND, param1: LPARAM): LRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_SendIMEMessageExW(param0.toString(), param1.toString()) as String).toLong() else 0L

public actual fun SetEnvironmentStringsA(newenvironment: PCSTR): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_SetEnvironmentStringsA(newenvironment.toString()) as Int) else 0

public actual fun SetFirmwareEnvironmentVariableA(lpname: PCSTR, lpguid: PCSTR, pvalue: Long, nsize: UInt): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_SetFirmwareEnvironmentVariableA(lpname.toString(), lpguid.toString(), pvalue.toString(), nsize.toInt()) as Int) else 0

public actual fun SetFirmwareEnvironmentVariableExA(lpname: PCSTR, lpguid: PCSTR, pvalue: Long, nsize: UInt, dwattributes: UInt): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_SetFirmwareEnvironmentVariableExA(lpname.toString(), lpguid.toString(), pvalue.toString(), nsize.toInt(), dwattributes.toInt()) as Int) else 0

public actual fun SetFirmwareEnvironmentVariableExW(lpname: PCWSTR, lpguid: PCWSTR, pvalue: Long, nsize: UInt, dwattributes: UInt): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_SetFirmwareEnvironmentVariableExW(lpname.toString(), lpguid.toString(), pvalue.toString(), nsize.toInt(), dwattributes.toInt()) as Int) else 0

public actual fun SetFirmwareEnvironmentVariableW(lpname: PCWSTR, lpguid: PCWSTR, pvalue: Long, nsize: UInt): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_SetFirmwareEnvironmentVariableW(lpname.toString(), lpguid.toString(), pvalue.toString(), nsize.toInt()) as Int) else 0

public actual fun SetHandleCount(unumber: UInt): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_SetHandleCount(unumber.toInt()) as Int).toUInt() else 0u

public actual fun SetMessageWaitingIndicator(hmsgindicator: HANDLE, ulmsgcount: UInt): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_SetMessageWaitingIndicator(hmsgindicator.toString(), ulmsgcount.toInt()) as Int) else 0

public actual fun SetPerUserSecValuesA(pperuser: Long): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_SetPerUserSecValuesA(pperuser.toString()) as Int) else 0

public actual fun SetPerUserSecValuesW(pperuser: Long): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_SetPerUserSecValuesW(pperuser.toString()) as Int) else 0

public actual fun SubscribeFeatureStateChangeNotification(subscription: Long, callback: PFEATURE_STATE_CHANGE_CALLBACK, context: Long) {
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        _windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_SubscribeFeatureStateChangeNotification(subscription.toString(), callback.toLong().toString(), context.toString())
    }
}

public actual fun TranslateInfStringA(pszinffilename: PCSTR, pszinstallsection: PCSTR, psztranslatesection: PCSTR, psztranslatekey: PCSTR, pszbuffer: PSTR, cchbuffer: UInt, pdwrequiredsize: Long, pvreserved: Long): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_TranslateInfStringA(pszinffilename.toString(), pszinstallsection.toString(), psztranslatesection.toString(), psztranslatekey.toString(), pszbuffer.toString(), cchbuffer.toInt(), pdwrequiredsize.toString(), pvreserved.toString()) as Int) else 0

public actual fun TranslateInfStringExA(hinf: Long, pszinffilename: PCSTR, psztranslatesection: PCSTR, psztranslatekey: PCSTR, pszbuffer: PSTR, dwbuffersize: UInt, pdwrequiredsize: Long, pvreserved: Long): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_TranslateInfStringExA(hinf.toString(), pszinffilename.toString(), psztranslatesection.toString(), psztranslatekey.toString(), pszbuffer.toString(), dwbuffersize.toInt(), pdwrequiredsize.toString(), pvreserved.toString()) as Int) else 0

public actual fun TranslateInfStringExW(hinf: Long, pszinffilename: PCWSTR, psztranslatesection: PCWSTR, psztranslatekey: PCWSTR, pszbuffer: PWSTR, dwbuffersize: UInt, pdwrequiredsize: Long, pvreserved: Long): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_TranslateInfStringExW(hinf.toString(), pszinffilename.toString(), psztranslatesection.toString(), psztranslatekey.toString(), pszbuffer.toString(), dwbuffersize.toInt(), pdwrequiredsize.toString(), pvreserved.toString()) as Int) else 0

public actual fun TranslateInfStringW(pszinffilename: PCWSTR, pszinstallsection: PCWSTR, psztranslatesection: PCWSTR, psztranslatekey: PCWSTR, pszbuffer: PWSTR, cchbuffer: UInt, pdwrequiredsize: Long, pvreserved: Long): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_TranslateInfStringW(pszinffilename.toString(), pszinstallsection.toString(), psztranslatesection.toString(), psztranslatekey.toString(), pszbuffer.toString(), cchbuffer.toInt(), pdwrequiredsize.toString(), pvreserved.toString()) as Int) else 0

public actual fun UnsubscribeFeatureStateChangeNotification(subscription: FEATURE_STATE_CHANGE_SUBSCRIPTION) {
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        _windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_UnsubscribeFeatureStateChangeNotification(subscription.toString())
    }
}

public actual fun UserInstStubWrapperA(hwnd: HWND, hinstance: HINSTANCE, pszparms: PCSTR, nshow: Int): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_UserInstStubWrapperA(hwnd.toString(), hinstance.toString(), pszparms.toString(), nshow) as Int) else 0

public actual fun UserInstStubWrapperW(hwnd: HWND, hinstance: HINSTANCE, pszparms: PCWSTR, nshow: Int): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_UserInstStubWrapperW(hwnd.toString(), hinstance.toString(), pszparms.toString(), nshow) as Int) else 0

public actual fun UserUnInstStubWrapperA(hwnd: HWND, hinstance: HINSTANCE, pszparms: PCSTR, nshow: Int): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_UserUnInstStubWrapperA(hwnd.toString(), hinstance.toString(), pszparms.toString(), nshow) as Int) else 0

public actual fun UserUnInstStubWrapperW(hwnd: HWND, hinstance: HINSTANCE, pszparms: PCWSTR, nshow: Int): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_UserUnInstStubWrapperW(hwnd.toString(), hinstance.toString(), pszparms.toString(), nshow) as Int) else 0

public actual fun WINNLSEnableIME(param0: HWND, param1: BOOL): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_WINNLSEnableIME(param0.toString(), param1) as Int) else 0

public actual fun WINNLSGetEnableStatus(param0: HWND): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_WINNLSGetEnableStatus(param0.toString()) as Int) else 0

public actual fun WINNLSGetIMEHotkey(param0: HWND): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_WINNLSGetIMEHotkey(param0.toString()) as Int).toUInt() else 0u

public actual fun WinWatchClose(hww: HWINWATCH) {
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) {
        _windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_WinWatchClose(hww.toString())
    }
}

public actual fun WinWatchDidStatusChange(hww: HWINWATCH): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_WinWatchDidStatusChange(hww.toString()) as Int) else 0

public actual fun WinWatchGetClipList(hww: HWINWATCH, prc: Long, size: UInt, prd: Long): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_WinWatchGetClipList(hww.toString(), prc.toString(), size.toInt(), prd.toString()) as Int).toUInt() else 0u

public actual fun WinWatchNotify(hww: HWINWATCH, notifycallback: WINWATCHNOTIFYPROC, notifyparam: LPARAM): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_WinWatchNotify(hww.toString(), notifycallback.toLong().toString(), notifyparam.toString()) as Int) else 0

public actual fun WinWatchOpen(hwnd: HWND): HWINWATCH =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_WinWatchOpen(hwnd.toString()) as String).toLong() else 0L

public actual fun WldpCanExecuteBuffer(host: Long, options: WLDP_EXECUTION_EVALUATION_OPTIONS, buffer: Long, buffersize: UInt, auditinfo: PCWSTR, result: Long): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_WldpCanExecuteBuffer(host.toString(), options, buffer.toString(), buffersize.toInt(), auditinfo.toString(), result.toString()) as Int) else 0

public actual fun WldpCanExecuteFile(host: Long, options: WLDP_EXECUTION_EVALUATION_OPTIONS, filehandle: HANDLE, auditinfo: PCWSTR, result: Long): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_WldpCanExecuteFile(host.toString(), options, filehandle.toString(), auditinfo.toString(), result.toString()) as Int) else 0

public actual fun WldpCanExecuteStream(host: Long, options: WLDP_EXECUTION_EVALUATION_OPTIONS, stream: Long, auditinfo: PCWSTR, result: Long): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_WldpCanExecuteStream(host.toString(), options, stream.toString(), auditinfo.toString(), result.toString()) as Int) else 0

public actual fun WldpGetLockdownPolicy(hostinformation: Long, lockdownstate: Long, lockdownflags: UInt): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_WldpGetLockdownPolicy(hostinformation.toString(), lockdownstate.toString(), lockdownflags.toInt()) as Int) else 0

public actual fun WldpIsClassInApprovedList(classid: Long, hostinformation: Long, isapproved: Long, optionalflags: UInt): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_WldpIsClassInApprovedList(classid.toString(), hostinformation.toString(), isapproved.toString(), optionalflags.toInt()) as Int) else 0

public actual fun WldpIsDynamicCodePolicyEnabled(isenabled: Long): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_WldpIsDynamicCodePolicyEnabled(isenabled.toString()) as Int) else 0

public actual fun WldpQueryDeviceSecurityInformation(information: Long, informationlength: UInt, returnlength: Long): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_WldpQueryDeviceSecurityInformation(information.toString(), informationlength.toInt(), returnlength.toString()) as Int) else 0

public actual fun WldpQueryDynamicCodeTrust(filehandle: HANDLE, baseimage: Long, imagesize: UInt): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_WldpQueryDynamicCodeTrust(filehandle.toString(), baseimage.toString(), imagesize.toInt()) as Int) else 0

public actual fun WldpSetDynamicCodeTrust(filehandle: HANDLE): HRESULT =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_WldpSetDynamicCodeTrust(filehandle.toString()) as Int) else 0

public actual fun WritePrivateProfileSectionA(lpappname: PCSTR, lpstring: PCSTR, lpfilename: PCSTR): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_WritePrivateProfileSectionA(lpappname.toString(), lpstring.toString(), lpfilename.toString()) as Int) else 0

public actual fun WritePrivateProfileSectionW(lpappname: PCWSTR, lpstring: PCWSTR, lpfilename: PCWSTR): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_WritePrivateProfileSectionW(lpappname.toString(), lpstring.toString(), lpfilename.toString()) as Int) else 0

public actual fun WritePrivateProfileStringA(lpappname: PCSTR, lpkeyname: PCSTR, lpstring: PCSTR, lpfilename: PCSTR): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_WritePrivateProfileStringA(lpappname.toString(), lpkeyname.toString(), lpstring.toString(), lpfilename.toString()) as Int) else 0

public actual fun WritePrivateProfileStringW(lpappname: PCWSTR, lpkeyname: PCWSTR, lpstring: PCWSTR, lpfilename: PCWSTR): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_WritePrivateProfileStringW(lpappname.toString(), lpkeyname.toString(), lpstring.toString(), lpfilename.toString()) as Int) else 0

public actual fun WritePrivateProfileStructA(lpszsection: PCSTR, lpszkey: PCSTR, lpstruct: Long, usizestruct: UInt, szfile: PCSTR): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_WritePrivateProfileStructA(lpszsection.toString(), lpszkey.toString(), lpstruct.toString(), usizestruct.toInt(), szfile.toString()) as Int) else 0

public actual fun WritePrivateProfileStructW(lpszsection: PCWSTR, lpszkey: PCWSTR, lpstruct: Long, usizestruct: UInt, szfile: PCWSTR): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_WritePrivateProfileStructW(lpszsection.toString(), lpszkey.toString(), lpstruct.toString(), usizestruct.toInt(), szfile.toString()) as Int) else 0

public actual fun WriteProfileSectionA(lpappname: PCSTR, lpstring: PCSTR): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_WriteProfileSectionA(lpappname.toString(), lpstring.toString()) as Int) else 0

public actual fun WriteProfileSectionW(lpappname: PCWSTR, lpstring: PCWSTR): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_WriteProfileSectionW(lpappname.toString(), lpstring.toString()) as Int) else 0

public actual fun WriteProfileStringA(lpappname: PCSTR, lpkeyname: PCSTR, lpstring: PCSTR): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_WriteProfileStringA(lpappname.toString(), lpkeyname.toString(), lpstring.toString()) as Int) else 0

public actual fun WriteProfileStringW(lpappname: PCWSTR, lpkeyname: PCWSTR, lpstring: PCWSTR): BOOL =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_WriteProfileStringW(lpappname.toString(), lpkeyname.toString(), lpstring.toString()) as Int) else 0

public actual fun _hread(hfile: Int, lpbuffer: Long, lbytes: Int): Int =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming__hread(hfile, lpbuffer.toString(), lbytes) as Int) else 0

public actual fun _hwrite(hfile: Int, lpbuffer: PCSTR, lbytes: Int): Int =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming__hwrite(hfile, lpbuffer.toString(), lbytes) as Int) else 0

public actual fun _lclose(hfile: Int): Int =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming__lclose(hfile) as Int) else 0

public actual fun _lcreat(lppathname: PCSTR, iattribute: Int): Int =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming__lcreat(lppathname.toString(), iattribute) as Int) else 0

public actual fun _llseek(hfile: Int, loffset: Int, iorigin: Int): Int =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming__llseek(hfile, loffset, iorigin) as Int) else 0

public actual fun _lopen(lppathname: PCSTR, ireadwrite: Int): Int =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming__lopen(lppathname.toString(), ireadwrite) as Int) else 0

public actual fun _lread(hfile: Int, lpbuffer: Long, ubytes: UInt): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming__lread(hfile, lpbuffer.toString(), ubytes.toInt()) as Int).toUInt() else 0u

public actual fun _lwrite(hfile: Int, lpbuffer: PCSTR, ubytes: UInt): UInt =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming__lwrite(hfile, lpbuffer.toString(), ubytes.toInt()) as Int).toUInt() else 0u

public actual fun uaw_lstrcmpW(string1: Long, string2: Long): Int =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_uaw_lstrcmpW(string1.toString(), string2.toString()) as Int) else 0

public actual fun uaw_lstrcmpiW(string1: Long, string2: Long): Int =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_uaw_lstrcmpiW(string1.toString(), string2.toString()) as Int) else 0

public actual fun uaw_lstrlenW(string: Long): Int =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_uaw_lstrlenW(string.toString()) as Int) else 0

public actual fun uaw_wcschr(string: Long, character: UShort): Long =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_uaw_wcschr(string.toString(), character.toInt()) as String).toLong() else 0L

public actual fun uaw_wcscpy(destination: Long, source: Long): Long =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_uaw_wcscpy(destination.toString(), source.toString()) as String).toLong() else 0L

public actual fun uaw_wcsicmp(string1: Long, string2: Long): Int =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_uaw_wcsicmp(string1.toString(), string2.toString()) as Int) else 0

public actual fun uaw_wcslen(string: Long): ULong =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_uaw_wcslen(string.toString()) as String).toULong() else 0uL

public actual fun uaw_wcsrchr(string: Long, character: UShort): Long =
    if (_windowsWin32SystemWindowsprogrammingNapiAddon != null) (_windowsWin32SystemWindowsprogrammingNapiAddon.windowssys_windows_win32_system_windowsprogramming_uaw_wcsrchr(string.toString(), character.toInt()) as String).toLong() else 0L
