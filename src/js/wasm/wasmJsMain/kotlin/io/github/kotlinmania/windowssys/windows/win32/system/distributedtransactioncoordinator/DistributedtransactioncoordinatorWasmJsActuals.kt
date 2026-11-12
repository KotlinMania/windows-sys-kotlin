@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.distributedtransactioncoordinator

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemDistributedtransactioncoordinatorNapiAddon(): Boolean

private val windowsWin32SystemDistributedtransactioncoordinatorNapiAvailable: Boolean = initWindowsWin32SystemDistributedtransactioncoordinatorNapiAddon()

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDistributedtransactioncoordinatorDtcGetTransactionManager(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemDistributedtransactioncoordinatorDtcGetTransactionManager(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDistributedtransactioncoordinatorDtcGetTransactionManagerC(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemDistributedtransactioncoordinatorDtcGetTransactionManagerC(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDistributedtransactioncoordinatorDtcGetTransactionManagerExA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemDistributedtransactioncoordinatorDtcGetTransactionManagerExA(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDistributedtransactioncoordinatorDtcGetTransactionManagerExW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemDistributedtransactioncoordinatorDtcGetTransactionManagerExW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

public actual fun dtcGetTransactionManager(iPszhost: Pcstr, iPsztmname: Pcstr, iRiid: ConstPtr, iDwreserved1: UInt, iWcbreserved2: UShort, iPvreserved2: ConstPtr, oPpvobject: MutPtr): Hresult =
    if (windowsWin32SystemDistributedtransactioncoordinatorNapiAvailable) wasmWindowssysWindowsWin32SystemDistributedtransactioncoordinatorDtcGetTransactionManager(iPszhost.rawAddress.toString(), iPsztmname.rawAddress.toString(), iRiid.rawAddress.toString(), iDwreserved1.toInt(), iWcbreserved2.toInt(), iPvreserved2.rawAddress.toString(), oPpvobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dtcGetTransactionManagerC(iPszhost: Pcstr, iPsztmname: Pcstr, iRiid: ConstPtr, iDwreserved1: UInt, iWcbreserved2: UShort, iPvreserved2: ConstPtr, oPpvobject: MutPtr): Hresult =
    if (windowsWin32SystemDistributedtransactioncoordinatorNapiAvailable) wasmWindowssysWindowsWin32SystemDistributedtransactioncoordinatorDtcGetTransactionManagerC(iPszhost.rawAddress.toString(), iPsztmname.rawAddress.toString(), iRiid.rawAddress.toString(), iDwreserved1.toInt(), iWcbreserved2.toInt(), iPvreserved2.rawAddress.toString(), oPpvobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dtcGetTransactionManagerExA(iPszhost: Pcstr, iPsztmname: Pcstr, iRiid: ConstPtr, iGrfoptions: UInt, iPvconfigparams: MutPtr, oPpvobject: MutPtr): Hresult =
    if (windowsWin32SystemDistributedtransactioncoordinatorNapiAvailable) wasmWindowssysWindowsWin32SystemDistributedtransactioncoordinatorDtcGetTransactionManagerExA(iPszhost.rawAddress.toString(), iPsztmname.rawAddress.toString(), iRiid.rawAddress.toString(), iGrfoptions.toInt(), iPvconfigparams.rawAddress.toString(), oPpvobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dtcGetTransactionManagerExW(iPwszhost: Pcwstr, iPwsztmname: Pcwstr, iRiid: ConstPtr, iGrfoptions: UInt, iPvconfigparams: MutPtr, oPpvobject: MutPtr): Hresult =
    if (windowsWin32SystemDistributedtransactioncoordinatorNapiAvailable) wasmWindowssysWindowsWin32SystemDistributedtransactioncoordinatorDtcGetTransactionManagerExW(iPwszhost.rawAddress.toString(), iPwsztmname.rawAddress.toString(), iRiid.rawAddress.toString(), iGrfoptions.toInt(), iPvconfigparams.rawAddress.toString(), oPpvobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
