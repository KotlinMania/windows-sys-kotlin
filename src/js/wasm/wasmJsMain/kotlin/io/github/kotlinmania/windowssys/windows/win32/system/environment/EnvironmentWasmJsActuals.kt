@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32SystemEnvironmentNapiAddon(): Boolean

private val _windowsWin32SystemEnvironmentNapiAvailable: Boolean = _initWindowsWin32SystemEnvironmentNapiAddon()

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_environment_callEnclave(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_environment_callEnclave(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_environment_createEnclave(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_system_environment_createEnclave(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: Int, p7: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_environment_createEnvironmentBlock(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_environment_createEnvironmentBlock(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_environment_deleteEnclave(p0)")
private external fun _wasm_windowssys_windows_win32_system_environment_deleteEnclave(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_environment_destroyEnvironmentBlock(p0)")
private external fun _wasm_windowssys_windows_win32_system_environment_destroyEnvironmentBlock(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_environment_enclaveGetAttestationReport(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_environment_enclaveGetAttestationReport(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_environment_enclaveGetEnclaveInformation(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_environment_enclaveGetEnclaveInformation(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_environment_enclaveSealData(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_environment_enclaveSealData(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_environment_enclaveUnsealData(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_environment_enclaveUnsealData(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_environment_enclaveVerifyAttestationReport(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_environment_enclaveVerifyAttestationReport(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_environment_expandEnvironmentStringsA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_environment_expandEnvironmentStringsA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_environment_expandEnvironmentStringsForUserA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_environment_expandEnvironmentStringsForUserA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_environment_expandEnvironmentStringsForUserW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_environment_expandEnvironmentStringsForUserW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_environment_expandEnvironmentStringsW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_environment_expandEnvironmentStringsW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_environment_freeEnvironmentStringsA(p0)")
private external fun _wasm_windowssys_windows_win32_system_environment_freeEnvironmentStringsA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_environment_freeEnvironmentStringsW(p0)")
private external fun _wasm_windowssys_windows_win32_system_environment_freeEnvironmentStringsW(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_environment_getCommandLineA()")
private external fun _wasm_windowssys_windows_win32_system_environment_getCommandLineA(): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_environment_getCommandLineW()")
private external fun _wasm_windowssys_windows_win32_system_environment_getCommandLineW(): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_environment_getCurrentDirectoryA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_environment_getCurrentDirectoryA(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_environment_getCurrentDirectoryW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_environment_getCurrentDirectoryW(p0: Int, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_environment_getEnvironmentStrings()")
private external fun _wasm_windowssys_windows_win32_system_environment_getEnvironmentStrings(): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_environment_getEnvironmentStringsW()")
private external fun _wasm_windowssys_windows_win32_system_environment_getEnvironmentStringsW(): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_environment_getEnvironmentVariableA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_environment_getEnvironmentVariableA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_environment_getEnvironmentVariableW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_environment_getEnvironmentVariableW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_environment_initializeEnclave(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_environment_initializeEnclave(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_environment_isEnclaveTypeSupported(p0)")
private external fun _wasm_windowssys_windows_win32_system_environment_isEnclaveTypeSupported(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_environment_loadEnclaveData(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_system_environment_loadEnclaveData(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_environment_loadEnclaveImageA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_environment_loadEnclaveImageA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_environment_loadEnclaveImageW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_environment_loadEnclaveImageW(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_environment_needCurrentDirectoryForExePathA(p0)")
private external fun _wasm_windowssys_windows_win32_system_environment_needCurrentDirectoryForExePathA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_environment_needCurrentDirectoryForExePathW(p0)")
private external fun _wasm_windowssys_windows_win32_system_environment_needCurrentDirectoryForExePathW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_environment_setCurrentDirectoryA(p0)")
private external fun _wasm_windowssys_windows_win32_system_environment_setCurrentDirectoryA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_environment_setCurrentDirectoryW(p0)")
private external fun _wasm_windowssys_windows_win32_system_environment_setCurrentDirectoryW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_environment_setEnvironmentStringsW(p0)")
private external fun _wasm_windowssys_windows_win32_system_environment_setEnvironmentStringsW(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_environment_setEnvironmentVariableA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_environment_setEnvironmentVariableA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_environment_setEnvironmentVariableW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_environment_setEnvironmentVariableW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_environment_terminateEnclave(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_environment_terminateEnclave(p0: String, p1: Int): Int

public actual fun callEnclave(lproutine: Long, lpparameter: COpaquePointer?, fwaitforthread: Bool, lpreturnvalue: COpaquePointer?): Bool =
    if (_windowsWin32SystemEnvironmentNapiAvailable) _wasm_windowssys_windows_win32_system_environment_callEnclave(lproutine.toString(), (lpparameter?.value ?: 0L).toString(), fwaitforthread, (lpreturnvalue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createEnclave(hprocess: Handle, lpaddress: COpaquePointer?, dwsize: ULong, dwinitialcommitment: ULong, flenclavetype: UInt, lpenclaveinformation: COpaquePointer?, dwinfolength: UInt, lpenclaveerror: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemEnvironmentNapiAvailable) _wasm_windowssys_windows_win32_system_environment_createEnclave((hprocess?.value ?: 0L).toString(), (lpaddress?.value ?: 0L).toString(), dwsize.toString(), dwinitialcommitment.toString(), flenclavetype.toInt(), (lpenclaveinformation?.value ?: 0L).toString(), dwinfolength.toInt(), (lpenclaveerror?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createEnvironmentBlock(lpenvironment: COpaquePointer?, htoken: Handle, binherit: Bool): Bool =
    if (_windowsWin32SystemEnvironmentNapiAvailable) _wasm_windowssys_windows_win32_system_environment_createEnvironmentBlock((lpenvironment?.value ?: 0L).toString(), (htoken?.value ?: 0L).toString(), binherit) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteEnclave(lpaddress: COpaquePointer?): Bool =
    if (_windowsWin32SystemEnvironmentNapiAvailable) _wasm_windowssys_windows_win32_system_environment_deleteEnclave((lpaddress?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroyEnvironmentBlock(lpenvironment: COpaquePointer?): Bool =
    if (_windowsWin32SystemEnvironmentNapiAvailable) _wasm_windowssys_windows_win32_system_environment_destroyEnvironmentBlock((lpenvironment?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enclaveGetAttestationReport(enclavedata: COpaquePointer?, report: COpaquePointer?, buffersize: UInt, outputsize: COpaquePointer?): Hresult =
    if (_windowsWin32SystemEnvironmentNapiAvailable) _wasm_windowssys_windows_win32_system_environment_enclaveGetAttestationReport((enclavedata?.value ?: 0L).toString(), (report?.value ?: 0L).toString(), buffersize.toInt(), (outputsize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enclaveGetEnclaveInformation(informationsize: UInt, enclaveinformation: COpaquePointer?): Hresult =
    if (_windowsWin32SystemEnvironmentNapiAvailable) _wasm_windowssys_windows_win32_system_environment_enclaveGetEnclaveInformation(informationsize.toInt(), (enclaveinformation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enclaveSealData(datatoencrypt: COpaquePointer?, datatoencryptsize: UInt, identitypolicy: EnclaveSealingIdentityPolicy, runtimepolicy: UInt, protectedblob: COpaquePointer?, buffersize: UInt, protectedblobsize: COpaquePointer?): Hresult =
    if (_windowsWin32SystemEnvironmentNapiAvailable) _wasm_windowssys_windows_win32_system_environment_enclaveSealData((datatoencrypt?.value ?: 0L).toString(), datatoencryptsize.toInt(), identitypolicy, runtimepolicy.toInt(), (protectedblob?.value ?: 0L).toString(), buffersize.toInt(), (protectedblobsize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enclaveUnsealData(protectedblob: COpaquePointer?, protectedblobsize: UInt, decrypteddata: COpaquePointer?, buffersize: UInt, decrypteddatasize: COpaquePointer?, sealingidentity: COpaquePointer?, unsealingflags: COpaquePointer?): Hresult =
    if (_windowsWin32SystemEnvironmentNapiAvailable) _wasm_windowssys_windows_win32_system_environment_enclaveUnsealData((protectedblob?.value ?: 0L).toString(), protectedblobsize.toInt(), (decrypteddata?.value ?: 0L).toString(), buffersize.toInt(), (decrypteddatasize?.value ?: 0L).toString(), (sealingidentity?.value ?: 0L).toString(), (unsealingflags?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enclaveVerifyAttestationReport(enclavetype: UInt, report: COpaquePointer?, reportsize: UInt): Hresult =
    if (_windowsWin32SystemEnvironmentNapiAvailable) _wasm_windowssys_windows_win32_system_environment_enclaveVerifyAttestationReport(enclavetype.toInt(), (report?.value ?: 0L).toString(), reportsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun expandEnvironmentStringsA(lpsrc: Pcstr, lpdst: Pstr, nsize: UInt): UInt =
    if (_windowsWin32SystemEnvironmentNapiAvailable) _wasm_windowssys_windows_win32_system_environment_expandEnvironmentStringsA((lpsrc?.value ?: 0L).toString(), (lpdst?.value ?: 0L).toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun expandEnvironmentStringsForUserA(htoken: Handle, lpsrc: Pcstr, lpdest: Pstr, dwsize: UInt): Bool =
    if (_windowsWin32SystemEnvironmentNapiAvailable) _wasm_windowssys_windows_win32_system_environment_expandEnvironmentStringsForUserA((htoken?.value ?: 0L).toString(), (lpsrc?.value ?: 0L).toString(), (lpdest?.value ?: 0L).toString(), dwsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun expandEnvironmentStringsForUserW(htoken: Handle, lpsrc: Pcwstr, lpdest: Pwstr, dwsize: UInt): Bool =
    if (_windowsWin32SystemEnvironmentNapiAvailable) _wasm_windowssys_windows_win32_system_environment_expandEnvironmentStringsForUserW((htoken?.value ?: 0L).toString(), (lpsrc?.value ?: 0L).toString(), (lpdest?.value ?: 0L).toString(), dwsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun expandEnvironmentStringsW(lpsrc: Pcwstr, lpdst: Pwstr, nsize: UInt): UInt =
    if (_windowsWin32SystemEnvironmentNapiAvailable) _wasm_windowssys_windows_win32_system_environment_expandEnvironmentStringsW((lpsrc?.value ?: 0L).toString(), (lpdst?.value ?: 0L).toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeEnvironmentStringsA(penv: Pcstr): Bool =
    if (_windowsWin32SystemEnvironmentNapiAvailable) _wasm_windowssys_windows_win32_system_environment_freeEnvironmentStringsA((penv?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeEnvironmentStringsW(penv: Pcwstr): Bool =
    if (_windowsWin32SystemEnvironmentNapiAvailable) _wasm_windowssys_windows_win32_system_environment_freeEnvironmentStringsW((penv?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCommandLineA(): Pcstr =
    if (_windowsWin32SystemEnvironmentNapiAvailable) _wasm_windowssys_windows_win32_system_environment_getCommandLineA().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCommandLineW(): Pcwstr =
    if (_windowsWin32SystemEnvironmentNapiAvailable) _wasm_windowssys_windows_win32_system_environment_getCommandLineW().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentDirectoryA(nbufferlength: UInt, lpbuffer: Pstr): UInt =
    if (_windowsWin32SystemEnvironmentNapiAvailable) _wasm_windowssys_windows_win32_system_environment_getCurrentDirectoryA(nbufferlength.toInt(), (lpbuffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentDirectoryW(nbufferlength: UInt, lpbuffer: Pwstr): UInt =
    if (_windowsWin32SystemEnvironmentNapiAvailable) _wasm_windowssys_windows_win32_system_environment_getCurrentDirectoryW(nbufferlength.toInt(), (lpbuffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEnvironmentStrings(): Pstr =
    if (_windowsWin32SystemEnvironmentNapiAvailable) _wasm_windowssys_windows_win32_system_environment_getEnvironmentStrings().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEnvironmentStringsW(): Pwstr =
    if (_windowsWin32SystemEnvironmentNapiAvailable) _wasm_windowssys_windows_win32_system_environment_getEnvironmentStringsW().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEnvironmentVariableA(lpname: Pcstr, lpbuffer: Pstr, nsize: UInt): UInt =
    if (_windowsWin32SystemEnvironmentNapiAvailable) _wasm_windowssys_windows_win32_system_environment_getEnvironmentVariableA((lpname?.value ?: 0L).toString(), (lpbuffer?.value ?: 0L).toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEnvironmentVariableW(lpname: Pcwstr, lpbuffer: Pwstr, nsize: UInt): UInt =
    if (_windowsWin32SystemEnvironmentNapiAvailable) _wasm_windowssys_windows_win32_system_environment_getEnvironmentVariableW((lpname?.value ?: 0L).toString(), (lpbuffer?.value ?: 0L).toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initializeEnclave(hprocess: Handle, lpaddress: COpaquePointer?, lpenclaveinformation: COpaquePointer?, dwinfolength: UInt, lpenclaveerror: COpaquePointer?): Bool =
    if (_windowsWin32SystemEnvironmentNapiAvailable) _wasm_windowssys_windows_win32_system_environment_initializeEnclave((hprocess?.value ?: 0L).toString(), (lpaddress?.value ?: 0L).toString(), (lpenclaveinformation?.value ?: 0L).toString(), dwinfolength.toInt(), (lpenclaveerror?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isEnclaveTypeSupported(flenclavetype: UInt): Bool =
    if (_windowsWin32SystemEnvironmentNapiAvailable) _wasm_windowssys_windows_win32_system_environment_isEnclaveTypeSupported(flenclavetype.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadEnclaveData(hprocess: Handle, lpaddress: COpaquePointer?, lpbuffer: COpaquePointer?, nsize: ULong, flprotect: UInt, lppageinformation: COpaquePointer?, dwinfolength: UInt, lpnumberofbyteswritten: COpaquePointer?, lpenclaveerror: COpaquePointer?): Bool =
    if (_windowsWin32SystemEnvironmentNapiAvailable) _wasm_windowssys_windows_win32_system_environment_loadEnclaveData((hprocess?.value ?: 0L).toString(), (lpaddress?.value ?: 0L).toString(), (lpbuffer?.value ?: 0L).toString(), nsize.toString(), flprotect.toInt(), (lppageinformation?.value ?: 0L).toString(), dwinfolength.toInt(), (lpnumberofbyteswritten?.value ?: 0L).toString(), (lpenclaveerror?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadEnclaveImageA(lpenclaveaddress: COpaquePointer?, lpimagename: Pcstr): Bool =
    if (_windowsWin32SystemEnvironmentNapiAvailable) _wasm_windowssys_windows_win32_system_environment_loadEnclaveImageA((lpenclaveaddress?.value ?: 0L).toString(), (lpimagename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadEnclaveImageW(lpenclaveaddress: COpaquePointer?, lpimagename: Pcwstr): Bool =
    if (_windowsWin32SystemEnvironmentNapiAvailable) _wasm_windowssys_windows_win32_system_environment_loadEnclaveImageW((lpenclaveaddress?.value ?: 0L).toString(), (lpimagename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun needCurrentDirectoryForExePathA(exename: Pcstr): Bool =
    if (_windowsWin32SystemEnvironmentNapiAvailable) _wasm_windowssys_windows_win32_system_environment_needCurrentDirectoryForExePathA((exename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun needCurrentDirectoryForExePathW(exename: Pcwstr): Bool =
    if (_windowsWin32SystemEnvironmentNapiAvailable) _wasm_windowssys_windows_win32_system_environment_needCurrentDirectoryForExePathW((exename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCurrentDirectoryA(lppathname: Pcstr): Bool =
    if (_windowsWin32SystemEnvironmentNapiAvailable) _wasm_windowssys_windows_win32_system_environment_setCurrentDirectoryA((lppathname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCurrentDirectoryW(lppathname: Pcwstr): Bool =
    if (_windowsWin32SystemEnvironmentNapiAvailable) _wasm_windowssys_windows_win32_system_environment_setCurrentDirectoryW((lppathname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setEnvironmentStringsW(newenvironment: Pcwstr): Bool =
    if (_windowsWin32SystemEnvironmentNapiAvailable) _wasm_windowssys_windows_win32_system_environment_setEnvironmentStringsW((newenvironment?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setEnvironmentVariableA(lpname: Pcstr, lpvalue: Pcstr): Bool =
    if (_windowsWin32SystemEnvironmentNapiAvailable) _wasm_windowssys_windows_win32_system_environment_setEnvironmentVariableA((lpname?.value ?: 0L).toString(), (lpvalue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setEnvironmentVariableW(lpname: Pcwstr, lpvalue: Pcwstr): Bool =
    if (_windowsWin32SystemEnvironmentNapiAvailable) _wasm_windowssys_windows_win32_system_environment_setEnvironmentVariableW((lpname?.value ?: 0L).toString(), (lpvalue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun terminateEnclave(lpaddress: COpaquePointer?, fwait: Bool): Bool =
    if (_windowsWin32SystemEnvironmentNapiAvailable) _wasm_windowssys_windows_win32_system_environment_terminateEnclave((lpaddress?.value ?: 0L).toString(), fwait) else throw UnsupportedOperationException("Native FFI addon is not available")
