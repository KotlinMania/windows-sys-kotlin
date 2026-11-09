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

public actual fun AddDelBackupEntryA(lpcszfilelist: PCSTR, lpcszbackupdir: PCSTR, lpcszbasename: PCSTR, dwflags: UInt): HRESULT =
    0

public actual fun AddDelBackupEntryW(lpcszfilelist: PCWSTR, lpcszbackupdir: PCWSTR, lpcszbasename: PCWSTR, dwflags: UInt): HRESULT =
    0

public actual fun AdvInstallFileA(hwnd: HWND, lpszsourcedir: PCSTR, lpszsourcefile: PCSTR, lpszdestdir: PCSTR, lpszdestfile: PCSTR, dwflags: UInt, dwreserved: UInt): HRESULT =
    0

public actual fun AdvInstallFileW(hwnd: HWND, lpszsourcedir: PCWSTR, lpszsourcefile: PCWSTR, lpszdestdir: PCWSTR, lpszdestfile: PCWSTR, dwflags: UInt, dwreserved: UInt): HRESULT =
    0

public actual fun ApphelpCheckShellObject(objectclsid: Long, bshimifnecessary: BOOL, pullflags: Long): BOOL =
    0

public actual fun CancelDeviceWakeupRequest(hdevice: HANDLE): BOOL =
    0

public actual fun CloseINFEngine(hinf: Long): HRESULT =
    0

public actual fun ConvertAuxiliaryCounterToPerformanceCounter(ullauxiliarycountervalue: ULong, lpperformancecountervalue: Long, lpconversionerror: Long): HRESULT =
    0

public actual fun ConvertPerformanceCounterToAuxiliaryCounter(ullperformancecountervalue: ULong, lpauxiliarycountervalue: Long, lpconversionerror: Long): HRESULT =
    0

public actual fun DCIBeginAccess(pdci: Long, x: Int, y: Int, dx: Int, dy: Int): Int =
    0

public actual fun DCICloseProvider(hdc: HDC) {
}

public actual fun DCICreateOffscreen(hdc: HDC, dwcompression: UInt, dwredmask: UInt, dwgreenmask: UInt, dwbluemask: UInt, dwwidth: UInt, dwheight: UInt, dwdcicaps: UInt, dwbitcount: UInt, lplpsurface: Long): Int =
    0

public actual fun DCICreateOverlay(hdc: HDC, lpoffscreensurf: Long, lplpsurface: Long): Int =
    0

public actual fun DCICreatePrimary(hdc: HDC, lplpsurface: Long): Int =
    0

public actual fun DCIDestroy(pdci: Long) {
}

public actual fun DCIDraw(pdci: Long): Int =
    0

public actual fun DCIEndAccess(pdci: Long) {
}

public actual fun DCIEnum(hdc: HDC, lprdst: Long, lprsrc: Long, lpfncallback: Long, lpcontext: Long): Int =
    0

public actual fun DCIOpenProvider(): HDC =
    0L

public actual fun DCISetClipList(pdci: Long, prd: Long): Int =
    0

public actual fun DCISetDestination(pdci: Long, dst: Long, src: Long): Int =
    0

public actual fun DCISetSrcDestClip(pdci: Long, srcrc: Long, destrc: Long, prd: Long): Int =
    0

public actual fun DelNodeA(pszfileordirname: PCSTR, dwflags: UInt): HRESULT =
    0

public actual fun DelNodeRunDLL32W(hwnd: HWND, hinstance: HINSTANCE, pszparms: PWSTR, nshow: Int): HRESULT =
    0

public actual fun DelNodeW(pszfileordirname: PCWSTR, dwflags: UInt): HRESULT =
    0

public actual fun DnsHostnameToComputerNameA(hostname: PCSTR, computername: PSTR, nsize: Long): BOOL =
    0

public actual fun DnsHostnameToComputerNameW(hostname: PCWSTR, computername: PWSTR, nsize: Long): BOOL =
    0

public actual fun DosDateTimeToFileTime(wfatdate: UShort, wfattime: UShort, lpfiletime: Long): BOOL =
    0

public actual fun EnableProcessOptionalXStateFeatures(features: ULong): BOOL =
    0

public actual fun ExecuteCabA(hwnd: HWND, pcab: Long, preserved: Long): HRESULT =
    0

public actual fun ExecuteCabW(hwnd: HWND, pcab: Long, preserved: Long): HRESULT =
    0

public actual fun ExtractFilesA(pszcabname: PCSTR, pszexpanddir: PCSTR, dwflags: UInt, pszfilelist: PCSTR, lpreserved: Long, dwreserved: UInt): HRESULT =
    0

public actual fun ExtractFilesW(pszcabname: PCWSTR, pszexpanddir: PCWSTR, dwflags: UInt, pszfilelist: PCWSTR, lpreserved: Long, dwreserved: UInt): HRESULT =
    0

public actual fun FileSaveMarkNotExistA(lpfilelist: PCSTR, lpdir: PCSTR, lpbasename: PCSTR): HRESULT =
    0

public actual fun FileSaveMarkNotExistW(lpfilelist: PCWSTR, lpdir: PCWSTR, lpbasename: PCWSTR): HRESULT =
    0

public actual fun FileSaveRestoreOnINFA(hwnd: HWND, psztitle: PCSTR, pszinf: PCSTR, pszsection: PCSTR, pszbackupdir: PCSTR, pszbasebackupfile: PCSTR, dwflags: UInt): HRESULT =
    0

public actual fun FileSaveRestoreOnINFW(hwnd: HWND, psztitle: PCWSTR, pszinf: PCWSTR, pszsection: PCWSTR, pszbackupdir: PCWSTR, pszbasebackupfile: PCWSTR, dwflags: UInt): HRESULT =
    0

public actual fun FileSaveRestoreW(hdlg: HWND, lpfilelist: PCWSTR, lpdir: PCWSTR, lpbasename: PCWSTR, dwflags: UInt): HRESULT =
    0

public actual fun FileTimeToDosDateTime(lpfiletime: Long, lpfatdate: Long, lpfattime: Long): BOOL =
    0

public actual fun GdiEntry13(): UInt =
    0u

public actual fun GetComputerNameA(lpbuffer: PSTR, nsize: Long): BOOL =
    0

public actual fun GetComputerNameW(lpbuffer: PWSTR, nsize: Long): BOOL =
    0

public actual fun GetCurrentHwProfileA(lphwprofileinfo: Long): BOOL =
    0

public actual fun GetCurrentHwProfileW(lphwprofileinfo: Long): BOOL =
    0

public actual fun GetDCRegionData(hdc: HDC, size: UInt, prd: Long): UInt =
    0u

public actual fun GetFeatureEnabledState(featureid: UInt, changetime: FEATURE_CHANGE_TIME): FEATURE_ENABLED_STATE =
    0

public actual fun GetFeatureVariant(featureid: UInt, changetime: FEATURE_CHANGE_TIME, payloadid: Long, hasnotification: Long): UInt =
    0u

public actual fun GetFirmwareEnvironmentVariableA(lpname: PCSTR, lpguid: PCSTR, pbuffer: Long, nsize: UInt): UInt =
    0u

public actual fun GetFirmwareEnvironmentVariableExA(lpname: PCSTR, lpguid: PCSTR, pbuffer: Long, nsize: UInt, pdwattribubutes: Long): UInt =
    0u

public actual fun GetFirmwareEnvironmentVariableExW(lpname: PCWSTR, lpguid: PCWSTR, pbuffer: Long, nsize: UInt, pdwattribubutes: Long): UInt =
    0u

public actual fun GetFirmwareEnvironmentVariableW(lpname: PCWSTR, lpguid: PCWSTR, pbuffer: Long, nsize: UInt): UInt =
    0u

public actual fun GetPrivateProfileIntA(lpappname: PCSTR, lpkeyname: PCSTR, ndefault: Int, lpfilename: PCSTR): UInt =
    0u

public actual fun GetPrivateProfileIntW(lpappname: PCWSTR, lpkeyname: PCWSTR, ndefault: Int, lpfilename: PCWSTR): Int =
    0

public actual fun GetPrivateProfileSectionA(lpappname: PCSTR, lpreturnedstring: PSTR, nsize: UInt, lpfilename: PCSTR): UInt =
    0u

public actual fun GetPrivateProfileSectionNamesA(lpszreturnbuffer: PSTR, nsize: UInt, lpfilename: PCSTR): UInt =
    0u

public actual fun GetPrivateProfileSectionNamesW(lpszreturnbuffer: PWSTR, nsize: UInt, lpfilename: PCWSTR): UInt =
    0u

public actual fun GetPrivateProfileSectionW(lpappname: PCWSTR, lpreturnedstring: PWSTR, nsize: UInt, lpfilename: PCWSTR): UInt =
    0u

public actual fun GetPrivateProfileStringA(lpappname: PCSTR, lpkeyname: PCSTR, lpdefault: PCSTR, lpreturnedstring: PSTR, nsize: UInt, lpfilename: PCSTR): UInt =
    0u

public actual fun GetPrivateProfileStringW(lpappname: PCWSTR, lpkeyname: PCWSTR, lpdefault: PCWSTR, lpreturnedstring: PWSTR, nsize: UInt, lpfilename: PCWSTR): UInt =
    0u

public actual fun GetPrivateProfileStructA(lpszsection: PCSTR, lpszkey: PCSTR, lpstruct: Long, usizestruct: UInt, szfile: PCSTR): BOOL =
    0

public actual fun GetPrivateProfileStructW(lpszsection: PCWSTR, lpszkey: PCWSTR, lpstruct: Long, usizestruct: UInt, szfile: PCWSTR): BOOL =
    0

public actual fun GetProfileIntA(lpappname: PCSTR, lpkeyname: PCSTR, ndefault: Int): UInt =
    0u

public actual fun GetProfileIntW(lpappname: PCWSTR, lpkeyname: PCWSTR, ndefault: Int): UInt =
    0u

public actual fun GetProfileSectionA(lpappname: PCSTR, lpreturnedstring: PSTR, nsize: UInt): UInt =
    0u

public actual fun GetProfileSectionW(lpappname: PCWSTR, lpreturnedstring: PWSTR, nsize: UInt): UInt =
    0u

public actual fun GetProfileStringA(lpappname: PCSTR, lpkeyname: PCSTR, lpdefault: PCSTR, lpreturnedstring: PSTR, nsize: UInt): UInt =
    0u

public actual fun GetProfileStringW(lpappname: PCWSTR, lpkeyname: PCWSTR, lpdefault: PCWSTR, lpreturnedstring: PWSTR, nsize: UInt): UInt =
    0u

public actual fun GetSystemRegistryQuota(pdwquotaallowed: Long, pdwquotaused: Long): BOOL =
    0

public actual fun GetThreadEnabledXStateFeatures(): ULong =
    0uL

public actual fun GetUserNameA(lpbuffer: PSTR, pcbbuffer: Long): BOOL =
    0

public actual fun GetUserNameW(lpbuffer: PWSTR, pcbbuffer: Long): BOOL =
    0

public actual fun GetVersionFromFileA(lpszfilename: PCSTR, pdwmsver: Long, pdwlsver: Long, bversion: BOOL): HRESULT =
    0

public actual fun GetVersionFromFileExA(lpszfilename: PCSTR, pdwmsver: Long, pdwlsver: Long, bversion: BOOL): HRESULT =
    0

public actual fun GetVersionFromFileExW(lpszfilename: PCWSTR, pdwmsver: Long, pdwlsver: Long, bversion: BOOL): HRESULT =
    0

public actual fun GetVersionFromFileW(lpszfilename: PCWSTR, pdwmsver: Long, pdwlsver: Long, bversion: BOOL): HRESULT =
    0

public actual fun GetWindowRegionData(hwnd: HWND, size: UInt, prd: Long): UInt =
    0u

public actual fun GlobalCompact(dwminfree: UInt): ULong =
    0uL

public actual fun GlobalFix(hmem: HGLOBAL) {
}

public actual fun GlobalUnWire(hmem: HGLOBAL): BOOL =
    0

public actual fun GlobalUnfix(hmem: HGLOBAL) {
}

public actual fun GlobalWire(hmem: HGLOBAL): Long =
    0L

public actual fun IMPGetIMEA(param0: HWND, param1: Long): BOOL =
    0

public actual fun IMPGetIMEW(param0: HWND, param1: Long): BOOL =
    0

public actual fun IMPQueryIMEA(param0: Long): BOOL =
    0

public actual fun IMPQueryIMEW(param0: Long): BOOL =
    0

public actual fun IMPSetIMEA(param0: HWND, param1: Long): BOOL =
    0

public actual fun IMPSetIMEW(param0: HWND, param1: Long): BOOL =
    0

public actual fun IsApiSetImplemented(contract: PCSTR): BOOL =
    0

public actual fun IsBadHugeReadPtr(lp: Long, ucb: ULong): BOOL =
    0

public actual fun IsBadHugeWritePtr(lp: Long, ucb: ULong): BOOL =
    0

public actual fun IsNTAdmin(dwreserved: UInt, lpdwreserved: Long): BOOL =
    0

public actual fun IsNativeVhdBoot(nativevhdboot: Long): BOOL =
    0

public actual fun IsTokenUntrusted(tokenhandle: HANDLE): BOOL =
    0

public actual fun LaunchINFSectionExW(hwnd: HWND, hinstance: HINSTANCE, pszparms: PCWSTR, nshow: Int): HRESULT =
    0

public actual fun LaunchINFSectionW(hwndowner: HWND, hinstance: HINSTANCE, pszparams: PWSTR, nshow: Int): Int =
    0

public actual fun LocalCompact(uminfree: UInt): ULong =
    0uL

public actual fun LocalShrink(hmem: HLOCAL, cbnewsize: UInt): ULong =
    0uL

public actual fun MulDiv(nnumber: Int, nnumerator: Int, ndenominator: Int): Int =
    0

public actual fun NeedReboot(dwrebootcheck: UInt): BOOL =
    0

public actual fun NeedRebootInit(): UInt =
    0u

public actual fun OpenINFEngineA(pszinffilename: PCSTR, pszinstallsection: PCSTR, dwflags: UInt, phinf: Long, pvreserved: Long): HRESULT =
    0

public actual fun OpenINFEngineW(pszinffilename: PCWSTR, pszinstallsection: PCWSTR, dwflags: UInt, phinf: Long, pvreserved: Long): HRESULT =
    0

public actual fun OpenMutexA(dwdesiredaccess: UInt, binherithandle: BOOL, lpname: PCSTR): HANDLE =
    0L

public actual fun OpenSemaphoreA(dwdesiredaccess: UInt, binherithandle: BOOL, lpname: PCSTR): HANDLE =
    0L

public actual fun QueryAuxiliaryCounterFrequency(lpauxiliarycounterfrequency: Long): HRESULT =
    0

public actual fun QueryIdleProcessorCycleTime(bufferlength: Long, processoridlecycletime: Long): BOOL =
    0

public actual fun QueryIdleProcessorCycleTimeEx(group: UShort, bufferlength: Long, processoridlecycletime: Long): BOOL =
    0

public actual fun QueryInterruptTime(lpinterrupttime: Long) {
}

public actual fun QueryInterruptTimePrecise(lpinterrupttimeprecise: Long) {
}

public actual fun QueryProcessCycleTime(processhandle: HANDLE, cycletime: Long): BOOL =
    0

public actual fun QueryThreadCycleTime(threadhandle: HANDLE, cycletime: Long): BOOL =
    0

public actual fun QueryUnbiasedInterruptTime(unbiasedtime: Long): BOOL =
    0

public actual fun QueryUnbiasedInterruptTimePrecise(lpunbiasedinterrupttimeprecise: Long) {
}

public actual fun RaiseCustomSystemEventTrigger(customsystemeventtriggerconfig: Long): UInt =
    0u

public actual fun RebootCheckOnInstallA(hwnd: HWND, pszinf: PCSTR, pszsec: PCSTR, dwreserved: UInt): HRESULT =
    0

public actual fun RebootCheckOnInstallW(hwnd: HWND, pszinf: PCWSTR, pszsec: PCWSTR, dwreserved: UInt): HRESULT =
    0

public actual fun RecordFeatureError(featureid: UInt, error: Long) {
}

public actual fun RecordFeatureUsage(featureid: UInt, kind: UInt, addend: UInt, originname: PCSTR) {
}

public actual fun RegInstallA(hmod: HMODULE, pszsection: PCSTR, psttable: Long): HRESULT =
    0

public actual fun RegInstallW(hmod: HMODULE, pszsection: PCWSTR, psttable: Long): HRESULT =
    0

public actual fun RegRestoreAllA(hwnd: HWND, psztitlestring: PCSTR, hkbckupkey: HKEY): HRESULT =
    0

public actual fun RegRestoreAllW(hwnd: HWND, psztitlestring: PCWSTR, hkbckupkey: HKEY): HRESULT =
    0

public actual fun RegSaveRestoreA(hwnd: HWND, psztitlestring: PCSTR, hkbckupkey: HKEY, pcszrootkey: PCSTR, pcszsubkey: PCSTR, pcszvaluename: PCSTR, dwflags: UInt): HRESULT =
    0

public actual fun RegSaveRestoreOnINFA(hwnd: HWND, psztitle: PCSTR, pszinf: PCSTR, pszsection: PCSTR, hhklmbackkey: HKEY, hhkcubackkey: HKEY, dwflags: UInt): HRESULT =
    0

public actual fun RegSaveRestoreOnINFW(hwnd: HWND, psztitle: PCWSTR, pszinf: PCWSTR, pszsection: PCWSTR, hhklmbackkey: HKEY, hhkcubackkey: HKEY, dwflags: UInt): HRESULT =
    0

public actual fun RegSaveRestoreW(hwnd: HWND, psztitlestring: PCWSTR, hkbckupkey: HKEY, pcszrootkey: PCWSTR, pcszsubkey: PCWSTR, pcszvaluename: PCWSTR, dwflags: UInt): HRESULT =
    0

public actual fun ReplacePartitionUnit(targetpartition: PCWSTR, sparepartition: PCWSTR, flags: UInt): BOOL =
    0

public actual fun RequestDeviceWakeup(hdevice: HANDLE): BOOL =
    0

public actual fun RtlAnsiStringToUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS =
    0

public actual fun RtlCharToInteger(string: Long, base: UInt, value: Long): NTSTATUS =
    0

public actual fun RtlFreeAnsiString(ansistring: Long) {
}

public actual fun RtlFreeOemString(oemstring: Long) {
}

public actual fun RtlFreeUnicodeString(unicodestring: Long) {
}

public actual fun RtlGetReturnAddressHijackTarget(): ULong =
    0uL

public actual fun RtlInitAnsiString(destinationstring: Long, sourcestring: Long) {
}

public actual fun RtlInitAnsiStringEx(destinationstring: Long, sourcestring: Long): NTSTATUS =
    0

public actual fun RtlInitString(destinationstring: Long, sourcestring: Long) {
}

public actual fun RtlInitStringEx(destinationstring: Long, sourcestring: Long): NTSTATUS =
    0

public actual fun RtlInitUnicodeString(destinationstring: Long, sourcestring: PCWSTR) {
}

public actual fun RtlIsNameLegalDOS8Dot3(name: Long, oemname: Long, namecontainsspaces: Long): Boolean =
    false

public actual fun RtlLocalTimeToSystemTime(localtime: Long, systemtime: Long): NTSTATUS =
    0

public actual fun RtlRaiseCustomSystemEventTrigger(triggerconfig: Long): UInt =
    0u

public actual fun RtlTimeToSecondsSince1970(time: Long, elapsedseconds: Long): Boolean =
    false

public actual fun RtlUnicodeStringToAnsiString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS =
    0

public actual fun RtlUnicodeStringToOemString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS =
    0

public actual fun RtlUnicodeToMultiByteSize(bytesinmultibytestring: Long, unicodestring: PCWSTR, bytesinunicodestring: UInt): NTSTATUS =
    0

public actual fun RtlUniform(seed: Long): UInt =
    0u

public actual fun RunSetupCommandA(hwnd: HWND, szcmdname: PCSTR, szinfsection: PCSTR, szdir: PCSTR, lpsztitle: PCSTR, phexe: Long, dwflags: UInt, pvreserved: Long): HRESULT =
    0

public actual fun RunSetupCommandW(hwnd: HWND, szcmdname: PCWSTR, szinfsection: PCWSTR, szdir: PCWSTR, lpsztitle: PCWSTR, phexe: Long, dwflags: UInt, pvreserved: Long): HRESULT =
    0

public actual fun SendIMEMessageExA(param0: HWND, param1: LPARAM): LRESULT =
    0L

public actual fun SendIMEMessageExW(param0: HWND, param1: LPARAM): LRESULT =
    0L

public actual fun SetEnvironmentStringsA(newenvironment: PCSTR): BOOL =
    0

public actual fun SetFirmwareEnvironmentVariableA(lpname: PCSTR, lpguid: PCSTR, pvalue: Long, nsize: UInt): BOOL =
    0

public actual fun SetFirmwareEnvironmentVariableExA(lpname: PCSTR, lpguid: PCSTR, pvalue: Long, nsize: UInt, dwattributes: UInt): BOOL =
    0

public actual fun SetFirmwareEnvironmentVariableExW(lpname: PCWSTR, lpguid: PCWSTR, pvalue: Long, nsize: UInt, dwattributes: UInt): BOOL =
    0

public actual fun SetFirmwareEnvironmentVariableW(lpname: PCWSTR, lpguid: PCWSTR, pvalue: Long, nsize: UInt): BOOL =
    0

public actual fun SetHandleCount(unumber: UInt): UInt =
    0u

public actual fun SetMessageWaitingIndicator(hmsgindicator: HANDLE, ulmsgcount: UInt): BOOL =
    0

public actual fun SetPerUserSecValuesA(pperuser: Long): HRESULT =
    0

public actual fun SetPerUserSecValuesW(pperuser: Long): HRESULT =
    0

public actual fun SubscribeFeatureStateChangeNotification(subscription: Long, callback: PFEATURE_STATE_CHANGE_CALLBACK, context: Long) {
}

public actual fun TranslateInfStringA(pszinffilename: PCSTR, pszinstallsection: PCSTR, psztranslatesection: PCSTR, psztranslatekey: PCSTR, pszbuffer: PSTR, cchbuffer: UInt, pdwrequiredsize: Long, pvreserved: Long): HRESULT =
    0

public actual fun TranslateInfStringExA(hinf: Long, pszinffilename: PCSTR, psztranslatesection: PCSTR, psztranslatekey: PCSTR, pszbuffer: PSTR, dwbuffersize: UInt, pdwrequiredsize: Long, pvreserved: Long): HRESULT =
    0

public actual fun TranslateInfStringExW(hinf: Long, pszinffilename: PCWSTR, psztranslatesection: PCWSTR, psztranslatekey: PCWSTR, pszbuffer: PWSTR, dwbuffersize: UInt, pdwrequiredsize: Long, pvreserved: Long): HRESULT =
    0

public actual fun TranslateInfStringW(pszinffilename: PCWSTR, pszinstallsection: PCWSTR, psztranslatesection: PCWSTR, psztranslatekey: PCWSTR, pszbuffer: PWSTR, cchbuffer: UInt, pdwrequiredsize: Long, pvreserved: Long): HRESULT =
    0

public actual fun UnsubscribeFeatureStateChangeNotification(subscription: FEATURE_STATE_CHANGE_SUBSCRIPTION) {
}

public actual fun UserInstStubWrapperA(hwnd: HWND, hinstance: HINSTANCE, pszparms: PCSTR, nshow: Int): HRESULT =
    0

public actual fun UserInstStubWrapperW(hwnd: HWND, hinstance: HINSTANCE, pszparms: PCWSTR, nshow: Int): HRESULT =
    0

public actual fun UserUnInstStubWrapperA(hwnd: HWND, hinstance: HINSTANCE, pszparms: PCSTR, nshow: Int): HRESULT =
    0

public actual fun UserUnInstStubWrapperW(hwnd: HWND, hinstance: HINSTANCE, pszparms: PCWSTR, nshow: Int): HRESULT =
    0

public actual fun WINNLSEnableIME(param0: HWND, param1: BOOL): BOOL =
    0

public actual fun WINNLSGetEnableStatus(param0: HWND): BOOL =
    0

public actual fun WINNLSGetIMEHotkey(param0: HWND): UInt =
    0u

public actual fun WinWatchClose(hww: HWINWATCH) {
}

public actual fun WinWatchDidStatusChange(hww: HWINWATCH): BOOL =
    0

public actual fun WinWatchGetClipList(hww: HWINWATCH, prc: Long, size: UInt, prd: Long): UInt =
    0u

public actual fun WinWatchNotify(hww: HWINWATCH, notifycallback: WINWATCHNOTIFYPROC, notifyparam: LPARAM): BOOL =
    0

public actual fun WinWatchOpen(hwnd: HWND): HWINWATCH =
    0L

public actual fun WldpCanExecuteBuffer(host: Long, options: WLDP_EXECUTION_EVALUATION_OPTIONS, buffer: Long, buffersize: UInt, auditinfo: PCWSTR, result: Long): HRESULT =
    0

public actual fun WldpCanExecuteFile(host: Long, options: WLDP_EXECUTION_EVALUATION_OPTIONS, filehandle: HANDLE, auditinfo: PCWSTR, result: Long): HRESULT =
    0

public actual fun WldpCanExecuteStream(host: Long, options: WLDP_EXECUTION_EVALUATION_OPTIONS, stream: Long, auditinfo: PCWSTR, result: Long): HRESULT =
    0

public actual fun WldpGetLockdownPolicy(hostinformation: Long, lockdownstate: Long, lockdownflags: UInt): HRESULT =
    0

public actual fun WldpIsClassInApprovedList(classid: Long, hostinformation: Long, isapproved: Long, optionalflags: UInt): HRESULT =
    0

public actual fun WldpIsDynamicCodePolicyEnabled(isenabled: Long): HRESULT =
    0

public actual fun WldpQueryDeviceSecurityInformation(information: Long, informationlength: UInt, returnlength: Long): HRESULT =
    0

public actual fun WldpQueryDynamicCodeTrust(filehandle: HANDLE, baseimage: Long, imagesize: UInt): HRESULT =
    0

public actual fun WldpSetDynamicCodeTrust(filehandle: HANDLE): HRESULT =
    0

public actual fun WritePrivateProfileSectionA(lpappname: PCSTR, lpstring: PCSTR, lpfilename: PCSTR): BOOL =
    0

public actual fun WritePrivateProfileSectionW(lpappname: PCWSTR, lpstring: PCWSTR, lpfilename: PCWSTR): BOOL =
    0

public actual fun WritePrivateProfileStringA(lpappname: PCSTR, lpkeyname: PCSTR, lpstring: PCSTR, lpfilename: PCSTR): BOOL =
    0

public actual fun WritePrivateProfileStringW(lpappname: PCWSTR, lpkeyname: PCWSTR, lpstring: PCWSTR, lpfilename: PCWSTR): BOOL =
    0

public actual fun WritePrivateProfileStructA(lpszsection: PCSTR, lpszkey: PCSTR, lpstruct: Long, usizestruct: UInt, szfile: PCSTR): BOOL =
    0

public actual fun WritePrivateProfileStructW(lpszsection: PCWSTR, lpszkey: PCWSTR, lpstruct: Long, usizestruct: UInt, szfile: PCWSTR): BOOL =
    0

public actual fun WriteProfileSectionA(lpappname: PCSTR, lpstring: PCSTR): BOOL =
    0

public actual fun WriteProfileSectionW(lpappname: PCWSTR, lpstring: PCWSTR): BOOL =
    0

public actual fun WriteProfileStringA(lpappname: PCSTR, lpkeyname: PCSTR, lpstring: PCSTR): BOOL =
    0

public actual fun WriteProfileStringW(lpappname: PCWSTR, lpkeyname: PCWSTR, lpstring: PCWSTR): BOOL =
    0

public actual fun _hread(hfile: Int, lpbuffer: Long, lbytes: Int): Int =
    0

public actual fun _hwrite(hfile: Int, lpbuffer: PCSTR, lbytes: Int): Int =
    0

public actual fun _lclose(hfile: Int): Int =
    0

public actual fun _lcreat(lppathname: PCSTR, iattribute: Int): Int =
    0

public actual fun _llseek(hfile: Int, loffset: Int, iorigin: Int): Int =
    0

public actual fun _lopen(lppathname: PCSTR, ireadwrite: Int): Int =
    0

public actual fun _lread(hfile: Int, lpbuffer: Long, ubytes: UInt): UInt =
    0u

public actual fun _lwrite(hfile: Int, lpbuffer: PCSTR, ubytes: UInt): UInt =
    0u

public actual fun uaw_lstrcmpW(string1: Long, string2: Long): Int =
    0

public actual fun uaw_lstrcmpiW(string1: Long, string2: Long): Int =
    0

public actual fun uaw_lstrlenW(string: Long): Int =
    0

public actual fun uaw_wcschr(string: Long, character: UShort): Long =
    0L

public actual fun uaw_wcscpy(destination: Long, source: Long): Long =
    0L

public actual fun uaw_wcsicmp(string1: Long, string2: Long): Int =
    0

public actual fun uaw_wcslen(string: Long): ULong =
    0uL

public actual fun uaw_wcsrchr(string: Long, character: UShort): Long =
    0L
