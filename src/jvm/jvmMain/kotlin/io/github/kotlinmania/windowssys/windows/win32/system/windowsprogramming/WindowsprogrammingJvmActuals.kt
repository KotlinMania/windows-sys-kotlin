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

private object WindowsWin32SystemWindowsprogrammingJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_addDelBackupEntryA(lpcszfilelist: Long, lpcszbackupdir: Long, lpcszbasename: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_addDelBackupEntryW(lpcszfilelist: Long, lpcszbackupdir: Long, lpcszbasename: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_advInstallFileA(hwnd: Long, lpszsourcedir: Long, lpszsourcefile: Long, lpszdestdir: Long, lpszdestfile: Long, dwflags: Int, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_advInstallFileW(hwnd: Long, lpszsourcedir: Long, lpszsourcefile: Long, lpszdestdir: Long, lpszdestfile: Long, dwflags: Int, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_apphelpCheckShellObject(objectclsid: Long, bshimifnecessary: Int, pullflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_cancelDeviceWakeupRequest(hdevice: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_closeINFEngine(hinf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_convertAuxiliaryCounterToPerformanceCounter(ullauxiliarycountervalue: Long, lpperformancecountervalue: Long, lpconversionerror: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_convertPerformanceCounterToAuxiliaryCounter(ullperformancecountervalue: Long, lpauxiliarycountervalue: Long, lpconversionerror: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_dCIBeginAccess(pdci: Long, x: Int, y: Int, dx: Int, dy: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_dCICloseProvider(hdc: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_dCICreateOffscreen(hdc: Long, dwcompression: Int, dwredmask: Int, dwgreenmask: Int, dwbluemask: Int, dwwidth: Int, dwheight: Int, dwdcicaps: Int, dwbitcount: Int, lplpsurface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_dCICreateOverlay(hdc: Long, lpoffscreensurf: Long, lplpsurface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_dCICreatePrimary(hdc: Long, lplpsurface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_dCIDestroy(pdci: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_dCIDraw(pdci: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_dCIEndAccess(pdci: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_dCIEnum(hdc: Long, lprdst: Long, lprsrc: Long, lpfncallback: Long, lpcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_dCIOpenProvider(): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_dCISetClipList(pdci: Long, prd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_dCISetDestination(pdci: Long, dst: Long, src: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_dCISetSrcDestClip(pdci: Long, srcrc: Long, destrc: Long, prd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_delNodeA(pszfileordirname: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_delNodeRunDLL32W(hwnd: Long, hinstance: Long, pszparms: Long, nshow: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_delNodeW(pszfileordirname: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_dnsHostnameToComputerNameA(hostname: Long, computername: Long, nsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_dnsHostnameToComputerNameW(hostname: Long, computername: Long, nsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_dosDateTimeToFileTime(wfatdate: Short, wfattime: Short, lpfiletime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_enableProcessOptionalXStateFeatures(features: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_executeCabA(hwnd: Long, pcab: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_executeCabW(hwnd: Long, pcab: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_extractFilesA(pszcabname: Long, pszexpanddir: Long, dwflags: Int, pszfilelist: Long, lpreserved: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_extractFilesW(pszcabname: Long, pszexpanddir: Long, dwflags: Int, pszfilelist: Long, lpreserved: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_fileSaveMarkNotExistA(lpfilelist: Long, lpdir: Long, lpbasename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_fileSaveMarkNotExistW(lpfilelist: Long, lpdir: Long, lpbasename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_fileSaveRestoreOnINFA(hwnd: Long, psztitle: Long, pszinf: Long, pszsection: Long, pszbackupdir: Long, pszbasebackupfile: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_fileSaveRestoreOnINFW(hwnd: Long, psztitle: Long, pszinf: Long, pszsection: Long, pszbackupdir: Long, pszbasebackupfile: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_fileSaveRestoreW(hdlg: Long, lpfilelist: Long, lpdir: Long, lpbasename: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_fileTimeToDosDateTime(lpfiletime: Long, lpfatdate: Long, lpfattime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_gdiEntry13(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_getComputerNameA(lpbuffer: Long, nsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_getComputerNameW(lpbuffer: Long, nsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_getCurrentHwProfileA(lphwprofileinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_getCurrentHwProfileW(lphwprofileinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_getDCRegionData(hdc: Long, size: Int, prd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_getFeatureEnabledState(featureid: Int, changetime: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_getFeatureVariant(featureid: Int, changetime: Int, payloadid: Long, hasnotification: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_getFirmwareEnvironmentVariableA(lpname: Long, lpguid: Long, pbuffer: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_getFirmwareEnvironmentVariableExA(lpname: Long, lpguid: Long, pbuffer: Long, nsize: Int, pdwattribubutes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_getFirmwareEnvironmentVariableExW(lpname: Long, lpguid: Long, pbuffer: Long, nsize: Int, pdwattribubutes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_getFirmwareEnvironmentVariableW(lpname: Long, lpguid: Long, pbuffer: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_getPrivateProfileIntA(lpappname: Long, lpkeyname: Long, ndefault: Int, lpfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_getPrivateProfileIntW(lpappname: Long, lpkeyname: Long, ndefault: Int, lpfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_getPrivateProfileSectionA(lpappname: Long, lpreturnedstring: Long, nsize: Int, lpfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_getPrivateProfileSectionNamesA(lpszreturnbuffer: Long, nsize: Int, lpfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_getPrivateProfileSectionNamesW(lpszreturnbuffer: Long, nsize: Int, lpfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_getPrivateProfileSectionW(lpappname: Long, lpreturnedstring: Long, nsize: Int, lpfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_getPrivateProfileStringA(lpappname: Long, lpkeyname: Long, lpdefault: Long, lpreturnedstring: Long, nsize: Int, lpfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_getPrivateProfileStringW(lpappname: Long, lpkeyname: Long, lpdefault: Long, lpreturnedstring: Long, nsize: Int, lpfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_getPrivateProfileStructA(lpszsection: Long, lpszkey: Long, lpstruct: Long, usizestruct: Int, szfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_getPrivateProfileStructW(lpszsection: Long, lpszkey: Long, lpstruct: Long, usizestruct: Int, szfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_getProfileIntA(lpappname: Long, lpkeyname: Long, ndefault: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_getProfileIntW(lpappname: Long, lpkeyname: Long, ndefault: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_getProfileSectionA(lpappname: Long, lpreturnedstring: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_getProfileSectionW(lpappname: Long, lpreturnedstring: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_getProfileStringA(lpappname: Long, lpkeyname: Long, lpdefault: Long, lpreturnedstring: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_getProfileStringW(lpappname: Long, lpkeyname: Long, lpdefault: Long, lpreturnedstring: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_getSystemRegistryQuota(pdwquotaallowed: Long, pdwquotaused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_getThreadEnabledXStateFeatures(): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_getUserNameA(lpbuffer: Long, pcbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_getUserNameW(lpbuffer: Long, pcbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_getVersionFromFileA(lpszfilename: Long, pdwmsver: Long, pdwlsver: Long, bversion: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_getVersionFromFileExA(lpszfilename: Long, pdwmsver: Long, pdwlsver: Long, bversion: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_getVersionFromFileExW(lpszfilename: Long, pdwmsver: Long, pdwlsver: Long, bversion: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_getVersionFromFileW(lpszfilename: Long, pdwmsver: Long, pdwlsver: Long, bversion: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_getWindowRegionData(hwnd: Long, size: Int, prd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_globalCompact(dwminfree: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_globalFix(hmem: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_globalUnWire(hmem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_globalUnfix(hmem: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_globalWire(hmem: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_iMPGetIMEA(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_iMPGetIMEW(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_iMPQueryIMEA(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_iMPQueryIMEW(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_iMPSetIMEA(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_iMPSetIMEW(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_isApiSetImplemented(contract: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_isBadHugeReadPtr(lp: Long, ucb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_isBadHugeWritePtr(lp: Long, ucb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_isNTAdmin(dwreserved: Int, lpdwreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_isNativeVhdBoot(nativevhdboot: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_isTokenUntrusted(tokenhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_launchINFSectionExW(hwnd: Long, hinstance: Long, pszparms: Long, nshow: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_launchINFSectionW(hwndowner: Long, hinstance: Long, pszparams: Long, nshow: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_localCompact(uminfree: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_localShrink(hmem: Long, cbnewsize: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_mulDiv(nnumber: Int, nnumerator: Int, ndenominator: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_needReboot(dwrebootcheck: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_needRebootInit(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_openINFEngineA(pszinffilename: Long, pszinstallsection: Long, dwflags: Int, phinf: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_openINFEngineW(pszinffilename: Long, pszinstallsection: Long, dwflags: Int, phinf: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_openMutexA(dwdesiredaccess: Int, binherithandle: Int, lpname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_openSemaphoreA(dwdesiredaccess: Int, binherithandle: Int, lpname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_queryAuxiliaryCounterFrequency(lpauxiliarycounterfrequency: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_queryIdleProcessorCycleTime(bufferlength: Long, processoridlecycletime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_queryIdleProcessorCycleTimeEx(group: Short, bufferlength: Long, processoridlecycletime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_queryInterruptTime(lpinterrupttime: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_queryInterruptTimePrecise(lpinterrupttimeprecise: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_queryProcessCycleTime(processhandle: Long, cycletime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_queryThreadCycleTime(threadhandle: Long, cycletime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_queryUnbiasedInterruptTime(unbiasedtime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_queryUnbiasedInterruptTimePrecise(lpunbiasedinterrupttimeprecise: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_raiseCustomSystemEventTrigger(customsystemeventtriggerconfig: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_rebootCheckOnInstallA(hwnd: Long, pszinf: Long, pszsec: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_rebootCheckOnInstallW(hwnd: Long, pszinf: Long, pszsec: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_recordFeatureError(featureid: Int, error: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_recordFeatureUsage(featureid: Int, kind: Int, addend: Int, originname: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_regInstallA(hmod: Long, pszsection: Long, psttable: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_regInstallW(hmod: Long, pszsection: Long, psttable: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_regRestoreAllA(hwnd: Long, psztitlestring: Long, hkbckupkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_regRestoreAllW(hwnd: Long, psztitlestring: Long, hkbckupkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_regSaveRestoreA(hwnd: Long, psztitlestring: Long, hkbckupkey: Long, pcszrootkey: Long, pcszsubkey: Long, pcszvaluename: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_regSaveRestoreOnINFA(hwnd: Long, psztitle: Long, pszinf: Long, pszsection: Long, hhklmbackkey: Long, hhkcubackkey: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_regSaveRestoreOnINFW(hwnd: Long, psztitle: Long, pszinf: Long, pszsection: Long, hhklmbackkey: Long, hhkcubackkey: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_regSaveRestoreW(hwnd: Long, psztitlestring: Long, hkbckupkey: Long, pcszrootkey: Long, pcszsubkey: Long, pcszvaluename: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_replacePartitionUnit(targetpartition: Long, sparepartition: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_requestDeviceWakeup(hdevice: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_rtlAnsiStringToUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_rtlCharToInteger(string: Long, base: Int, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_rtlFreeAnsiString(ansistring: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_rtlFreeOemString(oemstring: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_rtlFreeUnicodeString(unicodestring: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_rtlGetReturnAddressHijackTarget(): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_rtlInitAnsiString(destinationstring: Long, sourcestring: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_rtlInitAnsiStringEx(destinationstring: Long, sourcestring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_rtlInitString(destinationstring: Long, sourcestring: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_rtlInitStringEx(destinationstring: Long, sourcestring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_rtlInitUnicodeString(destinationstring: Long, sourcestring: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_rtlIsNameLegalDOS8Dot3(name: Long, oemname: Long, namecontainsspaces: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_rtlLocalTimeToSystemTime(localtime: Long, systemtime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_rtlRaiseCustomSystemEventTrigger(triggerconfig: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_rtlTimeToSecondsSince1970(time: Long, elapsedseconds: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_rtlUnicodeStringToAnsiString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_rtlUnicodeStringToOemString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_rtlUnicodeToMultiByteSize(bytesinmultibytestring: Long, unicodestring: Long, bytesinunicodestring: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_rtlUniform(seed: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_runSetupCommandA(hwnd: Long, szcmdname: Long, szinfsection: Long, szdir: Long, lpsztitle: Long, phexe: Long, dwflags: Int, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_runSetupCommandW(hwnd: Long, szcmdname: Long, szinfsection: Long, szdir: Long, lpsztitle: Long, phexe: Long, dwflags: Int, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_sendIMEMessageExA(param0: Long, param1: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_sendIMEMessageExW(param0: Long, param1: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_setEnvironmentStringsA(newenvironment: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_setFirmwareEnvironmentVariableA(lpname: Long, lpguid: Long, pvalue: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_setFirmwareEnvironmentVariableExA(lpname: Long, lpguid: Long, pvalue: Long, nsize: Int, dwattributes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_setFirmwareEnvironmentVariableExW(lpname: Long, lpguid: Long, pvalue: Long, nsize: Int, dwattributes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_setFirmwareEnvironmentVariableW(lpname: Long, lpguid: Long, pvalue: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_setHandleCount(unumber: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_setMessageWaitingIndicator(hmsgindicator: Long, ulmsgcount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_setPerUserSecValuesA(pperuser: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_setPerUserSecValuesW(pperuser: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_subscribeFeatureStateChangeNotification(subscription: Long, callback: Long, context: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_translateInfStringA(pszinffilename: Long, pszinstallsection: Long, psztranslatesection: Long, psztranslatekey: Long, pszbuffer: Long, cchbuffer: Int, pdwrequiredsize: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_translateInfStringExA(hinf: Long, pszinffilename: Long, psztranslatesection: Long, psztranslatekey: Long, pszbuffer: Long, dwbuffersize: Int, pdwrequiredsize: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_translateInfStringExW(hinf: Long, pszinffilename: Long, psztranslatesection: Long, psztranslatekey: Long, pszbuffer: Long, dwbuffersize: Int, pdwrequiredsize: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_translateInfStringW(pszinffilename: Long, pszinstallsection: Long, psztranslatesection: Long, psztranslatekey: Long, pszbuffer: Long, cchbuffer: Int, pdwrequiredsize: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_unsubscribeFeatureStateChangeNotification(subscription: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_userInstStubWrapperA(hwnd: Long, hinstance: Long, pszparms: Long, nshow: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_userInstStubWrapperW(hwnd: Long, hinstance: Long, pszparms: Long, nshow: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_userUnInstStubWrapperA(hwnd: Long, hinstance: Long, pszparms: Long, nshow: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_userUnInstStubWrapperW(hwnd: Long, hinstance: Long, pszparms: Long, nshow: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_wINNLSEnableIME(param0: Long, param1: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_wINNLSGetEnableStatus(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_wINNLSGetIMEHotkey(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_winWatchClose(hww: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_winWatchDidStatusChange(hww: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_winWatchGetClipList(hww: Long, prc: Long, size: Int, prd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_winWatchNotify(hww: Long, notifycallback: Long, notifyparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_winWatchOpen(hwnd: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_wldpCanExecuteBuffer(host: Long, options: Int, buffer: Long, buffersize: Int, auditinfo: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_wldpCanExecuteFile(host: Long, options: Int, filehandle: Long, auditinfo: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_wldpCanExecuteStream(host: Long, options: Int, stream: Long, auditinfo: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_wldpGetLockdownPolicy(hostinformation: Long, lockdownstate: Long, lockdownflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_wldpIsClassInApprovedList(classid: Long, hostinformation: Long, isapproved: Long, optionalflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_wldpIsDynamicCodePolicyEnabled(isenabled: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_wldpQueryDeviceSecurityInformation(information: Long, informationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_wldpQueryDynamicCodeTrust(filehandle: Long, baseimage: Long, imagesize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_wldpSetDynamicCodeTrust(filehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_writePrivateProfileSectionA(lpappname: Long, lpstring: Long, lpfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_writePrivateProfileSectionW(lpappname: Long, lpstring: Long, lpfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_writePrivateProfileStringA(lpappname: Long, lpkeyname: Long, lpstring: Long, lpfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_writePrivateProfileStringW(lpappname: Long, lpkeyname: Long, lpstring: Long, lpfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_writePrivateProfileStructA(lpszsection: Long, lpszkey: Long, lpstruct: Long, usizestruct: Int, szfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_writePrivateProfileStructW(lpszsection: Long, lpszkey: Long, lpstruct: Long, usizestruct: Int, szfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_writeProfileSectionA(lpappname: Long, lpstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_writeProfileSectionW(lpappname: Long, lpstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_writeProfileStringA(lpappname: Long, lpkeyname: Long, lpstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_writeProfileStringW(lpappname: Long, lpkeyname: Long, lpstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_hread(hfile: Int, lpbuffer: Long, lbytes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_hwrite(hfile: Int, lpbuffer: Long, lbytes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_lclose(hfile: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_lcreat(lppathname: Long, iattribute: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_llseek(hfile: Int, loffset: Int, iorigin: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_lopen(lppathname: Long, ireadwrite: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_lread(hfile: Int, lpbuffer: Long, ubytes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_lwrite(hfile: Int, lpbuffer: Long, ubytes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_uawLstrcmpW(string1: Long, string2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_uawLstrcmpiW(string1: Long, string2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_uawLstrlenW(string: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_uawWcschr(string: Long, character: Short): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_uawWcscpy(destination: Long, source: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_uawWcsicmp(string1: Long, string2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_uawWcslen(string: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_uawWcsrchr(string: Long, character: Short): Long
}

public actual fun addDelBackupEntryA(lpcszfilelist: Pcstr, lpcszbackupdir: Pcstr, lpcszbasename: Pcstr, dwflags: UInt): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_addDelBackupEntryA((lpcszfilelist?.value ?: 0L), (lpcszbackupdir?.value ?: 0L), (lpcszbasename?.value ?: 0L), dwflags.toInt())

public actual fun addDelBackupEntryW(lpcszfilelist: Pcwstr, lpcszbackupdir: Pcwstr, lpcszbasename: Pcwstr, dwflags: UInt): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_addDelBackupEntryW((lpcszfilelist?.value ?: 0L), (lpcszbackupdir?.value ?: 0L), (lpcszbasename?.value ?: 0L), dwflags.toInt())

public actual fun advInstallFileA(hwnd: Hwnd, lpszsourcedir: Pcstr, lpszsourcefile: Pcstr, lpszdestdir: Pcstr, lpszdestfile: Pcstr, dwflags: UInt, dwreserved: UInt): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_advInstallFileA((hwnd?.value ?: 0L), (lpszsourcedir?.value ?: 0L), (lpszsourcefile?.value ?: 0L), (lpszdestdir?.value ?: 0L), (lpszdestfile?.value ?: 0L), dwflags.toInt(), dwreserved.toInt())

public actual fun advInstallFileW(hwnd: Hwnd, lpszsourcedir: Pcwstr, lpszsourcefile: Pcwstr, lpszdestdir: Pcwstr, lpszdestfile: Pcwstr, dwflags: UInt, dwreserved: UInt): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_advInstallFileW((hwnd?.value ?: 0L), (lpszsourcedir?.value ?: 0L), (lpszsourcefile?.value ?: 0L), (lpszdestdir?.value ?: 0L), (lpszdestfile?.value ?: 0L), dwflags.toInt(), dwreserved.toInt())

public actual fun apphelpCheckShellObject(objectclsid: COpaquePointer?, bshimifnecessary: Bool, pullflags: COpaquePointer?): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_apphelpCheckShellObject((objectclsid?.value ?: 0L), bshimifnecessary, (pullflags?.value ?: 0L))

public actual fun cancelDeviceWakeupRequest(hdevice: Handle): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_cancelDeviceWakeupRequest((hdevice?.value ?: 0L))

public actual fun closeINFEngine(hinf: COpaquePointer?): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_closeINFEngine((hinf?.value ?: 0L))

public actual fun convertAuxiliaryCounterToPerformanceCounter(ullauxiliarycountervalue: ULong, lpperformancecountervalue: COpaquePointer?, lpconversionerror: COpaquePointer?): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_convertAuxiliaryCounterToPerformanceCounter(ullauxiliarycountervalue.toLong(), (lpperformancecountervalue?.value ?: 0L), (lpconversionerror?.value ?: 0L))

public actual fun convertPerformanceCounterToAuxiliaryCounter(ullperformancecountervalue: ULong, lpauxiliarycountervalue: COpaquePointer?, lpconversionerror: COpaquePointer?): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_convertPerformanceCounterToAuxiliaryCounter(ullperformancecountervalue.toLong(), (lpauxiliarycountervalue?.value ?: 0L), (lpconversionerror?.value ?: 0L))

public actual fun dCIBeginAccess(pdci: COpaquePointer?, x: Int, y: Int, dx: Int, dy: Int): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_dCIBeginAccess((pdci?.value ?: 0L), x, y, dx, dy)

public actual fun dCICloseProvider(hdc: Hdc) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_dCICloseProvider((hdc?.value ?: 0L))
}

public actual fun dCICreateOffscreen(hdc: Hdc, dwcompression: UInt, dwredmask: UInt, dwgreenmask: UInt, dwbluemask: UInt, dwwidth: UInt, dwheight: UInt, dwdcicaps: UInt, dwbitcount: UInt, lplpsurface: COpaquePointer?): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_dCICreateOffscreen((hdc?.value ?: 0L), dwcompression.toInt(), dwredmask.toInt(), dwgreenmask.toInt(), dwbluemask.toInt(), dwwidth.toInt(), dwheight.toInt(), dwdcicaps.toInt(), dwbitcount.toInt(), (lplpsurface?.value ?: 0L))

public actual fun dCICreateOverlay(hdc: Hdc, lpoffscreensurf: COpaquePointer?, lplpsurface: COpaquePointer?): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_dCICreateOverlay((hdc?.value ?: 0L), (lpoffscreensurf?.value ?: 0L), (lplpsurface?.value ?: 0L))

public actual fun dCICreatePrimary(hdc: Hdc, lplpsurface: COpaquePointer?): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_dCICreatePrimary((hdc?.value ?: 0L), (lplpsurface?.value ?: 0L))

public actual fun dCIDestroy(pdci: COpaquePointer?) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_dCIDestroy((pdci?.value ?: 0L))
}

public actual fun dCIDraw(pdci: COpaquePointer?): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_dCIDraw((pdci?.value ?: 0L))

public actual fun dCIEndAccess(pdci: COpaquePointer?) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_dCIEndAccess((pdci?.value ?: 0L))
}

public actual fun dCIEnum(hdc: Hdc, lprdst: COpaquePointer?, lprsrc: COpaquePointer?, lpfncallback: COpaquePointer?, lpcontext: COpaquePointer?): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_dCIEnum((hdc?.value ?: 0L), (lprdst?.value ?: 0L), (lprsrc?.value ?: 0L), (lpfncallback?.value ?: 0L), (lpcontext?.value ?: 0L))

public actual fun dCIOpenProvider(): Hdc =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_dCIOpenProvider().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dCISetClipList(pdci: COpaquePointer?, prd: COpaquePointer?): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_dCISetClipList((pdci?.value ?: 0L), (prd?.value ?: 0L))

public actual fun dCISetDestination(pdci: COpaquePointer?, dst: COpaquePointer?, src: COpaquePointer?): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_dCISetDestination((pdci?.value ?: 0L), (dst?.value ?: 0L), (src?.value ?: 0L))

public actual fun dCISetSrcDestClip(pdci: COpaquePointer?, srcrc: COpaquePointer?, destrc: COpaquePointer?, prd: COpaquePointer?): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_dCISetSrcDestClip((pdci?.value ?: 0L), (srcrc?.value ?: 0L), (destrc?.value ?: 0L), (prd?.value ?: 0L))

public actual fun delNodeA(pszfileordirname: Pcstr, dwflags: UInt): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_delNodeA((pszfileordirname?.value ?: 0L), dwflags.toInt())

public actual fun delNodeRunDLL32W(hwnd: Hwnd, hinstance: Hinstance, pszparms: Pwstr, nshow: Int): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_delNodeRunDLL32W((hwnd?.value ?: 0L), (hinstance?.value ?: 0L), (pszparms?.value ?: 0L), nshow)

public actual fun delNodeW(pszfileordirname: Pcwstr, dwflags: UInt): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_delNodeW((pszfileordirname?.value ?: 0L), dwflags.toInt())

public actual fun dnsHostnameToComputerNameA(hostname: Pcstr, computername: Pstr, nsize: COpaquePointer?): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_dnsHostnameToComputerNameA((hostname?.value ?: 0L), (computername?.value ?: 0L), (nsize?.value ?: 0L))

public actual fun dnsHostnameToComputerNameW(hostname: Pcwstr, computername: Pwstr, nsize: COpaquePointer?): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_dnsHostnameToComputerNameW((hostname?.value ?: 0L), (computername?.value ?: 0L), (nsize?.value ?: 0L))

public actual fun dosDateTimeToFileTime(wfatdate: UShort, wfattime: UShort, lpfiletime: COpaquePointer?): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_dosDateTimeToFileTime(wfatdate.toShort(), wfattime.toShort(), (lpfiletime?.value ?: 0L))

public actual fun enableProcessOptionalXStateFeatures(features: ULong): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_enableProcessOptionalXStateFeatures(features.toLong())

public actual fun executeCabA(hwnd: Hwnd, pcab: COpaquePointer?, preserved: COpaquePointer?): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_executeCabA((hwnd?.value ?: 0L), (pcab?.value ?: 0L), (preserved?.value ?: 0L))

public actual fun executeCabW(hwnd: Hwnd, pcab: COpaquePointer?, preserved: COpaquePointer?): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_executeCabW((hwnd?.value ?: 0L), (pcab?.value ?: 0L), (preserved?.value ?: 0L))

public actual fun extractFilesA(pszcabname: Pcstr, pszexpanddir: Pcstr, dwflags: UInt, pszfilelist: Pcstr, lpreserved: COpaquePointer?, dwreserved: UInt): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_extractFilesA((pszcabname?.value ?: 0L), (pszexpanddir?.value ?: 0L), dwflags.toInt(), (pszfilelist?.value ?: 0L), (lpreserved?.value ?: 0L), dwreserved.toInt())

public actual fun extractFilesW(pszcabname: Pcwstr, pszexpanddir: Pcwstr, dwflags: UInt, pszfilelist: Pcwstr, lpreserved: COpaquePointer?, dwreserved: UInt): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_extractFilesW((pszcabname?.value ?: 0L), (pszexpanddir?.value ?: 0L), dwflags.toInt(), (pszfilelist?.value ?: 0L), (lpreserved?.value ?: 0L), dwreserved.toInt())

public actual fun fileSaveMarkNotExistA(lpfilelist: Pcstr, lpdir: Pcstr, lpbasename: Pcstr): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_fileSaveMarkNotExistA((lpfilelist?.value ?: 0L), (lpdir?.value ?: 0L), (lpbasename?.value ?: 0L))

public actual fun fileSaveMarkNotExistW(lpfilelist: Pcwstr, lpdir: Pcwstr, lpbasename: Pcwstr): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_fileSaveMarkNotExistW((lpfilelist?.value ?: 0L), (lpdir?.value ?: 0L), (lpbasename?.value ?: 0L))

public actual fun fileSaveRestoreOnINFA(hwnd: Hwnd, psztitle: Pcstr, pszinf: Pcstr, pszsection: Pcstr, pszbackupdir: Pcstr, pszbasebackupfile: Pcstr, dwflags: UInt): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_fileSaveRestoreOnINFA((hwnd?.value ?: 0L), (psztitle?.value ?: 0L), (pszinf?.value ?: 0L), (pszsection?.value ?: 0L), (pszbackupdir?.value ?: 0L), (pszbasebackupfile?.value ?: 0L), dwflags.toInt())

public actual fun fileSaveRestoreOnINFW(hwnd: Hwnd, psztitle: Pcwstr, pszinf: Pcwstr, pszsection: Pcwstr, pszbackupdir: Pcwstr, pszbasebackupfile: Pcwstr, dwflags: UInt): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_fileSaveRestoreOnINFW((hwnd?.value ?: 0L), (psztitle?.value ?: 0L), (pszinf?.value ?: 0L), (pszsection?.value ?: 0L), (pszbackupdir?.value ?: 0L), (pszbasebackupfile?.value ?: 0L), dwflags.toInt())

public actual fun fileSaveRestoreW(hdlg: Hwnd, lpfilelist: Pcwstr, lpdir: Pcwstr, lpbasename: Pcwstr, dwflags: UInt): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_fileSaveRestoreW((hdlg?.value ?: 0L), (lpfilelist?.value ?: 0L), (lpdir?.value ?: 0L), (lpbasename?.value ?: 0L), dwflags.toInt())

public actual fun fileTimeToDosDateTime(lpfiletime: COpaquePointer?, lpfatdate: COpaquePointer?, lpfattime: COpaquePointer?): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_fileTimeToDosDateTime((lpfiletime?.value ?: 0L), (lpfatdate?.value ?: 0L), (lpfattime?.value ?: 0L))

public actual fun gdiEntry13(): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_gdiEntry13().toUInt()

public actual fun getComputerNameA(lpbuffer: Pstr, nsize: COpaquePointer?): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_getComputerNameA((lpbuffer?.value ?: 0L), (nsize?.value ?: 0L))

public actual fun getComputerNameW(lpbuffer: Pwstr, nsize: COpaquePointer?): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_getComputerNameW((lpbuffer?.value ?: 0L), (nsize?.value ?: 0L))

public actual fun getCurrentHwProfileA(lphwprofileinfo: COpaquePointer?): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_getCurrentHwProfileA((lphwprofileinfo?.value ?: 0L))

public actual fun getCurrentHwProfileW(lphwprofileinfo: COpaquePointer?): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_getCurrentHwProfileW((lphwprofileinfo?.value ?: 0L))

public actual fun getDCRegionData(hdc: Hdc, size: UInt, prd: COpaquePointer?): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_getDCRegionData((hdc?.value ?: 0L), size.toInt(), (prd?.value ?: 0L)).toUInt()

public actual fun getFeatureEnabledState(featureid: UInt, changetime: FeatureChangeTime): FeatureEnabledState =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_getFeatureEnabledState(featureid.toInt(), changetime)

public actual fun getFeatureVariant(featureid: UInt, changetime: FeatureChangeTime, payloadid: COpaquePointer?, hasnotification: COpaquePointer?): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_getFeatureVariant(featureid.toInt(), changetime, (payloadid?.value ?: 0L), (hasnotification?.value ?: 0L)).toUInt()

public actual fun getFirmwareEnvironmentVariableA(lpname: Pcstr, lpguid: Pcstr, pbuffer: COpaquePointer?, nsize: UInt): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_getFirmwareEnvironmentVariableA((lpname?.value ?: 0L), (lpguid?.value ?: 0L), (pbuffer?.value ?: 0L), nsize.toInt()).toUInt()

public actual fun getFirmwareEnvironmentVariableExA(lpname: Pcstr, lpguid: Pcstr, pbuffer: COpaquePointer?, nsize: UInt, pdwattribubutes: COpaquePointer?): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_getFirmwareEnvironmentVariableExA((lpname?.value ?: 0L), (lpguid?.value ?: 0L), (pbuffer?.value ?: 0L), nsize.toInt(), (pdwattribubutes?.value ?: 0L)).toUInt()

public actual fun getFirmwareEnvironmentVariableExW(lpname: Pcwstr, lpguid: Pcwstr, pbuffer: COpaquePointer?, nsize: UInt, pdwattribubutes: COpaquePointer?): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_getFirmwareEnvironmentVariableExW((lpname?.value ?: 0L), (lpguid?.value ?: 0L), (pbuffer?.value ?: 0L), nsize.toInt(), (pdwattribubutes?.value ?: 0L)).toUInt()

public actual fun getFirmwareEnvironmentVariableW(lpname: Pcwstr, lpguid: Pcwstr, pbuffer: COpaquePointer?, nsize: UInt): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_getFirmwareEnvironmentVariableW((lpname?.value ?: 0L), (lpguid?.value ?: 0L), (pbuffer?.value ?: 0L), nsize.toInt()).toUInt()

public actual fun getPrivateProfileIntA(lpappname: Pcstr, lpkeyname: Pcstr, ndefault: Int, lpfilename: Pcstr): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_getPrivateProfileIntA((lpappname?.value ?: 0L), (lpkeyname?.value ?: 0L), ndefault, (lpfilename?.value ?: 0L)).toUInt()

public actual fun getPrivateProfileIntW(lpappname: Pcwstr, lpkeyname: Pcwstr, ndefault: Int, lpfilename: Pcwstr): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_getPrivateProfileIntW((lpappname?.value ?: 0L), (lpkeyname?.value ?: 0L), ndefault, (lpfilename?.value ?: 0L))

public actual fun getPrivateProfileSectionA(lpappname: Pcstr, lpreturnedstring: Pstr, nsize: UInt, lpfilename: Pcstr): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_getPrivateProfileSectionA((lpappname?.value ?: 0L), (lpreturnedstring?.value ?: 0L), nsize.toInt(), (lpfilename?.value ?: 0L)).toUInt()

public actual fun getPrivateProfileSectionNamesA(lpszreturnbuffer: Pstr, nsize: UInt, lpfilename: Pcstr): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_getPrivateProfileSectionNamesA((lpszreturnbuffer?.value ?: 0L), nsize.toInt(), (lpfilename?.value ?: 0L)).toUInt()

public actual fun getPrivateProfileSectionNamesW(lpszreturnbuffer: Pwstr, nsize: UInt, lpfilename: Pcwstr): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_getPrivateProfileSectionNamesW((lpszreturnbuffer?.value ?: 0L), nsize.toInt(), (lpfilename?.value ?: 0L)).toUInt()

public actual fun getPrivateProfileSectionW(lpappname: Pcwstr, lpreturnedstring: Pwstr, nsize: UInt, lpfilename: Pcwstr): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_getPrivateProfileSectionW((lpappname?.value ?: 0L), (lpreturnedstring?.value ?: 0L), nsize.toInt(), (lpfilename?.value ?: 0L)).toUInt()

public actual fun getPrivateProfileStringA(lpappname: Pcstr, lpkeyname: Pcstr, lpdefault: Pcstr, lpreturnedstring: Pstr, nsize: UInt, lpfilename: Pcstr): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_getPrivateProfileStringA((lpappname?.value ?: 0L), (lpkeyname?.value ?: 0L), (lpdefault?.value ?: 0L), (lpreturnedstring?.value ?: 0L), nsize.toInt(), (lpfilename?.value ?: 0L)).toUInt()

public actual fun getPrivateProfileStringW(lpappname: Pcwstr, lpkeyname: Pcwstr, lpdefault: Pcwstr, lpreturnedstring: Pwstr, nsize: UInt, lpfilename: Pcwstr): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_getPrivateProfileStringW((lpappname?.value ?: 0L), (lpkeyname?.value ?: 0L), (lpdefault?.value ?: 0L), (lpreturnedstring?.value ?: 0L), nsize.toInt(), (lpfilename?.value ?: 0L)).toUInt()

public actual fun getPrivateProfileStructA(lpszsection: Pcstr, lpszkey: Pcstr, lpstruct: COpaquePointer?, usizestruct: UInt, szfile: Pcstr): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_getPrivateProfileStructA((lpszsection?.value ?: 0L), (lpszkey?.value ?: 0L), (lpstruct?.value ?: 0L), usizestruct.toInt(), (szfile?.value ?: 0L))

public actual fun getPrivateProfileStructW(lpszsection: Pcwstr, lpszkey: Pcwstr, lpstruct: COpaquePointer?, usizestruct: UInt, szfile: Pcwstr): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_getPrivateProfileStructW((lpszsection?.value ?: 0L), (lpszkey?.value ?: 0L), (lpstruct?.value ?: 0L), usizestruct.toInt(), (szfile?.value ?: 0L))

public actual fun getProfileIntA(lpappname: Pcstr, lpkeyname: Pcstr, ndefault: Int): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_getProfileIntA((lpappname?.value ?: 0L), (lpkeyname?.value ?: 0L), ndefault).toUInt()

public actual fun getProfileIntW(lpappname: Pcwstr, lpkeyname: Pcwstr, ndefault: Int): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_getProfileIntW((lpappname?.value ?: 0L), (lpkeyname?.value ?: 0L), ndefault).toUInt()

public actual fun getProfileSectionA(lpappname: Pcstr, lpreturnedstring: Pstr, nsize: UInt): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_getProfileSectionA((lpappname?.value ?: 0L), (lpreturnedstring?.value ?: 0L), nsize.toInt()).toUInt()

public actual fun getProfileSectionW(lpappname: Pcwstr, lpreturnedstring: Pwstr, nsize: UInt): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_getProfileSectionW((lpappname?.value ?: 0L), (lpreturnedstring?.value ?: 0L), nsize.toInt()).toUInt()

public actual fun getProfileStringA(lpappname: Pcstr, lpkeyname: Pcstr, lpdefault: Pcstr, lpreturnedstring: Pstr, nsize: UInt): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_getProfileStringA((lpappname?.value ?: 0L), (lpkeyname?.value ?: 0L), (lpdefault?.value ?: 0L), (lpreturnedstring?.value ?: 0L), nsize.toInt()).toUInt()

public actual fun getProfileStringW(lpappname: Pcwstr, lpkeyname: Pcwstr, lpdefault: Pcwstr, lpreturnedstring: Pwstr, nsize: UInt): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_getProfileStringW((lpappname?.value ?: 0L), (lpkeyname?.value ?: 0L), (lpdefault?.value ?: 0L), (lpreturnedstring?.value ?: 0L), nsize.toInt()).toUInt()

public actual fun getSystemRegistryQuota(pdwquotaallowed: COpaquePointer?, pdwquotaused: COpaquePointer?): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_getSystemRegistryQuota((pdwquotaallowed?.value ?: 0L), (pdwquotaused?.value ?: 0L))

public actual fun getThreadEnabledXStateFeatures(): ULong =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_getThreadEnabledXStateFeatures().toULong()

public actual fun getUserNameA(lpbuffer: Pstr, pcbbuffer: COpaquePointer?): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_getUserNameA((lpbuffer?.value ?: 0L), (pcbbuffer?.value ?: 0L))

public actual fun getUserNameW(lpbuffer: Pwstr, pcbbuffer: COpaquePointer?): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_getUserNameW((lpbuffer?.value ?: 0L), (pcbbuffer?.value ?: 0L))

public actual fun getVersionFromFileA(lpszfilename: Pcstr, pdwmsver: COpaquePointer?, pdwlsver: COpaquePointer?, bversion: Bool): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_getVersionFromFileA((lpszfilename?.value ?: 0L), (pdwmsver?.value ?: 0L), (pdwlsver?.value ?: 0L), bversion)

public actual fun getVersionFromFileExA(lpszfilename: Pcstr, pdwmsver: COpaquePointer?, pdwlsver: COpaquePointer?, bversion: Bool): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_getVersionFromFileExA((lpszfilename?.value ?: 0L), (pdwmsver?.value ?: 0L), (pdwlsver?.value ?: 0L), bversion)

public actual fun getVersionFromFileExW(lpszfilename: Pcwstr, pdwmsver: COpaquePointer?, pdwlsver: COpaquePointer?, bversion: Bool): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_getVersionFromFileExW((lpszfilename?.value ?: 0L), (pdwmsver?.value ?: 0L), (pdwlsver?.value ?: 0L), bversion)

public actual fun getVersionFromFileW(lpszfilename: Pcwstr, pdwmsver: COpaquePointer?, pdwlsver: COpaquePointer?, bversion: Bool): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_getVersionFromFileW((lpszfilename?.value ?: 0L), (pdwmsver?.value ?: 0L), (pdwlsver?.value ?: 0L), bversion)

public actual fun getWindowRegionData(hwnd: Hwnd, size: UInt, prd: COpaquePointer?): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_getWindowRegionData((hwnd?.value ?: 0L), size.toInt(), (prd?.value ?: 0L)).toUInt()

public actual fun globalCompact(dwminfree: UInt): ULong =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_globalCompact(dwminfree.toInt()).toULong()

public actual fun globalFix(hmem: Hglobal) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_globalFix((hmem?.value ?: 0L))
}

public actual fun globalUnWire(hmem: Hglobal): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_globalUnWire((hmem?.value ?: 0L))

public actual fun globalUnfix(hmem: Hglobal) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_globalUnfix((hmem?.value ?: 0L))
}

public actual fun globalWire(hmem: Hglobal): COpaquePointer? =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_globalWire((hmem?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun iMPGetIMEA(param0: Hwnd, param1: COpaquePointer?): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_iMPGetIMEA((param0?.value ?: 0L), (param1?.value ?: 0L))

public actual fun iMPGetIMEW(param0: Hwnd, param1: COpaquePointer?): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_iMPGetIMEW((param0?.value ?: 0L), (param1?.value ?: 0L))

public actual fun iMPQueryIMEA(param0: COpaquePointer?): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_iMPQueryIMEA((param0?.value ?: 0L))

public actual fun iMPQueryIMEW(param0: COpaquePointer?): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_iMPQueryIMEW((param0?.value ?: 0L))

public actual fun iMPSetIMEA(param0: Hwnd, param1: COpaquePointer?): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_iMPSetIMEA((param0?.value ?: 0L), (param1?.value ?: 0L))

public actual fun iMPSetIMEW(param0: Hwnd, param1: COpaquePointer?): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_iMPSetIMEW((param0?.value ?: 0L), (param1?.value ?: 0L))

public actual fun isApiSetImplemented(contract: Pcstr): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_isApiSetImplemented((contract?.value ?: 0L))

public actual fun isBadHugeReadPtr(lp: COpaquePointer?, ucb: ULong): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_isBadHugeReadPtr((lp?.value ?: 0L), ucb.toLong())

public actual fun isBadHugeWritePtr(lp: COpaquePointer?, ucb: ULong): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_isBadHugeWritePtr((lp?.value ?: 0L), ucb.toLong())

public actual fun isNTAdmin(dwreserved: UInt, lpdwreserved: COpaquePointer?): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_isNTAdmin(dwreserved.toInt(), (lpdwreserved?.value ?: 0L))

public actual fun isNativeVhdBoot(nativevhdboot: COpaquePointer?): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_isNativeVhdBoot((nativevhdboot?.value ?: 0L))

public actual fun isTokenUntrusted(tokenhandle: Handle): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_isTokenUntrusted((tokenhandle?.value ?: 0L))

public actual fun launchINFSectionExW(hwnd: Hwnd, hinstance: Hinstance, pszparms: Pcwstr, nshow: Int): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_launchINFSectionExW((hwnd?.value ?: 0L), (hinstance?.value ?: 0L), (pszparms?.value ?: 0L), nshow)

public actual fun launchINFSectionW(hwndowner: Hwnd, hinstance: Hinstance, pszparams: Pwstr, nshow: Int): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_launchINFSectionW((hwndowner?.value ?: 0L), (hinstance?.value ?: 0L), (pszparams?.value ?: 0L), nshow)

public actual fun localCompact(uminfree: UInt): ULong =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_localCompact(uminfree.toInt()).toULong()

public actual fun localShrink(hmem: Hlocal, cbnewsize: UInt): ULong =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_localShrink((hmem?.value ?: 0L), cbnewsize.toInt()).toULong()

public actual fun mulDiv(nnumber: Int, nnumerator: Int, ndenominator: Int): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_mulDiv(nnumber, nnumerator, ndenominator)

public actual fun needReboot(dwrebootcheck: UInt): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_needReboot(dwrebootcheck.toInt())

public actual fun needRebootInit(): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_needRebootInit().toUInt()

public actual fun openINFEngineA(pszinffilename: Pcstr, pszinstallsection: Pcstr, dwflags: UInt, phinf: COpaquePointer?, pvreserved: COpaquePointer?): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_openINFEngineA((pszinffilename?.value ?: 0L), (pszinstallsection?.value ?: 0L), dwflags.toInt(), (phinf?.value ?: 0L), (pvreserved?.value ?: 0L))

public actual fun openINFEngineW(pszinffilename: Pcwstr, pszinstallsection: Pcwstr, dwflags: UInt, phinf: COpaquePointer?, pvreserved: COpaquePointer?): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_openINFEngineW((pszinffilename?.value ?: 0L), (pszinstallsection?.value ?: 0L), dwflags.toInt(), (phinf?.value ?: 0L), (pvreserved?.value ?: 0L))

public actual fun openMutexA(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcstr): Handle =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_openMutexA(dwdesiredaccess.toInt(), binherithandle, (lpname?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun openSemaphoreA(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcstr): Handle =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_openSemaphoreA(dwdesiredaccess.toInt(), binherithandle, (lpname?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun queryAuxiliaryCounterFrequency(lpauxiliarycounterfrequency: COpaquePointer?): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_queryAuxiliaryCounterFrequency((lpauxiliarycounterfrequency?.value ?: 0L))

public actual fun queryIdleProcessorCycleTime(bufferlength: COpaquePointer?, processoridlecycletime: COpaquePointer?): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_queryIdleProcessorCycleTime((bufferlength?.value ?: 0L), (processoridlecycletime?.value ?: 0L))

public actual fun queryIdleProcessorCycleTimeEx(group: UShort, bufferlength: COpaquePointer?, processoridlecycletime: COpaquePointer?): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_queryIdleProcessorCycleTimeEx(group.toShort(), (bufferlength?.value ?: 0L), (processoridlecycletime?.value ?: 0L))

public actual fun queryInterruptTime(lpinterrupttime: COpaquePointer?) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_queryInterruptTime((lpinterrupttime?.value ?: 0L))
}

public actual fun queryInterruptTimePrecise(lpinterrupttimeprecise: COpaquePointer?) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_queryInterruptTimePrecise((lpinterrupttimeprecise?.value ?: 0L))
}

public actual fun queryProcessCycleTime(processhandle: Handle, cycletime: COpaquePointer?): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_queryProcessCycleTime((processhandle?.value ?: 0L), (cycletime?.value ?: 0L))

public actual fun queryThreadCycleTime(threadhandle: Handle, cycletime: COpaquePointer?): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_queryThreadCycleTime((threadhandle?.value ?: 0L), (cycletime?.value ?: 0L))

public actual fun queryUnbiasedInterruptTime(unbiasedtime: COpaquePointer?): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_queryUnbiasedInterruptTime((unbiasedtime?.value ?: 0L))

public actual fun queryUnbiasedInterruptTimePrecise(lpunbiasedinterrupttimeprecise: COpaquePointer?) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_queryUnbiasedInterruptTimePrecise((lpunbiasedinterrupttimeprecise?.value ?: 0L))
}

public actual fun raiseCustomSystemEventTrigger(customsystemeventtriggerconfig: COpaquePointer?): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_raiseCustomSystemEventTrigger((customsystemeventtriggerconfig?.value ?: 0L)).toUInt()

public actual fun rebootCheckOnInstallA(hwnd: Hwnd, pszinf: Pcstr, pszsec: Pcstr, dwreserved: UInt): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_rebootCheckOnInstallA((hwnd?.value ?: 0L), (pszinf?.value ?: 0L), (pszsec?.value ?: 0L), dwreserved.toInt())

public actual fun rebootCheckOnInstallW(hwnd: Hwnd, pszinf: Pcwstr, pszsec: Pcwstr, dwreserved: UInt): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_rebootCheckOnInstallW((hwnd?.value ?: 0L), (pszinf?.value ?: 0L), (pszsec?.value ?: 0L), dwreserved.toInt())

public actual fun recordFeatureError(featureid: UInt, error: COpaquePointer?) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_recordFeatureError(featureid.toInt(), (error?.value ?: 0L))
}

public actual fun recordFeatureUsage(featureid: UInt, kind: UInt, addend: UInt, originname: Pcstr) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_recordFeatureUsage(featureid.toInt(), kind.toInt(), addend.toInt(), (originname?.value ?: 0L))
}

public actual fun regInstallA(hmod: Hmodule, pszsection: Pcstr, psttable: COpaquePointer?): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_regInstallA((hmod?.value ?: 0L), (pszsection?.value ?: 0L), (psttable?.value ?: 0L))

public actual fun regInstallW(hmod: Hmodule, pszsection: Pcwstr, psttable: COpaquePointer?): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_regInstallW((hmod?.value ?: 0L), (pszsection?.value ?: 0L), (psttable?.value ?: 0L))

public actual fun regRestoreAllA(hwnd: Hwnd, psztitlestring: Pcstr, hkbckupkey: Hkey): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_regRestoreAllA((hwnd?.value ?: 0L), (psztitlestring?.value ?: 0L), (hkbckupkey?.value ?: 0L))

public actual fun regRestoreAllW(hwnd: Hwnd, psztitlestring: Pcwstr, hkbckupkey: Hkey): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_regRestoreAllW((hwnd?.value ?: 0L), (psztitlestring?.value ?: 0L), (hkbckupkey?.value ?: 0L))

public actual fun regSaveRestoreA(hwnd: Hwnd, psztitlestring: Pcstr, hkbckupkey: Hkey, pcszrootkey: Pcstr, pcszsubkey: Pcstr, pcszvaluename: Pcstr, dwflags: UInt): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_regSaveRestoreA((hwnd?.value ?: 0L), (psztitlestring?.value ?: 0L), (hkbckupkey?.value ?: 0L), (pcszrootkey?.value ?: 0L), (pcszsubkey?.value ?: 0L), (pcszvaluename?.value ?: 0L), dwflags.toInt())

public actual fun regSaveRestoreOnINFA(hwnd: Hwnd, psztitle: Pcstr, pszinf: Pcstr, pszsection: Pcstr, hhklmbackkey: Hkey, hhkcubackkey: Hkey, dwflags: UInt): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_regSaveRestoreOnINFA((hwnd?.value ?: 0L), (psztitle?.value ?: 0L), (pszinf?.value ?: 0L), (pszsection?.value ?: 0L), (hhklmbackkey?.value ?: 0L), (hhkcubackkey?.value ?: 0L), dwflags.toInt())

public actual fun regSaveRestoreOnINFW(hwnd: Hwnd, psztitle: Pcwstr, pszinf: Pcwstr, pszsection: Pcwstr, hhklmbackkey: Hkey, hhkcubackkey: Hkey, dwflags: UInt): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_regSaveRestoreOnINFW((hwnd?.value ?: 0L), (psztitle?.value ?: 0L), (pszinf?.value ?: 0L), (pszsection?.value ?: 0L), (hhklmbackkey?.value ?: 0L), (hhkcubackkey?.value ?: 0L), dwflags.toInt())

public actual fun regSaveRestoreW(hwnd: Hwnd, psztitlestring: Pcwstr, hkbckupkey: Hkey, pcszrootkey: Pcwstr, pcszsubkey: Pcwstr, pcszvaluename: Pcwstr, dwflags: UInt): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_regSaveRestoreW((hwnd?.value ?: 0L), (psztitlestring?.value ?: 0L), (hkbckupkey?.value ?: 0L), (pcszrootkey?.value ?: 0L), (pcszsubkey?.value ?: 0L), (pcszvaluename?.value ?: 0L), dwflags.toInt())

public actual fun replacePartitionUnit(targetpartition: Pcwstr, sparepartition: Pcwstr, flags: UInt): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_replacePartitionUnit((targetpartition?.value ?: 0L), (sparepartition?.value ?: 0L), flags.toInt())

public actual fun requestDeviceWakeup(hdevice: Handle): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_requestDeviceWakeup((hdevice?.value ?: 0L))

public actual fun rtlAnsiStringToUnicodeString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?, allocatedestinationstring: Boolean): Ntstatus =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_rtlAnsiStringToUnicodeString((destinationstring?.value ?: 0L), (sourcestring?.value ?: 0L), allocatedestinationstring)

public actual fun rtlCharToInteger(string: COpaquePointer?, base: UInt, value: COpaquePointer?): Ntstatus =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_rtlCharToInteger((string?.value ?: 0L), base.toInt(), (value?.value ?: 0L))

public actual fun rtlFreeAnsiString(ansistring: COpaquePointer?) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_rtlFreeAnsiString((ansistring?.value ?: 0L))
}

public actual fun rtlFreeOemString(oemstring: COpaquePointer?) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_rtlFreeOemString((oemstring?.value ?: 0L))
}

public actual fun rtlFreeUnicodeString(unicodestring: COpaquePointer?) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_rtlFreeUnicodeString((unicodestring?.value ?: 0L))
}

public actual fun rtlGetReturnAddressHijackTarget(): ULong =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_rtlGetReturnAddressHijackTarget().toULong()

public actual fun rtlInitAnsiString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_rtlInitAnsiString((destinationstring?.value ?: 0L), (sourcestring?.value ?: 0L))
}

public actual fun rtlInitAnsiStringEx(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?): Ntstatus =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_rtlInitAnsiStringEx((destinationstring?.value ?: 0L), (sourcestring?.value ?: 0L))

public actual fun rtlInitString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_rtlInitString((destinationstring?.value ?: 0L), (sourcestring?.value ?: 0L))
}

public actual fun rtlInitStringEx(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?): Ntstatus =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_rtlInitStringEx((destinationstring?.value ?: 0L), (sourcestring?.value ?: 0L))

public actual fun rtlInitUnicodeString(destinationstring: COpaquePointer?, sourcestring: Pcwstr) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_rtlInitUnicodeString((destinationstring?.value ?: 0L), (sourcestring?.value ?: 0L))
}

public actual fun rtlIsNameLegalDOS8Dot3(name: COpaquePointer?, oemname: COpaquePointer?, namecontainsspaces: COpaquePointer?): Boolean =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_rtlIsNameLegalDOS8Dot3((name?.value ?: 0L), (oemname?.value ?: 0L), (namecontainsspaces?.value ?: 0L))

public actual fun rtlLocalTimeToSystemTime(localtime: COpaquePointer?, systemtime: COpaquePointer?): Ntstatus =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_rtlLocalTimeToSystemTime((localtime?.value ?: 0L), (systemtime?.value ?: 0L))

public actual fun rtlRaiseCustomSystemEventTrigger(triggerconfig: COpaquePointer?): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_rtlRaiseCustomSystemEventTrigger((triggerconfig?.value ?: 0L)).toUInt()

public actual fun rtlTimeToSecondsSince1970(time: COpaquePointer?, elapsedseconds: COpaquePointer?): Boolean =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_rtlTimeToSecondsSince1970((time?.value ?: 0L), (elapsedseconds?.value ?: 0L))

public actual fun rtlUnicodeStringToAnsiString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?, allocatedestinationstring: Boolean): Ntstatus =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_rtlUnicodeStringToAnsiString((destinationstring?.value ?: 0L), (sourcestring?.value ?: 0L), allocatedestinationstring)

public actual fun rtlUnicodeStringToOemString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?, allocatedestinationstring: Boolean): Ntstatus =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_rtlUnicodeStringToOemString((destinationstring?.value ?: 0L), (sourcestring?.value ?: 0L), allocatedestinationstring)

public actual fun rtlUnicodeToMultiByteSize(bytesinmultibytestring: COpaquePointer?, unicodestring: Pcwstr, bytesinunicodestring: UInt): Ntstatus =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_rtlUnicodeToMultiByteSize((bytesinmultibytestring?.value ?: 0L), (unicodestring?.value ?: 0L), bytesinunicodestring.toInt())

public actual fun rtlUniform(seed: COpaquePointer?): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_rtlUniform((seed?.value ?: 0L)).toUInt()

public actual fun runSetupCommandA(hwnd: Hwnd, szcmdname: Pcstr, szinfsection: Pcstr, szdir: Pcstr, lpsztitle: Pcstr, phexe: COpaquePointer?, dwflags: UInt, pvreserved: COpaquePointer?): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_runSetupCommandA((hwnd?.value ?: 0L), (szcmdname?.value ?: 0L), (szinfsection?.value ?: 0L), (szdir?.value ?: 0L), (lpsztitle?.value ?: 0L), (phexe?.value ?: 0L), dwflags.toInt(), (pvreserved?.value ?: 0L))

public actual fun runSetupCommandW(hwnd: Hwnd, szcmdname: Pcwstr, szinfsection: Pcwstr, szdir: Pcwstr, lpsztitle: Pcwstr, phexe: COpaquePointer?, dwflags: UInt, pvreserved: COpaquePointer?): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_runSetupCommandW((hwnd?.value ?: 0L), (szcmdname?.value ?: 0L), (szinfsection?.value ?: 0L), (szdir?.value ?: 0L), (lpsztitle?.value ?: 0L), (phexe?.value ?: 0L), dwflags.toInt(), (pvreserved?.value ?: 0L))

public actual fun sendIMEMessageExA(param0: Hwnd, param1: Lparam): Lresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_sendIMEMessageExA((param0?.value ?: 0L), param1)

public actual fun sendIMEMessageExW(param0: Hwnd, param1: Lparam): Lresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_sendIMEMessageExW((param0?.value ?: 0L), param1)

public actual fun setEnvironmentStringsA(newenvironment: Pcstr): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_setEnvironmentStringsA((newenvironment?.value ?: 0L))

public actual fun setFirmwareEnvironmentVariableA(lpname: Pcstr, lpguid: Pcstr, pvalue: COpaquePointer?, nsize: UInt): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_setFirmwareEnvironmentVariableA((lpname?.value ?: 0L), (lpguid?.value ?: 0L), (pvalue?.value ?: 0L), nsize.toInt())

public actual fun setFirmwareEnvironmentVariableExA(lpname: Pcstr, lpguid: Pcstr, pvalue: COpaquePointer?, nsize: UInt, dwattributes: UInt): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_setFirmwareEnvironmentVariableExA((lpname?.value ?: 0L), (lpguid?.value ?: 0L), (pvalue?.value ?: 0L), nsize.toInt(), dwattributes.toInt())

public actual fun setFirmwareEnvironmentVariableExW(lpname: Pcwstr, lpguid: Pcwstr, pvalue: COpaquePointer?, nsize: UInt, dwattributes: UInt): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_setFirmwareEnvironmentVariableExW((lpname?.value ?: 0L), (lpguid?.value ?: 0L), (pvalue?.value ?: 0L), nsize.toInt(), dwattributes.toInt())

public actual fun setFirmwareEnvironmentVariableW(lpname: Pcwstr, lpguid: Pcwstr, pvalue: COpaquePointer?, nsize: UInt): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_setFirmwareEnvironmentVariableW((lpname?.value ?: 0L), (lpguid?.value ?: 0L), (pvalue?.value ?: 0L), nsize.toInt())

public actual fun setHandleCount(unumber: UInt): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_setHandleCount(unumber.toInt()).toUInt()

public actual fun setMessageWaitingIndicator(hmsgindicator: Handle, ulmsgcount: UInt): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_setMessageWaitingIndicator((hmsgindicator?.value ?: 0L), ulmsgcount.toInt())

public actual fun setPerUserSecValuesA(pperuser: COpaquePointer?): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_setPerUserSecValuesA((pperuser?.value ?: 0L))

public actual fun setPerUserSecValuesW(pperuser: COpaquePointer?): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_setPerUserSecValuesW((pperuser?.value ?: 0L))

public actual fun subscribeFeatureStateChangeNotification(subscription: COpaquePointer?, callback: PfeatureStateChangeCallback, context: COpaquePointer?) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_subscribeFeatureStateChangeNotification((subscription?.value ?: 0L), 0L, (context?.value ?: 0L))
}

public actual fun translateInfStringA(pszinffilename: Pcstr, pszinstallsection: Pcstr, psztranslatesection: Pcstr, psztranslatekey: Pcstr, pszbuffer: Pstr, cchbuffer: UInt, pdwrequiredsize: COpaquePointer?, pvreserved: COpaquePointer?): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_translateInfStringA((pszinffilename?.value ?: 0L), (pszinstallsection?.value ?: 0L), (psztranslatesection?.value ?: 0L), (psztranslatekey?.value ?: 0L), (pszbuffer?.value ?: 0L), cchbuffer.toInt(), (pdwrequiredsize?.value ?: 0L), (pvreserved?.value ?: 0L))

public actual fun translateInfStringExA(hinf: COpaquePointer?, pszinffilename: Pcstr, psztranslatesection: Pcstr, psztranslatekey: Pcstr, pszbuffer: Pstr, dwbuffersize: UInt, pdwrequiredsize: COpaquePointer?, pvreserved: COpaquePointer?): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_translateInfStringExA((hinf?.value ?: 0L), (pszinffilename?.value ?: 0L), (psztranslatesection?.value ?: 0L), (psztranslatekey?.value ?: 0L), (pszbuffer?.value ?: 0L), dwbuffersize.toInt(), (pdwrequiredsize?.value ?: 0L), (pvreserved?.value ?: 0L))

public actual fun translateInfStringExW(hinf: COpaquePointer?, pszinffilename: Pcwstr, psztranslatesection: Pcwstr, psztranslatekey: Pcwstr, pszbuffer: Pwstr, dwbuffersize: UInt, pdwrequiredsize: COpaquePointer?, pvreserved: COpaquePointer?): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_translateInfStringExW((hinf?.value ?: 0L), (pszinffilename?.value ?: 0L), (psztranslatesection?.value ?: 0L), (psztranslatekey?.value ?: 0L), (pszbuffer?.value ?: 0L), dwbuffersize.toInt(), (pdwrequiredsize?.value ?: 0L), (pvreserved?.value ?: 0L))

public actual fun translateInfStringW(pszinffilename: Pcwstr, pszinstallsection: Pcwstr, psztranslatesection: Pcwstr, psztranslatekey: Pcwstr, pszbuffer: Pwstr, cchbuffer: UInt, pdwrequiredsize: COpaquePointer?, pvreserved: COpaquePointer?): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_translateInfStringW((pszinffilename?.value ?: 0L), (pszinstallsection?.value ?: 0L), (psztranslatesection?.value ?: 0L), (psztranslatekey?.value ?: 0L), (pszbuffer?.value ?: 0L), cchbuffer.toInt(), (pdwrequiredsize?.value ?: 0L), (pvreserved?.value ?: 0L))

public actual fun unsubscribeFeatureStateChangeNotification(subscription: FeatureStateChangeSubscription) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_unsubscribeFeatureStateChangeNotification((subscription?.value ?: 0L))
}

public actual fun userInstStubWrapperA(hwnd: Hwnd, hinstance: Hinstance, pszparms: Pcstr, nshow: Int): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_userInstStubWrapperA((hwnd?.value ?: 0L), (hinstance?.value ?: 0L), (pszparms?.value ?: 0L), nshow)

public actual fun userInstStubWrapperW(hwnd: Hwnd, hinstance: Hinstance, pszparms: Pcwstr, nshow: Int): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_userInstStubWrapperW((hwnd?.value ?: 0L), (hinstance?.value ?: 0L), (pszparms?.value ?: 0L), nshow)

public actual fun userUnInstStubWrapperA(hwnd: Hwnd, hinstance: Hinstance, pszparms: Pcstr, nshow: Int): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_userUnInstStubWrapperA((hwnd?.value ?: 0L), (hinstance?.value ?: 0L), (pszparms?.value ?: 0L), nshow)

public actual fun userUnInstStubWrapperW(hwnd: Hwnd, hinstance: Hinstance, pszparms: Pcwstr, nshow: Int): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_userUnInstStubWrapperW((hwnd?.value ?: 0L), (hinstance?.value ?: 0L), (pszparms?.value ?: 0L), nshow)

public actual fun wINNLSEnableIME(param0: Hwnd, param1: Bool): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_wINNLSEnableIME((param0?.value ?: 0L), param1)

public actual fun wINNLSGetEnableStatus(param0: Hwnd): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_wINNLSGetEnableStatus((param0?.value ?: 0L))

public actual fun wINNLSGetIMEHotkey(param0: Hwnd): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_wINNLSGetIMEHotkey((param0?.value ?: 0L)).toUInt()

public actual fun winWatchClose(hww: Hwinwatch) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_winWatchClose((hww?.value ?: 0L))
}

public actual fun winWatchDidStatusChange(hww: Hwinwatch): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_winWatchDidStatusChange((hww?.value ?: 0L))

public actual fun winWatchGetClipList(hww: Hwinwatch, prc: COpaquePointer?, size: UInt, prd: COpaquePointer?): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_winWatchGetClipList((hww?.value ?: 0L), (prc?.value ?: 0L), size.toInt(), (prd?.value ?: 0L)).toUInt()

public actual fun winWatchNotify(hww: Hwinwatch, notifycallback: Winwatchnotifyproc, notifyparam: Lparam): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_winWatchNotify((hww?.value ?: 0L), 0L, notifyparam)

public actual fun winWatchOpen(hwnd: Hwnd): Hwinwatch =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_winWatchOpen((hwnd?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun wldpCanExecuteBuffer(host: COpaquePointer?, options: WldpExecutionEvaluationOptions, buffer: COpaquePointer?, buffersize: UInt, auditinfo: Pcwstr, result: COpaquePointer?): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_wldpCanExecuteBuffer((host?.value ?: 0L), options, (buffer?.value ?: 0L), buffersize.toInt(), (auditinfo?.value ?: 0L), (result?.value ?: 0L))

public actual fun wldpCanExecuteFile(host: COpaquePointer?, options: WldpExecutionEvaluationOptions, filehandle: Handle, auditinfo: Pcwstr, result: COpaquePointer?): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_wldpCanExecuteFile((host?.value ?: 0L), options, (filehandle?.value ?: 0L), (auditinfo?.value ?: 0L), (result?.value ?: 0L))

public actual fun wldpCanExecuteStream(host: COpaquePointer?, options: WldpExecutionEvaluationOptions, stream: COpaquePointer?, auditinfo: Pcwstr, result: COpaquePointer?): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_wldpCanExecuteStream((host?.value ?: 0L), options, (stream?.value ?: 0L), (auditinfo?.value ?: 0L), (result?.value ?: 0L))

public actual fun wldpGetLockdownPolicy(hostinformation: COpaquePointer?, lockdownstate: COpaquePointer?, lockdownflags: UInt): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_wldpGetLockdownPolicy((hostinformation?.value ?: 0L), (lockdownstate?.value ?: 0L), lockdownflags.toInt())

public actual fun wldpIsClassInApprovedList(classid: COpaquePointer?, hostinformation: COpaquePointer?, isapproved: COpaquePointer?, optionalflags: UInt): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_wldpIsClassInApprovedList((classid?.value ?: 0L), (hostinformation?.value ?: 0L), (isapproved?.value ?: 0L), optionalflags.toInt())

public actual fun wldpIsDynamicCodePolicyEnabled(isenabled: COpaquePointer?): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_wldpIsDynamicCodePolicyEnabled((isenabled?.value ?: 0L))

public actual fun wldpQueryDeviceSecurityInformation(information: COpaquePointer?, informationlength: UInt, returnlength: COpaquePointer?): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_wldpQueryDeviceSecurityInformation((information?.value ?: 0L), informationlength.toInt(), (returnlength?.value ?: 0L))

public actual fun wldpQueryDynamicCodeTrust(filehandle: Handle, baseimage: COpaquePointer?, imagesize: UInt): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_wldpQueryDynamicCodeTrust((filehandle?.value ?: 0L), (baseimage?.value ?: 0L), imagesize.toInt())

public actual fun wldpSetDynamicCodeTrust(filehandle: Handle): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_wldpSetDynamicCodeTrust((filehandle?.value ?: 0L))

public actual fun writePrivateProfileSectionA(lpappname: Pcstr, lpstring: Pcstr, lpfilename: Pcstr): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_writePrivateProfileSectionA((lpappname?.value ?: 0L), (lpstring?.value ?: 0L), (lpfilename?.value ?: 0L))

public actual fun writePrivateProfileSectionW(lpappname: Pcwstr, lpstring: Pcwstr, lpfilename: Pcwstr): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_writePrivateProfileSectionW((lpappname?.value ?: 0L), (lpstring?.value ?: 0L), (lpfilename?.value ?: 0L))

public actual fun writePrivateProfileStringA(lpappname: Pcstr, lpkeyname: Pcstr, lpstring: Pcstr, lpfilename: Pcstr): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_writePrivateProfileStringA((lpappname?.value ?: 0L), (lpkeyname?.value ?: 0L), (lpstring?.value ?: 0L), (lpfilename?.value ?: 0L))

public actual fun writePrivateProfileStringW(lpappname: Pcwstr, lpkeyname: Pcwstr, lpstring: Pcwstr, lpfilename: Pcwstr): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_writePrivateProfileStringW((lpappname?.value ?: 0L), (lpkeyname?.value ?: 0L), (lpstring?.value ?: 0L), (lpfilename?.value ?: 0L))

public actual fun writePrivateProfileStructA(lpszsection: Pcstr, lpszkey: Pcstr, lpstruct: COpaquePointer?, usizestruct: UInt, szfile: Pcstr): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_writePrivateProfileStructA((lpszsection?.value ?: 0L), (lpszkey?.value ?: 0L), (lpstruct?.value ?: 0L), usizestruct.toInt(), (szfile?.value ?: 0L))

public actual fun writePrivateProfileStructW(lpszsection: Pcwstr, lpszkey: Pcwstr, lpstruct: COpaquePointer?, usizestruct: UInt, szfile: Pcwstr): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_writePrivateProfileStructW((lpszsection?.value ?: 0L), (lpszkey?.value ?: 0L), (lpstruct?.value ?: 0L), usizestruct.toInt(), (szfile?.value ?: 0L))

public actual fun writeProfileSectionA(lpappname: Pcstr, lpstring: Pcstr): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_writeProfileSectionA((lpappname?.value ?: 0L), (lpstring?.value ?: 0L))

public actual fun writeProfileSectionW(lpappname: Pcwstr, lpstring: Pcwstr): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_writeProfileSectionW((lpappname?.value ?: 0L), (lpstring?.value ?: 0L))

public actual fun writeProfileStringA(lpappname: Pcstr, lpkeyname: Pcstr, lpstring: Pcstr): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_writeProfileStringA((lpappname?.value ?: 0L), (lpkeyname?.value ?: 0L), (lpstring?.value ?: 0L))

public actual fun writeProfileStringW(lpappname: Pcwstr, lpkeyname: Pcwstr, lpstring: Pcwstr): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_writeProfileStringW((lpappname?.value ?: 0L), (lpkeyname?.value ?: 0L), (lpstring?.value ?: 0L))

public actual fun hread(hfile: Int, lpbuffer: COpaquePointer?, lbytes: Int): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_hread(hfile, (lpbuffer?.value ?: 0L), lbytes)

public actual fun hwrite(hfile: Int, lpbuffer: Pcstr, lbytes: Int): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_hwrite(hfile, (lpbuffer?.value ?: 0L), lbytes)

public actual fun lclose(hfile: Int): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_lclose(hfile)

public actual fun lcreat(lppathname: Pcstr, iattribute: Int): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_lcreat((lppathname?.value ?: 0L), iattribute)

public actual fun llseek(hfile: Int, loffset: Int, iorigin: Int): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_llseek(hfile, loffset, iorigin)

public actual fun lopen(lppathname: Pcstr, ireadwrite: Int): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_lopen((lppathname?.value ?: 0L), ireadwrite)

public actual fun lread(hfile: Int, lpbuffer: COpaquePointer?, ubytes: UInt): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_lread(hfile, (lpbuffer?.value ?: 0L), ubytes.toInt()).toUInt()

public actual fun lwrite(hfile: Int, lpbuffer: Pcstr, ubytes: UInt): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_lwrite(hfile, (lpbuffer?.value ?: 0L), ubytes.toInt()).toUInt()

public actual fun uawLstrcmpW(string1: COpaquePointer?, string2: COpaquePointer?): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_uawLstrcmpW((string1?.value ?: 0L), (string2?.value ?: 0L))

public actual fun uawLstrcmpiW(string1: COpaquePointer?, string2: COpaquePointer?): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_uawLstrcmpiW((string1?.value ?: 0L), (string2?.value ?: 0L))

public actual fun uawLstrlenW(string: COpaquePointer?): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_uawLstrlenW((string?.value ?: 0L))

public actual fun uawWcschr(string: COpaquePointer?, character: UShort): COpaquePointer? =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_uawWcschr((string?.value ?: 0L), character.toShort()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uawWcscpy(destination: COpaquePointer?, source: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_uawWcscpy((destination?.value ?: 0L), (source?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uawWcsicmp(string1: COpaquePointer?, string2: COpaquePointer?): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_uawWcsicmp((string1?.value ?: 0L), (string2?.value ?: 0L))

public actual fun uawWcslen(string: COpaquePointer?): ULong =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_uawWcslen((string?.value ?: 0L)).toULong()

public actual fun uawWcsrchr(string: COpaquePointer?, character: UShort): COpaquePointer? =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_uawWcsrchr((string?.value ?: 0L), character.toShort()).let { if (it == 0L) null else COpaquePointer(it) }
