@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

private val _windowsWin32SystemEnvironmentNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun CallEnclave(lproutine: Long, lpparameter: Long, fwaitforthread: BOOL, lpreturnvalue: Long): BOOL =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_CallEnclave(lproutine.toString(), lpparameter.toString(), fwaitforthread, lpreturnvalue.toString()) as Int) else 0

public actual fun CreateEnclave(hprocess: HANDLE, lpaddress: Long, dwsize: ULong, dwinitialcommitment: ULong, flenclavetype: UInt, lpenclaveinformation: Long, dwinfolength: UInt, lpenclaveerror: Long): Long =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_CreateEnclave(hprocess.toString(), lpaddress.toString(), dwsize.toString(), dwinitialcommitment.toString(), flenclavetype.toInt(), lpenclaveinformation.toString(), dwinfolength.toInt(), lpenclaveerror.toString()) as String).toLong() else 0L

public actual fun CreateEnvironmentBlock(lpenvironment: Long, htoken: HANDLE, binherit: BOOL): BOOL =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_CreateEnvironmentBlock(lpenvironment.toString(), htoken.toString(), binherit) as Int) else 0

public actual fun DeleteEnclave(lpaddress: Long): BOOL =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_DeleteEnclave(lpaddress.toString()) as Int) else 0

public actual fun DestroyEnvironmentBlock(lpenvironment: Long): BOOL =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_DestroyEnvironmentBlock(lpenvironment.toString()) as Int) else 0

public actual fun EnclaveGetAttestationReport(enclavedata: Long, report: Long, buffersize: UInt, outputsize: Long): HRESULT =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_EnclaveGetAttestationReport(enclavedata.toString(), report.toString(), buffersize.toInt(), outputsize.toString()) as Int) else 0

public actual fun EnclaveGetEnclaveInformation(informationsize: UInt, enclaveinformation: Long): HRESULT =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_EnclaveGetEnclaveInformation(informationsize.toInt(), enclaveinformation.toString()) as Int) else 0

public actual fun EnclaveSealData(datatoencrypt: Long, datatoencryptsize: UInt, identitypolicy: ENCLAVE_SEALING_IDENTITY_POLICY, runtimepolicy: UInt, protectedblob: Long, buffersize: UInt, protectedblobsize: Long): HRESULT =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_EnclaveSealData(datatoencrypt.toString(), datatoencryptsize.toInt(), identitypolicy, runtimepolicy.toInt(), protectedblob.toString(), buffersize.toInt(), protectedblobsize.toString()) as Int) else 0

public actual fun EnclaveUnsealData(protectedblob: Long, protectedblobsize: UInt, decrypteddata: Long, buffersize: UInt, decrypteddatasize: Long, sealingidentity: Long, unsealingflags: Long): HRESULT =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_EnclaveUnsealData(protectedblob.toString(), protectedblobsize.toInt(), decrypteddata.toString(), buffersize.toInt(), decrypteddatasize.toString(), sealingidentity.toString(), unsealingflags.toString()) as Int) else 0

public actual fun EnclaveVerifyAttestationReport(enclavetype: UInt, report: Long, reportsize: UInt): HRESULT =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_EnclaveVerifyAttestationReport(enclavetype.toInt(), report.toString(), reportsize.toInt()) as Int) else 0

public actual fun ExpandEnvironmentStringsA(lpsrc: PCSTR, lpdst: PSTR, nsize: UInt): UInt =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_ExpandEnvironmentStringsA(lpsrc.toString(), lpdst.toString(), nsize.toInt()) as Int).toUInt() else 0u

public actual fun ExpandEnvironmentStringsForUserA(htoken: HANDLE, lpsrc: PCSTR, lpdest: PSTR, dwsize: UInt): BOOL =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_ExpandEnvironmentStringsForUserA(htoken.toString(), lpsrc.toString(), lpdest.toString(), dwsize.toInt()) as Int) else 0

public actual fun ExpandEnvironmentStringsForUserW(htoken: HANDLE, lpsrc: PCWSTR, lpdest: PWSTR, dwsize: UInt): BOOL =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_ExpandEnvironmentStringsForUserW(htoken.toString(), lpsrc.toString(), lpdest.toString(), dwsize.toInt()) as Int) else 0

public actual fun ExpandEnvironmentStringsW(lpsrc: PCWSTR, lpdst: PWSTR, nsize: UInt): UInt =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_ExpandEnvironmentStringsW(lpsrc.toString(), lpdst.toString(), nsize.toInt()) as Int).toUInt() else 0u

public actual fun FreeEnvironmentStringsA(penv: PCSTR): BOOL =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_FreeEnvironmentStringsA(penv.toString()) as Int) else 0

public actual fun FreeEnvironmentStringsW(penv: PCWSTR): BOOL =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_FreeEnvironmentStringsW(penv.toString()) as Int) else 0

public actual fun GetCommandLineA(): PCSTR =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_GetCommandLineA() as String).toLong() else 0L

public actual fun GetCommandLineW(): PCWSTR =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_GetCommandLineW() as String).toLong() else 0L

public actual fun GetCurrentDirectoryA(nbufferlength: UInt, lpbuffer: PSTR): UInt =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_GetCurrentDirectoryA(nbufferlength.toInt(), lpbuffer.toString()) as Int).toUInt() else 0u

public actual fun GetCurrentDirectoryW(nbufferlength: UInt, lpbuffer: PWSTR): UInt =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_GetCurrentDirectoryW(nbufferlength.toInt(), lpbuffer.toString()) as Int).toUInt() else 0u

public actual fun GetEnvironmentStrings(): PSTR =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_GetEnvironmentStrings() as String).toLong() else 0L

public actual fun GetEnvironmentStringsW(): PWSTR =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_GetEnvironmentStringsW() as String).toLong() else 0L

public actual fun GetEnvironmentVariableA(lpname: PCSTR, lpbuffer: PSTR, nsize: UInt): UInt =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_GetEnvironmentVariableA(lpname.toString(), lpbuffer.toString(), nsize.toInt()) as Int).toUInt() else 0u

public actual fun GetEnvironmentVariableW(lpname: PCWSTR, lpbuffer: PWSTR, nsize: UInt): UInt =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_GetEnvironmentVariableW(lpname.toString(), lpbuffer.toString(), nsize.toInt()) as Int).toUInt() else 0u

public actual fun InitializeEnclave(hprocess: HANDLE, lpaddress: Long, lpenclaveinformation: Long, dwinfolength: UInt, lpenclaveerror: Long): BOOL =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_InitializeEnclave(hprocess.toString(), lpaddress.toString(), lpenclaveinformation.toString(), dwinfolength.toInt(), lpenclaveerror.toString()) as Int) else 0

public actual fun IsEnclaveTypeSupported(flenclavetype: UInt): BOOL =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_IsEnclaveTypeSupported(flenclavetype.toInt()) as Int) else 0

public actual fun LoadEnclaveData(hprocess: HANDLE, lpaddress: Long, lpbuffer: Long, nsize: ULong, flprotect: UInt, lppageinformation: Long, dwinfolength: UInt, lpnumberofbyteswritten: Long, lpenclaveerror: Long): BOOL =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_LoadEnclaveData(hprocess.toString(), lpaddress.toString(), lpbuffer.toString(), nsize.toString(), flprotect.toInt(), lppageinformation.toString(), dwinfolength.toInt(), lpnumberofbyteswritten.toString(), lpenclaveerror.toString()) as Int) else 0

public actual fun LoadEnclaveImageA(lpenclaveaddress: Long, lpimagename: PCSTR): BOOL =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_LoadEnclaveImageA(lpenclaveaddress.toString(), lpimagename.toString()) as Int) else 0

public actual fun LoadEnclaveImageW(lpenclaveaddress: Long, lpimagename: PCWSTR): BOOL =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_LoadEnclaveImageW(lpenclaveaddress.toString(), lpimagename.toString()) as Int) else 0

public actual fun NeedCurrentDirectoryForExePathA(exename: PCSTR): BOOL =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_NeedCurrentDirectoryForExePathA(exename.toString()) as Int) else 0

public actual fun NeedCurrentDirectoryForExePathW(exename: PCWSTR): BOOL =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_NeedCurrentDirectoryForExePathW(exename.toString()) as Int) else 0

public actual fun SetCurrentDirectoryA(lppathname: PCSTR): BOOL =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_SetCurrentDirectoryA(lppathname.toString()) as Int) else 0

public actual fun SetCurrentDirectoryW(lppathname: PCWSTR): BOOL =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_SetCurrentDirectoryW(lppathname.toString()) as Int) else 0

public actual fun SetEnvironmentStringsW(newenvironment: PCWSTR): BOOL =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_SetEnvironmentStringsW(newenvironment.toString()) as Int) else 0

public actual fun SetEnvironmentVariableA(lpname: PCSTR, lpvalue: PCSTR): BOOL =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_SetEnvironmentVariableA(lpname.toString(), lpvalue.toString()) as Int) else 0

public actual fun SetEnvironmentVariableW(lpname: PCWSTR, lpvalue: PCWSTR): BOOL =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_SetEnvironmentVariableW(lpname.toString(), lpvalue.toString()) as Int) else 0

public actual fun TerminateEnclave(lpaddress: Long, fwait: BOOL): BOOL =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_TerminateEnclave(lpaddress.toString(), fwait) as Int) else 0
