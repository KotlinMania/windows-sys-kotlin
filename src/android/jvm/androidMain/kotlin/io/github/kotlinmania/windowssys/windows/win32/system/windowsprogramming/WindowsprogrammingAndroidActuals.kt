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

private object WindowsWin32SystemWindowsprogrammingJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_AddDelBackupEntryA(lpcszfilelist: Long, lpcszbackupdir: Long, lpcszbasename: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_AddDelBackupEntryW(lpcszfilelist: Long, lpcszbackupdir: Long, lpcszbasename: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_AdvInstallFileA(hwnd: Long, lpszsourcedir: Long, lpszsourcefile: Long, lpszdestdir: Long, lpszdestfile: Long, dwflags: Int, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_AdvInstallFileW(hwnd: Long, lpszsourcedir: Long, lpszsourcefile: Long, lpszdestdir: Long, lpszdestfile: Long, dwflags: Int, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_ApphelpCheckShellObject(objectclsid: Long, bshimifnecessary: Int, pullflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_CancelDeviceWakeupRequest(hdevice: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_CloseINFEngine(hinf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_ConvertAuxiliaryCounterToPerformanceCounter(ullauxiliarycountervalue: Long, lpperformancecountervalue: Long, lpconversionerror: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_ConvertPerformanceCounterToAuxiliaryCounter(ullperformancecountervalue: Long, lpauxiliarycountervalue: Long, lpconversionerror: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_DCIBeginAccess(pdci: Long, x: Int, y: Int, dx: Int, dy: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_DCICloseProvider(hdc: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_DCICreateOffscreen(hdc: Long, dwcompression: Int, dwredmask: Int, dwgreenmask: Int, dwbluemask: Int, dwwidth: Int, dwheight: Int, dwdcicaps: Int, dwbitcount: Int, lplpsurface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_DCICreateOverlay(hdc: Long, lpoffscreensurf: Long, lplpsurface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_DCICreatePrimary(hdc: Long, lplpsurface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_DCIDestroy(pdci: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_DCIDraw(pdci: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_DCIEndAccess(pdci: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_DCIEnum(hdc: Long, lprdst: Long, lprsrc: Long, lpfncallback: Long, lpcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_DCIOpenProvider(): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_DCISetClipList(pdci: Long, prd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_DCISetDestination(pdci: Long, dst: Long, src: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_DCISetSrcDestClip(pdci: Long, srcrc: Long, destrc: Long, prd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_DelNodeA(pszfileordirname: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_DelNodeRunDLL32W(hwnd: Long, hinstance: Long, pszparms: Long, nshow: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_DelNodeW(pszfileordirname: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_DnsHostnameToComputerNameA(hostname: Long, computername: Long, nsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_DnsHostnameToComputerNameW(hostname: Long, computername: Long, nsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_DosDateTimeToFileTime(wfatdate: Short, wfattime: Short, lpfiletime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_EnableProcessOptionalXStateFeatures(features: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_ExecuteCabA(hwnd: Long, pcab: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_ExecuteCabW(hwnd: Long, pcab: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_ExtractFilesA(pszcabname: Long, pszexpanddir: Long, dwflags: Int, pszfilelist: Long, lpreserved: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_ExtractFilesW(pszcabname: Long, pszexpanddir: Long, dwflags: Int, pszfilelist: Long, lpreserved: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_FileSaveMarkNotExistA(lpfilelist: Long, lpdir: Long, lpbasename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_FileSaveMarkNotExistW(lpfilelist: Long, lpdir: Long, lpbasename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_FileSaveRestoreOnINFA(hwnd: Long, psztitle: Long, pszinf: Long, pszsection: Long, pszbackupdir: Long, pszbasebackupfile: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_FileSaveRestoreOnINFW(hwnd: Long, psztitle: Long, pszinf: Long, pszsection: Long, pszbackupdir: Long, pszbasebackupfile: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_FileSaveRestoreW(hdlg: Long, lpfilelist: Long, lpdir: Long, lpbasename: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_FileTimeToDosDateTime(lpfiletime: Long, lpfatdate: Long, lpfattime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_GdiEntry13(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_GetComputerNameA(lpbuffer: Long, nsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_GetComputerNameW(lpbuffer: Long, nsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_GetCurrentHwProfileA(lphwprofileinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_GetCurrentHwProfileW(lphwprofileinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_GetDCRegionData(hdc: Long, size: Int, prd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_GetFeatureEnabledState(featureid: Int, changetime: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_GetFeatureVariant(featureid: Int, changetime: Int, payloadid: Long, hasnotification: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_GetFirmwareEnvironmentVariableA(lpname: Long, lpguid: Long, pbuffer: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_GetFirmwareEnvironmentVariableExA(lpname: Long, lpguid: Long, pbuffer: Long, nsize: Int, pdwattribubutes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_GetFirmwareEnvironmentVariableExW(lpname: Long, lpguid: Long, pbuffer: Long, nsize: Int, pdwattribubutes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_GetFirmwareEnvironmentVariableW(lpname: Long, lpguid: Long, pbuffer: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_GetPrivateProfileIntA(lpappname: Long, lpkeyname: Long, ndefault: Int, lpfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_GetPrivateProfileIntW(lpappname: Long, lpkeyname: Long, ndefault: Int, lpfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_GetPrivateProfileSectionA(lpappname: Long, lpreturnedstring: Long, nsize: Int, lpfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_GetPrivateProfileSectionNamesA(lpszreturnbuffer: Long, nsize: Int, lpfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_GetPrivateProfileSectionNamesW(lpszreturnbuffer: Long, nsize: Int, lpfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_GetPrivateProfileSectionW(lpappname: Long, lpreturnedstring: Long, nsize: Int, lpfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_GetPrivateProfileStringA(lpappname: Long, lpkeyname: Long, lpdefault: Long, lpreturnedstring: Long, nsize: Int, lpfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_GetPrivateProfileStringW(lpappname: Long, lpkeyname: Long, lpdefault: Long, lpreturnedstring: Long, nsize: Int, lpfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_GetPrivateProfileStructA(lpszsection: Long, lpszkey: Long, lpstruct: Long, usizestruct: Int, szfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_GetPrivateProfileStructW(lpszsection: Long, lpszkey: Long, lpstruct: Long, usizestruct: Int, szfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_GetProfileIntA(lpappname: Long, lpkeyname: Long, ndefault: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_GetProfileIntW(lpappname: Long, lpkeyname: Long, ndefault: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_GetProfileSectionA(lpappname: Long, lpreturnedstring: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_GetProfileSectionW(lpappname: Long, lpreturnedstring: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_GetProfileStringA(lpappname: Long, lpkeyname: Long, lpdefault: Long, lpreturnedstring: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_GetProfileStringW(lpappname: Long, lpkeyname: Long, lpdefault: Long, lpreturnedstring: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_GetSystemRegistryQuota(pdwquotaallowed: Long, pdwquotaused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_GetThreadEnabledXStateFeatures(): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_GetUserNameA(lpbuffer: Long, pcbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_GetUserNameW(lpbuffer: Long, pcbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_GetVersionFromFileA(lpszfilename: Long, pdwmsver: Long, pdwlsver: Long, bversion: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_GetVersionFromFileExA(lpszfilename: Long, pdwmsver: Long, pdwlsver: Long, bversion: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_GetVersionFromFileExW(lpszfilename: Long, pdwmsver: Long, pdwlsver: Long, bversion: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_GetVersionFromFileW(lpszfilename: Long, pdwmsver: Long, pdwlsver: Long, bversion: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_GetWindowRegionData(hwnd: Long, size: Int, prd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_GlobalCompact(dwminfree: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_GlobalFix(hmem: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_GlobalUnWire(hmem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_GlobalUnfix(hmem: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_GlobalWire(hmem: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_IMPGetIMEA(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_IMPGetIMEW(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_IMPQueryIMEA(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_IMPQueryIMEW(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_IMPSetIMEA(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_IMPSetIMEW(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_IsApiSetImplemented(contract: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_IsBadHugeReadPtr(lp: Long, ucb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_IsBadHugeWritePtr(lp: Long, ucb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_IsNTAdmin(dwreserved: Int, lpdwreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_IsNativeVhdBoot(nativevhdboot: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_IsTokenUntrusted(tokenhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_LaunchINFSectionExW(hwnd: Long, hinstance: Long, pszparms: Long, nshow: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_LaunchINFSectionW(hwndowner: Long, hinstance: Long, pszparams: Long, nshow: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_LocalCompact(uminfree: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_LocalShrink(hmem: Long, cbnewsize: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_MulDiv(nnumber: Int, nnumerator: Int, ndenominator: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_NeedReboot(dwrebootcheck: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_NeedRebootInit(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_OpenINFEngineA(pszinffilename: Long, pszinstallsection: Long, dwflags: Int, phinf: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_OpenINFEngineW(pszinffilename: Long, pszinstallsection: Long, dwflags: Int, phinf: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_OpenMutexA(dwdesiredaccess: Int, binherithandle: Int, lpname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_OpenSemaphoreA(dwdesiredaccess: Int, binherithandle: Int, lpname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_QueryAuxiliaryCounterFrequency(lpauxiliarycounterfrequency: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_QueryIdleProcessorCycleTime(bufferlength: Long, processoridlecycletime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_QueryIdleProcessorCycleTimeEx(group: Short, bufferlength: Long, processoridlecycletime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_QueryInterruptTime(lpinterrupttime: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_QueryInterruptTimePrecise(lpinterrupttimeprecise: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_QueryProcessCycleTime(processhandle: Long, cycletime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_QueryThreadCycleTime(threadhandle: Long, cycletime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_QueryUnbiasedInterruptTime(unbiasedtime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_QueryUnbiasedInterruptTimePrecise(lpunbiasedinterrupttimeprecise: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_RaiseCustomSystemEventTrigger(customsystemeventtriggerconfig: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_RebootCheckOnInstallA(hwnd: Long, pszinf: Long, pszsec: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_RebootCheckOnInstallW(hwnd: Long, pszinf: Long, pszsec: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_RecordFeatureError(featureid: Int, error: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_RecordFeatureUsage(featureid: Int, kind: Int, addend: Int, originname: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_RegInstallA(hmod: Long, pszsection: Long, psttable: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_RegInstallW(hmod: Long, pszsection: Long, psttable: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_RegRestoreAllA(hwnd: Long, psztitlestring: Long, hkbckupkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_RegRestoreAllW(hwnd: Long, psztitlestring: Long, hkbckupkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_RegSaveRestoreA(hwnd: Long, psztitlestring: Long, hkbckupkey: Long, pcszrootkey: Long, pcszsubkey: Long, pcszvaluename: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_RegSaveRestoreOnINFA(hwnd: Long, psztitle: Long, pszinf: Long, pszsection: Long, hhklmbackkey: Long, hhkcubackkey: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_RegSaveRestoreOnINFW(hwnd: Long, psztitle: Long, pszinf: Long, pszsection: Long, hhklmbackkey: Long, hhkcubackkey: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_RegSaveRestoreW(hwnd: Long, psztitlestring: Long, hkbckupkey: Long, pcszrootkey: Long, pcszsubkey: Long, pcszvaluename: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_ReplacePartitionUnit(targetpartition: Long, sparepartition: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_RequestDeviceWakeup(hdevice: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_RtlAnsiStringToUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_RtlCharToInteger(string: Long, base: Int, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_RtlFreeAnsiString(ansistring: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_RtlFreeOemString(oemstring: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_RtlFreeUnicodeString(unicodestring: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_RtlGetReturnAddressHijackTarget(): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_RtlInitAnsiString(destinationstring: Long, sourcestring: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_RtlInitAnsiStringEx(destinationstring: Long, sourcestring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_RtlInitString(destinationstring: Long, sourcestring: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_RtlInitStringEx(destinationstring: Long, sourcestring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_RtlInitUnicodeString(destinationstring: Long, sourcestring: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_RtlIsNameLegalDOS8Dot3(name: Long, oemname: Long, namecontainsspaces: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_RtlLocalTimeToSystemTime(localtime: Long, systemtime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_RtlRaiseCustomSystemEventTrigger(triggerconfig: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_RtlTimeToSecondsSince1970(time: Long, elapsedseconds: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_RtlUnicodeStringToAnsiString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_RtlUnicodeStringToOemString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_RtlUnicodeToMultiByteSize(bytesinmultibytestring: Long, unicodestring: Long, bytesinunicodestring: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_RtlUniform(seed: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_RunSetupCommandA(hwnd: Long, szcmdname: Long, szinfsection: Long, szdir: Long, lpsztitle: Long, phexe: Long, dwflags: Int, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_RunSetupCommandW(hwnd: Long, szcmdname: Long, szinfsection: Long, szdir: Long, lpsztitle: Long, phexe: Long, dwflags: Int, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_SendIMEMessageExA(param0: Long, param1: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_SendIMEMessageExW(param0: Long, param1: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_SetEnvironmentStringsA(newenvironment: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_SetFirmwareEnvironmentVariableA(lpname: Long, lpguid: Long, pvalue: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_SetFirmwareEnvironmentVariableExA(lpname: Long, lpguid: Long, pvalue: Long, nsize: Int, dwattributes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_SetFirmwareEnvironmentVariableExW(lpname: Long, lpguid: Long, pvalue: Long, nsize: Int, dwattributes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_SetFirmwareEnvironmentVariableW(lpname: Long, lpguid: Long, pvalue: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_SetHandleCount(unumber: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_SetMessageWaitingIndicator(hmsgindicator: Long, ulmsgcount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_SetPerUserSecValuesA(pperuser: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_SetPerUserSecValuesW(pperuser: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_SubscribeFeatureStateChangeNotification(subscription: Long, callback: Long, context: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_TranslateInfStringA(pszinffilename: Long, pszinstallsection: Long, psztranslatesection: Long, psztranslatekey: Long, pszbuffer: Long, cchbuffer: Int, pdwrequiredsize: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_TranslateInfStringExA(hinf: Long, pszinffilename: Long, psztranslatesection: Long, psztranslatekey: Long, pszbuffer: Long, dwbuffersize: Int, pdwrequiredsize: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_TranslateInfStringExW(hinf: Long, pszinffilename: Long, psztranslatesection: Long, psztranslatekey: Long, pszbuffer: Long, dwbuffersize: Int, pdwrequiredsize: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_TranslateInfStringW(pszinffilename: Long, pszinstallsection: Long, psztranslatesection: Long, psztranslatekey: Long, pszbuffer: Long, cchbuffer: Int, pdwrequiredsize: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_UnsubscribeFeatureStateChangeNotification(subscription: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_UserInstStubWrapperA(hwnd: Long, hinstance: Long, pszparms: Long, nshow: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_UserInstStubWrapperW(hwnd: Long, hinstance: Long, pszparms: Long, nshow: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_UserUnInstStubWrapperA(hwnd: Long, hinstance: Long, pszparms: Long, nshow: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_UserUnInstStubWrapperW(hwnd: Long, hinstance: Long, pszparms: Long, nshow: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_WINNLSEnableIME(param0: Long, param1: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_WINNLSGetEnableStatus(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_WINNLSGetIMEHotkey(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_WinWatchClose(hww: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_WinWatchDidStatusChange(hww: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_WinWatchGetClipList(hww: Long, prc: Long, size: Int, prd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_WinWatchNotify(hww: Long, notifycallback: Long, notifyparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_WinWatchOpen(hwnd: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_WldpCanExecuteBuffer(host: Long, options: Int, buffer: Long, buffersize: Int, auditinfo: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_WldpCanExecuteFile(host: Long, options: Int, filehandle: Long, auditinfo: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_WldpCanExecuteStream(host: Long, options: Int, stream: Long, auditinfo: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_WldpGetLockdownPolicy(hostinformation: Long, lockdownstate: Long, lockdownflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_WldpIsClassInApprovedList(classid: Long, hostinformation: Long, isapproved: Long, optionalflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_WldpIsDynamicCodePolicyEnabled(isenabled: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_WldpQueryDeviceSecurityInformation(information: Long, informationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_WldpQueryDynamicCodeTrust(filehandle: Long, baseimage: Long, imagesize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_WldpSetDynamicCodeTrust(filehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_WritePrivateProfileSectionA(lpappname: Long, lpstring: Long, lpfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_WritePrivateProfileSectionW(lpappname: Long, lpstring: Long, lpfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_WritePrivateProfileStringA(lpappname: Long, lpkeyname: Long, lpstring: Long, lpfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_WritePrivateProfileStringW(lpappname: Long, lpkeyname: Long, lpstring: Long, lpfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_WritePrivateProfileStructA(lpszsection: Long, lpszkey: Long, lpstruct: Long, usizestruct: Int, szfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_WritePrivateProfileStructW(lpszsection: Long, lpszkey: Long, lpstruct: Long, usizestruct: Int, szfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_WriteProfileSectionA(lpappname: Long, lpstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_WriteProfileSectionW(lpappname: Long, lpstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_WriteProfileStringA(lpappname: Long, lpkeyname: Long, lpstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_WriteProfileStringW(lpappname: Long, lpkeyname: Long, lpstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming__hread(hfile: Int, lpbuffer: Long, lbytes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming__hwrite(hfile: Int, lpbuffer: Long, lbytes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming__lclose(hfile: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming__lcreat(lppathname: Long, iattribute: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming__llseek(hfile: Int, loffset: Int, iorigin: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming__lopen(lppathname: Long, ireadwrite: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming__lread(hfile: Int, lpbuffer: Long, ubytes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming__lwrite(hfile: Int, lpbuffer: Long, ubytes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_uaw_lstrcmpW(string1: Long, string2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_uaw_lstrcmpiW(string1: Long, string2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_uaw_lstrlenW(string: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_uaw_wcschr(string: Long, character: Short): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_uaw_wcscpy(destination: Long, source: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_uaw_wcsicmp(string1: Long, string2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_uaw_wcslen(string: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_windowsprogramming_uaw_wcsrchr(string: Long, character: Short): Long
}

public actual fun AddDelBackupEntryA(lpcszfilelist: PCSTR, lpcszbackupdir: PCSTR, lpcszbasename: PCSTR, dwflags: UInt): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_AddDelBackupEntryA(lpcszfilelist, lpcszbackupdir, lpcszbasename, dwflags.toInt())

public actual fun AddDelBackupEntryW(lpcszfilelist: PCWSTR, lpcszbackupdir: PCWSTR, lpcszbasename: PCWSTR, dwflags: UInt): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_AddDelBackupEntryW(lpcszfilelist, lpcszbackupdir, lpcszbasename, dwflags.toInt())

public actual fun AdvInstallFileA(hwnd: HWND, lpszsourcedir: PCSTR, lpszsourcefile: PCSTR, lpszdestdir: PCSTR, lpszdestfile: PCSTR, dwflags: UInt, dwreserved: UInt): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_AdvInstallFileA(hwnd, lpszsourcedir, lpszsourcefile, lpszdestdir, lpszdestfile, dwflags.toInt(), dwreserved.toInt())

public actual fun AdvInstallFileW(hwnd: HWND, lpszsourcedir: PCWSTR, lpszsourcefile: PCWSTR, lpszdestdir: PCWSTR, lpszdestfile: PCWSTR, dwflags: UInt, dwreserved: UInt): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_AdvInstallFileW(hwnd, lpszsourcedir, lpszsourcefile, lpszdestdir, lpszdestfile, dwflags.toInt(), dwreserved.toInt())

public actual fun ApphelpCheckShellObject(objectclsid: Long, bshimifnecessary: BOOL, pullflags: Long): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_ApphelpCheckShellObject(objectclsid, bshimifnecessary, pullflags)

public actual fun CancelDeviceWakeupRequest(hdevice: HANDLE): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_CancelDeviceWakeupRequest(hdevice)

public actual fun CloseINFEngine(hinf: Long): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_CloseINFEngine(hinf)

public actual fun ConvertAuxiliaryCounterToPerformanceCounter(ullauxiliarycountervalue: ULong, lpperformancecountervalue: Long, lpconversionerror: Long): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_ConvertAuxiliaryCounterToPerformanceCounter(ullauxiliarycountervalue.toLong(), lpperformancecountervalue, lpconversionerror)

public actual fun ConvertPerformanceCounterToAuxiliaryCounter(ullperformancecountervalue: ULong, lpauxiliarycountervalue: Long, lpconversionerror: Long): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_ConvertPerformanceCounterToAuxiliaryCounter(ullperformancecountervalue.toLong(), lpauxiliarycountervalue, lpconversionerror)

public actual fun DCIBeginAccess(pdci: Long, x: Int, y: Int, dx: Int, dy: Int): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_DCIBeginAccess(pdci, x, y, dx, dy)

public actual fun DCICloseProvider(hdc: HDC) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_DCICloseProvider(hdc)
}

public actual fun DCICreateOffscreen(hdc: HDC, dwcompression: UInt, dwredmask: UInt, dwgreenmask: UInt, dwbluemask: UInt, dwwidth: UInt, dwheight: UInt, dwdcicaps: UInt, dwbitcount: UInt, lplpsurface: Long): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_DCICreateOffscreen(hdc, dwcompression.toInt(), dwredmask.toInt(), dwgreenmask.toInt(), dwbluemask.toInt(), dwwidth.toInt(), dwheight.toInt(), dwdcicaps.toInt(), dwbitcount.toInt(), lplpsurface)

public actual fun DCICreateOverlay(hdc: HDC, lpoffscreensurf: Long, lplpsurface: Long): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_DCICreateOverlay(hdc, lpoffscreensurf, lplpsurface)

public actual fun DCICreatePrimary(hdc: HDC, lplpsurface: Long): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_DCICreatePrimary(hdc, lplpsurface)

public actual fun DCIDestroy(pdci: Long) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_DCIDestroy(pdci)
}

public actual fun DCIDraw(pdci: Long): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_DCIDraw(pdci)

public actual fun DCIEndAccess(pdci: Long) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_DCIEndAccess(pdci)
}

public actual fun DCIEnum(hdc: HDC, lprdst: Long, lprsrc: Long, lpfncallback: Long, lpcontext: Long): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_DCIEnum(hdc, lprdst, lprsrc, lpfncallback, lpcontext)

public actual fun DCIOpenProvider(): HDC =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_DCIOpenProvider()

public actual fun DCISetClipList(pdci: Long, prd: Long): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_DCISetClipList(pdci, prd)

public actual fun DCISetDestination(pdci: Long, dst: Long, src: Long): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_DCISetDestination(pdci, dst, src)

public actual fun DCISetSrcDestClip(pdci: Long, srcrc: Long, destrc: Long, prd: Long): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_DCISetSrcDestClip(pdci, srcrc, destrc, prd)

public actual fun DelNodeA(pszfileordirname: PCSTR, dwflags: UInt): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_DelNodeA(pszfileordirname, dwflags.toInt())

public actual fun DelNodeRunDLL32W(hwnd: HWND, hinstance: HINSTANCE, pszparms: PWSTR, nshow: Int): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_DelNodeRunDLL32W(hwnd, hinstance, pszparms, nshow)

public actual fun DelNodeW(pszfileordirname: PCWSTR, dwflags: UInt): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_DelNodeW(pszfileordirname, dwflags.toInt())

public actual fun DnsHostnameToComputerNameA(hostname: PCSTR, computername: PSTR, nsize: Long): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_DnsHostnameToComputerNameA(hostname, computername, nsize)

public actual fun DnsHostnameToComputerNameW(hostname: PCWSTR, computername: PWSTR, nsize: Long): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_DnsHostnameToComputerNameW(hostname, computername, nsize)

public actual fun DosDateTimeToFileTime(wfatdate: UShort, wfattime: UShort, lpfiletime: Long): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_DosDateTimeToFileTime(wfatdate.toShort(), wfattime.toShort(), lpfiletime)

public actual fun EnableProcessOptionalXStateFeatures(features: ULong): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_EnableProcessOptionalXStateFeatures(features.toLong())

public actual fun ExecuteCabA(hwnd: HWND, pcab: Long, preserved: Long): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_ExecuteCabA(hwnd, pcab, preserved)

public actual fun ExecuteCabW(hwnd: HWND, pcab: Long, preserved: Long): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_ExecuteCabW(hwnd, pcab, preserved)

public actual fun ExtractFilesA(pszcabname: PCSTR, pszexpanddir: PCSTR, dwflags: UInt, pszfilelist: PCSTR, lpreserved: Long, dwreserved: UInt): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_ExtractFilesA(pszcabname, pszexpanddir, dwflags.toInt(), pszfilelist, lpreserved, dwreserved.toInt())

public actual fun ExtractFilesW(pszcabname: PCWSTR, pszexpanddir: PCWSTR, dwflags: UInt, pszfilelist: PCWSTR, lpreserved: Long, dwreserved: UInt): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_ExtractFilesW(pszcabname, pszexpanddir, dwflags.toInt(), pszfilelist, lpreserved, dwreserved.toInt())

public actual fun FileSaveMarkNotExistA(lpfilelist: PCSTR, lpdir: PCSTR, lpbasename: PCSTR): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_FileSaveMarkNotExistA(lpfilelist, lpdir, lpbasename)

public actual fun FileSaveMarkNotExistW(lpfilelist: PCWSTR, lpdir: PCWSTR, lpbasename: PCWSTR): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_FileSaveMarkNotExistW(lpfilelist, lpdir, lpbasename)

public actual fun FileSaveRestoreOnINFA(hwnd: HWND, psztitle: PCSTR, pszinf: PCSTR, pszsection: PCSTR, pszbackupdir: PCSTR, pszbasebackupfile: PCSTR, dwflags: UInt): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_FileSaveRestoreOnINFA(hwnd, psztitle, pszinf, pszsection, pszbackupdir, pszbasebackupfile, dwflags.toInt())

public actual fun FileSaveRestoreOnINFW(hwnd: HWND, psztitle: PCWSTR, pszinf: PCWSTR, pszsection: PCWSTR, pszbackupdir: PCWSTR, pszbasebackupfile: PCWSTR, dwflags: UInt): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_FileSaveRestoreOnINFW(hwnd, psztitle, pszinf, pszsection, pszbackupdir, pszbasebackupfile, dwflags.toInt())

public actual fun FileSaveRestoreW(hdlg: HWND, lpfilelist: PCWSTR, lpdir: PCWSTR, lpbasename: PCWSTR, dwflags: UInt): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_FileSaveRestoreW(hdlg, lpfilelist, lpdir, lpbasename, dwflags.toInt())

public actual fun FileTimeToDosDateTime(lpfiletime: Long, lpfatdate: Long, lpfattime: Long): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_FileTimeToDosDateTime(lpfiletime, lpfatdate, lpfattime)

public actual fun GdiEntry13(): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_GdiEntry13().toUInt()

public actual fun GetComputerNameA(lpbuffer: PSTR, nsize: Long): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_GetComputerNameA(lpbuffer, nsize)

public actual fun GetComputerNameW(lpbuffer: PWSTR, nsize: Long): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_GetComputerNameW(lpbuffer, nsize)

public actual fun GetCurrentHwProfileA(lphwprofileinfo: Long): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_GetCurrentHwProfileA(lphwprofileinfo)

public actual fun GetCurrentHwProfileW(lphwprofileinfo: Long): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_GetCurrentHwProfileW(lphwprofileinfo)

public actual fun GetDCRegionData(hdc: HDC, size: UInt, prd: Long): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_GetDCRegionData(hdc, size.toInt(), prd).toUInt()

public actual fun GetFeatureEnabledState(featureid: UInt, changetime: FEATURE_CHANGE_TIME): FEATURE_ENABLED_STATE =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_GetFeatureEnabledState(featureid.toInt(), changetime)

public actual fun GetFeatureVariant(featureid: UInt, changetime: FEATURE_CHANGE_TIME, payloadid: Long, hasnotification: Long): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_GetFeatureVariant(featureid.toInt(), changetime, payloadid, hasnotification).toUInt()

public actual fun GetFirmwareEnvironmentVariableA(lpname: PCSTR, lpguid: PCSTR, pbuffer: Long, nsize: UInt): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_GetFirmwareEnvironmentVariableA(lpname, lpguid, pbuffer, nsize.toInt()).toUInt()

public actual fun GetFirmwareEnvironmentVariableExA(lpname: PCSTR, lpguid: PCSTR, pbuffer: Long, nsize: UInt, pdwattribubutes: Long): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_GetFirmwareEnvironmentVariableExA(lpname, lpguid, pbuffer, nsize.toInt(), pdwattribubutes).toUInt()

public actual fun GetFirmwareEnvironmentVariableExW(lpname: PCWSTR, lpguid: PCWSTR, pbuffer: Long, nsize: UInt, pdwattribubutes: Long): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_GetFirmwareEnvironmentVariableExW(lpname, lpguid, pbuffer, nsize.toInt(), pdwattribubutes).toUInt()

public actual fun GetFirmwareEnvironmentVariableW(lpname: PCWSTR, lpguid: PCWSTR, pbuffer: Long, nsize: UInt): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_GetFirmwareEnvironmentVariableW(lpname, lpguid, pbuffer, nsize.toInt()).toUInt()

public actual fun GetPrivateProfileIntA(lpappname: PCSTR, lpkeyname: PCSTR, ndefault: Int, lpfilename: PCSTR): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_GetPrivateProfileIntA(lpappname, lpkeyname, ndefault, lpfilename).toUInt()

public actual fun GetPrivateProfileIntW(lpappname: PCWSTR, lpkeyname: PCWSTR, ndefault: Int, lpfilename: PCWSTR): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_GetPrivateProfileIntW(lpappname, lpkeyname, ndefault, lpfilename)

public actual fun GetPrivateProfileSectionA(lpappname: PCSTR, lpreturnedstring: PSTR, nsize: UInt, lpfilename: PCSTR): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_GetPrivateProfileSectionA(lpappname, lpreturnedstring, nsize.toInt(), lpfilename).toUInt()

public actual fun GetPrivateProfileSectionNamesA(lpszreturnbuffer: PSTR, nsize: UInt, lpfilename: PCSTR): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_GetPrivateProfileSectionNamesA(lpszreturnbuffer, nsize.toInt(), lpfilename).toUInt()

public actual fun GetPrivateProfileSectionNamesW(lpszreturnbuffer: PWSTR, nsize: UInt, lpfilename: PCWSTR): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_GetPrivateProfileSectionNamesW(lpszreturnbuffer, nsize.toInt(), lpfilename).toUInt()

public actual fun GetPrivateProfileSectionW(lpappname: PCWSTR, lpreturnedstring: PWSTR, nsize: UInt, lpfilename: PCWSTR): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_GetPrivateProfileSectionW(lpappname, lpreturnedstring, nsize.toInt(), lpfilename).toUInt()

public actual fun GetPrivateProfileStringA(lpappname: PCSTR, lpkeyname: PCSTR, lpdefault: PCSTR, lpreturnedstring: PSTR, nsize: UInt, lpfilename: PCSTR): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_GetPrivateProfileStringA(lpappname, lpkeyname, lpdefault, lpreturnedstring, nsize.toInt(), lpfilename).toUInt()

public actual fun GetPrivateProfileStringW(lpappname: PCWSTR, lpkeyname: PCWSTR, lpdefault: PCWSTR, lpreturnedstring: PWSTR, nsize: UInt, lpfilename: PCWSTR): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_GetPrivateProfileStringW(lpappname, lpkeyname, lpdefault, lpreturnedstring, nsize.toInt(), lpfilename).toUInt()

public actual fun GetPrivateProfileStructA(lpszsection: PCSTR, lpszkey: PCSTR, lpstruct: Long, usizestruct: UInt, szfile: PCSTR): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_GetPrivateProfileStructA(lpszsection, lpszkey, lpstruct, usizestruct.toInt(), szfile)

public actual fun GetPrivateProfileStructW(lpszsection: PCWSTR, lpszkey: PCWSTR, lpstruct: Long, usizestruct: UInt, szfile: PCWSTR): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_GetPrivateProfileStructW(lpszsection, lpszkey, lpstruct, usizestruct.toInt(), szfile)

public actual fun GetProfileIntA(lpappname: PCSTR, lpkeyname: PCSTR, ndefault: Int): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_GetProfileIntA(lpappname, lpkeyname, ndefault).toUInt()

public actual fun GetProfileIntW(lpappname: PCWSTR, lpkeyname: PCWSTR, ndefault: Int): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_GetProfileIntW(lpappname, lpkeyname, ndefault).toUInt()

public actual fun GetProfileSectionA(lpappname: PCSTR, lpreturnedstring: PSTR, nsize: UInt): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_GetProfileSectionA(lpappname, lpreturnedstring, nsize.toInt()).toUInt()

public actual fun GetProfileSectionW(lpappname: PCWSTR, lpreturnedstring: PWSTR, nsize: UInt): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_GetProfileSectionW(lpappname, lpreturnedstring, nsize.toInt()).toUInt()

public actual fun GetProfileStringA(lpappname: PCSTR, lpkeyname: PCSTR, lpdefault: PCSTR, lpreturnedstring: PSTR, nsize: UInt): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_GetProfileStringA(lpappname, lpkeyname, lpdefault, lpreturnedstring, nsize.toInt()).toUInt()

public actual fun GetProfileStringW(lpappname: PCWSTR, lpkeyname: PCWSTR, lpdefault: PCWSTR, lpreturnedstring: PWSTR, nsize: UInt): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_GetProfileStringW(lpappname, lpkeyname, lpdefault, lpreturnedstring, nsize.toInt()).toUInt()

public actual fun GetSystemRegistryQuota(pdwquotaallowed: Long, pdwquotaused: Long): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_GetSystemRegistryQuota(pdwquotaallowed, pdwquotaused)

public actual fun GetThreadEnabledXStateFeatures(): ULong =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_GetThreadEnabledXStateFeatures().toULong()

public actual fun GetUserNameA(lpbuffer: PSTR, pcbbuffer: Long): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_GetUserNameA(lpbuffer, pcbbuffer)

public actual fun GetUserNameW(lpbuffer: PWSTR, pcbbuffer: Long): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_GetUserNameW(lpbuffer, pcbbuffer)

public actual fun GetVersionFromFileA(lpszfilename: PCSTR, pdwmsver: Long, pdwlsver: Long, bversion: BOOL): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_GetVersionFromFileA(lpszfilename, pdwmsver, pdwlsver, bversion)

public actual fun GetVersionFromFileExA(lpszfilename: PCSTR, pdwmsver: Long, pdwlsver: Long, bversion: BOOL): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_GetVersionFromFileExA(lpszfilename, pdwmsver, pdwlsver, bversion)

public actual fun GetVersionFromFileExW(lpszfilename: PCWSTR, pdwmsver: Long, pdwlsver: Long, bversion: BOOL): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_GetVersionFromFileExW(lpszfilename, pdwmsver, pdwlsver, bversion)

public actual fun GetVersionFromFileW(lpszfilename: PCWSTR, pdwmsver: Long, pdwlsver: Long, bversion: BOOL): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_GetVersionFromFileW(lpszfilename, pdwmsver, pdwlsver, bversion)

public actual fun GetWindowRegionData(hwnd: HWND, size: UInt, prd: Long): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_GetWindowRegionData(hwnd, size.toInt(), prd).toUInt()

public actual fun GlobalCompact(dwminfree: UInt): ULong =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_GlobalCompact(dwminfree.toInt()).toULong()

public actual fun GlobalFix(hmem: HGLOBAL) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_GlobalFix(hmem)
}

public actual fun GlobalUnWire(hmem: HGLOBAL): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_GlobalUnWire(hmem)

public actual fun GlobalUnfix(hmem: HGLOBAL) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_GlobalUnfix(hmem)
}

public actual fun GlobalWire(hmem: HGLOBAL): Long =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_GlobalWire(hmem)

public actual fun IMPGetIMEA(param0: HWND, param1: Long): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_IMPGetIMEA(param0, param1)

public actual fun IMPGetIMEW(param0: HWND, param1: Long): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_IMPGetIMEW(param0, param1)

public actual fun IMPQueryIMEA(param0: Long): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_IMPQueryIMEA(param0)

public actual fun IMPQueryIMEW(param0: Long): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_IMPQueryIMEW(param0)

public actual fun IMPSetIMEA(param0: HWND, param1: Long): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_IMPSetIMEA(param0, param1)

public actual fun IMPSetIMEW(param0: HWND, param1: Long): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_IMPSetIMEW(param0, param1)

public actual fun IsApiSetImplemented(contract: PCSTR): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_IsApiSetImplemented(contract)

public actual fun IsBadHugeReadPtr(lp: Long, ucb: ULong): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_IsBadHugeReadPtr(lp, ucb.toLong())

public actual fun IsBadHugeWritePtr(lp: Long, ucb: ULong): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_IsBadHugeWritePtr(lp, ucb.toLong())

public actual fun IsNTAdmin(dwreserved: UInt, lpdwreserved: Long): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_IsNTAdmin(dwreserved.toInt(), lpdwreserved)

public actual fun IsNativeVhdBoot(nativevhdboot: Long): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_IsNativeVhdBoot(nativevhdboot)

public actual fun IsTokenUntrusted(tokenhandle: HANDLE): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_IsTokenUntrusted(tokenhandle)

public actual fun LaunchINFSectionExW(hwnd: HWND, hinstance: HINSTANCE, pszparms: PCWSTR, nshow: Int): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_LaunchINFSectionExW(hwnd, hinstance, pszparms, nshow)

public actual fun LaunchINFSectionW(hwndowner: HWND, hinstance: HINSTANCE, pszparams: PWSTR, nshow: Int): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_LaunchINFSectionW(hwndowner, hinstance, pszparams, nshow)

public actual fun LocalCompact(uminfree: UInt): ULong =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_LocalCompact(uminfree.toInt()).toULong()

public actual fun LocalShrink(hmem: HLOCAL, cbnewsize: UInt): ULong =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_LocalShrink(hmem, cbnewsize.toInt()).toULong()

public actual fun MulDiv(nnumber: Int, nnumerator: Int, ndenominator: Int): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_MulDiv(nnumber, nnumerator, ndenominator)

public actual fun NeedReboot(dwrebootcheck: UInt): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_NeedReboot(dwrebootcheck.toInt())

public actual fun NeedRebootInit(): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_NeedRebootInit().toUInt()

public actual fun OpenINFEngineA(pszinffilename: PCSTR, pszinstallsection: PCSTR, dwflags: UInt, phinf: Long, pvreserved: Long): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_OpenINFEngineA(pszinffilename, pszinstallsection, dwflags.toInt(), phinf, pvreserved)

public actual fun OpenINFEngineW(pszinffilename: PCWSTR, pszinstallsection: PCWSTR, dwflags: UInt, phinf: Long, pvreserved: Long): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_OpenINFEngineW(pszinffilename, pszinstallsection, dwflags.toInt(), phinf, pvreserved)

public actual fun OpenMutexA(dwdesiredaccess: UInt, binherithandle: BOOL, lpname: PCSTR): HANDLE =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_OpenMutexA(dwdesiredaccess.toInt(), binherithandle, lpname)

public actual fun OpenSemaphoreA(dwdesiredaccess: UInt, binherithandle: BOOL, lpname: PCSTR): HANDLE =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_OpenSemaphoreA(dwdesiredaccess.toInt(), binherithandle, lpname)

public actual fun QueryAuxiliaryCounterFrequency(lpauxiliarycounterfrequency: Long): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_QueryAuxiliaryCounterFrequency(lpauxiliarycounterfrequency)

public actual fun QueryIdleProcessorCycleTime(bufferlength: Long, processoridlecycletime: Long): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_QueryIdleProcessorCycleTime(bufferlength, processoridlecycletime)

public actual fun QueryIdleProcessorCycleTimeEx(group: UShort, bufferlength: Long, processoridlecycletime: Long): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_QueryIdleProcessorCycleTimeEx(group.toShort(), bufferlength, processoridlecycletime)

public actual fun QueryInterruptTime(lpinterrupttime: Long) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_QueryInterruptTime(lpinterrupttime)
}

public actual fun QueryInterruptTimePrecise(lpinterrupttimeprecise: Long) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_QueryInterruptTimePrecise(lpinterrupttimeprecise)
}

public actual fun QueryProcessCycleTime(processhandle: HANDLE, cycletime: Long): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_QueryProcessCycleTime(processhandle, cycletime)

public actual fun QueryThreadCycleTime(threadhandle: HANDLE, cycletime: Long): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_QueryThreadCycleTime(threadhandle, cycletime)

public actual fun QueryUnbiasedInterruptTime(unbiasedtime: Long): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_QueryUnbiasedInterruptTime(unbiasedtime)

public actual fun QueryUnbiasedInterruptTimePrecise(lpunbiasedinterrupttimeprecise: Long) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_QueryUnbiasedInterruptTimePrecise(lpunbiasedinterrupttimeprecise)
}

public actual fun RaiseCustomSystemEventTrigger(customsystemeventtriggerconfig: Long): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_RaiseCustomSystemEventTrigger(customsystemeventtriggerconfig).toUInt()

public actual fun RebootCheckOnInstallA(hwnd: HWND, pszinf: PCSTR, pszsec: PCSTR, dwreserved: UInt): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_RebootCheckOnInstallA(hwnd, pszinf, pszsec, dwreserved.toInt())

public actual fun RebootCheckOnInstallW(hwnd: HWND, pszinf: PCWSTR, pszsec: PCWSTR, dwreserved: UInt): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_RebootCheckOnInstallW(hwnd, pszinf, pszsec, dwreserved.toInt())

public actual fun RecordFeatureError(featureid: UInt, error: Long) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_RecordFeatureError(featureid.toInt(), error)
}

public actual fun RecordFeatureUsage(featureid: UInt, kind: UInt, addend: UInt, originname: PCSTR) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_RecordFeatureUsage(featureid.toInt(), kind.toInt(), addend.toInt(), originname)
}

public actual fun RegInstallA(hmod: HMODULE, pszsection: PCSTR, psttable: Long): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_RegInstallA(hmod, pszsection, psttable)

public actual fun RegInstallW(hmod: HMODULE, pszsection: PCWSTR, psttable: Long): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_RegInstallW(hmod, pszsection, psttable)

public actual fun RegRestoreAllA(hwnd: HWND, psztitlestring: PCSTR, hkbckupkey: HKEY): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_RegRestoreAllA(hwnd, psztitlestring, hkbckupkey)

public actual fun RegRestoreAllW(hwnd: HWND, psztitlestring: PCWSTR, hkbckupkey: HKEY): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_RegRestoreAllW(hwnd, psztitlestring, hkbckupkey)

public actual fun RegSaveRestoreA(hwnd: HWND, psztitlestring: PCSTR, hkbckupkey: HKEY, pcszrootkey: PCSTR, pcszsubkey: PCSTR, pcszvaluename: PCSTR, dwflags: UInt): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_RegSaveRestoreA(hwnd, psztitlestring, hkbckupkey, pcszrootkey, pcszsubkey, pcszvaluename, dwflags.toInt())

public actual fun RegSaveRestoreOnINFA(hwnd: HWND, psztitle: PCSTR, pszinf: PCSTR, pszsection: PCSTR, hhklmbackkey: HKEY, hhkcubackkey: HKEY, dwflags: UInt): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_RegSaveRestoreOnINFA(hwnd, psztitle, pszinf, pszsection, hhklmbackkey, hhkcubackkey, dwflags.toInt())

public actual fun RegSaveRestoreOnINFW(hwnd: HWND, psztitle: PCWSTR, pszinf: PCWSTR, pszsection: PCWSTR, hhklmbackkey: HKEY, hhkcubackkey: HKEY, dwflags: UInt): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_RegSaveRestoreOnINFW(hwnd, psztitle, pszinf, pszsection, hhklmbackkey, hhkcubackkey, dwflags.toInt())

public actual fun RegSaveRestoreW(hwnd: HWND, psztitlestring: PCWSTR, hkbckupkey: HKEY, pcszrootkey: PCWSTR, pcszsubkey: PCWSTR, pcszvaluename: PCWSTR, dwflags: UInt): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_RegSaveRestoreW(hwnd, psztitlestring, hkbckupkey, pcszrootkey, pcszsubkey, pcszvaluename, dwflags.toInt())

public actual fun ReplacePartitionUnit(targetpartition: PCWSTR, sparepartition: PCWSTR, flags: UInt): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_ReplacePartitionUnit(targetpartition, sparepartition, flags.toInt())

public actual fun RequestDeviceWakeup(hdevice: HANDLE): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_RequestDeviceWakeup(hdevice)

public actual fun RtlAnsiStringToUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_RtlAnsiStringToUnicodeString(destinationstring, sourcestring, allocatedestinationstring)

public actual fun RtlCharToInteger(string: Long, base: UInt, value: Long): NTSTATUS =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_RtlCharToInteger(string, base.toInt(), value)

public actual fun RtlFreeAnsiString(ansistring: Long) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_RtlFreeAnsiString(ansistring)
}

public actual fun RtlFreeOemString(oemstring: Long) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_RtlFreeOemString(oemstring)
}

public actual fun RtlFreeUnicodeString(unicodestring: Long) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_RtlFreeUnicodeString(unicodestring)
}

public actual fun RtlGetReturnAddressHijackTarget(): ULong =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_RtlGetReturnAddressHijackTarget().toULong()

public actual fun RtlInitAnsiString(destinationstring: Long, sourcestring: Long) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_RtlInitAnsiString(destinationstring, sourcestring)
}

public actual fun RtlInitAnsiStringEx(destinationstring: Long, sourcestring: Long): NTSTATUS =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_RtlInitAnsiStringEx(destinationstring, sourcestring)

public actual fun RtlInitString(destinationstring: Long, sourcestring: Long) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_RtlInitString(destinationstring, sourcestring)
}

public actual fun RtlInitStringEx(destinationstring: Long, sourcestring: Long): NTSTATUS =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_RtlInitStringEx(destinationstring, sourcestring)

public actual fun RtlInitUnicodeString(destinationstring: Long, sourcestring: PCWSTR) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_RtlInitUnicodeString(destinationstring, sourcestring)
}

public actual fun RtlIsNameLegalDOS8Dot3(name: Long, oemname: Long, namecontainsspaces: Long): Boolean =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_RtlIsNameLegalDOS8Dot3(name, oemname, namecontainsspaces)

public actual fun RtlLocalTimeToSystemTime(localtime: Long, systemtime: Long): NTSTATUS =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_RtlLocalTimeToSystemTime(localtime, systemtime)

public actual fun RtlRaiseCustomSystemEventTrigger(triggerconfig: Long): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_RtlRaiseCustomSystemEventTrigger(triggerconfig).toUInt()

public actual fun RtlTimeToSecondsSince1970(time: Long, elapsedseconds: Long): Boolean =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_RtlTimeToSecondsSince1970(time, elapsedseconds)

public actual fun RtlUnicodeStringToAnsiString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_RtlUnicodeStringToAnsiString(destinationstring, sourcestring, allocatedestinationstring)

public actual fun RtlUnicodeStringToOemString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_RtlUnicodeStringToOemString(destinationstring, sourcestring, allocatedestinationstring)

public actual fun RtlUnicodeToMultiByteSize(bytesinmultibytestring: Long, unicodestring: PCWSTR, bytesinunicodestring: UInt): NTSTATUS =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_RtlUnicodeToMultiByteSize(bytesinmultibytestring, unicodestring, bytesinunicodestring.toInt())

public actual fun RtlUniform(seed: Long): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_RtlUniform(seed).toUInt()

public actual fun RunSetupCommandA(hwnd: HWND, szcmdname: PCSTR, szinfsection: PCSTR, szdir: PCSTR, lpsztitle: PCSTR, phexe: Long, dwflags: UInt, pvreserved: Long): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_RunSetupCommandA(hwnd, szcmdname, szinfsection, szdir, lpsztitle, phexe, dwflags.toInt(), pvreserved)

public actual fun RunSetupCommandW(hwnd: HWND, szcmdname: PCWSTR, szinfsection: PCWSTR, szdir: PCWSTR, lpsztitle: PCWSTR, phexe: Long, dwflags: UInt, pvreserved: Long): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_RunSetupCommandW(hwnd, szcmdname, szinfsection, szdir, lpsztitle, phexe, dwflags.toInt(), pvreserved)

public actual fun SendIMEMessageExA(param0: HWND, param1: LPARAM): LRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_SendIMEMessageExA(param0, param1)

public actual fun SendIMEMessageExW(param0: HWND, param1: LPARAM): LRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_SendIMEMessageExW(param0, param1)

public actual fun SetEnvironmentStringsA(newenvironment: PCSTR): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_SetEnvironmentStringsA(newenvironment)

public actual fun SetFirmwareEnvironmentVariableA(lpname: PCSTR, lpguid: PCSTR, pvalue: Long, nsize: UInt): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_SetFirmwareEnvironmentVariableA(lpname, lpguid, pvalue, nsize.toInt())

public actual fun SetFirmwareEnvironmentVariableExA(lpname: PCSTR, lpguid: PCSTR, pvalue: Long, nsize: UInt, dwattributes: UInt): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_SetFirmwareEnvironmentVariableExA(lpname, lpguid, pvalue, nsize.toInt(), dwattributes.toInt())

public actual fun SetFirmwareEnvironmentVariableExW(lpname: PCWSTR, lpguid: PCWSTR, pvalue: Long, nsize: UInt, dwattributes: UInt): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_SetFirmwareEnvironmentVariableExW(lpname, lpguid, pvalue, nsize.toInt(), dwattributes.toInt())

public actual fun SetFirmwareEnvironmentVariableW(lpname: PCWSTR, lpguid: PCWSTR, pvalue: Long, nsize: UInt): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_SetFirmwareEnvironmentVariableW(lpname, lpguid, pvalue, nsize.toInt())

public actual fun SetHandleCount(unumber: UInt): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_SetHandleCount(unumber.toInt()).toUInt()

public actual fun SetMessageWaitingIndicator(hmsgindicator: HANDLE, ulmsgcount: UInt): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_SetMessageWaitingIndicator(hmsgindicator, ulmsgcount.toInt())

public actual fun SetPerUserSecValuesA(pperuser: Long): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_SetPerUserSecValuesA(pperuser)

public actual fun SetPerUserSecValuesW(pperuser: Long): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_SetPerUserSecValuesW(pperuser)

public actual fun SubscribeFeatureStateChangeNotification(subscription: Long, callback: PFEATURE_STATE_CHANGE_CALLBACK, context: Long) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_SubscribeFeatureStateChangeNotification(subscription, callback.toLong(), context)
}

public actual fun TranslateInfStringA(pszinffilename: PCSTR, pszinstallsection: PCSTR, psztranslatesection: PCSTR, psztranslatekey: PCSTR, pszbuffer: PSTR, cchbuffer: UInt, pdwrequiredsize: Long, pvreserved: Long): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_TranslateInfStringA(pszinffilename, pszinstallsection, psztranslatesection, psztranslatekey, pszbuffer, cchbuffer.toInt(), pdwrequiredsize, pvreserved)

public actual fun TranslateInfStringExA(hinf: Long, pszinffilename: PCSTR, psztranslatesection: PCSTR, psztranslatekey: PCSTR, pszbuffer: PSTR, dwbuffersize: UInt, pdwrequiredsize: Long, pvreserved: Long): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_TranslateInfStringExA(hinf, pszinffilename, psztranslatesection, psztranslatekey, pszbuffer, dwbuffersize.toInt(), pdwrequiredsize, pvreserved)

public actual fun TranslateInfStringExW(hinf: Long, pszinffilename: PCWSTR, psztranslatesection: PCWSTR, psztranslatekey: PCWSTR, pszbuffer: PWSTR, dwbuffersize: UInt, pdwrequiredsize: Long, pvreserved: Long): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_TranslateInfStringExW(hinf, pszinffilename, psztranslatesection, psztranslatekey, pszbuffer, dwbuffersize.toInt(), pdwrequiredsize, pvreserved)

public actual fun TranslateInfStringW(pszinffilename: PCWSTR, pszinstallsection: PCWSTR, psztranslatesection: PCWSTR, psztranslatekey: PCWSTR, pszbuffer: PWSTR, cchbuffer: UInt, pdwrequiredsize: Long, pvreserved: Long): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_TranslateInfStringW(pszinffilename, pszinstallsection, psztranslatesection, psztranslatekey, pszbuffer, cchbuffer.toInt(), pdwrequiredsize, pvreserved)

public actual fun UnsubscribeFeatureStateChangeNotification(subscription: FEATURE_STATE_CHANGE_SUBSCRIPTION) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_UnsubscribeFeatureStateChangeNotification(subscription)
}

public actual fun UserInstStubWrapperA(hwnd: HWND, hinstance: HINSTANCE, pszparms: PCSTR, nshow: Int): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_UserInstStubWrapperA(hwnd, hinstance, pszparms, nshow)

public actual fun UserInstStubWrapperW(hwnd: HWND, hinstance: HINSTANCE, pszparms: PCWSTR, nshow: Int): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_UserInstStubWrapperW(hwnd, hinstance, pszparms, nshow)

public actual fun UserUnInstStubWrapperA(hwnd: HWND, hinstance: HINSTANCE, pszparms: PCSTR, nshow: Int): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_UserUnInstStubWrapperA(hwnd, hinstance, pszparms, nshow)

public actual fun UserUnInstStubWrapperW(hwnd: HWND, hinstance: HINSTANCE, pszparms: PCWSTR, nshow: Int): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_UserUnInstStubWrapperW(hwnd, hinstance, pszparms, nshow)

public actual fun WINNLSEnableIME(param0: HWND, param1: BOOL): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_WINNLSEnableIME(param0, param1)

public actual fun WINNLSGetEnableStatus(param0: HWND): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_WINNLSGetEnableStatus(param0)

public actual fun WINNLSGetIMEHotkey(param0: HWND): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_WINNLSGetIMEHotkey(param0).toUInt()

public actual fun WinWatchClose(hww: HWINWATCH) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_WinWatchClose(hww)
}

public actual fun WinWatchDidStatusChange(hww: HWINWATCH): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_WinWatchDidStatusChange(hww)

public actual fun WinWatchGetClipList(hww: HWINWATCH, prc: Long, size: UInt, prd: Long): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_WinWatchGetClipList(hww, prc, size.toInt(), prd).toUInt()

public actual fun WinWatchNotify(hww: HWINWATCH, notifycallback: WINWATCHNOTIFYPROC, notifyparam: LPARAM): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_WinWatchNotify(hww, notifycallback.toLong(), notifyparam)

public actual fun WinWatchOpen(hwnd: HWND): HWINWATCH =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_WinWatchOpen(hwnd)

public actual fun WldpCanExecuteBuffer(host: Long, options: WLDP_EXECUTION_EVALUATION_OPTIONS, buffer: Long, buffersize: UInt, auditinfo: PCWSTR, result: Long): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_WldpCanExecuteBuffer(host, options, buffer, buffersize.toInt(), auditinfo, result)

public actual fun WldpCanExecuteFile(host: Long, options: WLDP_EXECUTION_EVALUATION_OPTIONS, filehandle: HANDLE, auditinfo: PCWSTR, result: Long): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_WldpCanExecuteFile(host, options, filehandle, auditinfo, result)

public actual fun WldpCanExecuteStream(host: Long, options: WLDP_EXECUTION_EVALUATION_OPTIONS, stream: Long, auditinfo: PCWSTR, result: Long): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_WldpCanExecuteStream(host, options, stream, auditinfo, result)

public actual fun WldpGetLockdownPolicy(hostinformation: Long, lockdownstate: Long, lockdownflags: UInt): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_WldpGetLockdownPolicy(hostinformation, lockdownstate, lockdownflags.toInt())

public actual fun WldpIsClassInApprovedList(classid: Long, hostinformation: Long, isapproved: Long, optionalflags: UInt): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_WldpIsClassInApprovedList(classid, hostinformation, isapproved, optionalflags.toInt())

public actual fun WldpIsDynamicCodePolicyEnabled(isenabled: Long): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_WldpIsDynamicCodePolicyEnabled(isenabled)

public actual fun WldpQueryDeviceSecurityInformation(information: Long, informationlength: UInt, returnlength: Long): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_WldpQueryDeviceSecurityInformation(information, informationlength.toInt(), returnlength)

public actual fun WldpQueryDynamicCodeTrust(filehandle: HANDLE, baseimage: Long, imagesize: UInt): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_WldpQueryDynamicCodeTrust(filehandle, baseimage, imagesize.toInt())

public actual fun WldpSetDynamicCodeTrust(filehandle: HANDLE): HRESULT =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_WldpSetDynamicCodeTrust(filehandle)

public actual fun WritePrivateProfileSectionA(lpappname: PCSTR, lpstring: PCSTR, lpfilename: PCSTR): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_WritePrivateProfileSectionA(lpappname, lpstring, lpfilename)

public actual fun WritePrivateProfileSectionW(lpappname: PCWSTR, lpstring: PCWSTR, lpfilename: PCWSTR): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_WritePrivateProfileSectionW(lpappname, lpstring, lpfilename)

public actual fun WritePrivateProfileStringA(lpappname: PCSTR, lpkeyname: PCSTR, lpstring: PCSTR, lpfilename: PCSTR): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_WritePrivateProfileStringA(lpappname, lpkeyname, lpstring, lpfilename)

public actual fun WritePrivateProfileStringW(lpappname: PCWSTR, lpkeyname: PCWSTR, lpstring: PCWSTR, lpfilename: PCWSTR): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_WritePrivateProfileStringW(lpappname, lpkeyname, lpstring, lpfilename)

public actual fun WritePrivateProfileStructA(lpszsection: PCSTR, lpszkey: PCSTR, lpstruct: Long, usizestruct: UInt, szfile: PCSTR): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_WritePrivateProfileStructA(lpszsection, lpszkey, lpstruct, usizestruct.toInt(), szfile)

public actual fun WritePrivateProfileStructW(lpszsection: PCWSTR, lpszkey: PCWSTR, lpstruct: Long, usizestruct: UInt, szfile: PCWSTR): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_WritePrivateProfileStructW(lpszsection, lpszkey, lpstruct, usizestruct.toInt(), szfile)

public actual fun WriteProfileSectionA(lpappname: PCSTR, lpstring: PCSTR): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_WriteProfileSectionA(lpappname, lpstring)

public actual fun WriteProfileSectionW(lpappname: PCWSTR, lpstring: PCWSTR): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_WriteProfileSectionW(lpappname, lpstring)

public actual fun WriteProfileStringA(lpappname: PCSTR, lpkeyname: PCSTR, lpstring: PCSTR): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_WriteProfileStringA(lpappname, lpkeyname, lpstring)

public actual fun WriteProfileStringW(lpappname: PCWSTR, lpkeyname: PCWSTR, lpstring: PCWSTR): BOOL =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_WriteProfileStringW(lpappname, lpkeyname, lpstring)

public actual fun _hread(hfile: Int, lpbuffer: Long, lbytes: Int): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming__hread(hfile, lpbuffer, lbytes)

public actual fun _hwrite(hfile: Int, lpbuffer: PCSTR, lbytes: Int): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming__hwrite(hfile, lpbuffer, lbytes)

public actual fun _lclose(hfile: Int): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming__lclose(hfile)

public actual fun _lcreat(lppathname: PCSTR, iattribute: Int): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming__lcreat(lppathname, iattribute)

public actual fun _llseek(hfile: Int, loffset: Int, iorigin: Int): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming__llseek(hfile, loffset, iorigin)

public actual fun _lopen(lppathname: PCSTR, ireadwrite: Int): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming__lopen(lppathname, ireadwrite)

public actual fun _lread(hfile: Int, lpbuffer: Long, ubytes: UInt): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming__lread(hfile, lpbuffer, ubytes.toInt()).toUInt()

public actual fun _lwrite(hfile: Int, lpbuffer: PCSTR, ubytes: UInt): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming__lwrite(hfile, lpbuffer, ubytes.toInt()).toUInt()

public actual fun uaw_lstrcmpW(string1: Long, string2: Long): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_uaw_lstrcmpW(string1, string2)

public actual fun uaw_lstrcmpiW(string1: Long, string2: Long): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_uaw_lstrcmpiW(string1, string2)

public actual fun uaw_lstrlenW(string: Long): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_uaw_lstrlenW(string)

public actual fun uaw_wcschr(string: Long, character: UShort): Long =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_uaw_wcschr(string, character.toShort())

public actual fun uaw_wcscpy(destination: Long, source: Long): Long =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_uaw_wcscpy(destination, source)

public actual fun uaw_wcsicmp(string1: Long, string2: Long): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_uaw_wcsicmp(string1, string2)

public actual fun uaw_wcslen(string: Long): ULong =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_uaw_wcslen(string).toULong()

public actual fun uaw_wcsrchr(string: Long, character: UShort): Long =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssys_windows_win32_system_windowsprogramming_uaw_wcsrchr(string, character.toShort())
