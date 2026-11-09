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

public expect fun AddDelBackupEntryA(lpcszfilelist: PCSTR, lpcszbackupdir: PCSTR, lpcszbasename: PCSTR, dwflags: UInt): HRESULT

public expect fun AddDelBackupEntryW(lpcszfilelist: PCWSTR, lpcszbackupdir: PCWSTR, lpcszbasename: PCWSTR, dwflags: UInt): HRESULT

public expect fun AdvInstallFileA(hwnd: HWND, lpszsourcedir: PCSTR, lpszsourcefile: PCSTR, lpszdestdir: PCSTR, lpszdestfile: PCSTR, dwflags: UInt, dwreserved: UInt): HRESULT

public expect fun AdvInstallFileW(hwnd: HWND, lpszsourcedir: PCWSTR, lpszsourcefile: PCWSTR, lpszdestdir: PCWSTR, lpszdestfile: PCWSTR, dwflags: UInt, dwreserved: UInt): HRESULT

public expect fun ApphelpCheckShellObject(objectclsid: Long, bshimifnecessary: BOOL, pullflags: Long): BOOL

public expect fun CancelDeviceWakeupRequest(hdevice: HANDLE): BOOL

public expect fun CloseINFEngine(hinf: Long): HRESULT

public expect fun ConvertAuxiliaryCounterToPerformanceCounter(ullauxiliarycountervalue: ULong, lpperformancecountervalue: Long, lpconversionerror: Long): HRESULT

public expect fun ConvertPerformanceCounterToAuxiliaryCounter(ullperformancecountervalue: ULong, lpauxiliarycountervalue: Long, lpconversionerror: Long): HRESULT

public expect fun DCIBeginAccess(pdci: Long, x: Int, y: Int, dx: Int, dy: Int): Int

public expect fun DCICloseProvider(hdc: HDC)

public expect fun DCICreateOffscreen(hdc: HDC, dwcompression: UInt, dwredmask: UInt, dwgreenmask: UInt, dwbluemask: UInt, dwwidth: UInt, dwheight: UInt, dwdcicaps: UInt, dwbitcount: UInt, lplpsurface: Long): Int

public expect fun DCICreateOverlay(hdc: HDC, lpoffscreensurf: Long, lplpsurface: Long): Int

public expect fun DCICreatePrimary(hdc: HDC, lplpsurface: Long): Int

public expect fun DCIDestroy(pdci: Long)

public expect fun DCIDraw(pdci: Long): Int

public expect fun DCIEndAccess(pdci: Long)

public expect fun DCIEnum(hdc: HDC, lprdst: Long, lprsrc: Long, lpfncallback: Long, lpcontext: Long): Int

public expect fun DCIOpenProvider(): HDC

public expect fun DCISetClipList(pdci: Long, prd: Long): Int

public expect fun DCISetDestination(pdci: Long, dst: Long, src: Long): Int

public expect fun DCISetSrcDestClip(pdci: Long, srcrc: Long, destrc: Long, prd: Long): Int

public expect fun DelNodeA(pszfileordirname: PCSTR, dwflags: UInt): HRESULT

public expect fun DelNodeRunDLL32W(hwnd: HWND, hinstance: HINSTANCE, pszparms: PWSTR, nshow: Int): HRESULT

public expect fun DelNodeW(pszfileordirname: PCWSTR, dwflags: UInt): HRESULT

public expect fun DnsHostnameToComputerNameA(hostname: PCSTR, computername: PSTR, nsize: Long): BOOL

public expect fun DnsHostnameToComputerNameW(hostname: PCWSTR, computername: PWSTR, nsize: Long): BOOL

public expect fun DosDateTimeToFileTime(wfatdate: UShort, wfattime: UShort, lpfiletime: Long): BOOL

public expect fun EnableProcessOptionalXStateFeatures(features: ULong): BOOL

public expect fun ExecuteCabA(hwnd: HWND, pcab: Long, preserved: Long): HRESULT

public expect fun ExecuteCabW(hwnd: HWND, pcab: Long, preserved: Long): HRESULT

public expect fun ExtractFilesA(pszcabname: PCSTR, pszexpanddir: PCSTR, dwflags: UInt, pszfilelist: PCSTR, lpreserved: Long, dwreserved: UInt): HRESULT

public expect fun ExtractFilesW(pszcabname: PCWSTR, pszexpanddir: PCWSTR, dwflags: UInt, pszfilelist: PCWSTR, lpreserved: Long, dwreserved: UInt): HRESULT

public expect fun FileSaveMarkNotExistA(lpfilelist: PCSTR, lpdir: PCSTR, lpbasename: PCSTR): HRESULT

public expect fun FileSaveMarkNotExistW(lpfilelist: PCWSTR, lpdir: PCWSTR, lpbasename: PCWSTR): HRESULT

public expect fun FileSaveRestoreOnINFA(hwnd: HWND, psztitle: PCSTR, pszinf: PCSTR, pszsection: PCSTR, pszbackupdir: PCSTR, pszbasebackupfile: PCSTR, dwflags: UInt): HRESULT

public expect fun FileSaveRestoreOnINFW(hwnd: HWND, psztitle: PCWSTR, pszinf: PCWSTR, pszsection: PCWSTR, pszbackupdir: PCWSTR, pszbasebackupfile: PCWSTR, dwflags: UInt): HRESULT

public expect fun FileSaveRestoreW(hdlg: HWND, lpfilelist: PCWSTR, lpdir: PCWSTR, lpbasename: PCWSTR, dwflags: UInt): HRESULT

public expect fun FileTimeToDosDateTime(lpfiletime: Long, lpfatdate: Long, lpfattime: Long): BOOL

public expect fun GdiEntry13(): UInt

public expect fun GetComputerNameA(lpbuffer: PSTR, nsize: Long): BOOL

public expect fun GetComputerNameW(lpbuffer: PWSTR, nsize: Long): BOOL

public expect fun GetCurrentHwProfileA(lphwprofileinfo: Long): BOOL

public expect fun GetCurrentHwProfileW(lphwprofileinfo: Long): BOOL

public expect fun GetDCRegionData(hdc: HDC, size: UInt, prd: Long): UInt

public expect fun GetFeatureEnabledState(featureid: UInt, changetime: FEATURE_CHANGE_TIME): FEATURE_ENABLED_STATE

public expect fun GetFeatureVariant(featureid: UInt, changetime: FEATURE_CHANGE_TIME, payloadid: Long, hasnotification: Long): UInt

public expect fun GetFirmwareEnvironmentVariableA(lpname: PCSTR, lpguid: PCSTR, pbuffer: Long, nsize: UInt): UInt

public expect fun GetFirmwareEnvironmentVariableExA(lpname: PCSTR, lpguid: PCSTR, pbuffer: Long, nsize: UInt, pdwattribubutes: Long): UInt

public expect fun GetFirmwareEnvironmentVariableExW(lpname: PCWSTR, lpguid: PCWSTR, pbuffer: Long, nsize: UInt, pdwattribubutes: Long): UInt

public expect fun GetFirmwareEnvironmentVariableW(lpname: PCWSTR, lpguid: PCWSTR, pbuffer: Long, nsize: UInt): UInt

public expect fun GetPrivateProfileIntA(lpappname: PCSTR, lpkeyname: PCSTR, ndefault: Int, lpfilename: PCSTR): UInt

public expect fun GetPrivateProfileIntW(lpappname: PCWSTR, lpkeyname: PCWSTR, ndefault: Int, lpfilename: PCWSTR): Int

public expect fun GetPrivateProfileSectionA(lpappname: PCSTR, lpreturnedstring: PSTR, nsize: UInt, lpfilename: PCSTR): UInt

public expect fun GetPrivateProfileSectionNamesA(lpszreturnbuffer: PSTR, nsize: UInt, lpfilename: PCSTR): UInt

public expect fun GetPrivateProfileSectionNamesW(lpszreturnbuffer: PWSTR, nsize: UInt, lpfilename: PCWSTR): UInt

public expect fun GetPrivateProfileSectionW(lpappname: PCWSTR, lpreturnedstring: PWSTR, nsize: UInt, lpfilename: PCWSTR): UInt

public expect fun GetPrivateProfileStringA(lpappname: PCSTR, lpkeyname: PCSTR, lpdefault: PCSTR, lpreturnedstring: PSTR, nsize: UInt, lpfilename: PCSTR): UInt

public expect fun GetPrivateProfileStringW(lpappname: PCWSTR, lpkeyname: PCWSTR, lpdefault: PCWSTR, lpreturnedstring: PWSTR, nsize: UInt, lpfilename: PCWSTR): UInt

public expect fun GetPrivateProfileStructA(lpszsection: PCSTR, lpszkey: PCSTR, lpstruct: Long, usizestruct: UInt, szfile: PCSTR): BOOL

public expect fun GetPrivateProfileStructW(lpszsection: PCWSTR, lpszkey: PCWSTR, lpstruct: Long, usizestruct: UInt, szfile: PCWSTR): BOOL

public expect fun GetProfileIntA(lpappname: PCSTR, lpkeyname: PCSTR, ndefault: Int): UInt

public expect fun GetProfileIntW(lpappname: PCWSTR, lpkeyname: PCWSTR, ndefault: Int): UInt

public expect fun GetProfileSectionA(lpappname: PCSTR, lpreturnedstring: PSTR, nsize: UInt): UInt

public expect fun GetProfileSectionW(lpappname: PCWSTR, lpreturnedstring: PWSTR, nsize: UInt): UInt

public expect fun GetProfileStringA(lpappname: PCSTR, lpkeyname: PCSTR, lpdefault: PCSTR, lpreturnedstring: PSTR, nsize: UInt): UInt

public expect fun GetProfileStringW(lpappname: PCWSTR, lpkeyname: PCWSTR, lpdefault: PCWSTR, lpreturnedstring: PWSTR, nsize: UInt): UInt

public expect fun GetSystemRegistryQuota(pdwquotaallowed: Long, pdwquotaused: Long): BOOL

public expect fun GetThreadEnabledXStateFeatures(): ULong

public expect fun GetUserNameA(lpbuffer: PSTR, pcbbuffer: Long): BOOL

public expect fun GetUserNameW(lpbuffer: PWSTR, pcbbuffer: Long): BOOL

public expect fun GetVersionFromFileA(lpszfilename: PCSTR, pdwmsver: Long, pdwlsver: Long, bversion: BOOL): HRESULT

public expect fun GetVersionFromFileExA(lpszfilename: PCSTR, pdwmsver: Long, pdwlsver: Long, bversion: BOOL): HRESULT

public expect fun GetVersionFromFileExW(lpszfilename: PCWSTR, pdwmsver: Long, pdwlsver: Long, bversion: BOOL): HRESULT

public expect fun GetVersionFromFileW(lpszfilename: PCWSTR, pdwmsver: Long, pdwlsver: Long, bversion: BOOL): HRESULT

public expect fun GetWindowRegionData(hwnd: HWND, size: UInt, prd: Long): UInt

public expect fun GlobalCompact(dwminfree: UInt): ULong

public expect fun GlobalFix(hmem: HGLOBAL)

public expect fun GlobalUnWire(hmem: HGLOBAL): BOOL

public expect fun GlobalUnfix(hmem: HGLOBAL)

public expect fun GlobalWire(hmem: HGLOBAL): Long

public expect fun IMPGetIMEA(param0: HWND, param1: Long): BOOL

public expect fun IMPGetIMEW(param0: HWND, param1: Long): BOOL

public expect fun IMPQueryIMEA(param0: Long): BOOL

public expect fun IMPQueryIMEW(param0: Long): BOOL

public expect fun IMPSetIMEA(param0: HWND, param1: Long): BOOL

public expect fun IMPSetIMEW(param0: HWND, param1: Long): BOOL

public expect fun IsApiSetImplemented(contract: PCSTR): BOOL

public expect fun IsBadHugeReadPtr(lp: Long, ucb: ULong): BOOL

public expect fun IsBadHugeWritePtr(lp: Long, ucb: ULong): BOOL

public expect fun IsNTAdmin(dwreserved: UInt, lpdwreserved: Long): BOOL

public expect fun IsNativeVhdBoot(nativevhdboot: Long): BOOL

public expect fun IsTokenUntrusted(tokenhandle: HANDLE): BOOL

public expect fun LaunchINFSectionExW(hwnd: HWND, hinstance: HINSTANCE, pszparms: PCWSTR, nshow: Int): HRESULT

public expect fun LaunchINFSectionW(hwndowner: HWND, hinstance: HINSTANCE, pszparams: PWSTR, nshow: Int): Int

public expect fun LocalCompact(uminfree: UInt): ULong

public expect fun LocalShrink(hmem: HLOCAL, cbnewsize: UInt): ULong

public expect fun MulDiv(nnumber: Int, nnumerator: Int, ndenominator: Int): Int

public expect fun NeedReboot(dwrebootcheck: UInt): BOOL

public expect fun NeedRebootInit(): UInt

public expect fun OpenINFEngineA(pszinffilename: PCSTR, pszinstallsection: PCSTR, dwflags: UInt, phinf: Long, pvreserved: Long): HRESULT

public expect fun OpenINFEngineW(pszinffilename: PCWSTR, pszinstallsection: PCWSTR, dwflags: UInt, phinf: Long, pvreserved: Long): HRESULT

public expect fun OpenMutexA(dwdesiredaccess: UInt, binherithandle: BOOL, lpname: PCSTR): HANDLE

public expect fun OpenSemaphoreA(dwdesiredaccess: UInt, binherithandle: BOOL, lpname: PCSTR): HANDLE

public expect fun QueryAuxiliaryCounterFrequency(lpauxiliarycounterfrequency: Long): HRESULT

public expect fun QueryIdleProcessorCycleTime(bufferlength: Long, processoridlecycletime: Long): BOOL

public expect fun QueryIdleProcessorCycleTimeEx(group: UShort, bufferlength: Long, processoridlecycletime: Long): BOOL

public expect fun QueryInterruptTime(lpinterrupttime: Long)

public expect fun QueryInterruptTimePrecise(lpinterrupttimeprecise: Long)

public expect fun QueryProcessCycleTime(processhandle: HANDLE, cycletime: Long): BOOL

public expect fun QueryThreadCycleTime(threadhandle: HANDLE, cycletime: Long): BOOL

public expect fun QueryUnbiasedInterruptTime(unbiasedtime: Long): BOOL

public expect fun QueryUnbiasedInterruptTimePrecise(lpunbiasedinterrupttimeprecise: Long)

public expect fun RaiseCustomSystemEventTrigger(customsystemeventtriggerconfig: Long): UInt

public expect fun RebootCheckOnInstallA(hwnd: HWND, pszinf: PCSTR, pszsec: PCSTR, dwreserved: UInt): HRESULT

public expect fun RebootCheckOnInstallW(hwnd: HWND, pszinf: PCWSTR, pszsec: PCWSTR, dwreserved: UInt): HRESULT

public expect fun RecordFeatureError(featureid: UInt, error: Long)

public expect fun RecordFeatureUsage(featureid: UInt, kind: UInt, addend: UInt, originname: PCSTR)

public expect fun RegInstallA(hmod: HMODULE, pszsection: PCSTR, psttable: Long): HRESULT

public expect fun RegInstallW(hmod: HMODULE, pszsection: PCWSTR, psttable: Long): HRESULT

public expect fun RegRestoreAllA(hwnd: HWND, psztitlestring: PCSTR, hkbckupkey: HKEY): HRESULT

public expect fun RegRestoreAllW(hwnd: HWND, psztitlestring: PCWSTR, hkbckupkey: HKEY): HRESULT

public expect fun RegSaveRestoreA(hwnd: HWND, psztitlestring: PCSTR, hkbckupkey: HKEY, pcszrootkey: PCSTR, pcszsubkey: PCSTR, pcszvaluename: PCSTR, dwflags: UInt): HRESULT

public expect fun RegSaveRestoreOnINFA(hwnd: HWND, psztitle: PCSTR, pszinf: PCSTR, pszsection: PCSTR, hhklmbackkey: HKEY, hhkcubackkey: HKEY, dwflags: UInt): HRESULT

public expect fun RegSaveRestoreOnINFW(hwnd: HWND, psztitle: PCWSTR, pszinf: PCWSTR, pszsection: PCWSTR, hhklmbackkey: HKEY, hhkcubackkey: HKEY, dwflags: UInt): HRESULT

public expect fun RegSaveRestoreW(hwnd: HWND, psztitlestring: PCWSTR, hkbckupkey: HKEY, pcszrootkey: PCWSTR, pcszsubkey: PCWSTR, pcszvaluename: PCWSTR, dwflags: UInt): HRESULT

public expect fun ReplacePartitionUnit(targetpartition: PCWSTR, sparepartition: PCWSTR, flags: UInt): BOOL

public expect fun RequestDeviceWakeup(hdevice: HANDLE): BOOL

public expect fun RtlAnsiStringToUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS

public expect fun RtlCharToInteger(string: Long, base: UInt, value: Long): NTSTATUS

public expect fun RtlFreeAnsiString(ansistring: Long)

public expect fun RtlFreeOemString(oemstring: Long)

public expect fun RtlFreeUnicodeString(unicodestring: Long)

public expect fun RtlGetReturnAddressHijackTarget(): ULong

public expect fun RtlInitAnsiString(destinationstring: Long, sourcestring: Long)

public expect fun RtlInitAnsiStringEx(destinationstring: Long, sourcestring: Long): NTSTATUS

public expect fun RtlInitString(destinationstring: Long, sourcestring: Long)

public expect fun RtlInitStringEx(destinationstring: Long, sourcestring: Long): NTSTATUS

public expect fun RtlInitUnicodeString(destinationstring: Long, sourcestring: PCWSTR)

public expect fun RtlIsNameLegalDOS8Dot3(name: Long, oemname: Long, namecontainsspaces: Long): Boolean

public expect fun RtlLocalTimeToSystemTime(localtime: Long, systemtime: Long): NTSTATUS

public expect fun RtlRaiseCustomSystemEventTrigger(triggerconfig: Long): UInt

public expect fun RtlTimeToSecondsSince1970(time: Long, elapsedseconds: Long): Boolean

public expect fun RtlUnicodeStringToAnsiString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS

public expect fun RtlUnicodeStringToOemString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS

public expect fun RtlUnicodeToMultiByteSize(bytesinmultibytestring: Long, unicodestring: PCWSTR, bytesinunicodestring: UInt): NTSTATUS

public expect fun RtlUniform(seed: Long): UInt

public expect fun RunSetupCommandA(hwnd: HWND, szcmdname: PCSTR, szinfsection: PCSTR, szdir: PCSTR, lpsztitle: PCSTR, phexe: Long, dwflags: UInt, pvreserved: Long): HRESULT

public expect fun RunSetupCommandW(hwnd: HWND, szcmdname: PCWSTR, szinfsection: PCWSTR, szdir: PCWSTR, lpsztitle: PCWSTR, phexe: Long, dwflags: UInt, pvreserved: Long): HRESULT

public expect fun SendIMEMessageExA(param0: HWND, param1: LPARAM): LRESULT

public expect fun SendIMEMessageExW(param0: HWND, param1: LPARAM): LRESULT

public expect fun SetEnvironmentStringsA(newenvironment: PCSTR): BOOL

public expect fun SetFirmwareEnvironmentVariableA(lpname: PCSTR, lpguid: PCSTR, pvalue: Long, nsize: UInt): BOOL

public expect fun SetFirmwareEnvironmentVariableExA(lpname: PCSTR, lpguid: PCSTR, pvalue: Long, nsize: UInt, dwattributes: UInt): BOOL

public expect fun SetFirmwareEnvironmentVariableExW(lpname: PCWSTR, lpguid: PCWSTR, pvalue: Long, nsize: UInt, dwattributes: UInt): BOOL

public expect fun SetFirmwareEnvironmentVariableW(lpname: PCWSTR, lpguid: PCWSTR, pvalue: Long, nsize: UInt): BOOL

public expect fun SetHandleCount(unumber: UInt): UInt

public expect fun SetMessageWaitingIndicator(hmsgindicator: HANDLE, ulmsgcount: UInt): BOOL

public expect fun SetPerUserSecValuesA(pperuser: Long): HRESULT

public expect fun SetPerUserSecValuesW(pperuser: Long): HRESULT

public expect fun SubscribeFeatureStateChangeNotification(subscription: Long, callback: PFEATURE_STATE_CHANGE_CALLBACK, context: Long)

public expect fun TranslateInfStringA(pszinffilename: PCSTR, pszinstallsection: PCSTR, psztranslatesection: PCSTR, psztranslatekey: PCSTR, pszbuffer: PSTR, cchbuffer: UInt, pdwrequiredsize: Long, pvreserved: Long): HRESULT

public expect fun TranslateInfStringExA(hinf: Long, pszinffilename: PCSTR, psztranslatesection: PCSTR, psztranslatekey: PCSTR, pszbuffer: PSTR, dwbuffersize: UInt, pdwrequiredsize: Long, pvreserved: Long): HRESULT

public expect fun TranslateInfStringExW(hinf: Long, pszinffilename: PCWSTR, psztranslatesection: PCWSTR, psztranslatekey: PCWSTR, pszbuffer: PWSTR, dwbuffersize: UInt, pdwrequiredsize: Long, pvreserved: Long): HRESULT

public expect fun TranslateInfStringW(pszinffilename: PCWSTR, pszinstallsection: PCWSTR, psztranslatesection: PCWSTR, psztranslatekey: PCWSTR, pszbuffer: PWSTR, cchbuffer: UInt, pdwrequiredsize: Long, pvreserved: Long): HRESULT

public expect fun UnsubscribeFeatureStateChangeNotification(subscription: FEATURE_STATE_CHANGE_SUBSCRIPTION)

public expect fun UserInstStubWrapperA(hwnd: HWND, hinstance: HINSTANCE, pszparms: PCSTR, nshow: Int): HRESULT

public expect fun UserInstStubWrapperW(hwnd: HWND, hinstance: HINSTANCE, pszparms: PCWSTR, nshow: Int): HRESULT

public expect fun UserUnInstStubWrapperA(hwnd: HWND, hinstance: HINSTANCE, pszparms: PCSTR, nshow: Int): HRESULT

public expect fun UserUnInstStubWrapperW(hwnd: HWND, hinstance: HINSTANCE, pszparms: PCWSTR, nshow: Int): HRESULT

public expect fun WINNLSEnableIME(param0: HWND, param1: BOOL): BOOL

public expect fun WINNLSGetEnableStatus(param0: HWND): BOOL

public expect fun WINNLSGetIMEHotkey(param0: HWND): UInt

public expect fun WinWatchClose(hww: HWINWATCH)

public expect fun WinWatchDidStatusChange(hww: HWINWATCH): BOOL

public expect fun WinWatchGetClipList(hww: HWINWATCH, prc: Long, size: UInt, prd: Long): UInt

public expect fun WinWatchNotify(hww: HWINWATCH, notifycallback: WINWATCHNOTIFYPROC, notifyparam: LPARAM): BOOL

public expect fun WinWatchOpen(hwnd: HWND): HWINWATCH

public expect fun WldpCanExecuteBuffer(host: Long, options: WLDP_EXECUTION_EVALUATION_OPTIONS, buffer: Long, buffersize: UInt, auditinfo: PCWSTR, result: Long): HRESULT

public expect fun WldpCanExecuteFile(host: Long, options: WLDP_EXECUTION_EVALUATION_OPTIONS, filehandle: HANDLE, auditinfo: PCWSTR, result: Long): HRESULT

public expect fun WldpCanExecuteStream(host: Long, options: WLDP_EXECUTION_EVALUATION_OPTIONS, stream: Long, auditinfo: PCWSTR, result: Long): HRESULT

public expect fun WldpGetLockdownPolicy(hostinformation: Long, lockdownstate: Long, lockdownflags: UInt): HRESULT

public expect fun WldpIsClassInApprovedList(classid: Long, hostinformation: Long, isapproved: Long, optionalflags: UInt): HRESULT

public expect fun WldpIsDynamicCodePolicyEnabled(isenabled: Long): HRESULT

public expect fun WldpQueryDeviceSecurityInformation(information: Long, informationlength: UInt, returnlength: Long): HRESULT

public expect fun WldpQueryDynamicCodeTrust(filehandle: HANDLE, baseimage: Long, imagesize: UInt): HRESULT

public expect fun WldpSetDynamicCodeTrust(filehandle: HANDLE): HRESULT

public expect fun WritePrivateProfileSectionA(lpappname: PCSTR, lpstring: PCSTR, lpfilename: PCSTR): BOOL

public expect fun WritePrivateProfileSectionW(lpappname: PCWSTR, lpstring: PCWSTR, lpfilename: PCWSTR): BOOL

public expect fun WritePrivateProfileStringA(lpappname: PCSTR, lpkeyname: PCSTR, lpstring: PCSTR, lpfilename: PCSTR): BOOL

public expect fun WritePrivateProfileStringW(lpappname: PCWSTR, lpkeyname: PCWSTR, lpstring: PCWSTR, lpfilename: PCWSTR): BOOL

public expect fun WritePrivateProfileStructA(lpszsection: PCSTR, lpszkey: PCSTR, lpstruct: Long, usizestruct: UInt, szfile: PCSTR): BOOL

public expect fun WritePrivateProfileStructW(lpszsection: PCWSTR, lpszkey: PCWSTR, lpstruct: Long, usizestruct: UInt, szfile: PCWSTR): BOOL

public expect fun WriteProfileSectionA(lpappname: PCSTR, lpstring: PCSTR): BOOL

public expect fun WriteProfileSectionW(lpappname: PCWSTR, lpstring: PCWSTR): BOOL

public expect fun WriteProfileStringA(lpappname: PCSTR, lpkeyname: PCSTR, lpstring: PCSTR): BOOL

public expect fun WriteProfileStringW(lpappname: PCWSTR, lpkeyname: PCWSTR, lpstring: PCWSTR): BOOL

public expect fun _hread(hfile: Int, lpbuffer: Long, lbytes: Int): Int

public expect fun _hwrite(hfile: Int, lpbuffer: PCSTR, lbytes: Int): Int

public expect fun _lclose(hfile: Int): Int

public expect fun _lcreat(lppathname: PCSTR, iattribute: Int): Int

public expect fun _llseek(hfile: Int, loffset: Int, iorigin: Int): Int

public expect fun _lopen(lppathname: PCSTR, ireadwrite: Int): Int

public expect fun _lread(hfile: Int, lpbuffer: Long, ubytes: UInt): UInt

public expect fun _lwrite(hfile: Int, lpbuffer: PCSTR, ubytes: UInt): UInt

public expect fun uaw_lstrcmpW(string1: Long, string2: Long): Int

public expect fun uaw_lstrcmpiW(string1: Long, string2: Long): Int

public expect fun uaw_lstrlenW(string: Long): Int

public expect fun uaw_wcschr(string: Long, character: UShort): Long

public expect fun uaw_wcscpy(destination: Long, source: Long): Long

public expect fun uaw_wcsicmp(string1: Long, string2: Long): Int

public expect fun uaw_wcslen(string: Long): ULong

public expect fun uaw_wcsrchr(string: Long, character: UShort): Long
