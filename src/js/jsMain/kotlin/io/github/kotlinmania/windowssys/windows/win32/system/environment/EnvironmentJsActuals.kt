@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private val windowsWin32SystemEnvironmentNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun callEnclave(lproutine: Long, lpparameter: ConstPtr<CVoid>, fwaitforthread: Bool, lpreturnvalue: MutPtr<MutPtr<CVoid>>): Bool =
    if (windowsWin32SystemEnvironmentNapiAddon != null) (windowsWin32SystemEnvironmentNapiAddon.windowssysWindowsWin32SystemEnvironmentCallEnclave(lproutine.toString(), lpparameter.rawAddress.toString(), fwaitforthread, lpreturnvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createEnclave(hprocess: Handle, lpaddress: ConstPtr<CVoid>, dwsize: ULong, dwinitialcommitment: ULong, flenclavetype: UInt, lpenclaveinformation: ConstPtr<CVoid>, dwinfolength: UInt, lpenclaveerror: MutPtr<UInt>): MutPtr<CVoid> =
    if (windowsWin32SystemEnvironmentNapiAddon != null) MutPtr((windowsWin32SystemEnvironmentNapiAddon.windowssysWindowsWin32SystemEnvironmentCreateEnclave(hprocess.rawAddress.toString(), lpaddress.rawAddress.toString(), dwsize.toString(), dwinitialcommitment.toString(), flenclavetype.toInt(), lpenclaveinformation.rawAddress.toString(), dwinfolength.toInt(), lpenclaveerror.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createEnvironmentBlock(lpenvironment: MutPtr<MutPtr<CVoid>>, htoken: Handle, binherit: Bool): Bool =
    if (windowsWin32SystemEnvironmentNapiAddon != null) (windowsWin32SystemEnvironmentNapiAddon.windowssysWindowsWin32SystemEnvironmentCreateEnvironmentBlock(lpenvironment.rawAddress.toString(), htoken.rawAddress.toString(), binherit) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteEnclave(lpaddress: ConstPtr<CVoid>): Bool =
    if (windowsWin32SystemEnvironmentNapiAddon != null) (windowsWin32SystemEnvironmentNapiAddon.windowssysWindowsWin32SystemEnvironmentDeleteEnclave(lpaddress.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroyEnvironmentBlock(lpenvironment: ConstPtr<CVoid>): Bool =
    if (windowsWin32SystemEnvironmentNapiAddon != null) (windowsWin32SystemEnvironmentNapiAddon.windowssysWindowsWin32SystemEnvironmentDestroyEnvironmentBlock(lpenvironment.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enclaveGetAttestationReport(enclavedata: ConstPtr<UByte>, report: MutPtr<CVoid>, buffersize: UInt, outputsize: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemEnvironmentNapiAddon != null) (windowsWin32SystemEnvironmentNapiAddon.windowssysWindowsWin32SystemEnvironmentEnclaveGetAttestationReport(enclavedata.rawAddress.toString(), report.rawAddress.toString(), buffersize.toInt(), outputsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enclaveGetEnclaveInformation(informationsize: UInt, enclaveinformation: MutPtr<EnclaveInformation>): Hresult =
    if (windowsWin32SystemEnvironmentNapiAddon != null) (windowsWin32SystemEnvironmentNapiAddon.windowssysWindowsWin32SystemEnvironmentEnclaveGetEnclaveInformation(informationsize.toInt(), enclaveinformation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enclaveSealData(datatoencrypt: ConstPtr<CVoid>, datatoencryptsize: UInt, identitypolicy: EnclaveSealingIdentityPolicy, runtimepolicy: UInt, protectedblob: MutPtr<CVoid>, buffersize: UInt, protectedblobsize: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemEnvironmentNapiAddon != null) (windowsWin32SystemEnvironmentNapiAddon.windowssysWindowsWin32SystemEnvironmentEnclaveSealData(datatoencrypt.rawAddress.toString(), datatoencryptsize.toInt(), identitypolicy, runtimepolicy.toInt(), protectedblob.rawAddress.toString(), buffersize.toInt(), protectedblobsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enclaveUnsealData(protectedblob: ConstPtr<CVoid>, protectedblobsize: UInt, decrypteddata: MutPtr<CVoid>, buffersize: UInt, decrypteddatasize: MutPtr<UInt>, sealingidentity: MutPtr<EnclaveIdentity>, unsealingflags: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemEnvironmentNapiAddon != null) (windowsWin32SystemEnvironmentNapiAddon.windowssysWindowsWin32SystemEnvironmentEnclaveUnsealData(protectedblob.rawAddress.toString(), protectedblobsize.toInt(), decrypteddata.rawAddress.toString(), buffersize.toInt(), decrypteddatasize.rawAddress.toString(), sealingidentity.rawAddress.toString(), unsealingflags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enclaveVerifyAttestationReport(enclavetype: UInt, report: ConstPtr<CVoid>, reportsize: UInt): Hresult =
    if (windowsWin32SystemEnvironmentNapiAddon != null) (windowsWin32SystemEnvironmentNapiAddon.windowssysWindowsWin32SystemEnvironmentEnclaveVerifyAttestationReport(enclavetype.toInt(), report.rawAddress.toString(), reportsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun expandEnvironmentStringsA(lpsrc: Pcstr, lpdst: Pstr, nsize: UInt): UInt =
    if (windowsWin32SystemEnvironmentNapiAddon != null) (windowsWin32SystemEnvironmentNapiAddon.windowssysWindowsWin32SystemEnvironmentExpandEnvironmentStringsA(lpsrc.rawAddress.toString(), lpdst.rawAddress.toString(), nsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun expandEnvironmentStringsForUserA(htoken: Handle, lpsrc: Pcstr, lpdest: Pstr, dwsize: UInt): Bool =
    if (windowsWin32SystemEnvironmentNapiAddon != null) (windowsWin32SystemEnvironmentNapiAddon.windowssysWindowsWin32SystemEnvironmentExpandEnvironmentStringsForUserA(htoken.rawAddress.toString(), lpsrc.rawAddress.toString(), lpdest.rawAddress.toString(), dwsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun expandEnvironmentStringsForUserW(htoken: Handle, lpsrc: Pcwstr, lpdest: Pwstr, dwsize: UInt): Bool =
    if (windowsWin32SystemEnvironmentNapiAddon != null) (windowsWin32SystemEnvironmentNapiAddon.windowssysWindowsWin32SystemEnvironmentExpandEnvironmentStringsForUserW(htoken.rawAddress.toString(), lpsrc.rawAddress.toString(), lpdest.rawAddress.toString(), dwsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun expandEnvironmentStringsW(lpsrc: Pcwstr, lpdst: Pwstr, nsize: UInt): UInt =
    if (windowsWin32SystemEnvironmentNapiAddon != null) (windowsWin32SystemEnvironmentNapiAddon.windowssysWindowsWin32SystemEnvironmentExpandEnvironmentStringsW(lpsrc.rawAddress.toString(), lpdst.rawAddress.toString(), nsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeEnvironmentStringsA(penv: Pcstr): Bool =
    if (windowsWin32SystemEnvironmentNapiAddon != null) (windowsWin32SystemEnvironmentNapiAddon.windowssysWindowsWin32SystemEnvironmentFreeEnvironmentStringsA(penv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeEnvironmentStringsW(penv: Pcwstr): Bool =
    if (windowsWin32SystemEnvironmentNapiAddon != null) (windowsWin32SystemEnvironmentNapiAddon.windowssysWindowsWin32SystemEnvironmentFreeEnvironmentStringsW(penv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCommandLineA(): Pcstr =
    if (windowsWin32SystemEnvironmentNapiAddon != null) ConstPtr((windowsWin32SystemEnvironmentNapiAddon.windowssysWindowsWin32SystemEnvironmentGetCommandLineA() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCommandLineW(): Pcwstr =
    if (windowsWin32SystemEnvironmentNapiAddon != null) ConstPtr((windowsWin32SystemEnvironmentNapiAddon.windowssysWindowsWin32SystemEnvironmentGetCommandLineW() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentDirectoryA(nbufferlength: UInt, lpbuffer: Pstr): UInt =
    if (windowsWin32SystemEnvironmentNapiAddon != null) (windowsWin32SystemEnvironmentNapiAddon.windowssysWindowsWin32SystemEnvironmentGetCurrentDirectoryA(nbufferlength.toInt(), lpbuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentDirectoryW(nbufferlength: UInt, lpbuffer: Pwstr): UInt =
    if (windowsWin32SystemEnvironmentNapiAddon != null) (windowsWin32SystemEnvironmentNapiAddon.windowssysWindowsWin32SystemEnvironmentGetCurrentDirectoryW(nbufferlength.toInt(), lpbuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEnvironmentStrings(): Pstr =
    if (windowsWin32SystemEnvironmentNapiAddon != null) MutPtr((windowsWin32SystemEnvironmentNapiAddon.windowssysWindowsWin32SystemEnvironmentGetEnvironmentStrings() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEnvironmentStringsW(): Pwstr =
    if (windowsWin32SystemEnvironmentNapiAddon != null) MutPtr((windowsWin32SystemEnvironmentNapiAddon.windowssysWindowsWin32SystemEnvironmentGetEnvironmentStringsW() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEnvironmentVariableA(lpname: Pcstr, lpbuffer: Pstr, nsize: UInt): UInt =
    if (windowsWin32SystemEnvironmentNapiAddon != null) (windowsWin32SystemEnvironmentNapiAddon.windowssysWindowsWin32SystemEnvironmentGetEnvironmentVariableA(lpname.rawAddress.toString(), lpbuffer.rawAddress.toString(), nsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEnvironmentVariableW(lpname: Pcwstr, lpbuffer: Pwstr, nsize: UInt): UInt =
    if (windowsWin32SystemEnvironmentNapiAddon != null) (windowsWin32SystemEnvironmentNapiAddon.windowssysWindowsWin32SystemEnvironmentGetEnvironmentVariableW(lpname.rawAddress.toString(), lpbuffer.rawAddress.toString(), nsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initializeEnclave(hprocess: Handle, lpaddress: ConstPtr<CVoid>, lpenclaveinformation: ConstPtr<CVoid>, dwinfolength: UInt, lpenclaveerror: MutPtr<UInt>): Bool =
    if (windowsWin32SystemEnvironmentNapiAddon != null) (windowsWin32SystemEnvironmentNapiAddon.windowssysWindowsWin32SystemEnvironmentInitializeEnclave(hprocess.rawAddress.toString(), lpaddress.rawAddress.toString(), lpenclaveinformation.rawAddress.toString(), dwinfolength.toInt(), lpenclaveerror.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isEnclaveTypeSupported(flenclavetype: UInt): Bool =
    if (windowsWin32SystemEnvironmentNapiAddon != null) (windowsWin32SystemEnvironmentNapiAddon.windowssysWindowsWin32SystemEnvironmentIsEnclaveTypeSupported(flenclavetype.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadEnclaveData(hprocess: Handle, lpaddress: ConstPtr<CVoid>, lpbuffer: ConstPtr<CVoid>, nsize: ULong, flprotect: UInt, lppageinformation: ConstPtr<CVoid>, dwinfolength: UInt, lpnumberofbyteswritten: MutPtr<ULong>, lpenclaveerror: MutPtr<UInt>): Bool =
    if (windowsWin32SystemEnvironmentNapiAddon != null) (windowsWin32SystemEnvironmentNapiAddon.windowssysWindowsWin32SystemEnvironmentLoadEnclaveData(hprocess.rawAddress.toString(), lpaddress.rawAddress.toString(), lpbuffer.rawAddress.toString(), nsize.toString(), flprotect.toInt(), lppageinformation.rawAddress.toString(), dwinfolength.toInt(), lpnumberofbyteswritten.rawAddress.toString(), lpenclaveerror.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadEnclaveImageA(lpenclaveaddress: ConstPtr<CVoid>, lpimagename: Pcstr): Bool =
    if (windowsWin32SystemEnvironmentNapiAddon != null) (windowsWin32SystemEnvironmentNapiAddon.windowssysWindowsWin32SystemEnvironmentLoadEnclaveImageA(lpenclaveaddress.rawAddress.toString(), lpimagename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadEnclaveImageW(lpenclaveaddress: ConstPtr<CVoid>, lpimagename: Pcwstr): Bool =
    if (windowsWin32SystemEnvironmentNapiAddon != null) (windowsWin32SystemEnvironmentNapiAddon.windowssysWindowsWin32SystemEnvironmentLoadEnclaveImageW(lpenclaveaddress.rawAddress.toString(), lpimagename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun needCurrentDirectoryForExePathA(exename: Pcstr): Bool =
    if (windowsWin32SystemEnvironmentNapiAddon != null) (windowsWin32SystemEnvironmentNapiAddon.windowssysWindowsWin32SystemEnvironmentNeedCurrentDirectoryForExePathA(exename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun needCurrentDirectoryForExePathW(exename: Pcwstr): Bool =
    if (windowsWin32SystemEnvironmentNapiAddon != null) (windowsWin32SystemEnvironmentNapiAddon.windowssysWindowsWin32SystemEnvironmentNeedCurrentDirectoryForExePathW(exename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCurrentDirectoryA(lppathname: Pcstr): Bool =
    if (windowsWin32SystemEnvironmentNapiAddon != null) (windowsWin32SystemEnvironmentNapiAddon.windowssysWindowsWin32SystemEnvironmentSetCurrentDirectoryA(lppathname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCurrentDirectoryW(lppathname: Pcwstr): Bool =
    if (windowsWin32SystemEnvironmentNapiAddon != null) (windowsWin32SystemEnvironmentNapiAddon.windowssysWindowsWin32SystemEnvironmentSetCurrentDirectoryW(lppathname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setEnvironmentStringsW(newenvironment: Pcwstr): Bool =
    if (windowsWin32SystemEnvironmentNapiAddon != null) (windowsWin32SystemEnvironmentNapiAddon.windowssysWindowsWin32SystemEnvironmentSetEnvironmentStringsW(newenvironment.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setEnvironmentVariableA(lpname: Pcstr, lpvalue: Pcstr): Bool =
    if (windowsWin32SystemEnvironmentNapiAddon != null) (windowsWin32SystemEnvironmentNapiAddon.windowssysWindowsWin32SystemEnvironmentSetEnvironmentVariableA(lpname.rawAddress.toString(), lpvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setEnvironmentVariableW(lpname: Pcwstr, lpvalue: Pcwstr): Bool =
    if (windowsWin32SystemEnvironmentNapiAddon != null) (windowsWin32SystemEnvironmentNapiAddon.windowssysWindowsWin32SystemEnvironmentSetEnvironmentVariableW(lpname.rawAddress.toString(), lpvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun terminateEnclave(lpaddress: ConstPtr<CVoid>, fwait: Bool): Bool =
    if (windowsWin32SystemEnvironmentNapiAddon != null) (windowsWin32SystemEnvironmentNapiAddon.windowssysWindowsWin32SystemEnvironmentTerminateEnclave(lpaddress.rawAddress.toString(), fwait) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
