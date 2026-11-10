@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun addDelBackupEntryA(lpcszfilelist: Pcstr, lpcszbackupdir: Pcstr, lpcszbasename: Pcstr, dwflags: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_addDelBackupEntryA(lpcszfilelist?.value?.toCPointer<ByteVar>(), lpcszbackupdir?.value?.toCPointer<ByteVar>(), lpcszbasename?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun addDelBackupEntryW(lpcszfilelist: Pcwstr, lpcszbackupdir: Pcwstr, lpcszbasename: Pcwstr, dwflags: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_addDelBackupEntryW(lpcszfilelist?.value?.toCPointer<ByteVar>(), lpcszbackupdir?.value?.toCPointer<ByteVar>(), lpcszbasename?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun advInstallFileA(hwnd: Hwnd, lpszsourcedir: Pcstr, lpszsourcefile: Pcstr, lpszdestdir: Pcstr, lpszdestfile: Pcstr, dwflags: UInt, dwreserved: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_advInstallFileA(hwnd?.value?.toCPointer<ByteVar>(), lpszsourcedir?.value?.toCPointer<ByteVar>(), lpszsourcefile?.value?.toCPointer<ByteVar>(), lpszdestdir?.value?.toCPointer<ByteVar>(), lpszdestfile?.value?.toCPointer<ByteVar>(), dwflags, dwreserved)

public actual fun advInstallFileW(hwnd: Hwnd, lpszsourcedir: Pcwstr, lpszsourcefile: Pcwstr, lpszdestdir: Pcwstr, lpszdestfile: Pcwstr, dwflags: UInt, dwreserved: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_advInstallFileW(hwnd?.value?.toCPointer<ByteVar>(), lpszsourcedir?.value?.toCPointer<ByteVar>(), lpszsourcefile?.value?.toCPointer<ByteVar>(), lpszdestdir?.value?.toCPointer<ByteVar>(), lpszdestfile?.value?.toCPointer<ByteVar>(), dwflags, dwreserved)

public actual fun apphelpCheckShellObject(objectclsid: COpaquePointer?, bshimifnecessary: Bool, pullflags: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_apphelpCheckShellObject(objectclsid?.value?.toCPointer<ByteVar>(), bshimifnecessary, pullflags?.value?.toCPointer<ByteVar>())

public actual fun cancelDeviceWakeupRequest(hdevice: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_cancelDeviceWakeupRequest(hdevice?.value?.toCPointer<ByteVar>())

public actual fun closeINFEngine(hinf: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_closeINFEngine(hinf?.value?.toCPointer<ByteVar>())

public actual fun convertAuxiliaryCounterToPerformanceCounter(ullauxiliarycountervalue: ULong, lpperformancecountervalue: COpaquePointer?, lpconversionerror: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_convertAuxiliaryCounterToPerformanceCounter(ullauxiliarycountervalue, lpperformancecountervalue?.value?.toCPointer<ByteVar>(), lpconversionerror?.value?.toCPointer<ByteVar>())

public actual fun convertPerformanceCounterToAuxiliaryCounter(ullperformancecountervalue: ULong, lpauxiliarycountervalue: COpaquePointer?, lpconversionerror: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_convertPerformanceCounterToAuxiliaryCounter(ullperformancecountervalue, lpauxiliarycountervalue?.value?.toCPointer<ByteVar>(), lpconversionerror?.value?.toCPointer<ByteVar>())

public actual fun dCIBeginAccess(pdci: COpaquePointer?, x: Int, y: Int, dx: Int, dy: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_dCIBeginAccess(pdci?.value?.toCPointer<ByteVar>(), x, y, dx, dy)

public actual fun dCICloseProvider(hdc: Hdc) {
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_dCICloseProvider(hdc?.value?.toCPointer<ByteVar>())
}

public actual fun dCICreateOffscreen(hdc: Hdc, dwcompression: UInt, dwredmask: UInt, dwgreenmask: UInt, dwbluemask: UInt, dwwidth: UInt, dwheight: UInt, dwdcicaps: UInt, dwbitcount: UInt, lplpsurface: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_dCICreateOffscreen(hdc?.value?.toCPointer<ByteVar>(), dwcompression, dwredmask, dwgreenmask, dwbluemask, dwwidth, dwheight, dwdcicaps, dwbitcount, lplpsurface?.value?.toCPointer<ByteVar>())

public actual fun dCICreateOverlay(hdc: Hdc, lpoffscreensurf: COpaquePointer?, lplpsurface: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_dCICreateOverlay(hdc?.value?.toCPointer<ByteVar>(), lpoffscreensurf?.value?.toCPointer<ByteVar>(), lplpsurface?.value?.toCPointer<ByteVar>())

public actual fun dCICreatePrimary(hdc: Hdc, lplpsurface: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_dCICreatePrimary(hdc?.value?.toCPointer<ByteVar>(), lplpsurface?.value?.toCPointer<ByteVar>())

public actual fun dCIDestroy(pdci: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_dCIDestroy(pdci?.value?.toCPointer<ByteVar>())
}

public actual fun dCIDraw(pdci: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_dCIDraw(pdci?.value?.toCPointer<ByteVar>())

public actual fun dCIEndAccess(pdci: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_dCIEndAccess(pdci?.value?.toCPointer<ByteVar>())
}

public actual fun dCIEnum(hdc: Hdc, lprdst: COpaquePointer?, lprsrc: COpaquePointer?, lpfncallback: COpaquePointer?, lpcontext: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_dCIEnum(hdc?.value?.toCPointer<ByteVar>(), lprdst?.value?.toCPointer<ByteVar>(), lprsrc?.value?.toCPointer<ByteVar>(), lpfncallback?.value?.toCPointer<ByteVar>(), lpcontext?.value?.toCPointer<ByteVar>())

public actual fun dCIOpenProvider(): Hdc =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_dCIOpenProvider()?.let { COpaquePointer(it.toLong()) }

public actual fun dCISetClipList(pdci: COpaquePointer?, prd: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_dCISetClipList(pdci?.value?.toCPointer<ByteVar>(), prd?.value?.toCPointer<ByteVar>())

public actual fun dCISetDestination(pdci: COpaquePointer?, dst: COpaquePointer?, src: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_dCISetDestination(pdci?.value?.toCPointer<ByteVar>(), dst?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>())

public actual fun dCISetSrcDestClip(pdci: COpaquePointer?, srcrc: COpaquePointer?, destrc: COpaquePointer?, prd: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_dCISetSrcDestClip(pdci?.value?.toCPointer<ByteVar>(), srcrc?.value?.toCPointer<ByteVar>(), destrc?.value?.toCPointer<ByteVar>(), prd?.value?.toCPointer<ByteVar>())

public actual fun delNodeA(pszfileordirname: Pcstr, dwflags: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_delNodeA(pszfileordirname?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun delNodeRunDLL32W(hwnd: Hwnd, hinstance: Hinstance, pszparms: Pwstr, nshow: Int): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_delNodeRunDLL32W(hwnd?.value?.toCPointer<ByteVar>(), hinstance?.value?.toCPointer<ByteVar>(), pszparms?.value?.toCPointer<ByteVar>(), nshow)

public actual fun delNodeW(pszfileordirname: Pcwstr, dwflags: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_delNodeW(pszfileordirname?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun dnsHostnameToComputerNameA(hostname: Pcstr, computername: Pstr, nsize: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_dnsHostnameToComputerNameA(hostname?.value?.toCPointer<ByteVar>(), computername?.value?.toCPointer<ByteVar>(), nsize?.value?.toCPointer<ByteVar>())

public actual fun dnsHostnameToComputerNameW(hostname: Pcwstr, computername: Pwstr, nsize: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_dnsHostnameToComputerNameW(hostname?.value?.toCPointer<ByteVar>(), computername?.value?.toCPointer<ByteVar>(), nsize?.value?.toCPointer<ByteVar>())

public actual fun dosDateTimeToFileTime(wfatdate: UShort, wfattime: UShort, lpfiletime: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_dosDateTimeToFileTime(wfatdate, wfattime, lpfiletime?.value?.toCPointer<ByteVar>())

public actual fun enableProcessOptionalXStateFeatures(features: ULong): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_enableProcessOptionalXStateFeatures(features)

public actual fun executeCabA(hwnd: Hwnd, pcab: COpaquePointer?, preserved: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_executeCabA(hwnd?.value?.toCPointer<ByteVar>(), pcab?.value?.toCPointer<ByteVar>(), preserved?.value?.toCPointer<ByteVar>())

public actual fun executeCabW(hwnd: Hwnd, pcab: COpaquePointer?, preserved: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_executeCabW(hwnd?.value?.toCPointer<ByteVar>(), pcab?.value?.toCPointer<ByteVar>(), preserved?.value?.toCPointer<ByteVar>())

public actual fun extractFilesA(pszcabname: Pcstr, pszexpanddir: Pcstr, dwflags: UInt, pszfilelist: Pcstr, lpreserved: COpaquePointer?, dwreserved: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_extractFilesA(pszcabname?.value?.toCPointer<ByteVar>(), pszexpanddir?.value?.toCPointer<ByteVar>(), dwflags, pszfilelist?.value?.toCPointer<ByteVar>(), lpreserved?.value?.toCPointer<ByteVar>(), dwreserved)

public actual fun extractFilesW(pszcabname: Pcwstr, pszexpanddir: Pcwstr, dwflags: UInt, pszfilelist: Pcwstr, lpreserved: COpaquePointer?, dwreserved: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_extractFilesW(pszcabname?.value?.toCPointer<ByteVar>(), pszexpanddir?.value?.toCPointer<ByteVar>(), dwflags, pszfilelist?.value?.toCPointer<ByteVar>(), lpreserved?.value?.toCPointer<ByteVar>(), dwreserved)

public actual fun fileSaveMarkNotExistA(lpfilelist: Pcstr, lpdir: Pcstr, lpbasename: Pcstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_fileSaveMarkNotExistA(lpfilelist?.value?.toCPointer<ByteVar>(), lpdir?.value?.toCPointer<ByteVar>(), lpbasename?.value?.toCPointer<ByteVar>())

public actual fun fileSaveMarkNotExistW(lpfilelist: Pcwstr, lpdir: Pcwstr, lpbasename: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_fileSaveMarkNotExistW(lpfilelist?.value?.toCPointer<ByteVar>(), lpdir?.value?.toCPointer<ByteVar>(), lpbasename?.value?.toCPointer<ByteVar>())

public actual fun fileSaveRestoreOnINFA(hwnd: Hwnd, psztitle: Pcstr, pszinf: Pcstr, pszsection: Pcstr, pszbackupdir: Pcstr, pszbasebackupfile: Pcstr, dwflags: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_fileSaveRestoreOnINFA(hwnd?.value?.toCPointer<ByteVar>(), psztitle?.value?.toCPointer<ByteVar>(), pszinf?.value?.toCPointer<ByteVar>(), pszsection?.value?.toCPointer<ByteVar>(), pszbackupdir?.value?.toCPointer<ByteVar>(), pszbasebackupfile?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun fileSaveRestoreOnINFW(hwnd: Hwnd, psztitle: Pcwstr, pszinf: Pcwstr, pszsection: Pcwstr, pszbackupdir: Pcwstr, pszbasebackupfile: Pcwstr, dwflags: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_fileSaveRestoreOnINFW(hwnd?.value?.toCPointer<ByteVar>(), psztitle?.value?.toCPointer<ByteVar>(), pszinf?.value?.toCPointer<ByteVar>(), pszsection?.value?.toCPointer<ByteVar>(), pszbackupdir?.value?.toCPointer<ByteVar>(), pszbasebackupfile?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun fileSaveRestoreW(hdlg: Hwnd, lpfilelist: Pcwstr, lpdir: Pcwstr, lpbasename: Pcwstr, dwflags: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_fileSaveRestoreW(hdlg?.value?.toCPointer<ByteVar>(), lpfilelist?.value?.toCPointer<ByteVar>(), lpdir?.value?.toCPointer<ByteVar>(), lpbasename?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun fileTimeToDosDateTime(lpfiletime: COpaquePointer?, lpfatdate: COpaquePointer?, lpfattime: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_fileTimeToDosDateTime(lpfiletime?.value?.toCPointer<ByteVar>(), lpfatdate?.value?.toCPointer<ByteVar>(), lpfattime?.value?.toCPointer<ByteVar>())

public actual fun gdiEntry13(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_gdiEntry13()

public actual fun getComputerNameA(lpbuffer: Pstr, nsize: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_getComputerNameA(lpbuffer?.value?.toCPointer<ByteVar>(), nsize?.value?.toCPointer<ByteVar>())

public actual fun getComputerNameW(lpbuffer: Pwstr, nsize: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_getComputerNameW(lpbuffer?.value?.toCPointer<ByteVar>(), nsize?.value?.toCPointer<ByteVar>())

public actual fun getCurrentHwProfileA(lphwprofileinfo: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_getCurrentHwProfileA(lphwprofileinfo?.value?.toCPointer<ByteVar>())

public actual fun getCurrentHwProfileW(lphwprofileinfo: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_getCurrentHwProfileW(lphwprofileinfo?.value?.toCPointer<ByteVar>())

public actual fun getDCRegionData(hdc: Hdc, size: UInt, prd: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_getDCRegionData(hdc?.value?.toCPointer<ByteVar>(), size, prd?.value?.toCPointer<ByteVar>())

public actual fun getFeatureEnabledState(featureid: UInt, changetime: FeatureChangeTime): FeatureEnabledState =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_getFeatureEnabledState(featureid, changetime)

public actual fun getFeatureVariant(featureid: UInt, changetime: FeatureChangeTime, payloadid: COpaquePointer?, hasnotification: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_getFeatureVariant(featureid, changetime, payloadid?.value?.toCPointer<ByteVar>(), hasnotification?.value?.toCPointer<ByteVar>())

public actual fun getFirmwareEnvironmentVariableA(lpname: Pcstr, lpguid: Pcstr, pbuffer: COpaquePointer?, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_getFirmwareEnvironmentVariableA(lpname?.value?.toCPointer<ByteVar>(), lpguid?.value?.toCPointer<ByteVar>(), pbuffer?.value?.toCPointer<ByteVar>(), nsize)

public actual fun getFirmwareEnvironmentVariableExA(lpname: Pcstr, lpguid: Pcstr, pbuffer: COpaquePointer?, nsize: UInt, pdwattribubutes: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_getFirmwareEnvironmentVariableExA(lpname?.value?.toCPointer<ByteVar>(), lpguid?.value?.toCPointer<ByteVar>(), pbuffer?.value?.toCPointer<ByteVar>(), nsize, pdwattribubutes?.value?.toCPointer<ByteVar>())

public actual fun getFirmwareEnvironmentVariableExW(lpname: Pcwstr, lpguid: Pcwstr, pbuffer: COpaquePointer?, nsize: UInt, pdwattribubutes: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_getFirmwareEnvironmentVariableExW(lpname?.value?.toCPointer<ByteVar>(), lpguid?.value?.toCPointer<ByteVar>(), pbuffer?.value?.toCPointer<ByteVar>(), nsize, pdwattribubutes?.value?.toCPointer<ByteVar>())

public actual fun getFirmwareEnvironmentVariableW(lpname: Pcwstr, lpguid: Pcwstr, pbuffer: COpaquePointer?, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_getFirmwareEnvironmentVariableW(lpname?.value?.toCPointer<ByteVar>(), lpguid?.value?.toCPointer<ByteVar>(), pbuffer?.value?.toCPointer<ByteVar>(), nsize)

public actual fun getPrivateProfileIntA(lpappname: Pcstr, lpkeyname: Pcstr, ndefault: Int, lpfilename: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_getPrivateProfileIntA(lpappname?.value?.toCPointer<ByteVar>(), lpkeyname?.value?.toCPointer<ByteVar>(), ndefault, lpfilename?.value?.toCPointer<ByteVar>())

public actual fun getPrivateProfileIntW(lpappname: Pcwstr, lpkeyname: Pcwstr, ndefault: Int, lpfilename: Pcwstr): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_getPrivateProfileIntW(lpappname?.value?.toCPointer<ByteVar>(), lpkeyname?.value?.toCPointer<ByteVar>(), ndefault, lpfilename?.value?.toCPointer<ByteVar>())

public actual fun getPrivateProfileSectionA(lpappname: Pcstr, lpreturnedstring: Pstr, nsize: UInt, lpfilename: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_getPrivateProfileSectionA(lpappname?.value?.toCPointer<ByteVar>(), lpreturnedstring?.value?.toCPointer<ByteVar>(), nsize, lpfilename?.value?.toCPointer<ByteVar>())

public actual fun getPrivateProfileSectionNamesA(lpszreturnbuffer: Pstr, nsize: UInt, lpfilename: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_getPrivateProfileSectionNamesA(lpszreturnbuffer?.value?.toCPointer<ByteVar>(), nsize, lpfilename?.value?.toCPointer<ByteVar>())

public actual fun getPrivateProfileSectionNamesW(lpszreturnbuffer: Pwstr, nsize: UInt, lpfilename: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_getPrivateProfileSectionNamesW(lpszreturnbuffer?.value?.toCPointer<ByteVar>(), nsize, lpfilename?.value?.toCPointer<ByteVar>())

public actual fun getPrivateProfileSectionW(lpappname: Pcwstr, lpreturnedstring: Pwstr, nsize: UInt, lpfilename: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_getPrivateProfileSectionW(lpappname?.value?.toCPointer<ByteVar>(), lpreturnedstring?.value?.toCPointer<ByteVar>(), nsize, lpfilename?.value?.toCPointer<ByteVar>())

public actual fun getPrivateProfileStringA(lpappname: Pcstr, lpkeyname: Pcstr, lpdefault: Pcstr, lpreturnedstring: Pstr, nsize: UInt, lpfilename: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_getPrivateProfileStringA(lpappname?.value?.toCPointer<ByteVar>(), lpkeyname?.value?.toCPointer<ByteVar>(), lpdefault?.value?.toCPointer<ByteVar>(), lpreturnedstring?.value?.toCPointer<ByteVar>(), nsize, lpfilename?.value?.toCPointer<ByteVar>())

public actual fun getPrivateProfileStringW(lpappname: Pcwstr, lpkeyname: Pcwstr, lpdefault: Pcwstr, lpreturnedstring: Pwstr, nsize: UInt, lpfilename: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_getPrivateProfileStringW(lpappname?.value?.toCPointer<ByteVar>(), lpkeyname?.value?.toCPointer<ByteVar>(), lpdefault?.value?.toCPointer<ByteVar>(), lpreturnedstring?.value?.toCPointer<ByteVar>(), nsize, lpfilename?.value?.toCPointer<ByteVar>())

public actual fun getPrivateProfileStructA(lpszsection: Pcstr, lpszkey: Pcstr, lpstruct: COpaquePointer?, usizestruct: UInt, szfile: Pcstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_getPrivateProfileStructA(lpszsection?.value?.toCPointer<ByteVar>(), lpszkey?.value?.toCPointer<ByteVar>(), lpstruct?.value?.toCPointer<ByteVar>(), usizestruct, szfile?.value?.toCPointer<ByteVar>())

public actual fun getPrivateProfileStructW(lpszsection: Pcwstr, lpszkey: Pcwstr, lpstruct: COpaquePointer?, usizestruct: UInt, szfile: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_getPrivateProfileStructW(lpszsection?.value?.toCPointer<ByteVar>(), lpszkey?.value?.toCPointer<ByteVar>(), lpstruct?.value?.toCPointer<ByteVar>(), usizestruct, szfile?.value?.toCPointer<ByteVar>())

public actual fun getProfileIntA(lpappname: Pcstr, lpkeyname: Pcstr, ndefault: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_getProfileIntA(lpappname?.value?.toCPointer<ByteVar>(), lpkeyname?.value?.toCPointer<ByteVar>(), ndefault)

public actual fun getProfileIntW(lpappname: Pcwstr, lpkeyname: Pcwstr, ndefault: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_getProfileIntW(lpappname?.value?.toCPointer<ByteVar>(), lpkeyname?.value?.toCPointer<ByteVar>(), ndefault)

public actual fun getProfileSectionA(lpappname: Pcstr, lpreturnedstring: Pstr, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_getProfileSectionA(lpappname?.value?.toCPointer<ByteVar>(), lpreturnedstring?.value?.toCPointer<ByteVar>(), nsize)

public actual fun getProfileSectionW(lpappname: Pcwstr, lpreturnedstring: Pwstr, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_getProfileSectionW(lpappname?.value?.toCPointer<ByteVar>(), lpreturnedstring?.value?.toCPointer<ByteVar>(), nsize)

public actual fun getProfileStringA(lpappname: Pcstr, lpkeyname: Pcstr, lpdefault: Pcstr, lpreturnedstring: Pstr, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_getProfileStringA(lpappname?.value?.toCPointer<ByteVar>(), lpkeyname?.value?.toCPointer<ByteVar>(), lpdefault?.value?.toCPointer<ByteVar>(), lpreturnedstring?.value?.toCPointer<ByteVar>(), nsize)

public actual fun getProfileStringW(lpappname: Pcwstr, lpkeyname: Pcwstr, lpdefault: Pcwstr, lpreturnedstring: Pwstr, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_getProfileStringW(lpappname?.value?.toCPointer<ByteVar>(), lpkeyname?.value?.toCPointer<ByteVar>(), lpdefault?.value?.toCPointer<ByteVar>(), lpreturnedstring?.value?.toCPointer<ByteVar>(), nsize)

public actual fun getSystemRegistryQuota(pdwquotaallowed: COpaquePointer?, pdwquotaused: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_getSystemRegistryQuota(pdwquotaallowed?.value?.toCPointer<ByteVar>(), pdwquotaused?.value?.toCPointer<ByteVar>())

public actual fun getThreadEnabledXStateFeatures(): ULong =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_getThreadEnabledXStateFeatures()

public actual fun getUserNameA(lpbuffer: Pstr, pcbbuffer: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_getUserNameA(lpbuffer?.value?.toCPointer<ByteVar>(), pcbbuffer?.value?.toCPointer<ByteVar>())

public actual fun getUserNameW(lpbuffer: Pwstr, pcbbuffer: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_getUserNameW(lpbuffer?.value?.toCPointer<ByteVar>(), pcbbuffer?.value?.toCPointer<ByteVar>())

public actual fun getVersionFromFileA(lpszfilename: Pcstr, pdwmsver: COpaquePointer?, pdwlsver: COpaquePointer?, bversion: Bool): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_getVersionFromFileA(lpszfilename?.value?.toCPointer<ByteVar>(), pdwmsver?.value?.toCPointer<ByteVar>(), pdwlsver?.value?.toCPointer<ByteVar>(), bversion)

public actual fun getVersionFromFileExA(lpszfilename: Pcstr, pdwmsver: COpaquePointer?, pdwlsver: COpaquePointer?, bversion: Bool): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_getVersionFromFileExA(lpszfilename?.value?.toCPointer<ByteVar>(), pdwmsver?.value?.toCPointer<ByteVar>(), pdwlsver?.value?.toCPointer<ByteVar>(), bversion)

public actual fun getVersionFromFileExW(lpszfilename: Pcwstr, pdwmsver: COpaquePointer?, pdwlsver: COpaquePointer?, bversion: Bool): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_getVersionFromFileExW(lpszfilename?.value?.toCPointer<ByteVar>(), pdwmsver?.value?.toCPointer<ByteVar>(), pdwlsver?.value?.toCPointer<ByteVar>(), bversion)

public actual fun getVersionFromFileW(lpszfilename: Pcwstr, pdwmsver: COpaquePointer?, pdwlsver: COpaquePointer?, bversion: Bool): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_getVersionFromFileW(lpszfilename?.value?.toCPointer<ByteVar>(), pdwmsver?.value?.toCPointer<ByteVar>(), pdwlsver?.value?.toCPointer<ByteVar>(), bversion)

public actual fun getWindowRegionData(hwnd: Hwnd, size: UInt, prd: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_getWindowRegionData(hwnd?.value?.toCPointer<ByteVar>(), size, prd?.value?.toCPointer<ByteVar>())

public actual fun globalCompact(dwminfree: UInt): ULong =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_globalCompact(dwminfree)

public actual fun globalFix(hmem: Hglobal) {
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_globalFix(hmem?.value?.toCPointer<ByteVar>())
}

public actual fun globalUnWire(hmem: Hglobal): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_globalUnWire(hmem?.value?.toCPointer<ByteVar>())

public actual fun globalUnfix(hmem: Hglobal) {
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_globalUnfix(hmem?.value?.toCPointer<ByteVar>())
}

public actual fun globalWire(hmem: Hglobal): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_globalWire(hmem?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun iMPGetIMEA(param0: Hwnd, param1: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_iMPGetIMEA(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())

public actual fun iMPGetIMEW(param0: Hwnd, param1: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_iMPGetIMEW(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())

public actual fun iMPQueryIMEA(param0: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_iMPQueryIMEA(param0?.value?.toCPointer<ByteVar>())

public actual fun iMPQueryIMEW(param0: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_iMPQueryIMEW(param0?.value?.toCPointer<ByteVar>())

public actual fun iMPSetIMEA(param0: Hwnd, param1: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_iMPSetIMEA(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())

public actual fun iMPSetIMEW(param0: Hwnd, param1: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_iMPSetIMEW(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())

public actual fun isApiSetImplemented(contract: Pcstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_isApiSetImplemented(contract?.value?.toCPointer<ByteVar>())

public actual fun isBadHugeReadPtr(lp: COpaquePointer?, ucb: ULong): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_isBadHugeReadPtr(lp?.value?.toCPointer<ByteVar>(), ucb)

public actual fun isBadHugeWritePtr(lp: COpaquePointer?, ucb: ULong): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_isBadHugeWritePtr(lp?.value?.toCPointer<ByteVar>(), ucb)

public actual fun isNTAdmin(dwreserved: UInt, lpdwreserved: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_isNTAdmin(dwreserved, lpdwreserved?.value?.toCPointer<ByteVar>())

public actual fun isNativeVhdBoot(nativevhdboot: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_isNativeVhdBoot(nativevhdboot?.value?.toCPointer<ByteVar>())

public actual fun isTokenUntrusted(tokenhandle: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_isTokenUntrusted(tokenhandle?.value?.toCPointer<ByteVar>())

public actual fun launchINFSectionExW(hwnd: Hwnd, hinstance: Hinstance, pszparms: Pcwstr, nshow: Int): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_launchINFSectionExW(hwnd?.value?.toCPointer<ByteVar>(), hinstance?.value?.toCPointer<ByteVar>(), pszparms?.value?.toCPointer<ByteVar>(), nshow)

public actual fun launchINFSectionW(hwndowner: Hwnd, hinstance: Hinstance, pszparams: Pwstr, nshow: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_launchINFSectionW(hwndowner?.value?.toCPointer<ByteVar>(), hinstance?.value?.toCPointer<ByteVar>(), pszparams?.value?.toCPointer<ByteVar>(), nshow)

public actual fun localCompact(uminfree: UInt): ULong =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_localCompact(uminfree)

public actual fun localShrink(hmem: Hlocal, cbnewsize: UInt): ULong =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_localShrink(hmem?.value?.toCPointer<ByteVar>(), cbnewsize)

public actual fun mulDiv(nnumber: Int, nnumerator: Int, ndenominator: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_mulDiv(nnumber, nnumerator, ndenominator)

public actual fun needReboot(dwrebootcheck: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_needReboot(dwrebootcheck)

public actual fun needRebootInit(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_needRebootInit()

public actual fun openINFEngineA(pszinffilename: Pcstr, pszinstallsection: Pcstr, dwflags: UInt, phinf: COpaquePointer?, pvreserved: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_openINFEngineA(pszinffilename?.value?.toCPointer<ByteVar>(), pszinstallsection?.value?.toCPointer<ByteVar>(), dwflags, phinf?.value?.toCPointer<ByteVar>(), pvreserved?.value?.toCPointer<ByteVar>())

public actual fun openINFEngineW(pszinffilename: Pcwstr, pszinstallsection: Pcwstr, dwflags: UInt, phinf: COpaquePointer?, pvreserved: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_openINFEngineW(pszinffilename?.value?.toCPointer<ByteVar>(), pszinstallsection?.value?.toCPointer<ByteVar>(), dwflags, phinf?.value?.toCPointer<ByteVar>(), pvreserved?.value?.toCPointer<ByteVar>())

public actual fun openMutexA(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcstr): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_openMutexA(dwdesiredaccess, binherithandle, lpname?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun openSemaphoreA(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcstr): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_openSemaphoreA(dwdesiredaccess, binherithandle, lpname?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun queryAuxiliaryCounterFrequency(lpauxiliarycounterfrequency: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_queryAuxiliaryCounterFrequency(lpauxiliarycounterfrequency?.value?.toCPointer<ByteVar>())

public actual fun queryIdleProcessorCycleTime(bufferlength: COpaquePointer?, processoridlecycletime: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_queryIdleProcessorCycleTime(bufferlength?.value?.toCPointer<ByteVar>(), processoridlecycletime?.value?.toCPointer<ByteVar>())

public actual fun queryIdleProcessorCycleTimeEx(group: UShort, bufferlength: COpaquePointer?, processoridlecycletime: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_queryIdleProcessorCycleTimeEx(group, bufferlength?.value?.toCPointer<ByteVar>(), processoridlecycletime?.value?.toCPointer<ByteVar>())

public actual fun queryInterruptTime(lpinterrupttime: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_queryInterruptTime(lpinterrupttime?.value?.toCPointer<ByteVar>())
}

public actual fun queryInterruptTimePrecise(lpinterrupttimeprecise: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_queryInterruptTimePrecise(lpinterrupttimeprecise?.value?.toCPointer<ByteVar>())
}

public actual fun queryProcessCycleTime(processhandle: Handle, cycletime: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_queryProcessCycleTime(processhandle?.value?.toCPointer<ByteVar>(), cycletime?.value?.toCPointer<ByteVar>())

public actual fun queryThreadCycleTime(threadhandle: Handle, cycletime: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_queryThreadCycleTime(threadhandle?.value?.toCPointer<ByteVar>(), cycletime?.value?.toCPointer<ByteVar>())

public actual fun queryUnbiasedInterruptTime(unbiasedtime: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_queryUnbiasedInterruptTime(unbiasedtime?.value?.toCPointer<ByteVar>())

public actual fun queryUnbiasedInterruptTimePrecise(lpunbiasedinterrupttimeprecise: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_queryUnbiasedInterruptTimePrecise(lpunbiasedinterrupttimeprecise?.value?.toCPointer<ByteVar>())
}

public actual fun raiseCustomSystemEventTrigger(customsystemeventtriggerconfig: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_raiseCustomSystemEventTrigger(customsystemeventtriggerconfig?.value?.toCPointer<ByteVar>())

public actual fun rebootCheckOnInstallA(hwnd: Hwnd, pszinf: Pcstr, pszsec: Pcstr, dwreserved: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_rebootCheckOnInstallA(hwnd?.value?.toCPointer<ByteVar>(), pszinf?.value?.toCPointer<ByteVar>(), pszsec?.value?.toCPointer<ByteVar>(), dwreserved)

public actual fun rebootCheckOnInstallW(hwnd: Hwnd, pszinf: Pcwstr, pszsec: Pcwstr, dwreserved: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_rebootCheckOnInstallW(hwnd?.value?.toCPointer<ByteVar>(), pszinf?.value?.toCPointer<ByteVar>(), pszsec?.value?.toCPointer<ByteVar>(), dwreserved)

public actual fun recordFeatureError(featureid: UInt, error: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_recordFeatureError(featureid, error?.value?.toCPointer<ByteVar>())
}

public actual fun recordFeatureUsage(featureid: UInt, kind: UInt, addend: UInt, originname: Pcstr) {
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_recordFeatureUsage(featureid, kind, addend, originname?.value?.toCPointer<ByteVar>())
}

public actual fun regInstallA(hmod: Hmodule, pszsection: Pcstr, psttable: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_regInstallA(hmod?.value?.toCPointer<ByteVar>(), pszsection?.value?.toCPointer<ByteVar>(), psttable?.value?.toCPointer<ByteVar>())

public actual fun regInstallW(hmod: Hmodule, pszsection: Pcwstr, psttable: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_regInstallW(hmod?.value?.toCPointer<ByteVar>(), pszsection?.value?.toCPointer<ByteVar>(), psttable?.value?.toCPointer<ByteVar>())

public actual fun regRestoreAllA(hwnd: Hwnd, psztitlestring: Pcstr, hkbckupkey: Hkey): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_regRestoreAllA(hwnd?.value?.toCPointer<ByteVar>(), psztitlestring?.value?.toCPointer<ByteVar>(), hkbckupkey?.value?.toCPointer<ByteVar>())

public actual fun regRestoreAllW(hwnd: Hwnd, psztitlestring: Pcwstr, hkbckupkey: Hkey): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_regRestoreAllW(hwnd?.value?.toCPointer<ByteVar>(), psztitlestring?.value?.toCPointer<ByteVar>(), hkbckupkey?.value?.toCPointer<ByteVar>())

public actual fun regSaveRestoreA(hwnd: Hwnd, psztitlestring: Pcstr, hkbckupkey: Hkey, pcszrootkey: Pcstr, pcszsubkey: Pcstr, pcszvaluename: Pcstr, dwflags: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_regSaveRestoreA(hwnd?.value?.toCPointer<ByteVar>(), psztitlestring?.value?.toCPointer<ByteVar>(), hkbckupkey?.value?.toCPointer<ByteVar>(), pcszrootkey?.value?.toCPointer<ByteVar>(), pcszsubkey?.value?.toCPointer<ByteVar>(), pcszvaluename?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun regSaveRestoreOnINFA(hwnd: Hwnd, psztitle: Pcstr, pszinf: Pcstr, pszsection: Pcstr, hhklmbackkey: Hkey, hhkcubackkey: Hkey, dwflags: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_regSaveRestoreOnINFA(hwnd?.value?.toCPointer<ByteVar>(), psztitle?.value?.toCPointer<ByteVar>(), pszinf?.value?.toCPointer<ByteVar>(), pszsection?.value?.toCPointer<ByteVar>(), hhklmbackkey?.value?.toCPointer<ByteVar>(), hhkcubackkey?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun regSaveRestoreOnINFW(hwnd: Hwnd, psztitle: Pcwstr, pszinf: Pcwstr, pszsection: Pcwstr, hhklmbackkey: Hkey, hhkcubackkey: Hkey, dwflags: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_regSaveRestoreOnINFW(hwnd?.value?.toCPointer<ByteVar>(), psztitle?.value?.toCPointer<ByteVar>(), pszinf?.value?.toCPointer<ByteVar>(), pszsection?.value?.toCPointer<ByteVar>(), hhklmbackkey?.value?.toCPointer<ByteVar>(), hhkcubackkey?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun regSaveRestoreW(hwnd: Hwnd, psztitlestring: Pcwstr, hkbckupkey: Hkey, pcszrootkey: Pcwstr, pcszsubkey: Pcwstr, pcszvaluename: Pcwstr, dwflags: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_regSaveRestoreW(hwnd?.value?.toCPointer<ByteVar>(), psztitlestring?.value?.toCPointer<ByteVar>(), hkbckupkey?.value?.toCPointer<ByteVar>(), pcszrootkey?.value?.toCPointer<ByteVar>(), pcszsubkey?.value?.toCPointer<ByteVar>(), pcszvaluename?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun replacePartitionUnit(targetpartition: Pcwstr, sparepartition: Pcwstr, flags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_replacePartitionUnit(targetpartition?.value?.toCPointer<ByteVar>(), sparepartition?.value?.toCPointer<ByteVar>(), flags)

public actual fun requestDeviceWakeup(hdevice: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_requestDeviceWakeup(hdevice?.value?.toCPointer<ByteVar>())

public actual fun rtlAnsiStringToUnicodeString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?, allocatedestinationstring: Boolean): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_rtlAnsiStringToUnicodeString(destinationstring?.value?.toCPointer<ByteVar>(), sourcestring?.value?.toCPointer<ByteVar>(), allocatedestinationstring)

public actual fun rtlCharToInteger(string: COpaquePointer?, base: UInt, value: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_rtlCharToInteger(string?.value?.toCPointer<ByteVar>(), base, value?.value?.toCPointer<ByteVar>())

public actual fun rtlFreeAnsiString(ansistring: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_rtlFreeAnsiString(ansistring?.value?.toCPointer<ByteVar>())
}

public actual fun rtlFreeOemString(oemstring: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_rtlFreeOemString(oemstring?.value?.toCPointer<ByteVar>())
}

public actual fun rtlFreeUnicodeString(unicodestring: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_rtlFreeUnicodeString(unicodestring?.value?.toCPointer<ByteVar>())
}

public actual fun rtlGetReturnAddressHijackTarget(): ULong =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_rtlGetReturnAddressHijackTarget()

public actual fun rtlInitAnsiString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_rtlInitAnsiString(destinationstring?.value?.toCPointer<ByteVar>(), sourcestring?.value?.toCPointer<ByteVar>())
}

public actual fun rtlInitAnsiStringEx(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_rtlInitAnsiStringEx(destinationstring?.value?.toCPointer<ByteVar>(), sourcestring?.value?.toCPointer<ByteVar>())

public actual fun rtlInitString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_rtlInitString(destinationstring?.value?.toCPointer<ByteVar>(), sourcestring?.value?.toCPointer<ByteVar>())
}

public actual fun rtlInitStringEx(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_rtlInitStringEx(destinationstring?.value?.toCPointer<ByteVar>(), sourcestring?.value?.toCPointer<ByteVar>())

public actual fun rtlInitUnicodeString(destinationstring: COpaquePointer?, sourcestring: Pcwstr) {
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_rtlInitUnicodeString(destinationstring?.value?.toCPointer<ByteVar>(), sourcestring?.value?.toCPointer<ByteVar>())
}

public actual fun rtlIsNameLegalDOS8Dot3(name: COpaquePointer?, oemname: COpaquePointer?, namecontainsspaces: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_rtlIsNameLegalDOS8Dot3(name?.value?.toCPointer<ByteVar>(), oemname?.value?.toCPointer<ByteVar>(), namecontainsspaces?.value?.toCPointer<ByteVar>())

public actual fun rtlLocalTimeToSystemTime(localtime: COpaquePointer?, systemtime: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_rtlLocalTimeToSystemTime(localtime?.value?.toCPointer<ByteVar>(), systemtime?.value?.toCPointer<ByteVar>())

public actual fun rtlRaiseCustomSystemEventTrigger(triggerconfig: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_rtlRaiseCustomSystemEventTrigger(triggerconfig?.value?.toCPointer<ByteVar>())

public actual fun rtlTimeToSecondsSince1970(time: COpaquePointer?, elapsedseconds: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_rtlTimeToSecondsSince1970(time?.value?.toCPointer<ByteVar>(), elapsedseconds?.value?.toCPointer<ByteVar>())

public actual fun rtlUnicodeStringToAnsiString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?, allocatedestinationstring: Boolean): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_rtlUnicodeStringToAnsiString(destinationstring?.value?.toCPointer<ByteVar>(), sourcestring?.value?.toCPointer<ByteVar>(), allocatedestinationstring)

public actual fun rtlUnicodeStringToOemString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?, allocatedestinationstring: Boolean): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_rtlUnicodeStringToOemString(destinationstring?.value?.toCPointer<ByteVar>(), sourcestring?.value?.toCPointer<ByteVar>(), allocatedestinationstring)

public actual fun rtlUnicodeToMultiByteSize(bytesinmultibytestring: COpaquePointer?, unicodestring: Pcwstr, bytesinunicodestring: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_rtlUnicodeToMultiByteSize(bytesinmultibytestring?.value?.toCPointer<ByteVar>(), unicodestring?.value?.toCPointer<ByteVar>(), bytesinunicodestring)

public actual fun rtlUniform(seed: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_rtlUniform(seed?.value?.toCPointer<ByteVar>())

public actual fun runSetupCommandA(hwnd: Hwnd, szcmdname: Pcstr, szinfsection: Pcstr, szdir: Pcstr, lpsztitle: Pcstr, phexe: COpaquePointer?, dwflags: UInt, pvreserved: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_runSetupCommandA(hwnd?.value?.toCPointer<ByteVar>(), szcmdname?.value?.toCPointer<ByteVar>(), szinfsection?.value?.toCPointer<ByteVar>(), szdir?.value?.toCPointer<ByteVar>(), lpsztitle?.value?.toCPointer<ByteVar>(), phexe?.value?.toCPointer<ByteVar>(), dwflags, pvreserved?.value?.toCPointer<ByteVar>())

public actual fun runSetupCommandW(hwnd: Hwnd, szcmdname: Pcwstr, szinfsection: Pcwstr, szdir: Pcwstr, lpsztitle: Pcwstr, phexe: COpaquePointer?, dwflags: UInt, pvreserved: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_runSetupCommandW(hwnd?.value?.toCPointer<ByteVar>(), szcmdname?.value?.toCPointer<ByteVar>(), szinfsection?.value?.toCPointer<ByteVar>(), szdir?.value?.toCPointer<ByteVar>(), lpsztitle?.value?.toCPointer<ByteVar>(), phexe?.value?.toCPointer<ByteVar>(), dwflags, pvreserved?.value?.toCPointer<ByteVar>())

public actual fun sendIMEMessageExA(param0: Hwnd, param1: Lparam): Lresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_sendIMEMessageExA(param0?.value?.toCPointer<ByteVar>(), param1)

public actual fun sendIMEMessageExW(param0: Hwnd, param1: Lparam): Lresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_sendIMEMessageExW(param0?.value?.toCPointer<ByteVar>(), param1)

public actual fun setEnvironmentStringsA(newenvironment: Pcstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_setEnvironmentStringsA(newenvironment?.value?.toCPointer<ByteVar>())

public actual fun setFirmwareEnvironmentVariableA(lpname: Pcstr, lpguid: Pcstr, pvalue: COpaquePointer?, nsize: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_setFirmwareEnvironmentVariableA(lpname?.value?.toCPointer<ByteVar>(), lpguid?.value?.toCPointer<ByteVar>(), pvalue?.value?.toCPointer<ByteVar>(), nsize)

public actual fun setFirmwareEnvironmentVariableExA(lpname: Pcstr, lpguid: Pcstr, pvalue: COpaquePointer?, nsize: UInt, dwattributes: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_setFirmwareEnvironmentVariableExA(lpname?.value?.toCPointer<ByteVar>(), lpguid?.value?.toCPointer<ByteVar>(), pvalue?.value?.toCPointer<ByteVar>(), nsize, dwattributes)

public actual fun setFirmwareEnvironmentVariableExW(lpname: Pcwstr, lpguid: Pcwstr, pvalue: COpaquePointer?, nsize: UInt, dwattributes: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_setFirmwareEnvironmentVariableExW(lpname?.value?.toCPointer<ByteVar>(), lpguid?.value?.toCPointer<ByteVar>(), pvalue?.value?.toCPointer<ByteVar>(), nsize, dwattributes)

public actual fun setFirmwareEnvironmentVariableW(lpname: Pcwstr, lpguid: Pcwstr, pvalue: COpaquePointer?, nsize: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_setFirmwareEnvironmentVariableW(lpname?.value?.toCPointer<ByteVar>(), lpguid?.value?.toCPointer<ByteVar>(), pvalue?.value?.toCPointer<ByteVar>(), nsize)

public actual fun setHandleCount(unumber: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_setHandleCount(unumber)

public actual fun setMessageWaitingIndicator(hmsgindicator: Handle, ulmsgcount: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_setMessageWaitingIndicator(hmsgindicator?.value?.toCPointer<ByteVar>(), ulmsgcount)

public actual fun setPerUserSecValuesA(pperuser: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_setPerUserSecValuesA(pperuser?.value?.toCPointer<ByteVar>())

public actual fun setPerUserSecValuesW(pperuser: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_setPerUserSecValuesW(pperuser?.value?.toCPointer<ByteVar>())

public actual fun subscribeFeatureStateChangeNotification(subscription: COpaquePointer?, callback: PfeatureStateChangeCallback, context: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_subscribeFeatureStateChangeNotification(subscription?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())
}

public actual fun translateInfStringA(pszinffilename: Pcstr, pszinstallsection: Pcstr, psztranslatesection: Pcstr, psztranslatekey: Pcstr, pszbuffer: Pstr, cchbuffer: UInt, pdwrequiredsize: COpaquePointer?, pvreserved: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_translateInfStringA(pszinffilename?.value?.toCPointer<ByteVar>(), pszinstallsection?.value?.toCPointer<ByteVar>(), psztranslatesection?.value?.toCPointer<ByteVar>(), psztranslatekey?.value?.toCPointer<ByteVar>(), pszbuffer?.value?.toCPointer<ByteVar>(), cchbuffer, pdwrequiredsize?.value?.toCPointer<ByteVar>(), pvreserved?.value?.toCPointer<ByteVar>())

public actual fun translateInfStringExA(hinf: COpaquePointer?, pszinffilename: Pcstr, psztranslatesection: Pcstr, psztranslatekey: Pcstr, pszbuffer: Pstr, dwbuffersize: UInt, pdwrequiredsize: COpaquePointer?, pvreserved: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_translateInfStringExA(hinf?.value?.toCPointer<ByteVar>(), pszinffilename?.value?.toCPointer<ByteVar>(), psztranslatesection?.value?.toCPointer<ByteVar>(), psztranslatekey?.value?.toCPointer<ByteVar>(), pszbuffer?.value?.toCPointer<ByteVar>(), dwbuffersize, pdwrequiredsize?.value?.toCPointer<ByteVar>(), pvreserved?.value?.toCPointer<ByteVar>())

public actual fun translateInfStringExW(hinf: COpaquePointer?, pszinffilename: Pcwstr, psztranslatesection: Pcwstr, psztranslatekey: Pcwstr, pszbuffer: Pwstr, dwbuffersize: UInt, pdwrequiredsize: COpaquePointer?, pvreserved: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_translateInfStringExW(hinf?.value?.toCPointer<ByteVar>(), pszinffilename?.value?.toCPointer<ByteVar>(), psztranslatesection?.value?.toCPointer<ByteVar>(), psztranslatekey?.value?.toCPointer<ByteVar>(), pszbuffer?.value?.toCPointer<ByteVar>(), dwbuffersize, pdwrequiredsize?.value?.toCPointer<ByteVar>(), pvreserved?.value?.toCPointer<ByteVar>())

public actual fun translateInfStringW(pszinffilename: Pcwstr, pszinstallsection: Pcwstr, psztranslatesection: Pcwstr, psztranslatekey: Pcwstr, pszbuffer: Pwstr, cchbuffer: UInt, pdwrequiredsize: COpaquePointer?, pvreserved: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_translateInfStringW(pszinffilename?.value?.toCPointer<ByteVar>(), pszinstallsection?.value?.toCPointer<ByteVar>(), psztranslatesection?.value?.toCPointer<ByteVar>(), psztranslatekey?.value?.toCPointer<ByteVar>(), pszbuffer?.value?.toCPointer<ByteVar>(), cchbuffer, pdwrequiredsize?.value?.toCPointer<ByteVar>(), pvreserved?.value?.toCPointer<ByteVar>())

public actual fun unsubscribeFeatureStateChangeNotification(subscription: FeatureStateChangeSubscription) {
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_unsubscribeFeatureStateChangeNotification(subscription?.value?.toCPointer<ByteVar>())
}

public actual fun userInstStubWrapperA(hwnd: Hwnd, hinstance: Hinstance, pszparms: Pcstr, nshow: Int): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_userInstStubWrapperA(hwnd?.value?.toCPointer<ByteVar>(), hinstance?.value?.toCPointer<ByteVar>(), pszparms?.value?.toCPointer<ByteVar>(), nshow)

public actual fun userInstStubWrapperW(hwnd: Hwnd, hinstance: Hinstance, pszparms: Pcwstr, nshow: Int): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_userInstStubWrapperW(hwnd?.value?.toCPointer<ByteVar>(), hinstance?.value?.toCPointer<ByteVar>(), pszparms?.value?.toCPointer<ByteVar>(), nshow)

public actual fun userUnInstStubWrapperA(hwnd: Hwnd, hinstance: Hinstance, pszparms: Pcstr, nshow: Int): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_userUnInstStubWrapperA(hwnd?.value?.toCPointer<ByteVar>(), hinstance?.value?.toCPointer<ByteVar>(), pszparms?.value?.toCPointer<ByteVar>(), nshow)

public actual fun userUnInstStubWrapperW(hwnd: Hwnd, hinstance: Hinstance, pszparms: Pcwstr, nshow: Int): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_userUnInstStubWrapperW(hwnd?.value?.toCPointer<ByteVar>(), hinstance?.value?.toCPointer<ByteVar>(), pszparms?.value?.toCPointer<ByteVar>(), nshow)

public actual fun wINNLSEnableIME(param0: Hwnd, param1: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_wINNLSEnableIME(param0?.value?.toCPointer<ByteVar>(), param1)

public actual fun wINNLSGetEnableStatus(param0: Hwnd): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_wINNLSGetEnableStatus(param0?.value?.toCPointer<ByteVar>())

public actual fun wINNLSGetIMEHotkey(param0: Hwnd): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_wINNLSGetIMEHotkey(param0?.value?.toCPointer<ByteVar>())

public actual fun winWatchClose(hww: Hwinwatch) {
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_winWatchClose(hww?.value?.toCPointer<ByteVar>())
}

public actual fun winWatchDidStatusChange(hww: Hwinwatch): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_winWatchDidStatusChange(hww?.value?.toCPointer<ByteVar>())

public actual fun winWatchGetClipList(hww: Hwinwatch, prc: COpaquePointer?, size: UInt, prd: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_winWatchGetClipList(hww?.value?.toCPointer<ByteVar>(), prc?.value?.toCPointer<ByteVar>(), size, prd?.value?.toCPointer<ByteVar>())

public actual fun winWatchNotify(hww: Hwinwatch, notifycallback: Winwatchnotifyproc, notifyparam: Lparam): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_winWatchNotify(hww?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), notifyparam)

public actual fun winWatchOpen(hwnd: Hwnd): Hwinwatch =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_winWatchOpen(hwnd?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun wldpCanExecuteBuffer(host: COpaquePointer?, options: WldpExecutionEvaluationOptions, buffer: COpaquePointer?, buffersize: UInt, auditinfo: Pcwstr, result: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_wldpCanExecuteBuffer(host?.value?.toCPointer<ByteVar>(), options, buffer?.value?.toCPointer<ByteVar>(), buffersize, auditinfo?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>())

public actual fun wldpCanExecuteFile(host: COpaquePointer?, options: WldpExecutionEvaluationOptions, filehandle: Handle, auditinfo: Pcwstr, result: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_wldpCanExecuteFile(host?.value?.toCPointer<ByteVar>(), options, filehandle?.value?.toCPointer<ByteVar>(), auditinfo?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>())

public actual fun wldpCanExecuteStream(host: COpaquePointer?, options: WldpExecutionEvaluationOptions, stream: COpaquePointer?, auditinfo: Pcwstr, result: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_wldpCanExecuteStream(host?.value?.toCPointer<ByteVar>(), options, stream?.value?.toCPointer<ByteVar>(), auditinfo?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>())

public actual fun wldpGetLockdownPolicy(hostinformation: COpaquePointer?, lockdownstate: COpaquePointer?, lockdownflags: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_wldpGetLockdownPolicy(hostinformation?.value?.toCPointer<ByteVar>(), lockdownstate?.value?.toCPointer<ByteVar>(), lockdownflags)

public actual fun wldpIsClassInApprovedList(classid: COpaquePointer?, hostinformation: COpaquePointer?, isapproved: COpaquePointer?, optionalflags: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_wldpIsClassInApprovedList(classid?.value?.toCPointer<ByteVar>(), hostinformation?.value?.toCPointer<ByteVar>(), isapproved?.value?.toCPointer<ByteVar>(), optionalflags)

public actual fun wldpIsDynamicCodePolicyEnabled(isenabled: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_wldpIsDynamicCodePolicyEnabled(isenabled?.value?.toCPointer<ByteVar>())

public actual fun wldpQueryDeviceSecurityInformation(information: COpaquePointer?, informationlength: UInt, returnlength: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_wldpQueryDeviceSecurityInformation(information?.value?.toCPointer<ByteVar>(), informationlength, returnlength?.value?.toCPointer<ByteVar>())

public actual fun wldpQueryDynamicCodeTrust(filehandle: Handle, baseimage: COpaquePointer?, imagesize: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_wldpQueryDynamicCodeTrust(filehandle?.value?.toCPointer<ByteVar>(), baseimage?.value?.toCPointer<ByteVar>(), imagesize)

public actual fun wldpSetDynamicCodeTrust(filehandle: Handle): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_wldpSetDynamicCodeTrust(filehandle?.value?.toCPointer<ByteVar>())

public actual fun writePrivateProfileSectionA(lpappname: Pcstr, lpstring: Pcstr, lpfilename: Pcstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_writePrivateProfileSectionA(lpappname?.value?.toCPointer<ByteVar>(), lpstring?.value?.toCPointer<ByteVar>(), lpfilename?.value?.toCPointer<ByteVar>())

public actual fun writePrivateProfileSectionW(lpappname: Pcwstr, lpstring: Pcwstr, lpfilename: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_writePrivateProfileSectionW(lpappname?.value?.toCPointer<ByteVar>(), lpstring?.value?.toCPointer<ByteVar>(), lpfilename?.value?.toCPointer<ByteVar>())

public actual fun writePrivateProfileStringA(lpappname: Pcstr, lpkeyname: Pcstr, lpstring: Pcstr, lpfilename: Pcstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_writePrivateProfileStringA(lpappname?.value?.toCPointer<ByteVar>(), lpkeyname?.value?.toCPointer<ByteVar>(), lpstring?.value?.toCPointer<ByteVar>(), lpfilename?.value?.toCPointer<ByteVar>())

public actual fun writePrivateProfileStringW(lpappname: Pcwstr, lpkeyname: Pcwstr, lpstring: Pcwstr, lpfilename: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_writePrivateProfileStringW(lpappname?.value?.toCPointer<ByteVar>(), lpkeyname?.value?.toCPointer<ByteVar>(), lpstring?.value?.toCPointer<ByteVar>(), lpfilename?.value?.toCPointer<ByteVar>())

public actual fun writePrivateProfileStructA(lpszsection: Pcstr, lpszkey: Pcstr, lpstruct: COpaquePointer?, usizestruct: UInt, szfile: Pcstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_writePrivateProfileStructA(lpszsection?.value?.toCPointer<ByteVar>(), lpszkey?.value?.toCPointer<ByteVar>(), lpstruct?.value?.toCPointer<ByteVar>(), usizestruct, szfile?.value?.toCPointer<ByteVar>())

public actual fun writePrivateProfileStructW(lpszsection: Pcwstr, lpszkey: Pcwstr, lpstruct: COpaquePointer?, usizestruct: UInt, szfile: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_writePrivateProfileStructW(lpszsection?.value?.toCPointer<ByteVar>(), lpszkey?.value?.toCPointer<ByteVar>(), lpstruct?.value?.toCPointer<ByteVar>(), usizestruct, szfile?.value?.toCPointer<ByteVar>())

public actual fun writeProfileSectionA(lpappname: Pcstr, lpstring: Pcstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_writeProfileSectionA(lpappname?.value?.toCPointer<ByteVar>(), lpstring?.value?.toCPointer<ByteVar>())

public actual fun writeProfileSectionW(lpappname: Pcwstr, lpstring: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_writeProfileSectionW(lpappname?.value?.toCPointer<ByteVar>(), lpstring?.value?.toCPointer<ByteVar>())

public actual fun writeProfileStringA(lpappname: Pcstr, lpkeyname: Pcstr, lpstring: Pcstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_writeProfileStringA(lpappname?.value?.toCPointer<ByteVar>(), lpkeyname?.value?.toCPointer<ByteVar>(), lpstring?.value?.toCPointer<ByteVar>())

public actual fun writeProfileStringW(lpappname: Pcwstr, lpkeyname: Pcwstr, lpstring: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_writeProfileStringW(lpappname?.value?.toCPointer<ByteVar>(), lpkeyname?.value?.toCPointer<ByteVar>(), lpstring?.value?.toCPointer<ByteVar>())

public actual fun hread(hfile: Int, lpbuffer: COpaquePointer?, lbytes: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_hread(hfile, lpbuffer?.value?.toCPointer<ByteVar>(), lbytes)

public actual fun hwrite(hfile: Int, lpbuffer: Pcstr, lbytes: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_hwrite(hfile, lpbuffer?.value?.toCPointer<ByteVar>(), lbytes)

public actual fun lclose(hfile: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_lclose(hfile)

public actual fun lcreat(lppathname: Pcstr, iattribute: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_lcreat(lppathname?.value?.toCPointer<ByteVar>(), iattribute)

public actual fun llseek(hfile: Int, loffset: Int, iorigin: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_llseek(hfile, loffset, iorigin)

public actual fun lopen(lppathname: Pcstr, ireadwrite: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_lopen(lppathname?.value?.toCPointer<ByteVar>(), ireadwrite)

public actual fun lread(hfile: Int, lpbuffer: COpaquePointer?, ubytes: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_lread(hfile, lpbuffer?.value?.toCPointer<ByteVar>(), ubytes)

public actual fun lwrite(hfile: Int, lpbuffer: Pcstr, ubytes: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_lwrite(hfile, lpbuffer?.value?.toCPointer<ByteVar>(), ubytes)

public actual fun uawLstrcmpW(string1: COpaquePointer?, string2: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_uawLstrcmpW(string1?.value?.toCPointer<ByteVar>(), string2?.value?.toCPointer<ByteVar>())

public actual fun uawLstrcmpiW(string1: COpaquePointer?, string2: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_uawLstrcmpiW(string1?.value?.toCPointer<ByteVar>(), string2?.value?.toCPointer<ByteVar>())

public actual fun uawLstrlenW(string: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_uawLstrlenW(string?.value?.toCPointer<ByteVar>())

public actual fun uawWcschr(string: COpaquePointer?, character: UShort): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_uawWcschr(string?.value?.toCPointer<ByteVar>(), character)?.let { COpaquePointer(it.toLong()) }

public actual fun uawWcscpy(destination: COpaquePointer?, source: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_uawWcscpy(destination?.value?.toCPointer<ByteVar>(), source?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uawWcsicmp(string1: COpaquePointer?, string2: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_uawWcsicmp(string1?.value?.toCPointer<ByteVar>(), string2?.value?.toCPointer<ByteVar>())

public actual fun uawWcslen(string: COpaquePointer?): ULong =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_uawWcslen(string?.value?.toCPointer<ByteVar>())

public actual fun uawWcsrchr(string: COpaquePointer?, character: UShort): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.cinterop.windowssys_windows_win32_system_windowsprogramming_uawWcsrchr(string?.value?.toCPointer<ByteVar>(), character)?.let { COpaquePointer(it.toLong()) }
