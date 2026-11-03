package io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public fun interface FnCallback {
    public operator fun invoke(context: Long)
}

public fun interface FnCallback1 {
    public operator fun invoke(hww: HWINWATCH, hwnd: Foundation.HWND, code: UInt, lparam: Foundation.LPARAM)
}

public fun AddDelBackupEntryA(lpcszfilelist: PCSTR, lpcszbackupdir: PCSTR, lpcszbasename: PCSTR, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("advpack.dll", "AddDelBackupEntryA", longArrayOf(lpcszfilelist, lpcszbackupdir, lpcszbasename, dwflags.toLong())).toInt()
}

public fun AddDelBackupEntryW(lpcszfilelist: PCWSTR, lpcszbackupdir: PCWSTR, lpcszbasename: PCWSTR, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("advpack.dll", "AddDelBackupEntryW", longArrayOf(lpcszfilelist, lpcszbackupdir, lpcszbasename, dwflags.toLong())).toInt()
}

public fun AdvInstallFileA(hwnd: Foundation.HWND, lpszsourcedir: PCSTR, lpszsourcefile: PCSTR, lpszdestdir: PCSTR, lpszdestfile: PCSTR, dwflags: UInt, dwreserved: UInt): HRESULT {
    return Win32DynamicFfi.invoke("advpack.dll", "AdvInstallFileA", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), lpszsourcedir, lpszsourcefile, lpszdestdir, lpszdestfile, dwflags.toLong(), dwreserved.toLong())).toInt()
}

public fun AdvInstallFileW(hwnd: Foundation.HWND, lpszsourcedir: PCWSTR, lpszsourcefile: PCWSTR, lpszdestdir: PCWSTR, lpszdestfile: PCWSTR, dwflags: UInt, dwreserved: UInt): HRESULT {
    return Win32DynamicFfi.invoke("advpack.dll", "AdvInstallFileW", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), lpszsourcedir, lpszsourcefile, lpszdestdir, lpszdestfile, dwflags.toLong(), dwreserved.toLong())).toInt()
}

public fun ApphelpCheckShellObject(objectclsid: Long, bshimifnecessary: BOOL, pullflags: Long): BOOL {
    return Win32DynamicFfi.invoke("apphelp.dll", "ApphelpCheckShellObject", longArrayOf(objectclsid, bshimifnecessary.toLong(), pullflags)).toInt()
}

public fun CancelDeviceWakeupRequest(hdevice: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CancelDeviceWakeupRequest", longArrayOf(Win32DynamicFfi.objectSlot(hdevice))).toInt()
}

public fun CloseINFEngine(hinf: Long): HRESULT {
    return Win32DynamicFfi.invoke("advpack.dll", "CloseINFEngine", longArrayOf(hinf)).toInt()
}

public fun ConvertAuxiliaryCounterToPerformanceCounter(ullauxiliarycountervalue: ULong, lpperformancecountervalue: Long, lpconversionerror: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-core-realtime-l1-1-2.dll", "ConvertAuxiliaryCounterToPerformanceCounter", longArrayOf(ullauxiliarycountervalue.toLong(), lpperformancecountervalue, lpconversionerror)).toInt()
}

public fun ConvertPerformanceCounterToAuxiliaryCounter(ullperformancecountervalue: ULong, lpauxiliarycountervalue: Long, lpconversionerror: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-core-realtime-l1-1-2.dll", "ConvertPerformanceCounterToAuxiliaryCounter", longArrayOf(ullperformancecountervalue.toLong(), lpauxiliarycountervalue, lpconversionerror)).toInt()
}

public fun DCIBeginAccess(pdci: Long, x: Int, y: Int, dx: Int, dy: Int): Int {
    return Win32DynamicFfi.invoke("dciman32.dll", "DCIBeginAccess", longArrayOf(pdci, x.toLong(), y.toLong(), dx.toLong(), dy.toLong())).toInt()
}

public fun DCICloseProvider(hdc: Graphics.Gdi.HDC) {
    Win32DynamicFfi.invoke("dciman32.dll", "DCICloseProvider", longArrayOf(Win32DynamicFfi.objectSlot(hdc)))
}

public fun DCICreateOffscreen(hdc: Graphics.Gdi.HDC, dwcompression: UInt, dwredmask: UInt, dwgreenmask: UInt, dwbluemask: UInt, dwwidth: UInt, dwheight: UInt, dwdcicaps: UInt, dwbitcount: UInt, lplpsurface: Long): Int {
    return Win32DynamicFfi.invoke("dciman32.dll", "DCICreateOffscreen", longArrayOf(Win32DynamicFfi.objectSlot(hdc), dwcompression.toLong(), dwredmask.toLong(), dwgreenmask.toLong(), dwbluemask.toLong(), dwwidth.toLong(), dwheight.toLong(), dwdcicaps.toLong(), dwbitcount.toLong(), lplpsurface)).toInt()
}

public fun DCICreateOverlay(hdc: Graphics.Gdi.HDC, lpoffscreensurf: Long, lplpsurface: Long): Int {
    return Win32DynamicFfi.invoke("dciman32.dll", "DCICreateOverlay", longArrayOf(Win32DynamicFfi.objectSlot(hdc), lpoffscreensurf, lplpsurface)).toInt()
}

public fun DCICreatePrimary(hdc: Graphics.Gdi.HDC, lplpsurface: Long): Int {
    return Win32DynamicFfi.invoke("dciman32.dll", "DCICreatePrimary", longArrayOf(Win32DynamicFfi.objectSlot(hdc), lplpsurface)).toInt()
}

public fun DCIDestroy(pdci: Long) {
    Win32DynamicFfi.invoke("dciman32.dll", "DCIDestroy", longArrayOf(pdci))
}

public fun DCIDraw(pdci: Long): Int {
    return Win32DynamicFfi.invoke("dciman32.dll", "DCIDraw", longArrayOf(pdci)).toInt()
}

public fun DCIEndAccess(pdci: Long) {
    Win32DynamicFfi.invoke("dciman32.dll", "DCIEndAccess", longArrayOf(pdci))
}

public fun DCIEnum(hdc: Graphics.Gdi.HDC, lprdst: Long, lprsrc: Long, lpfncallback: Long, lpcontext: Long): Int {
    return Win32DynamicFfi.invoke("dciman32.dll", "DCIEnum", longArrayOf(Win32DynamicFfi.objectSlot(hdc), lprdst, lprsrc, lpfncallback, lpcontext)).toInt()
}

public fun DCIOpenProvider(): Graphics.Gdi.HDC {
    Win32DynamicFfi.invoke("dciman32.dll", "DCIOpenProvider", longArrayOf())
    return Graphics.Gdi.HDC()
}

public fun DCISetClipList(pdci: Long, prd: Long): Int {
    return Win32DynamicFfi.invoke("dciman32.dll", "DCISetClipList", longArrayOf(pdci, prd)).toInt()
}

public fun DCISetDestination(pdci: Long, dst: Long, src: Long): Int {
    return Win32DynamicFfi.invoke("dciman32.dll", "DCISetDestination", longArrayOf(pdci, dst, src)).toInt()
}

public fun DCISetSrcDestClip(pdci: Long, srcrc: Long, destrc: Long, prd: Long): Int {
    return Win32DynamicFfi.invoke("dciman32.dll", "DCISetSrcDestClip", longArrayOf(pdci, srcrc, destrc, prd)).toInt()
}

public fun DelNodeA(pszfileordirname: PCSTR, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("advpack.dll", "DelNodeA", longArrayOf(pszfileordirname, dwflags.toLong())).toInt()
}

public fun DelNodeRunDLL32W(hwnd: Foundation.HWND, hinstance: Foundation.HINSTANCE, pszparms: PWSTR, nshow: Int): HRESULT {
    return Win32DynamicFfi.invoke("advpack.dll", "DelNodeRunDLL32W", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), Win32DynamicFfi.objectSlot(hinstance), pszparms, nshow.toLong())).toInt()
}

public fun DelNodeW(pszfileordirname: PCWSTR, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("advpack.dll", "DelNodeW", longArrayOf(pszfileordirname, dwflags.toLong())).toInt()
}

public fun DnsHostnameToComputerNameA(hostname: PCSTR, computername: PSTR, nsize: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "DnsHostnameToComputerNameA", longArrayOf(hostname, computername, nsize)).toInt()
}

public fun DnsHostnameToComputerNameW(hostname: PCWSTR, computername: PWSTR, nsize: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "DnsHostnameToComputerNameW", longArrayOf(hostname, computername, nsize)).toInt()
}

public fun DosDateTimeToFileTime(wfatdate: UShort, wfattime: UShort, lpfiletime: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "DosDateTimeToFileTime", longArrayOf(wfatdate.toLong(), wfattime.toLong(), lpfiletime)).toInt()
}

public fun EnableProcessOptionalXStateFeatures(features: ULong): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "EnableProcessOptionalXStateFeatures", longArrayOf(features.toLong())).toInt()
}

public fun ExecuteCabA(hwnd: Foundation.HWND, pcab: Long, preserved: Long): HRESULT {
    return Win32DynamicFfi.invoke("advpack.dll", "ExecuteCabA", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), pcab, preserved)).toInt()
}

public fun ExecuteCabW(hwnd: Foundation.HWND, pcab: Long, preserved: Long): HRESULT {
    return Win32DynamicFfi.invoke("advpack.dll", "ExecuteCabW", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), pcab, preserved)).toInt()
}

public fun ExtractFilesA(pszcabname: PCSTR, pszexpanddir: PCSTR, dwflags: UInt, pszfilelist: PCSTR, lpreserved: Long, dwreserved: UInt): HRESULT {
    return Win32DynamicFfi.invoke("advpack.dll", "ExtractFilesA", longArrayOf(pszcabname, pszexpanddir, dwflags.toLong(), pszfilelist, lpreserved, dwreserved.toLong())).toInt()
}

public fun ExtractFilesW(pszcabname: PCWSTR, pszexpanddir: PCWSTR, dwflags: UInt, pszfilelist: PCWSTR, lpreserved: Long, dwreserved: UInt): HRESULT {
    return Win32DynamicFfi.invoke("advpack.dll", "ExtractFilesW", longArrayOf(pszcabname, pszexpanddir, dwflags.toLong(), pszfilelist, lpreserved, dwreserved.toLong())).toInt()
}

public fun FileSaveMarkNotExistA(lpfilelist: PCSTR, lpdir: PCSTR, lpbasename: PCSTR): HRESULT {
    return Win32DynamicFfi.invoke("advpack.dll", "FileSaveMarkNotExistA", longArrayOf(lpfilelist, lpdir, lpbasename)).toInt()
}

public fun FileSaveMarkNotExistW(lpfilelist: PCWSTR, lpdir: PCWSTR, lpbasename: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("advpack.dll", "FileSaveMarkNotExistW", longArrayOf(lpfilelist, lpdir, lpbasename)).toInt()
}

public fun FileSaveRestoreOnINFA(hwnd: Foundation.HWND, psztitle: PCSTR, pszinf: PCSTR, pszsection: PCSTR, pszbackupdir: PCSTR, pszbasebackupfile: PCSTR, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("advpack.dll", "FileSaveRestoreOnINFA", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), psztitle, pszinf, pszsection, pszbackupdir, pszbasebackupfile, dwflags.toLong())).toInt()
}

public fun FileSaveRestoreOnINFW(hwnd: Foundation.HWND, psztitle: PCWSTR, pszinf: PCWSTR, pszsection: PCWSTR, pszbackupdir: PCWSTR, pszbasebackupfile: PCWSTR, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("advpack.dll", "FileSaveRestoreOnINFW", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), psztitle, pszinf, pszsection, pszbackupdir, pszbasebackupfile, dwflags.toLong())).toInt()
}

public fun FileSaveRestoreW(hdlg: Foundation.HWND, lpfilelist: PCWSTR, lpdir: PCWSTR, lpbasename: PCWSTR, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("advpack.dll", "FileSaveRestoreW", longArrayOf(Win32DynamicFfi.objectSlot(hdlg), lpfilelist, lpdir, lpbasename, dwflags.toLong())).toInt()
}

public fun FileTimeToDosDateTime(lpfiletime: Long, lpfatdate: Long, lpfattime: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "FileTimeToDosDateTime", longArrayOf(lpfiletime, lpfatdate, lpfattime)).toInt()
}

public fun GdiEntry13(): UInt {
    return Win32DynamicFfi.invoke("api-ms-win-dx-d3dkmt-l1-1-0.dll", "GdiEntry13", longArrayOf()).toUInt()
}

public fun GetComputerNameA(lpbuffer: PSTR, nsize: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetComputerNameA", longArrayOf(lpbuffer, nsize)).toInt()
}

public fun GetComputerNameW(lpbuffer: PWSTR, nsize: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetComputerNameW", longArrayOf(lpbuffer, nsize)).toInt()
}

public fun GetCurrentHwProfileA(lphwprofileinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "GetCurrentHwProfileA", longArrayOf(lphwprofileinfo)).toInt()
}

public fun GetCurrentHwProfileW(lphwprofileinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "GetCurrentHwProfileW", longArrayOf(lphwprofileinfo)).toInt()
}

public fun GetDCRegionData(hdc: Graphics.Gdi.HDC, size: UInt, prd: Long): UInt {
    return Win32DynamicFfi.invoke("dciman32.dll", "GetDCRegionData", longArrayOf(Win32DynamicFfi.objectSlot(hdc), size.toLong(), prd)).toUInt()
}

public fun GetFeatureEnabledState(featureid: UInt, changetime: FEATURE_CHANGE_TIME): FEATURE_ENABLED_STATE {
    return Win32DynamicFfi.invoke("api-ms-win-core-featurestaging-l1-1-0.dll", "GetFeatureEnabledState", longArrayOf(featureid.toLong(), changetime.toLong())).toInt()
}

public fun GetFeatureVariant(featureid: UInt, changetime: FEATURE_CHANGE_TIME, payloadid: Long, hasnotification: Long): UInt {
    return Win32DynamicFfi.invoke("api-ms-win-core-featurestaging-l1-1-1.dll", "GetFeatureVariant", longArrayOf(featureid.toLong(), changetime.toLong(), payloadid, hasnotification)).toUInt()
}

public fun GetFirmwareEnvironmentVariableA(lpname: PCSTR, lpguid: PCSTR, pbuffer: Long, nsize: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetFirmwareEnvironmentVariableA", longArrayOf(lpname, lpguid, pbuffer, nsize.toLong())).toUInt()
}

public fun GetFirmwareEnvironmentVariableExA(lpname: PCSTR, lpguid: PCSTR, pbuffer: Long, nsize: UInt, pdwattribubutes: Long): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetFirmwareEnvironmentVariableExA", longArrayOf(lpname, lpguid, pbuffer, nsize.toLong(), pdwattribubutes)).toUInt()
}

public fun GetFirmwareEnvironmentVariableExW(lpname: PCWSTR, lpguid: PCWSTR, pbuffer: Long, nsize: UInt, pdwattribubutes: Long): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetFirmwareEnvironmentVariableExW", longArrayOf(lpname, lpguid, pbuffer, nsize.toLong(), pdwattribubutes)).toUInt()
}

public fun GetFirmwareEnvironmentVariableW(lpname: PCWSTR, lpguid: PCWSTR, pbuffer: Long, nsize: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetFirmwareEnvironmentVariableW", longArrayOf(lpname, lpguid, pbuffer, nsize.toLong())).toUInt()
}

public fun GetPrivateProfileIntA(lpappname: PCSTR, lpkeyname: PCSTR, ndefault: Int, lpfilename: PCSTR): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetPrivateProfileIntA", longArrayOf(lpappname, lpkeyname, ndefault.toLong(), lpfilename)).toUInt()
}

public fun GetPrivateProfileIntW(lpappname: PCWSTR, lpkeyname: PCWSTR, ndefault: Int, lpfilename: PCWSTR): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetPrivateProfileIntW", longArrayOf(lpappname, lpkeyname, ndefault.toLong(), lpfilename)).toInt()
}

public fun GetPrivateProfileSectionA(lpappname: PCSTR, lpreturnedstring: PSTR, nsize: UInt, lpfilename: PCSTR): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetPrivateProfileSectionA", longArrayOf(lpappname, lpreturnedstring, nsize.toLong(), lpfilename)).toUInt()
}

public fun GetPrivateProfileSectionNamesA(lpszreturnbuffer: PSTR, nsize: UInt, lpfilename: PCSTR): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetPrivateProfileSectionNamesA", longArrayOf(lpszreturnbuffer, nsize.toLong(), lpfilename)).toUInt()
}

public fun GetPrivateProfileSectionNamesW(lpszreturnbuffer: PWSTR, nsize: UInt, lpfilename: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetPrivateProfileSectionNamesW", longArrayOf(lpszreturnbuffer, nsize.toLong(), lpfilename)).toUInt()
}

public fun GetPrivateProfileSectionW(lpappname: PCWSTR, lpreturnedstring: PWSTR, nsize: UInt, lpfilename: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetPrivateProfileSectionW", longArrayOf(lpappname, lpreturnedstring, nsize.toLong(), lpfilename)).toUInt()
}

public fun GetPrivateProfileStringA(lpappname: PCSTR, lpkeyname: PCSTR, lpdefault: PCSTR, lpreturnedstring: PSTR, nsize: UInt, lpfilename: PCSTR): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetPrivateProfileStringA", longArrayOf(lpappname, lpkeyname, lpdefault, lpreturnedstring, nsize.toLong(), lpfilename)).toUInt()
}

public fun GetPrivateProfileStringW(lpappname: PCWSTR, lpkeyname: PCWSTR, lpdefault: PCWSTR, lpreturnedstring: PWSTR, nsize: UInt, lpfilename: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetPrivateProfileStringW", longArrayOf(lpappname, lpkeyname, lpdefault, lpreturnedstring, nsize.toLong(), lpfilename)).toUInt()
}

public fun GetPrivateProfileStructA(lpszsection: PCSTR, lpszkey: PCSTR, lpstruct: Long, usizestruct: UInt, szfile: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetPrivateProfileStructA", longArrayOf(lpszsection, lpszkey, lpstruct, usizestruct.toLong(), szfile)).toInt()
}

public fun GetPrivateProfileStructW(lpszsection: PCWSTR, lpszkey: PCWSTR, lpstruct: Long, usizestruct: UInt, szfile: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetPrivateProfileStructW", longArrayOf(lpszsection, lpszkey, lpstruct, usizestruct.toLong(), szfile)).toInt()
}

public fun GetProfileIntA(lpappname: PCSTR, lpkeyname: PCSTR, ndefault: Int): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetProfileIntA", longArrayOf(lpappname, lpkeyname, ndefault.toLong())).toUInt()
}

public fun GetProfileIntW(lpappname: PCWSTR, lpkeyname: PCWSTR, ndefault: Int): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetProfileIntW", longArrayOf(lpappname, lpkeyname, ndefault.toLong())).toUInt()
}

public fun GetProfileSectionA(lpappname: PCSTR, lpreturnedstring: PSTR, nsize: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetProfileSectionA", longArrayOf(lpappname, lpreturnedstring, nsize.toLong())).toUInt()
}

public fun GetProfileSectionW(lpappname: PCWSTR, lpreturnedstring: PWSTR, nsize: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetProfileSectionW", longArrayOf(lpappname, lpreturnedstring, nsize.toLong())).toUInt()
}

public fun GetProfileStringA(lpappname: PCSTR, lpkeyname: PCSTR, lpdefault: PCSTR, lpreturnedstring: PSTR, nsize: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetProfileStringA", longArrayOf(lpappname, lpkeyname, lpdefault, lpreturnedstring, nsize.toLong())).toUInt()
}

public fun GetProfileStringW(lpappname: PCWSTR, lpkeyname: PCWSTR, lpdefault: PCWSTR, lpreturnedstring: PWSTR, nsize: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetProfileStringW", longArrayOf(lpappname, lpkeyname, lpdefault, lpreturnedstring, nsize.toLong())).toUInt()
}

public fun GetSystemRegistryQuota(pdwquotaallowed: Long, pdwquotaused: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetSystemRegistryQuota", longArrayOf(pdwquotaallowed, pdwquotaused)).toInt()
}

public fun GetThreadEnabledXStateFeatures(): ULong {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetThreadEnabledXStateFeatures", longArrayOf()).toULong()
}

public fun GetUserNameA(lpbuffer: PSTR, pcbbuffer: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "GetUserNameA", longArrayOf(lpbuffer, pcbbuffer)).toInt()
}

public fun GetUserNameW(lpbuffer: PWSTR, pcbbuffer: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "GetUserNameW", longArrayOf(lpbuffer, pcbbuffer)).toInt()
}

public fun GetVersionFromFileA(lpszfilename: PCSTR, pdwmsver: Long, pdwlsver: Long, bversion: BOOL): HRESULT {
    return Win32DynamicFfi.invoke("advpack.dll", "GetVersionFromFileA", longArrayOf(lpszfilename, pdwmsver, pdwlsver, bversion.toLong())).toInt()
}

public fun GetVersionFromFileExA(lpszfilename: PCSTR, pdwmsver: Long, pdwlsver: Long, bversion: BOOL): HRESULT {
    return Win32DynamicFfi.invoke("advpack.dll", "GetVersionFromFileExA", longArrayOf(lpszfilename, pdwmsver, pdwlsver, bversion.toLong())).toInt()
}

public fun GetVersionFromFileExW(lpszfilename: PCWSTR, pdwmsver: Long, pdwlsver: Long, bversion: BOOL): HRESULT {
    return Win32DynamicFfi.invoke("advpack.dll", "GetVersionFromFileExW", longArrayOf(lpszfilename, pdwmsver, pdwlsver, bversion.toLong())).toInt()
}

public fun GetVersionFromFileW(lpszfilename: PCWSTR, pdwmsver: Long, pdwlsver: Long, bversion: BOOL): HRESULT {
    return Win32DynamicFfi.invoke("advpack.dll", "GetVersionFromFileW", longArrayOf(lpszfilename, pdwmsver, pdwlsver, bversion.toLong())).toInt()
}

public fun GetWindowRegionData(hwnd: Foundation.HWND, size: UInt, prd: Long): UInt {
    return Win32DynamicFfi.invoke("dciman32.dll", "GetWindowRegionData", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), size.toLong(), prd)).toUInt()
}

public fun GlobalCompact(dwminfree: UInt): ULong {
    return Win32DynamicFfi.invoke("kernel32.dll", "GlobalCompact", longArrayOf(dwminfree.toLong())).toULong()
}

public fun GlobalFix(hmem: Foundation.HGLOBAL) {
    Win32DynamicFfi.invoke("kernel32.dll", "GlobalFix", longArrayOf(Win32DynamicFfi.objectSlot(hmem)))
}

public fun GlobalUnWire(hmem: Foundation.HGLOBAL): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GlobalUnWire", longArrayOf(Win32DynamicFfi.objectSlot(hmem))).toInt()
}

public fun GlobalUnfix(hmem: Foundation.HGLOBAL) {
    Win32DynamicFfi.invoke("kernel32.dll", "GlobalUnfix", longArrayOf(Win32DynamicFfi.objectSlot(hmem)))
}

public fun GlobalWire(hmem: Foundation.HGLOBAL): Long {
    return Win32DynamicFfi.invoke("kernel32.dll", "GlobalWire", longArrayOf(Win32DynamicFfi.objectSlot(hmem)))
}

public fun IMPGetIMEA(param0: Foundation.HWND, param1: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "IMPGetIMEA", longArrayOf(Win32DynamicFfi.objectSlot(param0), param1)).toInt()
}

public fun IMPGetIMEW(param0: Foundation.HWND, param1: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "IMPGetIMEW", longArrayOf(Win32DynamicFfi.objectSlot(param0), param1)).toInt()
}

public fun IMPQueryIMEA(param0: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "IMPQueryIMEA", longArrayOf(param0)).toInt()
}

public fun IMPQueryIMEW(param0: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "IMPQueryIMEW", longArrayOf(param0)).toInt()
}

public fun IMPSetIMEA(param0: Foundation.HWND, param1: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "IMPSetIMEA", longArrayOf(Win32DynamicFfi.objectSlot(param0), param1)).toInt()
}

public fun IMPSetIMEW(param0: Foundation.HWND, param1: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "IMPSetIMEW", longArrayOf(Win32DynamicFfi.objectSlot(param0), param1)).toInt()
}

public fun IsApiSetImplemented(contract: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("api-ms-win-core-apiquery-l2-1-0.dll", "IsApiSetImplemented", longArrayOf(contract)).toInt()
}

public fun IsBadHugeReadPtr(lp: Long, ucb: ULong): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "IsBadHugeReadPtr", longArrayOf(lp, ucb.toLong())).toInt()
}

public fun IsBadHugeWritePtr(lp: Long, ucb: ULong): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "IsBadHugeWritePtr", longArrayOf(lp, ucb.toLong())).toInt()
}

public fun IsNTAdmin(dwreserved: UInt, lpdwreserved: Long): BOOL {
    return Win32DynamicFfi.invoke("advpack.dll", "IsNTAdmin", longArrayOf(dwreserved.toLong(), lpdwreserved)).toInt()
}

public fun IsNativeVhdBoot(nativevhdboot: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "IsNativeVhdBoot", longArrayOf(nativevhdboot)).toInt()
}

public fun IsTokenUntrusted(tokenhandle: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "IsTokenUntrusted", longArrayOf(Win32DynamicFfi.objectSlot(tokenhandle))).toInt()
}

public fun LaunchINFSectionExW(hwnd: Foundation.HWND, hinstance: Foundation.HINSTANCE, pszparms: PCWSTR, nshow: Int): HRESULT {
    return Win32DynamicFfi.invoke("advpack.dll", "LaunchINFSectionExW", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), Win32DynamicFfi.objectSlot(hinstance), pszparms, nshow.toLong())).toInt()
}

public fun LaunchINFSectionW(hwndowner: Foundation.HWND, hinstance: Foundation.HINSTANCE, pszparams: PWSTR, nshow: Int): Int {
    return Win32DynamicFfi.invoke("advpack.dll", "LaunchINFSectionW", longArrayOf(Win32DynamicFfi.objectSlot(hwndowner), Win32DynamicFfi.objectSlot(hinstance), pszparams, nshow.toLong())).toInt()
}

public fun LocalCompact(uminfree: UInt): ULong {
    return Win32DynamicFfi.invoke("kernel32.dll", "LocalCompact", longArrayOf(uminfree.toLong())).toULong()
}

public fun LocalShrink(hmem: Foundation.HLOCAL, cbnewsize: UInt): ULong {
    return Win32DynamicFfi.invoke("kernel32.dll", "LocalShrink", longArrayOf(Win32DynamicFfi.objectSlot(hmem), cbnewsize.toLong())).toULong()
}

public fun MulDiv(nnumber: Int, nnumerator: Int, ndenominator: Int): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "MulDiv", longArrayOf(nnumber.toLong(), nnumerator.toLong(), ndenominator.toLong())).toInt()
}

public fun NeedReboot(dwrebootcheck: UInt): BOOL {
    return Win32DynamicFfi.invoke("advpack.dll", "NeedReboot", longArrayOf(dwrebootcheck.toLong())).toInt()
}

public fun NeedRebootInit(): UInt {
    return Win32DynamicFfi.invoke("advpack.dll", "NeedRebootInit", longArrayOf()).toUInt()
}

public fun OpenINFEngineA(pszinffilename: PCSTR, pszinstallsection: PCSTR, dwflags: UInt, phinf: Long, pvreserved: Long): HRESULT {
    return Win32DynamicFfi.invoke("advpack.dll", "OpenINFEngineA", longArrayOf(pszinffilename, pszinstallsection, dwflags.toLong(), phinf, pvreserved)).toInt()
}

public fun OpenINFEngineW(pszinffilename: PCWSTR, pszinstallsection: PCWSTR, dwflags: UInt, phinf: Long, pvreserved: Long): HRESULT {
    return Win32DynamicFfi.invoke("advpack.dll", "OpenINFEngineW", longArrayOf(pszinffilename, pszinstallsection, dwflags.toLong(), phinf, pvreserved)).toInt()
}

public fun OpenMutexA(dwdesiredaccess: UInt, binherithandle: BOOL, lpname: PCSTR): Foundation.HANDLE {
    Win32DynamicFfi.invoke("kernel32.dll", "OpenMutexA", longArrayOf(dwdesiredaccess.toLong(), binherithandle.toLong(), lpname))
    return Foundation.HANDLE()
}

public fun OpenSemaphoreA(dwdesiredaccess: UInt, binherithandle: BOOL, lpname: PCSTR): Foundation.HANDLE {
    Win32DynamicFfi.invoke("kernel32.dll", "OpenSemaphoreA", longArrayOf(dwdesiredaccess.toLong(), binherithandle.toLong(), lpname))
    return Foundation.HANDLE()
}

public fun QueryAuxiliaryCounterFrequency(lpauxiliarycounterfrequency: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-core-realtime-l1-1-2.dll", "QueryAuxiliaryCounterFrequency", longArrayOf(lpauxiliarycounterfrequency)).toInt()
}

public fun QueryIdleProcessorCycleTime(bufferlength: Long, processoridlecycletime: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "QueryIdleProcessorCycleTime", longArrayOf(bufferlength, processoridlecycletime)).toInt()
}

public fun QueryIdleProcessorCycleTimeEx(group: UShort, bufferlength: Long, processoridlecycletime: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "QueryIdleProcessorCycleTimeEx", longArrayOf(group.toLong(), bufferlength, processoridlecycletime)).toInt()
}

public fun QueryInterruptTime(lpinterrupttime: Long) {
    Win32DynamicFfi.invoke("api-ms-win-core-realtime-l1-1-1.dll", "QueryInterruptTime", longArrayOf(lpinterrupttime))
}

public fun QueryInterruptTimePrecise(lpinterrupttimeprecise: Long) {
    Win32DynamicFfi.invoke("api-ms-win-core-realtime-l1-1-1.dll", "QueryInterruptTimePrecise", longArrayOf(lpinterrupttimeprecise))
}

public fun QueryProcessCycleTime(processhandle: Foundation.HANDLE, cycletime: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "QueryProcessCycleTime", longArrayOf(Win32DynamicFfi.objectSlot(processhandle), cycletime)).toInt()
}

public fun QueryThreadCycleTime(threadhandle: Foundation.HANDLE, cycletime: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "QueryThreadCycleTime", longArrayOf(Win32DynamicFfi.objectSlot(threadhandle), cycletime)).toInt()
}

public fun QueryUnbiasedInterruptTime(unbiasedtime: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "QueryUnbiasedInterruptTime", longArrayOf(unbiasedtime)).toInt()
}

public fun QueryUnbiasedInterruptTimePrecise(lpunbiasedinterrupttimeprecise: Long) {
    Win32DynamicFfi.invoke("api-ms-win-core-realtime-l1-1-1.dll", "QueryUnbiasedInterruptTimePrecise", longArrayOf(lpunbiasedinterrupttimeprecise))
}

public fun RaiseCustomSystemEventTrigger(customsystemeventtriggerconfig: Long): UInt {
    return Win32DynamicFfi.invoke("api-ms-win-core-backgroundtask-l1-1-0.dll", "RaiseCustomSystemEventTrigger", longArrayOf(customsystemeventtriggerconfig)).toUInt()
}

public fun RebootCheckOnInstallA(hwnd: Foundation.HWND, pszinf: PCSTR, pszsec: PCSTR, dwreserved: UInt): HRESULT {
    return Win32DynamicFfi.invoke("advpack.dll", "RebootCheckOnInstallA", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), pszinf, pszsec, dwreserved.toLong())).toInt()
}

public fun RebootCheckOnInstallW(hwnd: Foundation.HWND, pszinf: PCWSTR, pszsec: PCWSTR, dwreserved: UInt): HRESULT {
    return Win32DynamicFfi.invoke("advpack.dll", "RebootCheckOnInstallW", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), pszinf, pszsec, dwreserved.toLong())).toInt()
}

public fun RecordFeatureError(featureid: UInt, error: Long) {
    Win32DynamicFfi.invoke("api-ms-win-core-featurestaging-l1-1-0.dll", "RecordFeatureError", longArrayOf(featureid.toLong(), error))
}

public fun RecordFeatureUsage(featureid: UInt, kind: UInt, addend: UInt, originname: PCSTR) {
    Win32DynamicFfi.invoke("api-ms-win-core-featurestaging-l1-1-0.dll", "RecordFeatureUsage", longArrayOf(featureid.toLong(), kind.toLong(), addend.toLong(), originname))
}

public fun RegInstallA(hmod: Foundation.HMODULE, pszsection: PCSTR, psttable: Long): HRESULT {
    return Win32DynamicFfi.invoke("advpack.dll", "RegInstallA", longArrayOf(Win32DynamicFfi.objectSlot(hmod), pszsection, psttable)).toInt()
}

public fun RegInstallW(hmod: Foundation.HMODULE, pszsection: PCWSTR, psttable: Long): HRESULT {
    return Win32DynamicFfi.invoke("advpack.dll", "RegInstallW", longArrayOf(Win32DynamicFfi.objectSlot(hmod), pszsection, psttable)).toInt()
}

public fun RegRestoreAllA(hwnd: Foundation.HWND, psztitlestring: PCSTR, hkbckupkey: Registry.HKEY): HRESULT {
    return Win32DynamicFfi.invoke("advpack.dll", "RegRestoreAllA", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), psztitlestring, Win32DynamicFfi.objectSlot(hkbckupkey))).toInt()
}

public fun RegRestoreAllW(hwnd: Foundation.HWND, psztitlestring: PCWSTR, hkbckupkey: Registry.HKEY): HRESULT {
    return Win32DynamicFfi.invoke("advpack.dll", "RegRestoreAllW", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), psztitlestring, Win32DynamicFfi.objectSlot(hkbckupkey))).toInt()
}

public fun RegSaveRestoreA(hwnd: Foundation.HWND, psztitlestring: PCSTR, hkbckupkey: Registry.HKEY, pcszrootkey: PCSTR, pcszsubkey: PCSTR, pcszvaluename: PCSTR, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("advpack.dll", "RegSaveRestoreA", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), psztitlestring, Win32DynamicFfi.objectSlot(hkbckupkey), pcszrootkey, pcszsubkey, pcszvaluename, dwflags.toLong())).toInt()
}

public fun RegSaveRestoreOnINFA(hwnd: Foundation.HWND, psztitle: PCSTR, pszinf: PCSTR, pszsection: PCSTR, hhklmbackkey: Registry.HKEY, hhkcubackkey: Registry.HKEY, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("advpack.dll", "RegSaveRestoreOnINFA", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), psztitle, pszinf, pszsection, Win32DynamicFfi.objectSlot(hhklmbackkey), Win32DynamicFfi.objectSlot(hhkcubackkey), dwflags.toLong())).toInt()
}

public fun RegSaveRestoreOnINFW(hwnd: Foundation.HWND, psztitle: PCWSTR, pszinf: PCWSTR, pszsection: PCWSTR, hhklmbackkey: Registry.HKEY, hhkcubackkey: Registry.HKEY, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("advpack.dll", "RegSaveRestoreOnINFW", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), psztitle, pszinf, pszsection, Win32DynamicFfi.objectSlot(hhklmbackkey), Win32DynamicFfi.objectSlot(hhkcubackkey), dwflags.toLong())).toInt()
}

public fun RegSaveRestoreW(hwnd: Foundation.HWND, psztitlestring: PCWSTR, hkbckupkey: Registry.HKEY, pcszrootkey: PCWSTR, pcszsubkey: PCWSTR, pcszvaluename: PCWSTR, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("advpack.dll", "RegSaveRestoreW", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), psztitlestring, Win32DynamicFfi.objectSlot(hkbckupkey), pcszrootkey, pcszsubkey, pcszvaluename, dwflags.toLong())).toInt()
}

public fun ReplacePartitionUnit(targetpartition: PCWSTR, sparepartition: PCWSTR, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "ReplacePartitionUnit", longArrayOf(targetpartition, sparepartition, flags.toLong())).toInt()
}

public fun RequestDeviceWakeup(hdevice: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "RequestDeviceWakeup", longArrayOf(Win32DynamicFfi.objectSlot(hdevice))).toInt()
}

public fun RtlAnsiStringToUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlAnsiStringToUnicodeString", longArrayOf(destinationstring, sourcestring, if (allocatedestinationstring) 1L else 0L))
    return Foundation.NTSTATUS()
}

public fun RtlCharToInteger(string: Long, base: UInt, value: Long): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlCharToInteger", longArrayOf(string, base.toLong(), value))
    return Foundation.NTSTATUS()
}

public fun RtlFreeAnsiString(ansistring: Long) {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlFreeAnsiString", longArrayOf(ansistring))
}

public fun RtlFreeOemString(oemstring: Long) {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlFreeOemString", longArrayOf(oemstring))
}

public fun RtlFreeUnicodeString(unicodestring: Long) {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlFreeUnicodeString", longArrayOf(unicodestring))
}

public fun RtlGetReturnAddressHijackTarget(): ULong {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlGetReturnAddressHijackTarget", longArrayOf()).toULong()
}

public fun RtlInitAnsiString(destinationstring: Long, sourcestring: Long) {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlInitAnsiString", longArrayOf(destinationstring, sourcestring))
}

public fun RtlInitAnsiStringEx(destinationstring: Long, sourcestring: Long): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlInitAnsiStringEx", longArrayOf(destinationstring, sourcestring))
    return Foundation.NTSTATUS()
}

public fun RtlInitString(destinationstring: Long, sourcestring: Long) {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlInitString", longArrayOf(destinationstring, sourcestring))
}

public fun RtlInitStringEx(destinationstring: Long, sourcestring: Long): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlInitStringEx", longArrayOf(destinationstring, sourcestring))
    return Foundation.NTSTATUS()
}

public fun RtlInitUnicodeString(destinationstring: Long, sourcestring: PCWSTR) {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlInitUnicodeString", longArrayOf(destinationstring, sourcestring))
}

public fun RtlIsNameLegalDOS8Dot3(name: Long, oemname: Long, namecontainsspaces: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntdll.dll", "RtlIsNameLegalDOS8Dot3", longArrayOf(name, oemname, namecontainsspaces))
    return (rawRet and 0xFFL) != 0L
}

public fun RtlLocalTimeToSystemTime(localtime: Long, systemtime: Long): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlLocalTimeToSystemTime", longArrayOf(localtime, systemtime))
    return Foundation.NTSTATUS()
}

public fun RtlRaiseCustomSystemEventTrigger(triggerconfig: Long): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlRaiseCustomSystemEventTrigger", longArrayOf(triggerconfig)).toUInt()
}

public fun RtlTimeToSecondsSince1970(time: Long, elapsedseconds: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntdll.dll", "RtlTimeToSecondsSince1970", longArrayOf(time, elapsedseconds))
    return (rawRet and 0xFFL) != 0L
}

public fun RtlUnicodeStringToAnsiString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlUnicodeStringToAnsiString", longArrayOf(destinationstring, sourcestring, if (allocatedestinationstring) 1L else 0L))
    return Foundation.NTSTATUS()
}

public fun RtlUnicodeStringToOemString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlUnicodeStringToOemString", longArrayOf(destinationstring, sourcestring, if (allocatedestinationstring) 1L else 0L))
    return Foundation.NTSTATUS()
}

public fun RtlUnicodeToMultiByteSize(bytesinmultibytestring: Long, unicodestring: PCWSTR, bytesinunicodestring: UInt): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlUnicodeToMultiByteSize", longArrayOf(bytesinmultibytestring, unicodestring, bytesinunicodestring.toLong()))
    return Foundation.NTSTATUS()
}

public fun RtlUniform(seed: Long): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlUniform", longArrayOf(seed)).toUInt()
}

public fun RunSetupCommandA(hwnd: Foundation.HWND, szcmdname: PCSTR, szinfsection: PCSTR, szdir: PCSTR, lpsztitle: PCSTR, phexe: Long, dwflags: UInt, pvreserved: Long): HRESULT {
    return Win32DynamicFfi.invoke("advpack.dll", "RunSetupCommandA", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), szcmdname, szinfsection, szdir, lpsztitle, phexe, dwflags.toLong(), pvreserved)).toInt()
}

public fun RunSetupCommandW(hwnd: Foundation.HWND, szcmdname: PCWSTR, szinfsection: PCWSTR, szdir: PCWSTR, lpsztitle: PCWSTR, phexe: Long, dwflags: UInt, pvreserved: Long): HRESULT {
    return Win32DynamicFfi.invoke("advpack.dll", "RunSetupCommandW", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), szcmdname, szinfsection, szdir, lpsztitle, phexe, dwflags.toLong(), pvreserved)).toInt()
}

public fun SendIMEMessageExA(param0: Foundation.HWND, param1: Foundation.LPARAM): Foundation.LRESULT {
    Win32DynamicFfi.invoke("user32.dll", "SendIMEMessageExA", longArrayOf(Win32DynamicFfi.objectSlot(param0), Win32DynamicFfi.objectSlot(param1)))
    return Foundation.LRESULT()
}

public fun SendIMEMessageExW(param0: Foundation.HWND, param1: Foundation.LPARAM): Foundation.LRESULT {
    Win32DynamicFfi.invoke("user32.dll", "SendIMEMessageExW", longArrayOf(Win32DynamicFfi.objectSlot(param0), Win32DynamicFfi.objectSlot(param1)))
    return Foundation.LRESULT()
}

public fun SetEnvironmentStringsA(newenvironment: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetEnvironmentStringsA", longArrayOf(newenvironment)).toInt()
}

public fun SetFirmwareEnvironmentVariableA(lpname: PCSTR, lpguid: PCSTR, pvalue: Long, nsize: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetFirmwareEnvironmentVariableA", longArrayOf(lpname, lpguid, pvalue, nsize.toLong())).toInt()
}

public fun SetFirmwareEnvironmentVariableExA(lpname: PCSTR, lpguid: PCSTR, pvalue: Long, nsize: UInt, dwattributes: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetFirmwareEnvironmentVariableExA", longArrayOf(lpname, lpguid, pvalue, nsize.toLong(), dwattributes.toLong())).toInt()
}

public fun SetFirmwareEnvironmentVariableExW(lpname: PCWSTR, lpguid: PCWSTR, pvalue: Long, nsize: UInt, dwattributes: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetFirmwareEnvironmentVariableExW", longArrayOf(lpname, lpguid, pvalue, nsize.toLong(), dwattributes.toLong())).toInt()
}

public fun SetFirmwareEnvironmentVariableW(lpname: PCWSTR, lpguid: PCWSTR, pvalue: Long, nsize: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetFirmwareEnvironmentVariableW", longArrayOf(lpname, lpguid, pvalue, nsize.toLong())).toInt()
}

public fun SetHandleCount(unumber: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetHandleCount", longArrayOf(unumber.toLong())).toUInt()
}

public fun SetMessageWaitingIndicator(hmsgindicator: Foundation.HANDLE, ulmsgcount: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetMessageWaitingIndicator", longArrayOf(Win32DynamicFfi.objectSlot(hmsgindicator), ulmsgcount.toLong())).toInt()
}

public fun SetPerUserSecValuesA(pperuser: Long): HRESULT {
    return Win32DynamicFfi.invoke("advpack.dll", "SetPerUserSecValuesA", longArrayOf(pperuser)).toInt()
}

public fun SetPerUserSecValuesW(pperuser: Long): HRESULT {
    return Win32DynamicFfi.invoke("advpack.dll", "SetPerUserSecValuesW", longArrayOf(pperuser)).toInt()
}

public fun SubscribeFeatureStateChangeNotification(subscription: Long, callback: PFEATURE_STATE_CHANGE_CALLBACK, context: Long) {
    Win32DynamicFfi.invoke("api-ms-win-core-featurestaging-l1-1-0.dll", "SubscribeFeatureStateChangeNotification", longArrayOf(subscription, Win32DynamicFfi.objectSlot(callback), context))
}

public fun TranslateInfStringA(pszinffilename: PCSTR, pszinstallsection: PCSTR, psztranslatesection: PCSTR, psztranslatekey: PCSTR, pszbuffer: PSTR, cchbuffer: UInt, pdwrequiredsize: Long, pvreserved: Long): HRESULT {
    return Win32DynamicFfi.invoke("advpack.dll", "TranslateInfStringA", longArrayOf(pszinffilename, pszinstallsection, psztranslatesection, psztranslatekey, pszbuffer, cchbuffer.toLong(), pdwrequiredsize, pvreserved)).toInt()
}

public fun TranslateInfStringExA(hinf: Long, pszinffilename: PCSTR, psztranslatesection: PCSTR, psztranslatekey: PCSTR, pszbuffer: PSTR, dwbuffersize: UInt, pdwrequiredsize: Long, pvreserved: Long): HRESULT {
    return Win32DynamicFfi.invoke("advpack.dll", "TranslateInfStringExA", longArrayOf(hinf, pszinffilename, psztranslatesection, psztranslatekey, pszbuffer, dwbuffersize.toLong(), pdwrequiredsize, pvreserved)).toInt()
}

public fun TranslateInfStringExW(hinf: Long, pszinffilename: PCWSTR, psztranslatesection: PCWSTR, psztranslatekey: PCWSTR, pszbuffer: PWSTR, dwbuffersize: UInt, pdwrequiredsize: Long, pvreserved: Long): HRESULT {
    return Win32DynamicFfi.invoke("advpack.dll", "TranslateInfStringExW", longArrayOf(hinf, pszinffilename, psztranslatesection, psztranslatekey, pszbuffer, dwbuffersize.toLong(), pdwrequiredsize, pvreserved)).toInt()
}

public fun TranslateInfStringW(pszinffilename: PCWSTR, pszinstallsection: PCWSTR, psztranslatesection: PCWSTR, psztranslatekey: PCWSTR, pszbuffer: PWSTR, cchbuffer: UInt, pdwrequiredsize: Long, pvreserved: Long): HRESULT {
    return Win32DynamicFfi.invoke("advpack.dll", "TranslateInfStringW", longArrayOf(pszinffilename, pszinstallsection, psztranslatesection, psztranslatekey, pszbuffer, cchbuffer.toLong(), pdwrequiredsize, pvreserved)).toInt()
}

public fun UnsubscribeFeatureStateChangeNotification(subscription: FEATURE_STATE_CHANGE_SUBSCRIPTION) {
    Win32DynamicFfi.invoke("api-ms-win-core-featurestaging-l1-1-0.dll", "UnsubscribeFeatureStateChangeNotification", longArrayOf(subscription))
}

public fun UserInstStubWrapperA(hwnd: Foundation.HWND, hinstance: Foundation.HINSTANCE, pszparms: PCSTR, nshow: Int): HRESULT {
    return Win32DynamicFfi.invoke("advpack.dll", "UserInstStubWrapperA", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), Win32DynamicFfi.objectSlot(hinstance), pszparms, nshow.toLong())).toInt()
}

public fun UserInstStubWrapperW(hwnd: Foundation.HWND, hinstance: Foundation.HINSTANCE, pszparms: PCWSTR, nshow: Int): HRESULT {
    return Win32DynamicFfi.invoke("advpack.dll", "UserInstStubWrapperW", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), Win32DynamicFfi.objectSlot(hinstance), pszparms, nshow.toLong())).toInt()
}

public fun UserUnInstStubWrapperA(hwnd: Foundation.HWND, hinstance: Foundation.HINSTANCE, pszparms: PCSTR, nshow: Int): HRESULT {
    return Win32DynamicFfi.invoke("advpack.dll", "UserUnInstStubWrapperA", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), Win32DynamicFfi.objectSlot(hinstance), pszparms, nshow.toLong())).toInt()
}

public fun UserUnInstStubWrapperW(hwnd: Foundation.HWND, hinstance: Foundation.HINSTANCE, pszparms: PCWSTR, nshow: Int): HRESULT {
    return Win32DynamicFfi.invoke("advpack.dll", "UserUnInstStubWrapperW", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), Win32DynamicFfi.objectSlot(hinstance), pszparms, nshow.toLong())).toInt()
}

public fun WINNLSEnableIME(param0: Foundation.HWND, param1: BOOL): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "WINNLSEnableIME", longArrayOf(Win32DynamicFfi.objectSlot(param0), param1.toLong())).toInt()
}

public fun WINNLSGetEnableStatus(param0: Foundation.HWND): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "WINNLSGetEnableStatus", longArrayOf(Win32DynamicFfi.objectSlot(param0))).toInt()
}

public fun WINNLSGetIMEHotkey(param0: Foundation.HWND): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "WINNLSGetIMEHotkey", longArrayOf(Win32DynamicFfi.objectSlot(param0))).toUInt()
}

public fun WinWatchClose(hww: HWINWATCH) {
    Win32DynamicFfi.invoke("dciman32.dll", "WinWatchClose", longArrayOf(hww))
}

public fun WinWatchDidStatusChange(hww: HWINWATCH): BOOL {
    return Win32DynamicFfi.invoke("dciman32.dll", "WinWatchDidStatusChange", longArrayOf(hww)).toInt()
}

public fun WinWatchGetClipList(hww: HWINWATCH, prc: Long, size: UInt, prd: Long): UInt {
    return Win32DynamicFfi.invoke("dciman32.dll", "WinWatchGetClipList", longArrayOf(hww, prc, size.toLong(), prd)).toUInt()
}

public fun WinWatchNotify(hww: HWINWATCH, notifycallback: WINWATCHNOTIFYPROC, notifyparam: Foundation.LPARAM): BOOL {
    return Win32DynamicFfi.invoke("dciman32.dll", "WinWatchNotify", longArrayOf(hww, Win32DynamicFfi.objectSlot(notifycallback), Win32DynamicFfi.objectSlot(notifyparam))).toInt()
}

public fun WinWatchOpen(hwnd: Foundation.HWND): HWINWATCH {
    return Win32DynamicFfi.invoke("dciman32.dll", "WinWatchOpen", longArrayOf(Win32DynamicFfi.objectSlot(hwnd)))
}

public fun WldpCanExecuteBuffer(host: Long, options: WLDP_EXECUTION_EVALUATION_OPTIONS, buffer: Long, buffersize: UInt, auditinfo: PCWSTR, result: Long): HRESULT {
    return Win32DynamicFfi.invoke("wldp.dll", "WldpCanExecuteBuffer", longArrayOf(host, options.toLong(), buffer, buffersize.toLong(), auditinfo, result)).toInt()
}

public fun WldpCanExecuteFile(host: Long, options: WLDP_EXECUTION_EVALUATION_OPTIONS, filehandle: Foundation.HANDLE, auditinfo: PCWSTR, result: Long): HRESULT {
    return Win32DynamicFfi.invoke("wldp.dll", "WldpCanExecuteFile", longArrayOf(host, options.toLong(), Win32DynamicFfi.objectSlot(filehandle), auditinfo, result)).toInt()
}

public fun WldpCanExecuteStream(host: Long, options: WLDP_EXECUTION_EVALUATION_OPTIONS, stream: Long, auditinfo: PCWSTR, result: Long): HRESULT {
    return Win32DynamicFfi.invoke("wldp.dll", "WldpCanExecuteStream", longArrayOf(host, options.toLong(), stream, auditinfo, result)).toInt()
}

public fun WldpGetLockdownPolicy(hostinformation: Long, lockdownstate: Long, lockdownflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("wldp.dll", "WldpGetLockdownPolicy", longArrayOf(hostinformation, lockdownstate, lockdownflags.toLong())).toInt()
}

public fun WldpIsClassInApprovedList(classid: Long, hostinformation: Long, isapproved: Long, optionalflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("wldp.dll", "WldpIsClassInApprovedList", longArrayOf(classid, hostinformation, isapproved, optionalflags.toLong())).toInt()
}

public fun WldpIsDynamicCodePolicyEnabled(isenabled: Long): HRESULT {
    return Win32DynamicFfi.invoke("wldp.dll", "WldpIsDynamicCodePolicyEnabled", longArrayOf(isenabled)).toInt()
}

public fun WldpQueryDeviceSecurityInformation(information: Long, informationlength: UInt, returnlength: Long): HRESULT {
    return Win32DynamicFfi.invoke("wldp.dll", "WldpQueryDeviceSecurityInformation", longArrayOf(information, informationlength.toLong(), returnlength)).toInt()
}

public fun WldpQueryDynamicCodeTrust(filehandle: Foundation.HANDLE, baseimage: Long, imagesize: UInt): HRESULT {
    return Win32DynamicFfi.invoke("wldp.dll", "WldpQueryDynamicCodeTrust", longArrayOf(Win32DynamicFfi.objectSlot(filehandle), baseimage, imagesize.toLong())).toInt()
}

public fun WldpSetDynamicCodeTrust(filehandle: Foundation.HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("wldp.dll", "WldpSetDynamicCodeTrust", longArrayOf(Win32DynamicFfi.objectSlot(filehandle))).toInt()
}

public fun WritePrivateProfileSectionA(lpappname: PCSTR, lpstring: PCSTR, lpfilename: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "WritePrivateProfileSectionA", longArrayOf(lpappname, lpstring, lpfilename)).toInt()
}

public fun WritePrivateProfileSectionW(lpappname: PCWSTR, lpstring: PCWSTR, lpfilename: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "WritePrivateProfileSectionW", longArrayOf(lpappname, lpstring, lpfilename)).toInt()
}

public fun WritePrivateProfileStringA(lpappname: PCSTR, lpkeyname: PCSTR, lpstring: PCSTR, lpfilename: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "WritePrivateProfileStringA", longArrayOf(lpappname, lpkeyname, lpstring, lpfilename)).toInt()
}

public fun WritePrivateProfileStringW(lpappname: PCWSTR, lpkeyname: PCWSTR, lpstring: PCWSTR, lpfilename: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "WritePrivateProfileStringW", longArrayOf(lpappname, lpkeyname, lpstring, lpfilename)).toInt()
}

public fun WritePrivateProfileStructA(lpszsection: PCSTR, lpszkey: PCSTR, lpstruct: Long, usizestruct: UInt, szfile: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "WritePrivateProfileStructA", longArrayOf(lpszsection, lpszkey, lpstruct, usizestruct.toLong(), szfile)).toInt()
}

public fun WritePrivateProfileStructW(lpszsection: PCWSTR, lpszkey: PCWSTR, lpstruct: Long, usizestruct: UInt, szfile: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "WritePrivateProfileStructW", longArrayOf(lpszsection, lpszkey, lpstruct, usizestruct.toLong(), szfile)).toInt()
}

public fun WriteProfileSectionA(lpappname: PCSTR, lpstring: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "WriteProfileSectionA", longArrayOf(lpappname, lpstring)).toInt()
}

public fun WriteProfileSectionW(lpappname: PCWSTR, lpstring: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "WriteProfileSectionW", longArrayOf(lpappname, lpstring)).toInt()
}

public fun WriteProfileStringA(lpappname: PCSTR, lpkeyname: PCSTR, lpstring: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "WriteProfileStringA", longArrayOf(lpappname, lpkeyname, lpstring)).toInt()
}

public fun WriteProfileStringW(lpappname: PCWSTR, lpkeyname: PCWSTR, lpstring: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "WriteProfileStringW", longArrayOf(lpappname, lpkeyname, lpstring)).toInt()
}

public fun _hread(hfile: Int, lpbuffer: Long, lbytes: Int): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "_hread", longArrayOf(hfile.toLong(), lpbuffer, lbytes.toLong())).toInt()
}

public fun _hwrite(hfile: Int, lpbuffer: PCSTR, lbytes: Int): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "_hwrite", longArrayOf(hfile.toLong(), lpbuffer, lbytes.toLong())).toInt()
}

public fun _lclose(hfile: Int): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "_lclose", longArrayOf(hfile.toLong())).toInt()
}

public fun _lcreat(lppathname: PCSTR, iattribute: Int): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "_lcreat", longArrayOf(lppathname, iattribute.toLong())).toInt()
}

public fun _llseek(hfile: Int, loffset: Int, iorigin: Int): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "_llseek", longArrayOf(hfile.toLong(), loffset.toLong(), iorigin.toLong())).toInt()
}

public fun _lopen(lppathname: PCSTR, ireadwrite: Int): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "_lopen", longArrayOf(lppathname, ireadwrite.toLong())).toInt()
}

public fun _lread(hfile: Int, lpbuffer: Long, ubytes: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "_lread", longArrayOf(hfile.toLong(), lpbuffer, ubytes.toLong())).toUInt()
}

public fun _lwrite(hfile: Int, lpbuffer: PCSTR, ubytes: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "_lwrite", longArrayOf(hfile.toLong(), lpbuffer, ubytes.toLong())).toUInt()
}

public fun uaw_lstrcmpW(string1: Long, string2: Long): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "uaw_lstrcmpW", longArrayOf(string1, string2)).toInt()
}

public fun uaw_lstrcmpiW(string1: Long, string2: Long): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "uaw_lstrcmpiW", longArrayOf(string1, string2)).toInt()
}

public fun uaw_lstrlenW(string: Long): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "uaw_lstrlenW", longArrayOf(string)).toInt()
}

public fun uaw_wcschr(string: Long, character: UShort): Long {
    return Win32DynamicFfi.invoke("kernel32.dll", "uaw_wcschr", longArrayOf(string, character.toLong()))
}

public fun uaw_wcscpy(destination: Long, source: Long): Long {
    return Win32DynamicFfi.invoke("kernel32.dll", "uaw_wcscpy", longArrayOf(destination, source))
}

public fun uaw_wcsicmp(string1: Long, string2: Long): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "uaw_wcsicmp", longArrayOf(string1, string2)).toInt()
}

public fun uaw_wcslen(string: Long): ULong {
    return Win32DynamicFfi.invoke("kernel32.dll", "uaw_wcslen", longArrayOf(string)).toULong()
}

public fun uaw_wcsrchr(string: Long, character: UShort): Long {
    return Win32DynamicFfi.invoke("kernel32.dll", "uaw_wcsrchr", longArrayOf(string, character.toLong()))
}
