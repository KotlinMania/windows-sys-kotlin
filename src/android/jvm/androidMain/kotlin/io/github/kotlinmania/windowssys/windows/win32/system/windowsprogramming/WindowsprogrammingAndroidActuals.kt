@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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
    external fun windowssysWindowsWin32SystemWindowsprogrammingAddDelBackupEntryA(lpcszfilelist: Long, lpcszbackupdir: Long, lpcszbasename: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingAddDelBackupEntryW(lpcszfilelist: Long, lpcszbackupdir: Long, lpcszbasename: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingAdvInstallFileA(hwnd: Long, lpszsourcedir: Long, lpszsourcefile: Long, lpszdestdir: Long, lpszdestfile: Long, dwflags: Int, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingAdvInstallFileW(hwnd: Long, lpszsourcedir: Long, lpszsourcefile: Long, lpszdestdir: Long, lpszdestfile: Long, dwflags: Int, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingApphelpCheckShellObject(objectclsid: Long, bshimifnecessary: Int, pullflags: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingCancelDeviceWakeupRequest(hdevice: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingCloseINFEngine(hinf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingConvertAuxiliaryCounterToPerformanceCounter(ullauxiliarycountervalue: Long, lpperformancecountervalue: Long, lpconversionerror: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingConvertPerformanceCounterToAuxiliaryCounter(ullperformancecountervalue: Long, lpauxiliarycountervalue: Long, lpconversionerror: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingDCIBeginAccess(pdci: Long, x: Int, y: Int, dx: Int, dy: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingDCICloseProvider(hdc: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingDCICreateOffscreen(hdc: Long, dwcompression: Int, dwredmask: Int, dwgreenmask: Int, dwbluemask: Int, dwwidth: Int, dwheight: Int, dwdcicaps: Int, dwbitcount: Int, lplpsurface: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingDCICreateOverlay(hdc: Long, lpoffscreensurf: Long, lplpsurface: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingDCICreatePrimary(hdc: Long, lplpsurface: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingDCIDestroy(pdci: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingDCIDraw(pdci: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingDCIEndAccess(pdci: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingDCIEnum(hdc: Long, lprdst: Long, lprsrc: Long, lpfncallback: Long, lpcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingDCIOpenProvider(): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingDCISetClipList(pdci: Long, prd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingDCISetDestination(pdci: Long, dst: Long, src: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingDCISetSrcDestClip(pdci: Long, srcrc: Long, destrc: Long, prd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingDelNodeA(pszfileordirname: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingDelNodeRunDLL32W(hwnd: Long, hinstance: Long, pszparms: Long, nshow: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingDelNodeW(pszfileordirname: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingDnsHostnameToComputerNameA(hostname: Long, computername: Long, nsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingDnsHostnameToComputerNameW(hostname: Long, computername: Long, nsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingDosDateTimeToFileTime(wfatdate: Short, wfattime: Short, lpfiletime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingEnableProcessOptionalXStateFeatures(features: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingExecuteCabA(hwnd: Long, pcab: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingExecuteCabW(hwnd: Long, pcab: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingExtractFilesA(pszcabname: Long, pszexpanddir: Long, dwflags: Int, pszfilelist: Long, lpreserved: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingExtractFilesW(pszcabname: Long, pszexpanddir: Long, dwflags: Int, pszfilelist: Long, lpreserved: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingFileSaveMarkNotExistA(lpfilelist: Long, lpdir: Long, lpbasename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingFileSaveMarkNotExistW(lpfilelist: Long, lpdir: Long, lpbasename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingFileSaveRestoreOnINFA(hwnd: Long, psztitle: Long, pszinf: Long, pszsection: Long, pszbackupdir: Long, pszbasebackupfile: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingFileSaveRestoreOnINFW(hwnd: Long, psztitle: Long, pszinf: Long, pszsection: Long, pszbackupdir: Long, pszbasebackupfile: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingFileSaveRestoreW(hdlg: Long, lpfilelist: Long, lpdir: Long, lpbasename: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingFileTimeToDosDateTime(lpfiletime: Long, lpfatdate: Long, lpfattime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingGdiEntry13(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingGetComputerNameA(lpbuffer: Long, nsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingGetComputerNameW(lpbuffer: Long, nsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingGetCurrentHwProfileA(lphwprofileinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingGetCurrentHwProfileW(lphwprofileinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingGetDCRegionData(hdc: Long, size: Int, prd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingGetFeatureEnabledState(featureid: Int, changetime: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingGetFeatureVariant(featureid: Int, changetime: Int, payloadid: Long, hasnotification: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingGetFirmwareEnvironmentVariableA(lpname: Long, lpguid: Long, pbuffer: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingGetFirmwareEnvironmentVariableExA(lpname: Long, lpguid: Long, pbuffer: Long, nsize: Int, pdwattribubutes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingGetFirmwareEnvironmentVariableExW(lpname: Long, lpguid: Long, pbuffer: Long, nsize: Int, pdwattribubutes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingGetFirmwareEnvironmentVariableW(lpname: Long, lpguid: Long, pbuffer: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileIntA(lpappname: Long, lpkeyname: Long, ndefault: Int, lpfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileIntW(lpappname: Long, lpkeyname: Long, ndefault: Int, lpfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileSectionA(lpappname: Long, lpreturnedstring: Long, nsize: Int, lpfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileSectionNamesA(lpszreturnbuffer: Long, nsize: Int, lpfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileSectionNamesW(lpszreturnbuffer: Long, nsize: Int, lpfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileSectionW(lpappname: Long, lpreturnedstring: Long, nsize: Int, lpfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileStringA(lpappname: Long, lpkeyname: Long, lpdefault: Long, lpreturnedstring: Long, nsize: Int, lpfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileStringW(lpappname: Long, lpkeyname: Long, lpdefault: Long, lpreturnedstring: Long, nsize: Int, lpfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileStructA(lpszsection: Long, lpszkey: Long, lpstruct: Long, usizestruct: Int, szfile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileStructW(lpszsection: Long, lpszkey: Long, lpstruct: Long, usizestruct: Int, szfile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingGetProfileIntA(lpappname: Long, lpkeyname: Long, ndefault: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingGetProfileIntW(lpappname: Long, lpkeyname: Long, ndefault: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingGetProfileSectionA(lpappname: Long, lpreturnedstring: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingGetProfileSectionW(lpappname: Long, lpreturnedstring: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingGetProfileStringA(lpappname: Long, lpkeyname: Long, lpdefault: Long, lpreturnedstring: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingGetProfileStringW(lpappname: Long, lpkeyname: Long, lpdefault: Long, lpreturnedstring: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingGetSystemRegistryQuota(pdwquotaallowed: Long, pdwquotaused: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingGetThreadEnabledXStateFeatures(): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingGetUserNameA(lpbuffer: Long, pcbbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingGetUserNameW(lpbuffer: Long, pcbbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingGetVersionFromFileA(lpszfilename: Long, pdwmsver: Long, pdwlsver: Long, bversion: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingGetVersionFromFileExA(lpszfilename: Long, pdwmsver: Long, pdwlsver: Long, bversion: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingGetVersionFromFileExW(lpszfilename: Long, pdwmsver: Long, pdwlsver: Long, bversion: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingGetVersionFromFileW(lpszfilename: Long, pdwmsver: Long, pdwlsver: Long, bversion: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingGetWindowRegionData(hwnd: Long, size: Int, prd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingGlobalCompact(dwminfree: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingGlobalFix(hmem: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingGlobalUnWire(hmem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingGlobalUnfix(hmem: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingGlobalWire(hmem: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingIMPGetIMEA(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingIMPGetIMEW(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingIMPQueryIMEA(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingIMPQueryIMEW(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingIMPSetIMEA(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingIMPSetIMEW(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingIsApiSetImplemented(contract: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingIsBadHugeReadPtr(lp: Long, ucb: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingIsBadHugeWritePtr(lp: Long, ucb: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingIsNTAdmin(dwreserved: Int, lpdwreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingIsNativeVhdBoot(nativevhdboot: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingIsTokenUntrusted(tokenhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingLaunchINFSectionExW(hwnd: Long, hinstance: Long, pszparms: Long, nshow: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingLaunchINFSectionW(hwndowner: Long, hinstance: Long, pszparams: Long, nshow: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingLocalCompact(uminfree: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingLocalShrink(hmem: Long, cbnewsize: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingMulDiv(nnumber: Int, nnumerator: Int, ndenominator: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingNeedReboot(dwrebootcheck: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingNeedRebootInit(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingOpenINFEngineA(pszinffilename: Long, pszinstallsection: Long, dwflags: Int, phinf: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingOpenINFEngineW(pszinffilename: Long, pszinstallsection: Long, dwflags: Int, phinf: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingOpenMutexA(dwdesiredaccess: Int, binherithandle: Int, lpname: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingOpenSemaphoreA(dwdesiredaccess: Int, binherithandle: Int, lpname: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingQueryAuxiliaryCounterFrequency(lpauxiliarycounterfrequency: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingQueryIdleProcessorCycleTime(bufferlength: Long, processoridlecycletime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingQueryIdleProcessorCycleTimeEx(group: Short, bufferlength: Long, processoridlecycletime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingQueryInterruptTime(lpinterrupttime: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingQueryInterruptTimePrecise(lpinterrupttimeprecise: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingQueryProcessCycleTime(processhandle: Long, cycletime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingQueryThreadCycleTime(threadhandle: Long, cycletime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingQueryUnbiasedInterruptTime(unbiasedtime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingQueryUnbiasedInterruptTimePrecise(lpunbiasedinterrupttimeprecise: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingRaiseCustomSystemEventTrigger(customsystemeventtriggerconfig: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingRebootCheckOnInstallA(hwnd: Long, pszinf: Long, pszsec: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingRebootCheckOnInstallW(hwnd: Long, pszinf: Long, pszsec: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingRecordFeatureError(featureid: Int, error: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingRecordFeatureUsage(featureid: Int, kind: Int, addend: Int, originname: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingRegInstallA(hmod: Long, pszsection: Long, psttable: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingRegInstallW(hmod: Long, pszsection: Long, psttable: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingRegRestoreAllA(hwnd: Long, psztitlestring: Long, hkbckupkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingRegRestoreAllW(hwnd: Long, psztitlestring: Long, hkbckupkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingRegSaveRestoreA(hwnd: Long, psztitlestring: Long, hkbckupkey: Long, pcszrootkey: Long, pcszsubkey: Long, pcszvaluename: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingRegSaveRestoreOnINFA(hwnd: Long, psztitle: Long, pszinf: Long, pszsection: Long, hhklmbackkey: Long, hhkcubackkey: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingRegSaveRestoreOnINFW(hwnd: Long, psztitle: Long, pszinf: Long, pszsection: Long, hhklmbackkey: Long, hhkcubackkey: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingRegSaveRestoreW(hwnd: Long, psztitlestring: Long, hkbckupkey: Long, pcszrootkey: Long, pcszsubkey: Long, pcszvaluename: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingReplacePartitionUnit(targetpartition: Long, sparepartition: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingRequestDeviceWakeup(hdevice: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingRtlAnsiStringToUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingRtlCharToInteger(string: Long, base: Int, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingRtlFreeAnsiString(ansistring: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingRtlFreeOemString(oemstring: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingRtlFreeUnicodeString(unicodestring: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingRtlGetReturnAddressHijackTarget(): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingRtlInitAnsiString(destinationstring: Long, sourcestring: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingRtlInitAnsiStringEx(destinationstring: Long, sourcestring: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingRtlInitString(destinationstring: Long, sourcestring: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingRtlInitStringEx(destinationstring: Long, sourcestring: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingRtlInitUnicodeString(destinationstring: Long, sourcestring: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingRtlIsNameLegalDOS8Dot3(name: Long, oemname: Long, namecontainsspaces: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingRtlLocalTimeToSystemTime(localtime: Long, systemtime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingRtlRaiseCustomSystemEventTrigger(triggerconfig: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingRtlTimeToSecondsSince1970(time: Long, elapsedseconds: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingRtlUnicodeStringToAnsiString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingRtlUnicodeStringToOemString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingRtlUnicodeToMultiByteSize(bytesinmultibytestring: Long, unicodestring: Long, bytesinunicodestring: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingRtlUniform(seed: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingRunSetupCommandA(hwnd: Long, szcmdname: Long, szinfsection: Long, szdir: Long, lpsztitle: Long, phexe: Long, dwflags: Int, pvreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingRunSetupCommandW(hwnd: Long, szcmdname: Long, szinfsection: Long, szdir: Long, lpsztitle: Long, phexe: Long, dwflags: Int, pvreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingSendIMEMessageExA(param0: Long, param1: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingSendIMEMessageExW(param0: Long, param1: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingSetEnvironmentStringsA(newenvironment: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingSetFirmwareEnvironmentVariableA(lpname: Long, lpguid: Long, pvalue: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingSetFirmwareEnvironmentVariableExA(lpname: Long, lpguid: Long, pvalue: Long, nsize: Int, dwattributes: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingSetFirmwareEnvironmentVariableExW(lpname: Long, lpguid: Long, pvalue: Long, nsize: Int, dwattributes: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingSetFirmwareEnvironmentVariableW(lpname: Long, lpguid: Long, pvalue: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingSetHandleCount(unumber: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingSetMessageWaitingIndicator(hmsgindicator: Long, ulmsgcount: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingSetPerUserSecValuesA(pperuser: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingSetPerUserSecValuesW(pperuser: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingSubscribeFeatureStateChangeNotification(subscription: Long, callback: Long, context: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingTranslateInfStringA(pszinffilename: Long, pszinstallsection: Long, psztranslatesection: Long, psztranslatekey: Long, pszbuffer: Long, cchbuffer: Int, pdwrequiredsize: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingTranslateInfStringExA(hinf: Long, pszinffilename: Long, psztranslatesection: Long, psztranslatekey: Long, pszbuffer: Long, dwbuffersize: Int, pdwrequiredsize: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingTranslateInfStringExW(hinf: Long, pszinffilename: Long, psztranslatesection: Long, psztranslatekey: Long, pszbuffer: Long, dwbuffersize: Int, pdwrequiredsize: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingTranslateInfStringW(pszinffilename: Long, pszinstallsection: Long, psztranslatesection: Long, psztranslatekey: Long, pszbuffer: Long, cchbuffer: Int, pdwrequiredsize: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingUnsubscribeFeatureStateChangeNotification(subscription: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingUserInstStubWrapperA(hwnd: Long, hinstance: Long, pszparms: Long, nshow: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingUserInstStubWrapperW(hwnd: Long, hinstance: Long, pszparms: Long, nshow: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingUserUnInstStubWrapperA(hwnd: Long, hinstance: Long, pszparms: Long, nshow: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingUserUnInstStubWrapperW(hwnd: Long, hinstance: Long, pszparms: Long, nshow: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingWINNLSEnableIME(param0: Long, param1: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingWINNLSGetEnableStatus(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingWINNLSGetIMEHotkey(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingWinWatchClose(hww: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingWinWatchDidStatusChange(hww: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingWinWatchGetClipList(hww: Long, prc: Long, size: Int, prd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingWinWatchNotify(hww: Long, notifycallback: Long, notifyparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingWinWatchOpen(hwnd: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingWldpCanExecuteBuffer(host: Long, options: Int, buffer: Long, buffersize: Int, auditinfo: Long, result: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingWldpCanExecuteFile(host: Long, options: Int, filehandle: Long, auditinfo: Long, result: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingWldpCanExecuteStream(host: Long, options: Int, stream: Long, auditinfo: Long, result: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingWldpGetLockdownPolicy(hostinformation: Long, lockdownstate: Long, lockdownflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingWldpIsClassInApprovedList(classid: Long, hostinformation: Long, isapproved: Long, optionalflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingWldpIsDynamicCodePolicyEnabled(isenabled: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingWldpQueryDeviceSecurityInformation(information: Long, informationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingWldpQueryDynamicCodeTrust(filehandle: Long, baseimage: Long, imagesize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingWldpSetDynamicCodeTrust(filehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingWritePrivateProfileSectionA(lpappname: Long, lpstring: Long, lpfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingWritePrivateProfileSectionW(lpappname: Long, lpstring: Long, lpfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingWritePrivateProfileStringA(lpappname: Long, lpkeyname: Long, lpstring: Long, lpfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingWritePrivateProfileStringW(lpappname: Long, lpkeyname: Long, lpstring: Long, lpfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingWritePrivateProfileStructA(lpszsection: Long, lpszkey: Long, lpstruct: Long, usizestruct: Int, szfile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingWritePrivateProfileStructW(lpszsection: Long, lpszkey: Long, lpstruct: Long, usizestruct: Int, szfile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingWriteProfileSectionA(lpappname: Long, lpstring: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingWriteProfileSectionW(lpappname: Long, lpstring: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingWriteProfileStringA(lpappname: Long, lpkeyname: Long, lpstring: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingWriteProfileStringW(lpappname: Long, lpkeyname: Long, lpstring: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingHread(hfile: Int, lpbuffer: Long, lbytes: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingHwrite(hfile: Int, lpbuffer: Long, lbytes: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingLclose(hfile: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingLcreat(lppathname: Long, iattribute: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingLlseek(hfile: Int, loffset: Int, iorigin: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingLopen(lppathname: Long, ireadwrite: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingLread(hfile: Int, lpbuffer: Long, ubytes: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingLwrite(hfile: Int, lpbuffer: Long, ubytes: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingUawLstrcmpW(string1: Long, string2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingUawLstrcmpiW(string1: Long, string2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingUawLstrlenW(string: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingUawWcschr(string: Long, character: Short): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingUawWcscpy(destination: Long, source: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingUawWcsicmp(string1: Long, string2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingUawWcslen(string: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemWindowsprogrammingUawWcsrchr(string: Long, character: Short): Long
}

public actual fun addDelBackupEntryA(lpcszfilelist: Pcstr, lpcszbackupdir: Pcstr, lpcszbasename: Pcstr, dwflags: UInt): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingAddDelBackupEntryA(lpcszfilelist.rawAddress, lpcszbackupdir.rawAddress, lpcszbasename.rawAddress, dwflags.toInt())

public actual fun addDelBackupEntryW(lpcszfilelist: Pcwstr, lpcszbackupdir: Pcwstr, lpcszbasename: Pcwstr, dwflags: UInt): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingAddDelBackupEntryW(lpcszfilelist.rawAddress, lpcszbackupdir.rawAddress, lpcszbasename.rawAddress, dwflags.toInt())

public actual fun advInstallFileA(hwnd: Hwnd, lpszsourcedir: Pcstr, lpszsourcefile: Pcstr, lpszdestdir: Pcstr, lpszdestfile: Pcstr, dwflags: UInt, dwreserved: UInt): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingAdvInstallFileA(hwnd.rawAddress, lpszsourcedir.rawAddress, lpszsourcefile.rawAddress, lpszdestdir.rawAddress, lpszdestfile.rawAddress, dwflags.toInt(), dwreserved.toInt())

public actual fun advInstallFileW(hwnd: Hwnd, lpszsourcedir: Pcwstr, lpszsourcefile: Pcwstr, lpszdestdir: Pcwstr, lpszdestfile: Pcwstr, dwflags: UInt, dwreserved: UInt): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingAdvInstallFileW(hwnd.rawAddress, lpszsourcedir.rawAddress, lpszsourcefile.rawAddress, lpszdestdir.rawAddress, lpszdestfile.rawAddress, dwflags.toInt(), dwreserved.toInt())

public actual fun apphelpCheckShellObject(objectclsid: ConstPtr, bshimifnecessary: Bool, pullflags: MutPtr): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingApphelpCheckShellObject(objectclsid.rawAddress, bshimifnecessary, pullflags.rawAddress)

public actual fun cancelDeviceWakeupRequest(hdevice: Handle): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingCancelDeviceWakeupRequest(hdevice.rawAddress)

public actual fun closeINFEngine(hinf: MutPtr): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingCloseINFEngine(hinf.rawAddress)

public actual fun convertAuxiliaryCounterToPerformanceCounter(ullauxiliarycountervalue: ULong, lpperformancecountervalue: MutPtr, lpconversionerror: MutPtr): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingConvertAuxiliaryCounterToPerformanceCounter(ullauxiliarycountervalue.toLong(), lpperformancecountervalue.rawAddress, lpconversionerror.rawAddress)

public actual fun convertPerformanceCounterToAuxiliaryCounter(ullperformancecountervalue: ULong, lpauxiliarycountervalue: MutPtr, lpconversionerror: MutPtr): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingConvertPerformanceCounterToAuxiliaryCounter(ullperformancecountervalue.toLong(), lpauxiliarycountervalue.rawAddress, lpconversionerror.rawAddress)

public actual fun dCIBeginAccess(pdci: MutPtr, x: Int, y: Int, dx: Int, dy: Int): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingDCIBeginAccess(pdci.rawAddress, x, y, dx, dy)

public actual fun dCICloseProvider(hdc: Hdc) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingDCICloseProvider(hdc.rawAddress)
}

public actual fun dCICreateOffscreen(hdc: Hdc, dwcompression: UInt, dwredmask: UInt, dwgreenmask: UInt, dwbluemask: UInt, dwwidth: UInt, dwheight: UInt, dwdcicaps: UInt, dwbitcount: UInt, lplpsurface: MutPtr): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingDCICreateOffscreen(hdc.rawAddress, dwcompression.toInt(), dwredmask.toInt(), dwgreenmask.toInt(), dwbluemask.toInt(), dwwidth.toInt(), dwheight.toInt(), dwdcicaps.toInt(), dwbitcount.toInt(), lplpsurface.rawAddress)

public actual fun dCICreateOverlay(hdc: Hdc, lpoffscreensurf: MutPtr, lplpsurface: MutPtr): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingDCICreateOverlay(hdc.rawAddress, lpoffscreensurf.rawAddress, lplpsurface.rawAddress)

public actual fun dCICreatePrimary(hdc: Hdc, lplpsurface: MutPtr): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingDCICreatePrimary(hdc.rawAddress, lplpsurface.rawAddress)

public actual fun dCIDestroy(pdci: MutPtr) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingDCIDestroy(pdci.rawAddress)
}

public actual fun dCIDraw(pdci: MutPtr): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingDCIDraw(pdci.rawAddress)

public actual fun dCIEndAccess(pdci: MutPtr) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingDCIEndAccess(pdci.rawAddress)
}

public actual fun dCIEnum(hdc: Hdc, lprdst: MutPtr, lprsrc: MutPtr, lpfncallback: MutPtr, lpcontext: MutPtr): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingDCIEnum(hdc.rawAddress, lprdst.rawAddress, lprsrc.rawAddress, lpfncallback.rawAddress, lpcontext.rawAddress)

public actual fun dCIOpenProvider(): Hdc =
    MutPtr(WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingDCIOpenProvider())

public actual fun dCISetClipList(pdci: MutPtr, prd: MutPtr): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingDCISetClipList(pdci.rawAddress, prd.rawAddress)

public actual fun dCISetDestination(pdci: MutPtr, dst: MutPtr, src: MutPtr): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingDCISetDestination(pdci.rawAddress, dst.rawAddress, src.rawAddress)

public actual fun dCISetSrcDestClip(pdci: MutPtr, srcrc: MutPtr, destrc: MutPtr, prd: MutPtr): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingDCISetSrcDestClip(pdci.rawAddress, srcrc.rawAddress, destrc.rawAddress, prd.rawAddress)

public actual fun delNodeA(pszfileordirname: Pcstr, dwflags: UInt): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingDelNodeA(pszfileordirname.rawAddress, dwflags.toInt())

public actual fun delNodeRunDLL32W(hwnd: Hwnd, hinstance: Hinstance, pszparms: Pwstr, nshow: Int): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingDelNodeRunDLL32W(hwnd.rawAddress, hinstance.rawAddress, pszparms.rawAddress, nshow)

public actual fun delNodeW(pszfileordirname: Pcwstr, dwflags: UInt): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingDelNodeW(pszfileordirname.rawAddress, dwflags.toInt())

public actual fun dnsHostnameToComputerNameA(hostname: Pcstr, computername: Pstr, nsize: MutPtr): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingDnsHostnameToComputerNameA(hostname.rawAddress, computername.rawAddress, nsize.rawAddress)

public actual fun dnsHostnameToComputerNameW(hostname: Pcwstr, computername: Pwstr, nsize: MutPtr): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingDnsHostnameToComputerNameW(hostname.rawAddress, computername.rawAddress, nsize.rawAddress)

public actual fun dosDateTimeToFileTime(wfatdate: UShort, wfattime: UShort, lpfiletime: MutPtr): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingDosDateTimeToFileTime(wfatdate.toShort(), wfattime.toShort(), lpfiletime.rawAddress)

public actual fun enableProcessOptionalXStateFeatures(features: ULong): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingEnableProcessOptionalXStateFeatures(features.toLong())

public actual fun executeCabA(hwnd: Hwnd, pcab: MutPtr, preserved: MutPtr): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingExecuteCabA(hwnd.rawAddress, pcab.rawAddress, preserved.rawAddress)

public actual fun executeCabW(hwnd: Hwnd, pcab: MutPtr, preserved: MutPtr): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingExecuteCabW(hwnd.rawAddress, pcab.rawAddress, preserved.rawAddress)

public actual fun extractFilesA(pszcabname: Pcstr, pszexpanddir: Pcstr, dwflags: UInt, pszfilelist: Pcstr, lpreserved: MutPtr, dwreserved: UInt): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingExtractFilesA(pszcabname.rawAddress, pszexpanddir.rawAddress, dwflags.toInt(), pszfilelist.rawAddress, lpreserved.rawAddress, dwreserved.toInt())

public actual fun extractFilesW(pszcabname: Pcwstr, pszexpanddir: Pcwstr, dwflags: UInt, pszfilelist: Pcwstr, lpreserved: MutPtr, dwreserved: UInt): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingExtractFilesW(pszcabname.rawAddress, pszexpanddir.rawAddress, dwflags.toInt(), pszfilelist.rawAddress, lpreserved.rawAddress, dwreserved.toInt())

public actual fun fileSaveMarkNotExistA(lpfilelist: Pcstr, lpdir: Pcstr, lpbasename: Pcstr): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingFileSaveMarkNotExistA(lpfilelist.rawAddress, lpdir.rawAddress, lpbasename.rawAddress)

public actual fun fileSaveMarkNotExistW(lpfilelist: Pcwstr, lpdir: Pcwstr, lpbasename: Pcwstr): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingFileSaveMarkNotExistW(lpfilelist.rawAddress, lpdir.rawAddress, lpbasename.rawAddress)

public actual fun fileSaveRestoreOnINFA(hwnd: Hwnd, psztitle: Pcstr, pszinf: Pcstr, pszsection: Pcstr, pszbackupdir: Pcstr, pszbasebackupfile: Pcstr, dwflags: UInt): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingFileSaveRestoreOnINFA(hwnd.rawAddress, psztitle.rawAddress, pszinf.rawAddress, pszsection.rawAddress, pszbackupdir.rawAddress, pszbasebackupfile.rawAddress, dwflags.toInt())

public actual fun fileSaveRestoreOnINFW(hwnd: Hwnd, psztitle: Pcwstr, pszinf: Pcwstr, pszsection: Pcwstr, pszbackupdir: Pcwstr, pszbasebackupfile: Pcwstr, dwflags: UInt): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingFileSaveRestoreOnINFW(hwnd.rawAddress, psztitle.rawAddress, pszinf.rawAddress, pszsection.rawAddress, pszbackupdir.rawAddress, pszbasebackupfile.rawAddress, dwflags.toInt())

public actual fun fileSaveRestoreW(hdlg: Hwnd, lpfilelist: Pcwstr, lpdir: Pcwstr, lpbasename: Pcwstr, dwflags: UInt): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingFileSaveRestoreW(hdlg.rawAddress, lpfilelist.rawAddress, lpdir.rawAddress, lpbasename.rawAddress, dwflags.toInt())

public actual fun fileTimeToDosDateTime(lpfiletime: ConstPtr, lpfatdate: MutPtr, lpfattime: MutPtr): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingFileTimeToDosDateTime(lpfiletime.rawAddress, lpfatdate.rawAddress, lpfattime.rawAddress)

public actual fun gdiEntry13(): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingGdiEntry13().toUInt()

public actual fun getComputerNameA(lpbuffer: Pstr, nsize: MutPtr): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingGetComputerNameA(lpbuffer.rawAddress, nsize.rawAddress)

public actual fun getComputerNameW(lpbuffer: Pwstr, nsize: MutPtr): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingGetComputerNameW(lpbuffer.rawAddress, nsize.rawAddress)

public actual fun getCurrentHwProfileA(lphwprofileinfo: MutPtr): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingGetCurrentHwProfileA(lphwprofileinfo.rawAddress)

public actual fun getCurrentHwProfileW(lphwprofileinfo: MutPtr): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingGetCurrentHwProfileW(lphwprofileinfo.rawAddress)

public actual fun getDCRegionData(hdc: Hdc, size: UInt, prd: MutPtr): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingGetDCRegionData(hdc.rawAddress, size.toInt(), prd.rawAddress).toUInt()

public actual fun getFeatureEnabledState(featureid: UInt, changetime: FeatureChangeTime): FeatureEnabledState =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingGetFeatureEnabledState(featureid.toInt(), changetime)

public actual fun getFeatureVariant(featureid: UInt, changetime: FeatureChangeTime, payloadid: MutPtr, hasnotification: MutPtr): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingGetFeatureVariant(featureid.toInt(), changetime, payloadid.rawAddress, hasnotification.rawAddress).toUInt()

public actual fun getFirmwareEnvironmentVariableA(lpname: Pcstr, lpguid: Pcstr, pbuffer: MutPtr, nsize: UInt): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingGetFirmwareEnvironmentVariableA(lpname.rawAddress, lpguid.rawAddress, pbuffer.rawAddress, nsize.toInt()).toUInt()

public actual fun getFirmwareEnvironmentVariableExA(lpname: Pcstr, lpguid: Pcstr, pbuffer: MutPtr, nsize: UInt, pdwattribubutes: MutPtr): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingGetFirmwareEnvironmentVariableExA(lpname.rawAddress, lpguid.rawAddress, pbuffer.rawAddress, nsize.toInt(), pdwattribubutes.rawAddress).toUInt()

public actual fun getFirmwareEnvironmentVariableExW(lpname: Pcwstr, lpguid: Pcwstr, pbuffer: MutPtr, nsize: UInt, pdwattribubutes: MutPtr): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingGetFirmwareEnvironmentVariableExW(lpname.rawAddress, lpguid.rawAddress, pbuffer.rawAddress, nsize.toInt(), pdwattribubutes.rawAddress).toUInt()

public actual fun getFirmwareEnvironmentVariableW(lpname: Pcwstr, lpguid: Pcwstr, pbuffer: MutPtr, nsize: UInt): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingGetFirmwareEnvironmentVariableW(lpname.rawAddress, lpguid.rawAddress, pbuffer.rawAddress, nsize.toInt()).toUInt()

public actual fun getPrivateProfileIntA(lpappname: Pcstr, lpkeyname: Pcstr, ndefault: Int, lpfilename: Pcstr): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileIntA(lpappname.rawAddress, lpkeyname.rawAddress, ndefault, lpfilename.rawAddress).toUInt()

public actual fun getPrivateProfileIntW(lpappname: Pcwstr, lpkeyname: Pcwstr, ndefault: Int, lpfilename: Pcwstr): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileIntW(lpappname.rawAddress, lpkeyname.rawAddress, ndefault, lpfilename.rawAddress)

public actual fun getPrivateProfileSectionA(lpappname: Pcstr, lpreturnedstring: Pstr, nsize: UInt, lpfilename: Pcstr): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileSectionA(lpappname.rawAddress, lpreturnedstring.rawAddress, nsize.toInt(), lpfilename.rawAddress).toUInt()

public actual fun getPrivateProfileSectionNamesA(lpszreturnbuffer: Pstr, nsize: UInt, lpfilename: Pcstr): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileSectionNamesA(lpszreturnbuffer.rawAddress, nsize.toInt(), lpfilename.rawAddress).toUInt()

public actual fun getPrivateProfileSectionNamesW(lpszreturnbuffer: Pwstr, nsize: UInt, lpfilename: Pcwstr): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileSectionNamesW(lpszreturnbuffer.rawAddress, nsize.toInt(), lpfilename.rawAddress).toUInt()

public actual fun getPrivateProfileSectionW(lpappname: Pcwstr, lpreturnedstring: Pwstr, nsize: UInt, lpfilename: Pcwstr): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileSectionW(lpappname.rawAddress, lpreturnedstring.rawAddress, nsize.toInt(), lpfilename.rawAddress).toUInt()

public actual fun getPrivateProfileStringA(lpappname: Pcstr, lpkeyname: Pcstr, lpdefault: Pcstr, lpreturnedstring: Pstr, nsize: UInt, lpfilename: Pcstr): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileStringA(lpappname.rawAddress, lpkeyname.rawAddress, lpdefault.rawAddress, lpreturnedstring.rawAddress, nsize.toInt(), lpfilename.rawAddress).toUInt()

public actual fun getPrivateProfileStringW(lpappname: Pcwstr, lpkeyname: Pcwstr, lpdefault: Pcwstr, lpreturnedstring: Pwstr, nsize: UInt, lpfilename: Pcwstr): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileStringW(lpappname.rawAddress, lpkeyname.rawAddress, lpdefault.rawAddress, lpreturnedstring.rawAddress, nsize.toInt(), lpfilename.rawAddress).toUInt()

public actual fun getPrivateProfileStructA(lpszsection: Pcstr, lpszkey: Pcstr, lpstruct: MutPtr, usizestruct: UInt, szfile: Pcstr): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileStructA(lpszsection.rawAddress, lpszkey.rawAddress, lpstruct.rawAddress, usizestruct.toInt(), szfile.rawAddress)

public actual fun getPrivateProfileStructW(lpszsection: Pcwstr, lpszkey: Pcwstr, lpstruct: MutPtr, usizestruct: UInt, szfile: Pcwstr): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileStructW(lpszsection.rawAddress, lpszkey.rawAddress, lpstruct.rawAddress, usizestruct.toInt(), szfile.rawAddress)

public actual fun getProfileIntA(lpappname: Pcstr, lpkeyname: Pcstr, ndefault: Int): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingGetProfileIntA(lpappname.rawAddress, lpkeyname.rawAddress, ndefault).toUInt()

public actual fun getProfileIntW(lpappname: Pcwstr, lpkeyname: Pcwstr, ndefault: Int): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingGetProfileIntW(lpappname.rawAddress, lpkeyname.rawAddress, ndefault).toUInt()

public actual fun getProfileSectionA(lpappname: Pcstr, lpreturnedstring: Pstr, nsize: UInt): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingGetProfileSectionA(lpappname.rawAddress, lpreturnedstring.rawAddress, nsize.toInt()).toUInt()

public actual fun getProfileSectionW(lpappname: Pcwstr, lpreturnedstring: Pwstr, nsize: UInt): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingGetProfileSectionW(lpappname.rawAddress, lpreturnedstring.rawAddress, nsize.toInt()).toUInt()

public actual fun getProfileStringA(lpappname: Pcstr, lpkeyname: Pcstr, lpdefault: Pcstr, lpreturnedstring: Pstr, nsize: UInt): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingGetProfileStringA(lpappname.rawAddress, lpkeyname.rawAddress, lpdefault.rawAddress, lpreturnedstring.rawAddress, nsize.toInt()).toUInt()

public actual fun getProfileStringW(lpappname: Pcwstr, lpkeyname: Pcwstr, lpdefault: Pcwstr, lpreturnedstring: Pwstr, nsize: UInt): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingGetProfileStringW(lpappname.rawAddress, lpkeyname.rawAddress, lpdefault.rawAddress, lpreturnedstring.rawAddress, nsize.toInt()).toUInt()

public actual fun getSystemRegistryQuota(pdwquotaallowed: MutPtr, pdwquotaused: MutPtr): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingGetSystemRegistryQuota(pdwquotaallowed.rawAddress, pdwquotaused.rawAddress)

public actual fun getThreadEnabledXStateFeatures(): ULong =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingGetThreadEnabledXStateFeatures().toULong()

public actual fun getUserNameA(lpbuffer: Pstr, pcbbuffer: MutPtr): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingGetUserNameA(lpbuffer.rawAddress, pcbbuffer.rawAddress)

public actual fun getUserNameW(lpbuffer: Pwstr, pcbbuffer: MutPtr): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingGetUserNameW(lpbuffer.rawAddress, pcbbuffer.rawAddress)

public actual fun getVersionFromFileA(lpszfilename: Pcstr, pdwmsver: MutPtr, pdwlsver: MutPtr, bversion: Bool): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingGetVersionFromFileA(lpszfilename.rawAddress, pdwmsver.rawAddress, pdwlsver.rawAddress, bversion)

public actual fun getVersionFromFileExA(lpszfilename: Pcstr, pdwmsver: MutPtr, pdwlsver: MutPtr, bversion: Bool): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingGetVersionFromFileExA(lpszfilename.rawAddress, pdwmsver.rawAddress, pdwlsver.rawAddress, bversion)

public actual fun getVersionFromFileExW(lpszfilename: Pcwstr, pdwmsver: MutPtr, pdwlsver: MutPtr, bversion: Bool): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingGetVersionFromFileExW(lpszfilename.rawAddress, pdwmsver.rawAddress, pdwlsver.rawAddress, bversion)

public actual fun getVersionFromFileW(lpszfilename: Pcwstr, pdwmsver: MutPtr, pdwlsver: MutPtr, bversion: Bool): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingGetVersionFromFileW(lpszfilename.rawAddress, pdwmsver.rawAddress, pdwlsver.rawAddress, bversion)

public actual fun getWindowRegionData(hwnd: Hwnd, size: UInt, prd: MutPtr): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingGetWindowRegionData(hwnd.rawAddress, size.toInt(), prd.rawAddress).toUInt()

public actual fun globalCompact(dwminfree: UInt): ULong =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingGlobalCompact(dwminfree.toInt()).toULong()

public actual fun globalFix(hmem: Hglobal) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingGlobalFix(hmem.rawAddress)
}

public actual fun globalUnWire(hmem: Hglobal): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingGlobalUnWire(hmem.rawAddress)

public actual fun globalUnfix(hmem: Hglobal) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingGlobalUnfix(hmem.rawAddress)
}

public actual fun globalWire(hmem: Hglobal): MutPtr =
    MutPtr(WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingGlobalWire(hmem.rawAddress))

public actual fun iMPGetIMEA(param0: Hwnd, param1: MutPtr): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingIMPGetIMEA(param0.rawAddress, param1.rawAddress)

public actual fun iMPGetIMEW(param0: Hwnd, param1: MutPtr): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingIMPGetIMEW(param0.rawAddress, param1.rawAddress)

public actual fun iMPQueryIMEA(param0: MutPtr): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingIMPQueryIMEA(param0.rawAddress)

public actual fun iMPQueryIMEW(param0: MutPtr): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingIMPQueryIMEW(param0.rawAddress)

public actual fun iMPSetIMEA(param0: Hwnd, param1: MutPtr): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingIMPSetIMEA(param0.rawAddress, param1.rawAddress)

public actual fun iMPSetIMEW(param0: Hwnd, param1: MutPtr): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingIMPSetIMEW(param0.rawAddress, param1.rawAddress)

public actual fun isApiSetImplemented(contract: Pcstr): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingIsApiSetImplemented(contract.rawAddress)

public actual fun isBadHugeReadPtr(lp: ConstPtr, ucb: ULong): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingIsBadHugeReadPtr(lp.rawAddress, ucb.toLong())

public actual fun isBadHugeWritePtr(lp: ConstPtr, ucb: ULong): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingIsBadHugeWritePtr(lp.rawAddress, ucb.toLong())

public actual fun isNTAdmin(dwreserved: UInt, lpdwreserved: MutPtr): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingIsNTAdmin(dwreserved.toInt(), lpdwreserved.rawAddress)

public actual fun isNativeVhdBoot(nativevhdboot: MutPtr): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingIsNativeVhdBoot(nativevhdboot.rawAddress)

public actual fun isTokenUntrusted(tokenhandle: Handle): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingIsTokenUntrusted(tokenhandle.rawAddress)

public actual fun launchINFSectionExW(hwnd: Hwnd, hinstance: Hinstance, pszparms: Pcwstr, nshow: Int): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingLaunchINFSectionExW(hwnd.rawAddress, hinstance.rawAddress, pszparms.rawAddress, nshow)

public actual fun launchINFSectionW(hwndowner: Hwnd, hinstance: Hinstance, pszparams: Pwstr, nshow: Int): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingLaunchINFSectionW(hwndowner.rawAddress, hinstance.rawAddress, pszparams.rawAddress, nshow)

public actual fun localCompact(uminfree: UInt): ULong =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingLocalCompact(uminfree.toInt()).toULong()

public actual fun localShrink(hmem: Hlocal, cbnewsize: UInt): ULong =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingLocalShrink(hmem.rawAddress, cbnewsize.toInt()).toULong()

public actual fun mulDiv(nnumber: Int, nnumerator: Int, ndenominator: Int): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingMulDiv(nnumber, nnumerator, ndenominator)

public actual fun needReboot(dwrebootcheck: UInt): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingNeedReboot(dwrebootcheck.toInt())

public actual fun needRebootInit(): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingNeedRebootInit().toUInt()

public actual fun openINFEngineA(pszinffilename: Pcstr, pszinstallsection: Pcstr, dwflags: UInt, phinf: MutPtr, pvreserved: MutPtr): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingOpenINFEngineA(pszinffilename.rawAddress, pszinstallsection.rawAddress, dwflags.toInt(), phinf.rawAddress, pvreserved.rawAddress)

public actual fun openINFEngineW(pszinffilename: Pcwstr, pszinstallsection: Pcwstr, dwflags: UInt, phinf: MutPtr, pvreserved: MutPtr): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingOpenINFEngineW(pszinffilename.rawAddress, pszinstallsection.rawAddress, dwflags.toInt(), phinf.rawAddress, pvreserved.rawAddress)

public actual fun openMutexA(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcstr): Handle =
    MutPtr(WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingOpenMutexA(dwdesiredaccess.toInt(), binherithandle, lpname.rawAddress))

public actual fun openSemaphoreA(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcstr): Handle =
    MutPtr(WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingOpenSemaphoreA(dwdesiredaccess.toInt(), binherithandle, lpname.rawAddress))

public actual fun queryAuxiliaryCounterFrequency(lpauxiliarycounterfrequency: MutPtr): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingQueryAuxiliaryCounterFrequency(lpauxiliarycounterfrequency.rawAddress)

public actual fun queryIdleProcessorCycleTime(bufferlength: MutPtr, processoridlecycletime: MutPtr): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingQueryIdleProcessorCycleTime(bufferlength.rawAddress, processoridlecycletime.rawAddress)

public actual fun queryIdleProcessorCycleTimeEx(group: UShort, bufferlength: MutPtr, processoridlecycletime: MutPtr): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingQueryIdleProcessorCycleTimeEx(group.toShort(), bufferlength.rawAddress, processoridlecycletime.rawAddress)

public actual fun queryInterruptTime(lpinterrupttime: MutPtr) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingQueryInterruptTime(lpinterrupttime.rawAddress)
}

public actual fun queryInterruptTimePrecise(lpinterrupttimeprecise: MutPtr) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingQueryInterruptTimePrecise(lpinterrupttimeprecise.rawAddress)
}

public actual fun queryProcessCycleTime(processhandle: Handle, cycletime: MutPtr): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingQueryProcessCycleTime(processhandle.rawAddress, cycletime.rawAddress)

public actual fun queryThreadCycleTime(threadhandle: Handle, cycletime: MutPtr): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingQueryThreadCycleTime(threadhandle.rawAddress, cycletime.rawAddress)

public actual fun queryUnbiasedInterruptTime(unbiasedtime: MutPtr): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingQueryUnbiasedInterruptTime(unbiasedtime.rawAddress)

public actual fun queryUnbiasedInterruptTimePrecise(lpunbiasedinterrupttimeprecise: MutPtr) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingQueryUnbiasedInterruptTimePrecise(lpunbiasedinterrupttimeprecise.rawAddress)
}

public actual fun raiseCustomSystemEventTrigger(customsystemeventtriggerconfig: ConstPtr): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingRaiseCustomSystemEventTrigger(customsystemeventtriggerconfig.rawAddress).toUInt()

public actual fun rebootCheckOnInstallA(hwnd: Hwnd, pszinf: Pcstr, pszsec: Pcstr, dwreserved: UInt): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingRebootCheckOnInstallA(hwnd.rawAddress, pszinf.rawAddress, pszsec.rawAddress, dwreserved.toInt())

public actual fun rebootCheckOnInstallW(hwnd: Hwnd, pszinf: Pcwstr, pszsec: Pcwstr, dwreserved: UInt): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingRebootCheckOnInstallW(hwnd.rawAddress, pszinf.rawAddress, pszsec.rawAddress, dwreserved.toInt())

public actual fun recordFeatureError(featureid: UInt, error: ConstPtr) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingRecordFeatureError(featureid.toInt(), error.rawAddress)
}

public actual fun recordFeatureUsage(featureid: UInt, kind: UInt, addend: UInt, originname: Pcstr) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingRecordFeatureUsage(featureid.toInt(), kind.toInt(), addend.toInt(), originname.rawAddress)
}

public actual fun regInstallA(hmod: Hmodule, pszsection: Pcstr, psttable: ConstPtr): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingRegInstallA(hmod.rawAddress, pszsection.rawAddress, psttable.rawAddress)

public actual fun regInstallW(hmod: Hmodule, pszsection: Pcwstr, psttable: ConstPtr): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingRegInstallW(hmod.rawAddress, pszsection.rawAddress, psttable.rawAddress)

public actual fun regRestoreAllA(hwnd: Hwnd, psztitlestring: Pcstr, hkbckupkey: Hkey): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingRegRestoreAllA(hwnd.rawAddress, psztitlestring.rawAddress, hkbckupkey.rawAddress)

public actual fun regRestoreAllW(hwnd: Hwnd, psztitlestring: Pcwstr, hkbckupkey: Hkey): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingRegRestoreAllW(hwnd.rawAddress, psztitlestring.rawAddress, hkbckupkey.rawAddress)

public actual fun regSaveRestoreA(hwnd: Hwnd, psztitlestring: Pcstr, hkbckupkey: Hkey, pcszrootkey: Pcstr, pcszsubkey: Pcstr, pcszvaluename: Pcstr, dwflags: UInt): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingRegSaveRestoreA(hwnd.rawAddress, psztitlestring.rawAddress, hkbckupkey.rawAddress, pcszrootkey.rawAddress, pcszsubkey.rawAddress, pcszvaluename.rawAddress, dwflags.toInt())

public actual fun regSaveRestoreOnINFA(hwnd: Hwnd, psztitle: Pcstr, pszinf: Pcstr, pszsection: Pcstr, hhklmbackkey: Hkey, hhkcubackkey: Hkey, dwflags: UInt): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingRegSaveRestoreOnINFA(hwnd.rawAddress, psztitle.rawAddress, pszinf.rawAddress, pszsection.rawAddress, hhklmbackkey.rawAddress, hhkcubackkey.rawAddress, dwflags.toInt())

public actual fun regSaveRestoreOnINFW(hwnd: Hwnd, psztitle: Pcwstr, pszinf: Pcwstr, pszsection: Pcwstr, hhklmbackkey: Hkey, hhkcubackkey: Hkey, dwflags: UInt): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingRegSaveRestoreOnINFW(hwnd.rawAddress, psztitle.rawAddress, pszinf.rawAddress, pszsection.rawAddress, hhklmbackkey.rawAddress, hhkcubackkey.rawAddress, dwflags.toInt())

public actual fun regSaveRestoreW(hwnd: Hwnd, psztitlestring: Pcwstr, hkbckupkey: Hkey, pcszrootkey: Pcwstr, pcszsubkey: Pcwstr, pcszvaluename: Pcwstr, dwflags: UInt): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingRegSaveRestoreW(hwnd.rawAddress, psztitlestring.rawAddress, hkbckupkey.rawAddress, pcszrootkey.rawAddress, pcszsubkey.rawAddress, pcszvaluename.rawAddress, dwflags.toInt())

public actual fun replacePartitionUnit(targetpartition: Pcwstr, sparepartition: Pcwstr, flags: UInt): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingReplacePartitionUnit(targetpartition.rawAddress, sparepartition.rawAddress, flags.toInt())

public actual fun requestDeviceWakeup(hdevice: Handle): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingRequestDeviceWakeup(hdevice.rawAddress)

public actual fun rtlAnsiStringToUnicodeString(destinationstring: MutPtr, sourcestring: MutPtr, allocatedestinationstring: Boolean): Ntstatus =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingRtlAnsiStringToUnicodeString(destinationstring.rawAddress, sourcestring.rawAddress, allocatedestinationstring)

public actual fun rtlCharToInteger(string: MutPtr, base: UInt, value: MutPtr): Ntstatus =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingRtlCharToInteger(string.rawAddress, base.toInt(), value.rawAddress)

public actual fun rtlFreeAnsiString(ansistring: MutPtr) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingRtlFreeAnsiString(ansistring.rawAddress)
}

public actual fun rtlFreeOemString(oemstring: MutPtr) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingRtlFreeOemString(oemstring.rawAddress)
}

public actual fun rtlFreeUnicodeString(unicodestring: MutPtr) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingRtlFreeUnicodeString(unicodestring.rawAddress)
}

public actual fun rtlGetReturnAddressHijackTarget(): ULong =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingRtlGetReturnAddressHijackTarget().toULong()

public actual fun rtlInitAnsiString(destinationstring: MutPtr, sourcestring: MutPtr) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingRtlInitAnsiString(destinationstring.rawAddress, sourcestring.rawAddress)
}

public actual fun rtlInitAnsiStringEx(destinationstring: MutPtr, sourcestring: MutPtr): Ntstatus =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingRtlInitAnsiStringEx(destinationstring.rawAddress, sourcestring.rawAddress)

public actual fun rtlInitString(destinationstring: MutPtr, sourcestring: MutPtr) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingRtlInitString(destinationstring.rawAddress, sourcestring.rawAddress)
}

public actual fun rtlInitStringEx(destinationstring: MutPtr, sourcestring: MutPtr): Ntstatus =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingRtlInitStringEx(destinationstring.rawAddress, sourcestring.rawAddress)

public actual fun rtlInitUnicodeString(destinationstring: MutPtr, sourcestring: Pcwstr) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingRtlInitUnicodeString(destinationstring.rawAddress, sourcestring.rawAddress)
}

public actual fun rtlIsNameLegalDOS8Dot3(name: MutPtr, oemname: MutPtr, namecontainsspaces: MutPtr): Boolean =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingRtlIsNameLegalDOS8Dot3(name.rawAddress, oemname.rawAddress, namecontainsspaces.rawAddress)

public actual fun rtlLocalTimeToSystemTime(localtime: MutPtr, systemtime: MutPtr): Ntstatus =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingRtlLocalTimeToSystemTime(localtime.rawAddress, systemtime.rawAddress)

public actual fun rtlRaiseCustomSystemEventTrigger(triggerconfig: ConstPtr): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingRtlRaiseCustomSystemEventTrigger(triggerconfig.rawAddress).toUInt()

public actual fun rtlTimeToSecondsSince1970(time: MutPtr, elapsedseconds: MutPtr): Boolean =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingRtlTimeToSecondsSince1970(time.rawAddress, elapsedseconds.rawAddress)

public actual fun rtlUnicodeStringToAnsiString(destinationstring: MutPtr, sourcestring: MutPtr, allocatedestinationstring: Boolean): Ntstatus =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingRtlUnicodeStringToAnsiString(destinationstring.rawAddress, sourcestring.rawAddress, allocatedestinationstring)

public actual fun rtlUnicodeStringToOemString(destinationstring: MutPtr, sourcestring: MutPtr, allocatedestinationstring: Boolean): Ntstatus =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingRtlUnicodeStringToOemString(destinationstring.rawAddress, sourcestring.rawAddress, allocatedestinationstring)

public actual fun rtlUnicodeToMultiByteSize(bytesinmultibytestring: MutPtr, unicodestring: Pcwstr, bytesinunicodestring: UInt): Ntstatus =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingRtlUnicodeToMultiByteSize(bytesinmultibytestring.rawAddress, unicodestring.rawAddress, bytesinunicodestring.toInt())

public actual fun rtlUniform(seed: MutPtr): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingRtlUniform(seed.rawAddress).toUInt()

public actual fun runSetupCommandA(hwnd: Hwnd, szcmdname: Pcstr, szinfsection: Pcstr, szdir: Pcstr, lpsztitle: Pcstr, phexe: MutPtr, dwflags: UInt, pvreserved: MutPtr): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingRunSetupCommandA(hwnd.rawAddress, szcmdname.rawAddress, szinfsection.rawAddress, szdir.rawAddress, lpsztitle.rawAddress, phexe.rawAddress, dwflags.toInt(), pvreserved.rawAddress)

public actual fun runSetupCommandW(hwnd: Hwnd, szcmdname: Pcwstr, szinfsection: Pcwstr, szdir: Pcwstr, lpsztitle: Pcwstr, phexe: MutPtr, dwflags: UInt, pvreserved: MutPtr): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingRunSetupCommandW(hwnd.rawAddress, szcmdname.rawAddress, szinfsection.rawAddress, szdir.rawAddress, lpsztitle.rawAddress, phexe.rawAddress, dwflags.toInt(), pvreserved.rawAddress)

public actual fun sendIMEMessageExA(param0: Hwnd, param1: Lparam): Lresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingSendIMEMessageExA(param0.rawAddress, param1)

public actual fun sendIMEMessageExW(param0: Hwnd, param1: Lparam): Lresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingSendIMEMessageExW(param0.rawAddress, param1)

public actual fun setEnvironmentStringsA(newenvironment: Pcstr): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingSetEnvironmentStringsA(newenvironment.rawAddress)

public actual fun setFirmwareEnvironmentVariableA(lpname: Pcstr, lpguid: Pcstr, pvalue: ConstPtr, nsize: UInt): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingSetFirmwareEnvironmentVariableA(lpname.rawAddress, lpguid.rawAddress, pvalue.rawAddress, nsize.toInt())

public actual fun setFirmwareEnvironmentVariableExA(lpname: Pcstr, lpguid: Pcstr, pvalue: ConstPtr, nsize: UInt, dwattributes: UInt): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingSetFirmwareEnvironmentVariableExA(lpname.rawAddress, lpguid.rawAddress, pvalue.rawAddress, nsize.toInt(), dwattributes.toInt())

public actual fun setFirmwareEnvironmentVariableExW(lpname: Pcwstr, lpguid: Pcwstr, pvalue: ConstPtr, nsize: UInt, dwattributes: UInt): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingSetFirmwareEnvironmentVariableExW(lpname.rawAddress, lpguid.rawAddress, pvalue.rawAddress, nsize.toInt(), dwattributes.toInt())

public actual fun setFirmwareEnvironmentVariableW(lpname: Pcwstr, lpguid: Pcwstr, pvalue: ConstPtr, nsize: UInt): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingSetFirmwareEnvironmentVariableW(lpname.rawAddress, lpguid.rawAddress, pvalue.rawAddress, nsize.toInt())

public actual fun setHandleCount(unumber: UInt): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingSetHandleCount(unumber.toInt()).toUInt()

public actual fun setMessageWaitingIndicator(hmsgindicator: Handle, ulmsgcount: UInt): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingSetMessageWaitingIndicator(hmsgindicator.rawAddress, ulmsgcount.toInt())

public actual fun setPerUserSecValuesA(pperuser: MutPtr): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingSetPerUserSecValuesA(pperuser.rawAddress)

public actual fun setPerUserSecValuesW(pperuser: MutPtr): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingSetPerUserSecValuesW(pperuser.rawAddress)

public actual fun subscribeFeatureStateChangeNotification(subscription: MutPtr, callback: PfeatureStateChangeCallback, context: ConstPtr) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingSubscribeFeatureStateChangeNotification(subscription.rawAddress, 0L, context.rawAddress)
}

public actual fun translateInfStringA(pszinffilename: Pcstr, pszinstallsection: Pcstr, psztranslatesection: Pcstr, psztranslatekey: Pcstr, pszbuffer: Pstr, cchbuffer: UInt, pdwrequiredsize: MutPtr, pvreserved: ConstPtr): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingTranslateInfStringA(pszinffilename.rawAddress, pszinstallsection.rawAddress, psztranslatesection.rawAddress, psztranslatekey.rawAddress, pszbuffer.rawAddress, cchbuffer.toInt(), pdwrequiredsize.rawAddress, pvreserved.rawAddress)

public actual fun translateInfStringExA(hinf: MutPtr, pszinffilename: Pcstr, psztranslatesection: Pcstr, psztranslatekey: Pcstr, pszbuffer: Pstr, dwbuffersize: UInt, pdwrequiredsize: MutPtr, pvreserved: ConstPtr): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingTranslateInfStringExA(hinf.rawAddress, pszinffilename.rawAddress, psztranslatesection.rawAddress, psztranslatekey.rawAddress, pszbuffer.rawAddress, dwbuffersize.toInt(), pdwrequiredsize.rawAddress, pvreserved.rawAddress)

public actual fun translateInfStringExW(hinf: MutPtr, pszinffilename: Pcwstr, psztranslatesection: Pcwstr, psztranslatekey: Pcwstr, pszbuffer: Pwstr, dwbuffersize: UInt, pdwrequiredsize: MutPtr, pvreserved: ConstPtr): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingTranslateInfStringExW(hinf.rawAddress, pszinffilename.rawAddress, psztranslatesection.rawAddress, psztranslatekey.rawAddress, pszbuffer.rawAddress, dwbuffersize.toInt(), pdwrequiredsize.rawAddress, pvreserved.rawAddress)

public actual fun translateInfStringW(pszinffilename: Pcwstr, pszinstallsection: Pcwstr, psztranslatesection: Pcwstr, psztranslatekey: Pcwstr, pszbuffer: Pwstr, cchbuffer: UInt, pdwrequiredsize: MutPtr, pvreserved: ConstPtr): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingTranslateInfStringW(pszinffilename.rawAddress, pszinstallsection.rawAddress, psztranslatesection.rawAddress, psztranslatekey.rawAddress, pszbuffer.rawAddress, cchbuffer.toInt(), pdwrequiredsize.rawAddress, pvreserved.rawAddress)

public actual fun unsubscribeFeatureStateChangeNotification(subscription: FeatureStateChangeSubscription) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingUnsubscribeFeatureStateChangeNotification(subscription.rawAddress)
}

public actual fun userInstStubWrapperA(hwnd: Hwnd, hinstance: Hinstance, pszparms: Pcstr, nshow: Int): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingUserInstStubWrapperA(hwnd.rawAddress, hinstance.rawAddress, pszparms.rawAddress, nshow)

public actual fun userInstStubWrapperW(hwnd: Hwnd, hinstance: Hinstance, pszparms: Pcwstr, nshow: Int): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingUserInstStubWrapperW(hwnd.rawAddress, hinstance.rawAddress, pszparms.rawAddress, nshow)

public actual fun userUnInstStubWrapperA(hwnd: Hwnd, hinstance: Hinstance, pszparms: Pcstr, nshow: Int): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingUserUnInstStubWrapperA(hwnd.rawAddress, hinstance.rawAddress, pszparms.rawAddress, nshow)

public actual fun userUnInstStubWrapperW(hwnd: Hwnd, hinstance: Hinstance, pszparms: Pcwstr, nshow: Int): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingUserUnInstStubWrapperW(hwnd.rawAddress, hinstance.rawAddress, pszparms.rawAddress, nshow)

public actual fun wINNLSEnableIME(param0: Hwnd, param1: Bool): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingWINNLSEnableIME(param0.rawAddress, param1)

public actual fun wINNLSGetEnableStatus(param0: Hwnd): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingWINNLSGetEnableStatus(param0.rawAddress)

public actual fun wINNLSGetIMEHotkey(param0: Hwnd): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingWINNLSGetIMEHotkey(param0.rawAddress).toUInt()

public actual fun winWatchClose(hww: Hwinwatch) {
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingWinWatchClose(hww.rawAddress)
}

public actual fun winWatchDidStatusChange(hww: Hwinwatch): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingWinWatchDidStatusChange(hww.rawAddress)

public actual fun winWatchGetClipList(hww: Hwinwatch, prc: MutPtr, size: UInt, prd: MutPtr): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingWinWatchGetClipList(hww.rawAddress, prc.rawAddress, size.toInt(), prd.rawAddress).toUInt()

public actual fun winWatchNotify(hww: Hwinwatch, notifycallback: Winwatchnotifyproc, notifyparam: Lparam): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingWinWatchNotify(hww.rawAddress, 0L, notifyparam)

public actual fun winWatchOpen(hwnd: Hwnd): Hwinwatch =
    MutPtr(WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingWinWatchOpen(hwnd.rawAddress))

public actual fun wldpCanExecuteBuffer(host: ConstPtr, options: WldpExecutionEvaluationOptions, buffer: ConstPtr, buffersize: UInt, auditinfo: Pcwstr, result: MutPtr): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingWldpCanExecuteBuffer(host.rawAddress, options, buffer.rawAddress, buffersize.toInt(), auditinfo.rawAddress, result.rawAddress)

public actual fun wldpCanExecuteFile(host: ConstPtr, options: WldpExecutionEvaluationOptions, filehandle: Handle, auditinfo: Pcwstr, result: MutPtr): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingWldpCanExecuteFile(host.rawAddress, options, filehandle.rawAddress, auditinfo.rawAddress, result.rawAddress)

public actual fun wldpCanExecuteStream(host: ConstPtr, options: WldpExecutionEvaluationOptions, stream: MutPtr, auditinfo: Pcwstr, result: MutPtr): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingWldpCanExecuteStream(host.rawAddress, options, stream.rawAddress, auditinfo.rawAddress, result.rawAddress)

public actual fun wldpGetLockdownPolicy(hostinformation: ConstPtr, lockdownstate: MutPtr, lockdownflags: UInt): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingWldpGetLockdownPolicy(hostinformation.rawAddress, lockdownstate.rawAddress, lockdownflags.toInt())

public actual fun wldpIsClassInApprovedList(classid: ConstPtr, hostinformation: ConstPtr, isapproved: MutPtr, optionalflags: UInt): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingWldpIsClassInApprovedList(classid.rawAddress, hostinformation.rawAddress, isapproved.rawAddress, optionalflags.toInt())

public actual fun wldpIsDynamicCodePolicyEnabled(isenabled: MutPtr): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingWldpIsDynamicCodePolicyEnabled(isenabled.rawAddress)

public actual fun wldpQueryDeviceSecurityInformation(information: MutPtr, informationlength: UInt, returnlength: MutPtr): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingWldpQueryDeviceSecurityInformation(information.rawAddress, informationlength.toInt(), returnlength.rawAddress)

public actual fun wldpQueryDynamicCodeTrust(filehandle: Handle, baseimage: ConstPtr, imagesize: UInt): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingWldpQueryDynamicCodeTrust(filehandle.rawAddress, baseimage.rawAddress, imagesize.toInt())

public actual fun wldpSetDynamicCodeTrust(filehandle: Handle): Hresult =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingWldpSetDynamicCodeTrust(filehandle.rawAddress)

public actual fun writePrivateProfileSectionA(lpappname: Pcstr, lpstring: Pcstr, lpfilename: Pcstr): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingWritePrivateProfileSectionA(lpappname.rawAddress, lpstring.rawAddress, lpfilename.rawAddress)

public actual fun writePrivateProfileSectionW(lpappname: Pcwstr, lpstring: Pcwstr, lpfilename: Pcwstr): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingWritePrivateProfileSectionW(lpappname.rawAddress, lpstring.rawAddress, lpfilename.rawAddress)

public actual fun writePrivateProfileStringA(lpappname: Pcstr, lpkeyname: Pcstr, lpstring: Pcstr, lpfilename: Pcstr): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingWritePrivateProfileStringA(lpappname.rawAddress, lpkeyname.rawAddress, lpstring.rawAddress, lpfilename.rawAddress)

public actual fun writePrivateProfileStringW(lpappname: Pcwstr, lpkeyname: Pcwstr, lpstring: Pcwstr, lpfilename: Pcwstr): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingWritePrivateProfileStringW(lpappname.rawAddress, lpkeyname.rawAddress, lpstring.rawAddress, lpfilename.rawAddress)

public actual fun writePrivateProfileStructA(lpszsection: Pcstr, lpszkey: Pcstr, lpstruct: ConstPtr, usizestruct: UInt, szfile: Pcstr): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingWritePrivateProfileStructA(lpszsection.rawAddress, lpszkey.rawAddress, lpstruct.rawAddress, usizestruct.toInt(), szfile.rawAddress)

public actual fun writePrivateProfileStructW(lpszsection: Pcwstr, lpszkey: Pcwstr, lpstruct: ConstPtr, usizestruct: UInt, szfile: Pcwstr): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingWritePrivateProfileStructW(lpszsection.rawAddress, lpszkey.rawAddress, lpstruct.rawAddress, usizestruct.toInt(), szfile.rawAddress)

public actual fun writeProfileSectionA(lpappname: Pcstr, lpstring: Pcstr): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingWriteProfileSectionA(lpappname.rawAddress, lpstring.rawAddress)

public actual fun writeProfileSectionW(lpappname: Pcwstr, lpstring: Pcwstr): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingWriteProfileSectionW(lpappname.rawAddress, lpstring.rawAddress)

public actual fun writeProfileStringA(lpappname: Pcstr, lpkeyname: Pcstr, lpstring: Pcstr): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingWriteProfileStringA(lpappname.rawAddress, lpkeyname.rawAddress, lpstring.rawAddress)

public actual fun writeProfileStringW(lpappname: Pcwstr, lpkeyname: Pcwstr, lpstring: Pcwstr): Bool =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingWriteProfileStringW(lpappname.rawAddress, lpkeyname.rawAddress, lpstring.rawAddress)

public actual fun hread(hfile: Int, lpbuffer: MutPtr, lbytes: Int): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingHread(hfile, lpbuffer.rawAddress, lbytes)

public actual fun hwrite(hfile: Int, lpbuffer: Pcstr, lbytes: Int): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingHwrite(hfile, lpbuffer.rawAddress, lbytes)

public actual fun lclose(hfile: Int): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingLclose(hfile)

public actual fun lcreat(lppathname: Pcstr, iattribute: Int): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingLcreat(lppathname.rawAddress, iattribute)

public actual fun llseek(hfile: Int, loffset: Int, iorigin: Int): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingLlseek(hfile, loffset, iorigin)

public actual fun lopen(lppathname: Pcstr, ireadwrite: Int): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingLopen(lppathname.rawAddress, ireadwrite)

public actual fun lread(hfile: Int, lpbuffer: MutPtr, ubytes: UInt): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingLread(hfile, lpbuffer.rawAddress, ubytes.toInt()).toUInt()

public actual fun lwrite(hfile: Int, lpbuffer: Pcstr, ubytes: UInt): UInt =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingLwrite(hfile, lpbuffer.rawAddress, ubytes.toInt()).toUInt()

public actual fun uawLstrcmpW(string1: ConstPtr, string2: ConstPtr): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingUawLstrcmpW(string1.rawAddress, string2.rawAddress)

public actual fun uawLstrcmpiW(string1: ConstPtr, string2: ConstPtr): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingUawLstrcmpiW(string1.rawAddress, string2.rawAddress)

public actual fun uawLstrlenW(string: ConstPtr): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingUawLstrlenW(string.rawAddress)

public actual fun uawWcschr(string: ConstPtr, character: UShort): MutPtr =
    MutPtr(WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingUawWcschr(string.rawAddress, character.toShort()))

public actual fun uawWcscpy(destination: MutPtr, source: ConstPtr): MutPtr =
    MutPtr(WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingUawWcscpy(destination.rawAddress, source.rawAddress))

public actual fun uawWcsicmp(string1: ConstPtr, string2: ConstPtr): Int =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingUawWcsicmp(string1.rawAddress, string2.rawAddress)

public actual fun uawWcslen(string: ConstPtr): ULong =
    WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingUawWcslen(string.rawAddress).toULong()

public actual fun uawWcsrchr(string: ConstPtr, character: UShort): MutPtr =
    MutPtr(WindowsWin32SystemWindowsprogrammingJniBridge.windowssysWindowsWin32SystemWindowsprogrammingUawWcsrchr(string.rawAddress, character.toShort()))
