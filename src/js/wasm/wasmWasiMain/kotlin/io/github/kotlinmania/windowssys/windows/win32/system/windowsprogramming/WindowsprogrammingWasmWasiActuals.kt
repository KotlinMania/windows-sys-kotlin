@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hglobal
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hlocal
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hmodule
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Rgndata
import io.github.kotlinmania.windowssys.windows.win32.system.registry.Hkey

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun addDelBackupEntryA(lpcszfilelist: Pcstr, lpcszbackupdir: Pcstr, lpcszbasename: Pcstr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingAddDelBackupEntryA")

public actual fun addDelBackupEntryW(lpcszfilelist: Pcwstr, lpcszbackupdir: Pcwstr, lpcszbasename: Pcwstr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingAddDelBackupEntryW")

public actual fun advInstallFileA(hwnd: Hwnd, lpszsourcedir: Pcstr, lpszsourcefile: Pcstr, lpszdestdir: Pcstr, lpszdestfile: Pcstr, dwflags: UInt, dwreserved: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingAdvInstallFileA")

public actual fun advInstallFileW(hwnd: Hwnd, lpszsourcedir: Pcwstr, lpszsourcefile: Pcwstr, lpszdestdir: Pcwstr, lpszdestfile: Pcwstr, dwflags: UInt, dwreserved: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingAdvInstallFileW")

public actual fun apphelpCheckShellObject(objectclsid: ConstPtr<Guid>, bshimifnecessary: Bool, pullflags: MutPtr<ULong>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingApphelpCheckShellObject")

public actual fun cancelDeviceWakeupRequest(hdevice: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingCancelDeviceWakeupRequest")

public actual fun closeINFEngine(hinf: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingCloseINFEngine")

public actual fun convertAuxiliaryCounterToPerformanceCounter(ullauxiliarycountervalue: ULong, lpperformancecountervalue: MutPtr<ULong>, lpconversionerror: MutPtr<ULong>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingConvertAuxiliaryCounterToPerformanceCounter")

public actual fun convertPerformanceCounterToAuxiliaryCounter(ullperformancecountervalue: ULong, lpauxiliarycountervalue: MutPtr<ULong>, lpconversionerror: MutPtr<ULong>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingConvertPerformanceCounterToAuxiliaryCounter")

public actual fun dCIBeginAccess(pdci: MutPtr<Dcisurfaceinfo>, x: Int, y: Int, dx: Int, dy: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingDCIBeginAccess")

public actual fun dCICloseProvider(hdc: Hdc): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingDCICloseProvider")

public actual fun dCICreateOffscreen(hdc: Hdc, dwcompression: UInt, dwredmask: UInt, dwgreenmask: UInt, dwbluemask: UInt, dwwidth: UInt, dwheight: UInt, dwdcicaps: UInt, dwbitcount: UInt, lplpsurface: MutPtr<MutPtr<Dcioffscreen>>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingDCICreateOffscreen")

public actual fun dCICreateOverlay(hdc: Hdc, lpoffscreensurf: MutPtr<CVoid>, lplpsurface: MutPtr<MutPtr<Dcioverlay>>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingDCICreateOverlay")

public actual fun dCICreatePrimary(hdc: Hdc, lplpsurface: MutPtr<MutPtr<Dcisurfaceinfo>>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingDCICreatePrimary")

public actual fun dCIDestroy(pdci: MutPtr<Dcisurfaceinfo>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingDCIDestroy")

public actual fun dCIDraw(pdci: MutPtr<Dcioffscreen>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingDCIDraw")

public actual fun dCIEndAccess(pdci: MutPtr<Dcisurfaceinfo>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingDCIEndAccess")

public actual fun dCIEnum(hdc: Hdc, lprdst: MutPtr<Rect>, lprsrc: MutPtr<Rect>, lpfncallback: MutPtr<CVoid>, lpcontext: MutPtr<CVoid>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingDCIEnum")

public actual fun dCIOpenProvider(): Hdc =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingDCIOpenProvider")

public actual fun dCISetClipList(pdci: MutPtr<Dcioffscreen>, prd: MutPtr<Rgndata>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingDCISetClipList")

public actual fun dCISetDestination(pdci: MutPtr<Dcioffscreen>, dst: MutPtr<Rect>, src: MutPtr<Rect>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingDCISetDestination")

public actual fun dCISetSrcDestClip(pdci: MutPtr<Dcioffscreen>, srcrc: MutPtr<Rect>, destrc: MutPtr<Rect>, prd: MutPtr<Rgndata>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingDCISetSrcDestClip")

public actual fun delNodeA(pszfileordirname: Pcstr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingDelNodeA")

public actual fun delNodeRunDLL32W(hwnd: Hwnd, hinstance: Hinstance, pszparms: Pwstr, nshow: Int): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingDelNodeRunDLL32W")

public actual fun delNodeW(pszfileordirname: Pcwstr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingDelNodeW")

public actual fun dnsHostnameToComputerNameA(hostname: Pcstr, computername: Pstr, nsize: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingDnsHostnameToComputerNameA")

public actual fun dnsHostnameToComputerNameW(hostname: Pcwstr, computername: Pwstr, nsize: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingDnsHostnameToComputerNameW")

public actual fun dosDateTimeToFileTime(wfatdate: UShort, wfattime: UShort, lpfiletime: MutPtr<Filetime>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingDosDateTimeToFileTime")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemWindowsprogrammingEnableProcessOptionalXStateFeatures")
private external fun wasiWindowssysWindowsWin32SystemWindowsprogrammingEnableProcessOptionalXStateFeatures(features: Long): Int

public actual fun enableProcessOptionalXStateFeatures(features: ULong): Bool =
    wasiWindowssysWindowsWin32SystemWindowsprogrammingEnableProcessOptionalXStateFeatures(features.toLong())

public actual fun executeCabA(hwnd: Hwnd, pcab: MutPtr<Cabinfoa>, preserved: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingExecuteCabA")

public actual fun executeCabW(hwnd: Hwnd, pcab: MutPtr<Cabinfow>, preserved: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingExecuteCabW")

public actual fun extractFilesA(pszcabname: Pcstr, pszexpanddir: Pcstr, dwflags: UInt, pszfilelist: Pcstr, lpreserved: MutPtr<CVoid>, dwreserved: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingExtractFilesA")

public actual fun extractFilesW(pszcabname: Pcwstr, pszexpanddir: Pcwstr, dwflags: UInt, pszfilelist: Pcwstr, lpreserved: MutPtr<CVoid>, dwreserved: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingExtractFilesW")

public actual fun fileSaveMarkNotExistA(lpfilelist: Pcstr, lpdir: Pcstr, lpbasename: Pcstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingFileSaveMarkNotExistA")

public actual fun fileSaveMarkNotExistW(lpfilelist: Pcwstr, lpdir: Pcwstr, lpbasename: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingFileSaveMarkNotExistW")

public actual fun fileSaveRestoreOnINFA(hwnd: Hwnd, psztitle: Pcstr, pszinf: Pcstr, pszsection: Pcstr, pszbackupdir: Pcstr, pszbasebackupfile: Pcstr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingFileSaveRestoreOnINFA")

public actual fun fileSaveRestoreOnINFW(hwnd: Hwnd, psztitle: Pcwstr, pszinf: Pcwstr, pszsection: Pcwstr, pszbackupdir: Pcwstr, pszbasebackupfile: Pcwstr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingFileSaveRestoreOnINFW")

public actual fun fileSaveRestoreW(hdlg: Hwnd, lpfilelist: Pcwstr, lpdir: Pcwstr, lpbasename: Pcwstr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingFileSaveRestoreW")

public actual fun fileTimeToDosDateTime(lpfiletime: ConstPtr<Filetime>, lpfatdate: MutPtr<UShort>, lpfattime: MutPtr<UShort>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingFileTimeToDosDateTime")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemWindowsprogrammingGdiEntry13")
private external fun wasiWindowssysWindowsWin32SystemWindowsprogrammingGdiEntry13(): Int

public actual fun gdiEntry13(): UInt =
    wasiWindowssysWindowsWin32SystemWindowsprogrammingGdiEntry13().toUInt()

public actual fun getComputerNameA(lpbuffer: Pstr, nsize: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingGetComputerNameA")

public actual fun getComputerNameW(lpbuffer: Pwstr, nsize: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingGetComputerNameW")

public actual fun getCurrentHwProfileA(lphwprofileinfo: MutPtr<HwProfileInfoa>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingGetCurrentHwProfileA")

public actual fun getCurrentHwProfileW(lphwprofileinfo: MutPtr<HwProfileInfow>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingGetCurrentHwProfileW")

public actual fun getDCRegionData(hdc: Hdc, size: UInt, prd: MutPtr<Rgndata>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingGetDCRegionData")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemWindowsprogrammingGetFeatureEnabledState")
private external fun wasiWindowssysWindowsWin32SystemWindowsprogrammingGetFeatureEnabledState(featureid: Int, changetime: Int): Int

public actual fun getFeatureEnabledState(featureid: UInt, changetime: FeatureChangeTime): FeatureEnabledState =
    wasiWindowssysWindowsWin32SystemWindowsprogrammingGetFeatureEnabledState(featureid.toInt(), changetime)

public actual fun getFeatureVariant(featureid: UInt, changetime: FeatureChangeTime, payloadid: MutPtr<UInt>, hasnotification: MutPtr<Bool>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingGetFeatureVariant")

public actual fun getFirmwareEnvironmentVariableA(lpname: Pcstr, lpguid: Pcstr, pbuffer: MutPtr<CVoid>, nsize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingGetFirmwareEnvironmentVariableA")

public actual fun getFirmwareEnvironmentVariableExA(lpname: Pcstr, lpguid: Pcstr, pbuffer: MutPtr<CVoid>, nsize: UInt, pdwattribubutes: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingGetFirmwareEnvironmentVariableExA")

public actual fun getFirmwareEnvironmentVariableExW(lpname: Pcwstr, lpguid: Pcwstr, pbuffer: MutPtr<CVoid>, nsize: UInt, pdwattribubutes: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingGetFirmwareEnvironmentVariableExW")

public actual fun getFirmwareEnvironmentVariableW(lpname: Pcwstr, lpguid: Pcwstr, pbuffer: MutPtr<CVoid>, nsize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingGetFirmwareEnvironmentVariableW")

public actual fun getPrivateProfileIntA(lpappname: Pcstr, lpkeyname: Pcstr, ndefault: Int, lpfilename: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileIntA")

public actual fun getPrivateProfileIntW(lpappname: Pcwstr, lpkeyname: Pcwstr, ndefault: Int, lpfilename: Pcwstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileIntW")

public actual fun getPrivateProfileSectionA(lpappname: Pcstr, lpreturnedstring: Pstr, nsize: UInt, lpfilename: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileSectionA")

public actual fun getPrivateProfileSectionNamesA(lpszreturnbuffer: Pstr, nsize: UInt, lpfilename: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileSectionNamesA")

public actual fun getPrivateProfileSectionNamesW(lpszreturnbuffer: Pwstr, nsize: UInt, lpfilename: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileSectionNamesW")

public actual fun getPrivateProfileSectionW(lpappname: Pcwstr, lpreturnedstring: Pwstr, nsize: UInt, lpfilename: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileSectionW")

public actual fun getPrivateProfileStringA(lpappname: Pcstr, lpkeyname: Pcstr, lpdefault: Pcstr, lpreturnedstring: Pstr, nsize: UInt, lpfilename: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileStringA")

public actual fun getPrivateProfileStringW(lpappname: Pcwstr, lpkeyname: Pcwstr, lpdefault: Pcwstr, lpreturnedstring: Pwstr, nsize: UInt, lpfilename: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileStringW")

public actual fun getPrivateProfileStructA(lpszsection: Pcstr, lpszkey: Pcstr, lpstruct: MutPtr<CVoid>, usizestruct: UInt, szfile: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileStructA")

public actual fun getPrivateProfileStructW(lpszsection: Pcwstr, lpszkey: Pcwstr, lpstruct: MutPtr<CVoid>, usizestruct: UInt, szfile: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingGetPrivateProfileStructW")

public actual fun getProfileIntA(lpappname: Pcstr, lpkeyname: Pcstr, ndefault: Int): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingGetProfileIntA")

public actual fun getProfileIntW(lpappname: Pcwstr, lpkeyname: Pcwstr, ndefault: Int): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingGetProfileIntW")

public actual fun getProfileSectionA(lpappname: Pcstr, lpreturnedstring: Pstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingGetProfileSectionA")

public actual fun getProfileSectionW(lpappname: Pcwstr, lpreturnedstring: Pwstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingGetProfileSectionW")

public actual fun getProfileStringA(lpappname: Pcstr, lpkeyname: Pcstr, lpdefault: Pcstr, lpreturnedstring: Pstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingGetProfileStringA")

public actual fun getProfileStringW(lpappname: Pcwstr, lpkeyname: Pcwstr, lpdefault: Pcwstr, lpreturnedstring: Pwstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingGetProfileStringW")

public actual fun getSystemRegistryQuota(pdwquotaallowed: MutPtr<UInt>, pdwquotaused: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingGetSystemRegistryQuota")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemWindowsprogrammingGetThreadEnabledXStateFeatures")
private external fun wasiWindowssysWindowsWin32SystemWindowsprogrammingGetThreadEnabledXStateFeatures(): Long

public actual fun getThreadEnabledXStateFeatures(): ULong =
    wasiWindowssysWindowsWin32SystemWindowsprogrammingGetThreadEnabledXStateFeatures().toULong()

public actual fun getUserNameA(lpbuffer: Pstr, pcbbuffer: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingGetUserNameA")

public actual fun getUserNameW(lpbuffer: Pwstr, pcbbuffer: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingGetUserNameW")

public actual fun getVersionFromFileA(lpszfilename: Pcstr, pdwmsver: MutPtr<UInt>, pdwlsver: MutPtr<UInt>, bversion: Bool): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingGetVersionFromFileA")

public actual fun getVersionFromFileExA(lpszfilename: Pcstr, pdwmsver: MutPtr<UInt>, pdwlsver: MutPtr<UInt>, bversion: Bool): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingGetVersionFromFileExA")

public actual fun getVersionFromFileExW(lpszfilename: Pcwstr, pdwmsver: MutPtr<UInt>, pdwlsver: MutPtr<UInt>, bversion: Bool): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingGetVersionFromFileExW")

public actual fun getVersionFromFileW(lpszfilename: Pcwstr, pdwmsver: MutPtr<UInt>, pdwlsver: MutPtr<UInt>, bversion: Bool): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingGetVersionFromFileW")

public actual fun getWindowRegionData(hwnd: Hwnd, size: UInt, prd: MutPtr<Rgndata>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingGetWindowRegionData")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemWindowsprogrammingGlobalCompact")
private external fun wasiWindowssysWindowsWin32SystemWindowsprogrammingGlobalCompact(dwminfree: Int): Long

public actual fun globalCompact(dwminfree: UInt): ULong =
    wasiWindowssysWindowsWin32SystemWindowsprogrammingGlobalCompact(dwminfree.toInt()).toULong()

public actual fun globalFix(hmem: Hglobal): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingGlobalFix")

public actual fun globalUnWire(hmem: Hglobal): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingGlobalUnWire")

public actual fun globalUnfix(hmem: Hglobal): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingGlobalUnfix")

public actual fun globalWire(hmem: Hglobal): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingGlobalWire")

public actual fun iMPGetIMEA(param0: Hwnd, param1: MutPtr<Imeproa>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingIMPGetIMEA")

public actual fun iMPGetIMEW(param0: Hwnd, param1: MutPtr<Imeprow>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingIMPGetIMEW")

public actual fun iMPQueryIMEA(param0: MutPtr<Imeproa>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingIMPQueryIMEA")

public actual fun iMPQueryIMEW(param0: MutPtr<Imeprow>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingIMPQueryIMEW")

public actual fun iMPSetIMEA(param0: Hwnd, param1: MutPtr<Imeproa>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingIMPSetIMEA")

public actual fun iMPSetIMEW(param0: Hwnd, param1: MutPtr<Imeprow>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingIMPSetIMEW")

public actual fun isApiSetImplemented(contract: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingIsApiSetImplemented")

public actual fun isBadHugeReadPtr(lp: ConstPtr<CVoid>, ucb: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingIsBadHugeReadPtr")

public actual fun isBadHugeWritePtr(lp: ConstPtr<CVoid>, ucb: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingIsBadHugeWritePtr")

public actual fun isNTAdmin(dwreserved: UInt, lpdwreserved: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingIsNTAdmin")

public actual fun isNativeVhdBoot(nativevhdboot: MutPtr<Bool>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingIsNativeVhdBoot")

public actual fun isTokenUntrusted(tokenhandle: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingIsTokenUntrusted")

public actual fun launchINFSectionExW(hwnd: Hwnd, hinstance: Hinstance, pszparms: Pcwstr, nshow: Int): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingLaunchINFSectionExW")

public actual fun launchINFSectionW(hwndowner: Hwnd, hinstance: Hinstance, pszparams: Pwstr, nshow: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingLaunchINFSectionW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemWindowsprogrammingLocalCompact")
private external fun wasiWindowssysWindowsWin32SystemWindowsprogrammingLocalCompact(uminfree: Int): Long

public actual fun localCompact(uminfree: UInt): ULong =
    wasiWindowssysWindowsWin32SystemWindowsprogrammingLocalCompact(uminfree.toInt()).toULong()

public actual fun localShrink(hmem: Hlocal, cbnewsize: UInt): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingLocalShrink")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemWindowsprogrammingMulDiv")
private external fun wasiWindowssysWindowsWin32SystemWindowsprogrammingMulDiv(nnumber: Int, nnumerator: Int, ndenominator: Int): Int

public actual fun mulDiv(nnumber: Int, nnumerator: Int, ndenominator: Int): Int =
    wasiWindowssysWindowsWin32SystemWindowsprogrammingMulDiv(nnumber, nnumerator, ndenominator)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemWindowsprogrammingNeedReboot")
private external fun wasiWindowssysWindowsWin32SystemWindowsprogrammingNeedReboot(dwrebootcheck: Int): Int

public actual fun needReboot(dwrebootcheck: UInt): Bool =
    wasiWindowssysWindowsWin32SystemWindowsprogrammingNeedReboot(dwrebootcheck.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemWindowsprogrammingNeedRebootInit")
private external fun wasiWindowssysWindowsWin32SystemWindowsprogrammingNeedRebootInit(): Int

public actual fun needRebootInit(): UInt =
    wasiWindowssysWindowsWin32SystemWindowsprogrammingNeedRebootInit().toUInt()

public actual fun openINFEngineA(pszinffilename: Pcstr, pszinstallsection: Pcstr, dwflags: UInt, phinf: MutPtr<MutPtr<CVoid>>, pvreserved: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingOpenINFEngineA")

public actual fun openINFEngineW(pszinffilename: Pcwstr, pszinstallsection: Pcwstr, dwflags: UInt, phinf: MutPtr<MutPtr<CVoid>>, pvreserved: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingOpenINFEngineW")

public actual fun openMutexA(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingOpenMutexA")

public actual fun openSemaphoreA(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingOpenSemaphoreA")

public actual fun queryAuxiliaryCounterFrequency(lpauxiliarycounterfrequency: MutPtr<ULong>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingQueryAuxiliaryCounterFrequency")

public actual fun queryIdleProcessorCycleTime(bufferlength: MutPtr<UInt>, processoridlecycletime: MutPtr<ULong>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingQueryIdleProcessorCycleTime")

public actual fun queryIdleProcessorCycleTimeEx(group: UShort, bufferlength: MutPtr<UInt>, processoridlecycletime: MutPtr<ULong>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingQueryIdleProcessorCycleTimeEx")

public actual fun queryInterruptTime(lpinterrupttime: MutPtr<ULong>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingQueryInterruptTime")

public actual fun queryInterruptTimePrecise(lpinterrupttimeprecise: MutPtr<ULong>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingQueryInterruptTimePrecise")

public actual fun queryProcessCycleTime(processhandle: Handle, cycletime: MutPtr<ULong>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingQueryProcessCycleTime")

public actual fun queryThreadCycleTime(threadhandle: Handle, cycletime: MutPtr<ULong>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingQueryThreadCycleTime")

public actual fun queryUnbiasedInterruptTime(unbiasedtime: MutPtr<ULong>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingQueryUnbiasedInterruptTime")

public actual fun queryUnbiasedInterruptTimePrecise(lpunbiasedinterrupttimeprecise: MutPtr<ULong>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingQueryUnbiasedInterruptTimePrecise")

public actual fun raiseCustomSystemEventTrigger(customsystemeventtriggerconfig: ConstPtr<CustomSystemEventTriggerConfig>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingRaiseCustomSystemEventTrigger")

public actual fun rebootCheckOnInstallA(hwnd: Hwnd, pszinf: Pcstr, pszsec: Pcstr, dwreserved: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingRebootCheckOnInstallA")

public actual fun rebootCheckOnInstallW(hwnd: Hwnd, pszinf: Pcwstr, pszsec: Pcwstr, dwreserved: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingRebootCheckOnInstallW")

public actual fun recordFeatureError(featureid: UInt, error: ConstPtr<FeatureError>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingRecordFeatureError")

public actual fun recordFeatureUsage(featureid: UInt, kind: UInt, addend: UInt, originname: Pcstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingRecordFeatureUsage")

public actual fun regInstallA(hmod: Hmodule, pszsection: Pcstr, psttable: ConstPtr<Strtablea>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingRegInstallA")

public actual fun regInstallW(hmod: Hmodule, pszsection: Pcwstr, psttable: ConstPtr<Strtablew>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingRegInstallW")

public actual fun regRestoreAllA(hwnd: Hwnd, psztitlestring: Pcstr, hkbckupkey: Hkey): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingRegRestoreAllA")

public actual fun regRestoreAllW(hwnd: Hwnd, psztitlestring: Pcwstr, hkbckupkey: Hkey): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingRegRestoreAllW")

public actual fun regSaveRestoreA(hwnd: Hwnd, psztitlestring: Pcstr, hkbckupkey: Hkey, pcszrootkey: Pcstr, pcszsubkey: Pcstr, pcszvaluename: Pcstr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingRegSaveRestoreA")

public actual fun regSaveRestoreOnINFA(hwnd: Hwnd, psztitle: Pcstr, pszinf: Pcstr, pszsection: Pcstr, hhklmbackkey: Hkey, hhkcubackkey: Hkey, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingRegSaveRestoreOnINFA")

public actual fun regSaveRestoreOnINFW(hwnd: Hwnd, psztitle: Pcwstr, pszinf: Pcwstr, pszsection: Pcwstr, hhklmbackkey: Hkey, hhkcubackkey: Hkey, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingRegSaveRestoreOnINFW")

public actual fun regSaveRestoreW(hwnd: Hwnd, psztitlestring: Pcwstr, hkbckupkey: Hkey, pcszrootkey: Pcwstr, pcszsubkey: Pcwstr, pcszvaluename: Pcwstr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingRegSaveRestoreW")

public actual fun replacePartitionUnit(targetpartition: Pcwstr, sparepartition: Pcwstr, flags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingReplacePartitionUnit")

public actual fun requestDeviceWakeup(hdevice: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingRequestDeviceWakeup")

public actual fun rtlAnsiStringToUnicodeString(destinationstring: MutPtr<UnicodeString>, sourcestring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, allocatedestinationstring: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingRtlAnsiStringToUnicodeString")

public actual fun rtlCharToInteger(string: MutPtr<Byte>, base: UInt, value: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingRtlCharToInteger")

public actual fun rtlFreeAnsiString(ansistring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingRtlFreeAnsiString")

public actual fun rtlFreeOemString(oemstring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingRtlFreeOemString")

public actual fun rtlFreeUnicodeString(unicodestring: MutPtr<UnicodeString>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingRtlFreeUnicodeString")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemWindowsprogrammingRtlGetReturnAddressHijackTarget")
private external fun wasiWindowssysWindowsWin32SystemWindowsprogrammingRtlGetReturnAddressHijackTarget(): Long

public actual fun rtlGetReturnAddressHijackTarget(): ULong =
    wasiWindowssysWindowsWin32SystemWindowsprogrammingRtlGetReturnAddressHijackTarget().toULong()

public actual fun rtlInitAnsiString(destinationstring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, sourcestring: MutPtr<Byte>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingRtlInitAnsiString")

public actual fun rtlInitAnsiStringEx(destinationstring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, sourcestring: MutPtr<Byte>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingRtlInitAnsiStringEx")

public actual fun rtlInitString(destinationstring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, sourcestring: MutPtr<Byte>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingRtlInitString")

public actual fun rtlInitStringEx(destinationstring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, sourcestring: MutPtr<Byte>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingRtlInitStringEx")

public actual fun rtlInitUnicodeString(destinationstring: MutPtr<UnicodeString>, sourcestring: Pcwstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingRtlInitUnicodeString")

public actual fun rtlIsNameLegalDOS8Dot3(name: MutPtr<UnicodeString>, oemname: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, namecontainsspaces: MutPtr<Boolean>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingRtlIsNameLegalDOS8Dot3")

public actual fun rtlLocalTimeToSystemTime(localtime: MutPtr<Long>, systemtime: MutPtr<Long>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingRtlLocalTimeToSystemTime")

public actual fun rtlRaiseCustomSystemEventTrigger(triggerconfig: ConstPtr<CustomSystemEventTriggerConfig>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingRtlRaiseCustomSystemEventTrigger")

public actual fun rtlTimeToSecondsSince1970(time: MutPtr<Long>, elapsedseconds: MutPtr<UInt>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingRtlTimeToSecondsSince1970")

public actual fun rtlUnicodeStringToAnsiString(destinationstring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, sourcestring: MutPtr<UnicodeString>, allocatedestinationstring: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingRtlUnicodeStringToAnsiString")

public actual fun rtlUnicodeStringToOemString(destinationstring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, sourcestring: MutPtr<UnicodeString>, allocatedestinationstring: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingRtlUnicodeStringToOemString")

public actual fun rtlUnicodeToMultiByteSize(bytesinmultibytestring: MutPtr<UInt>, unicodestring: Pcwstr, bytesinunicodestring: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingRtlUnicodeToMultiByteSize")

public actual fun rtlUniform(seed: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingRtlUniform")

public actual fun runSetupCommandA(hwnd: Hwnd, szcmdname: Pcstr, szinfsection: Pcstr, szdir: Pcstr, lpsztitle: Pcstr, phexe: MutPtr<Handle>, dwflags: UInt, pvreserved: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingRunSetupCommandA")

public actual fun runSetupCommandW(hwnd: Hwnd, szcmdname: Pcwstr, szinfsection: Pcwstr, szdir: Pcwstr, lpsztitle: Pcwstr, phexe: MutPtr<Handle>, dwflags: UInt, pvreserved: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingRunSetupCommandW")

public actual fun sendIMEMessageExA(param0: Hwnd, param1: Lparam): Lresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingSendIMEMessageExA")

public actual fun sendIMEMessageExW(param0: Hwnd, param1: Lparam): Lresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingSendIMEMessageExW")

public actual fun setEnvironmentStringsA(newenvironment: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingSetEnvironmentStringsA")

public actual fun setFirmwareEnvironmentVariableA(lpname: Pcstr, lpguid: Pcstr, pvalue: ConstPtr<CVoid>, nsize: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingSetFirmwareEnvironmentVariableA")

public actual fun setFirmwareEnvironmentVariableExA(lpname: Pcstr, lpguid: Pcstr, pvalue: ConstPtr<CVoid>, nsize: UInt, dwattributes: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingSetFirmwareEnvironmentVariableExA")

public actual fun setFirmwareEnvironmentVariableExW(lpname: Pcwstr, lpguid: Pcwstr, pvalue: ConstPtr<CVoid>, nsize: UInt, dwattributes: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingSetFirmwareEnvironmentVariableExW")

public actual fun setFirmwareEnvironmentVariableW(lpname: Pcwstr, lpguid: Pcwstr, pvalue: ConstPtr<CVoid>, nsize: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingSetFirmwareEnvironmentVariableW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemWindowsprogrammingSetHandleCount")
private external fun wasiWindowssysWindowsWin32SystemWindowsprogrammingSetHandleCount(unumber: Int): Int

public actual fun setHandleCount(unumber: UInt): UInt =
    wasiWindowssysWindowsWin32SystemWindowsprogrammingSetHandleCount(unumber.toInt()).toUInt()

public actual fun setMessageWaitingIndicator(hmsgindicator: Handle, ulmsgcount: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingSetMessageWaitingIndicator")

public actual fun setPerUserSecValuesA(pperuser: MutPtr<Perusersectiona>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingSetPerUserSecValuesA")

public actual fun setPerUserSecValuesW(pperuser: MutPtr<Perusersectionw>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingSetPerUserSecValuesW")

public actual fun subscribeFeatureStateChangeNotification(subscription: MutPtr<FeatureStateChangeSubscription>, callback: PfeatureStateChangeCallback, context: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingSubscribeFeatureStateChangeNotification")

public actual fun translateInfStringA(pszinffilename: Pcstr, pszinstallsection: Pcstr, psztranslatesection: Pcstr, psztranslatekey: Pcstr, pszbuffer: Pstr, cchbuffer: UInt, pdwrequiredsize: MutPtr<UInt>, pvreserved: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingTranslateInfStringA")

public actual fun translateInfStringExA(hinf: MutPtr<CVoid>, pszinffilename: Pcstr, psztranslatesection: Pcstr, psztranslatekey: Pcstr, pszbuffer: Pstr, dwbuffersize: UInt, pdwrequiredsize: MutPtr<UInt>, pvreserved: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingTranslateInfStringExA")

public actual fun translateInfStringExW(hinf: MutPtr<CVoid>, pszinffilename: Pcwstr, psztranslatesection: Pcwstr, psztranslatekey: Pcwstr, pszbuffer: Pwstr, dwbuffersize: UInt, pdwrequiredsize: MutPtr<UInt>, pvreserved: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingTranslateInfStringExW")

public actual fun translateInfStringW(pszinffilename: Pcwstr, pszinstallsection: Pcwstr, psztranslatesection: Pcwstr, psztranslatekey: Pcwstr, pszbuffer: Pwstr, cchbuffer: UInt, pdwrequiredsize: MutPtr<UInt>, pvreserved: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingTranslateInfStringW")

public actual fun unsubscribeFeatureStateChangeNotification(subscription: FeatureStateChangeSubscription): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingUnsubscribeFeatureStateChangeNotification")

public actual fun userInstStubWrapperA(hwnd: Hwnd, hinstance: Hinstance, pszparms: Pcstr, nshow: Int): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingUserInstStubWrapperA")

public actual fun userInstStubWrapperW(hwnd: Hwnd, hinstance: Hinstance, pszparms: Pcwstr, nshow: Int): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingUserInstStubWrapperW")

public actual fun userUnInstStubWrapperA(hwnd: Hwnd, hinstance: Hinstance, pszparms: Pcstr, nshow: Int): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingUserUnInstStubWrapperA")

public actual fun userUnInstStubWrapperW(hwnd: Hwnd, hinstance: Hinstance, pszparms: Pcwstr, nshow: Int): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingUserUnInstStubWrapperW")

public actual fun wINNLSEnableIME(param0: Hwnd, param1: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingWINNLSEnableIME")

public actual fun wINNLSGetEnableStatus(param0: Hwnd): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingWINNLSGetEnableStatus")

public actual fun wINNLSGetIMEHotkey(param0: Hwnd): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingWINNLSGetIMEHotkey")

public actual fun winWatchClose(hww: Hwinwatch): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingWinWatchClose")

public actual fun winWatchDidStatusChange(hww: Hwinwatch): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingWinWatchDidStatusChange")

public actual fun winWatchGetClipList(hww: Hwinwatch, prc: MutPtr<Rect>, size: UInt, prd: MutPtr<Rgndata>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingWinWatchGetClipList")

public actual fun winWatchNotify(hww: Hwinwatch, notifycallback: Winwatchnotifyproc, notifyparam: Lparam): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingWinWatchNotify")

public actual fun winWatchOpen(hwnd: Hwnd): Hwinwatch =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingWinWatchOpen")

public actual fun wldpCanExecuteBuffer(host: ConstPtr<Guid>, options: WldpExecutionEvaluationOptions, buffer: ConstPtr<UByte>, buffersize: UInt, auditinfo: Pcwstr, result: MutPtr<WldpExecutionPolicy>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingWldpCanExecuteBuffer")

public actual fun wldpCanExecuteFile(host: ConstPtr<Guid>, options: WldpExecutionEvaluationOptions, filehandle: Handle, auditinfo: Pcwstr, result: MutPtr<WldpExecutionPolicy>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingWldpCanExecuteFile")

public actual fun wldpCanExecuteStream(host: ConstPtr<Guid>, options: WldpExecutionEvaluationOptions, stream: MutPtr<CVoid>, auditinfo: Pcwstr, result: MutPtr<WldpExecutionPolicy>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingWldpCanExecuteStream")

public actual fun wldpGetLockdownPolicy(hostinformation: ConstPtr<WldpHostInformation>, lockdownstate: MutPtr<UInt>, lockdownflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingWldpGetLockdownPolicy")

public actual fun wldpIsClassInApprovedList(classid: ConstPtr<Guid>, hostinformation: ConstPtr<WldpHostInformation>, isapproved: MutPtr<Bool>, optionalflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingWldpIsClassInApprovedList")

public actual fun wldpIsDynamicCodePolicyEnabled(isenabled: MutPtr<Bool>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingWldpIsDynamicCodePolicyEnabled")

public actual fun wldpQueryDeviceSecurityInformation(information: MutPtr<WldpDeviceSecurityInformation>, informationlength: UInt, returnlength: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingWldpQueryDeviceSecurityInformation")

public actual fun wldpQueryDynamicCodeTrust(filehandle: Handle, baseimage: ConstPtr<CVoid>, imagesize: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingWldpQueryDynamicCodeTrust")

public actual fun wldpSetDynamicCodeTrust(filehandle: Handle): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingWldpSetDynamicCodeTrust")

public actual fun writePrivateProfileSectionA(lpappname: Pcstr, lpstring: Pcstr, lpfilename: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingWritePrivateProfileSectionA")

public actual fun writePrivateProfileSectionW(lpappname: Pcwstr, lpstring: Pcwstr, lpfilename: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingWritePrivateProfileSectionW")

public actual fun writePrivateProfileStringA(lpappname: Pcstr, lpkeyname: Pcstr, lpstring: Pcstr, lpfilename: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingWritePrivateProfileStringA")

public actual fun writePrivateProfileStringW(lpappname: Pcwstr, lpkeyname: Pcwstr, lpstring: Pcwstr, lpfilename: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingWritePrivateProfileStringW")

public actual fun writePrivateProfileStructA(lpszsection: Pcstr, lpszkey: Pcstr, lpstruct: ConstPtr<CVoid>, usizestruct: UInt, szfile: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingWritePrivateProfileStructA")

public actual fun writePrivateProfileStructW(lpszsection: Pcwstr, lpszkey: Pcwstr, lpstruct: ConstPtr<CVoid>, usizestruct: UInt, szfile: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingWritePrivateProfileStructW")

public actual fun writeProfileSectionA(lpappname: Pcstr, lpstring: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingWriteProfileSectionA")

public actual fun writeProfileSectionW(lpappname: Pcwstr, lpstring: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingWriteProfileSectionW")

public actual fun writeProfileStringA(lpappname: Pcstr, lpkeyname: Pcstr, lpstring: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingWriteProfileStringA")

public actual fun writeProfileStringW(lpappname: Pcwstr, lpkeyname: Pcwstr, lpstring: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingWriteProfileStringW")

public actual fun hread(hfile: Int, lpbuffer: MutPtr<CVoid>, lbytes: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingHread")

public actual fun hwrite(hfile: Int, lpbuffer: Pcstr, lbytes: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingHwrite")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemWindowsprogrammingLclose")
private external fun wasiWindowssysWindowsWin32SystemWindowsprogrammingLclose(hfile: Int): Int

public actual fun lclose(hfile: Int): Int =
    wasiWindowssysWindowsWin32SystemWindowsprogrammingLclose(hfile)

public actual fun lcreat(lppathname: Pcstr, iattribute: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingLcreat")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemWindowsprogrammingLlseek")
private external fun wasiWindowssysWindowsWin32SystemWindowsprogrammingLlseek(hfile: Int, loffset: Int, iorigin: Int): Int

public actual fun llseek(hfile: Int, loffset: Int, iorigin: Int): Int =
    wasiWindowssysWindowsWin32SystemWindowsprogrammingLlseek(hfile, loffset, iorigin)

public actual fun lopen(lppathname: Pcstr, ireadwrite: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingLopen")

public actual fun lread(hfile: Int, lpbuffer: MutPtr<CVoid>, ubytes: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingLread")

public actual fun lwrite(hfile: Int, lpbuffer: Pcstr, ubytes: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingLwrite")

public actual fun uawLstrcmpW(string1: ConstPtr<UShort>, string2: ConstPtr<UShort>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingUawLstrcmpW")

public actual fun uawLstrcmpiW(string1: ConstPtr<UShort>, string2: ConstPtr<UShort>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingUawLstrcmpiW")

public actual fun uawLstrlenW(string: ConstPtr<UShort>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingUawLstrlenW")

public actual fun uawWcschr(string: ConstPtr<UShort>, character: UShort): MutPtr<UShort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingUawWcschr")

public actual fun uawWcscpy(destination: MutPtr<UShort>, source: ConstPtr<UShort>): MutPtr<UShort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingUawWcscpy")

public actual fun uawWcsicmp(string1: ConstPtr<UShort>, string2: ConstPtr<UShort>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingUawWcsicmp")

public actual fun uawWcslen(string: ConstPtr<UShort>): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingUawWcslen")

public actual fun uawWcsrchr(string: ConstPtr<UShort>, character: UShort): MutPtr<UShort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemWindowsprogrammingUawWcsrchr")
