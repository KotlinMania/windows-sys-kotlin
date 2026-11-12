@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemEnvironmentNapiAddon(): Boolean

private val windowsWin32SystemEnvironmentNapiAvailable: Boolean = initWindowsWin32SystemEnvironmentNapiAddon()

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEnvironmentCallEnclave(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemEnvironmentCallEnclave(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEnvironmentCreateEnclave(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemEnvironmentCreateEnclave(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: Int, p7: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEnvironmentCreateEnvironmentBlock(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemEnvironmentCreateEnvironmentBlock(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEnvironmentDeleteEnclave(p0)")
private external fun wasmWindowssysWindowsWin32SystemEnvironmentDeleteEnclave(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEnvironmentDestroyEnvironmentBlock(p0)")
private external fun wasmWindowssysWindowsWin32SystemEnvironmentDestroyEnvironmentBlock(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEnvironmentEnclaveGetAttestationReport(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemEnvironmentEnclaveGetAttestationReport(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEnvironmentEnclaveGetEnclaveInformation(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemEnvironmentEnclaveGetEnclaveInformation(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEnvironmentEnclaveSealData(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemEnvironmentEnclaveSealData(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEnvironmentEnclaveUnsealData(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemEnvironmentEnclaveUnsealData(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEnvironmentEnclaveVerifyAttestationReport(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemEnvironmentEnclaveVerifyAttestationReport(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEnvironmentExpandEnvironmentStringsA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemEnvironmentExpandEnvironmentStringsA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEnvironmentExpandEnvironmentStringsForUserA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemEnvironmentExpandEnvironmentStringsForUserA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEnvironmentExpandEnvironmentStringsForUserW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemEnvironmentExpandEnvironmentStringsForUserW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEnvironmentExpandEnvironmentStringsW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemEnvironmentExpandEnvironmentStringsW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEnvironmentFreeEnvironmentStringsA(p0)")
private external fun wasmWindowssysWindowsWin32SystemEnvironmentFreeEnvironmentStringsA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEnvironmentFreeEnvironmentStringsW(p0)")
private external fun wasmWindowssysWindowsWin32SystemEnvironmentFreeEnvironmentStringsW(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEnvironmentGetCommandLineA()")
private external fun wasmWindowssysWindowsWin32SystemEnvironmentGetCommandLineA(): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEnvironmentGetCommandLineW()")
private external fun wasmWindowssysWindowsWin32SystemEnvironmentGetCommandLineW(): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEnvironmentGetCurrentDirectoryA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemEnvironmentGetCurrentDirectoryA(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEnvironmentGetCurrentDirectoryW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemEnvironmentGetCurrentDirectoryW(p0: Int, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEnvironmentGetEnvironmentStrings()")
private external fun wasmWindowssysWindowsWin32SystemEnvironmentGetEnvironmentStrings(): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEnvironmentGetEnvironmentStringsW()")
private external fun wasmWindowssysWindowsWin32SystemEnvironmentGetEnvironmentStringsW(): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEnvironmentGetEnvironmentVariableA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemEnvironmentGetEnvironmentVariableA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEnvironmentGetEnvironmentVariableW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemEnvironmentGetEnvironmentVariableW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEnvironmentInitializeEnclave(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemEnvironmentInitializeEnclave(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEnvironmentIsEnclaveTypeSupported(p0)")
private external fun wasmWindowssysWindowsWin32SystemEnvironmentIsEnclaveTypeSupported(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEnvironmentLoadEnclaveData(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SystemEnvironmentLoadEnclaveData(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEnvironmentLoadEnclaveImageA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemEnvironmentLoadEnclaveImageA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEnvironmentLoadEnclaveImageW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemEnvironmentLoadEnclaveImageW(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEnvironmentNeedCurrentDirectoryForExePathA(p0)")
private external fun wasmWindowssysWindowsWin32SystemEnvironmentNeedCurrentDirectoryForExePathA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEnvironmentNeedCurrentDirectoryForExePathW(p0)")
private external fun wasmWindowssysWindowsWin32SystemEnvironmentNeedCurrentDirectoryForExePathW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEnvironmentSetCurrentDirectoryA(p0)")
private external fun wasmWindowssysWindowsWin32SystemEnvironmentSetCurrentDirectoryA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEnvironmentSetCurrentDirectoryW(p0)")
private external fun wasmWindowssysWindowsWin32SystemEnvironmentSetCurrentDirectoryW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEnvironmentSetEnvironmentStringsW(p0)")
private external fun wasmWindowssysWindowsWin32SystemEnvironmentSetEnvironmentStringsW(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEnvironmentSetEnvironmentVariableA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemEnvironmentSetEnvironmentVariableA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEnvironmentSetEnvironmentVariableW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemEnvironmentSetEnvironmentVariableW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEnvironmentTerminateEnclave(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemEnvironmentTerminateEnclave(p0: String, p1: Int): Int

public actual fun callEnclave(lproutine: Long, lpparameter: ConstPtr, fwaitforthread: Bool, lpreturnvalue: MutPtr): Bool =
    if (windowsWin32SystemEnvironmentNapiAvailable) wasmWindowssysWindowsWin32SystemEnvironmentCallEnclave(lproutine.toString(), lpparameter.rawAddress.toString(), fwaitforthread, lpreturnvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createEnclave(hprocess: Handle, lpaddress: ConstPtr, dwsize: ULong, dwinitialcommitment: ULong, flenclavetype: UInt, lpenclaveinformation: ConstPtr, dwinfolength: UInt, lpenclaveerror: MutPtr): MutPtr =
    if (windowsWin32SystemEnvironmentNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemEnvironmentCreateEnclave(hprocess.rawAddress.toString(), lpaddress.rawAddress.toString(), dwsize.toString(), dwinitialcommitment.toString(), flenclavetype.toInt(), lpenclaveinformation.rawAddress.toString(), dwinfolength.toInt(), lpenclaveerror.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createEnvironmentBlock(lpenvironment: MutPtr, htoken: Handle, binherit: Bool): Bool =
    if (windowsWin32SystemEnvironmentNapiAvailable) wasmWindowssysWindowsWin32SystemEnvironmentCreateEnvironmentBlock(lpenvironment.rawAddress.toString(), htoken.rawAddress.toString(), binherit) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteEnclave(lpaddress: ConstPtr): Bool =
    if (windowsWin32SystemEnvironmentNapiAvailable) wasmWindowssysWindowsWin32SystemEnvironmentDeleteEnclave(lpaddress.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroyEnvironmentBlock(lpenvironment: ConstPtr): Bool =
    if (windowsWin32SystemEnvironmentNapiAvailable) wasmWindowssysWindowsWin32SystemEnvironmentDestroyEnvironmentBlock(lpenvironment.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enclaveGetAttestationReport(enclavedata: ConstPtr, report: MutPtr, buffersize: UInt, outputsize: MutPtr): Hresult =
    if (windowsWin32SystemEnvironmentNapiAvailable) wasmWindowssysWindowsWin32SystemEnvironmentEnclaveGetAttestationReport(enclavedata.rawAddress.toString(), report.rawAddress.toString(), buffersize.toInt(), outputsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enclaveGetEnclaveInformation(informationsize: UInt, enclaveinformation: MutPtr): Hresult =
    if (windowsWin32SystemEnvironmentNapiAvailable) wasmWindowssysWindowsWin32SystemEnvironmentEnclaveGetEnclaveInformation(informationsize.toInt(), enclaveinformation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enclaveSealData(datatoencrypt: ConstPtr, datatoencryptsize: UInt, identitypolicy: EnclaveSealingIdentityPolicy, runtimepolicy: UInt, protectedblob: MutPtr, buffersize: UInt, protectedblobsize: MutPtr): Hresult =
    if (windowsWin32SystemEnvironmentNapiAvailable) wasmWindowssysWindowsWin32SystemEnvironmentEnclaveSealData(datatoencrypt.rawAddress.toString(), datatoencryptsize.toInt(), identitypolicy, runtimepolicy.toInt(), protectedblob.rawAddress.toString(), buffersize.toInt(), protectedblobsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enclaveUnsealData(protectedblob: ConstPtr, protectedblobsize: UInt, decrypteddata: MutPtr, buffersize: UInt, decrypteddatasize: MutPtr, sealingidentity: MutPtr, unsealingflags: MutPtr): Hresult =
    if (windowsWin32SystemEnvironmentNapiAvailable) wasmWindowssysWindowsWin32SystemEnvironmentEnclaveUnsealData(protectedblob.rawAddress.toString(), protectedblobsize.toInt(), decrypteddata.rawAddress.toString(), buffersize.toInt(), decrypteddatasize.rawAddress.toString(), sealingidentity.rawAddress.toString(), unsealingflags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enclaveVerifyAttestationReport(enclavetype: UInt, report: ConstPtr, reportsize: UInt): Hresult =
    if (windowsWin32SystemEnvironmentNapiAvailable) wasmWindowssysWindowsWin32SystemEnvironmentEnclaveVerifyAttestationReport(enclavetype.toInt(), report.rawAddress.toString(), reportsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun expandEnvironmentStringsA(lpsrc: Pcstr, lpdst: Pstr, nsize: UInt): UInt =
    if (windowsWin32SystemEnvironmentNapiAvailable) wasmWindowssysWindowsWin32SystemEnvironmentExpandEnvironmentStringsA(lpsrc.rawAddress.toString(), lpdst.rawAddress.toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun expandEnvironmentStringsForUserA(htoken: Handle, lpsrc: Pcstr, lpdest: Pstr, dwsize: UInt): Bool =
    if (windowsWin32SystemEnvironmentNapiAvailable) wasmWindowssysWindowsWin32SystemEnvironmentExpandEnvironmentStringsForUserA(htoken.rawAddress.toString(), lpsrc.rawAddress.toString(), lpdest.rawAddress.toString(), dwsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun expandEnvironmentStringsForUserW(htoken: Handle, lpsrc: Pcwstr, lpdest: Pwstr, dwsize: UInt): Bool =
    if (windowsWin32SystemEnvironmentNapiAvailable) wasmWindowssysWindowsWin32SystemEnvironmentExpandEnvironmentStringsForUserW(htoken.rawAddress.toString(), lpsrc.rawAddress.toString(), lpdest.rawAddress.toString(), dwsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun expandEnvironmentStringsW(lpsrc: Pcwstr, lpdst: Pwstr, nsize: UInt): UInt =
    if (windowsWin32SystemEnvironmentNapiAvailable) wasmWindowssysWindowsWin32SystemEnvironmentExpandEnvironmentStringsW(lpsrc.rawAddress.toString(), lpdst.rawAddress.toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeEnvironmentStringsA(penv: Pcstr): Bool =
    if (windowsWin32SystemEnvironmentNapiAvailable) wasmWindowssysWindowsWin32SystemEnvironmentFreeEnvironmentStringsA(penv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeEnvironmentStringsW(penv: Pcwstr): Bool =
    if (windowsWin32SystemEnvironmentNapiAvailable) wasmWindowssysWindowsWin32SystemEnvironmentFreeEnvironmentStringsW(penv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCommandLineA(): Pcstr =
    if (windowsWin32SystemEnvironmentNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32SystemEnvironmentGetCommandLineA().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCommandLineW(): Pcwstr =
    if (windowsWin32SystemEnvironmentNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32SystemEnvironmentGetCommandLineW().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentDirectoryA(nbufferlength: UInt, lpbuffer: Pstr): UInt =
    if (windowsWin32SystemEnvironmentNapiAvailable) wasmWindowssysWindowsWin32SystemEnvironmentGetCurrentDirectoryA(nbufferlength.toInt(), lpbuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentDirectoryW(nbufferlength: UInt, lpbuffer: Pwstr): UInt =
    if (windowsWin32SystemEnvironmentNapiAvailable) wasmWindowssysWindowsWin32SystemEnvironmentGetCurrentDirectoryW(nbufferlength.toInt(), lpbuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEnvironmentStrings(): Pstr =
    if (windowsWin32SystemEnvironmentNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemEnvironmentGetEnvironmentStrings().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEnvironmentStringsW(): Pwstr =
    if (windowsWin32SystemEnvironmentNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemEnvironmentGetEnvironmentStringsW().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEnvironmentVariableA(lpname: Pcstr, lpbuffer: Pstr, nsize: UInt): UInt =
    if (windowsWin32SystemEnvironmentNapiAvailable) wasmWindowssysWindowsWin32SystemEnvironmentGetEnvironmentVariableA(lpname.rawAddress.toString(), lpbuffer.rawAddress.toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEnvironmentVariableW(lpname: Pcwstr, lpbuffer: Pwstr, nsize: UInt): UInt =
    if (windowsWin32SystemEnvironmentNapiAvailable) wasmWindowssysWindowsWin32SystemEnvironmentGetEnvironmentVariableW(lpname.rawAddress.toString(), lpbuffer.rawAddress.toString(), nsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initializeEnclave(hprocess: Handle, lpaddress: ConstPtr, lpenclaveinformation: ConstPtr, dwinfolength: UInt, lpenclaveerror: MutPtr): Bool =
    if (windowsWin32SystemEnvironmentNapiAvailable) wasmWindowssysWindowsWin32SystemEnvironmentInitializeEnclave(hprocess.rawAddress.toString(), lpaddress.rawAddress.toString(), lpenclaveinformation.rawAddress.toString(), dwinfolength.toInt(), lpenclaveerror.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isEnclaveTypeSupported(flenclavetype: UInt): Bool =
    if (windowsWin32SystemEnvironmentNapiAvailable) wasmWindowssysWindowsWin32SystemEnvironmentIsEnclaveTypeSupported(flenclavetype.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadEnclaveData(hprocess: Handle, lpaddress: ConstPtr, lpbuffer: ConstPtr, nsize: ULong, flprotect: UInt, lppageinformation: ConstPtr, dwinfolength: UInt, lpnumberofbyteswritten: MutPtr, lpenclaveerror: MutPtr): Bool =
    if (windowsWin32SystemEnvironmentNapiAvailable) wasmWindowssysWindowsWin32SystemEnvironmentLoadEnclaveData(hprocess.rawAddress.toString(), lpaddress.rawAddress.toString(), lpbuffer.rawAddress.toString(), nsize.toString(), flprotect.toInt(), lppageinformation.rawAddress.toString(), dwinfolength.toInt(), lpnumberofbyteswritten.rawAddress.toString(), lpenclaveerror.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadEnclaveImageA(lpenclaveaddress: ConstPtr, lpimagename: Pcstr): Bool =
    if (windowsWin32SystemEnvironmentNapiAvailable) wasmWindowssysWindowsWin32SystemEnvironmentLoadEnclaveImageA(lpenclaveaddress.rawAddress.toString(), lpimagename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadEnclaveImageW(lpenclaveaddress: ConstPtr, lpimagename: Pcwstr): Bool =
    if (windowsWin32SystemEnvironmentNapiAvailable) wasmWindowssysWindowsWin32SystemEnvironmentLoadEnclaveImageW(lpenclaveaddress.rawAddress.toString(), lpimagename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun needCurrentDirectoryForExePathA(exename: Pcstr): Bool =
    if (windowsWin32SystemEnvironmentNapiAvailable) wasmWindowssysWindowsWin32SystemEnvironmentNeedCurrentDirectoryForExePathA(exename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun needCurrentDirectoryForExePathW(exename: Pcwstr): Bool =
    if (windowsWin32SystemEnvironmentNapiAvailable) wasmWindowssysWindowsWin32SystemEnvironmentNeedCurrentDirectoryForExePathW(exename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCurrentDirectoryA(lppathname: Pcstr): Bool =
    if (windowsWin32SystemEnvironmentNapiAvailable) wasmWindowssysWindowsWin32SystemEnvironmentSetCurrentDirectoryA(lppathname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCurrentDirectoryW(lppathname: Pcwstr): Bool =
    if (windowsWin32SystemEnvironmentNapiAvailable) wasmWindowssysWindowsWin32SystemEnvironmentSetCurrentDirectoryW(lppathname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setEnvironmentStringsW(newenvironment: Pcwstr): Bool =
    if (windowsWin32SystemEnvironmentNapiAvailable) wasmWindowssysWindowsWin32SystemEnvironmentSetEnvironmentStringsW(newenvironment.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setEnvironmentVariableA(lpname: Pcstr, lpvalue: Pcstr): Bool =
    if (windowsWin32SystemEnvironmentNapiAvailable) wasmWindowssysWindowsWin32SystemEnvironmentSetEnvironmentVariableA(lpname.rawAddress.toString(), lpvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setEnvironmentVariableW(lpname: Pcwstr, lpvalue: Pcwstr): Bool =
    if (windowsWin32SystemEnvironmentNapiAvailable) wasmWindowssysWindowsWin32SystemEnvironmentSetEnvironmentVariableW(lpname.rawAddress.toString(), lpvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun terminateEnclave(lpaddress: ConstPtr, fwait: Bool): Bool =
    if (windowsWin32SystemEnvironmentNapiAvailable) wasmWindowssysWindowsWin32SystemEnvironmentTerminateEnclave(lpaddress.rawAddress.toString(), fwait) else throw UnsupportedOperationException("Native FFI addon is not available")
