@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun AddDelBackupEntryA(lpcszfilelist: PCSTR, lpcszbackupdir: PCSTR, lpcszbasename: PCSTR, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_AddDelBackupEntryA(lpcszfilelist.toCPointer<ByteVar>(), lpcszbackupdir.toCPointer<ByteVar>(), lpcszbasename.toCPointer<ByteVar>(), dwflags)

public actual fun AddDelBackupEntryW(lpcszfilelist: PCWSTR, lpcszbackupdir: PCWSTR, lpcszbasename: PCWSTR, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_AddDelBackupEntryW(lpcszfilelist.toCPointer<ByteVar>(), lpcszbackupdir.toCPointer<ByteVar>(), lpcszbasename.toCPointer<ByteVar>(), dwflags)

public actual fun AdvInstallFileA(hwnd: HWND, lpszsourcedir: PCSTR, lpszsourcefile: PCSTR, lpszdestdir: PCSTR, lpszdestfile: PCSTR, dwflags: UInt, dwreserved: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_AdvInstallFileA(hwnd.toCPointer<ByteVar>(), lpszsourcedir.toCPointer<ByteVar>(), lpszsourcefile.toCPointer<ByteVar>(), lpszdestdir.toCPointer<ByteVar>(), lpszdestfile.toCPointer<ByteVar>(), dwflags, dwreserved)

public actual fun AdvInstallFileW(hwnd: HWND, lpszsourcedir: PCWSTR, lpszsourcefile: PCWSTR, lpszdestdir: PCWSTR, lpszdestfile: PCWSTR, dwflags: UInt, dwreserved: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_AdvInstallFileW(hwnd.toCPointer<ByteVar>(), lpszsourcedir.toCPointer<ByteVar>(), lpszsourcefile.toCPointer<ByteVar>(), lpszdestdir.toCPointer<ByteVar>(), lpszdestfile.toCPointer<ByteVar>(), dwflags, dwreserved)

public actual fun ApphelpCheckShellObject(objectclsid: Long, bshimifnecessary: BOOL, pullflags: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_ApphelpCheckShellObject(objectclsid.toCPointer<ByteVar>(), bshimifnecessary, pullflags.toCPointer<ByteVar>())

public actual fun CancelDeviceWakeupRequest(hdevice: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_CancelDeviceWakeupRequest(hdevice.toCPointer<ByteVar>())

public actual fun CloseINFEngine(hinf: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_CloseINFEngine(hinf.toCPointer<ByteVar>())

public actual fun ConvertAuxiliaryCounterToPerformanceCounter(ullauxiliarycountervalue: ULong, lpperformancecountervalue: Long, lpconversionerror: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_ConvertAuxiliaryCounterToPerformanceCounter(ullauxiliarycountervalue, lpperformancecountervalue.toCPointer<ByteVar>(), lpconversionerror.toCPointer<ByteVar>())

public actual fun ConvertPerformanceCounterToAuxiliaryCounter(ullperformancecountervalue: ULong, lpauxiliarycountervalue: Long, lpconversionerror: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_ConvertPerformanceCounterToAuxiliaryCounter(ullperformancecountervalue, lpauxiliarycountervalue.toCPointer<ByteVar>(), lpconversionerror.toCPointer<ByteVar>())

public actual fun DCIBeginAccess(pdci: Long, x: Int, y: Int, dx: Int, dy: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_DCIBeginAccess(pdci.toCPointer<ByteVar>(), x, y, dx, dy)

public actual fun DCICloseProvider(hdc: HDC) {
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_DCICloseProvider(hdc.toCPointer<ByteVar>())
}

public actual fun DCICreateOffscreen(hdc: HDC, dwcompression: UInt, dwredmask: UInt, dwgreenmask: UInt, dwbluemask: UInt, dwwidth: UInt, dwheight: UInt, dwdcicaps: UInt, dwbitcount: UInt, lplpsurface: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_DCICreateOffscreen(hdc.toCPointer<ByteVar>(), dwcompression, dwredmask, dwgreenmask, dwbluemask, dwwidth, dwheight, dwdcicaps, dwbitcount, lplpsurface.toCPointer<ByteVar>())

public actual fun DCICreateOverlay(hdc: HDC, lpoffscreensurf: Long, lplpsurface: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_DCICreateOverlay(hdc.toCPointer<ByteVar>(), lpoffscreensurf.toCPointer<ByteVar>(), lplpsurface.toCPointer<ByteVar>())

public actual fun DCICreatePrimary(hdc: HDC, lplpsurface: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_DCICreatePrimary(hdc.toCPointer<ByteVar>(), lplpsurface.toCPointer<ByteVar>())

public actual fun DCIDestroy(pdci: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_DCIDestroy(pdci.toCPointer<ByteVar>())
}

public actual fun DCIDraw(pdci: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_DCIDraw(pdci.toCPointer<ByteVar>())

public actual fun DCIEndAccess(pdci: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_DCIEndAccess(pdci.toCPointer<ByteVar>())
}

public actual fun DCIEnum(hdc: HDC, lprdst: Long, lprsrc: Long, lpfncallback: Long, lpcontext: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_DCIEnum(hdc.toCPointer<ByteVar>(), lprdst.toCPointer<ByteVar>(), lprsrc.toCPointer<ByteVar>(), lpfncallback.toCPointer<ByteVar>(), lpcontext.toCPointer<ByteVar>())

public actual fun DCIOpenProvider(): HDC =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_DCIOpenProvider()?.toLong() ?: 0L

public actual fun DCISetClipList(pdci: Long, prd: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_DCISetClipList(pdci.toCPointer<ByteVar>(), prd.toCPointer<ByteVar>())

public actual fun DCISetDestination(pdci: Long, dst: Long, src: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_DCISetDestination(pdci.toCPointer<ByteVar>(), dst.toCPointer<ByteVar>(), src.toCPointer<ByteVar>())

public actual fun DCISetSrcDestClip(pdci: Long, srcrc: Long, destrc: Long, prd: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_DCISetSrcDestClip(pdci.toCPointer<ByteVar>(), srcrc.toCPointer<ByteVar>(), destrc.toCPointer<ByteVar>(), prd.toCPointer<ByteVar>())

public actual fun DelNodeA(pszfileordirname: PCSTR, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_DelNodeA(pszfileordirname.toCPointer<ByteVar>(), dwflags)

public actual fun DelNodeRunDLL32W(hwnd: HWND, hinstance: HINSTANCE, pszparms: PWSTR, nshow: Int): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_DelNodeRunDLL32W(hwnd.toCPointer<ByteVar>(), hinstance.toCPointer<ByteVar>(), pszparms.toCPointer<ByteVar>(), nshow)

public actual fun DelNodeW(pszfileordirname: PCWSTR, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_DelNodeW(pszfileordirname.toCPointer<ByteVar>(), dwflags)

public actual fun DnsHostnameToComputerNameA(hostname: PCSTR, computername: PSTR, nsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_DnsHostnameToComputerNameA(hostname.toCPointer<ByteVar>(), computername.toCPointer<ByteVar>(), nsize.toCPointer<ByteVar>())

public actual fun DnsHostnameToComputerNameW(hostname: PCWSTR, computername: PWSTR, nsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_DnsHostnameToComputerNameW(hostname.toCPointer<ByteVar>(), computername.toCPointer<ByteVar>(), nsize.toCPointer<ByteVar>())

public actual fun DosDateTimeToFileTime(wfatdate: UShort, wfattime: UShort, lpfiletime: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_DosDateTimeToFileTime(wfatdate, wfattime, lpfiletime.toCPointer<ByteVar>())

public actual fun EnableProcessOptionalXStateFeatures(features: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_EnableProcessOptionalXStateFeatures(features)

public actual fun ExecuteCabA(hwnd: HWND, pcab: Long, preserved: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_ExecuteCabA(hwnd.toCPointer<ByteVar>(), pcab.toCPointer<ByteVar>(), preserved.toCPointer<ByteVar>())

public actual fun ExecuteCabW(hwnd: HWND, pcab: Long, preserved: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_ExecuteCabW(hwnd.toCPointer<ByteVar>(), pcab.toCPointer<ByteVar>(), preserved.toCPointer<ByteVar>())

public actual fun ExtractFilesA(pszcabname: PCSTR, pszexpanddir: PCSTR, dwflags: UInt, pszfilelist: PCSTR, lpreserved: Long, dwreserved: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_ExtractFilesA(pszcabname.toCPointer<ByteVar>(), pszexpanddir.toCPointer<ByteVar>(), dwflags, pszfilelist.toCPointer<ByteVar>(), lpreserved.toCPointer<ByteVar>(), dwreserved)

public actual fun ExtractFilesW(pszcabname: PCWSTR, pszexpanddir: PCWSTR, dwflags: UInt, pszfilelist: PCWSTR, lpreserved: Long, dwreserved: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_ExtractFilesW(pszcabname.toCPointer<ByteVar>(), pszexpanddir.toCPointer<ByteVar>(), dwflags, pszfilelist.toCPointer<ByteVar>(), lpreserved.toCPointer<ByteVar>(), dwreserved)

public actual fun FileSaveMarkNotExistA(lpfilelist: PCSTR, lpdir: PCSTR, lpbasename: PCSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_FileSaveMarkNotExistA(lpfilelist.toCPointer<ByteVar>(), lpdir.toCPointer<ByteVar>(), lpbasename.toCPointer<ByteVar>())

public actual fun FileSaveMarkNotExistW(lpfilelist: PCWSTR, lpdir: PCWSTR, lpbasename: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_FileSaveMarkNotExistW(lpfilelist.toCPointer<ByteVar>(), lpdir.toCPointer<ByteVar>(), lpbasename.toCPointer<ByteVar>())

public actual fun FileSaveRestoreOnINFA(hwnd: HWND, psztitle: PCSTR, pszinf: PCSTR, pszsection: PCSTR, pszbackupdir: PCSTR, pszbasebackupfile: PCSTR, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_FileSaveRestoreOnINFA(hwnd.toCPointer<ByteVar>(), psztitle.toCPointer<ByteVar>(), pszinf.toCPointer<ByteVar>(), pszsection.toCPointer<ByteVar>(), pszbackupdir.toCPointer<ByteVar>(), pszbasebackupfile.toCPointer<ByteVar>(), dwflags)

public actual fun FileSaveRestoreOnINFW(hwnd: HWND, psztitle: PCWSTR, pszinf: PCWSTR, pszsection: PCWSTR, pszbackupdir: PCWSTR, pszbasebackupfile: PCWSTR, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_FileSaveRestoreOnINFW(hwnd.toCPointer<ByteVar>(), psztitle.toCPointer<ByteVar>(), pszinf.toCPointer<ByteVar>(), pszsection.toCPointer<ByteVar>(), pszbackupdir.toCPointer<ByteVar>(), pszbasebackupfile.toCPointer<ByteVar>(), dwflags)

public actual fun FileSaveRestoreW(hdlg: HWND, lpfilelist: PCWSTR, lpdir: PCWSTR, lpbasename: PCWSTR, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_FileSaveRestoreW(hdlg.toCPointer<ByteVar>(), lpfilelist.toCPointer<ByteVar>(), lpdir.toCPointer<ByteVar>(), lpbasename.toCPointer<ByteVar>(), dwflags)

public actual fun FileTimeToDosDateTime(lpfiletime: Long, lpfatdate: Long, lpfattime: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_FileTimeToDosDateTime(lpfiletime.toCPointer<ByteVar>(), lpfatdate.toCPointer<ByteVar>(), lpfattime.toCPointer<ByteVar>())

public actual fun GdiEntry13(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_GdiEntry13()

public actual fun GetComputerNameA(lpbuffer: PSTR, nsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_GetComputerNameA(lpbuffer.toCPointer<ByteVar>(), nsize.toCPointer<ByteVar>())

public actual fun GetComputerNameW(lpbuffer: PWSTR, nsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_GetComputerNameW(lpbuffer.toCPointer<ByteVar>(), nsize.toCPointer<ByteVar>())

public actual fun GetCurrentHwProfileA(lphwprofileinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_GetCurrentHwProfileA(lphwprofileinfo.toCPointer<ByteVar>())

public actual fun GetCurrentHwProfileW(lphwprofileinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_GetCurrentHwProfileW(lphwprofileinfo.toCPointer<ByteVar>())

public actual fun GetDCRegionData(hdc: HDC, size: UInt, prd: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_GetDCRegionData(hdc.toCPointer<ByteVar>(), size, prd.toCPointer<ByteVar>())

public actual fun GetFeatureEnabledState(featureid: UInt, changetime: FEATURE_CHANGE_TIME): FEATURE_ENABLED_STATE =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_GetFeatureEnabledState(featureid, changetime)

public actual fun GetFeatureVariant(featureid: UInt, changetime: FEATURE_CHANGE_TIME, payloadid: Long, hasnotification: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_GetFeatureVariant(featureid, changetime, payloadid.toCPointer<ByteVar>(), hasnotification.toCPointer<ByteVar>())

public actual fun GetFirmwareEnvironmentVariableA(lpname: PCSTR, lpguid: PCSTR, pbuffer: Long, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_GetFirmwareEnvironmentVariableA(lpname.toCPointer<ByteVar>(), lpguid.toCPointer<ByteVar>(), pbuffer.toCPointer<ByteVar>(), nsize)

public actual fun GetFirmwareEnvironmentVariableExA(lpname: PCSTR, lpguid: PCSTR, pbuffer: Long, nsize: UInt, pdwattribubutes: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_GetFirmwareEnvironmentVariableExA(lpname.toCPointer<ByteVar>(), lpguid.toCPointer<ByteVar>(), pbuffer.toCPointer<ByteVar>(), nsize, pdwattribubutes.toCPointer<ByteVar>())

public actual fun GetFirmwareEnvironmentVariableExW(lpname: PCWSTR, lpguid: PCWSTR, pbuffer: Long, nsize: UInt, pdwattribubutes: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_GetFirmwareEnvironmentVariableExW(lpname.toCPointer<ByteVar>(), lpguid.toCPointer<ByteVar>(), pbuffer.toCPointer<ByteVar>(), nsize, pdwattribubutes.toCPointer<ByteVar>())

public actual fun GetFirmwareEnvironmentVariableW(lpname: PCWSTR, lpguid: PCWSTR, pbuffer: Long, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_GetFirmwareEnvironmentVariableW(lpname.toCPointer<ByteVar>(), lpguid.toCPointer<ByteVar>(), pbuffer.toCPointer<ByteVar>(), nsize)

public actual fun GetPrivateProfileIntA(lpappname: PCSTR, lpkeyname: PCSTR, ndefault: Int, lpfilename: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_GetPrivateProfileIntA(lpappname.toCPointer<ByteVar>(), lpkeyname.toCPointer<ByteVar>(), ndefault, lpfilename.toCPointer<ByteVar>())

public actual fun GetPrivateProfileIntW(lpappname: PCWSTR, lpkeyname: PCWSTR, ndefault: Int, lpfilename: PCWSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_GetPrivateProfileIntW(lpappname.toCPointer<ByteVar>(), lpkeyname.toCPointer<ByteVar>(), ndefault, lpfilename.toCPointer<ByteVar>())

public actual fun GetPrivateProfileSectionA(lpappname: PCSTR, lpreturnedstring: PSTR, nsize: UInt, lpfilename: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_GetPrivateProfileSectionA(lpappname.toCPointer<ByteVar>(), lpreturnedstring.toCPointer<ByteVar>(), nsize, lpfilename.toCPointer<ByteVar>())

public actual fun GetPrivateProfileSectionNamesA(lpszreturnbuffer: PSTR, nsize: UInt, lpfilename: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_GetPrivateProfileSectionNamesA(lpszreturnbuffer.toCPointer<ByteVar>(), nsize, lpfilename.toCPointer<ByteVar>())

public actual fun GetPrivateProfileSectionNamesW(lpszreturnbuffer: PWSTR, nsize: UInt, lpfilename: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_GetPrivateProfileSectionNamesW(lpszreturnbuffer.toCPointer<ByteVar>(), nsize, lpfilename.toCPointer<ByteVar>())

public actual fun GetPrivateProfileSectionW(lpappname: PCWSTR, lpreturnedstring: PWSTR, nsize: UInt, lpfilename: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_GetPrivateProfileSectionW(lpappname.toCPointer<ByteVar>(), lpreturnedstring.toCPointer<ByteVar>(), nsize, lpfilename.toCPointer<ByteVar>())

public actual fun GetPrivateProfileStringA(lpappname: PCSTR, lpkeyname: PCSTR, lpdefault: PCSTR, lpreturnedstring: PSTR, nsize: UInt, lpfilename: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_GetPrivateProfileStringA(lpappname.toCPointer<ByteVar>(), lpkeyname.toCPointer<ByteVar>(), lpdefault.toCPointer<ByteVar>(), lpreturnedstring.toCPointer<ByteVar>(), nsize, lpfilename.toCPointer<ByteVar>())

public actual fun GetPrivateProfileStringW(lpappname: PCWSTR, lpkeyname: PCWSTR, lpdefault: PCWSTR, lpreturnedstring: PWSTR, nsize: UInt, lpfilename: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_GetPrivateProfileStringW(lpappname.toCPointer<ByteVar>(), lpkeyname.toCPointer<ByteVar>(), lpdefault.toCPointer<ByteVar>(), lpreturnedstring.toCPointer<ByteVar>(), nsize, lpfilename.toCPointer<ByteVar>())

public actual fun GetPrivateProfileStructA(lpszsection: PCSTR, lpszkey: PCSTR, lpstruct: Long, usizestruct: UInt, szfile: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_GetPrivateProfileStructA(lpszsection.toCPointer<ByteVar>(), lpszkey.toCPointer<ByteVar>(), lpstruct.toCPointer<ByteVar>(), usizestruct, szfile.toCPointer<ByteVar>())

public actual fun GetPrivateProfileStructW(lpszsection: PCWSTR, lpszkey: PCWSTR, lpstruct: Long, usizestruct: UInt, szfile: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_GetPrivateProfileStructW(lpszsection.toCPointer<ByteVar>(), lpszkey.toCPointer<ByteVar>(), lpstruct.toCPointer<ByteVar>(), usizestruct, szfile.toCPointer<ByteVar>())

public actual fun GetProfileIntA(lpappname: PCSTR, lpkeyname: PCSTR, ndefault: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_GetProfileIntA(lpappname.toCPointer<ByteVar>(), lpkeyname.toCPointer<ByteVar>(), ndefault)

public actual fun GetProfileIntW(lpappname: PCWSTR, lpkeyname: PCWSTR, ndefault: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_GetProfileIntW(lpappname.toCPointer<ByteVar>(), lpkeyname.toCPointer<ByteVar>(), ndefault)

public actual fun GetProfileSectionA(lpappname: PCSTR, lpreturnedstring: PSTR, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_GetProfileSectionA(lpappname.toCPointer<ByteVar>(), lpreturnedstring.toCPointer<ByteVar>(), nsize)

public actual fun GetProfileSectionW(lpappname: PCWSTR, lpreturnedstring: PWSTR, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_GetProfileSectionW(lpappname.toCPointer<ByteVar>(), lpreturnedstring.toCPointer<ByteVar>(), nsize)

public actual fun GetProfileStringA(lpappname: PCSTR, lpkeyname: PCSTR, lpdefault: PCSTR, lpreturnedstring: PSTR, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_GetProfileStringA(lpappname.toCPointer<ByteVar>(), lpkeyname.toCPointer<ByteVar>(), lpdefault.toCPointer<ByteVar>(), lpreturnedstring.toCPointer<ByteVar>(), nsize)

public actual fun GetProfileStringW(lpappname: PCWSTR, lpkeyname: PCWSTR, lpdefault: PCWSTR, lpreturnedstring: PWSTR, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_GetProfileStringW(lpappname.toCPointer<ByteVar>(), lpkeyname.toCPointer<ByteVar>(), lpdefault.toCPointer<ByteVar>(), lpreturnedstring.toCPointer<ByteVar>(), nsize)

public actual fun GetSystemRegistryQuota(pdwquotaallowed: Long, pdwquotaused: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_GetSystemRegistryQuota(pdwquotaallowed.toCPointer<ByteVar>(), pdwquotaused.toCPointer<ByteVar>())

public actual fun GetThreadEnabledXStateFeatures(): ULong =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_GetThreadEnabledXStateFeatures()

public actual fun GetUserNameA(lpbuffer: PSTR, pcbbuffer: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_GetUserNameA(lpbuffer.toCPointer<ByteVar>(), pcbbuffer.toCPointer<ByteVar>())

public actual fun GetUserNameW(lpbuffer: PWSTR, pcbbuffer: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_GetUserNameW(lpbuffer.toCPointer<ByteVar>(), pcbbuffer.toCPointer<ByteVar>())

public actual fun GetVersionFromFileA(lpszfilename: PCSTR, pdwmsver: Long, pdwlsver: Long, bversion: BOOL): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_GetVersionFromFileA(lpszfilename.toCPointer<ByteVar>(), pdwmsver.toCPointer<ByteVar>(), pdwlsver.toCPointer<ByteVar>(), bversion)

public actual fun GetVersionFromFileExA(lpszfilename: PCSTR, pdwmsver: Long, pdwlsver: Long, bversion: BOOL): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_GetVersionFromFileExA(lpszfilename.toCPointer<ByteVar>(), pdwmsver.toCPointer<ByteVar>(), pdwlsver.toCPointer<ByteVar>(), bversion)

public actual fun GetVersionFromFileExW(lpszfilename: PCWSTR, pdwmsver: Long, pdwlsver: Long, bversion: BOOL): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_GetVersionFromFileExW(lpszfilename.toCPointer<ByteVar>(), pdwmsver.toCPointer<ByteVar>(), pdwlsver.toCPointer<ByteVar>(), bversion)

public actual fun GetVersionFromFileW(lpszfilename: PCWSTR, pdwmsver: Long, pdwlsver: Long, bversion: BOOL): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_GetVersionFromFileW(lpszfilename.toCPointer<ByteVar>(), pdwmsver.toCPointer<ByteVar>(), pdwlsver.toCPointer<ByteVar>(), bversion)

public actual fun GetWindowRegionData(hwnd: HWND, size: UInt, prd: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_GetWindowRegionData(hwnd.toCPointer<ByteVar>(), size, prd.toCPointer<ByteVar>())

public actual fun GlobalCompact(dwminfree: UInt): ULong =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_GlobalCompact(dwminfree)

public actual fun GlobalFix(hmem: HGLOBAL) {
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_GlobalFix(hmem.toCPointer<ByteVar>())
}

public actual fun GlobalUnWire(hmem: HGLOBAL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_GlobalUnWire(hmem.toCPointer<ByteVar>())

public actual fun GlobalUnfix(hmem: HGLOBAL) {
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_GlobalUnfix(hmem.toCPointer<ByteVar>())
}

public actual fun GlobalWire(hmem: HGLOBAL): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_GlobalWire(hmem.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun IMPGetIMEA(param0: HWND, param1: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_IMPGetIMEA(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())

public actual fun IMPGetIMEW(param0: HWND, param1: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_IMPGetIMEW(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())

public actual fun IMPQueryIMEA(param0: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_IMPQueryIMEA(param0.toCPointer<ByteVar>())

public actual fun IMPQueryIMEW(param0: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_IMPQueryIMEW(param0.toCPointer<ByteVar>())

public actual fun IMPSetIMEA(param0: HWND, param1: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_IMPSetIMEA(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())

public actual fun IMPSetIMEW(param0: HWND, param1: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_IMPSetIMEW(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())

public actual fun IsApiSetImplemented(contract: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_IsApiSetImplemented(contract.toCPointer<ByteVar>())

public actual fun IsBadHugeReadPtr(lp: Long, ucb: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_IsBadHugeReadPtr(lp.toCPointer<ByteVar>(), ucb)

public actual fun IsBadHugeWritePtr(lp: Long, ucb: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_IsBadHugeWritePtr(lp.toCPointer<ByteVar>(), ucb)

public actual fun IsNTAdmin(dwreserved: UInt, lpdwreserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_IsNTAdmin(dwreserved, lpdwreserved.toCPointer<ByteVar>())

public actual fun IsNativeVhdBoot(nativevhdboot: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_IsNativeVhdBoot(nativevhdboot.toCPointer<ByteVar>())

public actual fun IsTokenUntrusted(tokenhandle: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_IsTokenUntrusted(tokenhandle.toCPointer<ByteVar>())

public actual fun LaunchINFSectionExW(hwnd: HWND, hinstance: HINSTANCE, pszparms: PCWSTR, nshow: Int): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_LaunchINFSectionExW(hwnd.toCPointer<ByteVar>(), hinstance.toCPointer<ByteVar>(), pszparms.toCPointer<ByteVar>(), nshow)

public actual fun LaunchINFSectionW(hwndowner: HWND, hinstance: HINSTANCE, pszparams: PWSTR, nshow: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_LaunchINFSectionW(hwndowner.toCPointer<ByteVar>(), hinstance.toCPointer<ByteVar>(), pszparams.toCPointer<ByteVar>(), nshow)

public actual fun LocalCompact(uminfree: UInt): ULong =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_LocalCompact(uminfree)

public actual fun LocalShrink(hmem: HLOCAL, cbnewsize: UInt): ULong =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_LocalShrink(hmem.toCPointer<ByteVar>(), cbnewsize)

public actual fun MulDiv(nnumber: Int, nnumerator: Int, ndenominator: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_MulDiv(nnumber, nnumerator, ndenominator)

public actual fun NeedReboot(dwrebootcheck: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_NeedReboot(dwrebootcheck)

public actual fun NeedRebootInit(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_NeedRebootInit()

public actual fun OpenINFEngineA(pszinffilename: PCSTR, pszinstallsection: PCSTR, dwflags: UInt, phinf: Long, pvreserved: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_OpenINFEngineA(pszinffilename.toCPointer<ByteVar>(), pszinstallsection.toCPointer<ByteVar>(), dwflags, phinf.toCPointer<ByteVar>(), pvreserved.toCPointer<ByteVar>())

public actual fun OpenINFEngineW(pszinffilename: PCWSTR, pszinstallsection: PCWSTR, dwflags: UInt, phinf: Long, pvreserved: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_OpenINFEngineW(pszinffilename.toCPointer<ByteVar>(), pszinstallsection.toCPointer<ByteVar>(), dwflags, phinf.toCPointer<ByteVar>(), pvreserved.toCPointer<ByteVar>())

public actual fun OpenMutexA(dwdesiredaccess: UInt, binherithandle: BOOL, lpname: PCSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_OpenMutexA(dwdesiredaccess, binherithandle, lpname.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun OpenSemaphoreA(dwdesiredaccess: UInt, binherithandle: BOOL, lpname: PCSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_OpenSemaphoreA(dwdesiredaccess, binherithandle, lpname.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun QueryAuxiliaryCounterFrequency(lpauxiliarycounterfrequency: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_QueryAuxiliaryCounterFrequency(lpauxiliarycounterfrequency.toCPointer<ByteVar>())

public actual fun QueryIdleProcessorCycleTime(bufferlength: Long, processoridlecycletime: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_QueryIdleProcessorCycleTime(bufferlength.toCPointer<ByteVar>(), processoridlecycletime.toCPointer<ByteVar>())

public actual fun QueryIdleProcessorCycleTimeEx(group: UShort, bufferlength: Long, processoridlecycletime: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_QueryIdleProcessorCycleTimeEx(group, bufferlength.toCPointer<ByteVar>(), processoridlecycletime.toCPointer<ByteVar>())

public actual fun QueryInterruptTime(lpinterrupttime: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_QueryInterruptTime(lpinterrupttime.toCPointer<ByteVar>())
}

public actual fun QueryInterruptTimePrecise(lpinterrupttimeprecise: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_QueryInterruptTimePrecise(lpinterrupttimeprecise.toCPointer<ByteVar>())
}

public actual fun QueryProcessCycleTime(processhandle: HANDLE, cycletime: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_QueryProcessCycleTime(processhandle.toCPointer<ByteVar>(), cycletime.toCPointer<ByteVar>())

public actual fun QueryThreadCycleTime(threadhandle: HANDLE, cycletime: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_QueryThreadCycleTime(threadhandle.toCPointer<ByteVar>(), cycletime.toCPointer<ByteVar>())

public actual fun QueryUnbiasedInterruptTime(unbiasedtime: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_QueryUnbiasedInterruptTime(unbiasedtime.toCPointer<ByteVar>())

public actual fun QueryUnbiasedInterruptTimePrecise(lpunbiasedinterrupttimeprecise: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_QueryUnbiasedInterruptTimePrecise(lpunbiasedinterrupttimeprecise.toCPointer<ByteVar>())
}

public actual fun RaiseCustomSystemEventTrigger(customsystemeventtriggerconfig: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_RaiseCustomSystemEventTrigger(customsystemeventtriggerconfig.toCPointer<ByteVar>())

public actual fun RebootCheckOnInstallA(hwnd: HWND, pszinf: PCSTR, pszsec: PCSTR, dwreserved: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_RebootCheckOnInstallA(hwnd.toCPointer<ByteVar>(), pszinf.toCPointer<ByteVar>(), pszsec.toCPointer<ByteVar>(), dwreserved)

public actual fun RebootCheckOnInstallW(hwnd: HWND, pszinf: PCWSTR, pszsec: PCWSTR, dwreserved: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_RebootCheckOnInstallW(hwnd.toCPointer<ByteVar>(), pszinf.toCPointer<ByteVar>(), pszsec.toCPointer<ByteVar>(), dwreserved)

public actual fun RecordFeatureError(featureid: UInt, error: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_RecordFeatureError(featureid, error.toCPointer<ByteVar>())
}

public actual fun RecordFeatureUsage(featureid: UInt, kind: UInt, addend: UInt, originname: PCSTR) {
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_RecordFeatureUsage(featureid, kind, addend, originname.toCPointer<ByteVar>())
}

public actual fun RegInstallA(hmod: HMODULE, pszsection: PCSTR, psttable: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_RegInstallA(hmod.toCPointer<ByteVar>(), pszsection.toCPointer<ByteVar>(), psttable.toCPointer<ByteVar>())

public actual fun RegInstallW(hmod: HMODULE, pszsection: PCWSTR, psttable: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_RegInstallW(hmod.toCPointer<ByteVar>(), pszsection.toCPointer<ByteVar>(), psttable.toCPointer<ByteVar>())

public actual fun RegRestoreAllA(hwnd: HWND, psztitlestring: PCSTR, hkbckupkey: HKEY): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_RegRestoreAllA(hwnd.toCPointer<ByteVar>(), psztitlestring.toCPointer<ByteVar>(), hkbckupkey.toCPointer<ByteVar>())

public actual fun RegRestoreAllW(hwnd: HWND, psztitlestring: PCWSTR, hkbckupkey: HKEY): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_RegRestoreAllW(hwnd.toCPointer<ByteVar>(), psztitlestring.toCPointer<ByteVar>(), hkbckupkey.toCPointer<ByteVar>())

public actual fun RegSaveRestoreA(hwnd: HWND, psztitlestring: PCSTR, hkbckupkey: HKEY, pcszrootkey: PCSTR, pcszsubkey: PCSTR, pcszvaluename: PCSTR, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_RegSaveRestoreA(hwnd.toCPointer<ByteVar>(), psztitlestring.toCPointer<ByteVar>(), hkbckupkey.toCPointer<ByteVar>(), pcszrootkey.toCPointer<ByteVar>(), pcszsubkey.toCPointer<ByteVar>(), pcszvaluename.toCPointer<ByteVar>(), dwflags)

public actual fun RegSaveRestoreOnINFA(hwnd: HWND, psztitle: PCSTR, pszinf: PCSTR, pszsection: PCSTR, hhklmbackkey: HKEY, hhkcubackkey: HKEY, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_RegSaveRestoreOnINFA(hwnd.toCPointer<ByteVar>(), psztitle.toCPointer<ByteVar>(), pszinf.toCPointer<ByteVar>(), pszsection.toCPointer<ByteVar>(), hhklmbackkey.toCPointer<ByteVar>(), hhkcubackkey.toCPointer<ByteVar>(), dwflags)

public actual fun RegSaveRestoreOnINFW(hwnd: HWND, psztitle: PCWSTR, pszinf: PCWSTR, pszsection: PCWSTR, hhklmbackkey: HKEY, hhkcubackkey: HKEY, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_RegSaveRestoreOnINFW(hwnd.toCPointer<ByteVar>(), psztitle.toCPointer<ByteVar>(), pszinf.toCPointer<ByteVar>(), pszsection.toCPointer<ByteVar>(), hhklmbackkey.toCPointer<ByteVar>(), hhkcubackkey.toCPointer<ByteVar>(), dwflags)

public actual fun RegSaveRestoreW(hwnd: HWND, psztitlestring: PCWSTR, hkbckupkey: HKEY, pcszrootkey: PCWSTR, pcszsubkey: PCWSTR, pcszvaluename: PCWSTR, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_RegSaveRestoreW(hwnd.toCPointer<ByteVar>(), psztitlestring.toCPointer<ByteVar>(), hkbckupkey.toCPointer<ByteVar>(), pcszrootkey.toCPointer<ByteVar>(), pcszsubkey.toCPointer<ByteVar>(), pcszvaluename.toCPointer<ByteVar>(), dwflags)

public actual fun ReplacePartitionUnit(targetpartition: PCWSTR, sparepartition: PCWSTR, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_ReplacePartitionUnit(targetpartition.toCPointer<ByteVar>(), sparepartition.toCPointer<ByteVar>(), flags)

public actual fun RequestDeviceWakeup(hdevice: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_RequestDeviceWakeup(hdevice.toCPointer<ByteVar>())

public actual fun RtlAnsiStringToUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_RtlAnsiStringToUnicodeString(destinationstring.toCPointer<ByteVar>(), sourcestring.toCPointer<ByteVar>(), allocatedestinationstring)

public actual fun RtlCharToInteger(string: Long, base: UInt, value: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_RtlCharToInteger(string.toCPointer<ByteVar>(), base, value.toCPointer<ByteVar>())

public actual fun RtlFreeAnsiString(ansistring: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_RtlFreeAnsiString(ansistring.toCPointer<ByteVar>())
}

public actual fun RtlFreeOemString(oemstring: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_RtlFreeOemString(oemstring.toCPointer<ByteVar>())
}

public actual fun RtlFreeUnicodeString(unicodestring: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_RtlFreeUnicodeString(unicodestring.toCPointer<ByteVar>())
}

public actual fun RtlGetReturnAddressHijackTarget(): ULong =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_RtlGetReturnAddressHijackTarget()

public actual fun RtlInitAnsiString(destinationstring: Long, sourcestring: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_RtlInitAnsiString(destinationstring.toCPointer<ByteVar>(), sourcestring.toCPointer<ByteVar>())
}

public actual fun RtlInitAnsiStringEx(destinationstring: Long, sourcestring: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_RtlInitAnsiStringEx(destinationstring.toCPointer<ByteVar>(), sourcestring.toCPointer<ByteVar>())

public actual fun RtlInitString(destinationstring: Long, sourcestring: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_RtlInitString(destinationstring.toCPointer<ByteVar>(), sourcestring.toCPointer<ByteVar>())
}

public actual fun RtlInitStringEx(destinationstring: Long, sourcestring: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_RtlInitStringEx(destinationstring.toCPointer<ByteVar>(), sourcestring.toCPointer<ByteVar>())

public actual fun RtlInitUnicodeString(destinationstring: Long, sourcestring: PCWSTR) {
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_RtlInitUnicodeString(destinationstring.toCPointer<ByteVar>(), sourcestring.toCPointer<ByteVar>())
}

public actual fun RtlIsNameLegalDOS8Dot3(name: Long, oemname: Long, namecontainsspaces: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_RtlIsNameLegalDOS8Dot3(name.toCPointer<ByteVar>(), oemname.toCPointer<ByteVar>(), namecontainsspaces.toCPointer<ByteVar>())

public actual fun RtlLocalTimeToSystemTime(localtime: Long, systemtime: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_RtlLocalTimeToSystemTime(localtime.toCPointer<ByteVar>(), systemtime.toCPointer<ByteVar>())

public actual fun RtlRaiseCustomSystemEventTrigger(triggerconfig: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_RtlRaiseCustomSystemEventTrigger(triggerconfig.toCPointer<ByteVar>())

public actual fun RtlTimeToSecondsSince1970(time: Long, elapsedseconds: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_RtlTimeToSecondsSince1970(time.toCPointer<ByteVar>(), elapsedseconds.toCPointer<ByteVar>())

public actual fun RtlUnicodeStringToAnsiString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_RtlUnicodeStringToAnsiString(destinationstring.toCPointer<ByteVar>(), sourcestring.toCPointer<ByteVar>(), allocatedestinationstring)

public actual fun RtlUnicodeStringToOemString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_RtlUnicodeStringToOemString(destinationstring.toCPointer<ByteVar>(), sourcestring.toCPointer<ByteVar>(), allocatedestinationstring)

public actual fun RtlUnicodeToMultiByteSize(bytesinmultibytestring: Long, unicodestring: PCWSTR, bytesinunicodestring: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_RtlUnicodeToMultiByteSize(bytesinmultibytestring.toCPointer<ByteVar>(), unicodestring.toCPointer<ByteVar>(), bytesinunicodestring)

public actual fun RtlUniform(seed: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_RtlUniform(seed.toCPointer<ByteVar>())

public actual fun RunSetupCommandA(hwnd: HWND, szcmdname: PCSTR, szinfsection: PCSTR, szdir: PCSTR, lpsztitle: PCSTR, phexe: Long, dwflags: UInt, pvreserved: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_RunSetupCommandA(hwnd.toCPointer<ByteVar>(), szcmdname.toCPointer<ByteVar>(), szinfsection.toCPointer<ByteVar>(), szdir.toCPointer<ByteVar>(), lpsztitle.toCPointer<ByteVar>(), phexe.toCPointer<ByteVar>(), dwflags, pvreserved.toCPointer<ByteVar>())

public actual fun RunSetupCommandW(hwnd: HWND, szcmdname: PCWSTR, szinfsection: PCWSTR, szdir: PCWSTR, lpsztitle: PCWSTR, phexe: Long, dwflags: UInt, pvreserved: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_RunSetupCommandW(hwnd.toCPointer<ByteVar>(), szcmdname.toCPointer<ByteVar>(), szinfsection.toCPointer<ByteVar>(), szdir.toCPointer<ByteVar>(), lpsztitle.toCPointer<ByteVar>(), phexe.toCPointer<ByteVar>(), dwflags, pvreserved.toCPointer<ByteVar>())

public actual fun SendIMEMessageExA(param0: HWND, param1: LPARAM): LRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_SendIMEMessageExA(param0.toCPointer<ByteVar>(), param1)

public actual fun SendIMEMessageExW(param0: HWND, param1: LPARAM): LRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_SendIMEMessageExW(param0.toCPointer<ByteVar>(), param1)

public actual fun SetEnvironmentStringsA(newenvironment: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_SetEnvironmentStringsA(newenvironment.toCPointer<ByteVar>())

public actual fun SetFirmwareEnvironmentVariableA(lpname: PCSTR, lpguid: PCSTR, pvalue: Long, nsize: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_SetFirmwareEnvironmentVariableA(lpname.toCPointer<ByteVar>(), lpguid.toCPointer<ByteVar>(), pvalue.toCPointer<ByteVar>(), nsize)

public actual fun SetFirmwareEnvironmentVariableExA(lpname: PCSTR, lpguid: PCSTR, pvalue: Long, nsize: UInt, dwattributes: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_SetFirmwareEnvironmentVariableExA(lpname.toCPointer<ByteVar>(), lpguid.toCPointer<ByteVar>(), pvalue.toCPointer<ByteVar>(), nsize, dwattributes)

public actual fun SetFirmwareEnvironmentVariableExW(lpname: PCWSTR, lpguid: PCWSTR, pvalue: Long, nsize: UInt, dwattributes: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_SetFirmwareEnvironmentVariableExW(lpname.toCPointer<ByteVar>(), lpguid.toCPointer<ByteVar>(), pvalue.toCPointer<ByteVar>(), nsize, dwattributes)

public actual fun SetFirmwareEnvironmentVariableW(lpname: PCWSTR, lpguid: PCWSTR, pvalue: Long, nsize: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_SetFirmwareEnvironmentVariableW(lpname.toCPointer<ByteVar>(), lpguid.toCPointer<ByteVar>(), pvalue.toCPointer<ByteVar>(), nsize)

public actual fun SetHandleCount(unumber: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_SetHandleCount(unumber)

public actual fun SetMessageWaitingIndicator(hmsgindicator: HANDLE, ulmsgcount: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_SetMessageWaitingIndicator(hmsgindicator.toCPointer<ByteVar>(), ulmsgcount)

public actual fun SetPerUserSecValuesA(pperuser: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_SetPerUserSecValuesA(pperuser.toCPointer<ByteVar>())

public actual fun SetPerUserSecValuesW(pperuser: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_SetPerUserSecValuesW(pperuser.toCPointer<ByteVar>())

public actual fun SubscribeFeatureStateChangeNotification(subscription: Long, callback: PFEATURE_STATE_CHANGE_CALLBACK, context: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_SubscribeFeatureStateChangeNotification(subscription.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>())
}

public actual fun TranslateInfStringA(pszinffilename: PCSTR, pszinstallsection: PCSTR, psztranslatesection: PCSTR, psztranslatekey: PCSTR, pszbuffer: PSTR, cchbuffer: UInt, pdwrequiredsize: Long, pvreserved: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_TranslateInfStringA(pszinffilename.toCPointer<ByteVar>(), pszinstallsection.toCPointer<ByteVar>(), psztranslatesection.toCPointer<ByteVar>(), psztranslatekey.toCPointer<ByteVar>(), pszbuffer.toCPointer<ByteVar>(), cchbuffer, pdwrequiredsize.toCPointer<ByteVar>(), pvreserved.toCPointer<ByteVar>())

public actual fun TranslateInfStringExA(hinf: Long, pszinffilename: PCSTR, psztranslatesection: PCSTR, psztranslatekey: PCSTR, pszbuffer: PSTR, dwbuffersize: UInt, pdwrequiredsize: Long, pvreserved: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_TranslateInfStringExA(hinf.toCPointer<ByteVar>(), pszinffilename.toCPointer<ByteVar>(), psztranslatesection.toCPointer<ByteVar>(), psztranslatekey.toCPointer<ByteVar>(), pszbuffer.toCPointer<ByteVar>(), dwbuffersize, pdwrequiredsize.toCPointer<ByteVar>(), pvreserved.toCPointer<ByteVar>())

public actual fun TranslateInfStringExW(hinf: Long, pszinffilename: PCWSTR, psztranslatesection: PCWSTR, psztranslatekey: PCWSTR, pszbuffer: PWSTR, dwbuffersize: UInt, pdwrequiredsize: Long, pvreserved: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_TranslateInfStringExW(hinf.toCPointer<ByteVar>(), pszinffilename.toCPointer<ByteVar>(), psztranslatesection.toCPointer<ByteVar>(), psztranslatekey.toCPointer<ByteVar>(), pszbuffer.toCPointer<ByteVar>(), dwbuffersize, pdwrequiredsize.toCPointer<ByteVar>(), pvreserved.toCPointer<ByteVar>())

public actual fun TranslateInfStringW(pszinffilename: PCWSTR, pszinstallsection: PCWSTR, psztranslatesection: PCWSTR, psztranslatekey: PCWSTR, pszbuffer: PWSTR, cchbuffer: UInt, pdwrequiredsize: Long, pvreserved: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_TranslateInfStringW(pszinffilename.toCPointer<ByteVar>(), pszinstallsection.toCPointer<ByteVar>(), psztranslatesection.toCPointer<ByteVar>(), psztranslatekey.toCPointer<ByteVar>(), pszbuffer.toCPointer<ByteVar>(), cchbuffer, pdwrequiredsize.toCPointer<ByteVar>(), pvreserved.toCPointer<ByteVar>())

public actual fun UnsubscribeFeatureStateChangeNotification(subscription: FEATURE_STATE_CHANGE_SUBSCRIPTION) {
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_UnsubscribeFeatureStateChangeNotification(subscription.toCPointer<ByteVar>())
}

public actual fun UserInstStubWrapperA(hwnd: HWND, hinstance: HINSTANCE, pszparms: PCSTR, nshow: Int): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_UserInstStubWrapperA(hwnd.toCPointer<ByteVar>(), hinstance.toCPointer<ByteVar>(), pszparms.toCPointer<ByteVar>(), nshow)

public actual fun UserInstStubWrapperW(hwnd: HWND, hinstance: HINSTANCE, pszparms: PCWSTR, nshow: Int): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_UserInstStubWrapperW(hwnd.toCPointer<ByteVar>(), hinstance.toCPointer<ByteVar>(), pszparms.toCPointer<ByteVar>(), nshow)

public actual fun UserUnInstStubWrapperA(hwnd: HWND, hinstance: HINSTANCE, pszparms: PCSTR, nshow: Int): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_UserUnInstStubWrapperA(hwnd.toCPointer<ByteVar>(), hinstance.toCPointer<ByteVar>(), pszparms.toCPointer<ByteVar>(), nshow)

public actual fun UserUnInstStubWrapperW(hwnd: HWND, hinstance: HINSTANCE, pszparms: PCWSTR, nshow: Int): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_UserUnInstStubWrapperW(hwnd.toCPointer<ByteVar>(), hinstance.toCPointer<ByteVar>(), pszparms.toCPointer<ByteVar>(), nshow)

public actual fun WINNLSEnableIME(param0: HWND, param1: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_WINNLSEnableIME(param0.toCPointer<ByteVar>(), param1)

public actual fun WINNLSGetEnableStatus(param0: HWND): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_WINNLSGetEnableStatus(param0.toCPointer<ByteVar>())

public actual fun WINNLSGetIMEHotkey(param0: HWND): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_WINNLSGetIMEHotkey(param0.toCPointer<ByteVar>())

public actual fun WinWatchClose(hww: HWINWATCH) {
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_WinWatchClose(hww.toCPointer<ByteVar>())
}

public actual fun WinWatchDidStatusChange(hww: HWINWATCH): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_WinWatchDidStatusChange(hww.toCPointer<ByteVar>())

public actual fun WinWatchGetClipList(hww: HWINWATCH, prc: Long, size: UInt, prd: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_WinWatchGetClipList(hww.toCPointer<ByteVar>(), prc.toCPointer<ByteVar>(), size, prd.toCPointer<ByteVar>())

public actual fun WinWatchNotify(hww: HWINWATCH, notifycallback: WINWATCHNOTIFYPROC, notifyparam: LPARAM): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_WinWatchNotify(hww.toCPointer<ByteVar>(), notifycallback.toLong().toCPointer<ByteVar>(), notifyparam)

public actual fun WinWatchOpen(hwnd: HWND): HWINWATCH =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_WinWatchOpen(hwnd.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun WldpCanExecuteBuffer(host: Long, options: WLDP_EXECUTION_EVALUATION_OPTIONS, buffer: Long, buffersize: UInt, auditinfo: PCWSTR, result: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_WldpCanExecuteBuffer(host.toCPointer<ByteVar>(), options, buffer.toCPointer<ByteVar>(), buffersize, auditinfo.toCPointer<ByteVar>(), result.toCPointer<ByteVar>())

public actual fun WldpCanExecuteFile(host: Long, options: WLDP_EXECUTION_EVALUATION_OPTIONS, filehandle: HANDLE, auditinfo: PCWSTR, result: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_WldpCanExecuteFile(host.toCPointer<ByteVar>(), options, filehandle.toCPointer<ByteVar>(), auditinfo.toCPointer<ByteVar>(), result.toCPointer<ByteVar>())

public actual fun WldpCanExecuteStream(host: Long, options: WLDP_EXECUTION_EVALUATION_OPTIONS, stream: Long, auditinfo: PCWSTR, result: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_WldpCanExecuteStream(host.toCPointer<ByteVar>(), options, stream.toCPointer<ByteVar>(), auditinfo.toCPointer<ByteVar>(), result.toCPointer<ByteVar>())

public actual fun WldpGetLockdownPolicy(hostinformation: Long, lockdownstate: Long, lockdownflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_WldpGetLockdownPolicy(hostinformation.toCPointer<ByteVar>(), lockdownstate.toCPointer<ByteVar>(), lockdownflags)

public actual fun WldpIsClassInApprovedList(classid: Long, hostinformation: Long, isapproved: Long, optionalflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_WldpIsClassInApprovedList(classid.toCPointer<ByteVar>(), hostinformation.toCPointer<ByteVar>(), isapproved.toCPointer<ByteVar>(), optionalflags)

public actual fun WldpIsDynamicCodePolicyEnabled(isenabled: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_WldpIsDynamicCodePolicyEnabled(isenabled.toCPointer<ByteVar>())

public actual fun WldpQueryDeviceSecurityInformation(information: Long, informationlength: UInt, returnlength: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_WldpQueryDeviceSecurityInformation(information.toCPointer<ByteVar>(), informationlength, returnlength.toCPointer<ByteVar>())

public actual fun WldpQueryDynamicCodeTrust(filehandle: HANDLE, baseimage: Long, imagesize: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_WldpQueryDynamicCodeTrust(filehandle.toCPointer<ByteVar>(), baseimage.toCPointer<ByteVar>(), imagesize)

public actual fun WldpSetDynamicCodeTrust(filehandle: HANDLE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_WldpSetDynamicCodeTrust(filehandle.toCPointer<ByteVar>())

public actual fun WritePrivateProfileSectionA(lpappname: PCSTR, lpstring: PCSTR, lpfilename: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_WritePrivateProfileSectionA(lpappname.toCPointer<ByteVar>(), lpstring.toCPointer<ByteVar>(), lpfilename.toCPointer<ByteVar>())

public actual fun WritePrivateProfileSectionW(lpappname: PCWSTR, lpstring: PCWSTR, lpfilename: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_WritePrivateProfileSectionW(lpappname.toCPointer<ByteVar>(), lpstring.toCPointer<ByteVar>(), lpfilename.toCPointer<ByteVar>())

public actual fun WritePrivateProfileStringA(lpappname: PCSTR, lpkeyname: PCSTR, lpstring: PCSTR, lpfilename: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_WritePrivateProfileStringA(lpappname.toCPointer<ByteVar>(), lpkeyname.toCPointer<ByteVar>(), lpstring.toCPointer<ByteVar>(), lpfilename.toCPointer<ByteVar>())

public actual fun WritePrivateProfileStringW(lpappname: PCWSTR, lpkeyname: PCWSTR, lpstring: PCWSTR, lpfilename: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_WritePrivateProfileStringW(lpappname.toCPointer<ByteVar>(), lpkeyname.toCPointer<ByteVar>(), lpstring.toCPointer<ByteVar>(), lpfilename.toCPointer<ByteVar>())

public actual fun WritePrivateProfileStructA(lpszsection: PCSTR, lpszkey: PCSTR, lpstruct: Long, usizestruct: UInt, szfile: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_WritePrivateProfileStructA(lpszsection.toCPointer<ByteVar>(), lpszkey.toCPointer<ByteVar>(), lpstruct.toCPointer<ByteVar>(), usizestruct, szfile.toCPointer<ByteVar>())

public actual fun WritePrivateProfileStructW(lpszsection: PCWSTR, lpszkey: PCWSTR, lpstruct: Long, usizestruct: UInt, szfile: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_WritePrivateProfileStructW(lpszsection.toCPointer<ByteVar>(), lpszkey.toCPointer<ByteVar>(), lpstruct.toCPointer<ByteVar>(), usizestruct, szfile.toCPointer<ByteVar>())

public actual fun WriteProfileSectionA(lpappname: PCSTR, lpstring: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_WriteProfileSectionA(lpappname.toCPointer<ByteVar>(), lpstring.toCPointer<ByteVar>())

public actual fun WriteProfileSectionW(lpappname: PCWSTR, lpstring: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_WriteProfileSectionW(lpappname.toCPointer<ByteVar>(), lpstring.toCPointer<ByteVar>())

public actual fun WriteProfileStringA(lpappname: PCSTR, lpkeyname: PCSTR, lpstring: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_WriteProfileStringA(lpappname.toCPointer<ByteVar>(), lpkeyname.toCPointer<ByteVar>(), lpstring.toCPointer<ByteVar>())

public actual fun WriteProfileStringW(lpappname: PCWSTR, lpkeyname: PCWSTR, lpstring: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_WriteProfileStringW(lpappname.toCPointer<ByteVar>(), lpkeyname.toCPointer<ByteVar>(), lpstring.toCPointer<ByteVar>())

public actual fun _hread(hfile: Int, lpbuffer: Long, lbytes: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming__hread(hfile, lpbuffer.toCPointer<ByteVar>(), lbytes)

public actual fun _hwrite(hfile: Int, lpbuffer: PCSTR, lbytes: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming__hwrite(hfile, lpbuffer.toCPointer<ByteVar>(), lbytes)

public actual fun _lclose(hfile: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming__lclose(hfile)

public actual fun _lcreat(lppathname: PCSTR, iattribute: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming__lcreat(lppathname.toCPointer<ByteVar>(), iattribute)

public actual fun _llseek(hfile: Int, loffset: Int, iorigin: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming__llseek(hfile, loffset, iorigin)

public actual fun _lopen(lppathname: PCSTR, ireadwrite: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming__lopen(lppathname.toCPointer<ByteVar>(), ireadwrite)

public actual fun _lread(hfile: Int, lpbuffer: Long, ubytes: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming__lread(hfile, lpbuffer.toCPointer<ByteVar>(), ubytes)

public actual fun _lwrite(hfile: Int, lpbuffer: PCSTR, ubytes: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming__lwrite(hfile, lpbuffer.toCPointer<ByteVar>(), ubytes)

public actual fun uaw_lstrcmpW(string1: Long, string2: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_uaw_lstrcmpW(string1.toCPointer<ByteVar>(), string2.toCPointer<ByteVar>())

public actual fun uaw_lstrcmpiW(string1: Long, string2: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_uaw_lstrcmpiW(string1.toCPointer<ByteVar>(), string2.toCPointer<ByteVar>())

public actual fun uaw_lstrlenW(string: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_uaw_lstrlenW(string.toCPointer<ByteVar>())

public actual fun uaw_wcschr(string: Long, character: UShort): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_uaw_wcschr(string.toCPointer<ByteVar>(), character)?.toLong() ?: 0L

public actual fun uaw_wcscpy(destination: Long, source: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_uaw_wcscpy(destination.toCPointer<ByteVar>(), source.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uaw_wcsicmp(string1: Long, string2: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_uaw_wcsicmp(string1.toCPointer<ByteVar>(), string2.toCPointer<ByteVar>())

public actual fun uaw_wcslen(string: Long): ULong =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_uaw_wcslen(string.toCPointer<ByteVar>())

public actual fun uaw_wcsrchr(string: Long, character: UShort): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_uaw_wcsrchr(string.toCPointer<ByteVar>(), character)?.toLong() ?: 0L
