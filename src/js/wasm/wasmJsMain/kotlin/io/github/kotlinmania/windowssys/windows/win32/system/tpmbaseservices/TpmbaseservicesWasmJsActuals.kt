@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pwstr

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemTpmbaseservicesNapiAddon(): Boolean

private val windowsWin32SystemTpmbaseservicesNapiAvailable: Boolean = initWindowsWin32SystemTpmbaseservicesNapiAddon()

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemTpmbaseservicesGetDeviceID(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemTpmbaseservicesGetDeviceID(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemTpmbaseservicesGetDeviceIDString(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemTpmbaseservicesGetDeviceIDString(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemTpmbaseservicesTbsiContextCreate(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemTpmbaseservicesTbsiContextCreate(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemTpmbaseservicesTbsiCreateWindowsKey(p0)")
private external fun wasmWindowssysWindowsWin32SystemTpmbaseservicesTbsiCreateWindowsKey(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemTpmbaseservicesTbsiGetDeviceInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemTpmbaseservicesTbsiGetDeviceInfo(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemTpmbaseservicesTbsiGetOwnerAuth(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemTpmbaseservicesTbsiGetOwnerAuth(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemTpmbaseservicesTbsiGetTcgLog(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemTpmbaseservicesTbsiGetTcgLog(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemTpmbaseservicesTbsiGetTcgLogEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemTpmbaseservicesTbsiGetTcgLogEx(p0: Int, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemTpmbaseservicesTbsiIsTpmPresent()")
private external fun wasmWindowssysWindowsWin32SystemTpmbaseservicesTbsiIsTpmPresent(): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemTpmbaseservicesTbsiPhysicalPresenceCommand(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemTpmbaseservicesTbsiPhysicalPresenceCommand(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemTpmbaseservicesTbsiRevokeAttestation()")
private external fun wasmWindowssysWindowsWin32SystemTpmbaseservicesTbsiRevokeAttestation(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemTpmbaseservicesTbsipCancelCommands(p0)")
private external fun wasmWindowssysWindowsWin32SystemTpmbaseservicesTbsipCancelCommands(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemTpmbaseservicesTbsipContextClose(p0)")
private external fun wasmWindowssysWindowsWin32SystemTpmbaseservicesTbsipContextClose(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemTpmbaseservicesTbsipSubmitCommand(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemTpmbaseservicesTbsipSubmitCommand(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

public actual fun getDeviceID(pbwindowsaik: MutPtr<UByte>, cbwindowsaik: UInt, pcbresult: MutPtr<UInt>, pfprotectedbytpm: MutPtr<Bool>): Hresult =
    if (windowsWin32SystemTpmbaseservicesNapiAvailable) wasmWindowssysWindowsWin32SystemTpmbaseservicesGetDeviceID(pbwindowsaik.rawAddress.toString(), cbwindowsaik.toInt(), pcbresult.rawAddress.toString(), pfprotectedbytpm.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDeviceIDString(pszwindowsaik: Pwstr, cchwindowsaik: UInt, pcchresult: MutPtr<UInt>, pfprotectedbytpm: MutPtr<Bool>): Hresult =
    if (windowsWin32SystemTpmbaseservicesNapiAvailable) wasmWindowssysWindowsWin32SystemTpmbaseservicesGetDeviceIDString(pszwindowsaik.rawAddress.toString(), cchwindowsaik.toInt(), pcchresult.rawAddress.toString(), pfprotectedbytpm.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tbsiContextCreate(pcontextparams: ConstPtr<TbsContextParams>, phcontext: MutPtr<MutPtr<CVoid>>): UInt =
    if (windowsWin32SystemTpmbaseservicesNapiAvailable) wasmWindowssysWindowsWin32SystemTpmbaseservicesTbsiContextCreate(pcontextparams.rawAddress.toString(), phcontext.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tbsiCreateWindowsKey(keyhandle: UInt): UInt =
    if (windowsWin32SystemTpmbaseservicesNapiAvailable) wasmWindowssysWindowsWin32SystemTpmbaseservicesTbsiCreateWindowsKey(keyhandle.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tbsiGetDeviceInfo(size: UInt, info: MutPtr<CVoid>): UInt =
    if (windowsWin32SystemTpmbaseservicesNapiAvailable) wasmWindowssysWindowsWin32SystemTpmbaseservicesTbsiGetDeviceInfo(size.toInt(), info.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tbsiGetOwnerAuth(hcontext: ConstPtr<CVoid>, ownerauthtype: UInt, poutputbuf: MutPtr<UByte>, poutputbuflen: MutPtr<UInt>): UInt =
    if (windowsWin32SystemTpmbaseservicesNapiAvailable) wasmWindowssysWindowsWin32SystemTpmbaseservicesTbsiGetOwnerAuth(hcontext.rawAddress.toString(), ownerauthtype.toInt(), poutputbuf.rawAddress.toString(), poutputbuflen.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tbsiGetTcgLog(hcontext: ConstPtr<CVoid>, poutputbuf: MutPtr<UByte>, poutputbuflen: MutPtr<UInt>): UInt =
    if (windowsWin32SystemTpmbaseservicesNapiAvailable) wasmWindowssysWindowsWin32SystemTpmbaseservicesTbsiGetTcgLog(hcontext.rawAddress.toString(), poutputbuf.rawAddress.toString(), poutputbuflen.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tbsiGetTcgLogEx(logtype: UInt, pboutput: MutPtr<UByte>, pcboutput: MutPtr<UInt>): UInt =
    if (windowsWin32SystemTpmbaseservicesNapiAvailable) wasmWindowssysWindowsWin32SystemTpmbaseservicesTbsiGetTcgLogEx(logtype.toInt(), pboutput.rawAddress.toString(), pcboutput.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tbsiIsTpmPresent(): Bool =
    if (windowsWin32SystemTpmbaseservicesNapiAvailable) wasmWindowssysWindowsWin32SystemTpmbaseservicesTbsiIsTpmPresent() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tbsiPhysicalPresenceCommand(hcontext: ConstPtr<CVoid>, pabinput: ConstPtr<UByte>, cbinput: UInt, paboutput: MutPtr<UByte>, pcboutput: MutPtr<UInt>): UInt =
    if (windowsWin32SystemTpmbaseservicesNapiAvailable) wasmWindowssysWindowsWin32SystemTpmbaseservicesTbsiPhysicalPresenceCommand(hcontext.rawAddress.toString(), pabinput.rawAddress.toString(), cbinput.toInt(), paboutput.rawAddress.toString(), pcboutput.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tbsiRevokeAttestation(): UInt =
    if (windowsWin32SystemTpmbaseservicesNapiAvailable) wasmWindowssysWindowsWin32SystemTpmbaseservicesTbsiRevokeAttestation().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tbsipCancelCommands(hcontext: ConstPtr<CVoid>): UInt =
    if (windowsWin32SystemTpmbaseservicesNapiAvailable) wasmWindowssysWindowsWin32SystemTpmbaseservicesTbsipCancelCommands(hcontext.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tbsipContextClose(hcontext: ConstPtr<CVoid>): UInt =
    if (windowsWin32SystemTpmbaseservicesNapiAvailable) wasmWindowssysWindowsWin32SystemTpmbaseservicesTbsipContextClose(hcontext.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tbsipSubmitCommand(hcontext: ConstPtr<CVoid>, locality: TbsCommandLocality, priority: TbsCommandPriority, pabcommand: ConstPtr<UByte>, cbcommand: UInt, pabresult: MutPtr<UByte>, pcbresult: MutPtr<UInt>): UInt =
    if (windowsWin32SystemTpmbaseservicesNapiAvailable) wasmWindowssysWindowsWin32SystemTpmbaseservicesTbsipSubmitCommand(hcontext.rawAddress.toString(), locality.toInt(), priority.toInt(), pabcommand.rawAddress.toString(), cbcommand.toInt(), pabresult.rawAddress.toString(), pcbresult.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
