@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private val _windowsWin32SystemEnvironmentNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun callEnclave(lproutine: Long, lpparameter: COpaquePointer?, fwaitforthread: Bool, lpreturnvalue: COpaquePointer?): Bool =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_callEnclave(lproutine.toString(), (lpparameter?.value ?: 0L).toString(), fwaitforthread, (lpreturnvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createEnclave(hprocess: Handle, lpaddress: COpaquePointer?, dwsize: ULong, dwinitialcommitment: ULong, flenclavetype: UInt, lpenclaveinformation: COpaquePointer?, dwinfolength: UInt, lpenclaveerror: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_createEnclave((hprocess?.value ?: 0L).toString(), (lpaddress?.value ?: 0L).toString(), dwsize.toString(), dwinitialcommitment.toString(), flenclavetype.toInt(), (lpenclaveinformation?.value ?: 0L).toString(), dwinfolength.toInt(), (lpenclaveerror?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createEnvironmentBlock(lpenvironment: COpaquePointer?, htoken: Handle, binherit: Bool): Bool =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_createEnvironmentBlock((lpenvironment?.value ?: 0L).toString(), (htoken?.value ?: 0L).toString(), binherit) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteEnclave(lpaddress: COpaquePointer?): Bool =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_deleteEnclave((lpaddress?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroyEnvironmentBlock(lpenvironment: COpaquePointer?): Bool =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_destroyEnvironmentBlock((lpenvironment?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enclaveGetAttestationReport(enclavedata: COpaquePointer?, report: COpaquePointer?, buffersize: UInt, outputsize: COpaquePointer?): Hresult =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_enclaveGetAttestationReport((enclavedata?.value ?: 0L).toString(), (report?.value ?: 0L).toString(), buffersize.toInt(), (outputsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enclaveGetEnclaveInformation(informationsize: UInt, enclaveinformation: COpaquePointer?): Hresult =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_enclaveGetEnclaveInformation(informationsize.toInt(), (enclaveinformation?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enclaveSealData(datatoencrypt: COpaquePointer?, datatoencryptsize: UInt, identitypolicy: EnclaveSealingIdentityPolicy, runtimepolicy: UInt, protectedblob: COpaquePointer?, buffersize: UInt, protectedblobsize: COpaquePointer?): Hresult =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_enclaveSealData((datatoencrypt?.value ?: 0L).toString(), datatoencryptsize.toInt(), identitypolicy, runtimepolicy.toInt(), (protectedblob?.value ?: 0L).toString(), buffersize.toInt(), (protectedblobsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enclaveUnsealData(protectedblob: COpaquePointer?, protectedblobsize: UInt, decrypteddata: COpaquePointer?, buffersize: UInt, decrypteddatasize: COpaquePointer?, sealingidentity: COpaquePointer?, unsealingflags: COpaquePointer?): Hresult =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_enclaveUnsealData((protectedblob?.value ?: 0L).toString(), protectedblobsize.toInt(), (decrypteddata?.value ?: 0L).toString(), buffersize.toInt(), (decrypteddatasize?.value ?: 0L).toString(), (sealingidentity?.value ?: 0L).toString(), (unsealingflags?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enclaveVerifyAttestationReport(enclavetype: UInt, report: COpaquePointer?, reportsize: UInt): Hresult =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_enclaveVerifyAttestationReport(enclavetype.toInt(), (report?.value ?: 0L).toString(), reportsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun expandEnvironmentStringsA(lpsrc: Pcstr, lpdst: Pstr, nsize: UInt): UInt =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_expandEnvironmentStringsA((lpsrc?.value ?: 0L).toString(), (lpdst?.value ?: 0L).toString(), nsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun expandEnvironmentStringsForUserA(htoken: Handle, lpsrc: Pcstr, lpdest: Pstr, dwsize: UInt): Bool =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_expandEnvironmentStringsForUserA((htoken?.value ?: 0L).toString(), (lpsrc?.value ?: 0L).toString(), (lpdest?.value ?: 0L).toString(), dwsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun expandEnvironmentStringsForUserW(htoken: Handle, lpsrc: Pcwstr, lpdest: Pwstr, dwsize: UInt): Bool =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_expandEnvironmentStringsForUserW((htoken?.value ?: 0L).toString(), (lpsrc?.value ?: 0L).toString(), (lpdest?.value ?: 0L).toString(), dwsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun expandEnvironmentStringsW(lpsrc: Pcwstr, lpdst: Pwstr, nsize: UInt): UInt =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_expandEnvironmentStringsW((lpsrc?.value ?: 0L).toString(), (lpdst?.value ?: 0L).toString(), nsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeEnvironmentStringsA(penv: Pcstr): Bool =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_freeEnvironmentStringsA((penv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeEnvironmentStringsW(penv: Pcwstr): Bool =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_freeEnvironmentStringsW((penv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCommandLineA(): Pcstr =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_getCommandLineA() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCommandLineW(): Pcwstr =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_getCommandLineW() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentDirectoryA(nbufferlength: UInt, lpbuffer: Pstr): UInt =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_getCurrentDirectoryA(nbufferlength.toInt(), (lpbuffer?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentDirectoryW(nbufferlength: UInt, lpbuffer: Pwstr): UInt =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_getCurrentDirectoryW(nbufferlength.toInt(), (lpbuffer?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEnvironmentStrings(): Pstr =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_getEnvironmentStrings() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEnvironmentStringsW(): Pwstr =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_getEnvironmentStringsW() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEnvironmentVariableA(lpname: Pcstr, lpbuffer: Pstr, nsize: UInt): UInt =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_getEnvironmentVariableA((lpname?.value ?: 0L).toString(), (lpbuffer?.value ?: 0L).toString(), nsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEnvironmentVariableW(lpname: Pcwstr, lpbuffer: Pwstr, nsize: UInt): UInt =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_getEnvironmentVariableW((lpname?.value ?: 0L).toString(), (lpbuffer?.value ?: 0L).toString(), nsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initializeEnclave(hprocess: Handle, lpaddress: COpaquePointer?, lpenclaveinformation: COpaquePointer?, dwinfolength: UInt, lpenclaveerror: COpaquePointer?): Bool =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_initializeEnclave((hprocess?.value ?: 0L).toString(), (lpaddress?.value ?: 0L).toString(), (lpenclaveinformation?.value ?: 0L).toString(), dwinfolength.toInt(), (lpenclaveerror?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isEnclaveTypeSupported(flenclavetype: UInt): Bool =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_isEnclaveTypeSupported(flenclavetype.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadEnclaveData(hprocess: Handle, lpaddress: COpaquePointer?, lpbuffer: COpaquePointer?, nsize: ULong, flprotect: UInt, lppageinformation: COpaquePointer?, dwinfolength: UInt, lpnumberofbyteswritten: COpaquePointer?, lpenclaveerror: COpaquePointer?): Bool =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_loadEnclaveData((hprocess?.value ?: 0L).toString(), (lpaddress?.value ?: 0L).toString(), (lpbuffer?.value ?: 0L).toString(), nsize.toString(), flprotect.toInt(), (lppageinformation?.value ?: 0L).toString(), dwinfolength.toInt(), (lpnumberofbyteswritten?.value ?: 0L).toString(), (lpenclaveerror?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadEnclaveImageA(lpenclaveaddress: COpaquePointer?, lpimagename: Pcstr): Bool =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_loadEnclaveImageA((lpenclaveaddress?.value ?: 0L).toString(), (lpimagename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadEnclaveImageW(lpenclaveaddress: COpaquePointer?, lpimagename: Pcwstr): Bool =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_loadEnclaveImageW((lpenclaveaddress?.value ?: 0L).toString(), (lpimagename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun needCurrentDirectoryForExePathA(exename: Pcstr): Bool =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_needCurrentDirectoryForExePathA((exename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun needCurrentDirectoryForExePathW(exename: Pcwstr): Bool =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_needCurrentDirectoryForExePathW((exename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCurrentDirectoryA(lppathname: Pcstr): Bool =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_setCurrentDirectoryA((lppathname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCurrentDirectoryW(lppathname: Pcwstr): Bool =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_setCurrentDirectoryW((lppathname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setEnvironmentStringsW(newenvironment: Pcwstr): Bool =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_setEnvironmentStringsW((newenvironment?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setEnvironmentVariableA(lpname: Pcstr, lpvalue: Pcstr): Bool =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_setEnvironmentVariableA((lpname?.value ?: 0L).toString(), (lpvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setEnvironmentVariableW(lpname: Pcwstr, lpvalue: Pcwstr): Bool =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_setEnvironmentVariableW((lpname?.value ?: 0L).toString(), (lpvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun terminateEnclave(lpaddress: COpaquePointer?, fwait: Bool): Bool =
    if (_windowsWin32SystemEnvironmentNapiAddon != null) (_windowsWin32SystemEnvironmentNapiAddon.windowssys_windows_win32_system_environment_terminateEnclave((lpaddress?.value ?: 0L).toString(), fwait) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
