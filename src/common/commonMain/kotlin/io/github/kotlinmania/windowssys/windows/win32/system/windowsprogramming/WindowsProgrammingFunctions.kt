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

public expect fun addDelBackupEntryA(lpcszfilelist: Pcstr, lpcszbackupdir: Pcstr, lpcszbasename: Pcstr, dwflags: UInt): Hresult

public expect fun addDelBackupEntryW(lpcszfilelist: Pcwstr, lpcszbackupdir: Pcwstr, lpcszbasename: Pcwstr, dwflags: UInt): Hresult

public expect fun advInstallFileA(hwnd: Hwnd, lpszsourcedir: Pcstr, lpszsourcefile: Pcstr, lpszdestdir: Pcstr, lpszdestfile: Pcstr, dwflags: UInt, dwreserved: UInt): Hresult

public expect fun advInstallFileW(hwnd: Hwnd, lpszsourcedir: Pcwstr, lpszsourcefile: Pcwstr, lpszdestdir: Pcwstr, lpszdestfile: Pcwstr, dwflags: UInt, dwreserved: UInt): Hresult

public expect fun apphelpCheckShellObject(objectclsid: ConstPtr, bshimifnecessary: Bool, pullflags: MutPtr): Bool

public expect fun cancelDeviceWakeupRequest(hdevice: Handle): Bool

public expect fun closeINFEngine(hinf: MutPtr): Hresult

public expect fun convertAuxiliaryCounterToPerformanceCounter(ullauxiliarycountervalue: ULong, lpperformancecountervalue: MutPtr, lpconversionerror: MutPtr): Hresult

public expect fun convertPerformanceCounterToAuxiliaryCounter(ullperformancecountervalue: ULong, lpauxiliarycountervalue: MutPtr, lpconversionerror: MutPtr): Hresult

public expect fun dCIBeginAccess(pdci: MutPtr, x: Int, y: Int, dx: Int, dy: Int): Int

public expect fun dCICloseProvider(hdc: Hdc)

public expect fun dCICreateOffscreen(hdc: Hdc, dwcompression: UInt, dwredmask: UInt, dwgreenmask: UInt, dwbluemask: UInt, dwwidth: UInt, dwheight: UInt, dwdcicaps: UInt, dwbitcount: UInt, lplpsurface: MutPtr): Int

public expect fun dCICreateOverlay(hdc: Hdc, lpoffscreensurf: MutPtr, lplpsurface: MutPtr): Int

public expect fun dCICreatePrimary(hdc: Hdc, lplpsurface: MutPtr): Int

public expect fun dCIDestroy(pdci: MutPtr)

public expect fun dCIDraw(pdci: MutPtr): Int

public expect fun dCIEndAccess(pdci: MutPtr)

public expect fun dCIEnum(hdc: Hdc, lprdst: MutPtr, lprsrc: MutPtr, lpfncallback: MutPtr, lpcontext: MutPtr): Int

public expect fun dCIOpenProvider(): Hdc

public expect fun dCISetClipList(pdci: MutPtr, prd: MutPtr): Int

public expect fun dCISetDestination(pdci: MutPtr, dst: MutPtr, src: MutPtr): Int

public expect fun dCISetSrcDestClip(pdci: MutPtr, srcrc: MutPtr, destrc: MutPtr, prd: MutPtr): Int

public expect fun delNodeA(pszfileordirname: Pcstr, dwflags: UInt): Hresult

public expect fun delNodeRunDLL32W(hwnd: Hwnd, hinstance: Hinstance, pszparms: Pwstr, nshow: Int): Hresult

public expect fun delNodeW(pszfileordirname: Pcwstr, dwflags: UInt): Hresult

public expect fun dnsHostnameToComputerNameA(hostname: Pcstr, computername: Pstr, nsize: MutPtr): Bool

public expect fun dnsHostnameToComputerNameW(hostname: Pcwstr, computername: Pwstr, nsize: MutPtr): Bool

public expect fun dosDateTimeToFileTime(wfatdate: UShort, wfattime: UShort, lpfiletime: MutPtr): Bool

public expect fun enableProcessOptionalXStateFeatures(features: ULong): Bool

public expect fun executeCabA(hwnd: Hwnd, pcab: MutPtr, preserved: MutPtr): Hresult

public expect fun executeCabW(hwnd: Hwnd, pcab: MutPtr, preserved: MutPtr): Hresult

public expect fun extractFilesA(pszcabname: Pcstr, pszexpanddir: Pcstr, dwflags: UInt, pszfilelist: Pcstr, lpreserved: MutPtr, dwreserved: UInt): Hresult

public expect fun extractFilesW(pszcabname: Pcwstr, pszexpanddir: Pcwstr, dwflags: UInt, pszfilelist: Pcwstr, lpreserved: MutPtr, dwreserved: UInt): Hresult

public expect fun fileSaveMarkNotExistA(lpfilelist: Pcstr, lpdir: Pcstr, lpbasename: Pcstr): Hresult

public expect fun fileSaveMarkNotExistW(lpfilelist: Pcwstr, lpdir: Pcwstr, lpbasename: Pcwstr): Hresult

public expect fun fileSaveRestoreOnINFA(hwnd: Hwnd, psztitle: Pcstr, pszinf: Pcstr, pszsection: Pcstr, pszbackupdir: Pcstr, pszbasebackupfile: Pcstr, dwflags: UInt): Hresult

public expect fun fileSaveRestoreOnINFW(hwnd: Hwnd, psztitle: Pcwstr, pszinf: Pcwstr, pszsection: Pcwstr, pszbackupdir: Pcwstr, pszbasebackupfile: Pcwstr, dwflags: UInt): Hresult

public expect fun fileSaveRestoreW(hdlg: Hwnd, lpfilelist: Pcwstr, lpdir: Pcwstr, lpbasename: Pcwstr, dwflags: UInt): Hresult

public expect fun fileTimeToDosDateTime(lpfiletime: ConstPtr, lpfatdate: MutPtr, lpfattime: MutPtr): Bool

public expect fun gdiEntry13(): UInt

public expect fun getComputerNameA(lpbuffer: Pstr, nsize: MutPtr): Bool

public expect fun getComputerNameW(lpbuffer: Pwstr, nsize: MutPtr): Bool

public expect fun getCurrentHwProfileA(lphwprofileinfo: MutPtr): Bool

public expect fun getCurrentHwProfileW(lphwprofileinfo: MutPtr): Bool

public expect fun getDCRegionData(hdc: Hdc, size: UInt, prd: MutPtr): UInt

public expect fun getFeatureEnabledState(featureid: UInt, changetime: FeatureChangeTime): FeatureEnabledState

public expect fun getFeatureVariant(featureid: UInt, changetime: FeatureChangeTime, payloadid: MutPtr, hasnotification: MutPtr): UInt

public expect fun getFirmwareEnvironmentVariableA(lpname: Pcstr, lpguid: Pcstr, pbuffer: MutPtr, nsize: UInt): UInt

public expect fun getFirmwareEnvironmentVariableExA(lpname: Pcstr, lpguid: Pcstr, pbuffer: MutPtr, nsize: UInt, pdwattribubutes: MutPtr): UInt

public expect fun getFirmwareEnvironmentVariableExW(lpname: Pcwstr, lpguid: Pcwstr, pbuffer: MutPtr, nsize: UInt, pdwattribubutes: MutPtr): UInt

public expect fun getFirmwareEnvironmentVariableW(lpname: Pcwstr, lpguid: Pcwstr, pbuffer: MutPtr, nsize: UInt): UInt

public expect fun getPrivateProfileIntA(lpappname: Pcstr, lpkeyname: Pcstr, ndefault: Int, lpfilename: Pcstr): UInt

public expect fun getPrivateProfileIntW(lpappname: Pcwstr, lpkeyname: Pcwstr, ndefault: Int, lpfilename: Pcwstr): Int

public expect fun getPrivateProfileSectionA(lpappname: Pcstr, lpreturnedstring: Pstr, nsize: UInt, lpfilename: Pcstr): UInt

public expect fun getPrivateProfileSectionNamesA(lpszreturnbuffer: Pstr, nsize: UInt, lpfilename: Pcstr): UInt

public expect fun getPrivateProfileSectionNamesW(lpszreturnbuffer: Pwstr, nsize: UInt, lpfilename: Pcwstr): UInt

public expect fun getPrivateProfileSectionW(lpappname: Pcwstr, lpreturnedstring: Pwstr, nsize: UInt, lpfilename: Pcwstr): UInt

public expect fun getPrivateProfileStringA(lpappname: Pcstr, lpkeyname: Pcstr, lpdefault: Pcstr, lpreturnedstring: Pstr, nsize: UInt, lpfilename: Pcstr): UInt

public expect fun getPrivateProfileStringW(lpappname: Pcwstr, lpkeyname: Pcwstr, lpdefault: Pcwstr, lpreturnedstring: Pwstr, nsize: UInt, lpfilename: Pcwstr): UInt

public expect fun getPrivateProfileStructA(lpszsection: Pcstr, lpszkey: Pcstr, lpstruct: MutPtr, usizestruct: UInt, szfile: Pcstr): Bool

public expect fun getPrivateProfileStructW(lpszsection: Pcwstr, lpszkey: Pcwstr, lpstruct: MutPtr, usizestruct: UInt, szfile: Pcwstr): Bool

public expect fun getProfileIntA(lpappname: Pcstr, lpkeyname: Pcstr, ndefault: Int): UInt

public expect fun getProfileIntW(lpappname: Pcwstr, lpkeyname: Pcwstr, ndefault: Int): UInt

public expect fun getProfileSectionA(lpappname: Pcstr, lpreturnedstring: Pstr, nsize: UInt): UInt

public expect fun getProfileSectionW(lpappname: Pcwstr, lpreturnedstring: Pwstr, nsize: UInt): UInt

public expect fun getProfileStringA(lpappname: Pcstr, lpkeyname: Pcstr, lpdefault: Pcstr, lpreturnedstring: Pstr, nsize: UInt): UInt

public expect fun getProfileStringW(lpappname: Pcwstr, lpkeyname: Pcwstr, lpdefault: Pcwstr, lpreturnedstring: Pwstr, nsize: UInt): UInt

public expect fun getSystemRegistryQuota(pdwquotaallowed: MutPtr, pdwquotaused: MutPtr): Bool

public expect fun getThreadEnabledXStateFeatures(): ULong

public expect fun getUserNameA(lpbuffer: Pstr, pcbbuffer: MutPtr): Bool

public expect fun getUserNameW(lpbuffer: Pwstr, pcbbuffer: MutPtr): Bool

public expect fun getVersionFromFileA(lpszfilename: Pcstr, pdwmsver: MutPtr, pdwlsver: MutPtr, bversion: Bool): Hresult

public expect fun getVersionFromFileExA(lpszfilename: Pcstr, pdwmsver: MutPtr, pdwlsver: MutPtr, bversion: Bool): Hresult

public expect fun getVersionFromFileExW(lpszfilename: Pcwstr, pdwmsver: MutPtr, pdwlsver: MutPtr, bversion: Bool): Hresult

public expect fun getVersionFromFileW(lpszfilename: Pcwstr, pdwmsver: MutPtr, pdwlsver: MutPtr, bversion: Bool): Hresult

public expect fun getWindowRegionData(hwnd: Hwnd, size: UInt, prd: MutPtr): UInt

public expect fun globalCompact(dwminfree: UInt): ULong

public expect fun globalFix(hmem: Hglobal)

public expect fun globalUnWire(hmem: Hglobal): Bool

public expect fun globalUnfix(hmem: Hglobal)

public expect fun globalWire(hmem: Hglobal): MutPtr

public expect fun iMPGetIMEA(param0: Hwnd, param1: MutPtr): Bool

public expect fun iMPGetIMEW(param0: Hwnd, param1: MutPtr): Bool

public expect fun iMPQueryIMEA(param0: MutPtr): Bool

public expect fun iMPQueryIMEW(param0: MutPtr): Bool

public expect fun iMPSetIMEA(param0: Hwnd, param1: MutPtr): Bool

public expect fun iMPSetIMEW(param0: Hwnd, param1: MutPtr): Bool

public expect fun isApiSetImplemented(contract: Pcstr): Bool

public expect fun isBadHugeReadPtr(lp: ConstPtr, ucb: ULong): Bool

public expect fun isBadHugeWritePtr(lp: ConstPtr, ucb: ULong): Bool

public expect fun isNTAdmin(dwreserved: UInt, lpdwreserved: MutPtr): Bool

public expect fun isNativeVhdBoot(nativevhdboot: MutPtr): Bool

public expect fun isTokenUntrusted(tokenhandle: Handle): Bool

public expect fun launchINFSectionExW(hwnd: Hwnd, hinstance: Hinstance, pszparms: Pcwstr, nshow: Int): Hresult

public expect fun launchINFSectionW(hwndowner: Hwnd, hinstance: Hinstance, pszparams: Pwstr, nshow: Int): Int

public expect fun localCompact(uminfree: UInt): ULong

public expect fun localShrink(hmem: Hlocal, cbnewsize: UInt): ULong

public expect fun mulDiv(nnumber: Int, nnumerator: Int, ndenominator: Int): Int

public expect fun needReboot(dwrebootcheck: UInt): Bool

public expect fun needRebootInit(): UInt

public expect fun openINFEngineA(pszinffilename: Pcstr, pszinstallsection: Pcstr, dwflags: UInt, phinf: MutPtr, pvreserved: MutPtr): Hresult

public expect fun openINFEngineW(pszinffilename: Pcwstr, pszinstallsection: Pcwstr, dwflags: UInt, phinf: MutPtr, pvreserved: MutPtr): Hresult

public expect fun openMutexA(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcstr): Handle

public expect fun openSemaphoreA(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcstr): Handle

public expect fun queryAuxiliaryCounterFrequency(lpauxiliarycounterfrequency: MutPtr): Hresult

public expect fun queryIdleProcessorCycleTime(bufferlength: MutPtr, processoridlecycletime: MutPtr): Bool

public expect fun queryIdleProcessorCycleTimeEx(group: UShort, bufferlength: MutPtr, processoridlecycletime: MutPtr): Bool

public expect fun queryInterruptTime(lpinterrupttime: MutPtr)

public expect fun queryInterruptTimePrecise(lpinterrupttimeprecise: MutPtr)

public expect fun queryProcessCycleTime(processhandle: Handle, cycletime: MutPtr): Bool

public expect fun queryThreadCycleTime(threadhandle: Handle, cycletime: MutPtr): Bool

public expect fun queryUnbiasedInterruptTime(unbiasedtime: MutPtr): Bool

public expect fun queryUnbiasedInterruptTimePrecise(lpunbiasedinterrupttimeprecise: MutPtr)

public expect fun raiseCustomSystemEventTrigger(customsystemeventtriggerconfig: ConstPtr): UInt

public expect fun rebootCheckOnInstallA(hwnd: Hwnd, pszinf: Pcstr, pszsec: Pcstr, dwreserved: UInt): Hresult

public expect fun rebootCheckOnInstallW(hwnd: Hwnd, pszinf: Pcwstr, pszsec: Pcwstr, dwreserved: UInt): Hresult

public expect fun recordFeatureError(featureid: UInt, error: ConstPtr)

public expect fun recordFeatureUsage(featureid: UInt, kind: UInt, addend: UInt, originname: Pcstr)

public expect fun regInstallA(hmod: Hmodule, pszsection: Pcstr, psttable: ConstPtr): Hresult

public expect fun regInstallW(hmod: Hmodule, pszsection: Pcwstr, psttable: ConstPtr): Hresult

public expect fun regRestoreAllA(hwnd: Hwnd, psztitlestring: Pcstr, hkbckupkey: Hkey): Hresult

public expect fun regRestoreAllW(hwnd: Hwnd, psztitlestring: Pcwstr, hkbckupkey: Hkey): Hresult

public expect fun regSaveRestoreA(hwnd: Hwnd, psztitlestring: Pcstr, hkbckupkey: Hkey, pcszrootkey: Pcstr, pcszsubkey: Pcstr, pcszvaluename: Pcstr, dwflags: UInt): Hresult

public expect fun regSaveRestoreOnINFA(hwnd: Hwnd, psztitle: Pcstr, pszinf: Pcstr, pszsection: Pcstr, hhklmbackkey: Hkey, hhkcubackkey: Hkey, dwflags: UInt): Hresult

public expect fun regSaveRestoreOnINFW(hwnd: Hwnd, psztitle: Pcwstr, pszinf: Pcwstr, pszsection: Pcwstr, hhklmbackkey: Hkey, hhkcubackkey: Hkey, dwflags: UInt): Hresult

public expect fun regSaveRestoreW(hwnd: Hwnd, psztitlestring: Pcwstr, hkbckupkey: Hkey, pcszrootkey: Pcwstr, pcszsubkey: Pcwstr, pcszvaluename: Pcwstr, dwflags: UInt): Hresult

public expect fun replacePartitionUnit(targetpartition: Pcwstr, sparepartition: Pcwstr, flags: UInt): Bool

public expect fun requestDeviceWakeup(hdevice: Handle): Bool

public expect fun rtlAnsiStringToUnicodeString(destinationstring: MutPtr, sourcestring: MutPtr, allocatedestinationstring: Boolean): Ntstatus

public expect fun rtlCharToInteger(string: MutPtr, base: UInt, value: MutPtr): Ntstatus

public expect fun rtlFreeAnsiString(ansistring: MutPtr)

public expect fun rtlFreeOemString(oemstring: MutPtr)

public expect fun rtlFreeUnicodeString(unicodestring: MutPtr)

public expect fun rtlGetReturnAddressHijackTarget(): ULong

public expect fun rtlInitAnsiString(destinationstring: MutPtr, sourcestring: MutPtr)

public expect fun rtlInitAnsiStringEx(destinationstring: MutPtr, sourcestring: MutPtr): Ntstatus

public expect fun rtlInitString(destinationstring: MutPtr, sourcestring: MutPtr)

public expect fun rtlInitStringEx(destinationstring: MutPtr, sourcestring: MutPtr): Ntstatus

public expect fun rtlInitUnicodeString(destinationstring: MutPtr, sourcestring: Pcwstr)

public expect fun rtlIsNameLegalDOS8Dot3(name: MutPtr, oemname: MutPtr, namecontainsspaces: MutPtr): Boolean

public expect fun rtlLocalTimeToSystemTime(localtime: MutPtr, systemtime: MutPtr): Ntstatus

public expect fun rtlRaiseCustomSystemEventTrigger(triggerconfig: ConstPtr): UInt

public expect fun rtlTimeToSecondsSince1970(time: MutPtr, elapsedseconds: MutPtr): Boolean

public expect fun rtlUnicodeStringToAnsiString(destinationstring: MutPtr, sourcestring: MutPtr, allocatedestinationstring: Boolean): Ntstatus

public expect fun rtlUnicodeStringToOemString(destinationstring: MutPtr, sourcestring: MutPtr, allocatedestinationstring: Boolean): Ntstatus

public expect fun rtlUnicodeToMultiByteSize(bytesinmultibytestring: MutPtr, unicodestring: Pcwstr, bytesinunicodestring: UInt): Ntstatus

public expect fun rtlUniform(seed: MutPtr): UInt

public expect fun runSetupCommandA(hwnd: Hwnd, szcmdname: Pcstr, szinfsection: Pcstr, szdir: Pcstr, lpsztitle: Pcstr, phexe: MutPtr, dwflags: UInt, pvreserved: MutPtr): Hresult

public expect fun runSetupCommandW(hwnd: Hwnd, szcmdname: Pcwstr, szinfsection: Pcwstr, szdir: Pcwstr, lpsztitle: Pcwstr, phexe: MutPtr, dwflags: UInt, pvreserved: MutPtr): Hresult

public expect fun sendIMEMessageExA(param0: Hwnd, param1: Lparam): Lresult

public expect fun sendIMEMessageExW(param0: Hwnd, param1: Lparam): Lresult

public expect fun setEnvironmentStringsA(newenvironment: Pcstr): Bool

public expect fun setFirmwareEnvironmentVariableA(lpname: Pcstr, lpguid: Pcstr, pvalue: ConstPtr, nsize: UInt): Bool

public expect fun setFirmwareEnvironmentVariableExA(lpname: Pcstr, lpguid: Pcstr, pvalue: ConstPtr, nsize: UInt, dwattributes: UInt): Bool

public expect fun setFirmwareEnvironmentVariableExW(lpname: Pcwstr, lpguid: Pcwstr, pvalue: ConstPtr, nsize: UInt, dwattributes: UInt): Bool

public expect fun setFirmwareEnvironmentVariableW(lpname: Pcwstr, lpguid: Pcwstr, pvalue: ConstPtr, nsize: UInt): Bool

public expect fun setHandleCount(unumber: UInt): UInt

public expect fun setMessageWaitingIndicator(hmsgindicator: Handle, ulmsgcount: UInt): Bool

public expect fun setPerUserSecValuesA(pperuser: MutPtr): Hresult

public expect fun setPerUserSecValuesW(pperuser: MutPtr): Hresult

public expect fun subscribeFeatureStateChangeNotification(subscription: MutPtr, callback: PfeatureStateChangeCallback, context: ConstPtr)

public expect fun translateInfStringA(pszinffilename: Pcstr, pszinstallsection: Pcstr, psztranslatesection: Pcstr, psztranslatekey: Pcstr, pszbuffer: Pstr, cchbuffer: UInt, pdwrequiredsize: MutPtr, pvreserved: ConstPtr): Hresult

public expect fun translateInfStringExA(hinf: MutPtr, pszinffilename: Pcstr, psztranslatesection: Pcstr, psztranslatekey: Pcstr, pszbuffer: Pstr, dwbuffersize: UInt, pdwrequiredsize: MutPtr, pvreserved: ConstPtr): Hresult

public expect fun translateInfStringExW(hinf: MutPtr, pszinffilename: Pcwstr, psztranslatesection: Pcwstr, psztranslatekey: Pcwstr, pszbuffer: Pwstr, dwbuffersize: UInt, pdwrequiredsize: MutPtr, pvreserved: ConstPtr): Hresult

public expect fun translateInfStringW(pszinffilename: Pcwstr, pszinstallsection: Pcwstr, psztranslatesection: Pcwstr, psztranslatekey: Pcwstr, pszbuffer: Pwstr, cchbuffer: UInt, pdwrequiredsize: MutPtr, pvreserved: ConstPtr): Hresult

public expect fun unsubscribeFeatureStateChangeNotification(subscription: FeatureStateChangeSubscription)

public expect fun userInstStubWrapperA(hwnd: Hwnd, hinstance: Hinstance, pszparms: Pcstr, nshow: Int): Hresult

public expect fun userInstStubWrapperW(hwnd: Hwnd, hinstance: Hinstance, pszparms: Pcwstr, nshow: Int): Hresult

public expect fun userUnInstStubWrapperA(hwnd: Hwnd, hinstance: Hinstance, pszparms: Pcstr, nshow: Int): Hresult

public expect fun userUnInstStubWrapperW(hwnd: Hwnd, hinstance: Hinstance, pszparms: Pcwstr, nshow: Int): Hresult

public expect fun wINNLSEnableIME(param0: Hwnd, param1: Bool): Bool

public expect fun wINNLSGetEnableStatus(param0: Hwnd): Bool

public expect fun wINNLSGetIMEHotkey(param0: Hwnd): UInt

public expect fun winWatchClose(hww: Hwinwatch)

public expect fun winWatchDidStatusChange(hww: Hwinwatch): Bool

public expect fun winWatchGetClipList(hww: Hwinwatch, prc: MutPtr, size: UInt, prd: MutPtr): UInt

public expect fun winWatchNotify(hww: Hwinwatch, notifycallback: Winwatchnotifyproc, notifyparam: Lparam): Bool

public expect fun winWatchOpen(hwnd: Hwnd): Hwinwatch

public expect fun wldpCanExecuteBuffer(host: ConstPtr, options: WldpExecutionEvaluationOptions, buffer: ConstPtr, buffersize: UInt, auditinfo: Pcwstr, result: MutPtr): Hresult

public expect fun wldpCanExecuteFile(host: ConstPtr, options: WldpExecutionEvaluationOptions, filehandle: Handle, auditinfo: Pcwstr, result: MutPtr): Hresult

public expect fun wldpCanExecuteStream(host: ConstPtr, options: WldpExecutionEvaluationOptions, stream: MutPtr, auditinfo: Pcwstr, result: MutPtr): Hresult

public expect fun wldpGetLockdownPolicy(hostinformation: ConstPtr, lockdownstate: MutPtr, lockdownflags: UInt): Hresult

public expect fun wldpIsClassInApprovedList(classid: ConstPtr, hostinformation: ConstPtr, isapproved: MutPtr, optionalflags: UInt): Hresult

public expect fun wldpIsDynamicCodePolicyEnabled(isenabled: MutPtr): Hresult

public expect fun wldpQueryDeviceSecurityInformation(information: MutPtr, informationlength: UInt, returnlength: MutPtr): Hresult

public expect fun wldpQueryDynamicCodeTrust(filehandle: Handle, baseimage: ConstPtr, imagesize: UInt): Hresult

public expect fun wldpSetDynamicCodeTrust(filehandle: Handle): Hresult

public expect fun writePrivateProfileSectionA(lpappname: Pcstr, lpstring: Pcstr, lpfilename: Pcstr): Bool

public expect fun writePrivateProfileSectionW(lpappname: Pcwstr, lpstring: Pcwstr, lpfilename: Pcwstr): Bool

public expect fun writePrivateProfileStringA(lpappname: Pcstr, lpkeyname: Pcstr, lpstring: Pcstr, lpfilename: Pcstr): Bool

public expect fun writePrivateProfileStringW(lpappname: Pcwstr, lpkeyname: Pcwstr, lpstring: Pcwstr, lpfilename: Pcwstr): Bool

public expect fun writePrivateProfileStructA(lpszsection: Pcstr, lpszkey: Pcstr, lpstruct: ConstPtr, usizestruct: UInt, szfile: Pcstr): Bool

public expect fun writePrivateProfileStructW(lpszsection: Pcwstr, lpszkey: Pcwstr, lpstruct: ConstPtr, usizestruct: UInt, szfile: Pcwstr): Bool

public expect fun writeProfileSectionA(lpappname: Pcstr, lpstring: Pcstr): Bool

public expect fun writeProfileSectionW(lpappname: Pcwstr, lpstring: Pcwstr): Bool

public expect fun writeProfileStringA(lpappname: Pcstr, lpkeyname: Pcstr, lpstring: Pcstr): Bool

public expect fun writeProfileStringW(lpappname: Pcwstr, lpkeyname: Pcwstr, lpstring: Pcwstr): Bool

public expect fun hread(hfile: Int, lpbuffer: MutPtr, lbytes: Int): Int

public expect fun hwrite(hfile: Int, lpbuffer: Pcstr, lbytes: Int): Int

public expect fun lclose(hfile: Int): Int

public expect fun lcreat(lppathname: Pcstr, iattribute: Int): Int

public expect fun llseek(hfile: Int, loffset: Int, iorigin: Int): Int

public expect fun lopen(lppathname: Pcstr, ireadwrite: Int): Int

public expect fun lread(hfile: Int, lpbuffer: MutPtr, ubytes: UInt): UInt

public expect fun lwrite(hfile: Int, lpbuffer: Pcstr, ubytes: UInt): UInt

public expect fun uawLstrcmpW(string1: ConstPtr, string2: ConstPtr): Int

public expect fun uawLstrcmpiW(string1: ConstPtr, string2: ConstPtr): Int

public expect fun uawLstrlenW(string: ConstPtr): Int

public expect fun uawWcschr(string: ConstPtr, character: UShort): MutPtr

public expect fun uawWcscpy(destination: MutPtr, source: ConstPtr): MutPtr

public expect fun uawWcsicmp(string1: ConstPtr, string2: ConstPtr): Int

public expect fun uawWcslen(string: ConstPtr): ULong

public expect fun uawWcsrchr(string: ConstPtr, character: UShort): MutPtr
